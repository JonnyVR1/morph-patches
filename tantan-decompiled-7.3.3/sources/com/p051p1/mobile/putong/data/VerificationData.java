package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String groupName;

    @ProtobufIndex(index = 1)
    public int productId;

    @ProtobufIndex(index = 2)
    public int status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String uuid;

    @NonNull
    @ProtobufIndex(index = 5)
    public String verificationStatus;
    public static ProtobufAdapter<VerificationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationData>() { // from class: com.p1.mobile.putong.data.VerificationData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationData verificationData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, verificationData.productId) + CodedOutputByteBufferNano.m17281h(2, verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            verificationData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationData parse(nc5 nc5Var) throws IOException {
            VerificationData verificationData = new VerificationData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verificationData.groupName == null) {
                        verificationData.groupName = "";
                    }
                    if (verificationData.uuid == null) {
                        verificationData.uuid = "";
                    }
                    if (verificationData.verificationStatus != null) {
                        break;
                    }
                    verificationData.verificationStatus = "";
                    break;
                }
                if (iM162497u == 8) {
                    verificationData.productId = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    verificationData.status = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    verificationData.groupName = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    verificationData.uuid = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (verificationData.groupName == null) {
                            verificationData.groupName = "";
                        }
                        if (verificationData.uuid == null) {
                            verificationData.uuid = "";
                        }
                        if (verificationData.verificationStatus != null) {
                            break;
                        }
                        verificationData.verificationStatus = "";
                        return verificationData;
                    }
                    verificationData.verificationStatus = nc5Var.m162495s();
                }
            }
            return verificationData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationData verificationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, verificationData.productId);
            codedOutputByteBufferNano.m17305G(2, verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<VerificationData> JSON_ADAPTER = new ObjectJsonAdapter<VerificationData>() { // from class: com.p1.mobile.putong.data.VerificationData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationData newInstance() {
            return new VerificationData();
        }

        public boolean parseField(VerificationData verificationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "groupName":
                    verificationData.groupName = jsonParser.getValueAsString();
                    return true;
                case "productId":
                    verificationData.productId = jsonParser.getValueAsInt();
                    return true;
                case "status":
                    verificationData.status = jsonParser.getValueAsInt();
                    return true;
                case "verificationStatus":
                    verificationData.verificationStatus = jsonParser.getValueAsString();
                    return true;
                case "uuid":
                    verificationData.uuid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerificationData verificationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "groupName":
                case "productId":
                case "status":
                case "verificationStatus":
                case "uuid":
                    return true;
                default:
                    return super.parseFieldCheck(verificationData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationData verificationData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("productId", verificationData.productId);
            jsonGenerator.writeNumberField(NotificationCompat.CATEGORY_STATUS, verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                jsonGenerator.writeStringField("groupName", str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                jsonGenerator.writeStringField("uuid", str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("verificationStatus", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationData new_() {
        VerificationData verificationData = new VerificationData();
        verificationData.nullCheck();
        return verificationData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationData mo225055clone() {
        VerificationData verificationData = new VerificationData();
        verificationData.productId = this.productId;
        verificationData.status = this.status;
        verificationData.groupName = this.groupName;
        verificationData.uuid = this.uuid;
        verificationData.verificationStatus = this.verificationStatus;
        return verificationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationData)) {
            return false;
        }
        VerificationData verificationData = (VerificationData) obj;
        return this.productId == verificationData.productId && this.status == verificationData.status && ValueObject.util_equals(this.groupName, verificationData.groupName) && ValueObject.util_equals(this.uuid, verificationData.uuid) && ValueObject.util_equals(this.verificationStatus, verificationData.verificationStatus);
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
        int i2 = ((((i * 41) + this.productId) * 41) + this.status) * 41;
        String str = this.groupName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.uuid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.verificationStatus;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupName == null) {
            this.groupName = "";
        }
        if (this.uuid == null) {
            this.uuid = "";
        }
        if (this.verificationStatus == null) {
            this.verificationStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
