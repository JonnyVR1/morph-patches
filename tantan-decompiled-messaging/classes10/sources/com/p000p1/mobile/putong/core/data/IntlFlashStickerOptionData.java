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
public class IntlFlashStickerOptionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlflashstickeroptiondata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean active;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public IntlFlashStickerDialogSummaryData dialog_ui;

    @ProtobufIndex(index = 4)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 6)
    public IntlMarketStickerOptionsData option_data;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long remain;

    @ProtobufIndex(index = 1)
    public int type;
    public static ProtobufAdapter<IntlFlashStickerOptionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlFlashStickerOptionData>() { // from class: com.p1.mobile.putong.core.data.IntlFlashStickerOptionData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlFlashStickerOptionData intlFlashStickerOptionData) {
            int iH = CodedOutputByteBufferNano.h(1, intlFlashStickerOptionData.type) + CodedOutputByteBufferNano.b(2, intlFlashStickerOptionData.active) + CodedOutputByteBufferNano.j(3, intlFlashStickerOptionData.remain) + CodedOutputByteBufferNano.j(4, intlFlashStickerOptionData.duration);
            IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = intlFlashStickerOptionData.dialog_ui;
            if (intlFlashStickerDialogSummaryData != null) {
                iH += CodedOutputByteBufferNano.l(5, intlFlashStickerDialogSummaryData, IntlFlashStickerDialogSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketStickerOptionsData intlMarketStickerOptionsData = intlFlashStickerOptionData.option_data;
            if (intlMarketStickerOptionsData != null) {
                iH += CodedOutputByteBufferNano.l(6, intlMarketStickerOptionsData, IntlMarketStickerOptionsData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlFlashStickerOptionData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlFlashStickerOptionData m13555parse(nb5 nb5Var) throws IOException {
            IntlFlashStickerOptionData intlFlashStickerOptionData = new IntlFlashStickerOptionData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlFlashStickerOptionData.dialog_ui == null) {
                        intlFlashStickerOptionData.dialog_ui = IntlFlashStickerDialogSummaryData.new_();
                    }
                    if (intlFlashStickerOptionData.option_data != null) {
                        break;
                    }
                    intlFlashStickerOptionData.option_data = IntlMarketStickerOptionsData.new_();
                    break;
                }
                if (iU == 8) {
                    intlFlashStickerOptionData.type = nb5Var.j();
                } else if (iU == 16) {
                    intlFlashStickerOptionData.active = nb5Var.g();
                } else if (iU == 24) {
                    intlFlashStickerOptionData.remain = nb5Var.k();
                } else if (iU == 32) {
                    intlFlashStickerOptionData.duration = nb5Var.k();
                } else if (iU == 42) {
                    intlFlashStickerOptionData.dialog_ui = (IntlFlashStickerDialogSummaryData) nb5Var.l(IntlFlashStickerDialogSummaryData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (intlFlashStickerOptionData.dialog_ui == null) {
                            intlFlashStickerOptionData.dialog_ui = IntlFlashStickerDialogSummaryData.new_();
                        }
                        if (intlFlashStickerOptionData.option_data != null) {
                            break;
                        }
                        intlFlashStickerOptionData.option_data = IntlMarketStickerOptionsData.new_();
                        return intlFlashStickerOptionData;
                    }
                    intlFlashStickerOptionData.option_data = (IntlMarketStickerOptionsData) nb5Var.l(IntlMarketStickerOptionsData.PROTOBUF_ADAPTER);
                }
            }
            return intlFlashStickerOptionData;
        }

        public void serialize(IntlFlashStickerOptionData intlFlashStickerOptionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlFlashStickerOptionData.type);
            codedOutputByteBufferNano.A(2, intlFlashStickerOptionData.active);
            codedOutputByteBufferNano.I(3, intlFlashStickerOptionData.remain);
            codedOutputByteBufferNano.I(4, intlFlashStickerOptionData.duration);
            IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = intlFlashStickerOptionData.dialog_ui;
            if (intlFlashStickerDialogSummaryData != null) {
                codedOutputByteBufferNano.K(5, intlFlashStickerDialogSummaryData, IntlFlashStickerDialogSummaryData.PROTOBUF_ADAPTER);
            }
            IntlMarketStickerOptionsData intlMarketStickerOptionsData = intlFlashStickerOptionData.option_data;
            if (intlMarketStickerOptionsData != null) {
                codedOutputByteBufferNano.K(6, intlMarketStickerOptionsData, IntlMarketStickerOptionsData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlFlashStickerOptionData> JSON_ADAPTER = new ObjectJsonAdapter<IntlFlashStickerOptionData>() { // from class: com.p1.mobile.putong.core.data.IntlFlashStickerOptionData.2
        public Class getDataClass() {
            return IntlFlashStickerOptionData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlFlashStickerOptionData m13556newInstance() {
            return new IntlFlashStickerOptionData();
        }

        public boolean parseField(IntlFlashStickerOptionData intlFlashStickerOptionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    intlFlashStickerOptionData.duration = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    intlFlashStickerOptionData.active = jsonParser.getValueAsBoolean();
                    return true;
                case "remain":
                    intlFlashStickerOptionData.remain = jsonParser.getValueAsLong();
                    return true;
                case "option_data":
                    intlFlashStickerOptionData.option_data = (IntlMarketStickerOptionsData) IntlMarketStickerOptionsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    intlFlashStickerOptionData.type = jsonParser.getValueAsInt();
                    return true;
                case "dialog_ui":
                    intlFlashStickerOptionData.dialog_ui = (IntlFlashStickerDialogSummaryData) IntlFlashStickerDialogSummaryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlFlashStickerOptionData intlFlashStickerOptionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "active":
                case "remain":
                case "option_data":
                case "type":
                case "dialog_ui":
                    return true;
                default:
                    return super.parseFieldCheck(intlFlashStickerOptionData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlFlashStickerOptionData intlFlashStickerOptionData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("type", intlFlashStickerOptionData.type);
            jsonGenerator.writeBooleanField(Active.TYPE, intlFlashStickerOptionData.active);
            jsonGenerator.writeNumberField("remain", intlFlashStickerOptionData.remain);
            jsonGenerator.writeNumberField("duration", intlFlashStickerOptionData.duration);
            if (intlFlashStickerOptionData.dialog_ui != null) {
                jsonGenerator.writeFieldName("dialog_ui");
                IntlFlashStickerDialogSummaryData.JSON_ADAPTER.serialize(intlFlashStickerOptionData.dialog_ui, jsonGenerator, true);
            }
            if (intlFlashStickerOptionData.option_data != null) {
                jsonGenerator.writeFieldName("option_data");
                IntlMarketStickerOptionsData.JSON_ADAPTER.serialize(intlFlashStickerOptionData.option_data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlFlashStickerOptionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlFlashStickerOptionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlFlashStickerOptionData new_() {
        IntlFlashStickerOptionData intlFlashStickerOptionData = new IntlFlashStickerOptionData();
        intlFlashStickerOptionData.nullCheck();
        return intlFlashStickerOptionData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlFlashStickerOptionData m13554clone() {
        IntlFlashStickerOptionData intlFlashStickerOptionData = new IntlFlashStickerOptionData();
        intlFlashStickerOptionData.type = this.type;
        intlFlashStickerOptionData.active = this.active;
        intlFlashStickerOptionData.remain = this.remain;
        intlFlashStickerOptionData.duration = this.duration;
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = this.dialog_ui;
        if (intlFlashStickerDialogSummaryData != null) {
            intlFlashStickerOptionData.dialog_ui = intlFlashStickerDialogSummaryData.m13550clone();
        }
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = this.option_data;
        if (intlMarketStickerOptionsData != null) {
            intlFlashStickerOptionData.option_data = intlMarketStickerOptionsData.m13630clone();
        }
        return intlFlashStickerOptionData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlFlashStickerOptionData)) {
            return false;
        }
        IntlFlashStickerOptionData intlFlashStickerOptionData = (IntlFlashStickerOptionData) obj;
        return this.type == intlFlashStickerOptionData.type && this.active == intlFlashStickerOptionData.active && this.remain == intlFlashStickerOptionData.remain && this.duration == intlFlashStickerOptionData.duration && ValueObject.util_equals(this.dialog_ui, intlFlashStickerOptionData.dialog_ui) && ValueObject.util_equals(this.option_data, intlFlashStickerOptionData.option_data);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.type) * 41) + (this.active ? 1231 : 1237)) * 41;
        long j = this.remain;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        IntlFlashStickerDialogSummaryData intlFlashStickerDialogSummaryData = this.dialog_ui;
        int iHashCode = (i4 + (intlFlashStickerDialogSummaryData != null ? intlFlashStickerDialogSummaryData.hashCode() : 0)) * 41;
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = this.option_data;
        int iHashCode2 = iHashCode + (intlMarketStickerOptionsData != null ? intlMarketStickerOptionsData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.dialog_ui == null) {
            this.dialog_ui = IntlFlashStickerDialogSummaryData.new_();
        }
        if (this.option_data == null) {
            this.option_data = IntlMarketStickerOptionsData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
