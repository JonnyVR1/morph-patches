package com.p000p1.mobile.putong.core.data;

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
public class BarLoverConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barloverconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int barLoverCardInsertMax;

    @ProtobufIndex(index = 1)
    public int barLoverDlg1MaxShowNoClick;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean barLoverDlg2CanShow;
    public static ProtobufAdapter<BarLoverConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverConfig>() { // from class: com.p1.mobile.putong.core.data.BarLoverConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BarLoverConfig barLoverConfig) {
            int iH = CodedOutputByteBufferNano.h(1, barLoverConfig.barLoverDlg1MaxShowNoClick) + CodedOutputByteBufferNano.b(2, barLoverConfig.barLoverDlg2CanShow) + CodedOutputByteBufferNano.h(3, barLoverConfig.barLoverCardInsertMax);
            ((MessageNano) barLoverConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BarLoverConfig m11737parse(nb5 nb5Var) throws IOException {
            BarLoverConfig barLoverConfig = new BarLoverConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    barLoverConfig.barLoverDlg1MaxShowNoClick = nb5Var.j();
                } else if (iU == 16) {
                    barLoverConfig.barLoverDlg2CanShow = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return barLoverConfig;
                    }
                    barLoverConfig.barLoverCardInsertMax = nb5Var.j();
                }
            }
        }

        public void serialize(BarLoverConfig barLoverConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, barLoverConfig.barLoverDlg1MaxShowNoClick);
            codedOutputByteBufferNano.A(2, barLoverConfig.barLoverDlg2CanShow);
            codedOutputByteBufferNano.G(3, barLoverConfig.barLoverCardInsertMax);
        }
    };
    public static JsonAdapter<BarLoverConfig> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverConfig>() { // from class: com.p1.mobile.putong.core.data.BarLoverConfig.2
        public Class getDataClass() {
            return BarLoverConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BarLoverConfig m11738newInstance() {
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

        public void serializeFields(BarLoverConfig barLoverConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("barLoverDlg1MaxShowNoClick", barLoverConfig.barLoverDlg1MaxShowNoClick);
            jsonGenerator.writeBooleanField("barLoverDlg2CanShow", barLoverConfig.barLoverDlg2CanShow);
            jsonGenerator.writeNumberField("barLoverCardInsertMax", barLoverConfig.barLoverCardInsertMax);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverConfig new_() {
        BarLoverConfig barLoverConfig = new BarLoverConfig();
        barLoverConfig.nullCheck();
        return barLoverConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BarLoverConfig m11736clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.barLoverDlg1MaxShowNoClick) * 41) + (this.barLoverDlg2CanShow ? 1231 : 1237)) * 41) + this.barLoverCardInsertMax;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
