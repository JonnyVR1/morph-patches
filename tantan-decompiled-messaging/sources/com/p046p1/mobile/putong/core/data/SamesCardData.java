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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class SamesCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "samescarddata";

    @NonNull
    @ProtobufIndex(index = 8)
    public String bg_border_color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = 9)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 7)
    public String font_color;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon_url;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20497id;

    @ProtobufIndex(index = 4)
    public int option;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tag_url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<SamesCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SamesCardData>() { // from class: com.p1.mobile.putong.core.data.SamesCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SamesCardData samesCardData) {
            String str = samesCardData.f20497id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = samesCardData.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = samesCardData.tag_url;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, samesCardData.option);
            String str4 = samesCardData.icon_url;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = samesCardData.bg_color;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            String str6 = samesCardData.font_color;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            String str7 = samesCardData.bg_border_color;
            if (str7 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str7);
            }
            String str8 = samesCardData.desc;
            if (str8 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str8);
            }
            samesCardData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SamesCardData parse(nb5 nb5Var) throws IOException {
            SamesCardData samesCardData = new SamesCardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (samesCardData.f20497id == null) {
                        samesCardData.f20497id = "";
                    }
                    if (samesCardData.type == null) {
                        samesCardData.type = "";
                    }
                    if (samesCardData.tag_url == null) {
                        samesCardData.tag_url = "";
                    }
                    if (samesCardData.icon_url == null) {
                        samesCardData.icon_url = "";
                    }
                    if (samesCardData.bg_color == null) {
                        samesCardData.bg_color = "";
                    }
                    if (samesCardData.font_color == null) {
                        samesCardData.font_color = "";
                    }
                    if (samesCardData.bg_border_color == null) {
                        samesCardData.bg_border_color = "";
                    }
                    if (samesCardData.desc != null) {
                        break;
                    }
                    samesCardData.desc = "";
                    break;
                }
                if (iM158752u == 10) {
                    samesCardData.f20497id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    samesCardData.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    samesCardData.tag_url = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    samesCardData.option = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    samesCardData.icon_url = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    samesCardData.bg_color = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    samesCardData.font_color = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    samesCardData.bg_border_color = nb5Var.m158750s();
                } else {
                    if (iM158752u != 74) {
                        if (samesCardData.f20497id == null) {
                            samesCardData.f20497id = "";
                        }
                        if (samesCardData.type == null) {
                            samesCardData.type = "";
                        }
                        if (samesCardData.tag_url == null) {
                            samesCardData.tag_url = "";
                        }
                        if (samesCardData.icon_url == null) {
                            samesCardData.icon_url = "";
                        }
                        if (samesCardData.bg_color == null) {
                            samesCardData.bg_color = "";
                        }
                        if (samesCardData.font_color == null) {
                            samesCardData.font_color = "";
                        }
                        if (samesCardData.bg_border_color == null) {
                            samesCardData.bg_border_color = "";
                        }
                        if (samesCardData.desc != null) {
                            break;
                        }
                        samesCardData.desc = "";
                        return samesCardData;
                    }
                    samesCardData.desc = nb5Var.m158750s();
                }
            }
            return samesCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SamesCardData samesCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = samesCardData.f20497id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = samesCardData.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = samesCardData.tag_url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, samesCardData.option);
            String str4 = samesCardData.icon_url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = samesCardData.bg_color;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            String str6 = samesCardData.font_color;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            String str7 = samesCardData.bg_border_color;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(8, str7);
            }
            String str8 = samesCardData.desc;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(9, str8);
            }
        }
    };
    public static JsonAdapter<SamesCardData> JSON_ADAPTER = new ObjectJsonAdapter<SamesCardData>() { // from class: com.p1.mobile.putong.core.data.SamesCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SamesCardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SamesCardData newInstance() {
            return new SamesCardData();
        }

        public boolean parseField(SamesCardData samesCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tag_url":
                    samesCardData.tag_url = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    samesCardData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "option":
                    samesCardData.option = jsonParser.getValueAsInt();
                    return true;
                case "icon_url":
                    samesCardData.icon_url = jsonParser.getValueAsString();
                    return true;
                case "font_color":
                    samesCardData.font_color = jsonParser.getValueAsString();
                    return true;
                case "id":
                    samesCardData.f20497id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    samesCardData.desc = jsonParser.getValueAsString();
                    return true;
                case "type":
                    samesCardData.type = jsonParser.getValueAsString();
                    return true;
                case "bg_border_color":
                    samesCardData.bg_border_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SamesCardData samesCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tag_url":
                case "bg_color":
                case "option":
                case "icon_url":
                case "font_color":
                    return true;
                case "id":
                    return false;
                case "desc":
                case "type":
                case "bg_border_color":
                    return true;
                default:
                    return super.parseFieldCheck(samesCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SamesCardData samesCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = samesCardData.f20497id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = samesCardData.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = samesCardData.tag_url;
            if (str3 != null) {
                jsonGenerator.writeStringField("tag_url", str3);
            }
            jsonGenerator.writeNumberField(Option.TYPE, samesCardData.option);
            String str4 = samesCardData.icon_url;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon_url", str4);
            }
            String str5 = samesCardData.bg_color;
            if (str5 != null) {
                jsonGenerator.writeStringField("bg_color", str5);
            }
            String str6 = samesCardData.font_color;
            if (str6 != null) {
                jsonGenerator.writeStringField("font_color", str6);
            }
            String str7 = samesCardData.bg_border_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("bg_border_color", str7);
            }
            String str8 = samesCardData.desc;
            if (str8 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SamesCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SamesCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SamesCardData new_() {
        SamesCardData samesCardData = new SamesCardData();
        samesCardData.nullCheck();
        return samesCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SamesCardData mo223809clone() {
        SamesCardData samesCardData = new SamesCardData();
        samesCardData.f20497id = this.f20497id;
        samesCardData.type = this.type;
        samesCardData.tag_url = this.tag_url;
        samesCardData.option = this.option;
        samesCardData.icon_url = this.icon_url;
        samesCardData.bg_color = this.bg_color;
        samesCardData.font_color = this.font_color;
        samesCardData.bg_border_color = this.bg_border_color;
        samesCardData.desc = this.desc;
        return samesCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SamesCardData)) {
            return false;
        }
        SamesCardData samesCardData = (SamesCardData) obj;
        return ValueObject.util_equals(this.f20497id, samesCardData.f20497id) && ValueObject.util_equals(this.type, samesCardData.type) && ValueObject.util_equals(this.tag_url, samesCardData.tag_url) && this.option == samesCardData.option && ValueObject.util_equals(this.icon_url, samesCardData.icon_url) && ValueObject.util_equals(this.bg_color, samesCardData.bg_color) && ValueObject.util_equals(this.font_color, samesCardData.font_color) && ValueObject.util_equals(this.bg_border_color, samesCardData.bg_border_color) && ValueObject.util_equals(this.desc, samesCardData.desc);
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
        String str = this.f20497id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tag_url;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.option) * 41;
        String str4 = this.icon_url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bg_color;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.font_color;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.bg_border_color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.desc;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20497id == null) {
            this.f20497id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.tag_url == null) {
            this.tag_url = "";
        }
        if (this.icon_url == null) {
            this.icon_url = "";
        }
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.font_color == null) {
            this.font_color = "";
        }
        if (this.bg_border_color == null) {
            this.bg_border_color = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
