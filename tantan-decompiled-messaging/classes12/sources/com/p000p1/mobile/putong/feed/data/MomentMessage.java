package com.p000p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.LocalStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.p1.mobile.android.app.App;
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
import l.qib0;
import l.w9j;
import l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentMessage extends CopyObject<MomentMessage> implements Cloneable, Serializable {
    public static final String TYPE = "momentmessage";

    @NonNull
    @ProtobufIndex(index = 68)
    public Accessory accessory;

    @NonNull
    public String api_only_otherUser;

    @Nullable
    public MomentMessageReference api_only_reference;

    @NonNull
    @ProtobufIndex(index = 56)
    public String cid;

    @NonNull
    public CommentInfo commentInfo;

    @ProtobufIndex(index = 55)
    public double createdTime;
    public boolean isBottom;
    public boolean isCommentFromKanKan;
    public boolean isNewComment;
    public boolean isTopic;

    @Nullable
    @ProtobufIndex(index = 57)
    public String likeOfMoment;
    public boolean liked;
    public int likes;

    @ProtobufIndex(index = 52)
    public int localCreatedSession;

    @ProtobufIndex(index = 51)
    public long localCreatedTime;

    @ProtobufIndex(index = 54)
    public boolean localInConversation;

    @ProtobufIndex(index = 53)
    public boolean localInMoment;

    @Nullable
    @ProtobufIndex(index = 58)
    public List<Media> media;
    public Media mediaComment;

    @Nullable
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO)
    public MomentMessageType messageType;

    @Nullable
    @ProtobufIndex(index = 60)
    public String moment;
    public String momentShowFromType;

    @NonNull
    public String moreSubComments;

    @NonNull
    @ProtobufIndex(index = 61)
    public String owner;

    @NonNull
    public String parentCommentId;

    @Nullable
    @ProtobufIndex(index = 63)
    public Boolean recalled;
    public String replyCommentId;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 65)
    public MomentMessageSetting settings;

    @NonNull
    @ProtobufIndex(index = 67)
    public CommentStatus status;

    @Nullable
    @ProtobufIndex(index = 59)
    public String sticker;

    @NonNull
    public List<String> subCommentIds;

    @NonNull
    @ProtobufIndex(index = 62)
    public String value;
    public static ProtobufAdapter<MomentMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMessage>() { // from class: com.p1.mobile.putong.feed.data.MomentMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentMessage momentMessage) {
            int iJ = CodedOutputByteBufferNano.j(1, ((CopyObject) momentMessage)._id);
            String str = ((CopyObject) momentMessage).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(51, momentMessage.localCreatedTime) + CodedOutputByteBufferNano.h(52, momentMessage.localCreatedSession) + CodedOutputByteBufferNano.b(53, momentMessage.localInMoment) + CodedOutputByteBufferNano.b(54, momentMessage.localInConversation) + CodedOutputByteBufferNano.d(55, momentMessage.createdTime);
            String str2 = momentMessage.cid;
            if (str2 != null) {
                iJ2 += CodedOutputByteBufferNano.o(56, str2);
            }
            String str3 = momentMessage.likeOfMoment;
            if (str3 != null) {
                iJ2 += CodedOutputByteBufferNano.o(57, str3);
            }
            List<Media> list = momentMessage.media;
            if (list != null) {
                iJ2 += CodedOutputByteBufferNano.l(58, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = momentMessage.sticker;
            if (str4 != null) {
                iJ2 += CodedOutputByteBufferNano.o(59, str4);
            }
            String str5 = momentMessage.moment;
            if (str5 != null) {
                iJ2 += CodedOutputByteBufferNano.o(60, str5);
            }
            String str6 = momentMessage.owner;
            if (str6 != null) {
                iJ2 += CodedOutputByteBufferNano.o(61, str6);
            }
            String str7 = momentMessage.value;
            if (str7 != null) {
                iJ2 += CodedOutputByteBufferNano.o(62, str7);
            }
            Boolean bool = momentMessage.recalled;
            if (bool != null) {
                iJ2 += CodedOutputByteBufferNano.b(63, bool.booleanValue());
            }
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (momentMessageType != null) {
                iJ2 += CodedOutputByteBufferNano.h(64, momentMessageType.ordinal());
            }
            MomentMessageSetting momentMessageSetting = momentMessage.settings;
            if (momentMessageSetting != null) {
                iJ2 += CodedOutputByteBufferNano.l(65, momentMessageSetting, MomentMessageSetting.PROTOBUF_ADAPTER);
            }
            MomentMessageType momentMessageType2 = momentMessage.messageType;
            if (momentMessageType2 != null) {
                iJ2 += CodedOutputByteBufferNano.l(66, momentMessageType2, MomentMessageType.PROTOBUF_ADAPTER);
            }
            CommentStatus commentStatus = momentMessage.status;
            if (commentStatus != null) {
                iJ2 += CodedOutputByteBufferNano.l(67, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
            Accessory accessory = momentMessage.accessory;
            if (accessory != null) {
                iJ2 += CodedOutputByteBufferNano.l(68, accessory, Accessory.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentMessage).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentMessage m19633parse(nb5 nb5Var) throws IOException {
            MomentMessage momentMessage = new MomentMessage();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (momentMessage.messageType == null && numValueOf != null) {
                            momentMessage.messageType = (MomentMessageType) MomentMessageType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentMessage.api_only_otherUser == null) {
                            momentMessage.api_only_otherUser = "";
                        }
                        if (momentMessage.cid == null) {
                            momentMessage.cid = "";
                        }
                        if (momentMessage.commentInfo == null) {
                            momentMessage.commentInfo = CommentInfo.new_();
                        }
                        if (momentMessage.parentCommentId == null) {
                            momentMessage.parentCommentId = "";
                        }
                        if (momentMessage.subCommentIds == null) {
                            momentMessage.subCommentIds = new ArrayList();
                        }
                        if (momentMessage.moreSubComments == null) {
                            momentMessage.moreSubComments = "";
                        }
                        if (momentMessage.owner == null) {
                            momentMessage.owner = "";
                        }
                        if (momentMessage.value == null) {
                            momentMessage.value = "";
                        }
                        if (momentMessage.settings == null) {
                            momentMessage.settings = MomentMessageSetting.new_();
                        }
                        if (momentMessage.status == null) {
                            momentMessage.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentMessage.accessory == null) {
                            momentMessage.accessory = Accessory.new_();
                        }
                        break;
                    case 8:
                        ((CopyObject) momentMessage)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((CopyObject) momentMessage).id = nb5Var.s();
                        continue;
                    case 408:
                        momentMessage.localCreatedTime = nb5Var.k();
                        continue;
                    case 416:
                        momentMessage.localCreatedSession = nb5Var.j();
                        continue;
                    case 424:
                        momentMessage.localInMoment = nb5Var.g();
                        continue;
                    case 432:
                        momentMessage.localInConversation = nb5Var.g();
                        continue;
                    case 441:
                        momentMessage.createdTime = nb5Var.h();
                        continue;
                    case 450:
                        momentMessage.cid = nb5Var.s();
                        continue;
                    case 458:
                        momentMessage.likeOfMoment = nb5Var.s();
                        continue;
                    case 466:
                        momentMessage.media = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 474:
                        momentMessage.sticker = nb5Var.s();
                        continue;
                    case 482:
                        momentMessage.moment = nb5Var.s();
                        continue;
                    case 490:
                        momentMessage.owner = nb5Var.s();
                        continue;
                    case 498:
                        momentMessage.value = nb5Var.s();
                        continue;
                    case 504:
                        momentMessage.recalled = Boolean.valueOf(nb5Var.g());
                        continue;
                    case 512:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 522:
                        momentMessage.settings = (MomentMessageSetting) nb5Var.l(MomentMessageSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 530:
                        momentMessage.messageType = (MomentMessageType) nb5Var.l(MomentMessageType.PROTOBUF_ADAPTER);
                        continue;
                    case 538:
                        momentMessage.status = (CommentStatus) nb5Var.l(CommentStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 546:
                        momentMessage.accessory = (Accessory) nb5Var.l(Accessory.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (momentMessage.messageType == null && numValueOf != null) {
                            momentMessage.messageType = (MomentMessageType) MomentMessageType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentMessage.api_only_otherUser == null) {
                            momentMessage.api_only_otherUser = "";
                        }
                        if (momentMessage.cid == null) {
                            momentMessage.cid = "";
                        }
                        if (momentMessage.commentInfo == null) {
                            momentMessage.commentInfo = CommentInfo.new_();
                        }
                        if (momentMessage.parentCommentId == null) {
                            momentMessage.parentCommentId = "";
                        }
                        if (momentMessage.subCommentIds == null) {
                            momentMessage.subCommentIds = new ArrayList();
                        }
                        if (momentMessage.moreSubComments == null) {
                            momentMessage.moreSubComments = "";
                        }
                        if (momentMessage.owner == null) {
                            momentMessage.owner = "";
                        }
                        if (momentMessage.value == null) {
                            momentMessage.value = "";
                        }
                        if (momentMessage.settings == null) {
                            momentMessage.settings = MomentMessageSetting.new_();
                        }
                        if (momentMessage.status == null) {
                            momentMessage.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentMessage.accessory == null) {
                            momentMessage.accessory = Accessory.new_();
                            return momentMessage;
                        }
                        break;
                }
            }
            return momentMessage;
        }

        public void serialize(MomentMessage momentMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((CopyObject) momentMessage)._id);
            String str = ((CopyObject) momentMessage).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.I(51, momentMessage.localCreatedTime);
            codedOutputByteBufferNano.G(52, momentMessage.localCreatedSession);
            codedOutputByteBufferNano.A(53, momentMessage.localInMoment);
            codedOutputByteBufferNano.A(54, momentMessage.localInConversation);
            codedOutputByteBufferNano.C(55, momentMessage.createdTime);
            String str2 = momentMessage.cid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(56, str2);
            }
            String str3 = momentMessage.likeOfMoment;
            if (str3 != null) {
                codedOutputByteBufferNano.R(57, str3);
            }
            List<Media> list = momentMessage.media;
            if (list != null) {
                codedOutputByteBufferNano.K(58, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = momentMessage.sticker;
            if (str4 != null) {
                codedOutputByteBufferNano.R(59, str4);
            }
            String str5 = momentMessage.moment;
            if (str5 != null) {
                codedOutputByteBufferNano.R(60, str5);
            }
            String str6 = momentMessage.owner;
            if (str6 != null) {
                codedOutputByteBufferNano.R(61, str6);
            }
            String str7 = momentMessage.value;
            if (str7 != null) {
                codedOutputByteBufferNano.R(62, str7);
            }
            Boolean bool = momentMessage.recalled;
            if (bool != null) {
                codedOutputByteBufferNano.A(63, bool.booleanValue());
            }
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (momentMessageType != null) {
                codedOutputByteBufferNano.G(64, momentMessageType.ordinal());
            }
            MomentMessageSetting momentMessageSetting = momentMessage.settings;
            if (momentMessageSetting != null) {
                codedOutputByteBufferNano.K(65, momentMessageSetting, MomentMessageSetting.PROTOBUF_ADAPTER);
            }
            MomentMessageType momentMessageType2 = momentMessage.messageType;
            if (momentMessageType2 != null) {
                codedOutputByteBufferNano.K(66, momentMessageType2, MomentMessageType.PROTOBUF_ADAPTER);
            }
            CommentStatus commentStatus = momentMessage.status;
            if (commentStatus != null) {
                codedOutputByteBufferNano.K(67, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
            Accessory accessory = momentMessage.accessory;
            if (accessory != null) {
                codedOutputByteBufferNano.K(68, accessory, Accessory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentMessage> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessage>() { // from class: com.p1.mobile.putong.feed.data.MomentMessage.2
        public Class getDataClass() {
            return MomentMessage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentMessage mo17830newInstance() {
            return new MomentMessage();
        }

        public boolean parseField(MomentMessage momentMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "accessory":
                    momentMessage.accessory = (Accessory) Accessory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localInMoment":
                    momentMessage.localInMoment = jsonParser.getValueAsBoolean();
                    return true;
                case "otherUser":
                    momentMessage.api_only_otherUser = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "sticker":
                    momentMessage.sticker = jsonParser.getValueAsString();
                    return true;
                case "likeOfMoment":
                    momentMessage.likeOfMoment = jsonParser.getValueAsString();
                    return true;
                case "localInConversation":
                    momentMessage.localInConversation = jsonParser.getValueAsBoolean();
                    return true;
                case "moment":
                    momentMessage.moment = jsonParser.getValueAsString();
                    return true;
                case "reference":
                    momentMessage.api_only_reference = (MomentMessageReference) MomentMessageReference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    momentMessage.status = (CommentStatus) CommentStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "recalled":
                    momentMessage.recalled = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "isBottom":
                    momentMessage.isBottom = jsonParser.getValueAsBoolean();
                    return true;
                case "isNewComment":
                    momentMessage.isNewComment = jsonParser.getValueAsBoolean();
                    return true;
                case "createdTime":
                    momentMessage.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "parentCommentId":
                    momentMessage.parentCommentId = jsonParser.getValueAsString();
                    return true;
                case "localCreatedSession":
                    momentMessage.localCreatedSession = jsonParser.getValueAsInt();
                    return true;
                case "moreSubComments":
                    momentMessage.moreSubComments = jsonParser.getValueAsString();
                    return true;
                case "id":
                    ((CopyObject) momentMessage).id = jsonParser.getValueAsString();
                    return false;
                case "liked":
                    momentMessage.liked = jsonParser.getValueAsBoolean();
                    return true;
                case "likes":
                    momentMessage.likes = jsonParser.getValueAsInt();
                    return true;
                case "media":
                    momentMessage.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    momentMessage.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "value":
                    momentMessage.value = jsonParser.getValueAsString();
                    return true;
                case "msgType":
                    momentMessage.messageType = (MomentMessageType) MomentMessageType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "subCommentIds":
                    momentMessage.subCommentIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "settings":
                    momentMessage.settings = (MomentMessageSetting) MomentMessageSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localCreatedTime":
                    momentMessage.localCreatedTime = jsonParser.getValueAsLong();
                    return true;
                case "commentInfo":
                    momentMessage.commentInfo = (CommentInfo) CommentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentMessage momentMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "accessory":
                case "localInMoment":
                case "otherUser":
                case "sticker":
                case "likeOfMoment":
                case "localInConversation":
                case "moment":
                case "reference":
                case "status":
                case "recalled":
                case "isBottom":
                case "isNewComment":
                case "createdTime":
                case "parentCommentId":
                case "localCreatedSession":
                case "moreSubComments":
                    return true;
                case "id":
                    return false;
                case "liked":
                case "likes":
                case "media":
                case "owner":
                case "value":
                case "msgType":
                case "subCommentIds":
                case "settings":
                case "localCreatedTime":
                case "commentInfo":
                    return true;
                default:
                    return super.parseFieldCheck(momentMessage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessage momentMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = ((CopyObject) momentMessage).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("localCreatedTime", momentMessage.localCreatedTime);
            jsonGenerator.writeNumberField("localCreatedSession", momentMessage.localCreatedSession);
            jsonGenerator.writeBooleanField("localInMoment", momentMessage.localInMoment);
            jsonGenerator.writeBooleanField("localInConversation", momentMessage.localInConversation);
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(momentMessage.createdTime), jsonGenerator, true);
            if (momentMessage.api_only_otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.USER_ID.serialize(momentMessage.api_only_otherUser, jsonGenerator, true);
            }
            String str2 = momentMessage.likeOfMoment;
            if (str2 != null) {
                jsonGenerator.writeStringField("likeOfMoment", str2);
            }
            if (momentMessage.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(momentMessage.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str3 = momentMessage.sticker;
            if (str3 != null) {
                jsonGenerator.writeStringField("sticker", str3);
            }
            if (momentMessage.api_only_reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                MomentMessageReference.JSON_ADAPTER.serialize(momentMessage.api_only_reference, jsonGenerator, true);
            }
            String str4 = momentMessage.moment;
            if (str4 != null) {
                jsonGenerator.writeStringField("moment", str4);
            }
            if (momentMessage.commentInfo != null) {
                jsonGenerator.writeFieldName("commentInfo");
                CommentInfo.JSON_ADAPTER.serialize(momentMessage.commentInfo, jsonGenerator, true);
            }
            String str5 = momentMessage.parentCommentId;
            if (str5 != null) {
                jsonGenerator.writeStringField("parentCommentId", str5);
            }
            if (momentMessage.subCommentIds != null) {
                jsonGenerator.writeFieldName("subCommentIds");
                JsonAdapter.serializeArray(momentMessage.subCommentIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = momentMessage.moreSubComments;
            if (str6 != null) {
                jsonGenerator.writeStringField("moreSubComments", str6);
            }
            jsonGenerator.writeBooleanField("isBottom", momentMessage.isBottom);
            if (momentMessage.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(momentMessage.owner, jsonGenerator, true);
            }
            String str7 = momentMessage.value;
            if (str7 != null) {
                jsonGenerator.writeStringField("value", str7);
            }
            if (momentMessage.messageType != null) {
                jsonGenerator.writeFieldName("msgType");
                MomentMessageType.JSON_ADAPTER.serialize(momentMessage.messageType, jsonGenerator, true);
            }
            if (momentMessage.settings != null) {
                jsonGenerator.writeFieldName(Settings.TYPE);
                MomentMessageSetting.JSON_ADAPTER.serialize(momentMessage.settings, jsonGenerator, true);
            }
            Boolean bool = momentMessage.recalled;
            if (bool != null) {
                jsonGenerator.writeBooleanField("recalled", bool.booleanValue());
            }
            jsonGenerator.writeNumberField("likes", momentMessage.likes);
            jsonGenerator.writeBooleanField("liked", momentMessage.liked);
            jsonGenerator.writeBooleanField("isNewComment", momentMessage.isNewComment);
            if (momentMessage.status != null) {
                jsonGenerator.writeFieldName("status");
                CommentStatus.JSON_ADAPTER.serialize(momentMessage.status, jsonGenerator, true);
            }
            if (momentMessage.accessory != null) {
                jsonGenerator.writeFieldName(Accessory.TYPE);
                Accessory.JSON_ADAPTER.serialize(momentMessage.accessory, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public int viewHeight = -1;
    private HashSet<String> parseFieldSet = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1794a(String str) {
        return str;
    }

    public static MomentMessage new_() {
        MomentMessage momentMessage = new MomentMessage();
        momentMessage.nullCheck();
        return momentMessage;
    }

    public Audio audio() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Audio)) {
            return null;
        }
        return (Audio) this.media.get(0);
    }

    /* JADX INFO: renamed from: beforeApiSerialize, reason: merged with bridge method [inline-methods] */
    public MomentMessage m19630beforeApiSerialize() {
        MomentMessage momentMessageM19632clone = m19632clone();
        momentMessageM19632clone.reverseParseComplete();
        return momentMessageM19632clone;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentMessage m19632clone() {
        MomentMessage momentMessage = new MomentMessage();
        ((CopyObject) momentMessage)._id = ((CopyObject) this)._id;
        ((CopyObject) momentMessage).id = ((CopyObject) this).id;
        momentMessage.localCreatedTime = this.localCreatedTime;
        momentMessage.localCreatedSession = this.localCreatedSession;
        momentMessage.localInMoment = this.localInMoment;
        momentMessage.localInConversation = this.localInConversation;
        momentMessage.createdTime = this.createdTime;
        momentMessage.api_only_otherUser = this.api_only_otherUser;
        momentMessage.cid = this.cid;
        momentMessage.likeOfMoment = this.likeOfMoment;
        List<Media> list = this.media;
        if (list != null) {
            momentMessage.media = ValueObject.util_map(list, new w9j() { // from class: l.lg00
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        momentMessage.sticker = this.sticker;
        MomentMessageReference momentMessageReference = this.api_only_reference;
        if (momentMessageReference != null) {
            momentMessage.api_only_reference = momentMessageReference.m19635clone();
        }
        momentMessage.moment = this.moment;
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo != null) {
            momentMessage.commentInfo = commentInfo.m19463clone();
        }
        momentMessage.parentCommentId = this.parentCommentId;
        List<String> list2 = this.subCommentIds;
        if (list2 != null) {
            momentMessage.subCommentIds = ValueObject.util_map(list2, new w9j() { // from class: l.mg00
                public final Object call(Object obj) {
                    return MomentMessage.m1794a((String) obj);
                }
            });
        }
        momentMessage.moreSubComments = this.moreSubComments;
        momentMessage.isBottom = this.isBottom;
        momentMessage.owner = this.owner;
        momentMessage.value = this.value;
        momentMessage.messageType = this.messageType;
        MomentMessageSetting momentMessageSetting = this.settings;
        if (momentMessageSetting != null) {
            momentMessage.settings = momentMessageSetting.m19638clone();
        }
        momentMessage.recalled = this.recalled;
        momentMessage.likes = this.likes;
        momentMessage.liked = this.liked;
        momentMessage.isNewComment = this.isNewComment;
        momentMessage.status = this.status;
        Accessory accessory = this.accessory;
        if (accessory != null) {
            momentMessage.accessory = accessory.m19400clone();
        }
        return momentMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentMessage)) {
            return false;
        }
        MomentMessage momentMessage = (MomentMessage) obj;
        return super.equals(obj) && this.localInMoment == momentMessage.localInMoment && this.localInConversation == momentMessage.localInConversation && this.createdTime == momentMessage.createdTime && ValueObject.util_equals(this.api_only_otherUser, momentMessage.api_only_otherUser) && ValueObject.util_equals(this.cid, momentMessage.cid) && ValueObject.util_equals(this.likeOfMoment, momentMessage.likeOfMoment) && ValueObject.util_equals(this.media, momentMessage.media) && ValueObject.util_equals(this.sticker, momentMessage.sticker) && ValueObject.util_equals(this.api_only_reference, momentMessage.api_only_reference) && ValueObject.util_equals(this.moment, momentMessage.moment) && ValueObject.util_equals(this.commentInfo, momentMessage.commentInfo) && ValueObject.util_equals(this.parentCommentId, momentMessage.parentCommentId) && ValueObject.util_equals(this.subCommentIds, momentMessage.subCommentIds) && ValueObject.util_equals(this.moreSubComments, momentMessage.moreSubComments) && this.isBottom == momentMessage.isBottom && ValueObject.util_equals(this.owner, momentMessage.owner) && ValueObject.util_equals(this.value, momentMessage.value) && ValueObject.util_equals(this.messageType, momentMessage.messageType) && ValueObject.util_equals(this.settings, momentMessage.settings) && ValueObject.util_equals(this.recalled, momentMessage.recalled) && this.likes == momentMessage.likes && this.liked == momentMessage.liked && this.isNewComment == momentMessage.isNewComment && ValueObject.util_equals(this.status, momentMessage.status) && ValueObject.util_equals(this.accessory, momentMessage.accessory);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getMomentShowFromType() {
        String str = this.momentShowFromType;
        return str == null ? "" : str;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + (this.localInMoment ? 1231 : 1237)) * 41;
        int i2 = this.localInConversation ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode + i2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.api_only_otherUser;
        int iHashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cid;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.likeOfMoment;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Media> list = this.media;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.sticker;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        MomentMessageReference momentMessageReference = this.api_only_reference;
        int iHashCode7 = (iHashCode6 + (momentMessageReference != null ? momentMessageReference.hashCode() : 0)) * 41;
        String str5 = this.moment;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        CommentInfo commentInfo = this.commentInfo;
        int iHashCode9 = (iHashCode8 + (commentInfo != null ? commentInfo.hashCode() : 0)) * 41;
        String str6 = this.parentCommentId;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list2 = this.subCommentIds;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str7 = this.moreSubComments;
        int iHashCode12 = (((iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isBottom ? 1231 : 1237)) * 41;
        String str8 = this.owner;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.value;
        int iHashCode14 = (iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 41;
        MomentMessageType momentMessageType = this.messageType;
        int iHashCode15 = (iHashCode14 + (momentMessageType != null ? momentMessageType.hashCode() : 0)) * 41;
        MomentMessageSetting momentMessageSetting = this.settings;
        int iHashCode16 = (iHashCode15 + (momentMessageSetting != null ? momentMessageSetting.hashCode() : 0)) * 41;
        Boolean bool = this.recalled;
        int iHashCode17 = (((((((iHashCode16 + (bool != null ? bool.hashCode() : 0)) * 41) + this.likes) * 41) + (this.liked ? 1231 : 1237)) * 41) + (this.isNewComment ? 1231 : 1237)) * 41;
        CommentStatus commentStatus = this.status;
        int iHashCode18 = (iHashCode17 + (commentStatus != null ? commentStatus.hashCode() : 0)) * 41;
        Accessory accessory = this.accessory;
        int iHashCode19 = iHashCode18 + (accessory != null ? accessory.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode19;
        return iHashCode19;
    }

    public boolean isChildComment() {
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.parentMessageId) || this.commentInfo.parentMessageId.equals("0")) {
            return (TextUtils.isEmpty(this.parentCommentId) || this.parentCommentId.equals("0")) ? false : true;
        }
        return true;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isLocal() {
        return !TEnum.equals(status(), "normal");
    }

    public boolean isMe() {
        return qib0.c0.userId().equals(this.owner);
    }

    public boolean isOtherUser() {
        return !isMe();
    }

    public void mergeData(MomentMessage momentMessage) {
        if (!shouldMergeData() || equals(momentMessage)) {
            return;
        }
        if (!isFieldParsed("localCreatedTime")) {
            this.localCreatedTime = momentMessage.localCreatedTime;
        }
        if (!isFieldParsed("localCreatedSession")) {
            this.localCreatedSession = momentMessage.localCreatedSession;
        }
        if (!isFieldParsed("localInMoment")) {
            this.localInMoment = momentMessage.localInMoment;
        }
        if (!isFieldParsed("localInConversation")) {
            this.localInConversation = momentMessage.localInConversation;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = momentMessage.createdTime;
        }
        if (!isFieldParsed("otherUser")) {
            this.api_only_otherUser = momentMessage.api_only_otherUser;
        }
        if (!isFieldParsed("likeOfMoment")) {
            this.likeOfMoment = momentMessage.likeOfMoment;
        }
        if (!isFieldParsed(Media.TYPE)) {
            this.media = momentMessage.media;
        }
        if (!isFieldParsed("sticker")) {
            this.sticker = momentMessage.sticker;
        }
        if (!isFieldParsed(Reference.TYPE)) {
            this.api_only_reference = momentMessage.api_only_reference;
        }
        if (!isFieldParsed("moment")) {
            this.moment = momentMessage.moment;
        }
        if (!isFieldParsed("commentInfo")) {
            this.commentInfo = momentMessage.commentInfo;
        }
        if (!isFieldParsed("parentCommentId")) {
            this.parentCommentId = momentMessage.parentCommentId;
        }
        if (!isFieldParsed("subCommentIds")) {
            this.subCommentIds = momentMessage.subCommentIds;
        }
        if (!isFieldParsed("moreSubComments")) {
            this.moreSubComments = momentMessage.moreSubComments;
        }
        if (!isFieldParsed("isBottom")) {
            this.isBottom = momentMessage.isBottom;
        }
        if (!isFieldParsed(Owner.TYPE)) {
            this.owner = momentMessage.owner;
        }
        if (!isFieldParsed("value")) {
            this.value = momentMessage.value;
        }
        if (!isFieldParsed("msgType")) {
            this.messageType = momentMessage.messageType;
        }
        if (!isFieldParsed(Settings.TYPE)) {
            this.settings = momentMessage.settings;
        }
        if (!isFieldParsed("recalled")) {
            this.recalled = momentMessage.recalled;
        }
        if (!isFieldParsed("likes")) {
            this.likes = momentMessage.likes;
        }
        if (!isFieldParsed("liked")) {
            this.liked = momentMessage.liked;
        }
        if (!isFieldParsed("isNewComment")) {
            this.isNewComment = momentMessage.isNewComment;
        }
        if (!isFieldParsed("status")) {
            this.status = momentMessage.status;
        }
        if (!isFieldParsed(Accessory.TYPE)) {
            this.accessory = momentMessage.accessory;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.api_only_otherUser == null) {
            this.api_only_otherUser = "";
        }
        if (this.cid == null) {
            this.cid = "";
        }
        if (this.commentInfo == null) {
            this.commentInfo = CommentInfo.new_();
        }
        if (this.parentCommentId == null) {
            this.parentCommentId = "";
        }
        if (this.subCommentIds == null) {
            this.subCommentIds = new ArrayList();
        }
        if (this.moreSubComments == null) {
            this.moreSubComments = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.settings == null) {
            this.settings = MomentMessageSetting.new_();
        }
        if (this.status == null) {
            this.status = (CommentStatus) CommentStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.accessory == null) {
            this.accessory = Accessory.new_();
        }
    }

    public void onApiParseComplete() {
        this.cid = this.owner.equals(qib0.c0.userId()) ? this.api_only_otherUser : this.owner;
        this.api_only_otherUser = null;
        this.localCreatedSession = ((Integer) App.i.get()).intValue();
        this.localCreatedTime = System.nanoTime();
        MomentMessageReference momentMessageReference = this.api_only_reference;
        if (momentMessageReference != null) {
            if (!"message".equals(momentMessageReference.type) && "moment".equals(this.api_only_reference.type)) {
                boolean zEquals = TEnum.equals(this.api_only_reference.action, "like");
                MomentMessageReference momentMessageReference2 = this.api_only_reference;
                if (zEquals) {
                    this.likeOfMoment = momentMessageReference2.f694id;
                } else {
                    this.moment = momentMessageReference2.f694id;
                }
            }
            this.api_only_reference = null;
        }
        List<Media> list = this.media;
        if (list == null || !list.isEmpty()) {
            return;
        }
        this.media = null;
    }

    public Picture picture() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Picture)) {
            return null;
        }
        return (Picture) this.media.get(0);
    }

    public void putParsedField(String str) {
        if ("v2".equals(xh5.v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void reverseParseComplete() {
        String str = this.owner;
        this.api_only_otherUser = (str == null || !str.equals(qib0.c0.userId())) ? qib0.c0.userId() : this.cid;
        if (this.moment != null) {
            MomentMessageReference momentMessageReference = new MomentMessageReference();
            this.api_only_reference = momentMessageReference;
            momentMessageReference.f694id = this.moment;
            momentMessageReference.type = "moment";
            if (this.likeOfMoment != null) {
                momentMessageReference.action = FeedMomentAction.get("like");
            }
            if (this.moment != null) {
                this.api_only_reference.action = FeedMomentAction.get("comment");
            }
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public boolean shouldMergeData() {
        return "v2".equals(xh5.v(this.requestUrl));
    }

    public LocalStatus status() {
        if (TEnum.equals(this.messageType, MomentMessageType.tantan_verify_toast) || TEnum.equals(this.messageType, MomentMessageType.live_vip_greet) || TEnum.equals(this.messageType, MomentMessageType.wechat_block_toast)) {
            return LocalStatus.get("normal");
        }
        if (((CopyObject) this).id.startsWith("fake_id_")) {
            return this.localCreatedSession == ((Integer) App.i.get()).intValue() ? LocalStatus.get(LocalStatus.sending) : LocalStatus.get("failed");
        }
        return LocalStatus.get("normal");
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Video video() {
        List<Media> list = this.media;
        if (list == null || list.size() <= 0 || !(this.media.get(0) instanceof Video)) {
            return null;
        }
        return (Video) this.media.get(0);
    }
}
