package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.mrf0;
import l.nb5;
import l.orh0;
import l.qib0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatGroupMember extends DbObject<ChatGroupMember> implements Cloneable, Serializable {
    public static final String TYPE = "chatgroupmember";

    @NonNull
    @ProtobufIndex(index = 56)
    public String avatar;

    @ProtobufIndex(index = 61)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 65)
    public Gender gender;

    @NonNull
    @ProtobufIndex(index = 51)
    public String groupId;

    @NonNull
    @ProtobufIndex(index = 68)
    public InModeration inModeration;

    @ProtobufIndex(index = 60)
    public double joinTime;

    @NonNull
    @ProtobufIndex(index = 53)
    public String nickName;

    @NonNull
    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
    public String nickNamePinyin;

    @NonNull
    @ProtobufIndex(index = 64)
    public ChatGroupSilence operationSilence;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 58)
    public String searchCategory;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<String> searchIndices;

    @NonNull
    @ProtobufIndex(index = 63)
    public ChatGroupSilence silence;

    @NonNull
    @ProtobufIndex(index = 59)
    public ChatGroupMemberStatus status;

    @ProtobufIndex(index = 62)
    public double updatedTime;

    @NonNull
    @ProtobufIndex(index = 52)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 54)
    public String userName;
    public static ProtobufAdapter<ChatGroupMember> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupMember>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroupMember chatGroupMember) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) chatGroupMember)._id);
            String str = ((DbObject) chatGroupMember).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = chatGroupMember.groupId;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = chatGroupMember.userId;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            String str4 = chatGroupMember.nickName;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str4);
            }
            String str5 = chatGroupMember.userName;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(54, str5);
            }
            String str6 = chatGroupMember.nickNamePinyin;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(55, str6);
            }
            String str7 = chatGroupMember.avatar;
            if (str7 != null) {
                iJ += CodedOutputByteBufferNano.o(56, str7);
            }
            List<String> list = chatGroupMember.searchIndices;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(57, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = chatGroupMember.searchCategory;
            if (str8 != null) {
                iJ += CodedOutputByteBufferNano.o(58, str8);
            }
            ChatGroupMemberStatus chatGroupMemberStatus = chatGroupMember.status;
            if (chatGroupMemberStatus != null) {
                iJ += CodedOutputByteBufferNano.h(59, chatGroupMemberStatus.ordinal());
            }
            int iD = iJ + CodedOutputByteBufferNano.d(60, chatGroupMember.joinTime) + CodedOutputByteBufferNano.d(61, chatGroupMember.createdTime) + CodedOutputByteBufferNano.d(62, chatGroupMember.updatedTime);
            ChatGroupSilence chatGroupSilence = chatGroupMember.silence;
            if (chatGroupSilence != null) {
                iD += CodedOutputByteBufferNano.l(63, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence2 = chatGroupMember.operationSilence;
            if (chatGroupSilence2 != null) {
                iD += CodedOutputByteBufferNano.l(64, chatGroupSilence2, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            Gender gender = chatGroupMember.gender;
            if (gender != null) {
                iD += CodedOutputByteBufferNano.h(65, gender.ordinal());
            }
            ChatGroupMemberStatus chatGroupMemberStatus2 = chatGroupMember.status;
            if (chatGroupMemberStatus2 != null) {
                iD += CodedOutputByteBufferNano.l(66, chatGroupMemberStatus2, ChatGroupMemberStatus.PROTOBUF_ADAPTER);
            }
            Gender gender2 = chatGroupMember.gender;
            if (gender2 != null) {
                iD += CodedOutputByteBufferNano.l(67, gender2, Gender.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroupMember.inModeration;
            if (inModeration != null) {
                iD += CodedOutputByteBufferNano.l(68, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatGroupMember).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember m12025parse(nb5 nb5Var) throws IOException {
            ChatGroupMember chatGroupMember = new ChatGroupMember();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (chatGroupMember.status == null && numValueOf != null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatGroupMember.gender == null && numValueOf2 != null) {
                            chatGroupMember.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (chatGroupMember.groupId == null) {
                            chatGroupMember.groupId = "";
                        }
                        if (chatGroupMember.userId == null) {
                            chatGroupMember.userId = "";
                        }
                        if (chatGroupMember.nickName == null) {
                            chatGroupMember.nickName = "";
                        }
                        if (chatGroupMember.userName == null) {
                            chatGroupMember.userName = "";
                        }
                        if (chatGroupMember.nickNamePinyin == null) {
                            chatGroupMember.nickNamePinyin = "";
                        }
                        if (chatGroupMember.avatar == null) {
                            chatGroupMember.avatar = "";
                        }
                        if (chatGroupMember.searchIndices == null) {
                            chatGroupMember.searchIndices = new ArrayList();
                        }
                        if (chatGroupMember.searchCategory == null) {
                            chatGroupMember.searchCategory = "";
                        }
                        if (chatGroupMember.status == null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroupMember.silence == null) {
                            chatGroupMember.silence = ChatGroupSilence.new_();
                        }
                        if (chatGroupMember.operationSilence == null) {
                            chatGroupMember.operationSilence = ChatGroupSilence.new_();
                        }
                        if (chatGroupMember.gender == null) {
                            chatGroupMember.gender = Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroupMember.inModeration == null) {
                            chatGroupMember.inModeration = InModeration.new_();
                        }
                        break;
                    case 8:
                        ((DbObject) chatGroupMember)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) chatGroupMember).id = nb5Var.s();
                        continue;
                    case 410:
                        chatGroupMember.groupId = nb5Var.s();
                        continue;
                    case 418:
                        chatGroupMember.userId = nb5Var.s();
                        continue;
                    case 426:
                        chatGroupMember.nickName = nb5Var.s();
                        continue;
                    case 434:
                        chatGroupMember.userName = nb5Var.s();
                        continue;
                    case 442:
                        chatGroupMember.nickNamePinyin = nb5Var.s();
                        continue;
                    case 450:
                        chatGroupMember.avatar = nb5Var.s();
                        continue;
                    case 458:
                        chatGroupMember.searchIndices = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        chatGroupMember.searchCategory = nb5Var.s();
                        continue;
                    case 472:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 481:
                        chatGroupMember.joinTime = nb5Var.h();
                        continue;
                    case 489:
                        chatGroupMember.createdTime = nb5Var.h();
                        continue;
                    case 497:
                        chatGroupMember.updatedTime = nb5Var.h();
                        continue;
                    case 506:
                        chatGroupMember.silence = (ChatGroupSilence) nb5Var.l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 514:
                        chatGroupMember.operationSilence = (ChatGroupSilence) nb5Var.l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 520:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 530:
                        chatGroupMember.status = (ChatGroupMemberStatus) nb5Var.l(ChatGroupMemberStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 538:
                        chatGroupMember.gender = (Gender) nb5Var.l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    case 546:
                        chatGroupMember.inModeration = (InModeration) nb5Var.l(InModeration.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (chatGroupMember.status == null && numValueOf != null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatGroupMember.gender == null && numValueOf2 != null) {
                            chatGroupMember.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (chatGroupMember.groupId == null) {
                            chatGroupMember.groupId = "";
                        }
                        if (chatGroupMember.userId == null) {
                            chatGroupMember.userId = "";
                        }
                        if (chatGroupMember.nickName == null) {
                            chatGroupMember.nickName = "";
                        }
                        if (chatGroupMember.userName == null) {
                            chatGroupMember.userName = "";
                        }
                        if (chatGroupMember.nickNamePinyin == null) {
                            chatGroupMember.nickNamePinyin = "";
                        }
                        if (chatGroupMember.avatar == null) {
                            chatGroupMember.avatar = "";
                        }
                        if (chatGroupMember.searchIndices == null) {
                            chatGroupMember.searchIndices = new ArrayList();
                        }
                        if (chatGroupMember.searchCategory == null) {
                            chatGroupMember.searchCategory = "";
                        }
                        if (chatGroupMember.status == null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroupMember.silence == null) {
                            chatGroupMember.silence = ChatGroupSilence.new_();
                        }
                        if (chatGroupMember.operationSilence == null) {
                            chatGroupMember.operationSilence = ChatGroupSilence.new_();
                        }
                        if (chatGroupMember.gender == null) {
                            chatGroupMember.gender = Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroupMember.inModeration == null) {
                            chatGroupMember.inModeration = InModeration.new_();
                            return chatGroupMember;
                        }
                        break;
                }
            }
            return chatGroupMember;
        }

        public void serialize(ChatGroupMember chatGroupMember, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) chatGroupMember)._id);
            String str = ((DbObject) chatGroupMember).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = chatGroupMember.groupId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = chatGroupMember.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            String str4 = chatGroupMember.nickName;
            if (str4 != null) {
                codedOutputByteBufferNano.R(53, str4);
            }
            String str5 = chatGroupMember.userName;
            if (str5 != null) {
                codedOutputByteBufferNano.R(54, str5);
            }
            String str6 = chatGroupMember.nickNamePinyin;
            if (str6 != null) {
                codedOutputByteBufferNano.R(55, str6);
            }
            String str7 = chatGroupMember.avatar;
            if (str7 != null) {
                codedOutputByteBufferNano.R(56, str7);
            }
            List<String> list = chatGroupMember.searchIndices;
            if (list != null) {
                codedOutputByteBufferNano.K(57, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = chatGroupMember.searchCategory;
            if (str8 != null) {
                codedOutputByteBufferNano.R(58, str8);
            }
            ChatGroupMemberStatus chatGroupMemberStatus = chatGroupMember.status;
            if (chatGroupMemberStatus != null) {
                codedOutputByteBufferNano.G(59, chatGroupMemberStatus.ordinal());
            }
            codedOutputByteBufferNano.C(60, chatGroupMember.joinTime);
            codedOutputByteBufferNano.C(61, chatGroupMember.createdTime);
            codedOutputByteBufferNano.C(62, chatGroupMember.updatedTime);
            ChatGroupSilence chatGroupSilence = chatGroupMember.silence;
            if (chatGroupSilence != null) {
                codedOutputByteBufferNano.K(63, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence2 = chatGroupMember.operationSilence;
            if (chatGroupSilence2 != null) {
                codedOutputByteBufferNano.K(64, chatGroupSilence2, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            Gender gender = chatGroupMember.gender;
            if (gender != null) {
                codedOutputByteBufferNano.G(65, gender.ordinal());
            }
            ChatGroupMemberStatus chatGroupMemberStatus2 = chatGroupMember.status;
            if (chatGroupMemberStatus2 != null) {
                codedOutputByteBufferNano.K(66, chatGroupMemberStatus2, ChatGroupMemberStatus.PROTOBUF_ADAPTER);
            }
            Gender gender2 = chatGroupMember.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.K(67, gender2, Gender.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroupMember.inModeration;
            if (inModeration != null) {
                codedOutputByteBufferNano.K(68, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatGroupMember> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupMember>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.2
        public Class getDataClass() {
            return ChatGroupMember.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember m12026newInstance() {
            return new ChatGroupMember();
        }

        public boolean parseField(ChatGroupMember chatGroupMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "searchCategory":
                    chatGroupMember.searchCategory = jsonParser.getValueAsString();
                    return true;
                case "avatar":
                    chatGroupMember.avatar = jsonParser.getValueAsString();
                    return true;
                case "joinTime":
                    chatGroupMember.joinTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "gender":
                    chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "searchIndices":
                    chatGroupMember.searchIndices = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    chatGroupMember.userId = jsonParser.getValueAsString();
                    return true;
                case "operationSilence":
                    chatGroupMember.operationSilence = (ChatGroupSilence) ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    chatGroupMember.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    chatGroupMember.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "userName":
                    chatGroupMember.userName = jsonParser.getValueAsString();
                    return true;
                case "id":
                    ((DbObject) chatGroupMember).id = jsonParser.getValueAsString();
                    return false;
                case "nickName":
                    chatGroupMember.nickName = jsonParser.getValueAsString();
                    return true;
                case "groupId":
                    chatGroupMember.groupId = jsonParser.getValueAsString();
                    return true;
                case "inModeration":
                    chatGroupMember.inModeration = (InModeration) InModeration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nickNamePinyin":
                    chatGroupMember.nickNamePinyin = jsonParser.getValueAsString();
                    return true;
                case "silence":
                    chatGroupMember.silence = (ChatGroupSilence) ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroupMember chatGroupMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "searchCategory":
                case "avatar":
                case "joinTime":
                case "gender":
                case "searchIndices":
                case "status":
                case "userId":
                case "operationSilence":
                case "updatedTime":
                case "createdTime":
                case "userName":
                    return true;
                case "id":
                    return false;
                case "nickName":
                case "groupId":
                case "inModeration":
                case "nickNamePinyin":
                case "silence":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupMember, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGroupMember chatGroupMember, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) chatGroupMember).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroupMember.groupId;
            if (str2 != null) {
                jsonGenerator.writeStringField("groupId", str2);
            }
            String str3 = chatGroupMember.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = chatGroupMember.nickName;
            if (str4 != null) {
                jsonGenerator.writeStringField("nickName", str4);
            }
            String str5 = chatGroupMember.userName;
            if (str5 != null) {
                jsonGenerator.writeStringField("userName", str5);
            }
            String str6 = chatGroupMember.nickNamePinyin;
            if (str6 != null) {
                jsonGenerator.writeStringField("nickNamePinyin", str6);
            }
            String str7 = chatGroupMember.avatar;
            if (str7 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str7);
            }
            if (chatGroupMember.searchIndices != null) {
                jsonGenerator.writeFieldName("searchIndices");
                JsonAdapter.serializeArray(chatGroupMember.searchIndices, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str8 = chatGroupMember.searchCategory;
            if (str8 != null) {
                jsonGenerator.writeStringField("searchCategory", str8);
            }
            if (chatGroupMember.status != null) {
                jsonGenerator.writeFieldName("status");
                ChatGroupMemberStatus.JSON_ADAPTER.serialize(chatGroupMember.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("joinTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatGroupMember.joinTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("createdTime");
            jsonAdapter.serialize(Double.valueOf(chatGroupMember.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(chatGroupMember.updatedTime), jsonGenerator, true);
            if (chatGroupMember.silence != null) {
                jsonGenerator.writeFieldName("silence");
                ChatGroupSilence.JSON_ADAPTER.serialize(chatGroupMember.silence, jsonGenerator, true);
            }
            if (chatGroupMember.operationSilence != null) {
                jsonGenerator.writeFieldName("operationSilence");
                ChatGroupSilence.JSON_ADAPTER.serialize(chatGroupMember.operationSilence, jsonGenerator, true);
            }
            if (chatGroupMember.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(chatGroupMember.gender, jsonGenerator, true);
            }
            if (chatGroupMember.inModeration != null) {
                jsonGenerator.writeFieldName("inModeration");
                InModeration.JSON_ADAPTER.serialize(chatGroupMember.inModeration, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatGroupMember> _ID = new LongColumn<ChatGroupMember>("_id") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.3
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(((DbObject) chatGroupMember)._id);
        }

        public void set(ChatGroupMember chatGroupMember, Long l2) {
            ((DbObject) chatGroupMember)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatGroupMember> f26ID = new StringColumn<ChatGroupMember>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.4
        public String get(ChatGroupMember chatGroupMember) {
            return ((DbObject) chatGroupMember).id;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            ((DbObject) chatGroupMember).id = str;
        }
    };
    public static final StringColumn<ChatGroupMember> GROUPID = new StringColumn<ChatGroupMember>("groupId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.5
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.groupId;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.groupId = str;
        }
    };
    public static final StringColumn<ChatGroupMember> USERID = new StringColumn<ChatGroupMember>("userId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.6
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.userId;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.userId = str;
        }
    };
    public static final StringColumn<ChatGroupMember> NICKNAME = new StringColumn<ChatGroupMember>("nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.7
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.nickName;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.nickName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> USERNAME = new StringColumn<ChatGroupMember>("userName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.8
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.userName;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.userName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> NICKNAMEPINYIN = new StringColumn<ChatGroupMember>("nickNamePinyin_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.9
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.nickNamePinyin;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.nickNamePinyin = str;
        }
    };
    public static final StringColumn<ChatGroupMember> AVATAR = new StringColumn<ChatGroupMember>("avatar_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.10
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.avatar;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.avatar = str;
        }
    };
    public static final Column<ChatGroupMember, List<String>> SEARCHINDICES = new Column<ChatGroupMember, List<String>>("searchIndices_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.11
        public List<String> get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.searchIndices;
        }

        public void set(ChatGroupMember chatGroupMember, List<String> list) {
            chatGroupMember.searchIndices = list;
        }
    };
    public static final StringColumn<ChatGroupMember> SEARCHCATEGORY = new StringColumn<ChatGroupMember>("searchCategory_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.12
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.searchCategory;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.searchCategory = str;
        }
    };
    public static final TEnumColumn<ChatGroupMember, ChatGroupMemberStatus> STATUS = new TEnumColumn<ChatGroupMember, ChatGroupMemberStatus>("str_status_c", "status_c", ChatGroupMemberStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.13
        public ChatGroupMemberStatus get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.status;
        }

        public void setTEnum(ChatGroupMember chatGroupMember, ChatGroupMemberStatus chatGroupMemberStatus) {
            chatGroupMember.status = chatGroupMemberStatus;
        }
    };
    public static final DoubleColumn<ChatGroupMember> JOINTIME = new DoubleColumn<ChatGroupMember>("joinTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.14
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.joinTime);
        }

        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.joinTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> CREATEDTIME = new DoubleColumn<ChatGroupMember>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.15
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.createdTime);
        }

        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> UPDATEDTIME = new DoubleColumn<ChatGroupMember>("updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.16
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.updatedTime);
        }

        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroupMember> SILENCE_ENABLE = new BooleanColumn<ChatGroupMember>("silence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.17
        public Boolean get(ChatGroupMember chatGroupMember) {
            return Boolean.valueOf(chatGroupMember.silence.enable);
        }

        public void set(ChatGroupMember chatGroupMember, Boolean bool) {
            chatGroupMember.silence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroupMember> SILENCE_DURATION = new LongColumn<ChatGroupMember>("silence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.18
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(chatGroupMember.silence.duration);
        }

        public void set(ChatGroupMember chatGroupMember, Long l2) {
            chatGroupMember.silence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> SILENCE_UNTIL = new DoubleColumn<ChatGroupMember>("silence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.19
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.silence.until);
        }

        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.silence.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroupMember> OPERATIONSILENCE_ENABLE = new BooleanColumn<ChatGroupMember>("operationSilence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.20
        public Boolean get(ChatGroupMember chatGroupMember) {
            return Boolean.valueOf(chatGroupMember.operationSilence.enable);
        }

        public void set(ChatGroupMember chatGroupMember, Boolean bool) {
            chatGroupMember.operationSilence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroupMember> OPERATIONSILENCE_DURATION = new LongColumn<ChatGroupMember>("operationSilence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.21
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(chatGroupMember.operationSilence.duration);
        }

        public void set(ChatGroupMember chatGroupMember, Long l2) {
            chatGroupMember.operationSilence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> OPERATIONSILENCE_UNTIL = new DoubleColumn<ChatGroupMember>("operationSilence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.22
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.operationSilence.until);
        }

        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.operationSilence.until = d.doubleValue();
        }
    };
    public static final TEnumColumn<ChatGroupMember, Gender> GENDER = new TEnumColumn<ChatGroupMember, Gender>("str_gender_c", "gender_c", Gender.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.23
        public Gender get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.gender;
        }

        public void setTEnum(ChatGroupMember chatGroupMember, Gender gender) {
            chatGroupMember.gender = gender;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_NICKNAME = new StringColumn<ChatGroupMember>("inModeration_nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.24
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.nickName;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.nickName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_NAME = new StringColumn<ChatGroupMember>("inModeration_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.25
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.name;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.name = str;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_DESCRIPTION = new StringColumn<ChatGroupMember>("inModeration_description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.26
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.description;
        }

        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.description = str;
        }
    };
    public static mrf0<ChatGroupMember> DB_ADAPTER = new mrf0<ChatGroupMember>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.27
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,groupId_c TEXT,userId_c TEXT,nickName_c TEXT,userName_c TEXT,nickNamePinyin_c TEXT,avatar_c TEXT,searchIndices_c BLOB,searchCategory_c TEXT,status_c INTEGER,joinTime_c REAL,createdTime_c REAL,updatedTime_c REAL,silence_enable_c INTEGER,silence_duration_c INTEGER,silence_until_c REAL,operationSilence_enable_c INTEGER,operationSilence_duration_c INTEGER,operationSilence_until_c REAL,gender_c INTEGER,str_status_c TEXT,str_gender_c TEXT,inModeration_nickName_c TEXT,inModeration_name_c TEXT,inModeration_description_c TEXT)";
        }

        public Class getDataClass() {
            return ChatGroupMember.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember m12027init() {
            ChatGroupMember chatGroupMember = new ChatGroupMember();
            if (chatGroupMember.groupId == null) {
                chatGroupMember.groupId = "";
            }
            if (chatGroupMember.userId == null) {
                chatGroupMember.userId = "";
            }
            if (chatGroupMember.nickName == null) {
                chatGroupMember.nickName = "";
            }
            if (chatGroupMember.userName == null) {
                chatGroupMember.userName = "";
            }
            if (chatGroupMember.nickNamePinyin == null) {
                chatGroupMember.nickNamePinyin = "";
            }
            if (chatGroupMember.avatar == null) {
                chatGroupMember.avatar = "";
            }
            if (chatGroupMember.searchIndices == null) {
                chatGroupMember.searchIndices = new ArrayList();
            }
            if (chatGroupMember.searchCategory == null) {
                chatGroupMember.searchCategory = "";
            }
            if (chatGroupMember.status == null) {
                chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroupMember.silence == null) {
                chatGroupMember.silence = ChatGroupSilence.new_();
            }
            if (chatGroupMember.operationSilence == null) {
                chatGroupMember.operationSilence = ChatGroupSilence.new_();
            }
            if (chatGroupMember.gender == null) {
                chatGroupMember.gender = Gender.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroupMember.inModeration == null) {
                chatGroupMember.inModeration = InModeration.new_();
            }
            return chatGroupMember;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public ChatGroupMember m12028read(Cursor cursor, int i) {
            String str;
            int i2;
            int i3;
            String string;
            String string2 = "unknown_";
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            ChatGroupMember chatGroupMember = new ChatGroupMember();
            int i4 = -1;
            try {
                chatGroupMember.silence = new ChatGroupSilence();
                chatGroupMember.operationSilence = new ChatGroupSilence();
                chatGroupMember.inModeration = new InModeration();
                ((DbObject) chatGroupMember)._id = cursor.getLong(i);
                int i5 = i + 1;
                String string3 = null;
                ((DbObject) chatGroupMember).id = cursor.isNull(i5) ? null : cursor.getString(i5);
                int i6 = i + 2;
                chatGroupMember.groupId = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 3;
                chatGroupMember.userId = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 4;
                chatGroupMember.nickName = cursor.isNull(i8) ? null : cursor.getString(i8);
                int i9 = i + 5;
                chatGroupMember.userName = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 6;
                chatGroupMember.nickNamePinyin = cursor.isNull(i10) ? null : cursor.getString(i10);
                int i11 = i + 7;
                chatGroupMember.avatar = cursor.isNull(i11) ? null : cursor.getString(i11);
                int i12 = i + 8;
                chatGroupMember.searchIndices = cursor.isNull(i12) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i12));
                int i13 = i + 9;
                chatGroupMember.searchCategory = cursor.isNull(i13) ? null : cursor.getString(i13);
                int i14 = i + 10;
                i3 = cursor.isNull(i14) ? -1 : cursor.getInt(i14);
                try {
                    chatGroupMember.joinTime = cursor.getDouble(i + 11);
                    chatGroupMember.createdTime = cursor.getDouble(i + 12);
                    chatGroupMember.updatedTime = cursor.getDouble(i + 13);
                    chatGroupMember.silence.enable = cursor.getInt(i + 14) == 1;
                    chatGroupMember.silence.duration = cursor.getLong(i + 15);
                    chatGroupMember.silence.until = cursor.getDouble(i + 16);
                    chatGroupMember.operationSilence.enable = cursor.getInt(i + 17) == 1;
                    chatGroupMember.operationSilence.duration = cursor.getLong(i + 18);
                    chatGroupMember.operationSilence.until = cursor.getDouble(i + 19);
                    int i15 = i + 20;
                    if (!cursor.isNull(i15)) {
                        i4 = cursor.getInt(i15);
                    }
                    int i16 = i + 21;
                    string = cursor.isNull(i16) ? null : cursor.getString(i16);
                    int i17 = i + 22;
                    try {
                        string2 = cursor.isNull(i17) ? null : cursor.getString(i17);
                        int i18 = i + 23;
                        chatGroupMember.inModeration.nickName = cursor.isNull(i18) ? null : cursor.getString(i18);
                        int i19 = i + 24;
                        chatGroupMember.inModeration.name = cursor.isNull(i19) ? null : cursor.getString(i19);
                        int i20 = i + 25;
                        InModeration inModeration = chatGroupMember.inModeration;
                        if (!cursor.isNull(i20)) {
                            string3 = cursor.getString(i20);
                        }
                        inModeration.description = string3;
                        ((mrf0) this).readIndex = i + 26;
                    } catch (Exception e) {
                        e = e;
                        str = string2;
                        string2 = string;
                        i2 = i4;
                        i4 = i3;
                        MessageNano.reportError(e, cursor);
                        i3 = i4;
                        i4 = i2;
                        string = string2;
                        string2 = str;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "unknown_";
                }
            } catch (Exception e3) {
                e = e3;
                str = "unknown_";
                i2 = -1;
            }
            TEnumJsonAdapter<ChatGroupMemberStatus> tEnumJsonAdapter = ChatGroupMemberStatus.JSON_ADAPTER;
            chatGroupMember.status = (ChatGroupMemberStatus) tEnumJsonAdapter.newTEnum(string, i3);
            TEnumJsonAdapter tEnumJsonAdapter2 = Gender.JSON_ADAPTER;
            chatGroupMember.gender = tEnumJsonAdapter2.newTEnum(string2, i4);
            if (chatGroupMember.groupId == null) {
                chatGroupMember.groupId = "";
            }
            if (chatGroupMember.userId == null) {
                chatGroupMember.userId = "";
            }
            if (chatGroupMember.nickName == null) {
                chatGroupMember.nickName = "";
            }
            if (chatGroupMember.userName == null) {
                chatGroupMember.userName = "";
            }
            if (chatGroupMember.nickNamePinyin == null) {
                chatGroupMember.nickNamePinyin = "";
            }
            if (chatGroupMember.avatar == null) {
                chatGroupMember.avatar = "";
            }
            if (chatGroupMember.searchIndices == null) {
                chatGroupMember.searchIndices = new ArrayList();
            }
            if (chatGroupMember.searchCategory == null) {
                chatGroupMember.searchCategory = "";
            }
            if (chatGroupMember.status == null) {
                chatGroupMember.status = (ChatGroupMemberStatus) tEnumJsonAdapter.defaultEnum();
            }
            if (chatGroupMember.silence == null) {
                chatGroupMember.silence = ChatGroupSilence.new_();
            }
            if (chatGroupMember.operationSilence == null) {
                chatGroupMember.operationSilence = ChatGroupSilence.new_();
            }
            if (chatGroupMember.gender == null) {
                chatGroupMember.gender = tEnumJsonAdapter2.defaultEnum();
            }
            if (chatGroupMember.inModeration == null) {
                chatGroupMember.inModeration = InModeration.new_();
            }
            return chatGroupMember;
        }

        public void write(ChatGroupMember chatGroupMember, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) chatGroupMember).id);
                DbObject.cvPut(contentValues, "groupId_c", chatGroupMember.groupId);
                DbObject.cvPut(contentValues, "userId_c", chatGroupMember.userId);
                DbObject.cvPut(contentValues, "nickName_c", chatGroupMember.nickName);
                DbObject.cvPut(contentValues, "userName_c", chatGroupMember.userName);
                DbObject.cvPut(contentValues, "nickNamePinyin_c", chatGroupMember.nickNamePinyin);
                DbObject.cvPut(contentValues, "avatar_c", chatGroupMember.avatar);
                DbObject.cvPut(contentValues, "searchIndices_c", chatGroupMember.searchIndices == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(chatGroupMember.searchIndices));
                DbObject.cvPut(contentValues, "searchCategory_c", chatGroupMember.searchCategory);
                ChatGroupMemberStatus chatGroupMemberStatus = chatGroupMember.status;
                DbObject.cvPut(contentValues, "str_status_c", chatGroupMemberStatus == null ? null : chatGroupMemberStatus.toString());
                ChatGroupMemberStatus chatGroupMemberStatus2 = chatGroupMember.status;
                DbObject.cvPut(contentValues, "status_c", chatGroupMemberStatus2 == null ? null : Integer.valueOf(chatGroupMemberStatus2.ordinal()));
                DbObject.cvPut(contentValues, "joinTime_c", Double.valueOf(chatGroupMember.joinTime));
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(chatGroupMember.createdTime));
                DbObject.cvPut(contentValues, "updatedTime_c", Double.valueOf(chatGroupMember.updatedTime));
                DbObject.cvPut(contentValues, "silence_enable_c", Integer.valueOf(chatGroupMember.silence.enable ? 1 : 0));
                DbObject.cvPut(contentValues, "silence_duration_c", Long.valueOf(chatGroupMember.silence.duration));
                DbObject.cvPut(contentValues, "silence_until_c", Double.valueOf(chatGroupMember.silence.until));
                DbObject.cvPut(contentValues, "operationSilence_enable_c", Integer.valueOf(chatGroupMember.operationSilence.enable ? 1 : 0));
                DbObject.cvPut(contentValues, "operationSilence_duration_c", Long.valueOf(chatGroupMember.operationSilence.duration));
                DbObject.cvPut(contentValues, "operationSilence_until_c", Double.valueOf(chatGroupMember.operationSilence.until));
                Gender gender = chatGroupMember.gender;
                DbObject.cvPut(contentValues, "str_gender_c", gender == null ? null : gender.toString());
                Gender gender2 = chatGroupMember.gender;
                DbObject.cvPut(contentValues, "gender_c", gender2 == null ? null : Integer.valueOf(gender2.ordinal()));
                DbObject.cvPut(contentValues, "inModeration_nickName_c", chatGroupMember.inModeration.nickName);
                DbObject.cvPut(contentValues, "inModeration_name_c", chatGroupMember.inModeration.name);
                DbObject.cvPut(contentValues, "inModeration_description_c", chatGroupMember.inModeration.description);
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61a(String str) {
        return str;
    }

    public static ChatGroupMember new_() {
        ChatGroupMember chatGroupMember = new ChatGroupMember();
        chatGroupMember.nullCheck();
        return chatGroupMember;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroupMember m12024clone() {
        ChatGroupMember chatGroupMember = new ChatGroupMember();
        ((DbObject) chatGroupMember)._id = ((DbObject) this)._id;
        ((DbObject) chatGroupMember).id = ((DbObject) this).id;
        chatGroupMember.groupId = this.groupId;
        chatGroupMember.userId = this.userId;
        chatGroupMember.nickName = this.nickName;
        chatGroupMember.userName = this.userName;
        chatGroupMember.nickNamePinyin = this.nickNamePinyin;
        chatGroupMember.avatar = this.avatar;
        List<String> list = this.searchIndices;
        if (list != null) {
            chatGroupMember.searchIndices = ValueObject.util_map(list, new w9j() { // from class: l.wt4
                public final Object call(Object obj) {
                    return ChatGroupMember.m61a((String) obj);
                }
            });
        }
        chatGroupMember.searchCategory = this.searchCategory;
        chatGroupMember.status = this.status;
        chatGroupMember.joinTime = this.joinTime;
        chatGroupMember.createdTime = this.createdTime;
        chatGroupMember.updatedTime = this.updatedTime;
        ChatGroupSilence chatGroupSilence = this.silence;
        if (chatGroupSilence != null) {
            chatGroupMember.silence = chatGroupSilence.m12032clone();
        }
        ChatGroupSilence chatGroupSilence2 = this.operationSilence;
        if (chatGroupSilence2 != null) {
            chatGroupMember.operationSilence = chatGroupSilence2.m12032clone();
        }
        chatGroupMember.gender = this.gender;
        InModeration inModeration = this.inModeration;
        if (inModeration != null) {
            chatGroupMember.inModeration = inModeration.m13444clone();
        }
        return chatGroupMember;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroupMember)) {
            return false;
        }
        ChatGroupMember chatGroupMember = (ChatGroupMember) obj;
        return super.equals(obj) && ValueObject.util_equals(this.groupId, chatGroupMember.groupId) && ValueObject.util_equals(this.userId, chatGroupMember.userId) && ValueObject.util_equals(this.nickName, chatGroupMember.nickName) && ValueObject.util_equals(this.userName, chatGroupMember.userName) && ValueObject.util_equals(this.nickNamePinyin, chatGroupMember.nickNamePinyin) && ValueObject.util_equals(this.avatar, chatGroupMember.avatar) && ValueObject.util_equals(this.searchIndices, chatGroupMember.searchIndices) && ValueObject.util_equals(this.searchCategory, chatGroupMember.searchCategory) && ValueObject.util_equals(this.status, chatGroupMember.status) && this.joinTime == chatGroupMember.joinTime && this.createdTime == chatGroupMember.createdTime && this.updatedTime == chatGroupMember.updatedTime && ValueObject.util_equals(this.silence, chatGroupMember.silence) && ValueObject.util_equals(this.operationSilence, chatGroupMember.operationSilence) && ValueObject.util_equals(this.gender, chatGroupMember.gender) && ValueObject.util_equals(this.inModeration, chatGroupMember.inModeration);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String groupMemberName() {
        return !TextUtils.isEmpty(this.nickName) ? this.nickName : this.userName;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.groupId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.nickNamePinyin;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.avatar;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list = this.searchIndices;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        String str7 = this.searchCategory;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41;
        ChatGroupMemberStatus chatGroupMemberStatus = this.status;
        int iHashCode10 = chatGroupMemberStatus != null ? chatGroupMemberStatus.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.joinTime);
        int i2 = ((iHashCode9 + iHashCode10) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.createdTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.updatedTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        ChatGroupSilence chatGroupSilence = this.silence;
        int iHashCode11 = (i4 + (chatGroupSilence != null ? chatGroupSilence.hashCode() : 0)) * 41;
        ChatGroupSilence chatGroupSilence2 = this.operationSilence;
        int iHashCode12 = (iHashCode11 + (chatGroupSilence2 != null ? chatGroupSilence2.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode13 = (iHashCode12 + (gender != null ? gender.hashCode() : 0)) * 41;
        InModeration inModeration = this.inModeration;
        int iHashCode14 = iHashCode13 + (inModeration != null ? inModeration.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode14;
        return iHashCode14;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isMe() {
        return TextUtils.equals(this.userId, qib0.c0.userId());
    }

    public void mergeData(ChatGroupMember chatGroupMember) {
        if (!shouldMergeData() || equals(chatGroupMember)) {
            return;
        }
        if (!isFieldParsed("groupId")) {
            this.groupId = chatGroupMember.groupId;
        }
        if (!isFieldParsed("userId")) {
            this.userId = chatGroupMember.userId;
        }
        if (!isFieldParsed("nickName")) {
            this.nickName = chatGroupMember.nickName;
        }
        if (!isFieldParsed("userName")) {
            this.userName = chatGroupMember.userName;
        }
        if (!isFieldParsed("nickNamePinyin")) {
            this.nickNamePinyin = chatGroupMember.nickNamePinyin;
        }
        if (!isFieldParsed(ReminderAction.avatar)) {
            this.avatar = chatGroupMember.avatar;
        }
        if (!isFieldParsed("searchIndices")) {
            this.searchIndices = chatGroupMember.searchIndices;
        }
        if (!isFieldParsed("searchCategory")) {
            this.searchCategory = chatGroupMember.searchCategory;
        }
        if (!isFieldParsed("status")) {
            this.status = chatGroupMember.status;
        }
        if (!isFieldParsed("joinTime")) {
            this.joinTime = chatGroupMember.joinTime;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = chatGroupMember.createdTime;
        }
        if (!isFieldParsed("updatedTime")) {
            this.updatedTime = chatGroupMember.updatedTime;
        }
        if (!isFieldParsed("silence")) {
            this.silence = chatGroupMember.silence;
        }
        if (!isFieldParsed("operationSilence")) {
            this.operationSilence = chatGroupMember.operationSilence;
        }
        if (!isFieldParsed("gender")) {
            this.gender = chatGroupMember.gender;
        }
        if (!isFieldParsed("inModeration")) {
            this.inModeration = chatGroupMember.inModeration;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.groupId == null) {
            this.groupId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.nickNamePinyin == null) {
            this.nickNamePinyin = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.searchIndices == null) {
            this.searchIndices = new ArrayList();
        }
        if (this.searchCategory == null) {
            this.searchCategory = "";
        }
        if (this.status == null) {
            this.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.silence == null) {
            this.silence = ChatGroupSilence.new_();
        }
        if (this.operationSilence == null) {
            this.operationSilence = ChatGroupSilence.new_();
        }
        if (this.gender == null) {
            this.gender = Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.inModeration == null) {
            this.inModeration = InModeration.new_();
        }
    }

    public void onApiParseComplete() {
        super/*com.tantanapp.common.data.ValueObject*/.onApiParseComplete();
        ((DbObject) this).id = this.groupId + this.userId;
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
