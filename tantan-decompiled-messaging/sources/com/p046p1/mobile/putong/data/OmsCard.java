package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OmsCard;
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

/* JADX INFO: loaded from: classes12.dex */
public class OmsCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscard";

    @NonNull
    @ProtobufIndex(index = 7)
    public Action action;

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 6)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> icons;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> topLeftTags;
    public static ProtobufAdapter<OmsCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsCard>() { // from class: com.p1.mobile.putong.data.OmsCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsCard omsCard) {
            List<Media> list = omsCard.pictures;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = omsCard.color;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<String> list2 = omsCard.topLeftTags;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCard.icons;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCard.title;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            String str3 = omsCard.description;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            Action action = omsCard.action;
            if (action != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, action, Action.PROTOBUF_ADAPTER);
            }
            omsCard.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsCard parse(nb5 nb5Var) throws IOException {
            OmsCard omsCard = new OmsCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsCard.pictures == null) {
                        omsCard.pictures = new ArrayList();
                    }
                    if (omsCard.color == null) {
                        omsCard.color = "";
                    }
                    if (omsCard.topLeftTags == null) {
                        omsCard.topLeftTags = new ArrayList();
                    }
                    if (omsCard.icons == null) {
                        omsCard.icons = new ArrayList();
                    }
                    if (omsCard.title == null) {
                        omsCard.title = "";
                    }
                    if (omsCard.description == null) {
                        omsCard.description = "";
                    }
                    if (omsCard.action != null) {
                        break;
                    }
                    omsCard.action = Action.new_();
                    break;
                }
                if (iM158752u == 10) {
                    omsCard.pictures = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    omsCard.color = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    omsCard.topLeftTags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    omsCard.icons = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    omsCard.title = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    omsCard.description = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
                        if (omsCard.pictures == null) {
                            omsCard.pictures = new ArrayList();
                        }
                        if (omsCard.color == null) {
                            omsCard.color = "";
                        }
                        if (omsCard.topLeftTags == null) {
                            omsCard.topLeftTags = new ArrayList();
                        }
                        if (omsCard.icons == null) {
                            omsCard.icons = new ArrayList();
                        }
                        if (omsCard.title == null) {
                            omsCard.title = "";
                        }
                        if (omsCard.description == null) {
                            omsCard.description = "";
                        }
                        if (omsCard.action != null) {
                            break;
                        }
                        omsCard.action = Action.new_();
                        return omsCard;
                    }
                    omsCard.action = (Action) nb5Var.m158743l(Action.PROTOBUF_ADAPTER);
                }
            }
            return omsCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsCard omsCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = omsCard.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = omsCard.color;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<String> list2 = omsCard.topLeftTags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCard.icons;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCard.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            String str3 = omsCard.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            Action action = omsCard.action;
            if (action != null) {
                codedOutputByteBufferNano.m17254K(7, action, Action.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsCard> JSON_ADAPTER = new ObjectJsonAdapter<OmsCard>() { // from class: com.p1.mobile.putong.data.OmsCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsCard newInstance() {
            return new OmsCard();
        }

        public boolean parseField(OmsCard omsCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    omsCard.description = jsonParser.getValueAsString();
                    return true;
                case "action":
                    omsCard.action = Action.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topLeftTags":
                    omsCard.topLeftTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    omsCard.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "color":
                    omsCard.color = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    omsCard.icons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    omsCard.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsCard omsCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "action":
                case "topLeftTags":
                case "pictures":
                case "color":
                case "icons":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(omsCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCard omsCard, JsonGenerator jsonGenerator) throws IOException {
            if (omsCard.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(omsCard.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = omsCard.color;
            if (str != null) {
                jsonGenerator.writeStringField("color", str);
            }
            if (omsCard.topLeftTags != null) {
                jsonGenerator.writeFieldName("topLeftTags");
                JsonAdapter.serializeArray(omsCard.topLeftTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (omsCard.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(omsCard.icons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = omsCard.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = omsCard.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            if (omsCard.action != null) {
                jsonGenerator.writeFieldName("action");
                Action.JSON_ADAPTER.serialize(omsCard.action, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59951a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59953c(String str) {
        return str;
    }

    public static OmsCard new_() {
        OmsCard omsCard = new OmsCard();
        omsCard.nullCheck();
        return omsCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsCard mo223809clone() {
        OmsCard omsCard = new OmsCard();
        List<Media> list = this.pictures;
        if (list != null) {
            omsCard.pictures = ValueObject.util_map(list, new w9j() { // from class: l.da50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        omsCard.color = this.color;
        List<String> list2 = this.topLeftTags;
        if (list2 != null) {
            omsCard.topLeftTags = ValueObject.util_map(list2, new w9j() { // from class: l.ea50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OmsCard.m59953c((String) obj);
                }
            });
        }
        List<String> list3 = this.icons;
        if (list3 != null) {
            omsCard.icons = ValueObject.util_map(list3, new w9j() { // from class: l.fa50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OmsCard.m59951a((String) obj);
                }
            });
        }
        omsCard.title = this.title;
        omsCard.description = this.description;
        Action action = this.action;
        if (action != null) {
            omsCard.action = action.mo223809clone();
        }
        return omsCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsCard)) {
            return false;
        }
        OmsCard omsCard = (OmsCard) obj;
        return ValueObject.util_equals(this.pictures, omsCard.pictures) && ValueObject.util_equals(this.color, omsCard.color) && ValueObject.util_equals(this.topLeftTags, omsCard.topLeftTags) && ValueObject.util_equals(this.icons, omsCard.icons) && ValueObject.util_equals(this.title, omsCard.title) && ValueObject.util_equals(this.description, omsCard.description) && ValueObject.util_equals(this.action, omsCard.action);
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
        String str3 = this.description;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Action action = this.action;
        int iHashCode7 = iHashCode6 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (this.description == null) {
            this.description = "";
        }
        if (this.action == null) {
            this.action = Action.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
