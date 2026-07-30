package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSDialogGlobalConstraint;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSDocumentInfo;
import com.p046p1.mobile.putong.data.OMSEmitterInfo;
import com.p046p1.mobile.putong.data.OMSLauncherInfo;
import com.p046p1.mobile.putong.data.OMSMetasData;
import com.p046p1.mobile.putong.data.OMSSlotsInfo;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.OMSWidgetInfo;
import com.p046p1.mobile.putong.data.SwipeExcites;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OMSData extends ValueObject implements Cloneable, Serializable {
    public static final String OMS_CONFIG_VERSION = "3.1.0";
    public static final String OMS_DATA = "oms_data";
    public static final String OMS_DATA_VERSION = "_v8";
    public static final String TYPE = "omsdata";

    @NonNull
    @ProtobufIndex(index = 9)
    public List<OMSAdCardInfo> cards;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<OMSCounterInfo> counters;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<OMSDialogInfo> dialogs;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OMSDocumentInfo> documents;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<OMSEmitterInfo> emitters;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<OMSDialogGlobalConstraint> globalConstraints;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<OMSLauncherInfo> launchPages;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OMSMetasData> omsMetas;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<OMSSlotsInfo> slots;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<SwipeExcites> swipeExcites;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<OMSThemeInfo> themes;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<OMSWidgetInfo> widgets;
    public static ProtobufAdapter<OMSData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSData>() { // from class: com.p1.mobile.putong.data.OMSData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSData oMSData) {
            List<OMSMetasData> list = oMSData.omsMetas;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<OMSDialogInfo> list2 = oMSData.dialogs;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, OMSDialogInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSDocumentInfo> list3 = oMSData.documents;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, OMSDocumentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSLauncherInfo> list4 = oMSData.launchPages;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, OMSLauncherInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSEmitterInfo> list5 = oMSData.emitters;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, OMSEmitterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSWidgetInfo> list6 = oMSData.widgets;
            if (list6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list6, OMSWidgetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSCounterInfo> list7 = oMSData.counters;
            if (list7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, list7, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSDialogGlobalConstraint> list8 = oMSData.globalConstraints;
            if (list8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list8, OMSDialogGlobalConstraint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSAdCardInfo> list9 = oMSData.cards;
            if (list9 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, list9, OMSAdCardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSSlotsInfo> list10 = oMSData.slots;
            if (list10 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(10, list10, OMSSlotsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SwipeExcites> list11 = oMSData.swipeExcites;
            if (list11 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(11, list11, SwipeExcites.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSThemeInfo> list12 = oMSData.themes;
            if (list12 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(12, list12, OMSThemeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            oMSData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSData parse(nb5 nb5Var) throws IOException {
            OMSData oMSData = new OMSData();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (oMSData.omsMetas == null) {
                            oMSData.omsMetas = new ArrayList();
                        }
                        if (oMSData.dialogs == null) {
                            oMSData.dialogs = new ArrayList();
                        }
                        if (oMSData.documents == null) {
                            oMSData.documents = new ArrayList();
                        }
                        if (oMSData.launchPages == null) {
                            oMSData.launchPages = new ArrayList();
                        }
                        if (oMSData.emitters == null) {
                            oMSData.emitters = new ArrayList();
                        }
                        if (oMSData.widgets == null) {
                            oMSData.widgets = new ArrayList();
                        }
                        if (oMSData.counters == null) {
                            oMSData.counters = new ArrayList();
                        }
                        if (oMSData.globalConstraints == null) {
                            oMSData.globalConstraints = new ArrayList();
                        }
                        if (oMSData.cards == null) {
                            oMSData.cards = new ArrayList();
                        }
                        if (oMSData.slots == null) {
                            oMSData.slots = new ArrayList();
                        }
                        if (oMSData.swipeExcites == null) {
                            oMSData.swipeExcites = new ArrayList();
                        }
                        if (oMSData.themes == null) {
                            oMSData.themes = new ArrayList();
                        }
                        break;
                    case 10:
                        oMSData.omsMetas = (List) nb5Var.m158743l(OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        oMSData.dialogs = (List) nb5Var.m158743l(OMSDialogInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        oMSData.documents = (List) nb5Var.m158743l(OMSDocumentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        oMSData.launchPages = (List) nb5Var.m158743l(OMSLauncherInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        oMSData.emitters = (List) nb5Var.m158743l(OMSEmitterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        oMSData.widgets = (List) nb5Var.m158743l(OMSWidgetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        oMSData.counters = (List) nb5Var.m158743l(OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        oMSData.globalConstraints = (List) nb5Var.m158743l(OMSDialogGlobalConstraint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        oMSData.cards = (List) nb5Var.m158743l(OMSAdCardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        oMSData.slots = (List) nb5Var.m158743l(OMSSlotsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        oMSData.swipeExcites = (List) nb5Var.m158743l(SwipeExcites.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        oMSData.themes = (List) nb5Var.m158743l(OMSThemeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (oMSData.omsMetas == null) {
                            oMSData.omsMetas = new ArrayList();
                        }
                        if (oMSData.dialogs == null) {
                            oMSData.dialogs = new ArrayList();
                        }
                        if (oMSData.documents == null) {
                            oMSData.documents = new ArrayList();
                        }
                        if (oMSData.launchPages == null) {
                            oMSData.launchPages = new ArrayList();
                        }
                        if (oMSData.emitters == null) {
                            oMSData.emitters = new ArrayList();
                        }
                        if (oMSData.widgets == null) {
                            oMSData.widgets = new ArrayList();
                        }
                        if (oMSData.counters == null) {
                            oMSData.counters = new ArrayList();
                        }
                        if (oMSData.globalConstraints == null) {
                            oMSData.globalConstraints = new ArrayList();
                        }
                        if (oMSData.cards == null) {
                            oMSData.cards = new ArrayList();
                        }
                        if (oMSData.slots == null) {
                            oMSData.slots = new ArrayList();
                        }
                        if (oMSData.swipeExcites == null) {
                            oMSData.swipeExcites = new ArrayList();
                        }
                        if (oMSData.themes == null) {
                            oMSData.themes = new ArrayList();
                            return oMSData;
                        }
                        break;
                }
            }
            return oMSData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSData oMSData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OMSMetasData> list = oMSData.omsMetas;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSDialogInfo> list2 = oMSData.dialogs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, OMSDialogInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSDocumentInfo> list3 = oMSData.documents;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, OMSDocumentInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSLauncherInfo> list4 = oMSData.launchPages;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, OMSLauncherInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSEmitterInfo> list5 = oMSData.emitters;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, OMSEmitterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSWidgetInfo> list6 = oMSData.widgets;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(6, list6, OMSWidgetInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSCounterInfo> list7 = oMSData.counters;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(7, list7, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSDialogGlobalConstraint> list8 = oMSData.globalConstraints;
            if (list8 != null) {
                codedOutputByteBufferNano.m17254K(8, list8, OMSDialogGlobalConstraint.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSAdCardInfo> list9 = oMSData.cards;
            if (list9 != null) {
                codedOutputByteBufferNano.m17254K(9, list9, OMSAdCardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSSlotsInfo> list10 = oMSData.slots;
            if (list10 != null) {
                codedOutputByteBufferNano.m17254K(10, list10, OMSSlotsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SwipeExcites> list11 = oMSData.swipeExcites;
            if (list11 != null) {
                codedOutputByteBufferNano.m17254K(11, list11, SwipeExcites.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSThemeInfo> list12 = oMSData.themes;
            if (list12 != null) {
                codedOutputByteBufferNano.m17254K(12, list12, OMSThemeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSData> JSON_ADAPTER = new ObjectJsonAdapter<OMSData>() { // from class: com.p1.mobile.putong.data.OMSData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSData newInstance() {
            return new OMSData();
        }

        public boolean parseField(OMSData oMSData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "globalConstraints":
                    oMSData.globalConstraints = JsonAdapter.parseArray(jsonParser, OMSDialogGlobalConstraint.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "swipeExcites":
                    oMSData.swipeExcites = JsonAdapter.parseArray(jsonParser, SwipeExcites.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "themes":
                    oMSData.themes = JsonAdapter.parseArray(jsonParser, OMSThemeInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "counters":
                    oMSData.counters = JsonAdapter.parseArray(jsonParser, OMSCounterInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "launchPages":
                    oMSData.launchPages = JsonAdapter.parseArray(jsonParser, OMSLauncherInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cards":
                    oMSData.cards = JsonAdapter.parseArray(jsonParser, OMSAdCardInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "slots":
                    oMSData.slots = JsonAdapter.parseArray(jsonParser, OMSSlotsInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "documents":
                    oMSData.documents = JsonAdapter.parseArray(jsonParser, OMSDocumentInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "emitters":
                    oMSData.emitters = JsonAdapter.parseArray(jsonParser, OMSEmitterInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "widgets":
                    oMSData.widgets = JsonAdapter.parseArray(jsonParser, OMSWidgetInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "omsMetas":
                    oMSData.omsMetas = JsonAdapter.parseArray(jsonParser, OMSMetasData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "dialogs":
                    oMSData.dialogs = JsonAdapter.parseArray(jsonParser, OMSDialogInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSData oMSData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "globalConstraints":
                case "swipeExcites":
                case "themes":
                case "counters":
                case "launchPages":
                case "cards":
                case "slots":
                case "documents":
                case "emitters":
                case "widgets":
                case "omsMetas":
                case "dialogs":
                    return true;
                default:
                    return super.parseFieldCheck(oMSData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSData oMSData, JsonGenerator jsonGenerator) throws IOException {
            if (oMSData.omsMetas != null) {
                jsonGenerator.writeFieldName("omsMetas");
                JsonAdapter.serializeArray(oMSData.omsMetas, jsonGenerator, OMSMetasData.JSON_ADAPTER);
            }
            if (oMSData.dialogs != null) {
                jsonGenerator.writeFieldName("dialogs");
                JsonAdapter.serializeArray(oMSData.dialogs, jsonGenerator, OMSDialogInfo.JSON_ADAPTER);
            }
            if (oMSData.documents != null) {
                jsonGenerator.writeFieldName("documents");
                JsonAdapter.serializeArray(oMSData.documents, jsonGenerator, OMSDocumentInfo.JSON_ADAPTER);
            }
            if (oMSData.launchPages != null) {
                jsonGenerator.writeFieldName("launchPages");
                JsonAdapter.serializeArray(oMSData.launchPages, jsonGenerator, OMSLauncherInfo.JSON_ADAPTER);
            }
            if (oMSData.emitters != null) {
                jsonGenerator.writeFieldName("emitters");
                JsonAdapter.serializeArray(oMSData.emitters, jsonGenerator, OMSEmitterInfo.JSON_ADAPTER);
            }
            if (oMSData.widgets != null) {
                jsonGenerator.writeFieldName("widgets");
                JsonAdapter.serializeArray(oMSData.widgets, jsonGenerator, OMSWidgetInfo.JSON_ADAPTER);
            }
            if (oMSData.counters != null) {
                jsonGenerator.writeFieldName("counters");
                JsonAdapter.serializeArray(oMSData.counters, jsonGenerator, OMSCounterInfo.JSON_ADAPTER);
            }
            if (oMSData.globalConstraints != null) {
                jsonGenerator.writeFieldName("globalConstraints");
                JsonAdapter.serializeArray(oMSData.globalConstraints, jsonGenerator, OMSDialogGlobalConstraint.JSON_ADAPTER);
            }
            if (oMSData.cards != null) {
                jsonGenerator.writeFieldName("cards");
                JsonAdapter.serializeArray(oMSData.cards, jsonGenerator, OMSAdCardInfo.JSON_ADAPTER);
            }
            if (oMSData.slots != null) {
                jsonGenerator.writeFieldName("slots");
                JsonAdapter.serializeArray(oMSData.slots, jsonGenerator, OMSSlotsInfo.JSON_ADAPTER);
            }
            if (oMSData.swipeExcites != null) {
                jsonGenerator.writeFieldName("swipeExcites");
                JsonAdapter.serializeArray(oMSData.swipeExcites, jsonGenerator, SwipeExcites.JSON_ADAPTER);
            }
            if (oMSData.themes != null) {
                jsonGenerator.writeFieldName("themes");
                JsonAdapter.serializeArray(oMSData.themes, jsonGenerator, OMSThemeInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSData new_() {
        OMSData oMSData = new OMSData();
        oMSData.nullCheck();
        return oMSData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSData mo223809clone() {
        OMSData oMSData = new OMSData();
        List<OMSMetasData> list = this.omsMetas;
        if (list != null) {
            oMSData.omsMetas = ValueObject.util_map(list, new w9j() { // from class: l.ey40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSMetasData) obj).mo223809clone();
                }
            });
        }
        List<OMSDialogInfo> list2 = this.dialogs;
        if (list2 != null) {
            oMSData.dialogs = ValueObject.util_map(list2, new w9j() { // from class: l.jy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSDialogInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSDocumentInfo> list3 = this.documents;
        if (list3 != null) {
            oMSData.documents = ValueObject.util_map(list3, new w9j() { // from class: l.ky40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSDocumentInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSLauncherInfo> list4 = this.launchPages;
        if (list4 != null) {
            oMSData.launchPages = ValueObject.util_map(list4, new w9j() { // from class: l.ly40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSLauncherInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSEmitterInfo> list5 = this.emitters;
        if (list5 != null) {
            oMSData.emitters = ValueObject.util_map(list5, new w9j() { // from class: l.my40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSEmitterInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSWidgetInfo> list6 = this.widgets;
        if (list6 != null) {
            oMSData.widgets = ValueObject.util_map(list6, new w9j() { // from class: l.ny40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSWidgetInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSCounterInfo> list7 = this.counters;
        if (list7 != null) {
            oMSData.counters = ValueObject.util_map(list7, new w9j() { // from class: l.oy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSCounterInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSDialogGlobalConstraint> list8 = this.globalConstraints;
        if (list8 != null) {
            oMSData.globalConstraints = ValueObject.util_map(list8, new w9j() { // from class: l.py40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSDialogGlobalConstraint) obj).mo223809clone();
                }
            });
        }
        List<OMSAdCardInfo> list9 = this.cards;
        if (list9 != null) {
            oMSData.cards = ValueObject.util_map(list9, new w9j() { // from class: l.fy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSAdCardInfo) obj).mo223809clone();
                }
            });
        }
        List<OMSSlotsInfo> list10 = this.slots;
        if (list10 != null) {
            oMSData.slots = ValueObject.util_map(list10, new w9j() { // from class: l.gy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSSlotsInfo) obj).mo223809clone();
                }
            });
        }
        List<SwipeExcites> list11 = this.swipeExcites;
        if (list11 != null) {
            oMSData.swipeExcites = ValueObject.util_map(list11, new w9j() { // from class: l.hy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SwipeExcites) obj).mo223809clone();
                }
            });
        }
        List<OMSThemeInfo> list12 = this.themes;
        if (list12 != null) {
            oMSData.themes = ValueObject.util_map(list12, new w9j() { // from class: l.iy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSThemeInfo) obj).mo223809clone();
                }
            });
        }
        return oMSData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSData)) {
            return false;
        }
        OMSData oMSData = (OMSData) obj;
        return ValueObject.util_equals(this.omsMetas, oMSData.omsMetas) && ValueObject.util_equals(this.dialogs, oMSData.dialogs) && ValueObject.util_equals(this.documents, oMSData.documents) && ValueObject.util_equals(this.launchPages, oMSData.launchPages) && ValueObject.util_equals(this.emitters, oMSData.emitters) && ValueObject.util_equals(this.widgets, oMSData.widgets) && ValueObject.util_equals(this.counters, oMSData.counters) && ValueObject.util_equals(this.globalConstraints, oMSData.globalConstraints) && ValueObject.util_equals(this.cards, oMSData.cards) && ValueObject.util_equals(this.slots, oMSData.slots) && ValueObject.util_equals(this.swipeExcites, oMSData.swipeExcites) && ValueObject.util_equals(this.themes, oMSData.themes);
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
        List<OMSMetasData> list = this.omsMetas;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<OMSDialogInfo> list2 = this.dialogs;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<OMSDocumentInfo> list3 = this.documents;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<OMSLauncherInfo> list4 = this.launchPages;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<OMSEmitterInfo> list5 = this.emitters;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<OMSWidgetInfo> list6 = this.widgets;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<OMSCounterInfo> list7 = this.counters;
        int iHashCode7 = (iHashCode6 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<OMSDialogGlobalConstraint> list8 = this.globalConstraints;
        int iHashCode8 = (iHashCode7 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<OMSAdCardInfo> list9 = this.cards;
        int iHashCode9 = (iHashCode8 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<OMSSlotsInfo> list10 = this.slots;
        int iHashCode10 = (iHashCode9 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<SwipeExcites> list11 = this.swipeExcites;
        int iHashCode11 = (iHashCode10 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<OMSThemeInfo> list12 = this.themes;
        int iHashCode12 = iHashCode11 + (list12 != null ? list12.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.omsMetas == null) {
            this.omsMetas = new ArrayList();
        }
        if (this.dialogs == null) {
            this.dialogs = new ArrayList();
        }
        if (this.documents == null) {
            this.documents = new ArrayList();
        }
        if (this.launchPages == null) {
            this.launchPages = new ArrayList();
        }
        if (this.emitters == null) {
            this.emitters = new ArrayList();
        }
        if (this.widgets == null) {
            this.widgets = new ArrayList();
        }
        if (this.counters == null) {
            this.counters = new ArrayList();
        }
        if (this.globalConstraints == null) {
            this.globalConstraints = new ArrayList();
        }
        if (this.cards == null) {
            this.cards = new ArrayList();
        }
        if (this.slots == null) {
            this.slots = new ArrayList();
        }
        if (this.swipeExcites == null) {
            this.swipeExcites = new ArrayList();
        }
        if (this.themes == null) {
            this.themes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
