package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class TagCategories extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tagcategories";

    @NonNull
    @ProtobufIndex(index = 6)
    public String categoryBackground;

    @NonNull
    @ProtobufIndex(index = 7)
    public String categoryIcon;

    @NonNull
    @ProtobufIndex(index = 8)
    public String categoryTextColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconSelected;

    @NonNull
    @ProtobufIndex(index = 5)
    public String iconWhite;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21256id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<TagCategories> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagCategories>() { // from class: com.p1.mobile.putong.core.data.TagCategories.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TagCategories tagCategories) {
            String str = tagCategories.f21256id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = tagCategories.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = tagCategories.iconWhite;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = tagCategories.categoryBackground;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = tagCategories.categoryIcon;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = tagCategories.categoryTextColor;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            tagCategories.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TagCategories parse(nc5 nc5Var) throws IOException {
            TagCategories tagCategories = new TagCategories();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tagCategories.f21256id == null) {
                        tagCategories.f21256id = "";
                    }
                    if (tagCategories.name == null) {
                        tagCategories.name = "";
                    }
                    if (tagCategories.iconSelected == null) {
                        tagCategories.iconSelected = "";
                    }
                    if (tagCategories.icon == null) {
                        tagCategories.icon = "";
                    }
                    if (tagCategories.iconWhite == null) {
                        tagCategories.iconWhite = "";
                    }
                    if (tagCategories.categoryBackground == null) {
                        tagCategories.categoryBackground = "";
                    }
                    if (tagCategories.categoryIcon == null) {
                        tagCategories.categoryIcon = "";
                    }
                    if (tagCategories.categoryTextColor != null) {
                        break;
                    }
                    tagCategories.categoryTextColor = "";
                    break;
                }
                if (iM162497u == 10) {
                    tagCategories.f21256id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    tagCategories.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    tagCategories.iconSelected = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    tagCategories.icon = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    tagCategories.iconWhite = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    tagCategories.categoryBackground = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    tagCategories.categoryIcon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (tagCategories.f21256id == null) {
                            tagCategories.f21256id = "";
                        }
                        if (tagCategories.name == null) {
                            tagCategories.name = "";
                        }
                        if (tagCategories.iconSelected == null) {
                            tagCategories.iconSelected = "";
                        }
                        if (tagCategories.icon == null) {
                            tagCategories.icon = "";
                        }
                        if (tagCategories.iconWhite == null) {
                            tagCategories.iconWhite = "";
                        }
                        if (tagCategories.categoryBackground == null) {
                            tagCategories.categoryBackground = "";
                        }
                        if (tagCategories.categoryIcon == null) {
                            tagCategories.categoryIcon = "";
                        }
                        if (tagCategories.categoryTextColor != null) {
                            break;
                        }
                        tagCategories.categoryTextColor = "";
                        return tagCategories;
                    }
                    tagCategories.categoryTextColor = nc5Var.m162495s();
                }
            }
            return tagCategories;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TagCategories tagCategories, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tagCategories.f21256id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = tagCategories.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = tagCategories.iconWhite;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = tagCategories.categoryBackground;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = tagCategories.categoryIcon;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = tagCategories.categoryTextColor;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
        }
    };
    public static JsonAdapter<TagCategories> JSON_ADAPTER = new ObjectJsonAdapter<TagCategories>() { // from class: com.p1.mobile.putong.core.data.TagCategories.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TagCategories.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TagCategories newInstance() {
            return new TagCategories();
        }

        public boolean parseField(TagCategories tagCategories, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconSelected":
                    tagCategories.iconSelected = jsonParser.getValueAsString();
                    return true;
                case "iconWhite":
                    tagCategories.iconWhite = jsonParser.getValueAsString();
                    return true;
                case "categoryTextColor":
                    tagCategories.categoryTextColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    tagCategories.f21256id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    tagCategories.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    tagCategories.name = jsonParser.getValueAsString();
                    return true;
                case "categoryIcon":
                    tagCategories.categoryIcon = jsonParser.getValueAsString();
                    return true;
                case "categoryBackground":
                    tagCategories.categoryBackground = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TagCategories tagCategories, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iconSelected":
                case "iconWhite":
                case "categoryTextColor":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "categoryIcon":
                case "categoryBackground":
                    return true;
                default:
                    return super.parseFieldCheck(tagCategories, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TagCategories tagCategories, JsonGenerator jsonGenerator) throws IOException {
            String str = tagCategories.f21256id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = tagCategories.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconSelected", str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            String str5 = tagCategories.iconWhite;
            if (str5 != null) {
                jsonGenerator.writeStringField("iconWhite", str5);
            }
            String str6 = tagCategories.categoryBackground;
            if (str6 != null) {
                jsonGenerator.writeStringField("categoryBackground", str6);
            }
            String str7 = tagCategories.categoryIcon;
            if (str7 != null) {
                jsonGenerator.writeStringField("categoryIcon", str7);
            }
            String str8 = tagCategories.categoryTextColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("categoryTextColor", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagCategories) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagCategories) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagCategories new_() {
        TagCategories tagCategories = new TagCategories();
        tagCategories.nullCheck();
        return tagCategories;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TagCategories mo225055clone() {
        TagCategories tagCategories = new TagCategories();
        tagCategories.f21256id = this.f21256id;
        tagCategories.name = this.name;
        tagCategories.iconSelected = this.iconSelected;
        tagCategories.icon = this.icon;
        tagCategories.iconWhite = this.iconWhite;
        tagCategories.categoryBackground = this.categoryBackground;
        tagCategories.categoryIcon = this.categoryIcon;
        tagCategories.categoryTextColor = this.categoryTextColor;
        return tagCategories;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagCategories)) {
            return false;
        }
        TagCategories tagCategories = (TagCategories) obj;
        return ValueObject.util_equals(this.f21256id, tagCategories.f21256id) && ValueObject.util_equals(this.name, tagCategories.name) && ValueObject.util_equals(this.iconSelected, tagCategories.iconSelected) && ValueObject.util_equals(this.icon, tagCategories.icon) && ValueObject.util_equals(this.iconWhite, tagCategories.iconWhite) && ValueObject.util_equals(this.categoryBackground, tagCategories.categoryBackground) && ValueObject.util_equals(this.categoryIcon, tagCategories.categoryIcon) && ValueObject.util_equals(this.categoryTextColor, tagCategories.categoryTextColor);
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
        String str = this.f21256id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconSelected;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.iconWhite;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.categoryBackground;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.categoryIcon;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.categoryTextColor;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21256id == null) {
            this.f21256id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.iconSelected == null) {
            this.iconSelected = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.iconWhite == null) {
            this.iconWhite = "";
        }
        if (this.categoryBackground == null) {
            this.categoryBackground = "";
        }
        if (this.categoryIcon == null) {
            this.categoryIcon = "";
        }
        if (this.categoryTextColor == null) {
            this.categoryTextColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
