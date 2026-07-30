package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class NativeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nativeconfig";

    @NonNull
    @ProtobufIndex(index = 6)
    public String btnBgColor;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String btnDesc;

    @NonNull
    @ProtobufIndex(index = 8)
    public String btnTextColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = 7)
    public String defaultQueryType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String payType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String platform;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String redirectType;
    public static ProtobufAdapter<NativeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NativeConfig>() { // from class: com.p1.mobile.putong.core.data.NativeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NativeConfig nativeConfig) {
            String str = nativeConfig.platform;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = nativeConfig.payType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = nativeConfig.redirectType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = nativeConfig.currencyCode;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = nativeConfig.btnDesc;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = nativeConfig.btnBgColor;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = nativeConfig.defaultQueryType;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = nativeConfig.btnTextColor;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            ((MessageNano) nativeConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NativeConfig m14471parse(nb5 nb5Var) throws IOException {
            NativeConfig nativeConfig = new NativeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nativeConfig.platform == null) {
                        nativeConfig.platform = "";
                    }
                    if (nativeConfig.payType == null) {
                        nativeConfig.payType = "";
                    }
                    if (nativeConfig.redirectType == null) {
                        nativeConfig.redirectType = "";
                    }
                    if (nativeConfig.currencyCode == null) {
                        nativeConfig.currencyCode = "";
                    }
                    if (nativeConfig.btnDesc == null) {
                        nativeConfig.btnDesc = "";
                    }
                    if (nativeConfig.btnBgColor == null) {
                        nativeConfig.btnBgColor = "";
                    }
                    if (nativeConfig.defaultQueryType == null) {
                        nativeConfig.defaultQueryType = "";
                    }
                    if (nativeConfig.btnTextColor != null) {
                        break;
                    }
                    nativeConfig.btnTextColor = "";
                    break;
                }
                if (iU == 10) {
                    nativeConfig.platform = nb5Var.s();
                } else if (iU == 18) {
                    nativeConfig.payType = nb5Var.s();
                } else if (iU == 26) {
                    nativeConfig.redirectType = nb5Var.s();
                } else if (iU == 34) {
                    nativeConfig.currencyCode = nb5Var.s();
                } else if (iU == 42) {
                    nativeConfig.btnDesc = nb5Var.s();
                } else if (iU == 50) {
                    nativeConfig.btnBgColor = nb5Var.s();
                } else if (iU == 58) {
                    nativeConfig.defaultQueryType = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (nativeConfig.platform == null) {
                            nativeConfig.platform = "";
                        }
                        if (nativeConfig.payType == null) {
                            nativeConfig.payType = "";
                        }
                        if (nativeConfig.redirectType == null) {
                            nativeConfig.redirectType = "";
                        }
                        if (nativeConfig.currencyCode == null) {
                            nativeConfig.currencyCode = "";
                        }
                        if (nativeConfig.btnDesc == null) {
                            nativeConfig.btnDesc = "";
                        }
                        if (nativeConfig.btnBgColor == null) {
                            nativeConfig.btnBgColor = "";
                        }
                        if (nativeConfig.defaultQueryType == null) {
                            nativeConfig.defaultQueryType = "";
                        }
                        if (nativeConfig.btnTextColor != null) {
                            break;
                        }
                        nativeConfig.btnTextColor = "";
                        return nativeConfig;
                    }
                    nativeConfig.btnTextColor = nb5Var.s();
                }
            }
            return nativeConfig;
        }

        public void serialize(NativeConfig nativeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nativeConfig.platform;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = nativeConfig.payType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = nativeConfig.redirectType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = nativeConfig.currencyCode;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = nativeConfig.btnDesc;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = nativeConfig.btnBgColor;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = nativeConfig.defaultQueryType;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = nativeConfig.btnTextColor;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
        }
    };
    public static JsonAdapter<NativeConfig> JSON_ADAPTER = new ObjectJsonAdapter<NativeConfig>() { // from class: com.p1.mobile.putong.core.data.NativeConfig.2
        public Class getDataClass() {
            return NativeConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NativeConfig m14472newInstance() {
            return new NativeConfig();
        }

        public boolean parseField(NativeConfig nativeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "btnTextColor":
                    nativeConfig.btnTextColor = jsonParser.getValueAsString();
                    return true;
                case "btnBgColor":
                    nativeConfig.btnBgColor = jsonParser.getValueAsString();
                    return true;
                case "payType":
                    nativeConfig.payType = jsonParser.getValueAsString();
                    return true;
                case "defaultQueryType":
                    nativeConfig.defaultQueryType = jsonParser.getValueAsString();
                    return true;
                case "btnDesc":
                    nativeConfig.btnDesc = jsonParser.getValueAsString();
                    return true;
                case "redirectType":
                    nativeConfig.redirectType = jsonParser.getValueAsString();
                    return true;
                case "currencyCode":
                    nativeConfig.currencyCode = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    nativeConfig.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NativeConfig nativeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "btnTextColor":
                case "btnBgColor":
                case "payType":
                case "defaultQueryType":
                case "btnDesc":
                case "redirectType":
                case "currencyCode":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(nativeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NativeConfig nativeConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = nativeConfig.platform;
            if (str != null) {
                jsonGenerator.writeStringField("platform", str);
            }
            String str2 = nativeConfig.payType;
            if (str2 != null) {
                jsonGenerator.writeStringField("payType", str2);
            }
            String str3 = nativeConfig.redirectType;
            if (str3 != null) {
                jsonGenerator.writeStringField("redirectType", str3);
            }
            String str4 = nativeConfig.currencyCode;
            if (str4 != null) {
                jsonGenerator.writeStringField("currencyCode", str4);
            }
            String str5 = nativeConfig.btnDesc;
            if (str5 != null) {
                jsonGenerator.writeStringField("btnDesc", str5);
            }
            String str6 = nativeConfig.btnBgColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("btnBgColor", str6);
            }
            String str7 = nativeConfig.defaultQueryType;
            if (str7 != null) {
                jsonGenerator.writeStringField("defaultQueryType", str7);
            }
            String str8 = nativeConfig.btnTextColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("btnTextColor", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NativeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NativeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NativeConfig new_() {
        NativeConfig nativeConfig = new NativeConfig();
        nativeConfig.nullCheck();
        return nativeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NativeConfig m14470clone() {
        NativeConfig nativeConfig = new NativeConfig();
        nativeConfig.platform = this.platform;
        nativeConfig.payType = this.payType;
        nativeConfig.redirectType = this.redirectType;
        nativeConfig.currencyCode = this.currencyCode;
        nativeConfig.btnDesc = this.btnDesc;
        nativeConfig.btnBgColor = this.btnBgColor;
        nativeConfig.defaultQueryType = this.defaultQueryType;
        nativeConfig.btnTextColor = this.btnTextColor;
        return nativeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeConfig)) {
            return false;
        }
        NativeConfig nativeConfig = (NativeConfig) obj;
        return ValueObject.util_equals(this.platform, nativeConfig.platform) && ValueObject.util_equals(this.payType, nativeConfig.payType) && ValueObject.util_equals(this.redirectType, nativeConfig.redirectType) && ValueObject.util_equals(this.currencyCode, nativeConfig.currencyCode) && ValueObject.util_equals(this.btnDesc, nativeConfig.btnDesc) && ValueObject.util_equals(this.btnBgColor, nativeConfig.btnBgColor) && ValueObject.util_equals(this.defaultQueryType, nativeConfig.defaultQueryType) && ValueObject.util_equals(this.btnTextColor, nativeConfig.btnTextColor);
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
        String str = this.platform;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.payType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.redirectType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.currencyCode;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.btnDesc;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.btnBgColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.defaultQueryType;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.btnTextColor;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.payType == null) {
            this.payType = "";
        }
        if (this.redirectType == null) {
            this.redirectType = "";
        }
        if (this.currencyCode == null) {
            this.currencyCode = "";
        }
        if (this.btnDesc == null) {
            this.btnDesc = "";
        }
        if (this.btnBgColor == null) {
            this.btnBgColor = "";
        }
        if (this.defaultQueryType == null) {
            this.defaultQueryType = "";
        }
        if (this.btnTextColor == null) {
            this.btnTextColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
