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
public class MessageTips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetips";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MessageTipsContent otherShown;

    @NonNull
    @ProtobufIndex(index = 1)
    public MessageTipsContent selfShown;
    public static ProtobufAdapter<MessageTips> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTips>() { // from class: com.p1.mobile.putong.core.data.MessageTips.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageTips messageTips) {
            MessageTipsContent messageTipsContent = messageTips.selfShown;
            int iL = messageTipsContent != null ? CodedOutputByteBufferNano.l(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER) : 0;
            MessageTipsContent messageTipsContent2 = messageTips.otherShown;
            if (messageTipsContent2 != null) {
                iL += CodedOutputByteBufferNano.l(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageTips).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageTips m14281parse(nb5 nb5Var) throws IOException {
            MessageTips messageTips = new MessageTips();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageTips.selfShown == null) {
                        messageTips.selfShown = MessageTipsContent.new_();
                    }
                    if (messageTips.otherShown != null) {
                        break;
                    }
                    messageTips.otherShown = MessageTipsContent.new_();
                    break;
                }
                if (iU == 10) {
                    messageTips.selfShown = (MessageTipsContent) nb5Var.l(MessageTipsContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (messageTips.selfShown == null) {
                            messageTips.selfShown = MessageTipsContent.new_();
                        }
                        if (messageTips.otherShown != null) {
                            break;
                        }
                        messageTips.otherShown = MessageTipsContent.new_();
                        return messageTips;
                    }
                    messageTips.otherShown = (MessageTipsContent) nb5Var.l(MessageTipsContent.PROTOBUF_ADAPTER);
                }
            }
            return messageTips;
        }

        public void serialize(MessageTips messageTips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageTipsContent messageTipsContent = messageTips.selfShown;
            if (messageTipsContent != null) {
                codedOutputByteBufferNano.K(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            MessageTipsContent messageTipsContent2 = messageTips.otherShown;
            if (messageTipsContent2 != null) {
                codedOutputByteBufferNano.K(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageTips> JSON_ADAPTER = new ObjectJsonAdapter<MessageTips>() { // from class: com.p1.mobile.putong.core.data.MessageTips.2
        public Class getDataClass() {
            return MessageTips.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageTips m14282newInstance() {
            return new MessageTips();
        }

        public boolean parseField(MessageTips messageTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                messageTips.selfShown = (MessageTipsContent) MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            messageTips.otherShown = (MessageTipsContent) MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MessageTips messageTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(messageTips, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageTips messageTips, JsonGenerator jsonGenerator) throws IOException {
            if (messageTips.selfShown != null) {
                jsonGenerator.writeFieldName("selfShown");
                MessageTipsContent.JSON_ADAPTER.serialize(messageTips.selfShown, jsonGenerator, true);
            }
            if (messageTips.otherShown != null) {
                jsonGenerator.writeFieldName("otherShown");
                MessageTipsContent.JSON_ADAPTER.serialize(messageTips.otherShown, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTips new_() {
        MessageTips messageTips = new MessageTips();
        messageTips.nullCheck();
        return messageTips;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageTips m14280clone() {
        MessageTips messageTips = new MessageTips();
        MessageTipsContent messageTipsContent = this.selfShown;
        if (messageTipsContent != null) {
            messageTips.selfShown = messageTipsContent.m14284clone();
        }
        MessageTipsContent messageTipsContent2 = this.otherShown;
        if (messageTipsContent2 != null) {
            messageTips.otherShown = messageTipsContent2.m14284clone();
        }
        return messageTips;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageTips)) {
            return false;
        }
        MessageTips messageTips = (MessageTips) obj;
        return ValueObject.util_equals(this.selfShown, messageTips.selfShown) && ValueObject.util_equals(this.otherShown, messageTips.otherShown);
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
        MessageTipsContent messageTipsContent = this.selfShown;
        int iHashCode = (i2 + (messageTipsContent != null ? messageTipsContent.hashCode() : 0)) * 41;
        MessageTipsContent messageTipsContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (messageTipsContent2 != null ? messageTipsContent2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.selfShown == null) {
            this.selfShown = MessageTipsContent.new_();
        }
        if (this.otherShown == null) {
            this.otherShown = MessageTipsContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
