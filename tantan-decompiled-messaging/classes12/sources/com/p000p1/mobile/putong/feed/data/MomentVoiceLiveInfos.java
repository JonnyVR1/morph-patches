package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MemberUsers;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentVoiceLiveInfos momentVoiceLiveInfos) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) momentVoiceLiveInfos)._id);
            String str = ((DbObject) momentVoiceLiveInfos).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = momentVoiceLiveInfos.anchorUserID;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = momentVoiceLiveInfos.liveID;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            String str4 = momentVoiceLiveInfos.roomID;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str4);
            }
            String str5 = momentVoiceLiveInfos.schemaSearch;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(54, str5);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(55, momentVoiceLiveInfos.memberCount);
            LiveType liveType = momentVoiceLiveInfos.state;
            if (liveType != null) {
                iH += CodedOutputByteBufferNano.l(56, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            String str6 = momentVoiceLiveInfos.title;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(57, str6);
            }
            String str7 = momentVoiceLiveInfos.topicID;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(58, str7);
            }
            List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(59, list, MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(60, momentVoiceLiveInfos.audienceCount);
            String str8 = momentVoiceLiveInfos.topicName;
            if (str8 != null) {
                iH2 += CodedOutputByteBufferNano.o(61, str8);
            }
            MomentVoiceUser momentVoiceUser = momentVoiceLiveInfos.momentVoiceUser;
            if (momentVoiceUser != null) {
                iH2 += CodedOutputByteBufferNano.l(62, momentVoiceUser, MomentVoiceUser.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentVoiceLiveInfos).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentVoiceLiveInfos m19660parse(nb5 nb5Var) throws IOException {
            MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
            while (true) {
                switch (nb5Var.u()) {
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
                        ((DbObject) momentVoiceLiveInfos)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) momentVoiceLiveInfos).id = nb5Var.s();
                        continue;
                    case 410:
                        momentVoiceLiveInfos.anchorUserID = nb5Var.s();
                        continue;
                    case 418:
                        momentVoiceLiveInfos.liveID = nb5Var.s();
                        continue;
                    case 426:
                        momentVoiceLiveInfos.roomID = nb5Var.s();
                        continue;
                    case 434:
                        momentVoiceLiveInfos.schemaSearch = nb5Var.s();
                        continue;
                    case 440:
                        momentVoiceLiveInfos.memberCount = nb5Var.j();
                        continue;
                    case 450:
                        momentVoiceLiveInfos.state = (LiveType) nb5Var.l(LiveType.PROTOBUF_ADAPTER);
                        continue;
                    case 458:
                        momentVoiceLiveInfos.title = nb5Var.s();
                        continue;
                    case 466:
                        momentVoiceLiveInfos.topicID = nb5Var.s();
                        continue;
                    case 474:
                        momentVoiceLiveInfos.memberUsers = (List) nb5Var.l(MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 480:
                        momentVoiceLiveInfos.audienceCount = nb5Var.j();
                        continue;
                    case 490:
                        momentVoiceLiveInfos.topicName = nb5Var.s();
                        continue;
                    case 498:
                        momentVoiceLiveInfos.momentVoiceUser = (MomentVoiceUser) nb5Var.l(MomentVoiceUser.PROTOBUF_ADAPTER);
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

        public void serialize(MomentVoiceLiveInfos momentVoiceLiveInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) momentVoiceLiveInfos)._id);
            String str = ((DbObject) momentVoiceLiveInfos).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = momentVoiceLiveInfos.anchorUserID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = momentVoiceLiveInfos.liveID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            String str4 = momentVoiceLiveInfos.roomID;
            if (str4 != null) {
                codedOutputByteBufferNano.R(53, str4);
            }
            String str5 = momentVoiceLiveInfos.schemaSearch;
            if (str5 != null) {
                codedOutputByteBufferNano.R(54, str5);
            }
            codedOutputByteBufferNano.G(55, momentVoiceLiveInfos.memberCount);
            LiveType liveType = momentVoiceLiveInfos.state;
            if (liveType != null) {
                codedOutputByteBufferNano.K(56, liveType, LiveType.PROTOBUF_ADAPTER);
            }
            String str6 = momentVoiceLiveInfos.title;
            if (str6 != null) {
                codedOutputByteBufferNano.R(57, str6);
            }
            String str7 = momentVoiceLiveInfos.topicID;
            if (str7 != null) {
                codedOutputByteBufferNano.R(58, str7);
            }
            List<MemberUsers> list = momentVoiceLiveInfos.memberUsers;
            if (list != null) {
                codedOutputByteBufferNano.K(59, list, MemberUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(60, momentVoiceLiveInfos.audienceCount);
            String str8 = momentVoiceLiveInfos.topicName;
            if (str8 != null) {
                codedOutputByteBufferNano.R(61, str8);
            }
            MomentVoiceUser momentVoiceUser = momentVoiceLiveInfos.momentVoiceUser;
            if (momentVoiceUser != null) {
                codedOutputByteBufferNano.K(62, momentVoiceUser, MomentVoiceUser.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentVoiceLiveInfos> JSON_ADAPTER = new ObjectJsonAdapter<MomentVoiceLiveInfos>() { // from class: com.p1.mobile.putong.feed.data.MomentVoiceLiveInfos.2
        public Class getDataClass() {
            return MomentVoiceLiveInfos.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentVoiceLiveInfos mo17830newInstance() {
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
                    momentVoiceLiveInfos.momentVoiceUser = (MomentVoiceUser) MomentVoiceUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    ((DbObject) momentVoiceLiveInfos).id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    momentVoiceLiveInfos.state = (LiveType) LiveType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentVoiceLiveInfos momentVoiceLiveInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) momentVoiceLiveInfos).id;
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
                jsonGenerator.writeFieldName(Channel.state);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentVoiceLiveInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentVoiceLiveInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentVoiceLiveInfos new_() {
        MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
        momentVoiceLiveInfos.nullCheck();
        return momentVoiceLiveInfos;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentVoiceLiveInfos m19659clone() {
        MomentVoiceLiveInfos momentVoiceLiveInfos = new MomentVoiceLiveInfos();
        ((DbObject) momentVoiceLiveInfos)._id = ((DbObject) this)._id;
        ((DbObject) momentVoiceLiveInfos).id = ((DbObject) this).id;
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
                public final Object call(Object obj) {
                    return ((MemberUsers) obj).m19589clone();
                }
            });
        }
        momentVoiceLiveInfos.audienceCount = this.audienceCount;
        momentVoiceLiveInfos.topicName = this.topicName;
        MomentVoiceUser momentVoiceUser = this.momentVoiceUser;
        if (momentVoiceUser != null) {
            momentVoiceLiveInfos.momentVoiceUser = momentVoiceUser.m19662clone();
        }
        return momentVoiceLiveInfos;
    }

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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

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
        if (!isFieldParsed(Channel.state)) {
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

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
