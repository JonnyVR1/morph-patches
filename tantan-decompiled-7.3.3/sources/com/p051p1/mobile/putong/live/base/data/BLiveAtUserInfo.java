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
public class BLiveAtUserInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAtUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAtUserInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAtUserInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAtUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAtUserInfo newInstance() {
            return new BLiveAtUserInfo();
        }

        public boolean parseField(BLiveAtUserInfo bLiveAtUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                bLiveAtUserInfo.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userName")) {
                return false;
            }
            bLiveAtUserInfo.userName = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAtUserInfo bLiveAtUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAtUserInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveAtUserInfo.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAtUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveatuserinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveAtUserInfo new_() {
        BLiveAtUserInfo bLiveAtUserInfo = new BLiveAtUserInfo();
        bLiveAtUserInfo.nullCheck();
        return bLiveAtUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAtUserInfo mo225055clone() {
        BLiveAtUserInfo bLiveAtUserInfo = new BLiveAtUserInfo();
        bLiveAtUserInfo.userId = this.userId;
        bLiveAtUserInfo.userName = this.userName;
        return bLiveAtUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAtUserInfo)) {
            return false;
        }
        BLiveAtUserInfo bLiveAtUserInfo = (BLiveAtUserInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveAtUserInfo.userId) && ValueObject.util_equals(this.userName, bLiveAtUserInfo.userName);
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
        String str2 = this.userName;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
