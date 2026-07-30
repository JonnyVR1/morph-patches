package org.fourthline.cling.support.model.item;

import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Person;
import org.fourthline.cling.support.model.PersonWithRole;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: classes3.dex */
public class MusicTrack extends AudioItem {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.audioItem.musicTrack");

    public MusicTrack(String str, String str2, String str3, String str4, String str5, PersonWithRole personWithRole, Res... resArr) {
        super(str, str2, str3, str4, resArr);
        setClazz(CLASS);
        if (str5 != null) {
            setAlbum(str5);
        }
        if (personWithRole != null) {
            addProperty(new DIDLObject.Property.UPNP.ARTIST(personWithRole));
        }
    }

    public String getAlbum() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.ALBUM.class);
    }

    public PersonWithRole[] getArtists() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.ARTIST.class);
        return (PersonWithRole[]) propertyValues.toArray(new PersonWithRole[propertyValues.size()]);
    }

    public Person[] getContributors() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C22038DC.CONTRIBUTOR.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public String getDate() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22038DC.DATE.class);
    }

    public PersonWithRole getFirstArtist() {
        return (PersonWithRole) getFirstPropertyValue(DIDLObject.Property.UPNP.ARTIST.class);
    }

    public Person getFirstContributor() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.C22038DC.CONTRIBUTOR.class);
    }

    public String getFirstPlaylist() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.PLAYLIST.class);
    }

    public Integer getOriginalTrackNumber() {
        return (Integer) getFirstPropertyValue(DIDLObject.Property.UPNP.ORIGINAL_TRACK_NUMBER.class);
    }

    public String[] getPlaylists() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.PLAYLIST.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public StorageMedium getStorageMedium() {
        return (StorageMedium) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MEDIUM.class);
    }

    public MusicTrack setAlbum(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.ALBUM(str));
        return this;
    }

    public MusicTrack setArtists(PersonWithRole[] personWithRoleArr) {
        removeProperties(DIDLObject.Property.UPNP.ARTIST.class);
        for (PersonWithRole personWithRole : personWithRoleArr) {
            addProperty(new DIDLObject.Property.UPNP.ARTIST(personWithRole));
        }
        return this;
    }

    public MusicTrack setContributors(Person[] personArr) {
        removeProperties(DIDLObject.Property.C22038DC.CONTRIBUTOR.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.C22038DC.CONTRIBUTOR(person));
        }
        return this;
    }

    public MusicTrack setDate(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22038DC.DATE(str));
        return this;
    }

    public MusicTrack setOriginalTrackNumber(Integer num) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.ORIGINAL_TRACK_NUMBER(num));
        return this;
    }

    public MusicTrack setPlaylists(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.PLAYLIST.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.PLAYLIST(str));
        }
        return this;
    }

    public MusicTrack setStorageMedium(StorageMedium storageMedium) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MEDIUM(storageMedium));
        return this;
    }

    public MusicTrack(Item item) {
        super(item);
    }

    public MusicTrack(String str, Container container, String str2, String str3, String str4, String str5, Res... resArr) {
        this(str, container.getId(), str2, str3, str4, str5, resArr);
    }

    public MusicTrack(String str, Container container, String str2, String str3, String str4, PersonWithRole personWithRole, Res... resArr) {
        this(str, container.getId(), str2, str3, str4, personWithRole, resArr);
    }

    public MusicTrack(String str, String str2, String str3, String str4, String str5, String str6, Res... resArr) {
        this(str, str2, str3, str4, str5, str6 == null ? null : new PersonWithRole(str6), resArr);
    }

    public MusicTrack() {
        setClazz(CLASS);
    }
}
