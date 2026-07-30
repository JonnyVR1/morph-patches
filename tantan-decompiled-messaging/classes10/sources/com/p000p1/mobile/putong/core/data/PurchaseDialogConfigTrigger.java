package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PurchaseDialogConfigTrigger extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasedialogconfigtrigger";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProductCategory defaultCategory;

    @NonNull
    @ProtobufIndex(index = 1)
    public String membership;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public PurchaseDialogConfigTriggerShowType showType;
    public static ProtobufAdapter<PurchaseDialogConfigTrigger> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseDialogConfigTrigger>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigTrigger.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurchaseDialogConfigTrigger purchaseDialogConfigTrigger) {
            String str = purchaseDialogConfigTrigger.membership;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = purchaseDialogConfigTrigger.showType;
            if (purchaseDialogConfigTriggerShowType != null) {
                iO += CodedOutputByteBufferNano.h(2, purchaseDialogConfigTriggerShowType.ordinal());
            }
            ProductCategory productCategory = purchaseDialogConfigTrigger.defaultCategory;
            if (productCategory != null) {
                iO += CodedOutputByteBufferNano.h(3, productCategory.ordinal());
            }
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType2 = purchaseDialogConfigTrigger.showType;
            if (purchaseDialogConfigTriggerShowType2 != null) {
                iO += CodedOutputByteBufferNano.l(4, purchaseDialogConfigTriggerShowType2, PurchaseDialogConfigTriggerShowType.PROTOBUF_ADAPTER);
            }
            ProductCategory productCategory2 = purchaseDialogConfigTrigger.defaultCategory;
            if (productCategory2 != null) {
                iO += CodedOutputByteBufferNano.l(5, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            ((MessageNano) purchaseDialogConfigTrigger).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigTrigger m15075parse(nb5 nb5Var) throws IOException {
            PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = new PurchaseDialogConfigTrigger();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purchaseDialogConfigTrigger.showType == null && numValueOf != null) {
                        purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (purchaseDialogConfigTrigger.defaultCategory == null && numValueOf2 != null) {
                        purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                    }
                    if (purchaseDialogConfigTrigger.membership == null) {
                        purchaseDialogConfigTrigger.membership = "";
                    }
                    if (purchaseDialogConfigTrigger.showType == null) {
                        purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.defaultEnum();
                    }
                    if (purchaseDialogConfigTrigger.defaultCategory != null) {
                        break;
                    }
                    purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    purchaseDialogConfigTrigger.membership = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) nb5Var.l(PurchaseDialogConfigTriggerShowType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (purchaseDialogConfigTrigger.showType == null && numValueOf != null) {
                            purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (purchaseDialogConfigTrigger.defaultCategory == null && numValueOf2 != null) {
                            purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (purchaseDialogConfigTrigger.membership == null) {
                            purchaseDialogConfigTrigger.membership = "";
                        }
                        if (purchaseDialogConfigTrigger.showType == null) {
                            purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.defaultEnum();
                        }
                        if (purchaseDialogConfigTrigger.defaultCategory != null) {
                            break;
                        }
                        purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        return purchaseDialogConfigTrigger;
                    }
                    purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                }
            }
            return purchaseDialogConfigTrigger;
        }

        public void serialize(PurchaseDialogConfigTrigger purchaseDialogConfigTrigger, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = purchaseDialogConfigTrigger.membership;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = purchaseDialogConfigTrigger.showType;
            if (purchaseDialogConfigTriggerShowType != null) {
                codedOutputByteBufferNano.G(2, purchaseDialogConfigTriggerShowType.ordinal());
            }
            ProductCategory productCategory = purchaseDialogConfigTrigger.defaultCategory;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(3, productCategory.ordinal());
            }
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType2 = purchaseDialogConfigTrigger.showType;
            if (purchaseDialogConfigTriggerShowType2 != null) {
                codedOutputByteBufferNano.K(4, purchaseDialogConfigTriggerShowType2, PurchaseDialogConfigTriggerShowType.PROTOBUF_ADAPTER);
            }
            ProductCategory productCategory2 = purchaseDialogConfigTrigger.defaultCategory;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(5, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PurchaseDialogConfigTrigger> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseDialogConfigTrigger>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigTrigger.2
        public Class getDataClass() {
            return PurchaseDialogConfigTrigger.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigTrigger m15076newInstance() {
            return new PurchaseDialogConfigTrigger();
        }

        public boolean parseField(PurchaseDialogConfigTrigger purchaseDialogConfigTrigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "membership":
                    purchaseDialogConfigTrigger.membership = jsonParser.getValueAsString();
                    return true;
                case "showType":
                    purchaseDialogConfigTrigger.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultCategory":
                    purchaseDialogConfigTrigger.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurchaseDialogConfigTrigger purchaseDialogConfigTrigger, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "membership":
                case "showType":
                case "defaultCategory":
                    return true;
                default:
                    return super.parseFieldCheck(purchaseDialogConfigTrigger, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PurchaseDialogConfigTrigger purchaseDialogConfigTrigger, JsonGenerator jsonGenerator) throws IOException {
            String str = purchaseDialogConfigTrigger.membership;
            if (str != null) {
                jsonGenerator.writeStringField("membership", str);
            }
            if (purchaseDialogConfigTrigger.showType != null) {
                jsonGenerator.writeFieldName("showType");
                PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.serialize(purchaseDialogConfigTrigger.showType, jsonGenerator, true);
            }
            if (purchaseDialogConfigTrigger.defaultCategory != null) {
                jsonGenerator.writeFieldName("defaultCategory");
                ProductCategory.JSON_ADAPTER.serialize(purchaseDialogConfigTrigger.defaultCategory, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseDialogConfigTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseDialogConfigTrigger) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseDialogConfigTrigger new_() {
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = new PurchaseDialogConfigTrigger();
        purchaseDialogConfigTrigger.nullCheck();
        return purchaseDialogConfigTrigger;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurchaseDialogConfigTrigger m15074clone() {
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = new PurchaseDialogConfigTrigger();
        purchaseDialogConfigTrigger.membership = this.membership;
        purchaseDialogConfigTrigger.showType = this.showType;
        purchaseDialogConfigTrigger.defaultCategory = this.defaultCategory;
        return purchaseDialogConfigTrigger;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseDialogConfigTrigger)) {
            return false;
        }
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = (PurchaseDialogConfigTrigger) obj;
        return ValueObject.util_equals(this.membership, purchaseDialogConfigTrigger.membership) && ValueObject.util_equals(this.showType, purchaseDialogConfigTrigger.showType) && ValueObject.util_equals(this.defaultCategory, purchaseDialogConfigTrigger.defaultCategory);
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
        String str = this.membership;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = this.showType;
        int iHashCode2 = (iHashCode + (purchaseDialogConfigTriggerShowType != null ? purchaseDialogConfigTriggerShowType.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.defaultCategory;
        int iHashCode3 = iHashCode2 + (productCategory != null ? productCategory.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.membership == null) {
            this.membership = "";
        }
        if (this.showType == null) {
            this.showType = (PurchaseDialogConfigTriggerShowType) PurchaseDialogConfigTriggerShowType.JSON_ADAPTER.defaultEnum();
        }
        if (this.defaultCategory == null) {
            this.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
