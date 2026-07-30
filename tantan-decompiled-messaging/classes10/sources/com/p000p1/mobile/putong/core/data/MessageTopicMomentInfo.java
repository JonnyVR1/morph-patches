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
public class MessageTopicMomentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetopicmomentinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f111id;
    public static ProtobufAdapter<MessageTopicMomentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTopicMomentInfo>() { // from class: com.p1.mobile.putong.core.data.MessageTopicMomentInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageTopicMomentInfo messageTopicMomentInfo) {
            String str = messageTopicMomentInfo.f111id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) messageTopicMomentInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageTopicMomentInfo m14293parse(nb5 nb5Var) throws IOException {
            MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageTopicMomentInfo.f111id != null) {
                        break;
                    }
                    messageTopicMomentInfo.f111id = "";
                    break;
                }
                if (iU != 10) {
                    if (messageTopicMomentInfo.f111id != null) {
                        break;
                    }
                    messageTopicMomentInfo.f111id = "";
                    return messageTopicMomentInfo;
                }
                messageTopicMomentInfo.f111id = nb5Var.s();
            }
            return messageTopicMomentInfo;
        }

        public void serialize(MessageTopicMomentInfo messageTopicMomentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTopicMomentInfo.f111id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageTopicMomentInfo> JSON_ADAPTER = new ObjectJsonAdapter<MessageTopicMomentInfo>() { // from class: com.p1.mobile.putong.core.data.MessageTopicMomentInfo.2
        public Class getDataClass() {
            return MessageTopicMomentInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageTopicMomentInfo m14294newInstance() {
            return new MessageTopicMomentInfo();
        }

        public boolean parseField(MessageTopicMomentInfo messageTopicMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            messageTopicMomentInfo.f111id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(MessageTopicMomentInfo messageTopicMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(messageTopicMomentInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageTopicMomentInfo messageTopicMomentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = messageTopicMomentInfo.f111id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTopicMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTopicMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTopicMomentInfo new_() {
        MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
        messageTopicMomentInfo.nullCheck();
        return messageTopicMomentInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageTopicMomentInfo m14292clone() {
        MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
        messageTopicMomentInfo.f111id = this.f111id;
        return messageTopicMomentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageTopicMomentInfo) {
            return ValueObject.util_equals(this.f111id, ((MessageTopicMomentInfo) obj).f111id);
        }
        return false;
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
        String str = this.f111id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f111id == null) {
            this.f111id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
