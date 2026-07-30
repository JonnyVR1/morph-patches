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
public class SpecialSuggestUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialsuggestusers";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SpecialSuggestUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialSuggestUsers>() { // from class: com.p1.mobile.putong.core.data.SpecialSuggestUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpecialSuggestUsers specialSuggestUsers) {
            String str = specialSuggestUsers.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            specialSuggestUsers.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpecialSuggestUsers parse(nc5 nc5Var) throws IOException {
            SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (specialSuggestUsers.userId != null) {
                        break;
                    }
                    specialSuggestUsers.userId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (specialSuggestUsers.userId != null) {
                        break;
                    }
                    specialSuggestUsers.userId = "";
                    return specialSuggestUsers;
                }
                specialSuggestUsers.userId = nc5Var.m162495s();
            }
            return specialSuggestUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpecialSuggestUsers specialSuggestUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialSuggestUsers.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<SpecialSuggestUsers> JSON_ADAPTER = new ObjectJsonAdapter<SpecialSuggestUsers>() { // from class: com.p1.mobile.putong.core.data.SpecialSuggestUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpecialSuggestUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpecialSuggestUsers newInstance() {
            return new SpecialSuggestUsers();
        }

        public boolean parseField(SpecialSuggestUsers specialSuggestUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userId")) {
                return false;
            }
            specialSuggestUsers.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SpecialSuggestUsers specialSuggestUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(specialSuggestUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpecialSuggestUsers specialSuggestUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = specialSuggestUsers.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialSuggestUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialSuggestUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialSuggestUsers new_() {
        SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
        specialSuggestUsers.nullCheck();
        return specialSuggestUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpecialSuggestUsers mo225055clone() {
        SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
        specialSuggestUsers.userId = this.userId;
        return specialSuggestUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpecialSuggestUsers) {
            return ValueObject.util_equals(this.userId, ((SpecialSuggestUsers) obj).userId);
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
