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
public class MomentThemeCardeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentthemecardeconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean enableGreeting;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitleFormat;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String tabId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tabTitle;
    public static ProtobufAdapter<MomentThemeCardeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentThemeCardeConfig>() { // from class: com.p1.mobile.putong.core.data.MomentThemeCardeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentThemeCardeConfig momentThemeCardeConfig) {
            int iB = CodedOutputByteBufferNano.b(1, momentThemeCardeConfig.enabled);
            String str = momentThemeCardeConfig.tabTitle;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(3, momentThemeCardeConfig.enableGreeting);
            String str2 = momentThemeCardeConfig.subtitleFormat;
            if (str2 != null) {
                iB2 += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = momentThemeCardeConfig.tabId;
            if (str3 != null) {
                iB2 += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) momentThemeCardeConfig).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentThemeCardeConfig m14345parse(nb5 nb5Var) throws IOException {
            MomentThemeCardeConfig momentThemeCardeConfig = new MomentThemeCardeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentThemeCardeConfig.tabTitle == null) {
                        momentThemeCardeConfig.tabTitle = "";
                    }
                    if (momentThemeCardeConfig.subtitleFormat == null) {
                        momentThemeCardeConfig.subtitleFormat = "";
                    }
                    if (momentThemeCardeConfig.tabId != null) {
                        break;
                    }
                    momentThemeCardeConfig.tabId = "";
                    break;
                }
                if (iU == 8) {
                    momentThemeCardeConfig.enabled = nb5Var.g();
                } else if (iU == 18) {
                    momentThemeCardeConfig.tabTitle = nb5Var.s();
                } else if (iU == 24) {
                    momentThemeCardeConfig.enableGreeting = nb5Var.g();
                } else if (iU == 34) {
                    momentThemeCardeConfig.subtitleFormat = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (momentThemeCardeConfig.tabTitle == null) {
                            momentThemeCardeConfig.tabTitle = "";
                        }
                        if (momentThemeCardeConfig.subtitleFormat == null) {
                            momentThemeCardeConfig.subtitleFormat = "";
                        }
                        if (momentThemeCardeConfig.tabId != null) {
                            break;
                        }
                        momentThemeCardeConfig.tabId = "";
                        return momentThemeCardeConfig;
                    }
                    momentThemeCardeConfig.tabId = nb5Var.s();
                }
            }
            return momentThemeCardeConfig;
        }

        public void serialize(MomentThemeCardeConfig momentThemeCardeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, momentThemeCardeConfig.enabled);
            String str = momentThemeCardeConfig.tabTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.A(3, momentThemeCardeConfig.enableGreeting);
            String str2 = momentThemeCardeConfig.subtitleFormat;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = momentThemeCardeConfig.tabId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<MomentThemeCardeConfig> JSON_ADAPTER = new ObjectJsonAdapter<MomentThemeCardeConfig>() { // from class: com.p1.mobile.putong.core.data.MomentThemeCardeConfig.2
        public Class getDataClass() {
            return MomentThemeCardeConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentThemeCardeConfig m14346newInstance() {
            return new MomentThemeCardeConfig();
        }

        public boolean parseField(MomentThemeCardeConfig momentThemeCardeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    momentThemeCardeConfig.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "tabTitle":
                    momentThemeCardeConfig.tabTitle = jsonParser.getValueAsString();
                    return true;
                case "tabId":
                    momentThemeCardeConfig.tabId = jsonParser.getValueAsString();
                    return true;
                case "enableGreeting":
                    momentThemeCardeConfig.enableGreeting = jsonParser.getValueAsBoolean();
                    return true;
                case "subtitleFormat":
                    momentThemeCardeConfig.subtitleFormat = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentThemeCardeConfig momentThemeCardeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "tabTitle":
                case "tabId":
                case "enableGreeting":
                case "subtitleFormat":
                    return true;
                default:
                    return super.parseFieldCheck(momentThemeCardeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MomentThemeCardeConfig momentThemeCardeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", momentThemeCardeConfig.enabled);
            String str = momentThemeCardeConfig.tabTitle;
            if (str != null) {
                jsonGenerator.writeStringField("tabTitle", str);
            }
            jsonGenerator.writeBooleanField("enableGreeting", momentThemeCardeConfig.enableGreeting);
            String str2 = momentThemeCardeConfig.subtitleFormat;
            if (str2 != null) {
                jsonGenerator.writeStringField("subtitleFormat", str2);
            }
            String str3 = momentThemeCardeConfig.tabId;
            if (str3 != null) {
                jsonGenerator.writeStringField("tabId", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentThemeCardeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentThemeCardeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentThemeCardeConfig new_() {
        MomentThemeCardeConfig momentThemeCardeConfig = new MomentThemeCardeConfig();
        momentThemeCardeConfig.nullCheck();
        return momentThemeCardeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentThemeCardeConfig m14344clone() {
        MomentThemeCardeConfig momentThemeCardeConfig = new MomentThemeCardeConfig();
        momentThemeCardeConfig.enabled = this.enabled;
        momentThemeCardeConfig.tabTitle = this.tabTitle;
        momentThemeCardeConfig.enableGreeting = this.enableGreeting;
        momentThemeCardeConfig.subtitleFormat = this.subtitleFormat;
        momentThemeCardeConfig.tabId = this.tabId;
        return momentThemeCardeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentThemeCardeConfig)) {
            return false;
        }
        MomentThemeCardeConfig momentThemeCardeConfig = (MomentThemeCardeConfig) obj;
        return this.enabled == momentThemeCardeConfig.enabled && ValueObject.util_equals(this.tabTitle, momentThemeCardeConfig.tabTitle) && this.enableGreeting == momentThemeCardeConfig.enableGreeting && ValueObject.util_equals(this.subtitleFormat, momentThemeCardeConfig.subtitleFormat) && ValueObject.util_equals(this.tabId, momentThemeCardeConfig.tabId);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enabled ? 1231 : 1237)) * 41;
        String str = this.tabTitle;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.enableGreeting ? 1231 : 1237)) * 41;
        String str2 = this.subtitleFormat;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tabId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.tabTitle == null) {
            this.tabTitle = "";
        }
        if (this.subtitleFormat == null) {
            this.subtitleFormat = "";
        }
        if (this.tabId == null) {
            this.tabId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
