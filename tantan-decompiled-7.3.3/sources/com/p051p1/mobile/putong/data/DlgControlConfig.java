package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.DlgControlSingleRule;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class DlgControlConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dlgcontrolconfig";

    @ProtobufIndex(index = 1)
    public int one_day_show_max_count;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<DlgControlSingleRule> rules;
    public static ProtobufAdapter<DlgControlConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<DlgControlConfig>() { // from class: com.p1.mobile.putong.data.DlgControlConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DlgControlConfig dlgControlConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, dlgControlConfig.one_day_show_max_count);
            List<DlgControlSingleRule> list = dlgControlConfig.rules;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            dlgControlConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DlgControlConfig parse(nc5 nc5Var) throws IOException {
            DlgControlConfig dlgControlConfig = new DlgControlConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (dlgControlConfig.rules != null) {
                        break;
                    }
                    dlgControlConfig.rules = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    dlgControlConfig.one_day_show_max_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (dlgControlConfig.rules != null) {
                            break;
                        }
                        dlgControlConfig.rules = new ArrayList();
                        return dlgControlConfig;
                    }
                    dlgControlConfig.rules = (List) nc5Var.m162488l(DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return dlgControlConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DlgControlConfig dlgControlConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, dlgControlConfig.one_day_show_max_count);
            List<DlgControlSingleRule> list = dlgControlConfig.rules;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DlgControlConfig> JSON_ADAPTER = new ObjectJsonAdapter<DlgControlConfig>() { // from class: com.p1.mobile.putong.data.DlgControlConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DlgControlConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DlgControlConfig newInstance() {
            return new DlgControlConfig();
        }

        public boolean parseField(DlgControlConfig dlgControlConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                dlgControlConfig.rules = JsonAdapter.parseArray(jsonParser, DlgControlSingleRule.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("one_day_show_max_count")) {
                return false;
            }
            dlgControlConfig.one_day_show_max_count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(DlgControlConfig dlgControlConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rules") || str.equals("one_day_show_max_count")) {
                return true;
            }
            return super.parseFieldCheck(dlgControlConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DlgControlConfig dlgControlConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("one_day_show_max_count", dlgControlConfig.one_day_show_max_count);
            if (dlgControlConfig.rules != null) {
                jsonGenerator.writeFieldName("rules");
                JsonAdapter.serializeArray(dlgControlConfig.rules, jsonGenerator, DlgControlSingleRule.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DlgControlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DlgControlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DlgControlConfig new_() {
        DlgControlConfig dlgControlConfig = new DlgControlConfig();
        dlgControlConfig.nullCheck();
        return dlgControlConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DlgControlConfig mo225055clone() {
        DlgControlConfig dlgControlConfig = new DlgControlConfig();
        dlgControlConfig.one_day_show_max_count = this.one_day_show_max_count;
        List<DlgControlSingleRule> list = this.rules;
        if (list != null) {
            dlgControlConfig.rules = ValueObject.util_map(list, new qcj() { // from class: l.h6e
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DlgControlSingleRule) obj).mo225055clone();
                }
            });
        }
        return dlgControlConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DlgControlConfig)) {
            return false;
        }
        DlgControlConfig dlgControlConfig = (DlgControlConfig) obj;
        return this.one_day_show_max_count == dlgControlConfig.one_day_show_max_count && ValueObject.util_equals(this.rules, dlgControlConfig.rules);
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
        int i2 = ((i * 41) + this.one_day_show_max_count) * 41;
        List<DlgControlSingleRule> list = this.rules;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rules == null) {
            this.rules = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
