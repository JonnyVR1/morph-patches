package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.TopicOperationsGroup;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class TopicOperationsGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicoperationsgroup";

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentId;

    @ProtobufIndex(index = 4)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userIds;
    public static ProtobufAdapter<TopicOperationsGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicOperationsGroup>() { // from class: com.p1.mobile.putong.feed.data.TopicOperationsGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicOperationsGroup topicOperationsGroup) {
            String str = topicOperationsGroup.groupId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = topicOperationsGroup.momentId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = topicOperationsGroup.userIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, topicOperationsGroup.unread);
            topicOperationsGroup.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicOperationsGroup parse(nc5 nc5Var) throws IOException {
            TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (topicOperationsGroup.groupId == null) {
                        topicOperationsGroup.groupId = "";
                    }
                    if (topicOperationsGroup.momentId == null) {
                        topicOperationsGroup.momentId = "";
                    }
                    if (topicOperationsGroup.userIds != null) {
                        break;
                    }
                    topicOperationsGroup.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    topicOperationsGroup.groupId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    topicOperationsGroup.momentId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    topicOperationsGroup.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 32) {
                        if (topicOperationsGroup.groupId == null) {
                            topicOperationsGroup.groupId = "";
                        }
                        if (topicOperationsGroup.momentId == null) {
                            topicOperationsGroup.momentId = "";
                        }
                        if (topicOperationsGroup.userIds != null) {
                            break;
                        }
                        topicOperationsGroup.userIds = new ArrayList();
                        return topicOperationsGroup;
                    }
                    topicOperationsGroup.unread = nc5Var.m162486j();
                }
            }
            return topicOperationsGroup;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicOperationsGroup topicOperationsGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicOperationsGroup.groupId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = topicOperationsGroup.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = topicOperationsGroup.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(4, topicOperationsGroup.unread);
        }
    };
    public static JsonAdapter<TopicOperationsGroup> JSON_ADAPTER = new ObjectJsonAdapter<TopicOperationsGroup>() { // from class: com.p1.mobile.putong.feed.data.TopicOperationsGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicOperationsGroup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicOperationsGroup newInstance() {
            return new TopicOperationsGroup();
        }

        public boolean parseField(TopicOperationsGroup topicOperationsGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    topicOperationsGroup.unread = jsonParser.getValueAsInt();
                    return true;
                case "momentId":
                    topicOperationsGroup.momentId = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    topicOperationsGroup.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "groupId":
                    topicOperationsGroup.groupId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TopicOperationsGroup topicOperationsGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unread":
                case "momentId":
                case "userIds":
                case "groupId":
                    return true;
                default:
                    return super.parseFieldCheck(topicOperationsGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicOperationsGroup topicOperationsGroup, JsonGenerator jsonGenerator) throws IOException {
            String str = topicOperationsGroup.groupId;
            if (str != null) {
                jsonGenerator.writeStringField("groupId", str);
            }
            String str2 = topicOperationsGroup.momentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentId", str2);
            }
            if (topicOperationsGroup.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(topicOperationsGroup.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, topicOperationsGroup.unread);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicOperationsGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicOperationsGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62093a(String str) {
        return str;
    }

    public static TopicOperationsGroup new_() {
        TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
        topicOperationsGroup.nullCheck();
        return topicOperationsGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicOperationsGroup mo225055clone() {
        TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
        topicOperationsGroup.groupId = this.groupId;
        topicOperationsGroup.momentId = this.momentId;
        List<String> list = this.userIds;
        if (list != null) {
            topicOperationsGroup.userIds = ValueObject.util_map(list, new qcj() { // from class: l.q9j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TopicOperationsGroup.m62093a((String) obj);
                }
            });
        }
        topicOperationsGroup.unread = this.unread;
        return topicOperationsGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicOperationsGroup)) {
            return false;
        }
        TopicOperationsGroup topicOperationsGroup = (TopicOperationsGroup) obj;
        return ValueObject.util_equals(this.groupId, topicOperationsGroup.groupId) && ValueObject.util_equals(this.momentId, topicOperationsGroup.momentId) && ValueObject.util_equals(this.userIds, topicOperationsGroup.userIds) && this.unread == topicOperationsGroup.unread;
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
        String str = this.groupId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.unread;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupId == null) {
            this.groupId = "";
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
