package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveSetPrivacyPrivilege extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSetPrivacyPrivilege> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSetPrivacyPrivilege>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSetPrivacyPrivilege.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSetPrivacyPrivilege.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSetPrivacyPrivilege newInstance() {
            return new BLiveSetPrivacyPrivilege();
        }

        public boolean parseField(BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                bLiveSetPrivacyPrivilege.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            bLiveSetPrivacyPrivilege.type = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSetPrivacyPrivilege.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
            String str2 = bLiveSetPrivacyPrivilege.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSetPrivacyPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesetprivacyprivilege";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveSetPrivacyPrivilege new_() {
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.nullCheck();
        return bLiveSetPrivacyPrivilege;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSetPrivacyPrivilege mo223809clone() {
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = this.status;
        bLiveSetPrivacyPrivilege.type = this.type;
        return bLiveSetPrivacyPrivilege;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSetPrivacyPrivilege)) {
            return false;
        }
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = (BLiveSetPrivacyPrivilege) obj;
        return ValueObject.util_equals(this.status, bLiveSetPrivacyPrivilege.status) && ValueObject.util_equals(this.type, bLiveSetPrivacyPrivilege.type);
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
