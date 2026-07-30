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
public class SystemTipContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemtipcontent";

    @NonNull
    @ProtobufIndex(index = 3)
    public String statsModuleId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<SystemTipContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemTipContent>() { // from class: com.p1.mobile.putong.core.data.SystemTipContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SystemTipContent systemTipContent) {
            String str = systemTipContent.value;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = systemTipContent.style;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = systemTipContent.statsModuleId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            systemTipContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SystemTipContent parse(nb5 nb5Var) throws IOException {
            SystemTipContent systemTipContent = new SystemTipContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (systemTipContent.value == null) {
                        systemTipContent.value = "";
                    }
                    if (systemTipContent.style == null) {
                        systemTipContent.style = "";
                    }
                    if (systemTipContent.statsModuleId != null) {
                        break;
                    }
                    systemTipContent.statsModuleId = "";
                    break;
                }
                if (iM158752u == 10) {
                    systemTipContent.value = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    systemTipContent.style = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (systemTipContent.value == null) {
                            systemTipContent.value = "";
                        }
                        if (systemTipContent.style == null) {
                            systemTipContent.style = "";
                        }
                        if (systemTipContent.statsModuleId != null) {
                            break;
                        }
                        systemTipContent.statsModuleId = "";
                        return systemTipContent;
                    }
                    systemTipContent.statsModuleId = nb5Var.m158750s();
                }
            }
            return systemTipContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SystemTipContent systemTipContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = systemTipContent.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = systemTipContent.style;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = systemTipContent.statsModuleId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<SystemTipContent> JSON_ADAPTER = new ObjectJsonAdapter<SystemTipContent>() { // from class: com.p1.mobile.putong.core.data.SystemTipContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SystemTipContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SystemTipContent newInstance() {
            return new SystemTipContent();
        }

        public boolean parseField(SystemTipContent systemTipContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "style":
                    systemTipContent.style = jsonParser.getValueAsString();
                    return true;
                case "value":
                    systemTipContent.value = jsonParser.getValueAsString();
                    return true;
                case "statsModuleId":
                    systemTipContent.statsModuleId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SystemTipContent systemTipContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "style":
                case "value":
                case "statsModuleId":
                    return true;
                default:
                    return super.parseFieldCheck(systemTipContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SystemTipContent systemTipContent, JsonGenerator jsonGenerator) throws IOException {
            String str = systemTipContent.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = systemTipContent.style;
            if (str2 != null) {
                jsonGenerator.writeStringField("style", str2);
            }
            String str3 = systemTipContent.statsModuleId;
            if (str3 != null) {
                jsonGenerator.writeStringField("statsModuleId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemTipContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemTipContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemTipContent new_() {
        SystemTipContent systemTipContent = new SystemTipContent();
        systemTipContent.nullCheck();
        return systemTipContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SystemTipContent mo223809clone() {
        SystemTipContent systemTipContent = new SystemTipContent();
        systemTipContent.value = this.value;
        systemTipContent.style = this.style;
        systemTipContent.statsModuleId = this.statsModuleId;
        return systemTipContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SystemTipContent)) {
            return false;
        }
        SystemTipContent systemTipContent = (SystemTipContent) obj;
        return ValueObject.util_equals(this.value, systemTipContent.value) && ValueObject.util_equals(this.style, systemTipContent.style) && ValueObject.util_equals(this.statsModuleId, systemTipContent.statsModuleId);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.statsModuleId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.style == null) {
            this.style = "";
        }
        if (this.statsModuleId == null) {
            this.statsModuleId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
