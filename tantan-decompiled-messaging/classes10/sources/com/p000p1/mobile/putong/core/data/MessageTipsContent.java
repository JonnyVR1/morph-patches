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
public class MessageTipsContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetipscontent";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String androidValue;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String statsModuleId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String statsModuleParameter;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<MessageTipsContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTipsContent>() { // from class: com.p1.mobile.putong.core.data.MessageTipsContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageTipsContent messageTipsContent) {
            String str = messageTipsContent.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageTipsContent.style;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = messageTipsContent.statsModuleId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = messageTipsContent.statsModuleParameter;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = messageTipsContent.androidValue;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) messageTipsContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageTipsContent m14285parse(nb5 nb5Var) throws IOException {
            MessageTipsContent messageTipsContent = new MessageTipsContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageTipsContent.value == null) {
                        messageTipsContent.value = "";
                    }
                    if (messageTipsContent.style == null) {
                        messageTipsContent.style = "";
                    }
                    if (messageTipsContent.statsModuleId == null) {
                        messageTipsContent.statsModuleId = "";
                    }
                    if (messageTipsContent.statsModuleParameter == null) {
                        messageTipsContent.statsModuleParameter = "";
                    }
                    if (messageTipsContent.androidValue != null) {
                        break;
                    }
                    messageTipsContent.androidValue = "";
                    break;
                }
                if (iU == 10) {
                    messageTipsContent.value = nb5Var.s();
                } else if (iU == 18) {
                    messageTipsContent.style = nb5Var.s();
                } else if (iU == 26) {
                    messageTipsContent.statsModuleId = nb5Var.s();
                } else if (iU == 34) {
                    messageTipsContent.statsModuleParameter = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (messageTipsContent.value == null) {
                            messageTipsContent.value = "";
                        }
                        if (messageTipsContent.style == null) {
                            messageTipsContent.style = "";
                        }
                        if (messageTipsContent.statsModuleId == null) {
                            messageTipsContent.statsModuleId = "";
                        }
                        if (messageTipsContent.statsModuleParameter == null) {
                            messageTipsContent.statsModuleParameter = "";
                        }
                        if (messageTipsContent.androidValue != null) {
                            break;
                        }
                        messageTipsContent.androidValue = "";
                        return messageTipsContent;
                    }
                    messageTipsContent.androidValue = nb5Var.s();
                }
            }
            return messageTipsContent;
        }

        public void serialize(MessageTipsContent messageTipsContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTipsContent.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageTipsContent.style;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = messageTipsContent.statsModuleId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = messageTipsContent.statsModuleParameter;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = messageTipsContent.androidValue;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<MessageTipsContent> JSON_ADAPTER = new ObjectJsonAdapter<MessageTipsContent>() { // from class: com.p1.mobile.putong.core.data.MessageTipsContent.2
        public Class getDataClass() {
            return MessageTipsContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageTipsContent m14286newInstance() {
            return new MessageTipsContent();
        }

        public boolean parseField(MessageTipsContent messageTipsContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "androidValue":
                    messageTipsContent.androidValue = jsonParser.getValueAsString();
                    return true;
                case "style":
                    messageTipsContent.style = jsonParser.getValueAsString();
                    return true;
                case "value":
                    messageTipsContent.value = jsonParser.getValueAsString();
                    return true;
                case "statsModuleId":
                    messageTipsContent.statsModuleId = jsonParser.getValueAsString();
                    return true;
                case "statsModuleParameter":
                    messageTipsContent.statsModuleParameter = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageTipsContent messageTipsContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "androidValue":
                case "style":
                case "value":
                case "statsModuleId":
                case "statsModuleParameter":
                    return true;
                default:
                    return super.parseFieldCheck(messageTipsContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageTipsContent messageTipsContent, JsonGenerator jsonGenerator) throws IOException {
            String str = messageTipsContent.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = messageTipsContent.style;
            if (str2 != null) {
                jsonGenerator.writeStringField("style", str2);
            }
            String str3 = messageTipsContent.statsModuleId;
            if (str3 != null) {
                jsonGenerator.writeStringField("statsModuleId", str3);
            }
            String str4 = messageTipsContent.statsModuleParameter;
            if (str4 != null) {
                jsonGenerator.writeStringField("statsModuleParameter", str4);
            }
            String str5 = messageTipsContent.androidValue;
            if (str5 != null) {
                jsonGenerator.writeStringField("androidValue", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTipsContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTipsContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTipsContent new_() {
        MessageTipsContent messageTipsContent = new MessageTipsContent();
        messageTipsContent.nullCheck();
        return messageTipsContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageTipsContent m14284clone() {
        MessageTipsContent messageTipsContent = new MessageTipsContent();
        messageTipsContent.value = this.value;
        messageTipsContent.style = this.style;
        messageTipsContent.statsModuleId = this.statsModuleId;
        messageTipsContent.statsModuleParameter = this.statsModuleParameter;
        messageTipsContent.androidValue = this.androidValue;
        return messageTipsContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageTipsContent)) {
            return false;
        }
        MessageTipsContent messageTipsContent = (MessageTipsContent) obj;
        return ValueObject.util_equals(this.value, messageTipsContent.value) && ValueObject.util_equals(this.style, messageTipsContent.style) && ValueObject.util_equals(this.statsModuleId, messageTipsContent.statsModuleId) && ValueObject.util_equals(this.statsModuleParameter, messageTipsContent.statsModuleParameter) && ValueObject.util_equals(this.androidValue, messageTipsContent.androidValue);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.statsModuleId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.statsModuleParameter;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.androidValue;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.style == null) {
            this.style = "";
        }
        if (this.statsModuleId == null) {
            this.statsModuleId = "";
        }
        if (this.statsModuleParameter == null) {
            this.statsModuleParameter = "";
        }
        if (this.androidValue == null) {
            this.androidValue = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
