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
public class FillBlank extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fillblank";

    @ProtobufIndex(index = 1)
    public boolean required;
    public static ProtobufAdapter<FillBlank> PROTOBUF_ADAPTER = new MessageNanoAdapter<FillBlank>() { // from class: com.p1.mobile.putong.core.data.FillBlank.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FillBlank fillBlank) {
            int iB = CodedOutputByteBufferNano.b(1, fillBlank.required);
            ((MessageNano) fillBlank).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FillBlank m12785parse(nb5 nb5Var) throws IOException {
            FillBlank fillBlank = new FillBlank();
            while (nb5Var.u() == 8) {
                fillBlank.required = nb5Var.g();
            }
            return fillBlank;
        }

        public void serialize(FillBlank fillBlank, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, fillBlank.required);
        }
    };
    public static JsonAdapter<FillBlank> JSON_ADAPTER = new ObjectJsonAdapter<FillBlank>() { // from class: com.p1.mobile.putong.core.data.FillBlank.2
        public Class getDataClass() {
            return FillBlank.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FillBlank m12786newInstance() {
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

        public void serializeFields(FillBlank fillBlank, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("required", fillBlank.required);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FillBlank) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FillBlank) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FillBlank new_() {
        FillBlank fillBlank = new FillBlank();
        fillBlank.nullCheck();
        return fillBlank;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FillBlank m12784clone() {
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
