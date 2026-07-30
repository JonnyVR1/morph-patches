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
public class MessageTips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetips";

    @NonNull
    @ProtobufIndex(index = 2)
    public MessageTipsContent otherShown;

    @NonNull
    @ProtobufIndex(index = 1)
    public MessageTipsContent selfShown;
    public static ProtobufAdapter<MessageTips> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTips>() { // from class: com.p1.mobile.putong.core.data.MessageTips.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageTips messageTips) {
            MessageTipsContent messageTipsContent = messageTips.selfShown;
            int iM17285l = messageTipsContent != null ? CodedOutputByteBufferNano.m17285l(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER) : 0;
            MessageTipsContent messageTipsContent2 = messageTips.otherShown;
            if (messageTipsContent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            messageTips.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageTips parse(nc5 nc5Var) throws IOException {
            MessageTips messageTips = new MessageTips();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageTips.selfShown == null) {
                        messageTips.selfShown = MessageTipsContent.new_();
                    }
                    if (messageTips.otherShown != null) {
                        break;
                    }
                    messageTips.otherShown = MessageTipsContent.new_();
                    break;
                }
                if (iM162497u == 10) {
                    messageTips.selfShown = (MessageTipsContent) nc5Var.m162488l(MessageTipsContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (messageTips.selfShown == null) {
                            messageTips.selfShown = MessageTipsContent.new_();
                        }
                        if (messageTips.otherShown != null) {
                            break;
                        }
                        messageTips.otherShown = MessageTipsContent.new_();
                        return messageTips;
                    }
                    messageTips.otherShown = (MessageTipsContent) nc5Var.m162488l(MessageTipsContent.PROTOBUF_ADAPTER);
                }
            }
            return messageTips;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageTips messageTips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MessageTipsContent messageTipsContent = messageTips.selfShown;
            if (messageTipsContent != null) {
                codedOutputByteBufferNano.m17309K(1, messageTipsContent, MessageTipsContent.PROTOBUF_ADAPTER);
            }
            MessageTipsContent messageTipsContent2 = messageTips.otherShown;
            if (messageTipsContent2 != null) {
                codedOutputByteBufferNano.m17309K(2, messageTipsContent2, MessageTipsContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageTips> JSON_ADAPTER = new ObjectJsonAdapter<MessageTips>() { // from class: com.p1.mobile.putong.core.data.MessageTips.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageTips.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageTips newInstance() {
            return new MessageTips();
        }

        public boolean parseField(MessageTips messageTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                messageTips.selfShown = MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            messageTips.otherShown = MessageTipsContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MessageTips messageTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(messageTips, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTips new_() {
        MessageTips messageTips = new MessageTips();
        messageTips.nullCheck();
        return messageTips;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageTips mo225055clone() {
        MessageTips messageTips = new MessageTips();
        MessageTipsContent messageTipsContent = this.selfShown;
        if (messageTipsContent != null) {
            messageTips.selfShown = messageTipsContent.mo225055clone();
        }
        MessageTipsContent messageTipsContent2 = this.otherShown;
        if (messageTipsContent2 != null) {
            messageTips.otherShown = messageTipsContent2.mo225055clone();
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
        MessageTipsContent messageTipsContent = this.selfShown;
        int iHashCode = (i2 + (messageTipsContent != null ? messageTipsContent.hashCode() : 0)) * 41;
        MessageTipsContent messageTipsContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (messageTipsContent2 != null ? messageTipsContent2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selfShown == null) {
            this.selfShown = MessageTipsContent.new_();
        }
        if (this.otherShown == null) {
            this.otherShown = MessageTipsContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
