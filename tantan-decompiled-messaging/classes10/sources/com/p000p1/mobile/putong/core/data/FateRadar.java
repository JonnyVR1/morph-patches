package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FateRadar extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradar";

    @NonNull
    @ProtobufIndex(index = 4)
    public AiGreetingValue aiGreeting;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public FateRadarGreeting greetings;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public FateRadarSearchConditions searchConditions;

    @NonNull
    @ProtobufIndex(index = 1)
    public FateRadarSwitchStatus switchSetting;
    public static ProtobufAdapter<FateRadar> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadar>() { // from class: com.p1.mobile.putong.core.data.FateRadar.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FateRadar fateRadar) {
            FateRadarSwitchStatus fateRadarSwitchStatus = fateRadar.switchSetting;
            int iL = fateRadarSwitchStatus != null ? CodedOutputByteBufferNano.l(1, fateRadarSwitchStatus, FateRadarSwitchStatus.PROTOBUF_ADAPTER) : 0;
            FateRadarSearchConditions fateRadarSearchConditions = fateRadar.searchConditions;
            if (fateRadarSearchConditions != null) {
                iL += CodedOutputByteBufferNano.l(2, fateRadarSearchConditions, FateRadarSearchConditions.PROTOBUF_ADAPTER);
            }
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            if (fateRadarGreeting != null) {
                iL += CodedOutputByteBufferNano.l(3, fateRadarGreeting, FateRadarGreeting.PROTOBUF_ADAPTER);
            }
            AiGreetingValue aiGreetingValue = fateRadar.aiGreeting;
            if (aiGreetingValue != null) {
                iL += CodedOutputByteBufferNano.l(4, aiGreetingValue, AiGreetingValue.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fateRadar).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FateRadar m12741parse(nb5 nb5Var) throws IOException {
            FateRadar fateRadar = new FateRadar();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    fateRadar.switchSetting = (FateRadarSwitchStatus) nb5Var.l(FateRadarSwitchStatus.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    fateRadar.searchConditions = (FateRadarSearchConditions) nb5Var.l(FateRadarSearchConditions.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    fateRadar.greetings = (FateRadarGreeting) nb5Var.l(FateRadarGreeting.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
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
                    fateRadar.aiGreeting = (AiGreetingValue) nb5Var.l(AiGreetingValue.PROTOBUF_ADAPTER);
                }
            }
            return fateRadar;
        }

        public void serialize(FateRadar fateRadar, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            FateRadarSwitchStatus fateRadarSwitchStatus = fateRadar.switchSetting;
            if (fateRadarSwitchStatus != null) {
                codedOutputByteBufferNano.K(1, fateRadarSwitchStatus, FateRadarSwitchStatus.PROTOBUF_ADAPTER);
            }
            FateRadarSearchConditions fateRadarSearchConditions = fateRadar.searchConditions;
            if (fateRadarSearchConditions != null) {
                codedOutputByteBufferNano.K(2, fateRadarSearchConditions, FateRadarSearchConditions.PROTOBUF_ADAPTER);
            }
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            if (fateRadarGreeting != null) {
                codedOutputByteBufferNano.K(3, fateRadarGreeting, FateRadarGreeting.PROTOBUF_ADAPTER);
            }
            AiGreetingValue aiGreetingValue = fateRadar.aiGreeting;
            if (aiGreetingValue != null) {
                codedOutputByteBufferNano.K(4, aiGreetingValue, AiGreetingValue.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FateRadar> JSON_ADAPTER = new ObjectJsonAdapter<FateRadar>() { // from class: com.p1.mobile.putong.core.data.FateRadar.2
        public Class getDataClass() {
            return FateRadar.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FateRadar m12742newInstance() {
            return new FateRadar();
        }

        public boolean parseField(FateRadar fateRadar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "switchSetting":
                    fateRadar.switchSetting = (FateRadarSwitchStatus) FateRadarSwitchStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "searchConditions":
                    fateRadar.searchConditions = (FateRadarSearchConditions) FateRadarSearchConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "aiGreeting":
                    fateRadar.aiGreeting = (AiGreetingValue) AiGreetingValue.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "greetings":
                    fateRadar.greetings = (FateRadarGreeting) FateRadarGreeting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadar new_() {
        FateRadar fateRadar = new FateRadar();
        fateRadar.nullCheck();
        return fateRadar;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FateRadar m12740clone() {
        FateRadar fateRadar = new FateRadar();
        FateRadarSwitchStatus fateRadarSwitchStatus = this.switchSetting;
        if (fateRadarSwitchStatus != null) {
            fateRadar.switchSetting = fateRadarSwitchStatus.m12752clone();
        }
        FateRadarSearchConditions fateRadarSearchConditions = this.searchConditions;
        if (fateRadarSearchConditions != null) {
            fateRadar.searchConditions = fateRadarSearchConditions.m12748clone();
        }
        FateRadarGreeting fateRadarGreeting = this.greetings;
        if (fateRadarGreeting != null) {
            fateRadar.greetings = fateRadarGreeting.m12744clone();
        }
        AiGreetingValue aiGreetingValue = this.aiGreeting;
        if (aiGreetingValue != null) {
            fateRadar.aiGreeting = aiGreetingValue.m11600clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
