package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.NewCustomerPromotionConfig;
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
public class NewCustomerPromotionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcustomerpromotionconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String couponId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String privilegeBannerText;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> privilegeSwitchTexts;

    @NonNull
    @ProtobufIndex(index = 3)
    public String privilegeText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String purchaseButtonText;

    @NonNull
    @ProtobufIndex(index = 5)
    public NewCustomerPromotionConfigItem purchaseItem;
    public static ProtobufAdapter<NewCustomerPromotionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCustomerPromotionConfig>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewCustomerPromotionConfig newCustomerPromotionConfig) {
            String str = newCustomerPromotionConfig.couponId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = newCustomerPromotionConfig.purchaseButtonText;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = newCustomerPromotionConfig.privilegeText;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = newCustomerPromotionConfig.privilegeBannerText;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = newCustomerPromotionConfig.purchaseItem;
            if (newCustomerPromotionConfigItem != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, newCustomerPromotionConfigItem, NewCustomerPromotionConfigItem.PROTOBUF_ADAPTER);
            }
            List<String> list = newCustomerPromotionConfig.privilegeSwitchTexts;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            newCustomerPromotionConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewCustomerPromotionConfig parse(nb5 nb5Var) throws IOException {
            NewCustomerPromotionConfig newCustomerPromotionConfig = new NewCustomerPromotionConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newCustomerPromotionConfig.couponId == null) {
                        newCustomerPromotionConfig.couponId = "";
                    }
                    if (newCustomerPromotionConfig.purchaseButtonText == null) {
                        newCustomerPromotionConfig.purchaseButtonText = "";
                    }
                    if (newCustomerPromotionConfig.privilegeText == null) {
                        newCustomerPromotionConfig.privilegeText = "";
                    }
                    if (newCustomerPromotionConfig.privilegeBannerText == null) {
                        newCustomerPromotionConfig.privilegeBannerText = "";
                    }
                    if (newCustomerPromotionConfig.purchaseItem == null) {
                        newCustomerPromotionConfig.purchaseItem = NewCustomerPromotionConfigItem.new_();
                    }
                    if (newCustomerPromotionConfig.privilegeSwitchTexts != null) {
                        break;
                    }
                    newCustomerPromotionConfig.privilegeSwitchTexts = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    newCustomerPromotionConfig.couponId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    newCustomerPromotionConfig.purchaseButtonText = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    newCustomerPromotionConfig.privilegeText = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    newCustomerPromotionConfig.privilegeBannerText = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    newCustomerPromotionConfig.purchaseItem = (NewCustomerPromotionConfigItem) nb5Var.m158743l(NewCustomerPromotionConfigItem.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (newCustomerPromotionConfig.couponId == null) {
                            newCustomerPromotionConfig.couponId = "";
                        }
                        if (newCustomerPromotionConfig.purchaseButtonText == null) {
                            newCustomerPromotionConfig.purchaseButtonText = "";
                        }
                        if (newCustomerPromotionConfig.privilegeText == null) {
                            newCustomerPromotionConfig.privilegeText = "";
                        }
                        if (newCustomerPromotionConfig.privilegeBannerText == null) {
                            newCustomerPromotionConfig.privilegeBannerText = "";
                        }
                        if (newCustomerPromotionConfig.purchaseItem == null) {
                            newCustomerPromotionConfig.purchaseItem = NewCustomerPromotionConfigItem.new_();
                        }
                        if (newCustomerPromotionConfig.privilegeSwitchTexts != null) {
                            break;
                        }
                        newCustomerPromotionConfig.privilegeSwitchTexts = new ArrayList();
                        return newCustomerPromotionConfig;
                    }
                    newCustomerPromotionConfig.privilegeSwitchTexts = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return newCustomerPromotionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewCustomerPromotionConfig newCustomerPromotionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newCustomerPromotionConfig.couponId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = newCustomerPromotionConfig.purchaseButtonText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = newCustomerPromotionConfig.privilegeText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = newCustomerPromotionConfig.privilegeBannerText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = newCustomerPromotionConfig.purchaseItem;
            if (newCustomerPromotionConfigItem != null) {
                codedOutputByteBufferNano.m17254K(5, newCustomerPromotionConfigItem, NewCustomerPromotionConfigItem.PROTOBUF_ADAPTER);
            }
            List<String> list = newCustomerPromotionConfig.privilegeSwitchTexts;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NewCustomerPromotionConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewCustomerPromotionConfig>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewCustomerPromotionConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewCustomerPromotionConfig newInstance() {
            return new NewCustomerPromotionConfig();
        }

        public boolean parseField(NewCustomerPromotionConfig newCustomerPromotionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchaseItem":
                    newCustomerPromotionConfig.purchaseItem = NewCustomerPromotionConfigItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "privilegeText":
                    newCustomerPromotionConfig.privilegeText = jsonParser.getValueAsString();
                    return true;
                case "privilegeBannerText":
                    newCustomerPromotionConfig.privilegeBannerText = jsonParser.getValueAsString();
                    return true;
                case "couponId":
                    newCustomerPromotionConfig.couponId = jsonParser.getValueAsString();
                    return true;
                case "purchaseButtonText":
                    newCustomerPromotionConfig.purchaseButtonText = jsonParser.getValueAsString();
                    return true;
                case "privilegeSwitchTexts":
                    newCustomerPromotionConfig.privilegeSwitchTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewCustomerPromotionConfig newCustomerPromotionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "purchaseItem":
                case "privilegeText":
                case "privilegeBannerText":
                case "couponId":
                case "purchaseButtonText":
                case "privilegeSwitchTexts":
                    return true;
                default:
                    return super.parseFieldCheck(newCustomerPromotionConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewCustomerPromotionConfig newCustomerPromotionConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = newCustomerPromotionConfig.couponId;
            if (str != null) {
                jsonGenerator.writeStringField("couponId", str);
            }
            String str2 = newCustomerPromotionConfig.purchaseButtonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("purchaseButtonText", str2);
            }
            String str3 = newCustomerPromotionConfig.privilegeText;
            if (str3 != null) {
                jsonGenerator.writeStringField("privilegeText", str3);
            }
            String str4 = newCustomerPromotionConfig.privilegeBannerText;
            if (str4 != null) {
                jsonGenerator.writeStringField("privilegeBannerText", str4);
            }
            if (newCustomerPromotionConfig.purchaseItem != null) {
                jsonGenerator.writeFieldName("purchaseItem");
                NewCustomerPromotionConfigItem.JSON_ADAPTER.serialize(newCustomerPromotionConfig.purchaseItem, jsonGenerator, true);
            }
            if (newCustomerPromotionConfig.privilegeSwitchTexts != null) {
                jsonGenerator.writeFieldName("privilegeSwitchTexts");
                JsonAdapter.serializeArray(newCustomerPromotionConfig.privilegeSwitchTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCustomerPromotionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCustomerPromotionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35717a(String str) {
        return str;
    }

    public static NewCustomerPromotionConfig new_() {
        NewCustomerPromotionConfig newCustomerPromotionConfig = new NewCustomerPromotionConfig();
        newCustomerPromotionConfig.nullCheck();
        return newCustomerPromotionConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewCustomerPromotionConfig mo223809clone() {
        NewCustomerPromotionConfig newCustomerPromotionConfig = new NewCustomerPromotionConfig();
        newCustomerPromotionConfig.couponId = this.couponId;
        newCustomerPromotionConfig.purchaseButtonText = this.purchaseButtonText;
        newCustomerPromotionConfig.privilegeText = this.privilegeText;
        newCustomerPromotionConfig.privilegeBannerText = this.privilegeBannerText;
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = this.purchaseItem;
        if (newCustomerPromotionConfigItem != null) {
            newCustomerPromotionConfig.purchaseItem = newCustomerPromotionConfigItem.mo223809clone();
        }
        List<String> list = this.privilegeSwitchTexts;
        if (list != null) {
            newCustomerPromotionConfig.privilegeSwitchTexts = ValueObject.util_map(list, new w9j() { // from class: l.dm20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewCustomerPromotionConfig.m35717a((String) obj);
                }
            });
        }
        return newCustomerPromotionConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewCustomerPromotionConfig)) {
            return false;
        }
        NewCustomerPromotionConfig newCustomerPromotionConfig = (NewCustomerPromotionConfig) obj;
        return ValueObject.util_equals(this.couponId, newCustomerPromotionConfig.couponId) && ValueObject.util_equals(this.purchaseButtonText, newCustomerPromotionConfig.purchaseButtonText) && ValueObject.util_equals(this.privilegeText, newCustomerPromotionConfig.privilegeText) && ValueObject.util_equals(this.privilegeBannerText, newCustomerPromotionConfig.privilegeBannerText) && ValueObject.util_equals(this.purchaseItem, newCustomerPromotionConfig.purchaseItem) && ValueObject.util_equals(this.privilegeSwitchTexts, newCustomerPromotionConfig.privilegeSwitchTexts);
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
        String str = this.couponId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.purchaseButtonText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.privilegeText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.privilegeBannerText;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = this.purchaseItem;
        int iHashCode5 = (iHashCode4 + (newCustomerPromotionConfigItem != null ? newCustomerPromotionConfigItem.hashCode() : 0)) * 41;
        List<String> list = this.privilegeSwitchTexts;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.couponId == null) {
            this.couponId = "";
        }
        if (this.purchaseButtonText == null) {
            this.purchaseButtonText = "";
        }
        if (this.privilegeText == null) {
            this.privilegeText = "";
        }
        if (this.privilegeBannerText == null) {
            this.privilegeBannerText = "";
        }
        if (this.purchaseItem == null) {
            this.purchaseItem = NewCustomerPromotionConfigItem.new_();
        }
        if (this.privilegeSwitchTexts == null) {
            this.privilegeSwitchTexts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
