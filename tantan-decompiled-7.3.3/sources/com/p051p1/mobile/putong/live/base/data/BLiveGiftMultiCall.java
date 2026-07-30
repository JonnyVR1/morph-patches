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
public class BLiveGiftMultiCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftMultiCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftMultiCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftMultiCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftMultiCall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftMultiCall newInstance() {
            return new BLiveGiftMultiCall();
        }

        public boolean parseField(BLiveGiftMultiCall bLiveGiftMultiCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "callId":
                    bLiveGiftMultiCall.callId = jsonParser.getValueAsString();
                    return true;
                case "receiveGiftRole":
                    bLiveGiftMultiCall.receiveGiftRole = BLiveGiftMultiCallGiftRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "givenGiftRole":
                    bLiveGiftMultiCall.givenGiftRole = BLiveGiftMultiCallGiftRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftMultiCall bLiveGiftMultiCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftMultiCall.callId;
            if (str != null) {
                jsonGenerator.writeStringField("callId", str);
            }
            if (bLiveGiftMultiCall.givenGiftRole != null) {
                jsonGenerator.writeFieldName("givenGiftRole");
                BLiveGiftMultiCallGiftRole.JSON_ADAPTER.serialize(bLiveGiftMultiCall.givenGiftRole, jsonGenerator, true);
            }
            if (bLiveGiftMultiCall.receiveGiftRole != null) {
                jsonGenerator.writeFieldName("receiveGiftRole");
                BLiveGiftMultiCallGiftRole.JSON_ADAPTER.serialize(bLiveGiftMultiCall.receiveGiftRole, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftMultiCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftmulticall";

    @NonNull
    @ProtobufIndex(index = 1)
    public String callId;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftMultiCallGiftRole givenGiftRole;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftMultiCallGiftRole receiveGiftRole;

    public static BLiveGiftMultiCall new_() {
        BLiveGiftMultiCall bLiveGiftMultiCall = new BLiveGiftMultiCall();
        bLiveGiftMultiCall.nullCheck();
        return bLiveGiftMultiCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftMultiCall mo225055clone() {
        BLiveGiftMultiCall bLiveGiftMultiCall = new BLiveGiftMultiCall();
        bLiveGiftMultiCall.callId = this.callId;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = this.givenGiftRole;
        if (bLiveGiftMultiCallGiftRole != null) {
            bLiveGiftMultiCall.givenGiftRole = bLiveGiftMultiCallGiftRole.mo225055clone();
        }
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = this.receiveGiftRole;
        if (bLiveGiftMultiCallGiftRole2 != null) {
            bLiveGiftMultiCall.receiveGiftRole = bLiveGiftMultiCallGiftRole2.mo225055clone();
        }
        return bLiveGiftMultiCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftMultiCall)) {
            return false;
        }
        BLiveGiftMultiCall bLiveGiftMultiCall = (BLiveGiftMultiCall) obj;
        return ValueObject.util_equals(this.callId, bLiveGiftMultiCall.callId) && ValueObject.util_equals(this.givenGiftRole, bLiveGiftMultiCall.givenGiftRole) && ValueObject.util_equals(this.receiveGiftRole, bLiveGiftMultiCall.receiveGiftRole);
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
        String str = this.callId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = this.givenGiftRole;
        int iHashCode2 = (iHashCode + (bLiveGiftMultiCallGiftRole != null ? bLiveGiftMultiCallGiftRole.hashCode() : 0)) * 41;
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = this.receiveGiftRole;
        int iHashCode3 = iHashCode2 + (bLiveGiftMultiCallGiftRole2 != null ? bLiveGiftMultiCallGiftRole2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.callId == null) {
            this.callId = "";
        }
        if (this.givenGiftRole == null) {
            this.givenGiftRole = BLiveGiftMultiCallGiftRole.new_();
        }
        if (this.receiveGiftRole == null) {
            this.receiveGiftRole = BLiveGiftMultiCallGiftRole.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
