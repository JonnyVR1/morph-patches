package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlProfileInfoConfig intlProfileInfoConfig) {
            List<IntlProfileInfo> list = intlProfileInfoConfig.ethnicity;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IntlProfileInfo> list2 = intlProfileInfoConfig.language;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlProfileInfoConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlProfileInfoConfig parse(nb5 nb5Var) throws IOException {
            IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlProfileInfoConfig.ethnicity == null) {
                        intlProfileInfoConfig.ethnicity = new ArrayList();
                    }
                    if (intlProfileInfoConfig.language != null) {
                        break;
                    }
                    intlProfileInfoConfig.language = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    intlProfileInfoConfig.ethnicity = (List) nb5Var.m158743l(IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (intlProfileInfoConfig.ethnicity == null) {
                            intlProfileInfoConfig.ethnicity = new ArrayList();
                        }
                        if (intlProfileInfoConfig.language != null) {
                            break;
                        }
                        intlProfileInfoConfig.language = new ArrayList();
                        return intlProfileInfoConfig;
                    }
                    intlProfileInfoConfig.language = (List) nb5Var.m158743l(IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlProfileInfoConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlProfileInfoConfig intlProfileInfoConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IntlProfileInfo> list = intlProfileInfoConfig.ethnicity;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IntlProfileInfo> list2 = intlProfileInfoConfig.language;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, IntlProfileInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlProfileInfoConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlProfileInfoConfig>() { // from class: com.p1.mobile.putong.data.IntlProfileInfoConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlProfileInfoConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlProfileInfoConfig newInstance() {
            return new IntlProfileInfoConfig();
        }

        public boolean parseField(IntlProfileInfoConfig intlProfileInfoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
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
            if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE) || str.equals("ethnicity")) {
                return true;
            }
            return super.parseFieldCheck(intlProfileInfoConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlProfileInfoConfig intlProfileInfoConfig, JsonGenerator jsonGenerator) throws IOException {
            if (intlProfileInfoConfig.ethnicity != null) {
                jsonGenerator.writeFieldName("ethnicity");
                JsonAdapter.serializeArray(intlProfileInfoConfig.ethnicity, jsonGenerator, IntlProfileInfo.JSON_ADAPTER);
            }
            if (intlProfileInfoConfig.language != null) {
                jsonGenerator.writeFieldName(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                JsonAdapter.serializeArray(intlProfileInfoConfig.language, jsonGenerator, IntlProfileInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlProfileInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlProfileInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlProfileInfoConfig new_() {
        IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
        intlProfileInfoConfig.nullCheck();
        return intlProfileInfoConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlProfileInfoConfig mo223809clone() {
        IntlProfileInfoConfig intlProfileInfoConfig = new IntlProfileInfoConfig();
        List<IntlProfileInfo> list = this.ethnicity;
        if (list != null) {
            intlProfileInfoConfig.ethnicity = ValueObject.util_map(list, new w9j() { // from class: l.d4p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlProfileInfo) obj).mo223809clone();
                }
            });
        }
        List<IntlProfileInfo> list2 = this.language;
        if (list2 != null) {
            intlProfileInfoConfig.language = ValueObject.util_map(list2, new w9j() { // from class: l.e4p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlProfileInfo) obj).mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IntlProfileInfo> list = this.ethnicity;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IntlProfileInfo> list2 = this.language;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ethnicity == null) {
            this.ethnicity = new ArrayList();
        }
        if (this.language == null) {
            this.language = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
