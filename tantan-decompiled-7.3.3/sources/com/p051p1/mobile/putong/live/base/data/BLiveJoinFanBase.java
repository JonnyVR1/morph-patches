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
public class BLiveJoinFanBase extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJoinFanBase> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJoinFanBase>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJoinFanBase.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJoinFanBase.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJoinFanBase newInstance() {
            return new BLiveJoinFanBase();
        }

        public boolean parseField(BLiveJoinFanBase bLiveJoinFanBase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("giftId")) {
                bLiveJoinFanBase.giftId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("buttonText")) {
                return false;
            }
            bLiveJoinFanBase.buttonText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJoinFanBase bLiveJoinFanBase, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJoinFanBase.giftId;
            if (str != null) {
                jsonGenerator.writeStringField("giftId", str);
            }
            String str2 = bLiveJoinFanBase.buttonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonText", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJoinFanBase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejoinfanbase";

    @NonNull
    @ProtobufIndex(index = 2)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftId;

    public static BLiveJoinFanBase new_() {
        BLiveJoinFanBase bLiveJoinFanBase = new BLiveJoinFanBase();
        bLiveJoinFanBase.nullCheck();
        return bLiveJoinFanBase;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJoinFanBase mo225055clone() {
        BLiveJoinFanBase bLiveJoinFanBase = new BLiveJoinFanBase();
        bLiveJoinFanBase.giftId = this.giftId;
        bLiveJoinFanBase.buttonText = this.buttonText;
        return bLiveJoinFanBase;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJoinFanBase)) {
            return false;
        }
        BLiveJoinFanBase bLiveJoinFanBase = (BLiveJoinFanBase) obj;
        return ValueObject.util_equals(this.giftId, bLiveJoinFanBase.giftId) && ValueObject.util_equals(this.buttonText, bLiveJoinFanBase.buttonText);
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
        String str = this.giftId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.buttonText;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
