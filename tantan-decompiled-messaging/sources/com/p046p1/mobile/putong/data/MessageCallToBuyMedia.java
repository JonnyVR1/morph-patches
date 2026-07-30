package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class MessageCallToBuyMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagecalltobuymedia";

    @NonNull
    @ProtobufIndex(index = 3)
    public GaussianBlurParameters gaussianBlurParameters;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<MessageCallToBuyMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageCallToBuyMedia>() { // from class: com.p1.mobile.putong.data.MessageCallToBuyMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageCallToBuyMedia messageCallToBuyMedia) {
            String str = messageCallToBuyMedia.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageCallToBuyMedia.mediaType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            GaussianBlurParameters gaussianBlurParameters = messageCallToBuyMedia.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            messageCallToBuyMedia.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageCallToBuyMedia parse(nb5 nb5Var) throws IOException {
            MessageCallToBuyMedia messageCallToBuyMedia = new MessageCallToBuyMedia();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageCallToBuyMedia.url == null) {
                        messageCallToBuyMedia.url = "";
                    }
                    if (messageCallToBuyMedia.mediaType == null) {
                        messageCallToBuyMedia.mediaType = "";
                    }
                    if (messageCallToBuyMedia.gaussianBlurParameters != null) {
                        break;
                    }
                    messageCallToBuyMedia.gaussianBlurParameters = GaussianBlurParameters.new_();
                    break;
                }
                if (iM158752u == 10) {
                    messageCallToBuyMedia.url = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageCallToBuyMedia.mediaType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (messageCallToBuyMedia.url == null) {
                            messageCallToBuyMedia.url = "";
                        }
                        if (messageCallToBuyMedia.mediaType == null) {
                            messageCallToBuyMedia.mediaType = "";
                        }
                        if (messageCallToBuyMedia.gaussianBlurParameters != null) {
                            break;
                        }
                        messageCallToBuyMedia.gaussianBlurParameters = GaussianBlurParameters.new_();
                        return messageCallToBuyMedia;
                    }
                    messageCallToBuyMedia.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.m158743l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                }
            }
            return messageCallToBuyMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageCallToBuyMedia messageCallToBuyMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageCallToBuyMedia.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageCallToBuyMedia.mediaType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            GaussianBlurParameters gaussianBlurParameters = messageCallToBuyMedia.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.m17254K(3, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageCallToBuyMedia> JSON_ADAPTER = new ObjectJsonAdapter<MessageCallToBuyMedia>() { // from class: com.p1.mobile.putong.data.MessageCallToBuyMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageCallToBuyMedia.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageCallToBuyMedia newInstance() {
            return new MessageCallToBuyMedia();
        }

        public boolean parseField(MessageCallToBuyMedia messageCallToBuyMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gaussianBlurParameters":
                    messageCallToBuyMedia.gaussianBlurParameters = GaussianBlurParameters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    messageCallToBuyMedia.url = jsonParser.getValueAsString();
                    return true;
                case "mediaType":
                    messageCallToBuyMedia.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageCallToBuyMedia messageCallToBuyMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gaussianBlurParameters":
                case "url":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(messageCallToBuyMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageCallToBuyMedia messageCallToBuyMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = messageCallToBuyMedia.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = messageCallToBuyMedia.mediaType;
            if (str2 != null) {
                jsonGenerator.writeStringField("mediaType", str2);
            }
            if (messageCallToBuyMedia.gaussianBlurParameters != null) {
                jsonGenerator.writeFieldName("gaussianBlurParameters");
                GaussianBlurParameters.JSON_ADAPTER.serialize(messageCallToBuyMedia.gaussianBlurParameters, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageCallToBuyMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageCallToBuyMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageCallToBuyMedia new_() {
        MessageCallToBuyMedia messageCallToBuyMedia = new MessageCallToBuyMedia();
        messageCallToBuyMedia.nullCheck();
        return messageCallToBuyMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageCallToBuyMedia mo223809clone() {
        MessageCallToBuyMedia messageCallToBuyMedia = new MessageCallToBuyMedia();
        messageCallToBuyMedia.url = this.url;
        messageCallToBuyMedia.mediaType = this.mediaType;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            messageCallToBuyMedia.gaussianBlurParameters = gaussianBlurParameters.mo223809clone();
        }
        return messageCallToBuyMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageCallToBuyMedia)) {
            return false;
        }
        MessageCallToBuyMedia messageCallToBuyMedia = (MessageCallToBuyMedia) obj;
        return ValueObject.util_equals(this.url, messageCallToBuyMedia.url) && ValueObject.util_equals(this.mediaType, messageCallToBuyMedia.mediaType) && ValueObject.util_equals(this.gaussianBlurParameters, messageCallToBuyMedia.gaussianBlurParameters);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mediaType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode3 = iHashCode2 + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.gaussianBlurParameters == null) {
            this.gaussianBlurParameters = GaussianBlurParameters.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
