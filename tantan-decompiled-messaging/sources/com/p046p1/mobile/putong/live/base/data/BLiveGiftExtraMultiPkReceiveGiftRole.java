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
public class BLiveGiftExtraMultiPkReceiveGiftRole extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraMultiPkReceiveGiftRole> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraMultiPkReceiveGiftRole>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraMultiPkReceiveGiftRole.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraMultiPkReceiveGiftRole newInstance() {
            return new BLiveGiftExtraMultiPkReceiveGiftRole();
        }

        public boolean parseField(BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                bLiveGiftExtraMultiPkReceiveGiftRole.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("role")) {
                return false;
            }
            bLiveGiftExtraMultiPkReceiveGiftRole.role = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraMultiPkReceiveGiftRole.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveGiftExtraMultiPkReceiveGiftRole.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraMultiPkReceiveGiftRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextramultipkreceivegiftrole";

    @NonNull
    @ProtobufIndex(index = 2)
    public String role;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveGiftExtraMultiPkReceiveGiftRole new_() {
        BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole = new BLiveGiftExtraMultiPkReceiveGiftRole();
        bLiveGiftExtraMultiPkReceiveGiftRole.nullCheck();
        return bLiveGiftExtraMultiPkReceiveGiftRole;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraMultiPkReceiveGiftRole mo223809clone() {
        BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole = new BLiveGiftExtraMultiPkReceiveGiftRole();
        bLiveGiftExtraMultiPkReceiveGiftRole.userId = this.userId;
        bLiveGiftExtraMultiPkReceiveGiftRole.role = this.role;
        return bLiveGiftExtraMultiPkReceiveGiftRole;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraMultiPkReceiveGiftRole)) {
            return false;
        }
        BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRole = (BLiveGiftExtraMultiPkReceiveGiftRole) obj;
        return ValueObject.util_equals(this.userId, bLiveGiftExtraMultiPkReceiveGiftRole.userId) && ValueObject.util_equals(this.role, bLiveGiftExtraMultiPkReceiveGiftRole.role);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.role;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.role == null) {
            this.role = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
