package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Group extends DbObject<Group> implements Cloneable, Serializable {
    public static final String TYPE = "group";

    @NonNull
    @ProtobufIndex(index = 58)
    public List<String> backgroundColors;

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Group group) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) group)._id);
            String str = ((DbObject) group).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = group.name;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = group.description;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            String str4 = group.preViewContent;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str4);
            }
            String str5 = group.memberRole;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(54, str5);
            }
            String str6 = group.state;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(55, str6);
            }
            String str7 = group.icon;
            if (str7 != null) {
                iJ += CodedOutputByteBufferNano.o(56, str7);
            }
            String str8 = group.headIcon;
            if (str8 != null) {
                iJ += CodedOutputByteBufferNano.o(57, str8);
            }
            List<String> list = group.backgroundColors;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(58, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iJ + CodedOutputByteBufferNano.h(59, group.userCounter) + CodedOutputByteBufferNano.h(60, group.unReadMomentCounter) + CodedOutputByteBufferNano.b(61, group.joined);
            String str9 = group.status;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(62, str9);
            }
            GroupType groupType = group.groupType;
            if (groupType != null) {
                iH += CodedOutputByteBufferNano.l(63, groupType, GroupType.PROTOBUF_ADAPTER);
            }
            int iD = iH + CodedOutputByteBufferNano.d(64, group.createdTime);
            List<String> list2 = group.userIds;
            if (list2 != null) {
                iD += CodedOutputByteBufferNano.l(65, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list3 = group.topics;
            if (list3 != null) {
                iD += CodedOutputByteBufferNano.l(66, list3, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list4 = group.hotTopics;
            if (list4 != null) {
                iD += CodedOutputByteBufferNano.l(67, list4, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = group.owner;
            if (str10 != null) {
                iD += CodedOutputByteBufferNano.o(68, str10);
            }
            ((MessageNano) group).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Group m19524parse(nb5 nb5Var) throws IOException {
            Group group = new Group();
            while (true) {
                switch (nb5Var.u()) {
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
                        ((DbObject) group)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) group).id = nb5Var.s();
                        continue;
                    case 410:
                        group.name = nb5Var.s();
                        continue;
                    case 418:
                        group.description = nb5Var.s();
                        continue;
                    case 426:
                        group.preViewContent = nb5Var.s();
                        continue;
                    case 434:
                        group.memberRole = nb5Var.s();
                        continue;
                    case 442:
                        group.state = nb5Var.s();
                        continue;
                    case 450:
                        group.icon = nb5Var.s();
                        continue;
                    case 458:
                        group.headIcon = nb5Var.s();
                        continue;
                    case 466:
                        group.backgroundColors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 472:
                        group.userCounter = nb5Var.j();
                        continue;
                    case 480:
                        group.unReadMomentCounter = nb5Var.j();
                        continue;
                    case 488:
                        group.joined = nb5Var.g();
                        continue;
                    case 498:
                        group.status = nb5Var.s();
                        continue;
                    case 506:
                        group.groupType = (GroupType) nb5Var.l(GroupType.PROTOBUF_ADAPTER);
                        continue;
                    case 513:
                        group.createdTime = nb5Var.h();
                        continue;
                    case 522:
                        group.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 530:
                        group.topics = (List) nb5Var.l(TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 538:
                        group.hotTopics = (List) nb5Var.l(TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 546:
                        group.owner = nb5Var.s();
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

        public void serialize(Group group, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) group)._id);
            String str = ((DbObject) group).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = group.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = group.description;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            String str4 = group.preViewContent;
            if (str4 != null) {
                codedOutputByteBufferNano.R(53, str4);
            }
            String str5 = group.memberRole;
            if (str5 != null) {
                codedOutputByteBufferNano.R(54, str5);
            }
            String str6 = group.state;
            if (str6 != null) {
                codedOutputByteBufferNano.R(55, str6);
            }
            String str7 = group.icon;
            if (str7 != null) {
                codedOutputByteBufferNano.R(56, str7);
            }
            String str8 = group.headIcon;
            if (str8 != null) {
                codedOutputByteBufferNano.R(57, str8);
            }
            List<String> list = group.backgroundColors;
            if (list != null) {
                codedOutputByteBufferNano.K(58, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(59, group.userCounter);
            codedOutputByteBufferNano.G(60, group.unReadMomentCounter);
            codedOutputByteBufferNano.A(61, group.joined);
            String str9 = group.status;
            if (str9 != null) {
                codedOutputByteBufferNano.R(62, str9);
            }
            GroupType groupType = group.groupType;
            if (groupType != null) {
                codedOutputByteBufferNano.K(63, groupType, GroupType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(64, group.createdTime);
            List<String> list2 = group.userIds;
            if (list2 != null) {
                codedOutputByteBufferNano.K(65, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list3 = group.topics;
            if (list3 != null) {
                codedOutputByteBufferNano.K(66, list3, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMomentIdBox> list4 = group.hotTopics;
            if (list4 != null) {
                codedOutputByteBufferNano.K(67, list4, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str10 = group.owner;
            if (str10 != null) {
                codedOutputByteBufferNano.R(68, str10);
            }
        }
    };
    public static JsonAdapter<Group> JSON_ADAPTER = new ObjectJsonAdapter<Group>() { // from class: com.p1.mobile.putong.feed.data.Group.2
        public Class getDataClass() {
            return Group.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Group mo17830newInstance() {
            return new Group();
        }

        public boolean parseField(Group group, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    group.description = jsonParser.getValueAsString();
                    return true;
                case "groupType":
                    group.groupType = (GroupType) GroupType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "preViewContent":
                    group.preViewContent = jsonParser.getValueAsString();
                    return true;
                case "memberRole":
                    group.memberRole = jsonParser.getValueAsString();
                    return true;
                case "joined":
                    group.joined = jsonParser.getValueAsBoolean();
                    return true;
                case "headIcon":
                    group.headIcon = jsonParser.getValueAsString();
                    return true;
                case "status":
                    group.status = jsonParser.getValueAsString();
                    return true;
                case "topics":
                    group.topics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "unReadMomentCounter":
                    group.unReadMomentCounter = jsonParser.getValueAsInt();
                    return true;
                case "hotTopics":
                    group.hotTopics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    group.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "userIds":
                    group.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) group).id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    group.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    group.name = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    group.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    group.state = jsonParser.getValueAsString();
                    return true;
                case "userCounter":
                    group.userCounter = jsonParser.getValueAsInt();
                    return true;
                case "backgroundColors":
                    group.backgroundColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Group group, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "groupType":
                case "preViewContent":
                case "memberRole":
                case "joined":
                case "headIcon":
                case "status":
                case "topics":
                case "unReadMomentCounter":
                case "hotTopics":
                case "createdTime":
                case "userIds":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "owner":
                case "state":
                case "userCounter":
                case "backgroundColors":
                    return true;
                default:
                    return super.parseFieldCheck(group, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Group group, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) group).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = group.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
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
                jsonGenerator.writeStringField(Channel.state, str6);
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
                jsonGenerator.writeStringField("status", str9);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Group) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Group) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public List<TopicMoment> relatedTopics = new ArrayList();
    public List<TopicMoment> hotTopicsModels = new ArrayList();
    private HashSet<String> parseFieldSet = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1769a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1771c(String str) {
        return str;
    }

    public static Group new_() {
        Group group = new Group();
        group.nullCheck();
        return group;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Group m19523clone() {
        Group group = new Group();
        ((DbObject) group)._id = ((DbObject) this)._id;
        ((DbObject) group).id = ((DbObject) this).id;
        group.name = this.name;
        group.description = this.description;
        group.preViewContent = this.preViewContent;
        group.memberRole = this.memberRole;
        group.state = this.state;
        group.icon = this.icon;
        group.headIcon = this.headIcon;
        List<String> list = this.backgroundColors;
        if (list != null) {
            group.backgroundColors = ValueObject.util_map(list, new w9j() { // from class: l.cbk
                public final Object call(Object obj) {
                    return Group.m1771c((String) obj);
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
            group.userIds = ValueObject.util_map(list2, new w9j() { // from class: l.dbk
                public final Object call(Object obj) {
                    return Group.m1769a((String) obj);
                }
            });
        }
        List<TopicMomentIdBox> list3 = this.topics;
        if (list3 != null) {
            group.topics = ValueObject.util_map(list3, new w9j() { // from class: l.ebk
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).m19108clone();
                }
            });
        }
        List<TopicMomentIdBox> list4 = this.hotTopics;
        if (list4 != null) {
            group.hotTopics = ValueObject.util_map(list4, new w9j() { // from class: l.fbk
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).m19108clone();
                }
            });
        }
        group.owner = this.owner;
        return group;
    }

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

    public String getClassParseName() {
        return "group";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isGroupAnonymousType() {
        return TEnum.equals(this.groupType, GroupType.anonymous_group);
    }

    public void mergeData(Group group) {
        if (!shouldMergeData() || equals(group)) {
            return;
        }
        if (!isFieldParsed("name")) {
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
        if (!isFieldParsed(Channel.state)) {
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
        if (!isFieldParsed("status")) {
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

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
