package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class ConvAdditionalSwiper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionalswiper";

    @ProtobufIndex(index = 2)
    public boolean isActor;

    @ProtobufIndex(index = 4)
    public boolean isFake;

    @ProtobufIndex(index = 3)
    public boolean isPassive;

    @Nullable
    @ProtobufIndex(index = 5)
    public String source;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<ConvAdditionalSwiper> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalSwiper>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalSwiper.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConvAdditionalSwiper convAdditionalSwiper) {
            String str = convAdditionalSwiper.type;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, convAdditionalSwiper.isActor) + CodedOutputByteBufferNano.m17275b(3, convAdditionalSwiper.isPassive) + CodedOutputByteBufferNano.m17275b(4, convAdditionalSwiper.isFake);
            String str2 = convAdditionalSwiper.source;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            convAdditionalSwiper.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConvAdditionalSwiper parse(nc5 nc5Var) throws IOException {
            ConvAdditionalSwiper convAdditionalSwiper = new ConvAdditionalSwiper();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (convAdditionalSwiper.type != null) {
                        break;
                    }
                    convAdditionalSwiper.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    convAdditionalSwiper.type = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    convAdditionalSwiper.isActor = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    convAdditionalSwiper.isPassive = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    convAdditionalSwiper.isFake = nc5Var.m162483g();
                } else {
                    if (iM162497u != 42) {
                        if (convAdditionalSwiper.type != null) {
                            break;
                        }
                        convAdditionalSwiper.type = "";
                        return convAdditionalSwiper;
                    }
                    convAdditionalSwiper.source = nc5Var.m162495s();
                }
            }
            return convAdditionalSwiper;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConvAdditionalSwiper convAdditionalSwiper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = convAdditionalSwiper.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, convAdditionalSwiper.isActor);
            codedOutputByteBufferNano.m17299A(3, convAdditionalSwiper.isPassive);
            codedOutputByteBufferNano.m17299A(4, convAdditionalSwiper.isFake);
            String str2 = convAdditionalSwiper.source;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalSwiper> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalSwiper>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalSwiper.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConvAdditionalSwiper.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConvAdditionalSwiper newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalSwiper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalSwiper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalSwiper new_() {
        ConvAdditionalSwiper convAdditionalSwiper = new ConvAdditionalSwiper();
        convAdditionalSwiper.nullCheck();
        return convAdditionalSwiper;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConvAdditionalSwiper mo225055clone() {
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isFake ? 1231 : 1237)) * 41;
        String str2 = this.source;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
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
