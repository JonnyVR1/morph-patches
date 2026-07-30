package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class FateRadar extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradar";

    @NonNull
    @ProtobufIndex(index = 4)
    public AiGreetingValue aiGreeting;

    @NonNull
    @ProtobufIndex(index = 3)
    public FateRadarGreeting greetings;

    @NonNull
    @ProtobufIndex(index = 2)
    public FateRadarSearchConditions searchConditions;

    @NonNull
    @ProtobufIndex(index = 1)
    public FateRadarSwitchStatus switchSetting;
    public static ProtobufAdapter<FateRadar> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadar>() { // from class: com.p1.mobile.putong.core.data.FateRadar.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FateRadar fateRadar) {
            FateRadarSwitchStatus fateRadarSwitchStatus = fateRadar.switchSetting;
            int iM17230l = fateRadarSwitchStatus != null ? CodedOutputByteBufferNano.m17230l(1, fateRadarSwitchStatus, FateRadarSwitchStatus.PROTOBUF_ADAPTER) : 0;
            FateRadarSearchConditions fateRadarSearchConditions = fateRadar.searchConditions;
            if (fateRadarSearchConditions != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, fateRadarSearchConditions, FateRadarSearchConditions.PROTOBUF_ADAPTER);
            }
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            if (fateRadarGreeting != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, fateRadarGreeting, FateRadarGreeting.PROTOBUF_ADAPTER);
            }
            AiGreetingValue aiGreetingValue = fateRadar.aiGreeting;
            if (aiGreetingValue != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, aiGreetingValue, AiGreetingValue.PROTOBUF_ADAPTER);
            }
            fateRadar.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FateRadar parse(nb5 nb5Var) throws IOException {
            FateRadar fateRadar = new FateRadar();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fateRadar.switchSetting == null) {
                        fateRadar.switchSetting = FateRadarSwitchStatus.new_();
                    }
                    if (fateRadar.searchConditions == null) {
                        fateRadar.searchConditions = FateRadarSearchConditions.new_();
                    }
                    if (fateRadar.greetings == null) {
                        fateRadar.greetings = FateRadarGreeting.new_();
                    }
                    if (fateRadar.aiGreeting != null) {
                        break;
                    }
                    fateRadar.aiGreeting = AiGreetingValue.new_();
                    break;
                }
                if (iM158752u == 10) {
                    fateRadar.switchSetting = (FateRadarSwitchStatus) nb5Var.m158743l(FateRadarSwitchStatus.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    fateRadar.searchConditions = (FateRadarSearchConditions) nb5Var.m158743l(FateRadarSearchConditions.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    fateRadar.greetings = (FateRadarGreeting) nb5Var.m158743l(FateRadarGreeting.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
                        if (fateRadar.switchSetting == null) {
                            fateRadar.switchSetting = FateRadarSwitchStatus.new_();
                        }
                        if (fateRadar.searchConditions == null) {
                            fateRadar.searchConditions = FateRadarSearchConditions.new_();
                        }
                        if (fateRadar.greetings == null) {
                            fateRadar.greetings = FateRadarGreeting.new_();
                        }
                        if (fateRadar.aiGreeting != null) {
                            break;
                        }
                        fateRadar.aiGreeting = AiGreetingValue.new_();
                        return fateRadar;
                    }
                    fateRadar.aiGreeting = (AiGreetingValue) nb5Var.m158743l(AiGreetingValue.PROTOBUF_ADAPTER);
                }
            }
            return fateRadar;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FateRadar fateRadar, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FateRadarSwitchStatus fateRadarSwitchStatus = fateRadar.switchSetting;
            if (fateRadarSwitchStatus != null) {
                codedOutputByteBufferNano.m17254K(1, fateRadarSwitchStatus, FateRadarSwitchStatus.PROTOBUF_ADAPTER);
            }
            FateRadarSearchConditions fateRadarSearchConditions = fateRadar.searchConditions;
            if (fateRadarSearchConditions != null) {
                codedOutputByteBufferNano.m17254K(2, fateRadarSearchConditions, FateRadarSearchConditions.PROTOBUF_ADAPTER);
            }
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            if (fateRadarGreeting != null) {
                codedOutputByteBufferNano.m17254K(3, fateRadarGreeting, FateRadarGreeting.PROTOBUF_ADAPTER);
            }
            AiGreetingValue aiGreetingValue = fateRadar.aiGreeting;
            if (aiGreetingValue != null) {
                codedOutputByteBufferNano.m17254K(4, aiGreetingValue, AiGreetingValue.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FateRadar> JSON_ADAPTER = new ObjectJsonAdapter<FateRadar>() { // from class: com.p1.mobile.putong.core.data.FateRadar.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FateRadar.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FateRadar newInstance() {
            return new FateRadar();
        }

        public boolean parseField(FateRadar fateRadar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "switchSetting":
                    fateRadar.switchSetting = FateRadarSwitchStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "searchConditions":
                    fateRadar.searchConditions = FateRadarSearchConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aiGreeting":
                    fateRadar.aiGreeting = AiGreetingValue.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "greetings":
                    fateRadar.greetings = FateRadarGreeting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FateRadar fateRadar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "switchSetting":
                case "searchConditions":
                case "aiGreeting":
                case "greetings":
                    return true;
                default:
                    return super.parseFieldCheck(fateRadar, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FateRadar fateRadar, JsonGenerator jsonGenerator) throws IOException {
            if (fateRadar.switchSetting != null) {
                jsonGenerator.writeFieldName("switchSetting");
                FateRadarSwitchStatus.JSON_ADAPTER.serialize(fateRadar.switchSetting, jsonGenerator, true);
            }
            if (fateRadar.searchConditions != null) {
                jsonGenerator.writeFieldName("searchConditions");
                FateRadarSearchConditions.JSON_ADAPTER.serialize(fateRadar.searchConditions, jsonGenerator, true);
            }
            if (fateRadar.greetings != null) {
                jsonGenerator.writeFieldName("greetings");
                FateRadarGreeting.JSON_ADAPTER.serialize(fateRadar.greetings, jsonGenerator, true);
            }
            if (fateRadar.aiGreeting != null) {
                jsonGenerator.writeFieldName("aiGreeting");
                AiGreetingValue.JSON_ADAPTER.serialize(fateRadar.aiGreeting, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadar new_() {
        FateRadar fateRadar = new FateRadar();
        fateRadar.nullCheck();
        return fateRadar;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FateRadar mo223809clone() {
        FateRadar fateRadar = new FateRadar();
        FateRadarSwitchStatus fateRadarSwitchStatus = this.switchSetting;
        if (fateRadarSwitchStatus != null) {
            fateRadar.switchSetting = fateRadarSwitchStatus.mo223809clone();
        }
        FateRadarSearchConditions fateRadarSearchConditions = this.searchConditions;
        if (fateRadarSearchConditions != null) {
            fateRadar.searchConditions = fateRadarSearchConditions.mo223809clone();
        }
        FateRadarGreeting fateRadarGreeting = this.greetings;
        if (fateRadarGreeting != null) {
            fateRadar.greetings = fateRadarGreeting.mo223809clone();
        }
        AiGreetingValue aiGreetingValue = this.aiGreeting;
        if (aiGreetingValue != null) {
            fateRadar.aiGreeting = aiGreetingValue.mo223809clone();
        }
        return fateRadar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FateRadar)) {
            return false;
        }
        FateRadar fateRadar = (FateRadar) obj;
        return ValueObject.util_equals(this.switchSetting, fateRadar.switchSetting) && ValueObject.util_equals(this.searchConditions, fateRadar.searchConditions) && ValueObject.util_equals(this.greetings, fateRadar.greetings) && ValueObject.util_equals(this.aiGreeting, fateRadar.aiGreeting);
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
        FateRadarSwitchStatus fateRadarSwitchStatus = this.switchSetting;
        int iHashCode = (i2 + (fateRadarSwitchStatus != null ? fateRadarSwitchStatus.hashCode() : 0)) * 41;
        FateRadarSearchConditions fateRadarSearchConditions = this.searchConditions;
        int iHashCode2 = (iHashCode + (fateRadarSearchConditions != null ? fateRadarSearchConditions.hashCode() : 0)) * 41;
        FateRadarGreeting fateRadarGreeting = this.greetings;
        int iHashCode3 = (iHashCode2 + (fateRadarGreeting != null ? fateRadarGreeting.hashCode() : 0)) * 41;
        AiGreetingValue aiGreetingValue = this.aiGreeting;
        int iHashCode4 = iHashCode3 + (aiGreetingValue != null ? aiGreetingValue.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.switchSetting == null) {
            this.switchSetting = FateRadarSwitchStatus.new_();
        }
        if (this.searchConditions == null) {
            this.searchConditions = FateRadarSearchConditions.new_();
        }
        if (this.greetings == null) {
            this.greetings = FateRadarGreeting.new_();
        }
        if (this.aiGreeting == null) {
            this.aiGreeting = AiGreetingValue.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
