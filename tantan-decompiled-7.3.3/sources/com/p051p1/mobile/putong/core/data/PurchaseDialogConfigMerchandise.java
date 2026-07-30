package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise;
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
public class PurchaseDialogConfigMerchandise extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasedialogconfigmerchandise";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory category;

    @ProtobufIndex(index = 3)
    public int defaultQuantity;

    @NonNull
    @ProtobufIndex(index = 6)
    public String defaultUnit;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> order;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> orderUnit;
    public static ProtobufAdapter<PurchaseDialogConfigMerchandise> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseDialogConfigMerchandise>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise) {
            ProductCategory productCategory = purchaseDialogConfigMerchandise.category;
            int iM17281h = productCategory != null ? CodedOutputByteBufferNano.m17281h(1, productCategory.ordinal()) : 0;
            List<String> list = purchaseDialogConfigMerchandise.order;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(3, purchaseDialogConfigMerchandise.defaultQuantity);
            ProductCategory productCategory2 = purchaseDialogConfigMerchandise.category;
            if (productCategory2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(4, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<String> list2 = purchaseDialogConfigMerchandise.orderUnit;
            if (list2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = purchaseDialogConfigMerchandise.defaultUnit;
            if (str != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(6, str);
            }
            purchaseDialogConfigMerchandise.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurchaseDialogConfigMerchandise parse(nc5 nc5Var) throws IOException {
            PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (purchaseDialogConfigMerchandise.category == null && numValueOf != null) {
                        purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 18) {
                    purchaseDialogConfigMerchandise.order = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 24) {
                    purchaseDialogConfigMerchandise.defaultQuantity = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    purchaseDialogConfigMerchandise.category = (ProductCategory) nc5Var.m162488l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    purchaseDialogConfigMerchandise.orderUnit = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 50) {
                        if (purchaseDialogConfigMerchandise.category == null && numValueOf != null) {
                            purchaseDialogConfigMerchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                    purchaseDialogConfigMerchandise.defaultUnit = nc5Var.m162495s();
                }
            }
            return purchaseDialogConfigMerchandise;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = purchaseDialogConfigMerchandise.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17305G(1, productCategory.ordinal());
            }
            List<String> list = purchaseDialogConfigMerchandise.order;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(3, purchaseDialogConfigMerchandise.defaultQuantity);
            ProductCategory productCategory2 = purchaseDialogConfigMerchandise.category;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.m17309K(4, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<String> list2 = purchaseDialogConfigMerchandise.orderUnit;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(5, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = purchaseDialogConfigMerchandise.defaultUnit;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(6, str);
            }
        }
    };
    public static JsonAdapter<PurchaseDialogConfigMerchandise> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseDialogConfigMerchandise>() { // from class: com.p1.mobile.putong.core.data.PurchaseDialogConfigMerchandise.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurchaseDialogConfigMerchandise.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurchaseDialogConfigMerchandise newInstance() {
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
                    purchaseDialogConfigMerchandise.category = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise, JsonGenerator jsonGenerator) throws IOException {
            if (purchaseDialogConfigMerchandise.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(purchaseDialogConfigMerchandise.category, jsonGenerator, true);
            }
            if (purchaseDialogConfigMerchandise.order != null) {
                jsonGenerator.writeFieldName("order");
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseDialogConfigMerchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseDialogConfigMerchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36780a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36781b(String str) {
        return str;
    }

    public static PurchaseDialogConfigMerchandise new_() {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
        purchaseDialogConfigMerchandise.nullCheck();
        return purchaseDialogConfigMerchandise;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurchaseDialogConfigMerchandise mo225055clone() {
        PurchaseDialogConfigMerchandise purchaseDialogConfigMerchandise = new PurchaseDialogConfigMerchandise();
        purchaseDialogConfigMerchandise.category = this.category;
        List<String> list = this.order;
        if (list != null) {
            purchaseDialogConfigMerchandise.order = ValueObject.util_map(list, new qcj() { // from class: l.uab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PurchaseDialogConfigMerchandise.m36780a((String) obj);
                }
            });
        }
        purchaseDialogConfigMerchandise.defaultQuantity = this.defaultQuantity;
        List<String> list2 = this.orderUnit;
        if (list2 != null) {
            purchaseDialogConfigMerchandise.orderUnit = ValueObject.util_map(list2, new qcj() { // from class: l.vab0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PurchaseDialogConfigMerchandise.m36781b((String) obj);
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
        ProductCategory productCategory = this.category;
        int iHashCode = (i2 + (productCategory != null ? productCategory.hashCode() : 0)) * 41;
        List<String> list = this.order;
        int iHashCode2 = (((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.defaultQuantity) * 41;
        List<String> list2 = this.orderUnit;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.defaultUnit;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
