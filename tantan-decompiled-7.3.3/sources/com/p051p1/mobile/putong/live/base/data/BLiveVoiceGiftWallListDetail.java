package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGiftWallListDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallListDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallListDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallListDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallListDetail newInstance() {
            return new BLiveVoiceGiftWallListDetail();
        }

        public boolean parseField(BLiveVoiceGiftWallListDetail bLiveVoiceGiftWallListDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "name":
                    bLiveVoiceGiftWallListDetail.name = jsonParser.getValueAsString();
                    return true;
                case "category":
                    bLiveVoiceGiftWallListDetail.category = jsonParser.getValueAsString();
                    return true;
                case "gifts":
                    bLiveVoiceGiftWallListDetail.gifts = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallListDetail bLiveVoiceGiftWallListDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftWallListDetail.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveVoiceGiftWallListDetail.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            if (bLiveVoiceGiftWallListDetail.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveVoiceGiftWallListDetail.gifts, jsonGenerator, BLiveVoiceGiftItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallListDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwalllistdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVoiceGiftItem> gifts;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveVoiceGiftWallListDetail new_() {
        BLiveVoiceGiftWallListDetail bLiveVoiceGiftWallListDetail = new BLiveVoiceGiftWallListDetail();
        bLiveVoiceGiftWallListDetail.nullCheck();
        return bLiveVoiceGiftWallListDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallListDetail mo225055clone() {
        BLiveVoiceGiftWallListDetail bLiveVoiceGiftWallListDetail = new BLiveVoiceGiftWallListDetail();
        bLiveVoiceGiftWallListDetail.name = this.name;
        bLiveVoiceGiftWallListDetail.category = this.category;
        List<BLiveVoiceGiftItem> list = this.gifts;
        if (list != null) {
            bLiveVoiceGiftWallListDetail.gifts = ValueObject.util_map(list, new qcj() { // from class: l.d92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftItem) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceGiftWallListDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWallListDetail)) {
            return false;
        }
        BLiveVoiceGiftWallListDetail bLiveVoiceGiftWallListDetail = (BLiveVoiceGiftWallListDetail) obj;
        return ValueObject.util_equals(this.name, bLiveVoiceGiftWallListDetail.name) && ValueObject.util_equals(this.category, bLiveVoiceGiftWallListDetail.category) && ValueObject.util_equals(this.gifts, bLiveVoiceGiftWallListDetail.gifts);
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
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveVoiceGiftItem> list = this.gifts;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
