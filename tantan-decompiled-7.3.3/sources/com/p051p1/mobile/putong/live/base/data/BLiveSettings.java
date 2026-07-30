package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSettings extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSettings> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSettings>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSettings.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSettings newInstance() {
            return new BLiveSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveSettings bLiveSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2113025066:
                    if (str.equals("liveSquareExtTabs")) {
                        b = 0;
                    }
                    break;
                case -1767736222:
                    if (str.equals("tttLiveConfig")) {
                        b = 1;
                    }
                    break;
                case -1608486941:
                    if (str.equals("intlGameSquareUrl")) {
                        b = 2;
                    }
                    break;
                case -1130036065:
                    if (str.equals("wealthLogoNewIconConfigV2")) {
                        b = 3;
                    }
                    break;
                case -913479021:
                    if (str.equals("swipeVirtualVoiceCardConfig")) {
                        b = 4;
                    }
                    break;
                case -891817067:
                    if (str.equals("videoChatConfig")) {
                        b = 5;
                    }
                    break;
                case -849725108:
                    if (str.equals("swipeCardConfig")) {
                        b = 6;
                    }
                    break;
                case -840224833:
                    if (str.equals("expConfig")) {
                        b = 7;
                    }
                    break;
                case -782726733:
                    if (str.equals("sensitiveWords")) {
                        b = 8;
                    }
                    break;
                case -590623845:
                    if (str.equals("voiceLiveTemplates")) {
                        b = 9;
                    }
                    break;
                case -503025424:
                    if (str.equals("resourceConfig")) {
                        b = 10;
                    }
                    break;
                case -60657269:
                    if (str.equals("intlLiveConfig")) {
                        b = 11;
                    }
                    break;
                case -25288723:
                    if (str.equals("intlOctopusGameUrlPrefix")) {
                        b = 12;
                    }
                    break;
                case 111029642:
                    if (str.equals("predefineMessages")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 408010574:
                    if (str.equals("liveConfig")) {
                        b = 14;
                    }
                    break;
                case 445750979:
                    if (str.equals("wealthLogoNewIconConfig")) {
                        b = 15;
                    }
                    break;
                case 652385291:
                    if (str.equals("liveLabels")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1417110630:
                    if (str.equals("liveAble")) {
                        b = 17;
                    }
                    break;
                case 1437396656:
                    if (str.equals("chatTips")) {
                        b = 18;
                    }
                    break;
                case 1523941447:
                    if (str.equals("liveSquareTabs")) {
                        b = 19;
                    }
                    break;
                case 1656936747:
                    if (str.equals("liveSkinConfig")) {
                        b = 20;
                    }
                    break;
                case 1744098207:
                    if (str.equals("intlLiveTemplatesMetadata")) {
                        b = 21;
                    }
                    break;
                case 1964779040:
                    if (str.equals("voiceLiveConfig")) {
                        b = 22;
                    }
                    break;
                case 1981727545:
                    if (str.equals("templates")) {
                        b = 23;
                    }
                    break;
                case 2141299802:
                    if (str.equals("wealthLogoConfig")) {
                        b = 24;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveSettings.liveSquareExtTabs = JsonAdapter.parseArray(jsonParser, BLiveSquareTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveSettings.tttLiveConfig = LiveConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveSettings.intlGameSquareUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveSettings.wealthLogoNewIconConfigV2 = BLiveWealthLogoConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveSettings.swipeVirtualVoiceCardConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveSettings.videoChatConfig = BLiveVideoChatConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveSettings.swipeCardConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveSettings.expConfig = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case 8:
                    bLiveSettings.sensitiveWords = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveSettings.voiceLiveTemplates = BLiveVoiceVirtualTemplates.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveSettings.resourceConfig = BLiveResourceConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveSettings.intlLiveConfig = BLiveIntlLiveConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveSettings.intlOctopusGameUrlPrefix = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveSettings.predefineMessages = BLivePreDefineMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveSettings.liveConfig = BLiveConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveSettings.wealthLogoNewIconConfig = BLiveWealthLogoConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveSettings.liveLabels = JsonAdapter.parseArray(jsonParser, BLiveLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveSettings.liveAble = jsonParser.getValueAsBoolean();
                    return true;
                case 18:
                    bLiveSettings.chatTips = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveSettings.liveSquareTabs = JsonAdapter.parseArray(jsonParser, BLiveSquareTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveSettings.liveSkinConfig = BLiveSkinConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    bLiveSettings.intlLiveTemplatesMetadata = BLiveIntlLiveTemplatesCdnData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveSettings.voiceLiveConfig = BLiveVoiceLiveConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    bLiveSettings.templates = JsonAdapter.parseArray(jsonParser, BLiveTemplate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveSettings.wealthLogoConfig = BLiveWealthLogoConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSettings bLiveSettings, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSettings.liveConfig != null) {
                jsonGenerator.writeFieldName("liveConfig");
                BLiveConfig.JSON_ADAPTER.serialize(bLiveSettings.liveConfig, jsonGenerator, true);
            }
            if (bLiveSettings.templates != null) {
                jsonGenerator.writeFieldName("templates");
                JsonAdapter.serializeArray(bLiveSettings.templates, jsonGenerator, BLiveTemplate.JSON_ADAPTER);
            }
            if (bLiveSettings.predefineMessages != null) {
                jsonGenerator.writeFieldName("predefineMessages");
                BLivePreDefineMessages.JSON_ADAPTER.serialize(bLiveSettings.predefineMessages, jsonGenerator, true);
            }
            if (bLiveSettings.sensitiveWords != null) {
                jsonGenerator.writeFieldName("sensitiveWords");
                JsonAdapter.serializeArray(bLiveSettings.sensitiveWords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveSettings.liveLabels != null) {
                jsonGenerator.writeFieldName("liveLabels");
                JsonAdapter.serializeArray(bLiveSettings.liveLabels, jsonGenerator, BLiveLabel.JSON_ADAPTER);
            }
            if (bLiveSettings.liveSquareTabs != null) {
                jsonGenerator.writeFieldName("liveSquareTabs");
                JsonAdapter.serializeArray(bLiveSettings.liveSquareTabs, jsonGenerator, BLiveSquareTab.JSON_ADAPTER);
            }
            if (bLiveSettings.chatTips != null) {
                jsonGenerator.writeFieldName("chatTips");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveSettings.chatTips, jsonGenerator, true);
            }
            if (bLiveSettings.liveSquareExtTabs != null) {
                jsonGenerator.writeFieldName("liveSquareExtTabs");
                JsonAdapter.serializeArray(bLiveSettings.liveSquareExtTabs, jsonGenerator, BLiveSquareTab.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("liveAble", bLiveSettings.liveAble);
            if (bLiveSettings.voiceLiveConfig != null) {
                jsonGenerator.writeFieldName("voiceLiveConfig");
                BLiveVoiceLiveConfig.JSON_ADAPTER.serialize(bLiveSettings.voiceLiveConfig, jsonGenerator, true);
            }
            if (bLiveSettings.liveSkinConfig != null) {
                jsonGenerator.writeFieldName("liveSkinConfig");
                BLiveSkinConfig.JSON_ADAPTER.serialize(bLiveSettings.liveSkinConfig, jsonGenerator, true);
            }
            if (bLiveSettings.wealthLogoConfig != null) {
                jsonGenerator.writeFieldName("wealthLogoConfig");
                BLiveWealthLogoConfig.JSON_ADAPTER.serialize(bLiveSettings.wealthLogoConfig, jsonGenerator, true);
            }
            if (bLiveSettings.resourceConfig != null) {
                jsonGenerator.writeFieldName("resourceConfig");
                BLiveResourceConfig.JSON_ADAPTER.serialize(bLiveSettings.resourceConfig, jsonGenerator, true);
            }
            if (bLiveSettings.swipeCardConfig != null) {
                jsonGenerator.writeFieldName("swipeCardConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveSettings.swipeCardConfig, jsonGenerator, true);
            }
            if (bLiveSettings.voiceLiveTemplates != null) {
                jsonGenerator.writeFieldName("voiceLiveTemplates");
                BLiveVoiceVirtualTemplates.JSON_ADAPTER.serialize(bLiveSettings.voiceLiveTemplates, jsonGenerator, true);
            }
            if (bLiveSettings.swipeVirtualVoiceCardConfig != null) {
                jsonGenerator.writeFieldName("swipeVirtualVoiceCardConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveSettings.swipeVirtualVoiceCardConfig, jsonGenerator, true);
            }
            if (bLiveSettings.wealthLogoNewIconConfig != null) {
                jsonGenerator.writeFieldName("wealthLogoNewIconConfig");
                BLiveWealthLogoConfig.JSON_ADAPTER.serialize(bLiveSettings.wealthLogoNewIconConfig, jsonGenerator, true);
            }
            if (bLiveSettings.wealthLogoNewIconConfigV2 != null) {
                jsonGenerator.writeFieldName("wealthLogoNewIconConfigV2");
                BLiveWealthLogoConfig.JSON_ADAPTER.serialize(bLiveSettings.wealthLogoNewIconConfigV2, jsonGenerator, true);
            }
            if (bLiveSettings.expConfig != null) {
                jsonGenerator.writeFieldName("expConfig");
                JsonAdapter.serializeMap(bLiveSettings.expConfig, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveSettings.intlLiveTemplatesMetadata != null) {
                jsonGenerator.writeFieldName("intlLiveTemplatesMetadata");
                BLiveIntlLiveTemplatesCdnData.JSON_ADAPTER.serialize(bLiveSettings.intlLiveTemplatesMetadata, jsonGenerator, true);
            }
            if (bLiveSettings.intlLiveConfig != null) {
                jsonGenerator.writeFieldName("intlLiveConfig");
                BLiveIntlLiveConfig.JSON_ADAPTER.serialize(bLiveSettings.intlLiveConfig, jsonGenerator, true);
            }
            if (bLiveSettings.videoChatConfig != null) {
                jsonGenerator.writeFieldName("videoChatConfig");
                BLiveVideoChatConfig.JSON_ADAPTER.serialize(bLiveSettings.videoChatConfig, jsonGenerator, true);
            }
            String str = bLiveSettings.intlOctopusGameUrlPrefix;
            if (str != null) {
                jsonGenerator.writeStringField("intlOctopusGameUrlPrefix", str);
            }
            String str2 = bLiveSettings.intlGameSquareUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("intlGameSquareUrl", str2);
            }
            if (bLiveSettings.tttLiveConfig != null) {
                jsonGenerator.writeFieldName("tttLiveConfig");
                LiveConfig.JSON_ADAPTER.serialize(bLiveSettings.tttLiveConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesettings";

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveCommonConfig chatTips;

    @Nullable
    @ProtobufIndex(index = 19)
    public Map<String, String> expConfig;

    @NonNull
    @ProtobufIndex(index = 24)
    public String intlGameSquareUrl;

    @Nullable
    @ProtobufIndex(index = 21)
    public BLiveIntlLiveConfig intlLiveConfig;

    @Nullable
    @ProtobufIndex(index = 20)
    public BLiveIntlLiveTemplatesCdnData intlLiveTemplatesMetadata;

    @NonNull
    @ProtobufIndex(index = 23)
    public String intlOctopusGameUrlPrefix;

    @ProtobufIndex(index = 9)
    public boolean liveAble;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveConfig liveConfig;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveLabel> liveLabels;

    @Nullable
    @ProtobufIndex(index = 11)
    public BLiveSkinConfig liveSkinConfig;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveSquareTab> liveSquareExtTabs;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveSquareTab> liveSquareTabs;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePreDefineMessages predefineMessages;

    @Nullable
    @ProtobufIndex(index = 13)
    public BLiveResourceConfig resourceConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> sensitiveWords;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveCommonConfig swipeCardConfig;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveCommonConfig swipeVirtualVoiceCardConfig;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveTemplate> templates;

    @Nullable
    @ProtobufIndex(index = 25)
    public LiveConfig tttLiveConfig;

    @Nullable
    @ProtobufIndex(index = 22)
    public BLiveVideoChatConfig videoChatConfig;

    @Nullable
    @ProtobufIndex(index = 10)
    public BLiveVoiceLiveConfig voiceLiveConfig;

    @Nullable
    @ProtobufIndex(index = 15)
    public BLiveVoiceVirtualTemplates voiceLiveTemplates;

    @Nullable
    @ProtobufIndex(index = 12)
    public BLiveWealthLogoConfig wealthLogoConfig;

    @Nullable
    @ProtobufIndex(index = 17)
    public BLiveWealthLogoConfig wealthLogoNewIconConfig;

    @Nullable
    @ProtobufIndex(index = 18)
    public BLiveWealthLogoConfig wealthLogoNewIconConfigV2;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m69399c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m69402f(String str) {
        return str;
    }

    public static BLiveSettings new_() {
        BLiveSettings bLiveSettings = new BLiveSettings();
        bLiveSettings.nullCheck();
        return bLiveSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSettings mo225055clone() {
        BLiveSettings bLiveSettings = new BLiveSettings();
        BLiveConfig bLiveConfig = this.liveConfig;
        if (bLiveConfig != null) {
            bLiveSettings.liveConfig = bLiveConfig.mo225055clone();
        }
        List<BLiveTemplate> list = this.templates;
        if (list != null) {
            bLiveSettings.templates = ValueObject.util_map(list, new qcj() { // from class: l.q52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTemplate) obj).mo225055clone();
                }
            });
        }
        BLivePreDefineMessages bLivePreDefineMessages = this.predefineMessages;
        if (bLivePreDefineMessages != null) {
            bLiveSettings.predefineMessages = bLivePreDefineMessages.mo225055clone();
        }
        List<String> list2 = this.sensitiveWords;
        if (list2 != null) {
            bLiveSettings.sensitiveWords = ValueObject.util_map(list2, new qcj() { // from class: l.r52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSettings.m69399c((String) obj);
                }
            });
        }
        List<BLiveLabel> list3 = this.liveLabels;
        if (list3 != null) {
            bLiveSettings.liveLabels = ValueObject.util_map(list3, new qcj() { // from class: l.s52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLabel) obj).mo225055clone();
                }
            });
        }
        List<BLiveSquareTab> list4 = this.liveSquareTabs;
        if (list4 != null) {
            bLiveSettings.liveSquareTabs = ValueObject.util_map(list4, new qcj() { // from class: l.t52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSquareTab) obj).mo225055clone();
                }
            });
        }
        BLiveCommonConfig bLiveCommonConfig = this.chatTips;
        if (bLiveCommonConfig != null) {
            bLiveSettings.chatTips = bLiveCommonConfig.mo225055clone();
        }
        List<BLiveSquareTab> list5 = this.liveSquareExtTabs;
        if (list5 != null) {
            bLiveSettings.liveSquareExtTabs = ValueObject.util_map(list5, new qcj() { // from class: l.u52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSquareTab) obj).mo225055clone();
                }
            });
        }
        bLiveSettings.liveAble = this.liveAble;
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = this.voiceLiveConfig;
        if (bLiveVoiceLiveConfig != null) {
            bLiveSettings.voiceLiveConfig = bLiveVoiceLiveConfig.mo225055clone();
        }
        BLiveSkinConfig bLiveSkinConfig = this.liveSkinConfig;
        if (bLiveSkinConfig != null) {
            bLiveSettings.liveSkinConfig = bLiveSkinConfig.mo225055clone();
        }
        BLiveWealthLogoConfig bLiveWealthLogoConfig = this.wealthLogoConfig;
        if (bLiveWealthLogoConfig != null) {
            bLiveSettings.wealthLogoConfig = bLiveWealthLogoConfig.mo225055clone();
        }
        BLiveResourceConfig bLiveResourceConfig = this.resourceConfig;
        if (bLiveResourceConfig != null) {
            bLiveSettings.resourceConfig = bLiveResourceConfig.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig2 = this.swipeCardConfig;
        if (bLiveCommonConfig2 != null) {
            bLiveSettings.swipeCardConfig = bLiveCommonConfig2.mo225055clone();
        }
        BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates = this.voiceLiveTemplates;
        if (bLiveVoiceVirtualTemplates != null) {
            bLiveSettings.voiceLiveTemplates = bLiveVoiceVirtualTemplates.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig3 = this.swipeVirtualVoiceCardConfig;
        if (bLiveCommonConfig3 != null) {
            bLiveSettings.swipeVirtualVoiceCardConfig = bLiveCommonConfig3.mo225055clone();
        }
        BLiveWealthLogoConfig bLiveWealthLogoConfig2 = this.wealthLogoNewIconConfig;
        if (bLiveWealthLogoConfig2 != null) {
            bLiveSettings.wealthLogoNewIconConfig = bLiveWealthLogoConfig2.mo225055clone();
        }
        BLiveWealthLogoConfig bLiveWealthLogoConfig3 = this.wealthLogoNewIconConfigV2;
        if (bLiveWealthLogoConfig3 != null) {
            bLiveSettings.wealthLogoNewIconConfigV2 = bLiveWealthLogoConfig3.mo225055clone();
        }
        Map<String, String> map = this.expConfig;
        if (map != null) {
            bLiveSettings.expConfig = ValueObject.util_map(map, new qcj() { // from class: l.v52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSettings.m69402f((String) obj);
                }
            });
        }
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData = this.intlLiveTemplatesMetadata;
        if (bLiveIntlLiveTemplatesCdnData != null) {
            bLiveSettings.intlLiveTemplatesMetadata = bLiveIntlLiveTemplatesCdnData.mo225055clone();
        }
        BLiveIntlLiveConfig bLiveIntlLiveConfig = this.intlLiveConfig;
        if (bLiveIntlLiveConfig != null) {
            bLiveSettings.intlLiveConfig = bLiveIntlLiveConfig.mo225055clone();
        }
        BLiveVideoChatConfig bLiveVideoChatConfig = this.videoChatConfig;
        if (bLiveVideoChatConfig != null) {
            bLiveSettings.videoChatConfig = bLiveVideoChatConfig.mo225055clone();
        }
        bLiveSettings.intlOctopusGameUrlPrefix = this.intlOctopusGameUrlPrefix;
        bLiveSettings.intlGameSquareUrl = this.intlGameSquareUrl;
        LiveConfig liveConfig = this.tttLiveConfig;
        if (liveConfig != null) {
            bLiveSettings.tttLiveConfig = liveConfig.mo225055clone();
        }
        return bLiveSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSettings)) {
            return false;
        }
        BLiveSettings bLiveSettings = (BLiveSettings) obj;
        return ValueObject.util_equals(this.liveConfig, bLiveSettings.liveConfig) && ValueObject.util_equals(this.templates, bLiveSettings.templates) && ValueObject.util_equals(this.predefineMessages, bLiveSettings.predefineMessages) && ValueObject.util_equals(this.sensitiveWords, bLiveSettings.sensitiveWords) && ValueObject.util_equals(this.liveLabels, bLiveSettings.liveLabels) && ValueObject.util_equals(this.liveSquareTabs, bLiveSettings.liveSquareTabs) && ValueObject.util_equals(this.chatTips, bLiveSettings.chatTips) && ValueObject.util_equals(this.liveSquareExtTabs, bLiveSettings.liveSquareExtTabs) && this.liveAble == bLiveSettings.liveAble && ValueObject.util_equals(this.voiceLiveConfig, bLiveSettings.voiceLiveConfig) && ValueObject.util_equals(this.liveSkinConfig, bLiveSettings.liveSkinConfig) && ValueObject.util_equals(this.wealthLogoConfig, bLiveSettings.wealthLogoConfig) && ValueObject.util_equals(this.resourceConfig, bLiveSettings.resourceConfig) && ValueObject.util_equals(this.swipeCardConfig, bLiveSettings.swipeCardConfig) && ValueObject.util_equals(this.voiceLiveTemplates, bLiveSettings.voiceLiveTemplates) && ValueObject.util_equals(this.swipeVirtualVoiceCardConfig, bLiveSettings.swipeVirtualVoiceCardConfig) && ValueObject.util_equals(this.wealthLogoNewIconConfig, bLiveSettings.wealthLogoNewIconConfig) && ValueObject.util_equals(this.wealthLogoNewIconConfigV2, bLiveSettings.wealthLogoNewIconConfigV2) && ValueObject.util_equals(this.expConfig, bLiveSettings.expConfig) && ValueObject.util_equals(this.intlLiveTemplatesMetadata, bLiveSettings.intlLiveTemplatesMetadata) && ValueObject.util_equals(this.intlLiveConfig, bLiveSettings.intlLiveConfig) && ValueObject.util_equals(this.videoChatConfig, bLiveSettings.videoChatConfig) && ValueObject.util_equals(this.intlOctopusGameUrlPrefix, bLiveSettings.intlOctopusGameUrlPrefix) && ValueObject.util_equals(this.intlGameSquareUrl, bLiveSettings.intlGameSquareUrl) && ValueObject.util_equals(this.tttLiveConfig, bLiveSettings.tttLiveConfig);
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
        BLiveConfig bLiveConfig = this.liveConfig;
        int iHashCode = (i2 + (bLiveConfig != null ? bLiveConfig.hashCode() : 0)) * 41;
        List<BLiveTemplate> list = this.templates;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        BLivePreDefineMessages bLivePreDefineMessages = this.predefineMessages;
        int iHashCode3 = (iHashCode2 + (bLivePreDefineMessages != null ? bLivePreDefineMessages.hashCode() : 0)) * 41;
        List<String> list2 = this.sensitiveWords;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveLabel> list3 = this.liveLabels;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<BLiveSquareTab> list4 = this.liveSquareTabs;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig = this.chatTips;
        int iHashCode7 = (iHashCode6 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0)) * 41;
        List<BLiveSquareTab> list5 = this.liveSquareExtTabs;
        int iHashCode8 = (((iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 41) + (this.liveAble ? 1231 : 1237)) * 41;
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = this.voiceLiveConfig;
        int iHashCode9 = (iHashCode8 + (bLiveVoiceLiveConfig != null ? bLiveVoiceLiveConfig.hashCode() : 0)) * 41;
        BLiveSkinConfig bLiveSkinConfig = this.liveSkinConfig;
        int iHashCode10 = (iHashCode9 + (bLiveSkinConfig != null ? bLiveSkinConfig.hashCode() : 0)) * 41;
        BLiveWealthLogoConfig bLiveWealthLogoConfig = this.wealthLogoConfig;
        int iHashCode11 = (iHashCode10 + (bLiveWealthLogoConfig != null ? bLiveWealthLogoConfig.hashCode() : 0)) * 41;
        BLiveResourceConfig bLiveResourceConfig = this.resourceConfig;
        int iHashCode12 = (iHashCode11 + (bLiveResourceConfig != null ? bLiveResourceConfig.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig2 = this.swipeCardConfig;
        int iHashCode13 = (iHashCode12 + (bLiveCommonConfig2 != null ? bLiveCommonConfig2.hashCode() : 0)) * 41;
        BLiveVoiceVirtualTemplates bLiveVoiceVirtualTemplates = this.voiceLiveTemplates;
        int iHashCode14 = (iHashCode13 + (bLiveVoiceVirtualTemplates != null ? bLiveVoiceVirtualTemplates.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig3 = this.swipeVirtualVoiceCardConfig;
        int iHashCode15 = (iHashCode14 + (bLiveCommonConfig3 != null ? bLiveCommonConfig3.hashCode() : 0)) * 41;
        BLiveWealthLogoConfig bLiveWealthLogoConfig2 = this.wealthLogoNewIconConfig;
        int iHashCode16 = (iHashCode15 + (bLiveWealthLogoConfig2 != null ? bLiveWealthLogoConfig2.hashCode() : 0)) * 41;
        BLiveWealthLogoConfig bLiveWealthLogoConfig3 = this.wealthLogoNewIconConfigV2;
        int iHashCode17 = (iHashCode16 + (bLiveWealthLogoConfig3 != null ? bLiveWealthLogoConfig3.hashCode() : 0)) * 41;
        Map<String, String> map = this.expConfig;
        int iHashCode18 = (iHashCode17 + (map != null ? map.hashCode() : 0)) * 41;
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData = this.intlLiveTemplatesMetadata;
        int iHashCode19 = (iHashCode18 + (bLiveIntlLiveTemplatesCdnData != null ? bLiveIntlLiveTemplatesCdnData.hashCode() : 0)) * 41;
        BLiveIntlLiveConfig bLiveIntlLiveConfig = this.intlLiveConfig;
        int iHashCode20 = (iHashCode19 + (bLiveIntlLiveConfig != null ? bLiveIntlLiveConfig.hashCode() : 0)) * 41;
        BLiveVideoChatConfig bLiveVideoChatConfig = this.videoChatConfig;
        int iHashCode21 = (iHashCode20 + (bLiveVideoChatConfig != null ? bLiveVideoChatConfig.hashCode() : 0)) * 41;
        String str = this.intlOctopusGameUrlPrefix;
        int iHashCode22 = (iHashCode21 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.intlGameSquareUrl;
        int iHashCode23 = (iHashCode22 + (str2 != null ? str2.hashCode() : 0)) * 41;
        LiveConfig liveConfig = this.tttLiveConfig;
        int iHashCode24 = iHashCode23 + (liveConfig != null ? liveConfig.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.predefineMessages == null) {
            this.predefineMessages = BLivePreDefineMessages.new_();
        }
        if (this.sensitiveWords == null) {
            this.sensitiveWords = new ArrayList();
        }
        if (this.liveLabels == null) {
            this.liveLabels = new ArrayList();
        }
        if (this.liveSquareTabs == null) {
            this.liveSquareTabs = new ArrayList();
        }
        if (this.chatTips == null) {
            this.chatTips = BLiveCommonConfig.new_();
        }
        if (this.liveSquareExtTabs == null) {
            this.liveSquareExtTabs = new ArrayList();
        }
        if (this.swipeCardConfig == null) {
            this.swipeCardConfig = BLiveCommonConfig.new_();
        }
        if (this.swipeVirtualVoiceCardConfig == null) {
            this.swipeVirtualVoiceCardConfig = BLiveCommonConfig.new_();
        }
        if (this.intlOctopusGameUrlPrefix == null) {
            this.intlOctopusGameUrlPrefix = "";
        }
        if (this.intlGameSquareUrl == null) {
            this.intlGameSquareUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
