package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Extra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extra";

    @ProtobufIndex(index = 13)
    public boolean activityShowReadButton;

    @ProtobufIndex(index = 1)
    public boolean bindPhone;

    @ProtobufIndex(index = 9)
    public boolean defaultSyncMoment;

    @NonNull
    @ProtobufIndex(index = 12)
    public String defaultTab;

    @Nullable
    @ProtobufIndex(index = 14)
    public ExplorePostBubble explorePostBubble;

    @NonNull
    @ProtobufIndex(index = 5)
    public String feedDefaultPage;

    @ProtobufIndex(index = 4)
    public boolean feedShowAccostButton;

    @ProtobufIndex(index = 3)
    public boolean liveShowFollowButton;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public MomentExposeConfig momentExposeConfig;

    @NonNull
    @ProtobufIndex(index = 2)
    public MomentMedia momentMedia;

    @NonNull
    @ProtobufIndex(index = 8)
    public ShowAudit showAudit;

    @ProtobufIndex(index = 7)
    public boolean showPopWindow;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<StateEmotion> stateEmotion;

    @NonNull
    @ProtobufIndex(index = 11)
    public StateGuide stateGuide;

    @NonNull
    @ProtobufIndex(index = 15)
    public StateWindow stateWindow;

    @NonNull
    @ProtobufIndex(index = 6)
    public String topicH5RedirectURL;
    public static ProtobufAdapter<Extra> PROTOBUF_ADAPTER = new MessageNanoAdapter<Extra>() { // from class: com.p1.mobile.putong.feed.data.Extra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Extra extra) {
            int iB = CodedOutputByteBufferNano.b(1, extra.bindPhone);
            MomentMedia momentMedia = extra.momentMedia;
            if (momentMedia != null) {
                iB += CodedOutputByteBufferNano.l(2, momentMedia, MomentMedia.PROTOBUF_ADAPTER);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(3, extra.liveShowFollowButton) + CodedOutputByteBufferNano.b(4, extra.feedShowAccostButton);
            String str = extra.feedDefaultPage;
            if (str != null) {
                iB2 += CodedOutputByteBufferNano.o(5, str);
            }
            String str2 = extra.topicH5RedirectURL;
            if (str2 != null) {
                iB2 += CodedOutputByteBufferNano.o(6, str2);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(7, extra.showPopWindow);
            ShowAudit showAudit = extra.showAudit;
            if (showAudit != null) {
                iB3 += CodedOutputByteBufferNano.l(8, showAudit, ShowAudit.PROTOBUF_ADAPTER);
            }
            int iB4 = iB3 + CodedOutputByteBufferNano.b(9, extra.defaultSyncMoment);
            List<StateEmotion> list = extra.stateEmotion;
            if (list != null) {
                iB4 += CodedOutputByteBufferNano.l(10, list, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StateGuide stateGuide = extra.stateGuide;
            if (stateGuide != null) {
                iB4 += CodedOutputByteBufferNano.l(11, stateGuide, StateGuide.PROTOBUF_ADAPTER);
            }
            String str3 = extra.defaultTab;
            if (str3 != null) {
                iB4 += CodedOutputByteBufferNano.o(12, str3);
            }
            int iB5 = iB4 + CodedOutputByteBufferNano.b(13, extra.activityShowReadButton);
            ExplorePostBubble explorePostBubble = extra.explorePostBubble;
            if (explorePostBubble != null) {
                iB5 += CodedOutputByteBufferNano.l(14, explorePostBubble, ExplorePostBubble.PROTOBUF_ADAPTER);
            }
            StateWindow stateWindow = extra.stateWindow;
            if (stateWindow != null) {
                iB5 += CodedOutputByteBufferNano.l(15, stateWindow, StateWindow.PROTOBUF_ADAPTER);
            }
            MomentExposeConfig momentExposeConfig = extra.momentExposeConfig;
            if (momentExposeConfig != null) {
                iB5 += CodedOutputByteBufferNano.l(16, momentExposeConfig, MomentExposeConfig.PROTOBUF_ADAPTER);
            }
            ((MessageNano) extra).cachedSize = iB5;
            return iB5;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Extra m19485parse(nb5 nb5Var) throws IOException {
            Extra extra = new Extra();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (extra.momentMedia == null) {
                            extra.momentMedia = MomentMedia.new_();
                        }
                        if (extra.feedDefaultPage == null) {
                            extra.feedDefaultPage = "";
                        }
                        if (extra.topicH5RedirectURL == null) {
                            extra.topicH5RedirectURL = "";
                        }
                        if (extra.showAudit == null) {
                            extra.showAudit = ShowAudit.new_();
                        }
                        if (extra.stateEmotion == null) {
                            extra.stateEmotion = new ArrayList();
                        }
                        if (extra.stateGuide == null) {
                            extra.stateGuide = StateGuide.new_();
                        }
                        if (extra.defaultTab == null) {
                            extra.defaultTab = "";
                        }
                        if (extra.stateWindow == null) {
                            extra.stateWindow = StateWindow.new_();
                        }
                        if (extra.momentExposeConfig == null) {
                            extra.momentExposeConfig = MomentExposeConfig.new_();
                        }
                        break;
                    case 8:
                        extra.bindPhone = nb5Var.g();
                        continue;
                    case 18:
                        extra.momentMedia = (MomentMedia) nb5Var.l(MomentMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 24:
                        extra.liveShowFollowButton = nb5Var.g();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        extra.feedShowAccostButton = nb5Var.g();
                        continue;
                    case 42:
                        extra.feedDefaultPage = nb5Var.s();
                        continue;
                    case 50:
                        extra.topicH5RedirectURL = nb5Var.s();
                        continue;
                    case 56:
                        extra.showPopWindow = nb5Var.g();
                        continue;
                    case 66:
                        extra.showAudit = (ShowAudit) nb5Var.l(ShowAudit.PROTOBUF_ADAPTER);
                        continue;
                    case 72:
                        extra.defaultSyncMoment = nb5Var.g();
                        continue;
                    case 82:
                        extra.stateEmotion = (List) nb5Var.l(StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        extra.stateGuide = (StateGuide) nb5Var.l(StateGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        extra.defaultTab = nb5Var.s();
                        continue;
                    case 104:
                        extra.activityShowReadButton = nb5Var.g();
                        continue;
                    case 114:
                        extra.explorePostBubble = (ExplorePostBubble) nb5Var.l(ExplorePostBubble.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        extra.stateWindow = (StateWindow) nb5Var.l(StateWindow.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        extra.momentExposeConfig = (MomentExposeConfig) nb5Var.l(MomentExposeConfig.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (extra.momentMedia == null) {
                            extra.momentMedia = MomentMedia.new_();
                        }
                        if (extra.feedDefaultPage == null) {
                            extra.feedDefaultPage = "";
                        }
                        if (extra.topicH5RedirectURL == null) {
                            extra.topicH5RedirectURL = "";
                        }
                        if (extra.showAudit == null) {
                            extra.showAudit = ShowAudit.new_();
                        }
                        if (extra.stateEmotion == null) {
                            extra.stateEmotion = new ArrayList();
                        }
                        if (extra.stateGuide == null) {
                            extra.stateGuide = StateGuide.new_();
                        }
                        if (extra.defaultTab == null) {
                            extra.defaultTab = "";
                        }
                        if (extra.stateWindow == null) {
                            extra.stateWindow = StateWindow.new_();
                        }
                        if (extra.momentExposeConfig == null) {
                            extra.momentExposeConfig = MomentExposeConfig.new_();
                            return extra;
                        }
                        break;
                }
            }
            return extra;
        }

        public void serialize(Extra extra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, extra.bindPhone);
            MomentMedia momentMedia = extra.momentMedia;
            if (momentMedia != null) {
                codedOutputByteBufferNano.K(2, momentMedia, MomentMedia.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(3, extra.liveShowFollowButton);
            codedOutputByteBufferNano.A(4, extra.feedShowAccostButton);
            String str = extra.feedDefaultPage;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
            String str2 = extra.topicH5RedirectURL;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            codedOutputByteBufferNano.A(7, extra.showPopWindow);
            ShowAudit showAudit = extra.showAudit;
            if (showAudit != null) {
                codedOutputByteBufferNano.K(8, showAudit, ShowAudit.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(9, extra.defaultSyncMoment);
            List<StateEmotion> list = extra.stateEmotion;
            if (list != null) {
                codedOutputByteBufferNano.K(10, list, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StateGuide stateGuide = extra.stateGuide;
            if (stateGuide != null) {
                codedOutputByteBufferNano.K(11, stateGuide, StateGuide.PROTOBUF_ADAPTER);
            }
            String str3 = extra.defaultTab;
            if (str3 != null) {
                codedOutputByteBufferNano.R(12, str3);
            }
            codedOutputByteBufferNano.A(13, extra.activityShowReadButton);
            ExplorePostBubble explorePostBubble = extra.explorePostBubble;
            if (explorePostBubble != null) {
                codedOutputByteBufferNano.K(14, explorePostBubble, ExplorePostBubble.PROTOBUF_ADAPTER);
            }
            StateWindow stateWindow = extra.stateWindow;
            if (stateWindow != null) {
                codedOutputByteBufferNano.K(15, stateWindow, StateWindow.PROTOBUF_ADAPTER);
            }
            MomentExposeConfig momentExposeConfig = extra.momentExposeConfig;
            if (momentExposeConfig != null) {
                codedOutputByteBufferNano.K(16, momentExposeConfig, MomentExposeConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Extra> JSON_ADAPTER = new ObjectJsonAdapter<Extra>() { // from class: com.p1.mobile.putong.feed.data.Extra.2
        public Class getDataClass() {
            return Extra.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Extra mo17830newInstance() {
            return new Extra();
        }

        public boolean parseField(Extra extra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showPopWindow":
                    extra.showPopWindow = jsonParser.getValueAsBoolean();
                    return true;
                case "defaultSyncMoment":
                    extra.defaultSyncMoment = jsonParser.getValueAsBoolean();
                    return true;
                case "showAudit":
                    extra.showAudit = (ShowAudit) ShowAudit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "stateEmotion":
                    extra.stateEmotion = JsonAdapter.parseArray(jsonParser, StateEmotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bindPhone":
                    extra.bindPhone = jsonParser.getValueAsBoolean();
                    return true;
                case "stateGuide":
                    extra.stateGuide = (StateGuide) StateGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentMedia":
                    extra.momentMedia = (MomentMedia) MomentMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "defaultTab":
                    extra.defaultTab = jsonParser.getValueAsString();
                    return true;
                case "stateWindow":
                    extra.stateWindow = (StateWindow) StateWindow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedDefaultPage":
                    extra.feedDefaultPage = jsonParser.getValueAsString();
                    return true;
                case "liveShowFollowButton":
                    extra.liveShowFollowButton = jsonParser.getValueAsBoolean();
                    return true;
                case "feedShowAccostButton":
                    extra.feedShowAccostButton = jsonParser.getValueAsBoolean();
                    return true;
                case "momentExposeConfig":
                    extra.momentExposeConfig = (MomentExposeConfig) MomentExposeConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "activityShowReadButton":
                    extra.activityShowReadButton = jsonParser.getValueAsBoolean();
                    return true;
                case "topicH5RedirectURL":
                    extra.topicH5RedirectURL = jsonParser.getValueAsString();
                    return true;
                case "explorePostBubble":
                    extra.explorePostBubble = (ExplorePostBubble) ExplorePostBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Extra extra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showPopWindow":
                case "defaultSyncMoment":
                case "showAudit":
                case "stateEmotion":
                case "bindPhone":
                case "stateGuide":
                case "momentMedia":
                case "defaultTab":
                case "stateWindow":
                case "feedDefaultPage":
                case "liveShowFollowButton":
                case "feedShowAccostButton":
                case "momentExposeConfig":
                case "activityShowReadButton":
                case "topicH5RedirectURL":
                case "explorePostBubble":
                    return true;
                default:
                    return super.parseFieldCheck(extra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Extra extra, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("bindPhone", extra.bindPhone);
            if (extra.momentMedia != null) {
                jsonGenerator.writeFieldName("momentMedia");
                MomentMedia.JSON_ADAPTER.serialize(extra.momentMedia, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("liveShowFollowButton", extra.liveShowFollowButton);
            jsonGenerator.writeBooleanField("feedShowAccostButton", extra.feedShowAccostButton);
            String str = extra.feedDefaultPage;
            if (str != null) {
                jsonGenerator.writeStringField("feedDefaultPage", str);
            }
            String str2 = extra.topicH5RedirectURL;
            if (str2 != null) {
                jsonGenerator.writeStringField("topicH5RedirectURL", str2);
            }
            jsonGenerator.writeBooleanField("showPopWindow", extra.showPopWindow);
            if (extra.showAudit != null) {
                jsonGenerator.writeFieldName("showAudit");
                ShowAudit.JSON_ADAPTER.serialize(extra.showAudit, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("defaultSyncMoment", extra.defaultSyncMoment);
            if (extra.stateEmotion != null) {
                jsonGenerator.writeFieldName("stateEmotion");
                JsonAdapter.serializeArray(extra.stateEmotion, jsonGenerator, StateEmotion.JSON_ADAPTER);
            }
            if (extra.stateGuide != null) {
                jsonGenerator.writeFieldName("stateGuide");
                StateGuide.JSON_ADAPTER.serialize(extra.stateGuide, jsonGenerator, true);
            }
            String str3 = extra.defaultTab;
            if (str3 != null) {
                jsonGenerator.writeStringField("defaultTab", str3);
            }
            jsonGenerator.writeBooleanField("activityShowReadButton", extra.activityShowReadButton);
            if (extra.explorePostBubble != null) {
                jsonGenerator.writeFieldName("explorePostBubble");
                ExplorePostBubble.JSON_ADAPTER.serialize(extra.explorePostBubble, jsonGenerator, true);
            }
            if (extra.stateWindow != null) {
                jsonGenerator.writeFieldName("stateWindow");
                StateWindow.JSON_ADAPTER.serialize(extra.stateWindow, jsonGenerator, true);
            }
            if (extra.momentExposeConfig != null) {
                jsonGenerator.writeFieldName("momentExposeConfig");
                MomentExposeConfig.JSON_ADAPTER.serialize(extra.momentExposeConfig, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Extra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Extra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Extra new_() {
        Extra extra = new Extra();
        extra.nullCheck();
        return extra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Extra m19484clone() {
        Extra extra = new Extra();
        extra.bindPhone = this.bindPhone;
        MomentMedia momentMedia = this.momentMedia;
        if (momentMedia != null) {
            extra.momentMedia = momentMedia.m19628clone();
        }
        extra.liveShowFollowButton = this.liveShowFollowButton;
        extra.feedShowAccostButton = this.feedShowAccostButton;
        extra.feedDefaultPage = this.feedDefaultPage;
        extra.topicH5RedirectURL = this.topicH5RedirectURL;
        extra.showPopWindow = this.showPopWindow;
        ShowAudit showAudit = this.showAudit;
        if (showAudit != null) {
            extra.showAudit = showAudit.m19752clone();
        }
        extra.defaultSyncMoment = this.defaultSyncMoment;
        List<StateEmotion> list = this.stateEmotion;
        if (list != null) {
            extra.stateEmotion = ValueObject.util_map(list, new w9j() { // from class: l.fqf
                public final Object call(Object obj) {
                    return ((StateEmotion) obj).m19758clone();
                }
            });
        }
        StateGuide stateGuide = this.stateGuide;
        if (stateGuide != null) {
            extra.stateGuide = stateGuide.m19761clone();
        }
        extra.defaultTab = this.defaultTab;
        extra.activityShowReadButton = this.activityShowReadButton;
        ExplorePostBubble explorePostBubble = this.explorePostBubble;
        if (explorePostBubble != null) {
            extra.explorePostBubble = explorePostBubble.m19481clone();
        }
        StateWindow stateWindow = this.stateWindow;
        if (stateWindow != null) {
            extra.stateWindow = stateWindow.m19773clone();
        }
        MomentExposeConfig momentExposeConfig = this.momentExposeConfig;
        if (momentExposeConfig != null) {
            extra.momentExposeConfig = momentExposeConfig.m19607clone();
        }
        return extra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return this.bindPhone == extra.bindPhone && ValueObject.util_equals(this.momentMedia, extra.momentMedia) && this.liveShowFollowButton == extra.liveShowFollowButton && this.feedShowAccostButton == extra.feedShowAccostButton && ValueObject.util_equals(this.feedDefaultPage, extra.feedDefaultPage) && ValueObject.util_equals(this.topicH5RedirectURL, extra.topicH5RedirectURL) && this.showPopWindow == extra.showPopWindow && ValueObject.util_equals(this.showAudit, extra.showAudit) && this.defaultSyncMoment == extra.defaultSyncMoment && ValueObject.util_equals(this.stateEmotion, extra.stateEmotion) && ValueObject.util_equals(this.stateGuide, extra.stateGuide) && ValueObject.util_equals(this.defaultTab, extra.defaultTab) && this.activityShowReadButton == extra.activityShowReadButton && ValueObject.util_equals(this.explorePostBubble, extra.explorePostBubble) && ValueObject.util_equals(this.stateWindow, extra.stateWindow) && ValueObject.util_equals(this.momentExposeConfig, extra.momentExposeConfig);
    }

    public String getClassParseName() {
        return "extra";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.bindPhone ? 1231 : 1237)) * 41;
        MomentMedia momentMedia = this.momentMedia;
        int iHashCode = (((((i2 + (momentMedia != null ? momentMedia.hashCode() : 0)) * 41) + (this.liveShowFollowButton ? 1231 : 1237)) * 41) + (this.feedShowAccostButton ? 1231 : 1237)) * 41;
        String str = this.feedDefaultPage;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.topicH5RedirectURL;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.showPopWindow ? 1231 : 1237)) * 41;
        ShowAudit showAudit = this.showAudit;
        int iHashCode4 = (((iHashCode3 + (showAudit != null ? showAudit.hashCode() : 0)) * 41) + (this.defaultSyncMoment ? 1231 : 1237)) * 41;
        List<StateEmotion> list = this.stateEmotion;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        StateGuide stateGuide = this.stateGuide;
        int iHashCode6 = (iHashCode5 + (stateGuide != null ? stateGuide.hashCode() : 0)) * 41;
        String str3 = this.defaultTab;
        int iHashCode7 = (((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.activityShowReadButton ? 1231 : 1237)) * 41;
        ExplorePostBubble explorePostBubble = this.explorePostBubble;
        int iHashCode8 = (iHashCode7 + (explorePostBubble != null ? explorePostBubble.hashCode() : 0)) * 41;
        StateWindow stateWindow = this.stateWindow;
        int iHashCode9 = (iHashCode8 + (stateWindow != null ? stateWindow.hashCode() : 0)) * 41;
        MomentExposeConfig momentExposeConfig = this.momentExposeConfig;
        int iHashCode10 = iHashCode9 + (momentExposeConfig != null ? momentExposeConfig.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.momentMedia == null) {
            this.momentMedia = MomentMedia.new_();
        }
        if (this.feedDefaultPage == null) {
            this.feedDefaultPage = "";
        }
        if (this.topicH5RedirectURL == null) {
            this.topicH5RedirectURL = "";
        }
        if (this.showAudit == null) {
            this.showAudit = ShowAudit.new_();
        }
        if (this.stateEmotion == null) {
            this.stateEmotion = new ArrayList();
        }
        if (this.stateGuide == null) {
            this.stateGuide = StateGuide.new_();
        }
        if (this.defaultTab == null) {
            this.defaultTab = "";
        }
        if (this.stateWindow == null) {
            this.stateWindow = StateWindow.new_();
        }
        if (this.momentExposeConfig == null) {
            this.momentExposeConfig = MomentExposeConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
