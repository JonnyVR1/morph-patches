package org.fourthline.cling.support.model;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.container.Album;
import org.fourthline.cling.support.model.container.Container;
import org.fourthline.cling.support.model.container.GenreContainer;
import org.fourthline.cling.support.model.container.MovieGenre;
import org.fourthline.cling.support.model.container.MusicAlbum;
import org.fourthline.cling.support.model.container.MusicArtist;
import org.fourthline.cling.support.model.container.MusicGenre;
import org.fourthline.cling.support.model.container.PersonContainer;
import org.fourthline.cling.support.model.container.PhotoAlbum;
import org.fourthline.cling.support.model.container.PlaylistContainer;
import org.fourthline.cling.support.model.container.StorageFolder;
import org.fourthline.cling.support.model.container.StorageSystem;
import org.fourthline.cling.support.model.container.StorageVolume;
import org.fourthline.cling.support.model.item.AudioBook;
import org.fourthline.cling.support.model.item.AudioBroadcast;
import org.fourthline.cling.support.model.item.AudioItem;
import org.fourthline.cling.support.model.item.ImageItem;
import org.fourthline.cling.support.model.item.Item;
import org.fourthline.cling.support.model.item.Movie;
import org.fourthline.cling.support.model.item.MusicTrack;
import org.fourthline.cling.support.model.item.MusicVideoClip;
import org.fourthline.cling.support.model.item.Photo;
import org.fourthline.cling.support.model.item.PlaylistItem;
import org.fourthline.cling.support.model.item.TextItem;
import org.fourthline.cling.support.model.item.VideoBroadcast;
import org.fourthline.cling.support.model.item.VideoItem;

/* JADX INFO: loaded from: classes3.dex */
public class DIDLContent {
    public static final String DESC_WRAPPER_NAMESPACE_URI = "urn:fourthline-org:cling:support:content-directory-desc-1-0";
    public static final String NAMESPACE_URI = "urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/";
    protected List<Container> containers = new ArrayList();
    protected List<Item> items = new ArrayList();
    protected List<DescMeta> descMetadata = new ArrayList();

    public DIDLContent addContainer(Container container) {
        getContainers().add(container);
        return this;
    }

    public DIDLContent addDescMetadata(DescMeta descMeta) {
        getDescMetadata().add(descMeta);
        return this;
    }

    public DIDLContent addItem(Item item) {
        getItems().add(item);
        return this;
    }

    public DIDLContent addObject(Object obj) {
        if (obj instanceof Item) {
            addItem((Item) obj);
            return this;
        }
        if (obj instanceof Container) {
            addContainer((Container) obj);
        }
        return this;
    }

    public List<Container> getContainers() {
        return this.containers;
    }

    public long getCount() {
        return this.items.size() + this.containers.size();
    }

    public List<DescMeta> getDescMetadata() {
        return this.descMetadata;
    }

    public Container getFirstContainer() {
        return getContainers().get(0);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void replaceGenericContainerAndItems() {
        setItems(replaceGenericItems(getItems()));
        setContainers(replaceGenericContainers(getContainers()));
    }

    public List<Container> replaceGenericContainers(List<Container> list) {
        Container storageFolder;
        ArrayList arrayList = new ArrayList();
        for (Container container : list) {
            String value = container.getClazz().getValue();
            if (Album.CLASS.getValue().equals(value)) {
                storageFolder = new Album(container);
            } else if (MusicAlbum.CLASS.getValue().equals(value)) {
                storageFolder = new MusicAlbum(container);
            } else if (PhotoAlbum.CLASS.getValue().equals(value)) {
                storageFolder = new PhotoAlbum(container);
            } else if (GenreContainer.CLASS.getValue().equals(value)) {
                storageFolder = new GenreContainer(container);
            } else if (MusicGenre.CLASS.getValue().equals(value)) {
                storageFolder = new MusicGenre(container);
            } else if (MovieGenre.CLASS.getValue().equals(value)) {
                storageFolder = new MovieGenre(container);
            } else if (PlaylistContainer.CLASS.getValue().equals(value)) {
                storageFolder = new PlaylistContainer(container);
            } else if (PersonContainer.CLASS.getValue().equals(value)) {
                storageFolder = new PersonContainer(container);
            } else if (MusicArtist.CLASS.getValue().equals(value)) {
                storageFolder = new MusicArtist(container);
            } else if (StorageSystem.CLASS.getValue().equals(value)) {
                storageFolder = new StorageSystem(container);
            } else if (StorageVolume.CLASS.getValue().equals(value)) {
                storageFolder = new StorageVolume(container);
            } else {
                storageFolder = StorageFolder.CLASS.getValue().equals(value) ? new StorageFolder(container) : container;
            }
            storageFolder.setItems(replaceGenericItems(container.getItems()));
            arrayList.add(storageFolder);
        }
        return arrayList;
    }

    public List<Item> replaceGenericItems(List<Item> list) {
        ArrayList arrayList = new ArrayList();
        for (Item item : list) {
            String value = item.getClazz().getValue();
            if (AudioItem.CLASS.getValue().equals(value)) {
                arrayList.add(new AudioItem(item));
            } else if (MusicTrack.CLASS.getValue().equals(value)) {
                arrayList.add(new MusicTrack(item));
            } else if (AudioBook.CLASS.getValue().equals(value)) {
                arrayList.add(new AudioBook(item));
            } else if (AudioBroadcast.CLASS.getValue().equals(value)) {
                arrayList.add(new AudioBroadcast(item));
            } else if (VideoItem.CLASS.getValue().equals(value)) {
                arrayList.add(new VideoItem(item));
            } else if (Movie.CLASS.getValue().equals(value)) {
                arrayList.add(new Movie(item));
            } else if (VideoBroadcast.CLASS.getValue().equals(value)) {
                arrayList.add(new VideoBroadcast(item));
            } else if (MusicVideoClip.CLASS.getValue().equals(value)) {
                arrayList.add(new MusicVideoClip(item));
            } else if (ImageItem.CLASS.getValue().equals(value)) {
                arrayList.add(new ImageItem(item));
            } else if (Photo.CLASS.getValue().equals(value)) {
                arrayList.add(new Photo(item));
            } else if (PlaylistItem.CLASS.getValue().equals(value)) {
                arrayList.add(new PlaylistItem(item));
            } else if (TextItem.CLASS.getValue().equals(value)) {
                arrayList.add(new TextItem(item));
            } else {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public void setContainers(List<Container> list) {
        this.containers = list;
    }

    public void setDescMetadata(List<DescMeta> list) {
        this.descMetadata = list;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }
}
