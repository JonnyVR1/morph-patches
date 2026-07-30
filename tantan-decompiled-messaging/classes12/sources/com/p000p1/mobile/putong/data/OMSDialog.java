package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSAction;
import com.p000p1.mobile.putong.data.OMSDialog;
import com.p000p1.mobile.putong.data.OMSResourceContent;
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
public class OMSDialog extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdialog";

    @NonNull
    @ProtobufIndex(index = 12)
    public List<OMSAction> actions;

    @NonNull
    @ProtobufIndex(index = 13)
    public OMSMorphBaseStyle baseStyle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String bgImage;

    @NonNull
    @ProtobufIndex(index = 8)
    public String child;

    @Nullable
    @ProtobufIndex(index = 15)
    public OMSDialog childJson;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OMSResourceContent> content;

    @NonNull
    @ProtobufIndex(index = 7)
    public String foreImage;

    @NonNull
    @ProtobufIndex(index = 5)
    public String image;

    @NonNull
    @ProtobufIndex(index = 14)
    public OMSLanguageContent languageContent;

    @NonNull
    @ProtobufIndex(index = 11)
    public OmsMerCuryData mercury;

    @ProtobufIndex(index = 10)
    public boolean needApplyChild;

    @NonNull
    @ProtobufIndex(index = 9)
    public String nodes;

    @Nullable
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public List<OMSDialog> nodesJson;

    @NonNull
    @ProtobufIndex(index = 4)
    public String src;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSBaseStyle style;

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSTemplateModeType type;
    public static ProtobufAdapter<OMSDialog> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDialog>() { // from class: com.p1.mobile.putong.data.OMSDialog.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDialog oMSDialog) {
            OMSTemplateModeType oMSTemplateModeType = oMSDialog.type;
            int iH = oMSTemplateModeType != null ? CodedOutputByteBufferNano.h(1, oMSTemplateModeType.ordinal()) : 0;
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (oMSBaseStyle != null) {
                iH += CodedOutputByteBufferNano.l(2, oMSBaseStyle, OMSBaseStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSDialog.content;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSDialog.src;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = oMSDialog.image;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = oMSDialog.bgImage;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = oMSDialog.foreImage;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(7, str4);
            }
            String str5 = oMSDialog.child;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = oMSDialog.nodes;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(9, str6);
            }
            int iB = iH + CodedOutputByteBufferNano.b(10, oMSDialog.needApplyChild);
            OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
            if (omsMerCuryData != null) {
                iB += CodedOutputByteBufferNano.l(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            List<OMSAction> list2 = oMSDialog.actions;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(12, list2, OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSMorphBaseStyle oMSMorphBaseStyle = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle != null) {
                iB += CodedOutputByteBufferNano.h(13, oMSMorphBaseStyle.ordinal());
            }
            OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
            if (oMSLanguageContent != null) {
                iB += CodedOutputByteBufferNano.l(14, oMSLanguageContent, OMSLanguageContent.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog2 = oMSDialog.childJson;
            if (oMSDialog2 != null) {
                iB += CodedOutputByteBufferNano.l(15, oMSDialog2, OMSDialog.PROTOBUF_ADAPTER);
            }
            List<OMSDialog> list3 = oMSDialog.nodesJson;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(16, list3, OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSDialog.type;
            if (oMSTemplateModeType2 != null) {
                iB += CodedOutputByteBufferNano.l(17, oMSTemplateModeType2, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSMorphBaseStyle oMSMorphBaseStyle2 = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle2 != null) {
                iB += CodedOutputByteBufferNano.l(18, oMSMorphBaseStyle2, OMSMorphBaseStyle.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSDialog).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDialog m18594parse(nb5 nb5Var) throws IOException {
            OMSDialog oMSDialog = new OMSDialog();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (oMSDialog.type == null && numValueOf != null) {
                            oMSDialog.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialog.baseStyle == null && numValueOf2 != null) {
                            oMSDialog.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSDialog.type == null) {
                            oMSDialog.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialog.style == null) {
                            oMSDialog.style = OMSBaseStyle.new_();
                        }
                        if (oMSDialog.content == null) {
                            oMSDialog.content = new ArrayList();
                        }
                        if (oMSDialog.src == null) {
                            oMSDialog.src = "";
                        }
                        if (oMSDialog.image == null) {
                            oMSDialog.image = "";
                        }
                        if (oMSDialog.bgImage == null) {
                            oMSDialog.bgImage = "";
                        }
                        if (oMSDialog.foreImage == null) {
                            oMSDialog.foreImage = "";
                        }
                        if (oMSDialog.child == null) {
                            oMSDialog.child = "";
                        }
                        if (oMSDialog.nodes == null) {
                            oMSDialog.nodes = "";
                        }
                        if (oMSDialog.mercury == null) {
                            oMSDialog.mercury = OmsMerCuryData.new_();
                        }
                        if (oMSDialog.actions == null) {
                            oMSDialog.actions = new ArrayList();
                        }
                        if (oMSDialog.baseStyle == null) {
                            oMSDialog.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialog.languageContent == null) {
                            oMSDialog.languageContent = OMSLanguageContent.new_();
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 18:
                        oMSDialog.style = (OMSBaseStyle) nb5Var.l(OMSBaseStyle.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        oMSDialog.content = (List) nb5Var.l(OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        oMSDialog.src = nb5Var.s();
                        continue;
                    case 42:
                        oMSDialog.image = nb5Var.s();
                        continue;
                    case 50:
                        oMSDialog.bgImage = nb5Var.s();
                        continue;
                    case 58:
                        oMSDialog.foreImage = nb5Var.s();
                        continue;
                    case 66:
                        oMSDialog.child = nb5Var.s();
                        continue;
                    case 74:
                        oMSDialog.nodes = nb5Var.s();
                        continue;
                    case 80:
                        oMSDialog.needApplyChild = nb5Var.g();
                        continue;
                    case 90:
                        oMSDialog.mercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        oMSDialog.actions = (List) nb5Var.l(OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 104:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 114:
                        oMSDialog.languageContent = (OMSLanguageContent) nb5Var.l(OMSLanguageContent.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        oMSDialog.childJson = (OMSDialog) nb5Var.l(OMSDialog.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        oMSDialog.nodesJson = (List) nb5Var.l(OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 138:
                        oMSDialog.type = (OMSTemplateModeType) nb5Var.l(OMSTemplateModeType.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        oMSDialog.baseStyle = (OMSMorphBaseStyle) nb5Var.l(OMSMorphBaseStyle.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSDialog.type == null && numValueOf != null) {
                            oMSDialog.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSDialog.baseStyle == null && numValueOf2 != null) {
                            oMSDialog.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSDialog.type == null) {
                            oMSDialog.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialog.style == null) {
                            oMSDialog.style = OMSBaseStyle.new_();
                        }
                        if (oMSDialog.content == null) {
                            oMSDialog.content = new ArrayList();
                        }
                        if (oMSDialog.src == null) {
                            oMSDialog.src = "";
                        }
                        if (oMSDialog.image == null) {
                            oMSDialog.image = "";
                        }
                        if (oMSDialog.bgImage == null) {
                            oMSDialog.bgImage = "";
                        }
                        if (oMSDialog.foreImage == null) {
                            oMSDialog.foreImage = "";
                        }
                        if (oMSDialog.child == null) {
                            oMSDialog.child = "";
                        }
                        if (oMSDialog.nodes == null) {
                            oMSDialog.nodes = "";
                        }
                        if (oMSDialog.mercury == null) {
                            oMSDialog.mercury = OmsMerCuryData.new_();
                        }
                        if (oMSDialog.actions == null) {
                            oMSDialog.actions = new ArrayList();
                        }
                        if (oMSDialog.baseStyle == null) {
                            oMSDialog.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSDialog.languageContent == null) {
                            oMSDialog.languageContent = OMSLanguageContent.new_();
                            return oMSDialog;
                        }
                        break;
                }
            }
            return oMSDialog;
        }

        public void serialize(OMSDialog oMSDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSTemplateModeType oMSTemplateModeType = oMSDialog.type;
            if (oMSTemplateModeType != null) {
                codedOutputByteBufferNano.G(1, oMSTemplateModeType.ordinal());
            }
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (oMSBaseStyle != null) {
                codedOutputByteBufferNano.K(2, oMSBaseStyle, OMSBaseStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSDialog.content;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSDialog.src;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = oMSDialog.image;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = oMSDialog.bgImage;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = oMSDialog.foreImage;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            String str5 = oMSDialog.child;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = oMSDialog.nodes;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            codedOutputByteBufferNano.A(10, oMSDialog.needApplyChild);
            OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.K(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            List<OMSAction> list2 = oMSDialog.actions;
            if (list2 != null) {
                codedOutputByteBufferNano.K(12, list2, OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSMorphBaseStyle oMSMorphBaseStyle = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle != null) {
                codedOutputByteBufferNano.G(13, oMSMorphBaseStyle.ordinal());
            }
            OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
            if (oMSLanguageContent != null) {
                codedOutputByteBufferNano.K(14, oMSLanguageContent, OMSLanguageContent.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog2 = oMSDialog.childJson;
            if (oMSDialog2 != null) {
                codedOutputByteBufferNano.K(15, oMSDialog2, OMSDialog.PROTOBUF_ADAPTER);
            }
            List<OMSDialog> list3 = oMSDialog.nodesJson;
            if (list3 != null) {
                codedOutputByteBufferNano.K(16, list3, OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSDialog.type;
            if (oMSTemplateModeType2 != null) {
                codedOutputByteBufferNano.K(17, oMSTemplateModeType2, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSMorphBaseStyle oMSMorphBaseStyle2 = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle2 != null) {
                codedOutputByteBufferNano.K(18, oMSMorphBaseStyle2, OMSMorphBaseStyle.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialog> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialog>() { // from class: com.p1.mobile.putong.data.OMSDialog.2
        public Class getDataClass() {
            return OMSDialog.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDialog mo17830newInstance() {
            return new OMSDialog();
        }

        public boolean parseField(OMSDialog oMSDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "baseStyle":
                    oMSDialog.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "actions":
                    oMSDialog.actions = JsonAdapter.parseArray(jsonParser, OMSAction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "needApplyChild":
                    oMSDialog.needApplyChild = jsonParser.getValueAsBoolean();
                    return true;
                case "languageContent":
                    oMSDialog.languageContent = (OMSLanguageContent) OMSLanguageContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bgImage":
                    oMSDialog.bgImage = jsonParser.getValueAsString();
                    return true;
                case "childJson":
                    oMSDialog.childJson = (OMSDialog) OMSDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "src":
                    oMSDialog.src = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oMSDialog.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "child":
                    oMSDialog.child = jsonParser.getValueAsString();
                    return true;
                case "image":
                    oMSDialog.image = jsonParser.getValueAsString();
                    return true;
                case "nodes":
                    oMSDialog.nodes = jsonParser.getValueAsString();
                    return true;
                case "style":
                    oMSDialog.style = (OMSBaseStyle) OMSBaseStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nodesJson":
                    oMSDialog.nodesJson = JsonAdapter.parseArray(jsonParser, OMSDialog.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "content":
                    oMSDialog.content = JsonAdapter.parseArray(jsonParser, OMSResourceContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mercury":
                    oMSDialog.mercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "foreImage":
                    oMSDialog.foreImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDialog oMSDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "baseStyle":
                case "actions":
                case "needApplyChild":
                case "languageContent":
                case "bgImage":
                case "childJson":
                case "src":
                case "type":
                case "child":
                case "image":
                case "nodes":
                case "style":
                case "nodesJson":
                case "content":
                case "mercury":
                case "foreImage":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDialog, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialog oMSDialog, JsonGenerator jsonGenerator) throws IOException {
            if (oMSDialog.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSTemplateModeType.JSON_ADAPTER.serialize(oMSDialog.type, jsonGenerator, true);
            }
            if (oMSDialog.style != null) {
                jsonGenerator.writeFieldName("style");
                OMSBaseStyle.JSON_ADAPTER.serialize(oMSDialog.style, jsonGenerator, true);
            }
            if (oMSDialog.content != null) {
                jsonGenerator.writeFieldName("content");
                JsonAdapter.serializeArray(oMSDialog.content, jsonGenerator, OMSResourceContent.JSON_ADAPTER);
            }
            String str = oMSDialog.src;
            if (str != null) {
                jsonGenerator.writeStringField("src", str);
            }
            String str2 = oMSDialog.image;
            if (str2 != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.image, str2);
            }
            String str3 = oMSDialog.bgImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgImage", str3);
            }
            String str4 = oMSDialog.foreImage;
            if (str4 != null) {
                jsonGenerator.writeStringField("foreImage", str4);
            }
            String str5 = oMSDialog.child;
            if (str5 != null) {
                jsonGenerator.writeStringField("child", str5);
            }
            String str6 = oMSDialog.nodes;
            if (str6 != null) {
                jsonGenerator.writeStringField("nodes", str6);
            }
            jsonGenerator.writeBooleanField("needApplyChild", oMSDialog.needApplyChild);
            if (oMSDialog.mercury != null) {
                jsonGenerator.writeFieldName("mercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSDialog.mercury, jsonGenerator, true);
            }
            if (oMSDialog.actions != null) {
                jsonGenerator.writeFieldName("actions");
                JsonAdapter.serializeArray(oMSDialog.actions, jsonGenerator, OMSAction.JSON_ADAPTER);
            }
            if (oMSDialog.baseStyle != null) {
                jsonGenerator.writeFieldName("baseStyle");
                OMSMorphBaseStyle.JSON_ADAPTER.serialize(oMSDialog.baseStyle, jsonGenerator, true);
            }
            if (oMSDialog.languageContent != null) {
                jsonGenerator.writeFieldName("languageContent");
                OMSLanguageContent.JSON_ADAPTER.serialize(oMSDialog.languageContent, jsonGenerator, true);
            }
            if (oMSDialog.childJson != null) {
                jsonGenerator.writeFieldName("childJson");
                OMSDialog.JSON_ADAPTER.serialize(oMSDialog.childJson, jsonGenerator, true);
            }
            if (oMSDialog.nodesJson != null) {
                jsonGenerator.writeFieldName("nodesJson");
                JsonAdapter.serializeArray(oMSDialog.nodesJson, jsonGenerator, OMSDialog.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialog new_() {
        OMSDialog oMSDialog = new OMSDialog();
        oMSDialog.nullCheck();
        return oMSDialog;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDialog m18593clone() {
        OMSDialog oMSDialog = new OMSDialog();
        oMSDialog.type = this.type;
        OMSBaseStyle oMSBaseStyle = this.style;
        if (oMSBaseStyle != null) {
            oMSDialog.style = oMSBaseStyle.m18575clone();
        }
        List<OMSResourceContent> list = this.content;
        if (list != null) {
            oMSDialog.content = ValueObject.util_map(list, new w9j() { // from class: l.qy40
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).m18653clone();
                }
            });
        }
        oMSDialog.src = this.src;
        oMSDialog.image = this.image;
        oMSDialog.bgImage = this.bgImage;
        oMSDialog.foreImage = this.foreImage;
        oMSDialog.child = this.child;
        oMSDialog.nodes = this.nodes;
        oMSDialog.needApplyChild = this.needApplyChild;
        OmsMerCuryData omsMerCuryData = this.mercury;
        if (omsMerCuryData != null) {
            oMSDialog.mercury = omsMerCuryData.m18722clone();
        }
        List<OMSAction> list2 = this.actions;
        if (list2 != null) {
            oMSDialog.actions = ValueObject.util_map(list2, new w9j() { // from class: l.ry40
                public final Object call(Object obj) {
                    return ((OMSAction) obj).m18566clone();
                }
            });
        }
        oMSDialog.baseStyle = this.baseStyle;
        OMSLanguageContent oMSLanguageContent = this.languageContent;
        if (oMSLanguageContent != null) {
            oMSDialog.languageContent = oMSLanguageContent.m18629clone();
        }
        OMSDialog oMSDialog2 = this.childJson;
        if (oMSDialog2 != null) {
            oMSDialog.childJson = oMSDialog2.m18593clone();
        }
        List<OMSDialog> list3 = this.nodesJson;
        if (list3 != null) {
            oMSDialog.nodesJson = ValueObject.util_map(list3, new w9j() { // from class: l.sy40
                public final Object call(Object obj) {
                    return ((OMSDialog) obj).m18593clone();
                }
            });
        }
        return oMSDialog;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDialog)) {
            return false;
        }
        OMSDialog oMSDialog = (OMSDialog) obj;
        return ValueObject.util_equals(this.type, oMSDialog.type) && ValueObject.util_equals(this.style, oMSDialog.style) && ValueObject.util_equals(this.content, oMSDialog.content) && ValueObject.util_equals(this.src, oMSDialog.src) && ValueObject.util_equals(this.image, oMSDialog.image) && ValueObject.util_equals(this.bgImage, oMSDialog.bgImage) && ValueObject.util_equals(this.foreImage, oMSDialog.foreImage) && ValueObject.util_equals(this.child, oMSDialog.child) && ValueObject.util_equals(this.nodes, oMSDialog.nodes) && this.needApplyChild == oMSDialog.needApplyChild && ValueObject.util_equals(this.mercury, oMSDialog.mercury) && ValueObject.util_equals(this.actions, oMSDialog.actions) && ValueObject.util_equals(this.baseStyle, oMSDialog.baseStyle) && ValueObject.util_equals(this.languageContent, oMSDialog.languageContent) && ValueObject.util_equals(this.childJson, oMSDialog.childJson) && ValueObject.util_equals(this.nodesJson, oMSDialog.nodesJson);
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
        OMSTemplateModeType oMSTemplateModeType = this.type;
        int iHashCode = (i2 + (oMSTemplateModeType != null ? oMSTemplateModeType.hashCode() : 0)) * 41;
        OMSBaseStyle oMSBaseStyle = this.style;
        int iHashCode2 = (iHashCode + (oMSBaseStyle != null ? oMSBaseStyle.hashCode() : 0)) * 41;
        List<OMSResourceContent> list = this.content;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.src;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.image;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgImage;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.foreImage;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.child;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.nodes;
        int iHashCode9 = (((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.needApplyChild ? 1231 : 1237)) * 41;
        OmsMerCuryData omsMerCuryData = this.mercury;
        int iHashCode10 = (iHashCode9 + (omsMerCuryData != null ? omsMerCuryData.hashCode() : 0)) * 41;
        List<OMSAction> list2 = this.actions;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        OMSMorphBaseStyle oMSMorphBaseStyle = this.baseStyle;
        int iHashCode12 = (iHashCode11 + (oMSMorphBaseStyle != null ? oMSMorphBaseStyle.hashCode() : 0)) * 41;
        OMSLanguageContent oMSLanguageContent = this.languageContent;
        int iHashCode13 = (iHashCode12 + (oMSLanguageContent != null ? oMSLanguageContent.hashCode() : 0)) * 41;
        OMSDialog oMSDialog = this.childJson;
        int iHashCode14 = (iHashCode13 + (oMSDialog != null ? oMSDialog.hashCode() : 0)) * 41;
        List<OMSDialog> list3 = this.nodesJson;
        int iHashCode15 = iHashCode14 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = (OMSTemplateModeType) OMSTemplateModeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.style == null) {
            this.style = OMSBaseStyle.new_();
        }
        if (this.content == null) {
            this.content = new ArrayList();
        }
        if (this.src == null) {
            this.src = "";
        }
        if (this.image == null) {
            this.image = "";
        }
        if (this.bgImage == null) {
            this.bgImage = "";
        }
        if (this.foreImage == null) {
            this.foreImage = "";
        }
        if (this.child == null) {
            this.child = "";
        }
        if (this.nodes == null) {
            this.nodes = "";
        }
        if (this.mercury == null) {
            this.mercury = OmsMerCuryData.new_();
        }
        if (this.actions == null) {
            this.actions = new ArrayList();
        }
        if (this.baseStyle == null) {
            this.baseStyle = (OMSMorphBaseStyle) OMSMorphBaseStyle.JSON_ADAPTER.defaultEnum();
        }
        if (this.languageContent == null) {
            this.languageContent = OMSLanguageContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
