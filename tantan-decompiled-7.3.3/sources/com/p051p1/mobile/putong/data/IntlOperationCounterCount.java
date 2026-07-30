package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
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

/* JADX INFO: loaded from: classes12.dex */
public class IntlOperationCounterCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationcountercount";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<IntlOperationCounterCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationCounterCount>() { // from class: com.p1.mobile.putong.data.IntlOperationCounterCount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationCounterCount intlOperationCounterCount) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, intlOperationCounterCount.unread);
            intlOperationCounterCount.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationCounterCount parse(nc5 nc5Var) throws IOException {
            IntlOperationCounterCount intlOperationCounterCount = new IntlOperationCounterCount();
            while (nc5Var.m162497u() == 8) {
                intlOperationCounterCount.unread = nc5Var.m162486j();
            }
            return intlOperationCounterCount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationCounterCount intlOperationCounterCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, intlOperationCounterCount.unread);
        }
    };
    public static JsonAdapter<IntlOperationCounterCount> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationCounterCount>() { // from class: com.p1.mobile.putong.data.IntlOperationCounterCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationCounterCount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationCounterCount newInstance() {
            return new IntlOperationCounterCount();
        }

        public boolean parseField(IntlOperationCounterCount intlOperationCounterCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            intlOperationCounterCount.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(IntlOperationCounterCount intlOperationCounterCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(intlOperationCounterCount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationCounterCount intlOperationCounterCount, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, intlOperationCounterCount.unread);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationCounterCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationCounterCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationCounterCount new_() {
        IntlOperationCounterCount intlOperationCounterCount = new IntlOperationCounterCount();
        intlOperationCounterCount.nullCheck();
        return intlOperationCounterCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationCounterCount mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
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
