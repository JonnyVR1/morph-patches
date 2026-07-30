package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class DiamondVIPPrivilegeSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "diamondvipprivilegesettings";

    @NonNull
    @ProtobufIndex(index = 3)
    @Deprecated
    public DiamondVIPBoostType boostMode;

    @ProtobufIndex(index = 1)
    @Deprecated
    public long expiredTime;

    @ProtobufIndex(index = 4)
    @Deprecated
    public boolean mysterySwipe;

    @ProtobufIndex(index = 5)
    @Deprecated
    public boolean showQualityIdentity;

    @ProtobufIndex(index = 2)
    @Deprecated
    public long trialExpiredTime;
    public static ProtobufAdapter<DiamondVIPPrivilegeSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<DiamondVIPPrivilegeSettings>() { // from class: com.p1.mobile.putong.data.DiamondVIPPrivilegeSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, diamondVIPPrivilegeSettings.expiredTime) + CodedOutputByteBufferNano.m17283j(2, diamondVIPPrivilegeSettings.trialExpiredTime);
            DiamondVIPBoostType diamondVIPBoostType = diamondVIPPrivilegeSettings.boostMode;
            if (diamondVIPBoostType != null) {
                iM17283j += CodedOutputByteBufferNano.m17281h(3, diamondVIPBoostType.ordinal());
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(4, diamondVIPPrivilegeSettings.mysterySwipe) + CodedOutputByteBufferNano.m17275b(5, diamondVIPPrivilegeSettings.showQualityIdentity);
            DiamondVIPBoostType diamondVIPBoostType2 = diamondVIPPrivilegeSettings.boostMode;
            if (diamondVIPBoostType2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, diamondVIPBoostType2, DiamondVIPBoostType.PROTOBUF_ADAPTER);
            }
            diamondVIPPrivilegeSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DiamondVIPPrivilegeSettings parse(nc5 nc5Var) throws IOException {
            DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = new DiamondVIPPrivilegeSettings();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (diamondVIPPrivilegeSettings.boostMode == null && numValueOf != null) {
                        diamondVIPPrivilegeSettings.boostMode = (DiamondVIPBoostType) DiamondVIPBoostType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (diamondVIPPrivilegeSettings.boostMode != null) {
                        break;
                    }
                    diamondVIPPrivilegeSettings.boostMode = (DiamondVIPBoostType) DiamondVIPBoostType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    diamondVIPPrivilegeSettings.expiredTime = nc5Var.m162487k();
                } else if (iM162497u == 16) {
                    diamondVIPPrivilegeSettings.trialExpiredTime = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 32) {
                    diamondVIPPrivilegeSettings.mysterySwipe = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    diamondVIPPrivilegeSettings.showQualityIdentity = nc5Var.m162483g();
                } else {
                    if (iM162497u != 50) {
                        if (diamondVIPPrivilegeSettings.boostMode == null && numValueOf != null) {
                            diamondVIPPrivilegeSettings.boostMode = (DiamondVIPBoostType) DiamondVIPBoostType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (diamondVIPPrivilegeSettings.boostMode != null) {
                            break;
                        }
                        diamondVIPPrivilegeSettings.boostMode = (DiamondVIPBoostType) DiamondVIPBoostType.JSON_ADAPTER.defaultEnum();
                        return diamondVIPPrivilegeSettings;
                    }
                    diamondVIPPrivilegeSettings.boostMode = (DiamondVIPBoostType) nc5Var.m162488l(DiamondVIPBoostType.PROTOBUF_ADAPTER);
                }
            }
            return diamondVIPPrivilegeSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, diamondVIPPrivilegeSettings.expiredTime);
            codedOutputByteBufferNano.m17307I(2, diamondVIPPrivilegeSettings.trialExpiredTime);
            DiamondVIPBoostType diamondVIPBoostType = diamondVIPPrivilegeSettings.boostMode;
            if (diamondVIPBoostType != null) {
                codedOutputByteBufferNano.m17305G(3, diamondVIPBoostType.ordinal());
            }
            codedOutputByteBufferNano.m17299A(4, diamondVIPPrivilegeSettings.mysterySwipe);
            codedOutputByteBufferNano.m17299A(5, diamondVIPPrivilegeSettings.showQualityIdentity);
            DiamondVIPBoostType diamondVIPBoostType2 = diamondVIPPrivilegeSettings.boostMode;
            if (diamondVIPBoostType2 != null) {
                codedOutputByteBufferNano.m17309K(6, diamondVIPBoostType2, DiamondVIPBoostType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<DiamondVIPPrivilegeSettings> JSON_ADAPTER = new ObjectJsonAdapter<DiamondVIPPrivilegeSettings>() { // from class: com.p1.mobile.putong.data.DiamondVIPPrivilegeSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DiamondVIPPrivilegeSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DiamondVIPPrivilegeSettings newInstance() {
            return new DiamondVIPPrivilegeSettings();
        }

        public boolean parseField(DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "boostMode":
                    diamondVIPPrivilegeSettings.boostMode = DiamondVIPBoostType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "trialExpiredTime":
                    diamondVIPPrivilegeSettings.trialExpiredTime = jsonParser.getValueAsLong();
                    return true;
                case "mysterySwipe":
                    diamondVIPPrivilegeSettings.mysterySwipe = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTime":
                    diamondVIPPrivilegeSettings.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "showQualityIdentity":
                    diamondVIPPrivilegeSettings.showQualityIdentity = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "boostMode":
                case "trialExpiredTime":
                case "mysterySwipe":
                case "expiredTime":
                case "showQualityIdentity":
                    return true;
                default:
                    return super.parseFieldCheck(diamondVIPPrivilegeSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiredTime", diamondVIPPrivilegeSettings.expiredTime);
            jsonGenerator.writeNumberField("trialExpiredTime", diamondVIPPrivilegeSettings.trialExpiredTime);
            if (diamondVIPPrivilegeSettings.boostMode != null) {
                jsonGenerator.writeFieldName("boostMode");
                DiamondVIPBoostType.JSON_ADAPTER.serialize(diamondVIPPrivilegeSettings.boostMode, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("mysterySwipe", diamondVIPPrivilegeSettings.mysterySwipe);
            jsonGenerator.writeBooleanField("showQualityIdentity", diamondVIPPrivilegeSettings.showQualityIdentity);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DiamondVIPPrivilegeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DiamondVIPPrivilegeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DiamondVIPPrivilegeSettings new_() {
        DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = new DiamondVIPPrivilegeSettings();
        diamondVIPPrivilegeSettings.nullCheck();
        return diamondVIPPrivilegeSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DiamondVIPPrivilegeSettings mo225055clone() {
        DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = new DiamondVIPPrivilegeSettings();
        diamondVIPPrivilegeSettings.expiredTime = this.expiredTime;
        diamondVIPPrivilegeSettings.trialExpiredTime = this.trialExpiredTime;
        diamondVIPPrivilegeSettings.boostMode = this.boostMode;
        diamondVIPPrivilegeSettings.mysterySwipe = this.mysterySwipe;
        diamondVIPPrivilegeSettings.showQualityIdentity = this.showQualityIdentity;
        return diamondVIPPrivilegeSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiamondVIPPrivilegeSettings)) {
            return false;
        }
        DiamondVIPPrivilegeSettings diamondVIPPrivilegeSettings = (DiamondVIPPrivilegeSettings) obj;
        return this.expiredTime == diamondVIPPrivilegeSettings.expiredTime && this.trialExpiredTime == diamondVIPPrivilegeSettings.trialExpiredTime && ValueObject.util_equals(this.boostMode, diamondVIPPrivilegeSettings.boostMode) && this.mysterySwipe == diamondVIPPrivilegeSettings.mysterySwipe && this.showQualityIdentity == diamondVIPPrivilegeSettings.showQualityIdentity;
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
        long j = this.expiredTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.trialExpiredTime;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        DiamondVIPBoostType diamondVIPBoostType = this.boostMode;
        int iHashCode = ((((i3 + (diamondVIPBoostType != null ? diamondVIPBoostType.hashCode() : 0)) * 41) + (this.mysterySwipe ? 1231 : 1237)) * 41) + (this.showQualityIdentity ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.boostMode == null) {
            this.boostMode = (DiamondVIPBoostType) DiamondVIPBoostType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
