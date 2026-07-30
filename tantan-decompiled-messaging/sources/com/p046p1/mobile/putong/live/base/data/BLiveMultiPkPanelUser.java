package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
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
public class BLiveMultiPkPanelUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkPanelUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkPanelUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkPanelUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkPanelUser newInstance() {
            return new BLiveMultiPkPanelUser();
        }

        public boolean parseField(BLiveMultiPkPanelUser bLiveMultiPkPanelUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveMultiPkPanelUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "picked":
                    bLiveMultiPkPanelUser.picked = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveMultiPkPanelUser.f44408id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveMultiPkPanelUser.name = jsonParser.getValueAsString();
                    return true;
                case "role":
                    bLiveMultiPkPanelUser.role = jsonParser.getValueAsString();
                    return true;
                case "toast":
                    bLiveMultiPkPanelUser.toast = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkPanelUser bLiveMultiPkPanelUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiPkPanelUser.f44408id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiPkPanelUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveMultiPkPanelUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            jsonGenerator.writeBooleanField("picked", bLiveMultiPkPanelUser.picked);
            String str4 = bLiveMultiPkPanelUser.role;
            if (str4 != null) {
                jsonGenerator.writeStringField("role", str4);
            }
            String str5 = bLiveMultiPkPanelUser.toast;
            if (str5 != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.toast, str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkPanelUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkpaneluser";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44408id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 4)
    public boolean picked;

    @NonNull
    @ProtobufIndex(index = 5)
    public String role;

    @NonNull
    @ProtobufIndex(index = 6)
    public String toast;

    public static BLiveMultiPkPanelUser new_() {
        BLiveMultiPkPanelUser bLiveMultiPkPanelUser = new BLiveMultiPkPanelUser();
        bLiveMultiPkPanelUser.nullCheck();
        return bLiveMultiPkPanelUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkPanelUser mo223809clone() {
        BLiveMultiPkPanelUser bLiveMultiPkPanelUser = new BLiveMultiPkPanelUser();
        bLiveMultiPkPanelUser.f44408id = this.f44408id;
        bLiveMultiPkPanelUser.name = this.name;
        bLiveMultiPkPanelUser.avatar = this.avatar;
        bLiveMultiPkPanelUser.picked = this.picked;
        bLiveMultiPkPanelUser.role = this.role;
        bLiveMultiPkPanelUser.toast = this.toast;
        return bLiveMultiPkPanelUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkPanelUser)) {
            return false;
        }
        BLiveMultiPkPanelUser bLiveMultiPkPanelUser = (BLiveMultiPkPanelUser) obj;
        return ValueObject.util_equals(this.f44408id, bLiveMultiPkPanelUser.f44408id) && ValueObject.util_equals(this.name, bLiveMultiPkPanelUser.name) && ValueObject.util_equals(this.avatar, bLiveMultiPkPanelUser.avatar) && this.picked == bLiveMultiPkPanelUser.picked && ValueObject.util_equals(this.role, bLiveMultiPkPanelUser.role) && ValueObject.util_equals(this.toast, bLiveMultiPkPanelUser.toast);
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
        String str = this.f44408id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.picked ? 1231 : 1237)) * 41;
        String str4 = this.role;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.toast;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44408id == null) {
            this.f44408id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.toast == null) {
            this.toast = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
