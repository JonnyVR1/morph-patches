package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
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
public class NewMomentDraft extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmomentdraft";

    @NonNull
    @ProtobufIndex(index = 5)
    public GroupIdBox group;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Media> images;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<TopicMoment> topics;

    @ProtobufIndex(index = 2)
    public int type;
    public static ProtobufAdapter<NewMomentDraft> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMomentDraft>() { // from class: com.p1.mobile.putong.feed.data.NewMomentDraft.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewMomentDraft newMomentDraft) {
            String str = newMomentDraft.text;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, newMomentDraft.type);
            List<Media> list = newMomentDraft.images;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMoment> list2 = newMomentDraft.topics;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(4, list2, TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupIdBox groupIdBox = newMomentDraft.group;
            if (groupIdBox != null) {
                iO += CodedOutputByteBufferNano.l(5, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            ((MessageNano) newMomentDraft).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewMomentDraft m19678parse(nb5 nb5Var) throws IOException {
            NewMomentDraft newMomentDraft = new NewMomentDraft();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newMomentDraft.text == null) {
                        newMomentDraft.text = "";
                    }
                    if (newMomentDraft.images == null) {
                        newMomentDraft.images = new ArrayList();
                    }
                    if (newMomentDraft.topics == null) {
                        newMomentDraft.topics = new ArrayList();
                    }
                    if (newMomentDraft.group != null) {
                        break;
                    }
                    newMomentDraft.group = GroupIdBox.new_();
                    break;
                }
                if (iU == 10) {
                    newMomentDraft.text = nb5Var.s();
                } else if (iU == 16) {
                    newMomentDraft.type = nb5Var.j();
                } else if (iU == 26) {
                    newMomentDraft.images = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    newMomentDraft.topics = (List) nb5Var.l(TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        if (newMomentDraft.text == null) {
                            newMomentDraft.text = "";
                        }
                        if (newMomentDraft.images == null) {
                            newMomentDraft.images = new ArrayList();
                        }
                        if (newMomentDraft.topics == null) {
                            newMomentDraft.topics = new ArrayList();
                        }
                        if (newMomentDraft.group != null) {
                            break;
                        }
                        newMomentDraft.group = GroupIdBox.new_();
                        return newMomentDraft;
                    }
                    newMomentDraft.group = (GroupIdBox) nb5Var.l(GroupIdBox.PROTOBUF_ADAPTER);
                }
            }
            return newMomentDraft;
        }

        public void serialize(NewMomentDraft newMomentDraft, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newMomentDraft.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, newMomentDraft.type);
            List<Media> list = newMomentDraft.images;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMoment> list2 = newMomentDraft.topics;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupIdBox groupIdBox = newMomentDraft.group;
            if (groupIdBox != null) {
                codedOutputByteBufferNano.K(5, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewMomentDraft> JSON_ADAPTER = new ObjectJsonAdapter<NewMomentDraft>() { // from class: com.p1.mobile.putong.feed.data.NewMomentDraft.2
        public Class getDataClass() {
            return NewMomentDraft.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NewMomentDraft mo17830newInstance() {
            return new NewMomentDraft();
        }

        public boolean parseField(NewMomentDraft newMomentDraft, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "images":
                    newMomentDraft.images = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "topics":
                    newMomentDraft.topics = JsonAdapter.parseArray(jsonParser, TopicMoment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    newMomentDraft.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    newMomentDraft.type = jsonParser.getValueAsInt();
                    return true;
                case "group":
                    newMomentDraft.group = (GroupIdBox) GroupIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewMomentDraft newMomentDraft, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "images":
                case "topics":
                case "text":
                case "type":
                case "group":
                    return true;
                default:
                    return super.parseFieldCheck(newMomentDraft, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewMomentDraft newMomentDraft, JsonGenerator jsonGenerator) throws IOException {
            String str = newMomentDraft.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            jsonGenerator.writeNumberField("type", newMomentDraft.type);
            if (newMomentDraft.images != null) {
                jsonGenerator.writeFieldName("images");
                JsonAdapter.serializeArray(newMomentDraft.images, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (newMomentDraft.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(newMomentDraft.topics, jsonGenerator, TopicMoment.JSON_ADAPTER);
            }
            if (newMomentDraft.group != null) {
                jsonGenerator.writeFieldName("group");
                GroupIdBox.JSON_ADAPTER.serialize(newMomentDraft.group, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMomentDraft) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMomentDraft) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMomentDraft new_() {
        NewMomentDraft newMomentDraft = new NewMomentDraft();
        newMomentDraft.nullCheck();
        return newMomentDraft;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewMomentDraft m19677clone() {
        NewMomentDraft newMomentDraft = new NewMomentDraft();
        newMomentDraft.text = this.text;
        newMomentDraft.type = this.type;
        List<Media> list = this.images;
        if (list != null) {
            newMomentDraft.images = ValueObject.util_map(list, new w9j() { // from class: l.sj30
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        List<TopicMoment> list2 = this.topics;
        if (list2 != null) {
            newMomentDraft.topics = ValueObject.util_map(list2, new w9j() { // from class: l.tj30
                public final Object call(Object obj) {
                    return ((TopicMoment) obj).m19794clone();
                }
            });
        }
        GroupIdBox groupIdBox = this.group;
        if (groupIdBox != null) {
            newMomentDraft.group = groupIdBox.m19526clone();
        }
        return newMomentDraft;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMomentDraft)) {
            return false;
        }
        NewMomentDraft newMomentDraft = (NewMomentDraft) obj;
        return ValueObject.util_equals(this.text, newMomentDraft.text) && this.type == newMomentDraft.type && ValueObject.util_equals(this.images, newMomentDraft.images) && ValueObject.util_equals(this.topics, newMomentDraft.topics) && ValueObject.util_equals(this.group, newMomentDraft.group);
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
        String str = this.text;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.type) * 41;
        List<Media> list = this.images;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<TopicMoment> list2 = this.topics;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        GroupIdBox groupIdBox = this.group;
        int iHashCode4 = iHashCode3 + (groupIdBox != null ? groupIdBox.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.images == null) {
            this.images = new ArrayList();
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.group == null) {
            this.group = GroupIdBox.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
