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
public class BLiveVoiceChatTopicAsset extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceChatTopicAsset> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceChatTopicAsset>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceChatTopicAsset.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceChatTopicAsset.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceChatTopicAsset newInstance() {
            return new BLiveVoiceChatTopicAsset();
        }

        public boolean parseField(BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("tagTopics")) {
                return false;
            }
            bLiveVoiceChatTopicAsset.tagTopics = JsonAdapter.parseArray(jsonParser, BLiveVoiceChatTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceChatTopicAsset.tagTopics != null) {
                jsonGenerator.writeFieldName("tagTopics");
                JsonAdapter.serializeArray(bLiveVoiceChatTopicAsset.tagTopics, jsonGenerator, BLiveVoiceChatTopic.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceChatTopicAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicechattopicasset";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveVoiceChatTopic> tagTopics;

    public static BLiveVoiceChatTopicAsset new_() {
        BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset = new BLiveVoiceChatTopicAsset();
        bLiveVoiceChatTopicAsset.nullCheck();
        return bLiveVoiceChatTopicAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceChatTopicAsset mo225055clone() {
        BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset = new BLiveVoiceChatTopicAsset();
        List<BLiveVoiceChatTopic> list = this.tagTopics;
        if (list != null) {
            bLiveVoiceChatTopicAsset.tagTopics = ValueObject.util_map(list, new qcj() { // from class: l.q82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceChatTopic) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceChatTopicAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceChatTopicAsset) {
            return ValueObject.util_equals(this.tagTopics, ((BLiveVoiceChatTopicAsset) obj).tagTopics);
        }
        return false;
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
        List<BLiveVoiceChatTopic> list = this.tagTopics;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tagTopics == null) {
            this.tagTopics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
