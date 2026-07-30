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
public class BLiveAccommpanyTasksAwards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTasksAwards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTasksAwards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksAwards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTasksAwards.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTasksAwards newInstance() {
            return new BLiveAccommpanyTasksAwards();
        }

        public boolean parseField(BLiveAccommpanyTasksAwards bLiveAccommpanyTasksAwards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("icon")) {
                bLiveAccommpanyTasksAwards.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            bLiveAccommpanyTasksAwards.name = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTasksAwards bLiveAccommpanyTasksAwards, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAccommpanyTasksAwards.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveAccommpanyTasksAwards.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTasksAwards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasksawards";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveAccommpanyTasksAwards new_() {
        BLiveAccommpanyTasksAwards bLiveAccommpanyTasksAwards = new BLiveAccommpanyTasksAwards();
        bLiveAccommpanyTasksAwards.nullCheck();
        return bLiveAccommpanyTasksAwards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTasksAwards mo223809clone() {
        BLiveAccommpanyTasksAwards bLiveAccommpanyTasksAwards = new BLiveAccommpanyTasksAwards();
        bLiveAccommpanyTasksAwards.name = this.name;
        bLiveAccommpanyTasksAwards.icon = this.icon;
        return bLiveAccommpanyTasksAwards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTasksAwards)) {
            return false;
        }
        BLiveAccommpanyTasksAwards bLiveAccommpanyTasksAwards = (BLiveAccommpanyTasksAwards) obj;
        return ValueObject.util_equals(this.name, bLiveAccommpanyTasksAwards.name) && ValueObject.util_equals(this.icon, bLiveAccommpanyTasksAwards.icon);
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
        String str2 = this.icon;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
