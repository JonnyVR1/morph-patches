package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.AtChatGuides;
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
public class NotifyUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notifyusers";

    @NonNull
    @ProtobufIndex(index = 6)
    public AlbumButton albumButton;

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<AtChatGuides> guides;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public TopicMomentIdBox topic;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<NotifyUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotifyUsers>() { // from class: com.p1.mobile.putong.feed.data.NotifyUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NotifyUsers notifyUsers) {
            String str = notifyUsers.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = notifyUsers.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = notifyUsers.description;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            TopicMomentIdBox topicMomentIdBox = notifyUsers.topic;
            if (topicMomentIdBox != null) {
                iO += CodedOutputByteBufferNano.l(4, topicMomentIdBox, TopicMomentIdBox.PROTOBUF_ADAPTER);
            }
            List<AtChatGuides> list = notifyUsers.guides;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, AtChatGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AlbumButton albumButton = notifyUsers.albumButton;
            if (albumButton != null) {
                iO += CodedOutputByteBufferNano.l(6, albumButton, AlbumButton.PROTOBUF_ADAPTER);
            }
            String str4 = notifyUsers.subtitle;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(7, str4);
            }
            ((MessageNano) notifyUsers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NotifyUsers m19684parse(nb5 nb5Var) throws IOException {
            NotifyUsers notifyUsers = new NotifyUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (notifyUsers.userId == null) {
                        notifyUsers.userId = "";
                    }
                    if (notifyUsers.name == null) {
                        notifyUsers.name = "";
                    }
                    if (notifyUsers.description == null) {
                        notifyUsers.description = "";
                    }
                    if (notifyUsers.topic == null) {
                        notifyUsers.topic = TopicMomentIdBox.new_();
                    }
                    if (notifyUsers.guides == null) {
                        notifyUsers.guides = new ArrayList();
                    }
                    if (notifyUsers.albumButton == null) {
                        notifyUsers.albumButton = AlbumButton.new_();
                    }
                    if (notifyUsers.subtitle != null) {
                        break;
                    }
                    notifyUsers.subtitle = "";
                    break;
                }
                if (iU == 10) {
                    notifyUsers.userId = nb5Var.s();
                } else if (iU == 18) {
                    notifyUsers.name = nb5Var.s();
                } else if (iU == 26) {
                    notifyUsers.description = nb5Var.s();
                } else if (iU == 34) {
                    notifyUsers.topic = (TopicMomentIdBox) nb5Var.l(TopicMomentIdBox.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    notifyUsers.guides = (List) nb5Var.l(AtChatGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 50) {
                    notifyUsers.albumButton = (AlbumButton) nb5Var.l(AlbumButton.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (notifyUsers.userId == null) {
                            notifyUsers.userId = "";
                        }
                        if (notifyUsers.name == null) {
                            notifyUsers.name = "";
                        }
                        if (notifyUsers.description == null) {
                            notifyUsers.description = "";
                        }
                        if (notifyUsers.topic == null) {
                            notifyUsers.topic = TopicMomentIdBox.new_();
                        }
                        if (notifyUsers.guides == null) {
                            notifyUsers.guides = new ArrayList();
                        }
                        if (notifyUsers.albumButton == null) {
                            notifyUsers.albumButton = AlbumButton.new_();
                        }
                        if (notifyUsers.subtitle != null) {
                            break;
                        }
                        notifyUsers.subtitle = "";
                        return notifyUsers;
                    }
                    notifyUsers.subtitle = nb5Var.s();
                }
            }
            return notifyUsers;
        }

        public void serialize(NotifyUsers notifyUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = notifyUsers.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = notifyUsers.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = notifyUsers.description;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            TopicMomentIdBox topicMomentIdBox = notifyUsers.topic;
            if (topicMomentIdBox != null) {
                codedOutputByteBufferNano.K(4, topicMomentIdBox, TopicMomentIdBox.PROTOBUF_ADAPTER);
            }
            List<AtChatGuides> list = notifyUsers.guides;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, AtChatGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AlbumButton albumButton = notifyUsers.albumButton;
            if (albumButton != null) {
                codedOutputByteBufferNano.K(6, albumButton, AlbumButton.PROTOBUF_ADAPTER);
            }
            String str4 = notifyUsers.subtitle;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
        }
    };
    public static JsonAdapter<NotifyUsers> JSON_ADAPTER = new ObjectJsonAdapter<NotifyUsers>() { // from class: com.p1.mobile.putong.feed.data.NotifyUsers.2
        public Class getDataClass() {
            return NotifyUsers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NotifyUsers mo17830newInstance() {
            return new NotifyUsers();
        }

        public boolean parseField(NotifyUsers notifyUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    notifyUsers.subtitle = jsonParser.getValueAsString();
                    return true;
                case "description":
                    notifyUsers.description = jsonParser.getValueAsString();
                    return true;
                case "albumButton":
                    notifyUsers.albumButton = (AlbumButton) AlbumButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "guides":
                    notifyUsers.guides = JsonAdapter.parseArray(jsonParser, AtChatGuides.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    notifyUsers.userId = jsonParser.getValueAsString();
                    return true;
                case "name":
                    notifyUsers.name = jsonParser.getValueAsString();
                    return true;
                case "topic":
                    notifyUsers.topic = (TopicMomentIdBox) TopicMomentIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NotifyUsers notifyUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "description":
                case "albumButton":
                case "guides":
                case "userId":
                case "name":
                case "topic":
                    return true;
                default:
                    return super.parseFieldCheck(notifyUsers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotifyUsers notifyUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = notifyUsers.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = notifyUsers.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = notifyUsers.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            if (notifyUsers.topic != null) {
                jsonGenerator.writeFieldName(SchemeKey.topic);
                TopicMomentIdBox.JSON_ADAPTER.serialize(notifyUsers.topic, jsonGenerator, true);
            }
            if (notifyUsers.guides != null) {
                jsonGenerator.writeFieldName("guides");
                JsonAdapter.serializeArray(notifyUsers.guides, jsonGenerator, AtChatGuides.JSON_ADAPTER);
            }
            if (notifyUsers.albumButton != null) {
                jsonGenerator.writeFieldName("albumButton");
                AlbumButton.JSON_ADAPTER.serialize(notifyUsers.albumButton, jsonGenerator, true);
            }
            String str4 = notifyUsers.subtitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subtitle", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotifyUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotifyUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotifyUsers new_() {
        NotifyUsers notifyUsers = new NotifyUsers();
        notifyUsers.nullCheck();
        return notifyUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NotifyUsers m19683clone() {
        NotifyUsers notifyUsers = new NotifyUsers();
        notifyUsers.userId = this.userId;
        notifyUsers.name = this.name;
        notifyUsers.description = this.description;
        TopicMomentIdBox topicMomentIdBox = this.topic;
        if (topicMomentIdBox != null) {
            notifyUsers.topic = topicMomentIdBox.m19108clone();
        }
        List<AtChatGuides> list = this.guides;
        if (list != null) {
            notifyUsers.guides = ValueObject.util_map(list, new w9j() { // from class: l.ku40
                public final Object call(Object obj) {
                    return ((AtChatGuides) obj).m19409clone();
                }
            });
        }
        AlbumButton albumButton = this.albumButton;
        if (albumButton != null) {
            notifyUsers.albumButton = albumButton.m19406clone();
        }
        notifyUsers.subtitle = this.subtitle;
        return notifyUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotifyUsers)) {
            return false;
        }
        NotifyUsers notifyUsers = (NotifyUsers) obj;
        return ValueObject.util_equals(this.userId, notifyUsers.userId) && ValueObject.util_equals(this.name, notifyUsers.name) && ValueObject.util_equals(this.description, notifyUsers.description) && ValueObject.util_equals(this.topic, notifyUsers.topic) && ValueObject.util_equals(this.guides, notifyUsers.guides) && ValueObject.util_equals(this.albumButton, notifyUsers.albumButton) && ValueObject.util_equals(this.subtitle, notifyUsers.subtitle);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        TopicMomentIdBox topicMomentIdBox = this.topic;
        int iHashCode4 = (iHashCode3 + (topicMomentIdBox != null ? topicMomentIdBox.hashCode() : 0)) * 41;
        List<AtChatGuides> list = this.guides;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        AlbumButton albumButton = this.albumButton;
        int iHashCode6 = (iHashCode5 + (albumButton != null ? albumButton.hashCode() : 0)) * 41;
        String str4 = this.subtitle;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.topic == null) {
            this.topic = TopicMomentIdBox.new_();
        }
        if (this.guides == null) {
            this.guides = new ArrayList();
        }
        if (this.albumButton == null) {
            this.albumButton = AlbumButton.new_();
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
