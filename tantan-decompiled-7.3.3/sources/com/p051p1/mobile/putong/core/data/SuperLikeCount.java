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
public class SuperLikeCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "superlikecount";

    @ProtobufIndex(index = 2)
    public int receiveTotalCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SuperLikeCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuperLikeCount>() { // from class: com.p1.mobile.putong.core.data.SuperLikeCount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuperLikeCount superLikeCount) {
            String str = superLikeCount.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, superLikeCount.receiveTotalCount);
            superLikeCount.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuperLikeCount parse(nc5 nc5Var) throws IOException {
            SuperLikeCount superLikeCount = new SuperLikeCount();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (superLikeCount.userId != null) {
                        break;
                    }
                    superLikeCount.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    superLikeCount.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (superLikeCount.userId != null) {
                            break;
                        }
                        superLikeCount.userId = "";
                        return superLikeCount;
                    }
                    superLikeCount.receiveTotalCount = nc5Var.m162486j();
                }
            }
            return superLikeCount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuperLikeCount superLikeCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = superLikeCount.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, superLikeCount.receiveTotalCount);
        }
    };
    public static JsonAdapter<SuperLikeCount> JSON_ADAPTER = new ObjectJsonAdapter<SuperLikeCount>() { // from class: com.p1.mobile.putong.core.data.SuperLikeCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuperLikeCount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuperLikeCount newInstance() {
            return new SuperLikeCount();
        }

        public boolean parseField(SuperLikeCount superLikeCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                superLikeCount.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("receiveTotalCount")) {
                return false;
            }
            superLikeCount.receiveTotalCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SuperLikeCount superLikeCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("receiveTotalCount")) {
                return true;
            }
            return super.parseFieldCheck(superLikeCount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuperLikeCount superLikeCount, JsonGenerator jsonGenerator) throws IOException {
            String str = superLikeCount.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("receiveTotalCount", superLikeCount.receiveTotalCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuperLikeCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuperLikeCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuperLikeCount new_() {
        SuperLikeCount superLikeCount = new SuperLikeCount();
        superLikeCount.nullCheck();
        return superLikeCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuperLikeCount mo225055clone() {
        SuperLikeCount superLikeCount = new SuperLikeCount();
        superLikeCount.userId = this.userId;
        superLikeCount.receiveTotalCount = this.receiveTotalCount;
        return superLikeCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperLikeCount)) {
            return false;
        }
        SuperLikeCount superLikeCount = (SuperLikeCount) obj;
        return ValueObject.util_equals(this.userId, superLikeCount.userId) && this.receiveTotalCount == superLikeCount.receiveTotalCount;
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.receiveTotalCount;
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
