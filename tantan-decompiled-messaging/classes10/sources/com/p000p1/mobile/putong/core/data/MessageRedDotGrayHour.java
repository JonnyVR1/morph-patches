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
public class MessageRedDotGrayHour extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagereddotgrayhour";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int patch_max;

    @ProtobufIndex(index = 1)
    public int red_dot_gray_hour;
    public static ProtobufAdapter<MessageRedDotGrayHour> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedDotGrayHour>() { // from class: com.p1.mobile.putong.core.data.MessageRedDotGrayHour.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageRedDotGrayHour messageRedDotGrayHour) {
            int iH = CodedOutputByteBufferNano.h(1, messageRedDotGrayHour.red_dot_gray_hour) + CodedOutputByteBufferNano.h(2, messageRedDotGrayHour.patch_max);
            ((MessageNano) messageRedDotGrayHour).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageRedDotGrayHour m14241parse(nb5 nb5Var) throws IOException {
            MessageRedDotGrayHour messageRedDotGrayHour = new MessageRedDotGrayHour();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    messageRedDotGrayHour.red_dot_gray_hour = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return messageRedDotGrayHour;
                    }
                    messageRedDotGrayHour.patch_max = nb5Var.j();
                }
            }
        }

        public void serialize(MessageRedDotGrayHour messageRedDotGrayHour, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, messageRedDotGrayHour.red_dot_gray_hour);
            codedOutputByteBufferNano.G(2, messageRedDotGrayHour.patch_max);
        }
    };
    public static JsonAdapter<MessageRedDotGrayHour> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedDotGrayHour>() { // from class: com.p1.mobile.putong.core.data.MessageRedDotGrayHour.2
        public Class getDataClass() {
            return MessageRedDotGrayHour.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageRedDotGrayHour m14242newInstance() {
            return new MessageRedDotGrayHour();
        }

        public boolean parseField(MessageRedDotGrayHour messageRedDotGrayHour, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("patch_max")) {
                messageRedDotGrayHour.patch_max = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("red_dot_gray_hour")) {
                return false;
            }
            messageRedDotGrayHour.red_dot_gray_hour = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MessageRedDotGrayHour messageRedDotGrayHour, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("patch_max") || str.equals("red_dot_gray_hour")) {
                return true;
            }
            return super.parseFieldCheck(messageRedDotGrayHour, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageRedDotGrayHour messageRedDotGrayHour, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("red_dot_gray_hour", messageRedDotGrayHour.red_dot_gray_hour);
            jsonGenerator.writeNumberField("patch_max", messageRedDotGrayHour.patch_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedDotGrayHour) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedDotGrayHour) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedDotGrayHour new_() {
        MessageRedDotGrayHour messageRedDotGrayHour = new MessageRedDotGrayHour();
        messageRedDotGrayHour.nullCheck();
        return messageRedDotGrayHour;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageRedDotGrayHour m14240clone() {
        MessageRedDotGrayHour messageRedDotGrayHour = new MessageRedDotGrayHour();
        messageRedDotGrayHour.red_dot_gray_hour = this.red_dot_gray_hour;
        messageRedDotGrayHour.patch_max = this.patch_max;
        return messageRedDotGrayHour;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageRedDotGrayHour)) {
            return false;
        }
        MessageRedDotGrayHour messageRedDotGrayHour = (MessageRedDotGrayHour) obj;
        return this.red_dot_gray_hour == messageRedDotGrayHour.red_dot_gray_hour && this.patch_max == messageRedDotGrayHour.patch_max;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.red_dot_gray_hour) * 41) + this.patch_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
