package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSResourceContent;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDialog oMSDialog) {
            OMSTemplateModeType oMSTemplateModeType = oMSDialog.type;
            int iM17281h = oMSTemplateModeType != null ? CodedOutputByteBufferNano.m17281h(1, oMSTemplateModeType.ordinal()) : 0;
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (oMSBaseStyle != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, oMSBaseStyle, OMSBaseStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSDialog.content;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSDialog.src;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = oMSDialog.image;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            String str3 = oMSDialog.bgImage;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str3);
            }
            String str4 = oMSDialog.foreImage;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            String str5 = oMSDialog.child;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            String str6 = oMSDialog.nodes;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(10, oMSDialog.needApplyChild);
            OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
            if (omsMerCuryData != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            List<OMSAction> list2 = oMSDialog.actions;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(12, list2, OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSMorphBaseStyle oMSMorphBaseStyle = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle != null) {
                iM17275b += CodedOutputByteBufferNano.m17281h(13, oMSMorphBaseStyle.ordinal());
            }
            OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
            if (oMSLanguageContent != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(14, oMSLanguageContent, OMSLanguageContent.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog2 = oMSDialog.childJson;
            if (oMSDialog2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(15, oMSDialog2, OMSDialog.PROTOBUF_ADAPTER);
            }
            List<OMSDialog> list3 = oMSDialog.nodesJson;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(16, list3, OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSDialog.type;
            if (oMSTemplateModeType2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(17, oMSTemplateModeType2, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSMorphBaseStyle oMSMorphBaseStyle2 = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(18, oMSMorphBaseStyle2, OMSMorphBaseStyle.PROTOBUF_ADAPTER);
            }
            oMSDialog.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDialog parse(nc5 nc5Var) throws IOException {
            OMSDialog oMSDialog = new OMSDialog();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 18:
                        oMSDialog.style = (OMSBaseStyle) nc5Var.m162488l(OMSBaseStyle.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        oMSDialog.content = (List) nc5Var.m162488l(OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        oMSDialog.src = nc5Var.m162495s();
                        continue;
                    case 42:
                        oMSDialog.image = nc5Var.m162495s();
                        continue;
                    case 50:
                        oMSDialog.bgImage = nc5Var.m162495s();
                        continue;
                    case 58:
                        oMSDialog.foreImage = nc5Var.m162495s();
                        continue;
                    case 66:
                        oMSDialog.child = nc5Var.m162495s();
                        continue;
                    case 74:
                        oMSDialog.nodes = nc5Var.m162495s();
                        continue;
                    case 80:
                        oMSDialog.needApplyChild = nc5Var.m162483g();
                        continue;
                    case 90:
                        oMSDialog.mercury = (OmsMerCuryData) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        oMSDialog.actions = (List) nc5Var.m162488l(OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 104:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 114:
                        oMSDialog.languageContent = (OMSLanguageContent) nc5Var.m162488l(OMSLanguageContent.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        oMSDialog.childJson = (OMSDialog) nc5Var.m162488l(OMSDialog.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        oMSDialog.nodesJson = (List) nc5Var.m162488l(OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        oMSDialog.type = (OMSTemplateModeType) nc5Var.m162488l(OMSTemplateModeType.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        oMSDialog.baseStyle = (OMSMorphBaseStyle) nc5Var.m162488l(OMSMorphBaseStyle.PROTOBUF_ADAPTER);
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDialog oMSDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSTemplateModeType oMSTemplateModeType = oMSDialog.type;
            if (oMSTemplateModeType != null) {
                codedOutputByteBufferNano.m17305G(1, oMSTemplateModeType.ordinal());
            }
            OMSBaseStyle oMSBaseStyle = oMSDialog.style;
            if (oMSBaseStyle != null) {
                codedOutputByteBufferNano.m17309K(2, oMSBaseStyle, OMSBaseStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSDialog.content;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSDialog.src;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = oMSDialog.image;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            String str3 = oMSDialog.bgImage;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(6, str3);
            }
            String str4 = oMSDialog.foreImage;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            String str5 = oMSDialog.child;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            String str6 = oMSDialog.nodes;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            codedOutputByteBufferNano.m17299A(10, oMSDialog.needApplyChild);
            OmsMerCuryData omsMerCuryData = oMSDialog.mercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.m17309K(11, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            List<OMSAction> list2 = oMSDialog.actions;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(12, list2, OMSAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSMorphBaseStyle oMSMorphBaseStyle = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle != null) {
                codedOutputByteBufferNano.m17305G(13, oMSMorphBaseStyle.ordinal());
            }
            OMSLanguageContent oMSLanguageContent = oMSDialog.languageContent;
            if (oMSLanguageContent != null) {
                codedOutputByteBufferNano.m17309K(14, oMSLanguageContent, OMSLanguageContent.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog2 = oMSDialog.childJson;
            if (oMSDialog2 != null) {
                codedOutputByteBufferNano.m17309K(15, oMSDialog2, OMSDialog.PROTOBUF_ADAPTER);
            }
            List<OMSDialog> list3 = oMSDialog.nodesJson;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(16, list3, OMSDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSTemplateModeType oMSTemplateModeType2 = oMSDialog.type;
            if (oMSTemplateModeType2 != null) {
                codedOutputByteBufferNano.m17309K(17, oMSTemplateModeType2, OMSTemplateModeType.PROTOBUF_ADAPTER);
            }
            OMSMorphBaseStyle oMSMorphBaseStyle2 = oMSDialog.baseStyle;
            if (oMSMorphBaseStyle2 != null) {
                codedOutputByteBufferNano.m17309K(18, oMSMorphBaseStyle2, OMSMorphBaseStyle.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialog> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialog>() { // from class: com.p1.mobile.putong.data.OMSDialog.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDialog.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDialog newInstance() {
            return new OMSDialog();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(OMSDialog oMSDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1827487392:
                    if (str.equals("baseStyle")) {
                        b = 0;
                    }
                    break;
                case -1161803523:
                    if (str.equals(Constants.KEY_ACTIONS)) {
                        b = 1;
                    }
                    break;
                case -738158716:
                    if (str.equals("needApplyChild")) {
                        b = 2;
                    }
                    break;
                case -301382143:
                    if (str.equals("languageContent")) {
                        b = 3;
                    }
                    break;
                case -199389162:
                    if (str.equals("bgImage")) {
                        b = 4;
                    }
                    break;
                case -95459292:
                    if (str.equals("childJson")) {
                        b = 5;
                    }
                    break;
                case 114148:
                    if (str.equals("src")) {
                        b = 6;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 7;
                    }
                    break;
                case 94631196:
                    if (str.equals("child")) {
                        b = 8;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        b = 9;
                    }
                    break;
                case 104993457:
                    if (str.equals("nodes")) {
                        b = 10;
                    }
                    break;
                case 109780401:
                    if (str.equals("style")) {
                        b = 11;
                    }
                    break;
                case 483046201:
                    if (str.equals("nodesJson")) {
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
                case 1560166911:
                    if (str.equals("foreImage")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    oMSDialog.baseStyle = OMSMorphBaseStyle.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 1:
                    oMSDialog.actions = JsonAdapter.parseArray(jsonParser, OMSAction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    oMSDialog.needApplyChild = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    oMSDialog.languageContent = OMSLanguageContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    oMSDialog.bgImage = jsonParser.getValueAsString();
                    return true;
                case 5:
                    oMSDialog.childJson = OMSDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    oMSDialog.src = jsonParser.getValueAsString();
                    return true;
                case 7:
                    oMSDialog.type = OMSTemplateModeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 8:
                    oMSDialog.child = jsonParser.getValueAsString();
                    return true;
                case 9:
                    oMSDialog.image = jsonParser.getValueAsString();
                    return true;
                case 10:
                    oMSDialog.nodes = jsonParser.getValueAsString();
                    return true;
                case 11:
                    oMSDialog.style = OMSBaseStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    oMSDialog.nodesJson = JsonAdapter.parseArray(jsonParser, OMSDialog.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    oMSDialog.content = JsonAdapter.parseArray(jsonParser, OMSResourceContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    oMSDialog.mercury = OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    oMSDialog.foreImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(OMSDialog oMSDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1827487392:
                    if (str.equals("baseStyle")) {
                        b = 0;
                    }
                    break;
                case -1161803523:
                    if (str.equals(Constants.KEY_ACTIONS)) {
                        b = 1;
                    }
                    break;
                case -738158716:
                    if (str.equals("needApplyChild")) {
                        b = 2;
                    }
                    break;
                case -301382143:
                    if (str.equals("languageContent")) {
                        b = 3;
                    }
                    break;
                case -199389162:
                    if (str.equals("bgImage")) {
                        b = 4;
                    }
                    break;
                case -95459292:
                    if (str.equals("childJson")) {
                        b = 5;
                    }
                    break;
                case 114148:
                    if (str.equals("src")) {
                        b = 6;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 7;
                    }
                    break;
                case 94631196:
                    if (str.equals("child")) {
                        b = 8;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        b = 9;
                    }
                    break;
                case 104993457:
                    if (str.equals("nodes")) {
                        b = 10;
                    }
                    break;
                case 109780401:
                    if (str.equals("style")) {
                        b = 11;
                    }
                    break;
                case 483046201:
                    if (str.equals("nodesJson")) {
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
                case 1560166911:
                    if (str.equals("foreImage")) {
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
                    return super.parseFieldCheck(oMSDialog, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("image", str2);
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
                jsonGenerator.writeFieldName(Constants.KEY_ACTIONS);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialog new_() {
        OMSDialog oMSDialog = new OMSDialog();
        oMSDialog.nullCheck();
        return oMSDialog;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDialog mo225055clone() {
        OMSDialog oMSDialog = new OMSDialog();
        oMSDialog.type = this.type;
        OMSBaseStyle oMSBaseStyle = this.style;
        if (oMSBaseStyle != null) {
            oMSDialog.style = oMSBaseStyle.mo225055clone();
        }
        List<OMSResourceContent> list = this.content;
        if (list != null) {
            oMSDialog.content = ValueObject.util_map(list, new qcj() { // from class: l.f750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).mo225055clone();
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
            oMSDialog.mercury = omsMerCuryData.mo225055clone();
        }
        List<OMSAction> list2 = this.actions;
        if (list2 != null) {
            oMSDialog.actions = ValueObject.util_map(list2, new qcj() { // from class: l.g750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OMSAction) obj).mo225055clone();
                }
            });
        }
        oMSDialog.baseStyle = this.baseStyle;
        OMSLanguageContent oMSLanguageContent = this.languageContent;
        if (oMSLanguageContent != null) {
            oMSDialog.languageContent = oMSLanguageContent.mo225055clone();
        }
        OMSDialog oMSDialog2 = this.childJson;
        if (oMSDialog2 != null) {
            oMSDialog.childJson = oMSDialog2.mo225055clone();
        }
        List<OMSDialog> list3 = this.nodesJson;
        if (list3 != null) {
            oMSDialog.nodesJson = ValueObject.util_map(list3, new qcj() { // from class: l.h750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OMSDialog) obj).mo225055clone();
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
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
