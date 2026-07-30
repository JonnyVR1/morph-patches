package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CoreLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class CoreLiveVoiceRoomInProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corelivevoiceroominprofile";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String background;

    @ProtobufIndex(index = 3)
    public boolean isPersonal;

    @NonNull
    @ProtobufIndex(index = 4)
    public String membersText;

    @ProtobufIndex(index = 6)
    public boolean needBuild;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 11)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> userAvatars;

    @NonNull
    @ProtobufIndex(index = 7)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String voiceRoomId;
    public static ProtobufAdapter<CoreLiveVoiceRoomInProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreLiveVoiceRoomInProfile>() { // from class: com.p1.mobile.putong.core.data.CoreLiveVoiceRoomInProfile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile) {
            String str = coreLiveVoiceRoomInProfile.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = coreLiveVoiceRoomInProfile.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, coreLiveVoiceRoomInProfile.isPersonal);
            String str3 = coreLiveVoiceRoomInProfile.membersText;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            List<String> list = coreLiveVoiceRoomInProfile.userAvatars;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(6, coreLiveVoiceRoomInProfile.needBuild);
            String str4 = coreLiveVoiceRoomInProfile.voiceLiveId;
            if (str4 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(7, str4);
            }
            String str5 = coreLiveVoiceRoomInProfile.voiceRoomId;
            if (str5 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(8, str5);
            }
            String str6 = coreLiveVoiceRoomInProfile.anchorId;
            if (str6 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(9, str6);
            }
            String str7 = coreLiveVoiceRoomInProfile.background;
            if (str7 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(10, str7);
            }
            String str8 = coreLiveVoiceRoomInProfile.topicId;
            if (str8 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(11, str8);
            }
            coreLiveVoiceRoomInProfile.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreLiveVoiceRoomInProfile parse(nb5 nb5Var) throws IOException {
            CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile = new CoreLiveVoiceRoomInProfile();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (coreLiveVoiceRoomInProfile.title == null) {
                            coreLiveVoiceRoomInProfile.title = "";
                        }
                        if (coreLiveVoiceRoomInProfile.subTitle == null) {
                            coreLiveVoiceRoomInProfile.subTitle = "";
                        }
                        if (coreLiveVoiceRoomInProfile.membersText == null) {
                            coreLiveVoiceRoomInProfile.membersText = "";
                        }
                        if (coreLiveVoiceRoomInProfile.userAvatars == null) {
                            coreLiveVoiceRoomInProfile.userAvatars = new ArrayList();
                        }
                        if (coreLiveVoiceRoomInProfile.voiceLiveId == null) {
                            coreLiveVoiceRoomInProfile.voiceLiveId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.voiceRoomId == null) {
                            coreLiveVoiceRoomInProfile.voiceRoomId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.anchorId == null) {
                            coreLiveVoiceRoomInProfile.anchorId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.background == null) {
                            coreLiveVoiceRoomInProfile.background = "";
                        }
                        if (coreLiveVoiceRoomInProfile.topicId == null) {
                            coreLiveVoiceRoomInProfile.topicId = "";
                        }
                        break;
                    case 10:
                        coreLiveVoiceRoomInProfile.title = nb5Var.m158750s();
                        continue;
                    case 18:
                        coreLiveVoiceRoomInProfile.subTitle = nb5Var.m158750s();
                        continue;
                    case 24:
                        coreLiveVoiceRoomInProfile.isPersonal = nb5Var.m158738g();
                        continue;
                    case 34:
                        coreLiveVoiceRoomInProfile.membersText = nb5Var.m158750s();
                        continue;
                    case 42:
                        coreLiveVoiceRoomInProfile.userAvatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 48:
                        coreLiveVoiceRoomInProfile.needBuild = nb5Var.m158738g();
                        continue;
                    case 58:
                        coreLiveVoiceRoomInProfile.voiceLiveId = nb5Var.m158750s();
                        continue;
                    case 66:
                        coreLiveVoiceRoomInProfile.voiceRoomId = nb5Var.m158750s();
                        continue;
                    case 74:
                        coreLiveVoiceRoomInProfile.anchorId = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        coreLiveVoiceRoomInProfile.background = nb5Var.m158750s();
                        continue;
                    case 90:
                        coreLiveVoiceRoomInProfile.topicId = nb5Var.m158750s();
                        continue;
                    default:
                        if (coreLiveVoiceRoomInProfile.title == null) {
                            coreLiveVoiceRoomInProfile.title = "";
                        }
                        if (coreLiveVoiceRoomInProfile.subTitle == null) {
                            coreLiveVoiceRoomInProfile.subTitle = "";
                        }
                        if (coreLiveVoiceRoomInProfile.membersText == null) {
                            coreLiveVoiceRoomInProfile.membersText = "";
                        }
                        if (coreLiveVoiceRoomInProfile.userAvatars == null) {
                            coreLiveVoiceRoomInProfile.userAvatars = new ArrayList();
                        }
                        if (coreLiveVoiceRoomInProfile.voiceLiveId == null) {
                            coreLiveVoiceRoomInProfile.voiceLiveId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.voiceRoomId == null) {
                            coreLiveVoiceRoomInProfile.voiceRoomId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.anchorId == null) {
                            coreLiveVoiceRoomInProfile.anchorId = "";
                        }
                        if (coreLiveVoiceRoomInProfile.background == null) {
                            coreLiveVoiceRoomInProfile.background = "";
                        }
                        if (coreLiveVoiceRoomInProfile.topicId == null) {
                            coreLiveVoiceRoomInProfile.topicId = "";
                            return coreLiveVoiceRoomInProfile;
                        }
                        break;
                }
            }
            return coreLiveVoiceRoomInProfile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreLiveVoiceRoomInProfile.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = coreLiveVoiceRoomInProfile.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, coreLiveVoiceRoomInProfile.isPersonal);
            String str3 = coreLiveVoiceRoomInProfile.membersText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            List<String> list = coreLiveVoiceRoomInProfile.userAvatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(6, coreLiveVoiceRoomInProfile.needBuild);
            String str4 = coreLiveVoiceRoomInProfile.voiceLiveId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(7, str4);
            }
            String str5 = coreLiveVoiceRoomInProfile.voiceRoomId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(8, str5);
            }
            String str6 = coreLiveVoiceRoomInProfile.anchorId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(9, str6);
            }
            String str7 = coreLiveVoiceRoomInProfile.background;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(10, str7);
            }
            String str8 = coreLiveVoiceRoomInProfile.topicId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(11, str8);
            }
        }
    };
    public static JsonAdapter<CoreLiveVoiceRoomInProfile> JSON_ADAPTER = new ObjectJsonAdapter<CoreLiveVoiceRoomInProfile>() { // from class: com.p1.mobile.putong.core.data.CoreLiveVoiceRoomInProfile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreLiveVoiceRoomInProfile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreLiveVoiceRoomInProfile newInstance() {
            return new CoreLiveVoiceRoomInProfile();
        }

        public boolean parseField(CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    coreLiveVoiceRoomInProfile.subTitle = jsonParser.getValueAsString();
                    return true;
                case "background":
                    coreLiveVoiceRoomInProfile.background = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    coreLiveVoiceRoomInProfile.topicId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    coreLiveVoiceRoomInProfile.anchorId = jsonParser.getValueAsString();
                    return true;
                case "userAvatars":
                    coreLiveVoiceRoomInProfile.userAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isPersonal":
                    coreLiveVoiceRoomInProfile.isPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceLiveId":
                    coreLiveVoiceRoomInProfile.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    coreLiveVoiceRoomInProfile.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "title":
                    coreLiveVoiceRoomInProfile.title = jsonParser.getValueAsString();
                    return true;
                case "needBuild":
                    coreLiveVoiceRoomInProfile.needBuild = jsonParser.getValueAsBoolean();
                    return true;
                case "membersText":
                    coreLiveVoiceRoomInProfile.membersText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "background":
                case "topicId":
                case "anchorId":
                case "userAvatars":
                case "isPersonal":
                case "voiceLiveId":
                case "voiceRoomId":
                case "title":
                case "needBuild":
                case "membersText":
                    return true;
                default:
                    return super.parseFieldCheck(coreLiveVoiceRoomInProfile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = coreLiveVoiceRoomInProfile.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = coreLiveVoiceRoomInProfile.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            jsonGenerator.writeBooleanField("isPersonal", coreLiveVoiceRoomInProfile.isPersonal);
            String str3 = coreLiveVoiceRoomInProfile.membersText;
            if (str3 != null) {
                jsonGenerator.writeStringField("membersText", str3);
            }
            if (coreLiveVoiceRoomInProfile.userAvatars != null) {
                jsonGenerator.writeFieldName("userAvatars");
                JsonAdapter.serializeArray(coreLiveVoiceRoomInProfile.userAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("needBuild", coreLiveVoiceRoomInProfile.needBuild);
            String str4 = coreLiveVoiceRoomInProfile.voiceLiveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str4);
            }
            String str5 = coreLiveVoiceRoomInProfile.voiceRoomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str5);
            }
            String str6 = coreLiveVoiceRoomInProfile.anchorId;
            if (str6 != null) {
                jsonGenerator.writeStringField("anchorId", str6);
            }
            String str7 = coreLiveVoiceRoomInProfile.background;
            if (str7 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str7);
            }
            String str8 = coreLiveVoiceRoomInProfile.topicId;
            if (str8 != null) {
                jsonGenerator.writeStringField("topicId", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreLiveVoiceRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreLiveVoiceRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35483a(String str) {
        return str;
    }

    public static CoreLiveVoiceRoomInProfile new_() {
        CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile = new CoreLiveVoiceRoomInProfile();
        coreLiveVoiceRoomInProfile.nullCheck();
        return coreLiveVoiceRoomInProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreLiveVoiceRoomInProfile mo223809clone() {
        CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile = new CoreLiveVoiceRoomInProfile();
        coreLiveVoiceRoomInProfile.title = this.title;
        coreLiveVoiceRoomInProfile.subTitle = this.subTitle;
        coreLiveVoiceRoomInProfile.isPersonal = this.isPersonal;
        coreLiveVoiceRoomInProfile.membersText = this.membersText;
        List<String> list = this.userAvatars;
        if (list != null) {
            coreLiveVoiceRoomInProfile.userAvatars = ValueObject.util_map(list, new w9j() { // from class: l.jk9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreLiveVoiceRoomInProfile.m35483a((String) obj);
                }
            });
        }
        coreLiveVoiceRoomInProfile.needBuild = this.needBuild;
        coreLiveVoiceRoomInProfile.voiceLiveId = this.voiceLiveId;
        coreLiveVoiceRoomInProfile.voiceRoomId = this.voiceRoomId;
        coreLiveVoiceRoomInProfile.anchorId = this.anchorId;
        coreLiveVoiceRoomInProfile.background = this.background;
        coreLiveVoiceRoomInProfile.topicId = this.topicId;
        return coreLiveVoiceRoomInProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreLiveVoiceRoomInProfile)) {
            return false;
        }
        CoreLiveVoiceRoomInProfile coreLiveVoiceRoomInProfile = (CoreLiveVoiceRoomInProfile) obj;
        return ValueObject.util_equals(this.title, coreLiveVoiceRoomInProfile.title) && ValueObject.util_equals(this.subTitle, coreLiveVoiceRoomInProfile.subTitle) && this.isPersonal == coreLiveVoiceRoomInProfile.isPersonal && ValueObject.util_equals(this.membersText, coreLiveVoiceRoomInProfile.membersText) && ValueObject.util_equals(this.userAvatars, coreLiveVoiceRoomInProfile.userAvatars) && this.needBuild == coreLiveVoiceRoomInProfile.needBuild && ValueObject.util_equals(this.voiceLiveId, coreLiveVoiceRoomInProfile.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, coreLiveVoiceRoomInProfile.voiceRoomId) && ValueObject.util_equals(this.anchorId, coreLiveVoiceRoomInProfile.anchorId) && ValueObject.util_equals(this.background, coreLiveVoiceRoomInProfile.background) && ValueObject.util_equals(this.topicId, coreLiveVoiceRoomInProfile.topicId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isPersonal ? 1231 : 1237)) * 41;
        String str3 = this.membersText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list = this.userAvatars;
        int iHashCode4 = (((iHashCode3 + (list != null ? list.hashCode() : 0)) * 41) + (this.needBuild ? 1231 : 1237)) * 41;
        String str4 = this.voiceLiveId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceRoomId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.anchorId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.background;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.topicId;
        int iHashCode9 = iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.membersText == null) {
            this.membersText = "";
        }
        if (this.userAvatars == null) {
            this.userAvatars = new ArrayList();
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
