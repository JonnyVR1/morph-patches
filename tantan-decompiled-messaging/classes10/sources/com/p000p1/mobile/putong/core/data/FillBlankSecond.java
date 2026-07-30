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
public class FillBlankSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fillblanksecond";

    @ProtobufIndex(index = 1)
    public boolean required;
    public static ProtobufAdapter<FillBlankSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<FillBlankSecond>() { // from class: com.p1.mobile.putong.core.data.FillBlankSecond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FillBlankSecond fillBlankSecond) {
            int iB = CodedOutputByteBufferNano.b(1, fillBlankSecond.required);
            ((MessageNano) fillBlankSecond).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FillBlankSecond m12789parse(nb5 nb5Var) throws IOException {
            FillBlankSecond fillBlankSecond = new FillBlankSecond();
            while (nb5Var.u() == 8) {
                fillBlankSecond.required = nb5Var.g();
            }
            return fillBlankSecond;
        }

        public void serialize(FillBlankSecond fillBlankSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, fillBlankSecond.required);
        }
    };
    public static JsonAdapter<FillBlankSecond> JSON_ADAPTER = new ObjectJsonAdapter<FillBlankSecond>() { // from class: com.p1.mobile.putong.core.data.FillBlankSecond.2
        public Class getDataClass() {
            return FillBlankSecond.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FillBlankSecond m12790newInstance() {
            return new FillBlankSecond();
        }

        public boolean parseField(FillBlankSecond fillBlankSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("required")) {
                return false;
            }
            fillBlankSecond.required = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FillBlankSecond fillBlankSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("required")) {
                return true;
            }
            return super.parseFieldCheck(fillBlankSecond, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FillBlankSecond fillBlankSecond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("required", fillBlankSecond.required);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FillBlankSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FillBlankSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FillBlankSecond new_() {
        FillBlankSecond fillBlankSecond = new FillBlankSecond();
        fillBlankSecond.nullCheck();
        return fillBlankSecond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FillBlankSecond m12788clone() {
        FillBlankSecond fillBlankSecond = new FillBlankSecond();
        fillBlankSecond.required = this.required;
        return fillBlankSecond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FillBlankSecond) && this.required == ((FillBlankSecond) obj).required;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.required ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
