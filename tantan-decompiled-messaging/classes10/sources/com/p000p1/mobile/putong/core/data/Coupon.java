package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.mrf0;
import l.nb5;
import l.orh0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Coupon extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "coupon";

    @ProtobufIndex(index = 56)
    public double beginTime;

    @NonNull
    @ProtobufIndex(index = 59)
    public Benefit benefit;

    @NonNull
    @ProtobufIndex(index = 58)
    public Condition condition;

    @NonNull
    @ProtobufIndex(index = 61)
    public String couponID;

    @NonNull
    @ProtobufIndex(index = 53)
    public String couponType;

    @ProtobufIndex(index = 57)
    public double endTime;

    @ProtobufIndex(index = 54)
    public boolean ignoreBeginTime;

    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
    public boolean ignoreEndTime;

    @NonNull
    @ProtobufIndex(index = 62)
    public List<String> localApplyPromotions;

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;

    @NonNull
    public String newCustomerPromotionConfig;

    @NonNull
    @ProtobufIndex(index = 52)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 60)
    public String userCouponID;
    public static ProtobufAdapter<Coupon> PROTOBUF_ADAPTER = new MessageNanoAdapter<Coupon>() { // from class: com.p1.mobile.putong.core.data.Coupon.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Coupon coupon) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) coupon)._id);
            String str = ((DbObject) coupon).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            List<String> list = coupon.tags;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coupon.couponType;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str3);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(54, coupon.ignoreBeginTime) + CodedOutputByteBufferNano.b(55, coupon.ignoreEndTime) + CodedOutputByteBufferNano.d(56, coupon.beginTime) + CodedOutputByteBufferNano.d(57, coupon.endTime);
            Condition condition = coupon.condition;
            if (condition != null) {
                iB += CodedOutputByteBufferNano.l(58, condition, Condition.PROTOBUF_ADAPTER);
            }
            Benefit benefit = coupon.benefit;
            if (benefit != null) {
                iB += CodedOutputByteBufferNano.l(59, benefit, Benefit.PROTOBUF_ADAPTER);
            }
            String str4 = coupon.userCouponID;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(60, str4);
            }
            String str5 = coupon.couponID;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(61, str5);
            }
            List<String> list2 = coupon.localApplyPromotions;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(62, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) coupon).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Coupon m12537parse(nb5 nb5Var) throws IOException {
            Coupon coupon = new Coupon();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coupon.name == null) {
                            coupon.name = "";
                        }
                        if (coupon.tags == null) {
                            coupon.tags = new ArrayList();
                        }
                        if (coupon.couponType == null) {
                            coupon.couponType = "";
                        }
                        if (coupon.condition == null) {
                            coupon.condition = Condition.new_();
                        }
                        if (coupon.benefit == null) {
                            coupon.benefit = Benefit.new_();
                        }
                        if (coupon.userCouponID == null) {
                            coupon.userCouponID = "";
                        }
                        if (coupon.couponID == null) {
                            coupon.couponID = "";
                        }
                        if (coupon.newCustomerPromotionConfig == null) {
                            coupon.newCustomerPromotionConfig = "";
                        }
                        if (coupon.localApplyPromotions == null) {
                            coupon.localApplyPromotions = new ArrayList();
                        }
                        break;
                    case 8:
                        ((DbObject) coupon)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) coupon).id = nb5Var.s();
                        continue;
                    case 410:
                        coupon.name = nb5Var.s();
                        continue;
                    case 418:
                        coupon.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 426:
                        coupon.couponType = nb5Var.s();
                        continue;
                    case 432:
                        coupon.ignoreBeginTime = nb5Var.g();
                        continue;
                    case 440:
                        coupon.ignoreEndTime = nb5Var.g();
                        continue;
                    case 449:
                        coupon.beginTime = nb5Var.h();
                        continue;
                    case 457:
                        coupon.endTime = nb5Var.h();
                        continue;
                    case 466:
                        coupon.condition = (Condition) nb5Var.l(Condition.PROTOBUF_ADAPTER);
                        continue;
                    case 474:
                        coupon.benefit = (Benefit) nb5Var.l(Benefit.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        coupon.userCouponID = nb5Var.s();
                        continue;
                    case 490:
                        coupon.couponID = nb5Var.s();
                        continue;
                    case 498:
                        coupon.localApplyPromotions = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (coupon.name == null) {
                            coupon.name = "";
                        }
                        if (coupon.tags == null) {
                            coupon.tags = new ArrayList();
                        }
                        if (coupon.couponType == null) {
                            coupon.couponType = "";
                        }
                        if (coupon.condition == null) {
                            coupon.condition = Condition.new_();
                        }
                        if (coupon.benefit == null) {
                            coupon.benefit = Benefit.new_();
                        }
                        if (coupon.userCouponID == null) {
                            coupon.userCouponID = "";
                        }
                        if (coupon.couponID == null) {
                            coupon.couponID = "";
                        }
                        if (coupon.newCustomerPromotionConfig == null) {
                            coupon.newCustomerPromotionConfig = "";
                        }
                        if (coupon.localApplyPromotions == null) {
                            coupon.localApplyPromotions = new ArrayList();
                            return coupon;
                        }
                        break;
                }
            }
            return coupon;
        }

        public void serialize(Coupon coupon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) coupon)._id);
            String str = ((DbObject) coupon).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            List<String> list = coupon.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coupon.couponType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(53, str3);
            }
            codedOutputByteBufferNano.A(54, coupon.ignoreBeginTime);
            codedOutputByteBufferNano.A(55, coupon.ignoreEndTime);
            codedOutputByteBufferNano.C(56, coupon.beginTime);
            codedOutputByteBufferNano.C(57, coupon.endTime);
            Condition condition = coupon.condition;
            if (condition != null) {
                codedOutputByteBufferNano.K(58, condition, Condition.PROTOBUF_ADAPTER);
            }
            Benefit benefit = coupon.benefit;
            if (benefit != null) {
                codedOutputByteBufferNano.K(59, benefit, Benefit.PROTOBUF_ADAPTER);
            }
            String str4 = coupon.userCouponID;
            if (str4 != null) {
                codedOutputByteBufferNano.R(60, str4);
            }
            String str5 = coupon.couponID;
            if (str5 != null) {
                codedOutputByteBufferNano.R(61, str5);
            }
            List<String> list2 = coupon.localApplyPromotions;
            if (list2 != null) {
                codedOutputByteBufferNano.K(62, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Coupon> JSON_ADAPTER = new ObjectJsonAdapter<Coupon>() { // from class: com.p1.mobile.putong.core.data.Coupon.2
        public Class getDataClass() {
            return Coupon.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Coupon m12538newInstance() {
            return new Coupon();
        }

        public boolean parseField(Coupon coupon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    coupon.endTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "userCouponID":
                    coupon.userCouponID = jsonParser.getValueAsString();
                    return true;
                case "beginTime":
                    coupon.beginTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "condition":
                    coupon.condition = (Condition) Condition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ignoreEndTime":
                    coupon.ignoreEndTime = jsonParser.getValueAsBoolean();
                    return true;
                case "couponID":
                    coupon.couponID = jsonParser.getValueAsString();
                    return true;
                case "localApplyPromotions":
                    coupon.localApplyPromotions = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "benefit":
                    coupon.benefit = (Benefit) Benefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) coupon).id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    coupon.name = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    coupon.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "couponType":
                    coupon.couponType = jsonParser.getValueAsString();
                    return true;
                case "copyWrite":
                    coupon.newCustomerPromotionConfig = jsonParser.getValueAsString();
                    return true;
                case "ignoreBeginTime":
                    coupon.ignoreBeginTime = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Coupon coupon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "userCouponID":
                case "beginTime":
                case "condition":
                case "ignoreEndTime":
                case "couponID":
                case "localApplyPromotions":
                case "benefit":
                    return true;
                case "id":
                    return false;
                case "name":
                case "tags":
                case "couponType":
                case "copyWrite":
                case "ignoreBeginTime":
                    return true;
                default:
                    return super.parseFieldCheck(coupon, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Coupon coupon, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) coupon).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (coupon.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(coupon.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = coupon.couponType;
            if (str3 != null) {
                jsonGenerator.writeStringField("couponType", str3);
            }
            jsonGenerator.writeBooleanField("ignoreBeginTime", coupon.ignoreBeginTime);
            jsonGenerator.writeBooleanField("ignoreEndTime", coupon.ignoreEndTime);
            jsonGenerator.writeFieldName("beginTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(coupon.beginTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(coupon.endTime), jsonGenerator, true);
            if (coupon.condition != null) {
                jsonGenerator.writeFieldName(Condition.TYPE);
                Condition.JSON_ADAPTER.serialize(coupon.condition, jsonGenerator, true);
            }
            if (coupon.benefit != null) {
                jsonGenerator.writeFieldName(Benefit.TYPE);
                Benefit.JSON_ADAPTER.serialize(coupon.benefit, jsonGenerator, true);
            }
            String str4 = coupon.userCouponID;
            if (str4 != null) {
                jsonGenerator.writeStringField("userCouponID", str4);
            }
            String str5 = coupon.couponID;
            if (str5 != null) {
                jsonGenerator.writeStringField("couponID", str5);
            }
            String str6 = coupon.newCustomerPromotionConfig;
            if (str6 != null) {
                jsonGenerator.writeStringField("copyWrite", str6);
            }
            if (coupon.localApplyPromotions != null) {
                jsonGenerator.writeFieldName("localApplyPromotions");
                JsonAdapter.serializeArray(coupon.localApplyPromotions, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Coupon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Coupon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Coupon> _ID = new LongColumn<Coupon>("_id") { // from class: com.p1.mobile.putong.core.data.Coupon.3
        public Long get(Coupon coupon) {
            return Long.valueOf(((DbObject) coupon)._id);
        }

        public void set(Coupon coupon, Long l2) {
            ((DbObject) coupon)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Coupon> f42ID = new StringColumn<Coupon>("id_c") { // from class: com.p1.mobile.putong.core.data.Coupon.4
        public String get(Coupon coupon) {
            return ((DbObject) coupon).id;
        }

        public void set(Coupon coupon, String str) {
            ((DbObject) coupon).id = str;
        }
    };
    public static final StringColumn<Coupon> NAME = new StringColumn<Coupon>("name_c") { // from class: com.p1.mobile.putong.core.data.Coupon.5
        public String get(Coupon coupon) {
            return coupon.name;
        }

        public void set(Coupon coupon, String str) {
            coupon.name = str;
        }
    };
    public static final Column<Coupon, List<String>> TAGS = new Column<Coupon, List<String>>("tags_c") { // from class: com.p1.mobile.putong.core.data.Coupon.6
        public List<String> get(Coupon coupon) {
            return coupon.tags;
        }

        public void set(Coupon coupon, List<String> list) {
            coupon.tags = list;
        }
    };
    public static final StringColumn<Coupon> COUPONTYPE = new StringColumn<Coupon>("couponType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.7
        public String get(Coupon coupon) {
            return coupon.couponType;
        }

        public void set(Coupon coupon, String str) {
            coupon.couponType = str;
        }
    };
    public static final BooleanColumn<Coupon> IGNOREBEGINTIME = new BooleanColumn<Coupon>("ignoreBeginTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.8
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.ignoreBeginTime);
        }

        public void set(Coupon coupon, Boolean bool) {
            coupon.ignoreBeginTime = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Coupon> IGNOREENDTIME = new BooleanColumn<Coupon>("ignoreEndTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.9
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.ignoreEndTime);
        }

        public void set(Coupon coupon, Boolean bool) {
            coupon.ignoreEndTime = bool.booleanValue();
        }
    };
    public static final DoubleColumn<Coupon> BEGINTIME = new DoubleColumn<Coupon>("beginTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.10
        public Double get(Coupon coupon) {
            return Double.valueOf(coupon.beginTime);
        }

        public void set(Coupon coupon, Double d) {
            coupon.beginTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<Coupon> ENDTIME = new DoubleColumn<Coupon>("endTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.11
        public Double get(Coupon coupon) {
            return Double.valueOf(coupon.endTime);
        }

        public void set(Coupon coupon, Double d) {
            coupon.endTime = d.doubleValue();
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_PURCHASECHANNEL = new Column<Coupon, List<String>>("condition_purchaseChannel_c") { // from class: com.p1.mobile.putong.core.data.Coupon.12
        public List<String> get(Coupon coupon) {
            return coupon.condition.purchaseChannel;
        }

        public void set(Coupon coupon, List<String> list) {
            coupon.condition.purchaseChannel = list;
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_SKUIDS = new Column<Coupon, List<String>>("condition_skuIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.13
        public List<String> get(Coupon coupon) {
            return coupon.condition.skuIDs;
        }

        public void set(Coupon coupon, List<String> list) {
            coupon.condition.skuIDs = list;
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_MERCHANDISEIDS = new Column<Coupon, List<String>>("condition_merchandiseIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.14
        public List<String> get(Coupon coupon) {
            return coupon.condition.merchandiseIDs;
        }

        public void set(Coupon coupon, List<String> list) {
            coupon.condition.merchandiseIDs = list;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_BENEFITTYPE = new StringColumn<Coupon>("benefit_localBenefit_benefitType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.15
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.benefitType;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.benefitType = str;
        }
    };
    public static final LongColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_TRIALDURATION = new LongColumn<Coupon>("benefit_localBenefit_trialBenefit_trialDuration_c") { // from class: com.p1.mobile.putong.core.data.Coupon.16
        public Long get(Coupon coupon) {
            return Long.valueOf(coupon.benefit.localBenefit.trialBenefit.trialDuration);
        }

        public void set(Coupon coupon, Long l2) {
            coupon.benefit.localBenefit.trialBenefit.trialDuration = l2.longValue();
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_DISCOUNT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_trialBenefit_discount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.17
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.trialBenefit.discount.discountType;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.trialBenefit.discount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_DISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_discount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.18
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.discount.value);
        }

        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.discount.value = num.intValue();
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_TRIALREPLACEITEMID = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_trialReplaceItemID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.19
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID);
        }

        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID = num.intValue();
        }
    };

    /* JADX INFO: renamed from: BENEFIT_LOCALBENEFIT_TRIALBENEFIT_AFTERTRIALDISCOUNT_DISCOUNTTYPE */
    public static final StringColumn<Coupon> f41x6fa1f90c = new StringColumn<Coupon>("benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.20
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_AFTERTRIALDISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.21
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value);
        }

        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value = num.intValue();
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_discountBenefit_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.22
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.discountType;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.discountBenefit.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_discountBenefit_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.23
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.discountBenefit.value);
        }

        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.discountBenefit.value = num.intValue();
        }
    };
    public static final StringColumn<Coupon> USERCOUPONID = new StringColumn<Coupon>("userCouponID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.24
        public String get(Coupon coupon) {
            return coupon.userCouponID;
        }

        public void set(Coupon coupon, String str) {
            coupon.userCouponID = str;
        }
    };
    public static final StringColumn<Coupon> COUPONID = new StringColumn<Coupon>("couponID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.25
        public String get(Coupon coupon) {
            return coupon.couponID;
        }

        public void set(Coupon coupon, String str) {
            coupon.couponID = str;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_SHOWDISCOUNT = new StringColumn<Coupon>("benefit_localBenefit_discountBenefit_showDiscount_c") { // from class: com.p1.mobile.putong.core.data.Coupon.26
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.showDiscount;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.discountBenefit.showDiscount = str;
        }
    };
    public static final Column<Coupon, PrivilegesChange> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_PRIVILEGESCHANGE = new Column<Coupon, PrivilegesChange>("benefit_localBenefit_discountBenefit_privilegesChange_c") { // from class: com.p1.mobile.putong.core.data.Coupon.27
        public PrivilegesChange get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.privilegesChange;
        }

        public void set(Coupon coupon, PrivilegesChange privilegesChange) {
            coupon.benefit.localBenefit.discountBenefit.privilegesChange = privilegesChange;
        }
    };
    public static final BooleanColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_HASPRIVILEGESCHANGE = new BooleanColumn<Coupon>("benefit_localBenefit_discountBenefit_hasPrivilegesChange_c") { // from class: com.p1.mobile.putong.core.data.Coupon.28
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange);
        }

        public void set(Coupon coupon, Boolean bool) {
            coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange = bool.booleanValue();
        }
    };
    public static final Column<Coupon, List<String>> LOCALAPPLYPROMOTIONS = new Column<Coupon, List<String>>("localApplyPromotions_c") { // from class: com.p1.mobile.putong.core.data.Coupon.29
        public List<String> get(Coupon coupon) {
            return coupon.localApplyPromotions;
        }

        public void set(Coupon coupon, List<String> list) {
            coupon.localApplyPromotions = list;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_DISCOUNT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_giftBenefit_discount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.30
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.giftBenefit.discount.discountType;
        }

        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.giftBenefit.discount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_DISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_giftBenefit_discount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.31
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.giftBenefit.discount.value);
        }

        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.giftBenefit.discount.value = num.intValue();
        }
    };
    public static final Column<Coupon, List<Integer>> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_GIVEITEMIDS = new Column<Coupon, List<Integer>>("benefit_localBenefit_giftBenefit_giveItemIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.32
        public List<Integer> get(Coupon coupon) {
            return coupon.benefit.localBenefit.giftBenefit.giveItemIDs;
        }

        public void set(Coupon coupon, List<Integer> list) {
            coupon.benefit.localBenefit.giftBenefit.giveItemIDs = list;
        }
    };
    public static mrf0<Coupon> DB_ADAPTER = new mrf0<Coupon>() { // from class: com.p1.mobile.putong.core.data.Coupon.33
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,tags_c BLOB,couponType_c TEXT,ignoreBeginTime_c INTEGER,ignoreEndTime_c INTEGER,beginTime_c REAL,endTime_c REAL,condition_purchaseChannel_c BLOB,condition_skuIDs_c BLOB,condition_merchandiseIDs_c BLOB,benefit_localBenefit_benefitType_c TEXT,benefit_localBenefit_trialBenefit_trialDuration_c INTEGER,benefit_localBenefit_trialBenefit_discount_discountType_c TEXT,benefit_localBenefit_trialBenefit_discount_value_c INTEGER,benefit_localBenefit_trialBenefit_trialReplaceItemID_c INTEGER,benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c TEXT,benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c INTEGER,benefit_localBenefit_discountBenefit_discountType_c TEXT,benefit_localBenefit_discountBenefit_value_c INTEGER,userCouponID_c TEXT,couponID_c TEXT,benefit_localBenefit_discountBenefit_showDiscount_c TEXT,benefit_localBenefit_discountBenefit_privilegesChange_c BLOB,benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER,localApplyPromotions_c BLOB,benefit_localBenefit_giftBenefit_discount_discountType_c TEXT,benefit_localBenefit_giftBenefit_discount_value_c INTEGER,benefit_localBenefit_giftBenefit_giveItemIDs_c BLOB)";
        }

        public Class getDataClass() {
            return Coupon.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public Coupon m12539init() {
            Coupon coupon = new Coupon();
            if (coupon.name == null) {
                coupon.name = "";
            }
            if (coupon.tags == null) {
                coupon.tags = new ArrayList();
            }
            if (coupon.couponType == null) {
                coupon.couponType = "";
            }
            if (coupon.condition == null) {
                coupon.condition = Condition.new_();
            }
            if (coupon.benefit == null) {
                coupon.benefit = Benefit.new_();
            }
            if (coupon.userCouponID == null) {
                coupon.userCouponID = "";
            }
            if (coupon.couponID == null) {
                coupon.couponID = "";
            }
            if (coupon.newCustomerPromotionConfig == null) {
                coupon.newCustomerPromotionConfig = "";
            }
            if (coupon.localApplyPromotions == null) {
                coupon.localApplyPromotions = new ArrayList();
            }
            return coupon;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Coupon m12540read(Cursor cursor, int i) {
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            Coupon coupon = new Coupon();
            try {
                coupon.condition = new Condition();
                Benefit benefit = new Benefit();
                coupon.benefit = benefit;
                benefit.localBenefit = new LocalBenefit();
                coupon.benefit.localBenefit.trialBenefit = new TrialBenefit();
                coupon.benefit.localBenefit.discountBenefit = new DiscountBenefit();
                coupon.benefit.localBenefit.giftBenefit = new GiftBenefit();
                coupon.benefit.localBenefit.trialBenefit.discount = new Discount();
                coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount = new Discount();
                coupon.benefit.localBenefit.giftBenefit.discount = new Discount();
                ((DbObject) coupon)._id = cursor.getLong(i);
                int i2 = i + 1;
                List<Integer> list = null;
                ((DbObject) coupon).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                coupon.name = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                coupon.tags = cursor.isNull(i4) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i4));
                int i5 = i + 4;
                coupon.couponType = cursor.isNull(i5) ? null : cursor.getString(i5);
                coupon.ignoreBeginTime = cursor.getInt(i + 5) == 1;
                coupon.ignoreEndTime = cursor.getInt(i + 6) == 1;
                coupon.beginTime = cursor.getDouble(i + 7);
                coupon.endTime = cursor.getDouble(i + 8);
                int i6 = i + 9;
                coupon.condition.purchaseChannel = cursor.isNull(i6) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i6));
                int i7 = i + 10;
                coupon.condition.skuIDs = cursor.isNull(i7) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i7));
                int i8 = i + 11;
                coupon.condition.merchandiseIDs = cursor.isNull(i8) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i8));
                int i9 = i + 12;
                coupon.benefit.localBenefit.benefitType = cursor.isNull(i9) ? null : cursor.getString(i9);
                coupon.benefit.localBenefit.trialBenefit.trialDuration = cursor.getLong(i + 13);
                int i10 = i + 14;
                coupon.benefit.localBenefit.trialBenefit.discount.discountType = cursor.isNull(i10) ? null : cursor.getString(i10);
                coupon.benefit.localBenefit.trialBenefit.discount.value = cursor.getInt(i + 15);
                coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID = cursor.getInt(i + 16);
                int i11 = i + 17;
                coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType = cursor.isNull(i11) ? null : cursor.getString(i11);
                coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value = cursor.getInt(i + 18);
                int i12 = i + 19;
                coupon.benefit.localBenefit.discountBenefit.discountType = cursor.isNull(i12) ? null : cursor.getString(i12);
                coupon.benefit.localBenefit.discountBenefit.value = cursor.getInt(i + 20);
                int i13 = i + 21;
                coupon.userCouponID = cursor.isNull(i13) ? null : cursor.getString(i13);
                int i14 = i + 22;
                coupon.couponID = cursor.isNull(i14) ? null : cursor.getString(i14);
                int i15 = i + 23;
                coupon.benefit.localBenefit.discountBenefit.showDiscount = cursor.isNull(i15) ? null : cursor.getString(i15);
                int i16 = i + 24;
                coupon.benefit.localBenefit.discountBenefit.privilegesChange = cursor.isNull(i16) ? null : (PrivilegesChange) PrivilegesChange.PROTOBUF_ADAPTER.parse(cursor.getBlob(i16));
                coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange = cursor.getInt(i + 25) == 1;
                int i17 = i + 26;
                coupon.localApplyPromotions = cursor.isNull(i17) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i17));
                int i18 = i + 27;
                coupon.benefit.localBenefit.giftBenefit.discount.discountType = cursor.isNull(i18) ? null : cursor.getString(i18);
                coupon.benefit.localBenefit.giftBenefit.discount.value = cursor.getInt(i + 28);
                int i19 = i + 29;
                GiftBenefit giftBenefit = coupon.benefit.localBenefit.giftBenefit;
                if (!cursor.isNull(i19)) {
                    list = (List) ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i19));
                }
                giftBenefit.giveItemIDs = list;
                ((mrf0) this).readIndex = i + 30;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (coupon.name == null) {
                coupon.name = "";
            }
            if (coupon.tags == null) {
                coupon.tags = new ArrayList();
            }
            if (coupon.couponType == null) {
                coupon.couponType = "";
            }
            if (coupon.condition == null) {
                coupon.condition = Condition.new_();
            }
            if (coupon.benefit == null) {
                coupon.benefit = Benefit.new_();
            }
            if (coupon.userCouponID == null) {
                coupon.userCouponID = "";
            }
            if (coupon.couponID == null) {
                coupon.couponID = "";
            }
            if (coupon.newCustomerPromotionConfig == null) {
                coupon.newCustomerPromotionConfig = "";
            }
            if (coupon.localApplyPromotions == null) {
                coupon.localApplyPromotions = new ArrayList();
            }
            return coupon;
        }

        public void write(Coupon coupon, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) coupon).id);
                DbObject.cvPut(contentValues, "name_c", coupon.name);
                DbObject.cvPut(contentValues, "tags_c", coupon.tags == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(coupon.tags));
                DbObject.cvPut(contentValues, "couponType_c", coupon.couponType);
                DbObject.cvPut(contentValues, "ignoreBeginTime_c", Integer.valueOf(coupon.ignoreBeginTime ? 1 : 0));
                DbObject.cvPut(contentValues, "ignoreEndTime_c", Integer.valueOf(coupon.ignoreEndTime ? 1 : 0));
                DbObject.cvPut(contentValues, "beginTime_c", Double.valueOf(coupon.beginTime));
                DbObject.cvPut(contentValues, "endTime_c", Double.valueOf(coupon.endTime));
                DbObject.cvPut(contentValues, "condition_purchaseChannel_c", coupon.condition.purchaseChannel == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(coupon.condition.purchaseChannel));
                DbObject.cvPut(contentValues, "condition_skuIDs_c", coupon.condition.skuIDs == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(coupon.condition.skuIDs));
                DbObject.cvPut(contentValues, "condition_merchandiseIDs_c", coupon.condition.merchandiseIDs == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(coupon.condition.merchandiseIDs));
                DbObject.cvPut(contentValues, "benefit_localBenefit_benefitType_c", coupon.benefit.localBenefit.benefitType);
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_trialDuration_c", Long.valueOf(coupon.benefit.localBenefit.trialBenefit.trialDuration));
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_discount_discountType_c", coupon.benefit.localBenefit.trialBenefit.discount.discountType);
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_discount_value_c", Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.discount.value));
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_trialReplaceItemID_c", Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID));
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c", coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType);
                DbObject.cvPut(contentValues, "benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c", Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value));
                DbObject.cvPut(contentValues, "benefit_localBenefit_discountBenefit_discountType_c", coupon.benefit.localBenefit.discountBenefit.discountType);
                DbObject.cvPut(contentValues, "benefit_localBenefit_discountBenefit_value_c", Integer.valueOf(coupon.benefit.localBenefit.discountBenefit.value));
                DbObject.cvPut(contentValues, "userCouponID_c", coupon.userCouponID);
                DbObject.cvPut(contentValues, "couponID_c", coupon.couponID);
                DbObject.cvPut(contentValues, "benefit_localBenefit_discountBenefit_showDiscount_c", coupon.benefit.localBenefit.discountBenefit.showDiscount);
                PrivilegesChange privilegesChange = coupon.benefit.localBenefit.discountBenefit.privilegesChange;
                DbObject.cvPut(contentValues, "benefit_localBenefit_discountBenefit_privilegesChange_c", privilegesChange == null ? null : PrivilegesChange.PROTOBUF_ADAPTER.serialize(privilegesChange));
                DbObject.cvPut(contentValues, "benefit_localBenefit_discountBenefit_hasPrivilegesChange_c", Integer.valueOf(coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange ? 1 : 0));
                DbObject.cvPut(contentValues, "localApplyPromotions_c", coupon.localApplyPromotions == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(coupon.localApplyPromotions));
                DbObject.cvPut(contentValues, "benefit_localBenefit_giftBenefit_discount_discountType_c", coupon.benefit.localBenefit.giftBenefit.discount.discountType);
                DbObject.cvPut(contentValues, "benefit_localBenefit_giftBenefit_discount_value_c", Integer.valueOf(coupon.benefit.localBenefit.giftBenefit.discount.value));
                DbObject.cvPut(contentValues, "benefit_localBenefit_giftBenefit_giveItemIDs_c", coupon.benefit.localBenefit.giftBenefit.giveItemIDs == null ? null : ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().serialize(coupon.benefit.localBenefit.giftBenefit.giveItemIDs));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m291a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m292b(String str) {
        return str;
    }

    public static Coupon new_() {
        Coupon coupon = new Coupon();
        coupon.nullCheck();
        return coupon;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Coupon m12536clone() {
        Coupon coupon = new Coupon();
        ((DbObject) coupon)._id = ((DbObject) this)._id;
        ((DbObject) coupon).id = ((DbObject) this).id;
        coupon.name = this.name;
        List<String> list = this.tags;
        if (list != null) {
            coupon.tags = ValueObject.util_map(list, new w9j() { // from class: l.arb
                public final Object call(Object obj) {
                    return Coupon.m291a((String) obj);
                }
            });
        }
        coupon.couponType = this.couponType;
        coupon.ignoreBeginTime = this.ignoreBeginTime;
        coupon.ignoreEndTime = this.ignoreEndTime;
        coupon.beginTime = this.beginTime;
        coupon.endTime = this.endTime;
        Condition condition = this.condition;
        if (condition != null) {
            coupon.condition = condition.m12244clone();
        }
        Benefit benefit = this.benefit;
        if (benefit != null) {
            coupon.benefit = benefit.m11750clone();
        }
        coupon.userCouponID = this.userCouponID;
        coupon.couponID = this.couponID;
        coupon.newCustomerPromotionConfig = this.newCustomerPromotionConfig;
        List<String> list2 = this.localApplyPromotions;
        if (list2 != null) {
            coupon.localApplyPromotions = ValueObject.util_map(list2, new w9j() { // from class: l.brb
                public final Object call(Object obj) {
                    return Coupon.m292b((String) obj);
                }
            });
        }
        return coupon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Coupon)) {
            return false;
        }
        Coupon coupon = (Coupon) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, coupon.name) && ValueObject.util_equals(this.tags, coupon.tags) && ValueObject.util_equals(this.couponType, coupon.couponType) && this.ignoreBeginTime == coupon.ignoreBeginTime && this.ignoreEndTime == coupon.ignoreEndTime && this.beginTime == coupon.beginTime && this.endTime == coupon.endTime && ValueObject.util_equals(this.condition, coupon.condition) && ValueObject.util_equals(this.benefit, coupon.benefit) && ValueObject.util_equals(this.userCouponID, coupon.userCouponID) && ValueObject.util_equals(this.couponID, coupon.couponID) && ValueObject.util_equals(this.newCustomerPromotionConfig, coupon.newCustomerPromotionConfig) && ValueObject.util_equals(this.localApplyPromotions, coupon.localApplyPromotions);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public double getCouponPrice() {
        int i;
        boolean zEquals = TextUtils.equals("localTrial", this.benefit.localBenefit.benefitType);
        Benefit benefit = this.benefit;
        if (zEquals) {
            i = benefit.localBenefit.trialBenefit.discount.value;
        } else {
            boolean zEquals2 = TextUtils.equals("localGift", benefit.localBenefit.benefitType);
            Benefit benefit2 = this.benefit;
            i = zEquals2 ? benefit2.localBenefit.giftBenefit.discount.value : benefit2.localBenefit.discountBenefit.value;
        }
        return ((double) i) / 100.0d;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.couponType;
        int iHashCode4 = ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.ignoreBeginTime ? 1231 : 1237)) * 41) + (this.ignoreEndTime ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.beginTime);
        int i2 = (iHashCode4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        Condition condition = this.condition;
        int iHashCode5 = (i3 + (condition != null ? condition.hashCode() : 0)) * 41;
        Benefit benefit = this.benefit;
        int iHashCode6 = (iHashCode5 + (benefit != null ? benefit.hashCode() : 0)) * 41;
        String str3 = this.userCouponID;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.couponID;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.newCustomerPromotionConfig;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list2 = this.localApplyPromotions;
        int iHashCode10 = iHashCode9 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isBelongPromotion(String str) {
        return this.localApplyPromotions.contains(str);
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.couponType == null) {
            this.couponType = "";
        }
        if (this.condition == null) {
            this.condition = Condition.new_();
        }
        if (this.benefit == null) {
            this.benefit = Benefit.new_();
        }
        if (this.userCouponID == null) {
            this.userCouponID = "";
        }
        if (this.couponID == null) {
            this.couponID = "";
        }
        if (this.newCustomerPromotionConfig == null) {
            this.newCustomerPromotionConfig = "";
        }
        if (this.localApplyPromotions == null) {
            this.localApplyPromotions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
