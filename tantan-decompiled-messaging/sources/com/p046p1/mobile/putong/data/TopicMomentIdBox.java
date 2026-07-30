package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class TopicMomentIdBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicmomentidbox";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38824id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<TopicMomentIdBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicMomentIdBox>() { // from class: com.p1.mobile.putong.data.TopicMomentIdBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicMomentIdBox topicMomentIdBox) {
            String str = topicMomentIdBox.f38824id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            topicMomentIdBox.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicMomentIdBox parse(nb5 nb5Var) throws IOException {
            TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (topicMomentIdBox.f38824id == null) {
                        topicMomentIdBox.f38824id = "";
                    }
                    if (topicMomentIdBox.name != null) {
                        break;
                    }
                    topicMomentIdBox.name = "";
                    break;
                }
                if (iM158752u == 10) {
                    topicMomentIdBox.f38824id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (topicMomentIdBox.f38824id == null) {
                            topicMomentIdBox.f38824id = "";
                        }
                        if (topicMomentIdBox.name != null) {
                            break;
                        }
                        topicMomentIdBox.name = "";
                        return topicMomentIdBox;
                    }
                    topicMomentIdBox.name = nb5Var.m158750s();
                }
            }
            return topicMomentIdBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicMomentIdBox topicMomentIdBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicMomentIdBox.f38824id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<TopicMomentIdBox> JSON_ADAPTER = new ObjectJsonAdapter<TopicMomentIdBox>() { // from class: com.p1.mobile.putong.data.TopicMomentIdBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicMomentIdBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicMomentIdBox newInstance() {
            return new TopicMomentIdBox();
        }

        public boolean parseField(TopicMomentIdBox topicMomentIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                topicMomentIdBox.f38824id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            topicMomentIdBox.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TopicMomentIdBox topicMomentIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(topicMomentIdBox, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicMomentIdBox topicMomentIdBox, JsonGenerator jsonGenerator) throws IOException {
            String str = topicMomentIdBox.f38824id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicMomentIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicMomentIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TopicMomentIdBox new_() {
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        topicMomentIdBox.nullCheck();
        return topicMomentIdBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicMomentIdBox mo223809clone() {
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        topicMomentIdBox.f38824id = this.f38824id;
        topicMomentIdBox.name = this.name;
        return topicMomentIdBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicMomentIdBox)) {
            return false;
        }
        TopicMomentIdBox topicMomentIdBox = (TopicMomentIdBox) obj;
        return ValueObject.util_equals(this.f38824id, topicMomentIdBox.f38824id) && ValueObject.util_equals(this.name, topicMomentIdBox.name);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "topicmomentidbox";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f38824id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38824id == null) {
            this.f38824id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
