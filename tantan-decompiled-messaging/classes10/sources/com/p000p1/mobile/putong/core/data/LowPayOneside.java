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
public class LowPayOneside extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowpayoneside";

    @ProtobufIndex(index = 1)
    public boolean isActor;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean reddot;
    public static ProtobufAdapter<LowPayOneside> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowPayOneside>() { // from class: com.p1.mobile.putong.core.data.LowPayOneside.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LowPayOneside lowPayOneside) {
            int iB = CodedOutputByteBufferNano.b(1, lowPayOneside.isActor) + CodedOutputByteBufferNano.b(2, lowPayOneside.reddot);
            ((MessageNano) lowPayOneside).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LowPayOneside m14025parse(nb5 nb5Var) throws IOException {
            LowPayOneside lowPayOneside = new LowPayOneside();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    lowPayOneside.isActor = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return lowPayOneside;
                    }
                    lowPayOneside.reddot = nb5Var.g();
                }
            }
        }

        public void serialize(LowPayOneside lowPayOneside, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, lowPayOneside.isActor);
            codedOutputByteBufferNano.A(2, lowPayOneside.reddot);
        }
    };
    public static JsonAdapter<LowPayOneside> JSON_ADAPTER = new ObjectJsonAdapter<LowPayOneside>() { // from class: com.p1.mobile.putong.core.data.LowPayOneside.2
        public Class getDataClass() {
            return LowPayOneside.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LowPayOneside m14026newInstance() {
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

        public void serializeFields(LowPayOneside lowPayOneside, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActor", lowPayOneside.isActor);
            jsonGenerator.writeBooleanField("reddot", lowPayOneside.reddot);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowPayOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowPayOneside) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowPayOneside new_() {
        LowPayOneside lowPayOneside = new LowPayOneside();
        lowPayOneside.nullCheck();
        return lowPayOneside;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LowPayOneside m14024clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isActor ? 1231 : 1237)) * 41) + (this.reddot ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
