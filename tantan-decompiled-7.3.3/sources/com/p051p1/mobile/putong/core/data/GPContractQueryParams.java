package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class GPContractQueryParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractqueryparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String platform;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProductCategory productType;
    public static ProtobufAdapter<GPContractQueryParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractQueryParams>() { // from class: com.p1.mobile.putong.core.data.GPContractQueryParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPContractQueryParams gPContractQueryParams) {
            String str = gPContractQueryParams.platform;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            ProductCategory productCategory = gPContractQueryParams.productType;
            if (productCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, productCategory.ordinal());
            }
            ProductCategory productCategory2 = gPContractQueryParams.productType;
            if (productCategory2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            gPContractQueryParams.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPContractQueryParams parse(nc5 nc5Var) throws IOException {
            GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPContractQueryParams.productType == null && numValueOf != null) {
                        gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (gPContractQueryParams.platform == null) {
                        gPContractQueryParams.platform = "";
                    }
                    if (gPContractQueryParams.productType != null) {
                        break;
                    }
                    gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    gPContractQueryParams.platform = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 26) {
                        if (gPContractQueryParams.productType == null && numValueOf != null) {
                            gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (gPContractQueryParams.platform == null) {
                            gPContractQueryParams.platform = "";
                        }
                        if (gPContractQueryParams.productType != null) {
                            break;
                        }
                        gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        return gPContractQueryParams;
                    }
                    gPContractQueryParams.productType = (ProductCategory) nc5Var.m162488l(ProductCategory.PROTOBUF_ADAPTER);
                }
            }
            return gPContractQueryParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPContractQueryParams gPContractQueryParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPContractQueryParams.platform;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            ProductCategory productCategory = gPContractQueryParams.productType;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17305G(2, productCategory.ordinal());
            }
            ProductCategory productCategory2 = gPContractQueryParams.productType;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.m17309K(3, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPContractQueryParams> JSON_ADAPTER = new ObjectJsonAdapter<GPContractQueryParams>() { // from class: com.p1.mobile.putong.core.data.GPContractQueryParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPContractQueryParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPContractQueryParams newInstance() {
            return new GPContractQueryParams();
        }

        public boolean parseField(GPContractQueryParams gPContractQueryParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("productType")) {
                gPContractQueryParams.productType = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("platform")) {
                return false;
            }
            gPContractQueryParams.platform = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GPContractQueryParams gPContractQueryParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("productType") || str.equals("platform")) {
                return true;
            }
            return super.parseFieldCheck(gPContractQueryParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPContractQueryParams gPContractQueryParams, JsonGenerator jsonGenerator) throws IOException {
            String str = gPContractQueryParams.platform;
            if (str != null) {
                jsonGenerator.writeStringField("platform", str);
            }
            if (gPContractQueryParams.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductCategory.JSON_ADAPTER.serialize(gPContractQueryParams.productType, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractQueryParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractQueryParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractQueryParams new_() {
        GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.nullCheck();
        return gPContractQueryParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPContractQueryParams mo225055clone() {
        GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.platform = this.platform;
        gPContractQueryParams.productType = this.productType;
        return gPContractQueryParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPContractQueryParams)) {
            return false;
        }
        GPContractQueryParams gPContractQueryParams = (GPContractQueryParams) obj;
        return ValueObject.util_equals(this.platform, gPContractQueryParams.platform) && ValueObject.util_equals(this.productType, gPContractQueryParams.productType);
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
        String str = this.platform;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.productType;
        int iHashCode2 = iHashCode + (productCategory != null ? productCategory.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.productType == null) {
            this.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
