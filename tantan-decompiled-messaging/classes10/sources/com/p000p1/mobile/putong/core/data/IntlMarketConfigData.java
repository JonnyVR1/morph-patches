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
public class IntlMarketConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlMarketConfigEntrypoint entrypoint;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlMarketConfigDataMeta meta;

    @NonNull
    @ProtobufIndex(index = 6)
    public IntlMarketQuestionData quiz_question;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public IntlMarketSummaryData quiz_summary;

    @NonNull
    @ProtobufIndex(index = 4)
    public IntlMarketStickerData regular_sticker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public IntlMarketSummaryData regular_summary;
    public static ProtobufAdapter<IntlMarketConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketConfigData intlMarketConfigData) {
            IntlMarketConfigDataMeta intlMarketConfigDataMeta = intlMarketConfigData.meta;
            int iL = intlMarketConfigDataMeta != null ? CodedOutputByteBufferNano.l(1, intlMarketConfigDataMeta, IntlMarketConfigDataMeta.PROTOBUF_ADAPTER) : 0;
            IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = intlMarketConfigData.entrypoint;
            if (intlMarketConfigEntrypoint != null) {
                iL += CodedOutputByteBufferNano.l(2, intlMarketConfigEntrypoint, IntlMarketConfigEntrypoint.PROTOBUF_ADAPTER);
            }
            IntlMarketSummaryData intlMarketSummaryData = intlMarketConfigData.regular_summary;
            if (intlMarketSummaryData != null) {
                iL += CodedOutputByteBufferNano.l(3, intlMarketSummaryData, IntlMarketSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketStickerData intlMarketStickerData = intlMarketConfigData.regular_sticker;
            if (intlMarketStickerData != null) {
                iL += CodedOutputByteBufferNano.l(4, intlMarketStickerData, IntlMarketStickerData.PROTOBUF_ADAPTER);
            }
            IntlMarketSummaryData intlMarketSummaryData2 = intlMarketConfigData.quiz_summary;
            if (intlMarketSummaryData2 != null) {
                iL += CodedOutputByteBufferNano.l(5, intlMarketSummaryData2, IntlMarketSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketQuestionData intlMarketQuestionData = intlMarketConfigData.quiz_question;
            if (intlMarketQuestionData != null) {
                iL += CodedOutputByteBufferNano.l(6, intlMarketQuestionData, IntlMarketQuestionData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlMarketConfigData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigData m13575parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigData intlMarketConfigData = new IntlMarketConfigData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketConfigData.meta == null) {
                        intlMarketConfigData.meta = IntlMarketConfigDataMeta.new_();
                    }
                    if (intlMarketConfigData.entrypoint == null) {
                        intlMarketConfigData.entrypoint = IntlMarketConfigEntrypoint.new_();
                    }
                    if (intlMarketConfigData.regular_summary == null) {
                        intlMarketConfigData.regular_summary = IntlMarketSummaryData.new_();
                    }
                    if (intlMarketConfigData.regular_sticker == null) {
                        intlMarketConfigData.regular_sticker = IntlMarketStickerData.new_();
                    }
                    if (intlMarketConfigData.quiz_summary == null) {
                        intlMarketConfigData.quiz_summary = IntlMarketSummaryData.new_();
                    }
                    if (intlMarketConfigData.quiz_question != null) {
                        break;
                    }
                    intlMarketConfigData.quiz_question = IntlMarketQuestionData.new_();
                    break;
                }
                if (iU == 10) {
                    intlMarketConfigData.meta = (IntlMarketConfigDataMeta) nb5Var.l(IntlMarketConfigDataMeta.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    intlMarketConfigData.entrypoint = (IntlMarketConfigEntrypoint) nb5Var.l(IntlMarketConfigEntrypoint.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    intlMarketConfigData.regular_summary = (IntlMarketSummaryData) nb5Var.l(IntlMarketSummaryData.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    intlMarketConfigData.regular_sticker = (IntlMarketStickerData) nb5Var.l(IntlMarketStickerData.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    intlMarketConfigData.quiz_summary = (IntlMarketSummaryData) nb5Var.l(IntlMarketSummaryData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (intlMarketConfigData.meta == null) {
                            intlMarketConfigData.meta = IntlMarketConfigDataMeta.new_();
                        }
                        if (intlMarketConfigData.entrypoint == null) {
                            intlMarketConfigData.entrypoint = IntlMarketConfigEntrypoint.new_();
                        }
                        if (intlMarketConfigData.regular_summary == null) {
                            intlMarketConfigData.regular_summary = IntlMarketSummaryData.new_();
                        }
                        if (intlMarketConfigData.regular_sticker == null) {
                            intlMarketConfigData.regular_sticker = IntlMarketStickerData.new_();
                        }
                        if (intlMarketConfigData.quiz_summary == null) {
                            intlMarketConfigData.quiz_summary = IntlMarketSummaryData.new_();
                        }
                        if (intlMarketConfigData.quiz_question != null) {
                            break;
                        }
                        intlMarketConfigData.quiz_question = IntlMarketQuestionData.new_();
                        return intlMarketConfigData;
                    }
                    intlMarketConfigData.quiz_question = (IntlMarketQuestionData) nb5Var.l(IntlMarketQuestionData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketConfigData;
        }

        public void serialize(IntlMarketConfigData intlMarketConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlMarketConfigDataMeta intlMarketConfigDataMeta = intlMarketConfigData.meta;
            if (intlMarketConfigDataMeta != null) {
                codedOutputByteBufferNano.K(1, intlMarketConfigDataMeta, IntlMarketConfigDataMeta.PROTOBUF_ADAPTER);
            }
            IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = intlMarketConfigData.entrypoint;
            if (intlMarketConfigEntrypoint != null) {
                codedOutputByteBufferNano.K(2, intlMarketConfigEntrypoint, IntlMarketConfigEntrypoint.PROTOBUF_ADAPTER);
            }
            IntlMarketSummaryData intlMarketSummaryData = intlMarketConfigData.regular_summary;
            if (intlMarketSummaryData != null) {
                codedOutputByteBufferNano.K(3, intlMarketSummaryData, IntlMarketSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketStickerData intlMarketStickerData = intlMarketConfigData.regular_sticker;
            if (intlMarketStickerData != null) {
                codedOutputByteBufferNano.K(4, intlMarketStickerData, IntlMarketStickerData.PROTOBUF_ADAPTER);
            }
            IntlMarketSummaryData intlMarketSummaryData2 = intlMarketConfigData.quiz_summary;
            if (intlMarketSummaryData2 != null) {
                codedOutputByteBufferNano.K(5, intlMarketSummaryData2, IntlMarketSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketQuestionData intlMarketQuestionData = intlMarketConfigData.quiz_question;
            if (intlMarketQuestionData != null) {
                codedOutputByteBufferNano.K(6, intlMarketQuestionData, IntlMarketQuestionData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketConfigData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigData.2
        public Class getDataClass() {
            return IntlMarketConfigData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigData m13576newInstance() {
            return new IntlMarketConfigData();
        }

        public boolean parseField(IntlMarketConfigData intlMarketConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "entrypoint":
                    intlMarketConfigData.entrypoint = (IntlMarketConfigEntrypoint) IntlMarketConfigEntrypoint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    intlMarketConfigData.meta = (IntlMarketConfigDataMeta) IntlMarketConfigDataMeta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quiz_question":
                    intlMarketConfigData.quiz_question = (IntlMarketQuestionData) IntlMarketQuestionData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "regular_sticker":
                    intlMarketConfigData.regular_sticker = (IntlMarketStickerData) IntlMarketStickerData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "regular_summary":
                    intlMarketConfigData.regular_summary = (IntlMarketSummaryData) IntlMarketSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quiz_summary":
                    intlMarketConfigData.quiz_summary = (IntlMarketSummaryData) IntlMarketSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketConfigData intlMarketConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "entrypoint":
                case "meta":
                case "quiz_question":
                case "regular_sticker":
                case "regular_summary":
                case "quiz_summary":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketConfigData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketConfigData intlMarketConfigData, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketConfigData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                IntlMarketConfigDataMeta.JSON_ADAPTER.serialize(intlMarketConfigData.meta, jsonGenerator, true);
            }
            if (intlMarketConfigData.entrypoint != null) {
                jsonGenerator.writeFieldName("entrypoint");
                IntlMarketConfigEntrypoint.JSON_ADAPTER.serialize(intlMarketConfigData.entrypoint, jsonGenerator, true);
            }
            if (intlMarketConfigData.regular_summary != null) {
                jsonGenerator.writeFieldName("regular_summary");
                IntlMarketSummaryData.JSON_ADAPTER.serialize(intlMarketConfigData.regular_summary, jsonGenerator, true);
            }
            if (intlMarketConfigData.regular_sticker != null) {
                jsonGenerator.writeFieldName("regular_sticker");
                IntlMarketStickerData.JSON_ADAPTER.serialize(intlMarketConfigData.regular_sticker, jsonGenerator, true);
            }
            if (intlMarketConfigData.quiz_summary != null) {
                jsonGenerator.writeFieldName("quiz_summary");
                IntlMarketSummaryData.JSON_ADAPTER.serialize(intlMarketConfigData.quiz_summary, jsonGenerator, true);
            }
            if (intlMarketConfigData.quiz_question != null) {
                jsonGenerator.writeFieldName("quiz_question");
                IntlMarketQuestionData.JSON_ADAPTER.serialize(intlMarketConfigData.quiz_question, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigData new_() {
        IntlMarketConfigData intlMarketConfigData = new IntlMarketConfigData();
        intlMarketConfigData.nullCheck();
        return intlMarketConfigData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketConfigData m13574clone() {
        IntlMarketConfigData intlMarketConfigData = new IntlMarketConfigData();
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = this.meta;
        if (intlMarketConfigDataMeta != null) {
            intlMarketConfigData.meta = intlMarketConfigDataMeta.m13578clone();
        }
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = this.entrypoint;
        if (intlMarketConfigEntrypoint != null) {
            intlMarketConfigData.entrypoint = intlMarketConfigEntrypoint.m13582clone();
        }
        IntlMarketSummaryData intlMarketSummaryData = this.regular_summary;
        if (intlMarketSummaryData != null) {
            intlMarketConfigData.regular_summary = intlMarketSummaryData.m13634clone();
        }
        IntlMarketStickerData intlMarketStickerData = this.regular_sticker;
        if (intlMarketStickerData != null) {
            intlMarketConfigData.regular_sticker = intlMarketStickerData.m13626clone();
        }
        IntlMarketSummaryData intlMarketSummaryData2 = this.quiz_summary;
        if (intlMarketSummaryData2 != null) {
            intlMarketConfigData.quiz_summary = intlMarketSummaryData2.m13634clone();
        }
        IntlMarketQuestionData intlMarketQuestionData = this.quiz_question;
        if (intlMarketQuestionData != null) {
            intlMarketConfigData.quiz_question = intlMarketQuestionData.m13590clone();
        }
        return intlMarketConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketConfigData)) {
            return false;
        }
        IntlMarketConfigData intlMarketConfigData = (IntlMarketConfigData) obj;
        return ValueObject.util_equals(this.meta, intlMarketConfigData.meta) && ValueObject.util_equals(this.entrypoint, intlMarketConfigData.entrypoint) && ValueObject.util_equals(this.regular_summary, intlMarketConfigData.regular_summary) && ValueObject.util_equals(this.regular_sticker, intlMarketConfigData.regular_sticker) && ValueObject.util_equals(this.quiz_summary, intlMarketConfigData.quiz_summary) && ValueObject.util_equals(this.quiz_question, intlMarketConfigData.quiz_question);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        IntlMarketConfigDataMeta intlMarketConfigDataMeta = this.meta;
        int iHashCode = (i2 + (intlMarketConfigDataMeta != null ? intlMarketConfigDataMeta.hashCode() : 0)) * 41;
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = this.entrypoint;
        int iHashCode2 = (iHashCode + (intlMarketConfigEntrypoint != null ? intlMarketConfigEntrypoint.hashCode() : 0)) * 41;
        IntlMarketSummaryData intlMarketSummaryData = this.regular_summary;
        int iHashCode3 = (iHashCode2 + (intlMarketSummaryData != null ? intlMarketSummaryData.hashCode() : 0)) * 41;
        IntlMarketStickerData intlMarketStickerData = this.regular_sticker;
        int iHashCode4 = (iHashCode3 + (intlMarketStickerData != null ? intlMarketStickerData.hashCode() : 0)) * 41;
        IntlMarketSummaryData intlMarketSummaryData2 = this.quiz_summary;
        int iHashCode5 = (iHashCode4 + (intlMarketSummaryData2 != null ? intlMarketSummaryData2.hashCode() : 0)) * 41;
        IntlMarketQuestionData intlMarketQuestionData = this.quiz_question;
        int iHashCode6 = iHashCode5 + (intlMarketQuestionData != null ? intlMarketQuestionData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = IntlMarketConfigDataMeta.new_();
        }
        if (this.entrypoint == null) {
            this.entrypoint = IntlMarketConfigEntrypoint.new_();
        }
        if (this.regular_summary == null) {
            this.regular_summary = IntlMarketSummaryData.new_();
        }
        if (this.regular_sticker == null) {
            this.regular_sticker = IntlMarketStickerData.new_();
        }
        if (this.quiz_summary == null) {
            this.quiz_summary = IntlMarketSummaryData.new_();
        }
        if (this.quiz_question == null) {
            this.quiz_question = IntlMarketQuestionData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
