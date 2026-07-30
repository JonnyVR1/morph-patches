package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class IntlMarketResponseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketresponsedata";

    @Nullable
    @ProtobufIndex(index = 3)
    public IntlFlashStickerOptionData flash_option;

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlMarketResponseOptionData quiz_option;

    @ProtobufIndex(index = 1)
    public int regular_option;
    public static ProtobufAdapter<IntlMarketResponseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketResponseData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketResponseData intlMarketResponseData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, intlMarketResponseData.regular_option);
            IntlMarketResponseOptionData intlMarketResponseOptionData = intlMarketResponseData.quiz_option;
            if (intlMarketResponseOptionData != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, intlMarketResponseOptionData, IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
            }
            IntlFlashStickerOptionData intlFlashStickerOptionData = intlMarketResponseData.flash_option;
            if (intlFlashStickerOptionData != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, intlFlashStickerOptionData, IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
            }
            intlMarketResponseData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketResponseData parse(nb5 nb5Var) throws IOException {
            IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketResponseData.quiz_option != null) {
                        break;
                    }
                    intlMarketResponseData.quiz_option = IntlMarketResponseOptionData.new_();
                    break;
                }
                if (iM158752u == 8) {
                    intlMarketResponseData.regular_option = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    intlMarketResponseData.quiz_option = (IntlMarketResponseOptionData) nb5Var.m158743l(IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (intlMarketResponseData.quiz_option != null) {
                            break;
                        }
                        intlMarketResponseData.quiz_option = IntlMarketResponseOptionData.new_();
                        return intlMarketResponseData;
                    }
                    intlMarketResponseData.flash_option = (IntlFlashStickerOptionData) nb5Var.m158743l(IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketResponseData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketResponseData intlMarketResponseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, intlMarketResponseData.regular_option);
            IntlMarketResponseOptionData intlMarketResponseOptionData = intlMarketResponseData.quiz_option;
            if (intlMarketResponseOptionData != null) {
                codedOutputByteBufferNano.m17254K(2, intlMarketResponseOptionData, IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
            }
            IntlFlashStickerOptionData intlFlashStickerOptionData = intlMarketResponseData.flash_option;
            if (intlFlashStickerOptionData != null) {
                codedOutputByteBufferNano.m17254K(3, intlFlashStickerOptionData, IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketResponseData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketResponseData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketResponseData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketResponseData newInstance() {
            return new IntlMarketResponseData();
        }

        public boolean parseField(IntlMarketResponseData intlMarketResponseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "flash_option":
                    intlMarketResponseData.flash_option = IntlFlashStickerOptionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "regular_option":
                    intlMarketResponseData.regular_option = jsonParser.getValueAsInt();
                    return true;
                case "quiz_option":
                    intlMarketResponseData.quiz_option = IntlMarketResponseOptionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketResponseData intlMarketResponseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "flash_option":
                case "regular_option":
                case "quiz_option":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketResponseData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketResponseData intlMarketResponseData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("regular_option", intlMarketResponseData.regular_option);
            if (intlMarketResponseData.quiz_option != null) {
                jsonGenerator.writeFieldName("quiz_option");
                IntlMarketResponseOptionData.JSON_ADAPTER.serialize(intlMarketResponseData.quiz_option, jsonGenerator, true);
            }
            if (intlMarketResponseData.flash_option != null) {
                jsonGenerator.writeFieldName("flash_option");
                IntlFlashStickerOptionData.JSON_ADAPTER.serialize(intlMarketResponseData.flash_option, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketResponseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketResponseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketResponseData new_() {
        IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
        intlMarketResponseData.nullCheck();
        return intlMarketResponseData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketResponseData mo223809clone() {
        IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
        intlMarketResponseData.regular_option = this.regular_option;
        IntlMarketResponseOptionData intlMarketResponseOptionData = this.quiz_option;
        if (intlMarketResponseOptionData != null) {
            intlMarketResponseData.quiz_option = intlMarketResponseOptionData.mo223809clone();
        }
        IntlFlashStickerOptionData intlFlashStickerOptionData = this.flash_option;
        if (intlFlashStickerOptionData != null) {
            intlMarketResponseData.flash_option = intlFlashStickerOptionData.mo223809clone();
        }
        return intlMarketResponseData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketResponseData)) {
            return false;
        }
        IntlMarketResponseData intlMarketResponseData = (IntlMarketResponseData) obj;
        return this.regular_option == intlMarketResponseData.regular_option && ValueObject.util_equals(this.quiz_option, intlMarketResponseData.quiz_option) && ValueObject.util_equals(this.flash_option, intlMarketResponseData.flash_option);
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
        int i2 = ((i * 41) + this.regular_option) * 41;
        IntlMarketResponseOptionData intlMarketResponseOptionData = this.quiz_option;
        int iHashCode = (i2 + (intlMarketResponseOptionData != null ? intlMarketResponseOptionData.hashCode() : 0)) * 41;
        IntlFlashStickerOptionData intlFlashStickerOptionData = this.flash_option;
        int iHashCode2 = iHashCode + (intlFlashStickerOptionData != null ? intlFlashStickerOptionData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.quiz_option == null) {
            this.quiz_option = IntlMarketResponseOptionData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
