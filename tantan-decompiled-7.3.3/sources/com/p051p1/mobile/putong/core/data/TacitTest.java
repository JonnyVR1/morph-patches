package com.p051p1.mobile.putong.core.data;

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
public class TacitTest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tacittest";

    @ProtobufIndex(index = 1)
    public boolean firstMessageInserted;
    public static ProtobufAdapter<TacitTest> PROTOBUF_ADAPTER = new MessageNanoAdapter<TacitTest>() { // from class: com.p1.mobile.putong.core.data.TacitTest.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TacitTest tacitTest) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, tacitTest.firstMessageInserted);
            tacitTest.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TacitTest parse(nc5 nc5Var) throws IOException {
            TacitTest tacitTest = new TacitTest();
            while (nc5Var.m162497u() == 8) {
                tacitTest.firstMessageInserted = nc5Var.m162483g();
            }
            return tacitTest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TacitTest tacitTest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, tacitTest.firstMessageInserted);
        }
    };
    public static JsonAdapter<TacitTest> JSON_ADAPTER = new ObjectJsonAdapter<TacitTest>() { // from class: com.p1.mobile.putong.core.data.TacitTest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TacitTest.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TacitTest newInstance() {
            return new TacitTest();
        }

        public boolean parseField(TacitTest tacitTest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("firstMessageInserted")) {
                return false;
            }
            tacitTest.firstMessageInserted = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(TacitTest tacitTest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("firstMessageInserted")) {
                return true;
            }
            return super.parseFieldCheck(tacitTest, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TacitTest tacitTest, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("firstMessageInserted", tacitTest.firstMessageInserted);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TacitTest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TacitTest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TacitTest new_() {
        TacitTest tacitTest = new TacitTest();
        tacitTest.nullCheck();
        return tacitTest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TacitTest mo225055clone() {
        TacitTest tacitTest = new TacitTest();
        tacitTest.firstMessageInserted = this.firstMessageInserted;
        return tacitTest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TacitTest) && this.firstMessageInserted == ((TacitTest) obj).firstMessageInserted;
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
        int i2 = (i * 41) + (this.firstMessageInserted ? 1231 : 1237);
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
