package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RateAlertSetting;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class RateAlertSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ratealertsetting";

    @ProtobufIndex(index = 1)
    public int activeDays;

    @ProtobufIndex(index = 4)
    public int appOpenTimes;

    @ProtobufIndex(index = 7)
    public int profilePictures;

    @ProtobufIndex(index = 2)
    public int receivedMessages;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<List<Integer>> registerDays;

    @ProtobufIndex(index = 3)
    public int sentMessages;

    @ProtobufIndex(index = 5)
    public int useMinutes;
    public static ProtobufAdapter<RateAlertSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<RateAlertSetting>() { // from class: com.p1.mobile.putong.core.data.RateAlertSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RateAlertSetting rateAlertSetting) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, rateAlertSetting.activeDays) + CodedOutputByteBufferNano.m17226h(2, rateAlertSetting.receivedMessages) + CodedOutputByteBufferNano.m17226h(3, rateAlertSetting.sentMessages) + CodedOutputByteBufferNano.m17226h(4, rateAlertSetting.appOpenTimes) + CodedOutputByteBufferNano.m17226h(5, rateAlertSetting.useMinutes);
            List<List<Integer>> list = rateAlertSetting.registerDays;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(7, rateAlertSetting.profilePictures);
            rateAlertSetting.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RateAlertSetting parse(nb5 nb5Var) throws IOException {
            RateAlertSetting rateAlertSetting = new RateAlertSetting();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    rateAlertSetting.activeDays = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    rateAlertSetting.receivedMessages = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    rateAlertSetting.sentMessages = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    rateAlertSetting.appOpenTimes = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    rateAlertSetting.useMinutes = nb5Var.m158741j();
                } else if (iM158752u == 50) {
                    rateAlertSetting.registerDays = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 56) {
                        return rateAlertSetting;
                    }
                    rateAlertSetting.profilePictures = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RateAlertSetting rateAlertSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, rateAlertSetting.activeDays);
            codedOutputByteBufferNano.m17250G(2, rateAlertSetting.receivedMessages);
            codedOutputByteBufferNano.m17250G(3, rateAlertSetting.sentMessages);
            codedOutputByteBufferNano.m17250G(4, rateAlertSetting.appOpenTimes);
            codedOutputByteBufferNano.m17250G(5, rateAlertSetting.useMinutes);
            List<List<Integer>> list = rateAlertSetting.registerDays;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(7, rateAlertSetting.profilePictures);
        }
    };
    public static JsonAdapter<RateAlertSetting> JSON_ADAPTER = new ObjectJsonAdapter<RateAlertSetting>() { // from class: com.p1.mobile.putong.core.data.RateAlertSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RateAlertSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RateAlertSetting newInstance() {
            return new RateAlertSetting();
        }

        public boolean parseField(RateAlertSetting rateAlertSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "registerDays":
                    rateAlertSetting.registerDays = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER(), str2, arrayList, dataChecker);
                    return true;
                case "appOpenTimes":
                    rateAlertSetting.appOpenTimes = jsonParser.getValueAsInt();
                    return true;
                case "profilePictures":
                    rateAlertSetting.profilePictures = jsonParser.getValueAsInt();
                    return true;
                case "useMinutes":
                    rateAlertSetting.useMinutes = jsonParser.getValueAsInt();
                    return true;
                case "sentMessages":
                    rateAlertSetting.sentMessages = jsonParser.getValueAsInt();
                    return true;
                case "receivedMessages":
                    rateAlertSetting.receivedMessages = jsonParser.getValueAsInt();
                    return true;
                case "activeDays":
                    rateAlertSetting.activeDays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RateAlertSetting rateAlertSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "registerDays":
                case "appOpenTimes":
                case "profilePictures":
                case "useMinutes":
                case "sentMessages":
                case "receivedMessages":
                case "activeDays":
                    return true;
                default:
                    return super.parseFieldCheck(rateAlertSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RateAlertSetting rateAlertSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("activeDays", rateAlertSetting.activeDays);
            jsonGenerator.writeNumberField("receivedMessages", rateAlertSetting.receivedMessages);
            jsonGenerator.writeNumberField("sentMessages", rateAlertSetting.sentMessages);
            jsonGenerator.writeNumberField("appOpenTimes", rateAlertSetting.appOpenTimes);
            jsonGenerator.writeNumberField("useMinutes", rateAlertSetting.useMinutes);
            if (rateAlertSetting.registerDays != null) {
                jsonGenerator.writeFieldName("registerDays");
                JsonAdapter.serializeArray(rateAlertSetting.registerDays, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            jsonGenerator.writeNumberField("profilePictures", rateAlertSetting.profilePictures);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RateAlertSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RateAlertSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35809a(Integer num) {
        return num;
    }

    public static RateAlertSetting new_() {
        RateAlertSetting rateAlertSetting = new RateAlertSetting();
        rateAlertSetting.nullCheck();
        return rateAlertSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RateAlertSetting mo223809clone() {
        RateAlertSetting rateAlertSetting = new RateAlertSetting();
        rateAlertSetting.activeDays = this.activeDays;
        rateAlertSetting.receivedMessages = this.receivedMessages;
        rateAlertSetting.sentMessages = this.sentMessages;
        rateAlertSetting.appOpenTimes = this.appOpenTimes;
        rateAlertSetting.useMinutes = this.useMinutes;
        List<List<Integer>> list = this.registerDays;
        if (list != null) {
            rateAlertSetting.registerDays = ValueObject.util_map(list, new w9j() { // from class: l.ucc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new w9j() { // from class: l.tcc0
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return RateAlertSetting.m35809a((Integer) obj2);
                        }
                    });
                }
            });
        }
        rateAlertSetting.profilePictures = this.profilePictures;
        return rateAlertSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RateAlertSetting)) {
            return false;
        }
        RateAlertSetting rateAlertSetting = (RateAlertSetting) obj;
        return this.activeDays == rateAlertSetting.activeDays && this.receivedMessages == rateAlertSetting.receivedMessages && this.sentMessages == rateAlertSetting.sentMessages && this.appOpenTimes == rateAlertSetting.appOpenTimes && this.useMinutes == rateAlertSetting.useMinutes && ValueObject.util_equals(this.registerDays, rateAlertSetting.registerDays) && this.profilePictures == rateAlertSetting.profilePictures;
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
        int i2 = ((((((((((i * 41) + this.activeDays) * 41) + this.receivedMessages) * 41) + this.sentMessages) * 41) + this.appOpenTimes) * 41) + this.useMinutes) * 41;
        List<List<Integer>> list = this.registerDays;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.profilePictures;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
