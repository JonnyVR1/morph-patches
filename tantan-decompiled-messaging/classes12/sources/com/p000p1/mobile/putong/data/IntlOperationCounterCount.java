package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IntlOperationCounterCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationcountercount";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<IntlOperationCounterCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationCounterCount>() { // from class: com.p1.mobile.putong.data.IntlOperationCounterCount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlOperationCounterCount intlOperationCounterCount) {
            int iH = CodedOutputByteBufferNano.h(1, intlOperationCounterCount.unread);
            ((MessageNano) intlOperationCounterCount).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlOperationCounterCount m18241parse(nb5 nb5Var) throws IOException {
            IntlOperationCounterCount intlOperationCounterCount = new IntlOperationCounterCount();
            while (nb5Var.u() == 8) {
                intlOperationCounterCount.unread = nb5Var.j();
            }
            return intlOperationCounterCount;
        }

        public void serialize(IntlOperationCounterCount intlOperationCounterCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlOperationCounterCount.unread);
        }
    };
    public static JsonAdapter<IntlOperationCounterCount> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationCounterCount>() { // from class: com.p1.mobile.putong.data.IntlOperationCounterCount.2
        public Class getDataClass() {
            return IntlOperationCounterCount.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlOperationCounterCount mo17830newInstance() {
            return new IntlOperationCounterCount();
        }

        public boolean parseField(IntlOperationCounterCount intlOperationCounterCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unread")) {
                return false;
            }
            intlOperationCounterCount.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(IntlOperationCounterCount intlOperationCounterCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread")) {
                return true;
            }
            return super.parseFieldCheck(intlOperationCounterCount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationCounterCount intlOperationCounterCount, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", intlOperationCounterCount.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationCounterCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationCounterCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationCounterCount new_() {
        IntlOperationCounterCount intlOperationCounterCount = new IntlOperationCounterCount();
        intlOperationCounterCount.nullCheck();
        return intlOperationCounterCount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlOperationCounterCount m18240clone() {
        IntlOperationCounterCount intlOperationCounterCount = new IntlOperationCounterCount();
        intlOperationCounterCount.unread = this.unread;
        return intlOperationCounterCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof IntlOperationCounterCount) && this.unread == ((IntlOperationCounterCount) obj).unread;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
