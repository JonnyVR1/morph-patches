package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarInfo;
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
public class BLiveGiftStarOther extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftStarOther> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftStarOther>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftStarOther.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftStarOther.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftStarOther newInstance() {
            return new BLiveGiftStarOther();
        }

        public boolean parseField(BLiveGiftStarOther bLiveGiftStarOther, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftId":
                    bLiveGiftStarOther.giftId = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    bLiveGiftStarOther.name = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topN":
                    bLiveGiftStarOther.topN = JsonAdapter.parseArray(jsonParser, BLiveGiftStarInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "giftIcon":
                    bLiveGiftStarOther.giftIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftStarOther bLiveGiftStarOther, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftStarOther.name != null) {
                jsonGenerator.writeFieldName(AuthenticationTokenClaims.JSON_KEY_NAME);
                LangModel.JSON_ADAPTER.serialize(bLiveGiftStarOther.name, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("giftId", bLiveGiftStarOther.giftId);
            String str = bLiveGiftStarOther.giftIcon;
            if (str != null) {
                jsonGenerator.writeStringField("giftIcon", str);
            }
            if (bLiveGiftStarOther.topN != null) {
                jsonGenerator.writeFieldName("topN");
                JsonAdapter.serializeArray(bLiveGiftStarOther.topN, jsonGenerator, BLiveGiftStarInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftStarOther) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftstarother";

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftIcon;

    @ProtobufIndex(index = 2)
    public int giftId;

    @NonNull
    @ProtobufIndex(index = 1)
    public LangModel name;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveGiftStarInfo> topN;

    public static BLiveGiftStarOther new_() {
        BLiveGiftStarOther bLiveGiftStarOther = new BLiveGiftStarOther();
        bLiveGiftStarOther.nullCheck();
        return bLiveGiftStarOther;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftStarOther mo225055clone() {
        BLiveGiftStarOther bLiveGiftStarOther = new BLiveGiftStarOther();
        LangModel langModel = this.name;
        if (langModel != null) {
            bLiveGiftStarOther.name = langModel.mo225055clone();
        }
        bLiveGiftStarOther.giftId = this.giftId;
        bLiveGiftStarOther.giftIcon = this.giftIcon;
        List<BLiveGiftStarInfo> list = this.topN;
        if (list != null) {
            bLiveGiftStarOther.topN = ValueObject.util_map(list, new qcj() { // from class: l.f12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftStarInfo) obj).mo225055clone();
                }
            });
        }
        return bLiveGiftStarOther;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftStarOther)) {
            return false;
        }
        BLiveGiftStarOther bLiveGiftStarOther = (BLiveGiftStarOther) obj;
        return ValueObject.util_equals(this.name, bLiveGiftStarOther.name) && this.giftId == bLiveGiftStarOther.giftId && ValueObject.util_equals(this.giftIcon, bLiveGiftStarOther.giftIcon) && ValueObject.util_equals(this.topN, bLiveGiftStarOther.topN);
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
        LangModel langModel = this.name;
        int iHashCode = (((i2 + (langModel != null ? langModel.hashCode() : 0)) * 41) + this.giftId) * 41;
        String str = this.giftIcon;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveGiftStarInfo> list = this.topN;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = LangModel.new_();
        }
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.topN == null) {
            this.topN = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
