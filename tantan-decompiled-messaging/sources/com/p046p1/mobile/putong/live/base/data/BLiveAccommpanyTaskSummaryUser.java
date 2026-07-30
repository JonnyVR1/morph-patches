package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveAccommpanyTaskSummaryUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTaskSummaryUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTaskSummaryUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummaryUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTaskSummaryUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTaskSummaryUser newInstance() {
            return new BLiveAccommpanyTaskSummaryUser();
        }

        public boolean parseField(BLiveAccommpanyTaskSummaryUser bLiveAccommpanyTaskSummaryUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveAccommpanyTaskSummaryUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveAccommpanyTaskSummaryUser.f44325id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveAccommpanyTaskSummaryUser.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTaskSummaryUser bLiveAccommpanyTaskSummaryUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAccommpanyTaskSummaryUser.f44325id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveAccommpanyTaskSummaryUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveAccommpanyTaskSummaryUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTaskSummaryUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasksummaryuser";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44325id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveAccommpanyTaskSummaryUser new_() {
        BLiveAccommpanyTaskSummaryUser bLiveAccommpanyTaskSummaryUser = new BLiveAccommpanyTaskSummaryUser();
        bLiveAccommpanyTaskSummaryUser.nullCheck();
        return bLiveAccommpanyTaskSummaryUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTaskSummaryUser mo223809clone() {
        BLiveAccommpanyTaskSummaryUser bLiveAccommpanyTaskSummaryUser = new BLiveAccommpanyTaskSummaryUser();
        bLiveAccommpanyTaskSummaryUser.f44325id = this.f44325id;
        bLiveAccommpanyTaskSummaryUser.name = this.name;
        bLiveAccommpanyTaskSummaryUser.avatar = this.avatar;
        return bLiveAccommpanyTaskSummaryUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTaskSummaryUser)) {
            return false;
        }
        BLiveAccommpanyTaskSummaryUser bLiveAccommpanyTaskSummaryUser = (BLiveAccommpanyTaskSummaryUser) obj;
        return ValueObject.util_equals(this.f44325id, bLiveAccommpanyTaskSummaryUser.f44325id) && ValueObject.util_equals(this.name, bLiveAccommpanyTaskSummaryUser.name) && ValueObject.util_equals(this.avatar, bLiveAccommpanyTaskSummaryUser.avatar);
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
        String str = this.f44325id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44325id == null) {
            this.f44325id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
