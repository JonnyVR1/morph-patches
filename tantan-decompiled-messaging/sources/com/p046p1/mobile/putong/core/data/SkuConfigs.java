package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SkuConfigs;
import com.p046p1.mobile.putong.data.PayMethod;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class SkuConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "skuconfigs";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory category;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProductType renewType;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<PayMethod> supportsChannels;

    @NonNull
    @ProtobufIndex(index = 4)
    public String timeType;

    @ProtobufIndex(index = 3)
    public int times;
    public static ProtobufAdapter<SkuConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<SkuConfigs>() { // from class: com.p1.mobile.putong.core.data.SkuConfigs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SkuConfigs skuConfigs) {
            ProductCategory productCategory = skuConfigs.category;
            int iM17230l = productCategory != null ? CodedOutputByteBufferNano.m17230l(1, productCategory, ProductCategory.PROTOBUF_ADAPTER) : 0;
            ProductType productType = skuConfigs.renewType;
            if (productType != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, productType, ProductType.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(3, skuConfigs.times);
            String str = skuConfigs.timeType;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str);
            }
            List<PayMethod> list = skuConfigs.supportsChannels;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, list, PayMethod.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            skuConfigs.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SkuConfigs parse(nb5 nb5Var) throws IOException {
            SkuConfigs skuConfigs = new SkuConfigs();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (skuConfigs.category == null) {
                        skuConfigs.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (skuConfigs.renewType == null) {
                        skuConfigs.renewType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                    }
                    if (skuConfigs.timeType == null) {
                        skuConfigs.timeType = "";
                    }
                    if (skuConfigs.supportsChannels != null) {
                        break;
                    }
                    skuConfigs.supportsChannels = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    skuConfigs.category = (ProductCategory) nb5Var.m158743l(ProductCategory.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    skuConfigs.renewType = (ProductType) nb5Var.m158743l(ProductType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 24) {
                    skuConfigs.times = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    skuConfigs.timeType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (skuConfigs.category == null) {
                            skuConfigs.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (skuConfigs.renewType == null) {
                            skuConfigs.renewType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (skuConfigs.timeType == null) {
                            skuConfigs.timeType = "";
                        }
                        if (skuConfigs.supportsChannels != null) {
                            break;
                        }
                        skuConfigs.supportsChannels = new ArrayList();
                        return skuConfigs;
                    }
                    skuConfigs.supportsChannels = (List) nb5Var.m158743l(PayMethod.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return skuConfigs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SkuConfigs skuConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = skuConfigs.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17254K(1, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            ProductType productType = skuConfigs.renewType;
            if (productType != null) {
                codedOutputByteBufferNano.m17254K(2, productType, ProductType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(3, skuConfigs.times);
            String str = skuConfigs.timeType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            List<PayMethod> list = skuConfigs.supportsChannels;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, PayMethod.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SkuConfigs> JSON_ADAPTER = new ObjectJsonAdapter<SkuConfigs>() { // from class: com.p1.mobile.putong.core.data.SkuConfigs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SkuConfigs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SkuConfigs newInstance() {
            return new SkuConfigs();
        }

        public boolean parseField(SkuConfigs skuConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timeType":
                    skuConfigs.timeType = jsonParser.getValueAsString();
                    return true;
                case "supportsChannels":
                    skuConfigs.supportsChannels = JsonAdapter.parseArray(jsonParser, PayMethod.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    skuConfigs.category = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "times":
                    skuConfigs.times = jsonParser.getValueAsInt();
                    return true;
                case "renewType":
                    skuConfigs.renewType = ProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SkuConfigs skuConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "timeType":
                case "supportsChannels":
                case "category":
                case "times":
                case "renewType":
                    return true;
                default:
                    return super.parseFieldCheck(skuConfigs, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SkuConfigs skuConfigs, JsonGenerator jsonGenerator) throws IOException {
            if (skuConfigs.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(skuConfigs.category, jsonGenerator, true);
            }
            if (skuConfigs.renewType != null) {
                jsonGenerator.writeFieldName("renewType");
                ProductType.JSON_ADAPTER.serialize(skuConfigs.renewType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("times", skuConfigs.times);
            String str = skuConfigs.timeType;
            if (str != null) {
                jsonGenerator.writeStringField("timeType", str);
            }
            if (skuConfigs.supportsChannels != null) {
                jsonGenerator.writeFieldName("supportsChannels");
                JsonAdapter.serializeArray(skuConfigs.supportsChannels, jsonGenerator, PayMethod.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SkuConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SkuConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ PayMethod m35845a(PayMethod payMethod) {
        return payMethod;
    }

    public static SkuConfigs new_() {
        SkuConfigs skuConfigs = new SkuConfigs();
        skuConfigs.nullCheck();
        return skuConfigs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SkuConfigs mo223809clone() {
        SkuConfigs skuConfigs = new SkuConfigs();
        skuConfigs.category = this.category;
        skuConfigs.renewType = this.renewType;
        skuConfigs.times = this.times;
        skuConfigs.timeType = this.timeType;
        List<PayMethod> list = this.supportsChannels;
        if (list != null) {
            skuConfigs.supportsChannels = ValueObject.util_map(list, new w9j() { // from class: l.jjf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SkuConfigs.m35845a((PayMethod) obj);
                }
            });
        }
        return skuConfigs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkuConfigs)) {
            return false;
        }
        SkuConfigs skuConfigs = (SkuConfigs) obj;
        return ValueObject.util_equals(this.category, skuConfigs.category) && ValueObject.util_equals(this.renewType, skuConfigs.renewType) && this.times == skuConfigs.times && ValueObject.util_equals(this.timeType, skuConfigs.timeType) && ValueObject.util_equals(this.supportsChannels, skuConfigs.supportsChannels);
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
        ProductType productType = this.renewType;
        int iHashCode2 = (((iHashCode + (productType != null ? productType.hashCode() : 0)) * 41) + this.times) * 41;
        String str = this.timeType;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        List<PayMethod> list = this.supportsChannels;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.renewType == null) {
            this.renewType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
        }
        if (this.timeType == null) {
            this.timeType = "";
        }
        if (this.supportsChannels == null) {
            this.supportsChannels = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
