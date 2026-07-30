package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatMMDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmdetail";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int level;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double timestamp;
    public static ProtobufAdapter<ChatMMDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMDetail>() { // from class: com.p1.mobile.putong.core.data.ChatMMDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatMMDetail chatMMDetail) {
            int iH = CodedOutputByteBufferNano.h(1, chatMMDetail.mmCnt) + CodedOutputByteBufferNano.h(2, chatMMDetail.level) + CodedOutputByteBufferNano.d(3, chatMMDetail.timestamp);
            ((MessageNano) chatMMDetail).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatMMDetail m12081parse(nb5 nb5Var) throws IOException {
            ChatMMDetail chatMMDetail = new ChatMMDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    chatMMDetail.mmCnt = nb5Var.j();
                } else if (iU == 16) {
                    chatMMDetail.level = nb5Var.j();
                } else {
                    if (iU != 25) {
                        return chatMMDetail;
                    }
                    chatMMDetail.timestamp = nb5Var.h();
                }
            }
        }

        public void serialize(ChatMMDetail chatMMDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, chatMMDetail.mmCnt);
            codedOutputByteBufferNano.G(2, chatMMDetail.level);
            codedOutputByteBufferNano.C(3, chatMMDetail.timestamp);
        }
    };
    public static JsonAdapter<ChatMMDetail> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMDetail>() { // from class: com.p1.mobile.putong.core.data.ChatMMDetail.2
        public Class getDataClass() {
            return ChatMMDetail.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatMMDetail m12082newInstance() {
            return new ChatMMDetail();
        }

        public boolean parseField(ChatMMDetail chatMMDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timestamp":
                    chatMMDetail.timestamp = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "level":
                    chatMMDetail.level = jsonParser.getValueAsInt();
                    return true;
                case "mmCnt":
                    chatMMDetail.mmCnt = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatMMDetail chatMMDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "timestamp":
                case "level":
                case "mmCnt":
                    return true;
                default:
                    return super.parseFieldCheck(chatMMDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatMMDetail chatMMDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", chatMMDetail.mmCnt);
            jsonGenerator.writeNumberField("level", chatMMDetail.level);
            jsonGenerator.writeFieldName("timestamp");
            Converter.API_TIME.serialize(Double.valueOf(chatMMDetail.timestamp), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMDetail new_() {
        ChatMMDetail chatMMDetail = new ChatMMDetail();
        chatMMDetail.nullCheck();
        return chatMMDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatMMDetail m12080clone() {
        ChatMMDetail chatMMDetail = new ChatMMDetail();
        chatMMDetail.mmCnt = this.mmCnt;
        chatMMDetail.level = this.level;
        chatMMDetail.timestamp = this.timestamp;
        return chatMMDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMMDetail)) {
            return false;
        }
        ChatMMDetail chatMMDetail = (ChatMMDetail) obj;
        return this.mmCnt == chatMMDetail.mmCnt && this.level == chatMMDetail.level && this.timestamp == chatMMDetail.timestamp;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.mmCnt) * 41) + this.level;
        long jDoubleToLongBits = Double.doubleToLongBits(this.timestamp);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
