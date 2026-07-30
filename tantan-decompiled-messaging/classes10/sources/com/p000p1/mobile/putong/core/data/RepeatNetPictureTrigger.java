package com.p000p1.mobile.putong.core.data;

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
public class RepeatNetPictureTrigger extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "repeatnetpicturetrigger";

    @ProtobufIndex(index = 7)
    public int aiPictureFrequency;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int cardFeedBackViewLimit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int netPictureFrequency;

    @ProtobufIndex(index = 4)
    public int netPictureSwipeLimit;

    @ProtobufIndex(index = 1)
    public int repeatPictureFrequency;

    @ProtobufIndex(index = 6)
    public boolean showFeedbackInDefaultCard;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int totalFrequency;
    public static ProtobufAdapter<RepeatNetPictureTrigger> PROTOBUF_ADAPTER = new MessageNanoAdapter<RepeatNetPictureTrigger>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureTrigger.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RepeatNetPictureTrigger repeatNetPictureTrigger) {
            int iH = CodedOutputByteBufferNano.h(1, repeatNetPictureTrigger.repeatPictureFrequency) + CodedOutputByteBufferNano.h(2, repeatNetPictureTrigger.netPictureFrequency) + CodedOutputByteBufferNano.h(3, repeatNetPictureTrigger.totalFrequency) + CodedOutputByteBufferNano.h(4, repeatNetPictureTrigger.netPictureSwipeLimit) + CodedOutputByteBufferNano.h(5, repeatNetPictureTrigger.cardFeedBackViewLimit) + CodedOutputByteBufferNano.b(6, repeatNetPictureTrigger.showFeedbackInDefaultCard) + CodedOutputByteBufferNano.h(7, repeatNetPictureTrigger.aiPictureFrequency);
            ((MessageNano) repeatNetPictureTrigger).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RepeatNetPictureTrigger m15407parse(nb5 nb5Var) throws IOException {
            RepeatNetPictureTrigger repeatNetPictureTrigger = new RepeatNetPictureTrigger();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    repeatNetPictureTrigger.repeatPictureFrequency = nb5Var.j();
                } else if (iU == 16) {
                    repeatNetPictureTrigger.netPictureFrequency = nb5Var.j();
                } else if (iU == 24) {
                    repeatNetPictureTrigger.totalFrequency = nb5Var.j();
                } else if (iU == 32) {
                    repeatNetPictureTrigger.netPictureSwipeLimit = nb5Var.j();
                } else if (iU == 40) {
                    repeatNetPictureTrigger.cardFeedBackViewLimit = nb5Var.j();
                } else if (iU == 48) {
                    repeatNetPictureTrigger.showFeedbackInDefaultCard = nb5Var.g();
                } else {
                    if (iU != 56) {
                        return repeatNetPictureTrigger;
                    }
                    repeatNetPictureTrigger.aiPictureFrequency = nb5Var.j();
                }
            }
        }

        public void serialize(RepeatNetPictureTrigger repeatNetPictureTrigger, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, repeatNetPictureTrigger.repeatPictureFrequency);
            codedOutputByteBufferNano.G(2, repeatNetPictureTrigger.netPictureFrequency);
            codedOutputByteBufferNano.G(3, repeatNetPictureTrigger.totalFrequency);
            codedOutputByteBufferNano.G(4, repeatNetPictureTrigger.netPictureSwipeLimit);
            codedOutputByteBufferNano.G(5, repeatNetPictureTrigger.cardFeedBackViewLimit);
            codedOutputByteBufferNano.A(6, repeatNetPictureTrigger.showFeedbackInDefaultCard);
            codedOutputByteBufferNano.G(7, repeatNetPictureTrigger.aiPictureFrequency);
        }
    };
    public static JsonAdapter<RepeatNetPictureTrigger> JSON_ADAPTER = new ObjectJsonAdapter<RepeatNetPictureTrigger>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureTrigger.2
        public Class getDataClass() {
            return RepeatNetPictureTrigger.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RepeatNetPictureTrigger m15408newInstance() {
            return new RepeatNetPictureTrigger();
        }

        public boolean parseField(RepeatNetPictureTrigger repeatNetPictureTrigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "repeatPictureFrequency":
                    repeatNetPictureTrigger.repeatPictureFrequency = jsonParser.getValueAsInt();
                    return true;
                case "netPictureFrequency":
                    repeatNetPictureTrigger.netPictureFrequency = jsonParser.getValueAsInt();
                    return true;
                case "cardFeedBackViewLimit":
                    repeatNetPictureTrigger.cardFeedBackViewLimit = jsonParser.getValueAsInt();
                    return true;
                case "aiPictureFrequency":
                    repeatNetPictureTrigger.aiPictureFrequency = jsonParser.getValueAsInt();
                    return true;
                case "totalFrequency":
                    repeatNetPictureTrigger.totalFrequency = jsonParser.getValueAsInt();
                    return true;
                case "netPictureSwipeLimit":
                    repeatNetPictureTrigger.netPictureSwipeLimit = jsonParser.getValueAsInt();
                    return true;
                case "showFeedbackInDefaultCard":
                    repeatNetPictureTrigger.showFeedbackInDefaultCard = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RepeatNetPictureTrigger repeatNetPictureTrigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "repeatPictureFrequency":
                case "netPictureFrequency":
                case "cardFeedBackViewLimit":
                case "aiPictureFrequency":
                case "totalFrequency":
                case "netPictureSwipeLimit":
                case "showFeedbackInDefaultCard":
                    return true;
                default:
                    return super.parseFieldCheck(repeatNetPictureTrigger, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RepeatNetPictureTrigger repeatNetPictureTrigger, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("repeatPictureFrequency", repeatNetPictureTrigger.repeatPictureFrequency);
            jsonGenerator.writeNumberField("netPictureFrequency", repeatNetPictureTrigger.netPictureFrequency);
            jsonGenerator.writeNumberField("totalFrequency", repeatNetPictureTrigger.totalFrequency);
            jsonGenerator.writeNumberField("netPictureSwipeLimit", repeatNetPictureTrigger.netPictureSwipeLimit);
            jsonGenerator.writeNumberField("cardFeedBackViewLimit", repeatNetPictureTrigger.cardFeedBackViewLimit);
            jsonGenerator.writeBooleanField("showFeedbackInDefaultCard", repeatNetPictureTrigger.showFeedbackInDefaultCard);
            jsonGenerator.writeNumberField("aiPictureFrequency", repeatNetPictureTrigger.aiPictureFrequency);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RepeatNetPictureTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RepeatNetPictureTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RepeatNetPictureTrigger new_() {
        RepeatNetPictureTrigger repeatNetPictureTrigger = new RepeatNetPictureTrigger();
        repeatNetPictureTrigger.nullCheck();
        return repeatNetPictureTrigger;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RepeatNetPictureTrigger m15406clone() {
        RepeatNetPictureTrigger repeatNetPictureTrigger = new RepeatNetPictureTrigger();
        repeatNetPictureTrigger.repeatPictureFrequency = this.repeatPictureFrequency;
        repeatNetPictureTrigger.netPictureFrequency = this.netPictureFrequency;
        repeatNetPictureTrigger.totalFrequency = this.totalFrequency;
        repeatNetPictureTrigger.netPictureSwipeLimit = this.netPictureSwipeLimit;
        repeatNetPictureTrigger.cardFeedBackViewLimit = this.cardFeedBackViewLimit;
        repeatNetPictureTrigger.showFeedbackInDefaultCard = this.showFeedbackInDefaultCard;
        repeatNetPictureTrigger.aiPictureFrequency = this.aiPictureFrequency;
        return repeatNetPictureTrigger;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RepeatNetPictureTrigger)) {
            return false;
        }
        RepeatNetPictureTrigger repeatNetPictureTrigger = (RepeatNetPictureTrigger) obj;
        return this.repeatPictureFrequency == repeatNetPictureTrigger.repeatPictureFrequency && this.netPictureFrequency == repeatNetPictureTrigger.netPictureFrequency && this.totalFrequency == repeatNetPictureTrigger.totalFrequency && this.netPictureSwipeLimit == repeatNetPictureTrigger.netPictureSwipeLimit && this.cardFeedBackViewLimit == repeatNetPictureTrigger.cardFeedBackViewLimit && this.showFeedbackInDefaultCard == repeatNetPictureTrigger.showFeedbackInDefaultCard && this.aiPictureFrequency == repeatNetPictureTrigger.aiPictureFrequency;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + this.repeatPictureFrequency) * 41) + this.netPictureFrequency) * 41) + this.totalFrequency) * 41) + this.netPictureSwipeLimit) * 41) + this.cardFeedBackViewLimit) * 41) + (this.showFeedbackInDefaultCard ? 1231 : 1237)) * 41) + this.aiPictureFrequency;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
