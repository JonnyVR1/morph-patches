package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.TriggerEvent;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OMSDialogInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdialoginfo";

    @ProtobufIndex(index = 10)
    public boolean blockCard;

    @ProtobufIndex(index = 12)
    public boolean cancelAble;

    @NonNull
    @ProtobufIndex(index = 5)
    public OMSDisplayRule constraint;

    @NonNull
    @ProtobufIndex(index = 14)
    public OMSDialogContent content;

    @NonNull
    @ProtobufIndex(index = 13)
    public OMSDialogType contentType;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<TriggerEvent> events;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38785id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String identifier;

    @ProtobufIndex(index = 4)
    public boolean independent;

    @NonNull
    @ProtobufIndex(index = 17)
    public OMSLanguageInfo languages;

    @NonNull
    @ProtobufIndex(index = 11)
    public OmsMerCuryData mercury;

    @ProtobufIndex(index = 16)
    public boolean needLanguage;

    @NonNull
    @ProtobufIndex(index = 8)
    public OMSPositionInfo position;

    @ProtobufIndex(index = 9)
    public boolean remote;

    @NonNull
    @ProtobufIndex(index = 6)
    public OMSTriggerRule rule;

    @NonNull
    @ProtobufIndex(index = 15)
    public Map<String, String> variableMap;

    @ProtobufIndex(index = 3)
    public int version;
    public static ProtobufAdapter<OMSDialogInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDialogInfo>() { // from class: com.p1.mobile.putong.data.OMSDialogInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDialogInfo oMSDialogInfo) {
            String str = oMSDialogInfo.f38785id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, oMSDialogInfo.version) + CodedOutputByteBufferNano.m17220b(4, oMSDialogInfo.independent);
            OMSDisplayRule oMSDisplayRule = oMSDialogInfo.constraint;
            if (oMSDisplayRule != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSTriggerRule oMSTriggerRule = oMSDialogInfo.rule;
            if (oMSTriggerRule != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, oMSTriggerRule, OMSTriggerRule.PROTOBUF_ADAPTER);
            }
            List<TriggerEvent> list = oMSDialogInfo.events;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, list, TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSPositionInfo oMSPositionInfo = oMSDialogInfo.position;
            if (oMSPositionInfo != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(9, oMSDialogInfo.remote) + CodedOutputByteBufferNano.m17220b(10, oMSDialogInfo.blockCard);
            OmsMerCuryData omsMerCuryData = oMSDialogInfo.mercury;
            if (omsMerCuryData != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(12, oMSDialogInfo.cancelAble);
            OMSDialogType oMSDialogType = oMSDialogInfo.contentType;
            if (oMSDialogType != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17226h(13, oMSDialogType.ordinal());
            }
            OMSDialogContent oMSDialogContent = oMSDialogInfo.content;
            if (oMSDialogContent != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(14, oMSDialogContent, OMSDialogContent.PROTOBUF_ADAPTER);
            }
            Map<String, String> map = oMSDialogInfo.variableMap;
            if (map != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(16, oMSDialogInfo.needLanguage);
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            if (oMSLanguageInfo != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(17, oMSLanguageInfo, OMSLanguageInfo.PROTOBUF_ADAPTER);
            }
            OMSDialogType oMSDialogType2 = oMSDialogInfo.contentType;
            if (oMSDialogType2 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17230l(18, oMSDialogType2, OMSDialogType.PROTOBUF_ADAPTER);
            }
            oMSDialogInfo.cachedSize = iM17220b3;
            return iM17220b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDialogInfo parse(nb5 nb5Var) throws IOException {
            OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (oMSDialogInfo.contentType == null && numValueOf != null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialogInfo.f38785id == null) {
                            oMSDialogInfo.f38785id = "";
                        }
                        if (oMSDialogInfo.identifier == null) {
                            oMSDialogInfo.identifier = "";
                        }
                        if (oMSDialogInfo.constraint == null) {
                            oMSDialogInfo.constraint = OMSDisplayRule.new_();
                        }
                        if (oMSDialogInfo.rule == null) {
                            oMSDialogInfo.rule = OMSTriggerRule.new_();
                        }
                        if (oMSDialogInfo.events == null) {
                            oMSDialogInfo.events = new ArrayList();
                        }
                        if (oMSDialogInfo.position == null) {
                            oMSDialogInfo.position = OMSPositionInfo.new_();
                        }
                        if (oMSDialogInfo.mercury == null) {
                            oMSDialogInfo.mercury = OmsMerCuryData.new_();
                        }
                        if (oMSDialogInfo.contentType == null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialogInfo.content == null) {
                            oMSDialogInfo.content = OMSDialogContent.new_();
                        }
                        if (oMSDialogInfo.variableMap == null) {
                            oMSDialogInfo.variableMap = Collections.EMPTY_MAP;
                        }
                        if (oMSDialogInfo.languages == null) {
                            oMSDialogInfo.languages = OMSLanguageInfo.new_();
                        }
                        break;
                    case 10:
                        oMSDialogInfo.f38785id = nb5Var.m158750s();
                        continue;
                    case 18:
                        oMSDialogInfo.identifier = nb5Var.m158750s();
                        continue;
                    case 24:
                        oMSDialogInfo.version = nb5Var.m158741j();
                        continue;
                    case 32:
                        oMSDialogInfo.independent = nb5Var.m158738g();
                        continue;
                    case 42:
                        oMSDialogInfo.constraint = (OMSDisplayRule) nb5Var.m158743l(OMSDisplayRule.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSDialogInfo.rule = (OMSTriggerRule) nb5Var.m158743l(OMSTriggerRule.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        oMSDialogInfo.events = (List) nb5Var.m158743l(TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        oMSDialogInfo.position = (OMSPositionInfo) nb5Var.m158743l(OMSPositionInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 72:
                        oMSDialogInfo.remote = nb5Var.m158738g();
                        continue;
                    case 80:
                        oMSDialogInfo.blockCard = nb5Var.m158738g();
                        continue;
                    case 90:
                        oMSDialogInfo.mercury = (OmsMerCuryData) nb5Var.m158743l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case Opcodes.IADD /* 96 */:
                        oMSDialogInfo.cancelAble = nb5Var.m158738g();
                        continue;
                    case 104:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 114:
                        oMSDialogInfo.content = (OMSDialogContent) nb5Var.m158743l(OMSDialogContent.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        oMSDialogInfo.variableMap = (Map) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 128:
                        oMSDialogInfo.needLanguage = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        oMSDialogInfo.languages = (OMSLanguageInfo) nb5Var.m158743l(OMSLanguageInfo.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        oMSDialogInfo.contentType = (OMSDialogType) nb5Var.m158743l(OMSDialogType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSDialogInfo.contentType == null && numValueOf != null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialogInfo.f38785id == null) {
                            oMSDialogInfo.f38785id = "";
                        }
                        if (oMSDialogInfo.identifier == null) {
                            oMSDialogInfo.identifier = "";
                        }
                        if (oMSDialogInfo.constraint == null) {
                            oMSDialogInfo.constraint = OMSDisplayRule.new_();
                        }
                        if (oMSDialogInfo.rule == null) {
                            oMSDialogInfo.rule = OMSTriggerRule.new_();
                        }
                        if (oMSDialogInfo.events == null) {
                            oMSDialogInfo.events = new ArrayList();
                        }
                        if (oMSDialogInfo.position == null) {
                            oMSDialogInfo.position = OMSPositionInfo.new_();
                        }
                        if (oMSDialogInfo.mercury == null) {
                            oMSDialogInfo.mercury = OmsMerCuryData.new_();
                        }
                        if (oMSDialogInfo.contentType == null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialogInfo.content == null) {
                            oMSDialogInfo.content = OMSDialogContent.new_();
                        }
                        if (oMSDialogInfo.variableMap == null) {
                            oMSDialogInfo.variableMap = Collections.EMPTY_MAP;
                        }
                        if (oMSDialogInfo.languages == null) {
                            oMSDialogInfo.languages = OMSLanguageInfo.new_();
                            return oMSDialogInfo;
                        }
                        break;
                }
            }
            return oMSDialogInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDialogInfo oMSDialogInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDialogInfo.f38785id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, oMSDialogInfo.version);
            codedOutputByteBufferNano.m17244A(4, oMSDialogInfo.independent);
            OMSDisplayRule oMSDisplayRule = oMSDialogInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.m17254K(5, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSTriggerRule oMSTriggerRule = oMSDialogInfo.rule;
            if (oMSTriggerRule != null) {
                codedOutputByteBufferNano.m17254K(6, oMSTriggerRule, OMSTriggerRule.PROTOBUF_ADAPTER);
            }
            List<TriggerEvent> list = oMSDialogInfo.events;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(7, list, TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSPositionInfo oMSPositionInfo = oMSDialogInfo.position;
            if (oMSPositionInfo != null) {
                codedOutputByteBufferNano.m17254K(8, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(9, oMSDialogInfo.remote);
            codedOutputByteBufferNano.m17244A(10, oMSDialogInfo.blockCard);
            OmsMerCuryData omsMerCuryData = oMSDialogInfo.mercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.m17254K(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(12, oMSDialogInfo.cancelAble);
            OMSDialogType oMSDialogType = oMSDialogInfo.contentType;
            if (oMSDialogType != null) {
                codedOutputByteBufferNano.m17250G(13, oMSDialogType.ordinal());
            }
            OMSDialogContent oMSDialogContent = oMSDialogInfo.content;
            if (oMSDialogContent != null) {
                codedOutputByteBufferNano.m17254K(14, oMSDialogContent, OMSDialogContent.PROTOBUF_ADAPTER);
            }
            Map<String, String> map = oMSDialogInfo.variableMap;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(16, oMSDialogInfo.needLanguage);
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            if (oMSLanguageInfo != null) {
                codedOutputByteBufferNano.m17254K(17, oMSLanguageInfo, OMSLanguageInfo.PROTOBUF_ADAPTER);
            }
            OMSDialogType oMSDialogType2 = oMSDialogInfo.contentType;
            if (oMSDialogType2 != null) {
                codedOutputByteBufferNano.m17254K(18, oMSDialogType2, OMSDialogType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogInfo>() { // from class: com.p1.mobile.putong.data.OMSDialogInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDialogInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDialogInfo newInstance() {
            return new OMSDialogInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(OMSDialogInfo oMSDialogInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1951696576:
                    if (str.equals("variableMap")) {
                        b = 0;
                    }
                    break;
                case -1618432855:
                    if (str.equals("identifier")) {
                        b = 1;
                    }
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        b = 2;
                    }
                    break;
                case -952207494:
                    if (str.equals("independent")) {
                        b = 3;
                    }
                    break;
                case -934610874:
                    if (str.equals("remote")) {
                        b = 4;
                    }
                    break;
                case -389131437:
                    if (str.equals("contentType")) {
                        b = 5;
                    }
                    break;
                case -190376483:
                    if (str.equals("constraint")) {
                        b = 6;
                    }
                    break;
                case -68056562:
                    if (str.equals("needLanguage")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3512060:
                    if (str.equals(Message.RULE)) {
                        b = 9;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 10;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = 11;
                    }
                    break;
                case 871933245:
                    if (str.equals("blockCard")) {
                        b = 12;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 953544467:
                    if (str.equals("mercury")) {
                        b = 14;
                    }
                    break;
                case 1518327835:
                    if (str.equals("languages")) {
                        b = 15;
                    }
                    break;
                case 1888054004:
                    if (str.equals("cancelAble")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    oMSDialogInfo.variableMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case 1:
                    oMSDialogInfo.identifier = jsonParser.getValueAsString();
                    return true;
                case 2:
                    oMSDialogInfo.events = JsonAdapter.parseArray(jsonParser, TriggerEvent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    oMSDialogInfo.independent = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    oMSDialogInfo.remote = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    oMSDialogInfo.contentType = OMSDialogType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 6:
                    oMSDialogInfo.constraint = OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    oMSDialogInfo.needLanguage = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    oMSDialogInfo.f38785id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    oMSDialogInfo.rule = OMSTriggerRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    oMSDialogInfo.version = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    oMSDialogInfo.position = OMSPositionInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    oMSDialogInfo.blockCard = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    oMSDialogInfo.content = OMSDialogContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    oMSDialogInfo.mercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    oMSDialogInfo.languages = OMSLanguageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    oMSDialogInfo.cancelAble = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(OMSDialogInfo oMSDialogInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1951696576:
                    if (str.equals("variableMap")) {
                        b = 0;
                    }
                    break;
                case -1618432855:
                    if (str.equals("identifier")) {
                        b = 1;
                    }
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        b = 2;
                    }
                    break;
                case -952207494:
                    if (str.equals("independent")) {
                        b = 3;
                    }
                    break;
                case -934610874:
                    if (str.equals("remote")) {
                        b = 4;
                    }
                    break;
                case -389131437:
                    if (str.equals("contentType")) {
                        b = 5;
                    }
                    break;
                case -190376483:
                    if (str.equals("constraint")) {
                        b = 6;
                    }
                    break;
                case -68056562:
                    if (str.equals("needLanguage")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3512060:
                    if (str.equals(Message.RULE)) {
                        b = 9;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 10;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = 11;
                    }
                    break;
                case 871933245:
                    if (str.equals("blockCard")) {
                        b = 12;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 953544467:
                    if (str.equals("mercury")) {
                        b = 14;
                    }
                    break;
                case 1518327835:
                    if (str.equals("languages")) {
                        b = 15;
                    }
                    break;
                case 1888054004:
                    if (str.equals("cancelAble")) {
                        b = Tnaf.POW_2_WIDTH;
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
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(oMSDialogInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogInfo oMSDialogInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDialogInfo.f38785id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, oMSDialogInfo.version);
            jsonGenerator.writeBooleanField("independent", oMSDialogInfo.independent);
            if (oMSDialogInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSDialogInfo.constraint, jsonGenerator, true);
            }
            if (oMSDialogInfo.rule != null) {
                jsonGenerator.writeFieldName(Message.RULE);
                OMSTriggerRule.JSON_ADAPTER.serialize(oMSDialogInfo.rule, jsonGenerator, true);
            }
            if (oMSDialogInfo.events != null) {
                jsonGenerator.writeFieldName("events");
                JsonAdapter.serializeArray(oMSDialogInfo.events, jsonGenerator, TriggerEvent.JSON_ADAPTER);
            }
            if (oMSDialogInfo.position != null) {
                jsonGenerator.writeFieldName("position");
                OMSPositionInfo.JSON_ADAPTER.serialize(oMSDialogInfo.position, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("remote", oMSDialogInfo.remote);
            jsonGenerator.writeBooleanField("blockCard", oMSDialogInfo.blockCard);
            if (oMSDialogInfo.mercury != null) {
                jsonGenerator.writeFieldName("mercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSDialogInfo.mercury, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("cancelAble", oMSDialogInfo.cancelAble);
            if (oMSDialogInfo.contentType != null) {
                jsonGenerator.writeFieldName("contentType");
                OMSDialogType.JSON_ADAPTER.serialize(oMSDialogInfo.contentType, jsonGenerator, true);
            }
            if (oMSDialogInfo.content != null) {
                jsonGenerator.writeFieldName("content");
                OMSDialogContent.JSON_ADAPTER.serialize(oMSDialogInfo.content, jsonGenerator, true);
            }
            if (oMSDialogInfo.variableMap != null) {
                jsonGenerator.writeFieldName("variableMap");
                JsonAdapter.serializeMap(oMSDialogInfo.variableMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("needLanguage", oMSDialogInfo.needLanguage);
            if (oMSDialogInfo.languages != null) {
                jsonGenerator.writeFieldName("languages");
                OMSLanguageInfo.JSON_ADAPTER.serialize(oMSDialogInfo.languages, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59903a(String str) {
        return str;
    }

    public static OMSDialogInfo new_() {
        OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
        oMSDialogInfo.nullCheck();
        return oMSDialogInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDialogInfo mo223809clone() {
        OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
        oMSDialogInfo.f38785id = this.f38785id;
        oMSDialogInfo.identifier = this.identifier;
        oMSDialogInfo.version = this.version;
        oMSDialogInfo.independent = this.independent;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSDialogInfo.constraint = oMSDisplayRule.mo223809clone();
        }
        OMSTriggerRule oMSTriggerRule = this.rule;
        if (oMSTriggerRule != null) {
            oMSDialogInfo.rule = oMSTriggerRule.mo223809clone();
        }
        List<TriggerEvent> list = this.events;
        if (list != null) {
            oMSDialogInfo.events = ValueObject.util_map(list, new w9j() { // from class: l.ty40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TriggerEvent) obj).mo223809clone();
                }
            });
        }
        OMSPositionInfo oMSPositionInfo = this.position;
        if (oMSPositionInfo != null) {
            oMSDialogInfo.position = oMSPositionInfo.mo223809clone();
        }
        oMSDialogInfo.remote = this.remote;
        oMSDialogInfo.blockCard = this.blockCard;
        OmsMerCuryData omsMerCuryData = this.mercury;
        if (omsMerCuryData != null) {
            oMSDialogInfo.mercury = omsMerCuryData.mo223809clone();
        }
        oMSDialogInfo.cancelAble = this.cancelAble;
        oMSDialogInfo.contentType = this.contentType;
        OMSDialogContent oMSDialogContent = this.content;
        if (oMSDialogContent != null) {
            oMSDialogInfo.content = oMSDialogContent.mo223809clone();
        }
        Map<String, String> map = this.variableMap;
        if (map != null) {
            oMSDialogInfo.variableMap = ValueObject.util_map(map, new w9j() { // from class: l.uy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OMSDialogInfo.m59903a((String) obj);
                }
            });
        }
        oMSDialogInfo.needLanguage = this.needLanguage;
        OMSLanguageInfo oMSLanguageInfo = this.languages;
        if (oMSLanguageInfo != null) {
            oMSDialogInfo.languages = oMSLanguageInfo.mo223809clone();
        }
        return oMSDialogInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDialogInfo)) {
            return false;
        }
        OMSDialogInfo oMSDialogInfo = (OMSDialogInfo) obj;
        return ValueObject.util_equals(this.f38785id, oMSDialogInfo.f38785id) && ValueObject.util_equals(this.identifier, oMSDialogInfo.identifier) && this.version == oMSDialogInfo.version && this.independent == oMSDialogInfo.independent && ValueObject.util_equals(this.constraint, oMSDialogInfo.constraint) && ValueObject.util_equals(this.rule, oMSDialogInfo.rule) && ValueObject.util_equals(this.events, oMSDialogInfo.events) && ValueObject.util_equals(this.position, oMSDialogInfo.position) && this.remote == oMSDialogInfo.remote && this.blockCard == oMSDialogInfo.blockCard && ValueObject.util_equals(this.mercury, oMSDialogInfo.mercury) && this.cancelAble == oMSDialogInfo.cancelAble && ValueObject.util_equals(this.contentType, oMSDialogInfo.contentType) && ValueObject.util_equals(this.content, oMSDialogInfo.content) && ValueObject.util_equals(this.variableMap, oMSDialogInfo.variableMap) && this.needLanguage == oMSDialogInfo.needLanguage && ValueObject.util_equals(this.languages, oMSDialogInfo.languages);
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
        String str = this.f38785id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.version) * 41) + (this.independent ? 1231 : 1237)) * 41;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        int iHashCode3 = (iHashCode2 + (oMSDisplayRule != null ? oMSDisplayRule.hashCode() : 0)) * 41;
        OMSTriggerRule oMSTriggerRule = this.rule;
        int iHashCode4 = (iHashCode3 + (oMSTriggerRule != null ? oMSTriggerRule.hashCode() : 0)) * 41;
        List<TriggerEvent> list = this.events;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        OMSPositionInfo oMSPositionInfo = this.position;
        int iHashCode6 = (((((iHashCode5 + (oMSPositionInfo != null ? oMSPositionInfo.hashCode() : 0)) * 41) + (this.remote ? 1231 : 1237)) * 41) + (this.blockCard ? 1231 : 1237)) * 41;
        OmsMerCuryData omsMerCuryData = this.mercury;
        int iHashCode7 = (((iHashCode6 + (omsMerCuryData != null ? omsMerCuryData.hashCode() : 0)) * 41) + (this.cancelAble ? 1231 : 1237)) * 41;
        OMSDialogType oMSDialogType = this.contentType;
        int iHashCode8 = (iHashCode7 + (oMSDialogType != null ? oMSDialogType.hashCode() : 0)) * 41;
        OMSDialogContent oMSDialogContent = this.content;
        int iHashCode9 = (iHashCode8 + (oMSDialogContent != null ? oMSDialogContent.hashCode() : 0)) * 41;
        Map<String, String> map = this.variableMap;
        int iHashCode10 = (((iHashCode9 + (map != null ? map.hashCode() : 0)) * 41) + (this.needLanguage ? 1231 : 1237)) * 41;
        OMSLanguageInfo oMSLanguageInfo = this.languages;
        int iHashCode11 = iHashCode10 + (oMSLanguageInfo != null ? oMSLanguageInfo.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38785id == null) {
            this.f38785id = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
        if (this.constraint == null) {
            this.constraint = OMSDisplayRule.new_();
        }
        if (this.rule == null) {
            this.rule = OMSTriggerRule.new_();
        }
        if (this.events == null) {
            this.events = new ArrayList();
        }
        if (this.position == null) {
            this.position = OMSPositionInfo.new_();
        }
        if (this.mercury == null) {
            this.mercury = OmsMerCuryData.new_();
        }
        if (this.contentType == null) {
            this.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.defaultEnum();
        }
        if (this.content == null) {
            this.content = OMSDialogContent.new_();
        }
        if (this.variableMap == null) {
            this.variableMap = Collections.EMPTY_MAP;
        }
        if (this.languages == null) {
            this.languages = OMSLanguageInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
