package org.fourthline.cling.support.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.w3c.dom.Element;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class DIDLObject {
    protected Class clazz;
    protected String creator;
    protected List<DescMeta> descMetadata;

    /* JADX INFO: renamed from: id */
    protected String f9569id;
    protected String parentID;
    protected List<Property> properties;
    protected List<Res> resources;
    protected boolean restricted;
    protected String title;
    protected WriteStatus writeStatus;

    public DIDLObject(String str, String str2, String str3, String str4, boolean z, WriteStatus writeStatus, Class r8, List<Res> list, List<Property> list2, List<DescMeta> list3) {
        this.restricted = true;
        this.resources = new ArrayList();
        this.properties = new ArrayList();
        new ArrayList();
        this.f9569id = str;
        this.parentID = str2;
        this.title = str3;
        this.creator = str4;
        this.restricted = z;
        this.writeStatus = writeStatus;
        this.clazz = r8;
        this.resources = list;
        this.properties = list2;
        this.descMetadata = list3;
    }

    public DIDLObject addDescMetadata(DescMeta descMeta) {
        getDescMetadata().add(descMeta);
        return this;
    }

    public DIDLObject addProperties(Property[] propertyArr) {
        if (propertyArr != null) {
            for (Property property : propertyArr) {
                addProperty(property);
            }
        }
        return this;
    }

    public DIDLObject addProperty(Property property) {
        if (property == null) {
            return this;
        }
        getProperties().add(property);
        return this;
    }

    public DIDLObject addResource(Res res) {
        getResources().add(res);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f9569id.equals(((DIDLObject) obj).f9569id);
    }

    public Class getClazz() {
        return this.clazz;
    }

    public String getCreator() {
        return this.creator;
    }

    public List<DescMeta> getDescMetadata() {
        return this.descMetadata;
    }

    public <V> Property<V> getFirstProperty(java.lang.Class<? extends Property<V>> cls) {
        for (Property<V> property : getProperties()) {
            if (cls.isInstance(property)) {
                return property;
            }
        }
        return null;
    }

    public <V> V getFirstPropertyValue(java.lang.Class<? extends Property<V>> cls) {
        Property<V> firstProperty = getFirstProperty(cls);
        if (firstProperty == null) {
            return null;
        }
        return firstProperty.getValue();
    }

    public Res getFirstResource() {
        if (getResources().size() > 0) {
            return getResources().get(0);
        }
        return null;
    }

    public String getId() {
        return this.f9569id;
    }

    public <V> Property<V> getLastProperty(java.lang.Class<? extends Property<V>> cls) {
        Property<V> property = null;
        for (Property<V> property2 : getProperties()) {
            if (cls.isInstance(property2)) {
                property = property2;
            }
        }
        return property;
    }

    public String getParentID() {
        return this.parentID;
    }

    public <V> Property<V>[] getProperties(java.lang.Class<? extends Property<V>> cls) {
        ArrayList arrayList = new ArrayList();
        for (Property property : getProperties()) {
            if (cls.isInstance(property)) {
                arrayList.add(property);
            }
        }
        return (Property[]) arrayList.toArray(new Property[arrayList.size()]);
    }

    public <V> Property<V>[] getPropertiesByNamespace(java.lang.Class<? extends Property.NAMESPACE> cls) {
        ArrayList arrayList = new ArrayList();
        for (Property property : getProperties()) {
            if (cls.isInstance(property)) {
                arrayList.add(property);
            }
        }
        return (Property[]) arrayList.toArray(new Property[arrayList.size()]);
    }

    public <V> List<V> getPropertyValues(java.lang.Class<? extends Property<V>> cls) {
        ArrayList arrayList = new ArrayList();
        for (Property<V> property : getProperties(cls)) {
            arrayList.add(property.getValue());
        }
        return arrayList;
    }

    public List<Res> getResources() {
        return this.resources;
    }

    public String getTitle() {
        return this.title;
    }

    public WriteStatus getWriteStatus() {
        return this.writeStatus;
    }

    public boolean hasProperty(java.lang.Class<? extends Property> cls) {
        Iterator<Property> it = getProperties().iterator();
        while (it.hasNext()) {
            if (cls.isInstance(it.next())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f9569id.hashCode();
    }

    public boolean isRestricted() {
        return this.restricted;
    }

    public DIDLObject removeProperties(java.lang.Class<? extends Property> cls) {
        Iterator<Property> it = getProperties().iterator();
        while (it.hasNext()) {
            if (cls.isInstance(it.next())) {
                it.remove();
            }
        }
        return this;
    }

    public DIDLObject replaceFirstProperty(Property property) {
        if (property == null) {
            return this;
        }
        Iterator<Property> it = getProperties().iterator();
        while (it.hasNext()) {
            if (it.next().getClass().isAssignableFrom(property.getClass())) {
                it.remove();
            }
        }
        addProperty(property);
        return this;
    }

    public DIDLObject replaceProperties(java.lang.Class<? extends Property> cls, Property[] propertyArr) {
        if (propertyArr.length == 0) {
            return this;
        }
        removeProperties(cls);
        return addProperties(propertyArr);
    }

    public DIDLObject setClazz(Class r1) {
        this.clazz = r1;
        return this;
    }

    public DIDLObject setCreator(String str) {
        this.creator = str;
        return this;
    }

    public void setDescMetadata(List<DescMeta> list) {
        this.descMetadata = list;
    }

    public DIDLObject setId(String str) {
        this.f9569id = str;
        return this;
    }

    public DIDLObject setParentID(String str) {
        this.parentID = str;
        return this;
    }

    public DIDLObject setProperties(List<Property> list) {
        this.properties = list;
        return this;
    }

    public DIDLObject setResources(List<Res> list) {
        this.resources = list;
        return this;
    }

    public DIDLObject setRestricted(boolean z) {
        this.restricted = z;
        return this;
    }

    public DIDLObject setTitle(String str) {
        this.title = str;
        return this;
    }

    public DIDLObject setWriteStatus(WriteStatus writeStatus) {
        this.writeStatus = writeStatus;
        return this;
    }

    public static abstract class Property<V> {
        private final List<Property<DIDLAttribute>> attributes;
        private final String descriptorName;
        private V value;

        public interface NAMESPACE {
        }

        public Property(V v2, String str, List<Property<DIDLAttribute>> list) {
            ArrayList arrayList = new ArrayList();
            this.attributes = arrayList;
            this.value = v2;
            this.descriptorName = str == null ? getClass().getSimpleName().toLowerCase(Locale.ROOT).replace("didlobject$property$upnp$", "") : str;
            arrayList.addAll(list);
        }

        public void addAttribute(Property<DIDLAttribute> property) {
            this.attributes.add(property);
        }

        public Property<DIDLAttribute> getAttribute(String str) {
            for (Property<DIDLAttribute> property : this.attributes) {
                if (property.getDescriptorName().equals(str)) {
                    return property;
                }
            }
            return null;
        }

        public String getDescriptorName() {
            return this.descriptorName;
        }

        public V getValue() {
            return this.value;
        }

        public void removeAttribute(String str) {
            for (Property<DIDLAttribute> property : this.attributes) {
                if (property.getDescriptorName().equals(str)) {
                    removeAttribute(property);
                    return;
                }
            }
        }

        public void setOnElement(Element element) {
            element.setTextContent(toString());
            for (Property<DIDLAttribute> property : this.attributes) {
                element.setAttributeNS(property.getValue().getNamespaceURI(), property.getValue().getPrefix() + ':' + property.getDescriptorName(), property.getValue().getValue());
            }
        }

        public void setValue(V v2) {
            this.value = v2;
        }

        public String toString() {
            return getValue() != null ? getValue().toString() : "";
        }

        /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC */
        public static class C0831DC {

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$NAMESPACE */
            public interface NAMESPACE extends NAMESPACE {
                public static final String URI = "http://purl.org/dc/elements/1.1/";
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$CONTRIBUTOR */
            public static class CONTRIBUTOR extends Property<Person> implements NAMESPACE {
                public CONTRIBUTOR(Person person) {
                    super(person, null);
                }

                public CONTRIBUTOR() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$DATE */
            public static class DATE extends Property<String> implements NAMESPACE {
                public DATE(String str) {
                    super(str, null);
                }

                public DATE() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$DESCRIPTION */
            public static class DESCRIPTION extends Property<String> implements NAMESPACE {
                public DESCRIPTION(String str) {
                    super(str, null);
                }

                public DESCRIPTION() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$LANGUAGE */
            public static class LANGUAGE extends Property<String> implements NAMESPACE {
                public LANGUAGE(String str) {
                    super(str, null);
                }

                public LANGUAGE() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$PUBLISHER */
            public static class PUBLISHER extends Property<Person> implements NAMESPACE {
                public PUBLISHER(Person person) {
                    super(person, null);
                }

                public PUBLISHER() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$RELATION */
            public static class RELATION extends Property<URI> implements NAMESPACE {
                public RELATION(URI uri) {
                    super(uri, null);
                }

                public RELATION() {
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.support.model.DIDLObject$Property$DC$RIGHTS */
            public static class RIGHTS extends Property<String> implements NAMESPACE {
                public RIGHTS(String str) {
                    super(str, null);
                }

                public RIGHTS() {
                }
            }
        }

        public static class PropertyPersonWithRole extends Property<PersonWithRole> {
            public PropertyPersonWithRole() {
            }

            @Override // org.fourthline.cling.support.model.DIDLObject.Property
            public void setOnElement(Element element) {
                if (getValue() != null) {
                    getValue().setOnElement(element);
                }
            }

            public PropertyPersonWithRole(String str) {
                super(str);
            }

            public PropertyPersonWithRole(PersonWithRole personWithRole, String str) {
                super(personWithRole, str);
            }
        }

        public static abstract class UPNP {

            public interface NAMESPACE extends NAMESPACE {
                public static final String URI = "urn:schemas-upnp-org:metadata-1-0/upnp/";
            }

            public static class ACTOR extends PropertyPersonWithRole implements NAMESPACE {
                public ACTOR(PersonWithRole personWithRole) {
                    super(personWithRole, null);
                }

                public ACTOR() {
                }
            }

            public static class ALBUM extends Property<String> implements NAMESPACE {
                public ALBUM(String str) {
                    super(str, null);
                }

                public ALBUM() {
                }
            }

            public static class ARTIST extends PropertyPersonWithRole implements NAMESPACE {
                public ARTIST(PersonWithRole personWithRole) {
                    super(personWithRole, null);
                }

                public ARTIST() {
                }
            }

            public static class AUTHOR extends PropertyPersonWithRole implements NAMESPACE {
                public AUTHOR(PersonWithRole personWithRole) {
                    super(personWithRole, null);
                }

                public AUTHOR() {
                }
            }

            public static class DIRECTOR extends Property<Person> implements NAMESPACE {
                public DIRECTOR(Person person) {
                    super(person, null);
                }

                public DIRECTOR() {
                }
            }

            public static class GENRE extends Property<String> implements NAMESPACE {
                public GENRE(String str) {
                    super(str, null);
                }

                public GENRE() {
                }
            }

            public static class PLAYLIST extends Property<String> implements NAMESPACE {
                public PLAYLIST(String str) {
                    super(str, null);
                }

                public PLAYLIST() {
                }
            }

            public static class PRODUCER extends Property<Person> implements NAMESPACE {
                public PRODUCER(Person person) {
                    super(person, null);
                }

                public PRODUCER() {
                }
            }

            public static class RATING extends Property<String> implements NAMESPACE {
                public RATING(String str) {
                    super(str, null);
                }

                public RATING() {
                }
            }

            public static class REGION extends Property<String> implements NAMESPACE {
                public REGION(String str) {
                    super(str, null);
                }

                public REGION() {
                }
            }

            public static class TOC extends Property<String> implements NAMESPACE {
                public TOC(String str) {
                    super(str, null);
                }

                public TOC() {
                }
            }

            public static class ALBUM_ART_URI extends Property<URI> implements NAMESPACE {
                public ALBUM_ART_URI(URI uri) {
                    super(uri, "albumArtURI");
                }

                public ALBUM_ART_URI() {
                    this(null);
                }

                public ALBUM_ART_URI(URI uri, List<Property<DIDLAttribute>> list) {
                    super(uri, "albumArtURI", list);
                }
            }

            public static class ARTIST_DISCO_URI extends Property<URI> implements NAMESPACE {
                public ARTIST_DISCO_URI(URI uri) {
                    super(uri, "artistDiscographyURI");
                }

                public ARTIST_DISCO_URI() {
                    this(null);
                }
            }

            public static class CHANNEL_NAME extends Property<String> implements NAMESPACE {
                public CHANNEL_NAME(String str) {
                    super(str, "channelName");
                }

                public CHANNEL_NAME() {
                    this(null);
                }
            }

            public static class CHANNEL_NR extends Property<Integer> implements NAMESPACE {
                public CHANNEL_NR(Integer num) {
                    super(num, "channelNr");
                }

                public CHANNEL_NR() {
                    this(null);
                }
            }

            public static class DVD_REGION_CODE extends Property<Integer> implements NAMESPACE {
                public DVD_REGION_CODE(Integer num) {
                    super(num, "DVDRegionCode");
                }

                public DVD_REGION_CODE() {
                    this(null);
                }
            }

            public static class ICON extends Property<URI> implements NAMESPACE {
                public ICON(URI uri) {
                    super(uri, "icon");
                }

                public ICON() {
                    this(null);
                }
            }

            public static class LONG_DESCRIPTION extends Property<String> implements NAMESPACE {
                public LONG_DESCRIPTION(String str) {
                    super(str, "longDescription");
                }

                public LONG_DESCRIPTION() {
                    this(null);
                }
            }

            public static class LYRICS_URI extends Property<URI> implements NAMESPACE {
                public LYRICS_URI(URI uri) {
                    super(uri, "lyricsURI");
                }

                public LYRICS_URI() {
                    this(null);
                }
            }

            public static class ORIGINAL_TRACK_NUMBER extends Property<Integer> implements NAMESPACE {
                public ORIGINAL_TRACK_NUMBER(Integer num) {
                    super(num, "originalTrackNumber");
                }

                public ORIGINAL_TRACK_NUMBER() {
                    this(null);
                }
            }

            public static class RADIO_BAND extends Property<String> implements NAMESPACE {
                public RADIO_BAND(String str) {
                    super(str, "radioBand");
                }

                public RADIO_BAND() {
                    this(null);
                }
            }

            public static class RADIO_CALL_SIGN extends Property<String> implements NAMESPACE {
                public RADIO_CALL_SIGN(String str) {
                    super(str, "radioCallSign");
                }

                public RADIO_CALL_SIGN() {
                    this(null);
                }
            }

            public static class RADIO_STATION_ID extends Property<String> implements NAMESPACE {
                public RADIO_STATION_ID(String str) {
                    super(str, "radioStationID");
                }

                public RADIO_STATION_ID() {
                    this(null);
                }
            }

            public static class SCHEDULED_END_TIME extends Property<String> implements NAMESPACE {
                public SCHEDULED_END_TIME(String str) {
                    super(str, "scheduledEndTime");
                }

                public SCHEDULED_END_TIME() {
                    this(null);
                }
            }

            public static class SCHEDULED_START_TIME extends Property<String> implements NAMESPACE {
                public SCHEDULED_START_TIME(String str) {
                    super(str, "scheduledStartTime");
                }

                public SCHEDULED_START_TIME() {
                    this(null);
                }
            }

            public static class STORAGE_FREE extends Property<Long> implements NAMESPACE {
                public STORAGE_FREE(Long l2) {
                    super(l2, "storageFree");
                }

                public STORAGE_FREE() {
                    this(null);
                }
            }

            public static class STORAGE_MAX_PARTITION extends Property<Long> implements NAMESPACE {
                public STORAGE_MAX_PARTITION(Long l2) {
                    super(l2, "storageMaxPartition");
                }

                public STORAGE_MAX_PARTITION() {
                    this(null);
                }
            }

            public static class STORAGE_MEDIUM extends Property<StorageMedium> implements NAMESPACE {
                public STORAGE_MEDIUM(StorageMedium storageMedium) {
                    super(storageMedium, "storageMedium");
                }

                public STORAGE_MEDIUM() {
                    this(null);
                }
            }

            public static class STORAGE_TOTAL extends Property<Long> implements NAMESPACE {
                public STORAGE_TOTAL(Long l2) {
                    super(l2, "storageTotal");
                }

                public STORAGE_TOTAL() {
                    this(null);
                }
            }

            public static class STORAGE_USED extends Property<Long> implements NAMESPACE {
                public STORAGE_USED(Long l2) {
                    super(l2, "storageUsed");
                }

                public STORAGE_USED() {
                    this(null);
                }
            }

            public static class USER_ANNOTATION extends Property<String> implements NAMESPACE {
                public USER_ANNOTATION(String str) {
                    super(str, "userAnnotation");
                }

                public USER_ANNOTATION() {
                    this(null);
                }
            }
        }

        public static abstract class DLNA {

            public interface NAMESPACE extends NAMESPACE {
                public static final String URI = "urn:schemas-dlna-org:metadata-1-0/";
            }

            public static class PROFILE_ID extends Property<DIDLAttribute> implements NAMESPACE {
                public PROFILE_ID(DIDLAttribute dIDLAttribute) {
                    super(dIDLAttribute, "profileID");
                }

                public PROFILE_ID() {
                    this(null);
                }
            }
        }

        public static abstract class SEC {

            public interface NAMESPACE extends NAMESPACE {
                public static final String URI = "http://www.sec.co.kr/";
            }

            public static class CAPTIONINFO extends Property<URI> implements NAMESPACE {
                public CAPTIONINFO(URI uri) {
                    super(uri, "CaptionInfo");
                }

                public CAPTIONINFO() {
                    this(null);
                }

                public CAPTIONINFO(URI uri, List<Property<DIDLAttribute>> list) {
                    super(uri, "CaptionInfo", list);
                }
            }

            public static class CAPTIONINFOEX extends Property<URI> implements NAMESPACE {
                public CAPTIONINFOEX(URI uri) {
                    super(uri, "CaptionInfoEx");
                }

                public CAPTIONINFOEX() {
                    this(null);
                }

                public CAPTIONINFOEX(URI uri, List<Property<DIDLAttribute>> list) {
                    super(uri, "CaptionInfoEx", list);
                }
            }

            public static class TYPE extends Property<DIDLAttribute> implements NAMESPACE {
                public TYPE(DIDLAttribute dIDLAttribute) {
                    super(dIDLAttribute, IjkMediaMeta.IJKM_KEY_TYPE);
                }

                public TYPE() {
                    this(null);
                }
            }
        }

        public void removeAttribute(Property<DIDLAttribute> property) {
            this.attributes.remove(property);
        }

        public Property(String str) {
            this(null, str);
        }

        public Property(V v2, String str) {
            this.attributes = new ArrayList();
            this.value = v2;
            this.descriptorName = str == null ? getClass().getSimpleName().toLowerCase(Locale.ROOT).replace("didlobject$property$upnp$", "") : str;
        }

        public Property() {
            this(null, null);
        }
    }

    public static class Class {
        protected String friendlyName;
        protected boolean includeDerived;
        protected String value;

        public Class(String str, String str2, boolean z) {
            this.value = str;
            this.friendlyName = str2;
            this.includeDerived = z;
        }

        public boolean equals(DIDLObject dIDLObject) {
            return getValue().equals(dIDLObject.getClazz().getValue());
        }

        public String getFriendlyName() {
            return this.friendlyName;
        }

        public String getValue() {
            return this.value;
        }

        public boolean isIncludeDerived() {
            return this.includeDerived;
        }

        public void setFriendlyName(String str) {
            this.friendlyName = str;
        }

        public void setIncludeDerived(boolean z) {
            this.includeDerived = z;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public Class(String str) {
            this.value = str;
        }

        public Class(String str, String str2) {
            this.value = str;
            this.friendlyName = str2;
        }

        public Class() {
        }
    }

    public DIDLObject(DIDLObject dIDLObject) {
        this(dIDLObject.getId(), dIDLObject.getParentID(), dIDLObject.getTitle(), dIDLObject.getCreator(), dIDLObject.isRestricted(), dIDLObject.getWriteStatus(), dIDLObject.getClazz(), dIDLObject.getResources(), dIDLObject.getProperties(), dIDLObject.getDescMetadata());
    }

    public List<Property> getProperties() {
        return this.properties;
    }

    public DIDLObject() {
        this.restricted = true;
        this.resources = new ArrayList();
        this.properties = new ArrayList();
        this.descMetadata = new ArrayList();
    }
}
