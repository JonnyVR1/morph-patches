package org.fourthline.cling.support.model.container;

import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Person;
import org.fourthline.cling.support.model.PersonWithRole;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: loaded from: classes3.dex */
public class PlaylistContainer extends Container {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.container.playlistContainer");

    public PlaylistContainer(String str, String str2, String str3, String str4, Integer num) {
        super(str, str2, str3, str4, CLASS, num);
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

    public String getDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22038DC.DESCRIPTION.class);
    }

    public PersonWithRole getFirstArtist() {
        return (PersonWithRole) getFirstPropertyValue(DIDLObject.Property.UPNP.ARTIST.class);
    }

    public Person getFirstContributor() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.C22038DC.CONTRIBUTOR.class);
    }

    public String getFirstGenre() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.GENRE.class);
    }

    public Person getFirstProducer() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.UPNP.PRODUCER.class);
    }

    public String getFirstRights() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22038DC.RIGHTS.class);
    }

    public String[] getGenres() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.GENRE.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public String getLanguage() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22038DC.LANGUAGE.class);
    }

    public String getLongDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.LONG_DESCRIPTION.class);
    }

    public Person[] getProducers() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.PRODUCER.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public String[] getRights() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C22038DC.RIGHTS.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public StorageMedium getStorageMedium() {
        return (StorageMedium) getFirstPropertyValue(DIDLObject.Property.UPNP.STORAGE_MEDIUM.class);
    }

    public PlaylistContainer setArtists(PersonWithRole[] personWithRoleArr) {
        removeProperties(DIDLObject.Property.UPNP.ARTIST.class);
        for (PersonWithRole personWithRole : personWithRoleArr) {
            addProperty(new DIDLObject.Property.UPNP.ARTIST(personWithRole));
        }
        return this;
    }

    public PlaylistContainer setContributors(Person[] personArr) {
        removeProperties(DIDLObject.Property.C22038DC.CONTRIBUTOR.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.C22038DC.CONTRIBUTOR(person));
        }
        return this;
    }

    public PlaylistContainer setDate(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22038DC.DATE(str));
        return this;
    }

    public PlaylistContainer setDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22038DC.DESCRIPTION(str));
        return this;
    }

    public PlaylistContainer setGenres(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.GENRE.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.GENRE(str));
        }
        return this;
    }

    public PlaylistContainer setLanguage(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22038DC.LANGUAGE(str));
        return this;
    }

    public PlaylistContainer setLongDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.LONG_DESCRIPTION(str));
        return this;
    }

    public PlaylistContainer setProducers(Person[] personArr) {
        removeProperties(DIDLObject.Property.UPNP.PRODUCER.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.UPNP.PRODUCER(person));
        }
        return this;
    }

    public PlaylistContainer setRights(String[] strArr) {
        removeProperties(DIDLObject.Property.C22038DC.RIGHTS.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.C22038DC.RIGHTS(str));
        }
        return this;
    }

    public PlaylistContainer setStorageMedium(StorageMedium storageMedium) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.STORAGE_MEDIUM(storageMedium));
        return this;
    }

    public PlaylistContainer(Container container) {
        super(container);
    }

    public PlaylistContainer(String str, Container container, String str2, String str3, Integer num) {
        this(str, container.getId(), str2, str3, num);
    }

    public PlaylistContainer() {
        setClazz(CLASS);
    }
}
