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
public class GPContractQueryParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpcontractqueryparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String platform;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProductCategory productType;
    public static ProtobufAdapter<GPContractQueryParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPContractQueryParams>() { // from class: com.p1.mobile.putong.core.data.GPContractQueryParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPContractQueryParams gPContractQueryParams) {
            String str = gPContractQueryParams.platform;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ProductCategory productCategory = gPContractQueryParams.productType;
            if (productCategory != null) {
                iO += CodedOutputByteBufferNano.h(2, productCategory.ordinal());
            }
            ProductCategory productCategory2 = gPContractQueryParams.productType;
            if (productCategory2 != null) {
                iO += CodedOutputByteBufferNano.l(3, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            ((MessageNano) gPContractQueryParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPContractQueryParams m12871parse(nb5 nb5Var) throws IOException {
            GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPContractQueryParams.productType == null && numValueOf != null) {
                        gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 10) {
                    gPContractQueryParams.platform = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 26) {
                        if (gPContractQueryParams.productType == null && numValueOf != null) {
                            gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    gPContractQueryParams.productType = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                }
            }
            return gPContractQueryParams;
        }

        public void serialize(GPContractQueryParams gPContractQueryParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPContractQueryParams.platform;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            ProductCategory productCategory = gPContractQueryParams.productType;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(2, productCategory.ordinal());
            }
            ProductCategory productCategory2 = gPContractQueryParams.productType;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(3, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPContractQueryParams> JSON_ADAPTER = new ObjectJsonAdapter<GPContractQueryParams>() { // from class: com.p1.mobile.putong.core.data.GPContractQueryParams.2
        public Class getDataClass() {
            return GPContractQueryParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPContractQueryParams m12872newInstance() {
            return new GPContractQueryParams();
        }

        public boolean parseField(GPContractQueryParams gPContractQueryParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("productType")) {
                gPContractQueryParams.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPContractQueryParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPContractQueryParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPContractQueryParams new_() {
        GPContractQueryParams gPContractQueryParams = new GPContractQueryParams();
        gPContractQueryParams.nullCheck();
        return gPContractQueryParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPContractQueryParams m12870clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.platform;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ProductCategory productCategory = this.productType;
        int iHashCode2 = iHashCode + (productCategory != null ? productCategory.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.productType == null) {
            this.productType = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
