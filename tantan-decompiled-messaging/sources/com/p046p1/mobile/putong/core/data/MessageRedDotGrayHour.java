package com.p046p1.mobile.putong.core.data;

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
public class MessageRedDotGrayHour extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagereddotgrayhour";

    @ProtobufIndex(index = 2)
    public int patch_max;

    @ProtobufIndex(index = 1)
    public int red_dot_gray_hour;
    public static ProtobufAdapter<MessageRedDotGrayHour> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedDotGrayHour>() { // from class: com.p1.mobile.putong.core.data.MessageRedDotGrayHour.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageRedDotGrayHour messageRedDotGrayHour) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, messageRedDotGrayHour.red_dot_gray_hour) + CodedOutputByteBufferNano.m17226h(2, messageRedDotGrayHour.patch_max);
            messageRedDotGrayHour.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageRedDotGrayHour parse(nb5 nb5Var) throws IOException {
            MessageRedDotGrayHour messageRedDotGrayHour = new MessageRedDotGrayHour();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    messageRedDotGrayHour.red_dot_gray_hour = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return messageRedDotGrayHour;
                    }
                    messageRedDotGrayHour.patch_max = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageRedDotGrayHour messageRedDotGrayHour, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, messageRedDotGrayHour.red_dot_gray_hour);
            codedOutputByteBufferNano.m17250G(2, messageRedDotGrayHour.patch_max);
        }
    };
    public static JsonAdapter<MessageRedDotGrayHour> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedDotGrayHour>() { // from class: com.p1.mobile.putong.core.data.MessageRedDotGrayHour.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageRedDotGrayHour.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageRedDotGrayHour newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageRedDotGrayHour messageRedDotGrayHour, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("red_dot_gray_hour", messageRedDotGrayHour.red_dot_gray_hour);
            jsonGenerator.writeNumberField("patch_max", messageRedDotGrayHour.patch_max);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedDotGrayHour) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedDotGrayHour) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedDotGrayHour new_() {
        MessageRedDotGrayHour messageRedDotGrayHour = new MessageRedDotGrayHour();
        messageRedDotGrayHour.nullCheck();
        return messageRedDotGrayHour;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageRedDotGrayHour mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.red_dot_gray_hour) * 41) + this.patch_max;
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
