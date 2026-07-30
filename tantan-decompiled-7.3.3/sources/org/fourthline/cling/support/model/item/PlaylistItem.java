package org.fourthline.cling.support.model.item;

import java.util.Arrays;
import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.PersonWithRole;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: classes3.dex */
public class PlaylistItem extends Item {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.playlistItem");

    public PlaylistItem(String str, String str2, String str3, String str4, Res... resArr) {
        super(str, str2, str3, str4, CLASS);
        if (resArr != null) {
            getResources().addAll(Arrays.asList(resArr));
        }
    }

    public PersonWithRole[] getArtists() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.ARTIST.class);
        return (PersonWithRole[]) propertyValues.toArray(new PersonWithRole[propertyValues.size()]);
    }

    public String getDate() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22159DC.DATE.class);
    }

    public String getDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22159DC.DESCRIPTION.class);
    }

    public PersonWithRole getFirstArtist() {
        return (PersonWithRole) getFirstPropertyValue(DIDLObject.Property.UPNP.ARTIST.class);
    }

    public String getFirstGenre() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.GENRE.class);
    }

    public String[] getGenres() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.GENRE.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public String getLanguage() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22159DC.LANGUAGE.class);
    }

    public String getLongDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.LONG_DESCRIPTION.class);
    }

    public StorageMedium getStorageMedium() {
        return (StorageMedium) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MEDIUM.class);
    }

    public PlaylistItem setArtists(PersonWithRole[] personWithRoleArr) {
        removeProperties(DIDLObject.Property.UPNP.ARTIST.class);
        for (PersonWithRole personWithRole : personWithRoleArr) {
            addProperty(new DIDLObject.Property.UPNP.ARTIST(personWithRole));
        }
        return this;
    }

    public PlaylistItem setDate(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22159DC.DATE(str));
        return this;
    }

    public PlaylistItem setDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22159DC.DESCRIPTION(str));
        return this;
    }

    public PlaylistItem setGenres(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.GENRE.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.GENRE(str));
        }
        return this;
    }

    public PlaylistItem setLanguage(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22159DC.LANGUAGE(str));
        return this;
    }

    public PlaylistItem setLongDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.LONG_DESCRIPTION(str));
        return this;
    }

    public PlaylistItem setStorageMedium(StorageMedium storageMedium) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MEDIUM(storageMedium));
        return this;
    }

    public PlaylistItem(Item item) {
        super(item);
    }

    public PlaylistItem(String str, Container container, String str2, String str3, Res... resArr) {
        this(str, container.getId(), str2, str3, resArr);
    }

    public PlaylistItem() {
        setClazz(CLASS);
    }
}
