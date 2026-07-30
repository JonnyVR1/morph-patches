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
public class FillBlank extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fillblank";

    @ProtobufIndex(index = 1)
    public boolean required;
    public static ProtobufAdapter<FillBlank> PROTOBUF_ADAPTER = new MessageNanoAdapter<FillBlank>() { // from class: com.p1.mobile.putong.core.data.FillBlank.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FillBlank fillBlank) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, fillBlank.required);
            fillBlank.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FillBlank parse(nc5 nc5Var) throws IOException {
            FillBlank fillBlank = new FillBlank();
            while (nc5Var.m162497u() == 8) {
                fillBlank.required = nc5Var.m162483g();
            }
            return fillBlank;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FillBlank fillBlank, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, fillBlank.required);
        }
    };
    public static JsonAdapter<FillBlank> JSON_ADAPTER = new ObjectJsonAdapter<FillBlank>() { // from class: com.p1.mobile.putong.core.data.FillBlank.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FillBlank.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FillBlank newInstance() {
            return new FillBlank();
        }

        public boolean parseField(FillBlank fillBlank, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("required")) {
                return false;
            }
            fillBlank.required = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FillBlank fillBlank, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("required")) {
                return true;
            }
            return super.parseFieldCheck(fillBlank, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FillBlank fillBlank, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("required", fillBlank.required);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FillBlank) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FillBlank) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FillBlank new_() {
        FillBlank fillBlank = new FillBlank();
        fillBlank.nullCheck();
        return fillBlank;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FillBlank mo225055clone() {
        FillBlank fillBlank = new FillBlank();
        fillBlank.required = this.required;
        return fillBlank;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FillBlank) && this.required == ((FillBlank) obj).required;
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
