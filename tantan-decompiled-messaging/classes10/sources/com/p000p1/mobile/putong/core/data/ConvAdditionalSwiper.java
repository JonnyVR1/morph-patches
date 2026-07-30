package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class ConvAdditionalSwiper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalswiper";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isActor;

    @ProtobufIndex(index = 4)
    public boolean isFake;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean isPassive;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String source;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<ConvAdditionalSwiper> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalSwiper>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalSwiper.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConvAdditionalSwiper convAdditionalSwiper) {
            String str = convAdditionalSwiper.type;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, convAdditionalSwiper.isActor) + CodedOutputByteBufferNano.b(3, convAdditionalSwiper.isPassive) + CodedOutputByteBufferNano.b(4, convAdditionalSwiper.isFake);
            String str2 = convAdditionalSwiper.source;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            ((MessageNano) convAdditionalSwiper).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalSwiper m12305parse(nb5 nb5Var) throws IOException {
            ConvAdditionalSwiper convAdditionalSwiper = new ConvAdditionalSwiper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (convAdditionalSwiper.type != null) {
                        break;
                    }
                    convAdditionalSwiper.type = "";
                    break;
                }
                if (iU == 10) {
                    convAdditionalSwiper.type = nb5Var.s();
                } else if (iU == 16) {
                    convAdditionalSwiper.isActor = nb5Var.g();
                } else if (iU == 24) {
                    convAdditionalSwiper.isPassive = nb5Var.g();
                } else if (iU == 32) {
                    convAdditionalSwiper.isFake = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (convAdditionalSwiper.type != null) {
                            break;
                        }
                        convAdditionalSwiper.type = "";
                        return convAdditionalSwiper;
                    }
                    convAdditionalSwiper.source = nb5Var.s();
                }
            }
            return convAdditionalSwiper;
        }

        public void serialize(ConvAdditionalSwiper convAdditionalSwiper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = convAdditionalSwiper.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, convAdditionalSwiper.isActor);
            codedOutputByteBufferNano.A(3, convAdditionalSwiper.isPassive);
            codedOutputByteBufferNano.A(4, convAdditionalSwiper.isFake);
            String str2 = convAdditionalSwiper.source;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalSwiper> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalSwiper>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalSwiper.2
        public Class getDataClass() {
            return ConvAdditionalSwiper.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalSwiper m12306newInstance() {
            return new ConvAdditionalSwiper();
        }

        public boolean parseField(ConvAdditionalSwiper convAdditionalSwiper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isPassive":
                    convAdditionalSwiper.isPassive = jsonParser.getValueAsBoolean();
                    return true;
                case "isFake":
                    convAdditionalSwiper.isFake = jsonParser.getValueAsBoolean();
                    return true;
                case "source":
                    convAdditionalSwiper.source = jsonParser.getValueAsString();
                    return true;
                case "type":
                    convAdditionalSwiper.type = jsonParser.getValueAsString();
                    return true;
                case "isActor":
                    convAdditionalSwiper.isActor = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConvAdditionalSwiper convAdditionalSwiper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isPassive":
                case "isFake":
                case "source":
                case "type":
                case "isActor":
                    return true;
                default:
                    return super.parseFieldCheck(convAdditionalSwiper, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ConvAdditionalSwiper convAdditionalSwiper, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isActor", convAdditionalSwiper.isActor);
            jsonGenerator.writeBooleanField("isPassive", convAdditionalSwiper.isPassive);
            String str = convAdditionalSwiper.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeBooleanField("isFake", convAdditionalSwiper.isFake);
            String str2 = convAdditionalSwiper.source;
            if (str2 != null) {
                jsonGenerator.writeStringField("source", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalSwiper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalSwiper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalSwiper new_() {
        ConvAdditionalSwiper convAdditionalSwiper = new ConvAdditionalSwiper();
        convAdditionalSwiper.nullCheck();
        return convAdditionalSwiper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConvAdditionalSwiper m12304clone() {
        ConvAdditionalSwiper convAdditionalSwiper = new ConvAdditionalSwiper();
        convAdditionalSwiper.isActor = this.isActor;
        convAdditionalSwiper.isPassive = this.isPassive;
        convAdditionalSwiper.type = this.type;
        convAdditionalSwiper.isFake = this.isFake;
        convAdditionalSwiper.source = this.source;
        return convAdditionalSwiper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvAdditionalSwiper)) {
            return false;
        }
        ConvAdditionalSwiper convAdditionalSwiper = (ConvAdditionalSwiper) obj;
        return this.isActor == convAdditionalSwiper.isActor && this.isPassive == convAdditionalSwiper.isPassive && ValueObject.util_equals(this.type, convAdditionalSwiper.type) && this.isFake == convAdditionalSwiper.isFake && ValueObject.util_equals(this.source, convAdditionalSwiper.source);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isFake ? 1231 : 1237)) * 41;
        String str2 = this.source;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
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
