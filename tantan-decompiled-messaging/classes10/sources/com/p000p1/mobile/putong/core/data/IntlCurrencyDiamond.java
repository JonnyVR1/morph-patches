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
public class IntlCurrencyDiamond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcurrencydiamond";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long agentAvailable;

    @ProtobufIndex(index = 1)
    public long available;
    public static ProtobufAdapter<IntlCurrencyDiamond> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCurrencyDiamond>() { // from class: com.p1.mobile.putong.core.data.IntlCurrencyDiamond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlCurrencyDiamond intlCurrencyDiamond) {
            int iJ = CodedOutputByteBufferNano.j(1, intlCurrencyDiamond.available) + CodedOutputByteBufferNano.j(2, intlCurrencyDiamond.agentAvailable);
            ((MessageNano) intlCurrencyDiamond).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlCurrencyDiamond m13547parse(nb5 nb5Var) throws IOException {
            IntlCurrencyDiamond intlCurrencyDiamond = new IntlCurrencyDiamond();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    intlCurrencyDiamond.available = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return intlCurrencyDiamond;
                    }
                    intlCurrencyDiamond.agentAvailable = nb5Var.k();
                }
            }
        }

        public void serialize(IntlCurrencyDiamond intlCurrencyDiamond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, intlCurrencyDiamond.available);
            codedOutputByteBufferNano.I(2, intlCurrencyDiamond.agentAvailable);
        }
    };
    public static JsonAdapter<IntlCurrencyDiamond> JSON_ADAPTER = new ObjectJsonAdapter<IntlCurrencyDiamond>() { // from class: com.p1.mobile.putong.core.data.IntlCurrencyDiamond.2
        public Class getDataClass() {
            return IntlCurrencyDiamond.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlCurrencyDiamond m13548newInstance() {
            return new IntlCurrencyDiamond();
        }

        public boolean parseField(IntlCurrencyDiamond intlCurrencyDiamond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("agentAvailable")) {
                intlCurrencyDiamond.agentAvailable = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("available")) {
                return false;
            }
            intlCurrencyDiamond.available = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(IntlCurrencyDiamond intlCurrencyDiamond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("agentAvailable") || str.equals("available")) {
                return true;
            }
            return super.parseFieldCheck(intlCurrencyDiamond, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlCurrencyDiamond intlCurrencyDiamond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", intlCurrencyDiamond.available);
            jsonGenerator.writeNumberField("agentAvailable", intlCurrencyDiamond.agentAvailable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCurrencyDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCurrencyDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCurrencyDiamond new_() {
        IntlCurrencyDiamond intlCurrencyDiamond = new IntlCurrencyDiamond();
        intlCurrencyDiamond.nullCheck();
        return intlCurrencyDiamond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlCurrencyDiamond m13546clone() {
        IntlCurrencyDiamond intlCurrencyDiamond = new IntlCurrencyDiamond();
        intlCurrencyDiamond.available = this.available;
        intlCurrencyDiamond.agentAvailable = this.agentAvailable;
        return intlCurrencyDiamond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCurrencyDiamond)) {
            return false;
        }
        IntlCurrencyDiamond intlCurrencyDiamond = (IntlCurrencyDiamond) obj;
        return this.available == intlCurrencyDiamond.available && this.agentAvailable == intlCurrencyDiamond.agentAvailable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.available;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.agentAvailable;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
