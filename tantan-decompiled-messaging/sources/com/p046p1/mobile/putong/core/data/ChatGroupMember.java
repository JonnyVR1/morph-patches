package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.qib0;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 55)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGroupMember chatGroupMember) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, chatGroupMember._id);
            String str = chatGroupMember.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = chatGroupMember.groupId;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = chatGroupMember.userId;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            String str4 = chatGroupMember.nickName;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(53, str4);
            }
            String str5 = chatGroupMember.userName;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(54, str5);
            }
            String str6 = chatGroupMember.nickNamePinyin;
            if (str6 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(55, str6);
            }
            String str7 = chatGroupMember.avatar;
            if (str7 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(56, str7);
            }
            List<String> list = chatGroupMember.searchIndices;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(57, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = chatGroupMember.searchCategory;
            if (str8 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(58, str8);
            }
            ChatGroupMemberStatus chatGroupMemberStatus = chatGroupMember.status;
            if (chatGroupMemberStatus != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(59, chatGroupMemberStatus.ordinal());
            }
            int iM17222d = iM17228j + CodedOutputByteBufferNano.m17222d(60, chatGroupMember.joinTime) + CodedOutputByteBufferNano.m17222d(61, chatGroupMember.createdTime) + CodedOutputByteBufferNano.m17222d(62, chatGroupMember.updatedTime);
            ChatGroupSilence chatGroupSilence = chatGroupMember.silence;
            if (chatGroupSilence != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(63, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence2 = chatGroupMember.operationSilence;
            if (chatGroupSilence2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(64, chatGroupSilence2, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            Gender gender = chatGroupMember.gender;
            if (gender != null) {
                iM17222d += CodedOutputByteBufferNano.m17226h(65, gender.ordinal());
            }
            ChatGroupMemberStatus chatGroupMemberStatus2 = chatGroupMember.status;
            if (chatGroupMemberStatus2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(66, chatGroupMemberStatus2, ChatGroupMemberStatus.PROTOBUF_ADAPTER);
            }
            Gender gender2 = chatGroupMember.gender;
            if (gender2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(67, gender2, Gender.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroupMember.inModeration;
            if (inModeration != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(68, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            chatGroupMember.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroupMember parse(nb5 nb5Var) throws IOException {
            ChatGroupMember chatGroupMember = new ChatGroupMember();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (chatGroupMember.status == null && numValueOf != null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatGroupMember.gender == null && numValueOf2 != null) {
                            chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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
                            chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroupMember.inModeration == null) {
                            chatGroupMember.inModeration = InModeration.new_();
                        }
                        break;
                    case 8:
                        chatGroupMember._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        chatGroupMember.f56011id = nb5Var.m158750s();
                        continue;
                    case 410:
                        chatGroupMember.groupId = nb5Var.m158750s();
                        continue;
                    case 418:
                        chatGroupMember.userId = nb5Var.m158750s();
                        continue;
                    case 426:
                        chatGroupMember.nickName = nb5Var.m158750s();
                        continue;
                    case 434:
                        chatGroupMember.userName = nb5Var.m158750s();
                        continue;
                    case 442:
                        chatGroupMember.nickNamePinyin = nb5Var.m158750s();
                        continue;
                    case 450:
                        chatGroupMember.avatar = nb5Var.m158750s();
                        continue;
                    case 458:
                        chatGroupMember.searchIndices = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        chatGroupMember.searchCategory = nb5Var.m158750s();
                        continue;
                    case 472:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 481:
                        chatGroupMember.joinTime = nb5Var.m158739h();
                        continue;
                    case 489:
                        chatGroupMember.createdTime = nb5Var.m158739h();
                        continue;
                    case 497:
                        chatGroupMember.updatedTime = nb5Var.m158739h();
                        continue;
                    case 506:
                        chatGroupMember.silence = (ChatGroupSilence) nb5Var.m158743l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 514:
                        chatGroupMember.operationSilence = (ChatGroupSilence) nb5Var.m158743l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 520:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 530:
                        chatGroupMember.status = (ChatGroupMemberStatus) nb5Var.m158743l(ChatGroupMemberStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 538:
                        chatGroupMember.gender = (Gender) nb5Var.m158743l(Gender.PROTOBUF_ADAPTER);
                        continue;
                    case 546:
                        chatGroupMember.inModeration = (InModeration) nb5Var.m158743l(InModeration.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (chatGroupMember.status == null && numValueOf != null) {
                            chatGroupMember.status = (ChatGroupMemberStatus) ChatGroupMemberStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatGroupMember.gender == null && numValueOf2 != null) {
                            chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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
                            chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroupMember chatGroupMember, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, chatGroupMember._id);
            String str = chatGroupMember.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = chatGroupMember.groupId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = chatGroupMember.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            String str4 = chatGroupMember.nickName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(53, str4);
            }
            String str5 = chatGroupMember.userName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(54, str5);
            }
            String str6 = chatGroupMember.nickNamePinyin;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(55, str6);
            }
            String str7 = chatGroupMember.avatar;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(56, str7);
            }
            List<String> list = chatGroupMember.searchIndices;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(57, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = chatGroupMember.searchCategory;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(58, str8);
            }
            ChatGroupMemberStatus chatGroupMemberStatus = chatGroupMember.status;
            if (chatGroupMemberStatus != null) {
                codedOutputByteBufferNano.m17250G(59, chatGroupMemberStatus.ordinal());
            }
            codedOutputByteBufferNano.m17246C(60, chatGroupMember.joinTime);
            codedOutputByteBufferNano.m17246C(61, chatGroupMember.createdTime);
            codedOutputByteBufferNano.m17246C(62, chatGroupMember.updatedTime);
            ChatGroupSilence chatGroupSilence = chatGroupMember.silence;
            if (chatGroupSilence != null) {
                codedOutputByteBufferNano.m17254K(63, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence2 = chatGroupMember.operationSilence;
            if (chatGroupSilence2 != null) {
                codedOutputByteBufferNano.m17254K(64, chatGroupSilence2, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            Gender gender = chatGroupMember.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17250G(65, gender.ordinal());
            }
            ChatGroupMemberStatus chatGroupMemberStatus2 = chatGroupMember.status;
            if (chatGroupMemberStatus2 != null) {
                codedOutputByteBufferNano.m17254K(66, chatGroupMemberStatus2, ChatGroupMemberStatus.PROTOBUF_ADAPTER);
            }
            Gender gender2 = chatGroupMember.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17254K(67, gender2, Gender.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroupMember.inModeration;
            if (inModeration != null) {
                codedOutputByteBufferNano.m17254K(68, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatGroupMember> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupMember>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroupMember.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGroupMember newInstance() {
            return new ChatGroupMember();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(ChatGroupMember chatGroupMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2088018234:
                    if (str.equals("searchCategory")) {
                        b = 0;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 1;
                    }
                    break;
                case -1401749737:
                    if (str.equals("joinTime")) {
                        b = 2;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 3;
                    }
                    break;
                case -1035087649:
                    if (str.equals("searchIndices")) {
                        b = 4;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 5;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 6;
                    }
                    break;
                case -779606726:
                    if (str.equals("operationSilence")) {
                        b = 7;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 69737614:
                    if (str.equals("nickName")) {
                        b = 12;
                    }
                    break;
                case 293428218:
                    if (str.equals("groupId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 549807147:
                    if (str.equals("inModeration")) {
                        b = 14;
                    }
                    break;
                case 1524048855:
                    if (str.equals("nickNamePinyin")) {
                        b = 15;
                    }
                    break;
                case 2092627105:
                    if (str.equals("silence")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    chatGroupMember.searchCategory = jsonParser.getValueAsString();
                    return true;
                case 1:
                    chatGroupMember.avatar = jsonParser.getValueAsString();
                    return true;
                case 2:
                    chatGroupMember.joinTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    chatGroupMember.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 4:
                    chatGroupMember.searchIndices = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    chatGroupMember.status = ChatGroupMemberStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 6:
                    chatGroupMember.userId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    chatGroupMember.operationSilence = ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    chatGroupMember.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 9:
                    chatGroupMember.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 10:
                    chatGroupMember.userName = jsonParser.getValueAsString();
                    return true;
                case 11:
                    chatGroupMember.f56011id = jsonParser.getValueAsString();
                    return false;
                case 12:
                    chatGroupMember.nickName = jsonParser.getValueAsString();
                    return true;
                case 13:
                    chatGroupMember.groupId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    chatGroupMember.inModeration = InModeration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    chatGroupMember.nickNamePinyin = jsonParser.getValueAsString();
                    return true;
                case 16:
                    chatGroupMember.silence = ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(ChatGroupMember chatGroupMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2088018234:
                    if (str.equals("searchCategory")) {
                        b = 0;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 1;
                    }
                    break;
                case -1401749737:
                    if (str.equals("joinTime")) {
                        b = 2;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 3;
                    }
                    break;
                case -1035087649:
                    if (str.equals("searchIndices")) {
                        b = 4;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 5;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 6;
                    }
                    break;
                case -779606726:
                    if (str.equals("operationSilence")) {
                        b = 7;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 69737614:
                    if (str.equals("nickName")) {
                        b = 12;
                    }
                    break;
                case 293428218:
                    if (str.equals("groupId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 549807147:
                    if (str.equals("inModeration")) {
                        b = 14;
                    }
                    break;
                case 1524048855:
                    if (str.equals("nickNamePinyin")) {
                        b = 15;
                    }
                    break;
                case 2092627105:
                    if (str.equals("silence")) {
                        b = Tnaf.POW_2_WIDTH;
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
                    return true;
                case 11:
                    return false;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupMember, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroupMember chatGroupMember, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroupMember.f56011id;
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
                jsonGenerator.writeStringField("avatar", str7);
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                ChatGroupMemberStatus.JSON_ADAPTER.serialize(chatGroupMember.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("joinTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatGroupMember.joinTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("createdTime");
            jsonAdapter.serialize(Double.valueOf(chatGroupMember.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatGroupMember> _ID = new LongColumn<ChatGroupMember>("_id") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(chatGroupMember._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Long l2) {
            chatGroupMember._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatGroupMember> f20364ID = new StringColumn<ChatGroupMember>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.f56011id = str;
        }
    };
    public static final StringColumn<ChatGroupMember> GROUPID = new StringColumn<ChatGroupMember>("groupId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.groupId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.groupId = str;
        }
    };
    public static final StringColumn<ChatGroupMember> USERID = new StringColumn<ChatGroupMember>("userId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.userId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.userId = str;
        }
    };
    public static final StringColumn<ChatGroupMember> NICKNAME = new StringColumn<ChatGroupMember>("nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.7
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.nickName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.nickName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> USERNAME = new StringColumn<ChatGroupMember>("userName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.userName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.userName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> NICKNAMEPINYIN = new StringColumn<ChatGroupMember>("nickNamePinyin_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.9
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.nickNamePinyin;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.nickNamePinyin = str;
        }
    };
    public static final StringColumn<ChatGroupMember> AVATAR = new StringColumn<ChatGroupMember>("avatar_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.avatar;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.avatar = str;
        }
    };
    public static final Column<ChatGroupMember, List<String>> SEARCHINDICES = new Column<ChatGroupMember, List<String>>("searchIndices_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.11
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.searchIndices;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, List<String> list) {
            chatGroupMember.searchIndices = list;
        }
    };
    public static final StringColumn<ChatGroupMember> SEARCHCATEGORY = new StringColumn<ChatGroupMember>("searchCategory_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.12
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.searchCategory;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.searchCategory = str;
        }
    };
    public static final TEnumColumn<ChatGroupMember, ChatGroupMemberStatus> STATUS = new TEnumColumn<ChatGroupMember, ChatGroupMemberStatus>("str_status_c", "status_c", ChatGroupMemberStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.13
        @Override // com.tantanapp.common.data.orm.Column
        public ChatGroupMemberStatus get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.status;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroupMember chatGroupMember, ChatGroupMemberStatus chatGroupMemberStatus) {
            chatGroupMember.status = chatGroupMemberStatus;
        }
    };
    public static final DoubleColumn<ChatGroupMember> JOINTIME = new DoubleColumn<ChatGroupMember>("joinTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.14
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.joinTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.joinTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> CREATEDTIME = new DoubleColumn<ChatGroupMember>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.15
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> UPDATEDTIME = new DoubleColumn<ChatGroupMember>("updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.16
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.updatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroupMember> SILENCE_ENABLE = new BooleanColumn<ChatGroupMember>("silence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.17
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroupMember chatGroupMember) {
            return Boolean.valueOf(chatGroupMember.silence.enable);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Boolean bool) {
            chatGroupMember.silence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroupMember> SILENCE_DURATION = new LongColumn<ChatGroupMember>("silence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.18
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(chatGroupMember.silence.duration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Long l2) {
            chatGroupMember.silence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> SILENCE_UNTIL = new DoubleColumn<ChatGroupMember>("silence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.19
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.silence.until);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.silence.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroupMember> OPERATIONSILENCE_ENABLE = new BooleanColumn<ChatGroupMember>("operationSilence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.20
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroupMember chatGroupMember) {
            return Boolean.valueOf(chatGroupMember.operationSilence.enable);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Boolean bool) {
            chatGroupMember.operationSilence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroupMember> OPERATIONSILENCE_DURATION = new LongColumn<ChatGroupMember>("operationSilence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.21
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroupMember chatGroupMember) {
            return Long.valueOf(chatGroupMember.operationSilence.duration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Long l2) {
            chatGroupMember.operationSilence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroupMember> OPERATIONSILENCE_UNTIL = new DoubleColumn<ChatGroupMember>("operationSilence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.22
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroupMember chatGroupMember) {
            return Double.valueOf(chatGroupMember.operationSilence.until);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, Double d) {
            chatGroupMember.operationSilence.until = d.doubleValue();
        }
    };
    public static final TEnumColumn<ChatGroupMember, Gender> GENDER = new TEnumColumn<ChatGroupMember, Gender>("str_gender_c", "gender_c", Gender.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.23
        @Override // com.tantanapp.common.data.orm.Column
        public Gender get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.gender;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroupMember chatGroupMember, Gender gender) {
            chatGroupMember.gender = gender;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_NICKNAME = new StringColumn<ChatGroupMember>("inModeration_nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.24
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.nickName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.nickName = str;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_NAME = new StringColumn<ChatGroupMember>("inModeration_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.25
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.name = str;
        }
    };
    public static final StringColumn<ChatGroupMember> INMODERATION_DESCRIPTION = new StringColumn<ChatGroupMember>("inModeration_description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.26
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroupMember chatGroupMember) {
            return chatGroupMember.inModeration.description;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroupMember chatGroupMember, String str) {
            chatGroupMember.inModeration.description = str;
        }
    };
    public static mrf0<ChatGroupMember> DB_ADAPTER = new mrf0<ChatGroupMember>() { // from class: com.p1.mobile.putong.core.data.ChatGroupMember.27
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,groupId_c TEXT,userId_c TEXT,nickName_c TEXT,userName_c TEXT,nickNamePinyin_c TEXT,avatar_c TEXT,searchIndices_c BLOB,searchCategory_c TEXT,status_c INTEGER,joinTime_c REAL,createdTime_c REAL,updatedTime_c REAL,silence_enable_c INTEGER,silence_duration_c INTEGER,silence_until_c REAL,operationSilence_enable_c INTEGER,operationSilence_duration_c INTEGER,operationSilence_until_c REAL,gender_c INTEGER,str_status_c TEXT,str_gender_c TEXT,inModeration_nickName_c TEXT,inModeration_name_c TEXT,inModeration_description_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return ChatGroupMember.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public ChatGroupMember init() {
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
                chatGroupMember.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroupMember.inModeration == null) {
                chatGroupMember.inModeration = InModeration.new_();
            }
            return chatGroupMember;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public ChatGroupMember read(Cursor cursor, int i) {
            String str;
            int i2;
            int i3;
            String string;
            String string2 = "unknown_";
            if (i == 0) {
                this.readIndex = 0;
            }
            ChatGroupMember chatGroupMember = new ChatGroupMember();
            int i4 = -1;
            try {
                chatGroupMember.silence = new ChatGroupSilence();
                chatGroupMember.operationSilence = new ChatGroupSilence();
                chatGroupMember.inModeration = new InModeration();
                chatGroupMember._id = cursor.getLong(i);
                int i5 = i + 1;
                String string3 = null;
                chatGroupMember.f56011id = cursor.isNull(i5) ? null : cursor.getString(i5);
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
                chatGroupMember.searchIndices = cursor.isNull(i12) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i12));
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
                        this.readIndex = i + 26;
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
            TEnumJsonAdapter<Gender> tEnumJsonAdapter2 = Gender.JSON_ADAPTER;
            chatGroupMember.gender = (Gender) tEnumJsonAdapter2.newTEnum(string2, i4);
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
                chatGroupMember.gender = (Gender) tEnumJsonAdapter2.defaultEnum();
            }
            if (chatGroupMember.inModeration == null) {
                chatGroupMember.inModeration = InModeration.new_();
            }
            return chatGroupMember;
        }

        @Override // p149l.mrf0
        public void write(ChatGroupMember chatGroupMember, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", chatGroupMember.f56011id);
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
                MessageNano.reportError(e, null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35259a(String str) {
        return str;
    }

    public static ChatGroupMember new_() {
        ChatGroupMember chatGroupMember = new ChatGroupMember();
        chatGroupMember.nullCheck();
        return chatGroupMember;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGroupMember mo223809clone() {
        ChatGroupMember chatGroupMember = new ChatGroupMember();
        chatGroupMember._id = this._id;
        chatGroupMember.f56011id = this.f56011id;
        chatGroupMember.groupId = this.groupId;
        chatGroupMember.userId = this.userId;
        chatGroupMember.nickName = this.nickName;
        chatGroupMember.userName = this.userName;
        chatGroupMember.nickNamePinyin = this.nickNamePinyin;
        chatGroupMember.avatar = this.avatar;
        List<String> list = this.searchIndices;
        if (list != null) {
            chatGroupMember.searchIndices = ValueObject.util_map(list, new w9j() { // from class: l.wt4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatGroupMember.m35259a((String) obj);
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
            chatGroupMember.silence = chatGroupSilence.mo223809clone();
        }
        ChatGroupSilence chatGroupSilence2 = this.operationSilence;
        if (chatGroupSilence2 != null) {
            chatGroupMember.operationSilence = chatGroupSilence2.mo223809clone();
        }
        chatGroupMember.gender = this.gender;
        InModeration inModeration = this.inModeration;
        if (inModeration != null) {
            chatGroupMember.inModeration = inModeration.mo223809clone();
        }
        return chatGroupMember;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String groupMemberName() {
        return !TextUtils.isEmpty(this.nickName) ? this.nickName : this.userName;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isMe() {
        return TextUtils.equals(this.userId, qib0.f154714c0.userId());
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (!isFieldParsed("avatar")) {
            this.avatar = chatGroupMember.avatar;
        }
        if (!isFieldParsed("searchIndices")) {
            this.searchIndices = chatGroupMember.searchIndices;
        }
        if (!isFieldParsed("searchCategory")) {
            this.searchCategory = chatGroupMember.searchCategory;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = chatGroupMember.status;
        }
        if (!isFieldParsed("joinTime")) {
            this.joinTime = chatGroupMember.joinTime;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = chatGroupMember.createdTime;
        }
        if (!isFieldParsed(LocationInvisibleField.updatedTime)) {
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

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
        if (this.inModeration == null) {
            this.inModeration = InModeration.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        super.onApiParseComplete();
        this.f56011id = this.groupId + this.userId;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
