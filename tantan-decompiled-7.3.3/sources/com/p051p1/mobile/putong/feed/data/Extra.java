package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
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
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Extra extra) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, extra.bindPhone);
            MomentMedia momentMedia = extra.momentMedia;
            if (momentMedia != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, momentMedia, MomentMedia.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(3, extra.liveShowFollowButton) + CodedOutputByteBufferNano.m17275b(4, extra.feedShowAccostButton);
            String str = extra.feedDefaultPage;
            if (str != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(5, str);
            }
            String str2 = extra.topicH5RedirectURL;
            if (str2 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(6, str2);
            }
            int iM17275b3 = iM17275b2 + CodedOutputByteBufferNano.m17275b(7, extra.showPopWindow);
            ShowAudit showAudit = extra.showAudit;
            if (showAudit != null) {
                iM17275b3 += CodedOutputByteBufferNano.m17285l(8, showAudit, ShowAudit.PROTOBUF_ADAPTER);
            }
            int iM17275b4 = iM17275b3 + CodedOutputByteBufferNano.m17275b(9, extra.defaultSyncMoment);
            List<StateEmotion> list = extra.stateEmotion;
            if (list != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(10, list, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StateGuide stateGuide = extra.stateGuide;
            if (stateGuide != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17285l(11, stateGuide, StateGuide.PROTOBUF_ADAPTER);
            }
            String str3 = extra.defaultTab;
            if (str3 != null) {
                iM17275b4 += CodedOutputByteBufferNano.m17288o(12, str3);
            }
            int iM17275b5 = iM17275b4 + CodedOutputByteBufferNano.m17275b(13, extra.activityShowReadButton);
            ExplorePostBubble explorePostBubble = extra.explorePostBubble;
            if (explorePostBubble != null) {
                iM17275b5 += CodedOutputByteBufferNano.m17285l(14, explorePostBubble, ExplorePostBubble.PROTOBUF_ADAPTER);
            }
            StateWindow stateWindow = extra.stateWindow;
            if (stateWindow != null) {
                iM17275b5 += CodedOutputByteBufferNano.m17285l(15, stateWindow, StateWindow.PROTOBUF_ADAPTER);
            }
            MomentExposeConfig momentExposeConfig = extra.momentExposeConfig;
            if (momentExposeConfig != null) {
                iM17275b5 += CodedOutputByteBufferNano.m17285l(16, momentExposeConfig, MomentExposeConfig.PROTOBUF_ADAPTER);
            }
            extra.cachedSize = iM17275b5;
            return iM17275b5;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Extra parse(nc5 nc5Var) throws IOException {
            Extra extra = new Extra();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        extra.bindPhone = nc5Var.m162483g();
                        continue;
                    case 18:
                        extra.momentMedia = (MomentMedia) nc5Var.m162488l(MomentMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 24:
                        extra.liveShowFollowButton = nc5Var.m162483g();
                        continue;
                    case 32:
                        extra.feedShowAccostButton = nc5Var.m162483g();
                        continue;
                    case 42:
                        extra.feedDefaultPage = nc5Var.m162495s();
                        continue;
                    case 50:
                        extra.topicH5RedirectURL = nc5Var.m162495s();
                        continue;
                    case 56:
                        extra.showPopWindow = nc5Var.m162483g();
                        continue;
                    case 66:
                        extra.showAudit = (ShowAudit) nc5Var.m162488l(ShowAudit.PROTOBUF_ADAPTER);
                        continue;
                    case 72:
                        extra.defaultSyncMoment = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        extra.stateEmotion = (List) nc5Var.m162488l(StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        extra.stateGuide = (StateGuide) nc5Var.m162488l(StateGuide.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        extra.defaultTab = nc5Var.m162495s();
                        continue;
                    case 104:
                        extra.activityShowReadButton = nc5Var.m162483g();
                        continue;
                    case 114:
                        extra.explorePostBubble = (ExplorePostBubble) nc5Var.m162488l(ExplorePostBubble.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        extra.stateWindow = (StateWindow) nc5Var.m162488l(StateWindow.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        extra.momentExposeConfig = (MomentExposeConfig) nc5Var.m162488l(MomentExposeConfig.PROTOBUF_ADAPTER);
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Extra extra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, extra.bindPhone);
            MomentMedia momentMedia = extra.momentMedia;
            if (momentMedia != null) {
                codedOutputByteBufferNano.m17309K(2, momentMedia, MomentMedia.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(3, extra.liveShowFollowButton);
            codedOutputByteBufferNano.m17299A(4, extra.feedShowAccostButton);
            String str = extra.feedDefaultPage;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(5, str);
            }
            String str2 = extra.topicH5RedirectURL;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(6, str2);
            }
            codedOutputByteBufferNano.m17299A(7, extra.showPopWindow);
            ShowAudit showAudit = extra.showAudit;
            if (showAudit != null) {
                codedOutputByteBufferNano.m17309K(8, showAudit, ShowAudit.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(9, extra.defaultSyncMoment);
            List<StateEmotion> list = extra.stateEmotion;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(10, list, StateEmotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            StateGuide stateGuide = extra.stateGuide;
            if (stateGuide != null) {
                codedOutputByteBufferNano.m17309K(11, stateGuide, StateGuide.PROTOBUF_ADAPTER);
            }
            String str3 = extra.defaultTab;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(12, str3);
            }
            codedOutputByteBufferNano.m17299A(13, extra.activityShowReadButton);
            ExplorePostBubble explorePostBubble = extra.explorePostBubble;
            if (explorePostBubble != null) {
                codedOutputByteBufferNano.m17309K(14, explorePostBubble, ExplorePostBubble.PROTOBUF_ADAPTER);
            }
            StateWindow stateWindow = extra.stateWindow;
            if (stateWindow != null) {
                codedOutputByteBufferNano.m17309K(15, stateWindow, StateWindow.PROTOBUF_ADAPTER);
            }
            MomentExposeConfig momentExposeConfig = extra.momentExposeConfig;
            if (momentExposeConfig != null) {
                codedOutputByteBufferNano.m17309K(16, momentExposeConfig, MomentExposeConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Extra> JSON_ADAPTER = new ObjectJsonAdapter<Extra>() { // from class: com.p1.mobile.putong.feed.data.Extra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Extra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Extra newInstance() {
            return new Extra();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Extra extra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2122052828:
                    if (str.equals("showPopWindow")) {
                        b = 0;
                    }
                    break;
                case -2055701092:
                    if (str.equals("defaultSyncMoment")) {
                        b = 1;
                    }
                    break;
                case -1931008290:
                    if (str.equals("showAudit")) {
                        b = 2;
                    }
                    break;
                case -1451499894:
                    if (str.equals("stateEmotion")) {
                        b = 3;
                    }
                    break;
                case -944224463:
                    if (str.equals("bindPhone")) {
                        b = 4;
                    }
                    break;
                case -249710357:
                    if (str.equals("stateGuide")) {
                        b = 5;
                    }
                    break;
                case -209830460:
                    if (str.equals("momentMedia")) {
                        b = 6;
                    }
                    break;
                case 678641044:
                    if (str.equals("defaultTab")) {
                        b = 7;
                    }
                    break;
                case 1296047073:
                    if (str.equals("stateWindow")) {
                        b = 8;
                    }
                    break;
                case 1314871282:
                    if (str.equals("feedDefaultPage")) {
                        b = 9;
                    }
                    break;
                case 1366441708:
                    if (str.equals("liveShowFollowButton")) {
                        b = 10;
                    }
                    break;
                case 1417513052:
                    if (str.equals("feedShowAccostButton")) {
                        b = 11;
                    }
                    break;
                case 1419802182:
                    if (str.equals("momentExposeConfig")) {
                        b = 12;
                    }
                    break;
                case 1883831348:
                    if (str.equals("activityShowReadButton")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1959920631:
                    if (str.equals("topicH5RedirectURL")) {
                        b = 14;
                    }
                    break;
                case 2037529663:
                    if (str.equals("explorePostBubble")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    extra.showPopWindow = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    extra.defaultSyncMoment = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    extra.showAudit = ShowAudit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    extra.stateEmotion = JsonAdapter.parseArray(jsonParser, StateEmotion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    extra.bindPhone = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    extra.stateGuide = StateGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    extra.momentMedia = MomentMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    extra.defaultTab = jsonParser.getValueAsString();
                    return true;
                case 8:
                    extra.stateWindow = StateWindow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    extra.feedDefaultPage = jsonParser.getValueAsString();
                    return true;
                case 10:
                    extra.liveShowFollowButton = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    extra.feedShowAccostButton = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    extra.momentExposeConfig = MomentExposeConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    extra.activityShowReadButton = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    extra.topicH5RedirectURL = jsonParser.getValueAsString();
                    return true;
                case 15:
                    extra.explorePostBubble = ExplorePostBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Extra extra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2122052828:
                    if (str.equals("showPopWindow")) {
                        b = 0;
                    }
                    break;
                case -2055701092:
                    if (str.equals("defaultSyncMoment")) {
                        b = 1;
                    }
                    break;
                case -1931008290:
                    if (str.equals("showAudit")) {
                        b = 2;
                    }
                    break;
                case -1451499894:
                    if (str.equals("stateEmotion")) {
                        b = 3;
                    }
                    break;
                case -944224463:
                    if (str.equals("bindPhone")) {
                        b = 4;
                    }
                    break;
                case -249710357:
                    if (str.equals("stateGuide")) {
                        b = 5;
                    }
                    break;
                case -209830460:
                    if (str.equals("momentMedia")) {
                        b = 6;
                    }
                    break;
                case 678641044:
                    if (str.equals("defaultTab")) {
                        b = 7;
                    }
                    break;
                case 1296047073:
                    if (str.equals("stateWindow")) {
                        b = 8;
                    }
                    break;
                case 1314871282:
                    if (str.equals("feedDefaultPage")) {
                        b = 9;
                    }
                    break;
                case 1366441708:
                    if (str.equals("liveShowFollowButton")) {
                        b = 10;
                    }
                    break;
                case 1417513052:
                    if (str.equals("feedShowAccostButton")) {
                        b = 11;
                    }
                    break;
                case 1419802182:
                    if (str.equals("momentExposeConfig")) {
                        b = 12;
                    }
                    break;
                case 1883831348:
                    if (str.equals("activityShowReadButton")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1959920631:
                    if (str.equals("topicH5RedirectURL")) {
                        b = 14;
                    }
                    break;
                case 2037529663:
                    if (str.equals("explorePostBubble")) {
                        b = 15;
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
                default:
                    return super.parseFieldCheck(extra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Extra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Extra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Extra new_() {
        Extra extra = new Extra();
        extra.nullCheck();
        return extra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Extra mo225055clone() {
        Extra extra = new Extra();
        extra.bindPhone = this.bindPhone;
        MomentMedia momentMedia = this.momentMedia;
        if (momentMedia != null) {
            extra.momentMedia = momentMedia.mo225055clone();
        }
        extra.liveShowFollowButton = this.liveShowFollowButton;
        extra.feedShowAccostButton = this.feedShowAccostButton;
        extra.feedDefaultPage = this.feedDefaultPage;
        extra.topicH5RedirectURL = this.topicH5RedirectURL;
        extra.showPopWindow = this.showPopWindow;
        ShowAudit showAudit = this.showAudit;
        if (showAudit != null) {
            extra.showAudit = showAudit.mo225055clone();
        }
        extra.defaultSyncMoment = this.defaultSyncMoment;
        List<StateEmotion> list = this.stateEmotion;
        if (list != null) {
            extra.stateEmotion = ValueObject.util_map(list, new qcj() { // from class: l.mrf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((StateEmotion) obj).mo225055clone();
                }
            });
        }
        StateGuide stateGuide = this.stateGuide;
        if (stateGuide != null) {
            extra.stateGuide = stateGuide.mo225055clone();
        }
        extra.defaultTab = this.defaultTab;
        extra.activityShowReadButton = this.activityShowReadButton;
        ExplorePostBubble explorePostBubble = this.explorePostBubble;
        if (explorePostBubble != null) {
            extra.explorePostBubble = explorePostBubble.mo225055clone();
        }
        StateWindow stateWindow = this.stateWindow;
        if (stateWindow != null) {
            extra.stateWindow = stateWindow.mo225055clone();
        }
        MomentExposeConfig momentExposeConfig = this.momentExposeConfig;
        if (momentExposeConfig != null) {
            extra.momentExposeConfig = momentExposeConfig.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "extra";
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
