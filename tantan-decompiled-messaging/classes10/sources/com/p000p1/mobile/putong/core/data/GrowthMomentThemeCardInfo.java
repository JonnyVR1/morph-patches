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
public class GrowthMomentThemeCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthmomentthemecardinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean enableGreeting;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 6)
    public boolean jumpTab;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitleFormat;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String tabId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tabTitle;
    public static ProtobufAdapter<GrowthMomentThemeCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthMomentThemeCardInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMomentThemeCardInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthMomentThemeCardInfo growthMomentThemeCardInfo) {
            int iB = CodedOutputByteBufferNano.b(1, growthMomentThemeCardInfo.enabled);
            String str = growthMomentThemeCardInfo.tabTitle;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(3, growthMomentThemeCardInfo.enableGreeting);
            String str2 = growthMomentThemeCardInfo.subtitleFormat;
            if (str2 != null) {
                iB2 += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = growthMomentThemeCardInfo.tabId;
            if (str3 != null) {
                iB2 += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(6, growthMomentThemeCardInfo.jumpTab);
            ((MessageNano) growthMomentThemeCardInfo).cachedSize = iB3;
            return iB3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthMomentThemeCardInfo m13143parse(nb5 nb5Var) throws IOException {
            GrowthMomentThemeCardInfo growthMomentThemeCardInfo = new GrowthMomentThemeCardInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthMomentThemeCardInfo.tabTitle == null) {
                        growthMomentThemeCardInfo.tabTitle = "";
                    }
                    if (growthMomentThemeCardInfo.subtitleFormat == null) {
                        growthMomentThemeCardInfo.subtitleFormat = "";
                    }
                    if (growthMomentThemeCardInfo.tabId != null) {
                        break;
                    }
                    growthMomentThemeCardInfo.tabId = "";
                    break;
                }
                if (iU == 8) {
                    growthMomentThemeCardInfo.enabled = nb5Var.g();
                } else if (iU == 18) {
                    growthMomentThemeCardInfo.tabTitle = nb5Var.s();
                } else if (iU == 24) {
                    growthMomentThemeCardInfo.enableGreeting = nb5Var.g();
                } else if (iU == 34) {
                    growthMomentThemeCardInfo.subtitleFormat = nb5Var.s();
                } else if (iU == 42) {
                    growthMomentThemeCardInfo.tabId = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (growthMomentThemeCardInfo.tabTitle == null) {
                            growthMomentThemeCardInfo.tabTitle = "";
                        }
                        if (growthMomentThemeCardInfo.subtitleFormat == null) {
                            growthMomentThemeCardInfo.subtitleFormat = "";
                        }
                        if (growthMomentThemeCardInfo.tabId != null) {
                            break;
                        }
                        growthMomentThemeCardInfo.tabId = "";
                        return growthMomentThemeCardInfo;
                    }
                    growthMomentThemeCardInfo.jumpTab = nb5Var.g();
                }
            }
            return growthMomentThemeCardInfo;
        }

        public void serialize(GrowthMomentThemeCardInfo growthMomentThemeCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, growthMomentThemeCardInfo.enabled);
            String str = growthMomentThemeCardInfo.tabTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.A(3, growthMomentThemeCardInfo.enableGreeting);
            String str2 = growthMomentThemeCardInfo.subtitleFormat;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = growthMomentThemeCardInfo.tabId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, growthMomentThemeCardInfo.jumpTab);
        }
    };
    public static JsonAdapter<GrowthMomentThemeCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthMomentThemeCardInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMomentThemeCardInfo.2
        public Class getDataClass() {
            return GrowthMomentThemeCardInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthMomentThemeCardInfo m13144newInstance() {
            return new GrowthMomentThemeCardInfo();
        }

        public boolean parseField(GrowthMomentThemeCardInfo growthMomentThemeCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    growthMomentThemeCardInfo.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "jumpTab":
                    growthMomentThemeCardInfo.jumpTab = jsonParser.getValueAsBoolean();
                    return true;
                case "tabTitle":
                    growthMomentThemeCardInfo.tabTitle = jsonParser.getValueAsString();
                    return true;
                case "tabId":
                    growthMomentThemeCardInfo.tabId = jsonParser.getValueAsString();
                    return true;
                case "enableGreeting":
                    growthMomentThemeCardInfo.enableGreeting = jsonParser.getValueAsBoolean();
                    return true;
                case "subtitleFormat":
                    growthMomentThemeCardInfo.subtitleFormat = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthMomentThemeCardInfo growthMomentThemeCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "jumpTab":
                case "tabTitle":
                case "tabId":
                case "enableGreeting":
                case "subtitleFormat":
                    return true;
                default:
                    return super.parseFieldCheck(growthMomentThemeCardInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthMomentThemeCardInfo growthMomentThemeCardInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", growthMomentThemeCardInfo.enabled);
            String str = growthMomentThemeCardInfo.tabTitle;
            if (str != null) {
                jsonGenerator.writeStringField("tabTitle", str);
            }
            jsonGenerator.writeBooleanField("enableGreeting", growthMomentThemeCardInfo.enableGreeting);
            String str2 = growthMomentThemeCardInfo.subtitleFormat;
            if (str2 != null) {
                jsonGenerator.writeStringField("subtitleFormat", str2);
            }
            String str3 = growthMomentThemeCardInfo.tabId;
            if (str3 != null) {
                jsonGenerator.writeStringField("tabId", str3);
            }
            jsonGenerator.writeBooleanField("jumpTab", growthMomentThemeCardInfo.jumpTab);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthMomentThemeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthMomentThemeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthMomentThemeCardInfo new_() {
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = new GrowthMomentThemeCardInfo();
        growthMomentThemeCardInfo.nullCheck();
        return growthMomentThemeCardInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthMomentThemeCardInfo m13142clone() {
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = new GrowthMomentThemeCardInfo();
        growthMomentThemeCardInfo.enabled = this.enabled;
        growthMomentThemeCardInfo.tabTitle = this.tabTitle;
        growthMomentThemeCardInfo.enableGreeting = this.enableGreeting;
        growthMomentThemeCardInfo.subtitleFormat = this.subtitleFormat;
        growthMomentThemeCardInfo.tabId = this.tabId;
        growthMomentThemeCardInfo.jumpTab = this.jumpTab;
        return growthMomentThemeCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthMomentThemeCardInfo)) {
            return false;
        }
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = (GrowthMomentThemeCardInfo) obj;
        return this.enabled == growthMomentThemeCardInfo.enabled && ValueObject.util_equals(this.tabTitle, growthMomentThemeCardInfo.tabTitle) && this.enableGreeting == growthMomentThemeCardInfo.enableGreeting && ValueObject.util_equals(this.subtitleFormat, growthMomentThemeCardInfo.subtitleFormat) && ValueObject.util_equals(this.tabId, growthMomentThemeCardInfo.tabId) && this.jumpTab == growthMomentThemeCardInfo.jumpTab;
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
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.jumpTab ? 1231 : 1237);
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
