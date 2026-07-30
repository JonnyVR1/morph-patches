package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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

/* JADX INFO: loaded from: classes12.dex */
public class SettingsBoost extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settingsboost";

    @ProtobufIndex(index = 1)
    public boolean active;

    @ProtobufIndex(index = 3)
    public long duration;

    @ProtobufIndex(index = 4)
    public double expiresTime;

    @ProtobufIndex(index = 2)
    public int multiplier;
    public static ProtobufAdapter<SettingsBoost> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingsBoost>() { // from class: com.p1.mobile.putong.data.SettingsBoost.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SettingsBoost settingsBoost) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, settingsBoost.active) + CodedOutputByteBufferNano.m17226h(2, settingsBoost.multiplier) + CodedOutputByteBufferNano.m17228j(3, settingsBoost.duration) + CodedOutputByteBufferNano.m17222d(4, settingsBoost.expiresTime);
            settingsBoost.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SettingsBoost parse(nb5 nb5Var) throws IOException {
            SettingsBoost settingsBoost = new SettingsBoost();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    settingsBoost.active = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    settingsBoost.multiplier = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    settingsBoost.duration = nb5Var.m158742k();
                } else {
                    if (iM158752u != 33) {
                        return settingsBoost;
                    }
                    settingsBoost.expiresTime = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SettingsBoost settingsBoost, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, settingsBoost.active);
            codedOutputByteBufferNano.m17250G(2, settingsBoost.multiplier);
            codedOutputByteBufferNano.m17252I(3, settingsBoost.duration);
            codedOutputByteBufferNano.m17246C(4, settingsBoost.expiresTime);
        }
    };
    public static JsonAdapter<SettingsBoost> JSON_ADAPTER = new ObjectJsonAdapter<SettingsBoost>() { // from class: com.p1.mobile.putong.data.SettingsBoost.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SettingsBoost.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SettingsBoost newInstance() {
            return new SettingsBoost();
        }

        public boolean parseField(SettingsBoost settingsBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    settingsBoost.duration = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    settingsBoost.active = jsonParser.getValueAsBoolean();
                    return true;
                case "expiresTime":
                    settingsBoost.expiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "multiplier":
                    settingsBoost.multiplier = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SettingsBoost settingsBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "active":
                case "expiresTime":
                case "multiplier":
                    return true;
                default:
                    return super.parseFieldCheck(settingsBoost, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SettingsBoost settingsBoost, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, settingsBoost.active);
            jsonGenerator.writeNumberField("multiplier", settingsBoost.multiplier);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, settingsBoost.duration);
            jsonGenerator.writeFieldName("expiresTime");
            Converter.API_TIME.serialize(Double.valueOf(settingsBoost.expiresTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingsBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingsBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SettingsBoost new_() {
        SettingsBoost settingsBoost = new SettingsBoost();
        settingsBoost.nullCheck();
        return settingsBoost;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SettingsBoost mo223809clone() {
        SettingsBoost settingsBoost = new SettingsBoost();
        settingsBoost.active = this.active;
        settingsBoost.multiplier = this.multiplier;
        settingsBoost.duration = this.duration;
        settingsBoost.expiresTime = this.expiresTime;
        return settingsBoost;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingsBoost)) {
            return false;
        }
        SettingsBoost settingsBoost = (SettingsBoost) obj;
        return this.active == settingsBoost.active && this.multiplier == settingsBoost.multiplier && this.duration == settingsBoost.duration && this.expiresTime == settingsBoost.expiresTime;
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
        int i2 = ((((i * 41) + (this.active ? 1231 : 1237)) * 41) + this.multiplier) * 41;
        long j = this.duration;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiresTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
