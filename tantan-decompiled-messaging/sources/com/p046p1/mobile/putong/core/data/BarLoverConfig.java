package com.p046p1.mobile.putong.core.data;

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
public class BarLoverConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barloverconfig";

    @ProtobufIndex(index = 3)
    public int barLoverCardInsertMax;

    @ProtobufIndex(index = 1)
    public int barLoverDlg1MaxShowNoClick;

    @ProtobufIndex(index = 2)
    public boolean barLoverDlg2CanShow;
    public static ProtobufAdapter<BarLoverConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverConfig>() { // from class: com.p1.mobile.putong.core.data.BarLoverConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BarLoverConfig barLoverConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, barLoverConfig.barLoverDlg1MaxShowNoClick) + CodedOutputByteBufferNano.m17220b(2, barLoverConfig.barLoverDlg2CanShow) + CodedOutputByteBufferNano.m17226h(3, barLoverConfig.barLoverCardInsertMax);
            barLoverConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BarLoverConfig parse(nb5 nb5Var) throws IOException {
            BarLoverConfig barLoverConfig = new BarLoverConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    barLoverConfig.barLoverDlg1MaxShowNoClick = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    barLoverConfig.barLoverDlg2CanShow = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return barLoverConfig;
                    }
                    barLoverConfig.barLoverCardInsertMax = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BarLoverConfig barLoverConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, barLoverConfig.barLoverDlg1MaxShowNoClick);
            codedOutputByteBufferNano.m17244A(2, barLoverConfig.barLoverDlg2CanShow);
            codedOutputByteBufferNano.m17250G(3, barLoverConfig.barLoverCardInsertMax);
        }
    };
    public static JsonAdapter<BarLoverConfig> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverConfig>() { // from class: com.p1.mobile.putong.core.data.BarLoverConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BarLoverConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BarLoverConfig newInstance() {
            return new BarLoverConfig();
        }

        public boolean parseField(BarLoverConfig barLoverConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "barLoverDlg2CanShow":
                    barLoverConfig.barLoverDlg2CanShow = jsonParser.getValueAsBoolean();
                    return true;
                case "barLoverCardInsertMax":
                    barLoverConfig.barLoverCardInsertMax = jsonParser.getValueAsInt();
                    return true;
                case "barLoverDlg1MaxShowNoClick":
                    barLoverConfig.barLoverDlg1MaxShowNoClick = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BarLoverConfig barLoverConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "barLoverDlg2CanShow":
                case "barLoverCardInsertMax":
                case "barLoverDlg1MaxShowNoClick":
                    return true;
                default:
                    return super.parseFieldCheck(barLoverConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BarLoverConfig barLoverConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("barLoverDlg1MaxShowNoClick", barLoverConfig.barLoverDlg1MaxShowNoClick);
            jsonGenerator.writeBooleanField("barLoverDlg2CanShow", barLoverConfig.barLoverDlg2CanShow);
            jsonGenerator.writeNumberField("barLoverCardInsertMax", barLoverConfig.barLoverCardInsertMax);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverConfig new_() {
        BarLoverConfig barLoverConfig = new BarLoverConfig();
        barLoverConfig.nullCheck();
        return barLoverConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BarLoverConfig mo223809clone() {
        BarLoverConfig barLoverConfig = new BarLoverConfig();
        barLoverConfig.barLoverDlg1MaxShowNoClick = this.barLoverDlg1MaxShowNoClick;
        barLoverConfig.barLoverDlg2CanShow = this.barLoverDlg2CanShow;
        barLoverConfig.barLoverCardInsertMax = this.barLoverCardInsertMax;
        return barLoverConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarLoverConfig)) {
            return false;
        }
        BarLoverConfig barLoverConfig = (BarLoverConfig) obj;
        return this.barLoverDlg1MaxShowNoClick == barLoverConfig.barLoverDlg1MaxShowNoClick && this.barLoverDlg2CanShow == barLoverConfig.barLoverDlg2CanShow && this.barLoverCardInsertMax == barLoverConfig.barLoverCardInsertMax;
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
        int i2 = (((((i * 41) + this.barLoverDlg1MaxShowNoClick) * 41) + (this.barLoverDlg2CanShow ? 1231 : 1237)) * 41) + this.barLoverCardInsertMax;
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
