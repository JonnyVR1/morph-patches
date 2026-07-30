package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class LowPriceFirstMonth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowpricefirstmonth";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;
    public static ProtobufAdapter<LowPriceFirstMonth> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowPriceFirstMonth>() { // from class: com.p1.mobile.putong.core.data.LowPriceFirstMonth.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LowPriceFirstMonth lowPriceFirstMonth) {
            String str = lowPriceFirstMonth.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) lowPriceFirstMonth).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LowPriceFirstMonth m14029parse(nb5 nb5Var) throws IOException {
            LowPriceFirstMonth lowPriceFirstMonth = new LowPriceFirstMonth();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (lowPriceFirstMonth.content != null) {
                        break;
                    }
                    lowPriceFirstMonth.content = "";
                    break;
                }
                if (iU != 10) {
                    if (lowPriceFirstMonth.content != null) {
                        break;
                    }
                    lowPriceFirstMonth.content = "";
                    return lowPriceFirstMonth;
                }
                lowPriceFirstMonth.content = nb5Var.s();
            }
            return lowPriceFirstMonth;
        }

        public void serialize(LowPriceFirstMonth lowPriceFirstMonth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = lowPriceFirstMonth.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LowPriceFirstMonth> JSON_ADAPTER = new ObjectJsonAdapter<LowPriceFirstMonth>() { // from class: com.p1.mobile.putong.core.data.LowPriceFirstMonth.2
        public Class getDataClass() {
            return LowPriceFirstMonth.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LowPriceFirstMonth m14030newInstance() {
            return new LowPriceFirstMonth();
        }

        public boolean parseField(LowPriceFirstMonth lowPriceFirstMonth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Content.TYPE)) {
                return false;
            }
            lowPriceFirstMonth.content = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LowPriceFirstMonth lowPriceFirstMonth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Content.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(lowPriceFirstMonth, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LowPriceFirstMonth lowPriceFirstMonth, JsonGenerator jsonGenerator) throws IOException {
            String str = lowPriceFirstMonth.content;
            if (str != null) {
                jsonGenerator.writeStringField(Content.TYPE, str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowPriceFirstMonth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowPriceFirstMonth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowPriceFirstMonth new_() {
        LowPriceFirstMonth lowPriceFirstMonth = new LowPriceFirstMonth();
        lowPriceFirstMonth.nullCheck();
        return lowPriceFirstMonth;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LowPriceFirstMonth m14028clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.content;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
