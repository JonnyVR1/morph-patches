package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatMMDetail;
import com.p1.mobile.putong.data.Converter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatMM extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmm";

    @NonNull
    @ProtobufIndex(index = 9)
    public List<ChatMMDetail> details;

    @ProtobufIndex(index = 7)
    public double expireTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int level;

    @ProtobufIndex(index = 8)
    public double matchTime;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean partnerSwitch;

    @ProtobufIndex(index = 6)
    public boolean pinChatSuggested;

    @ProtobufIndex(index = 4)
    public boolean sparkSwitch;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean taskGuide;
    public static ProtobufAdapter<ChatMM> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMM>() { // from class: com.p1.mobile.putong.core.data.ChatMM.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatMM chatMM) {
            int iH = CodedOutputByteBufferNano.h(1, chatMM.mmCnt) + CodedOutputByteBufferNano.h(2, chatMM.level) + CodedOutputByteBufferNano.b(3, chatMM.taskGuide) + CodedOutputByteBufferNano.b(4, chatMM.sparkSwitch) + CodedOutputByteBufferNano.b(5, chatMM.partnerSwitch) + CodedOutputByteBufferNano.b(6, chatMM.pinChatSuggested) + CodedOutputByteBufferNano.d(7, chatMM.expireTime) + CodedOutputByteBufferNano.d(8, chatMM.matchTime);
            List<ChatMMDetail> list = chatMM.details;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(9, list, ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) chatMM).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatMM m12073parse(nb5 nb5Var) throws IOException {
            ChatMM chatMM = new ChatMM();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatMM.details != null) {
                        break;
                    }
                    chatMM.details = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    chatMM.mmCnt = nb5Var.j();
                } else if (iU == 16) {
                    chatMM.level = nb5Var.j();
                } else if (iU == 24) {
                    chatMM.taskGuide = nb5Var.g();
                } else if (iU == 32) {
                    chatMM.sparkSwitch = nb5Var.g();
                } else if (iU == 40) {
                    chatMM.partnerSwitch = nb5Var.g();
                } else if (iU == 48) {
                    chatMM.pinChatSuggested = nb5Var.g();
                } else if (iU == 57) {
                    chatMM.expireTime = nb5Var.h();
                } else if (iU == 65) {
                    chatMM.matchTime = nb5Var.h();
                } else {
                    if (iU != 74) {
                        if (chatMM.details != null) {
                            break;
                        }
                        chatMM.details = new ArrayList();
                        return chatMM;
                    }
                    chatMM.details = (List) nb5Var.l(ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return chatMM;
        }

        public void serialize(ChatMM chatMM, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, chatMM.mmCnt);
            codedOutputByteBufferNano.G(2, chatMM.level);
            codedOutputByteBufferNano.A(3, chatMM.taskGuide);
            codedOutputByteBufferNano.A(4, chatMM.sparkSwitch);
            codedOutputByteBufferNano.A(5, chatMM.partnerSwitch);
            codedOutputByteBufferNano.A(6, chatMM.pinChatSuggested);
            codedOutputByteBufferNano.C(7, chatMM.expireTime);
            codedOutputByteBufferNano.C(8, chatMM.matchTime);
            List<ChatMMDetail> list = chatMM.details;
            if (list != null) {
                codedOutputByteBufferNano.K(9, list, ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatMM> JSON_ADAPTER = new ObjectJsonAdapter<ChatMM>() { // from class: com.p1.mobile.putong.core.data.ChatMM.2
        public Class getDataClass() {
            return ChatMM.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatMM m12074newInstance() {
            return new ChatMM();
        }

        public boolean parseField(ChatMM chatMM, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pinChatSuggested":
                    chatMM.pinChatSuggested = jsonParser.getValueAsBoolean();
                    return true;
                case "expireTime":
                    chatMM.expireTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "sparkSwitch":
                    chatMM.sparkSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "level":
                    chatMM.level = jsonParser.getValueAsInt();
                    return true;
                case "mmCnt":
                    chatMM.mmCnt = jsonParser.getValueAsInt();
                    return true;
                case "taskGuide":
                    chatMM.taskGuide = jsonParser.getValueAsBoolean();
                    return true;
                case "partnerSwitch":
                    chatMM.partnerSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "matchTime":
                    chatMM.matchTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "details":
                    chatMM.details = JsonAdapter.parseArray(jsonParser, ChatMMDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatMM chatMM, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pinChatSuggested":
                case "expireTime":
                case "sparkSwitch":
                case "level":
                case "mmCnt":
                case "taskGuide":
                case "partnerSwitch":
                case "matchTime":
                case "details":
                    return true;
                default:
                    return super.parseFieldCheck(chatMM, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatMM chatMM, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", chatMM.mmCnt);
            jsonGenerator.writeNumberField("level", chatMM.level);
            jsonGenerator.writeBooleanField("taskGuide", chatMM.taskGuide);
            jsonGenerator.writeBooleanField("sparkSwitch", chatMM.sparkSwitch);
            jsonGenerator.writeBooleanField("partnerSwitch", chatMM.partnerSwitch);
            jsonGenerator.writeBooleanField("pinChatSuggested", chatMM.pinChatSuggested);
            jsonGenerator.writeFieldName("expireTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatMM.expireTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("matchTime");
            jsonAdapter.serialize(Double.valueOf(chatMM.matchTime), jsonGenerator, true);
            if (chatMM.details != null) {
                jsonGenerator.writeFieldName("details");
                JsonAdapter.serializeArray(chatMM.details, jsonGenerator, ChatMMDetail.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMM) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMM) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMM new_() {
        ChatMM chatMM = new ChatMM();
        chatMM.nullCheck();
        return chatMM;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatMM m12072clone() {
        ChatMM chatMM = new ChatMM();
        chatMM.mmCnt = this.mmCnt;
        chatMM.level = this.level;
        chatMM.taskGuide = this.taskGuide;
        chatMM.sparkSwitch = this.sparkSwitch;
        chatMM.partnerSwitch = this.partnerSwitch;
        chatMM.pinChatSuggested = this.pinChatSuggested;
        chatMM.expireTime = this.expireTime;
        chatMM.matchTime = this.matchTime;
        List<ChatMMDetail> list = this.details;
        if (list != null) {
            chatMM.details = ValueObject.util_map(list, new w9j() { // from class: l.px4
                public final Object call(Object obj) {
                    return ((ChatMMDetail) obj).m12080clone();
                }
            });
        }
        return chatMM;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMM)) {
            return false;
        }
        ChatMM chatMM = (ChatMM) obj;
        return this.mmCnt == chatMM.mmCnt && this.level == chatMM.level && this.taskGuide == chatMM.taskGuide && this.sparkSwitch == chatMM.sparkSwitch && this.partnerSwitch == chatMM.partnerSwitch && this.pinChatSuggested == chatMM.pinChatSuggested && this.expireTime == chatMM.expireTime && this.matchTime == chatMM.matchTime && ValueObject.util_equals(this.details, chatMM.details);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((((i * 41) + this.mmCnt) * 41) + this.level) * 41) + (this.taskGuide ? 1231 : 1237)) * 41) + (this.sparkSwitch ? 1231 : 1237)) * 41) + (this.partnerSwitch ? 1231 : 1237)) * 41;
        int i3 = this.pinChatSuggested ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i4 = ((i2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.matchTime);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        List<ChatMMDetail> list = this.details;
        int iHashCode = i5 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.details == null) {
            this.details = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
