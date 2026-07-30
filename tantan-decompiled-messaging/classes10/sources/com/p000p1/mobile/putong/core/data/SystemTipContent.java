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
public class SystemTipContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemtipcontent";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String statsModuleId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<SystemTipContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemTipContent>() { // from class: com.p1.mobile.putong.core.data.SystemTipContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SystemTipContent systemTipContent) {
            String str = systemTipContent.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = systemTipContent.style;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = systemTipContent.statsModuleId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) systemTipContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SystemTipContent m15886parse(nb5 nb5Var) throws IOException {
            SystemTipContent systemTipContent = new SystemTipContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    systemTipContent.value = nb5Var.s();
                } else if (iU == 18) {
                    systemTipContent.style = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    systemTipContent.statsModuleId = nb5Var.s();
                }
            }
            return systemTipContent;
        }

        public void serialize(SystemTipContent systemTipContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = systemTipContent.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = systemTipContent.style;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = systemTipContent.statsModuleId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SystemTipContent> JSON_ADAPTER = new ObjectJsonAdapter<SystemTipContent>() { // from class: com.p1.mobile.putong.core.data.SystemTipContent.2
        public Class getDataClass() {
            return SystemTipContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SystemTipContent m15887newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemTipContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemTipContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemTipContent new_() {
        SystemTipContent systemTipContent = new SystemTipContent();
        systemTipContent.nullCheck();
        return systemTipContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SystemTipContent m15885clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
