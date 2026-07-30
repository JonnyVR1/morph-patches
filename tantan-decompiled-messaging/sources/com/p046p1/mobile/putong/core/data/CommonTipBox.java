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
public class CommonTipBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commontipbox";

    @NonNull
    @ProtobufIndex(index = 5)
    public String button;

    @NonNull
    @ProtobufIndex(index = 7)
    public String disabledButton;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 8)
    public String statsModuleId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String statsModuleParameter;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<CommonTipBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonTipBox>() { // from class: com.p1.mobile.putong.core.data.CommonTipBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonTipBox commonTipBox) {
            String str = commonTipBox.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = commonTipBox.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = commonTipBox.subtitle;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = commonTipBox.iconUrl;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = commonTipBox.button;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = commonTipBox.schema;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = commonTipBox.disabledButton;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = commonTipBox.statsModuleId;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = commonTipBox.statsModuleParameter;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            commonTipBox.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonTipBox parse(nb5 nb5Var) throws IOException {
            CommonTipBox commonTipBox = new CommonTipBox();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (commonTipBox.type == null) {
                        commonTipBox.type = "";
                    }
                    if (commonTipBox.title == null) {
                        commonTipBox.title = "";
                    }
                    if (commonTipBox.subtitle == null) {
                        commonTipBox.subtitle = "";
                    }
                    if (commonTipBox.iconUrl == null) {
                        commonTipBox.iconUrl = "";
                    }
                    if (commonTipBox.button == null) {
                        commonTipBox.button = "";
                    }
                    if (commonTipBox.schema == null) {
                        commonTipBox.schema = "";
                    }
                    if (commonTipBox.disabledButton == null) {
                        commonTipBox.disabledButton = "";
                    }
                    if (commonTipBox.statsModuleId == null) {
                        commonTipBox.statsModuleId = "";
                    }
                    if (commonTipBox.statsModuleParameter != null) {
                        break;
                    }
                    commonTipBox.statsModuleParameter = "";
                    break;
                }
                if (iM158752u == 10) {
                    commonTipBox.type = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    commonTipBox.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    commonTipBox.subtitle = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    commonTipBox.iconUrl = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    commonTipBox.button = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    commonTipBox.schema = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    commonTipBox.disabledButton = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    commonTipBox.statsModuleId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 74) {
                        if (commonTipBox.type == null) {
                            commonTipBox.type = "";
                        }
                        if (commonTipBox.title == null) {
                            commonTipBox.title = "";
                        }
                        if (commonTipBox.subtitle == null) {
                            commonTipBox.subtitle = "";
                        }
                        if (commonTipBox.iconUrl == null) {
                            commonTipBox.iconUrl = "";
                        }
                        if (commonTipBox.button == null) {
                            commonTipBox.button = "";
                        }
                        if (commonTipBox.schema == null) {
                            commonTipBox.schema = "";
                        }
                        if (commonTipBox.disabledButton == null) {
                            commonTipBox.disabledButton = "";
                        }
                        if (commonTipBox.statsModuleId == null) {
                            commonTipBox.statsModuleId = "";
                        }
                        if (commonTipBox.statsModuleParameter != null) {
                            break;
                        }
                        commonTipBox.statsModuleParameter = "";
                        return commonTipBox;
                    }
                    commonTipBox.statsModuleParameter = nb5Var.m158750s();
                }
            }
            return commonTipBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonTipBox commonTipBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = commonTipBox.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = commonTipBox.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = commonTipBox.subtitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = commonTipBox.iconUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = commonTipBox.button;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = commonTipBox.schema;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = commonTipBox.disabledButton;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = commonTipBox.statsModuleId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = commonTipBox.statsModuleParameter;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
        }
    };
    public static JsonAdapter<CommonTipBox> JSON_ADAPTER = new ObjectJsonAdapter<CommonTipBox>() { // from class: com.p1.mobile.putong.core.data.CommonTipBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonTipBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonTipBox newInstance() {
            return new CommonTipBox();
        }

        public boolean parseField(CommonTipBox commonTipBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    commonTipBox.subtitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    commonTipBox.button = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    commonTipBox.schema = jsonParser.getValueAsString();
                    return true;
                case "type":
                    commonTipBox.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    commonTipBox.title = jsonParser.getValueAsString();
                    return true;
                case "disabledButton":
                    commonTipBox.disabledButton = jsonParser.getValueAsString();
                    return true;
                case "statsModuleId":
                    commonTipBox.statsModuleId = jsonParser.getValueAsString();
                    return true;
                case "statsModuleParameter":
                    commonTipBox.statsModuleParameter = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    commonTipBox.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CommonTipBox commonTipBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "button":
                case "schema":
                case "type":
                case "title":
                case "disabledButton":
                case "statsModuleId":
                case "statsModuleParameter":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(commonTipBox, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonTipBox commonTipBox, JsonGenerator jsonGenerator) throws IOException {
            String str = commonTipBox.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = commonTipBox.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = commonTipBox.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            String str4 = commonTipBox.iconUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("iconUrl", str4);
            }
            String str5 = commonTipBox.button;
            if (str5 != null) {
                jsonGenerator.writeStringField("button", str5);
            }
            String str6 = commonTipBox.schema;
            if (str6 != null) {
                jsonGenerator.writeStringField("schema", str6);
            }
            String str7 = commonTipBox.disabledButton;
            if (str7 != null) {
                jsonGenerator.writeStringField("disabledButton", str7);
            }
            String str8 = commonTipBox.statsModuleId;
            if (str8 != null) {
                jsonGenerator.writeStringField("statsModuleId", str8);
            }
            String str9 = commonTipBox.statsModuleParameter;
            if (str9 != null) {
                jsonGenerator.writeStringField("statsModuleParameter", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonTipBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonTipBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonTipBox new_() {
        CommonTipBox commonTipBox = new CommonTipBox();
        commonTipBox.nullCheck();
        return commonTipBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonTipBox mo223809clone() {
        CommonTipBox commonTipBox = new CommonTipBox();
        commonTipBox.type = this.type;
        commonTipBox.title = this.title;
        commonTipBox.subtitle = this.subtitle;
        commonTipBox.iconUrl = this.iconUrl;
        commonTipBox.button = this.button;
        commonTipBox.schema = this.schema;
        commonTipBox.disabledButton = this.disabledButton;
        commonTipBox.statsModuleId = this.statsModuleId;
        commonTipBox.statsModuleParameter = this.statsModuleParameter;
        return commonTipBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonTipBox)) {
            return false;
        }
        CommonTipBox commonTipBox = (CommonTipBox) obj;
        return ValueObject.util_equals(this.type, commonTipBox.type) && ValueObject.util_equals(this.title, commonTipBox.title) && ValueObject.util_equals(this.subtitle, commonTipBox.subtitle) && ValueObject.util_equals(this.iconUrl, commonTipBox.iconUrl) && ValueObject.util_equals(this.button, commonTipBox.button) && ValueObject.util_equals(this.schema, commonTipBox.schema) && ValueObject.util_equals(this.disabledButton, commonTipBox.disabledButton) && ValueObject.util_equals(this.statsModuleId, commonTipBox.statsModuleId) && ValueObject.util_equals(this.statsModuleParameter, commonTipBox.statsModuleParameter);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.button;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.schema;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.disabledButton;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.statsModuleId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.statsModuleParameter;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.button == null) {
            this.button = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.disabledButton == null) {
            this.disabledButton = "";
        }
        if (this.statsModuleId == null) {
            this.statsModuleId = "";
        }
        if (this.statsModuleParameter == null) {
            this.statsModuleParameter = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
