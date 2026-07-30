package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketResponseOptionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketresponseoptiondata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String desc_in_popup;

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc_in_result;

    @ProtobufIndex(index = 1)
    public int option;

    @NonNull
    @ProtobufIndex(index = 2)
    public String option_image_url;
    public static ProtobufAdapter<IntlMarketResponseOptionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketResponseOptionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseOptionData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketResponseOptionData intlMarketResponseOptionData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, intlMarketResponseOptionData.option);
            String str = intlMarketResponseOptionData.option_image_url;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = intlMarketResponseOptionData.desc_in_result;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = intlMarketResponseOptionData.desc_in_popup;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            intlMarketResponseOptionData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketResponseOptionData parse(nb5 nb5Var) throws IOException {
            IntlMarketResponseOptionData intlMarketResponseOptionData = new IntlMarketResponseOptionData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketResponseOptionData.option_image_url == null) {
                        intlMarketResponseOptionData.option_image_url = "";
                    }
                    if (intlMarketResponseOptionData.desc_in_result == null) {
                        intlMarketResponseOptionData.desc_in_result = "";
                    }
                    if (intlMarketResponseOptionData.desc_in_popup != null) {
                        break;
                    }
                    intlMarketResponseOptionData.desc_in_popup = "";
                    break;
                }
                if (iM158752u == 8) {
                    intlMarketResponseOptionData.option = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    intlMarketResponseOptionData.option_image_url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlMarketResponseOptionData.desc_in_result = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (intlMarketResponseOptionData.option_image_url == null) {
                            intlMarketResponseOptionData.option_image_url = "";
                        }
                        if (intlMarketResponseOptionData.desc_in_result == null) {
                            intlMarketResponseOptionData.desc_in_result = "";
                        }
                        if (intlMarketResponseOptionData.desc_in_popup != null) {
                            break;
                        }
                        intlMarketResponseOptionData.desc_in_popup = "";
                        return intlMarketResponseOptionData;
                    }
                    intlMarketResponseOptionData.desc_in_popup = nb5Var.m158750s();
                }
            }
            return intlMarketResponseOptionData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketResponseOptionData intlMarketResponseOptionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, intlMarketResponseOptionData.option);
            String str = intlMarketResponseOptionData.option_image_url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = intlMarketResponseOptionData.desc_in_result;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = intlMarketResponseOptionData.desc_in_popup;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<IntlMarketResponseOptionData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketResponseOptionData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseOptionData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketResponseOptionData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketResponseOptionData newInstance() {
            return new IntlMarketResponseOptionData();
        }

        public boolean parseField(IntlMarketResponseOptionData intlMarketResponseOptionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "desc_in_popup":
                    intlMarketResponseOptionData.desc_in_popup = jsonParser.getValueAsString();
                    return true;
                case "option":
                    intlMarketResponseOptionData.option = jsonParser.getValueAsInt();
                    return true;
                case "desc_in_result":
                    intlMarketResponseOptionData.desc_in_result = jsonParser.getValueAsString();
                    return true;
                case "option_image_url":
                    intlMarketResponseOptionData.option_image_url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketResponseOptionData intlMarketResponseOptionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "desc_in_popup":
                case "option":
                case "desc_in_result":
                case "option_image_url":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketResponseOptionData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketResponseOptionData intlMarketResponseOptionData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Option.TYPE, intlMarketResponseOptionData.option);
            String str = intlMarketResponseOptionData.option_image_url;
            if (str != null) {
                jsonGenerator.writeStringField("option_image_url", str);
            }
            String str2 = intlMarketResponseOptionData.desc_in_result;
            if (str2 != null) {
                jsonGenerator.writeStringField("desc_in_result", str2);
            }
            String str3 = intlMarketResponseOptionData.desc_in_popup;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc_in_popup", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketResponseOptionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketResponseOptionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketResponseOptionData new_() {
        IntlMarketResponseOptionData intlMarketResponseOptionData = new IntlMarketResponseOptionData();
        intlMarketResponseOptionData.nullCheck();
        return intlMarketResponseOptionData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketResponseOptionData mo223809clone() {
        IntlMarketResponseOptionData intlMarketResponseOptionData = new IntlMarketResponseOptionData();
        intlMarketResponseOptionData.option = this.option;
        intlMarketResponseOptionData.option_image_url = this.option_image_url;
        intlMarketResponseOptionData.desc_in_result = this.desc_in_result;
        intlMarketResponseOptionData.desc_in_popup = this.desc_in_popup;
        return intlMarketResponseOptionData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketResponseOptionData)) {
            return false;
        }
        IntlMarketResponseOptionData intlMarketResponseOptionData = (IntlMarketResponseOptionData) obj;
        return this.option == intlMarketResponseOptionData.option && ValueObject.util_equals(this.option_image_url, intlMarketResponseOptionData.option_image_url) && ValueObject.util_equals(this.desc_in_result, intlMarketResponseOptionData.desc_in_result) && ValueObject.util_equals(this.desc_in_popup, intlMarketResponseOptionData.desc_in_popup);
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
        int i2 = ((i * 41) + this.option) * 41;
        String str = this.option_image_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc_in_result;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc_in_popup;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.option_image_url == null) {
            this.option_image_url = "";
        }
        if (this.desc_in_result == null) {
            this.desc_in_result = "";
        }
        if (this.desc_in_popup == null) {
            this.desc_in_popup = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
