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
public class ConstellationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "constellationdata";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String cardBg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String image;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String keywords;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String meaning;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 6)
    public int nameColor;
    public static ProtobufAdapter<ConstellationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConstellationData>() { // from class: com.p1.mobile.putong.core.data.ConstellationData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConstellationData constellationData) {
            String str = constellationData.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = constellationData.keywords;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = constellationData.meaning;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = constellationData.image;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = constellationData.cardBg;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iH = iO + CodedOutputByteBufferNano.h(6, constellationData.nameColor);
            ((MessageNano) constellationData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConstellationData m12249parse(nb5 nb5Var) throws IOException {
            ConstellationData constellationData = new ConstellationData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (constellationData.name == null) {
                        constellationData.name = "";
                    }
                    if (constellationData.keywords == null) {
                        constellationData.keywords = "";
                    }
                    if (constellationData.meaning == null) {
                        constellationData.meaning = "";
                    }
                    if (constellationData.image == null) {
                        constellationData.image = "";
                    }
                    if (constellationData.cardBg != null) {
                        break;
                    }
                    constellationData.cardBg = "";
                    break;
                }
                if (iU == 10) {
                    constellationData.name = nb5Var.s();
                } else if (iU == 18) {
                    constellationData.keywords = nb5Var.s();
                } else if (iU == 26) {
                    constellationData.meaning = nb5Var.s();
                } else if (iU == 34) {
                    constellationData.image = nb5Var.s();
                } else if (iU == 42) {
                    constellationData.cardBg = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (constellationData.name == null) {
                            constellationData.name = "";
                        }
                        if (constellationData.keywords == null) {
                            constellationData.keywords = "";
                        }
                        if (constellationData.meaning == null) {
                            constellationData.meaning = "";
                        }
                        if (constellationData.image == null) {
                            constellationData.image = "";
                        }
                        if (constellationData.cardBg != null) {
                            break;
                        }
                        constellationData.cardBg = "";
                        return constellationData;
                    }
                    constellationData.nameColor = nb5Var.j();
                }
            }
            return constellationData;
        }

        public void serialize(ConstellationData constellationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = constellationData.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = constellationData.keywords;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = constellationData.meaning;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = constellationData.image;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = constellationData.cardBg;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.G(6, constellationData.nameColor);
        }
    };
    public static JsonAdapter<ConstellationData> JSON_ADAPTER = new ObjectJsonAdapter<ConstellationData>() { // from class: com.p1.mobile.putong.core.data.ConstellationData.2
        public Class getDataClass() {
            return ConstellationData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConstellationData m12250newInstance() {
            return new ConstellationData();
        }

        public boolean parseField(ConstellationData constellationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardBg":
                    constellationData.cardBg = jsonParser.getValueAsString();
                    return true;
                case "name":
                    constellationData.name = jsonParser.getValueAsString();
                    return true;
                case "image":
                    constellationData.image = jsonParser.getValueAsString();
                    return true;
                case "keywords":
                    constellationData.keywords = jsonParser.getValueAsString();
                    return true;
                case "meaning":
                    constellationData.meaning = jsonParser.getValueAsString();
                    return true;
                case "nameColor":
                    constellationData.nameColor = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConstellationData constellationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cardBg":
                case "name":
                case "image":
                case "keywords":
                case "meaning":
                case "nameColor":
                    return true;
                default:
                    return super.parseFieldCheck(constellationData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ConstellationData constellationData, JsonGenerator jsonGenerator) throws IOException {
            String str = constellationData.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = constellationData.keywords;
            if (str2 != null) {
                jsonGenerator.writeStringField("keywords", str2);
            }
            String str3 = constellationData.meaning;
            if (str3 != null) {
                jsonGenerator.writeStringField("meaning", str3);
            }
            String str4 = constellationData.image;
            if (str4 != null) {
                jsonGenerator.writeStringField("image", str4);
            }
            String str5 = constellationData.cardBg;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardBg", str5);
            }
            jsonGenerator.writeNumberField("nameColor", constellationData.nameColor);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConstellationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConstellationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConstellationData new_() {
        ConstellationData constellationData = new ConstellationData();
        constellationData.nullCheck();
        return constellationData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConstellationData m12248clone() {
        ConstellationData constellationData = new ConstellationData();
        constellationData.name = this.name;
        constellationData.keywords = this.keywords;
        constellationData.meaning = this.meaning;
        constellationData.image = this.image;
        constellationData.cardBg = this.cardBg;
        constellationData.nameColor = this.nameColor;
        return constellationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConstellationData)) {
            return false;
        }
        ConstellationData constellationData = (ConstellationData) obj;
        return ValueObject.util_equals(this.name, constellationData.name) && ValueObject.util_equals(this.keywords, constellationData.keywords) && ValueObject.util_equals(this.meaning, constellationData.meaning) && ValueObject.util_equals(this.image, constellationData.image) && ValueObject.util_equals(this.cardBg, constellationData.cardBg) && this.nameColor == constellationData.nameColor;
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.keywords;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.meaning;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.image;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardBg;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.nameColor;
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.keywords == null) {
            this.keywords = "";
        }
        if (this.meaning == null) {
            this.meaning = "";
        }
        if (this.image == null) {
            this.image = "";
        }
        if (this.cardBg == null) {
            this.cardBg = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
