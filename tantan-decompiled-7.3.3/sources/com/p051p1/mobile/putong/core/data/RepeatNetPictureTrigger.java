package com.p051p1.mobile.putong.core.data;

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
public class RepeatNetPictureTrigger extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "repeatnetpicturetrigger";

    @ProtobufIndex(index = 7)
    public int aiPictureFrequency;

    @ProtobufIndex(index = 5)
    public int cardFeedBackViewLimit;

    @ProtobufIndex(index = 2)
    public int netPictureFrequency;

    @ProtobufIndex(index = 4)
    public int netPictureSwipeLimit;

    @ProtobufIndex(index = 1)
    public int repeatPictureFrequency;

    @ProtobufIndex(index = 6)
    public boolean showFeedbackInDefaultCard;

    @ProtobufIndex(index = 3)
    public int totalFrequency;
    public static ProtobufAdapter<RepeatNetPictureTrigger> PROTOBUF_ADAPTER = new MessageNanoAdapter<RepeatNetPictureTrigger>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureTrigger.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RepeatNetPictureTrigger repeatNetPictureTrigger) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, repeatNetPictureTrigger.repeatPictureFrequency) + CodedOutputByteBufferNano.m17281h(2, repeatNetPictureTrigger.netPictureFrequency) + CodedOutputByteBufferNano.m17281h(3, repeatNetPictureTrigger.totalFrequency) + CodedOutputByteBufferNano.m17281h(4, repeatNetPictureTrigger.netPictureSwipeLimit) + CodedOutputByteBufferNano.m17281h(5, repeatNetPictureTrigger.cardFeedBackViewLimit) + CodedOutputByteBufferNano.m17275b(6, repeatNetPictureTrigger.showFeedbackInDefaultCard) + CodedOutputByteBufferNano.m17281h(7, repeatNetPictureTrigger.aiPictureFrequency);
            repeatNetPictureTrigger.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RepeatNetPictureTrigger parse(nc5 nc5Var) throws IOException {
            RepeatNetPictureTrigger repeatNetPictureTrigger = new RepeatNetPictureTrigger();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    repeatNetPictureTrigger.repeatPictureFrequency = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    repeatNetPictureTrigger.netPictureFrequency = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    repeatNetPictureTrigger.totalFrequency = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    repeatNetPictureTrigger.netPictureSwipeLimit = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    repeatNetPictureTrigger.cardFeedBackViewLimit = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    repeatNetPictureTrigger.showFeedbackInDefaultCard = nc5Var.m162483g();
                } else {
                    if (iM162497u != 56) {
                        return repeatNetPictureTrigger;
                    }
                    repeatNetPictureTrigger.aiPictureFrequency = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RepeatNetPictureTrigger repeatNetPictureTrigger, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, repeatNetPictureTrigger.repeatPictureFrequency);
            codedOutputByteBufferNano.m17305G(2, repeatNetPictureTrigger.netPictureFrequency);
            codedOutputByteBufferNano.m17305G(3, repeatNetPictureTrigger.totalFrequency);
            codedOutputByteBufferNano.m17305G(4, repeatNetPictureTrigger.netPictureSwipeLimit);
            codedOutputByteBufferNano.m17305G(5, repeatNetPictureTrigger.cardFeedBackViewLimit);
            codedOutputByteBufferNano.m17299A(6, repeatNetPictureTrigger.showFeedbackInDefaultCard);
            codedOutputByteBufferNano.m17305G(7, repeatNetPictureTrigger.aiPictureFrequency);
        }
    };
    public static JsonAdapter<RepeatNetPictureTrigger> JSON_ADAPTER = new ObjectJsonAdapter<RepeatNetPictureTrigger>() { // from class: com.p1.mobile.putong.core.data.RepeatNetPictureTrigger.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RepeatNetPictureTrigger.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RepeatNetPictureTrigger newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RepeatNetPictureTrigger repeatNetPictureTrigger, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("repeatPictureFrequency", repeatNetPictureTrigger.repeatPictureFrequency);
            jsonGenerator.writeNumberField("netPictureFrequency", repeatNetPictureTrigger.netPictureFrequency);
            jsonGenerator.writeNumberField("totalFrequency", repeatNetPictureTrigger.totalFrequency);
            jsonGenerator.writeNumberField("netPictureSwipeLimit", repeatNetPictureTrigger.netPictureSwipeLimit);
            jsonGenerator.writeNumberField("cardFeedBackViewLimit", repeatNetPictureTrigger.cardFeedBackViewLimit);
            jsonGenerator.writeBooleanField("showFeedbackInDefaultCard", repeatNetPictureTrigger.showFeedbackInDefaultCard);
            jsonGenerator.writeNumberField("aiPictureFrequency", repeatNetPictureTrigger.aiPictureFrequency);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RepeatNetPictureTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RepeatNetPictureTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RepeatNetPictureTrigger new_() {
        RepeatNetPictureTrigger repeatNetPictureTrigger = new RepeatNetPictureTrigger();
        repeatNetPictureTrigger.nullCheck();
        return repeatNetPictureTrigger;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RepeatNetPictureTrigger mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + this.repeatPictureFrequency) * 41) + this.netPictureFrequency) * 41) + this.totalFrequency) * 41) + this.netPictureSwipeLimit) * 41) + this.cardFeedBackViewLimit) * 41) + (this.showFeedbackInDefaultCard ? 1231 : 1237)) * 41) + this.aiPictureFrequency;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
