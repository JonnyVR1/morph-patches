package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AwakeApp;
import com.p000p1.mobile.putong.data.CommonAssetsSettings;
import com.p000p1.mobile.putong.data.EmojiType;
import com.p000p1.mobile.putong.data.LetterContent;
import com.p000p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class CommonAssetsSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commonassetssettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public NCTAndroidBatch_ NCTAndroidBatch;

    @ProtobufIndex(index = 8)
    public boolean androidAudioExt;

    @Nullable
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public List<String> androidUrlHostTokenWhitelist;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<EmojiType> emoji;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<Integer> enableAgc;

    @Nullable
    @ProtobufIndex(index = 11)
    public List<Integer> enableHighLegibility;

    @ProtobufIndex(index = 15)
    public boolean enableNetReport;

    @ProtobufIndex(index = 10)
    public boolean enableTTPlayer;

    @ProtobufIndex(index = 14)
    public boolean httpDns;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<LetterContent> letterContents;

    @ProtobufIndex(index = 5)
    public boolean limitEighteenBelowSignup;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<PrivateQuestionSuggestCardHideRate> privateQuestionSuggestCardHideRate;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AwakeApp> pullAlive;

    @NonNull
    @ProtobufIndex(index = 2)
    public RecommendPrefetch recommendPrefetch;

    @ProtobufIndex(index = 7)
    public boolean sendOneSuperlikeActivitySwitch;

    @NonNull
    @ProtobufIndex(index = 6)
    @Deprecated
    public TtpointDialog ttpointDialog;
    public static ProtobufAdapter<CommonAssetsSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonAssetsSettings>() { // from class: com.p1.mobile.putong.data.CommonAssetsSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommonAssetsSettings commonAssetsSettings) {
            NCTAndroidBatch_ nCTAndroidBatch_ = commonAssetsSettings.NCTAndroidBatch;
            int iL = nCTAndroidBatch_ != null ? CodedOutputByteBufferNano.l(1, nCTAndroidBatch_, NCTAndroidBatch_.PROTOBUF_ADAPTER) : 0;
            RecommendPrefetch recommendPrefetch = commonAssetsSettings.recommendPrefetch;
            if (recommendPrefetch != null) {
                iL += CodedOutputByteBufferNano.l(2, recommendPrefetch, RecommendPrefetch.PROTOBUF_ADAPTER);
            }
            List<AwakeApp> list = commonAssetsSettings.pullAlive;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(3, list, AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateQuestionSuggestCardHideRate> list2 = commonAssetsSettings.privateQuestionSuggestCardHideRate;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(4, list2, PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iL + CodedOutputByteBufferNano.b(5, commonAssetsSettings.limitEighteenBelowSignup);
            TtpointDialog ttpointDialog = commonAssetsSettings.ttpointDialog;
            if (ttpointDialog != null) {
                iB += CodedOutputByteBufferNano.l(6, ttpointDialog, TtpointDialog.PROTOBUF_ADAPTER);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(7, commonAssetsSettings.sendOneSuperlikeActivitySwitch) + CodedOutputByteBufferNano.b(8, commonAssetsSettings.androidAudioExt);
            List<LetterContent> list3 = commonAssetsSettings.letterContents;
            if (list3 != null) {
                iB2 += CodedOutputByteBufferNano.l(9, list3, LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(10, commonAssetsSettings.enableTTPlayer);
            List<Integer> list4 = commonAssetsSettings.enableHighLegibility;
            if (list4 != null) {
                iB3 += CodedOutputByteBufferNano.l(11, list4, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list5 = commonAssetsSettings.enableAgc;
            if (list5 != null) {
                iB3 += CodedOutputByteBufferNano.l(12, list5, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<EmojiType> list6 = commonAssetsSettings.emoji;
            if (list6 != null) {
                iB3 += CodedOutputByteBufferNano.l(13, list6, EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB4 = iB3 + CodedOutputByteBufferNano.b(14, commonAssetsSettings.httpDns) + CodedOutputByteBufferNano.b(15, commonAssetsSettings.enableNetReport);
            List<String> list7 = commonAssetsSettings.androidUrlHostTokenWhitelist;
            if (list7 != null) {
                iB4 += CodedOutputByteBufferNano.l(16, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) commonAssetsSettings).cachedSize = iB4;
            return iB4;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommonAssetsSettings m17826parse(nb5 nb5Var) throws IOException {
            CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (commonAssetsSettings.NCTAndroidBatch == null) {
                            commonAssetsSettings.NCTAndroidBatch = NCTAndroidBatch_.new_();
                        }
                        if (commonAssetsSettings.recommendPrefetch == null) {
                            commonAssetsSettings.recommendPrefetch = RecommendPrefetch.new_();
                        }
                        if (commonAssetsSettings.pullAlive == null) {
                            commonAssetsSettings.pullAlive = new ArrayList();
                        }
                        if (commonAssetsSettings.privateQuestionSuggestCardHideRate == null) {
                            commonAssetsSettings.privateQuestionSuggestCardHideRate = new ArrayList();
                        }
                        if (commonAssetsSettings.ttpointDialog == null) {
                            commonAssetsSettings.ttpointDialog = TtpointDialog.new_();
                        }
                        if (commonAssetsSettings.letterContents == null) {
                            commonAssetsSettings.letterContents = new ArrayList();
                        }
                        if (commonAssetsSettings.emoji == null) {
                            commonAssetsSettings.emoji = new ArrayList();
                        }
                        break;
                    case 10:
                        commonAssetsSettings.NCTAndroidBatch = (NCTAndroidBatch_) nb5Var.l(NCTAndroidBatch_.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        commonAssetsSettings.recommendPrefetch = (RecommendPrefetch) nb5Var.l(RecommendPrefetch.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        commonAssetsSettings.pullAlive = (List) nb5Var.l(AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        commonAssetsSettings.privateQuestionSuggestCardHideRate = (List) nb5Var.l(PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 40:
                        commonAssetsSettings.limitEighteenBelowSignup = nb5Var.g();
                        continue;
                    case 50:
                        commonAssetsSettings.ttpointDialog = (TtpointDialog) nb5Var.l(TtpointDialog.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        commonAssetsSettings.sendOneSuperlikeActivitySwitch = nb5Var.g();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        commonAssetsSettings.androidAudioExt = nb5Var.g();
                        continue;
                    case 74:
                        commonAssetsSettings.letterContents = (List) nb5Var.l(LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 80:
                        commonAssetsSettings.enableTTPlayer = nb5Var.g();
                        continue;
                    case 90:
                        commonAssetsSettings.enableHighLegibility = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        commonAssetsSettings.enableAgc = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        commonAssetsSettings.emoji = (List) nb5Var.l(EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 112:
                        commonAssetsSettings.httpDns = nb5Var.g();
                        continue;
                    case 120:
                        commonAssetsSettings.enableNetReport = nb5Var.g();
                        continue;
                    case 130:
                        commonAssetsSettings.androidUrlHostTokenWhitelist = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (commonAssetsSettings.NCTAndroidBatch == null) {
                            commonAssetsSettings.NCTAndroidBatch = NCTAndroidBatch_.new_();
                        }
                        if (commonAssetsSettings.recommendPrefetch == null) {
                            commonAssetsSettings.recommendPrefetch = RecommendPrefetch.new_();
                        }
                        if (commonAssetsSettings.pullAlive == null) {
                            commonAssetsSettings.pullAlive = new ArrayList();
                        }
                        if (commonAssetsSettings.privateQuestionSuggestCardHideRate == null) {
                            commonAssetsSettings.privateQuestionSuggestCardHideRate = new ArrayList();
                        }
                        if (commonAssetsSettings.ttpointDialog == null) {
                            commonAssetsSettings.ttpointDialog = TtpointDialog.new_();
                        }
                        if (commonAssetsSettings.letterContents == null) {
                            commonAssetsSettings.letterContents = new ArrayList();
                        }
                        if (commonAssetsSettings.emoji == null) {
                            commonAssetsSettings.emoji = new ArrayList();
                            return commonAssetsSettings;
                        }
                        break;
                }
            }
            return commonAssetsSettings;
        }

        public void serialize(CommonAssetsSettings commonAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NCTAndroidBatch_ nCTAndroidBatch_ = commonAssetsSettings.NCTAndroidBatch;
            if (nCTAndroidBatch_ != null) {
                codedOutputByteBufferNano.K(1, nCTAndroidBatch_, NCTAndroidBatch_.PROTOBUF_ADAPTER);
            }
            RecommendPrefetch recommendPrefetch = commonAssetsSettings.recommendPrefetch;
            if (recommendPrefetch != null) {
                codedOutputByteBufferNano.K(2, recommendPrefetch, RecommendPrefetch.PROTOBUF_ADAPTER);
            }
            List<AwakeApp> list = commonAssetsSettings.pullAlive;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateQuestionSuggestCardHideRate> list2 = commonAssetsSettings.privateQuestionSuggestCardHideRate;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(5, commonAssetsSettings.limitEighteenBelowSignup);
            TtpointDialog ttpointDialog = commonAssetsSettings.ttpointDialog;
            if (ttpointDialog != null) {
                codedOutputByteBufferNano.K(6, ttpointDialog, TtpointDialog.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(7, commonAssetsSettings.sendOneSuperlikeActivitySwitch);
            codedOutputByteBufferNano.A(8, commonAssetsSettings.androidAudioExt);
            List<LetterContent> list3 = commonAssetsSettings.letterContents;
            if (list3 != null) {
                codedOutputByteBufferNano.K(9, list3, LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(10, commonAssetsSettings.enableTTPlayer);
            List<Integer> list4 = commonAssetsSettings.enableHighLegibility;
            if (list4 != null) {
                codedOutputByteBufferNano.K(11, list4, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list5 = commonAssetsSettings.enableAgc;
            if (list5 != null) {
                codedOutputByteBufferNano.K(12, list5, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<EmojiType> list6 = commonAssetsSettings.emoji;
            if (list6 != null) {
                codedOutputByteBufferNano.K(13, list6, EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(14, commonAssetsSettings.httpDns);
            codedOutputByteBufferNano.A(15, commonAssetsSettings.enableNetReport);
            List<String> list7 = commonAssetsSettings.androidUrlHostTokenWhitelist;
            if (list7 != null) {
                codedOutputByteBufferNano.K(16, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CommonAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<CommonAssetsSettings>() { // from class: com.p1.mobile.putong.data.CommonAssetsSettings.2
        public Class getDataClass() {
            return CommonAssetsSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CommonAssetsSettings mo17830newInstance() {
            return new CommonAssetsSettings();
        }

        public boolean parseField(CommonAssetsSettings commonAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ttpointDialog":
                    commonAssetsSettings.ttpointDialog = (TtpointDialog) TtpointDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "NCTAndroidBatch":
                    commonAssetsSettings.NCTAndroidBatch = (NCTAndroidBatch_) NCTAndroidBatch_.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "androidAudioExt":
                    commonAssetsSettings.androidAudioExt = jsonParser.getValueAsBoolean();
                    return true;
                case "letterContents":
                    commonAssetsSettings.letterContents = JsonAdapter.parseArray(jsonParser, LetterContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "androidUrlHostTokenWhitelist":
                    commonAssetsSettings.androidUrlHostTokenWhitelist = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "enableNetReport":
                    commonAssetsSettings.enableNetReport = jsonParser.getValueAsBoolean();
                    return true;
                case "recommendPrefetch":
                    commonAssetsSettings.recommendPrefetch = (RecommendPrefetch) RecommendPrefetch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "privateQuestionSuggestCardHideRate":
                    commonAssetsSettings.privateQuestionSuggestCardHideRate = JsonAdapter.parseArray(jsonParser, PrivateQuestionSuggestCardHideRate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "enableAgc":
                    commonAssetsSettings.enableAgc = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "enableHighLegibility":
                    commonAssetsSettings.enableHighLegibility = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "emoji":
                    commonAssetsSettings.emoji = JsonAdapter.parseArray(jsonParser, EmojiType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "limitEighteenBelowSignup":
                    commonAssetsSettings.limitEighteenBelowSignup = jsonParser.getValueAsBoolean();
                    return true;
                case "enableTTPlayer":
                    commonAssetsSettings.enableTTPlayer = jsonParser.getValueAsBoolean();
                    return true;
                case "sendOneSuperlikeActivitySwitch":
                    commonAssetsSettings.sendOneSuperlikeActivitySwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "httpDns":
                    commonAssetsSettings.httpDns = jsonParser.getValueAsBoolean();
                    return true;
                case "pullAlive":
                    commonAssetsSettings.pullAlive = JsonAdapter.parseArray(jsonParser, AwakeApp.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CommonAssetsSettings commonAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ttpointDialog":
                case "NCTAndroidBatch":
                case "androidAudioExt":
                case "letterContents":
                case "androidUrlHostTokenWhitelist":
                case "enableNetReport":
                case "recommendPrefetch":
                case "privateQuestionSuggestCardHideRate":
                case "enableAgc":
                case "enableHighLegibility":
                case "emoji":
                case "limitEighteenBelowSignup":
                case "enableTTPlayer":
                case "sendOneSuperlikeActivitySwitch":
                case "httpDns":
                case "pullAlive":
                    return true;
                default:
                    return super.parseFieldCheck(commonAssetsSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonAssetsSettings commonAssetsSettings, JsonGenerator jsonGenerator) throws IOException {
            if (commonAssetsSettings.NCTAndroidBatch != null) {
                jsonGenerator.writeFieldName("NCTAndroidBatch");
                NCTAndroidBatch_.JSON_ADAPTER.serialize(commonAssetsSettings.NCTAndroidBatch, jsonGenerator, true);
            }
            if (commonAssetsSettings.recommendPrefetch != null) {
                jsonGenerator.writeFieldName("recommendPrefetch");
                RecommendPrefetch.JSON_ADAPTER.serialize(commonAssetsSettings.recommendPrefetch, jsonGenerator, true);
            }
            if (commonAssetsSettings.pullAlive != null) {
                jsonGenerator.writeFieldName("pullAlive");
                JsonAdapter.serializeArray(commonAssetsSettings.pullAlive, jsonGenerator, AwakeApp.JSON_ADAPTER);
            }
            if (commonAssetsSettings.privateQuestionSuggestCardHideRate != null) {
                jsonGenerator.writeFieldName("privateQuestionSuggestCardHideRate");
                JsonAdapter.serializeArray(commonAssetsSettings.privateQuestionSuggestCardHideRate, jsonGenerator, PrivateQuestionSuggestCardHideRate.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("limitEighteenBelowSignup", commonAssetsSettings.limitEighteenBelowSignup);
            if (commonAssetsSettings.ttpointDialog != null) {
                jsonGenerator.writeFieldName("ttpointDialog");
                TtpointDialog.JSON_ADAPTER.serialize(commonAssetsSettings.ttpointDialog, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("sendOneSuperlikeActivitySwitch", commonAssetsSettings.sendOneSuperlikeActivitySwitch);
            jsonGenerator.writeBooleanField("androidAudioExt", commonAssetsSettings.androidAudioExt);
            if (commonAssetsSettings.letterContents != null) {
                jsonGenerator.writeFieldName("letterContents");
                JsonAdapter.serializeArray(commonAssetsSettings.letterContents, jsonGenerator, LetterContent.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("enableTTPlayer", commonAssetsSettings.enableTTPlayer);
            if (commonAssetsSettings.enableHighLegibility != null) {
                jsonGenerator.writeFieldName("enableHighLegibility");
                JsonAdapter.serializeArray(commonAssetsSettings.enableHighLegibility, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (commonAssetsSettings.enableAgc != null) {
                jsonGenerator.writeFieldName("enableAgc");
                JsonAdapter.serializeArray(commonAssetsSettings.enableAgc, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (commonAssetsSettings.emoji != null) {
                jsonGenerator.writeFieldName("emoji");
                JsonAdapter.serializeArray(commonAssetsSettings.emoji, jsonGenerator, EmojiType.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("httpDns", commonAssetsSettings.httpDns);
            jsonGenerator.writeBooleanField("enableNetReport", commonAssetsSettings.enableNetReport);
            if (commonAssetsSettings.androidUrlHostTokenWhitelist != null) {
                jsonGenerator.writeFieldName("androidUrlHostTokenWhitelist");
                JsonAdapter.serializeArray(commonAssetsSettings.androidUrlHostTokenWhitelist, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m601a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m602b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m604d(Integer num) {
        return num;
    }

    public static CommonAssetsSettings new_() {
        CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
        commonAssetsSettings.nullCheck();
        return commonAssetsSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommonAssetsSettings m17825clone() {
        CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
        NCTAndroidBatch_ nCTAndroidBatch_ = this.NCTAndroidBatch;
        if (nCTAndroidBatch_ != null) {
            commonAssetsSettings.NCTAndroidBatch = nCTAndroidBatch_.m18509clone();
        }
        RecommendPrefetch recommendPrefetch = this.recommendPrefetch;
        if (recommendPrefetch != null) {
            commonAssetsSettings.recommendPrefetch = recommendPrefetch.m18877clone();
        }
        List<AwakeApp> list = this.pullAlive;
        if (list != null) {
            commonAssetsSettings.pullAlive = ValueObject.util_map(list, new w9j() { // from class: l.yh5
                public final Object call(Object obj) {
                    return ((AwakeApp) obj).m17735clone();
                }
            });
        }
        List<PrivateQuestionSuggestCardHideRate> list2 = this.privateQuestionSuggestCardHideRate;
        if (list2 != null) {
            commonAssetsSettings.privateQuestionSuggestCardHideRate = ValueObject.util_map(list2, new w9j() { // from class: l.zh5
                public final Object call(Object obj) {
                    return ((PrivateQuestionSuggestCardHideRate) obj).m18828clone();
                }
            });
        }
        commonAssetsSettings.limitEighteenBelowSignup = this.limitEighteenBelowSignup;
        TtpointDialog ttpointDialog = this.ttpointDialog;
        if (ttpointDialog != null) {
            commonAssetsSettings.ttpointDialog = ttpointDialog.m19123clone();
        }
        commonAssetsSettings.sendOneSuperlikeActivitySwitch = this.sendOneSuperlikeActivitySwitch;
        commonAssetsSettings.androidAudioExt = this.androidAudioExt;
        List<LetterContent> list3 = this.letterContents;
        if (list3 != null) {
            commonAssetsSettings.letterContents = ValueObject.util_map(list3, new w9j() { // from class: l.ai5
                public final Object call(Object obj) {
                    return ((LetterContent) obj).m18282clone();
                }
            });
        }
        commonAssetsSettings.enableTTPlayer = this.enableTTPlayer;
        List<Integer> list4 = this.enableHighLegibility;
        if (list4 != null) {
            commonAssetsSettings.enableHighLegibility = ValueObject.util_map(list4, new w9j() { // from class: l.bi5
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m604d((Integer) obj);
                }
            });
        }
        List<Integer> list5 = this.enableAgc;
        if (list5 != null) {
            commonAssetsSettings.enableAgc = ValueObject.util_map(list5, new w9j() { // from class: l.ci5
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m601a((Integer) obj);
                }
            });
        }
        List<EmojiType> list6 = this.emoji;
        if (list6 != null) {
            commonAssetsSettings.emoji = ValueObject.util_map(list6, new w9j() { // from class: l.di5
                public final Object call(Object obj) {
                    return ((EmojiType) obj).m18015clone();
                }
            });
        }
        commonAssetsSettings.httpDns = this.httpDns;
        commonAssetsSettings.enableNetReport = this.enableNetReport;
        List<String> list7 = this.androidUrlHostTokenWhitelist;
        if (list7 != null) {
            commonAssetsSettings.androidUrlHostTokenWhitelist = ValueObject.util_map(list7, new w9j() { // from class: l.ei5
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m602b((String) obj);
                }
            });
        }
        return commonAssetsSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonAssetsSettings)) {
            return false;
        }
        CommonAssetsSettings commonAssetsSettings = (CommonAssetsSettings) obj;
        return ValueObject.util_equals(this.NCTAndroidBatch, commonAssetsSettings.NCTAndroidBatch) && ValueObject.util_equals(this.recommendPrefetch, commonAssetsSettings.recommendPrefetch) && ValueObject.util_equals(this.pullAlive, commonAssetsSettings.pullAlive) && ValueObject.util_equals(this.privateQuestionSuggestCardHideRate, commonAssetsSettings.privateQuestionSuggestCardHideRate) && this.limitEighteenBelowSignup == commonAssetsSettings.limitEighteenBelowSignup && ValueObject.util_equals(this.ttpointDialog, commonAssetsSettings.ttpointDialog) && this.sendOneSuperlikeActivitySwitch == commonAssetsSettings.sendOneSuperlikeActivitySwitch && this.androidAudioExt == commonAssetsSettings.androidAudioExt && ValueObject.util_equals(this.letterContents, commonAssetsSettings.letterContents) && this.enableTTPlayer == commonAssetsSettings.enableTTPlayer && ValueObject.util_equals(this.enableHighLegibility, commonAssetsSettings.enableHighLegibility) && ValueObject.util_equals(this.enableAgc, commonAssetsSettings.enableAgc) && ValueObject.util_equals(this.emoji, commonAssetsSettings.emoji) && this.httpDns == commonAssetsSettings.httpDns && this.enableNetReport == commonAssetsSettings.enableNetReport && ValueObject.util_equals(this.androidUrlHostTokenWhitelist, commonAssetsSettings.androidUrlHostTokenWhitelist);
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
        NCTAndroidBatch_ nCTAndroidBatch_ = this.NCTAndroidBatch;
        int iHashCode = (i2 + (nCTAndroidBatch_ != null ? nCTAndroidBatch_.hashCode() : 0)) * 41;
        RecommendPrefetch recommendPrefetch = this.recommendPrefetch;
        int iHashCode2 = (iHashCode + (recommendPrefetch != null ? recommendPrefetch.hashCode() : 0)) * 41;
        List<AwakeApp> list = this.pullAlive;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<PrivateQuestionSuggestCardHideRate> list2 = this.privateQuestionSuggestCardHideRate;
        int iHashCode4 = (((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.limitEighteenBelowSignup ? 1231 : 1237)) * 41;
        TtpointDialog ttpointDialog = this.ttpointDialog;
        int iHashCode5 = (((((iHashCode4 + (ttpointDialog != null ? ttpointDialog.hashCode() : 0)) * 41) + (this.sendOneSuperlikeActivitySwitch ? 1231 : 1237)) * 41) + (this.androidAudioExt ? 1231 : 1237)) * 41;
        List<LetterContent> list3 = this.letterContents;
        int iHashCode6 = (((iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 41) + (this.enableTTPlayer ? 1231 : 1237)) * 41;
        List<Integer> list4 = this.enableHighLegibility;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<Integer> list5 = this.enableAgc;
        int iHashCode8 = (iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<EmojiType> list6 = this.emoji;
        int iHashCode9 = (((((iHashCode8 + (list6 != null ? list6.hashCode() : 0)) * 41) + (this.httpDns ? 1231 : 1237)) * 41) + (this.enableNetReport ? 1231 : 1237)) * 41;
        List<String> list7 = this.androidUrlHostTokenWhitelist;
        int iHashCode10 = iHashCode9 + (list7 != null ? list7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.NCTAndroidBatch == null) {
            this.NCTAndroidBatch = NCTAndroidBatch_.new_();
        }
        if (this.recommendPrefetch == null) {
            this.recommendPrefetch = RecommendPrefetch.new_();
        }
        if (this.pullAlive == null) {
            this.pullAlive = new ArrayList();
        }
        if (this.privateQuestionSuggestCardHideRate == null) {
            this.privateQuestionSuggestCardHideRate = new ArrayList();
        }
        if (this.ttpointDialog == null) {
            this.ttpointDialog = TtpointDialog.new_();
        }
        if (this.letterContents == null) {
            this.letterContents = new ArrayList();
        }
        if (this.emoji == null) {
            this.emoji = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
