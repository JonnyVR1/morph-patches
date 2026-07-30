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
public class TacitTest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tacittest";

    @ProtobufIndex(index = 1)
    public boolean firstMessageInserted;
    public static ProtobufAdapter<TacitTest> PROTOBUF_ADAPTER = new MessageNanoAdapter<TacitTest>() { // from class: com.p1.mobile.putong.core.data.TacitTest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TacitTest tacitTest) {
            int iB = CodedOutputByteBufferNano.b(1, tacitTest.firstMessageInserted);
            ((MessageNano) tacitTest).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TacitTest m15894parse(nb5 nb5Var) throws IOException {
            TacitTest tacitTest = new TacitTest();
            while (nb5Var.u() == 8) {
                tacitTest.firstMessageInserted = nb5Var.g();
            }
            return tacitTest;
        }

        public void serialize(TacitTest tacitTest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, tacitTest.firstMessageInserted);
        }
    };
    public static JsonAdapter<TacitTest> JSON_ADAPTER = new ObjectJsonAdapter<TacitTest>() { // from class: com.p1.mobile.putong.core.data.TacitTest.2
        public Class getDataClass() {
            return TacitTest.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TacitTest m15895newInstance() {
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

        public void serializeFields(TacitTest tacitTest, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("firstMessageInserted", tacitTest.firstMessageInserted);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TacitTest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TacitTest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TacitTest new_() {
        TacitTest tacitTest = new TacitTest();
        tacitTest.nullCheck();
        return tacitTest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TacitTest m15893clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.firstMessageInserted ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
