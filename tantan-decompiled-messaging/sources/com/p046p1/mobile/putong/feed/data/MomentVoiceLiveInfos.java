package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.MemberUsers;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class MomentVoiceLiveInfos extends DbObject<MomentVoiceLiveInfos> implements Cloneable, Serializable {
    public static final String TYPE = "momentvoiceliveinfos";

    @NonNull
    @ProtobufIndex(index = 51)
    public String anchorUserID;

    @ProtobufIndex(index = 60)
    public int audienceCount;

    @NonNull
    @ProtobufIndex(index = 52)
    public String liveID;

    @ProtobufIndex(index = 55)
    public int memberCount;

    @NonNull
    @ProtobufIndex(index = 59)
    public List<MemberUsers> memberUsers;

    @NonNull
    @ProtobufIndex(index = 62)
    public MomentVoiceUser momentVoiceUser;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 53)
    public String roomID;

    @NonNull
    @ProtobufIndex(index = 54)
    public String schemaSearch;

    @NonNull
    @ProtobufIndex(index = 56)
    public LiveType state;

    @NonNull
    @ProtobufIndex(index = 57)
    public String title;

    @NonNull
    @ProtobufIndex(index = 58)
    public String topicID;

    @NonNull
    @ProtobufIndex(index = 61)
    public String topicName;
    public static ProtobufAdapter<MomentVoiceLiveInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentVoiceLiveInfos>() { // from class: com.p1.mobile.putong.feed.data.MomentVoiceLiveInfos.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentVoiceLiveInfos momentVoiceLiveInfos) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, momentVoiceLiveInfos._id);
            String str = momentVoiceLiveInfos.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = momentVoiceLiveInfos.anchorUserID;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = momentVoiceLiveInfos.liveID;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            String str4 = momentVoiceLiveInfos.roomID;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(53, str4);
            }
            String str5 = momentVoiceLiveInfos.schemaSearch;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(54, str5);
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(55, momentVoiceLiveInfos.memberCount);
            LiveType liveType = momentVoiceLiveInfos.state;
            if (liveType != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(56, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            String str6 = momentVoiceLiveInfos.title;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(57, str6);
            }
            String str7 = momentVoiceLiveInfos.topicID;
            if (str7 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(58, str7);
            }
            List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(59, list, MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(60, momentVoiceLiveInfos.audienceCount);
            String str8 = momentVoiceLiveInfos.topicName;
            if (str8 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(61, str8);
            }
            MomentVoiceUser momentVoiceUser = momentVoiceLiveInfos.momentVoiceUser;
            if (momentVoiceUser != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(62, momentVoiceUser, MomentVoiceUser.PROTOBUF_ADAPTER);
            }
            momentVoiceLiveInfos.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentVoiceLiveInfos parse(nb5 nb5Var) throws IOException {
            MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (momentVoiceLiveInfos.anchorUserID == null) {
                            momentVoiceLiveInfos.anchorUserID = "";
                        }
                        if (momentVoiceLiveInfos.liveID == null) {
                            momentVoiceLiveInfos.liveID = "";
                        }
                        if (momentVoiceLiveInfos.roomID == null) {
                            momentVoiceLiveInfos.roomID = "";
                        }
                        if (momentVoiceLiveInfos.schemaSearch == null) {
                            momentVoiceLiveInfos.schemaSearch = "";
                        }
                        if (momentVoiceLiveInfos.state == null) {
                            momentVoiceLiveInfos.state = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentVoiceLiveInfos.title == null) {
                            momentVoiceLiveInfos.title = "";
                        }
                        if (momentVoiceLiveInfos.topicID == null) {
                            momentVoiceLiveInfos.topicID = "";
                        }
                        if (momentVoiceLiveInfos.memberUsers == null) {
                            momentVoiceLiveInfos.memberUsers = new ArrayList();
                        }
                        if (momentVoiceLiveInfos.topicName == null) {
                            momentVoiceLiveInfos.topicName = "";
                        }
                        if (momentVoiceLiveInfos.momentVoiceUser == null) {
                            momentVoiceLiveInfos.momentVoiceUser = MomentVoiceUser.new_();
                        }
                        break;
                    case 8:
                        momentVoiceLiveInfos._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        momentVoiceLiveInfos.f56011id = nb5Var.m158750s();
                        continue;
                    case 410:
                        momentVoiceLiveInfos.anchorUserID = nb5Var.m158750s();
                        continue;
                    case 418:
                        momentVoiceLiveInfos.liveID = nb5Var.m158750s();
                        continue;
                    case 426:
                        momentVoiceLiveInfos.roomID = nb5Var.m158750s();
                        continue;
                    case 434:
                        momentVoiceLiveInfos.schemaSearch = nb5Var.m158750s();
                        continue;
                    case 440:
                        momentVoiceLiveInfos.memberCount = nb5Var.m158741j();
                        continue;
                    case 450:
                        momentVoiceLiveInfos.state = (LiveType) nb5Var.m158743l(LiveType.PROTOBUF_ADAPTER);
                        continue;
                    case 458:
                        momentVoiceLiveInfos.title = nb5Var.m158750s();
                        continue;
                    case 466:
                        momentVoiceLiveInfos.topicID = nb5Var.m158750s();
                        continue;
                    case 474:
                        momentVoiceLiveInfos.memberUsers = (List) nb5Var.m158743l(MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 480:
                        momentVoiceLiveInfos.audienceCount = nb5Var.m158741j();
                        continue;
                    case 490:
                        momentVoiceLiveInfos.topicName = nb5Var.m158750s();
                        continue;
                    case 498:
                        momentVoiceLiveInfos.momentVoiceUser = (MomentVoiceUser) nb5Var.m158743l(MomentVoiceUser.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (momentVoiceLiveInfos.anchorUserID == null) {
                            momentVoiceLiveInfos.anchorUserID = "";
                        }
                        if (momentVoiceLiveInfos.liveID == null) {
                            momentVoiceLiveInfos.liveID = "";
                        }
                        if (momentVoiceLiveInfos.roomID == null) {
                            momentVoiceLiveInfos.roomID = "";
                        }
                        if (momentVoiceLiveInfos.schemaSearch == null) {
                            momentVoiceLiveInfos.schemaSearch = "";
                        }
                        if (momentVoiceLiveInfos.state == null) {
                            momentVoiceLiveInfos.state = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentVoiceLiveInfos.title == null) {
                            momentVoiceLiveInfos.title = "";
                        }
                        if (momentVoiceLiveInfos.topicID == null) {
                            momentVoiceLiveInfos.topicID = "";
                        }
                        if (momentVoiceLiveInfos.memberUsers == null) {
                            momentVoiceLiveInfos.memberUsers = new ArrayList();
                        }
                        if (momentVoiceLiveInfos.topicName == null) {
                            momentVoiceLiveInfos.topicName = "";
                        }
                        if (momentVoiceLiveInfos.momentVoiceUser == null) {
                            momentVoiceLiveInfos.momentVoiceUser = MomentVoiceUser.new_();
                            return momentVoiceLiveInfos;
                        }
                        break;
                }
            }
            return momentVoiceLiveInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentVoiceLiveInfos momentVoiceLiveInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, momentVoiceLiveInfos._id);
            String str = momentVoiceLiveInfos.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = momentVoiceLiveInfos.anchorUserID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = momentVoiceLiveInfos.liveID;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            String str4 = momentVoiceLiveInfos.roomID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(53, str4);
            }
            String str5 = momentVoiceLiveInfos.schemaSearch;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(54, str5);
            }
            codedOutputByteBufferNano.m17250G(55, momentVoiceLiveInfos.memberCount);
            LiveType liveType = momentVoiceLiveInfos.state;
            if (liveType != null) {
                codedOutputByteBufferNano.m17254K(56, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            String str6 = momentVoiceLiveInfos.title;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(57, str6);
            }
            String str7 = momentVoiceLiveInfos.topicID;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(58, str7);
            }
            List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(59, list, MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(60, momentVoiceLiveInfos.audienceCount);
            String str8 = momentVoiceLiveInfos.topicName;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(61, str8);
            }
            MomentVoiceUser momentVoiceUser = momentVoiceLiveInfos.momentVoiceUser;
            if (momentVoiceUser != null) {
                codedOutputByteBufferNano.m17254K(62, momentVoiceUser, MomentVoiceUser.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentVoiceLiveInfos> JSON_ADAPTER = new ObjectJsonAdapter<MomentVoiceLiveInfos>() { // from class: com.p1.mobile.putong.feed.data.MomentVoiceLiveInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentVoiceLiveInfos.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentVoiceLiveInfos newInstance() {
            return new MomentVoiceLiveInfos();
        }

        public boolean parseField(MomentVoiceLiveInfos momentVoiceLiveInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "audienceCount":
                    momentVoiceLiveInfos.audienceCount = jsonParser.getValueAsInt();
                    return true;
                case "schemaSearch":
                    momentVoiceLiveInfos.schemaSearch = jsonParser.getValueAsString();
                    return true;
                case "momentVoiceUser":
                    momentVoiceLiveInfos.momentVoiceUser = MomentVoiceUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topicID":
                    momentVoiceLiveInfos.topicID = jsonParser.getValueAsString();
                    return true;
                case "liveID":
                    momentVoiceLiveInfos.liveID = jsonParser.getValueAsString();
                    return true;
                case "roomID":
                    momentVoiceLiveInfos.roomID = jsonParser.getValueAsString();
                    return true;
                case "anchorUserID":
                    momentVoiceLiveInfos.anchorUserID = jsonParser.getValueAsString();
                    return true;
                case "id":
                    momentVoiceLiveInfos.f56011id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    momentVoiceLiveInfos.state = LiveType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    momentVoiceLiveInfos.title = jsonParser.getValueAsString();
                    return true;
                case "topicName":
                    momentVoiceLiveInfos.topicName = jsonParser.getValueAsString();
                    return true;
                case "memberCount":
                    momentVoiceLiveInfos.memberCount = jsonParser.getValueAsInt();
                    return true;
                case "memberUsers":
                    momentVoiceLiveInfos.memberUsers = JsonAdapter.parseArray(jsonParser, MemberUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentVoiceLiveInfos momentVoiceLiveInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "audienceCount":
                case "schemaSearch":
                case "momentVoiceUser":
                case "topicID":
                case "liveID":
                case "roomID":
                case "anchorUserID":
                    return true;
                case "id":
                    return false;
                case "state":
                case "title":
                case "topicName":
                case "memberCount":
                case "memberUsers":
                    return true;
                default:
                    return super.parseFieldCheck(momentVoiceLiveInfos, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentVoiceLiveInfos momentVoiceLiveInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = momentVoiceLiveInfos.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentVoiceLiveInfos.anchorUserID;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorUserID", str2);
            }
            String str3 = momentVoiceLiveInfos.liveID;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveID", str3);
            }
            String str4 = momentVoiceLiveInfos.roomID;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomID", str4);
            }
            String str5 = momentVoiceLiveInfos.schemaSearch;
            if (str5 != null) {
                jsonGenerator.writeStringField("schemaSearch", str5);
            }
            jsonGenerator.writeNumberField("memberCount", momentVoiceLiveInfos.memberCount);
            if (momentVoiceLiveInfos.state != null) {
                jsonGenerator.writeFieldName("state");
                LiveType.JSON_ADAPTER.serialize(momentVoiceLiveInfos.state, jsonGenerator, true);
            }
            String str6 = momentVoiceLiveInfos.title;
            if (str6 != null) {
                jsonGenerator.writeStringField("title", str6);
            }
            String str7 = momentVoiceLiveInfos.topicID;
            if (str7 != null) {
                jsonGenerator.writeStringField("topicID", str7);
            }
            if (momentVoiceLiveInfos.memberUsers != null) {
                jsonGenerator.writeFieldName("memberUsers");
                JsonAdapter.serializeArray(momentVoiceLiveInfos.memberUsers, jsonGenerator, MemberUsers.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("audienceCount", momentVoiceLiveInfos.audienceCount);
            String str8 = momentVoiceLiveInfos.topicName;
            if (str8 != null) {
                jsonGenerator.writeStringField("topicName", str8);
            }
            if (momentVoiceLiveInfos.momentVoiceUser != null) {
                jsonGenerator.writeFieldName("momentVoiceUser");
                MomentVoiceUser.JSON_ADAPTER.serialize(momentVoiceLiveInfos.momentVoiceUser, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentVoiceLiveInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentVoiceLiveInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentVoiceLiveInfos new_() {
        MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
        momentVoiceLiveInfos.nullCheck();
        return momentVoiceLiveInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentVoiceLiveInfos mo223809clone() {
        MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
        momentVoiceLiveInfos._id = this._id;
        momentVoiceLiveInfos.f56011id = this.f56011id;
        momentVoiceLiveInfos.anchorUserID = this.anchorUserID;
        momentVoiceLiveInfos.liveID = this.liveID;
        momentVoiceLiveInfos.roomID = this.roomID;
        momentVoiceLiveInfos.schemaSearch = this.schemaSearch;
        momentVoiceLiveInfos.memberCount = this.memberCount;
        momentVoiceLiveInfos.state = this.state;
        momentVoiceLiveInfos.title = this.title;
        momentVoiceLiveInfos.topicID = this.topicID;
        List<MemberUsers> list = this.memberUsers;
        if (list != null) {
            momentVoiceLiveInfos.memberUsers = ValueObject.util_map(list, new w9j() { // from class: l.mm00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MemberUsers) obj).mo223809clone();
                }
            });
        }
        momentVoiceLiveInfos.audienceCount = this.audienceCount;
        momentVoiceLiveInfos.topicName = this.topicName;
        MomentVoiceUser momentVoiceUser = this.momentVoiceUser;
        if (momentVoiceUser != null) {
            momentVoiceLiveInfos.momentVoiceUser = momentVoiceUser.mo223809clone();
        }
        return momentVoiceLiveInfos;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentVoiceLiveInfos)) {
            return false;
        }
        MomentVoiceLiveInfos momentVoiceLiveInfos = (MomentVoiceLiveInfos) obj;
        return super.equals(obj) && ValueObject.util_equals(this.anchorUserID, momentVoiceLiveInfos.anchorUserID) && ValueObject.util_equals(this.liveID, momentVoiceLiveInfos.liveID) && ValueObject.util_equals(this.roomID, momentVoiceLiveInfos.roomID) && ValueObject.util_equals(this.schemaSearch, momentVoiceLiveInfos.schemaSearch) && this.memberCount == momentVoiceLiveInfos.memberCount && ValueObject.util_equals(this.state, momentVoiceLiveInfos.state) && ValueObject.util_equals(this.title, momentVoiceLiveInfos.title) && ValueObject.util_equals(this.topicID, momentVoiceLiveInfos.topicID) && ValueObject.util_equals(this.memberUsers, momentVoiceLiveInfos.memberUsers) && this.audienceCount == momentVoiceLiveInfos.audienceCount && ValueObject.util_equals(this.topicName, momentVoiceLiveInfos.topicName) && ValueObject.util_equals(this.momentVoiceUser, momentVoiceLiveInfos.momentVoiceUser);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.anchorUserID;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveID;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomID;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.schemaSearch;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.memberCount) * 41;
        LiveType liveType = this.state;
        int iHashCode6 = (iHashCode5 + (liveType != null ? liveType.hashCode() : 0)) * 41;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.topicID;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<MemberUsers> list = this.memberUsers;
        int iHashCode9 = (((iHashCode8 + (list != null ? list.hashCode() : 0)) * 41) + this.audienceCount) * 41;
        String str7 = this.topicName;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        MomentVoiceUser momentVoiceUser = this.momentVoiceUser;
        int iHashCode11 = iHashCode10 + (momentVoiceUser != null ? momentVoiceUser.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(MomentVoiceLiveInfos momentVoiceLiveInfos) {
        if (!shouldMergeData() || equals(momentVoiceLiveInfos)) {
            return;
        }
        if (!isFieldParsed("anchorUserID")) {
            this.anchorUserID = momentVoiceLiveInfos.anchorUserID;
        }
        if (!isFieldParsed("liveID")) {
            this.liveID = momentVoiceLiveInfos.liveID;
        }
        if (!isFieldParsed("roomID")) {
            this.roomID = momentVoiceLiveInfos.roomID;
        }
        if (!isFieldParsed("schemaSearch")) {
            this.schemaSearch = momentVoiceLiveInfos.schemaSearch;
        }
        if (!isFieldParsed("memberCount")) {
            this.memberCount = momentVoiceLiveInfos.memberCount;
        }
        if (!isFieldParsed("state")) {
            this.state = momentVoiceLiveInfos.state;
        }
        if (!isFieldParsed("title")) {
            this.title = momentVoiceLiveInfos.title;
        }
        if (!isFieldParsed("topicID")) {
            this.topicID = momentVoiceLiveInfos.topicID;
        }
        if (!isFieldParsed("memberUsers")) {
            this.memberUsers = momentVoiceLiveInfos.memberUsers;
        }
        if (!isFieldParsed("audienceCount")) {
            this.audienceCount = momentVoiceLiveInfos.audienceCount;
        }
        if (!isFieldParsed("topicName")) {
            this.topicName = momentVoiceLiveInfos.topicName;
        }
        if (!isFieldParsed("momentVoiceUser")) {
            this.momentVoiceUser = momentVoiceLiveInfos.momentVoiceUser;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.anchorUserID == null) {
            this.anchorUserID = "";
        }
        if (this.liveID == null) {
            this.liveID = "";
        }
        if (this.roomID == null) {
            this.roomID = "";
        }
        if (this.schemaSearch == null) {
            this.schemaSearch = "";
        }
        if (this.state == null) {
            this.state = (LiveType) LiveType.JSON_ADAPTER.defaultEnum();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.topicID == null) {
            this.topicID = "";
        }
        if (this.memberUsers == null) {
            this.memberUsers = new ArrayList();
        }
        if (this.topicName == null) {
            this.topicName = "";
        }
        if (this.momentVoiceUser == null) {
            this.momentVoiceUser = MomentVoiceUser.new_();
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
