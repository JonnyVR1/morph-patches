package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IntlProfileInfo;
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
public class IntlProfileInfoConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlprofileinfoconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IntlProfileInfo> ethnicity;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IntlProfileInfo> language;
    public static ProtobufAdapter<IntlProfileInfoConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlProfileInfoConfig>() { // from class: com.p1.mobile.putong.data.IntlProfileInfoConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlProfileInfoConfig intlProfileInfoConfig) {
            List<IntlProfileInfo> list = intlProfileInfoConfig.ethnicity;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IntlProfileInfo> list2 = intlProfileInfoConfig.language;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlProfileInfoConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlProfileInfoConfig m18256parse(nb5 nb5Var) throws IOException {
            IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlProfileInfoConfig.ethnicity == null) {
                        intlProfileInfoConfig.ethnicity = new ArrayList();
                    }
                    if (intlProfileInfoConfig.language != null) {
                        break;
                    }
                    intlProfileInfoConfig.language = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    intlProfileInfoConfig.ethnicity = (List) nb5Var.l(IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (intlProfileInfoConfig.ethnicity == null) {
                            intlProfileInfoConfig.ethnicity = new ArrayList();
                        }
                        if (intlProfileInfoConfig.language != null) {
                            break;
                        }
                        intlProfileInfoConfig.language = new ArrayList();
                        return intlProfileInfoConfig;
                    }
                    intlProfileInfoConfig.language = (List) nb5Var.l(IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlProfileInfoConfig;
        }

        public void serialize(IntlProfileInfoConfig intlProfileInfoConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IntlProfileInfo> list = intlProfileInfoConfig.ethnicity;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IntlProfileInfo> list2 = intlProfileInfoConfig.language;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlProfileInfoConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlProfileInfoConfig>() { // from class: com.p1.mobile.putong.data.IntlProfileInfoConfig.2
        public Class getDataClass() {
            return IntlProfileInfoConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlProfileInfoConfig mo17830newInstance() {
            return new IntlProfileInfoConfig();
        }

        public boolean parseField(IntlProfileInfoConfig intlProfileInfoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("language")) {
                intlProfileInfoConfig.language = JsonAdapter.parseArray(jsonParser, IntlProfileInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("ethnicity")) {
                return false;
            }
            intlProfileInfoConfig.ethnicity = JsonAdapter.parseArray(jsonParser, IntlProfileInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlProfileInfoConfig intlProfileInfoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("language") || str.equals("ethnicity")) {
                return true;
            }
            return super.parseFieldCheck(intlProfileInfoConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlProfileInfoConfig intlProfileInfoConfig, JsonGenerator jsonGenerator) throws IOException {
            if (intlProfileInfoConfig.ethnicity != null) {
                jsonGenerator.writeFieldName("ethnicity");
                JsonAdapter.serializeArray(intlProfileInfoConfig.ethnicity, jsonGenerator, IntlProfileInfo.JSON_ADAPTER);
            }
            if (intlProfileInfoConfig.language != null) {
                jsonGenerator.writeFieldName("language");
                JsonAdapter.serializeArray(intlProfileInfoConfig.language, jsonGenerator, IntlProfileInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlProfileInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlProfileInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlProfileInfoConfig new_() {
        IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
        intlProfileInfoConfig.nullCheck();
        return intlProfileInfoConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlProfileInfoConfig m18255clone() {
        IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
        List<IntlProfileInfo> list = this.ethnicity;
        if (list != null) {
            intlProfileInfoConfig.ethnicity = ValueObject.util_map(list, new w9j() { // from class: l.d4p
                public final Object call(Object obj) {
                    return ((IntlProfileInfo) obj).m18252clone();
                }
            });
        }
        List<IntlProfileInfo> list2 = this.language;
        if (list2 != null) {
            intlProfileInfoConfig.language = ValueObject.util_map(list2, new w9j() { // from class: l.e4p
                public final Object call(Object obj) {
                    return ((IntlProfileInfo) obj).m18252clone();
                }
            });
        }
        return intlProfileInfoConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlProfileInfoConfig)) {
            return false;
        }
        IntlProfileInfoConfig intlProfileInfoConfig = (IntlProfileInfoConfig) obj;
        return ValueObject.util_equals(this.ethnicity, intlProfileInfoConfig.ethnicity) && ValueObject.util_equals(this.language, intlProfileInfoConfig.language);
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
        List<IntlProfileInfo> list = this.ethnicity;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IntlProfileInfo> list2 = this.language;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.ethnicity == null) {
            this.ethnicity = new ArrayList();
        }
        if (this.language == null) {
            this.language = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
