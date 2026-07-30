package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MatePlanQuestionAttribute extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mateplanquestionattribute";

    @NonNull
    @ProtobufIndex(index = 1)
    public String examples;

    @NonNull
    @ProtobufIndex(index = 2)
    public String guide;
    public static ProtobufAdapter<MatePlanQuestionAttribute> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatePlanQuestionAttribute>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestionAttribute.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatePlanQuestionAttribute matePlanQuestionAttribute) {
            String str = matePlanQuestionAttribute.examples;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = matePlanQuestionAttribute.guide;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            matePlanQuestionAttribute.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatePlanQuestionAttribute parse(nb5 nb5Var) throws IOException {
            MatePlanQuestionAttribute matePlanQuestionAttribute = new MatePlanQuestionAttribute();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (matePlanQuestionAttribute.examples == null) {
                        matePlanQuestionAttribute.examples = "";
                    }
                    if (matePlanQuestionAttribute.guide != null) {
                        break;
                    }
                    matePlanQuestionAttribute.guide = "";
                    break;
                }
                if (iM158752u == 10) {
                    matePlanQuestionAttribute.examples = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (matePlanQuestionAttribute.examples == null) {
                            matePlanQuestionAttribute.examples = "";
                        }
                        if (matePlanQuestionAttribute.guide != null) {
                            break;
                        }
                        matePlanQuestionAttribute.guide = "";
                        return matePlanQuestionAttribute;
                    }
                    matePlanQuestionAttribute.guide = nb5Var.m158750s();
                }
            }
            return matePlanQuestionAttribute;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatePlanQuestionAttribute matePlanQuestionAttribute, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matePlanQuestionAttribute.examples;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = matePlanQuestionAttribute.guide;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MatePlanQuestionAttribute> JSON_ADAPTER = new ObjectJsonAdapter<MatePlanQuestionAttribute>() { // from class: com.p1.mobile.putong.core.data.MatePlanQuestionAttribute.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatePlanQuestionAttribute.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatePlanQuestionAttribute newInstance() {
            return new MatePlanQuestionAttribute();
        }

        public boolean parseField(MatePlanQuestionAttribute matePlanQuestionAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("guide")) {
                matePlanQuestionAttribute.guide = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("examples")) {
                return false;
            }
            matePlanQuestionAttribute.examples = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MatePlanQuestionAttribute matePlanQuestionAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("guide") || str.equals("examples")) {
                return true;
            }
            return super.parseFieldCheck(matePlanQuestionAttribute, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatePlanQuestionAttribute matePlanQuestionAttribute, JsonGenerator jsonGenerator) throws IOException {
            String str = matePlanQuestionAttribute.examples;
            if (str != null) {
                jsonGenerator.writeStringField("examples", str);
            }
            String str2 = matePlanQuestionAttribute.guide;
            if (str2 != null) {
                jsonGenerator.writeStringField("guide", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatePlanQuestionAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatePlanQuestionAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatePlanQuestionAttribute new_() {
        MatePlanQuestionAttribute matePlanQuestionAttribute = new MatePlanQuestionAttribute();
        matePlanQuestionAttribute.nullCheck();
        return matePlanQuestionAttribute;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatePlanQuestionAttribute mo223809clone() {
        MatePlanQuestionAttribute matePlanQuestionAttribute = new MatePlanQuestionAttribute();
        matePlanQuestionAttribute.examples = this.examples;
        matePlanQuestionAttribute.guide = this.guide;
        return matePlanQuestionAttribute;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatePlanQuestionAttribute)) {
            return false;
        }
        MatePlanQuestionAttribute matePlanQuestionAttribute = (MatePlanQuestionAttribute) obj;
        return ValueObject.util_equals(this.examples, matePlanQuestionAttribute.examples) && ValueObject.util_equals(this.guide, matePlanQuestionAttribute.guide);
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
        String str = this.examples;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.guide;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.examples == null) {
            this.examples = "";
        }
        if (this.guide == null) {
            this.guide = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
