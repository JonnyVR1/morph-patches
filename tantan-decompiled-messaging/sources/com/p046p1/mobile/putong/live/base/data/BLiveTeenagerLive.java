package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveTeenagerLive extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTeenagerLive> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTeenagerLive>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTeenagerLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTeenagerLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTeenagerLive newInstance() {
            return new BLiveTeenagerLive();
        }

        public boolean parseField(BLiveTeenagerLive bLiveTeenagerLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mediaUrl":
                    bLiveTeenagerLive.mediaUrl = jsonParser.getValueAsString();
                    return true;
                case "coverUrl":
                    bLiveTeenagerLive.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveTeenagerLive.f44455id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveTeenagerLive.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveTeenagerLive.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTeenagerLive bLiveTeenagerLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTeenagerLive.f44455id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveTeenagerLive.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveTeenagerLive.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = bLiveTeenagerLive.coverUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("coverUrl", str4);
            }
            String str5 = bLiveTeenagerLive.mediaUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("mediaUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTeenagerLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveteenagerlive";

    @NonNull
    @ProtobufIndex(index = 4)
    public String coverUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44455id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mediaUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveTeenagerLive new_() {
        BLiveTeenagerLive bLiveTeenagerLive = new BLiveTeenagerLive();
        bLiveTeenagerLive.nullCheck();
        return bLiveTeenagerLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTeenagerLive mo223809clone() {
        BLiveTeenagerLive bLiveTeenagerLive = new BLiveTeenagerLive();
        bLiveTeenagerLive.f44455id = this.f44455id;
        bLiveTeenagerLive.type = this.type;
        bLiveTeenagerLive.title = this.title;
        bLiveTeenagerLive.coverUrl = this.coverUrl;
        bLiveTeenagerLive.mediaUrl = this.mediaUrl;
        return bLiveTeenagerLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTeenagerLive)) {
            return false;
        }
        BLiveTeenagerLive bLiveTeenagerLive = (BLiveTeenagerLive) obj;
        return ValueObject.util_equals(this.f44455id, bLiveTeenagerLive.f44455id) && ValueObject.util_equals(this.type, bLiveTeenagerLive.type) && ValueObject.util_equals(this.title, bLiveTeenagerLive.title) && ValueObject.util_equals(this.coverUrl, bLiveTeenagerLive.coverUrl) && ValueObject.util_equals(this.mediaUrl, bLiveTeenagerLive.mediaUrl);
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
        String str = this.f44455id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.coverUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.mediaUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44455id == null) {
            this.f44455id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.mediaUrl == null) {
            this.mediaUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
