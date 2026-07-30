package com.p046p1.mobile.putong.feed.data;

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
public class PostGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "postguide";

    @NonNull
    @ProtobufIndex(index = 4)
    public String gender;

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
    public static ProtobufAdapter<PostGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PostGuide>() { // from class: com.p1.mobile.putong.feed.data.PostGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PostGuide postGuide) {
            String str = postGuide.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = postGuide.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = postGuide.momentValue;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = postGuide.gender;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = postGuide.topicId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            postGuide.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PostGuide parse(nb5 nb5Var) throws IOException {
            PostGuide postGuide = new PostGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (postGuide.title == null) {
                        postGuide.title = "";
                    }
                    if (postGuide.subTitle == null) {
                        postGuide.subTitle = "";
                    }
                    if (postGuide.momentValue == null) {
                        postGuide.momentValue = "";
                    }
                    if (postGuide.gender == null) {
                        postGuide.gender = "";
                    }
                    if (postGuide.topicId != null) {
                        break;
                    }
                    postGuide.topicId = "";
                    break;
                }
                if (iM158752u == 10) {
                    postGuide.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    postGuide.subTitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    postGuide.momentValue = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    postGuide.gender = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (postGuide.title == null) {
                            postGuide.title = "";
                        }
                        if (postGuide.subTitle == null) {
                            postGuide.subTitle = "";
                        }
                        if (postGuide.momentValue == null) {
                            postGuide.momentValue = "";
                        }
                        if (postGuide.gender == null) {
                            postGuide.gender = "";
                        }
                        if (postGuide.topicId != null) {
                            break;
                        }
                        postGuide.topicId = "";
                        return postGuide;
                    }
                    postGuide.topicId = nb5Var.m158750s();
                }
            }
            return postGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PostGuide postGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = postGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = postGuide.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = postGuide.momentValue;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = postGuide.gender;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = postGuide.topicId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<PostGuide> JSON_ADAPTER = new ObjectJsonAdapter<PostGuide>() { // from class: com.p1.mobile.putong.feed.data.PostGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PostGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PostGuide newInstance() {
            return new PostGuide();
        }

        public boolean parseField(PostGuide postGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    postGuide.subTitle = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    postGuide.gender = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    postGuide.topicId = jsonParser.getValueAsString();
                    return true;
                case "momentValue":
                    postGuide.momentValue = jsonParser.getValueAsString();
                    return true;
                case "title":
                    postGuide.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PostGuide postGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "gender":
                case "topicId":
                case "momentValue":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(postGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PostGuide postGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = postGuide.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = postGuide.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = postGuide.momentValue;
            if (str3 != null) {
                jsonGenerator.writeStringField("momentValue", str3);
            }
            String str4 = postGuide.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
            String str5 = postGuide.topicId;
            if (str5 != null) {
                jsonGenerator.writeStringField("topicId", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PostGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PostGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PostGuide new_() {
        PostGuide postGuide = new PostGuide();
        postGuide.nullCheck();
        return postGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PostGuide mo223809clone() {
        PostGuide postGuide = new PostGuide();
        postGuide.title = this.title;
        postGuide.subTitle = this.subTitle;
        postGuide.momentValue = this.momentValue;
        postGuide.gender = this.gender;
        postGuide.topicId = this.topicId;
        return postGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PostGuide)) {
            return false;
        }
        PostGuide postGuide = (PostGuide) obj;
        return ValueObject.util_equals(this.title, postGuide.title) && ValueObject.util_equals(this.subTitle, postGuide.subTitle) && ValueObject.util_equals(this.momentValue, postGuide.momentValue) && ValueObject.util_equals(this.gender, postGuide.gender) && ValueObject.util_equals(this.topicId, postGuide.topicId);
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
        String str4 = this.gender;
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
        if (this.gender == null) {
            this.gender = "";
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
