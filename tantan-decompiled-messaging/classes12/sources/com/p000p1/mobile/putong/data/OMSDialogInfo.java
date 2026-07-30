package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSDialogInfo;
import com.p000p1.mobile.putong.data.TriggerEvent;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    public String f246id;

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

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDialogInfo oMSDialogInfo) {
            String str = oMSDialogInfo.f246id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, oMSDialogInfo.version) + CodedOutputByteBufferNano.b(4, oMSDialogInfo.independent);
            OMSDisplayRule oMSDisplayRule = oMSDialogInfo.constraint;
            if (oMSDisplayRule != null) {
                iH += CodedOutputByteBufferNano.l(5, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSTriggerRule oMSTriggerRule = oMSDialogInfo.rule;
            if (oMSTriggerRule != null) {
                iH += CodedOutputByteBufferNano.l(6, oMSTriggerRule, OMSTriggerRule.PROTOBUF_ADAPTER);
            }
            List<TriggerEvent> list = oMSDialogInfo.events;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(7, list, TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSPositionInfo oMSPositionInfo = oMSDialogInfo.position;
            if (oMSPositionInfo != null) {
                iH += CodedOutputByteBufferNano.l(8, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            int iB = iH + CodedOutputByteBufferNano.b(9, oMSDialogInfo.remote) + CodedOutputByteBufferNano.b(10, oMSDialogInfo.blockCard);
            OmsMerCuryData omsMerCuryData = oMSDialogInfo.mercury;
            if (omsMerCuryData != null) {
                iB += CodedOutputByteBufferNano.l(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(12, oMSDialogInfo.cancelAble);
            OMSDialogType oMSDialogType = oMSDialogInfo.contentType;
            if (oMSDialogType != null) {
                iB2 += CodedOutputByteBufferNano.h(13, oMSDialogType.ordinal());
            }
            OMSDialogContent oMSDialogContent = oMSDialogInfo.content;
            if (oMSDialogContent != null) {
                iB2 += CodedOutputByteBufferNano.l(14, oMSDialogContent, OMSDialogContent.PROTOBUF_ADAPTER);
            }
            Map<String, String> map = oMSDialogInfo.variableMap;
            if (map != null) {
                iB2 += CodedOutputByteBufferNano.l(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(16, oMSDialogInfo.needLanguage);
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            if (oMSLanguageInfo != null) {
                iB3 += CodedOutputByteBufferNano.l(17, oMSLanguageInfo, OMSLanguageInfo.PROTOBUF_ADAPTER);
            }
            OMSDialogType oMSDialogType2 = oMSDialogInfo.contentType;
            if (oMSDialogType2 != null) {
                iB3 += CodedOutputByteBufferNano.l(18, oMSDialogType2, OMSDialogType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSDialogInfo).cachedSize = iB3;
            return iB3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDialogInfo m18603parse(nb5 nb5Var) throws IOException {
            OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (oMSDialogInfo.contentType == null && numValueOf != null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialogInfo.f246id == null) {
                            oMSDialogInfo.f246id = "";
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
                        oMSDialogInfo.f246id = nb5Var.s();
                        continue;
                    case 18:
                        oMSDialogInfo.identifier = nb5Var.s();
                        continue;
                    case 24:
                        oMSDialogInfo.version = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        oMSDialogInfo.independent = nb5Var.g();
                        continue;
                    case 42:
                        oMSDialogInfo.constraint = (OMSDisplayRule) nb5Var.l(OMSDisplayRule.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSDialogInfo.rule = (OMSTriggerRule) nb5Var.l(OMSTriggerRule.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        oMSDialogInfo.events = (List) nb5Var.l(TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        oMSDialogInfo.position = (OMSPositionInfo) nb5Var.l(OMSPositionInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 72:
                        oMSDialogInfo.remote = nb5Var.g();
                        continue;
                    case 80:
                        oMSDialogInfo.blockCard = nb5Var.g();
                        continue;
                    case 90:
                        oMSDialogInfo.mercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 96:
                        oMSDialogInfo.cancelAble = nb5Var.g();
                        continue;
                    case 104:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 114:
                        oMSDialogInfo.content = (OMSDialogContent) nb5Var.l(OMSDialogContent.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        oMSDialogInfo.variableMap = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 128:
                        oMSDialogInfo.needLanguage = nb5Var.g();
                        continue;
                    case 138:
                        oMSDialogInfo.languages = (OMSLanguageInfo) nb5Var.l(OMSLanguageInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        oMSDialogInfo.contentType = (OMSDialogType) nb5Var.l(OMSDialogType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSDialogInfo.contentType == null && numValueOf != null) {
                            oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialogInfo.f246id == null) {
                            oMSDialogInfo.f246id = "";
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

        public void serialize(OMSDialogInfo oMSDialogInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDialogInfo.f246id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, oMSDialogInfo.version);
            codedOutputByteBufferNano.A(4, oMSDialogInfo.independent);
            OMSDisplayRule oMSDisplayRule = oMSDialogInfo.constraint;
            if (oMSDisplayRule != null) {
                codedOutputByteBufferNano.K(5, oMSDisplayRule, OMSDisplayRule.PROTOBUF_ADAPTER);
            }
            OMSTriggerRule oMSTriggerRule = oMSDialogInfo.rule;
            if (oMSTriggerRule != null) {
                codedOutputByteBufferNano.K(6, oMSTriggerRule, OMSTriggerRule.PROTOBUF_ADAPTER);
            }
            List<TriggerEvent> list = oMSDialogInfo.events;
            if (list != null) {
                codedOutputByteBufferNano.K(7, list, TriggerEvent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSPositionInfo oMSPositionInfo = oMSDialogInfo.position;
            if (oMSPositionInfo != null) {
                codedOutputByteBufferNano.K(8, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(9, oMSDialogInfo.remote);
            codedOutputByteBufferNano.A(10, oMSDialogInfo.blockCard);
            OmsMerCuryData omsMerCuryData = oMSDialogInfo.mercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.K(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(12, oMSDialogInfo.cancelAble);
            OMSDialogType oMSDialogType = oMSDialogInfo.contentType;
            if (oMSDialogType != null) {
                codedOutputByteBufferNano.G(13, oMSDialogType.ordinal());
            }
            OMSDialogContent oMSDialogContent = oMSDialogInfo.content;
            if (oMSDialogContent != null) {
                codedOutputByteBufferNano.K(14, oMSDialogContent, OMSDialogContent.PROTOBUF_ADAPTER);
            }
            Map<String, String> map = oMSDialogInfo.variableMap;
            if (map != null) {
                codedOutputByteBufferNano.K(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            codedOutputByteBufferNano.A(16, oMSDialogInfo.needLanguage);
            OMSLanguageInfo oMSLanguageInfo = oMSDialogInfo.languages;
            if (oMSLanguageInfo != null) {
                codedOutputByteBufferNano.K(17, oMSLanguageInfo, OMSLanguageInfo.PROTOBUF_ADAPTER);
            }
            OMSDialogType oMSDialogType2 = oMSDialogInfo.contentType;
            if (oMSDialogType2 != null) {
                codedOutputByteBufferNano.K(18, oMSDialogType2, OMSDialogType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogInfo>() { // from class: com.p1.mobile.putong.data.OMSDialogInfo.2
        public Class getDataClass() {
            return OMSDialogInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDialogInfo mo17830newInstance() {
            return new OMSDialogInfo();
        }

        public boolean parseField(OMSDialogInfo oMSDialogInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "variableMap":
                    oMSDialogInfo.variableMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "identifier":
                    oMSDialogInfo.identifier = jsonParser.getValueAsString();
                    return true;
                case "events":
                    oMSDialogInfo.events = JsonAdapter.parseArray(jsonParser, TriggerEvent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "independent":
                    oMSDialogInfo.independent = jsonParser.getValueAsBoolean();
                    return true;
                case "remote":
                    oMSDialogInfo.remote = jsonParser.getValueAsBoolean();
                    return true;
                case "contentType":
                    oMSDialogInfo.contentType = (OMSDialogType) OMSDialogType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "constraint":
                    oMSDialogInfo.constraint = (OMSDisplayRule) OMSDisplayRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "needLanguage":
                    oMSDialogInfo.needLanguage = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    oMSDialogInfo.f246id = jsonParser.getValueAsString();
                    return false;
                case "rule":
                    oMSDialogInfo.rule = (OMSTriggerRule) OMSTriggerRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    oMSDialogInfo.version = jsonParser.getValueAsInt();
                    return true;
                case "position":
                    oMSDialogInfo.position = (OMSPositionInfo) OMSPositionInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "blockCard":
                    oMSDialogInfo.blockCard = jsonParser.getValueAsBoolean();
                    return true;
                case "content":
                    oMSDialogInfo.content = (OMSDialogContent) OMSDialogContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mercury":
                    oMSDialogInfo.mercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "languages":
                    oMSDialogInfo.languages = (OMSLanguageInfo) OMSLanguageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cancelAble":
                    oMSDialogInfo.cancelAble = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDialogInfo oMSDialogInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "variableMap":
                case "identifier":
                case "events":
                case "independent":
                case "remote":
                case "contentType":
                case "constraint":
                case "needLanguage":
                    return true;
                case "id":
                    return false;
                case "rule":
                case "version":
                case "position":
                case "blockCard":
                case "content":
                case "mercury":
                case "languages":
                case "cancelAble":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDialogInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogInfo oMSDialogInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDialogInfo.f246id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = oMSDialogInfo.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            jsonGenerator.writeNumberField("version", oMSDialogInfo.version);
            jsonGenerator.writeBooleanField("independent", oMSDialogInfo.independent);
            if (oMSDialogInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSDisplayRule.JSON_ADAPTER.serialize(oMSDialogInfo.constraint, jsonGenerator, true);
            }
            if (oMSDialogInfo.rule != null) {
                jsonGenerator.writeFieldName("rule");
                OMSTriggerRule.JSON_ADAPTER.serialize(oMSDialogInfo.rule, jsonGenerator, true);
            }
            if (oMSDialogInfo.events != null) {
                jsonGenerator.writeFieldName("events");
                JsonAdapter.serializeArray(oMSDialogInfo.events, jsonGenerator, TriggerEvent.JSON_ADAPTER);
            }
            if (oMSDialogInfo.position != null) {
                jsonGenerator.writeFieldName(Position.TYPE);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m821a(String str) {
        return str;
    }

    public static OMSDialogInfo new_() {
        OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
        oMSDialogInfo.nullCheck();
        return oMSDialogInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDialogInfo m18602clone() {
        OMSDialogInfo oMSDialogInfo = new OMSDialogInfo();
        oMSDialogInfo.f246id = this.f246id;
        oMSDialogInfo.identifier = this.identifier;
        oMSDialogInfo.version = this.version;
        oMSDialogInfo.independent = this.independent;
        OMSDisplayRule oMSDisplayRule = this.constraint;
        if (oMSDisplayRule != null) {
            oMSDialogInfo.constraint = oMSDisplayRule.m18608clone();
        }
        OMSTriggerRule oMSTriggerRule = this.rule;
        if (oMSTriggerRule != null) {
            oMSDialogInfo.rule = oMSTriggerRule.m18683clone();
        }
        List<TriggerEvent> list = this.events;
        if (list != null) {
            oMSDialogInfo.events = ValueObject.util_map(list, new w9j() { // from class: l.ty40
                public final Object call(Object obj) {
                    return ((TriggerEvent) obj).m19117clone();
                }
            });
        }
        OMSPositionInfo oMSPositionInfo = this.position;
        if (oMSPositionInfo != null) {
            oMSDialogInfo.position = oMSPositionInfo.m18644clone();
        }
        oMSDialogInfo.remote = this.remote;
        oMSDialogInfo.blockCard = this.blockCard;
        OmsMerCuryData omsMerCuryData = this.mercury;
        if (omsMerCuryData != null) {
            oMSDialogInfo.mercury = omsMerCuryData.m18722clone();
        }
        oMSDialogInfo.cancelAble = this.cancelAble;
        oMSDialogInfo.contentType = this.contentType;
        OMSDialogContent oMSDialogContent = this.content;
        if (oMSDialogContent != null) {
            oMSDialogInfo.content = oMSDialogContent.m18596clone();
        }
        Map<String, String> map = this.variableMap;
        if (map != null) {
            oMSDialogInfo.variableMap = ValueObject.util_map(map, new w9j() { // from class: l.uy40
                public final Object call(Object obj) {
                    return OMSDialogInfo.m821a((String) obj);
                }
            });
        }
        oMSDialogInfo.needLanguage = this.needLanguage;
        OMSLanguageInfo oMSLanguageInfo = this.languages;
        if (oMSLanguageInfo != null) {
            oMSDialogInfo.languages = oMSLanguageInfo.m18632clone();
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
        return ValueObject.util_equals(this.f246id, oMSDialogInfo.f246id) && ValueObject.util_equals(this.identifier, oMSDialogInfo.identifier) && this.version == oMSDialogInfo.version && this.independent == oMSDialogInfo.independent && ValueObject.util_equals(this.constraint, oMSDialogInfo.constraint) && ValueObject.util_equals(this.rule, oMSDialogInfo.rule) && ValueObject.util_equals(this.events, oMSDialogInfo.events) && ValueObject.util_equals(this.position, oMSDialogInfo.position) && this.remote == oMSDialogInfo.remote && this.blockCard == oMSDialogInfo.blockCard && ValueObject.util_equals(this.mercury, oMSDialogInfo.mercury) && this.cancelAble == oMSDialogInfo.cancelAble && ValueObject.util_equals(this.contentType, oMSDialogInfo.contentType) && ValueObject.util_equals(this.content, oMSDialogInfo.content) && ValueObject.util_equals(this.variableMap, oMSDialogInfo.variableMap) && this.needLanguage == oMSDialogInfo.needLanguage && ValueObject.util_equals(this.languages, oMSDialogInfo.languages);
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
        String str = this.f246id;
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
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public void nullCheck() {
        if (this.f246id == null) {
            this.f246id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
