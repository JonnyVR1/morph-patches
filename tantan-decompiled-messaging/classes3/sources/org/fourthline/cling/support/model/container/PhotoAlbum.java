package org.fourthline.cling.support.model.container;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.item.Item;
import org.fourthline.cling.support.model.item.Photo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PhotoAlbum extends Album {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.container.album.photoAlbum");

    public PhotoAlbum(String str, Container container, String str2, String str3, Integer num) {
        this(str, container.getId(), str2, str3, num, new ArrayList());
    }

    public void addPhotos(Photo[] photoArr) {
        if (photoArr != null) {
            for (Photo photo : photoArr) {
                photo.setAlbum(getTitle());
                addItem(photo);
            }
        }
    }

    public Photo[] getPhotos() {
        ArrayList arrayList = new ArrayList();
        for (Item item : getItems()) {
            if (item instanceof Photo) {
                arrayList.add((Photo) item);
            }
        }
        return (Photo[]) arrayList.toArray(new Photo[arrayList.size()]);
    }

    public PhotoAlbum(Container container) {
        super(container);
    }

    public PhotoAlbum() {
        setClazz(CLASS);
    }

    public PhotoAlbum(String str, Container container, String str2, String str3, Integer num, List<Photo> list) {
        this(str, container.getId(), str2, str3, num, list);
    }

    public PhotoAlbum(String str, String str2, String str3, String str4, Integer num) {
        this(str, str2, str3, str4, num, new ArrayList());
    }

    public void addPhotos(List<Photo> list) {
        addPhotos((Photo[]) list.toArray(new Photo[list.size()]));
    }

    public PhotoAlbum(String str, String str2, String str3, String str4, Integer num, List<Photo> list) {
        super(str, str2, str3, str4, num);
        setClazz(CLASS);
        addPhotos(list);
    }
}
