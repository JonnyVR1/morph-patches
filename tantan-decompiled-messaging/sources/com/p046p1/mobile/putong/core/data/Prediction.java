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
public class Prediction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prediction";

    @NonNull
    @ProtobufIndex(index = 1)
    public String description;

    @NonNull
    @ProtobufIndex(index = 2)
    public String place_id;

    @NonNull
    @ProtobufIndex(index = 3)
    public StructuredFormatting structured_formatting;
    public static ProtobufAdapter<Prediction> PROTOBUF_ADAPTER = new MessageNanoAdapter<Prediction>() { // from class: com.p1.mobile.putong.core.data.Prediction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Prediction prediction) {
            String str = prediction.description;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = prediction.place_id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            StructuredFormatting structuredFormatting = prediction.structured_formatting;
            if (structuredFormatting != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, structuredFormatting, StructuredFormatting.PROTOBUF_ADAPTER);
            }
            prediction.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Prediction parse(nb5 nb5Var) throws IOException {
            Prediction prediction = new Prediction();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (prediction.description == null) {
                        prediction.description = "";
                    }
                    if (prediction.place_id == null) {
                        prediction.place_id = "";
                    }
                    if (prediction.structured_formatting != null) {
                        break;
                    }
                    prediction.structured_formatting = StructuredFormatting.new_();
                    break;
                }
                if (iM158752u == 10) {
                    prediction.description = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    prediction.place_id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (prediction.description == null) {
                            prediction.description = "";
                        }
                        if (prediction.place_id == null) {
                            prediction.place_id = "";
                        }
                        if (prediction.structured_formatting != null) {
                            break;
                        }
                        prediction.structured_formatting = StructuredFormatting.new_();
                        return prediction;
                    }
                    prediction.structured_formatting = (StructuredFormatting) nb5Var.m158743l(StructuredFormatting.PROTOBUF_ADAPTER);
                }
            }
            return prediction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Prediction prediction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = prediction.description;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = prediction.place_id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            StructuredFormatting structuredFormatting = prediction.structured_formatting;
            if (structuredFormatting != null) {
                codedOutputByteBufferNano.m17254K(3, structuredFormatting, StructuredFormatting.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Prediction> JSON_ADAPTER = new ObjectJsonAdapter<Prediction>() { // from class: com.p1.mobile.putong.core.data.Prediction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Prediction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Prediction newInstance() {
            return new Prediction();
        }

        public boolean parseField(Prediction prediction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "structured_formatting":
                    prediction.structured_formatting = StructuredFormatting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "description":
                    prediction.description = jsonParser.getValueAsString();
                    return true;
                case "place_id":
                    prediction.place_id = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Prediction prediction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "structured_formatting":
                case "description":
                case "place_id":
                    return true;
                default:
                    return super.parseFieldCheck(prediction, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Prediction prediction, JsonGenerator jsonGenerator) throws IOException {
            String str = prediction.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            String str2 = prediction.place_id;
            if (str2 != null) {
                jsonGenerator.writeStringField("place_id", str2);
            }
            if (prediction.structured_formatting != null) {
                jsonGenerator.writeFieldName("structured_formatting");
                StructuredFormatting.JSON_ADAPTER.serialize(prediction.structured_formatting, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Prediction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Prediction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Prediction new_() {
        Prediction prediction = new Prediction();
        prediction.nullCheck();
        return prediction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Prediction mo223809clone() {
        Prediction prediction = new Prediction();
        prediction.description = this.description;
        prediction.place_id = this.place_id;
        StructuredFormatting structuredFormatting = this.structured_formatting;
        if (structuredFormatting != null) {
            prediction.structured_formatting = structuredFormatting.mo223809clone();
        }
        return prediction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Prediction)) {
            return false;
        }
        Prediction prediction = (Prediction) obj;
        return ValueObject.util_equals(this.description, prediction.description) && ValueObject.util_equals(this.place_id, prediction.place_id) && ValueObject.util_equals(this.structured_formatting, prediction.structured_formatting);
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
        String str = this.description;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.place_id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        StructuredFormatting structuredFormatting = this.structured_formatting;
        int iHashCode3 = iHashCode2 + (structuredFormatting != null ? structuredFormatting.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.place_id == null) {
            this.place_id = "";
        }
        if (this.structured_formatting == null) {
            this.structured_formatting = StructuredFormatting.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
