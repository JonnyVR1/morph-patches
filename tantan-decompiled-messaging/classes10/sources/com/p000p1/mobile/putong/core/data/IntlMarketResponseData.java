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
public class IntlMarketResponseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketresponsedata";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public IntlFlashStickerOptionData flash_option;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlMarketResponseOptionData quiz_option;

    @ProtobufIndex(index = 1)
    public int regular_option;
    public static ProtobufAdapter<IntlMarketResponseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketResponseData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketResponseData intlMarketResponseData) {
            int iH = CodedOutputByteBufferNano.h(1, intlMarketResponseData.regular_option);
            IntlMarketResponseOptionData intlMarketResponseOptionData = intlMarketResponseData.quiz_option;
            if (intlMarketResponseOptionData != null) {
                iH += CodedOutputByteBufferNano.l(2, intlMarketResponseOptionData, IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
            }
            IntlFlashStickerOptionData intlFlashStickerOptionData = intlMarketResponseData.flash_option;
            if (intlFlashStickerOptionData != null) {
                iH += CodedOutputByteBufferNano.l(3, intlFlashStickerOptionData, IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlMarketResponseData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketResponseData m13615parse(nb5 nb5Var) throws IOException {
            IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketResponseData.quiz_option != null) {
                        break;
                    }
                    intlMarketResponseData.quiz_option = IntlMarketResponseOptionData.new_();
                    break;
                }
                if (iU == 8) {
                    intlMarketResponseData.regular_option = nb5Var.j();
                } else if (iU == 18) {
                    intlMarketResponseData.quiz_option = (IntlMarketResponseOptionData) nb5Var.l(IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (intlMarketResponseData.quiz_option != null) {
                            break;
                        }
                        intlMarketResponseData.quiz_option = IntlMarketResponseOptionData.new_();
                        return intlMarketResponseData;
                    }
                    intlMarketResponseData.flash_option = (IntlFlashStickerOptionData) nb5Var.l(IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketResponseData;
        }

        public void serialize(IntlMarketResponseData intlMarketResponseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlMarketResponseData.regular_option);
            IntlMarketResponseOptionData intlMarketResponseOptionData = intlMarketResponseData.quiz_option;
            if (intlMarketResponseOptionData != null) {
                codedOutputByteBufferNano.K(2, intlMarketResponseOptionData, IntlMarketResponseOptionData.PROTOBUF_ADAPTER);
            }
            IntlFlashStickerOptionData intlFlashStickerOptionData = intlMarketResponseData.flash_option;
            if (intlFlashStickerOptionData != null) {
                codedOutputByteBufferNano.K(3, intlFlashStickerOptionData, IntlFlashStickerOptionData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketResponseData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketResponseData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseData.2
        public Class getDataClass() {
            return IntlMarketResponseData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketResponseData m13616newInstance() {
            return new IntlMarketResponseData();
        }

        public boolean parseField(IntlMarketResponseData intlMarketResponseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "flash_option":
                    intlMarketResponseData.flash_option = (IntlFlashStickerOptionData) IntlFlashStickerOptionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "regular_option":
                    intlMarketResponseData.regular_option = jsonParser.getValueAsInt();
                    return true;
                case "quiz_option":
                    intlMarketResponseData.quiz_option = (IntlMarketResponseOptionData) IntlMarketResponseOptionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketResponseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketResponseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketResponseData new_() {
        IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
        intlMarketResponseData.nullCheck();
        return intlMarketResponseData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketResponseData m13614clone() {
        IntlMarketResponseData intlMarketResponseData = new IntlMarketResponseData();
        intlMarketResponseData.regular_option = this.regular_option;
        IntlMarketResponseOptionData intlMarketResponseOptionData = this.quiz_option;
        if (intlMarketResponseOptionData != null) {
            intlMarketResponseData.quiz_option = intlMarketResponseOptionData.m13622clone();
        }
        IntlFlashStickerOptionData intlFlashStickerOptionData = this.flash_option;
        if (intlFlashStickerOptionData != null) {
            intlMarketResponseData.flash_option = intlFlashStickerOptionData.m13554clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.regular_option) * 41;
        IntlMarketResponseOptionData intlMarketResponseOptionData = this.quiz_option;
        int iHashCode = (i2 + (intlMarketResponseOptionData != null ? intlMarketResponseOptionData.hashCode() : 0)) * 41;
        IntlFlashStickerOptionData intlFlashStickerOptionData = this.flash_option;
        int iHashCode2 = iHashCode + (intlFlashStickerOptionData != null ? intlFlashStickerOptionData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.quiz_option == null) {
            this.quiz_option = IntlMarketResponseOptionData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
