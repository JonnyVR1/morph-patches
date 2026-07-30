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
public class BLiveStormDanmakuGiftResource extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStormDanmakuGiftResource> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStormDanmakuGiftResource>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResource.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStormDanmakuGiftResource.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStormDanmakuGiftResource newInstance() {
            return new BLiveStormDanmakuGiftResource();
        }

        public boolean parseField(BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("giftId")) {
                bLiveStormDanmakuGiftResource.giftId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("kind")) {
                return false;
            }
            bLiveStormDanmakuGiftResource.kind = BLiveStormDanmakuGiftResourceType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveStormDanmakuGiftResource.kind != null) {
                jsonGenerator.writeFieldName("kind");
                BLiveStormDanmakuGiftResourceType.JSON_ADAPTER.serialize(bLiveStormDanmakuGiftResource.kind, jsonGenerator, true);
            }
            String str = bLiveStormDanmakuGiftResource.giftId;
            if (str != null) {
                jsonGenerator.writeStringField("giftId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStormDanmakuGiftResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestormdanmakugiftresource";

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveStormDanmakuGiftResourceType kind;

    public static BLiveStormDanmakuGiftResource new_() {
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = new BLiveStormDanmakuGiftResource();
        bLiveStormDanmakuGiftResource.nullCheck();
        return bLiveStormDanmakuGiftResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStormDanmakuGiftResource mo225055clone() {
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = new BLiveStormDanmakuGiftResource();
        bLiveStormDanmakuGiftResource.kind = this.kind;
        bLiveStormDanmakuGiftResource.giftId = this.giftId;
        return bLiveStormDanmakuGiftResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStormDanmakuGiftResource)) {
            return false;
        }
        BLiveStormDanmakuGiftResource bLiveStormDanmakuGiftResource = (BLiveStormDanmakuGiftResource) obj;
        return ValueObject.util_equals(this.kind, bLiveStormDanmakuGiftResource.kind) && ValueObject.util_equals(this.giftId, bLiveStormDanmakuGiftResource.giftId);
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
        BLiveStormDanmakuGiftResourceType bLiveStormDanmakuGiftResourceType = this.kind;
        int iHashCode = (i2 + (bLiveStormDanmakuGiftResourceType != null ? bLiveStormDanmakuGiftResourceType.hashCode() : 0)) * 41;
        String str = this.giftId;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.kind == null) {
            this.kind = (BLiveStormDanmakuGiftResourceType) BLiveStormDanmakuGiftResourceType.JSON_ADAPTER.defaultEnum();
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
