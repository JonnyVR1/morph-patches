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
public class ConvAdditionalCompliment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalcompliment";

    @ProtobufIndex(index = 1)
    public boolean isActor;

    @ProtobufIndex(index = 2)
    public boolean isPassive;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<ConvAdditionalCompliment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalCompliment>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalCompliment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConvAdditionalCompliment convAdditionalCompliment) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, convAdditionalCompliment.isActor) + CodedOutputByteBufferNano.m17220b(2, convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str);
            }
            convAdditionalCompliment.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConvAdditionalCompliment parse(nb5 nb5Var) throws IOException {
            ConvAdditionalCompliment convAdditionalCompliment = new ConvAdditionalCompliment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (convAdditionalCompliment.type != null) {
                        break;
                    }
                    convAdditionalCompliment.type = "";
                    break;
                }
                if (iM158752u == 8) {
                    convAdditionalCompliment.isActor = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    convAdditionalCompliment.isPassive = nb5Var.m158738g();
                } else {
                    if (iM158752u != 26) {
                        if (convAdditionalCompliment.type != null) {
                            break;
                        }
                        convAdditionalCompliment.type = "";
                        return convAdditionalCompliment;
                    }
                    convAdditionalCompliment.type = nb5Var.m158750s();
                }
            }
            return convAdditionalCompliment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConvAdditionalCompliment convAdditionalCompliment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, convAdditionalCompliment.isActor);
            codedOutputByteBufferNano.m17244A(2, convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalCompliment> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalCompliment>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalCompliment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConvAdditionalCompliment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConvAdditionalCompliment newInstance() {
            return new ConvAdditionalCompliment();
        }

        public boolean parseField(ConvAdditionalCompliment convAdditionalCompliment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isPassive":
                    convAdditionalCompliment.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case "type":
                    convAdditionalCompliment.type = jsonParser.getValueAsString();
                    return true;
                case "isActor":
                    convAdditionalCompliment.isActor = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConvAdditionalCompliment convAdditionalCompliment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isPassive":
                case "type":
                case "isActor":
                    return true;
                default:
                    return super.parseFieldCheck(convAdditionalCompliment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConvAdditionalCompliment convAdditionalCompliment, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActor", convAdditionalCompliment.isActor);
            jsonGenerator.writeBooleanField("isPassive", convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalCompliment new_() {
        ConvAdditionalCompliment convAdditionalCompliment = new ConvAdditionalCompliment();
        convAdditionalCompliment.nullCheck();
        return convAdditionalCompliment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConvAdditionalCompliment mo223809clone() {
        ConvAdditionalCompliment convAdditionalCompliment = new ConvAdditionalCompliment();
        convAdditionalCompliment.isActor = this.isActor;
        convAdditionalCompliment.isPassive = this.isPassive;
        convAdditionalCompliment.type = this.type;
        return convAdditionalCompliment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvAdditionalCompliment)) {
            return false;
        }
        ConvAdditionalCompliment convAdditionalCompliment = (ConvAdditionalCompliment) obj;
        return this.isActor == convAdditionalCompliment.isActor && this.isPassive == convAdditionalCompliment.isPassive && ValueObject.util_equals(this.type, convAdditionalCompliment.type);
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
        int i2 = ((((i * 41) + (this.isActor ? 1231 : 1237)) * 41) + (this.isPassive ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
