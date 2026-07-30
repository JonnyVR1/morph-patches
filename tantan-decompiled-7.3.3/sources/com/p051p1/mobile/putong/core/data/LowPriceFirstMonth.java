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
public class LowPriceFirstMonth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowpricefirstmonth";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;
    public static ProtobufAdapter<LowPriceFirstMonth> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowPriceFirstMonth>() { // from class: com.p1.mobile.putong.core.data.LowPriceFirstMonth.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LowPriceFirstMonth lowPriceFirstMonth) {
            String str = lowPriceFirstMonth.content;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            lowPriceFirstMonth.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LowPriceFirstMonth parse(nc5 nc5Var) throws IOException {
            LowPriceFirstMonth lowPriceFirstMonth = new LowPriceFirstMonth();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (lowPriceFirstMonth.content != null) {
                        break;
                    }
                    lowPriceFirstMonth.content = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (lowPriceFirstMonth.content != null) {
                        break;
                    }
                    lowPriceFirstMonth.content = "";
                    return lowPriceFirstMonth;
                }
                lowPriceFirstMonth.content = nc5Var.m162495s();
            }
            return lowPriceFirstMonth;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LowPriceFirstMonth lowPriceFirstMonth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = lowPriceFirstMonth.content;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<LowPriceFirstMonth> JSON_ADAPTER = new ObjectJsonAdapter<LowPriceFirstMonth>() { // from class: com.p1.mobile.putong.core.data.LowPriceFirstMonth.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LowPriceFirstMonth.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LowPriceFirstMonth newInstance() {
            return new LowPriceFirstMonth();
        }

        public boolean parseField(LowPriceFirstMonth lowPriceFirstMonth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("content")) {
                return false;
            }
            lowPriceFirstMonth.content = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LowPriceFirstMonth lowPriceFirstMonth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("content")) {
                return true;
            }
            return super.parseFieldCheck(lowPriceFirstMonth, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LowPriceFirstMonth lowPriceFirstMonth, JsonGenerator jsonGenerator) throws IOException {
            String str = lowPriceFirstMonth.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowPriceFirstMonth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowPriceFirstMonth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowPriceFirstMonth new_() {
        LowPriceFirstMonth lowPriceFirstMonth = new LowPriceFirstMonth();
        lowPriceFirstMonth.nullCheck();
        return lowPriceFirstMonth;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LowPriceFirstMonth mo225055clone() {
        LowPriceFirstMonth lowPriceFirstMonth = new LowPriceFirstMonth();
        lowPriceFirstMonth.content = this.content;
        return lowPriceFirstMonth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LowPriceFirstMonth) {
            return ValueObject.util_equals(this.content, ((LowPriceFirstMonth) obj).content);
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
        String str = this.content;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
