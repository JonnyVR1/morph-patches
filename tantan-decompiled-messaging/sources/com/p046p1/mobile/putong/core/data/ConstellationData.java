package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class ConstellationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "constellationdata";

    @NonNull
    @ProtobufIndex(index = 5)
    public String cardBg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String keywords;

    @NonNull
    @ProtobufIndex(index = 3)
    public String meaning;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 6)
    public int nameColor;
    public static ProtobufAdapter<ConstellationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConstellationData>() { // from class: com.p1.mobile.putong.core.data.ConstellationData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConstellationData constellationData) {
            String str = constellationData.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = constellationData.keywords;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = constellationData.meaning;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = constellationData.image;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = constellationData.cardBg;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(6, constellationData.nameColor);
            constellationData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConstellationData parse(nb5 nb5Var) throws IOException {
            ConstellationData constellationData = new ConstellationData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    constellationData.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    constellationData.keywords = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    constellationData.meaning = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    constellationData.image = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    constellationData.cardBg = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
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
                    constellationData.nameColor = nb5Var.m158741j();
                }
            }
            return constellationData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConstellationData constellationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = constellationData.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = constellationData.keywords;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = constellationData.meaning;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = constellationData.image;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = constellationData.cardBg;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            codedOutputByteBufferNano.m17250G(6, constellationData.nameColor);
        }
    };
    public static JsonAdapter<ConstellationData> JSON_ADAPTER = new ObjectJsonAdapter<ConstellationData>() { // from class: com.p1.mobile.putong.core.data.ConstellationData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConstellationData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConstellationData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConstellationData constellationData, JsonGenerator jsonGenerator) throws IOException {
            String str = constellationData.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConstellationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConstellationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConstellationData new_() {
        ConstellationData constellationData = new ConstellationData();
        constellationData.nullCheck();
        return constellationData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConstellationData mo223809clone() {
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
