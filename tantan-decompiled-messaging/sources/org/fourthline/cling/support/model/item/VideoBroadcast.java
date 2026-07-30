package org.fourthline.cling.support.model.item;

import java.net.URI;
import org.fourthline.cling.support.model.DIDLObject;
import org.fourthline.cling.support.model.Res;
import org.fourthline.cling.support.model.container.Container;

/* JADX INFO: loaded from: classes3.dex */
public class VideoBroadcast extends VideoItem {
    public static final DIDLObject.Class CLASS = new DIDLObject.Class("object.item.videoItem.videoBroadcast");

    public VideoBroadcast() {
        setClazz(CLASS);
    }

    public Integer getChannelNr() {
        return (Integer) getFirstPropertyValue(DIDLObject.Property.UPNP.CHANNEL_NR.class);
    }

    public URI getIcon() {
        return (URI) getFirstPropertyValue(DIDLObject.Property.UPNP.ICON.class);
    }

    public String getRegion() {
        return (String) getFirstPropertyValue(DIDLObject.Property.UPNP.REGION.class);
    }

    public VideoBroadcast setChannelNr(Integer num) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.CHANNEL_NR(num));
        return this;
    }

    public VideoBroadcast setIcon(URI uri) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.ICON(uri));
        return this;
    }

    public VideoBroadcast setRegion(String str) {
        replaceFirstProperty(new DIDLObject.Property.UPNP.REGION(str));
        return this;
    }

    public VideoBroadcast(Item item) {
        super(item);
    }

    public VideoBroadcast(String str, Container container, String str2, String str3, Res... resArr) {
        this(str, container.getId(), str2, str3, resArr);
    }

    public VideoBroadcast(String str, String str2, String str3, String str4, Res... resArr) {
        super(str, str2, str3, str4, resArr);
        setClazz(CLASS);
    }
}
