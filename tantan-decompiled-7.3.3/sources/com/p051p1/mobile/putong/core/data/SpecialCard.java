package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SpecialCard;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class SpecialCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialcard";

    @ProtobufIndex(index = 4)
    public int actived_duration;

    @NonNull
    @ProtobufIndex(index = 2)
    public DeviceType device_OS;

    @NonNull
    @ProtobufIndex(index = 1)
    public SpecialCardGender gender;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Double> interval_day;

    @ProtobufIndex(index = 6)
    public int interval_hour_cycle_mode;

    @ProtobufIndex(index = 8)
    public int num_limited_left;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> signup_country;

    @ProtobufIndex(index = 7)
    public int swipe_wright_time;

    @ProtobufIndex(index = 9)
    public int version;
    public static ProtobufAdapter<SpecialCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialCard>() { // from class: com.p1.mobile.putong.core.data.SpecialCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpecialCard specialCard) {
            SpecialCardGender specialCardGender = specialCard.gender;
            int iM17281h = specialCardGender != null ? CodedOutputByteBufferNano.m17281h(1, specialCardGender.ordinal()) : 0;
            DeviceType deviceType = specialCard.device_OS;
            if (deviceType != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(2, deviceType.ordinal());
            }
            List<Integer> list = specialCard.signup_country;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(4, specialCard.actived_duration);
            List<Double> list2 = specialCard.interval_day;
            if (list2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(5, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h3 = iM17281h2 + CodedOutputByteBufferNano.m17281h(6, specialCard.interval_hour_cycle_mode) + CodedOutputByteBufferNano.m17281h(7, specialCard.swipe_wright_time) + CodedOutputByteBufferNano.m17281h(8, specialCard.num_limited_left) + CodedOutputByteBufferNano.m17281h(9, specialCard.version);
            SpecialCardGender specialCardGender2 = specialCard.gender;
            if (specialCardGender2 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(10, specialCardGender2, SpecialCardGender.PROTOBUF_ADAPTER);
            }
            DeviceType deviceType2 = specialCard.device_OS;
            if (deviceType2 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(11, deviceType2, DeviceType.PROTOBUF_ADAPTER);
            }
            specialCard.cachedSize = iM17281h3;
            return iM17281h3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpecialCard parse(nc5 nc5Var) throws IOException {
            SpecialCard specialCard = new SpecialCard();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (specialCard.gender == null && numValueOf != null) {
                            specialCard.gender = (SpecialCardGender) SpecialCardGender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (specialCard.device_OS == null && numValueOf2 != null) {
                            specialCard.device_OS = (DeviceType) DeviceType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (specialCard.gender == null) {
                            specialCard.gender = (SpecialCardGender) SpecialCardGender.JSON_ADAPTER.defaultEnum();
                        }
                        if (specialCard.device_OS == null) {
                            specialCard.device_OS = (DeviceType) DeviceType.JSON_ADAPTER.defaultEnum();
                        }
                        if (specialCard.signup_country == null) {
                            specialCard.signup_country = new ArrayList();
                        }
                        if (specialCard.interval_day == null) {
                            specialCard.interval_day = new ArrayList();
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 16:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 26:
                        specialCard.signup_country = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 32:
                        specialCard.actived_duration = nc5Var.m162486j();
                        continue;
                    case 42:
                        specialCard.interval_day = (List) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 48:
                        specialCard.interval_hour_cycle_mode = nc5Var.m162486j();
                        continue;
                    case 56:
                        specialCard.swipe_wright_time = nc5Var.m162486j();
                        continue;
                    case 64:
                        specialCard.num_limited_left = nc5Var.m162486j();
                        continue;
                    case 72:
                        specialCard.version = nc5Var.m162486j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        specialCard.gender = (SpecialCardGender) nc5Var.m162488l(SpecialCardGender.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        specialCard.device_OS = (DeviceType) nc5Var.m162488l(DeviceType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (specialCard.gender == null && numValueOf != null) {
                            specialCard.gender = (SpecialCardGender) SpecialCardGender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (specialCard.device_OS == null && numValueOf2 != null) {
                            specialCard.device_OS = (DeviceType) DeviceType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (specialCard.gender == null) {
                            specialCard.gender = (SpecialCardGender) SpecialCardGender.JSON_ADAPTER.defaultEnum();
                        }
                        if (specialCard.device_OS == null) {
                            specialCard.device_OS = (DeviceType) DeviceType.JSON_ADAPTER.defaultEnum();
                        }
                        if (specialCard.signup_country == null) {
                            specialCard.signup_country = new ArrayList();
                        }
                        if (specialCard.interval_day == null) {
                            specialCard.interval_day = new ArrayList();
                            return specialCard;
                        }
                        break;
                }
            }
            return specialCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpecialCard specialCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SpecialCardGender specialCardGender = specialCard.gender;
            if (specialCardGender != null) {
                codedOutputByteBufferNano.m17305G(1, specialCardGender.ordinal());
            }
            DeviceType deviceType = specialCard.device_OS;
            if (deviceType != null) {
                codedOutputByteBufferNano.m17305G(2, deviceType.ordinal());
            }
            List<Integer> list = specialCard.signup_country;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(4, specialCard.actived_duration);
            List<Double> list2 = specialCard.interval_day;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(5, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(6, specialCard.interval_hour_cycle_mode);
            codedOutputByteBufferNano.m17305G(7, specialCard.swipe_wright_time);
            codedOutputByteBufferNano.m17305G(8, specialCard.num_limited_left);
            codedOutputByteBufferNano.m17305G(9, specialCard.version);
            SpecialCardGender specialCardGender2 = specialCard.gender;
            if (specialCardGender2 != null) {
                codedOutputByteBufferNano.m17309K(10, specialCardGender2, SpecialCardGender.PROTOBUF_ADAPTER);
            }
            DeviceType deviceType2 = specialCard.device_OS;
            if (deviceType2 != null) {
                codedOutputByteBufferNano.m17309K(11, deviceType2, DeviceType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SpecialCard> JSON_ADAPTER = new ObjectJsonAdapter<SpecialCard>() { // from class: com.p1.mobile.putong.core.data.SpecialCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpecialCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpecialCard newInstance() {
            return new SpecialCard();
        }

        public boolean parseField(SpecialCard specialCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "swipe_wright_time":
                    specialCard.swipe_wright_time = jsonParser.getValueAsInt();
                    return true;
                case "interval_day":
                    specialCard.interval_day = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "signup_country":
                    specialCard.signup_country = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "actived_duration":
                    specialCard.actived_duration = jsonParser.getValueAsInt();
                    return true;
                case "gender":
                    specialCard.gender = SpecialCardGender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "device_OS":
                    specialCard.device_OS = DeviceType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "version":
                    specialCard.version = jsonParser.getValueAsInt();
                    return true;
                case "interval_hour_cycle_mode":
                    specialCard.interval_hour_cycle_mode = jsonParser.getValueAsInt();
                    return true;
                case "num_limited_left":
                    specialCard.num_limited_left = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpecialCard specialCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "swipe_wright_time":
                case "interval_day":
                case "signup_country":
                case "actived_duration":
                case "gender":
                case "device_OS":
                case "version":
                case "interval_hour_cycle_mode":
                case "num_limited_left":
                    return true;
                default:
                    return super.parseFieldCheck(specialCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpecialCard specialCard, JsonGenerator jsonGenerator) throws IOException {
            if (specialCard.gender != null) {
                jsonGenerator.writeFieldName("gender");
                SpecialCardGender.JSON_ADAPTER.serialize(specialCard.gender, jsonGenerator, true);
            }
            if (specialCard.device_OS != null) {
                jsonGenerator.writeFieldName("device_OS");
                DeviceType.JSON_ADAPTER.serialize(specialCard.device_OS, jsonGenerator, true);
            }
            if (specialCard.signup_country != null) {
                jsonGenerator.writeFieldName("signup_country");
                JsonAdapter.serializeArray(specialCard.signup_country, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("actived_duration", specialCard.actived_duration);
            if (specialCard.interval_day != null) {
                jsonGenerator.writeFieldName("interval_day");
                JsonAdapter.serializeArray(specialCard.interval_day, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("interval_hour_cycle_mode", specialCard.interval_hour_cycle_mode);
            jsonGenerator.writeNumberField("swipe_wright_time", specialCard.swipe_wright_time);
            jsonGenerator.writeNumberField("num_limited_left", specialCard.num_limited_left);
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, specialCard.version);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m36850a(Double d) {
        return d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m36851b(Integer num) {
        return num;
    }

    public static SpecialCard new_() {
        SpecialCard specialCard = new SpecialCard();
        specialCard.nullCheck();
        return specialCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpecialCard mo225055clone() {
        SpecialCard specialCard = new SpecialCard();
        specialCard.gender = this.gender;
        specialCard.device_OS = this.device_OS;
        List<Integer> list = this.signup_country;
        if (list != null) {
            specialCard.signup_country = ValueObject.util_map(list, new qcj() { // from class: l.mvf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return SpecialCard.m36851b((Integer) obj);
                }
            });
        }
        specialCard.actived_duration = this.actived_duration;
        List<Double> list2 = this.interval_day;
        if (list2 != null) {
            specialCard.interval_day = ValueObject.util_map(list2, new qcj() { // from class: l.nvf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return SpecialCard.m36850a((Double) obj);
                }
            });
        }
        specialCard.interval_hour_cycle_mode = this.interval_hour_cycle_mode;
        specialCard.swipe_wright_time = this.swipe_wright_time;
        specialCard.num_limited_left = this.num_limited_left;
        specialCard.version = this.version;
        return specialCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialCard)) {
            return false;
        }
        SpecialCard specialCard = (SpecialCard) obj;
        return ValueObject.util_equals(this.gender, specialCard.gender) && ValueObject.util_equals(this.device_OS, specialCard.device_OS) && ValueObject.util_equals(this.signup_country, specialCard.signup_country) && this.actived_duration == specialCard.actived_duration && ValueObject.util_equals(this.interval_day, specialCard.interval_day) && this.interval_hour_cycle_mode == specialCard.interval_hour_cycle_mode && this.swipe_wright_time == specialCard.swipe_wright_time && this.num_limited_left == specialCard.num_limited_left && this.version == specialCard.version;
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
        SpecialCardGender specialCardGender = this.gender;
        int iHashCode = (i2 + (specialCardGender != null ? specialCardGender.hashCode() : 0)) * 41;
        DeviceType deviceType = this.device_OS;
        int iHashCode2 = (iHashCode + (deviceType != null ? deviceType.hashCode() : 0)) * 41;
        List<Integer> list = this.signup_country;
        int iHashCode3 = (((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.actived_duration) * 41;
        List<Double> list2 = this.interval_day;
        int iHashCode4 = ((((((((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.interval_hour_cycle_mode) * 41) + this.swipe_wright_time) * 41) + this.num_limited_left) * 41) + this.version;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gender == null) {
            this.gender = (SpecialCardGender) SpecialCardGender.JSON_ADAPTER.defaultEnum();
        }
        if (this.device_OS == null) {
            this.device_OS = (DeviceType) DeviceType.JSON_ADAPTER.defaultEnum();
        }
        if (this.signup_country == null) {
            this.signup_country = new ArrayList();
        }
        if (this.interval_day == null) {
            this.interval_day = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
