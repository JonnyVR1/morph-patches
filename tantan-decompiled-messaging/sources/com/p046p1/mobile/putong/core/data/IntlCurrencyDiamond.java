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
public class IntlCurrencyDiamond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcurrencydiamond";

    @ProtobufIndex(index = 2)
    public long agentAvailable;

    @ProtobufIndex(index = 1)
    public long available;
    public static ProtobufAdapter<IntlCurrencyDiamond> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCurrencyDiamond>() { // from class: com.p1.mobile.putong.core.data.IntlCurrencyDiamond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCurrencyDiamond intlCurrencyDiamond) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, intlCurrencyDiamond.available) + CodedOutputByteBufferNano.m17228j(2, intlCurrencyDiamond.agentAvailable);
            intlCurrencyDiamond.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCurrencyDiamond parse(nb5 nb5Var) throws IOException {
            IntlCurrencyDiamond intlCurrencyDiamond = new IntlCurrencyDiamond();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    intlCurrencyDiamond.available = nb5Var.m158742k();
                } else {
                    if (iM158752u != 16) {
                        return intlCurrencyDiamond;
                    }
                    intlCurrencyDiamond.agentAvailable = nb5Var.m158742k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCurrencyDiamond intlCurrencyDiamond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, intlCurrencyDiamond.available);
            codedOutputByteBufferNano.m17252I(2, intlCurrencyDiamond.agentAvailable);
        }
    };
    public static JsonAdapter<IntlCurrencyDiamond> JSON_ADAPTER = new ObjectJsonAdapter<IntlCurrencyDiamond>() { // from class: com.p1.mobile.putong.core.data.IntlCurrencyDiamond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCurrencyDiamond.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCurrencyDiamond newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCurrencyDiamond intlCurrencyDiamond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", intlCurrencyDiamond.available);
            jsonGenerator.writeNumberField("agentAvailable", intlCurrencyDiamond.agentAvailable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCurrencyDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCurrencyDiamond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCurrencyDiamond new_() {
        IntlCurrencyDiamond intlCurrencyDiamond = new IntlCurrencyDiamond();
        intlCurrencyDiamond.nullCheck();
        return intlCurrencyDiamond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCurrencyDiamond mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.available;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.agentAvailable;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
