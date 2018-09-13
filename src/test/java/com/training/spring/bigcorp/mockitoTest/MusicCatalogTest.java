package com.training.spring.bigcorp.mockitoTest;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import sun.security.pkcs11.wrapper.Functions;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class MusicCatalogTest {
    @Mock
    private MusicFinder musicFinderMock;

    @InjectMocks
    private MusicCatalog musicCatalog;

    @Before public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void SearchAlbumWithNullValues (){
        Assertions.assertThat(musicCatalog.searchAlbum(null,null)).isEmpty();
    }

    @Test
    public void SearchAlbumByArtist (){
        List<Album> albums = asList(
                new Album().withName("Album1").withArtist(Arrays.asList("Muse")),
                new Album().withName("Album2").withArtist(Arrays.asList("Muse")));

        when(musicFinderMock.findByArtist(Mockito.eq("Muse")))
                .thenReturn(albums);

        when(musicFinderMock.findByName(Mockito.eq(null)))
                .thenReturn(Collections.emptyList());

        Assertions.assertThat(musicCatalog.searchAlbum(null,"Muse"))
                .hasSize(2)
                .extracting(Album::getArtist)
                .contains(Arrays.asList("Muse"), Arrays.asList("Muse"));
    }
}