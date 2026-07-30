package com.p051p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.eclipse.jetty.http.HttpTokens;
import p153l.nc5;
import p153l.qcj;
import p153l.vzf0;
import p153l.wzh0;

/* JADX INFO: loaded from: classes10.dex */
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

    @ProtobufIndex(index = 55)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Coupon coupon) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, coupon._id);
            String str = coupon.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            List<String> list = coupon.tags;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coupon.couponType;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(53, str3);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(54, coupon.ignoreBeginTime) + CodedOutputByteBufferNano.m17275b(55, coupon.ignoreEndTime) + CodedOutputByteBufferNano.m17277d(56, coupon.beginTime) + CodedOutputByteBufferNano.m17277d(57, coupon.endTime);
            Condition condition = coupon.condition;
            if (condition != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(58, condition, Condition.PROTOBUF_ADAPTER);
            }
            Benefit benefit = coupon.benefit;
            if (benefit != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(59, benefit, Benefit.PROTOBUF_ADAPTER);
            }
            String str4 = coupon.userCouponID;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(60, str4);
            }
            String str5 = coupon.couponID;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(61, str5);
            }
            List<String> list2 = coupon.localApplyPromotions;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(62, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            coupon.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Coupon parse(nc5 nc5Var) throws IOException {
            Coupon coupon = new Coupon();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        coupon._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        coupon.f56859id = nc5Var.m162495s();
                        continue;
                    case 410:
                        coupon.name = nc5Var.m162495s();
                        continue;
                    case 418:
                        coupon.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 426:
                        coupon.couponType = nc5Var.m162495s();
                        continue;
                    case 432:
                        coupon.ignoreBeginTime = nc5Var.m162483g();
                        continue;
                    case 440:
                        coupon.ignoreEndTime = nc5Var.m162483g();
                        continue;
                    case 449:
                        coupon.beginTime = nc5Var.m162484h();
                        continue;
                    case 457:
                        coupon.endTime = nc5Var.m162484h();
                        continue;
                    case 466:
                        coupon.condition = (Condition) nc5Var.m162488l(Condition.PROTOBUF_ADAPTER);
                        continue;
                    case 474:
                        coupon.benefit = (Benefit) nc5Var.m162488l(Benefit.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        coupon.userCouponID = nc5Var.m162495s();
                        continue;
                    case 490:
                        coupon.couponID = nc5Var.m162495s();
                        continue;
                    case 498:
                        coupon.localApplyPromotions = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Coupon coupon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, coupon._id);
            String str = coupon.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            List<String> list = coupon.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = coupon.couponType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(53, str3);
            }
            codedOutputByteBufferNano.m17299A(54, coupon.ignoreBeginTime);
            codedOutputByteBufferNano.m17299A(55, coupon.ignoreEndTime);
            codedOutputByteBufferNano.m17301C(56, coupon.beginTime);
            codedOutputByteBufferNano.m17301C(57, coupon.endTime);
            Condition condition = coupon.condition;
            if (condition != null) {
                codedOutputByteBufferNano.m17309K(58, condition, Condition.PROTOBUF_ADAPTER);
            }
            Benefit benefit = coupon.benefit;
            if (benefit != null) {
                codedOutputByteBufferNano.m17309K(59, benefit, Benefit.PROTOBUF_ADAPTER);
            }
            String str4 = coupon.userCouponID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(60, str4);
            }
            String str5 = coupon.couponID;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(61, str5);
            }
            List<String> list2 = coupon.localApplyPromotions;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(62, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Coupon> JSON_ADAPTER = new ObjectJsonAdapter<Coupon>() { // from class: com.p1.mobile.putong.core.data.Coupon.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Coupon.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Coupon newInstance() {
            return new Coupon();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Coupon coupon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 0;
                    }
                    break;
                case -1138244436:
                    if (str.equals("userCouponID")) {
                        b = 1;
                    }
                    break;
                case -1072839914:
                    if (str.equals("beginTime")) {
                        b = 2;
                    }
                    break;
                case -861311717:
                    if (str.equals(Condition.TYPE)) {
                        b = 3;
                    }
                    break;
                case -670026730:
                    if (str.equals("ignoreEndTime")) {
                        b = 4;
                    }
                    break;
                case -370315327:
                    if (str.equals("couponID")) {
                        b = 5;
                    }
                    break;
                case -274220205:
                    if (str.equals("localApplyPromotions")) {
                        b = 6;
                    }
                    break;
                case -222710633:
                    if (str.equals(Benefit.TYPE)) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 10;
                    }
                    break;
                case 609638528:
                    if (str.equals("couponType")) {
                        b = 11;
                    }
                    break;
                case 1498225002:
                    if (str.equals("copyWrite")) {
                        b = 12;
                    }
                    break;
                case 1944015204:
                    if (str.equals("ignoreBeginTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    coupon.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    coupon.userCouponID = jsonParser.getValueAsString();
                    return true;
                case 2:
                    coupon.beginTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    coupon.condition = Condition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    coupon.ignoreEndTime = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    coupon.couponID = jsonParser.getValueAsString();
                    return true;
                case 6:
                    coupon.localApplyPromotions = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    coupon.benefit = Benefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    coupon.f56859id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    coupon.name = jsonParser.getValueAsString();
                    return true;
                case 10:
                    coupon.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    coupon.couponType = jsonParser.getValueAsString();
                    return true;
                case 12:
                    coupon.newCustomerPromotionConfig = jsonParser.getValueAsString();
                    return true;
                case 13:
                    coupon.ignoreBeginTime = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Coupon coupon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 0;
                    }
                    break;
                case -1138244436:
                    if (str.equals("userCouponID")) {
                        b = 1;
                    }
                    break;
                case -1072839914:
                    if (str.equals("beginTime")) {
                        b = 2;
                    }
                    break;
                case -861311717:
                    if (str.equals(Condition.TYPE)) {
                        b = 3;
                    }
                    break;
                case -670026730:
                    if (str.equals("ignoreEndTime")) {
                        b = 4;
                    }
                    break;
                case -370315327:
                    if (str.equals("couponID")) {
                        b = 5;
                    }
                    break;
                case -274220205:
                    if (str.equals("localApplyPromotions")) {
                        b = 6;
                    }
                    break;
                case -222710633:
                    if (str.equals(Benefit.TYPE)) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 10;
                    }
                    break;
                case 609638528:
                    if (str.equals("couponType")) {
                        b = 11;
                    }
                    break;
                case 1498225002:
                    if (str.equals("copyWrite")) {
                        b = 12;
                    }
                    break;
                case 1944015204:
                    if (str.equals("ignoreBeginTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return true;
                default:
                    return super.parseFieldCheck(coupon, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Coupon coupon, JsonGenerator jsonGenerator) throws IOException {
            String str = coupon.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coupon.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Coupon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Coupon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Coupon> _ID = new LongColumn<Coupon>("_id") { // from class: com.p1.mobile.putong.core.data.Coupon.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Coupon coupon) {
            return Long.valueOf(coupon._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Long l2) {
            coupon._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Coupon> f21122ID = new StringColumn<Coupon>("id_c") { // from class: com.p1.mobile.putong.core.data.Coupon.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.f56859id = str;
        }
    };
    public static final StringColumn<Coupon> NAME = new StringColumn<Coupon>("name_c") { // from class: com.p1.mobile.putong.core.data.Coupon.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.name = str;
        }
    };
    public static final Column<Coupon, List<String>> TAGS = new Column<Coupon, List<String>>("tags_c") { // from class: com.p1.mobile.putong.core.data.Coupon.6
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Coupon coupon) {
            return coupon.tags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<String> list) {
            coupon.tags = list;
        }
    };
    public static final StringColumn<Coupon> COUPONTYPE = new StringColumn<Coupon>("couponType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.7
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.couponType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.couponType = str;
        }
    };
    public static final BooleanColumn<Coupon> IGNOREBEGINTIME = new BooleanColumn<Coupon>("ignoreBeginTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.8
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.ignoreBeginTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Boolean bool) {
            coupon.ignoreBeginTime = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Coupon> IGNOREENDTIME = new BooleanColumn<Coupon>("ignoreEndTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.9
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.ignoreEndTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Boolean bool) {
            coupon.ignoreEndTime = bool.booleanValue();
        }
    };
    public static final DoubleColumn<Coupon> BEGINTIME = new DoubleColumn<Coupon>("beginTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.10
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Coupon coupon) {
            return Double.valueOf(coupon.beginTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Double d) {
            coupon.beginTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<Coupon> ENDTIME = new DoubleColumn<Coupon>("endTime_c") { // from class: com.p1.mobile.putong.core.data.Coupon.11
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Coupon coupon) {
            return Double.valueOf(coupon.endTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Double d) {
            coupon.endTime = d.doubleValue();
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_PURCHASECHANNEL = new Column<Coupon, List<String>>("condition_purchaseChannel_c") { // from class: com.p1.mobile.putong.core.data.Coupon.12
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Coupon coupon) {
            return coupon.condition.purchaseChannel;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<String> list) {
            coupon.condition.purchaseChannel = list;
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_SKUIDS = new Column<Coupon, List<String>>("condition_skuIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.13
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Coupon coupon) {
            return coupon.condition.skuIDs;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<String> list) {
            coupon.condition.skuIDs = list;
        }
    };
    public static final Column<Coupon, List<String>> CONDITION_MERCHANDISEIDS = new Column<Coupon, List<String>>("condition_merchandiseIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.14
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Coupon coupon) {
            return coupon.condition.merchandiseIDs;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<String> list) {
            coupon.condition.merchandiseIDs = list;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_BENEFITTYPE = new StringColumn<Coupon>("benefit_localBenefit_benefitType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.15
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.benefitType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.benefitType = str;
        }
    };
    public static final LongColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_TRIALDURATION = new LongColumn<Coupon>("benefit_localBenefit_trialBenefit_trialDuration_c") { // from class: com.p1.mobile.putong.core.data.Coupon.16
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Coupon coupon) {
            return Long.valueOf(coupon.benefit.localBenefit.trialBenefit.trialDuration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Long l2) {
            coupon.benefit.localBenefit.trialBenefit.trialDuration = l2.longValue();
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_DISCOUNT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_trialBenefit_discount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.17
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.trialBenefit.discount.discountType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.trialBenefit.discount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_DISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_discount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.18
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.discount.value);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.discount.value = num.intValue();
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_TRIALREPLACEITEMID = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_trialReplaceItemID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.19
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.trialReplaceItemID = num.intValue();
        }
    };

    /* JADX INFO: renamed from: BENEFIT_LOCALBENEFIT_TRIALBENEFIT_AFTERTRIALDISCOUNT_DISCOUNTTYPE */
    public static final StringColumn<Coupon> f21121x6fa1f90c = new StringColumn<Coupon>("benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.20
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_TRIALBENEFIT_AFTERTRIALDISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.21
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.trialBenefit.afterTrialDiscount.value = num.intValue();
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_discountBenefit_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.22
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.discountType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.discountBenefit.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_discountBenefit_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.23
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.discountBenefit.value);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.discountBenefit.value = num.intValue();
        }
    };
    public static final StringColumn<Coupon> USERCOUPONID = new StringColumn<Coupon>("userCouponID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.24
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.userCouponID;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.userCouponID = str;
        }
    };
    public static final StringColumn<Coupon> COUPONID = new StringColumn<Coupon>("couponID_c") { // from class: com.p1.mobile.putong.core.data.Coupon.25
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.couponID;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.couponID = str;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_SHOWDISCOUNT = new StringColumn<Coupon>("benefit_localBenefit_discountBenefit_showDiscount_c") { // from class: com.p1.mobile.putong.core.data.Coupon.26
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.showDiscount;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.discountBenefit.showDiscount = str;
        }
    };
    public static final Column<Coupon, PrivilegesChange> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_PRIVILEGESCHANGE = new Column<Coupon, PrivilegesChange>("benefit_localBenefit_discountBenefit_privilegesChange_c") { // from class: com.p1.mobile.putong.core.data.Coupon.27
        @Override // com.tantanapp.common.data.orm.Column
        public PrivilegesChange get(Coupon coupon) {
            return coupon.benefit.localBenefit.discountBenefit.privilegesChange;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, PrivilegesChange privilegesChange) {
            coupon.benefit.localBenefit.discountBenefit.privilegesChange = privilegesChange;
        }
    };
    public static final BooleanColumn<Coupon> BENEFIT_LOCALBENEFIT_DISCOUNTBENEFIT_HASPRIVILEGESCHANGE = new BooleanColumn<Coupon>("benefit_localBenefit_discountBenefit_hasPrivilegesChange_c") { // from class: com.p1.mobile.putong.core.data.Coupon.28
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Coupon coupon) {
            return Boolean.valueOf(coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Boolean bool) {
            coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange = bool.booleanValue();
        }
    };
    public static final Column<Coupon, List<String>> LOCALAPPLYPROMOTIONS = new Column<Coupon, List<String>>("localApplyPromotions_c") { // from class: com.p1.mobile.putong.core.data.Coupon.29
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Coupon coupon) {
            return coupon.localApplyPromotions;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<String> list) {
            coupon.localApplyPromotions = list;
        }
    };
    public static final StringColumn<Coupon> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_DISCOUNT_DISCOUNTTYPE = new StringColumn<Coupon>("benefit_localBenefit_giftBenefit_discount_discountType_c") { // from class: com.p1.mobile.putong.core.data.Coupon.30
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Coupon coupon) {
            return coupon.benefit.localBenefit.giftBenefit.discount.discountType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, String str) {
            coupon.benefit.localBenefit.giftBenefit.discount.discountType = str;
        }
    };
    public static final IntegerColumn<Coupon> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_DISCOUNT_VALUE = new IntegerColumn<Coupon>("benefit_localBenefit_giftBenefit_discount_value_c") { // from class: com.p1.mobile.putong.core.data.Coupon.31
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Coupon coupon) {
            return Integer.valueOf(coupon.benefit.localBenefit.giftBenefit.discount.value);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, Integer num) {
            coupon.benefit.localBenefit.giftBenefit.discount.value = num.intValue();
        }
    };
    public static final Column<Coupon, List<Integer>> BENEFIT_LOCALBENEFIT_GIFTBENEFIT_GIVEITEMIDS = new Column<Coupon, List<Integer>>("benefit_localBenefit_giftBenefit_giveItemIDs_c") { // from class: com.p1.mobile.putong.core.data.Coupon.32
        @Override // com.tantanapp.common.data.orm.Column
        public List<Integer> get(Coupon coupon) {
            return coupon.benefit.localBenefit.giftBenefit.giveItemIDs;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Coupon coupon, List<Integer> list) {
            coupon.benefit.localBenefit.giftBenefit.giveItemIDs = list;
        }
    };
    public static vzf0<Coupon> DB_ADAPTER = new vzf0<Coupon>() { // from class: com.p1.mobile.putong.core.data.Coupon.33
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,tags_c BLOB,couponType_c TEXT,ignoreBeginTime_c INTEGER,ignoreEndTime_c INTEGER,beginTime_c REAL,endTime_c REAL,condition_purchaseChannel_c BLOB,condition_skuIDs_c BLOB,condition_merchandiseIDs_c BLOB,benefit_localBenefit_benefitType_c TEXT,benefit_localBenefit_trialBenefit_trialDuration_c INTEGER,benefit_localBenefit_trialBenefit_discount_discountType_c TEXT,benefit_localBenefit_trialBenefit_discount_value_c INTEGER,benefit_localBenefit_trialBenefit_trialReplaceItemID_c INTEGER,benefit_localBenefit_trialBenefit_afterTrialDiscount_discountType_c TEXT,benefit_localBenefit_trialBenefit_afterTrialDiscount_value_c INTEGER,benefit_localBenefit_discountBenefit_discountType_c TEXT,benefit_localBenefit_discountBenefit_value_c INTEGER,userCouponID_c TEXT,couponID_c TEXT,benefit_localBenefit_discountBenefit_showDiscount_c TEXT,benefit_localBenefit_discountBenefit_privilegesChange_c BLOB,benefit_localBenefit_discountBenefit_hasPrivilegesChange_c INTEGER,localApplyPromotions_c BLOB,benefit_localBenefit_giftBenefit_discount_discountType_c TEXT,benefit_localBenefit_giftBenefit_discount_value_c INTEGER,benefit_localBenefit_giftBenefit_giveItemIDs_c BLOB)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return Coupon.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public Coupon init() {
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public Coupon read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
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
                coupon._id = cursor.getLong(i);
                int i2 = i + 1;
                List<Integer> list = null;
                coupon.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                coupon.name = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                coupon.tags = cursor.isNull(i4) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i4));
                int i5 = i + 4;
                coupon.couponType = cursor.isNull(i5) ? null : cursor.getString(i5);
                coupon.ignoreBeginTime = cursor.getInt(i + 5) == 1;
                coupon.ignoreEndTime = cursor.getInt(i + 6) == 1;
                coupon.beginTime = cursor.getDouble(i + 7);
                coupon.endTime = cursor.getDouble(i + 8);
                int i6 = i + 9;
                coupon.condition.purchaseChannel = cursor.isNull(i6) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i6));
                int i7 = i + 10;
                coupon.condition.skuIDs = cursor.isNull(i7) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i7));
                int i8 = i + 11;
                coupon.condition.merchandiseIDs = cursor.isNull(i8) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i8));
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
                coupon.benefit.localBenefit.discountBenefit.privilegesChange = cursor.isNull(i16) ? null : PrivilegesChange.PROTOBUF_ADAPTER.parse(cursor.getBlob(i16));
                coupon.benefit.localBenefit.discountBenefit.hasPrivilegesChange = cursor.getInt(i + 25) == 1;
                int i17 = i + 26;
                coupon.localApplyPromotions = cursor.isNull(i17) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i17));
                int i18 = i + 27;
                coupon.benefit.localBenefit.giftBenefit.discount.discountType = cursor.isNull(i18) ? null : cursor.getString(i18);
                coupon.benefit.localBenefit.giftBenefit.discount.value = cursor.getInt(i + 28);
                int i19 = i + 29;
                GiftBenefit giftBenefit = coupon.benefit.localBenefit.giftBenefit;
                if (!cursor.isNull(i19)) {
                    list = ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i19));
                }
                giftBenefit.giveItemIDs = list;
                this.readIndex = i + 30;
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

        @Override // p153l.vzf0
        public void write(Coupon coupon, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", coupon.f56859id);
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
                MessageNano.reportError(e, null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36492a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36493b(String str) {
        return str;
    }

    public static Coupon new_() {
        Coupon coupon = new Coupon();
        coupon.nullCheck();
        return coupon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Coupon mo225055clone() {
        Coupon coupon = new Coupon();
        coupon._id = this._id;
        coupon.f56859id = this.f56859id;
        coupon.name = this.name;
        List<String> list = this.tags;
        if (list != null) {
            coupon.tags = ValueObject.util_map(list, new qcj() { // from class: l.osb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Coupon.m36492a((String) obj);
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
            coupon.condition = condition.mo225055clone();
        }
        Benefit benefit = this.benefit;
        if (benefit != null) {
            coupon.benefit = benefit.mo225055clone();
        }
        coupon.userCouponID = this.userCouponID;
        coupon.couponID = this.couponID;
        coupon.newCustomerPromotionConfig = this.newCustomerPromotionConfig;
        List<String> list2 = this.localApplyPromotions;
        if (list2 != null) {
            coupon.localApplyPromotions = ValueObject.util_map(list2, new qcj() { // from class: l.psb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Coupon.m36493b((String) obj);
                }
            });
        }
        return coupon;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "coupon";
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

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isBelongPromotion(String str) {
        return this.localApplyPromotions.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
