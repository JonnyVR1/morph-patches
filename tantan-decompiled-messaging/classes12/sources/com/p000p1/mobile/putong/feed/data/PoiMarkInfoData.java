package com.p000p1.mobile.putong.feed.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PoiMarkInfoData extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "poimarkinfodata";

    @NonNull
    @ProtobufIndex(index = 54)
    public String address;

    @ProtobufIndex(index = 52)
    public double latitude;

    @ProtobufIndex(index = 53)
    public double longitude;

    @NonNull
    @ProtobufIndex(index = 51)
    public String poiName;

    @ProtobufIndex(index = 56)
    public long punchInDate;

    @ProtobufIndex(index = 55)
    public long triggerDate;

    @ProtobufIndex(index = 57)
    public int triggerTimes;
    public static ProtobufAdapter<PoiMarkInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiMarkInfoData>() { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PoiMarkInfoData poiMarkInfoData) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) poiMarkInfoData)._id);
            String str = ((DbObject) poiMarkInfoData).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = poiMarkInfoData.poiName;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            int iD = iJ + CodedOutputByteBufferNano.d(52, poiMarkInfoData.latitude) + CodedOutputByteBufferNano.d(53, poiMarkInfoData.longitude);
            String str3 = poiMarkInfoData.address;
            if (str3 != null) {
                iD += CodedOutputByteBufferNano.o(54, str3);
            }
            int iJ2 = iD + CodedOutputByteBufferNano.j(55, poiMarkInfoData.triggerDate) + CodedOutputByteBufferNano.j(56, poiMarkInfoData.punchInDate) + CodedOutputByteBufferNano.h(57, poiMarkInfoData.triggerTimes);
            ((MessageNano) poiMarkInfoData).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PoiMarkInfoData m19717parse(nb5 nb5Var) throws IOException {
            PoiMarkInfoData poiMarkInfoData = new PoiMarkInfoData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (poiMarkInfoData.poiName == null) {
                        poiMarkInfoData.poiName = "";
                    }
                    if (poiMarkInfoData.address != null) {
                        break;
                    }
                    poiMarkInfoData.address = "";
                    break;
                }
                if (iU == 8) {
                    ((DbObject) poiMarkInfoData)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) poiMarkInfoData).id = nb5Var.s();
                } else if (iU == 410) {
                    poiMarkInfoData.poiName = nb5Var.s();
                } else if (iU == 417) {
                    poiMarkInfoData.latitude = nb5Var.h();
                } else if (iU == 425) {
                    poiMarkInfoData.longitude = nb5Var.h();
                } else if (iU == 434) {
                    poiMarkInfoData.address = nb5Var.s();
                } else if (iU == 440) {
                    poiMarkInfoData.triggerDate = nb5Var.k();
                } else if (iU == 448) {
                    poiMarkInfoData.punchInDate = nb5Var.k();
                } else {
                    if (iU != 456) {
                        if (poiMarkInfoData.poiName == null) {
                            poiMarkInfoData.poiName = "";
                        }
                        if (poiMarkInfoData.address != null) {
                            break;
                        }
                        poiMarkInfoData.address = "";
                        return poiMarkInfoData;
                    }
                    poiMarkInfoData.triggerTimes = nb5Var.j();
                }
            }
            return poiMarkInfoData;
        }

        public void serialize(PoiMarkInfoData poiMarkInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) poiMarkInfoData)._id);
            String str = ((DbObject) poiMarkInfoData).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = poiMarkInfoData.poiName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            codedOutputByteBufferNano.C(52, poiMarkInfoData.latitude);
            codedOutputByteBufferNano.C(53, poiMarkInfoData.longitude);
            String str3 = poiMarkInfoData.address;
            if (str3 != null) {
                codedOutputByteBufferNano.R(54, str3);
            }
            codedOutputByteBufferNano.I(55, poiMarkInfoData.triggerDate);
            codedOutputByteBufferNano.I(56, poiMarkInfoData.punchInDate);
            codedOutputByteBufferNano.G(57, poiMarkInfoData.triggerTimes);
        }
    };
    public static JsonAdapter<PoiMarkInfoData> JSON_ADAPTER = new ObjectJsonAdapter<PoiMarkInfoData>() { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.2
        public Class getDataClass() {
            return PoiMarkInfoData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PoiMarkInfoData mo17830newInstance() {
            return new PoiMarkInfoData();
        }

        public boolean parseField(PoiMarkInfoData poiMarkInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latitude":
                    poiMarkInfoData.latitude = jsonParser.getValueAsDouble();
                    return true;
                case "punchInDate":
                    poiMarkInfoData.punchInDate = jsonParser.getValueAsLong();
                    return true;
                case "address":
                    poiMarkInfoData.address = jsonParser.getValueAsString();
                    return true;
                case "triggerDate":
                    poiMarkInfoData.triggerDate = jsonParser.getValueAsLong();
                    return true;
                case "poiName":
                    poiMarkInfoData.poiName = jsonParser.getValueAsString();
                    return true;
                case "id":
                    ((DbObject) poiMarkInfoData).id = jsonParser.getValueAsString();
                    return false;
                case "longitude":
                    poiMarkInfoData.longitude = jsonParser.getValueAsDouble();
                    return true;
                case "triggerTimes":
                    poiMarkInfoData.triggerTimes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PoiMarkInfoData poiMarkInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latitude":
                case "punchInDate":
                case "address":
                case "triggerDate":
                case "poiName":
                    return true;
                case "id":
                    return false;
                case "longitude":
                case "triggerTimes":
                    return true;
                default:
                    return super.parseFieldCheck(poiMarkInfoData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiMarkInfoData poiMarkInfoData, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) poiMarkInfoData).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = poiMarkInfoData.poiName;
            if (str2 != null) {
                jsonGenerator.writeStringField("poiName", str2);
            }
            jsonGenerator.writeNumberField("latitude", poiMarkInfoData.latitude);
            jsonGenerator.writeNumberField("longitude", poiMarkInfoData.longitude);
            String str3 = poiMarkInfoData.address;
            if (str3 != null) {
                jsonGenerator.writeStringField("address", str3);
            }
            jsonGenerator.writeNumberField("triggerDate", poiMarkInfoData.triggerDate);
            jsonGenerator.writeNumberField("punchInDate", poiMarkInfoData.punchInDate);
            jsonGenerator.writeNumberField("triggerTimes", poiMarkInfoData.triggerTimes);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiMarkInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiMarkInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<PoiMarkInfoData> _ID = new LongColumn<PoiMarkInfoData>("_id") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.3
        public Long get(PoiMarkInfoData poiMarkInfoData) {
            return Long.valueOf(((DbObject) poiMarkInfoData)._id);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Long l2) {
            ((DbObject) poiMarkInfoData)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<PoiMarkInfoData> f701ID = new StringColumn<PoiMarkInfoData>("id_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.4
        public String get(PoiMarkInfoData poiMarkInfoData) {
            return ((DbObject) poiMarkInfoData).id;
        }

        public void set(PoiMarkInfoData poiMarkInfoData, String str) {
            ((DbObject) poiMarkInfoData).id = str;
        }
    };
    public static final StringColumn<PoiMarkInfoData> POINAME = new StringColumn<PoiMarkInfoData>("poiName_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.5
        public String get(PoiMarkInfoData poiMarkInfoData) {
            return poiMarkInfoData.poiName;
        }

        public void set(PoiMarkInfoData poiMarkInfoData, String str) {
            poiMarkInfoData.poiName = str;
        }
    };
    public static final DoubleColumn<PoiMarkInfoData> LATITUDE = new DoubleColumn<PoiMarkInfoData>("latitude_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.6
        public Double get(PoiMarkInfoData poiMarkInfoData) {
            return Double.valueOf(poiMarkInfoData.latitude);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Double d) {
            poiMarkInfoData.latitude = d.doubleValue();
        }
    };
    public static final DoubleColumn<PoiMarkInfoData> LONGITUDE = new DoubleColumn<PoiMarkInfoData>("longitude_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.7
        public Double get(PoiMarkInfoData poiMarkInfoData) {
            return Double.valueOf(poiMarkInfoData.longitude);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Double d) {
            poiMarkInfoData.longitude = d.doubleValue();
        }
    };
    public static final StringColumn<PoiMarkInfoData> ADDRESS = new StringColumn<PoiMarkInfoData>("address_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.8
        public String get(PoiMarkInfoData poiMarkInfoData) {
            return poiMarkInfoData.address;
        }

        public void set(PoiMarkInfoData poiMarkInfoData, String str) {
            poiMarkInfoData.address = str;
        }
    };
    public static final LongColumn<PoiMarkInfoData> TRIGGERDATE = new LongColumn<PoiMarkInfoData>("triggerDate_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.9
        public Long get(PoiMarkInfoData poiMarkInfoData) {
            return Long.valueOf(poiMarkInfoData.triggerDate);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Long l2) {
            poiMarkInfoData.triggerDate = l2.longValue();
        }
    };
    public static final LongColumn<PoiMarkInfoData> PUNCHINDATE = new LongColumn<PoiMarkInfoData>("punchInDate_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.10
        public Long get(PoiMarkInfoData poiMarkInfoData) {
            return Long.valueOf(poiMarkInfoData.punchInDate);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Long l2) {
            poiMarkInfoData.punchInDate = l2.longValue();
        }
    };
    public static final IntegerColumn<PoiMarkInfoData> TRIGGERTIMES = new IntegerColumn<PoiMarkInfoData>("triggerTimes_c") { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.11
        public Integer get(PoiMarkInfoData poiMarkInfoData) {
            return Integer.valueOf(poiMarkInfoData.triggerTimes);
        }

        public void set(PoiMarkInfoData poiMarkInfoData, Integer num) {
            poiMarkInfoData.triggerTimes = num.intValue();
        }
    };
    public static mrf0<PoiMarkInfoData> DB_ADAPTER = new mrf0<PoiMarkInfoData>() { // from class: com.p1.mobile.putong.feed.data.PoiMarkInfoData.12
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,poiName_c TEXT,latitude_c REAL,longitude_c REAL,address_c TEXT,triggerDate_c INTEGER,punchInDate_c INTEGER,triggerTimes_c INTEGER)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return PoiMarkInfoData.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public PoiMarkInfoData init() {
            PoiMarkInfoData poiMarkInfoData = new PoiMarkInfoData();
            if (poiMarkInfoData.poiName == null) {
                poiMarkInfoData.poiName = "";
            }
            if (poiMarkInfoData.address == null) {
                poiMarkInfoData.address = "";
            }
            return poiMarkInfoData;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public PoiMarkInfoData read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            PoiMarkInfoData poiMarkInfoData = new PoiMarkInfoData();
            try {
                ((DbObject) poiMarkInfoData)._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                ((DbObject) poiMarkInfoData).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                poiMarkInfoData.poiName = cursor.isNull(i3) ? null : cursor.getString(i3);
                poiMarkInfoData.latitude = cursor.getDouble(i + 3);
                poiMarkInfoData.longitude = cursor.getDouble(i + 4);
                int i4 = i + 5;
                if (!cursor.isNull(i4)) {
                    string = cursor.getString(i4);
                }
                poiMarkInfoData.address = string;
                poiMarkInfoData.triggerDate = cursor.getLong(i + 6);
                poiMarkInfoData.punchInDate = cursor.getLong(i + 7);
                poiMarkInfoData.triggerTimes = cursor.getInt(i + 8);
                this.readIndex = i + 9;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (poiMarkInfoData.poiName == null) {
                poiMarkInfoData.poiName = "";
            }
            if (poiMarkInfoData.address == null) {
                poiMarkInfoData.address = "";
            }
            return poiMarkInfoData;
        }

        @Override // p007l.mrf0
        public void write(PoiMarkInfoData poiMarkInfoData, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) poiMarkInfoData).id);
                DbObject.cvPut(contentValues, "poiName_c", poiMarkInfoData.poiName);
                DbObject.cvPut(contentValues, "latitude_c", Double.valueOf(poiMarkInfoData.latitude));
                DbObject.cvPut(contentValues, "longitude_c", Double.valueOf(poiMarkInfoData.longitude));
                DbObject.cvPut(contentValues, "address_c", poiMarkInfoData.address);
                DbObject.cvPut(contentValues, "triggerDate_c", Long.valueOf(poiMarkInfoData.triggerDate));
                DbObject.cvPut(contentValues, "punchInDate_c", Long.valueOf(poiMarkInfoData.punchInDate));
                DbObject.cvPut(contentValues, "triggerTimes_c", Integer.valueOf(poiMarkInfoData.triggerTimes));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static PoiMarkInfoData new_() {
        PoiMarkInfoData poiMarkInfoData = new PoiMarkInfoData();
        poiMarkInfoData.nullCheck();
        return poiMarkInfoData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PoiMarkInfoData m19716clone() {
        PoiMarkInfoData poiMarkInfoData = new PoiMarkInfoData();
        ((DbObject) poiMarkInfoData)._id = ((DbObject) this)._id;
        ((DbObject) poiMarkInfoData).id = ((DbObject) this).id;
        poiMarkInfoData.poiName = this.poiName;
        poiMarkInfoData.latitude = this.latitude;
        poiMarkInfoData.longitude = this.longitude;
        poiMarkInfoData.address = this.address;
        poiMarkInfoData.triggerDate = this.triggerDate;
        poiMarkInfoData.punchInDate = this.punchInDate;
        poiMarkInfoData.triggerTimes = this.triggerTimes;
        return poiMarkInfoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiMarkInfoData)) {
            return false;
        }
        PoiMarkInfoData poiMarkInfoData = (PoiMarkInfoData) obj;
        return super.equals(obj) && ValueObject.util_equals(this.poiName, poiMarkInfoData.poiName) && this.latitude == poiMarkInfoData.latitude && this.longitude == poiMarkInfoData.longitude && ValueObject.util_equals(this.address, poiMarkInfoData.address) && this.triggerDate == poiMarkInfoData.triggerDate && this.punchInDate == poiMarkInfoData.punchInDate && this.triggerTimes == poiMarkInfoData.triggerTimes;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.poiName;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i2 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str2 = this.address;
        int iHashCode3 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        long j = this.triggerDate;
        int i4 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.punchInDate;
        int i5 = ((i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.triggerTimes;
        ((ValueObject) this).hashCode = i5;
        return i5;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.poiName == null) {
            this.poiName = "";
        }
        if (this.address == null) {
            this.address = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
