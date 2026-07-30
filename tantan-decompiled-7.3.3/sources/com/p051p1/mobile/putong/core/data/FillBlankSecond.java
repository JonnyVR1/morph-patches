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
public class FillBlankSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fillblanksecond";

    @ProtobufIndex(index = 1)
    public boolean required;
    public static ProtobufAdapter<FillBlankSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<FillBlankSecond>() { // from class: com.p1.mobile.putong.core.data.FillBlankSecond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FillBlankSecond fillBlankSecond) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, fillBlankSecond.required);
            fillBlankSecond.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FillBlankSecond parse(nc5 nc5Var) throws IOException {
            FillBlankSecond fillBlankSecond = new FillBlankSecond();
            while (nc5Var.m162497u() == 8) {
                fillBlankSecond.required = nc5Var.m162483g();
            }
            return fillBlankSecond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FillBlankSecond fillBlankSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, fillBlankSecond.required);
        }
    };
    public static JsonAdapter<FillBlankSecond> JSON_ADAPTER = new ObjectJsonAdapter<FillBlankSecond>() { // from class: com.p1.mobile.putong.core.data.FillBlankSecond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FillBlankSecond.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FillBlankSecond newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FillBlankSecond fillBlankSecond, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("required", fillBlankSecond.required);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FillBlankSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FillBlankSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FillBlankSecond new_() {
        FillBlankSecond fillBlankSecond = new FillBlankSecond();
        fillBlankSecond.nullCheck();
        return fillBlankSecond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FillBlankSecond mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.required ? 1231 : 1237);
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
