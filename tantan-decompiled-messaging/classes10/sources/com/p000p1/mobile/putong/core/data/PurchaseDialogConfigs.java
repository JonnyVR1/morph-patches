package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.NavigationTriggerDialog;
import com.p000p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
import com.p000p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p000p1.mobile.putong.core.data.SkuConfigs;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PurchaseDialogConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasedialogconfigs";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Boolean isShowCheckPopup;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<PurchaseDialogConfigMerchandise> merchandises;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<NavigationTriggerDialog> navigationTriggerDialog;

    @Nullable
    @ProtobufIndex(index = 6)
    public LeftSwipeLimitConfig sceneTriggerDialog;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<SkuConfigs> skuConfigs;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<PurchaseDialogConfigTrigger> triggerDialog;

    @Nullable
    @ProtobufIndex(index = 7)
    public TriggerDialogFromListBean triggerDialogFromList;
    public static ProtobufAdapter<PurchaseDialogConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseDialogConfigs>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigs.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurchaseDialogConfigs purchaseDialogConfigs) {
            List<PurchaseDialogConfigTrigger> list = purchaseDialogConfigs.triggerDialog;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<PurchaseDialogConfigMerchandise> list2 = purchaseDialogConfigs.merchandises;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = purchaseDialogConfigs.isShowCheckPopup;
            if (bool != null) {
                iL += CodedOutputByteBufferNano.b(3, bool.booleanValue());
            }
            List<NavigationTriggerDialog> list3 = purchaseDialogConfigs.navigationTriggerDialog;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(4, list3, NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SkuConfigs> list4 = purchaseDialogConfigs.skuConfigs;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(5, list4, SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LeftSwipeLimitConfig leftSwipeLimitConfig = purchaseDialogConfigs.sceneTriggerDialog;
            if (leftSwipeLimitConfig != null) {
                iL += CodedOutputByteBufferNano.l(6, leftSwipeLimitConfig, LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
            }
            TriggerDialogFromListBean triggerDialogFromListBean = purchaseDialogConfigs.triggerDialogFromList;
            if (triggerDialogFromListBean != null) {
                iL += CodedOutputByteBufferNano.l(7, triggerDialogFromListBean, TriggerDialogFromListBean.PROTOBUF_ADAPTER);
            }
            ((MessageNano) purchaseDialogConfigs).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigs m15081parse(nb5 nb5Var) throws IOException {
            PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purchaseDialogConfigs.merchandises != null) {
                        break;
                    }
                    purchaseDialogConfigs.merchandises = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    purchaseDialogConfigs.triggerDialog = (List) nb5Var.l(PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    purchaseDialogConfigs.merchandises = (List) nb5Var.l(PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    purchaseDialogConfigs.isShowCheckPopup = Boolean.valueOf(nb5Var.g());
                } else if (iU == 34) {
                    purchaseDialogConfigs.navigationTriggerDialog = (List) nb5Var.l(NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    purchaseDialogConfigs.skuConfigs = (List) nb5Var.l(SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 50) {
                    purchaseDialogConfigs.sceneTriggerDialog = (LeftSwipeLimitConfig) nb5Var.l(LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (purchaseDialogConfigs.merchandises != null) {
                            break;
                        }
                        purchaseDialogConfigs.merchandises = new ArrayList();
                        return purchaseDialogConfigs;
                    }
                    purchaseDialogConfigs.triggerDialogFromList = (TriggerDialogFromListBean) nb5Var.l(TriggerDialogFromListBean.PROTOBUF_ADAPTER);
                }
            }
            return purchaseDialogConfigs;
        }

        public void serialize(PurchaseDialogConfigs purchaseDialogConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PurchaseDialogConfigTrigger> list = purchaseDialogConfigs.triggerDialog;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseDialogConfigMerchandise> list2 = purchaseDialogConfigs.merchandises;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, PurchaseDialogConfigMerchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = purchaseDialogConfigs.isShowCheckPopup;
            if (bool != null) {
                codedOutputByteBufferNano.A(3, bool.booleanValue());
            }
            List<NavigationTriggerDialog> list3 = purchaseDialogConfigs.navigationTriggerDialog;
            if (list3 != null) {
                codedOutputByteBufferNano.K(4, list3, NavigationTriggerDialog.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SkuConfigs> list4 = purchaseDialogConfigs.skuConfigs;
            if (list4 != null) {
                codedOutputByteBufferNano.K(5, list4, SkuConfigs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LeftSwipeLimitConfig leftSwipeLimitConfig = purchaseDialogConfigs.sceneTriggerDialog;
            if (leftSwipeLimitConfig != null) {
                codedOutputByteBufferNano.K(6, leftSwipeLimitConfig, LeftSwipeLimitConfig.PROTOBUF_ADAPTER);
            }
            TriggerDialogFromListBean triggerDialogFromListBean = purchaseDialogConfigs.triggerDialogFromList;
            if (triggerDialogFromListBean != null) {
                codedOutputByteBufferNano.K(7, triggerDialogFromListBean, TriggerDialogFromListBean.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PurchaseDialogConfigs> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseDialogConfigs>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigs.2
        public Class getDataClass() {
            return PurchaseDialogConfigs.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigs m15082newInstance() {
            return new PurchaseDialogConfigs();
        }

        public boolean parseField(PurchaseDialogConfigs purchaseDialogConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerDialog":
                    purchaseDialogConfigs.triggerDialog = JsonAdapter.parseArray(jsonParser, PurchaseDialogConfigTrigger.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "triggerDialogFromList":
                    purchaseDialogConfigs.triggerDialogFromList = (TriggerDialogFromListBean) TriggerDialogFromListBean.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    purchaseDialogConfigs.sceneTriggerDialog = (LeftSwipeLimitConfig) LeftSwipeLimitConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseDialogConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseDialogConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseDialogConfigs new_() {
        PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
        purchaseDialogConfigs.nullCheck();
        return purchaseDialogConfigs;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurchaseDialogConfigs m15080clone() {
        PurchaseDialogConfigs purchaseDialogConfigs = new PurchaseDialogConfigs();
        List<PurchaseDialogConfigTrigger> list = this.triggerDialog;
        if (list != null) {
            purchaseDialogConfigs.triggerDialog = ValueObject.util_map(list, new w9j() { // from class: l.s2b0
                public final Object call(Object obj) {
                    return ((PurchaseDialogConfigTrigger) obj).m15074clone();
                }
            });
        }
        List<PurchaseDialogConfigMerchandise> list2 = this.merchandises;
        if (list2 != null) {
            purchaseDialogConfigs.merchandises = ValueObject.util_map(list2, new w9j() { // from class: l.t2b0
                public final Object call(Object obj) {
                    return ((PurchaseDialogConfigMerchandise) obj).m15070clone();
                }
            });
        }
        purchaseDialogConfigs.isShowCheckPopup = this.isShowCheckPopup;
        List<NavigationTriggerDialog> list3 = this.navigationTriggerDialog;
        if (list3 != null) {
            purchaseDialogConfigs.navigationTriggerDialog = ValueObject.util_map(list3, new w9j() { // from class: l.u2b0
                public final Object call(Object obj) {
                    return ((NavigationTriggerDialog) obj).m14474clone();
                }
            });
        }
        List<SkuConfigs> list4 = this.skuConfigs;
        if (list4 != null) {
            purchaseDialogConfigs.skuConfigs = ValueObject.util_map(list4, new w9j() { // from class: l.v2b0
                public final Object call(Object obj) {
                    return ((SkuConfigs) obj).m15667clone();
                }
            });
        }
        LeftSwipeLimitConfig leftSwipeLimitConfig = this.sceneTriggerDialog;
        if (leftSwipeLimitConfig != null) {
            purchaseDialogConfigs.sceneTriggerDialog = leftSwipeLimitConfig.m13820clone();
        }
        TriggerDialogFromListBean triggerDialogFromListBean = this.triggerDialogFromList;
        if (triggerDialogFromListBean != null) {
            purchaseDialogConfigs.triggerDialogFromList = triggerDialogFromListBean.m16043clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.merchandises == null) {
            this.merchandises = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
