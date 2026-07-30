package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Certificate;
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
public class BLiveIdentity extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIdentity> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIdentity>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIdentity.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIdentity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIdentity newInstance() {
            return new BLiveIdentity();
        }

        public boolean parseField(BLiveIdentity bLiveIdentity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveIdentity.status = BLiveVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "name":
                    bLiveIdentity.name = jsonParser.getValueAsString();
                    return true;
                case "certificate":
                    bLiveIdentity.certificate = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIdentity bLiveIdentity, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIdentity.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (bLiveIdentity.certificate != null) {
                jsonGenerator.writeFieldName(Certificate.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveIdentity.certificate, jsonGenerator, true);
            }
            if (bLiveIdentity.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveVerificationStatus.JSON_ADAPTER.serialize(bLiveIdentity.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveidentity";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOwner certificate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVerificationStatus status;

    public static BLiveIdentity new_() {
        BLiveIdentity bLiveIdentity = new BLiveIdentity();
        bLiveIdentity.nullCheck();
        return bLiveIdentity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIdentity mo223809clone() {
        BLiveIdentity bLiveIdentity = new BLiveIdentity();
        bLiveIdentity.name = this.name;
        BLiveOwner bLiveOwner = this.certificate;
        if (bLiveOwner != null) {
            bLiveIdentity.certificate = bLiveOwner.mo223809clone();
        }
        bLiveIdentity.status = this.status;
        return bLiveIdentity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIdentity)) {
            return false;
        }
        BLiveIdentity bLiveIdentity = (BLiveIdentity) obj;
        return ValueObject.util_equals(this.name, bLiveIdentity.name) && ValueObject.util_equals(this.certificate, bLiveIdentity.certificate) && ValueObject.util_equals(this.status, bLiveIdentity.status);
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
        BLiveOwner bLiveOwner = this.certificate;
        int iHashCode2 = (iHashCode + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41;
        BLiveVerificationStatus bLiveVerificationStatus = this.status;
        int iHashCode3 = iHashCode2 + (bLiveVerificationStatus != null ? bLiveVerificationStatus.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.certificate == null) {
            this.certificate = BLiveOwner.new_();
        }
        if (this.status == null) {
            this.status = (BLiveVerificationStatus) BLiveVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
