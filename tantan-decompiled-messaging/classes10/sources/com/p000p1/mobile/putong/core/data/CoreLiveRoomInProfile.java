package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreLiveRoomInProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreliveroominprofile";

    @NonNull
    @ProtobufIndex(index = 8)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String background;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String liveType;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public CoreLiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<CoreLiveRoomInProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreLiveRoomInProfile>() { // from class: com.p1.mobile.putong.core.data.CoreLiveRoomInProfile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreLiveRoomInProfile coreLiveRoomInProfile) {
            String str = coreLiveRoomInProfile.liveId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = coreLiveRoomInProfile.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = coreLiveRoomInProfile.subTitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = coreLiveRoomInProfile.anchorId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = coreLiveRoomInProfile.roomId;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = coreLiveRoomInProfile.liveType;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = coreLiveRoomInProfile.background;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = coreLiveRoomInProfile.anchorAvatar;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = coreLiveRoomInProfile.status;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            CoreLiveMultiCallInfo coreLiveMultiCallInfo = coreLiveRoomInProfile.multiCallInfo;
            if (coreLiveMultiCallInfo != null) {
                iO += CodedOutputByteBufferNano.l(10, coreLiveMultiCallInfo, CoreLiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) coreLiveRoomInProfile).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreLiveRoomInProfile m12511parse(nb5 nb5Var) throws IOException {
            CoreLiveRoomInProfile coreLiveRoomInProfile = new CoreLiveRoomInProfile();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coreLiveRoomInProfile.liveId == null) {
                            coreLiveRoomInProfile.liveId = "";
                        }
                        if (coreLiveRoomInProfile.title == null) {
                            coreLiveRoomInProfile.title = "";
                        }
                        if (coreLiveRoomInProfile.subTitle == null) {
                            coreLiveRoomInProfile.subTitle = "";
                        }
                        if (coreLiveRoomInProfile.anchorId == null) {
                            coreLiveRoomInProfile.anchorId = "";
                        }
                        if (coreLiveRoomInProfile.roomId == null) {
                            coreLiveRoomInProfile.roomId = "";
                        }
                        if (coreLiveRoomInProfile.liveType == null) {
                            coreLiveRoomInProfile.liveType = "";
                        }
                        if (coreLiveRoomInProfile.background == null) {
                            coreLiveRoomInProfile.background = "";
                        }
                        if (coreLiveRoomInProfile.anchorAvatar == null) {
                            coreLiveRoomInProfile.anchorAvatar = "";
                        }
                        if (coreLiveRoomInProfile.status == null) {
                            coreLiveRoomInProfile.status = "";
                        }
                        if (coreLiveRoomInProfile.multiCallInfo == null) {
                            coreLiveRoomInProfile.multiCallInfo = CoreLiveMultiCallInfo.new_();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        coreLiveRoomInProfile.liveId = nb5Var.s();
                        continue;
                    case 18:
                        coreLiveRoomInProfile.title = nb5Var.s();
                        continue;
                    case 26:
                        coreLiveRoomInProfile.subTitle = nb5Var.s();
                        continue;
                    case 34:
                        coreLiveRoomInProfile.anchorId = nb5Var.s();
                        continue;
                    case 42:
                        coreLiveRoomInProfile.roomId = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        coreLiveRoomInProfile.liveType = nb5Var.s();
                        continue;
                    case 58:
                        coreLiveRoomInProfile.background = nb5Var.s();
                        continue;
                    case 66:
                        coreLiveRoomInProfile.anchorAvatar = nb5Var.s();
                        continue;
                    case 74:
                        coreLiveRoomInProfile.status = nb5Var.s();
                        continue;
                    case 82:
                        coreLiveRoomInProfile.multiCallInfo = (CoreLiveMultiCallInfo) nb5Var.l(CoreLiveMultiCallInfo.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (coreLiveRoomInProfile.liveId == null) {
                            coreLiveRoomInProfile.liveId = "";
                        }
                        if (coreLiveRoomInProfile.title == null) {
                            coreLiveRoomInProfile.title = "";
                        }
                        if (coreLiveRoomInProfile.subTitle == null) {
                            coreLiveRoomInProfile.subTitle = "";
                        }
                        if (coreLiveRoomInProfile.anchorId == null) {
                            coreLiveRoomInProfile.anchorId = "";
                        }
                        if (coreLiveRoomInProfile.roomId == null) {
                            coreLiveRoomInProfile.roomId = "";
                        }
                        if (coreLiveRoomInProfile.liveType == null) {
                            coreLiveRoomInProfile.liveType = "";
                        }
                        if (coreLiveRoomInProfile.background == null) {
                            coreLiveRoomInProfile.background = "";
                        }
                        if (coreLiveRoomInProfile.anchorAvatar == null) {
                            coreLiveRoomInProfile.anchorAvatar = "";
                        }
                        if (coreLiveRoomInProfile.status == null) {
                            coreLiveRoomInProfile.status = "";
                        }
                        if (coreLiveRoomInProfile.multiCallInfo == null) {
                            coreLiveRoomInProfile.multiCallInfo = CoreLiveMultiCallInfo.new_();
                            return coreLiveRoomInProfile;
                        }
                        break;
                }
            }
            return coreLiveRoomInProfile;
        }

        public void serialize(CoreLiveRoomInProfile coreLiveRoomInProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreLiveRoomInProfile.liveId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = coreLiveRoomInProfile.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = coreLiveRoomInProfile.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = coreLiveRoomInProfile.anchorId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = coreLiveRoomInProfile.roomId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = coreLiveRoomInProfile.liveType;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = coreLiveRoomInProfile.background;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = coreLiveRoomInProfile.anchorAvatar;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = coreLiveRoomInProfile.status;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            CoreLiveMultiCallInfo coreLiveMultiCallInfo = coreLiveRoomInProfile.multiCallInfo;
            if (coreLiveMultiCallInfo != null) {
                codedOutputByteBufferNano.K(10, coreLiveMultiCallInfo, CoreLiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreLiveRoomInProfile> JSON_ADAPTER = new ObjectJsonAdapter<CoreLiveRoomInProfile>() { // from class: com.p1.mobile.putong.core.data.CoreLiveRoomInProfile.2
        public Class getDataClass() {
            return CoreLiveRoomInProfile.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreLiveRoomInProfile m12512newInstance() {
            return new CoreLiveRoomInProfile();
        }

        public boolean parseField(CoreLiveRoomInProfile coreLiveRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    coreLiveRoomInProfile.subTitle = jsonParser.getValueAsString();
                    return true;
                case "anchorAvatar":
                    coreLiveRoomInProfile.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "background":
                    coreLiveRoomInProfile.background = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    coreLiveRoomInProfile.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    coreLiveRoomInProfile.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    coreLiveRoomInProfile.roomId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    coreLiveRoomInProfile.status = jsonParser.getValueAsString();
                    return true;
                case "title":
                    coreLiveRoomInProfile.title = jsonParser.getValueAsString();
                    return true;
                case "liveType":
                    coreLiveRoomInProfile.liveType = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    coreLiveRoomInProfile.multiCallInfo = (CoreLiveMultiCallInfo) CoreLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreLiveRoomInProfile coreLiveRoomInProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "anchorAvatar":
                case "background":
                case "liveId":
                case "anchorId":
                case "roomId":
                case "status":
                case "title":
                case "liveType":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(coreLiveRoomInProfile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CoreLiveRoomInProfile coreLiveRoomInProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = coreLiveRoomInProfile.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = coreLiveRoomInProfile.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = coreLiveRoomInProfile.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = coreLiveRoomInProfile.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            String str5 = coreLiveRoomInProfile.roomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomId", str5);
            }
            String str6 = coreLiveRoomInProfile.liveType;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveType", str6);
            }
            String str7 = coreLiveRoomInProfile.background;
            if (str7 != null) {
                jsonGenerator.writeStringField("background", str7);
            }
            String str8 = coreLiveRoomInProfile.anchorAvatar;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str8);
            }
            String str9 = coreLiveRoomInProfile.status;
            if (str9 != null) {
                jsonGenerator.writeStringField("status", str9);
            }
            if (coreLiveRoomInProfile.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                CoreLiveMultiCallInfo.JSON_ADAPTER.serialize(coreLiveRoomInProfile.multiCallInfo, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreLiveRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreLiveRoomInProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreLiveRoomInProfile new_() {
        CoreLiveRoomInProfile coreLiveRoomInProfile = new CoreLiveRoomInProfile();
        coreLiveRoomInProfile.nullCheck();
        return coreLiveRoomInProfile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreLiveRoomInProfile m12510clone() {
        CoreLiveRoomInProfile coreLiveRoomInProfile = new CoreLiveRoomInProfile();
        coreLiveRoomInProfile.liveId = this.liveId;
        coreLiveRoomInProfile.title = this.title;
        coreLiveRoomInProfile.subTitle = this.subTitle;
        coreLiveRoomInProfile.anchorId = this.anchorId;
        coreLiveRoomInProfile.roomId = this.roomId;
        coreLiveRoomInProfile.liveType = this.liveType;
        coreLiveRoomInProfile.background = this.background;
        coreLiveRoomInProfile.anchorAvatar = this.anchorAvatar;
        coreLiveRoomInProfile.status = this.status;
        CoreLiveMultiCallInfo coreLiveMultiCallInfo = this.multiCallInfo;
        if (coreLiveMultiCallInfo != null) {
            coreLiveRoomInProfile.multiCallInfo = coreLiveMultiCallInfo.m12506clone();
        }
        return coreLiveRoomInProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreLiveRoomInProfile)) {
            return false;
        }
        CoreLiveRoomInProfile coreLiveRoomInProfile = (CoreLiveRoomInProfile) obj;
        return ValueObject.util_equals(this.liveId, coreLiveRoomInProfile.liveId) && ValueObject.util_equals(this.title, coreLiveRoomInProfile.title) && ValueObject.util_equals(this.subTitle, coreLiveRoomInProfile.subTitle) && ValueObject.util_equals(this.anchorId, coreLiveRoomInProfile.anchorId) && ValueObject.util_equals(this.roomId, coreLiveRoomInProfile.roomId) && ValueObject.util_equals(this.liveType, coreLiveRoomInProfile.liveType) && ValueObject.util_equals(this.background, coreLiveRoomInProfile.background) && ValueObject.util_equals(this.anchorAvatar, coreLiveRoomInProfile.anchorAvatar) && ValueObject.util_equals(this.status, coreLiveRoomInProfile.status) && ValueObject.util_equals(this.multiCallInfo, coreLiveRoomInProfile.multiCallInfo);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.liveType;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.background;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.anchorAvatar;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        CoreLiveMultiCallInfo coreLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode10 = iHashCode9 + (coreLiveMultiCallInfo != null ? coreLiveMultiCallInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = CoreLiveMultiCallInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
