package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveGiftMultiCallGiftRole extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftMultiCallGiftRole> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftMultiCallGiftRole>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftMultiCallGiftRole.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftMultiCallGiftRole newInstance() {
            return new BLiveGiftMultiCallGiftRole();
        }

        public boolean parseField(BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomIdRoleIn":
                    bLiveGiftMultiCallGiftRole.roomIdRoleIn = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveGiftMultiCallGiftRole.name = jsonParser.getValueAsString();
                    return true;
                case "role":
                    bLiveGiftMultiCallGiftRole.role = jsonParser.getValueAsString();
                    return true;
                case "position":
                    bLiveGiftMultiCallGiftRole.position = jsonParser.getValueAsString();
                    return true;
                case "liveIdRoleIn":
                    bLiveGiftMultiCallGiftRole.liveIdRoleIn = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftMultiCallGiftRole.position;
            if (str != null) {
                jsonGenerator.writeStringField("position", str);
            }
            String str2 = bLiveGiftMultiCallGiftRole.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
            String str3 = bLiveGiftMultiCallGiftRole.roomIdRoleIn;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomIdRoleIn", str3);
            }
            String str4 = bLiveGiftMultiCallGiftRole.liveIdRoleIn;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveIdRoleIn", str4);
            }
            String str5 = bLiveGiftMultiCallGiftRole.name;
            if (str5 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftMultiCallGiftRole) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftmulticallgiftrole";

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveIdRoleIn;

    @NonNull
    @ProtobufIndex(index = 5)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String position;

    @NonNull
    @ProtobufIndex(index = 2)
    public String role;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomIdRoleIn;

    public static BLiveGiftMultiCallGiftRole new_() {
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = new BLiveGiftMultiCallGiftRole();
        bLiveGiftMultiCallGiftRole.nullCheck();
        return bLiveGiftMultiCallGiftRole;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftMultiCallGiftRole mo225055clone() {
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = new BLiveGiftMultiCallGiftRole();
        bLiveGiftMultiCallGiftRole.position = this.position;
        bLiveGiftMultiCallGiftRole.role = this.role;
        bLiveGiftMultiCallGiftRole.roomIdRoleIn = this.roomIdRoleIn;
        bLiveGiftMultiCallGiftRole.liveIdRoleIn = this.liveIdRoleIn;
        bLiveGiftMultiCallGiftRole.name = this.name;
        return bLiveGiftMultiCallGiftRole;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftMultiCallGiftRole)) {
            return false;
        }
        BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = (BLiveGiftMultiCallGiftRole) obj;
        return ValueObject.util_equals(this.position, bLiveGiftMultiCallGiftRole.position) && ValueObject.util_equals(this.role, bLiveGiftMultiCallGiftRole.role) && ValueObject.util_equals(this.roomIdRoleIn, bLiveGiftMultiCallGiftRole.roomIdRoleIn) && ValueObject.util_equals(this.liveIdRoleIn, bLiveGiftMultiCallGiftRole.liveIdRoleIn) && ValueObject.util_equals(this.name, bLiveGiftMultiCallGiftRole.name);
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
        String str = this.position;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.role;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomIdRoleIn;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveIdRoleIn;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.name;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.position == null) {
            this.position = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.roomIdRoleIn == null) {
            this.roomIdRoleIn = "";
        }
        if (this.liveIdRoleIn == null) {
            this.liveIdRoleIn = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
