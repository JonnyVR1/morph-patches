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
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String icon_url;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f159id;

    @ProtobufIndex(index = 4)
    public int option;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tag_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<SamesCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SamesCardData>() { // from class: com.p1.mobile.putong.core.data.SamesCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SamesCardData samesCardData) {
            String str = samesCardData.f159id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = samesCardData.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = samesCardData.tag_url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, samesCardData.option);
            String str4 = samesCardData.icon_url;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = samesCardData.bg_color;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = samesCardData.font_color;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = samesCardData.bg_border_color;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(8, str7);
            }
            String str8 = samesCardData.desc;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(9, str8);
            }
            ((MessageNano) samesCardData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SamesCardData m15477parse(nb5 nb5Var) throws IOException {
            SamesCardData samesCardData = new SamesCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (samesCardData.f159id == null) {
                        samesCardData.f159id = "";
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
                if (iU == 10) {
                    samesCardData.f159id = nb5Var.s();
                } else if (iU == 18) {
                    samesCardData.type = nb5Var.s();
                } else if (iU == 26) {
                    samesCardData.tag_url = nb5Var.s();
                } else if (iU == 32) {
                    samesCardData.option = nb5Var.j();
                } else if (iU == 42) {
                    samesCardData.icon_url = nb5Var.s();
                } else if (iU == 50) {
                    samesCardData.bg_color = nb5Var.s();
                } else if (iU == 58) {
                    samesCardData.font_color = nb5Var.s();
                } else if (iU == 66) {
                    samesCardData.bg_border_color = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (samesCardData.f159id == null) {
                            samesCardData.f159id = "";
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
                    samesCardData.desc = nb5Var.s();
                }
            }
            return samesCardData;
        }

        public void serialize(SamesCardData samesCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = samesCardData.f159id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = samesCardData.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = samesCardData.tag_url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.G(4, samesCardData.option);
            String str4 = samesCardData.icon_url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = samesCardData.bg_color;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = samesCardData.font_color;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = samesCardData.bg_border_color;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
            String str8 = samesCardData.desc;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
        }
    };
    public static JsonAdapter<SamesCardData> JSON_ADAPTER = new ObjectJsonAdapter<SamesCardData>() { // from class: com.p1.mobile.putong.core.data.SamesCardData.2
        public Class getDataClass() {
            return SamesCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SamesCardData m15478newInstance() {
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
                    samesCardData.f159id = jsonParser.getValueAsString();
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

        public void serializeFields(SamesCardData samesCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = samesCardData.f159id;
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
                jsonGenerator.writeStringField("desc", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SamesCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SamesCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SamesCardData new_() {
        SamesCardData samesCardData = new SamesCardData();
        samesCardData.nullCheck();
        return samesCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SamesCardData m15476clone() {
        SamesCardData samesCardData = new SamesCardData();
        samesCardData.f159id = this.f159id;
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
        return ValueObject.util_equals(this.f159id, samesCardData.f159id) && ValueObject.util_equals(this.type, samesCardData.type) && ValueObject.util_equals(this.tag_url, samesCardData.tag_url) && this.option == samesCardData.option && ValueObject.util_equals(this.icon_url, samesCardData.icon_url) && ValueObject.util_equals(this.bg_color, samesCardData.bg_color) && ValueObject.util_equals(this.font_color, samesCardData.font_color) && ValueObject.util_equals(this.bg_border_color, samesCardData.bg_border_color) && ValueObject.util_equals(this.desc, samesCardData.desc);
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
        String str = this.f159id;
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
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.f159id == null) {
            this.f159id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
