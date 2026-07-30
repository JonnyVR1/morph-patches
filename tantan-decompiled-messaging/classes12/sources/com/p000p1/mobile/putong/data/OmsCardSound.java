package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OmsCardSound;
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
public class OmsCardSound extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscardsound";

    @NonNull
    @ProtobufIndex(index = 7)
    public Action button;

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
    public static ProtobufAdapter<OmsCardSound> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsCardSound>() { // from class: com.p1.mobile.putong.data.OmsCardSound.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsCardSound omsCardSound) {
            List<Media> list = omsCardSound.pictures;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = omsCardSound.color;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            List<String> list2 = omsCardSound.topLeftTags;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCardSound.icons;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCardSound.title;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = omsCardSound.description;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(6, str3);
            }
            Action action = omsCardSound.button;
            if (action != null) {
                iL += CodedOutputByteBufferNano.l(7, action, Action.PROTOBUF_ADAPTER);
            }
            ((MessageNano) omsCardSound).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsCardSound m18711parse(nb5 nb5Var) throws IOException {
            OmsCardSound omsCardSound = new OmsCardSound();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsCardSound.pictures == null) {
                        omsCardSound.pictures = new ArrayList();
                    }
                    if (omsCardSound.color == null) {
                        omsCardSound.color = "";
                    }
                    if (omsCardSound.topLeftTags == null) {
                        omsCardSound.topLeftTags = new ArrayList();
                    }
                    if (omsCardSound.icons == null) {
                        omsCardSound.icons = new ArrayList();
                    }
                    if (omsCardSound.title == null) {
                        omsCardSound.title = "";
                    }
                    if (omsCardSound.description == null) {
                        omsCardSound.description = "";
                    }
                    if (omsCardSound.button != null) {
                        break;
                    }
                    omsCardSound.button = Action.new_();
                    break;
                }
                if (iU == 10) {
                    omsCardSound.pictures = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    omsCardSound.color = nb5Var.s();
                } else if (iU == 26) {
                    omsCardSound.topLeftTags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    omsCardSound.icons = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    omsCardSound.title = nb5Var.s();
                } else if (iU == 50) {
                    omsCardSound.description = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (omsCardSound.pictures == null) {
                            omsCardSound.pictures = new ArrayList();
                        }
                        if (omsCardSound.color == null) {
                            omsCardSound.color = "";
                        }
                        if (omsCardSound.topLeftTags == null) {
                            omsCardSound.topLeftTags = new ArrayList();
                        }
                        if (omsCardSound.icons == null) {
                            omsCardSound.icons = new ArrayList();
                        }
                        if (omsCardSound.title == null) {
                            omsCardSound.title = "";
                        }
                        if (omsCardSound.description == null) {
                            omsCardSound.description = "";
                        }
                        if (omsCardSound.button != null) {
                            break;
                        }
                        omsCardSound.button = Action.new_();
                        return omsCardSound;
                    }
                    omsCardSound.button = (Action) nb5Var.l(Action.PROTOBUF_ADAPTER);
                }
            }
            return omsCardSound;
        }

        public void serialize(OmsCardSound omsCardSound, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = omsCardSound.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = omsCardSound.color;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            List<String> list2 = omsCardSound.topLeftTags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = omsCardSound.icons;
            if (list3 != null) {
                codedOutputByteBufferNano.K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = omsCardSound.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = omsCardSound.description;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            Action action = omsCardSound.button;
            if (action != null) {
                codedOutputByteBufferNano.K(7, action, Action.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsCardSound> JSON_ADAPTER = new ObjectJsonAdapter<OmsCardSound>() { // from class: com.p1.mobile.putong.data.OmsCardSound.2
        public Class getDataClass() {
            return OmsCardSound.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsCardSound mo17830newInstance() {
            return new OmsCardSound();
        }

        public boolean parseField(OmsCardSound omsCardSound, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    omsCardSound.description = jsonParser.getValueAsString();
                    return true;
                case "topLeftTags":
                    omsCardSound.topLeftTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "button":
                    omsCardSound.button = (Action) Action.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    omsCardSound.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "color":
                    omsCardSound.color = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    omsCardSound.icons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    omsCardSound.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsCardSound omsCardSound, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "topLeftTags":
                case "button":
                case "pictures":
                case "color":
                case "icons":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(omsCardSound, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCardSound omsCardSound, JsonGenerator jsonGenerator) throws IOException {
            if (omsCardSound.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(omsCardSound.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = omsCardSound.color;
            if (str != null) {
                jsonGenerator.writeStringField("color", str);
            }
            if (omsCardSound.topLeftTags != null) {
                jsonGenerator.writeFieldName("topLeftTags");
                JsonAdapter.serializeArray(omsCardSound.topLeftTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (omsCardSound.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(omsCardSound.icons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = omsCardSound.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = omsCardSound.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            if (omsCardSound.button != null) {
                jsonGenerator.writeFieldName("button");
                Action.JSON_ADAPTER.serialize(omsCardSound.button, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCardSound) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCardSound) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m877a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m878b(String str) {
        return str;
    }

    public static OmsCardSound new_() {
        OmsCardSound omsCardSound = new OmsCardSound();
        omsCardSound.nullCheck();
        return omsCardSound;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsCardSound m18710clone() {
        OmsCardSound omsCardSound = new OmsCardSound();
        List<Media> list = this.pictures;
        if (list != null) {
            omsCardSound.pictures = ValueObject.util_map(list, new w9j() { // from class: l.la50
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        omsCardSound.color = this.color;
        List<String> list2 = this.topLeftTags;
        if (list2 != null) {
            omsCardSound.topLeftTags = ValueObject.util_map(list2, new w9j() { // from class: l.ma50
                public final Object call(Object obj) {
                    return OmsCardSound.m878b((String) obj);
                }
            });
        }
        List<String> list3 = this.icons;
        if (list3 != null) {
            omsCardSound.icons = ValueObject.util_map(list3, new w9j() { // from class: l.na50
                public final Object call(Object obj) {
                    return OmsCardSound.m877a((String) obj);
                }
            });
        }
        omsCardSound.title = this.title;
        omsCardSound.description = this.description;
        Action action = this.button;
        if (action != null) {
            omsCardSound.button = action.m17622clone();
        }
        return omsCardSound;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsCardSound)) {
            return false;
        }
        OmsCardSound omsCardSound = (OmsCardSound) obj;
        return ValueObject.util_equals(this.pictures, omsCardSound.pictures) && ValueObject.util_equals(this.color, omsCardSound.color) && ValueObject.util_equals(this.topLeftTags, omsCardSound.topLeftTags) && ValueObject.util_equals(this.icons, omsCardSound.icons) && ValueObject.util_equals(this.title, omsCardSound.title) && ValueObject.util_equals(this.description, omsCardSound.description) && ValueObject.util_equals(this.button, omsCardSound.button);
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
        String str3 = this.description;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Action action = this.button;
        int iHashCode7 = iHashCode6 + (action != null ? action.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
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
        if (this.description == null) {
            this.description = "";
        }
        if (this.button == null) {
            this.button = Action.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
