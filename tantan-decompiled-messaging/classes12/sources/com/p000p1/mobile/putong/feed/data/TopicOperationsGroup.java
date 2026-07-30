package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.TopicOperationsGroup;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicOperationsGroup topicOperationsGroup) {
            String str = topicOperationsGroup.groupId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = topicOperationsGroup.momentId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = topicOperationsGroup.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, topicOperationsGroup.unread);
            ((MessageNano) topicOperationsGroup).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicOperationsGroup m19801parse(nb5 nb5Var) throws IOException {
            TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    topicOperationsGroup.groupId = nb5Var.s();
                } else if (iU == 18) {
                    topicOperationsGroup.momentId = nb5Var.s();
                } else if (iU == 26) {
                    topicOperationsGroup.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 32) {
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
                    topicOperationsGroup.unread = nb5Var.j();
                }
            }
            return topicOperationsGroup;
        }

        public void serialize(TopicOperationsGroup topicOperationsGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicOperationsGroup.groupId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = topicOperationsGroup.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = topicOperationsGroup.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(4, topicOperationsGroup.unread);
        }
    };
    public static JsonAdapter<TopicOperationsGroup> JSON_ADAPTER = new ObjectJsonAdapter<TopicOperationsGroup>() { // from class: com.p1.mobile.putong.feed.data.TopicOperationsGroup.2
        public Class getDataClass() {
            return TopicOperationsGroup.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicOperationsGroup mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            jsonGenerator.writeNumberField("unread", topicOperationsGroup.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicOperationsGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicOperationsGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1835a(String str) {
        return str;
    }

    public static TopicOperationsGroup new_() {
        TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
        topicOperationsGroup.nullCheck();
        return topicOperationsGroup;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicOperationsGroup m19800clone() {
        TopicOperationsGroup topicOperationsGroup = new TopicOperationsGroup();
        topicOperationsGroup.groupId = this.groupId;
        topicOperationsGroup.momentId = this.momentId;
        List<String> list = this.userIds;
        if (list != null) {
            topicOperationsGroup.userIds = ValueObject.util_map(list, new w9j() { // from class: l.m0j0
                public final Object call(Object obj) {
                    return TopicOperationsGroup.m1835a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
