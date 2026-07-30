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
public class SystemTip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemtip";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SystemTipContent otherShown;

    @NonNull
    @ProtobufIndex(index = 1)
    public SystemTipContent selfShown;
    public static ProtobufAdapter<SystemTip> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemTip>() { // from class: com.p1.mobile.putong.core.data.SystemTip.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SystemTip systemTip) {
            SystemTipContent systemTipContent = systemTip.selfShown;
            int iL = systemTipContent != null ? CodedOutputByteBufferNano.l(1, systemTipContent, SystemTipContent.PROTOBUF_ADAPTER) : 0;
            SystemTipContent systemTipContent2 = systemTip.otherShown;
            if (systemTipContent2 != null) {
                iL += CodedOutputByteBufferNano.l(2, systemTipContent2, SystemTipContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) systemTip).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SystemTip m15882parse(nb5 nb5Var) throws IOException {
            SystemTip systemTip = new SystemTip();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (systemTip.selfShown == null) {
                        systemTip.selfShown = SystemTipContent.new_();
                    }
                    if (systemTip.otherShown != null) {
                        break;
                    }
                    systemTip.otherShown = SystemTipContent.new_();
                    break;
                }
                if (iU == 10) {
                    systemTip.selfShown = (SystemTipContent) nb5Var.l(SystemTipContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (systemTip.selfShown == null) {
                            systemTip.selfShown = SystemTipContent.new_();
                        }
                        if (systemTip.otherShown != null) {
                            break;
                        }
                        systemTip.otherShown = SystemTipContent.new_();
                        return systemTip;
                    }
                    systemTip.otherShown = (SystemTipContent) nb5Var.l(SystemTipContent.PROTOBUF_ADAPTER);
                }
            }
            return systemTip;
        }

        public void serialize(SystemTip systemTip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SystemTipContent systemTipContent = systemTip.selfShown;
            if (systemTipContent != null) {
                codedOutputByteBufferNano.K(1, systemTipContent, SystemTipContent.PROTOBUF_ADAPTER);
            }
            SystemTipContent systemTipContent2 = systemTip.otherShown;
            if (systemTipContent2 != null) {
                codedOutputByteBufferNano.K(2, systemTipContent2, SystemTipContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SystemTip> JSON_ADAPTER = new ObjectJsonAdapter<SystemTip>() { // from class: com.p1.mobile.putong.core.data.SystemTip.2
        public Class getDataClass() {
            return SystemTip.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SystemTip m15883newInstance() {
            return new SystemTip();
        }

        public boolean parseField(SystemTip systemTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selfShown")) {
                systemTip.selfShown = (SystemTipContent) SystemTipContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("otherShown")) {
                return false;
            }
            systemTip.otherShown = (SystemTipContent) SystemTipContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SystemTip systemTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selfShown") || str.equals("otherShown")) {
                return true;
            }
            return super.parseFieldCheck(systemTip, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemTip new_() {
        SystemTip systemTip = new SystemTip();
        systemTip.nullCheck();
        return systemTip;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SystemTip m15881clone() {
        SystemTip systemTip = new SystemTip();
        SystemTipContent systemTipContent = this.selfShown;
        if (systemTipContent != null) {
            systemTip.selfShown = systemTipContent.m15885clone();
        }
        SystemTipContent systemTipContent2 = this.otherShown;
        if (systemTipContent2 != null) {
            systemTip.otherShown = systemTipContent2.m15885clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        SystemTipContent systemTipContent = this.selfShown;
        int iHashCode = (i2 + (systemTipContent != null ? systemTipContent.hashCode() : 0)) * 41;
        SystemTipContent systemTipContent2 = this.otherShown;
        int iHashCode2 = iHashCode + (systemTipContent2 != null ? systemTipContent2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.selfShown == null) {
            this.selfShown = SystemTipContent.new_();
        }
        if (this.otherShown == null) {
            this.otherShown = SystemTipContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
