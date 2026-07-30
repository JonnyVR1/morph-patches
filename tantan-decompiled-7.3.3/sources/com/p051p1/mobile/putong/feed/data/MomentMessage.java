package com.p051p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.LocalStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
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
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;
import p153l.uqb0;
import p153l.xi5;

/* JADX INFO: loaded from: classes13.dex */
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
    @ProtobufIndex(index = 64)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentMessage momentMessage) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, momentMessage._id);
            String str = momentMessage.f56856id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(51, momentMessage.localCreatedTime) + CodedOutputByteBufferNano.m17281h(52, momentMessage.localCreatedSession) + CodedOutputByteBufferNano.m17275b(53, momentMessage.localInMoment) + CodedOutputByteBufferNano.m17275b(54, momentMessage.localInConversation) + CodedOutputByteBufferNano.m17277d(55, momentMessage.createdTime);
            String str2 = momentMessage.cid;
            if (str2 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(56, str2);
            }
            String str3 = momentMessage.likeOfMoment;
            if (str3 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(57, str3);
            }
            List<Media> list = momentMessage.media;
            if (list != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(58, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = momentMessage.sticker;
            if (str4 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(59, str4);
            }
            String str5 = momentMessage.moment;
            if (str5 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(60, str5);
            }
            String str6 = momentMessage.owner;
            if (str6 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(61, str6);
            }
            String str7 = momentMessage.value;
            if (str7 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(62, str7);
            }
            Boolean bool = momentMessage.recalled;
            if (bool != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17275b(63, bool.booleanValue());
            }
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (momentMessageType != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17281h(64, momentMessageType.ordinal());
            }
            MomentMessageSetting momentMessageSetting = momentMessage.settings;
            if (momentMessageSetting != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(65, momentMessageSetting, MomentMessageSetting.PROTOBUF_ADAPTER);
            }
            MomentMessageType momentMessageType2 = momentMessage.messageType;
            if (momentMessageType2 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(66, momentMessageType2, MomentMessageType.PROTOBUF_ADAPTER);
            }
            CommentStatus commentStatus = momentMessage.status;
            if (commentStatus != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(67, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
            Accessory accessory = momentMessage.accessory;
            if (accessory != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17285l(68, accessory, Accessory.PROTOBUF_ADAPTER);
            }
            momentMessage.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentMessage parse(nc5 nc5Var) throws IOException {
            MomentMessage momentMessage = new MomentMessage();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        momentMessage._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        momentMessage.f56856id = nc5Var.m162495s();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        momentMessage.localCreatedTime = nc5Var.m162487k();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        momentMessage.localCreatedSession = nc5Var.m162486j();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        momentMessage.localInMoment = nc5Var.m162483g();
                        continue;
                    case 432:
                        momentMessage.localInConversation = nc5Var.m162483g();
                        continue;
                    case 441:
                        momentMessage.createdTime = nc5Var.m162484h();
                        continue;
                    case 450:
                        momentMessage.cid = nc5Var.m162495s();
                        continue;
                    case 458:
                        momentMessage.likeOfMoment = nc5Var.m162495s();
                        continue;
                    case 466:
                        momentMessage.media = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 474:
                        momentMessage.sticker = nc5Var.m162495s();
                        continue;
                    case 482:
                        momentMessage.moment = nc5Var.m162495s();
                        continue;
                    case 490:
                        momentMessage.owner = nc5Var.m162495s();
                        continue;
                    case 498:
                        momentMessage.value = nc5Var.m162495s();
                        continue;
                    case HttpStatus.GATEWAY_TIMEOUT_504 /* 504 */:
                        momentMessage.recalled = Boolean.valueOf(nc5Var.m162483g());
                        continue;
                    case 512:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 522:
                        momentMessage.settings = (MomentMessageSetting) nc5Var.m162488l(MomentMessageSetting.PROTOBUF_ADAPTER);
                        continue;
                    case 530:
                        momentMessage.messageType = (MomentMessageType) nc5Var.m162488l(MomentMessageType.PROTOBUF_ADAPTER);
                        continue;
                    case 538:
                        momentMessage.status = (CommentStatus) nc5Var.m162488l(CommentStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 546:
                        momentMessage.accessory = (Accessory) nc5Var.m162488l(Accessory.PROTOBUF_ADAPTER);
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentMessage momentMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, momentMessage._id);
            String str = momentMessage.f56856id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17307I(51, momentMessage.localCreatedTime);
            codedOutputByteBufferNano.m17305G(52, momentMessage.localCreatedSession);
            codedOutputByteBufferNano.m17299A(53, momentMessage.localInMoment);
            codedOutputByteBufferNano.m17299A(54, momentMessage.localInConversation);
            codedOutputByteBufferNano.m17301C(55, momentMessage.createdTime);
            String str2 = momentMessage.cid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(56, str2);
            }
            String str3 = momentMessage.likeOfMoment;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(57, str3);
            }
            List<Media> list = momentMessage.media;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(58, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = momentMessage.sticker;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(59, str4);
            }
            String str5 = momentMessage.moment;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(60, str5);
            }
            String str6 = momentMessage.owner;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(61, str6);
            }
            String str7 = momentMessage.value;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(62, str7);
            }
            Boolean bool = momentMessage.recalled;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(63, bool.booleanValue());
            }
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (momentMessageType != null) {
                codedOutputByteBufferNano.m17305G(64, momentMessageType.ordinal());
            }
            MomentMessageSetting momentMessageSetting = momentMessage.settings;
            if (momentMessageSetting != null) {
                codedOutputByteBufferNano.m17309K(65, momentMessageSetting, MomentMessageSetting.PROTOBUF_ADAPTER);
            }
            MomentMessageType momentMessageType2 = momentMessage.messageType;
            if (momentMessageType2 != null) {
                codedOutputByteBufferNano.m17309K(66, momentMessageType2, MomentMessageType.PROTOBUF_ADAPTER);
            }
            CommentStatus commentStatus = momentMessage.status;
            if (commentStatus != null) {
                codedOutputByteBufferNano.m17309K(67, commentStatus, CommentStatus.PROTOBUF_ADAPTER);
            }
            Accessory accessory = momentMessage.accessory;
            if (accessory != null) {
                codedOutputByteBufferNano.m17309K(68, accessory, Accessory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentMessage> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessage>() { // from class: com.p1.mobile.putong.feed.data.MomentMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentMessage newInstance() {
            return new MomentMessage();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(MomentMessage momentMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2115023086:
                    if (str.equals(Accessory.TYPE)) {
                        b = 0;
                    }
                    break;
                case -1974930416:
                    if (str.equals("localInMoment")) {
                        b = 1;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 2;
                    }
                    break;
                case -1890252483:
                    if (str.equals("sticker")) {
                        b = 3;
                    }
                    break;
                case -1772221586:
                    if (str.equals("likeOfMoment")) {
                        b = 4;
                    }
                    break;
                case -1407352173:
                    if (str.equals("localInConversation")) {
                        b = 5;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 6;
                    }
                    break;
                case -925155509:
                    if (str.equals(Reference.TYPE)) {
                        b = 7;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 8;
                    }
                    break;
                case -812334224:
                    if (str.equals("recalled")) {
                        b = 9;
                    }
                    break;
                case -709194763:
                    if (str.equals("isBottom")) {
                        b = 10;
                    }
                    break;
                case -578566807:
                    if (str.equals("isNewComment")) {
                        b = 11;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 12;
                    }
                    break;
                case -296152496:
                    if (str.equals("parentCommentId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -158246183:
                    if (str.equals("localCreatedSession")) {
                        b = 14;
                    }
                    break;
                case -18795073:
                    if (str.equals("moreSubComments")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        b = 17;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 18;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 19;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 20;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 21;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = 22;
                    }
                    break;
                case 1426221625:
                    if (str.equals("subCommentIds")) {
                        b = 23;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 24;
                    }
                    break;
                case 1564416362:
                    if (str.equals("localCreatedTime")) {
                        b = 25;
                    }
                    break;
                case 2103213997:
                    if (str.equals("commentInfo")) {
                        b = 26;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    momentMessage.accessory = Accessory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    momentMessage.localInMoment = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    momentMessage.api_only_otherUser = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 3:
                    momentMessage.sticker = jsonParser.getValueAsString();
                    return true;
                case 4:
                    momentMessage.likeOfMoment = jsonParser.getValueAsString();
                    return true;
                case 5:
                    momentMessage.localInConversation = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    momentMessage.moment = jsonParser.getValueAsString();
                    return true;
                case 7:
                    momentMessage.api_only_reference = MomentMessageReference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    momentMessage.status = CommentStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 9:
                    momentMessage.recalled = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case 10:
                    momentMessage.isBottom = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    momentMessage.isNewComment = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    momentMessage.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 13:
                    momentMessage.parentCommentId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    momentMessage.localCreatedSession = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    momentMessage.moreSubComments = jsonParser.getValueAsString();
                    return true;
                case 16:
                    momentMessage.f56856id = jsonParser.getValueAsString();
                    return false;
                case 17:
                    momentMessage.liked = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    momentMessage.likes = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    momentMessage.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    momentMessage.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 21:
                    momentMessage.value = jsonParser.getValueAsString();
                    return true;
                case 22:
                    momentMessage.messageType = MomentMessageType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 23:
                    momentMessage.subCommentIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    momentMessage.settings = MomentMessageSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    momentMessage.localCreatedTime = jsonParser.getValueAsLong();
                    return true;
                case 26:
                    momentMessage.commentInfo = CommentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(MomentMessage momentMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2115023086:
                    if (str.equals(Accessory.TYPE)) {
                        b = 0;
                    }
                    break;
                case -1974930416:
                    if (str.equals("localInMoment")) {
                        b = 1;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 2;
                    }
                    break;
                case -1890252483:
                    if (str.equals("sticker")) {
                        b = 3;
                    }
                    break;
                case -1772221586:
                    if (str.equals("likeOfMoment")) {
                        b = 4;
                    }
                    break;
                case -1407352173:
                    if (str.equals("localInConversation")) {
                        b = 5;
                    }
                    break;
                case -1068531200:
                    if (str.equals("moment")) {
                        b = 6;
                    }
                    break;
                case -925155509:
                    if (str.equals(Reference.TYPE)) {
                        b = 7;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 8;
                    }
                    break;
                case -812334224:
                    if (str.equals("recalled")) {
                        b = 9;
                    }
                    break;
                case -709194763:
                    if (str.equals("isBottom")) {
                        b = 10;
                    }
                    break;
                case -578566807:
                    if (str.equals("isNewComment")) {
                        b = 11;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 12;
                    }
                    break;
                case -296152496:
                    if (str.equals("parentCommentId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -158246183:
                    if (str.equals("localCreatedSession")) {
                        b = 14;
                    }
                    break;
                case -18795073:
                    if (str.equals("moreSubComments")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 102974381:
                    if (str.equals("liked")) {
                        b = 17;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 18;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 19;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 20;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 21;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = 22;
                    }
                    break;
                case 1426221625:
                    if (str.equals("subCommentIds")) {
                        b = 23;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 24;
                    }
                    break;
                case 1564416362:
                    if (str.equals("localCreatedTime")) {
                        b = 25;
                    }
                    break;
                case 2103213997:
                    if (str.equals("commentInfo")) {
                        b = 26;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                case 16:
                    return false;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    return true;
                default:
                    return super.parseFieldCheck(momentMessage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessage momentMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = momentMessage.f56856id;
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
                jsonGenerator.writeFieldName("media");
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                CommentStatus.JSON_ADAPTER.serialize(momentMessage.status, jsonGenerator, true);
            }
            if (momentMessage.accessory != null) {
                jsonGenerator.writeFieldName(Accessory.TYPE);
                Accessory.JSON_ADAPTER.serialize(momentMessage.accessory, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public int viewHeight = -1;
    private HashSet<String> parseFieldSet = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62052a(String str) {
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

    @Override // com.tantanapp.common.data.ValueObject
    public MomentMessage beforeApiSerialize() {
        MomentMessage momentMessageMo225055clone = mo225055clone();
        momentMessageMo225055clone.reverseParseComplete();
        return momentMessageMo225055clone;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentMessage mo225055clone() {
        MomentMessage momentMessage = new MomentMessage();
        momentMessage._id = this._id;
        momentMessage.f56856id = this.f56856id;
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
            momentMessage.media = ValueObject.util_map(list, new qcj() { // from class: l.uo00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        momentMessage.sticker = this.sticker;
        MomentMessageReference momentMessageReference = this.api_only_reference;
        if (momentMessageReference != null) {
            momentMessage.api_only_reference = momentMessageReference.mo225055clone();
        }
        momentMessage.moment = this.moment;
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo != null) {
            momentMessage.commentInfo = commentInfo.mo225055clone();
        }
        momentMessage.parentCommentId = this.parentCommentId;
        List<String> list2 = this.subCommentIds;
        if (list2 != null) {
            momentMessage.subCommentIds = ValueObject.util_map(list2, new qcj() { // from class: l.vo00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MomentMessage.m62052a((String) obj);
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
            momentMessage.settings = momentMessageSetting.mo225055clone();
        }
        momentMessage.recalled = this.recalled;
        momentMessage.likes = this.likes;
        momentMessage.liked = this.liked;
        momentMessage.isNewComment = this.isNewComment;
        momentMessage.status = this.status;
        Accessory accessory = this.accessory;
        if (accessory != null) {
            momentMessage.accessory = accessory.mo225055clone();
        }
        return momentMessage;
    }

    @Override // com.tantanapp.common.data.CopyObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getMomentShowFromType() {
        String str = this.momentShowFromType;
        return str == null ? "" : str;
    }

    @Override // com.tantanapp.common.data.CopyObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    public boolean isChildComment() {
        CommentInfo commentInfo = this.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.parentMessageId) || this.commentInfo.parentMessageId.equals("0")) {
            return (TextUtils.isEmpty(this.parentCommentId) || this.parentCommentId.equals("0")) ? false : true;
        }
        return true;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isLocal() {
        return !TEnum.equals(status(), "normal");
    }

    public boolean isMe() {
        return uqb0.f180397c0.userId().equals(this.owner);
    }

    public boolean isOtherUser() {
        return !isMe();
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (!isFieldParsed("media")) {
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
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = momentMessage.status;
        }
        if (!isFieldParsed(Accessory.TYPE)) {
            this.accessory = momentMessage.accessory;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        this.cid = this.owner.equals(uqb0.f180397c0.userId()) ? this.api_only_otherUser : this.owner;
        this.api_only_otherUser = null;
        this.localCreatedSession = App.f16092i.get().intValue();
        this.localCreatedTime = System.nanoTime();
        MomentMessageReference momentMessageReference = this.api_only_reference;
        if (momentMessageReference != null) {
            if (!"message".equals(momentMessageReference.type) && "moment".equals(this.api_only_reference.type)) {
                boolean zEquals = TEnum.equals(this.api_only_reference.action, "like");
                MomentMessageReference momentMessageReference2 = this.api_only_reference;
                if (zEquals) {
                    this.likeOfMoment = momentMessageReference2.f40081id;
                } else {
                    this.moment = momentMessageReference2.f40081id;
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

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xi5.m211120v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void reverseParseComplete() {
        String str = this.owner;
        this.api_only_otherUser = (str == null || !str.equals(uqb0.f180397c0.userId())) ? uqb0.f180397c0.userId() : this.cid;
        if (this.moment != null) {
            MomentMessageReference momentMessageReference = new MomentMessageReference();
            this.api_only_reference = momentMessageReference;
            momentMessageReference.f40081id = this.moment;
            momentMessageReference.type = "moment";
            if (this.likeOfMoment != null) {
                momentMessageReference.action = FeedMomentAction.get("like");
            }
            if (this.moment != null) {
                this.api_only_reference.action = FeedMomentAction.get("comment");
            }
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        return "v2".equals(xi5.m211120v(this.requestUrl));
    }

    public LocalStatus status() {
        if (TEnum.equals(this.messageType, "tantan_verify_toast") || TEnum.equals(this.messageType, "live_vip_greet") || TEnum.equals(this.messageType, "wechat_block_toast")) {
            return LocalStatus.get("normal");
        }
        if (this.f56856id.startsWith("fake_id_")) {
            return this.localCreatedSession == App.f16092i.get().intValue() ? LocalStatus.get(LocalStatus.sending) : LocalStatus.get("failed");
        }
        return LocalStatus.get("normal");
    }

    @Override // com.tantanapp.common.data.ValueObject
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
