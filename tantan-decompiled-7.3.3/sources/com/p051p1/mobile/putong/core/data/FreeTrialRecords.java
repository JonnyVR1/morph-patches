package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class FreeTrialRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialrecords";

    @ProtobufIndex(index = 4)
    public long closedTime;

    @ProtobufIndex(index = 3)
    public long createdTime;

    @ProtobufIndex(index = 5)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public static ProtobufAdapter<FreeTrialRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialRecords>() { // from class: com.p1.mobile.putong.core.data.FreeTrialRecords.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialRecords freeTrialRecords) {
            String str = freeTrialRecords.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, freeTrialRecords.createdTime) + CodedOutputByteBufferNano.m17283j(4, freeTrialRecords.closedTime) + CodedOutputByteBufferNano.m17283j(5, freeTrialRecords.expiredTime);
            freeTrialRecords.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialRecords parse(nc5 nc5Var) throws IOException {
            FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (freeTrialRecords.name == null) {
                        freeTrialRecords.name = "";
                    }
                    if (freeTrialRecords.status != null) {
                        break;
                    }
                    freeTrialRecords.status = "";
                    break;
                }
                if (iM162497u == 10) {
                    freeTrialRecords.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    freeTrialRecords.status = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    freeTrialRecords.createdTime = nc5Var.m162487k();
                } else if (iM162497u == 32) {
                    freeTrialRecords.closedTime = nc5Var.m162487k();
                } else {
                    if (iM162497u != 40) {
                        if (freeTrialRecords.name == null) {
                            freeTrialRecords.name = "";
                        }
                        if (freeTrialRecords.status != null) {
                            break;
                        }
                        freeTrialRecords.status = "";
                        return freeTrialRecords;
                    }
                    freeTrialRecords.expiredTime = nc5Var.m162487k();
                }
            }
            return freeTrialRecords;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialRecords freeTrialRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialRecords.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17307I(3, freeTrialRecords.createdTime);
            codedOutputByteBufferNano.m17307I(4, freeTrialRecords.closedTime);
            codedOutputByteBufferNano.m17307I(5, freeTrialRecords.expiredTime);
        }
    };
    public static JsonAdapter<FreeTrialRecords> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialRecords>() { // from class: com.p1.mobile.putong.core.data.FreeTrialRecords.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialRecords.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialRecords newInstance() {
            return new FreeTrialRecords();
        }

        public boolean parseField(FreeTrialRecords freeTrialRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "closedTime":
                    freeTrialRecords.closedTime = jsonParser.getValueAsLong();
                    return true;
                case "status":
                    freeTrialRecords.status = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    freeTrialRecords.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "expiredTime":
                    freeTrialRecords.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "name":
                    freeTrialRecords.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeTrialRecords freeTrialRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "closedTime":
                case "status":
                case "createdTime":
                case "expiredTime":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(freeTrialRecords, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialRecords freeTrialRecords, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialRecords.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            jsonGenerator.writeNumberField("createdTime", freeTrialRecords.createdTime);
            jsonGenerator.writeNumberField("closedTime", freeTrialRecords.closedTime);
            jsonGenerator.writeNumberField("expiredTime", freeTrialRecords.expiredTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialRecords new_() {
        FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
        freeTrialRecords.nullCheck();
        return freeTrialRecords;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialRecords mo225055clone() {
        FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
        freeTrialRecords.name = this.name;
        freeTrialRecords.status = this.status;
        freeTrialRecords.createdTime = this.createdTime;
        freeTrialRecords.closedTime = this.closedTime;
        freeTrialRecords.expiredTime = this.expiredTime;
        return freeTrialRecords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialRecords)) {
            return false;
        }
        FreeTrialRecords freeTrialRecords = (FreeTrialRecords) obj;
        return ValueObject.util_equals(this.name, freeTrialRecords.name) && ValueObject.util_equals(this.status, freeTrialRecords.status) && this.createdTime == freeTrialRecords.createdTime && this.closedTime == freeTrialRecords.closedTime && this.expiredTime == freeTrialRecords.expiredTime;
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
        String str2 = this.status;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.createdTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.closedTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.expiredTime;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
