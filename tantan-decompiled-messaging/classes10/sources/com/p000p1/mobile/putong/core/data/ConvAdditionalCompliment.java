package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ConvAdditionalCompliment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalcompliment";

    @ProtobufIndex(index = 1)
    public boolean isActor;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isPassive;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String type;
    public static ProtobufAdapter<ConvAdditionalCompliment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalCompliment>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalCompliment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConvAdditionalCompliment convAdditionalCompliment) {
            int iB = CodedOutputByteBufferNano.b(1, convAdditionalCompliment.isActor) + CodedOutputByteBufferNano.b(2, convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) convAdditionalCompliment).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalCompliment m12289parse(nb5 nb5Var) throws IOException {
            ConvAdditionalCompliment convAdditionalCompliment = new ConvAdditionalCompliment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (convAdditionalCompliment.type != null) {
                        break;
                    }
                    convAdditionalCompliment.type = "";
                    break;
                }
                if (iU == 8) {
                    convAdditionalCompliment.isActor = nb5Var.g();
                } else if (iU == 16) {
                    convAdditionalCompliment.isPassive = nb5Var.g();
                } else {
                    if (iU != 26) {
                        if (convAdditionalCompliment.type != null) {
                            break;
                        }
                        convAdditionalCompliment.type = "";
                        return convAdditionalCompliment;
                    }
                    convAdditionalCompliment.type = nb5Var.s();
                }
            }
            return convAdditionalCompliment;
        }

        public void serialize(ConvAdditionalCompliment convAdditionalCompliment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, convAdditionalCompliment.isActor);
            codedOutputByteBufferNano.A(2, convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalCompliment> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalCompliment>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalCompliment.2
        public Class getDataClass() {
            return ConvAdditionalCompliment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalCompliment m12290newInstance() {
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

        public void serializeFields(ConvAdditionalCompliment convAdditionalCompliment, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActor", convAdditionalCompliment.isActor);
            jsonGenerator.writeBooleanField("isPassive", convAdditionalCompliment.isPassive);
            String str = convAdditionalCompliment.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalCompliment new_() {
        ConvAdditionalCompliment convAdditionalCompliment = new ConvAdditionalCompliment();
        convAdditionalCompliment.nullCheck();
        return convAdditionalCompliment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConvAdditionalCompliment m12288clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.isActor ? 1231 : 1237)) * 41) + (this.isPassive ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
