package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.AwakeApp;
import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.p046p1.mobile.putong.data.EmojiType;
import com.p046p1.mobile.putong.data.LetterContent;
import com.p046p1.mobile.putong.data.PrivateQuestionSuggestCardHideRate;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class CommonAssetsSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commonassetssettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public NCTAndroidBatch_ NCTAndroidBatch;

    @ProtobufIndex(index = 8)
    public boolean androidAudioExt;

    @Nullable
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonAssetsSettings commonAssetsSettings) {
            NCTAndroidBatch_ nCTAndroidBatch_ = commonAssetsSettings.NCTAndroidBatch;
            int iM17230l = nCTAndroidBatch_ != null ? CodedOutputByteBufferNano.m17230l(1, nCTAndroidBatch_, NCTAndroidBatch_.PROTOBUF_ADAPTER) : 0;
            RecommendPrefetch recommendPrefetch = commonAssetsSettings.recommendPrefetch;
            if (recommendPrefetch != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, recommendPrefetch, RecommendPrefetch.PROTOBUF_ADAPTER);
            }
            List<AwakeApp> list = commonAssetsSettings.pullAlive;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list, AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateQuestionSuggestCardHideRate> list2 = commonAssetsSettings.privateQuestionSuggestCardHideRate;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list2, PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(5, commonAssetsSettings.limitEighteenBelowSignup);
            TtpointDialog ttpointDialog = commonAssetsSettings.ttpointDialog;
            if (ttpointDialog != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, ttpointDialog, TtpointDialog.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(7, commonAssetsSettings.sendOneSuperlikeActivitySwitch) + CodedOutputByteBufferNano.m17220b(8, commonAssetsSettings.androidAudioExt);
            List<LetterContent> list3 = commonAssetsSettings.letterContents;
            if (list3 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(9, list3, LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(10, commonAssetsSettings.enableTTPlayer);
            List<Integer> list4 = commonAssetsSettings.enableHighLegibility;
            if (list4 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(11, list4, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list5 = commonAssetsSettings.enableAgc;
            if (list5 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(12, list5, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<EmojiType> list6 = commonAssetsSettings.emoji;
            if (list6 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(13, list6, EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b4 = iM17220b3 + CodedOutputByteBufferNano.m17220b(14, commonAssetsSettings.httpDns) + CodedOutputByteBufferNano.m17220b(15, commonAssetsSettings.enableNetReport);
            List<String> list7 = commonAssetsSettings.androidUrlHostTokenWhitelist;
            if (list7 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(16, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            commonAssetsSettings.cachedSize = iM17220b4;
            return iM17220b4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonAssetsSettings parse(nb5 nb5Var) throws IOException {
            CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                        commonAssetsSettings.NCTAndroidBatch = (NCTAndroidBatch_) nb5Var.m158743l(NCTAndroidBatch_.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        commonAssetsSettings.recommendPrefetch = (RecommendPrefetch) nb5Var.m158743l(RecommendPrefetch.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        commonAssetsSettings.pullAlive = (List) nb5Var.m158743l(AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        commonAssetsSettings.privateQuestionSuggestCardHideRate = (List) nb5Var.m158743l(PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 40:
                        commonAssetsSettings.limitEighteenBelowSignup = nb5Var.m158738g();
                        continue;
                    case 50:
                        commonAssetsSettings.ttpointDialog = (TtpointDialog) nb5Var.m158743l(TtpointDialog.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        commonAssetsSettings.sendOneSuperlikeActivitySwitch = nb5Var.m158738g();
                        continue;
                    case 64:
                        commonAssetsSettings.androidAudioExt = nb5Var.m158738g();
                        continue;
                    case 74:
                        commonAssetsSettings.letterContents = (List) nb5Var.m158743l(LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 80:
                        commonAssetsSettings.enableTTPlayer = nb5Var.m158738g();
                        continue;
                    case 90:
                        commonAssetsSettings.enableHighLegibility = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        commonAssetsSettings.enableAgc = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        commonAssetsSettings.emoji = (List) nb5Var.m158743l(EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 112:
                        commonAssetsSettings.httpDns = nb5Var.m158738g();
                        continue;
                    case 120:
                        commonAssetsSettings.enableNetReport = nb5Var.m158738g();
                        continue;
                    case 130:
                        commonAssetsSettings.androidUrlHostTokenWhitelist = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonAssetsSettings commonAssetsSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NCTAndroidBatch_ nCTAndroidBatch_ = commonAssetsSettings.NCTAndroidBatch;
            if (nCTAndroidBatch_ != null) {
                codedOutputByteBufferNano.m17254K(1, nCTAndroidBatch_, NCTAndroidBatch_.PROTOBUF_ADAPTER);
            }
            RecommendPrefetch recommendPrefetch = commonAssetsSettings.recommendPrefetch;
            if (recommendPrefetch != null) {
                codedOutputByteBufferNano.m17254K(2, recommendPrefetch, RecommendPrefetch.PROTOBUF_ADAPTER);
            }
            List<AwakeApp> list = commonAssetsSettings.pullAlive;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, AwakeApp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PrivateQuestionSuggestCardHideRate> list2 = commonAssetsSettings.privateQuestionSuggestCardHideRate;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, PrivateQuestionSuggestCardHideRate.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(5, commonAssetsSettings.limitEighteenBelowSignup);
            TtpointDialog ttpointDialog = commonAssetsSettings.ttpointDialog;
            if (ttpointDialog != null) {
                codedOutputByteBufferNano.m17254K(6, ttpointDialog, TtpointDialog.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(7, commonAssetsSettings.sendOneSuperlikeActivitySwitch);
            codedOutputByteBufferNano.m17244A(8, commonAssetsSettings.androidAudioExt);
            List<LetterContent> list3 = commonAssetsSettings.letterContents;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(9, list3, LetterContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(10, commonAssetsSettings.enableTTPlayer);
            List<Integer> list4 = commonAssetsSettings.enableHighLegibility;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(11, list4, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list5 = commonAssetsSettings.enableAgc;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(12, list5, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<EmojiType> list6 = commonAssetsSettings.emoji;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(13, list6, EmojiType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(14, commonAssetsSettings.httpDns);
            codedOutputByteBufferNano.m17244A(15, commonAssetsSettings.enableNetReport);
            List<String> list7 = commonAssetsSettings.androidUrlHostTokenWhitelist;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(16, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CommonAssetsSettings> JSON_ADAPTER = new ObjectJsonAdapter<CommonAssetsSettings>() { // from class: com.p1.mobile.putong.data.CommonAssetsSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonAssetsSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonAssetsSettings newInstance() {
            return new CommonAssetsSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(CommonAssetsSettings commonAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2065124232:
                    if (str.equals("ttpointDialog")) {
                        b = 0;
                    }
                    break;
                case -1913456406:
                    if (str.equals("NCTAndroidBatch")) {
                        b = 1;
                    }
                    break;
                case -1681679878:
                    if (str.equals("androidAudioExt")) {
                        b = 2;
                    }
                    break;
                case -1595974304:
                    if (str.equals("letterContents")) {
                        b = 3;
                    }
                    break;
                case -1500712266:
                    if (str.equals("androidUrlHostTokenWhitelist")) {
                        b = 4;
                    }
                    break;
                case -1230110994:
                    if (str.equals("enableNetReport")) {
                        b = 5;
                    }
                    break;
                case -986547501:
                    if (str.equals("recommendPrefetch")) {
                        b = 6;
                    }
                    break;
                case -683128627:
                    if (str.equals("privateQuestionSuggestCardHideRate")) {
                        b = 7;
                    }
                    break;
                case -631682950:
                    if (str.equals("enableAgc")) {
                        b = 8;
                    }
                    break;
                case -620607223:
                    if (str.equals("enableHighLegibility")) {
                        b = 9;
                    }
                    break;
                case 96632902:
                    if (str.equals("emoji")) {
                        b = 10;
                    }
                    break;
                case 241382031:
                    if (str.equals("limitEighteenBelowSignup")) {
                        b = 11;
                    }
                    break;
                case 280404996:
                    if (str.equals("enableTTPlayer")) {
                        b = 12;
                    }
                    break;
                case 1007109559:
                    if (str.equals("sendOneSuperlikeActivitySwitch")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1242617729:
                    if (str.equals("httpDns")) {
                        b = 14;
                    }
                    break;
                case 1695358344:
                    if (str.equals("pullAlive")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    commonAssetsSettings.ttpointDialog = TtpointDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    commonAssetsSettings.NCTAndroidBatch = NCTAndroidBatch_.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    commonAssetsSettings.androidAudioExt = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    commonAssetsSettings.letterContents = JsonAdapter.parseArray(jsonParser, LetterContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    commonAssetsSettings.androidUrlHostTokenWhitelist = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    commonAssetsSettings.enableNetReport = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    commonAssetsSettings.recommendPrefetch = RecommendPrefetch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    commonAssetsSettings.privateQuestionSuggestCardHideRate = JsonAdapter.parseArray(jsonParser, PrivateQuestionSuggestCardHideRate.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    commonAssetsSettings.enableAgc = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    commonAssetsSettings.enableHighLegibility = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    commonAssetsSettings.emoji = JsonAdapter.parseArray(jsonParser, EmojiType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    commonAssetsSettings.limitEighteenBelowSignup = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    commonAssetsSettings.enableTTPlayer = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    commonAssetsSettings.sendOneSuperlikeActivitySwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    commonAssetsSettings.httpDns = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    commonAssetsSettings.pullAlive = JsonAdapter.parseArray(jsonParser, AwakeApp.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(CommonAssetsSettings commonAssetsSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2065124232:
                    if (str.equals("ttpointDialog")) {
                        b = 0;
                    }
                    break;
                case -1913456406:
                    if (str.equals("NCTAndroidBatch")) {
                        b = 1;
                    }
                    break;
                case -1681679878:
                    if (str.equals("androidAudioExt")) {
                        b = 2;
                    }
                    break;
                case -1595974304:
                    if (str.equals("letterContents")) {
                        b = 3;
                    }
                    break;
                case -1500712266:
                    if (str.equals("androidUrlHostTokenWhitelist")) {
                        b = 4;
                    }
                    break;
                case -1230110994:
                    if (str.equals("enableNetReport")) {
                        b = 5;
                    }
                    break;
                case -986547501:
                    if (str.equals("recommendPrefetch")) {
                        b = 6;
                    }
                    break;
                case -683128627:
                    if (str.equals("privateQuestionSuggestCardHideRate")) {
                        b = 7;
                    }
                    break;
                case -631682950:
                    if (str.equals("enableAgc")) {
                        b = 8;
                    }
                    break;
                case -620607223:
                    if (str.equals("enableHighLegibility")) {
                        b = 9;
                    }
                    break;
                case 96632902:
                    if (str.equals("emoji")) {
                        b = 10;
                    }
                    break;
                case 241382031:
                    if (str.equals("limitEighteenBelowSignup")) {
                        b = 11;
                    }
                    break;
                case 280404996:
                    if (str.equals("enableTTPlayer")) {
                        b = 12;
                    }
                    break;
                case 1007109559:
                    if (str.equals("sendOneSuperlikeActivitySwitch")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1242617729:
                    if (str.equals("httpDns")) {
                        b = 14;
                    }
                    break;
                case 1695358344:
                    if (str.equals("pullAlive")) {
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
                    return super.parseFieldCheck(commonAssetsSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonAssetsSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m59699a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59700b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m59702d(Integer num) {
        return num;
    }

    public static CommonAssetsSettings new_() {
        CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
        commonAssetsSettings.nullCheck();
        return commonAssetsSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonAssetsSettings mo223809clone() {
        CommonAssetsSettings commonAssetsSettings = new CommonAssetsSettings();
        NCTAndroidBatch_ nCTAndroidBatch_ = this.NCTAndroidBatch;
        if (nCTAndroidBatch_ != null) {
            commonAssetsSettings.NCTAndroidBatch = nCTAndroidBatch_.mo223809clone();
        }
        RecommendPrefetch recommendPrefetch = this.recommendPrefetch;
        if (recommendPrefetch != null) {
            commonAssetsSettings.recommendPrefetch = recommendPrefetch.mo223809clone();
        }
        List<AwakeApp> list = this.pullAlive;
        if (list != null) {
            commonAssetsSettings.pullAlive = ValueObject.util_map(list, new w9j() { // from class: l.yh5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AwakeApp) obj).mo223809clone();
                }
            });
        }
        List<PrivateQuestionSuggestCardHideRate> list2 = this.privateQuestionSuggestCardHideRate;
        if (list2 != null) {
            commonAssetsSettings.privateQuestionSuggestCardHideRate = ValueObject.util_map(list2, new w9j() { // from class: l.zh5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PrivateQuestionSuggestCardHideRate) obj).mo223809clone();
                }
            });
        }
        commonAssetsSettings.limitEighteenBelowSignup = this.limitEighteenBelowSignup;
        TtpointDialog ttpointDialog = this.ttpointDialog;
        if (ttpointDialog != null) {
            commonAssetsSettings.ttpointDialog = ttpointDialog.mo223809clone();
        }
        commonAssetsSettings.sendOneSuperlikeActivitySwitch = this.sendOneSuperlikeActivitySwitch;
        commonAssetsSettings.androidAudioExt = this.androidAudioExt;
        List<LetterContent> list3 = this.letterContents;
        if (list3 != null) {
            commonAssetsSettings.letterContents = ValueObject.util_map(list3, new w9j() { // from class: l.ai5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LetterContent) obj).mo223809clone();
                }
            });
        }
        commonAssetsSettings.enableTTPlayer = this.enableTTPlayer;
        List<Integer> list4 = this.enableHighLegibility;
        if (list4 != null) {
            commonAssetsSettings.enableHighLegibility = ValueObject.util_map(list4, new w9j() { // from class: l.bi5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m59702d((Integer) obj);
                }
            });
        }
        List<Integer> list5 = this.enableAgc;
        if (list5 != null) {
            commonAssetsSettings.enableAgc = ValueObject.util_map(list5, new w9j() { // from class: l.ci5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m59699a((Integer) obj);
                }
            });
        }
        List<EmojiType> list6 = this.emoji;
        if (list6 != null) {
            commonAssetsSettings.emoji = ValueObject.util_map(list6, new w9j() { // from class: l.di5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((EmojiType) obj).mo223809clone();
                }
            });
        }
        commonAssetsSettings.httpDns = this.httpDns;
        commonAssetsSettings.enableNetReport = this.enableNetReport;
        List<String> list7 = this.androidUrlHostTokenWhitelist;
        if (list7 != null) {
            commonAssetsSettings.androidUrlHostTokenWhitelist = ValueObject.util_map(list7, new w9j() { // from class: l.ei5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CommonAssetsSettings.m59700b((String) obj);
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
