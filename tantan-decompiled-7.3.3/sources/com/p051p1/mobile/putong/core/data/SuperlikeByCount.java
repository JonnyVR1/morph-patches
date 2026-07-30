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
public class SuperlikeByCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "superlikebycount";

    @ProtobufIndex(index = 2)
    public int count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21252id;
    public static ProtobufAdapter<SuperlikeByCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuperlikeByCount>() { // from class: com.p1.mobile.putong.core.data.SuperlikeByCount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuperlikeByCount superlikeByCount) {
            String str = superlikeByCount.f21252id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, superlikeByCount.count);
            superlikeByCount.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuperlikeByCount parse(nc5 nc5Var) throws IOException {
            SuperlikeByCount superlikeByCount = new SuperlikeByCount();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (superlikeByCount.f21252id != null) {
                        break;
                    }
                    superlikeByCount.f21252id = "";
                    break;
                }
                if (iM162497u == 10) {
                    superlikeByCount.f21252id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (superlikeByCount.f21252id != null) {
                            break;
                        }
                        superlikeByCount.f21252id = "";
                        return superlikeByCount;
                    }
                    superlikeByCount.count = nc5Var.m162486j();
                }
            }
            return superlikeByCount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuperlikeByCount superlikeByCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = superlikeByCount.f21252id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, superlikeByCount.count);
        }
    };
    public static JsonAdapter<SuperlikeByCount> JSON_ADAPTER = new ObjectJsonAdapter<SuperlikeByCount>() { // from class: com.p1.mobile.putong.core.data.SuperlikeByCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuperlikeByCount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuperlikeByCount newInstance() {
            return new SuperlikeByCount();
        }

        public boolean parseField(SuperlikeByCount superlikeByCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                superlikeByCount.f21252id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("count")) {
                return false;
            }
            superlikeByCount.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SuperlikeByCount superlikeByCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(superlikeByCount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuperlikeByCount superlikeByCount, JsonGenerator jsonGenerator) throws IOException {
            String str = superlikeByCount.f21252id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", superlikeByCount.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuperlikeByCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuperlikeByCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuperlikeByCount new_() {
        SuperlikeByCount superlikeByCount = new SuperlikeByCount();
        superlikeByCount.nullCheck();
        return superlikeByCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuperlikeByCount mo225055clone() {
        SuperlikeByCount superlikeByCount = new SuperlikeByCount();
        superlikeByCount.f21252id = this.f21252id;
        superlikeByCount.count = this.count;
        return superlikeByCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperlikeByCount)) {
            return false;
        }
        SuperlikeByCount superlikeByCount = (SuperlikeByCount) obj;
        return ValueObject.util_equals(this.f21252id, superlikeByCount.f21252id) && this.count == superlikeByCount.count;
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
        String str = this.f21252id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21252id == null) {
            this.f21252id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
