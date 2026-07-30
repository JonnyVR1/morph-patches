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
public class SimpleLatestVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "simplelatestvisitor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String avatar;
    public static ProtobufAdapter<SimpleLatestVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimpleLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.SimpleLatestVisitor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimpleLatestVisitor simpleLatestVisitor) {
            String str = simpleLatestVisitor.avatar;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            simpleLatestVisitor.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimpleLatestVisitor parse(nc5 nc5Var) throws IOException {
            SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (simpleLatestVisitor.avatar != null) {
                        break;
                    }
                    simpleLatestVisitor.avatar = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (simpleLatestVisitor.avatar != null) {
                        break;
                    }
                    simpleLatestVisitor.avatar = "";
                    return simpleLatestVisitor;
                }
                simpleLatestVisitor.avatar = nc5Var.m162495s();
            }
            return simpleLatestVisitor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimpleLatestVisitor simpleLatestVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = simpleLatestVisitor.avatar;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<SimpleLatestVisitor> JSON_ADAPTER = new ObjectJsonAdapter<SimpleLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.SimpleLatestVisitor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimpleLatestVisitor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimpleLatestVisitor newInstance() {
            return new SimpleLatestVisitor();
        }

        public boolean parseField(SimpleLatestVisitor simpleLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("avatar")) {
                return false;
            }
            simpleLatestVisitor.avatar = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SimpleLatestVisitor simpleLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatar")) {
                return true;
            }
            return super.parseFieldCheck(simpleLatestVisitor, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimpleLatestVisitor simpleLatestVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = simpleLatestVisitor.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimpleLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimpleLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimpleLatestVisitor new_() {
        SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
        simpleLatestVisitor.nullCheck();
        return simpleLatestVisitor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimpleLatestVisitor mo225055clone() {
        SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
        simpleLatestVisitor.avatar = this.avatar;
        return simpleLatestVisitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimpleLatestVisitor) {
            return ValueObject.util_equals(this.avatar, ((SimpleLatestVisitor) obj).avatar);
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
        String str = this.avatar;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
