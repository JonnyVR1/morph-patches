package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ChatMMDetail;
import com.p051p1.mobile.putong.data.Converter;
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
import java.util.List;
import org.spongycastle.i18n.ErrorBundle;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ChatMM extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmm";

    @NonNull
    @ProtobufIndex(index = 9)
    public List<ChatMMDetail> details;

    @ProtobufIndex(index = 7)
    public double expireTime;

    @ProtobufIndex(index = 2)
    public int level;

    @ProtobufIndex(index = 8)
    public double matchTime;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @ProtobufIndex(index = 5)
    public boolean partnerSwitch;

    @ProtobufIndex(index = 6)
    public boolean pinChatSuggested;

    @ProtobufIndex(index = 4)
    public boolean sparkSwitch;

    @ProtobufIndex(index = 3)
    public boolean taskGuide;
    public static ProtobufAdapter<ChatMM> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMM>() { // from class: com.p1.mobile.putong.core.data.ChatMM.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatMM chatMM) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, chatMM.mmCnt) + CodedOutputByteBufferNano.m17281h(2, chatMM.level) + CodedOutputByteBufferNano.m17275b(3, chatMM.taskGuide) + CodedOutputByteBufferNano.m17275b(4, chatMM.sparkSwitch) + CodedOutputByteBufferNano.m17275b(5, chatMM.partnerSwitch) + CodedOutputByteBufferNano.m17275b(6, chatMM.pinChatSuggested) + CodedOutputByteBufferNano.m17277d(7, chatMM.expireTime) + CodedOutputByteBufferNano.m17277d(8, chatMM.matchTime);
            List<ChatMMDetail> list = chatMM.details;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, list, ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            chatMM.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatMM parse(nc5 nc5Var) throws IOException {
            ChatMM chatMM = new ChatMM();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatMM.details != null) {
                        break;
                    }
                    chatMM.details = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    chatMM.mmCnt = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    chatMM.level = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    chatMM.taskGuide = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    chatMM.sparkSwitch = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    chatMM.partnerSwitch = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    chatMM.pinChatSuggested = nc5Var.m162483g();
                } else if (iM162497u == 57) {
                    chatMM.expireTime = nc5Var.m162484h();
                } else if (iM162497u == 65) {
                    chatMM.matchTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 74) {
                        if (chatMM.details != null) {
                            break;
                        }
                        chatMM.details = new ArrayList();
                        return chatMM;
                    }
                    chatMM.details = (List) nc5Var.m162488l(ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return chatMM;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatMM chatMM, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, chatMM.mmCnt);
            codedOutputByteBufferNano.m17305G(2, chatMM.level);
            codedOutputByteBufferNano.m17299A(3, chatMM.taskGuide);
            codedOutputByteBufferNano.m17299A(4, chatMM.sparkSwitch);
            codedOutputByteBufferNano.m17299A(5, chatMM.partnerSwitch);
            codedOutputByteBufferNano.m17299A(6, chatMM.pinChatSuggested);
            codedOutputByteBufferNano.m17301C(7, chatMM.expireTime);
            codedOutputByteBufferNano.m17301C(8, chatMM.matchTime);
            List<ChatMMDetail> list = chatMM.details;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(9, list, ChatMMDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatMM> JSON_ADAPTER = new ObjectJsonAdapter<ChatMM>() { // from class: com.p1.mobile.putong.core.data.ChatMM.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatMM.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatMM newInstance() {
            return new ChatMM();
        }

        public boolean parseField(ChatMM chatMM, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pinChatSuggested":
                    chatMM.pinChatSuggested = jsonParser.getValueAsBoolean();
                    return true;
                case "expireTime":
                    chatMM.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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
                    chatMM.matchTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatMM chatMM, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", chatMM.mmCnt);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, chatMM.level);
            jsonGenerator.writeBooleanField("taskGuide", chatMM.taskGuide);
            jsonGenerator.writeBooleanField("sparkSwitch", chatMM.sparkSwitch);
            jsonGenerator.writeBooleanField("partnerSwitch", chatMM.partnerSwitch);
            jsonGenerator.writeBooleanField("pinChatSuggested", chatMM.pinChatSuggested);
            jsonGenerator.writeFieldName("expireTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatMM.expireTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("matchTime");
            jsonAdapter.serialize(Double.valueOf(chatMM.matchTime), jsonGenerator, true);
            if (chatMM.details != null) {
                jsonGenerator.writeFieldName(ErrorBundle.DETAIL_ENTRY);
                JsonAdapter.serializeArray(chatMM.details, jsonGenerator, ChatMMDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMM) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMM) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMM new_() {
        ChatMM chatMM = new ChatMM();
        chatMM.nullCheck();
        return chatMM;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatMM mo225055clone() {
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
            chatMM.details = ValueObject.util_map(list, new qcj() { // from class: l.oy4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChatMMDetail) obj).mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.details == null) {
            this.details = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
