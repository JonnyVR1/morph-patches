package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MomentTag;
import com.p000p1.mobile.putong.core.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.core.data.VideoBullet;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.LocalStatus;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.PartialIdList;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreMomentInfo extends CopyObject<CoreMomentInfo> implements Cloneable, Serializable {
    public static String LOCAL_ID_INVALID = "invalid_moment_id";
    public static final String MOMENT_TYPE = "moment";
    public static final String TYPE = "coremomentinfo";

    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
    public double createdTime;

    @NonNull
    public String feedTime;
    public String from;

    @ProtobufIndex(index = 58)
    public boolean haveLiked;
    public boolean isLive;
    public boolean isVoiceLive;

    @NonNull
    public PartialIdList likes;

    @ProtobufIndex(index = 51)
    public int localCreatedSession;

    @ProtobufIndex(index = 52)
    public boolean localInFeed;

    @ProtobufIndex(index = 53)
    public boolean localInUserFeed;

    @Nullable
    @ProtobufIndex(index = 59)
    public MessageLocation location;
    private String locationName;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<Media> media;

    @NonNull
    public PartialIdList messages;

    @NonNull
    @ProtobufIndex(index = 64)
    public MomentCard momentCard;

    @Nullable
    @ProtobufIndex(index = 60)
    public CoreMomentType momentType;

    @NonNull
    @ProtobufIndex(index = 63)
    public String musicId;

    @NonNull
    @ProtobufIndex(index = 56)
    public String owner;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 65)
    public String sourceType;

    @NonNull
    public List<MomentTag> tags;

    @NonNull
    public List<TopicMomentIdBox> topics;

    @NonNull
    @ProtobufIndex(index = 54)
    public String value;

    @NonNull
    @ProtobufIndex(index = 62)
    public List<VideoBullet> videoBullets;
    public int views;
    public static ProtobufAdapter<CoreMomentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreMomentInfo>() { // from class: com.p1.mobile.putong.core.data.CoreMomentInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreMomentInfo coreMomentInfo) {
            int iJ = CodedOutputByteBufferNano.j(1, ((CopyObject) coreMomentInfo)._id);
            String str = ((CopyObject) coreMomentInfo).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(51, coreMomentInfo.localCreatedSession) + CodedOutputByteBufferNano.b(52, coreMomentInfo.localInFeed) + CodedOutputByteBufferNano.b(53, coreMomentInfo.localInUserFeed);
            String str2 = coreMomentInfo.value;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(54, str2);
            }
            int iD = iH + CodedOutputByteBufferNano.d(55, coreMomentInfo.createdTime);
            String str3 = coreMomentInfo.owner;
            if (str3 != null) {
                iD += CodedOutputByteBufferNano.o(56, str3);
            }
            List<Media> list = coreMomentInfo.media;
            if (list != null) {
                iD += CodedOutputByteBufferNano.l(57, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iD + CodedOutputByteBufferNano.b(58, coreMomentInfo.haveLiked);
            MessageLocation messageLocation = coreMomentInfo.location;
            if (messageLocation != null) {
                iB += CodedOutputByteBufferNano.l(59, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            CoreMomentType coreMomentType = coreMomentInfo.momentType;
            if (coreMomentType != null) {
                iB += CodedOutputByteBufferNano.h(60, coreMomentType.ordinal());
            }
            CoreMomentType coreMomentType2 = coreMomentInfo.momentType;
            if (coreMomentType2 != null) {
                iB += CodedOutputByteBufferNano.l(61, coreMomentType2, CoreMomentType.PROTOBUF_ADAPTER);
            }
            List<VideoBullet> list2 = coreMomentInfo.videoBullets;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(62, list2, VideoBullet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = coreMomentInfo.musicId;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(63, str4);
            }
            MomentCard momentCard = coreMomentInfo.momentCard;
            if (momentCard != null) {
                iB += CodedOutputByteBufferNano.l(64, momentCard, MomentCard.PROTOBUF_ADAPTER);
            }
            String str5 = coreMomentInfo.sourceType;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(65, str5);
            }
            ((MessageNano) coreMomentInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreMomentInfo m12519parse(nb5 nb5Var) throws IOException {
            CoreMomentInfo coreMomentInfo = new CoreMomentInfo();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coreMomentInfo.momentType == null && numValueOf != null) {
                            coreMomentInfo.momentType = (CoreMomentType) CoreMomentType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (coreMomentInfo.value == null) {
                            coreMomentInfo.value = "";
                        }
                        if (coreMomentInfo.owner == null) {
                            coreMomentInfo.owner = "";
                        }
                        if (coreMomentInfo.media == null) {
                            coreMomentInfo.media = new ArrayList();
                        }
                        if (coreMomentInfo.likes == null) {
                            coreMomentInfo.likes = PartialIdList.new_();
                        }
                        if (coreMomentInfo.messages == null) {
                            coreMomentInfo.messages = PartialIdList.new_();
                        }
                        if (coreMomentInfo.topics == null) {
                            coreMomentInfo.topics = new ArrayList();
                        }
                        if (coreMomentInfo.tags == null) {
                            coreMomentInfo.tags = new ArrayList();
                        }
                        if (coreMomentInfo.videoBullets == null) {
                            coreMomentInfo.videoBullets = new ArrayList();
                        }
                        if (coreMomentInfo.musicId == null) {
                            coreMomentInfo.musicId = "";
                        }
                        if (coreMomentInfo.momentCard == null) {
                            coreMomentInfo.momentCard = MomentCard.new_();
                        }
                        if (coreMomentInfo.sourceType == null) {
                            coreMomentInfo.sourceType = "";
                        }
                        break;
                    case 8:
                        ((CopyObject) coreMomentInfo)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((CopyObject) coreMomentInfo).id = nb5Var.s();
                        continue;
                    case 408:
                        coreMomentInfo.localCreatedSession = nb5Var.j();
                        continue;
                    case 416:
                        coreMomentInfo.localInFeed = nb5Var.g();
                        continue;
                    case 424:
                        coreMomentInfo.localInUserFeed = nb5Var.g();
                        continue;
                    case 434:
                        coreMomentInfo.value = nb5Var.s();
                        continue;
                    case 441:
                        coreMomentInfo.createdTime = nb5Var.h();
                        continue;
                    case 450:
                        coreMomentInfo.owner = nb5Var.s();
                        continue;
                    case 458:
                        coreMomentInfo.media = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 464:
                        coreMomentInfo.haveLiked = nb5Var.g();
                        continue;
                    case 474:
                        coreMomentInfo.location = (MessageLocation) nb5Var.l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 480:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 490:
                        coreMomentInfo.momentType = (CoreMomentType) nb5Var.l(CoreMomentType.PROTOBUF_ADAPTER);
                        continue;
                    case 498:
                        coreMomentInfo.videoBullets = (List) nb5Var.l(VideoBullet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 506:
                        coreMomentInfo.musicId = nb5Var.s();
                        continue;
                    case 514:
                        coreMomentInfo.momentCard = (MomentCard) nb5Var.l(MomentCard.PROTOBUF_ADAPTER);
                        continue;
                    case 522:
                        coreMomentInfo.sourceType = nb5Var.s();
                        continue;
                    default:
                        if (coreMomentInfo.momentType == null && numValueOf != null) {
                            coreMomentInfo.momentType = (CoreMomentType) CoreMomentType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (coreMomentInfo.value == null) {
                            coreMomentInfo.value = "";
                        }
                        if (coreMomentInfo.owner == null) {
                            coreMomentInfo.owner = "";
                        }
                        if (coreMomentInfo.media == null) {
                            coreMomentInfo.media = new ArrayList();
                        }
                        if (coreMomentInfo.likes == null) {
                            coreMomentInfo.likes = PartialIdList.new_();
                        }
                        if (coreMomentInfo.messages == null) {
                            coreMomentInfo.messages = PartialIdList.new_();
                        }
                        if (coreMomentInfo.topics == null) {
                            coreMomentInfo.topics = new ArrayList();
                        }
                        if (coreMomentInfo.tags == null) {
                            coreMomentInfo.tags = new ArrayList();
                        }
                        if (coreMomentInfo.videoBullets == null) {
                            coreMomentInfo.videoBullets = new ArrayList();
                        }
                        if (coreMomentInfo.musicId == null) {
                            coreMomentInfo.musicId = "";
                        }
                        if (coreMomentInfo.momentCard == null) {
                            coreMomentInfo.momentCard = MomentCard.new_();
                        }
                        if (coreMomentInfo.sourceType == null) {
                            coreMomentInfo.sourceType = "";
                            return coreMomentInfo;
                        }
                        break;
                }
            }
            return coreMomentInfo;
        }

        public void serialize(CoreMomentInfo coreMomentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((CopyObject) coreMomentInfo)._id);
            String str = ((CopyObject) coreMomentInfo).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(51, coreMomentInfo.localCreatedSession);
            codedOutputByteBufferNano.A(52, coreMomentInfo.localInFeed);
            codedOutputByteBufferNano.A(53, coreMomentInfo.localInUserFeed);
            String str2 = coreMomentInfo.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(54, str2);
            }
            codedOutputByteBufferNano.C(55, coreMomentInfo.createdTime);
            String str3 = coreMomentInfo.owner;
            if (str3 != null) {
                codedOutputByteBufferNano.R(56, str3);
            }
            List<Media> list = coreMomentInfo.media;
            if (list != null) {
                codedOutputByteBufferNano.K(57, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(58, coreMomentInfo.haveLiked);
            MessageLocation messageLocation = coreMomentInfo.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.K(59, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            CoreMomentType coreMomentType = coreMomentInfo.momentType;
            if (coreMomentType != null) {
                codedOutputByteBufferNano.G(60, coreMomentType.ordinal());
            }
            CoreMomentType coreMomentType2 = coreMomentInfo.momentType;
            if (coreMomentType2 != null) {
                codedOutputByteBufferNano.K(61, coreMomentType2, CoreMomentType.PROTOBUF_ADAPTER);
            }
            List<VideoBullet> list2 = coreMomentInfo.videoBullets;
            if (list2 != null) {
                codedOutputByteBufferNano.K(62, list2, VideoBullet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = coreMomentInfo.musicId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(63, str4);
            }
            MomentCard momentCard = coreMomentInfo.momentCard;
            if (momentCard != null) {
                codedOutputByteBufferNano.K(64, momentCard, MomentCard.PROTOBUF_ADAPTER);
            }
            String str5 = coreMomentInfo.sourceType;
            if (str5 != null) {
                codedOutputByteBufferNano.R(65, str5);
            }
        }
    };
    public static JsonAdapter<CoreMomentInfo> JSON_ADAPTER = new ObjectJsonAdapter<CoreMomentInfo>() { // from class: com.p1.mobile.putong.core.data.CoreMomentInfo.2
        public Class getDataClass() {
            return CoreMomentInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreMomentInfo m12520newInstance() {
            return new CoreMomentInfo();
        }

        public boolean parseField(CoreMomentInfo coreMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "haveLiked":
                    coreMomentInfo.haveLiked = jsonParser.getValueAsBoolean();
                    return true;
                case "isLive":
                    coreMomentInfo.isLive = jsonParser.getValueAsBoolean();
                    return true;
                case "sourceType":
                    coreMomentInfo.sourceType = jsonParser.getValueAsString();
                    return true;
                case "topics":
                    coreMomentInfo.topics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    coreMomentInfo.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "messages":
                    coreMomentInfo.messages = (PartialIdList) PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((CopyObject) coreMomentInfo).id = jsonParser.getValueAsString();
                    return false;
                case "tags":
                    coreMomentInfo.tags = JsonAdapter.parseArray(jsonParser, MomentTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "videoBullets":
                    coreMomentInfo.videoBullets = JsonAdapter.parseArray(jsonParser, VideoBullet.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "likes":
                    coreMomentInfo.likes = (PartialIdList) PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "media":
                    coreMomentInfo.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    coreMomentInfo.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "value":
                    coreMomentInfo.value = jsonParser.getValueAsString();
                    return true;
                case "views":
                    coreMomentInfo.views = jsonParser.getValueAsInt();
                    return true;
                case "isVoiceLive":
                    coreMomentInfo.isVoiceLive = jsonParser.getValueAsBoolean();
                    return true;
                case "momentCard":
                    coreMomentInfo.momentCard = (MomentCard) MomentCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentType":
                    coreMomentInfo.momentType = (CoreMomentType) CoreMomentType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "musicId":
                    coreMomentInfo.musicId = jsonParser.getValueAsString();
                    return true;
                case "location":
                    coreMomentInfo.location = (MessageLocation) MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreMomentInfo coreMomentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "haveLiked":
                case "isLive":
                case "sourceType":
                case "topics":
                case "createdTime":
                case "messages":
                    return true;
                case "id":
                    return false;
                case "tags":
                case "videoBullets":
                case "likes":
                case "media":
                case "owner":
                case "value":
                case "views":
                case "isVoiceLive":
                case "momentCard":
                case "momentType":
                case "musicId":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(coreMomentInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CoreMomentInfo coreMomentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = ((CopyObject) coreMomentInfo).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coreMomentInfo.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(coreMomentInfo.createdTime), jsonGenerator, true);
            if (coreMomentInfo.owner != null) {
                jsonGenerator.writeFieldName("owner");
                Converter.USER_ID.serialize(coreMomentInfo.owner, jsonGenerator, true);
            }
            if (coreMomentInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(coreMomentInfo.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            jsonGenerator.writeBooleanField("haveLiked", coreMomentInfo.haveLiked);
            if (coreMomentInfo.location != null) {
                jsonGenerator.writeFieldName(MessageType.location);
                MessageLocation.JSON_ADAPTER.serialize(coreMomentInfo.location, jsonGenerator, true);
            }
            if (coreMomentInfo.momentType != null) {
                jsonGenerator.writeFieldName("momentType");
                CoreMomentType.JSON_ADAPTER.serialize(coreMomentInfo.momentType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isVoiceLive", coreMomentInfo.isVoiceLive);
            jsonGenerator.writeBooleanField("isLive", coreMomentInfo.isLive);
            jsonGenerator.writeNumberField("views", coreMomentInfo.views);
            if (coreMomentInfo.likes != null) {
                jsonGenerator.writeFieldName("likes");
                PartialIdList.JSON_ADAPTER.serialize(coreMomentInfo.likes, jsonGenerator, true);
            }
            if (coreMomentInfo.messages != null) {
                jsonGenerator.writeFieldName("messages");
                PartialIdList.JSON_ADAPTER.serialize(coreMomentInfo.messages, jsonGenerator, true);
            }
            if (coreMomentInfo.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(coreMomentInfo.topics, jsonGenerator, TopicMomentIdBox.JSON_ADAPTER);
            }
            if (coreMomentInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(coreMomentInfo.tags, jsonGenerator, MomentTag.JSON_ADAPTER);
            }
            if (coreMomentInfo.videoBullets != null) {
                jsonGenerator.writeFieldName("videoBullets");
                JsonAdapter.serializeArray(coreMomentInfo.videoBullets, jsonGenerator, VideoBullet.JSON_ADAPTER);
            }
            String str3 = coreMomentInfo.musicId;
            if (str3 != null) {
                jsonGenerator.writeStringField("musicId", str3);
            }
            if (coreMomentInfo.momentCard != null) {
                jsonGenerator.writeFieldName("momentCard");
                MomentCard.JSON_ADAPTER.serialize(coreMomentInfo.momentCard, jsonGenerator, true);
            }
            String str4 = coreMomentInfo.sourceType;
            if (str4 != null) {
                jsonGenerator.writeStringField("sourceType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreMomentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreMomentInfo new_() {
        CoreMomentInfo coreMomentInfo = new CoreMomentInfo();
        coreMomentInfo.nullCheck();
        return coreMomentInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreMomentInfo m12518clone() {
        CoreMomentInfo coreMomentInfo = new CoreMomentInfo();
        ((CopyObject) coreMomentInfo)._id = ((CopyObject) this)._id;
        ((CopyObject) coreMomentInfo).id = ((CopyObject) this).id;
        coreMomentInfo.localCreatedSession = this.localCreatedSession;
        coreMomentInfo.localInFeed = this.localInFeed;
        coreMomentInfo.localInUserFeed = this.localInUserFeed;
        coreMomentInfo.value = this.value;
        coreMomentInfo.createdTime = this.createdTime;
        coreMomentInfo.owner = this.owner;
        List<Media> list = this.media;
        if (list != null) {
            coreMomentInfo.media = ValueObject.util_map(list, new w9j() { // from class: l.ez9
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        coreMomentInfo.haveLiked = this.haveLiked;
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            coreMomentInfo.location = messageLocation.clone();
        }
        coreMomentInfo.momentType = this.momentType;
        coreMomentInfo.isVoiceLive = this.isVoiceLive;
        coreMomentInfo.isLive = this.isLive;
        coreMomentInfo.views = this.views;
        PartialIdList partialIdList = this.likes;
        if (partialIdList != null) {
            coreMomentInfo.likes = partialIdList.clone();
        }
        PartialIdList partialIdList2 = this.messages;
        if (partialIdList2 != null) {
            coreMomentInfo.messages = partialIdList2.clone();
        }
        List<TopicMomentIdBox> list2 = this.topics;
        if (list2 != null) {
            coreMomentInfo.topics = ValueObject.util_map(list2, new w9j() { // from class: l.fz9
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).m16011clone();
                }
            });
        }
        List<MomentTag> list3 = this.tags;
        if (list3 != null) {
            coreMomentInfo.tags = ValueObject.util_map(list3, new w9j() { // from class: l.gz9
                public final Object call(Object obj) {
                    return ((MomentTag) obj).m14340clone();
                }
            });
        }
        List<VideoBullet> list4 = this.videoBullets;
        if (list4 != null) {
            coreMomentInfo.videoBullets = ValueObject.util_map(list4, new w9j() { // from class: l.hz9
                public final Object call(Object obj) {
                    return ((VideoBullet) obj).m16223clone();
                }
            });
        }
        coreMomentInfo.musicId = this.musicId;
        MomentCard momentCard = this.momentCard;
        if (momentCard != null) {
            coreMomentInfo.momentCard = momentCard.m14332clone();
        }
        coreMomentInfo.sourceType = this.sourceType;
        return coreMomentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreMomentInfo)) {
            return false;
        }
        CoreMomentInfo coreMomentInfo = (CoreMomentInfo) obj;
        return super.equals(obj) && this.localCreatedSession == coreMomentInfo.localCreatedSession && this.localInFeed == coreMomentInfo.localInFeed && this.localInUserFeed == coreMomentInfo.localInUserFeed && ValueObject.util_equals(this.value, coreMomentInfo.value) && this.createdTime == coreMomentInfo.createdTime && ValueObject.util_equals(this.owner, coreMomentInfo.owner) && ValueObject.util_equals(this.media, coreMomentInfo.media) && this.haveLiked == coreMomentInfo.haveLiked && ValueObject.util_equals(this.location, coreMomentInfo.location) && ValueObject.util_equals(this.momentType, coreMomentInfo.momentType) && this.isVoiceLive == coreMomentInfo.isVoiceLive && this.isLive == coreMomentInfo.isLive && this.views == coreMomentInfo.views && ValueObject.util_equals(this.likes, coreMomentInfo.likes) && ValueObject.util_equals(this.messages, coreMomentInfo.messages) && ValueObject.util_equals(this.topics, coreMomentInfo.topics) && ValueObject.util_equals(this.tags, coreMomentInfo.tags) && ValueObject.util_equals(this.videoBullets, coreMomentInfo.videoBullets) && ValueObject.util_equals(this.musicId, coreMomentInfo.musicId) && ValueObject.util_equals(this.momentCard, coreMomentInfo.momentCard) && ValueObject.util_equals(this.sourceType, coreMomentInfo.sourceType);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((super.hashCode() * 41) + this.localCreatedSession) * 41) + (this.localInFeed ? 1231 : 1237)) * 41) + (this.localInUserFeed ? 1231 : 1237)) * 41;
        String str = this.value;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.owner;
        int iHashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Media> list = this.media;
        int iHashCode4 = (((iHashCode3 + (list != null ? list.hashCode() : 0)) * 41) + (this.haveLiked ? 1231 : 1237)) * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode5 = (iHashCode4 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        CoreMomentType coreMomentType = this.momentType;
        int iHashCode6 = (((((((iHashCode5 + (coreMomentType != null ? coreMomentType.hashCode() : 0)) * 41) + (this.isVoiceLive ? 1231 : 1237)) * 41) + (this.isLive ? 1231 : 1237)) * 41) + this.views) * 41;
        PartialIdList partialIdList = this.likes;
        int iHashCode7 = (iHashCode6 + (partialIdList != null ? partialIdList.hashCode() : 0)) * 41;
        PartialIdList partialIdList2 = this.messages;
        int iHashCode8 = (iHashCode7 + (partialIdList2 != null ? partialIdList2.hashCode() : 0)) * 41;
        List<TopicMomentIdBox> list2 = this.topics;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<MomentTag> list3 = this.tags;
        int iHashCode10 = (iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<VideoBullet> list4 = this.videoBullets;
        int iHashCode11 = (iHashCode10 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str3 = this.musicId;
        int iHashCode12 = (iHashCode11 + (str3 != null ? str3.hashCode() : 0)) * 41;
        MomentCard momentCard = this.momentCard;
        int iHashCode13 = (iHashCode12 + (momentCard != null ? momentCard.hashCode() : 0)) * 41;
        String str4 = this.sourceType;
        int iHashCode14 = iHashCode13 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode14;
        return iHashCode14;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(CoreMomentInfo coreMomentInfo) {
        if (!shouldMergeData() || equals(coreMomentInfo)) {
            return;
        }
        if (!isFieldParsed("value")) {
            this.value = coreMomentInfo.value;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = coreMomentInfo.createdTime;
        }
        if (!isFieldParsed("owner")) {
            this.owner = coreMomentInfo.owner;
        }
        if (!isFieldParsed("media")) {
            this.media = coreMomentInfo.media;
        }
        if (!isFieldParsed("haveLiked")) {
            this.haveLiked = coreMomentInfo.haveLiked;
        }
        if (!isFieldParsed(MessageType.location)) {
            this.location = coreMomentInfo.location;
        }
        if (!isFieldParsed("momentType")) {
            this.momentType = coreMomentInfo.momentType;
        }
        if (!isFieldParsed("isVoiceLive")) {
            this.isVoiceLive = coreMomentInfo.isVoiceLive;
        }
        if (!isFieldParsed("isLive")) {
            this.isLive = coreMomentInfo.isLive;
        }
        if (!isFieldParsed("views")) {
            this.views = coreMomentInfo.views;
        }
        if (!isFieldParsed("likes")) {
            this.likes = coreMomentInfo.likes;
        }
        if (!isFieldParsed("messages")) {
            this.messages = coreMomentInfo.messages;
        }
        if (!isFieldParsed("topics")) {
            this.topics = coreMomentInfo.topics;
        }
        if (!isFieldParsed("tags")) {
            this.tags = coreMomentInfo.tags;
        }
        if (!isFieldParsed("videoBullets")) {
            this.videoBullets = coreMomentInfo.videoBullets;
        }
        if (!isFieldParsed("musicId")) {
            this.musicId = coreMomentInfo.musicId;
        }
        if (!isFieldParsed("momentCard")) {
            this.momentCard = coreMomentInfo.momentCard;
        }
        if (!isFieldParsed("sourceType")) {
            this.sourceType = coreMomentInfo.sourceType;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.value == null) {
            this.value = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.likes == null) {
            this.likes = PartialIdList.new_();
        }
        if (this.messages == null) {
            this.messages = PartialIdList.new_();
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.videoBullets == null) {
            this.videoBullets = new ArrayList();
        }
        if (this.musicId == null) {
            this.musicId = "";
        }
        if (this.momentCard == null) {
            this.momentCard = MomentCard.new_();
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    public void setLocationName(String str) {
        this.locationName = str;
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public LocalStatus status() {
        if (((CopyObject) this).id.startsWith("fake_id_")) {
            return this.localCreatedSession == ((Integer) App.i.get()).intValue() ? LocalStatus.get("sending") : LocalStatus.get("failed");
        }
        return LocalStatus.get(StickStatus.normal);
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
