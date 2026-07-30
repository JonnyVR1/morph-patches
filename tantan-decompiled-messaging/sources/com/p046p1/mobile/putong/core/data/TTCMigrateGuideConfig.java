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
public class TTCMigrateGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigrateguideconfig";

    @ProtobufIndex(index = 2)
    public int dlgType;

    @ProtobufIndex(index = 1)
    public int frequency;

    @NonNull
    @ProtobufIndex(index = 5)
    public String homepageURL;

    @ProtobufIndex(index = 6)
    public boolean ignoreHw;

    @ProtobufIndex(index = 4)
    public boolean migrateDlgClosable;

    @ProtobufIndex(index = 3)
    public int skipTime;
    public static ProtobufAdapter<TTCMigrateGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<TTCMigrateGuideConfig>() { // from class: com.p1.mobile.putong.core.data.TTCMigrateGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TTCMigrateGuideConfig tTCMigrateGuideConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, tTCMigrateGuideConfig.frequency) + CodedOutputByteBufferNano.m17226h(2, tTCMigrateGuideConfig.dlgType) + CodedOutputByteBufferNano.m17226h(3, tTCMigrateGuideConfig.skipTime) + CodedOutputByteBufferNano.m17220b(4, tTCMigrateGuideConfig.migrateDlgClosable);
            String str = tTCMigrateGuideConfig.homepageURL;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(6, tTCMigrateGuideConfig.ignoreHw);
            tTCMigrateGuideConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TTCMigrateGuideConfig parse(nb5 nb5Var) throws IOException {
            TTCMigrateGuideConfig tTCMigrateGuideConfig = new TTCMigrateGuideConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (tTCMigrateGuideConfig.homepageURL != null) {
                        break;
                    }
                    tTCMigrateGuideConfig.homepageURL = "";
                    break;
                }
                if (iM158752u == 8) {
                    tTCMigrateGuideConfig.frequency = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    tTCMigrateGuideConfig.dlgType = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    tTCMigrateGuideConfig.skipTime = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    tTCMigrateGuideConfig.migrateDlgClosable = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    tTCMigrateGuideConfig.homepageURL = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
                        if (tTCMigrateGuideConfig.homepageURL != null) {
                            break;
                        }
                        tTCMigrateGuideConfig.homepageURL = "";
                        return tTCMigrateGuideConfig;
                    }
                    tTCMigrateGuideConfig.ignoreHw = nb5Var.m158738g();
                }
            }
            return tTCMigrateGuideConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TTCMigrateGuideConfig tTCMigrateGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, tTCMigrateGuideConfig.frequency);
            codedOutputByteBufferNano.m17250G(2, tTCMigrateGuideConfig.dlgType);
            codedOutputByteBufferNano.m17250G(3, tTCMigrateGuideConfig.skipTime);
            codedOutputByteBufferNano.m17244A(4, tTCMigrateGuideConfig.migrateDlgClosable);
            String str = tTCMigrateGuideConfig.homepageURL;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(5, str);
            }
            codedOutputByteBufferNano.m17244A(6, tTCMigrateGuideConfig.ignoreHw);
        }
    };
    public static JsonAdapter<TTCMigrateGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<TTCMigrateGuideConfig>() { // from class: com.p1.mobile.putong.core.data.TTCMigrateGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TTCMigrateGuideConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TTCMigrateGuideConfig newInstance() {
            return new TTCMigrateGuideConfig();
        }

        public boolean parseField(TTCMigrateGuideConfig tTCMigrateGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ignoreHw":
                    tTCMigrateGuideConfig.ignoreHw = jsonParser.getValueAsBoolean();
                    return true;
                case "migrateDlgClosable":
                    tTCMigrateGuideConfig.migrateDlgClosable = jsonParser.getValueAsBoolean();
                    return true;
                case "frequency":
                    tTCMigrateGuideConfig.frequency = jsonParser.getValueAsInt();
                    return true;
                case "homepageURL":
                    tTCMigrateGuideConfig.homepageURL = jsonParser.getValueAsString();
                    return true;
                case "dlgType":
                    tTCMigrateGuideConfig.dlgType = jsonParser.getValueAsInt();
                    return true;
                case "skipTime":
                    tTCMigrateGuideConfig.skipTime = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TTCMigrateGuideConfig tTCMigrateGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ignoreHw":
                case "migrateDlgClosable":
                case "frequency":
                case "homepageURL":
                case "dlgType":
                case "skipTime":
                    return true;
                default:
                    return super.parseFieldCheck(tTCMigrateGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TTCMigrateGuideConfig tTCMigrateGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("frequency", tTCMigrateGuideConfig.frequency);
            jsonGenerator.writeNumberField("dlgType", tTCMigrateGuideConfig.dlgType);
            jsonGenerator.writeNumberField("skipTime", tTCMigrateGuideConfig.skipTime);
            jsonGenerator.writeBooleanField("migrateDlgClosable", tTCMigrateGuideConfig.migrateDlgClosable);
            String str = tTCMigrateGuideConfig.homepageURL;
            if (str != null) {
                jsonGenerator.writeStringField("homepageURL", str);
            }
            jsonGenerator.writeBooleanField("ignoreHw", tTCMigrateGuideConfig.ignoreHw);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TTCMigrateGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TTCMigrateGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TTCMigrateGuideConfig new_() {
        TTCMigrateGuideConfig tTCMigrateGuideConfig = new TTCMigrateGuideConfig();
        tTCMigrateGuideConfig.nullCheck();
        return tTCMigrateGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TTCMigrateGuideConfig mo223809clone() {
        TTCMigrateGuideConfig tTCMigrateGuideConfig = new TTCMigrateGuideConfig();
        tTCMigrateGuideConfig.frequency = this.frequency;
        tTCMigrateGuideConfig.dlgType = this.dlgType;
        tTCMigrateGuideConfig.skipTime = this.skipTime;
        tTCMigrateGuideConfig.migrateDlgClosable = this.migrateDlgClosable;
        tTCMigrateGuideConfig.homepageURL = this.homepageURL;
        tTCMigrateGuideConfig.ignoreHw = this.ignoreHw;
        return tTCMigrateGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TTCMigrateGuideConfig)) {
            return false;
        }
        TTCMigrateGuideConfig tTCMigrateGuideConfig = (TTCMigrateGuideConfig) obj;
        return this.frequency == tTCMigrateGuideConfig.frequency && this.dlgType == tTCMigrateGuideConfig.dlgType && this.skipTime == tTCMigrateGuideConfig.skipTime && this.migrateDlgClosable == tTCMigrateGuideConfig.migrateDlgClosable && ValueObject.util_equals(this.homepageURL, tTCMigrateGuideConfig.homepageURL) && this.ignoreHw == tTCMigrateGuideConfig.ignoreHw;
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
        int i2 = ((((((((i * 41) + this.frequency) * 41) + this.dlgType) * 41) + this.skipTime) * 41) + (this.migrateDlgClosable ? 1231 : 1237)) * 41;
        String str = this.homepageURL;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.ignoreHw ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.homepageURL == null) {
            this.homepageURL = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
