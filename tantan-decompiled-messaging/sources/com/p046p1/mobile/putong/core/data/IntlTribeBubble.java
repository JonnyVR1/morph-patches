package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlTribeBubble extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltribebubble";

    @ProtobufIndex(index = 2)
    public int seeCount;

    @ProtobufIndex(index = 3)
    public int seeTribeCount;

    @ProtobufIndex(index = 1)
    public int tribeCount;
    public static ProtobufAdapter<IntlTribeBubble> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTribeBubble>() { // from class: com.p1.mobile.putong.core.data.IntlTribeBubble.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTribeBubble intlTribeBubble) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, intlTribeBubble.tribeCount) + CodedOutputByteBufferNano.m17226h(2, intlTribeBubble.seeCount) + CodedOutputByteBufferNano.m17226h(3, intlTribeBubble.seeTribeCount);
            intlTribeBubble.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTribeBubble parse(nb5 nb5Var) throws IOException {
            IntlTribeBubble intlTribeBubble = new IntlTribeBubble();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    intlTribeBubble.tribeCount = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    intlTribeBubble.seeCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return intlTribeBubble;
                    }
                    intlTribeBubble.seeTribeCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTribeBubble intlTribeBubble, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, intlTribeBubble.tribeCount);
            codedOutputByteBufferNano.m17250G(2, intlTribeBubble.seeCount);
            codedOutputByteBufferNano.m17250G(3, intlTribeBubble.seeTribeCount);
        }
    };
    public static JsonAdapter<IntlTribeBubble> JSON_ADAPTER = new ObjectJsonAdapter<IntlTribeBubble>() { // from class: com.p1.mobile.putong.core.data.IntlTribeBubble.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTribeBubble.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTribeBubble newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTribeBubble intlTribeBubble, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("tribeCount", intlTribeBubble.tribeCount);
            jsonGenerator.writeNumberField("seeCount", intlTribeBubble.seeCount);
            jsonGenerator.writeNumberField("seeTribeCount", intlTribeBubble.seeTribeCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTribeBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTribeBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTribeBubble new_() {
        IntlTribeBubble intlTribeBubble = new IntlTribeBubble();
        intlTribeBubble.nullCheck();
        return intlTribeBubble;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTribeBubble mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.tribeCount) * 41) + this.seeCount) * 41) + this.seeTribeCount;
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
