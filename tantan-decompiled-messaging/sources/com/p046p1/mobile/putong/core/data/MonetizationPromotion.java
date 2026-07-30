package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.core.data.MonetizationPromotion;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MonetizationPromotion extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationpromotion";

    @ProtobufIndex(index = 52)
    public double beginTime;

    @NonNull
    @ProtobufIndex(index = 51)
    public List<String> coupons;

    @ProtobufIndex(index = 53)
    public double endTime;

    @NonNull
    @ProtobufIndex(index = 55)
    public String state;

    @NonNull
    @ProtobufIndex(index = 54)
    public List<String> userCouponIDs;
    public static ProtobufAdapter<MonetizationPromotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationPromotion>() { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationPromotion monetizationPromotion) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, monetizationPromotion._id);
            String str = monetizationPromotion.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<String> list = monetizationPromotion.coupons;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(51, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d = iM17228j + CodedOutputByteBufferNano.m17222d(52, monetizationPromotion.beginTime) + CodedOutputByteBufferNano.m17222d(53, monetizationPromotion.endTime);
            List<String> list2 = monetizationPromotion.userCouponIDs;
            if (list2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(54, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = monetizationPromotion.state;
            if (str2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(55, str2);
            }
            monetizationPromotion.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationPromotion parse(nb5 nb5Var) throws IOException {
            MonetizationPromotion monetizationPromotion = new MonetizationPromotion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (monetizationPromotion.coupons == null) {
                        monetizationPromotion.coupons = new ArrayList();
                    }
                    if (monetizationPromotion.userCouponIDs == null) {
                        monetizationPromotion.userCouponIDs = new ArrayList();
                    }
                    if (monetizationPromotion.state != null) {
                        break;
                    }
                    monetizationPromotion.state = "";
                    break;
                }
                if (iM158752u == 8) {
                    monetizationPromotion._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    monetizationPromotion.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    monetizationPromotion.coupons = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 417) {
                    monetizationPromotion.beginTime = nb5Var.m158739h();
                } else if (iM158752u == 425) {
                    monetizationPromotion.endTime = nb5Var.m158739h();
                } else if (iM158752u == 434) {
                    monetizationPromotion.userCouponIDs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 442) {
                        if (monetizationPromotion.coupons == null) {
                            monetizationPromotion.coupons = new ArrayList();
                        }
                        if (monetizationPromotion.userCouponIDs == null) {
                            monetizationPromotion.userCouponIDs = new ArrayList();
                        }
                        if (monetizationPromotion.state != null) {
                            break;
                        }
                        monetizationPromotion.state = "";
                        return monetizationPromotion;
                    }
                    monetizationPromotion.state = nb5Var.m158750s();
                }
            }
            return monetizationPromotion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationPromotion monetizationPromotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, monetizationPromotion._id);
            String str = monetizationPromotion.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<String> list = monetizationPromotion.coupons;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(51, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(52, monetizationPromotion.beginTime);
            codedOutputByteBufferNano.m17246C(53, monetizationPromotion.endTime);
            List<String> list2 = monetizationPromotion.userCouponIDs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(54, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = monetizationPromotion.state;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(55, str2);
            }
        }
    };
    public static JsonAdapter<MonetizationPromotion> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationPromotion>() { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationPromotion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationPromotion newInstance() {
            return new MonetizationPromotion();
        }

        public boolean parseField(MonetizationPromotion monetizationPromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    monetizationPromotion.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "beginTime":
                    monetizationPromotion.beginTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "userCouponIDs":
                    monetizationPromotion.userCouponIDs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    monetizationPromotion.f56011id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    monetizationPromotion.state = jsonParser.getValueAsString();
                    return true;
                case "coupons":
                    monetizationPromotion.coupons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationPromotion monetizationPromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "endTime":
                case "beginTime":
                case "userCouponIDs":
                    return true;
                case "id":
                    return false;
                case "state":
                case "coupons":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationPromotion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationPromotion monetizationPromotion, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationPromotion.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (monetizationPromotion.coupons != null) {
                jsonGenerator.writeFieldName("coupons");
                JsonAdapter.serializeArray(monetizationPromotion.coupons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("beginTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(monetizationPromotion.beginTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(monetizationPromotion.endTime), jsonGenerator, true);
            if (monetizationPromotion.userCouponIDs != null) {
                jsonGenerator.writeFieldName("userCouponIDs");
                JsonAdapter.serializeArray(monetizationPromotion.userCouponIDs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = monetizationPromotion.state;
            if (str2 != null) {
                jsonGenerator.writeStringField("state", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<MonetizationPromotion> _ID = new LongColumn<MonetizationPromotion>("_id") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(MonetizationPromotion monetizationPromotion) {
            return Long.valueOf(monetizationPromotion._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, Long l2) {
            monetizationPromotion._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<MonetizationPromotion> f20451ID = new StringColumn<MonetizationPromotion>("id_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(MonetizationPromotion monetizationPromotion) {
            return monetizationPromotion.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, String str) {
            monetizationPromotion.f56011id = str;
        }
    };
    public static final Column<MonetizationPromotion, List<String>> COUPONS = new Column<MonetizationPromotion, List<String>>("coupons_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.5
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(MonetizationPromotion monetizationPromotion) {
            return monetizationPromotion.coupons;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, List<String> list) {
            monetizationPromotion.coupons = list;
        }
    };
    public static final DoubleColumn<MonetizationPromotion> BEGINTIME = new DoubleColumn<MonetizationPromotion>("beginTime_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.6
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(MonetizationPromotion monetizationPromotion) {
            return Double.valueOf(monetizationPromotion.beginTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, Double d) {
            monetizationPromotion.beginTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<MonetizationPromotion> ENDTIME = new DoubleColumn<MonetizationPromotion>("endTime_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.7
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(MonetizationPromotion monetizationPromotion) {
            return Double.valueOf(monetizationPromotion.endTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, Double d) {
            monetizationPromotion.endTime = d.doubleValue();
        }
    };
    public static final Column<MonetizationPromotion, List<String>> USERCOUPONIDS = new Column<MonetizationPromotion, List<String>>("userCouponIDs_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.8
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(MonetizationPromotion monetizationPromotion) {
            return monetizationPromotion.userCouponIDs;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, List<String> list) {
            monetizationPromotion.userCouponIDs = list;
        }
    };
    public static final StringColumn<MonetizationPromotion> STATE = new StringColumn<MonetizationPromotion>("state_c") { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.9
        @Override // com.tantanapp.common.data.orm.Column
        public String get(MonetizationPromotion monetizationPromotion) {
            return monetizationPromotion.state;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(MonetizationPromotion monetizationPromotion, String str) {
            monetizationPromotion.state = str;
        }
    };
    public static mrf0<MonetizationPromotion> DB_ADAPTER = new mrf0<MonetizationPromotion>() { // from class: com.p1.mobile.putong.core.data.MonetizationPromotion.10
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,coupons_c BLOB,beginTime_c REAL,endTime_c REAL,userCouponIDs_c BLOB,state_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return MonetizationPromotion.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public MonetizationPromotion init() {
            MonetizationPromotion monetizationPromotion = new MonetizationPromotion();
            if (monetizationPromotion.coupons == null) {
                monetizationPromotion.coupons = new ArrayList();
            }
            if (monetizationPromotion.userCouponIDs == null) {
                monetizationPromotion.userCouponIDs = new ArrayList();
            }
            if (monetizationPromotion.state == null) {
                monetizationPromotion.state = "";
            }
            return monetizationPromotion;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public MonetizationPromotion read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            MonetizationPromotion monetizationPromotion = new MonetizationPromotion();
            try {
                monetizationPromotion._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                monetizationPromotion.f56011id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                monetizationPromotion.coupons = cursor.isNull(i3) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i3));
                monetizationPromotion.beginTime = cursor.getDouble(i + 3);
                monetizationPromotion.endTime = cursor.getDouble(i + 4);
                int i4 = i + 5;
                monetizationPromotion.userCouponIDs = cursor.isNull(i4) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i4));
                int i5 = i + 6;
                if (!cursor.isNull(i5)) {
                    string = cursor.getString(i5);
                }
                monetizationPromotion.state = string;
                this.readIndex = i + 7;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (monetizationPromotion.coupons == null) {
                monetizationPromotion.coupons = new ArrayList();
            }
            if (monetizationPromotion.userCouponIDs == null) {
                monetizationPromotion.userCouponIDs = new ArrayList();
            }
            if (monetizationPromotion.state == null) {
                monetizationPromotion.state = "";
            }
            return monetizationPromotion;
        }

        @Override // p149l.mrf0
        public void write(MonetizationPromotion monetizationPromotion, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", monetizationPromotion.f56011id);
                DbObject.cvPut(contentValues, "coupons_c", monetizationPromotion.coupons == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(monetizationPromotion.coupons));
                DbObject.cvPut(contentValues, "beginTime_c", Double.valueOf(monetizationPromotion.beginTime));
                DbObject.cvPut(contentValues, "endTime_c", Double.valueOf(monetizationPromotion.endTime));
                DbObject.cvPut(contentValues, "userCouponIDs_c", monetizationPromotion.userCouponIDs == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(monetizationPromotion.userCouponIDs));
                DbObject.cvPut(contentValues, "state_c", monetizationPromotion.state);
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35697a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35698b(String str) {
        return str;
    }

    public static MonetizationPromotion new_() {
        MonetizationPromotion monetizationPromotion = new MonetizationPromotion();
        monetizationPromotion.nullCheck();
        return monetizationPromotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationPromotion mo223809clone() {
        MonetizationPromotion monetizationPromotion = new MonetizationPromotion();
        monetizationPromotion._id = this._id;
        monetizationPromotion.f56011id = this.f56011id;
        List<String> list = this.coupons;
        if (list != null) {
            monetizationPromotion.coupons = ValueObject.util_map(list, new w9j() { // from class: l.nx00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MonetizationPromotion.m35697a((String) obj);
                }
            });
        }
        monetizationPromotion.beginTime = this.beginTime;
        monetizationPromotion.endTime = this.endTime;
        List<String> list2 = this.userCouponIDs;
        if (list2 != null) {
            monetizationPromotion.userCouponIDs = ValueObject.util_map(list2, new w9j() { // from class: l.ox00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MonetizationPromotion.m35698b((String) obj);
                }
            });
        }
        monetizationPromotion.state = this.state;
        return monetizationPromotion;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationPromotion)) {
            return false;
        }
        MonetizationPromotion monetizationPromotion = (MonetizationPromotion) obj;
        return super.equals(obj) && ValueObject.util_equals(this.coupons, monetizationPromotion.coupons) && this.beginTime == monetizationPromotion.beginTime && this.endTime == monetizationPromotion.endTime && ValueObject.util_equals(this.userCouponIDs, monetizationPromotion.userCouponIDs) && ValueObject.util_equals(this.state, monetizationPromotion.state);
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
        List<String> list = this.coupons;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beginTime);
        int i2 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        List<String> list2 = this.userCouponIDs;
        int iHashCode3 = (i3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.state;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.coupons == null) {
            this.coupons = new ArrayList();
        }
        if (this.userCouponIDs == null) {
            this.userCouponIDs = new ArrayList();
        }
        if (this.state == null) {
            this.state = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
