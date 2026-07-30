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
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String iconSelected;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String iconWhite;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f176id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<TagCategories> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagCategories>() { // from class: com.p1.mobile.putong.core.data.TagCategories.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TagCategories tagCategories) {
            String str = tagCategories.f176id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tagCategories.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = tagCategories.iconWhite;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = tagCategories.categoryBackground;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = tagCategories.categoryIcon;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = tagCategories.categoryTextColor;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            ((MessageNano) tagCategories).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TagCategories m15902parse(nb5 nb5Var) throws IOException {
            TagCategories tagCategories = new TagCategories();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tagCategories.f176id == null) {
                        tagCategories.f176id = "";
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
                if (iU == 10) {
                    tagCategories.f176id = nb5Var.s();
                } else if (iU == 18) {
                    tagCategories.name = nb5Var.s();
                } else if (iU == 26) {
                    tagCategories.iconSelected = nb5Var.s();
                } else if (iU == 34) {
                    tagCategories.icon = nb5Var.s();
                } else if (iU == 42) {
                    tagCategories.iconWhite = nb5Var.s();
                } else if (iU == 50) {
                    tagCategories.categoryBackground = nb5Var.s();
                } else if (iU == 58) {
                    tagCategories.categoryIcon = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (tagCategories.f176id == null) {
                            tagCategories.f176id = "";
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
                    tagCategories.categoryTextColor = nb5Var.s();
                }
            }
            return tagCategories;
        }

        public void serialize(TagCategories tagCategories, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tagCategories.f176id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tagCategories.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = tagCategories.iconWhite;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = tagCategories.categoryBackground;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = tagCategories.categoryIcon;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = tagCategories.categoryTextColor;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
        }
    };
    public static JsonAdapter<TagCategories> JSON_ADAPTER = new ObjectJsonAdapter<TagCategories>() { // from class: com.p1.mobile.putong.core.data.TagCategories.2
        public Class getDataClass() {
            return TagCategories.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TagCategories m15903newInstance() {
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
                    tagCategories.f176id = jsonParser.getValueAsString();
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

        public void serializeFields(TagCategories tagCategories, JsonGenerator jsonGenerator) throws IOException {
            String str = tagCategories.f176id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = tagCategories.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = tagCategories.iconSelected;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconSelected", str3);
            }
            String str4 = tagCategories.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str4);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagCategories) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagCategories) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagCategories new_() {
        TagCategories tagCategories = new TagCategories();
        tagCategories.nullCheck();
        return tagCategories;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TagCategories m15901clone() {
        TagCategories tagCategories = new TagCategories();
        tagCategories.f176id = this.f176id;
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
        return ValueObject.util_equals(this.f176id, tagCategories.f176id) && ValueObject.util_equals(this.name, tagCategories.name) && ValueObject.util_equals(this.iconSelected, tagCategories.iconSelected) && ValueObject.util_equals(this.icon, tagCategories.icon) && ValueObject.util_equals(this.iconWhite, tagCategories.iconWhite) && ValueObject.util_equals(this.categoryBackground, tagCategories.categoryBackground) && ValueObject.util_equals(this.categoryIcon, tagCategories.categoryIcon) && ValueObject.util_equals(this.categoryTextColor, tagCategories.categoryTextColor);
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
        String str = this.f176id;
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
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.f176id == null) {
            this.f176id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
