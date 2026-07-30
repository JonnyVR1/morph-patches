package com.p051p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;
import p153l.vzf0;
import p153l.wzh0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreGiftInfo extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "coregiftinfo";

    @NonNull
    public String coinSign;

    @NonNull
    public String consumeType;

    @ProtobufIndex(index = 55)
    public boolean dynamicGift;

    @NonNull
    @ProtobufIndex(index = 57)
    public String dynamicMD5;

    @NonNull
    @ProtobufIndex(index = 56)
    public String dynamicURL;

    @NonNull
    @ProtobufIndex(index = 59)
    public GiftInfoExtra extra;

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;

    @Nullable
    public CoreGiftPriority priority;

    @ProtobufIndex(index = 58)
    public int quota;

    @ProtobufIndex(index = 53)
    public double unitCoinPrice;

    @ProtobufIndex(index = 54)
    public int unitLikes;

    @NonNull
    @ProtobufIndex(index = 52)
    public String url;
    public static ProtobufAdapter<CoreGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGiftInfo>() { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreGiftInfo coreGiftInfo) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, coreGiftInfo._id);
            String str = coreGiftInfo.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = coreGiftInfo.name;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            String str3 = coreGiftInfo.url;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(52, str3);
            }
            int iM17277d = iM17283j + CodedOutputByteBufferNano.m17277d(53, coreGiftInfo.unitCoinPrice) + CodedOutputByteBufferNano.m17281h(54, coreGiftInfo.unitLikes) + CodedOutputByteBufferNano.m17275b(55, coreGiftInfo.dynamicGift);
            String str4 = coreGiftInfo.dynamicURL;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(56, str4);
            }
            String str5 = coreGiftInfo.dynamicMD5;
            if (str5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(57, str5);
            }
            int iM17281h = iM17277d + CodedOutputByteBufferNano.m17281h(58, coreGiftInfo.quota);
            GiftInfoExtra giftInfoExtra = coreGiftInfo.extra;
            if (giftInfoExtra != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(59, giftInfoExtra, GiftInfoExtra.PROTOBUF_ADAPTER);
            }
            coreGiftInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreGiftInfo parse(nc5 nc5Var) throws IOException {
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (coreGiftInfo.name == null) {
                            coreGiftInfo.name = "";
                        }
                        if (coreGiftInfo.url == null) {
                            coreGiftInfo.url = "";
                        }
                        if (coreGiftInfo.dynamicURL == null) {
                            coreGiftInfo.dynamicURL = "";
                        }
                        if (coreGiftInfo.dynamicMD5 == null) {
                            coreGiftInfo.dynamicMD5 = "";
                        }
                        if (coreGiftInfo.extra == null) {
                            coreGiftInfo.extra = GiftInfoExtra.new_();
                        }
                        if (coreGiftInfo.consumeType == null) {
                            coreGiftInfo.consumeType = "";
                        }
                        if (coreGiftInfo.coinSign == null) {
                            coreGiftInfo.coinSign = "";
                        }
                        break;
                    case 8:
                        coreGiftInfo._id = nc5Var.m162487k();
                        continue;
                    case 18:
                        coreGiftInfo.f56859id = nc5Var.m162495s();
                        continue;
                    case 410:
                        coreGiftInfo.name = nc5Var.m162495s();
                        continue;
                    case 418:
                        coreGiftInfo.url = nc5Var.m162495s();
                        continue;
                    case 425:
                        coreGiftInfo.unitCoinPrice = nc5Var.m162484h();
                        continue;
                    case 432:
                        coreGiftInfo.unitLikes = nc5Var.m162486j();
                        continue;
                    case 440:
                        coreGiftInfo.dynamicGift = nc5Var.m162483g();
                        continue;
                    case 450:
                        coreGiftInfo.dynamicURL = nc5Var.m162495s();
                        continue;
                    case 458:
                        coreGiftInfo.dynamicMD5 = nc5Var.m162495s();
                        continue;
                    case 464:
                        coreGiftInfo.quota = nc5Var.m162486j();
                        continue;
                    case 474:
                        coreGiftInfo.extra = (GiftInfoExtra) nc5Var.m162488l(GiftInfoExtra.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (coreGiftInfo.name == null) {
                            coreGiftInfo.name = "";
                        }
                        if (coreGiftInfo.url == null) {
                            coreGiftInfo.url = "";
                        }
                        if (coreGiftInfo.dynamicURL == null) {
                            coreGiftInfo.dynamicURL = "";
                        }
                        if (coreGiftInfo.dynamicMD5 == null) {
                            coreGiftInfo.dynamicMD5 = "";
                        }
                        if (coreGiftInfo.extra == null) {
                            coreGiftInfo.extra = GiftInfoExtra.new_();
                        }
                        if (coreGiftInfo.consumeType == null) {
                            coreGiftInfo.consumeType = "";
                        }
                        if (coreGiftInfo.coinSign == null) {
                            coreGiftInfo.coinSign = "";
                            return coreGiftInfo;
                        }
                        break;
                }
            }
            return coreGiftInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreGiftInfo coreGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, coreGiftInfo._id);
            String str = coreGiftInfo.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = coreGiftInfo.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            String str3 = coreGiftInfo.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(52, str3);
            }
            codedOutputByteBufferNano.m17301C(53, coreGiftInfo.unitCoinPrice);
            codedOutputByteBufferNano.m17305G(54, coreGiftInfo.unitLikes);
            codedOutputByteBufferNano.m17299A(55, coreGiftInfo.dynamicGift);
            String str4 = coreGiftInfo.dynamicURL;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(56, str4);
            }
            String str5 = coreGiftInfo.dynamicMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(57, str5);
            }
            codedOutputByteBufferNano.m17305G(58, coreGiftInfo.quota);
            GiftInfoExtra giftInfoExtra = coreGiftInfo.extra;
            if (giftInfoExtra != null) {
                codedOutputByteBufferNano.m17309K(59, giftInfoExtra, GiftInfoExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<CoreGiftInfo>() { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreGiftInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreGiftInfo newInstance() {
            return new CoreGiftInfo();
        }

        public boolean parseField(CoreGiftInfo coreGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "priority":
                    coreGiftInfo.priority = CoreGiftPriority.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "consumeType":
                    coreGiftInfo.consumeType = jsonParser.getValueAsString();
                    return true;
                case "coinSign":
                    coreGiftInfo.coinSign = jsonParser.getValueAsString();
                    return true;
                case "unitLikes":
                    coreGiftInfo.unitLikes = jsonParser.getValueAsInt();
                    return true;
                case "dynamicMD5":
                    coreGiftInfo.dynamicMD5 = jsonParser.getValueAsString();
                    return true;
                case "dynamicURL":
                    coreGiftInfo.dynamicURL = jsonParser.getValueAsString();
                    return true;
                case "dynamicGift":
                    coreGiftInfo.dynamicGift = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    coreGiftInfo.f56859id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    coreGiftInfo.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    coreGiftInfo.name = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    coreGiftInfo.extra = GiftInfoExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quota":
                    coreGiftInfo.quota = jsonParser.getValueAsInt();
                    return true;
                case "unitCoinPrice":
                    coreGiftInfo.unitCoinPrice = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreGiftInfo coreGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "priority":
                case "consumeType":
                case "coinSign":
                case "unitLikes":
                case "dynamicMD5":
                case "dynamicURL":
                case "dynamicGift":
                    return true;
                case "id":
                    return false;
                case "url":
                case "name":
                case "extra":
                case "quota":
                case "unitCoinPrice":
                    return true;
                default:
                    return super.parseFieldCheck(coreGiftInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreGiftInfo coreGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = coreGiftInfo.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coreGiftInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = coreGiftInfo.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("unitCoinPrice", coreGiftInfo.unitCoinPrice);
            jsonGenerator.writeNumberField("unitLikes", coreGiftInfo.unitLikes);
            jsonGenerator.writeBooleanField("dynamicGift", coreGiftInfo.dynamicGift);
            String str4 = coreGiftInfo.dynamicURL;
            if (str4 != null) {
                jsonGenerator.writeStringField("dynamicURL", str4);
            }
            String str5 = coreGiftInfo.dynamicMD5;
            if (str5 != null) {
                jsonGenerator.writeStringField("dynamicMD5", str5);
            }
            if (coreGiftInfo.priority != null) {
                jsonGenerator.writeFieldName("priority");
                CoreGiftPriority.JSON_ADAPTER.serialize(coreGiftInfo.priority, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("quota", coreGiftInfo.quota);
            if (coreGiftInfo.extra != null) {
                jsonGenerator.writeFieldName("extra");
                GiftInfoExtra.JSON_ADAPTER.serialize(coreGiftInfo.extra, jsonGenerator, true);
            }
            String str6 = coreGiftInfo.consumeType;
            if (str6 != null) {
                jsonGenerator.writeStringField("consumeType", str6);
            }
            String str7 = coreGiftInfo.coinSign;
            if (str7 != null) {
                jsonGenerator.writeStringField("coinSign", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<CoreGiftInfo> _ID = new LongColumn<CoreGiftInfo>("_id") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(CoreGiftInfo coreGiftInfo) {
            return Long.valueOf(coreGiftInfo._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, Long l2) {
            coreGiftInfo._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<CoreGiftInfo> f21119ID = new StringColumn<CoreGiftInfo>("id_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.f56859id = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> NAME = new StringColumn<CoreGiftInfo>("name_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.name = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> URL = new StringColumn<CoreGiftInfo>("url_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.url;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.url = str;
        }
    };
    public static final DoubleColumn<CoreGiftInfo> UNITCOINPRICE = new DoubleColumn<CoreGiftInfo>("unitCoinPrice_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.7
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(CoreGiftInfo coreGiftInfo) {
            return Double.valueOf(coreGiftInfo.unitCoinPrice);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, Double d) {
            coreGiftInfo.unitCoinPrice = d.doubleValue();
        }
    };
    public static final IntegerColumn<CoreGiftInfo> UNITLIKES = new IntegerColumn<CoreGiftInfo>("unitLikes_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.8
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(CoreGiftInfo coreGiftInfo) {
            return Integer.valueOf(coreGiftInfo.unitLikes);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, Integer num) {
            coreGiftInfo.unitLikes = num.intValue();
        }
    };
    public static final BooleanColumn<CoreGiftInfo> DYNAMICGIFT = new BooleanColumn<CoreGiftInfo>("dynamicGift_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.9
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(CoreGiftInfo coreGiftInfo) {
            return Boolean.valueOf(coreGiftInfo.dynamicGift);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, Boolean bool) {
            coreGiftInfo.dynamicGift = bool.booleanValue();
        }
    };
    public static final StringColumn<CoreGiftInfo> DYNAMICURL = new StringColumn<CoreGiftInfo>("dynamicURL_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.dynamicURL;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.dynamicURL = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> DYNAMICMD5 = new StringColumn<CoreGiftInfo>("dynamicMD5_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.11
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.dynamicMD5;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.dynamicMD5 = str;
        }
    };
    public static final IntegerColumn<CoreGiftInfo> QUOTA = new IntegerColumn<CoreGiftInfo>("quota_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.12
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(CoreGiftInfo coreGiftInfo) {
            return Integer.valueOf(coreGiftInfo.quota);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, Integer num) {
            coreGiftInfo.quota = num.intValue();
        }
    };
    public static final StringColumn<CoreGiftInfo> EXTRA_MESSAGETIPS = new StringColumn<CoreGiftInfo>("extra_messageTips_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.13
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.extra.messageTips;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.extra.messageTips = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> EXTRA_NOQUOTATOAST = new StringColumn<CoreGiftInfo>("extra_noQuotaToast_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.14
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.extra.noQuotaToast;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.extra.noQuotaToast = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> EXTRA_SHOPGUIDE = new StringColumn<CoreGiftInfo>("extra_shopGuide_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.15
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.extra.shopGuide;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.extra.shopGuide = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> EXTRA_BLESSINGTEXT = new StringColumn<CoreGiftInfo>("extra_blessingText_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.16
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.extra.blessingText;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.extra.blessingText = str;
        }
    };
    public static final StringColumn<CoreGiftInfo> EXTRA_GRAYURL = new StringColumn<CoreGiftInfo>("extra_grayURL_c") { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.17
        @Override // com.tantanapp.common.data.orm.Column
        public String get(CoreGiftInfo coreGiftInfo) {
            return coreGiftInfo.extra.grayURL;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(CoreGiftInfo coreGiftInfo, String str) {
            coreGiftInfo.extra.grayURL = str;
        }
    };
    public static vzf0<CoreGiftInfo> DB_ADAPTER = new vzf0<CoreGiftInfo>() { // from class: com.p1.mobile.putong.core.data.CoreGiftInfo.18
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,url_c TEXT,unitCoinPrice_c REAL,unitLikes_c INTEGER,dynamicGift_c INTEGER,dynamicURL_c TEXT,dynamicMD5_c TEXT,quota_c INTEGER,extra_messageTips_c TEXT,extra_noQuotaToast_c TEXT,extra_shopGuide_c TEXT,extra_blessingText_c TEXT,extra_grayURL_c TEXT)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return CoreGiftInfo.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public CoreGiftInfo init() {
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            if (coreGiftInfo.name == null) {
                coreGiftInfo.name = "";
            }
            if (coreGiftInfo.url == null) {
                coreGiftInfo.url = "";
            }
            if (coreGiftInfo.dynamicURL == null) {
                coreGiftInfo.dynamicURL = "";
            }
            if (coreGiftInfo.dynamicMD5 == null) {
                coreGiftInfo.dynamicMD5 = "";
            }
            if (coreGiftInfo.extra == null) {
                coreGiftInfo.extra = GiftInfoExtra.new_();
            }
            if (coreGiftInfo.consumeType == null) {
                coreGiftInfo.consumeType = "";
            }
            if (coreGiftInfo.coinSign == null) {
                coreGiftInfo.coinSign = "";
            }
            return coreGiftInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public CoreGiftInfo read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
            try {
                coreGiftInfo.extra = new GiftInfoExtra();
                coreGiftInfo._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                coreGiftInfo.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                coreGiftInfo.name = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                coreGiftInfo.url = cursor.isNull(i4) ? null : cursor.getString(i4);
                coreGiftInfo.unitCoinPrice = cursor.getDouble(i + 4);
                coreGiftInfo.unitLikes = cursor.getInt(i + 5);
                coreGiftInfo.dynamicGift = cursor.getInt(i + 6) == 1;
                int i5 = i + 7;
                coreGiftInfo.dynamicURL = cursor.isNull(i5) ? null : cursor.getString(i5);
                int i6 = i + 8;
                coreGiftInfo.dynamicMD5 = cursor.isNull(i6) ? null : cursor.getString(i6);
                coreGiftInfo.quota = cursor.getInt(i + 9);
                int i7 = i + 10;
                coreGiftInfo.extra.messageTips = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 11;
                coreGiftInfo.extra.noQuotaToast = cursor.isNull(i8) ? null : cursor.getString(i8);
                int i9 = i + 12;
                coreGiftInfo.extra.shopGuide = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 13;
                coreGiftInfo.extra.blessingText = cursor.isNull(i10) ? null : cursor.getString(i10);
                int i11 = i + 14;
                GiftInfoExtra giftInfoExtra = coreGiftInfo.extra;
                if (!cursor.isNull(i11)) {
                    string = cursor.getString(i11);
                }
                giftInfoExtra.grayURL = string;
                this.readIndex = i + 15;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (coreGiftInfo.name == null) {
                coreGiftInfo.name = "";
            }
            if (coreGiftInfo.url == null) {
                coreGiftInfo.url = "";
            }
            if (coreGiftInfo.dynamicURL == null) {
                coreGiftInfo.dynamicURL = "";
            }
            if (coreGiftInfo.dynamicMD5 == null) {
                coreGiftInfo.dynamicMD5 = "";
            }
            if (coreGiftInfo.extra == null) {
                coreGiftInfo.extra = GiftInfoExtra.new_();
            }
            if (coreGiftInfo.consumeType == null) {
                coreGiftInfo.consumeType = "";
            }
            if (coreGiftInfo.coinSign == null) {
                coreGiftInfo.coinSign = "";
            }
            return coreGiftInfo;
        }

        @Override // p153l.vzf0
        public void write(CoreGiftInfo coreGiftInfo, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", coreGiftInfo.f56859id);
                DbObject.cvPut(contentValues, "name_c", coreGiftInfo.name);
                DbObject.cvPut(contentValues, "url_c", coreGiftInfo.url);
                DbObject.cvPut(contentValues, "unitCoinPrice_c", Double.valueOf(coreGiftInfo.unitCoinPrice));
                DbObject.cvPut(contentValues, "unitLikes_c", Integer.valueOf(coreGiftInfo.unitLikes));
                DbObject.cvPut(contentValues, "dynamicGift_c", Integer.valueOf(coreGiftInfo.dynamicGift ? 1 : 0));
                DbObject.cvPut(contentValues, "dynamicURL_c", coreGiftInfo.dynamicURL);
                DbObject.cvPut(contentValues, "dynamicMD5_c", coreGiftInfo.dynamicMD5);
                DbObject.cvPut(contentValues, "quota_c", Integer.valueOf(coreGiftInfo.quota));
                DbObject.cvPut(contentValues, "extra_messageTips_c", coreGiftInfo.extra.messageTips);
                DbObject.cvPut(contentValues, "extra_noQuotaToast_c", coreGiftInfo.extra.noQuotaToast);
                DbObject.cvPut(contentValues, "extra_shopGuide_c", coreGiftInfo.extra.shopGuide);
                DbObject.cvPut(contentValues, "extra_blessingText_c", coreGiftInfo.extra.blessingText);
                DbObject.cvPut(contentValues, "extra_grayURL_c", coreGiftInfo.extra.grayURL);
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static CoreGiftInfo new_() {
        CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
        coreGiftInfo.nullCheck();
        return coreGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreGiftInfo mo225055clone() {
        CoreGiftInfo coreGiftInfo = new CoreGiftInfo();
        coreGiftInfo._id = this._id;
        coreGiftInfo.f56859id = this.f56859id;
        coreGiftInfo.name = this.name;
        coreGiftInfo.url = this.url;
        coreGiftInfo.unitCoinPrice = this.unitCoinPrice;
        coreGiftInfo.unitLikes = this.unitLikes;
        coreGiftInfo.dynamicGift = this.dynamicGift;
        coreGiftInfo.dynamicURL = this.dynamicURL;
        coreGiftInfo.dynamicMD5 = this.dynamicMD5;
        coreGiftInfo.priority = this.priority;
        coreGiftInfo.quota = this.quota;
        GiftInfoExtra giftInfoExtra = this.extra;
        if (giftInfoExtra != null) {
            coreGiftInfo.extra = giftInfoExtra.mo225055clone();
        }
        coreGiftInfo.consumeType = this.consumeType;
        coreGiftInfo.coinSign = this.coinSign;
        return coreGiftInfo;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreGiftInfo)) {
            return false;
        }
        CoreGiftInfo coreGiftInfo = (CoreGiftInfo) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, coreGiftInfo.name) && ValueObject.util_equals(this.url, coreGiftInfo.url) && this.unitCoinPrice == coreGiftInfo.unitCoinPrice && this.unitLikes == coreGiftInfo.unitLikes && this.dynamicGift == coreGiftInfo.dynamicGift && ValueObject.util_equals(this.dynamicURL, coreGiftInfo.dynamicURL) && ValueObject.util_equals(this.dynamicMD5, coreGiftInfo.dynamicMD5) && ValueObject.util_equals(this.priority, coreGiftInfo.priority) && this.quota == coreGiftInfo.quota && ValueObject.util_equals(this.extra, coreGiftInfo.extra) && ValueObject.util_equals(this.consumeType, coreGiftInfo.consumeType) && ValueObject.util_equals(this.coinSign, coreGiftInfo.coinSign);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
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
        String str2 = this.url;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.unitCoinPrice);
        int i2 = (((((((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.unitLikes) * 41) + (this.dynamicGift ? 1231 : 1237)) * 41;
        String str3 = this.dynamicURL;
        int iHashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.dynamicMD5;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        CoreGiftPriority coreGiftPriority = this.priority;
        int iHashCode6 = (((iHashCode5 + (coreGiftPriority != null ? coreGiftPriority.hashCode() : 0)) * 41) + this.quota) * 41;
        GiftInfoExtra giftInfoExtra = this.extra;
        int iHashCode7 = (iHashCode6 + (giftInfoExtra != null ? giftInfoExtra.hashCode() : 0)) * 41;
        String str5 = this.consumeType;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.coinSign;
        int iHashCode9 = iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.dynamicURL == null) {
            this.dynamicURL = "";
        }
        if (this.dynamicMD5 == null) {
            this.dynamicMD5 = "";
        }
        if (this.extra == null) {
            this.extra = GiftInfoExtra.new_();
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
