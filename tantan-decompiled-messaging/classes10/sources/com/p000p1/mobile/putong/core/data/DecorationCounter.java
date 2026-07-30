package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DecorationCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationcounter";

    @ProtobufIndex(index = 1)
    public int coinRemaining;
    public static ProtobufAdapter<DecorationCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationCounter>() { // from class: com.p1.mobile.putong.core.data.DecorationCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DecorationCounter decorationCounter) {
            int iH = CodedOutputByteBufferNano.h(1, decorationCounter.coinRemaining);
            ((MessageNano) decorationCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DecorationCounter m12595parse(nb5 nb5Var) throws IOException {
            DecorationCounter decorationCounter = new DecorationCounter();
            while (nb5Var.u() == 8) {
                decorationCounter.coinRemaining = nb5Var.j();
            }
            return decorationCounter;
        }

        public void serialize(DecorationCounter decorationCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, decorationCounter.coinRemaining);
        }
    };
    public static JsonAdapter<DecorationCounter> JSON_ADAPTER = new ObjectJsonAdapter<DecorationCounter>() { // from class: com.p1.mobile.putong.core.data.DecorationCounter.2
        public Class getDataClass() {
            return DecorationCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DecorationCounter m12596newInstance() {
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

        public void serializeFields(DecorationCounter decorationCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("coinRemaining", decorationCounter.coinRemaining);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationCounter new_() {
        DecorationCounter decorationCounter = new DecorationCounter();
        decorationCounter.nullCheck();
        return decorationCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DecorationCounter m12594clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.coinRemaining;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
