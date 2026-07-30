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
public class DlgControlSingleRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dlgcontrolsinglerule";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 3)
    public int freezing_time;

    @ProtobufIndex(index = 1)
    public int time_interval;
    public static ProtobufAdapter<DlgControlSingleRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<DlgControlSingleRule>() { // from class: com.p1.mobile.putong.data.DlgControlSingleRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DlgControlSingleRule dlgControlSingleRule) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, dlgControlSingleRule.time_interval) + CodedOutputByteBufferNano.m17226h(2, dlgControlSingleRule.count) + CodedOutputByteBufferNano.m17226h(3, dlgControlSingleRule.freezing_time);
            dlgControlSingleRule.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DlgControlSingleRule parse(nb5 nb5Var) throws IOException {
            DlgControlSingleRule dlgControlSingleRule = new DlgControlSingleRule();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    dlgControlSingleRule.time_interval = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    dlgControlSingleRule.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return dlgControlSingleRule;
                    }
                    dlgControlSingleRule.freezing_time = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DlgControlSingleRule dlgControlSingleRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, dlgControlSingleRule.time_interval);
            codedOutputByteBufferNano.m17250G(2, dlgControlSingleRule.count);
            codedOutputByteBufferNano.m17250G(3, dlgControlSingleRule.freezing_time);
        }
    };
    public static JsonAdapter<DlgControlSingleRule> JSON_ADAPTER = new ObjectJsonAdapter<DlgControlSingleRule>() { // from class: com.p1.mobile.putong.data.DlgControlSingleRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DlgControlSingleRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DlgControlSingleRule newInstance() {
            return new DlgControlSingleRule();
        }

        public boolean parseField(DlgControlSingleRule dlgControlSingleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "count":
                    dlgControlSingleRule.count = jsonParser.getValueAsInt();
                    return true;
                case "time_interval":
                    dlgControlSingleRule.time_interval = jsonParser.getValueAsInt();
                    return true;
                case "freezing_time":
                    dlgControlSingleRule.freezing_time = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DlgControlSingleRule dlgControlSingleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "count":
                case "time_interval":
                case "freezing_time":
                    return true;
                default:
                    return super.parseFieldCheck(dlgControlSingleRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DlgControlSingleRule dlgControlSingleRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("time_interval", dlgControlSingleRule.time_interval);
            jsonGenerator.writeNumberField("count", dlgControlSingleRule.count);
            jsonGenerator.writeNumberField("freezing_time", dlgControlSingleRule.freezing_time);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DlgControlSingleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DlgControlSingleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DlgControlSingleRule new_() {
        DlgControlSingleRule dlgControlSingleRule = new DlgControlSingleRule();
        dlgControlSingleRule.nullCheck();
        return dlgControlSingleRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DlgControlSingleRule mo223809clone() {
        DlgControlSingleRule dlgControlSingleRule = new DlgControlSingleRule();
        dlgControlSingleRule.time_interval = this.time_interval;
        dlgControlSingleRule.count = this.count;
        dlgControlSingleRule.freezing_time = this.freezing_time;
        return dlgControlSingleRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DlgControlSingleRule)) {
            return false;
        }
        DlgControlSingleRule dlgControlSingleRule = (DlgControlSingleRule) obj;
        return this.time_interval == dlgControlSingleRule.time_interval && this.count == dlgControlSingleRule.count && this.freezing_time == dlgControlSingleRule.freezing_time;
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
        int i2 = (((((i * 41) + this.time_interval) * 41) + this.count) * 41) + this.freezing_time;
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
