package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.DlgControlSingleRule;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class DlgControlConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dlgcontrolconfig";

    @ProtobufIndex(index = 1)
    public int one_day_show_max_count;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<DlgControlSingleRule> rules;
    public static ProtobufAdapter<DlgControlConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<DlgControlConfig>() { // from class: com.p1.mobile.putong.data.DlgControlConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DlgControlConfig dlgControlConfig) {
            int iH = CodedOutputByteBufferNano.h(1, dlgControlConfig.one_day_show_max_count);
            List<DlgControlSingleRule> list = dlgControlConfig.rules;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) dlgControlConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DlgControlConfig m17995parse(nb5 nb5Var) throws IOException {
            DlgControlConfig dlgControlConfig = new DlgControlConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dlgControlConfig.rules != null) {
                        break;
                    }
                    dlgControlConfig.rules = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    dlgControlConfig.one_day_show_max_count = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (dlgControlConfig.rules != null) {
                            break;
                        }
                        dlgControlConfig.rules = new ArrayList();
                        return dlgControlConfig;
                    }
                    dlgControlConfig.rules = (List) nb5Var.l(DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return dlgControlConfig;
        }

        public void serialize(DlgControlConfig dlgControlConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, dlgControlConfig.one_day_show_max_count);
            List<DlgControlSingleRule> list = dlgControlConfig.rules;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, DlgControlSingleRule.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DlgControlConfig> JSON_ADAPTER = new ObjectJsonAdapter<DlgControlConfig>() { // from class: com.p1.mobile.putong.data.DlgControlConfig.2
        public Class getDataClass() {
            return DlgControlConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DlgControlConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DlgControlConfig dlgControlConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("one_day_show_max_count", dlgControlConfig.one_day_show_max_count);
            if (dlgControlConfig.rules != null) {
                jsonGenerator.writeFieldName("rules");
                JsonAdapter.serializeArray(dlgControlConfig.rules, jsonGenerator, DlgControlSingleRule.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DlgControlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DlgControlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DlgControlConfig new_() {
        DlgControlConfig dlgControlConfig = new DlgControlConfig();
        dlgControlConfig.nullCheck();
        return dlgControlConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DlgControlConfig m17994clone() {
        DlgControlConfig dlgControlConfig = new DlgControlConfig();
        dlgControlConfig.one_day_show_max_count = this.one_day_show_max_count;
        List<DlgControlSingleRule> list = this.rules;
        if (list != null) {
            dlgControlConfig.rules = ValueObject.util_map(list, new w9j() { // from class: l.t4e
                public final Object call(Object obj) {
                    return ((DlgControlSingleRule) obj).m17997clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.one_day_show_max_count) * 41;
        List<DlgControlSingleRule> list = this.rules;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rules == null) {
            this.rules = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
