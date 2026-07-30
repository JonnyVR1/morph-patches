package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.mrf0;
import l.nb5;
import l.orh0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Merchandise extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "merchandise";

    @NonNull
    @ProtobufIndex(index = 51)
    public ProductCategory category;

    @NonNull
    @ProtobufIndex(index = 54)
    public StockKeepUnit defaultStockKeepUnit;

    @NonNull
    @ProtobufIndex(index = 58)
    public MerchandiseDurationDesc duration;

    @NonNull
    @ProtobufIndex(index = 59)
    public MerchandiseExtra extra;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<Coupon> localCoupons;

    @NonNull
    @ProtobufIndex(index = 53)
    public ProductType productType;

    @ProtobufIndex(index = 52)
    public int quantity;
    public static ProtobufAdapter<Merchandise> PROTOBUF_ADAPTER = new MessageNanoAdapter<Merchandise>() { // from class: com.p1.mobile.putong.core.data.Merchandise.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Merchandise merchandise) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) merchandise)._id);
            String str = ((DbObject) merchandise).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            ProductCategory productCategory = merchandise.category;
            if (productCategory != null) {
                iJ += CodedOutputByteBufferNano.h(51, productCategory.ordinal());
            }
            int iH = iJ + CodedOutputByteBufferNano.h(52, merchandise.quantity);
            ProductType productType = merchandise.productType;
            if (productType != null) {
                iH += CodedOutputByteBufferNano.h(53, productType.ordinal());
            }
            StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
            if (stockKeepUnit != null) {
                iH += CodedOutputByteBufferNano.l(54, stockKeepUnit, StockKeepUnit.PROTOBUF_ADAPTER);
            }
            ProductCategory productCategory2 = merchandise.category;
            if (productCategory2 != null) {
                iH += CodedOutputByteBufferNano.l(55, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            ProductType productType2 = merchandise.productType;
            if (productType2 != null) {
                iH += CodedOutputByteBufferNano.l(56, productType2, ProductType.PROTOBUF_ADAPTER);
            }
            List<Coupon> list = merchandise.localCoupons;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(57, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MerchandiseDurationDesc merchandiseDurationDesc = merchandise.duration;
            if (merchandiseDurationDesc != null) {
                iH += CodedOutputByteBufferNano.l(58, merchandiseDurationDesc, MerchandiseDurationDesc.PROTOBUF_ADAPTER);
            }
            MerchandiseExtra merchandiseExtra = merchandise.extra;
            if (merchandiseExtra != null) {
                iH += CodedOutputByteBufferNano.l(59, merchandiseExtra, MerchandiseExtra.PROTOBUF_ADAPTER);
            }
            ((MessageNano) merchandise).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Merchandise m14137parse(nb5 nb5Var) throws IOException {
            Merchandise merchandise = new Merchandise();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (merchandise.category == null && numValueOf != null) {
                            merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (merchandise.productType == null && numValueOf2 != null) {
                            merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (merchandise.category == null) {
                            merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (merchandise.productType == null) {
                            merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (merchandise.defaultStockKeepUnit == null) {
                            merchandise.defaultStockKeepUnit = StockKeepUnit.new_();
                        }
                        if (merchandise.localCoupons == null) {
                            merchandise.localCoupons = new ArrayList();
                        }
                        if (merchandise.duration == null) {
                            merchandise.duration = MerchandiseDurationDesc.new_();
                        }
                        if (merchandise.extra == null) {
                            merchandise.extra = MerchandiseExtra.new_();
                        }
                        break;
                    case 8:
                        ((DbObject) merchandise)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) merchandise).id = nb5Var.s();
                        continue;
                    case 408:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 416:
                        merchandise.quantity = nb5Var.j();
                        continue;
                    case 424:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 434:
                        merchandise.defaultStockKeepUnit = (StockKeepUnit) nb5Var.l(StockKeepUnit.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        merchandise.category = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        merchandise.productType = (ProductType) nb5Var.l(ProductType.PROTOBUF_ADAPTER);
                        continue;
                    case 458:
                        merchandise.localCoupons = (List) nb5Var.l(Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        merchandise.duration = (MerchandiseDurationDesc) nb5Var.l(MerchandiseDurationDesc.PROTOBUF_ADAPTER);
                        continue;
                    case 474:
                        merchandise.extra = (MerchandiseExtra) nb5Var.l(MerchandiseExtra.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (merchandise.category == null && numValueOf != null) {
                            merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (merchandise.productType == null && numValueOf2 != null) {
                            merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (merchandise.category == null) {
                            merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (merchandise.productType == null) {
                            merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (merchandise.defaultStockKeepUnit == null) {
                            merchandise.defaultStockKeepUnit = StockKeepUnit.new_();
                        }
                        if (merchandise.localCoupons == null) {
                            merchandise.localCoupons = new ArrayList();
                        }
                        if (merchandise.duration == null) {
                            merchandise.duration = MerchandiseDurationDesc.new_();
                        }
                        if (merchandise.extra == null) {
                            merchandise.extra = MerchandiseExtra.new_();
                            return merchandise;
                        }
                        break;
                }
            }
            return merchandise;
        }

        public void serialize(Merchandise merchandise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) merchandise)._id);
            String str = ((DbObject) merchandise).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            ProductCategory productCategory = merchandise.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.G(51, productCategory.ordinal());
            }
            codedOutputByteBufferNano.G(52, merchandise.quantity);
            ProductType productType = merchandise.productType;
            if (productType != null) {
                codedOutputByteBufferNano.G(53, productType.ordinal());
            }
            StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
            if (stockKeepUnit != null) {
                codedOutputByteBufferNano.K(54, stockKeepUnit, StockKeepUnit.PROTOBUF_ADAPTER);
            }
            ProductCategory productCategory2 = merchandise.category;
            if (productCategory2 != null) {
                codedOutputByteBufferNano.K(55, productCategory2, ProductCategory.PROTOBUF_ADAPTER);
            }
            ProductType productType2 = merchandise.productType;
            if (productType2 != null) {
                codedOutputByteBufferNano.K(56, productType2, ProductType.PROTOBUF_ADAPTER);
            }
            List<Coupon> list = merchandise.localCoupons;
            if (list != null) {
                codedOutputByteBufferNano.K(57, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MerchandiseDurationDesc merchandiseDurationDesc = merchandise.duration;
            if (merchandiseDurationDesc != null) {
                codedOutputByteBufferNano.K(58, merchandiseDurationDesc, MerchandiseDurationDesc.PROTOBUF_ADAPTER);
            }
            MerchandiseExtra merchandiseExtra = merchandise.extra;
            if (merchandiseExtra != null) {
                codedOutputByteBufferNano.K(59, merchandiseExtra, MerchandiseExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Merchandise> JSON_ADAPTER = new ObjectJsonAdapter<Merchandise>() { // from class: com.p1.mobile.putong.core.data.Merchandise.2
        public Class getDataClass() {
            return Merchandise.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Merchandise m14138newInstance() {
            return new Merchandise();
        }

        public boolean parseField(Merchandise merchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    merchandise.duration = (MerchandiseDurationDesc) MerchandiseDurationDesc.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "productType":
                    merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultStockKeepUnit":
                    merchandise.defaultStockKeepUnit = (StockKeepUnit) StockKeepUnit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quantity":
                    merchandise.quantity = jsonParser.getValueAsInt();
                    return true;
                case "localCoupons":
                    merchandise.localCoupons = JsonAdapter.parseArray(jsonParser, Coupon.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) merchandise).id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "extra":
                    merchandise.extra = (MerchandiseExtra) MerchandiseExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Merchandise merchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "productType":
                case "defaultStockKeepUnit":
                case "quantity":
                case "localCoupons":
                    return true;
                case "id":
                    return false;
                case "category":
                case "extra":
                    return true;
                default:
                    return super.parseFieldCheck(merchandise, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Merchandise merchandise, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) merchandise).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (merchandise.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(merchandise.category, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("quantity", merchandise.quantity);
            if (merchandise.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ProductType.JSON_ADAPTER.serialize(merchandise.productType, jsonGenerator, true);
            }
            if (merchandise.defaultStockKeepUnit != null) {
                jsonGenerator.writeFieldName("defaultStockKeepUnit");
                StockKeepUnit.JSON_ADAPTER.serialize(merchandise.defaultStockKeepUnit, jsonGenerator, true);
            }
            if (merchandise.localCoupons != null) {
                jsonGenerator.writeFieldName("localCoupons");
                JsonAdapter.serializeArray(merchandise.localCoupons, jsonGenerator, Coupon.JSON_ADAPTER);
            }
            if (merchandise.duration != null) {
                jsonGenerator.writeFieldName("duration");
                MerchandiseDurationDesc.JSON_ADAPTER.serialize(merchandise.duration, jsonGenerator, true);
            }
            if (merchandise.extra != null) {
                jsonGenerator.writeFieldName("extra");
                MerchandiseExtra.JSON_ADAPTER.serialize(merchandise.extra, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Merchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Merchandise> _ID = new LongColumn<Merchandise>("_id") { // from class: com.p1.mobile.putong.core.data.Merchandise.3
        public Long get(Merchandise merchandise) {
            return Long.valueOf(((DbObject) merchandise)._id);
        }

        public void set(Merchandise merchandise, Long l2) {
            ((DbObject) merchandise)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Merchandise> f102ID = new StringColumn<Merchandise>("id_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.4
        public String get(Merchandise merchandise) {
            return ((DbObject) merchandise).id;
        }

        public void set(Merchandise merchandise, String str) {
            ((DbObject) merchandise).id = str;
        }
    };
    public static final TEnumColumn<Merchandise, ProductCategory> CATEGORY = new TEnumColumn<Merchandise, ProductCategory>("str_category_c", "category_c", ProductCategory.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Merchandise.5
        public ProductCategory get(Merchandise merchandise) {
            return merchandise.category;
        }

        public void setTEnum(Merchandise merchandise, ProductCategory productCategory) {
            merchandise.category = productCategory;
        }
    };
    public static final IntegerColumn<Merchandise> QUANTITY = new IntegerColumn<Merchandise>("quantity_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.6
        public Integer get(Merchandise merchandise) {
            return Integer.valueOf(merchandise.quantity);
        }

        public void set(Merchandise merchandise, Integer num) {
            merchandise.quantity = num.intValue();
        }
    };
    public static final TEnumColumn<Merchandise, ProductType> PRODUCTTYPE = new TEnumColumn<Merchandise, ProductType>("str_productType_c", "productType_c", ProductType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Merchandise.7
        public ProductType get(Merchandise merchandise) {
            return merchandise.productType;
        }

        public void setTEnum(Merchandise merchandise, ProductType productType) {
            merchandise.productType = productType;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_ID = new StringColumn<Merchandise>("defaultStockKeepUnit_id_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.8
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.f169id;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.f169id = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_TYPE = new StringColumn<Merchandise>("defaultStockKeepUnit_type_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.9
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.type;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.type = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_AFFILIATEPRODUCTS_ALIPAY = new StringColumn<Merchandise>("defaultStockKeepUnit_affiliateProducts_alipay_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.10
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.affiliateProducts.alipay;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.affiliateProducts.alipay = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_AFFILIATEPRODUCTS_WECHAT = new StringColumn<Merchandise>("defaultStockKeepUnit_affiliateProducts_wechat_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.11
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.affiliateProducts.wechat;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.affiliateProducts.wechat = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_AFFILIATEPRODUCTS_GOOGLEPLAY = new StringColumn<Merchandise>("defaultStockKeepUnit_affiliateProducts_googleplay_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.12
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.affiliateProducts.googleplay;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.affiliateProducts.googleplay = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_AFFILIATEPRODUCTS_HUAWEI = new StringColumn<Merchandise>("defaultStockKeepUnit_affiliateProducts_huawei_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.13
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.affiliateProducts.huawei;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.affiliateProducts.huawei = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_CURRENCYCODE = new StringColumn<Merchandise>("defaultStockKeepUnit_prices_currencyCode_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.14
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.prices.currencyCode;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.prices.currencyCode = str;
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_CURRENCYSYMBOL = new StringColumn<Merchandise>("defaultStockKeepUnit_prices_currencySymbol_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.15
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.prices.currencySymbol;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.prices.currencySymbol = str;
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_PRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_price_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.16
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.price);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.price = d.doubleValue();
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_UNITPRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_unitPrice_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.17
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.unitPrice);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.unitPrice = d.doubleValue();
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_ORIGINALPRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_originalPrice_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.18
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.originalPrice);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.originalPrice = d.doubleValue();
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_ORIGINALUNITPRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_originalUnitPrice_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.19
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.originalUnitPrice);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.originalUnitPrice = d.doubleValue();
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_NONERENEWALPRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_noneRenewalPrice_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.20
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.noneRenewalPrice = d.doubleValue();
        }
    };
    public static final DoubleColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_PRICES_NONERENEWALUNITPRICE = new DoubleColumn<Merchandise>("defaultStockKeepUnit_prices_noneRenewalUnitPrice_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.21
        public Double get(Merchandise merchandise) {
            return Double.valueOf(merchandise.defaultStockKeepUnit.prices.noneRenewalUnitPrice);
        }

        public void set(Merchandise merchandise, Double d) {
            merchandise.defaultStockKeepUnit.prices.noneRenewalUnitPrice = d.doubleValue();
        }
    };
    public static final StringColumn<Merchandise> DEFAULTSTOCKKEEPUNIT_TRACKER = new StringColumn<Merchandise>("defaultStockKeepUnit_tracker_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.22
        public String get(Merchandise merchandise) {
            return merchandise.defaultStockKeepUnit.tracker;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.defaultStockKeepUnit.tracker = str;
        }
    };
    public static final Column<Merchandise, List<Coupon>> LOCALCOUPONS = new Column<Merchandise, List<Coupon>>("localCoupons_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.23
        public List<Coupon> get(Merchandise merchandise) {
            return merchandise.localCoupons;
        }

        public void set(Merchandise merchandise, List<Coupon> list) {
            merchandise.localCoupons = list;
        }
    };
    public static final IntegerColumn<Merchandise> DURATION_TIMES = new IntegerColumn<Merchandise>("duration_times_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.24
        public Integer get(Merchandise merchandise) {
            return Integer.valueOf(merchandise.duration.times);
        }

        public void set(Merchandise merchandise, Integer num) {
            merchandise.duration.times = num.intValue();
        }
    };
    public static final StringColumn<Merchandise> DURATION_TIMEUNIT = new StringColumn<Merchandise>("duration_timeUnit_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.25
        public String get(Merchandise merchandise) {
            return merchandise.duration.timeUnit;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.duration.timeUnit = str;
        }
    };
    public static final StringColumn<Merchandise> EXTRA_DISCOUNTTEXT = new StringColumn<Merchandise>("extra_discountText_c") { // from class: com.p1.mobile.putong.core.data.Merchandise.26
        public String get(Merchandise merchandise) {
            return merchandise.extra.discountText;
        }

        public void set(Merchandise merchandise, String str) {
            merchandise.extra.discountText = str;
        }
    };
    public static mrf0<Merchandise> DB_ADAPTER = new mrf0<Merchandise>() { // from class: com.p1.mobile.putong.core.data.Merchandise.27
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,category_c INTEGER,quantity_c INTEGER,productType_c INTEGER,defaultStockKeepUnit_id_c TEXT,defaultStockKeepUnit_type_c TEXT,defaultStockKeepUnit_affiliateProducts_alipay_c TEXT,defaultStockKeepUnit_affiliateProducts_wechat_c TEXT,defaultStockKeepUnit_affiliateProducts_googleplay_c TEXT,defaultStockKeepUnit_affiliateProducts_huawei_c TEXT,defaultStockKeepUnit_prices_currencyCode_c TEXT,defaultStockKeepUnit_prices_currencySymbol_c TEXT,defaultStockKeepUnit_prices_price_c REAL,defaultStockKeepUnit_prices_unitPrice_c REAL,defaultStockKeepUnit_prices_originalPrice_c REAL,defaultStockKeepUnit_prices_originalUnitPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalPrice_c REAL,defaultStockKeepUnit_prices_noneRenewalUnitPrice_c REAL,defaultStockKeepUnit_tracker_c TEXT,str_category_c TEXT,str_productType_c TEXT,localCoupons_c BLOB,duration_times_c INTEGER,duration_timeUnit_c TEXT,extra_discountText_c TEXT)";
        }

        public Class getDataClass() {
            return Merchandise.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public Merchandise m14139init() {
            Merchandise merchandise = new Merchandise();
            if (merchandise.category == null) {
                merchandise.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
            }
            if (merchandise.productType == null) {
                merchandise.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
            }
            if (merchandise.defaultStockKeepUnit == null) {
                merchandise.defaultStockKeepUnit = StockKeepUnit.new_();
            }
            if (merchandise.localCoupons == null) {
                merchandise.localCoupons = new ArrayList();
            }
            if (merchandise.duration == null) {
                merchandise.duration = MerchandiseDurationDesc.new_();
            }
            if (merchandise.extra == null) {
                merchandise.extra = MerchandiseExtra.new_();
            }
            return merchandise;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Merchandise m14140read(Cursor cursor, int i) {
            String str;
            int i2;
            int i3;
            String string;
            String string2 = "unknown_";
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            Merchandise merchandise = new Merchandise();
            int i4 = -1;
            try {
                merchandise.defaultStockKeepUnit = new StockKeepUnit();
                merchandise.duration = new MerchandiseDurationDesc();
                merchandise.extra = new MerchandiseExtra();
                merchandise.defaultStockKeepUnit.affiliateProducts = new AffiliateProducts();
                merchandise.defaultStockKeepUnit.prices = new Prices();
                ((DbObject) merchandise)._id = cursor.getLong(i);
                int i5 = i + 1;
                String string3 = null;
                ((DbObject) merchandise).id = cursor.isNull(i5) ? null : cursor.getString(i5);
                int i6 = i + 2;
                i3 = cursor.isNull(i6) ? -1 : cursor.getInt(i6);
                try {
                    merchandise.quantity = cursor.getInt(i + 3);
                    int i7 = i + 4;
                    if (!cursor.isNull(i7)) {
                        i4 = cursor.getInt(i7);
                    }
                    int i8 = i + 5;
                    merchandise.defaultStockKeepUnit.f169id = cursor.isNull(i8) ? null : cursor.getString(i8);
                    int i9 = i + 6;
                    merchandise.defaultStockKeepUnit.type = cursor.isNull(i9) ? null : cursor.getString(i9);
                    int i10 = i + 7;
                    merchandise.defaultStockKeepUnit.affiliateProducts.alipay = cursor.isNull(i10) ? null : cursor.getString(i10);
                    int i11 = i + 8;
                    merchandise.defaultStockKeepUnit.affiliateProducts.wechat = cursor.isNull(i11) ? null : cursor.getString(i11);
                    int i12 = i + 9;
                    merchandise.defaultStockKeepUnit.affiliateProducts.googleplay = cursor.isNull(i12) ? null : cursor.getString(i12);
                    int i13 = i + 10;
                    merchandise.defaultStockKeepUnit.affiliateProducts.huawei = cursor.isNull(i13) ? null : cursor.getString(i13);
                    int i14 = i + 11;
                    merchandise.defaultStockKeepUnit.prices.currencyCode = cursor.isNull(i14) ? null : cursor.getString(i14);
                    int i15 = i + 12;
                    merchandise.defaultStockKeepUnit.prices.currencySymbol = cursor.isNull(i15) ? null : cursor.getString(i15);
                    merchandise.defaultStockKeepUnit.prices.price = cursor.getDouble(i + 13);
                    merchandise.defaultStockKeepUnit.prices.unitPrice = cursor.getDouble(i + 14);
                    merchandise.defaultStockKeepUnit.prices.originalPrice = cursor.getDouble(i + 15);
                    merchandise.defaultStockKeepUnit.prices.originalUnitPrice = cursor.getDouble(i + 16);
                    merchandise.defaultStockKeepUnit.prices.noneRenewalPrice = cursor.getDouble(i + 17);
                    merchandise.defaultStockKeepUnit.prices.noneRenewalUnitPrice = cursor.getDouble(i + 18);
                    int i16 = i + 19;
                    merchandise.defaultStockKeepUnit.tracker = cursor.isNull(i16) ? null : cursor.getString(i16);
                    int i17 = i + 20;
                    string = cursor.isNull(i17) ? null : cursor.getString(i17);
                    int i18 = i + 21;
                    try {
                        string2 = cursor.isNull(i18) ? null : cursor.getString(i18);
                        int i19 = i + 22;
                        merchandise.localCoupons = cursor.isNull(i19) ? null : (List) Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i19));
                        merchandise.duration.times = cursor.getInt(i + 23);
                        int i20 = i + 24;
                        merchandise.duration.timeUnit = cursor.isNull(i20) ? null : cursor.getString(i20);
                        int i21 = i + 25;
                        MerchandiseExtra merchandiseExtra = merchandise.extra;
                        if (!cursor.isNull(i21)) {
                            string3 = cursor.getString(i21);
                        }
                        merchandiseExtra.discountText = string3;
                        ((mrf0) this).readIndex = i + 26;
                    } catch (Exception e) {
                        e = e;
                        int i22 = i3;
                        i2 = i4;
                        i4 = i22;
                        str = string2;
                        string2 = string;
                        MessageNano.reportError(e, cursor);
                        int i23 = i2;
                        i3 = i4;
                        i4 = i23;
                        string = string2;
                        string2 = str;
                    }
                } catch (Exception e2) {
                    e = e2;
                    int i24 = i3;
                    i2 = i4;
                    i4 = i24;
                    str = "unknown_";
                }
            } catch (Exception e3) {
                e = e3;
                str = "unknown_";
                i2 = -1;
            }
            TEnumJsonAdapter<ProductCategory> tEnumJsonAdapter = ProductCategory.JSON_ADAPTER;
            merchandise.category = (ProductCategory) tEnumJsonAdapter.newTEnum(string, i3);
            TEnumJsonAdapter<ProductType> tEnumJsonAdapter2 = ProductType.JSON_ADAPTER;
            merchandise.productType = (ProductType) tEnumJsonAdapter2.newTEnum(string2, i4);
            if (merchandise.category == null) {
                merchandise.category = (ProductCategory) tEnumJsonAdapter.defaultEnum();
            }
            if (merchandise.productType == null) {
                merchandise.productType = (ProductType) tEnumJsonAdapter2.defaultEnum();
            }
            if (merchandise.defaultStockKeepUnit == null) {
                merchandise.defaultStockKeepUnit = StockKeepUnit.new_();
            }
            if (merchandise.localCoupons == null) {
                merchandise.localCoupons = new ArrayList();
            }
            if (merchandise.duration == null) {
                merchandise.duration = MerchandiseDurationDesc.new_();
            }
            if (merchandise.extra == null) {
                merchandise.extra = MerchandiseExtra.new_();
            }
            return merchandise;
        }

        public void write(Merchandise merchandise, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) merchandise).id);
                ProductCategory productCategory = merchandise.category;
                DbObject.cvPut(contentValues, "str_category_c", productCategory == null ? null : productCategory.toString());
                ProductCategory productCategory2 = merchandise.category;
                DbObject.cvPut(contentValues, "category_c", productCategory2 == null ? null : Integer.valueOf(productCategory2.ordinal()));
                DbObject.cvPut(contentValues, "quantity_c", Integer.valueOf(merchandise.quantity));
                ProductType productType = merchandise.productType;
                DbObject.cvPut(contentValues, "str_productType_c", productType == null ? null : productType.toString());
                ProductType productType2 = merchandise.productType;
                DbObject.cvPut(contentValues, "productType_c", productType2 == null ? null : Integer.valueOf(productType2.ordinal()));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_id_c", merchandise.defaultStockKeepUnit.f169id);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_type_c", merchandise.defaultStockKeepUnit.type);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_affiliateProducts_alipay_c", merchandise.defaultStockKeepUnit.affiliateProducts.alipay);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_affiliateProducts_wechat_c", merchandise.defaultStockKeepUnit.affiliateProducts.wechat);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_affiliateProducts_googleplay_c", merchandise.defaultStockKeepUnit.affiliateProducts.googleplay);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_affiliateProducts_huawei_c", merchandise.defaultStockKeepUnit.affiliateProducts.huawei);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_currencyCode_c", merchandise.defaultStockKeepUnit.prices.currencyCode);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_currencySymbol_c", merchandise.defaultStockKeepUnit.prices.currencySymbol);
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_price_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.price));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_unitPrice_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.unitPrice));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_originalPrice_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.originalPrice));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_originalUnitPrice_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.originalUnitPrice));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_noneRenewalPrice_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_prices_noneRenewalUnitPrice_c", Double.valueOf(merchandise.defaultStockKeepUnit.prices.noneRenewalUnitPrice));
                DbObject.cvPut(contentValues, "defaultStockKeepUnit_tracker_c", merchandise.defaultStockKeepUnit.tracker);
                DbObject.cvPut(contentValues, "localCoupons_c", merchandise.localCoupons == null ? null : Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(merchandise.localCoupons));
                DbObject.cvPut(contentValues, "duration_times_c", Integer.valueOf(merchandise.duration.times));
                DbObject.cvPut(contentValues, "duration_timeUnit_c", merchandise.duration.timeUnit);
                DbObject.cvPut(contentValues, "extra_discountText_c", merchandise.extra.discountText);
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static Merchandise new_() {
        Merchandise merchandise = new Merchandise();
        merchandise.nullCheck();
        return merchandise;
    }

    public boolean autoRenewable() {
        return TEnum.equals(this.productType, ProductType.auto_renewable);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Merchandise m14136clone() {
        Merchandise merchandise = new Merchandise();
        ((DbObject) merchandise)._id = ((DbObject) this)._id;
        ((DbObject) merchandise).id = ((DbObject) this).id;
        merchandise.category = this.category;
        merchandise.quantity = this.quantity;
        merchandise.productType = this.productType;
        StockKeepUnit stockKeepUnit = this.defaultStockKeepUnit;
        if (stockKeepUnit != null) {
            merchandise.defaultStockKeepUnit = stockKeepUnit.m15787clone();
        }
        List<Coupon> list = this.localCoupons;
        if (list != null) {
            merchandise.localCoupons = ValueObject.util_map(list, new w9j() { // from class: l.uhy
                public final Object call(Object obj) {
                    return ((Coupon) obj).m12536clone();
                }
            });
        }
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        if (merchandiseDurationDesc != null) {
            merchandise.duration = merchandiseDurationDesc.m14142clone();
        }
        MerchandiseExtra merchandiseExtra = this.extra;
        if (merchandiseExtra != null) {
            merchandise.extra = merchandiseExtra.m14146clone();
        }
        return merchandise;
    }

    public boolean consumable() {
        return TEnum.equals(this.productType, ProductType.consumable);
    }

    public boolean daily() {
        if (this.quantity != 1 || !NullChecker.a(this.duration)) {
            return false;
        }
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        return merchandiseDurationDesc.times == 1 && TextUtils.equals(merchandiseDurationDesc.timeUnit, MerchandiseTimeUnit.day);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Merchandise)) {
            return false;
        }
        Merchandise merchandise = (Merchandise) obj;
        return super.equals(obj) && ValueObject.util_equals(this.category, merchandise.category) && this.quantity == merchandise.quantity && ValueObject.util_equals(this.productType, merchandise.productType) && ValueObject.util_equals(this.defaultStockKeepUnit, merchandise.defaultStockKeepUnit) && ValueObject.util_equals(this.localCoupons, merchandise.localCoupons) && ValueObject.util_equals(this.duration, merchandise.duration) && ValueObject.util_equals(this.extra, merchandise.extra);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public Coupon getCouponForPromotion(String str) {
        ArrayList arrayList = new ArrayList();
        for (Coupon coupon : this.localCoupons) {
            if (coupon.isBelongPromotion(str)) {
                arrayList.add(coupon);
            }
        }
        return vwb.J(arrayList) ? Coupon.new_() : (Coupon) arrayList.get(0);
    }

    @Nullable
    public Coupon getCouponForPromotionNew(String str) {
        ArrayList arrayList = new ArrayList();
        for (Coupon coupon : this.localCoupons) {
            if (coupon.isBelongPromotion(str)) {
                arrayList.add(coupon);
            }
        }
        if (vwb.J(arrayList)) {
            return null;
        }
        return (Coupon) arrayList.get(0);
    }

    public Coupon getCouponWithId(String str) {
        for (Coupon coupon : this.localCoupons) {
            if (TextUtils.equals(str, ((DbObject) coupon).id)) {
                return coupon;
            }
        }
        return null;
    }

    @Deprecated
    public double getFirstCouponPrice() {
        if (vwb.J(this.localCoupons)) {
            return this.defaultStockKeepUnit.prices.price;
        }
        boolean zEquals = TextUtils.equals("localTrial", this.localCoupons.get(0).benefit.localBenefit.benefitType);
        List<Coupon> list = this.localCoupons;
        if (zEquals) {
            return ((double) list.get(0).benefit.localBenefit.trialBenefit.discount.value) / 100.0d;
        }
        boolean zEquals2 = TextUtils.equals("localGift", list.get(0).benefit.localBenefit.benefitType);
        List<Coupon> list2 = this.localCoupons;
        return zEquals2 ? ((double) list2.get(0).benefit.localBenefit.giftBenefit.discount.value) / 100.0d : ((double) list2.get(0).benefit.localBenefit.discountBenefit.value) / 100.0d;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        ProductCategory productCategory = this.category;
        int iHashCode2 = (((iHashCode + (productCategory != null ? productCategory.hashCode() : 0)) * 41) + this.quantity) * 41;
        ProductType productType = this.productType;
        int iHashCode3 = (iHashCode2 + (productType != null ? productType.hashCode() : 0)) * 41;
        StockKeepUnit stockKeepUnit = this.defaultStockKeepUnit;
        int iHashCode4 = (iHashCode3 + (stockKeepUnit != null ? stockKeepUnit.hashCode() : 0)) * 41;
        List<Coupon> list = this.localCoupons;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        int iHashCode6 = (iHashCode5 + (merchandiseDurationDesc != null ? merchandiseDurationDesc.hashCode() : 0)) * 41;
        MerchandiseExtra merchandiseExtra = this.extra;
        int iHashCode7 = iHashCode6 + (merchandiseExtra != null ? merchandiseExtra.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean hour() {
        if (this.quantity != 1 || !NullChecker.a(this.duration)) {
            return false;
        }
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        return merchandiseDurationDesc.times == 1 && TextUtils.equals(merchandiseDurationDesc.timeUnit, MerchandiseTimeUnit.hour);
    }

    public boolean isAcceleratePairing() {
        return TEnum.equals(this.category, "acceleratePairing");
    }

    public boolean isBelongCouponId(String str) {
        Iterator<Coupon> it = this.localCoupons.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((DbObject) it.next()).id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isBelongPromotion(String str) {
        Iterator<Coupon> it = this.localCoupons.iterator();
        while (it.hasNext()) {
            if (it.next().isBelongPromotion(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNoneLiveCoin() {
        return TEnum.equals(this.category, ProductCategory.noneLiveCoin);
    }

    public boolean monthType() {
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        return merchandiseDurationDesc == null || TextUtils.isEmpty(merchandiseDurationDesc.timeUnit) || TextUtils.equals(this.duration.timeUnit, MerchandiseTimeUnit.month);
    }

    public boolean monthly() {
        return this.quantity == 1 && monthType();
    }

    public boolean noneRenewable() {
        return TEnum.equals(this.productType, ProductType.none_renewing);
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.category == null) {
            this.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.productType == null) {
            this.productType = (ProductType) ProductType.JSON_ADAPTER.defaultEnum();
        }
        if (this.defaultStockKeepUnit == null) {
            this.defaultStockKeepUnit = StockKeepUnit.new_();
        }
        if (this.localCoupons == null) {
            this.localCoupons = new ArrayList();
        }
        if (this.duration == null) {
            this.duration = MerchandiseDurationDesc.new_();
        }
        if (this.extra == null) {
            this.extra = MerchandiseExtra.new_();
        }
    }

    public String quantityName() {
        if (yearly()) {
            return "年";
        }
        if (semiAnnual()) {
            return "半年";
        }
        if (quarterly()) {
            return "季";
        }
        return weekly() ? "周" : "月";
    }

    public boolean quarterly() {
        return this.quantity == 3 && monthType();
    }

    public boolean semiAnnual() {
        return this.quantity == 6 && monthType();
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public boolean weekly() {
        if (this.quantity != 1 || !NullChecker.a(this.duration)) {
            return false;
        }
        MerchandiseDurationDesc merchandiseDurationDesc = this.duration;
        return merchandiseDurationDesc.times == 1 && TextUtils.equals(merchandiseDurationDesc.timeUnit, MerchandiseTimeUnit.week);
    }

    public boolean wxDisableAutoRenewable() {
        return this.quantity == 12 && autoRenewable();
    }

    public boolean yearly() {
        return this.quantity == 12 && monthType();
    }
}
