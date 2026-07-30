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
public class BLiveGiftExtraMultiPkInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraMultiPkInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraMultiPkInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraMultiPkInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraMultiPkInfo newInstance() {
            return new BLiveGiftExtraMultiPkInfo();
        }

        public boolean parseField(BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("receiveGiftRole")) {
                bLiveGiftExtraMultiPkInfo.receiveGiftRole = BLiveGiftExtraMultiPkReceiveGiftRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            bLiveGiftExtraMultiPkInfo.f44376id = jsonParser.getValueAsString();
            return false;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraMultiPkInfo.f44376id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveGiftExtraMultiPkInfo.receiveGiftRole != null) {
                jsonGenerator.writeFieldName("receiveGiftRole");
                BLiveGiftExtraMultiPkReceiveGiftRole.JSON_ADAPTER.serialize(bLiveGiftExtraMultiPkInfo.receiveGiftRole, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraMultiPkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextramultipkinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44376id;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftExtraMultiPkReceiveGiftRole receiveGiftRole;

    public static BLiveGiftExtraMultiPkInfo new_() {
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo = new BLiveGiftExtraMultiPkInfo();
        bLiveGiftExtraMultiPkInfo.nullCheck();
        return bLiveGiftExtraMultiPkInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraMultiPkInfo mo223809clone() {
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo = new BLiveGiftExtraMultiPkInfo();
        bLiveGiftExtraMultiPkInfo.f44376id = this.f44376id;
        BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole = this.receiveGiftRole;
        if (bLiveGiftExtraMultiPkReceiveGiftRole != null) {
            bLiveGiftExtraMultiPkInfo.receiveGiftRole = bLiveGiftExtraMultiPkReceiveGiftRole.mo223809clone();
        }
        return bLiveGiftExtraMultiPkInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraMultiPkInfo)) {
            return false;
        }
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo = (BLiveGiftExtraMultiPkInfo) obj;
        return ValueObject.util_equals(this.f44376id, bLiveGiftExtraMultiPkInfo.f44376id) && ValueObject.util_equals(this.receiveGiftRole, bLiveGiftExtraMultiPkInfo.receiveGiftRole);
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
        String str = this.f44376id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole = this.receiveGiftRole;
        int iHashCode2 = iHashCode + (bLiveGiftExtraMultiPkReceiveGiftRole != null ? bLiveGiftExtraMultiPkReceiveGiftRole.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44376id == null) {
            this.f44376id = "";
        }
        if (this.receiveGiftRole == null) {
            this.receiveGiftRole = BLiveGiftExtraMultiPkReceiveGiftRole.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
