package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationData verificationData) {
            int iH = CodedOutputByteBufferNano.h(1, verificationData.productId) + CodedOutputByteBufferNano.h(2, verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) verificationData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationData m19259parse(nb5 nb5Var) throws IOException {
            VerificationData verificationData = new VerificationData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    verificationData.productId = nb5Var.j();
                } else if (iU == 16) {
                    verificationData.status = nb5Var.j();
                } else if (iU == 26) {
                    verificationData.groupName = nb5Var.s();
                } else if (iU == 34) {
                    verificationData.uuid = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    verificationData.verificationStatus = nb5Var.s();
                }
            }
            return verificationData;
        }

        public void serialize(VerificationData verificationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, verificationData.productId);
            codedOutputByteBufferNano.G(2, verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<VerificationData> JSON_ADAPTER = new ObjectJsonAdapter<VerificationData>() { // from class: com.p1.mobile.putong.data.VerificationData.2
        public Class getDataClass() {
            return VerificationData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationData verificationData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("productId", verificationData.productId);
            jsonGenerator.writeNumberField("status", verificationData.status);
            String str = verificationData.groupName;
            if (str != null) {
                jsonGenerator.writeStringField("groupName", str);
            }
            String str2 = verificationData.uuid;
            if (str2 != null) {
                jsonGenerator.writeStringField(Device.UUID, str2);
            }
            String str3 = verificationData.verificationStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("verificationStatus", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationData new_() {
        VerificationData verificationData = new VerificationData();
        verificationData.nullCheck();
        return verificationData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationData m19258clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
