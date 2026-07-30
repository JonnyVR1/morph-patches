package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.NativeConfig;
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

/* JADX INFO: loaded from: classes10.dex */
public class IntlInnerWebPayConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinnerwebpayconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public String method;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<NativeConfig> nativeConfigs;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subscriptionHomePage;

    @Nullable
    @ProtobufIndex(index = 1)
    public ThirdPartConfig thirdPartConfig;
    public static ProtobufAdapter<IntlInnerWebPayConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInnerWebPayConfig>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPayConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlInnerWebPayConfig intlInnerWebPayConfig) {
            ThirdPartConfig thirdPartConfig = intlInnerWebPayConfig.thirdPartConfig;
            int iM17230l = thirdPartConfig != null ? CodedOutputByteBufferNano.m17230l(1, thirdPartConfig, ThirdPartConfig.PROTOBUF_ADAPTER) : 0;
            List<NativeConfig> list = intlInnerWebPayConfig.nativeConfigs;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list, NativeConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = intlInnerWebPayConfig.method;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            String str2 = intlInnerWebPayConfig.subscriptionHomePage;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            intlInnerWebPayConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlInnerWebPayConfig parse(nb5 nb5Var) throws IOException {
            IntlInnerWebPayConfig intlInnerWebPayConfig = new IntlInnerWebPayConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlInnerWebPayConfig.method == null) {
                        intlInnerWebPayConfig.method = "";
                    }
                    if (intlInnerWebPayConfig.subscriptionHomePage != null) {
                        break;
                    }
                    intlInnerWebPayConfig.subscriptionHomePage = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlInnerWebPayConfig.thirdPartConfig = (ThirdPartConfig) nb5Var.m158743l(ThirdPartConfig.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    intlInnerWebPayConfig.nativeConfigs = (List) nb5Var.m158743l(NativeConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    intlInnerWebPayConfig.method = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (intlInnerWebPayConfig.method == null) {
                            intlInnerWebPayConfig.method = "";
                        }
                        if (intlInnerWebPayConfig.subscriptionHomePage != null) {
                            break;
                        }
                        intlInnerWebPayConfig.subscriptionHomePage = "";
                        return intlInnerWebPayConfig;
                    }
                    intlInnerWebPayConfig.subscriptionHomePage = nb5Var.m158750s();
                }
            }
            return intlInnerWebPayConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlInnerWebPayConfig intlInnerWebPayConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ThirdPartConfig thirdPartConfig = intlInnerWebPayConfig.thirdPartConfig;
            if (thirdPartConfig != null) {
                codedOutputByteBufferNano.m17254K(1, thirdPartConfig, ThirdPartConfig.PROTOBUF_ADAPTER);
            }
            List<NativeConfig> list = intlInnerWebPayConfig.nativeConfigs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, NativeConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = intlInnerWebPayConfig.method;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            String str2 = intlInnerWebPayConfig.subscriptionHomePage;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
        }
    };
    public static JsonAdapter<IntlInnerWebPayConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlInnerWebPayConfig>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPayConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlInnerWebPayConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlInnerWebPayConfig newInstance() {
            return new IntlInnerWebPayConfig();
        }

        public boolean parseField(IntlInnerWebPayConfig intlInnerWebPayConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "method":
                    intlInnerWebPayConfig.method = jsonParser.getValueAsString();
                    return true;
                case "subscriptionHomePage":
                    intlInnerWebPayConfig.subscriptionHomePage = jsonParser.getValueAsString();
                    return true;
                case "nativeConfigs":
                    intlInnerWebPayConfig.nativeConfigs = JsonAdapter.parseArray(jsonParser, NativeConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "thirdPartConfig":
                    intlInnerWebPayConfig.thirdPartConfig = ThirdPartConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlInnerWebPayConfig intlInnerWebPayConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "method":
                case "subscriptionHomePage":
                case "nativeConfigs":
                case "thirdPartConfig":
                    return true;
                default:
                    return super.parseFieldCheck(intlInnerWebPayConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlInnerWebPayConfig intlInnerWebPayConfig, JsonGenerator jsonGenerator) throws IOException {
            if (intlInnerWebPayConfig.thirdPartConfig != null) {
                jsonGenerator.writeFieldName("thirdPartConfig");
                ThirdPartConfig.JSON_ADAPTER.serialize(intlInnerWebPayConfig.thirdPartConfig, jsonGenerator, true);
            }
            if (intlInnerWebPayConfig.nativeConfigs != null) {
                jsonGenerator.writeFieldName("nativeConfigs");
                JsonAdapter.serializeArray(intlInnerWebPayConfig.nativeConfigs, jsonGenerator, NativeConfig.JSON_ADAPTER);
            }
            String str = intlInnerWebPayConfig.method;
            if (str != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.METHOD, str);
            }
            String str2 = intlInnerWebPayConfig.subscriptionHomePage;
            if (str2 != null) {
                jsonGenerator.writeStringField("subscriptionHomePage", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInnerWebPayConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInnerWebPayConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlInnerWebPayConfig new_() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = new IntlInnerWebPayConfig();
        intlInnerWebPayConfig.nullCheck();
        return intlInnerWebPayConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlInnerWebPayConfig mo223809clone() {
        IntlInnerWebPayConfig intlInnerWebPayConfig = new IntlInnerWebPayConfig();
        ThirdPartConfig thirdPartConfig = this.thirdPartConfig;
        if (thirdPartConfig != null) {
            intlInnerWebPayConfig.thirdPartConfig = thirdPartConfig.mo223809clone();
        }
        List<NativeConfig> list = this.nativeConfigs;
        if (list != null) {
            intlInnerWebPayConfig.nativeConfigs = ValueObject.util_map(list, new w9j() { // from class: l.kpn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NativeConfig) obj).mo223809clone();
                }
            });
        }
        intlInnerWebPayConfig.method = this.method;
        intlInnerWebPayConfig.subscriptionHomePage = this.subscriptionHomePage;
        return intlInnerWebPayConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlInnerWebPayConfig)) {
            return false;
        }
        IntlInnerWebPayConfig intlInnerWebPayConfig = (IntlInnerWebPayConfig) obj;
        return ValueObject.util_equals(this.thirdPartConfig, intlInnerWebPayConfig.thirdPartConfig) && ValueObject.util_equals(this.nativeConfigs, intlInnerWebPayConfig.nativeConfigs) && ValueObject.util_equals(this.method, intlInnerWebPayConfig.method) && ValueObject.util_equals(this.subscriptionHomePage, intlInnerWebPayConfig.subscriptionHomePage);
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
        ThirdPartConfig thirdPartConfig = this.thirdPartConfig;
        int iHashCode = (i2 + (thirdPartConfig != null ? thirdPartConfig.hashCode() : 0)) * 41;
        List<NativeConfig> list = this.nativeConfigs;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.method;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subscriptionHomePage;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.method == null) {
            this.method = "";
        }
        if (this.subscriptionHomePage == null) {
            this.subscriptionHomePage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
