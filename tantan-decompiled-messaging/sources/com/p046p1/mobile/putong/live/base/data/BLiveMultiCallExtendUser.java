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
public class BLiveMultiCallExtendUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallExtendUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallExtendUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallExtendUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallExtendUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallExtendUser newInstance() {
            return new BLiveMultiCallExtendUser();
        }

        public boolean parseField(BLiveMultiCallExtendUser bLiveMultiCallExtendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveMultiCallExtendUser.f44403id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("icon")) {
                return false;
            }
            bLiveMultiCallExtendUser.icon = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallExtendUser bLiveMultiCallExtendUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallExtendUser.f44403id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallExtendUser.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallExtendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallextenduser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44403id;

    public static BLiveMultiCallExtendUser new_() {
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser = new BLiveMultiCallExtendUser();
        bLiveMultiCallExtendUser.nullCheck();
        return bLiveMultiCallExtendUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallExtendUser mo223809clone() {
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser = new BLiveMultiCallExtendUser();
        bLiveMultiCallExtendUser.f44403id = this.f44403id;
        bLiveMultiCallExtendUser.icon = this.icon;
        return bLiveMultiCallExtendUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallExtendUser)) {
            return false;
        }
        BLiveMultiCallExtendUser bLiveMultiCallExtendUser = (BLiveMultiCallExtendUser) obj;
        return ValueObject.util_equals(this.f44403id, bLiveMultiCallExtendUser.f44403id) && ValueObject.util_equals(this.icon, bLiveMultiCallExtendUser.icon);
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
        String str = this.f44403id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44403id == null) {
            this.f44403id = "";
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
