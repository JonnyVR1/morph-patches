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
public class GrowthMomentThemeCardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthmomentthemecardinfo";

    @ProtobufIndex(index = 3)
    public boolean enableGreeting;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 6)
    public boolean jumpTab;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitleFormat;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tabId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tabTitle;
    public static ProtobufAdapter<GrowthMomentThemeCardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthMomentThemeCardInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMomentThemeCardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthMomentThemeCardInfo growthMomentThemeCardInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, growthMomentThemeCardInfo.enabled);
            String str = growthMomentThemeCardInfo.tabTitle;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(3, growthMomentThemeCardInfo.enableGreeting);
            String str2 = growthMomentThemeCardInfo.subtitleFormat;
            if (str2 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = growthMomentThemeCardInfo.tabId;
            if (str3 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(6, growthMomentThemeCardInfo.jumpTab);
            growthMomentThemeCardInfo.cachedSize = iM17220b3;
            return iM17220b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthMomentThemeCardInfo parse(nb5 nb5Var) throws IOException {
            GrowthMomentThemeCardInfo growthMomentThemeCardInfo = new GrowthMomentThemeCardInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 8) {
                    growthMomentThemeCardInfo.enabled = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    growthMomentThemeCardInfo.tabTitle = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    growthMomentThemeCardInfo.enableGreeting = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    growthMomentThemeCardInfo.subtitleFormat = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    growthMomentThemeCardInfo.tabId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
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
                    growthMomentThemeCardInfo.jumpTab = nb5Var.m158738g();
                }
            }
            return growthMomentThemeCardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthMomentThemeCardInfo growthMomentThemeCardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, growthMomentThemeCardInfo.enabled);
            String str = growthMomentThemeCardInfo.tabTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17244A(3, growthMomentThemeCardInfo.enableGreeting);
            String str2 = growthMomentThemeCardInfo.subtitleFormat;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = growthMomentThemeCardInfo.tabId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            codedOutputByteBufferNano.m17244A(6, growthMomentThemeCardInfo.jumpTab);
        }
    };
    public static JsonAdapter<GrowthMomentThemeCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthMomentThemeCardInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMomentThemeCardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthMomentThemeCardInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthMomentThemeCardInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthMomentThemeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthMomentThemeCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthMomentThemeCardInfo new_() {
        GrowthMomentThemeCardInfo growthMomentThemeCardInfo = new GrowthMomentThemeCardInfo();
        growthMomentThemeCardInfo.nullCheck();
        return growthMomentThemeCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthMomentThemeCardInfo mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
