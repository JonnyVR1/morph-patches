package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.Group;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class Group extends DbObject<Group> implements Cloneable, Serializable {
    public static final String TYPE = "group";

    @NonNull
    @ProtobufIndex(index = 58)
    public List<String> backgroundColors;

    @ProtobufIndex(index = 64)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 52)
    public String description;

    @NonNull
    @ProtobufIndex(index = 63)
    public GroupType groupType;

    @NonNull
    @ProtobufIndex(index = 57)
    public String headIcon;

    @NonNull
    @ProtobufIndex(index = 67)
    public List<TopicMomentIdBox> hotTopics;

    @NonNull
    @ProtobufIndex(index = 56)
    public String icon;

    @ProtobufIndex(index = 61)
    public boolean joined;

    @NonNull
    @ProtobufIndex(index = 54)
    public String memberRole;

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;

    @NonNull
    @ProtobufIndex(index = 68)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 53)
    public String preViewContent;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 55)
    public String state;

    @NonNull
    @ProtobufIndex(index = 62)
    public String status;

    @NonNull
    @ProtobufIndex(index = 66)
    public List<TopicMomentIdBox> topics;

    @ProtobufIndex(index = 60)
    public int unReadMomentCounter;

    @ProtobufIndex(index = 59)
    public int userCounter;

    @NonNull
    @ProtobufIndex(index = 65)
    public List<String> userIds;
    public static ProtobufAdapter<Group> PROTOBUF_ADAPTER = new MessageNanoAdapter<Group>() { // from class: com.p1.mobile.putong.feed.data.Group.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Group group) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, group._id);
            String str = group.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = group.name;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            String str3 = group.description;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(52, str3);
            }
            String str4 = group.preViewContent;
            if (str4 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(53, str4);
            }
            String str5 = group.memberRole;
            if (str5 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(54, str5);
            }
            String str6 = group.state;
            if (str6 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(55, str6);
            }
            String str7 = group.icon;
            if (str7 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(56, str7);
            }
            String str8 = group.headIcon;
            if (str8 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(57, str8);
            }
            List<String> list = group.backgroundColors;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(58, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(59, group.userCounter) + CodedOutputByteBufferNano.m17281h(60, group.unReadMomentCounter) + CodedOutputByteBufferNano.m17275b(61, group.joined);
            String str9 = group.status;
            if (str9 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(62, str9);
            }
            GroupType groupType = group.groupType;
            if (groupType != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(63, groupType, GroupType.PROTOBUF_ADAPTER);
            }
            int iM17277d = iM17281h + CodedOutputByteBufferNano.m17277d(64, group.createdTime);
            List<String> list2 = group.userIds;
            if (list2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(65, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list3 = group.topics;
            if (list3 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(66, list3, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list4 = group.hotTopics;
            if (list4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(67, list4, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = group.owner;
            if (str10 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(68, str10);
            }
            group.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Group parse(nc5 nc5Var) throws IOException {
            Group group = new Group();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (group.name == null) {
                            group.name = "";
                        }
                        if (group.description == null) {
                            group.description = "";
                        }
                        if (group.preViewContent == null) {
                            group.preViewContent = "";
                        }
                        if (group.memberRole == null) {
                            group.memberRole = "";
                        }
                        if (group.state == null) {
                            group.state = "";
                        }
                        if (group.icon == null) {
                            group.icon = "";
                        }
                        if (group.headIcon == null) {
                            group.headIcon = "";
                        }
                        if (group.backgroundColors == null) {
                            group.backgroundColors = new ArrayList();
                        }
                        if (group.status == null) {
                            group.status = "";
                        }
                        if (group.groupType == null) {
                            group.groupType = (GroupType) GroupType.JSON_ADAPTER.defaultEnum();
                        }
                        if (group.userIds == null) {
                            group.userIds = new ArrayList();
                        }
                        if (group.topics == null) {
                            group.topics = new ArrayList();
                        }
                        if (group.hotTopics == null) {
                            group.hotTopics = new ArrayList();
                        }
                        if (group.owner == null) {
                            group.owner = "";
                        }
                        break;
                    case 8:
                        group._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        group.f56859id = nc5Var.m162495s();
                        continue;
                    case 410:
                        group.name = nc5Var.m162495s();
                        continue;
                    case 418:
                        group.description = nc5Var.m162495s();
                        continue;
                    case 426:
                        group.preViewContent = nc5Var.m162495s();
                        continue;
                    case 434:
                        group.memberRole = nc5Var.m162495s();
                        continue;
                    case 442:
                        group.state = nc5Var.m162495s();
                        continue;
                    case 450:
                        group.icon = nc5Var.m162495s();
                        continue;
                    case 458:
                        group.headIcon = nc5Var.m162495s();
                        continue;
                    case 466:
                        group.backgroundColors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 472:
                        group.userCounter = nc5Var.m162486j();
                        continue;
                    case 480:
                        group.unReadMomentCounter = nc5Var.m162486j();
                        continue;
                    case 488:
                        group.joined = nc5Var.m162483g();
                        continue;
                    case 498:
                        group.status = nc5Var.m162495s();
                        continue;
                    case 506:
                        group.groupType = (GroupType) nc5Var.m162488l(GroupType.PROTOBUF_ADAPTER);
                        continue;
                    case 513:
                        group.createdTime = nc5Var.m162484h();
                        continue;
                    case 522:
                        group.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 530:
                        group.topics = (List) nc5Var.m162488l(TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 538:
                        group.hotTopics = (List) nc5Var.m162488l(TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 546:
                        group.owner = nc5Var.m162495s();
                        continue;
                    default:
                        if (group.name == null) {
                            group.name = "";
                        }
                        if (group.description == null) {
                            group.description = "";
                        }
                        if (group.preViewContent == null) {
                            group.preViewContent = "";
                        }
                        if (group.memberRole == null) {
                            group.memberRole = "";
                        }
                        if (group.state == null) {
                            group.state = "";
                        }
                        if (group.icon == null) {
                            group.icon = "";
                        }
                        if (group.headIcon == null) {
                            group.headIcon = "";
                        }
                        if (group.backgroundColors == null) {
                            group.backgroundColors = new ArrayList();
                        }
                        if (group.status == null) {
                            group.status = "";
                        }
                        if (group.groupType == null) {
                            group.groupType = (GroupType) GroupType.JSON_ADAPTER.defaultEnum();
                        }
                        if (group.userIds == null) {
                            group.userIds = new ArrayList();
                        }
                        if (group.topics == null) {
                            group.topics = new ArrayList();
                        }
                        if (group.hotTopics == null) {
                            group.hotTopics = new ArrayList();
                        }
                        if (group.owner == null) {
                            group.owner = "";
                            return group;
                        }
                        break;
                }
            }
            return group;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Group group, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, group._id);
            String str = group.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = group.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            String str3 = group.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(52, str3);
            }
            String str4 = group.preViewContent;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(53, str4);
            }
            String str5 = group.memberRole;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(54, str5);
            }
            String str6 = group.state;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(55, str6);
            }
            String str7 = group.icon;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(56, str7);
            }
            String str8 = group.headIcon;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(57, str8);
            }
            List<String> list = group.backgroundColors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(58, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(59, group.userCounter);
            codedOutputByteBufferNano.m17305G(60, group.unReadMomentCounter);
            codedOutputByteBufferNano.m17299A(61, group.joined);
            String str9 = group.status;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(62, str9);
            }
            GroupType groupType = group.groupType;
            if (groupType != null) {
                codedOutputByteBufferNano.m17309K(63, groupType, GroupType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(64, group.createdTime);
            List<String> list2 = group.userIds;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(65, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list3 = group.topics;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(66, list3, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list4 = group.hotTopics;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(67, list4, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = group.owner;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(68, str10);
            }
        }
    };
    public static JsonAdapter<Group> JSON_ADAPTER = new ObjectJsonAdapter<Group>() { // from class: com.p1.mobile.putong.feed.data.Group.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Group.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Group newInstance() {
            return new Group();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Group group, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1724546052:
                    if (str.equals("description")) {
                        b = 0;
                    }
                    break;
                case -1482972583:
                    if (str.equals("groupType")) {
                        b = 1;
                    }
                    break;
                case -1408876687:
                    if (str.equals("preViewContent")) {
                        b = 2;
                    }
                    break;
                case -1341218256:
                    if (str.equals("memberRole")) {
                        b = 3;
                    }
                    break;
                case -1154529463:
                    if (str.equals("joined")) {
                        b = 4;
                    }
                    break;
                case -1116107143:
                    if (str.equals("headIcon")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 7;
                    }
                    break;
                case -825041843:
                    if (str.equals("unReadMomentCounter")) {
                        b = 8;
                    }
                    break;
                case -731239471:
                    if (str.equals("hotTopics")) {
                        b = 9;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 10;
                    }
                    break;
                case -147154195:
                    if (str.equals("userIds")) {
                        b = 11;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 12;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 14;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 15;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 655964081:
                    if (str.equals("userCounter")) {
                        b = 17;
                    }
                    break;
                case 1246159934:
                    if (str.equals("backgroundColors")) {
                        b = 18;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    group.description = jsonParser.getValueAsString();
                    return true;
                case 1:
                    group.groupType = GroupType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 2:
                    group.preViewContent = jsonParser.getValueAsString();
                    return true;
                case 3:
                    group.memberRole = jsonParser.getValueAsString();
                    return true;
                case 4:
                    group.joined = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    group.headIcon = jsonParser.getValueAsString();
                    return true;
                case 6:
                    group.status = jsonParser.getValueAsString();
                    return true;
                case 7:
                    group.topics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    group.unReadMomentCounter = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    group.hotTopics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    group.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 11:
                    group.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    group.f56859id = jsonParser.getValueAsString();
                    return false;
                case 13:
                    group.icon = jsonParser.getValueAsString();
                    return true;
                case 14:
                    group.name = jsonParser.getValueAsString();
                    return true;
                case 15:
                    group.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 16:
                    group.state = jsonParser.getValueAsString();
                    return true;
                case 17:
                    group.userCounter = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    group.backgroundColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Group group, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1724546052:
                    if (str.equals("description")) {
                        b = 0;
                    }
                    break;
                case -1482972583:
                    if (str.equals("groupType")) {
                        b = 1;
                    }
                    break;
                case -1408876687:
                    if (str.equals("preViewContent")) {
                        b = 2;
                    }
                    break;
                case -1341218256:
                    if (str.equals("memberRole")) {
                        b = 3;
                    }
                    break;
                case -1154529463:
                    if (str.equals("joined")) {
                        b = 4;
                    }
                    break;
                case -1116107143:
                    if (str.equals("headIcon")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 7;
                    }
                    break;
                case -825041843:
                    if (str.equals("unReadMomentCounter")) {
                        b = 8;
                    }
                    break;
                case -731239471:
                    if (str.equals("hotTopics")) {
                        b = 9;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 10;
                    }
                    break;
                case -147154195:
                    if (str.equals("userIds")) {
                        b = 11;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 12;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 14;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 15;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 655964081:
                    if (str.equals("userCounter")) {
                        b = 17;
                    }
                    break;
                case 1246159934:
                    if (str.equals("backgroundColors")) {
                        b = 18;
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
                    return true;
                case 12:
                    return false;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    return true;
                default:
                    return super.parseFieldCheck(group, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Group group, JsonGenerator jsonGenerator) throws IOException {
            String str = group.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = group.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = group.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = group.preViewContent;
            if (str4 != null) {
                jsonGenerator.writeStringField("preViewContent", str4);
            }
            String str5 = group.memberRole;
            if (str5 != null) {
                jsonGenerator.writeStringField("memberRole", str5);
            }
            String str6 = group.state;
            if (str6 != null) {
                jsonGenerator.writeStringField("state", str6);
            }
            String str7 = group.icon;
            if (str7 != null) {
                jsonGenerator.writeStringField("icon", str7);
            }
            String str8 = group.headIcon;
            if (str8 != null) {
                jsonGenerator.writeStringField("headIcon", str8);
            }
            if (group.backgroundColors != null) {
                jsonGenerator.writeFieldName("backgroundColors");
                JsonAdapter.serializeArray(group.backgroundColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("userCounter", group.userCounter);
            jsonGenerator.writeNumberField("unReadMomentCounter", group.unReadMomentCounter);
            jsonGenerator.writeBooleanField("joined", group.joined);
            String str9 = group.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            if (group.groupType != null) {
                jsonGenerator.writeFieldName("groupType");
                GroupType.JSON_ADAPTER.serialize(group.groupType, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(group.createdTime), jsonGenerator, true);
            if (group.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(group.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (group.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(group.topics, jsonGenerator, TopicMomentIdBox.JSON_ADAPTER);
            }
            if (group.hotTopics != null) {
                jsonGenerator.writeFieldName("hotTopics");
                JsonAdapter.serializeArray(group.hotTopics, jsonGenerator, TopicMomentIdBox.JSON_ADAPTER);
            }
            if (group.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(group.owner, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Group) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Group) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public List<TopicMoment> relatedTopics = new ArrayList();
    public List<TopicMoment> hotTopicsModels = new ArrayList();
    private HashSet<String> parseFieldSet = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62027a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m62029c(String str) {
        return str;
    }

    public static Group new_() {
        Group group = new Group();
        group.nullCheck();
        return group;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Group mo225055clone() {
        Group group = new Group();
        group._id = this._id;
        group.f56859id = this.f56859id;
        group.name = this.name;
        group.description = this.description;
        group.preViewContent = this.preViewContent;
        group.memberRole = this.memberRole;
        group.state = this.state;
        group.icon = this.icon;
        group.headIcon = this.headIcon;
        List<String> list = this.backgroundColors;
        if (list != null) {
            group.backgroundColors = ValueObject.util_map(list, new qcj() { // from class: l.sdk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Group.m62029c((String) obj);
                }
            });
        }
        group.userCounter = this.userCounter;
        group.unReadMomentCounter = this.unReadMomentCounter;
        group.joined = this.joined;
        group.status = this.status;
        group.groupType = this.groupType;
        group.createdTime = this.createdTime;
        List<String> list2 = this.userIds;
        if (list2 != null) {
            group.userIds = ValueObject.util_map(list2, new qcj() { // from class: l.tdk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Group.m62027a((String) obj);
                }
            });
        }
        List<TopicMomentIdBox> list3 = this.topics;
        if (list3 != null) {
            group.topics = ValueObject.util_map(list3, new qcj() { // from class: l.udk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).mo225055clone();
                }
            });
        }
        List<TopicMomentIdBox> list4 = this.hotTopics;
        if (list4 != null) {
            group.hotTopics = ValueObject.util_map(list4, new qcj() { // from class: l.vdk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).mo225055clone();
                }
            });
        }
        group.owner = this.owner;
        return group;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, group.name) && ValueObject.util_equals(this.description, group.description) && ValueObject.util_equals(this.preViewContent, group.preViewContent) && ValueObject.util_equals(this.memberRole, group.memberRole) && ValueObject.util_equals(this.state, group.state) && ValueObject.util_equals(this.icon, group.icon) && ValueObject.util_equals(this.headIcon, group.headIcon) && ValueObject.util_equals(this.backgroundColors, group.backgroundColors) && this.userCounter == group.userCounter && this.unReadMomentCounter == group.unReadMomentCounter && this.joined == group.joined && ValueObject.util_equals(this.status, group.status) && ValueObject.util_equals(this.groupType, group.groupType) && this.createdTime == group.createdTime && ValueObject.util_equals(this.userIds, group.userIds) && ValueObject.util_equals(this.topics, group.topics) && ValueObject.util_equals(this.hotTopics, group.hotTopics) && ValueObject.util_equals(this.owner, group.owner);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "group";
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.preViewContent;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.memberRole;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.state;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.icon;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.headIcon;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<String> list = this.backgroundColors;
        int iHashCode9 = (((((((iHashCode8 + (list != null ? list.hashCode() : 0)) * 41) + this.userCounter) * 41) + this.unReadMomentCounter) * 41) + (this.joined ? 1231 : 1237)) * 41;
        String str8 = this.status;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        GroupType groupType = this.groupType;
        int iHashCode11 = groupType != null ? groupType.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = (((iHashCode10 + iHashCode11) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        List<String> list2 = this.userIds;
        int iHashCode12 = (i2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<TopicMomentIdBox> list3 = this.topics;
        int iHashCode13 = (iHashCode12 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<TopicMomentIdBox> list4 = this.hotTopics;
        int iHashCode14 = (iHashCode13 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str9 = this.owner;
        int iHashCode15 = iHashCode14 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isGroupAnonymousType() {
        return TEnum.equals(this.groupType, GroupType.anonymous_group);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Group group) {
        if (!shouldMergeData() || equals(group)) {
            return;
        }
        if (!isFieldParsed(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            this.name = group.name;
        }
        if (!isFieldParsed("description")) {
            this.description = group.description;
        }
        if (!isFieldParsed("preViewContent")) {
            this.preViewContent = group.preViewContent;
        }
        if (!isFieldParsed("memberRole")) {
            this.memberRole = group.memberRole;
        }
        if (!isFieldParsed("state")) {
            this.state = group.state;
        }
        if (!isFieldParsed("icon")) {
            this.icon = group.icon;
        }
        if (!isFieldParsed("headIcon")) {
            this.headIcon = group.headIcon;
        }
        if (!isFieldParsed("backgroundColors")) {
            this.backgroundColors = group.backgroundColors;
        }
        if (!isFieldParsed("userCounter")) {
            this.userCounter = group.userCounter;
        }
        if (!isFieldParsed("unReadMomentCounter")) {
            this.unReadMomentCounter = group.unReadMomentCounter;
        }
        if (!isFieldParsed("joined")) {
            this.joined = group.joined;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = group.status;
        }
        if (!isFieldParsed("groupType")) {
            this.groupType = group.groupType;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = group.createdTime;
        }
        if (!isFieldParsed("userIds")) {
            this.userIds = group.userIds;
        }
        if (!isFieldParsed("topics")) {
            this.topics = group.topics;
        }
        if (!isFieldParsed("hotTopics")) {
            this.hotTopics = group.hotTopics;
        }
        if (!isFieldParsed(Owner.TYPE)) {
            this.owner = group.owner;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.preViewContent == null) {
            this.preViewContent = "";
        }
        if (this.memberRole == null) {
            this.memberRole = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.headIcon == null) {
            this.headIcon = "";
        }
        if (this.backgroundColors == null) {
            this.backgroundColors = new ArrayList();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.groupType == null) {
            this.groupType = (GroupType) GroupType.JSON_ADAPTER.defaultEnum();
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.hotTopics == null) {
            this.hotTopics = new ArrayList();
        }
        if (this.owner == null) {
            this.owner = "";
        }
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
