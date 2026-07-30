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
public class DecorationCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationcounter";

    @ProtobufIndex(index = 1)
    public int coinRemaining;
    public static ProtobufAdapter<DecorationCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationCounter>() { // from class: com.p1.mobile.putong.core.data.DecorationCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DecorationCounter decorationCounter) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, decorationCounter.coinRemaining);
            decorationCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DecorationCounter parse(nc5 nc5Var) throws IOException {
            DecorationCounter decorationCounter = new DecorationCounter();
            while (nc5Var.m162497u() == 8) {
                decorationCounter.coinRemaining = nc5Var.m162486j();
            }
            return decorationCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DecorationCounter decorationCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, decorationCounter.coinRemaining);
        }
    };
    public static JsonAdapter<DecorationCounter> JSON_ADAPTER = new ObjectJsonAdapter<DecorationCounter>() { // from class: com.p1.mobile.putong.core.data.DecorationCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DecorationCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DecorationCounter newInstance() {
            return new DecorationCounter();
        }

        public boolean parseField(DecorationCounter decorationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("coinRemaining")) {
                return false;
            }
            decorationCounter.coinRemaining = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(DecorationCounter decorationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("coinRemaining")) {
                return true;
            }
            return super.parseFieldCheck(decorationCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DecorationCounter decorationCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("coinRemaining", decorationCounter.coinRemaining);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationCounter new_() {
        DecorationCounter decorationCounter = new DecorationCounter();
        decorationCounter.nullCheck();
        return decorationCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DecorationCounter mo225055clone() {
        DecorationCounter decorationCounter = new DecorationCounter();
        decorationCounter.coinRemaining = this.coinRemaining;
        return decorationCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DecorationCounter) && this.coinRemaining == ((DecorationCounter) obj).coinRemaining;
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
        int i2 = (i * 41) + this.coinRemaining;
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
