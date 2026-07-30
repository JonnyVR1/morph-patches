package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class XmlMonitorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "xmlmonitorconfig";

    @ProtobufIndex(index = 2)
    public int xml_monitor_cons_min;

    @ProtobufIndex(index = 1)
    public boolean xml_monitor_open;

    @ProtobufIndex(index = 3)
    public int xml_monitor_view_cons_min;
    public static ProtobufAdapter<XmlMonitorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<XmlMonitorConfig>() { // from class: com.p1.mobile.putong.data.XmlMonitorConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(XmlMonitorConfig xmlMonitorConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, xmlMonitorConfig.xml_monitor_open) + CodedOutputByteBufferNano.m17226h(2, xmlMonitorConfig.xml_monitor_cons_min) + CodedOutputByteBufferNano.m17226h(3, xmlMonitorConfig.xml_monitor_view_cons_min);
            xmlMonitorConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public XmlMonitorConfig parse(nb5 nb5Var) throws IOException {
            XmlMonitorConfig xmlMonitorConfig = new XmlMonitorConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    xmlMonitorConfig.xml_monitor_open = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    xmlMonitorConfig.xml_monitor_cons_min = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return xmlMonitorConfig;
                    }
                    xmlMonitorConfig.xml_monitor_view_cons_min = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(XmlMonitorConfig xmlMonitorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, xmlMonitorConfig.xml_monitor_open);
            codedOutputByteBufferNano.m17250G(2, xmlMonitorConfig.xml_monitor_cons_min);
            codedOutputByteBufferNano.m17250G(3, xmlMonitorConfig.xml_monitor_view_cons_min);
        }
    };
    public static JsonAdapter<XmlMonitorConfig> JSON_ADAPTER = new ObjectJsonAdapter<XmlMonitorConfig>() { // from class: com.p1.mobile.putong.data.XmlMonitorConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return XmlMonitorConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public XmlMonitorConfig newInstance() {
            return new XmlMonitorConfig();
        }

        public boolean parseField(XmlMonitorConfig xmlMonitorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "xml_monitor_cons_min":
                    xmlMonitorConfig.xml_monitor_cons_min = jsonParser.getValueAsInt();
                    return true;
                case "xml_monitor_view_cons_min":
                    xmlMonitorConfig.xml_monitor_view_cons_min = jsonParser.getValueAsInt();
                    return true;
                case "xml_monitor_open":
                    xmlMonitorConfig.xml_monitor_open = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(XmlMonitorConfig xmlMonitorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "xml_monitor_cons_min":
                case "xml_monitor_view_cons_min":
                case "xml_monitor_open":
                    return true;
                default:
                    return super.parseFieldCheck(xmlMonitorConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(XmlMonitorConfig xmlMonitorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("xml_monitor_open", xmlMonitorConfig.xml_monitor_open);
            jsonGenerator.writeNumberField("xml_monitor_cons_min", xmlMonitorConfig.xml_monitor_cons_min);
            jsonGenerator.writeNumberField("xml_monitor_view_cons_min", xmlMonitorConfig.xml_monitor_view_cons_min);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((XmlMonitorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((XmlMonitorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static XmlMonitorConfig new_() {
        XmlMonitorConfig xmlMonitorConfig = new XmlMonitorConfig();
        xmlMonitorConfig.nullCheck();
        return xmlMonitorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public XmlMonitorConfig mo223809clone() {
        XmlMonitorConfig xmlMonitorConfig = new XmlMonitorConfig();
        xmlMonitorConfig.xml_monitor_open = this.xml_monitor_open;
        xmlMonitorConfig.xml_monitor_cons_min = this.xml_monitor_cons_min;
        xmlMonitorConfig.xml_monitor_view_cons_min = this.xml_monitor_view_cons_min;
        return xmlMonitorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XmlMonitorConfig)) {
            return false;
        }
        XmlMonitorConfig xmlMonitorConfig = (XmlMonitorConfig) obj;
        return this.xml_monitor_open == xmlMonitorConfig.xml_monitor_open && this.xml_monitor_cons_min == xmlMonitorConfig.xml_monitor_cons_min && this.xml_monitor_view_cons_min == xmlMonitorConfig.xml_monitor_view_cons_min;
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
        int i2 = (((((i * 41) + (this.xml_monitor_open ? 1231 : 1237)) * 41) + this.xml_monitor_cons_min) * 41) + this.xml_monitor_view_cons_min;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
