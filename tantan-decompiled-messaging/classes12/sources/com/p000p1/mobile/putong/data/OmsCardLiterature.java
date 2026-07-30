package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Action;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OmsCardLiterature;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OmsCardLiterature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscardliterature";

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> author;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<Action> buttons;

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String guidance;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> icons;

    @NonNull
    @ProtobufIndex(index = 7)
    public String introduction;

    @NonNull
    @ProtobufIndex(index = 12)
    public String literatureID;

    @NonNull
    @ProtobufIndex(index = 8)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> topLeftTags;

    @NonNull
    @ProtobufIndex(index = 9)
    public String type;
    public static ProtobufAdapter<OmsCardLiterature> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsCardLiterature>() { // from class: com.p1.mobile.putong.data.OmsCardLiterature.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsCardLiterature omsCardLiterature) {
            List<Media> list = omsCardLiterature.pictures;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = omsCardLiterature.color;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            List<String> list2 = omsCardLiterature.topLeftTags;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCardLiterature.icons;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCardLiterature.title;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = omsCardLiterature.guidance;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = omsCardLiterature.introduction;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(7, str4);
            }
            String str5 = omsCardLiterature.name;
            if (str5 != null) {
                iL += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = omsCardLiterature.type;
            if (str6 != null) {
                iL += CodedOutputByteBufferNano.o(9, str6);
            }
            List<String> list4 = omsCardLiterature.author;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(10, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Action> list5 = omsCardLiterature.buttons;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(11, list5, Action.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = omsCardLiterature.literatureID;
            if (str7 != null) {
                iL += CodedOutputByteBufferNano.o(12, str7);
            }
            ((MessageNano) omsCardLiterature).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsCardLiterature m18708parse(nb5 nb5Var) throws IOException {
            OmsCardLiterature omsCardLiterature = new OmsCardLiterature();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (omsCardLiterature.pictures == null) {
                            omsCardLiterature.pictures = new ArrayList();
                        }
                        if (omsCardLiterature.color == null) {
                            omsCardLiterature.color = "";
                        }
                        if (omsCardLiterature.topLeftTags == null) {
                            omsCardLiterature.topLeftTags = new ArrayList();
                        }
                        if (omsCardLiterature.icons == null) {
                            omsCardLiterature.icons = new ArrayList();
                        }
                        if (omsCardLiterature.title == null) {
                            omsCardLiterature.title = "";
                        }
                        if (omsCardLiterature.guidance == null) {
                            omsCardLiterature.guidance = "";
                        }
                        if (omsCardLiterature.introduction == null) {
                            omsCardLiterature.introduction = "";
                        }
                        if (omsCardLiterature.name == null) {
                            omsCardLiterature.name = "";
                        }
                        if (omsCardLiterature.type == null) {
                            omsCardLiterature.type = "";
                        }
                        if (omsCardLiterature.author == null) {
                            omsCardLiterature.author = new ArrayList();
                        }
                        if (omsCardLiterature.buttons == null) {
                            omsCardLiterature.buttons = new ArrayList();
                        }
                        if (omsCardLiterature.literatureID == null) {
                            omsCardLiterature.literatureID = "";
                        }
                        break;
                    case 10:
                        omsCardLiterature.pictures = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        omsCardLiterature.color = nb5Var.s();
                        continue;
                    case 26:
                        omsCardLiterature.topLeftTags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        omsCardLiterature.icons = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        omsCardLiterature.title = nb5Var.s();
                        continue;
                    case 50:
                        omsCardLiterature.guidance = nb5Var.s();
                        continue;
                    case 58:
                        omsCardLiterature.introduction = nb5Var.s();
                        continue;
                    case 66:
                        omsCardLiterature.name = nb5Var.s();
                        continue;
                    case 74:
                        omsCardLiterature.type = nb5Var.s();
                        continue;
                    case 82:
                        omsCardLiterature.author = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        omsCardLiterature.buttons = (List) nb5Var.l(Action.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        omsCardLiterature.literatureID = nb5Var.s();
                        continue;
                    default:
                        if (omsCardLiterature.pictures == null) {
                            omsCardLiterature.pictures = new ArrayList();
                        }
                        if (omsCardLiterature.color == null) {
                            omsCardLiterature.color = "";
                        }
                        if (omsCardLiterature.topLeftTags == null) {
                            omsCardLiterature.topLeftTags = new ArrayList();
                        }
                        if (omsCardLiterature.icons == null) {
                            omsCardLiterature.icons = new ArrayList();
                        }
                        if (omsCardLiterature.title == null) {
                            omsCardLiterature.title = "";
                        }
                        if (omsCardLiterature.guidance == null) {
                            omsCardLiterature.guidance = "";
                        }
                        if (omsCardLiterature.introduction == null) {
                            omsCardLiterature.introduction = "";
                        }
                        if (omsCardLiterature.name == null) {
                            omsCardLiterature.name = "";
                        }
                        if (omsCardLiterature.type == null) {
                            omsCardLiterature.type = "";
                        }
                        if (omsCardLiterature.author == null) {
                            omsCardLiterature.author = new ArrayList();
                        }
                        if (omsCardLiterature.buttons == null) {
                            omsCardLiterature.buttons = new ArrayList();
                        }
                        if (omsCardLiterature.literatureID == null) {
                            omsCardLiterature.literatureID = "";
                            return omsCardLiterature;
                        }
                        break;
                }
            }
            return omsCardLiterature;
        }

        public void serialize(OmsCardLiterature omsCardLiterature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = omsCardLiterature.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = omsCardLiterature.color;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            List<String> list2 = omsCardLiterature.topLeftTags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCardLiterature.icons;
            if (list3 != null) {
                codedOutputByteBufferNano.K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCardLiterature.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = omsCardLiterature.guidance;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = omsCardLiterature.introduction;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            String str5 = omsCardLiterature.name;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = omsCardLiterature.type;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            List<String> list4 = omsCardLiterature.author;
            if (list4 != null) {
                codedOutputByteBufferNano.K(10, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Action> list5 = omsCardLiterature.buttons;
            if (list5 != null) {
                codedOutputByteBufferNano.K(11, list5, Action.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = omsCardLiterature.literatureID;
            if (str7 != null) {
                codedOutputByteBufferNano.R(12, str7);
            }
        }
    };
    public static JsonAdapter<OmsCardLiterature> JSON_ADAPTER = new ObjectJsonAdapter<OmsCardLiterature>() { // from class: com.p1.mobile.putong.data.OmsCardLiterature.2
        public Class getDataClass() {
            return OmsCardLiterature.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsCardLiterature mo17830newInstance() {
            return new OmsCardLiterature();
        }

        public boolean parseField(OmsCardLiterature omsCardLiterature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "literatureID":
                    omsCardLiterature.literatureID = jsonParser.getValueAsString();
                    return true;
                case "topLeftTags":
                    omsCardLiterature.topLeftTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "author":
                    omsCardLiterature.author = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "guidance":
                    omsCardLiterature.guidance = jsonParser.getValueAsString();
                    return true;
                case "pictures":
                    omsCardLiterature.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    omsCardLiterature.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    omsCardLiterature.type = jsonParser.getValueAsString();
                    return true;
                case "color":
                    omsCardLiterature.color = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    omsCardLiterature.icons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    omsCardLiterature.title = jsonParser.getValueAsString();
                    return true;
                case "buttons":
                    omsCardLiterature.buttons = JsonAdapter.parseArray(jsonParser, Action.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "introduction":
                    omsCardLiterature.introduction = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsCardLiterature omsCardLiterature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "literatureID":
                case "topLeftTags":
                case "author":
                case "guidance":
                case "pictures":
                case "name":
                case "type":
                case "color":
                case "icons":
                case "title":
                case "buttons":
                case "introduction":
                    return true;
                default:
                    return super.parseFieldCheck(omsCardLiterature, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCardLiterature omsCardLiterature, JsonGenerator jsonGenerator) throws IOException {
            if (omsCardLiterature.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(omsCardLiterature.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = omsCardLiterature.color;
            if (str != null) {
                jsonGenerator.writeStringField("color", str);
            }
            if (omsCardLiterature.topLeftTags != null) {
                jsonGenerator.writeFieldName("topLeftTags");
                JsonAdapter.serializeArray(omsCardLiterature.topLeftTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (omsCardLiterature.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(omsCardLiterature.icons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = omsCardLiterature.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = omsCardLiterature.guidance;
            if (str3 != null) {
                jsonGenerator.writeStringField("guidance", str3);
            }
            String str4 = omsCardLiterature.introduction;
            if (str4 != null) {
                jsonGenerator.writeStringField("introduction", str4);
            }
            String str5 = omsCardLiterature.name;
            if (str5 != null) {
                jsonGenerator.writeStringField("name", str5);
            }
            String str6 = omsCardLiterature.type;
            if (str6 != null) {
                jsonGenerator.writeStringField("type", str6);
            }
            if (omsCardLiterature.author != null) {
                jsonGenerator.writeFieldName("author");
                JsonAdapter.serializeArray(omsCardLiterature.author, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (omsCardLiterature.buttons != null) {
                jsonGenerator.writeFieldName("buttons");
                JsonAdapter.serializeArray(omsCardLiterature.buttons, jsonGenerator, Action.JSON_ADAPTER);
            }
            String str7 = omsCardLiterature.literatureID;
            if (str7 != null) {
                jsonGenerator.writeStringField("literatureID", str7);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCardLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCardLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m872a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m874c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m876e(String str) {
        return str;
    }

    public static OmsCardLiterature new_() {
        OmsCardLiterature omsCardLiterature = new OmsCardLiterature();
        omsCardLiterature.nullCheck();
        return omsCardLiterature;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsCardLiterature m18707clone() {
        OmsCardLiterature omsCardLiterature = new OmsCardLiterature();
        List<Media> list = this.pictures;
        if (list != null) {
            omsCardLiterature.pictures = ValueObject.util_map(list, new w9j() { // from class: l.ga50
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        omsCardLiterature.color = this.color;
        List<String> list2 = this.topLeftTags;
        if (list2 != null) {
            omsCardLiterature.topLeftTags = ValueObject.util_map(list2, new w9j() { // from class: l.ha50
                public final Object call(Object obj) {
                    return OmsCardLiterature.m876e((String) obj);
                }
            });
        }
        List<String> list3 = this.icons;
        if (list3 != null) {
            omsCardLiterature.icons = ValueObject.util_map(list3, new w9j() { // from class: l.ia50
                public final Object call(Object obj) {
                    return OmsCardLiterature.m874c((String) obj);
                }
            });
        }
        omsCardLiterature.title = this.title;
        omsCardLiterature.guidance = this.guidance;
        omsCardLiterature.introduction = this.introduction;
        omsCardLiterature.name = this.name;
        omsCardLiterature.type = this.type;
        List<String> list4 = this.author;
        if (list4 != null) {
            omsCardLiterature.author = ValueObject.util_map(list4, new w9j() { // from class: l.ja50
                public final Object call(Object obj) {
                    return OmsCardLiterature.m872a((String) obj);
                }
            });
        }
        List<Action> list5 = this.buttons;
        if (list5 != null) {
            omsCardLiterature.buttons = ValueObject.util_map(list5, new w9j() { // from class: l.ka50
                public final Object call(Object obj) {
                    return ((Action) obj).m17622clone();
                }
            });
        }
        omsCardLiterature.literatureID = this.literatureID;
        return omsCardLiterature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsCardLiterature)) {
            return false;
        }
        OmsCardLiterature omsCardLiterature = (OmsCardLiterature) obj;
        return ValueObject.util_equals(this.pictures, omsCardLiterature.pictures) && ValueObject.util_equals(this.color, omsCardLiterature.color) && ValueObject.util_equals(this.topLeftTags, omsCardLiterature.topLeftTags) && ValueObject.util_equals(this.icons, omsCardLiterature.icons) && ValueObject.util_equals(this.title, omsCardLiterature.title) && ValueObject.util_equals(this.guidance, omsCardLiterature.guidance) && ValueObject.util_equals(this.introduction, omsCardLiterature.introduction) && ValueObject.util_equals(this.name, omsCardLiterature.name) && ValueObject.util_equals(this.type, omsCardLiterature.type) && ValueObject.util_equals(this.author, omsCardLiterature.author) && ValueObject.util_equals(this.buttons, omsCardLiterature.buttons) && ValueObject.util_equals(this.literatureID, omsCardLiterature.literatureID);
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
        List<Media> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.topLeftTags;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.icons;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.guidance;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.introduction;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.name;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.type;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list4 = this.author;
        int iHashCode10 = (iHashCode9 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<Action> list5 = this.buttons;
        int iHashCode11 = (iHashCode10 + (list5 != null ? list5.hashCode() : 0)) * 41;
        String str7 = this.literatureID;
        int iHashCode12 = iHashCode11 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.topLeftTags == null) {
            this.topLeftTags = new ArrayList();
        }
        if (this.icons == null) {
            this.icons = new ArrayList();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.guidance == null) {
            this.guidance = "";
        }
        if (this.introduction == null) {
            this.introduction = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.author == null) {
            this.author = new ArrayList();
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
        if (this.literatureID == null) {
            this.literatureID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
