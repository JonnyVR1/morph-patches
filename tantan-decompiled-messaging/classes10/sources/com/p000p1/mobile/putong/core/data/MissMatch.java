package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MissMatch;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MissMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "missmatch";

    @ProtobufIndex(index = 1)
    public double actived_duration;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Double> interval_day;

    @ProtobufIndex(index = 4)
    public int num_limited_left;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int swipe_left_time;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int version;
    public static ProtobufAdapter<MissMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<MissMatch>() { // from class: com.p1.mobile.putong.core.data.MissMatch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MissMatch missMatch) {
            int iD = CodedOutputByteBufferNano.d(1, missMatch.actived_duration);
            List<Double> list = missMatch.interval_day;
            if (list != null) {
                iD += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iD + CodedOutputByteBufferNano.h(3, missMatch.swipe_left_time) + CodedOutputByteBufferNano.h(4, missMatch.num_limited_left) + CodedOutputByteBufferNano.h(5, missMatch.version);
            ((MessageNano) missMatch).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MissMatch m14327parse(nb5 nb5Var) throws IOException {
            MissMatch missMatch = new MissMatch();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (missMatch.interval_day != null) {
                        break;
                    }
                    missMatch.interval_day = new ArrayList();
                    break;
                }
                if (iU == 9) {
                    missMatch.actived_duration = nb5Var.h();
                } else if (iU == 18) {
                    missMatch.interval_day = (List) nb5Var.l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    missMatch.swipe_left_time = nb5Var.j();
                } else if (iU == 32) {
                    missMatch.num_limited_left = nb5Var.j();
                } else {
                    if (iU != 40) {
                        if (missMatch.interval_day != null) {
                            break;
                        }
                        missMatch.interval_day = new ArrayList();
                        return missMatch;
                    }
                    missMatch.version = nb5Var.j();
                }
            }
            return missMatch;
        }

        public void serialize(MissMatch missMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, missMatch.actived_duration);
            List<Double> list = missMatch.interval_day;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, missMatch.swipe_left_time);
            codedOutputByteBufferNano.G(4, missMatch.num_limited_left);
            codedOutputByteBufferNano.G(5, missMatch.version);
        }
    };
    public static JsonAdapter<MissMatch> JSON_ADAPTER = new ObjectJsonAdapter<MissMatch>() { // from class: com.p1.mobile.putong.core.data.MissMatch.2
        public Class getDataClass() {
            return MissMatch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MissMatch m14328newInstance() {
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

        public void serializeFields(MissMatch missMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("actived_duration", missMatch.actived_duration);
            if (missMatch.interval_day != null) {
                jsonGenerator.writeFieldName("interval_day");
                JsonAdapter.serializeArray(missMatch.interval_day, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("swipe_left_time", missMatch.swipe_left_time);
            jsonGenerator.writeNumberField("num_limited_left", missMatch.num_limited_left);
            jsonGenerator.writeNumberField("version", missMatch.version);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MissMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MissMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m492a(Double d) {
        return d;
    }

    public static MissMatch new_() {
        MissMatch missMatch = new MissMatch();
        missMatch.nullCheck();
        return missMatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MissMatch m14326clone() {
        MissMatch missMatch = new MissMatch();
        missMatch.actived_duration = this.actived_duration;
        List<Double> list = this.interval_day;
        if (list != null) {
            missMatch.interval_day = ValueObject.util_map(list, new w9j() { // from class: l.g300
                public final Object call(Object obj) {
                    return MissMatch.m492a((Double) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.actived_duration);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        List<Double> list = this.interval_day;
        int iHashCode = ((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.swipe_left_time) * 41) + this.num_limited_left) * 41) + this.version;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.interval_day == null) {
            this.interval_day = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
