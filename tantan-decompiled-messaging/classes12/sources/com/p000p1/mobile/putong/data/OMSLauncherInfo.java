package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSLauncherInfo;
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
public class OMSLauncherInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omslauncherinfo";

    /* JADX INFO: renamed from: ad */
    @Nullable
    @ProtobufIndex(index = 11)
    public ADInfo f250ad;

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
    public String f251id;

    @ProtobufIndex(index = 18)
    public boolean ifBeRealtime;
    public boolean isUseCache = false;

    @ProtobufIndex(index = 20)
    public long issueTimestamp;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSLauncherInfo oMSLauncherInfo) {
            String str = oMSLauncherInfo.f251id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, oMSLauncherInfo.version);
            OmsMerCuryData omsMerCuryData = oMSLauncherInfo.viewMercury;
            if (omsMerCuryData != null) {
                iO += CodedOutputByteBufferNano.l(3, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.skipMercury;
            if (omsMerCuryData2 != null) {
                iO += CodedOutputByteBufferNano.l(4, omsMerCuryData2, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData3 = oMSLauncherInfo.clickMercury;
            if (omsMerCuryData3 != null) {
                iO += CodedOutputByteBufferNano.l(5, omsMerCuryData3, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData4 = oMSLauncherInfo.behaviorMercury;
            if (omsMerCuryData4 != null) {
                iO += CodedOutputByteBufferNano.l(6, omsMerCuryData4, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(7, oMSLauncherInfo.duration);
            OMSDisplayRule oMSDisplayRule = oMSLauncherInfo.constraint;
            if (oMSDisplayRule != null) {
                iH += CodedOutputByteBufferNano.l(8, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            String str2 = oMSLauncherInfo.url;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(9, str2);
            }
            String str3 = oMSLauncherInfo.href;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(10, str3);
            }
            ADInfo aDInfo = oMSLauncherInfo.f250ad;
            if (aDInfo != null) {
                iH += CodedOutputByteBufferNano.l(11, aDInfo, ADInfo.PROTOBUF_ADAPTER);
            }
            int iB = iH + CodedOutputByteBufferNano.b(12, oMSLauncherInfo.cacheEnable);
            List<String> list = oMSLauncherInfo.scenes;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(13, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = oMSLauncherInfo.type;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(14, str4);
            }
            CreativeOms creativeOms = oMSLauncherInfo.creative;
            if (creativeOms != null) {
                iB += CodedOutputByteBufferNano.l(15, creativeOms, CreativeOms.PROTOBUF_ADAPTER);
            }
            OperationConfig operationConfig = oMSLauncherInfo.operationConfig;
            if (operationConfig != null) {
                iB += CodedOutputByteBufferNano.l(16, operationConfig, OperationConfig.PROTOBUF_ADAPTER);
            }
            int iH2 = iB + CodedOutputByteBufferNano.h(17, oMSLauncherInfo.budgetType) + CodedOutputByteBufferNano.b(18, oMSLauncherInfo.ifBeRealtime);
            String str5 = oMSLauncherInfo.dspId;
            if (str5 != null) {
                iH2 += CodedOutputByteBufferNano.o(19, str5);
            }
            int iJ = iH2 + CodedOutputByteBufferNano.j(20, oMSLauncherInfo.issueTimestamp) + CodedOutputByteBufferNano.h(21, oMSLauncherInfo.price);
            ((MessageNano) oMSLauncherInfo).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSLauncherInfo m18636parse(nb5 nb5Var) throws IOException {
            OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (oMSLauncherInfo.f251id == null) {
                            oMSLauncherInfo.f251id = "";
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
                        oMSLauncherInfo.f251id = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        oMSLauncherInfo.version = nb5Var.j();
                        continue;
                    case 26:
                        oMSLauncherInfo.viewMercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        oMSLauncherInfo.skipMercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        oMSLauncherInfo.clickMercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSLauncherInfo.behaviorMercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 56:
                        oMSLauncherInfo.duration = nb5Var.j();
                        continue;
                    case 66:
                        oMSLauncherInfo.constraint = (OMSDisplayRule) nb5Var.l(OMSDisplayRule.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        oMSLauncherInfo.url = nb5Var.s();
                        continue;
                    case 82:
                        oMSLauncherInfo.href = nb5Var.s();
                        continue;
                    case 90:
                        oMSLauncherInfo.f250ad = (ADInfo) nb5Var.l(ADInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 96:
                        oMSLauncherInfo.cacheEnable = nb5Var.g();
                        continue;
                    case 106:
                        oMSLauncherInfo.scenes = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        oMSLauncherInfo.type = nb5Var.s();
                        continue;
                    case 122:
                        oMSLauncherInfo.creative = (CreativeOms) nb5Var.l(CreativeOms.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        oMSLauncherInfo.operationConfig = (OperationConfig) nb5Var.l(OperationConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 136:
                        oMSLauncherInfo.budgetType = nb5Var.j();
                        continue;
                    case 144:
                        oMSLauncherInfo.ifBeRealtime = nb5Var.g();
                        continue;
                    case 154:
                        oMSLauncherInfo.dspId = nb5Var.s();
                        continue;
                    case 160:
                        oMSLauncherInfo.issueTimestamp = nb5Var.k();
                        continue;
                    case 168:
                        oMSLauncherInfo.price = nb5Var.j();
                        continue;
                    default:
                        if (oMSLauncherInfo.f251id == null) {
                            oMSLauncherInfo.f251id = "";
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

        public void serialize(OMSLauncherInfo oMSLauncherInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSLauncherInfo.f251id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, oMSLauncherInfo.version);
            OmsMerCuryData omsMerCuryData = oMSLauncherInfo.viewMercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.K(3, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData2 = oMSLauncherInfo.skipMercury;
            if (omsMerCuryData2 != null) {
                codedOutputByteBufferNano.K(4, omsMerCuryData2, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData3 = oMSLauncherInfo.clickMercury;
            if (omsMerCuryData3 != null) {
                codedOutputByteBufferNano.K(5, omsMerCuryData3, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OmsMerCuryData omsMerCuryData4 = oMSLauncherInfo.behaviorMercury;
            if (omsMerCuryData4 != null) {
                codedOutputByteBufferNano.K(6, omsMerCuryData4, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(7, oMSLauncherInfo.duration);
            OMSDisplayRule oMSDisplayRule = oMSLauncherInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.K(8, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            String str2 = oMSLauncherInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(9, str2);
            }
            String str3 = oMSLauncherInfo.href;
            if (str3 != null) {
                codedOutputByteBufferNano.R(10, str3);
            }
            ADInfo aDInfo = oMSLauncherInfo.f250ad;
            if (aDInfo != null) {
                codedOutputByteBufferNano.K(11, aDInfo, ADInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(12, oMSLauncherInfo.cacheEnable);
            List<String> list = oMSLauncherInfo.scenes;
            if (list != null) {
                codedOutputByteBufferNano.K(13, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = oMSLauncherInfo.type;
            if (str4 != null) {
                codedOutputByteBufferNano.R(14, str4);
            }
            CreativeOms creativeOms = oMSLauncherInfo.creative;
            if (creativeOms != null) {
                codedOutputByteBufferNano.K(15, creativeOms, CreativeOms.PROTOBUF_ADAPTER);
            }
            OperationConfig operationConfig = oMSLauncherInfo.operationConfig;
            if (operationConfig != null) {
                codedOutputByteBufferNano.K(16, operationConfig, OperationConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(17, oMSLauncherInfo.budgetType);
            codedOutputByteBufferNano.A(18, oMSLauncherInfo.ifBeRealtime);
            String str5 = oMSLauncherInfo.dspId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(19, str5);
            }
            codedOutputByteBufferNano.I(20, oMSLauncherInfo.issueTimestamp);
            codedOutputByteBufferNano.G(21, oMSLauncherInfo.price);
        }
    };
    public static JsonAdapter<OMSLauncherInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSLauncherInfo>() { // from class: com.p1.mobile.putong.data.OMSLauncherInfo.2
        public Class getDataClass() {
            return OMSLauncherInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSLauncherInfo mo17830newInstance() {
            return new OMSLauncherInfo();
        }

        public boolean parseField(OMSLauncherInfo oMSLauncherInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    oMSLauncherInfo.duration = jsonParser.getValueAsInt();
                    return true;
                case "ifBeRealtime":
                    oMSLauncherInfo.ifBeRealtime = jsonParser.getValueAsBoolean();
                    return true;
                case "scenes":
                    oMSLauncherInfo.scenes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "budgetType":
                    oMSLauncherInfo.budgetType = jsonParser.getValueAsInt();
                    return true;
                case "skipMercury":
                    oMSLauncherInfo.skipMercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "constraint":
                    oMSLauncherInfo.constraint = (OMSDisplayRule) OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ad":
                    oMSLauncherInfo.f250ad = (ADInfo) ADInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSLauncherInfo.f251id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    oMSLauncherInfo.url = jsonParser.getValueAsString();
                    return true;
                case "href":
                    oMSLauncherInfo.href = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oMSLauncherInfo.type = jsonParser.getValueAsString();
                    return true;
                case "dspId":
                    oMSLauncherInfo.dspId = jsonParser.getValueAsString();
                    return true;
                case "price":
                    oMSLauncherInfo.price = jsonParser.getValueAsInt();
                    return true;
                case "cacheEnable":
                    oMSLauncherInfo.cacheEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "version":
                    oMSLauncherInfo.version = jsonParser.getValueAsInt();
                    return true;
                case "issueTimestamp":
                    oMSLauncherInfo.issueTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "viewMercury":
                    oMSLauncherInfo.viewMercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "behaviorMercury":
                    oMSLauncherInfo.behaviorMercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "clickMercury":
                    oMSLauncherInfo.clickMercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "creative":
                    oMSLauncherInfo.creative = (CreativeOms) CreativeOms.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "operationConfig":
                    oMSLauncherInfo.operationConfig = (OperationConfig) OperationConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSLauncherInfo oMSLauncherInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "ifBeRealtime":
                case "scenes":
                case "budgetType":
                case "skipMercury":
                case "constraint":
                case "ad":
                    return true;
                case "id":
                    return false;
                case "url":
                case "href":
                case "type":
                case "dspId":
                case "price":
                case "cacheEnable":
                case "version":
                case "issueTimestamp":
                case "viewMercury":
                case "behaviorMercury":
                case "clickMercury":
                case "creative":
                case "operationConfig":
                    return true;
                default:
                    return super.parseFieldCheck(oMSLauncherInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSLauncherInfo oMSLauncherInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSLauncherInfo.f251id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("version", oMSLauncherInfo.version);
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
            jsonGenerator.writeNumberField("duration", oMSLauncherInfo.duration);
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
            if (oMSLauncherInfo.f250ad != null) {
                jsonGenerator.writeFieldName("ad");
                ADInfo.JSON_ADAPTER.serialize(oMSLauncherInfo.f250ad, jsonGenerator, true);
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
                jsonGenerator.writeFieldName("creative");
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
            jsonGenerator.writeNumberField("price", oMSLauncherInfo.price);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLauncherInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLauncherInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m837a(String str) {
        return str;
    }

    public static OMSLauncherInfo new_() {
        OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
        oMSLauncherInfo.nullCheck();
        return oMSLauncherInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSLauncherInfo m18635clone() {
        OMSLauncherInfo oMSLauncherInfo = new OMSLauncherInfo();
        oMSLauncherInfo.f251id = this.f251id;
        oMSLauncherInfo.version = this.version;
        OmsMerCuryData omsMerCuryData = this.viewMercury;
        if (omsMerCuryData != null) {
            oMSLauncherInfo.viewMercury = omsMerCuryData.m18722clone();
        }
        OmsMerCuryData omsMerCuryData2 = this.skipMercury;
        if (omsMerCuryData2 != null) {
            oMSLauncherInfo.skipMercury = omsMerCuryData2.m18722clone();
        }
        OmsMerCuryData omsMerCuryData3 = this.clickMercury;
        if (omsMerCuryData3 != null) {
            oMSLauncherInfo.clickMercury = omsMerCuryData3.m18722clone();
        }
        OmsMerCuryData omsMerCuryData4 = this.behaviorMercury;
        if (omsMerCuryData4 != null) {
            oMSLauncherInfo.behaviorMercury = omsMerCuryData4.m18722clone();
        }
        oMSLauncherInfo.duration = this.duration;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSLauncherInfo.constraint = oMSDisplayRule.m18608clone();
        }
        oMSLauncherInfo.url = this.url;
        oMSLauncherInfo.href = this.href;
        ADInfo aDInfo = this.f250ad;
        if (aDInfo != null) {
            oMSLauncherInfo.f250ad = aDInfo.m17607clone();
        }
        oMSLauncherInfo.cacheEnable = this.cacheEnable;
        List<String> list = this.scenes;
        if (list != null) {
            oMSLauncherInfo.scenes = ValueObject.util_map(list, new w9j() { // from class: l.ez40
                public final Object call(Object obj) {
                    return OMSLauncherInfo.m837a((String) obj);
                }
            });
        }
        oMSLauncherInfo.type = this.type;
        CreativeOms creativeOms = this.creative;
        if (creativeOms != null) {
            oMSLauncherInfo.creative = creativeOms.m17916clone();
        }
        OperationConfig operationConfig = this.operationConfig;
        if (operationConfig != null) {
            oMSLauncherInfo.operationConfig = operationConfig.m18743clone();
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
        return ValueObject.util_equals(this.f251id, oMSLauncherInfo.f251id) && this.version == oMSLauncherInfo.version && ValueObject.util_equals(this.viewMercury, oMSLauncherInfo.viewMercury) && ValueObject.util_equals(this.skipMercury, oMSLauncherInfo.skipMercury) && ValueObject.util_equals(this.clickMercury, oMSLauncherInfo.clickMercury) && ValueObject.util_equals(this.behaviorMercury, oMSLauncherInfo.behaviorMercury) && this.duration == oMSLauncherInfo.duration && ValueObject.util_equals(this.constraint, oMSLauncherInfo.constraint) && ValueObject.util_equals(this.url, oMSLauncherInfo.url) && ValueObject.util_equals(this.href, oMSLauncherInfo.href) && ValueObject.util_equals(this.f250ad, oMSLauncherInfo.f250ad) && this.cacheEnable == oMSLauncherInfo.cacheEnable && ValueObject.util_equals(this.scenes, oMSLauncherInfo.scenes) && ValueObject.util_equals(this.type, oMSLauncherInfo.type) && ValueObject.util_equals(this.creative, oMSLauncherInfo.creative) && ValueObject.util_equals(this.operationConfig, oMSLauncherInfo.operationConfig) && this.budgetType == oMSLauncherInfo.budgetType && this.ifBeRealtime == oMSLauncherInfo.ifBeRealtime && ValueObject.util_equals(this.dspId, oMSLauncherInfo.dspId) && this.issueTimestamp == oMSLauncherInfo.issueTimestamp && this.price == oMSLauncherInfo.price;
    }

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
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f251id;
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
        ADInfo aDInfo = this.f250ad;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f251id == null) {
            this.f251id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
