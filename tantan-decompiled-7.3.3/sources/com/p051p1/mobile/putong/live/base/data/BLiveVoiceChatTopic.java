package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceChatTopic extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceChatTopic> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceChatTopic>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceChatTopic.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceChatTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceChatTopic newInstance() {
            return new BLiveVoiceChatTopic();
        }

        public boolean parseField(BLiveVoiceChatTopic bLiveVoiceChatTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomId":
                    bLiveVoiceChatTopic.roomId = jsonParser.getValueAsString();
                    return true;
                case "topics":
                    bLiveVoiceChatTopic.topics = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isCustom":
                    bLiveVoiceChatTopic.isCustom = jsonParser.getValueAsBoolean();
                    return true;
                case "tag":
                    bLiveVoiceChatTopic.tag = jsonParser.getValueAsString();
                    return true;
                case "topic":
                    bLiveVoiceChatTopic.topic = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceChatTopic bLiveVoiceChatTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceChatTopic.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            if (bLiveVoiceChatTopic.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(bLiveVoiceChatTopic.topics, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = bLiveVoiceChatTopic.tag;
            if (str2 != null) {
                jsonGenerator.writeStringField("tag", str2);
            }
            String str3 = bLiveVoiceChatTopic.topic;
            if (str3 != null) {
                jsonGenerator.writeStringField("topic", str3);
            }
            jsonGenerator.writeBooleanField("isCustom", bLiveVoiceChatTopic.isCustom);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceChatTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicechattopic";

    @ProtobufIndex(index = 5)
    public boolean isCustom;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 4)
    public String topic;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> topics;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69540a(String str) {
        return str;
    }

    public static BLiveVoiceChatTopic new_() {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = new BLiveVoiceChatTopic();
        bLiveVoiceChatTopic.nullCheck();
        return bLiveVoiceChatTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceChatTopic mo225055clone() {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = new BLiveVoiceChatTopic();
        bLiveVoiceChatTopic.roomId = this.roomId;
        List<String> list = this.topics;
        if (list != null) {
            bLiveVoiceChatTopic.topics = ValueObject.util_map(list, new qcj() { // from class: l.p82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceChatTopic.m69540a((String) obj);
                }
            });
        }
        bLiveVoiceChatTopic.tag = this.tag;
        bLiveVoiceChatTopic.topic = this.topic;
        bLiveVoiceChatTopic.isCustom = this.isCustom;
        return bLiveVoiceChatTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceChatTopic)) {
            return false;
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic = (BLiveVoiceChatTopic) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceChatTopic.roomId) && ValueObject.util_equals(this.topics, bLiveVoiceChatTopic.topics) && ValueObject.util_equals(this.tag, bLiveVoiceChatTopic.tag) && ValueObject.util_equals(this.topic, bLiveVoiceChatTopic.topic) && this.isCustom == bLiveVoiceChatTopic.isCustom;
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.topics;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.tag;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.topic;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isCustom ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public boolean isCustomDefault() {
        return this.isCustom && "添加自定义标签".equals(this.tag);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.topic == null) {
            this.topic = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
