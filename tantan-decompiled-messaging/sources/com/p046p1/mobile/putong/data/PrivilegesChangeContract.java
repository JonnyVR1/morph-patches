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
public class PrivilegesChangeContract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegeschangecontract";

    @NonNull
    @ProtobufIndex(index = 1)
    public SuperlikePrivilegeContract superLike;
    public static ProtobufAdapter<PrivilegesChangeContract> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegesChangeContract>() { // from class: com.p1.mobile.putong.data.PrivilegesChangeContract.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegesChangeContract privilegesChangeContract) {
            SuperlikePrivilegeContract superlikePrivilegeContract = privilegesChangeContract.superLike;
            int iM17230l = superlikePrivilegeContract != null ? CodedOutputByteBufferNano.m17230l(1, superlikePrivilegeContract, SuperlikePrivilegeContract.PROTOBUF_ADAPTER) : 0;
            privilegesChangeContract.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegesChangeContract parse(nb5 nb5Var) throws IOException {
            PrivilegesChangeContract privilegesChangeContract = new PrivilegesChangeContract();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privilegesChangeContract.superLike != null) {
                        break;
                    }
                    privilegesChangeContract.superLike = SuperlikePrivilegeContract.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (privilegesChangeContract.superLike != null) {
                        break;
                    }
                    privilegesChangeContract.superLike = SuperlikePrivilegeContract.new_();
                    return privilegesChangeContract;
                }
                privilegesChangeContract.superLike = (SuperlikePrivilegeContract) nb5Var.m158743l(SuperlikePrivilegeContract.PROTOBUF_ADAPTER);
            }
            return privilegesChangeContract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegesChangeContract privilegesChangeContract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SuperlikePrivilegeContract superlikePrivilegeContract = privilegesChangeContract.superLike;
            if (superlikePrivilegeContract != null) {
                codedOutputByteBufferNano.m17254K(1, superlikePrivilegeContract, SuperlikePrivilegeContract.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PrivilegesChangeContract> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegesChangeContract>() { // from class: com.p1.mobile.putong.data.PrivilegesChangeContract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegesChangeContract.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegesChangeContract newInstance() {
            return new PrivilegesChangeContract();
        }

        public boolean parseField(PrivilegesChangeContract privilegesChangeContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("superLike")) {
                return false;
            }
            privilegesChangeContract.superLike = SuperlikePrivilegeContract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PrivilegesChangeContract privilegesChangeContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("superLike")) {
                return true;
            }
            return super.parseFieldCheck(privilegesChangeContract, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegesChangeContract privilegesChangeContract, JsonGenerator jsonGenerator) throws IOException {
            if (privilegesChangeContract.superLike != null) {
                jsonGenerator.writeFieldName("superLike");
                SuperlikePrivilegeContract.JSON_ADAPTER.serialize(privilegesChangeContract.superLike, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegesChangeContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegesChangeContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegesChangeContract new_() {
        PrivilegesChangeContract privilegesChangeContract = new PrivilegesChangeContract();
        privilegesChangeContract.nullCheck();
        return privilegesChangeContract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegesChangeContract mo223809clone() {
        PrivilegesChangeContract privilegesChangeContract = new PrivilegesChangeContract();
        SuperlikePrivilegeContract superlikePrivilegeContract = this.superLike;
        if (superlikePrivilegeContract != null) {
            privilegesChangeContract.superLike = superlikePrivilegeContract.mo223809clone();
        }
        return privilegesChangeContract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivilegesChangeContract) {
            return ValueObject.util_equals(this.superLike, ((PrivilegesChangeContract) obj).superLike);
        }
        return false;
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
        SuperlikePrivilegeContract superlikePrivilegeContract = this.superLike;
        int iHashCode = i2 + (superlikePrivilegeContract != null ? superlikePrivilegeContract.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.superLike == null) {
            this.superLike = SuperlikePrivilegeContract.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
