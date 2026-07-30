package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class PublishGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "publishguide";

    @NonNull
    @ProtobufIndex(index = 3)
    public String momentValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String topicName;
    public static ProtobufAdapter<PublishGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PublishGuide>() { // from class: com.p1.mobile.putong.feed.data.PublishGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PublishGuide publishGuide) {
            String str = publishGuide.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = publishGuide.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = publishGuide.momentValue;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = publishGuide.topicName;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = publishGuide.topicId;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            publishGuide.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PublishGuide parse(nc5 nc5Var) throws IOException {
            PublishGuide publishGuide = new PublishGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (publishGuide.title == null) {
                        publishGuide.title = "";
                    }
                    if (publishGuide.subTitle == null) {
                        publishGuide.subTitle = "";
                    }
                    if (publishGuide.momentValue == null) {
                        publishGuide.momentValue = "";
                    }
                    if (publishGuide.topicName == null) {
                        publishGuide.topicName = "";
                    }
                    if (publishGuide.topicId != null) {
                        break;
                    }
                    publishGuide.topicId = "";
                    break;
                }
                if (iM162497u == 10) {
                    publishGuide.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    publishGuide.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    publishGuide.momentValue = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    publishGuide.topicName = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (publishGuide.title == null) {
                            publishGuide.title = "";
                        }
                        if (publishGuide.subTitle == null) {
                            publishGuide.subTitle = "";
                        }
                        if (publishGuide.momentValue == null) {
                            publishGuide.momentValue = "";
                        }
                        if (publishGuide.topicName == null) {
                            publishGuide.topicName = "";
                        }
                        if (publishGuide.topicId != null) {
                            break;
                        }
                        publishGuide.topicId = "";
                        return publishGuide;
                    }
                    publishGuide.topicId = nc5Var.m162495s();
                }
            }
            return publishGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PublishGuide publishGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = publishGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = publishGuide.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = publishGuide.momentValue;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = publishGuide.topicName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = publishGuide.topicId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<PublishGuide> JSON_ADAPTER = new ObjectJsonAdapter<PublishGuide>() { // from class: com.p1.mobile.putong.feed.data.PublishGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PublishGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PublishGuide newInstance() {
            return new PublishGuide();
        }

        public boolean parseField(PublishGuide publishGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    publishGuide.subTitle = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    publishGuide.topicId = jsonParser.getValueAsString();
                    return true;
                case "momentValue":
                    publishGuide.momentValue = jsonParser.getValueAsString();
                    return true;
                case "title":
                    publishGuide.title = jsonParser.getValueAsString();
                    return true;
                case "topicName":
                    publishGuide.topicName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PublishGuide publishGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "topicId":
                case "momentValue":
                case "title":
                case "topicName":
                    return true;
                default:
                    return super.parseFieldCheck(publishGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PublishGuide publishGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = publishGuide.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = publishGuide.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = publishGuide.momentValue;
            if (str3 != null) {
                jsonGenerator.writeStringField("momentValue", str3);
            }
            String str4 = publishGuide.topicName;
            if (str4 != null) {
                jsonGenerator.writeStringField("topicName", str4);
            }
            String str5 = publishGuide.topicId;
            if (str5 != null) {
                jsonGenerator.writeStringField("topicId", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PublishGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PublishGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PublishGuide new_() {
        PublishGuide publishGuide = new PublishGuide();
        publishGuide.nullCheck();
        return publishGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PublishGuide mo225055clone() {
        PublishGuide publishGuide = new PublishGuide();
        publishGuide.title = this.title;
        publishGuide.subTitle = this.subTitle;
        publishGuide.momentValue = this.momentValue;
        publishGuide.topicName = this.topicName;
        publishGuide.topicId = this.topicId;
        return publishGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublishGuide)) {
            return false;
        }
        PublishGuide publishGuide = (PublishGuide) obj;
        return ValueObject.util_equals(this.title, publishGuide.title) && ValueObject.util_equals(this.subTitle, publishGuide.subTitle) && ValueObject.util_equals(this.momentValue, publishGuide.momentValue) && ValueObject.util_equals(this.topicName, publishGuide.topicName) && ValueObject.util_equals(this.topicId, publishGuide.topicId);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.momentValue;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.topicName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.topicId;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.momentValue == null) {
            this.momentValue = "";
        }
        if (this.topicName == null) {
            this.topicName = "";
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
