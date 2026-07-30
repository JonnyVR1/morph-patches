package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MessageTopicMomentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetopicmomentinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21191id;
    public static ProtobufAdapter<MessageTopicMomentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTopicMomentInfo>() { // from class: com.p1.mobile.putong.core.data.MessageTopicMomentInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageTopicMomentInfo messageTopicMomentInfo) {
            String str = messageTopicMomentInfo.f21191id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            messageTopicMomentInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageTopicMomentInfo parse(nc5 nc5Var) throws IOException {
            MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageTopicMomentInfo.f21191id != null) {
                        break;
                    }
                    messageTopicMomentInfo.f21191id = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (messageTopicMomentInfo.f21191id != null) {
                        break;
                    }
                    messageTopicMomentInfo.f21191id = "";
                    return messageTopicMomentInfo;
                }
                messageTopicMomentInfo.f21191id = nc5Var.m162495s();
            }
            return messageTopicMomentInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageTopicMomentInfo messageTopicMomentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTopicMomentInfo.f21191id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageTopicMomentInfo> JSON_ADAPTER = new ObjectJsonAdapter<MessageTopicMomentInfo>() { // from class: com.p1.mobile.putong.core.data.MessageTopicMomentInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageTopicMomentInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageTopicMomentInfo newInstance() {
            return new MessageTopicMomentInfo();
        }

        public boolean parseField(MessageTopicMomentInfo messageTopicMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            messageTopicMomentInfo.f21191id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(MessageTopicMomentInfo messageTopicMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(messageTopicMomentInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageTopicMomentInfo messageTopicMomentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = messageTopicMomentInfo.f21191id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTopicMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTopicMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTopicMomentInfo new_() {
        MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
        messageTopicMomentInfo.nullCheck();
        return messageTopicMomentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageTopicMomentInfo mo225055clone() {
        MessageTopicMomentInfo messageTopicMomentInfo = new MessageTopicMomentInfo();
        messageTopicMomentInfo.f21191id = this.f21191id;
        return messageTopicMomentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageTopicMomentInfo) {
            return ValueObject.util_equals(this.f21191id, ((MessageTopicMomentInfo) obj).f21191id);
        }
        return false;
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
        int i2 = i * 41;
        String str = this.f21191id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21191id == null) {
            this.f21191id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
