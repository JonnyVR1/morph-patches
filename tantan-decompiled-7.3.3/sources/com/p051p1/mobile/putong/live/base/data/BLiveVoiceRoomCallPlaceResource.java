package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomCallPlaceResource extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomCallPlaceResource> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomCallPlaceResource>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomCallPlaceResource.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomCallPlaceResource.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomCallPlaceResource newInstance() {
            return new BLiveVoiceRoomCallPlaceResource();
        }

        public boolean parseField(BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "addUrl":
                    bLiveVoiceRoomCallPlaceResource.addUrl = jsonParser.getValueAsString();
                    return true;
                case "bossUrl":
                    bLiveVoiceRoomCallPlaceResource.bossUrl = jsonParser.getValueAsString();
                    return true;
                case "bgUrl":
                    bLiveVoiceRoomCallPlaceResource.bgUrl = jsonParser.getValueAsString();
                    return true;
                case "indexColor":
                    bLiveVoiceRoomCallPlaceResource.indexColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomCallPlaceResource.bgUrl;
            if (str != null) {
                jsonGenerator.writeStringField("bgUrl", str);
            }
            String str2 = bLiveVoiceRoomCallPlaceResource.addUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("addUrl", str2);
            }
            String str3 = bLiveVoiceRoomCallPlaceResource.bossUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("bossUrl", str3);
            }
            String str4 = bLiveVoiceRoomCallPlaceResource.indexColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("indexColor", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomCallPlaceResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomcallplaceresource";

    @NonNull
    @ProtobufIndex(index = 2)
    public String addUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String bgUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String bossUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String indexColor;

    public static BLiveVoiceRoomCallPlaceResource new_() {
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = new BLiveVoiceRoomCallPlaceResource();
        bLiveVoiceRoomCallPlaceResource.nullCheck();
        return bLiveVoiceRoomCallPlaceResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomCallPlaceResource mo225055clone() {
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = new BLiveVoiceRoomCallPlaceResource();
        bLiveVoiceRoomCallPlaceResource.bgUrl = this.bgUrl;
        bLiveVoiceRoomCallPlaceResource.addUrl = this.addUrl;
        bLiveVoiceRoomCallPlaceResource.bossUrl = this.bossUrl;
        bLiveVoiceRoomCallPlaceResource.indexColor = this.indexColor;
        return bLiveVoiceRoomCallPlaceResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomCallPlaceResource)) {
            return false;
        }
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = (BLiveVoiceRoomCallPlaceResource) obj;
        return ValueObject.util_equals(this.bgUrl, bLiveVoiceRoomCallPlaceResource.bgUrl) && ValueObject.util_equals(this.addUrl, bLiveVoiceRoomCallPlaceResource.addUrl) && ValueObject.util_equals(this.bossUrl, bLiveVoiceRoomCallPlaceResource.bossUrl) && ValueObject.util_equals(this.indexColor, bLiveVoiceRoomCallPlaceResource.indexColor);
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
        String str = this.bgUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.addUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bossUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.indexColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bgUrl == null) {
            this.bgUrl = "";
        }
        if (this.addUrl == null) {
            this.addUrl = "";
        }
        if (this.bossUrl == null) {
            this.bossUrl = "";
        }
        if (this.indexColor == null) {
            this.indexColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
