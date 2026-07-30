package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Creative;
import com.p051p1.mobile.putong.data.OMSLauncherInfo;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.constant.WBConstants;
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
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSLauncherInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omslauncherinfo";

    /* JADX INFO: renamed from: ad */
    @Nullable
    @ProtobufIndex(index = 11)
    public ADInfo f39637ad;

    @NonNull
    @ProtobufIndex(index = 6)
    public OmsMerCuryData behaviorMercury;

    @ProtobufIndex(index = 17)
    public int budgetType;

    @ProtobufIndex(index = 12)
    public boolean cacheEnable;

    @NonNull
    @ProtobufIndex(index = 5)
    public OmsMerCuryData clickMercury;

    @NonNull
    @ProtobufIndex(index = 8)
    public OMSDisplayRule constraint;

    @NonNull
    @ProtobufIndex(index = 15)
    public CreativeOms creative;

    @NonNull
    @ProtobufIndex(index = 19)
    public String dspId;

    @ProtobufIndex(index = 7)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 10)
    public String href;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39638id;

    @ProtobufIndex(index = 18)
    public boolean ifBeRealtime;
    public boolean isUseCache = false;

    @ProtobufIndex(index = 20)
    public long issueTimestamp;

    @NonNull
    @ProtobufIndex(index = 16)
    public OperationConfig operationConfig;

    @ProtobufIndex(index = 21)
    public int price;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<String> scenes;

    @NonNull
    @ProtobufIndex(index = 4)
    public OmsMerCuryData skipMercury;

    @NonNull
    @ProtobufIndex(index = 14)
    public String type;

    @NonNull
    @ProtobufIndex(index = 9)
    public String url;

    @ProtobufIndex(index = 2)
    public int version;

    @NonNull
    @ProtobufIndex(index = 3)
    public OmsMerCuryData viewMercury;
    public static ProtobufAdapter<OMSLauncherInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSLauncherInfo>() { // from class: com.p1.mobile.putong.data.OMSLauncherInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSLauncherInfo oMSLauncherInfo) {
            String str = oMSLauncherInfo.f39638id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, oMSLauncherInfo.version);
            OmsMerCuryData omsMerCuryData = oMSLauncherInfo.viewMercury;
            if (omsMerCuryData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.skipMercury;
            if (omsMerCuryData2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, omsMerCuryData2, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData3 = oMSLauncherInfo.clickMercury;
            if (omsMerCuryData3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, omsMerCuryData3, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData4 = oMSLauncherInfo.behaviorMercury;
            if (omsMerCuryData4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, omsMerCuryData4, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(7, oMSLauncherInfo.duration);
            OMSDisplayRule oMSDisplayRule = oMSLauncherInfo.constraint;
            if (oMSDisplayRule != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            String str2 = oMSLauncherInfo.url;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str2);
            }
            String str3 = oMSLauncherInfo.href;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str3);
            }
            ADInfo aDInfo = oMSLauncherInfo.f39637ad;
            if (aDInfo != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, aDInfo, ADInfo.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(12, oMSLauncherInfo.cacheEnable);
            List<String> list = oMSLauncherInfo.scenes;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(13, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = oMSLauncherInfo.type;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(14, str4);
            }
            CreativeOms creativeOms = oMSLauncherInfo.creative;
            if (creativeOms != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(15, creativeOms, CreativeOms.PROTOBUF_ADAPTER);
            }
            OperationConfig operationConfig = oMSLauncherInfo.operationConfig;
            if (operationConfig != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(16, operationConfig, OperationConfig.PROTOBUF_ADAPTER);
            }
            int iM17281h2 = iM17275b + CodedOutputByteBufferNano.m17281h(17, oMSLauncherInfo.budgetType) + CodedOutputByteBufferNano.m17275b(18, oMSLauncherInfo.ifBeRealtime);
            String str5 = oMSLauncherInfo.dspId;
            if (str5 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(19, str5);
            }
            int iM17283j = iM17281h2 + CodedOutputByteBufferNano.m17283j(20, oMSLauncherInfo.issueTimestamp) + CodedOutputByteBufferNano.m17281h(21, oMSLauncherInfo.price);
            oMSLauncherInfo.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSLauncherInfo parse(nc5 nc5Var) throws IOException {
            OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (oMSLauncherInfo.f39638id == null) {
                            oMSLauncherInfo.f39638id = "";
                        }
                        if (oMSLauncherInfo.viewMercury == null) {
                            oMSLauncherInfo.viewMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.skipMercury == null) {
                            oMSLauncherInfo.skipMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.clickMercury == null) {
                            oMSLauncherInfo.clickMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.behaviorMercury == null) {
                            oMSLauncherInfo.behaviorMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.constraint == null) {
                            oMSLauncherInfo.constraint = OMSDisplayRule.new_();
                        }
                        if (oMSLauncherInfo.url == null) {
                            oMSLauncherInfo.url = "";
                        }
                        if (oMSLauncherInfo.href == null) {
                            oMSLauncherInfo.href = "";
                        }
                        if (oMSLauncherInfo.scenes == null) {
                            oMSLauncherInfo.scenes = new ArrayList();
                        }
                        if (oMSLauncherInfo.type == null) {
                            oMSLauncherInfo.type = "";
                        }
                        if (oMSLauncherInfo.creative == null) {
                            oMSLauncherInfo.creative = CreativeOms.new_();
                        }
                        if (oMSLauncherInfo.operationConfig == null) {
                            oMSLauncherInfo.operationConfig = OperationConfig.new_();
                        }
                        if (oMSLauncherInfo.dspId == null) {
                            oMSLauncherInfo.dspId = "";
                        }
                        break;
                    case 10:
                        oMSLauncherInfo.f39638id = nc5Var.m162495s();
                        continue;
                    case 16:
                        oMSLauncherInfo.version = nc5Var.m162486j();
                        continue;
                    case 26:
                        oMSLauncherInfo.viewMercury = (OmsMerCuryData) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        oMSLauncherInfo.skipMercury = (OmsMerCuryData) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        oMSLauncherInfo.clickMercury = (OmsMerCuryData) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSLauncherInfo.behaviorMercury = (OmsMerCuryData) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        oMSLauncherInfo.duration = nc5Var.m162486j();
                        continue;
                    case 66:
                        oMSLauncherInfo.constraint = (OMSDisplayRule) nc5Var.m162488l(OMSDisplayRule.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        oMSLauncherInfo.url = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        oMSLauncherInfo.href = nc5Var.m162495s();
                        continue;
                    case 90:
                        oMSLauncherInfo.f39637ad = (ADInfo) nc5Var.m162488l(ADInfo.PROTOBUF_ADAPTER);
                        continue;
                    case Opcodes.IADD /* 96 */:
                        oMSLauncherInfo.cacheEnable = nc5Var.m162483g();
                        continue;
                    case 106:
                        oMSLauncherInfo.scenes = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        oMSLauncherInfo.type = nc5Var.m162495s();
                        continue;
                    case 122:
                        oMSLauncherInfo.creative = (CreativeOms) nc5Var.m162488l(CreativeOms.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        oMSLauncherInfo.operationConfig = (OperationConfig) nc5Var.m162488l(OperationConfig.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                        oMSLauncherInfo.budgetType = nc5Var.m162486j();
                        continue;
                    case 144:
                        oMSLauncherInfo.ifBeRealtime = nc5Var.m162483g();
                        continue;
                    case 154:
                        oMSLauncherInfo.dspId = nc5Var.m162495s();
                        continue;
                    case 160:
                        oMSLauncherInfo.issueTimestamp = nc5Var.m162487k();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        oMSLauncherInfo.price = nc5Var.m162486j();
                        continue;
                    default:
                        if (oMSLauncherInfo.f39638id == null) {
                            oMSLauncherInfo.f39638id = "";
                        }
                        if (oMSLauncherInfo.viewMercury == null) {
                            oMSLauncherInfo.viewMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.skipMercury == null) {
                            oMSLauncherInfo.skipMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.clickMercury == null) {
                            oMSLauncherInfo.clickMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.behaviorMercury == null) {
                            oMSLauncherInfo.behaviorMercury = OmsMerCuryData.new_();
                        }
                        if (oMSLauncherInfo.constraint == null) {
                            oMSLauncherInfo.constraint = OMSDisplayRule.new_();
                        }
                        if (oMSLauncherInfo.url == null) {
                            oMSLauncherInfo.url = "";
                        }
                        if (oMSLauncherInfo.href == null) {
                            oMSLauncherInfo.href = "";
                        }
                        if (oMSLauncherInfo.scenes == null) {
                            oMSLauncherInfo.scenes = new ArrayList();
                        }
                        if (oMSLauncherInfo.type == null) {
                            oMSLauncherInfo.type = "";
                        }
                        if (oMSLauncherInfo.creative == null) {
                            oMSLauncherInfo.creative = CreativeOms.new_();
                        }
                        if (oMSLauncherInfo.operationConfig == null) {
                            oMSLauncherInfo.operationConfig = OperationConfig.new_();
                        }
                        if (oMSLauncherInfo.dspId == null) {
                            oMSLauncherInfo.dspId = "";
                            return oMSLauncherInfo;
                        }
                        break;
                }
            }
            return oMSLauncherInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSLauncherInfo oMSLauncherInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSLauncherInfo.f39638id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, oMSLauncherInfo.version);
            OmsMerCuryData omsMerCuryData = oMSLauncherInfo.viewMercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.m17309K(3, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.skipMercury;
            if (omsMerCuryData2 != null) {
                codedOutputByteBufferNano.m17309K(4, omsMerCuryData2, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData3 = oMSLauncherInfo.clickMercury;
            if (omsMerCuryData3 != null) {
                codedOutputByteBufferNano.m17309K(5, omsMerCuryData3, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData4 = oMSLauncherInfo.behaviorMercury;
            if (omsMerCuryData4 != null) {
                codedOutputByteBufferNano.m17309K(6, omsMerCuryData4, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(7, oMSLauncherInfo.duration);
            OMSDisplayRule oMSDisplayRule = oMSLauncherInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.m17309K(8, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            String str2 = oMSLauncherInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(9, str2);
            }
            String str3 = oMSLauncherInfo.href;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(10, str3);
            }
            ADInfo aDInfo = oMSLauncherInfo.f39637ad;
            if (aDInfo != null) {
                codedOutputByteBufferNano.m17309K(11, aDInfo, ADInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(12, oMSLauncherInfo.cacheEnable);
            List<String> list = oMSLauncherInfo.scenes;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(13, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = oMSLauncherInfo.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(14, str4);
            }
            CreativeOms creativeOms = oMSLauncherInfo.creative;
            if (creativeOms != null) {
                codedOutputByteBufferNano.m17309K(15, creativeOms, CreativeOms.PROTOBUF_ADAPTER);
            }
            OperationConfig operationConfig = oMSLauncherInfo.operationConfig;
            if (operationConfig != null) {
                codedOutputByteBufferNano.m17309K(16, operationConfig, OperationConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(17, oMSLauncherInfo.budgetType);
            codedOutputByteBufferNano.m17299A(18, oMSLauncherInfo.ifBeRealtime);
            String str5 = oMSLauncherInfo.dspId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(19, str5);
            }
            codedOutputByteBufferNano.m17307I(20, oMSLauncherInfo.issueTimestamp);
            codedOutputByteBufferNano.m17305G(21, oMSLauncherInfo.price);
        }
    };
    public static JsonAdapter<OMSLauncherInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSLauncherInfo>() { // from class: com.p1.mobile.putong.data.OMSLauncherInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSLauncherInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSLauncherInfo newInstance() {
            return new OMSLauncherInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(OMSLauncherInfo oMSLauncherInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -980479029:
                    if (str.equals("ifBeRealtime")) {
                        b = 1;
                    }
                    break;
                case -908068505:
                    if (str.equals("scenes")) {
                        b = 2;
                    }
                    break;
                case -689993697:
                    if (str.equals("budgetType")) {
                        b = 3;
                    }
                    break;
                case -602782572:
                    if (str.equals("skipMercury")) {
                        b = 4;
                    }
                    break;
                case -190376483:
                    if (str.equals("constraint")) {
                        b = 5;
                    }
                    break;
                case 3107:
                    if (str.equals("ad")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 8;
                    }
                    break;
                case 3211051:
                    if (str.equals("href")) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 95888060:
                    if (str.equals("dspId")) {
                        b = 11;
                    }
                    break;
                case 106934601:
                    if (str.equals(FirebaseAnalytics.Param.PRICE)) {
                        b = 12;
                    }
                    break;
                case 151361445:
                    if (str.equals("cacheEnable")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 14;
                    }
                    break;
                case 635143229:
                    if (str.equals("issueTimestamp")) {
                        b = 15;
                    }
                    break;
                case 943978670:
                    if (str.equals("viewMercury")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1301541985:
                    if (str.equals("behaviorMercury")) {
                        b = 17;
                    }
                    break;
                case 1508964459:
                    if (str.equals("clickMercury")) {
                        b = 18;
                    }
                    break;
                case 1820422063:
                    if (str.equals(Creative.TYPE)) {
                        b = 19;
                    }
                    break;
                case 2016238473:
                    if (str.equals("operationConfig")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    oMSLauncherInfo.duration = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    oMSLauncherInfo.ifBeRealtime = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    oMSLauncherInfo.scenes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    oMSLauncherInfo.budgetType = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    oMSLauncherInfo.skipMercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    oMSLauncherInfo.constraint = OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    oMSLauncherInfo.f39637ad = ADInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    oMSLauncherInfo.f39638id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    oMSLauncherInfo.url = jsonParser.getValueAsString();
                    return true;
                case 9:
                    oMSLauncherInfo.href = jsonParser.getValueAsString();
                    return true;
                case 10:
                    oMSLauncherInfo.type = jsonParser.getValueAsString();
                    return true;
                case 11:
                    oMSLauncherInfo.dspId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    oMSLauncherInfo.price = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    oMSLauncherInfo.cacheEnable = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    oMSLauncherInfo.version = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    oMSLauncherInfo.issueTimestamp = jsonParser.getValueAsLong();
                    return true;
                case 16:
                    oMSLauncherInfo.viewMercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    oMSLauncherInfo.behaviorMercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    oMSLauncherInfo.clickMercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    oMSLauncherInfo.creative = CreativeOms.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    oMSLauncherInfo.operationConfig = OperationConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(OMSLauncherInfo oMSLauncherInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -980479029:
                    if (str.equals("ifBeRealtime")) {
                        b = 1;
                    }
                    break;
                case -908068505:
                    if (str.equals("scenes")) {
                        b = 2;
                    }
                    break;
                case -689993697:
                    if (str.equals("budgetType")) {
                        b = 3;
                    }
                    break;
                case -602782572:
                    if (str.equals("skipMercury")) {
                        b = 4;
                    }
                    break;
                case -190376483:
                    if (str.equals("constraint")) {
                        b = 5;
                    }
                    break;
                case 3107:
                    if (str.equals("ad")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 8;
                    }
                    break;
                case 3211051:
                    if (str.equals("href")) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 95888060:
                    if (str.equals("dspId")) {
                        b = 11;
                    }
                    break;
                case 106934601:
                    if (str.equals(FirebaseAnalytics.Param.PRICE)) {
                        b = 12;
                    }
                    break;
                case 151361445:
                    if (str.equals("cacheEnable")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 14;
                    }
                    break;
                case 635143229:
                    if (str.equals("issueTimestamp")) {
                        b = 15;
                    }
                    break;
                case 943978670:
                    if (str.equals("viewMercury")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1301541985:
                    if (str.equals("behaviorMercury")) {
                        b = 17;
                    }
                    break;
                case 1508964459:
                    if (str.equals("clickMercury")) {
                        b = 18;
                    }
                    break;
                case 1820422063:
                    if (str.equals(Creative.TYPE)) {
                        b = 19;
                    }
                    break;
                case 2016238473:
                    if (str.equals("operationConfig")) {
                        b = 20;
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
                    return true;
                case 7:
                    return false;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return true;
                default:
                    return super.parseFieldCheck(oMSLauncherInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSLauncherInfo oMSLauncherInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSLauncherInfo.f39638id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, oMSLauncherInfo.version);
            if (oMSLauncherInfo.viewMercury != null) {
                jsonGenerator.writeFieldName("viewMercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSLauncherInfo.viewMercury, jsonGenerator, true);
            }
            if (oMSLauncherInfo.skipMercury != null) {
                jsonGenerator.writeFieldName("skipMercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSLauncherInfo.skipMercury, jsonGenerator, true);
            }
            if (oMSLauncherInfo.clickMercury != null) {
                jsonGenerator.writeFieldName("clickMercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSLauncherInfo.clickMercury, jsonGenerator, true);
            }
            if (oMSLauncherInfo.behaviorMercury != null) {
                jsonGenerator.writeFieldName("behaviorMercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSLauncherInfo.behaviorMercury, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, oMSLauncherInfo.duration);
            if (oMSLauncherInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSLauncherInfo.constraint, jsonGenerator, true);
            }
            String str2 = oMSLauncherInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = oMSLauncherInfo.href;
            if (str3 != null) {
                jsonGenerator.writeStringField("href", str3);
            }
            if (oMSLauncherInfo.f39637ad != null) {
                jsonGenerator.writeFieldName("ad");
                ADInfo.JSON_ADAPTER.serialize(oMSLauncherInfo.f39637ad, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("cacheEnable", oMSLauncherInfo.cacheEnable);
            if (oMSLauncherInfo.scenes != null) {
                jsonGenerator.writeFieldName("scenes");
                JsonAdapter.serializeArray(oMSLauncherInfo.scenes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = oMSLauncherInfo.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            if (oMSLauncherInfo.creative != null) {
                jsonGenerator.writeFieldName(Creative.TYPE);
                CreativeOms.JSON_ADAPTER.serialize(oMSLauncherInfo.creative, jsonGenerator, true);
            }
            if (oMSLauncherInfo.operationConfig != null) {
                jsonGenerator.writeFieldName("operationConfig");
                OperationConfig.JSON_ADAPTER.serialize(oMSLauncherInfo.operationConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("budgetType", oMSLauncherInfo.budgetType);
            jsonGenerator.writeBooleanField("ifBeRealtime", oMSLauncherInfo.ifBeRealtime);
            String str5 = oMSLauncherInfo.dspId;
            if (str5 != null) {
                jsonGenerator.writeStringField("dspId", str5);
            }
            jsonGenerator.writeNumberField("issueTimestamp", oMSLauncherInfo.issueTimestamp);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, oMSLauncherInfo.price);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLauncherInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLauncherInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61103a(String str) {
        return str;
    }

    public static OMSLauncherInfo new_() {
        OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
        oMSLauncherInfo.nullCheck();
        return oMSLauncherInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSLauncherInfo mo225055clone() {
        OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
        oMSLauncherInfo.f39638id = this.f39638id;
        oMSLauncherInfo.version = this.version;
        OmsMerCuryData omsMerCuryData = this.viewMercury;
        if (omsMerCuryData != null) {
            oMSLauncherInfo.viewMercury = omsMerCuryData.mo225055clone();
        }
        OmsMerCuryData omsMerCuryData2 = this.skipMercury;
        if (omsMerCuryData2 != null) {
            oMSLauncherInfo.skipMercury = omsMerCuryData2.mo225055clone();
        }
        OmsMerCuryData omsMerCuryData3 = this.clickMercury;
        if (omsMerCuryData3 != null) {
            oMSLauncherInfo.clickMercury = omsMerCuryData3.mo225055clone();
        }
        OmsMerCuryData omsMerCuryData4 = this.behaviorMercury;
        if (omsMerCuryData4 != null) {
            oMSLauncherInfo.behaviorMercury = omsMerCuryData4.mo225055clone();
        }
        oMSLauncherInfo.duration = this.duration;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSLauncherInfo.constraint = oMSDisplayRule.mo225055clone();
        }
        oMSLauncherInfo.url = this.url;
        oMSLauncherInfo.href = this.href;
        ADInfo aDInfo = this.f39637ad;
        if (aDInfo != null) {
            oMSLauncherInfo.f39637ad = aDInfo.mo225055clone();
        }
        oMSLauncherInfo.cacheEnable = this.cacheEnable;
        List<String> list = this.scenes;
        if (list != null) {
            oMSLauncherInfo.scenes = ValueObject.util_map(list, new qcj() { // from class: l.t750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSLauncherInfo.m61103a((String) obj);
                }
            });
        }
        oMSLauncherInfo.type = this.type;
        CreativeOms creativeOms = this.creative;
        if (creativeOms != null) {
            oMSLauncherInfo.creative = creativeOms.mo225055clone();
        }
        OperationConfig operationConfig = this.operationConfig;
        if (operationConfig != null) {
            oMSLauncherInfo.operationConfig = operationConfig.mo225055clone();
        }
        oMSLauncherInfo.budgetType = this.budgetType;
        oMSLauncherInfo.ifBeRealtime = this.ifBeRealtime;
        oMSLauncherInfo.dspId = this.dspId;
        oMSLauncherInfo.issueTimestamp = this.issueTimestamp;
        oMSLauncherInfo.price = this.price;
        return oMSLauncherInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSLauncherInfo)) {
            return false;
        }
        OMSLauncherInfo oMSLauncherInfo = (OMSLauncherInfo) obj;
        return ValueObject.util_equals(this.f39638id, oMSLauncherInfo.f39638id) && this.version == oMSLauncherInfo.version && ValueObject.util_equals(this.viewMercury, oMSLauncherInfo.viewMercury) && ValueObject.util_equals(this.skipMercury, oMSLauncherInfo.skipMercury) && ValueObject.util_equals(this.clickMercury, oMSLauncherInfo.clickMercury) && ValueObject.util_equals(this.behaviorMercury, oMSLauncherInfo.behaviorMercury) && this.duration == oMSLauncherInfo.duration && ValueObject.util_equals(this.constraint, oMSLauncherInfo.constraint) && ValueObject.util_equals(this.url, oMSLauncherInfo.url) && ValueObject.util_equals(this.href, oMSLauncherInfo.href) && ValueObject.util_equals(this.f39637ad, oMSLauncherInfo.f39637ad) && this.cacheEnable == oMSLauncherInfo.cacheEnable && ValueObject.util_equals(this.scenes, oMSLauncherInfo.scenes) && ValueObject.util_equals(this.type, oMSLauncherInfo.type) && ValueObject.util_equals(this.creative, oMSLauncherInfo.creative) && ValueObject.util_equals(this.operationConfig, oMSLauncherInfo.operationConfig) && this.budgetType == oMSLauncherInfo.budgetType && this.ifBeRealtime == oMSLauncherInfo.ifBeRealtime && ValueObject.util_equals(this.dspId, oMSLauncherInfo.dspId) && this.issueTimestamp == oMSLauncherInfo.issueTimestamp && this.price == oMSLauncherInfo.price;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public CreativeType getCreativeType() {
        return this.creative.creativeType;
    }

    public String getLogoRatio() {
        return this.creative.logoRatio;
    }

    public String getPicUrl() {
        String str = this.creative.url;
        return TextUtils.isEmpty(str) ? this.url : str;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39638id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.version) * 41;
        OmsMerCuryData omsMerCuryData = this.viewMercury;
        int iHashCode2 = (iHashCode + (omsMerCuryData != null ? omsMerCuryData.hashCode() : 0)) * 41;
        OmsMerCuryData omsMerCuryData2 = this.skipMercury;
        int iHashCode3 = (iHashCode2 + (omsMerCuryData2 != null ? omsMerCuryData2.hashCode() : 0)) * 41;
        OmsMerCuryData omsMerCuryData3 = this.clickMercury;
        int iHashCode4 = (iHashCode3 + (omsMerCuryData3 != null ? omsMerCuryData3.hashCode() : 0)) * 41;
        OmsMerCuryData omsMerCuryData4 = this.behaviorMercury;
        int iHashCode5 = (((iHashCode4 + (omsMerCuryData4 != null ? omsMerCuryData4.hashCode() : 0)) * 41) + this.duration) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode6 = (iHashCode5 + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.href;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ADInfo aDInfo = this.f39637ad;
        int iHashCode9 = (((iHashCode8 + (aDInfo != null ? aDInfo.hashCode() : 0)) * 41) + (this.cacheEnable ? 1231 : 1237)) * 41;
        List<String> list = this.scenes;
        int iHashCode10 = (iHashCode9 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 41;
        CreativeOms creativeOms = this.creative;
        int iHashCode12 = (iHashCode11 + (creativeOms != null ? creativeOms.hashCode() : 0)) * 41;
        OperationConfig operationConfig = this.operationConfig;
        int iHashCode13 = (((((iHashCode12 + (operationConfig != null ? operationConfig.hashCode() : 0)) * 41) + this.budgetType) * 41) + (this.ifBeRealtime ? 1231 : 1237)) * 41;
        String str5 = this.dspId;
        int iHashCode14 = str5 != null ? str5.hashCode() : 0;
        long j = this.issueTimestamp;
        int i3 = ((((iHashCode13 + iHashCode14) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.price;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39638id == null) {
            this.f39638id = "";
        }
        if (this.viewMercury == null) {
            this.viewMercury = OmsMerCuryData.new_();
        }
        if (this.skipMercury == null) {
            this.skipMercury = OmsMerCuryData.new_();
        }
        if (this.clickMercury == null) {
            this.clickMercury = OmsMerCuryData.new_();
        }
        if (this.behaviorMercury == null) {
            this.behaviorMercury = OmsMerCuryData.new_();
        }
        if (this.constraint == null) {
            this.constraint = OMSDisplayRule.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.href == null) {
            this.href = "";
        }
        if (this.scenes == null) {
            this.scenes = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.creative == null) {
            this.creative = CreativeOms.new_();
        }
        if (this.operationConfig == null) {
            this.operationConfig = OperationConfig.new_();
        }
        if (this.dspId == null) {
            this.dspId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
