package com.p051p1.mobile.putong.core.data;

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
public class LowPayOneside extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowpayoneside";

    @ProtobufIndex(index = 1)
    public boolean isActor;

    @ProtobufIndex(index = 2)
    public boolean reddot;
    public static ProtobufAdapter<LowPayOneside> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowPayOneside>() { // from class: com.p1.mobile.putong.core.data.LowPayOneside.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LowPayOneside lowPayOneside) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, lowPayOneside.isActor) + CodedOutputByteBufferNano.m17275b(2, lowPayOneside.reddot);
            lowPayOneside.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LowPayOneside parse(nc5 nc5Var) throws IOException {
            LowPayOneside lowPayOneside = new LowPayOneside();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    lowPayOneside.isActor = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return lowPayOneside;
                    }
                    lowPayOneside.reddot = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LowPayOneside lowPayOneside, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, lowPayOneside.isActor);
            codedOutputByteBufferNano.m17299A(2, lowPayOneside.reddot);
        }
    };
    public static JsonAdapter<LowPayOneside> JSON_ADAPTER = new ObjectJsonAdapter<LowPayOneside>() { // from class: com.p1.mobile.putong.core.data.LowPayOneside.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LowPayOneside.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LowPayOneside newInstance() {
            return new LowPayOneside();
        }

        public boolean parseField(LowPayOneside lowPayOneside, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("reddot")) {
                lowPayOneside.reddot = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isActor")) {
                return false;
            }
            lowPayOneside.isActor = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(LowPayOneside lowPayOneside, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("reddot") || str.equals("isActor")) {
                return true;
            }
            return super.parseFieldCheck(lowPayOneside, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LowPayOneside lowPayOneside, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActor", lowPayOneside.isActor);
            jsonGenerator.writeBooleanField("reddot", lowPayOneside.reddot);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowPayOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowPayOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowPayOneside new_() {
        LowPayOneside lowPayOneside = new LowPayOneside();
        lowPayOneside.nullCheck();
        return lowPayOneside;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LowPayOneside mo225055clone() {
        LowPayOneside lowPayOneside = new LowPayOneside();
        lowPayOneside.isActor = this.isActor;
        lowPayOneside.reddot = this.reddot;
        return lowPayOneside;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LowPayOneside)) {
            return false;
        }
        LowPayOneside lowPayOneside = (LowPayOneside) obj;
        return this.isActor == lowPayOneside.isActor && this.reddot == lowPayOneside.reddot;
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
        int i2 = (((i * 41) + (this.isActor ? 1231 : 1237)) * 41) + (this.reddot ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
