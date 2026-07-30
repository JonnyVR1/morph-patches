package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.account.data.IntlMoreGenderConfig;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class IntlMoreGenderConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmoregenderconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> disabledMcc;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<IntlMoreGenderConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMoreGenderConfig>() { // from class: com.p1.mobile.putong.account.data.IntlMoreGenderConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMoreGenderConfig intlMoreGenderConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlMoreGenderConfig.enable);
            List<String> list = intlMoreGenderConfig.disabledMcc;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            intlMoreGenderConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMoreGenderConfig parse(nb5 nb5Var) throws IOException {
            IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMoreGenderConfig.disabledMcc != null) {
                        break;
                    }
                    intlMoreGenderConfig.disabledMcc = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    intlMoreGenderConfig.enable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (intlMoreGenderConfig.disabledMcc != null) {
                            break;
                        }
                        intlMoreGenderConfig.disabledMcc = new ArrayList();
                        return intlMoreGenderConfig;
                    }
                    intlMoreGenderConfig.disabledMcc = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlMoreGenderConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMoreGenderConfig intlMoreGenderConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlMoreGenderConfig.enable);
            List<String> list = intlMoreGenderConfig.disabledMcc;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlMoreGenderConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlMoreGenderConfig>() { // from class: com.p1.mobile.putong.account.data.IntlMoreGenderConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMoreGenderConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMoreGenderConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMoreGenderConfig intlMoreGenderConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", intlMoreGenderConfig.enable);
            if (intlMoreGenderConfig.disabledMcc != null) {
                jsonGenerator.writeFieldName("disabledMcc");
                JsonAdapter.serializeArray(intlMoreGenderConfig.disabledMcc, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMoreGenderConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMoreGenderConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m28381a(String str) {
        return str;
    }

    public static IntlMoreGenderConfig new_() {
        IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
        intlMoreGenderConfig.nullCheck();
        return intlMoreGenderConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMoreGenderConfig mo223809clone() {
        IntlMoreGenderConfig intlMoreGenderConfig = new IntlMoreGenderConfig();
        intlMoreGenderConfig.enable = this.enable;
        List<String> list = this.disabledMcc;
        if (list != null) {
            intlMoreGenderConfig.disabledMcc = ValueObject.util_map(list, new w9j() { // from class: l.zko
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlMoreGenderConfig.m28381a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        List<String> list = this.disabledMcc;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.disabledMcc == null) {
            this.disabledMcc = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
