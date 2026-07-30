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
public class TTCMigrateGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigrateguideconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int dlgType;

    @ProtobufIndex(index = 1)
    public int frequency;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String homepageURL;

    @ProtobufIndex(index = 6)
    public boolean ignoreHw;

    @ProtobufIndex(index = 4)
    public boolean migrateDlgClosable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int skipTime;
    public static ProtobufAdapter<TTCMigrateGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<TTCMigrateGuideConfig>() { // from class: com.p1.mobile.putong.core.data.TTCMigrateGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TTCMigrateGuideConfig tTCMigrateGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, tTCMigrateGuideConfig.frequency) + CodedOutputByteBufferNano.h(2, tTCMigrateGuideConfig.dlgType) + CodedOutputByteBufferNano.h(3, tTCMigrateGuideConfig.skipTime) + CodedOutputByteBufferNano.b(4, tTCMigrateGuideConfig.migrateDlgClosable);
            String str = tTCMigrateGuideConfig.homepageURL;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(5, str);
            }
            int iB = iH + CodedOutputByteBufferNano.b(6, tTCMigrateGuideConfig.ignoreHw);
            ((MessageNano) tTCMigrateGuideConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TTCMigrateGuideConfig m15890parse(nb5 nb5Var) throws IOException {
            TTCMigrateGuideConfig tTCMigrateGuideConfig = new TTCMigrateGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tTCMigrateGuideConfig.homepageURL != null) {
                        break;
                    }
                    tTCMigrateGuideConfig.homepageURL = "";
                    break;
                }
                if (iU == 8) {
                    tTCMigrateGuideConfig.frequency = nb5Var.j();
                } else if (iU == 16) {
                    tTCMigrateGuideConfig.dlgType = nb5Var.j();
                } else if (iU == 24) {
                    tTCMigrateGuideConfig.skipTime = nb5Var.j();
                } else if (iU == 32) {
                    tTCMigrateGuideConfig.migrateDlgClosable = nb5Var.g();
                } else if (iU == 42) {
                    tTCMigrateGuideConfig.homepageURL = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (tTCMigrateGuideConfig.homepageURL != null) {
                            break;
                        }
                        tTCMigrateGuideConfig.homepageURL = "";
                        return tTCMigrateGuideConfig;
                    }
                    tTCMigrateGuideConfig.ignoreHw = nb5Var.g();
                }
            }
            return tTCMigrateGuideConfig;
        }

        public void serialize(TTCMigrateGuideConfig tTCMigrateGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, tTCMigrateGuideConfig.frequency);
            codedOutputByteBufferNano.G(2, tTCMigrateGuideConfig.dlgType);
            codedOutputByteBufferNano.G(3, tTCMigrateGuideConfig.skipTime);
            codedOutputByteBufferNano.A(4, tTCMigrateGuideConfig.migrateDlgClosable);
            String str = tTCMigrateGuideConfig.homepageURL;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
            codedOutputByteBufferNano.A(6, tTCMigrateGuideConfig.ignoreHw);
        }
    };
    public static JsonAdapter<TTCMigrateGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<TTCMigrateGuideConfig>() { // from class: com.p1.mobile.putong.core.data.TTCMigrateGuideConfig.2
        public Class getDataClass() {
            return TTCMigrateGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TTCMigrateGuideConfig m15891newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TTCMigrateGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TTCMigrateGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TTCMigrateGuideConfig new_() {
        TTCMigrateGuideConfig tTCMigrateGuideConfig = new TTCMigrateGuideConfig();
        tTCMigrateGuideConfig.nullCheck();
        return tTCMigrateGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TTCMigrateGuideConfig m15889clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((i * 41) + this.frequency) * 41) + this.dlgType) * 41) + this.skipTime) * 41) + (this.migrateDlgClosable ? 1231 : 1237)) * 41;
        String str = this.homepageURL;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.ignoreHw ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.homepageURL == null) {
            this.homepageURL = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
