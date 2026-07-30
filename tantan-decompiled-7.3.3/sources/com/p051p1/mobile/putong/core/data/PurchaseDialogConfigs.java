package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.NavigationTriggerDialog;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p051p1.mobile.putong.core.data.SkuConfigs;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PurchaseDialogConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasedialogconfigs";

    @Nullable
    @ProtobufIndex(index = 3)
    public Boolean isShowCheckPopup;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<PurchaseDialogConfigMerchandise> merchandises;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<NavigationTriggerDialog> navigationTriggerDialog;

    @Nullable
    @ProtobufIndex(index = 6)
    public LeftSwipeLimitConfig sceneTriggerDialog;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<SkuConfigs> skuConfigs;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<PurchaseDialogConfigTrigger> triggerDialog;

    @Nullable
    @ProtobufIndex(index = 7)
    public TriggerDialogFromListBean triggerDialogFromList;
    public static ProtobufAdapter<PurchaseDialogConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseDialogConfigs>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurchaseDialogConfigs purchaseDialogConfigs) {
            List<PurchaseDialogConfigTrigger> list = purchaseDialogConfigs.triggerDialog;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<PurchaseDialogConfigMerchandise> list2 = purchaseDialogConfigs.merchandises;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = purchaseDialogConfigs.isShowCheckPopup;
            if (bool != null) {
                iM17285l += CodedOutputByteBufferNano.m17275b(3, bool.booleanValue());
            }
            List<NavigationTriggerDialog> list3 = purchaseDialogConfigs.navigationTriggerDialog;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list3, NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SkuConfigs> list4 = purchaseDialogConfigs.skuConfigs;
            if (list4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, list4, SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LeftSwipeLimitConfig leftSwipeLimitConfig = purchaseDialogConfigs.sceneTriggerDialog;
            if (leftSwipeLimitConfig != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, leftSwipeLimitConfig, LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
            }
            TriggerDialogFromListBean triggerDialogFromListBean = purchaseDialogConfigs.triggerDialogFromList;
            if (triggerDialogFromListBean != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, triggerDialogFromListBean, TriggerDialogFromListBean.PROTOBUF_ADAPTER);
            }
            purchaseDialogConfigs.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurchaseDialogConfigs parse(nc5 nc5Var) throws IOException {
            PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (purchaseDialogConfigs.merchandises != null) {
                        break;
                    }
                    purchaseDialogConfigs.merchandises = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    purchaseDialogConfigs.triggerDialog = (List) nc5Var.m162488l(PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    purchaseDialogConfigs.merchandises = (List) nc5Var.m162488l(PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 24) {
                    purchaseDialogConfigs.isShowCheckPopup = Boolean.valueOf(nc5Var.m162483g());
                } else if (iM162497u == 34) {
                    purchaseDialogConfigs.navigationTriggerDialog = (List) nc5Var.m162488l(NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    purchaseDialogConfigs.skuConfigs = (List) nc5Var.m162488l(SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 50) {
                    purchaseDialogConfigs.sceneTriggerDialog = (LeftSwipeLimitConfig) nc5Var.m162488l(LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 58) {
                        if (purchaseDialogConfigs.merchandises != null) {
                            break;
                        }
                        purchaseDialogConfigs.merchandises = new ArrayList();
                        return purchaseDialogConfigs;
                    }
                    purchaseDialogConfigs.triggerDialogFromList = (TriggerDialogFromListBean) nc5Var.m162488l(TriggerDialogFromListBean.PROTOBUF_ADAPTER);
                }
            }
            return purchaseDialogConfigs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurchaseDialogConfigs purchaseDialogConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PurchaseDialogConfigTrigger> list = purchaseDialogConfigs.triggerDialog;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseDialogConfigMerchandise> list2 = purchaseDialogConfigs.merchandises;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = purchaseDialogConfigs.isShowCheckPopup;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(3, bool.booleanValue());
            }
            List<NavigationTriggerDialog> list3 = purchaseDialogConfigs.navigationTriggerDialog;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(4, list3, NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SkuConfigs> list4 = purchaseDialogConfigs.skuConfigs;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(5, list4, SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LeftSwipeLimitConfig leftSwipeLimitConfig = purchaseDialogConfigs.sceneTriggerDialog;
            if (leftSwipeLimitConfig != null) {
                codedOutputByteBufferNano.m17309K(6, leftSwipeLimitConfig, LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
            }
            TriggerDialogFromListBean triggerDialogFromListBean = purchaseDialogConfigs.triggerDialogFromList;
            if (triggerDialogFromListBean != null) {
                codedOutputByteBufferNano.m17309K(7, triggerDialogFromListBean, TriggerDialogFromListBean.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PurchaseDialogConfigs> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseDialogConfigs>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurchaseDialogConfigs.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurchaseDialogConfigs newInstance() {
            return new PurchaseDialogConfigs();
        }

        public boolean parseField(PurchaseDialogConfigs purchaseDialogConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerDialog":
                    purchaseDialogConfigs.triggerDialog = JsonAdapter.parseArray(jsonParser, PurchaseDialogConfigTrigger.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "triggerDialogFromList":
                    purchaseDialogConfigs.triggerDialogFromList = TriggerDialogFromListBean.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "navigationTriggerDialog":
                    purchaseDialogConfigs.navigationTriggerDialog = JsonAdapter.parseArray(jsonParser, NavigationTriggerDialog.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "skuConfigs":
                    purchaseDialogConfigs.skuConfigs = JsonAdapter.parseArray(jsonParser, SkuConfigs.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isShowCheckPopup":
                    purchaseDialogConfigs.isShowCheckPopup = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "sceneTriggerDialog":
                    purchaseDialogConfigs.sceneTriggerDialog = LeftSwipeLimitConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "merchandises":
                    purchaseDialogConfigs.merchandises = JsonAdapter.parseArray(jsonParser, PurchaseDialogConfigMerchandise.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurchaseDialogConfigs purchaseDialogConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "triggerDialog":
                case "triggerDialogFromList":
                case "navigationTriggerDialog":
                case "skuConfigs":
                case "isShowCheckPopup":
                case "sceneTriggerDialog":
                case "merchandises":
                    return true;
                default:
                    return super.parseFieldCheck(purchaseDialogConfigs, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurchaseDialogConfigs purchaseDialogConfigs, JsonGenerator jsonGenerator) throws IOException {
            if (purchaseDialogConfigs.triggerDialog != null) {
                jsonGenerator.writeFieldName("triggerDialog");
                JsonAdapter.serializeArray(purchaseDialogConfigs.triggerDialog, jsonGenerator, PurchaseDialogConfigTrigger.JSON_ADAPTER);
            }
            if (purchaseDialogConfigs.merchandises != null) {
                jsonGenerator.writeFieldName("merchandises");
                JsonAdapter.serializeArray(purchaseDialogConfigs.merchandises, jsonGenerator, PurchaseDialogConfigMerchandise.JSON_ADAPTER);
            }
            Boolean bool = purchaseDialogConfigs.isShowCheckPopup;
            if (bool != null) {
                jsonGenerator.writeBooleanField("isShowCheckPopup", bool.booleanValue());
            }
            if (purchaseDialogConfigs.navigationTriggerDialog != null) {
                jsonGenerator.writeFieldName("navigationTriggerDialog");
                JsonAdapter.serializeArray(purchaseDialogConfigs.navigationTriggerDialog, jsonGenerator, NavigationTriggerDialog.JSON_ADAPTER);
            }
            if (purchaseDialogConfigs.skuConfigs != null) {
                jsonGenerator.writeFieldName("skuConfigs");
                JsonAdapter.serializeArray(purchaseDialogConfigs.skuConfigs, jsonGenerator, SkuConfigs.JSON_ADAPTER);
            }
            if (purchaseDialogConfigs.sceneTriggerDialog != null) {
                jsonGenerator.writeFieldName("sceneTriggerDialog");
                LeftSwipeLimitConfig.JSON_ADAPTER.serialize(purchaseDialogConfigs.sceneTriggerDialog, jsonGenerator, true);
            }
            if (purchaseDialogConfigs.triggerDialogFromList != null) {
                jsonGenerator.writeFieldName("triggerDialogFromList");
                TriggerDialogFromListBean.JSON_ADAPTER.serialize(purchaseDialogConfigs.triggerDialogFromList, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseDialogConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseDialogConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseDialogConfigs new_() {
        PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
        purchaseDialogConfigs.nullCheck();
        return purchaseDialogConfigs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurchaseDialogConfigs mo225055clone() {
        PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
        List<PurchaseDialogConfigTrigger> list = this.triggerDialog;
        if (list != null) {
            purchaseDialogConfigs.triggerDialog = ValueObject.util_map(list, new qcj() { // from class: l.wab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurchaseDialogConfigTrigger) obj).mo225055clone();
                }
            });
        }
        List<PurchaseDialogConfigMerchandise> list2 = this.merchandises;
        if (list2 != null) {
            purchaseDialogConfigs.merchandises = ValueObject.util_map(list2, new qcj() { // from class: l.xab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurchaseDialogConfigMerchandise) obj).mo225055clone();
                }
            });
        }
        purchaseDialogConfigs.isShowCheckPopup = this.isShowCheckPopup;
        List<NavigationTriggerDialog> list3 = this.navigationTriggerDialog;
        if (list3 != null) {
            purchaseDialogConfigs.navigationTriggerDialog = ValueObject.util_map(list3, new qcj() { // from class: l.yab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NavigationTriggerDialog) obj).mo225055clone();
                }
            });
        }
        List<SkuConfigs> list4 = this.skuConfigs;
        if (list4 != null) {
            purchaseDialogConfigs.skuConfigs = ValueObject.util_map(list4, new qcj() { // from class: l.zab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SkuConfigs) obj).mo225055clone();
                }
            });
        }
        LeftSwipeLimitConfig leftSwipeLimitConfig = this.sceneTriggerDialog;
        if (leftSwipeLimitConfig != null) {
            purchaseDialogConfigs.sceneTriggerDialog = leftSwipeLimitConfig.mo225055clone();
        }
        TriggerDialogFromListBean triggerDialogFromListBean = this.triggerDialogFromList;
        if (triggerDialogFromListBean != null) {
            purchaseDialogConfigs.triggerDialogFromList = triggerDialogFromListBean.mo225055clone();
        }
        return purchaseDialogConfigs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseDialogConfigs)) {
            return false;
        }
        PurchaseDialogConfigs purchaseDialogConfigs = (PurchaseDialogConfigs) obj;
        return ValueObject.util_equals(this.triggerDialog, purchaseDialogConfigs.triggerDialog) && ValueObject.util_equals(this.merchandises, purchaseDialogConfigs.merchandises) && ValueObject.util_equals(this.isShowCheckPopup, purchaseDialogConfigs.isShowCheckPopup) && ValueObject.util_equals(this.navigationTriggerDialog, purchaseDialogConfigs.navigationTriggerDialog) && ValueObject.util_equals(this.skuConfigs, purchaseDialogConfigs.skuConfigs) && ValueObject.util_equals(this.sceneTriggerDialog, purchaseDialogConfigs.sceneTriggerDialog) && ValueObject.util_equals(this.triggerDialogFromList, purchaseDialogConfigs.triggerDialogFromList);
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
        List<PurchaseDialogConfigTrigger> list = this.triggerDialog;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<PurchaseDialogConfigMerchandise> list2 = this.merchandises;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        Boolean bool = this.isShowCheckPopup;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 41;
        List<NavigationTriggerDialog> list3 = this.navigationTriggerDialog;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<SkuConfigs> list4 = this.skuConfigs;
        int iHashCode5 = (iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41;
        LeftSwipeLimitConfig leftSwipeLimitConfig = this.sceneTriggerDialog;
        int iHashCode6 = (iHashCode5 + (leftSwipeLimitConfig != null ? leftSwipeLimitConfig.hashCode() : 0)) * 41;
        TriggerDialogFromListBean triggerDialogFromListBean = this.triggerDialogFromList;
        int iHashCode7 = iHashCode6 + (triggerDialogFromListBean != null ? triggerDialogFromListBean.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.merchandises == null) {
            this.merchandises = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
