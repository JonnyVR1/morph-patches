package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PrivilegesChange extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegeschange";

    @NonNull
    @ProtobufIndex(index = 1)
    public SuperlikePrivilege superLike;
    public static ProtobufAdapter<PrivilegesChange> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegesChange>() { // from class: com.p1.mobile.putong.core.data.PrivilegesChange.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegesChange privilegesChange) {
            SuperlikePrivilege superlikePrivilege = privilegesChange.superLike;
            int iM17230l = superlikePrivilege != null ? CodedOutputByteBufferNano.m17230l(1, superlikePrivilege, SuperlikePrivilege.PROTOBUF_ADAPTER) : 0;
            privilegesChange.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegesChange parse(nb5 nb5Var) throws IOException {
            PrivilegesChange privilegesChange = new PrivilegesChange();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privilegesChange.superLike != null) {
                        break;
                    }
                    privilegesChange.superLike = SuperlikePrivilege.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (privilegesChange.superLike != null) {
                        break;
                    }
                    privilegesChange.superLike = SuperlikePrivilege.new_();
                    return privilegesChange;
                }
                privilegesChange.superLike = (SuperlikePrivilege) nb5Var.m158743l(SuperlikePrivilege.PROTOBUF_ADAPTER);
            }
            return privilegesChange;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegesChange privilegesChange, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SuperlikePrivilege superlikePrivilege = privilegesChange.superLike;
            if (superlikePrivilege != null) {
                codedOutputByteBufferNano.m17254K(1, superlikePrivilege, SuperlikePrivilege.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PrivilegesChange> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegesChange>() { // from class: com.p1.mobile.putong.core.data.PrivilegesChange.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegesChange.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegesChange newInstance() {
            return new PrivilegesChange();
        }

        public boolean parseField(PrivilegesChange privilegesChange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("superLike")) {
                return false;
            }
            privilegesChange.superLike = SuperlikePrivilege.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PrivilegesChange privilegesChange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("superLike")) {
                return true;
            }
            return super.parseFieldCheck(privilegesChange, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegesChange privilegesChange, JsonGenerator jsonGenerator) throws IOException {
            if (privilegesChange.superLike != null) {
                jsonGenerator.writeFieldName("superLike");
                SuperlikePrivilege.JSON_ADAPTER.serialize(privilegesChange.superLike, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegesChange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegesChange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegesChange new_() {
        PrivilegesChange privilegesChange = new PrivilegesChange();
        privilegesChange.nullCheck();
        return privilegesChange;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegesChange mo223809clone() {
        PrivilegesChange privilegesChange = new PrivilegesChange();
        SuperlikePrivilege superlikePrivilege = this.superLike;
        if (superlikePrivilege != null) {
            privilegesChange.superLike = superlikePrivilege.mo223809clone();
        }
        return privilegesChange;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivilegesChange) {
            return ValueObject.util_equals(this.superLike, ((PrivilegesChange) obj).superLike);
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
        SuperlikePrivilege superlikePrivilege = this.superLike;
        int iHashCode = i2 + (superlikePrivilege != null ? superlikePrivilege.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.superLike == null) {
            this.superLike = SuperlikePrivilege.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
