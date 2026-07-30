package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.account.data.IntlMoreGenderConfig;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlMoreGenderConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmoregenderconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> disabledMcc;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<IntlMoreGenderConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMoreGenderConfig>() { // from class: com.p1.mobile.putong.account.data.IntlMoreGenderConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMoreGenderConfig intlMoreGenderConfig) {
            int iB = CodedOutputByteBufferNano.b(1, intlMoreGenderConfig.enable);
            List<String> list = intlMoreGenderConfig.disabledMcc;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlMoreGenderConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMoreGenderConfig m28923parse(nb5 nb5Var) throws IOException {
            IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMoreGenderConfig.disabledMcc != null) {
                        break;
                    }
                    intlMoreGenderConfig.disabledMcc = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    intlMoreGenderConfig.enable = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (intlMoreGenderConfig.disabledMcc != null) {
                            break;
                        }
                        intlMoreGenderConfig.disabledMcc = new ArrayList();
                        return intlMoreGenderConfig;
                    }
                    intlMoreGenderConfig.disabledMcc = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlMoreGenderConfig;
        }

        public void serialize(IntlMoreGenderConfig intlMoreGenderConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlMoreGenderConfig.enable);
            List<String> list = intlMoreGenderConfig.disabledMcc;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlMoreGenderConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlMoreGenderConfig>() { // from class: com.p1.mobile.putong.account.data.IntlMoreGenderConfig.2
        public Class getDataClass() {
            return IntlMoreGenderConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMoreGenderConfig m28924newInstance() {
            return new IntlMoreGenderConfig();
        }

        public boolean parseField(IntlMoreGenderConfig intlMoreGenderConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                intlMoreGenderConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("disabledMcc")) {
                return false;
            }
            intlMoreGenderConfig.disabledMcc = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlMoreGenderConfig intlMoreGenderConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("disabledMcc")) {
                return true;
            }
            return super.parseFieldCheck(intlMoreGenderConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlMoreGenderConfig intlMoreGenderConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", intlMoreGenderConfig.enable);
            if (intlMoreGenderConfig.disabledMcc != null) {
                jsonGenerator.writeFieldName("disabledMcc");
                JsonAdapter.serializeArray(intlMoreGenderConfig.disabledMcc, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMoreGenderConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMoreGenderConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m276a(String str) {
        return str;
    }

    public static IntlMoreGenderConfig new_() {
        IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
        intlMoreGenderConfig.nullCheck();
        return intlMoreGenderConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMoreGenderConfig m28922clone() {
        IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
        intlMoreGenderConfig.enable = this.enable;
        List<String> list = this.disabledMcc;
        if (list != null) {
            intlMoreGenderConfig.disabledMcc = ValueObject.util_map(list, new w9j() { // from class: l.zko
                public final Object call(Object obj) {
                    return IntlMoreGenderConfig.m276a((String) obj);
                }
            });
        }
        return intlMoreGenderConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMoreGenderConfig)) {
            return false;
        }
        IntlMoreGenderConfig intlMoreGenderConfig = (IntlMoreGenderConfig) obj;
        return this.enable == intlMoreGenderConfig.enable && ValueObject.util_equals(this.disabledMcc, intlMoreGenderConfig.disabledMcc);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        List<String> list = this.disabledMcc;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.disabledMcc == null) {
            this.disabledMcc = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
