package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
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
public class PurchaseDialogConfigMerchandise extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasedialogconfigmerchandise";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory category;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int defaultQuantity;

    @NonNull
    @ProtobufIndex(index = 6)
    public String defaultUnit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> order;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<String> orderUnit;
    public static ProtobufAdapter<PurchaseDialogConfigMerchandise> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseDialogConfigMerchandise>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise) {
            ProductCategory productCategory = purchaseDialogConfigMerchandise.category;
            int iH = productCategory != null ? CodedOutputByteBufferNano.h(1, productCategory.ordinal()) : 0;
            List<String> list = purchaseDialogConfigMerchandise.order;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, purchaseDialogConfigMerchandise.defaultQuantity);
            ProductCategory productCategory2 = purchaseDialogConfigMerchandise.category;
            if (productCategory2 != null) {
                iH2 += CodedOutputByteBufferNano.l(4, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<String> list2 = purchaseDialogConfigMerchandise.orderUnit;
            if (list2 != null) {
                iH2 += CodedOutputByteBufferNano.l(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = purchaseDialogConfigMerchandise.defaultUnit;
            if (str != null) {
                iH2 += CodedOutputByteBufferNano.o(6, str);
            }
            ((MessageNano) purchaseDialogConfigMerchandise).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigMerchandise m15071parse(nb5 nb5Var) throws IOException {
            PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purchaseDialogConfigMerchandise.category == null && numValueOf != null) {
                        purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (purchaseDialogConfigMerchandise.category == null) {
                        purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (purchaseDialogConfigMerchandise.order == null) {
                        purchaseDialogConfigMerchandise.order = new ArrayList();
                    }
                    if (purchaseDialogConfigMerchandise.orderUnit == null) {
                        purchaseDialogConfigMerchandise.orderUnit = new ArrayList();
                    }
                    if (purchaseDialogConfigMerchandise.defaultUnit != null) {
                        break;
                    }
                    purchaseDialogConfigMerchandise.defaultUnit = "";
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    purchaseDialogConfigMerchandise.order = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    purchaseDialogConfigMerchandise.defaultQuantity = nb5Var.j();
                } else if (iU == 34) {
                    purchaseDialogConfigMerchandise.category = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    purchaseDialogConfigMerchandise.orderUnit = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
                        if (purchaseDialogConfigMerchandise.category == null && numValueOf != null) {
                            purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (purchaseDialogConfigMerchandise.category == null) {
                            purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (purchaseDialogConfigMerchandise.order == null) {
                            purchaseDialogConfigMerchandise.order = new ArrayList();
                        }
                        if (purchaseDialogConfigMerchandise.orderUnit == null) {
                            purchaseDialogConfigMerchandise.orderUnit = new ArrayList();
                        }
                        if (purchaseDialogConfigMerchandise.defaultUnit != null) {
                            break;
                        }
                        purchaseDialogConfigMerchandise.defaultUnit = "";
                        return purchaseDialogConfigMerchandise;
                    }
                    purchaseDialogConfigMerchandise.defaultUnit = nb5Var.s();
                }
            }
            return purchaseDialogConfigMerchandise;
        }

        public void serialize(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = purchaseDialogConfigMerchandise.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(1, productCategory.ordinal());
            }
            List<String> list = purchaseDialogConfigMerchandise.order;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, purchaseDialogConfigMerchandise.defaultQuantity);
            ProductCategory productCategory2 = purchaseDialogConfigMerchandise.category;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(4, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<String> list2 = purchaseDialogConfigMerchandise.orderUnit;
            if (list2 != null) {
                codedOutputByteBufferNano.K(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = purchaseDialogConfigMerchandise.defaultUnit;
            if (str != null) {
                codedOutputByteBufferNano.R(6, str);
            }
        }
    };
    public static JsonAdapter<PurchaseDialogConfigMerchandise> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseDialogConfigMerchandise>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise.2
        public Class getDataClass() {
            return PurchaseDialogConfigMerchandise.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurchaseDialogConfigMerchandise m15072newInstance() {
            return new PurchaseDialogConfigMerchandise();
        }

        public boolean parseField(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "defaultUnit":
                    purchaseDialogConfigMerchandise.defaultUnit = jsonParser.getValueAsString();
                    return true;
                case "orderUnit":
                    purchaseDialogConfigMerchandise.orderUnit = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "order":
                    purchaseDialogConfigMerchandise.order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "default":
                    purchaseDialogConfigMerchandise.defaultQuantity = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "defaultUnit":
                case "orderUnit":
                case "category":
                case "order":
                case "default":
                    return true;
                default:
                    return super.parseFieldCheck(purchaseDialogConfigMerchandise, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, JsonGenerator jsonGenerator) throws IOException {
            if (purchaseDialogConfigMerchandise.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(purchaseDialogConfigMerchandise.category, jsonGenerator, true);
            }
            if (purchaseDialogConfigMerchandise.order != null) {
                jsonGenerator.writeFieldName(IntlPayQueryType.order);
                JsonAdapter.serializeArray(purchaseDialogConfigMerchandise.order, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("default", purchaseDialogConfigMerchandise.defaultQuantity);
            if (purchaseDialogConfigMerchandise.orderUnit != null) {
                jsonGenerator.writeFieldName("orderUnit");
                JsonAdapter.serializeArray(purchaseDialogConfigMerchandise.orderUnit, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = purchaseDialogConfigMerchandise.defaultUnit;
            if (str != null) {
                jsonGenerator.writeStringField("defaultUnit", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseDialogConfigMerchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseDialogConfigMerchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m579a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m580b(String str) {
        return str;
    }

    public static PurchaseDialogConfigMerchandise new_() {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
        purchaseDialogConfigMerchandise.nullCheck();
        return purchaseDialogConfigMerchandise;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurchaseDialogConfigMerchandise m15070clone() {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
        purchaseDialogConfigMerchandise.category = this.category;
        List<String> list = this.order;
        if (list != null) {
            purchaseDialogConfigMerchandise.order = ValueObject.util_map(list, new w9j() { // from class: l.q2b0
                public final Object call(Object obj) {
                    return PurchaseDialogConfigMerchandise.m579a((String) obj);
                }
            });
        }
        purchaseDialogConfigMerchandise.defaultQuantity = this.defaultQuantity;
        List<String> list2 = this.orderUnit;
        if (list2 != null) {
            purchaseDialogConfigMerchandise.orderUnit = ValueObject.util_map(list2, new w9j() { // from class: l.r2b0
                public final Object call(Object obj) {
                    return PurchaseDialogConfigMerchandise.m580b((String) obj);
                }
            });
        }
        purchaseDialogConfigMerchandise.defaultUnit = this.defaultUnit;
        return purchaseDialogConfigMerchandise;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseDialogConfigMerchandise)) {
            return false;
        }
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = (PurchaseDialogConfigMerchandise) obj;
        return ValueObject.util_equals(this.category, purchaseDialogConfigMerchandise.category) && ValueObject.util_equals(this.order, purchaseDialogConfigMerchandise.order) && this.defaultQuantity == purchaseDialogConfigMerchandise.defaultQuantity && ValueObject.util_equals(this.orderUnit, purchaseDialogConfigMerchandise.orderUnit) && ValueObject.util_equals(this.defaultUnit, purchaseDialogConfigMerchandise.defaultUnit);
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
        ProductCategory productCategory = this.category;
        int iHashCode = (i2 + (productCategory != null ? productCategory.hashCode() : 0)) * 41;
        List<String> list = this.order;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.defaultQuantity) * 41;
        List<String> list2 = this.orderUnit;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.defaultUnit;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.order == null) {
            this.order = new ArrayList();
        }
        if (this.orderUnit == null) {
            this.orderUnit = new ArrayList();
        }
        if (this.defaultUnit == null) {
            this.defaultUnit = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
