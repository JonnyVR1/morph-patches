package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.SingleTopic;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class SingleTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "singletopic";

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userIds;
    public static ProtobufAdapter<SingleTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<SingleTopic>() { // from class: com.p1.mobile.putong.feed.data.SingleTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SingleTopic singleTopic) {
            String str = singleTopic.topicId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = singleTopic.momentId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = singleTopic.userIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            singleTopic.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SingleTopic parse(nb5 nb5Var) throws IOException {
            SingleTopic singleTopic = new SingleTopic();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (singleTopic.topicId == null) {
                        singleTopic.topicId = "";
                    }
                    if (singleTopic.momentId == null) {
                        singleTopic.momentId = "";
                    }
                    if (singleTopic.userIds != null) {
                        break;
                    }
                    singleTopic.userIds = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    singleTopic.topicId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    singleTopic.momentId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (singleTopic.topicId == null) {
                            singleTopic.topicId = "";
                        }
                        if (singleTopic.momentId == null) {
                            singleTopic.momentId = "";
                        }
                        if (singleTopic.userIds != null) {
                            break;
                        }
                        singleTopic.userIds = new ArrayList();
                        return singleTopic;
                    }
                    singleTopic.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return singleTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SingleTopic singleTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = singleTopic.topicId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = singleTopic.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = singleTopic.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SingleTopic> JSON_ADAPTER = new ObjectJsonAdapter<SingleTopic>() { // from class: com.p1.mobile.putong.feed.data.SingleTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SingleTopic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SingleTopic newInstance() {
            return new SingleTopic();
        }

        public boolean parseField(SingleTopic singleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topicId":
                    singleTopic.topicId = jsonParser.getValueAsString();
                    return true;
                case "momentId":
                    singleTopic.momentId = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    singleTopic.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SingleTopic singleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topicId":
                case "momentId":
                case "userIds":
                    return true;
                default:
                    return super.parseFieldCheck(singleTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SingleTopic singleTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = singleTopic.topicId;
            if (str != null) {
                jsonGenerator.writeStringField("topicId", str);
            }
            String str2 = singleTopic.momentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentId", str2);
            }
            if (singleTopic.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(singleTopic.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SingleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SingleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60895a(String str) {
        return str;
    }

    public static SingleTopic new_() {
        SingleTopic singleTopic = new SingleTopic();
        singleTopic.nullCheck();
        return singleTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SingleTopic mo223809clone() {
        SingleTopic singleTopic = new SingleTopic();
        singleTopic.topicId = this.topicId;
        singleTopic.momentId = this.momentId;
        List<String> list = this.userIds;
        if (list != null) {
            singleTopic.userIds = ValueObject.util_map(list, new w9j() { // from class: l.rif0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SingleTopic.m60895a((String) obj);
                }
            });
        }
        return singleTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SingleTopic)) {
            return false;
        }
        SingleTopic singleTopic = (SingleTopic) obj;
        return ValueObject.util_equals(this.topicId, singleTopic.topicId) && ValueObject.util_equals(this.momentId, singleTopic.momentId) && ValueObject.util_equals(this.userIds, singleTopic.userIds);
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
        String str = this.topicId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topicId == null) {
            this.topicId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
