package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlMlnMedia extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlMlnMedia> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlMlnMedia>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlMlnMedia.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlMlnMedia.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlMlnMedia newInstance() {
            return new BLiveIntlMlnMedia();
        }

        public boolean parseField(BLiveIntlMlnMedia bLiveIntlMlnMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveIntlMlnMedia.duration = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    bLiveIntlMlnMedia.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveIntlMlnMedia.name = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bLiveIntlMlnMedia.size = jsonParser.getValueAsLong();
                    return true;
                case "mediaType":
                    bLiveIntlMlnMedia.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlMlnMedia bLiveIntlMlnMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlMlnMedia.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveIntlMlnMedia.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField("size", bLiveIntlMlnMedia.size);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveIntlMlnMedia.duration);
            String str3 = bLiveIntlMlnMedia.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlMlnMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlmlnmedia";

    @ProtobufIndex(index = 4)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 3)
    public long size;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    public static BLiveIntlMlnMedia new_() {
        BLiveIntlMlnMedia bLiveIntlMlnMedia = new BLiveIntlMlnMedia();
        bLiveIntlMlnMedia.nullCheck();
        return bLiveIntlMlnMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlMlnMedia mo223809clone() {
        BLiveIntlMlnMedia bLiveIntlMlnMedia = new BLiveIntlMlnMedia();
        bLiveIntlMlnMedia.name = this.name;
        bLiveIntlMlnMedia.url = this.url;
        bLiveIntlMlnMedia.size = this.size;
        bLiveIntlMlnMedia.duration = this.duration;
        bLiveIntlMlnMedia.mediaType = this.mediaType;
        return bLiveIntlMlnMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlMlnMedia)) {
            return false;
        }
        BLiveIntlMlnMedia bLiveIntlMlnMedia = (BLiveIntlMlnMedia) obj;
        return ValueObject.util_equals(this.name, bLiveIntlMlnMedia.name) && ValueObject.util_equals(this.url, bLiveIntlMlnMedia.url) && this.size == bLiveIntlMlnMedia.size && this.duration == bLiveIntlMlnMedia.duration && ValueObject.util_equals(this.mediaType, bLiveIntlMlnMedia.mediaType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.size;
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.duration) * 41;
        String str3 = this.mediaType;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
