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
public class IntlTribeBubble extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltribebubble";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int seeCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int seeTribeCount;

    @ProtobufIndex(index = 1)
    public int tribeCount;
    public static ProtobufAdapter<IntlTribeBubble> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTribeBubble>() { // from class: com.p1.mobile.putong.core.data.IntlTribeBubble.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlTribeBubble intlTribeBubble) {
            int iH = CodedOutputByteBufferNano.h(1, intlTribeBubble.tribeCount) + CodedOutputByteBufferNano.h(2, intlTribeBubble.seeCount) + CodedOutputByteBufferNano.h(3, intlTribeBubble.seeTribeCount);
            ((MessageNano) intlTribeBubble).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlTribeBubble m13719parse(nb5 nb5Var) throws IOException {
            IntlTribeBubble intlTribeBubble = new IntlTribeBubble();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    intlTribeBubble.tribeCount = nb5Var.j();
                } else if (iU == 16) {
                    intlTribeBubble.seeCount = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return intlTribeBubble;
                    }
                    intlTribeBubble.seeTribeCount = nb5Var.j();
                }
            }
        }

        public void serialize(IntlTribeBubble intlTribeBubble, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlTribeBubble.tribeCount);
            codedOutputByteBufferNano.G(2, intlTribeBubble.seeCount);
            codedOutputByteBufferNano.G(3, intlTribeBubble.seeTribeCount);
        }
    };
    public static JsonAdapter<IntlTribeBubble> JSON_ADAPTER = new ObjectJsonAdapter<IntlTribeBubble>() { // from class: com.p1.mobile.putong.core.data.IntlTribeBubble.2
        public Class getDataClass() {
            return IntlTribeBubble.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlTribeBubble m13720newInstance() {
            return new IntlTribeBubble();
        }

        public boolean parseField(IntlTribeBubble intlTribeBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "seeTribeCount":
                    intlTribeBubble.seeTribeCount = jsonParser.getValueAsInt();
                    return true;
                case "seeCount":
                    intlTribeBubble.seeCount = jsonParser.getValueAsInt();
                    return true;
                case "tribeCount":
                    intlTribeBubble.tribeCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlTribeBubble intlTribeBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "seeTribeCount":
                case "seeCount":
                case "tribeCount":
                    return true;
                default:
                    return super.parseFieldCheck(intlTribeBubble, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlTribeBubble intlTribeBubble, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tribeCount", intlTribeBubble.tribeCount);
            jsonGenerator.writeNumberField("seeCount", intlTribeBubble.seeCount);
            jsonGenerator.writeNumberField("seeTribeCount", intlTribeBubble.seeTribeCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTribeBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTribeBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTribeBubble new_() {
        IntlTribeBubble intlTribeBubble = new IntlTribeBubble();
        intlTribeBubble.nullCheck();
        return intlTribeBubble;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlTribeBubble m13718clone() {
        IntlTribeBubble intlTribeBubble = new IntlTribeBubble();
        intlTribeBubble.tribeCount = this.tribeCount;
        intlTribeBubble.seeCount = this.seeCount;
        intlTribeBubble.seeTribeCount = this.seeTribeCount;
        return intlTribeBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTribeBubble)) {
            return false;
        }
        IntlTribeBubble intlTribeBubble = (IntlTribeBubble) obj;
        return this.tribeCount == intlTribeBubble.tribeCount && this.seeCount == intlTribeBubble.seeCount && this.seeTribeCount == intlTribeBubble.seeTribeCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.tribeCount) * 41) + this.seeCount) * 41) + this.seeTribeCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
