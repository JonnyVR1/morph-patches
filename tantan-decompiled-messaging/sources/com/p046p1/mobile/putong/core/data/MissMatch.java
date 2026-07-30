package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MissMatch;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MissMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "missmatch";

    @ProtobufIndex(index = 1)
    public double actived_duration;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Double> interval_day;

    @ProtobufIndex(index = 4)
    public int num_limited_left;

    @ProtobufIndex(index = 3)
    public int swipe_left_time;

    @ProtobufIndex(index = 5)
    public int version;
    public static ProtobufAdapter<MissMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<MissMatch>() { // from class: com.p1.mobile.putong.core.data.MissMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MissMatch missMatch) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, missMatch.actived_duration);
            List<Double> list = missMatch.interval_day;
            if (list != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17222d + CodedOutputByteBufferNano.m17226h(3, missMatch.swipe_left_time) + CodedOutputByteBufferNano.m17226h(4, missMatch.num_limited_left) + CodedOutputByteBufferNano.m17226h(5, missMatch.version);
            missMatch.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MissMatch parse(nb5 nb5Var) throws IOException {
            MissMatch missMatch = new MissMatch();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (missMatch.interval_day != null) {
                        break;
                    }
                    missMatch.interval_day = new ArrayList();
                    break;
                }
                if (iM158752u == 9) {
                    missMatch.actived_duration = nb5Var.m158739h();
                } else if (iM158752u == 18) {
                    missMatch.interval_day = (List) nb5Var.m158743l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 24) {
                    missMatch.swipe_left_time = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    missMatch.num_limited_left = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        if (missMatch.interval_day != null) {
                            break;
                        }
                        missMatch.interval_day = new ArrayList();
                        return missMatch;
                    }
                    missMatch.version = nb5Var.m158741j();
                }
            }
            return missMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MissMatch missMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, missMatch.actived_duration);
            List<Double> list = missMatch.interval_day;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(3, missMatch.swipe_left_time);
            codedOutputByteBufferNano.m17250G(4, missMatch.num_limited_left);
            codedOutputByteBufferNano.m17250G(5, missMatch.version);
        }
    };
    public static JsonAdapter<MissMatch> JSON_ADAPTER = new ObjectJsonAdapter<MissMatch>() { // from class: com.p1.mobile.putong.core.data.MissMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MissMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MissMatch newInstance() {
            return new MissMatch();
        }

        public boolean parseField(MissMatch missMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interval_day":
                    missMatch.interval_day = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "actived_duration":
                    missMatch.actived_duration = jsonParser.getValueAsDouble();
                    return true;
                case "version":
                    missMatch.version = jsonParser.getValueAsInt();
                    return true;
                case "swipe_left_time":
                    missMatch.swipe_left_time = jsonParser.getValueAsInt();
                    return true;
                case "num_limited_left":
                    missMatch.num_limited_left = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MissMatch missMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "interval_day":
                case "actived_duration":
                case "version":
                case "swipe_left_time":
                case "num_limited_left":
                    return true;
                default:
                    return super.parseFieldCheck(missMatch, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MissMatch missMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("actived_duration", missMatch.actived_duration);
            if (missMatch.interval_day != null) {
                jsonGenerator.writeFieldName("interval_day");
                JsonAdapter.serializeArray(missMatch.interval_day, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("swipe_left_time", missMatch.swipe_left_time);
            jsonGenerator.writeNumberField("num_limited_left", missMatch.num_limited_left);
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, missMatch.version);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MissMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MissMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m35690a(Double d) {
        return d;
    }

    public static MissMatch new_() {
        MissMatch missMatch = new MissMatch();
        missMatch.nullCheck();
        return missMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MissMatch mo223809clone() {
        MissMatch missMatch = new MissMatch();
        missMatch.actived_duration = this.actived_duration;
        List<Double> list = this.interval_day;
        if (list != null) {
            missMatch.interval_day = ValueObject.util_map(list, new w9j() { // from class: l.g300
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MissMatch.m35690a((Double) obj);
                }
            });
        }
        missMatch.swipe_left_time = this.swipe_left_time;
        missMatch.num_limited_left = this.num_limited_left;
        missMatch.version = this.version;
        return missMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MissMatch)) {
            return false;
        }
        MissMatch missMatch = (MissMatch) obj;
        return this.actived_duration == missMatch.actived_duration && ValueObject.util_equals(this.interval_day, missMatch.interval_day) && this.swipe_left_time == missMatch.swipe_left_time && this.num_limited_left == missMatch.num_limited_left && this.version == missMatch.version;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.actived_duration);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        List<Double> list = this.interval_day;
        int iHashCode = ((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.swipe_left_time) * 41) + this.num_limited_left) * 41) + this.version;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.interval_day == null) {
            this.interval_day = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
