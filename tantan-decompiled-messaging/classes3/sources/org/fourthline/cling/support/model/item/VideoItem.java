package org.fourthline.cling.support.model.item;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Person;
import org.fourthline.cling.support.model.PersonWithRole;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VideoItem extends Item {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.videoItem");

    public VideoItem(String str, String str2, String str3, String str4, Res... resArr) {
        super(str, str2, str3, str4, CLASS);
        if (resArr != null) {
            getResources().addAll(Arrays.asList(resArr));
        }
    }

    public PersonWithRole[] getActors() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.ACTOR.class);
        return (PersonWithRole[]) propertyValues.toArray(new PersonWithRole[propertyValues.size()]);
    }

    public String getDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C0831DC.DESCRIPTION.class);
    }

    public Person[] getDirectors() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.DIRECTOR.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public PersonWithRole getFirstActor() {
        return (PersonWithRole) getFirstPropertyValue(DIDLObject.Property.UPNP.ACTOR.class);
    }

    public Person getFirstDirector() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.UPNP.DIRECTOR.class);
    }

    public String getFirstGenre() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.GENRE.class);
    }

    public Person getFirstProducer() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.UPNP.PRODUCER.class);
    }

    public Person getFirstPublisher() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.C0831DC.PUBLISHER.class);
    }

    public URI getFirstRelation() {
        return (URI) getFirstPropertyValue(DIDLObject.Property.C0831DC.RELATION.class);
    }

    public String[] getGenres() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.GENRE.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public String getLanguage() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C0831DC.LANGUAGE.class);
    }

    public String getLongDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.LONG_DESCRIPTION.class);
    }

    public Person[] getProducers() {
        List propertyValues = getPropertyValues(DIDLObject.Property.UPNP.PRODUCER.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public Person[] getPublishers() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C0831DC.PUBLISHER.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public String getRating() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.RATING.class);
    }

    public URI[] getRelations() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C0831DC.RELATION.class);
        return (URI[]) propertyValues.toArray(new URI[propertyValues.size()]);
    }

    public VideoItem setActors(PersonWithRole[] personWithRoleArr) {
        removeProperties(DIDLObject.Property.UPNP.ACTOR.class);
        for (PersonWithRole personWithRole : personWithRoleArr) {
            addProperty(new DIDLObject.Property.UPNP.ACTOR(personWithRole));
        }
        return this;
    }

    public VideoItem setDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.C0831DC.DESCRIPTION(str));
        return this;
    }

    public VideoItem setDirectors(Person[] personArr) {
        removeProperties(DIDLObject.Property.UPNP.DIRECTOR.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.UPNP.DIRECTOR(person));
        }
        return this;
    }

    public VideoItem setGenres(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.GENRE.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.GENRE(str));
        }
        return this;
    }

    public VideoItem setLanguage(String str) {
        replaceFirstProperty(new DIDLObject.Property.C0831DC.LANGUAGE(str));
        return this;
    }

    public VideoItem setLongDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.LONG_DESCRIPTION(str));
        return this;
    }

    public VideoItem setProducers(Person[] personArr) {
        removeProperties(DIDLObject.Property.UPNP.PRODUCER.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.UPNP.PRODUCER(person));
        }
        return this;
    }

    public VideoItem setPublishers(Person[] personArr) {
        removeProperties(DIDLObject.Property.C0831DC.PUBLISHER.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.C0831DC.PUBLISHER(person));
        }
        return this;
    }

    public VideoItem setRating(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.RATING(str));
        return this;
    }

    public VideoItem setRelations(URI[] uriArr) {
        removeProperties(DIDLObject.Property.C0831DC.RELATION.class);
        for (URI uri : uriArr) {
            addProperty(new DIDLObject.Property.C0831DC.RELATION(uri));
        }
        return this;
    }

    public VideoItem(Item item) {
        super(item);
    }

    public VideoItem(String str, Container container, String str2, String str3, Res... resArr) {
        this(str, container.getId(), str2, str3, resArr);
    }

    public VideoItem() {
        setClazz(CLASS);
    }
}
