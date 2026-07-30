package org.fourthline.cling.support.model.item;

import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Person;
import org.fourthline.cling.support.model.PersonWithRole;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MusicVideoClip extends VideoItem {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.videoItem.musicVideoClip");

    public MusicVideoClip() {
        setClazz(CLASS);
    }

    public String getAlbum() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.ALBUM.class);
    }

    public PersonWithRole[] getArtists() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.ARTIST.class);
        return (PersonWithRole[]) propertyValues.toArray(new PersonWithRole[propertyValues.size()]);
    }

    public Person[] getContributors() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C0831DC.CONTRIBUTOR.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public String getDate() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C0831DC.DATE.class);
    }

    public PersonWithRole getFirstArtist() {
        return (PersonWithRole) getFirstPropertyValue(DIDLObject.Property.UPNP.ARTIST.class);
    }

    public Person getFirstContributor() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.C0831DC.CONTRIBUTOR.class);
    }

    public String getFirstScheduledEndTime() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.SCHEDULED_END_TIME.class);
    }

    public String getFirstScheduledStartTime() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.SCHEDULED_START_TIME.class);
    }

    public String[] getScheduledEndTimes() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.SCHEDULED_END_TIME.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public String[] getScheduledStartTimes() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.SCHEDULED_START_TIME.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public StorageMedium getStorageMedium() {
        return (StorageMedium) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MEDIUM.class);
    }

    public MusicVideoClip setAlbum(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.ALBUM(str));
        return this;
    }

    public MusicVideoClip setArtists(PersonWithRole[] personWithRoleArr) {
        removeProperties(DIDLObject.Property.UPNP.ARTIST.class);
        for (PersonWithRole personWithRole : personWithRoleArr) {
            addProperty(new DIDLObject.Property.UPNP.ARTIST(personWithRole));
        }
        return this;
    }

    public MusicVideoClip setContributors(Person[] personArr) {
        removeProperties(DIDLObject.Property.C0831DC.CONTRIBUTOR.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.C0831DC.CONTRIBUTOR(person));
        }
        return this;
    }

    public MusicVideoClip setDate(String str) {
        replaceFirstProperty(new DIDLObject.Property.C0831DC.DATE(str));
        return this;
    }

    public MusicVideoClip setScheduledEndTimes(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.SCHEDULED_END_TIME.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.SCHEDULED_END_TIME(str));
        }
        return this;
    }

    public MusicVideoClip setScheduledStartTimes(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.SCHEDULED_START_TIME.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.SCHEDULED_START_TIME(str));
        }
        return this;
    }

    public MusicVideoClip setStorageMedium(StorageMedium storageMedium) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MEDIUM(storageMedium));
        return this;
    }

    public MusicVideoClip(Item item) {
        super(item);
    }

    public MusicVideoClip(String str, Container container, String str2, String str3, Res... resArr) {
        this(str, container.getId(), str2, str3, resArr);
    }

    public MusicVideoClip(String str, String str2, String str3, String str4, Res... resArr) {
        super(str, str2, str3, str4, resArr);
        setClazz(CLASS);
    }
}
