package org.fourthline.cling.support.model.item;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Person;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: classes3.dex */
public class AudioItem extends Item {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.audioItem");

    public AudioItem(String str, String str2, String str3, String str4, Res... resArr) {
        super(str, str2, str3, str4, CLASS);
        if (resArr != null) {
            getResources().addAll(Arrays.asList(resArr));
        }
    }

    public String getDescription() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22159DC.DESCRIPTION.class);
    }

    public String getFirstGenre() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.GENRE.class);
    }

    public Person getFirstPublisher() {
        return (Person) getFirstPropertyValue(DIDLObject.Property.C22159DC.PUBLISHER.class);
    }

    public URI getFirstRelation() {
        return (URI) getFirstPropertyValue(DIDLObject.Property.C22159DC.RELATION.class);
    }

    public String getFirstRights() {
        return (String) getFirstPropertyValue(DIDLObject.Property.C22159DC.RIGHTS.class);
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

    public Person[] getPublishers() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C22159DC.PUBLISHER.class);
        return (Person[]) propertyValues.toArray(new Person[propertyValues.size()]);
    }

    public URI[] getRelations() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C22159DC.RELATION.class);
        return (URI[]) propertyValues.toArray(new URI[propertyValues.size()]);
    }

    public String[] getRights() {
        List propertyValues = getPropertyValues(DIDLObject.Property.C22159DC.RIGHTS.class);
        return (String[]) propertyValues.toArray(new String[propertyValues.size()]);
    }

    public AudioItem setDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22159DC.DESCRIPTION(str));
        return this;
    }

    public AudioItem setGenres(String[] strArr) {
        removeProperties(DIDLObject.Property.UPNP.GENRE.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.UPNP.GENRE(str));
        }
        return this;
    }

    public AudioItem setLanguage(String str) {
        replaceFirstProperty(new DIDLObject.Property.C22159DC.LANGUAGE(str));
        return this;
    }

    public AudioItem setLongDescription(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.LONG_DESCRIPTION(str));
        return this;
    }

    public AudioItem setPublishers(Person[] personArr) {
        removeProperties(DIDLObject.Property.C22159DC.PUBLISHER.class);
        for (Person person : personArr) {
            addProperty(new DIDLObject.Property.C22159DC.PUBLISHER(person));
        }
        return this;
    }

    public AudioItem setRelations(URI[] uriArr) {
        removeProperties(DIDLObject.Property.C22159DC.RELATION.class);
        for (URI uri : uriArr) {
            addProperty(new DIDLObject.Property.C22159DC.RELATION(uri));
        }
        return this;
    }

    public AudioItem setRights(String[] strArr) {
        removeProperties(DIDLObject.Property.C22159DC.RIGHTS.class);
        for (String str : strArr) {
            addProperty(new DIDLObject.Property.C22159DC.RIGHTS(str));
        }
        return this;
    }

    public AudioItem(Item item) {
        super(item);
    }

    public AudioItem(String str, Container container, String str2, String str3, Res... resArr) {
        this(str, container.getId(), str2, str3, resArr);
    }

    public AudioItem() {
        setClazz(CLASS);
    }
}
