package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class SuperlikePrivilege extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "superlikeprivilege";

    @NonNull
    @ProtobufIndex(index = 1)
    public String changeType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String changeVal;
    public static ProtobufAdapter<SuperlikePrivilege> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuperlikePrivilege>() { // from class: com.p1.mobile.putong.core.data.SuperlikePrivilege.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuperlikePrivilege superlikePrivilege) {
            String str = superlikePrivilege.changeType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = superlikePrivilege.changeVal;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            superlikePrivilege.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuperlikePrivilege parse(nc5 nc5Var) throws IOException {
            SuperlikePrivilege superlikePrivilege = new SuperlikePrivilege();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (superlikePrivilege.changeType == null) {
                        superlikePrivilege.changeType = "";
                    }
                    if (superlikePrivilege.changeVal != null) {
                        break;
                    }
                    superlikePrivilege.changeVal = "";
                    break;
                }
                if (iM162497u == 10) {
                    superlikePrivilege.changeType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (superlikePrivilege.changeType == null) {
                            superlikePrivilege.changeType = "";
                        }
                        if (superlikePrivilege.changeVal != null) {
                            break;
                        }
                        superlikePrivilege.changeVal = "";
                        return superlikePrivilege;
                    }
                    superlikePrivilege.changeVal = nc5Var.m162495s();
                }
            }
            return superlikePrivilege;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuperlikePrivilege superlikePrivilege, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = superlikePrivilege.changeType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = superlikePrivilege.changeVal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<SuperlikePrivilege> JSON_ADAPTER = new ObjectJsonAdapter<SuperlikePrivilege>() { // from class: com.p1.mobile.putong.core.data.SuperlikePrivilege.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuperlikePrivilege.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuperlikePrivilege newInstance() {
            return new SuperlikePrivilege();
        }

        public boolean parseField(SuperlikePrivilege superlikePrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("changeType")) {
                superlikePrivilege.changeType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("changeVal")) {
                return false;
            }
            superlikePrivilege.changeVal = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SuperlikePrivilege superlikePrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("changeType") || str.equals("changeVal")) {
                return true;
            }
            return super.parseFieldCheck(superlikePrivilege, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuperlikePrivilege superlikePrivilege, JsonGenerator jsonGenerator) throws IOException {
            String str = superlikePrivilege.changeType;
            if (str != null) {
                jsonGenerator.writeStringField("changeType", str);
            }
            String str2 = superlikePrivilege.changeVal;
            if (str2 != null) {
                jsonGenerator.writeStringField("changeVal", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuperlikePrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuperlikePrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuperlikePrivilege new_() {
        SuperlikePrivilege superlikePrivilege = new SuperlikePrivilege();
        superlikePrivilege.nullCheck();
        return superlikePrivilege;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuperlikePrivilege mo225055clone() {
        SuperlikePrivilege superlikePrivilege = new SuperlikePrivilege();
        superlikePrivilege.changeType = this.changeType;
        superlikePrivilege.changeVal = this.changeVal;
        return superlikePrivilege;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperlikePrivilege)) {
            return false;
        }
        SuperlikePrivilege superlikePrivilege = (SuperlikePrivilege) obj;
        return ValueObject.util_equals(this.changeType, superlikePrivilege.changeType) && ValueObject.util_equals(this.changeVal, superlikePrivilege.changeVal);
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
