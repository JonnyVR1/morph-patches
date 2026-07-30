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
public class SystemTip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemtip";

    @NonNull
    @ProtobufIndex(index = 2)
    public SystemTipContent otherShown;

    @NonNull
    @ProtobufIndex(index = 1)
    public SystemTipContent selfShown;
    public static ProtobufAdapter<SystemTip> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemTip>() { // from class: com.p1.mobile.putong.core.data.SystemTip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SystemTip systemTip) {
            SystemTipContent systemTipContent = systemTip.selfShown;
            int iM17230l = systemTipContent != null ? CodedOutputByteBufferNano.m17230l(1, systemTipContent, SystemTipContent.PROTOBUF_ADAPTER) : 0;
            SystemTipContent systemTipContent2 = systemTip.otherShown;
            if (systemTipContent2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, systemTipContent2, SystemTipContent.PROTOBUF_ADAPTER);
            }
            systemTip.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SystemTip parse(nb5 nb5Var) throws IOException {
            SystemTip systemTip = new SystemTip();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (systemTip.selfShown == null) {
                        systemTip.selfShown = SystemTipContent.new_();
                    }
                    if (systemTip.otherShown != null) {
                        break;
                    }
                    systemTip.otherShown = SystemTipContent.new_();
                    break;
                }
                if (iM158752u == 10) {
                    systemTip.selfShown = (SystemTipContent) nb5Var.m158743l(SystemTipContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (systemTip.selfShown == null) {
                            systemTip.selfShown = SystemTipContent.new_();
                        }
                        if (systemTip.otherShown != null) {
                            break;
                        }
                        systemTip.otherShown = SystemTipContent.new_();
                        return systemTip;
                    }
                    systemTip.otherShown = (SystemTipContent) nb5Var.m158743l(SystemTipContent.PROTOBUF_ADAPTER);
                }
            }
            return systemTip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SystemTip systemTip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SystemTipContent systemTipContent = systemTip.selfShown;
            if (systemTipContent != null) {
                codedOutputByteBufferNano.m17254K(1, systemTipContent, SystemTipContent.PROTOBUF_ADAPTER);
            }
            SystemTipContent systemTipContent2 = systemTip.otherShown;
            if (systemTipContent2 != null) {
                codedOutputByteBufferNano.m17254K(2, systemTipContent2, SystemTipContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SystemTip> JSON_ADAPTER = new ObjectJsonAdapter<SystemTip>() { // from class: com.p1.mobile.putong.core.data.SystemTip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SystemTip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SystemTip newInstance() {
            return new SystemTip();
        }

        public boolean parseField(SystemTip systemTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                systemTip.selfShown = SystemTipContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            systemTip.otherShown = SystemTipContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SystemTip systemTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(systemTip, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SystemTip systemTip, JsonGenerator jsonGenerator) throws IOException {
            if (systemTip.selfShown != null) {
                jsonGenerator.writeFieldName("selfShown");
                SystemTipContent.JSON_ADAPTER.serialize(systemTip.selfShown, jsonGenerator, true);
            }
            if (systemTip.otherShown != null) {
                jsonGenerator.writeFieldName("otherShown");
                SystemTipContent.JSON_ADAPTER.serialize(systemTip.otherShown, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemTip new_() {
        SystemTip systemTip = new SystemTip();
        systemTip.nullCheck();
        return systemTip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SystemTip mo223809clone() {
        SystemTip systemTip = new SystemTip();
        SystemTipContent systemTipContent = this.selfShown;
        if (systemTipContent != null) {
            systemTip.selfShown = systemTipContent.mo223809clone();
        }
        SystemTipContent systemTipContent2 = this.otherShown;
        if (systemTipContent2 != null) {
            systemTip.otherShown = systemTipContent2.mo223809clone();
        }
        return systemTip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SystemTip)) {
            return false;
        }
        SystemTip systemTip = (SystemTip) obj;
        return ValueObject.util_equals(this.selfShown, systemTip.selfShown) && ValueObject.util_equals(this.otherShown, systemTip.otherShown);
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
        SystemTipContent systemTipContent = this.selfShown;
        int iHashCode = (i2 + (systemTipContent != null ? systemTipContent.hashCode() : 0)) * 41;
        SystemTipContent systemTipContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (systemTipContent2 != null ? systemTipContent2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selfShown == null) {
            this.selfShown = SystemTipContent.new_();
        }
        if (this.otherShown == null) {
            this.otherShown = SystemTipContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
