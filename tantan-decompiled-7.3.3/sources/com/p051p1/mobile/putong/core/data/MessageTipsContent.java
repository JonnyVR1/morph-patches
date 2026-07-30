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
public class MessageTipsContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetipscontent";

    @NonNull
    @ProtobufIndex(index = 5)
    public String androidValue;

    @NonNull
    @ProtobufIndex(index = 3)
    public String statsModuleId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String statsModuleParameter;

    @NonNull
    @ProtobufIndex(index = 2)
    public String style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<MessageTipsContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTipsContent>() { // from class: com.p1.mobile.putong.core.data.MessageTipsContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageTipsContent messageTipsContent) {
            String str = messageTipsContent.value;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageTipsContent.style;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = messageTipsContent.statsModuleId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = messageTipsContent.statsModuleParameter;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = messageTipsContent.androidValue;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            messageTipsContent.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageTipsContent parse(nc5 nc5Var) throws IOException {
            MessageTipsContent messageTipsContent = new MessageTipsContent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    messageTipsContent.value = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageTipsContent.style = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    messageTipsContent.statsModuleId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    messageTipsContent.statsModuleParameter = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
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
                    messageTipsContent.androidValue = nc5Var.m162495s();
                }
            }
            return messageTipsContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageTipsContent messageTipsContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTipsContent.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageTipsContent.style;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = messageTipsContent.statsModuleId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = messageTipsContent.statsModuleParameter;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = messageTipsContent.androidValue;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<MessageTipsContent> JSON_ADAPTER = new ObjectJsonAdapter<MessageTipsContent>() { // from class: com.p1.mobile.putong.core.data.MessageTipsContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageTipsContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageTipsContent newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTipsContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTipsContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTipsContent new_() {
        MessageTipsContent messageTipsContent = new MessageTipsContent();
        messageTipsContent.nullCheck();
        return messageTipsContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageTipsContent mo225055clone() {
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
