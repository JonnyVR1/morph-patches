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
public class UserId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userid";

    @NonNull
    @ProtobufIndex(index = 1)
    public String UserId;
    public static ProtobufAdapter<UserId> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserId>() { // from class: com.p1.mobile.putong.core.data.UserId.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserId userId) {
            String str = userId.UserId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            userId.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserId parse(nc5 nc5Var) throws IOException {
            UserId userId = new UserId();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userId.UserId != null) {
                        break;
                    }
                    userId.UserId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (userId.UserId != null) {
                        break;
                    }
                    userId.UserId = "";
                    return userId;
                }
                userId.UserId = nc5Var.m162495s();
            }
            return userId;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserId userId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userId.UserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<UserId> JSON_ADAPTER = new ObjectJsonAdapter<UserId>() { // from class: com.p1.mobile.putong.core.data.UserId.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserId.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserId newInstance() {
            return new UserId();
        }

        public boolean parseField(UserId userId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("UserId")) {
                return false;
            }
            userId.UserId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserId userId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("UserId")) {
                return true;
            }
            return super.parseFieldCheck(userId, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserId userId, JsonGenerator jsonGenerator) throws IOException {
            String str = userId.UserId;
            if (str != null) {
                jsonGenerator.writeStringField("UserId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserId new_() {
        UserId userId = new UserId();
        userId.nullCheck();
        return userId;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserId mo225055clone() {
        UserId userId = new UserId();
        userId.UserId = this.UserId;
        return userId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserId) {
            return ValueObject.util_equals(this.UserId, ((UserId) obj).UserId);
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
        String str = this.UserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.UserId == null) {
            this.UserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
