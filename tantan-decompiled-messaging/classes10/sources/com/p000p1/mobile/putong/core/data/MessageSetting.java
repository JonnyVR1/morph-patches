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
public class MessageSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagesetting";

    @ProtobufIndex(index = 1)
    public boolean anonymous;
    public static ProtobufAdapter<MessageSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageSetting>() { // from class: com.p1.mobile.putong.core.data.MessageSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageSetting messageSetting) {
            int iB = CodedOutputByteBufferNano.b(1, messageSetting.anonymous);
            ((MessageNano) messageSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageSetting m14267parse(nb5 nb5Var) throws IOException {
            MessageSetting messageSetting = new MessageSetting();
            while (nb5Var.u() == 8) {
                messageSetting.anonymous = nb5Var.g();
            }
            return messageSetting;
        }

        public void serialize(MessageSetting messageSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageSetting.anonymous);
        }
    };
    public static JsonAdapter<MessageSetting> JSON_ADAPTER = new ObjectJsonAdapter<MessageSetting>() { // from class: com.p1.mobile.putong.core.data.MessageSetting.2
        public Class getDataClass() {
            return MessageSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageSetting m14268newInstance() {
            return new MessageSetting();
        }

        public boolean parseField(MessageSetting messageSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("anonymous")) {
                return false;
            }
            messageSetting.anonymous = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MessageSetting messageSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("anonymous")) {
                return true;
            }
            return super.parseFieldCheck(messageSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageSetting messageSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("anonymous", messageSetting.anonymous);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageSetting new_() {
        MessageSetting messageSetting = new MessageSetting();
        messageSetting.nullCheck();
        return messageSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageSetting m14266clone() {
        MessageSetting messageSetting = new MessageSetting();
        messageSetting.anonymous = this.anonymous;
        return messageSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MessageSetting) && this.anonymous == ((MessageSetting) obj).anonymous;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.anonymous ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
