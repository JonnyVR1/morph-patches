package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.NewTags;
import com.p000p1.mobile.putong.core.data.TagCategories;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newtags";

    @NonNull
    @ProtobufIndex(index = 16)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> categories;

    @NonNull
    @ProtobufIndex(index = 11)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f119id;

    @ProtobufIndex(index = 13)
    public int index;

    @ProtobufIndex(index = 12)
    public boolean isPictureTag;

    @ProtobufIndex(index = 14)
    public int loadIcon;

    @Nullable
    @ProtobufIndex(index = 18)
    public String localCreditScore;

    @ProtobufIndex(index = 8)
    public boolean localIsCommonLabel;

    @ProtobufIndex(index = 17)
    public boolean localShowCreditScore;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String localShowName;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<TagCategories> localTagCategories;

    @ProtobufIndex(index = 7)
    public long localTagUserCounts;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 15)
    public String nameColor;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String operation;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<NewTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewTags>() { // from class: com.p1.mobile.putong.core.data.NewTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewTags newTags) {
            String str = newTags.f119id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newTags.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = newTags.categories;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(7, newTags.localTagUserCounts) + CodedOutputByteBufferNano.b(8, newTags.localIsCommonLabel);
            List<TagCategories> list2 = newTags.localTagCategories;
            if (list2 != null) {
                iJ += CodedOutputByteBufferNano.l(9, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(10, str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                iJ += CodedOutputByteBufferNano.o(11, str7);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(12, newTags.isPictureTag) + CodedOutputByteBufferNano.h(13, newTags.index) + CodedOutputByteBufferNano.h(14, newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                iB += CodedOutputByteBufferNano.o(15, str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(16, str9);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(17, newTags.localShowCreditScore);
            String str10 = newTags.localCreditScore;
            if (str10 != null) {
                iB2 += CodedOutputByteBufferNano.o(18, str10);
            }
            ((MessageNano) newTags).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewTags m14539parse(nb5 nb5Var) throws IOException {
            NewTags newTags = new NewTags();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (newTags.f119id == null) {
                            newTags.f119id = "";
                        }
                        if (newTags.name == null) {
                            newTags.name = "";
                        }
                        if (newTags.categories == null) {
                            newTags.categories = new ArrayList();
                        }
                        if (newTags.icon == null) {
                            newTags.icon = "";
                        }
                        if (newTags.operation == null) {
                            newTags.operation = "";
                        }
                        if (newTags.status == null) {
                            newTags.status = "";
                        }
                        if (newTags.localTagCategories == null) {
                            newTags.localTagCategories = new ArrayList();
                        }
                        if (newTags.localShowName == null) {
                            newTags.localShowName = "";
                        }
                        if (newTags.gender == null) {
                            newTags.gender = "";
                        }
                        if (newTags.nameColor == null) {
                            newTags.nameColor = "";
                        }
                        if (newTags.bgColor == null) {
                            newTags.bgColor = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        newTags.f119id = nb5Var.s();
                        continue;
                    case 18:
                        newTags.name = nb5Var.s();
                        continue;
                    case 26:
                        newTags.categories = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        newTags.icon = nb5Var.s();
                        continue;
                    case 42:
                        newTags.operation = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        newTags.status = nb5Var.s();
                        continue;
                    case 56:
                        newTags.localTagUserCounts = nb5Var.k();
                        continue;
                    case 64:
                        newTags.localIsCommonLabel = nb5Var.g();
                        continue;
                    case 74:
                        newTags.localTagCategories = (List) nb5Var.l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        newTags.localShowName = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        newTags.gender = nb5Var.s();
                        continue;
                    case 96:
                        newTags.isPictureTag = nb5Var.g();
                        continue;
                    case 104:
                        newTags.index = nb5Var.j();
                        continue;
                    case 112:
                        newTags.loadIcon = nb5Var.j();
                        continue;
                    case 122:
                        newTags.nameColor = nb5Var.s();
                        continue;
                    case 130:
                        newTags.bgColor = nb5Var.s();
                        continue;
                    case 136:
                        newTags.localShowCreditScore = nb5Var.g();
                        continue;
                    case 146:
                        newTags.localCreditScore = nb5Var.s();
                        continue;
                    default:
                        if (newTags.f119id == null) {
                            newTags.f119id = "";
                        }
                        if (newTags.name == null) {
                            newTags.name = "";
                        }
                        if (newTags.categories == null) {
                            newTags.categories = new ArrayList();
                        }
                        if (newTags.icon == null) {
                            newTags.icon = "";
                        }
                        if (newTags.operation == null) {
                            newTags.operation = "";
                        }
                        if (newTags.status == null) {
                            newTags.status = "";
                        }
                        if (newTags.localTagCategories == null) {
                            newTags.localTagCategories = new ArrayList();
                        }
                        if (newTags.localShowName == null) {
                            newTags.localShowName = "";
                        }
                        if (newTags.gender == null) {
                            newTags.gender = "";
                        }
                        if (newTags.nameColor == null) {
                            newTags.nameColor = "";
                        }
                        if (newTags.bgColor == null) {
                            newTags.bgColor = "";
                            return newTags;
                        }
                        break;
                }
            }
            return newTags;
        }

        public void serialize(NewTags newTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newTags.f119id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newTags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = newTags.categories;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            codedOutputByteBufferNano.I(7, newTags.localTagUserCounts);
            codedOutputByteBufferNano.A(8, newTags.localIsCommonLabel);
            List<TagCategories> list2 = newTags.localTagCategories;
            if (list2 != null) {
                codedOutputByteBufferNano.K(9, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                codedOutputByteBufferNano.R(11, str7);
            }
            codedOutputByteBufferNano.A(12, newTags.isPictureTag);
            codedOutputByteBufferNano.G(13, newTags.index);
            codedOutputByteBufferNano.G(14, newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                codedOutputByteBufferNano.R(15, str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                codedOutputByteBufferNano.R(16, str9);
            }
            codedOutputByteBufferNano.A(17, newTags.localShowCreditScore);
            String str10 = newTags.localCreditScore;
            if (str10 != null) {
                codedOutputByteBufferNano.R(18, str10);
            }
        }
    };
    public static JsonAdapter<NewTags> JSON_ADAPTER = new ObjectJsonAdapter<NewTags>() { // from class: com.p1.mobile.putong.core.data.NewTags.2
        public Class getDataClass() {
            return NewTags.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewTags m14540newInstance() {
            return new NewTags();
        }

        public boolean parseField(NewTags newTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "localShowName":
                    newTags.localShowName = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    newTags.gender = jsonParser.getValueAsString();
                    return true;
                case "status":
                    newTags.status = jsonParser.getValueAsString();
                    return true;
                case "localIsCommonLabel":
                    newTags.localIsCommonLabel = jsonParser.getValueAsBoolean();
                    return true;
                case "bgColor":
                    newTags.bgColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    newTags.f119id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    newTags.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    newTags.name = jsonParser.getValueAsString();
                    return true;
                case "index":
                    newTags.index = jsonParser.getValueAsInt();
                    return true;
                case "isPictureTag":
                    newTags.isPictureTag = jsonParser.getValueAsBoolean();
                    return true;
                case "localTagUserCounts":
                    newTags.localTagUserCounts = jsonParser.getValueAsLong();
                    return true;
                case "nameColor":
                    newTags.nameColor = jsonParser.getValueAsString();
                    return true;
                case "categories":
                    newTags.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "localTagCategories":
                    newTags.localTagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "operation":
                    newTags.operation = jsonParser.getValueAsString();
                    return true;
                case "loadIcon":
                    newTags.loadIcon = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewTags newTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "localShowName":
                case "gender":
                case "status":
                case "localIsCommonLabel":
                case "bgColor":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "index":
                case "isPictureTag":
                case "localTagUserCounts":
                case "nameColor":
                case "categories":
                case "localTagCategories":
                case "operation":
                case "loadIcon":
                    return true;
                default:
                    return super.parseFieldCheck(newTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NewTags newTags, JsonGenerator jsonGenerator) throws IOException {
            String str = newTags.f119id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newTags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (newTags.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(newTags.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = newTags.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
            String str4 = newTags.operation;
            if (str4 != null) {
                jsonGenerator.writeStringField(MessageType.operation, str4);
            }
            String str5 = newTags.status;
            if (str5 != null) {
                jsonGenerator.writeStringField("status", str5);
            }
            jsonGenerator.writeNumberField("localTagUserCounts", newTags.localTagUserCounts);
            jsonGenerator.writeBooleanField("localIsCommonLabel", newTags.localIsCommonLabel);
            if (newTags.localTagCategories != null) {
                jsonGenerator.writeFieldName("localTagCategories");
                JsonAdapter.serializeArray(newTags.localTagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            String str6 = newTags.localShowName;
            if (str6 != null) {
                jsonGenerator.writeStringField("localShowName", str6);
            }
            String str7 = newTags.gender;
            if (str7 != null) {
                jsonGenerator.writeStringField("gender", str7);
            }
            jsonGenerator.writeBooleanField("isPictureTag", newTags.isPictureTag);
            jsonGenerator.writeNumberField("index", newTags.index);
            jsonGenerator.writeNumberField("loadIcon", newTags.loadIcon);
            String str8 = newTags.nameColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("nameColor", str8);
            }
            String str9 = newTags.bgColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("bgColor", str9);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m522b(String str) {
        return str;
    }

    public static NewTags new_() {
        NewTags newTags = new NewTags();
        newTags.nullCheck();
        return newTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewTags m14538clone() {
        NewTags newTags = new NewTags();
        newTags.f119id = this.f119id;
        newTags.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            newTags.categories = ValueObject.util_map(list, new w9j() { // from class: l.ha40
                public final Object call(Object obj) {
                    return NewTags.m522b((String) obj);
                }
            });
        }
        newTags.icon = this.icon;
        newTags.operation = this.operation;
        newTags.status = this.status;
        newTags.localTagUserCounts = this.localTagUserCounts;
        newTags.localIsCommonLabel = this.localIsCommonLabel;
        List<TagCategories> list2 = this.localTagCategories;
        if (list2 != null) {
            newTags.localTagCategories = ValueObject.util_map(list2, new w9j() { // from class: l.ia40
                public final Object call(Object obj) {
                    return ((TagCategories) obj).m15901clone();
                }
            });
        }
        newTags.localShowName = this.localShowName;
        newTags.gender = this.gender;
        newTags.isPictureTag = this.isPictureTag;
        newTags.index = this.index;
        newTags.loadIcon = this.loadIcon;
        newTags.nameColor = this.nameColor;
        newTags.bgColor = this.bgColor;
        newTags.localShowCreditScore = this.localShowCreditScore;
        newTags.localCreditScore = this.localCreditScore;
        return newTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewTags)) {
            return false;
        }
        NewTags newTags = (NewTags) obj;
        return ValueObject.util_equals(this.f119id, newTags.f119id) && ValueObject.util_equals(this.name, newTags.name) && ValueObject.util_equals(this.categories, newTags.categories) && ValueObject.util_equals(this.icon, newTags.icon) && ValueObject.util_equals(this.operation, newTags.operation) && ValueObject.util_equals(this.status, newTags.status) && this.localTagUserCounts == newTags.localTagUserCounts && this.localIsCommonLabel == newTags.localIsCommonLabel && ValueObject.util_equals(this.localTagCategories, newTags.localTagCategories) && ValueObject.util_equals(this.localShowName, newTags.localShowName) && ValueObject.util_equals(this.gender, newTags.gender) && this.isPictureTag == newTags.isPictureTag && this.index == newTags.index && this.loadIcon == newTags.loadIcon && ValueObject.util_equals(this.nameColor, newTags.nameColor) && ValueObject.util_equals(this.bgColor, newTags.bgColor) && this.localShowCreditScore == newTags.localShowCreditScore && ValueObject.util_equals(this.localCreditScore, newTags.localCreditScore);
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
        String str = this.f119id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.operation;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        long j = this.localTagUserCounts;
        int i3 = (((((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.localIsCommonLabel ? 1231 : 1237)) * 41;
        List<TagCategories> list2 = this.localTagCategories;
        int iHashCode7 = (i3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str6 = this.localShowName;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.gender;
        int iHashCode9 = (((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isPictureTag ? 1231 : 1237)) * 41) + this.index) * 41) + this.loadIcon) * 41;
        String str8 = this.nameColor;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.bgColor;
        int iHashCode11 = (((iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.localShowCreditScore ? 1231 : 1237)) * 41;
        String str10 = this.localCreditScore;
        int iHashCode12 = iHashCode11 + (str10 != null ? str10.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

    public void nullCheck() {
        if (this.f119id == null) {
            this.f119id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.operation == null) {
            this.operation = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.localTagCategories == null) {
            this.localTagCategories = new ArrayList();
        }
        if (this.localShowName == null) {
            this.localShowName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.nameColor == null) {
            this.nameColor = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
