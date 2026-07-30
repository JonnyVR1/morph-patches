package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class SuperlikePrivilegeContract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "superlikeprivilegecontract";

    @NonNull
    @ProtobufIndex(index = 1)
    public String changeType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String changeVal;
    public static ProtobufAdapter<SuperlikePrivilegeContract> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuperlikePrivilegeContract>() { // from class: com.p1.mobile.putong.data.SuperlikePrivilegeContract.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuperlikePrivilegeContract superlikePrivilegeContract) {
            String str = superlikePrivilegeContract.changeType;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = superlikePrivilegeContract.changeVal;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            superlikePrivilegeContract.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuperlikePrivilegeContract parse(nb5 nb5Var) throws IOException {
            SuperlikePrivilegeContract superlikePrivilegeContract = new SuperlikePrivilegeContract();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (superlikePrivilegeContract.changeType == null) {
                        superlikePrivilegeContract.changeType = "";
                    }
                    if (superlikePrivilegeContract.changeVal != null) {
                        break;
                    }
                    superlikePrivilegeContract.changeVal = "";
                    break;
                }
                if (iM158752u == 10) {
                    superlikePrivilegeContract.changeType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (superlikePrivilegeContract.changeType == null) {
                            superlikePrivilegeContract.changeType = "";
                        }
                        if (superlikePrivilegeContract.changeVal != null) {
                            break;
                        }
                        superlikePrivilegeContract.changeVal = "";
                        return superlikePrivilegeContract;
                    }
                    superlikePrivilegeContract.changeVal = nb5Var.m158750s();
                }
            }
            return superlikePrivilegeContract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuperlikePrivilegeContract superlikePrivilegeContract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = superlikePrivilegeContract.changeType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = superlikePrivilegeContract.changeVal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<SuperlikePrivilegeContract> JSON_ADAPTER = new ObjectJsonAdapter<SuperlikePrivilegeContract>() { // from class: com.p1.mobile.putong.data.SuperlikePrivilegeContract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuperlikePrivilegeContract.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuperlikePrivilegeContract newInstance() {
            return new SuperlikePrivilegeContract();
        }

        public boolean parseField(SuperlikePrivilegeContract superlikePrivilegeContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("changeType")) {
                superlikePrivilegeContract.changeType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("changeVal")) {
                return false;
            }
            superlikePrivilegeContract.changeVal = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SuperlikePrivilegeContract superlikePrivilegeContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("changeType") || str.equals("changeVal")) {
                return true;
            }
            return super.parseFieldCheck(superlikePrivilegeContract, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuperlikePrivilegeContract superlikePrivilegeContract, JsonGenerator jsonGenerator) throws IOException {
            String str = superlikePrivilegeContract.changeType;
            if (str != null) {
                jsonGenerator.writeStringField("changeType", str);
            }
            String str2 = superlikePrivilegeContract.changeVal;
            if (str2 != null) {
                jsonGenerator.writeStringField("changeVal", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuperlikePrivilegeContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuperlikePrivilegeContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuperlikePrivilegeContract new_() {
        SuperlikePrivilegeContract superlikePrivilegeContract = new SuperlikePrivilegeContract();
        superlikePrivilegeContract.nullCheck();
        return superlikePrivilegeContract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuperlikePrivilegeContract mo223809clone() {
        SuperlikePrivilegeContract superlikePrivilegeContract = new SuperlikePrivilegeContract();
        superlikePrivilegeContract.changeType = this.changeType;
        superlikePrivilegeContract.changeVal = this.changeVal;
        return superlikePrivilegeContract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperlikePrivilegeContract)) {
            return false;
        }
        SuperlikePrivilegeContract superlikePrivilegeContract = (SuperlikePrivilegeContract) obj;
        return ValueObject.util_equals(this.changeType, superlikePrivilegeContract.changeType) && ValueObject.util_equals(this.changeVal, superlikePrivilegeContract.changeVal);
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
        String str = this.changeType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.changeVal;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.changeType == null) {
            this.changeType = "";
        }
        if (this.changeVal == null) {
            this.changeVal = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
