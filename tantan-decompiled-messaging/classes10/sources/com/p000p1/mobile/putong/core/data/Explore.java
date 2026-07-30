package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardInfo;
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
public class Explore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "explore";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int Remaining_swipes;

    @NonNull
    @ProtobufIndex(index = 4)
    public String background_color;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean can_swiped;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CardInfo> cards;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean matched;

    @NonNull
    @ProtobufIndex(index = 15)
    public String new_pop_up_box_title;

    @NonNull
    @ProtobufIndex(index = 14)
    public String new_pop_up_sub_title;

    @NonNull
    @ProtobufIndex(index = 13)
    public String new_pop_up_title;

    @NonNull
    @ProtobufIndex(index = 16)
    public String new_pop_up_warning;

    @NonNull
    @ProtobufIndex(index = 7)
    public String pop_up_icon;

    @NonNull
    @ProtobufIndex(index = 9)
    public String pop_up_sub_title;

    @NonNull
    @ProtobufIndex(index = 8)
    public String pop_up_title;

    @ProtobufIndex(index = 6)
    public int remaining_likes;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String skip;

    @NonNull
    @ProtobufIndex(index = 12)
    public String tag_background_color;

    @NonNull
    @ProtobufIndex(index = 11)
    public String tag_icon;
    public static ProtobufAdapter<Explore> PROTOBUF_ADAPTER = new MessageNanoAdapter<Explore>() { // from class: com.p1.mobile.putong.core.data.Explore.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Explore explore) {
            List<CardInfo> list = explore.cards;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, explore.can_swiped) + CodedOutputByteBufferNano.b(3, explore.matched);
            String str = explore.background_color;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(4, str);
            }
            int iH = iL + CodedOutputByteBufferNano.h(5, explore.Remaining_swipes) + CodedOutputByteBufferNano.h(6, explore.remaining_likes);
            String str2 = explore.pop_up_icon;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(7, str2);
            }
            String str3 = explore.pop_up_title;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(8, str3);
            }
            String str4 = explore.pop_up_sub_title;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(9, str4);
            }
            String str5 = explore.skip;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(10, str5);
            }
            String str6 = explore.tag_icon;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(11, str6);
            }
            String str7 = explore.tag_background_color;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(12, str7);
            }
            String str8 = explore.new_pop_up_title;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(13, str8);
            }
            String str9 = explore.new_pop_up_sub_title;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(14, str9);
            }
            String str10 = explore.new_pop_up_box_title;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(15, str10);
            }
            String str11 = explore.new_pop_up_warning;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(16, str11);
            }
            ((MessageNano) explore).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Explore m12677parse(nb5 nb5Var) throws IOException {
            Explore explore = new Explore();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (explore.cards == null) {
                            explore.cards = new ArrayList();
                        }
                        if (explore.background_color == null) {
                            explore.background_color = "";
                        }
                        if (explore.pop_up_icon == null) {
                            explore.pop_up_icon = "";
                        }
                        if (explore.pop_up_title == null) {
                            explore.pop_up_title = "";
                        }
                        if (explore.pop_up_sub_title == null) {
                            explore.pop_up_sub_title = "";
                        }
                        if (explore.skip == null) {
                            explore.skip = "";
                        }
                        if (explore.tag_icon == null) {
                            explore.tag_icon = "";
                        }
                        if (explore.tag_background_color == null) {
                            explore.tag_background_color = "";
                        }
                        if (explore.new_pop_up_title == null) {
                            explore.new_pop_up_title = "";
                        }
                        if (explore.new_pop_up_sub_title == null) {
                            explore.new_pop_up_sub_title = "";
                        }
                        if (explore.new_pop_up_box_title == null) {
                            explore.new_pop_up_box_title = "";
                        }
                        if (explore.new_pop_up_warning == null) {
                            explore.new_pop_up_warning = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        explore.cards = (List) nb5Var.l(CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        explore.can_swiped = nb5Var.g();
                        continue;
                    case 24:
                        explore.matched = nb5Var.g();
                        continue;
                    case 34:
                        explore.background_color = nb5Var.s();
                        continue;
                    case 40:
                        explore.Remaining_swipes = nb5Var.j();
                        continue;
                    case 48:
                        explore.remaining_likes = nb5Var.j();
                        continue;
                    case 58:
                        explore.pop_up_icon = nb5Var.s();
                        continue;
                    case 66:
                        explore.pop_up_title = nb5Var.s();
                        continue;
                    case 74:
                        explore.pop_up_sub_title = nb5Var.s();
                        continue;
                    case 82:
                        explore.skip = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        explore.tag_icon = nb5Var.s();
                        continue;
                    case 98:
                        explore.tag_background_color = nb5Var.s();
                        continue;
                    case 106:
                        explore.new_pop_up_title = nb5Var.s();
                        continue;
                    case 114:
                        explore.new_pop_up_sub_title = nb5Var.s();
                        continue;
                    case 122:
                        explore.new_pop_up_box_title = nb5Var.s();
                        continue;
                    case 130:
                        explore.new_pop_up_warning = nb5Var.s();
                        continue;
                    default:
                        if (explore.cards == null) {
                            explore.cards = new ArrayList();
                        }
                        if (explore.background_color == null) {
                            explore.background_color = "";
                        }
                        if (explore.pop_up_icon == null) {
                            explore.pop_up_icon = "";
                        }
                        if (explore.pop_up_title == null) {
                            explore.pop_up_title = "";
                        }
                        if (explore.pop_up_sub_title == null) {
                            explore.pop_up_sub_title = "";
                        }
                        if (explore.skip == null) {
                            explore.skip = "";
                        }
                        if (explore.tag_icon == null) {
                            explore.tag_icon = "";
                        }
                        if (explore.tag_background_color == null) {
                            explore.tag_background_color = "";
                        }
                        if (explore.new_pop_up_title == null) {
                            explore.new_pop_up_title = "";
                        }
                        if (explore.new_pop_up_sub_title == null) {
                            explore.new_pop_up_sub_title = "";
                        }
                        if (explore.new_pop_up_box_title == null) {
                            explore.new_pop_up_box_title = "";
                        }
                        if (explore.new_pop_up_warning == null) {
                            explore.new_pop_up_warning = "";
                            return explore;
                        }
                        break;
                }
            }
            return explore;
        }

        public void serialize(Explore explore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CardInfo> list = explore.cards;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, explore.can_swiped);
            codedOutputByteBufferNano.A(3, explore.matched);
            String str = explore.background_color;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            codedOutputByteBufferNano.G(5, explore.Remaining_swipes);
            codedOutputByteBufferNano.G(6, explore.remaining_likes);
            String str2 = explore.pop_up_icon;
            if (str2 != null) {
                codedOutputByteBufferNano.R(7, str2);
            }
            String str3 = explore.pop_up_title;
            if (str3 != null) {
                codedOutputByteBufferNano.R(8, str3);
            }
            String str4 = explore.pop_up_sub_title;
            if (str4 != null) {
                codedOutputByteBufferNano.R(9, str4);
            }
            String str5 = explore.skip;
            if (str5 != null) {
                codedOutputByteBufferNano.R(10, str5);
            }
            String str6 = explore.tag_icon;
            if (str6 != null) {
                codedOutputByteBufferNano.R(11, str6);
            }
            String str7 = explore.tag_background_color;
            if (str7 != null) {
                codedOutputByteBufferNano.R(12, str7);
            }
            String str8 = explore.new_pop_up_title;
            if (str8 != null) {
                codedOutputByteBufferNano.R(13, str8);
            }
            String str9 = explore.new_pop_up_sub_title;
            if (str9 != null) {
                codedOutputByteBufferNano.R(14, str9);
            }
            String str10 = explore.new_pop_up_box_title;
            if (str10 != null) {
                codedOutputByteBufferNano.R(15, str10);
            }
            String str11 = explore.new_pop_up_warning;
            if (str11 != null) {
                codedOutputByteBufferNano.R(16, str11);
            }
        }
    };
    public static JsonAdapter<Explore> JSON_ADAPTER = new ObjectJsonAdapter<Explore>() { // from class: com.p1.mobile.putong.core.data.Explore.2
        public Class getDataClass() {
            return Explore.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Explore m12678newInstance() {
            return new Explore();
        }

        public boolean parseField(Explore explore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "Remaining_swipes":
                    explore.Remaining_swipes = jsonParser.getValueAsInt();
                    return true;
                case "new_pop_up_box_title":
                    explore.new_pop_up_box_title = jsonParser.getValueAsString();
                    return true;
                case "new_pop_up_warning":
                    explore.new_pop_up_warning = jsonParser.getValueAsString();
                    return true;
                case "can_swiped":
                    explore.can_swiped = jsonParser.getValueAsBoolean();
                    return true;
                case "tag_icon":
                    explore.tag_icon = jsonParser.getValueAsString();
                    return true;
                case "new_pop_up_title":
                    explore.new_pop_up_title = jsonParser.getValueAsString();
                    return true;
                case "skip":
                    explore.skip = jsonParser.getValueAsString();
                    return true;
                case "remaining_likes":
                    explore.remaining_likes = jsonParser.getValueAsInt();
                    return true;
                case "cards":
                    explore.cards = JsonAdapter.parseArray(jsonParser, CardInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pop_up_title":
                    explore.pop_up_title = jsonParser.getValueAsString();
                    return true;
                case "matched":
                    explore.matched = jsonParser.getValueAsBoolean();
                    return true;
                case "new_pop_up_sub_title":
                    explore.new_pop_up_sub_title = jsonParser.getValueAsString();
                    return true;
                case "pop_up_sub_title":
                    explore.pop_up_sub_title = jsonParser.getValueAsString();
                    return true;
                case "tag_background_color":
                    explore.tag_background_color = jsonParser.getValueAsString();
                    return true;
                case "pop_up_icon":
                    explore.pop_up_icon = jsonParser.getValueAsString();
                    return true;
                case "background_color":
                    explore.background_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Explore explore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "Remaining_swipes":
                case "new_pop_up_box_title":
                case "new_pop_up_warning":
                case "can_swiped":
                case "tag_icon":
                case "new_pop_up_title":
                case "skip":
                case "remaining_likes":
                case "cards":
                case "pop_up_title":
                case "matched":
                case "new_pop_up_sub_title":
                case "pop_up_sub_title":
                case "tag_background_color":
                case "pop_up_icon":
                case "background_color":
                    return true;
                default:
                    return super.parseFieldCheck(explore, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Explore explore, JsonGenerator jsonGenerator) throws IOException {
            if (explore.cards != null) {
                jsonGenerator.writeFieldName("cards");
                JsonAdapter.serializeArray(explore.cards, jsonGenerator, CardInfo.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("can_swiped", explore.can_swiped);
            jsonGenerator.writeBooleanField("matched", explore.matched);
            String str = explore.background_color;
            if (str != null) {
                jsonGenerator.writeStringField("background_color", str);
            }
            jsonGenerator.writeNumberField("Remaining_swipes", explore.Remaining_swipes);
            jsonGenerator.writeNumberField("remaining_likes", explore.remaining_likes);
            String str2 = explore.pop_up_icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("pop_up_icon", str2);
            }
            String str3 = explore.pop_up_title;
            if (str3 != null) {
                jsonGenerator.writeStringField("pop_up_title", str3);
            }
            String str4 = explore.pop_up_sub_title;
            if (str4 != null) {
                jsonGenerator.writeStringField("pop_up_sub_title", str4);
            }
            String str5 = explore.skip;
            if (str5 != null) {
                jsonGenerator.writeStringField("skip", str5);
            }
            String str6 = explore.tag_icon;
            if (str6 != null) {
                jsonGenerator.writeStringField("tag_icon", str6);
            }
            String str7 = explore.tag_background_color;
            if (str7 != null) {
                jsonGenerator.writeStringField("tag_background_color", str7);
            }
            String str8 = explore.new_pop_up_title;
            if (str8 != null) {
                jsonGenerator.writeStringField("new_pop_up_title", str8);
            }
            String str9 = explore.new_pop_up_sub_title;
            if (str9 != null) {
                jsonGenerator.writeStringField("new_pop_up_sub_title", str9);
            }
            String str10 = explore.new_pop_up_box_title;
            if (str10 != null) {
                jsonGenerator.writeStringField("new_pop_up_box_title", str10);
            }
            String str11 = explore.new_pop_up_warning;
            if (str11 != null) {
                jsonGenerator.writeStringField("new_pop_up_warning", str11);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Explore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Explore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Explore new_() {
        Explore explore = new Explore();
        explore.nullCheck();
        return explore;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Explore m12676clone() {
        Explore explore = new Explore();
        List<CardInfo> list = this.cards;
        if (list != null) {
            explore.cards = ValueObject.util_map(list, new w9j() { // from class: l.pnf
                public final Object call(Object obj) {
                    return ((CardInfo) obj).m11874clone();
                }
            });
        }
        explore.can_swiped = this.can_swiped;
        explore.matched = this.matched;
        explore.background_color = this.background_color;
        explore.Remaining_swipes = this.Remaining_swipes;
        explore.remaining_likes = this.remaining_likes;
        explore.pop_up_icon = this.pop_up_icon;
        explore.pop_up_title = this.pop_up_title;
        explore.pop_up_sub_title = this.pop_up_sub_title;
        explore.skip = this.skip;
        explore.tag_icon = this.tag_icon;
        explore.tag_background_color = this.tag_background_color;
        explore.new_pop_up_title = this.new_pop_up_title;
        explore.new_pop_up_sub_title = this.new_pop_up_sub_title;
        explore.new_pop_up_box_title = this.new_pop_up_box_title;
        explore.new_pop_up_warning = this.new_pop_up_warning;
        return explore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Explore)) {
            return false;
        }
        Explore explore = (Explore) obj;
        return ValueObject.util_equals(this.cards, explore.cards) && this.can_swiped == explore.can_swiped && this.matched == explore.matched && ValueObject.util_equals(this.background_color, explore.background_color) && this.Remaining_swipes == explore.Remaining_swipes && this.remaining_likes == explore.remaining_likes && ValueObject.util_equals(this.pop_up_icon, explore.pop_up_icon) && ValueObject.util_equals(this.pop_up_title, explore.pop_up_title) && ValueObject.util_equals(this.pop_up_sub_title, explore.pop_up_sub_title) && ValueObject.util_equals(this.skip, explore.skip) && ValueObject.util_equals(this.tag_icon, explore.tag_icon) && ValueObject.util_equals(this.tag_background_color, explore.tag_background_color) && ValueObject.util_equals(this.new_pop_up_title, explore.new_pop_up_title) && ValueObject.util_equals(this.new_pop_up_sub_title, explore.new_pop_up_sub_title) && ValueObject.util_equals(this.new_pop_up_box_title, explore.new_pop_up_box_title) && ValueObject.util_equals(this.new_pop_up_warning, explore.new_pop_up_warning);
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
        List<CardInfo> list = this.cards;
        int iHashCode = (((((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.can_swiped ? 1231 : 1237)) * 41) + (this.matched ? 1231 : 1237)) * 41;
        String str = this.background_color;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.Remaining_swipes) * 41) + this.remaining_likes) * 41;
        String str2 = this.pop_up_icon;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pop_up_title;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pop_up_sub_title;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.skip;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.tag_icon;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.tag_background_color;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.new_pop_up_title;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.new_pop_up_sub_title;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.new_pop_up_box_title;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.new_pop_up_warning;
        int iHashCode12 = iHashCode11 + (str11 != null ? str11.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

    public void nullCheck() {
        if (this.cards == null) {
            this.cards = new ArrayList();
        }
        if (this.background_color == null) {
            this.background_color = "";
        }
        if (this.pop_up_icon == null) {
            this.pop_up_icon = "";
        }
        if (this.pop_up_title == null) {
            this.pop_up_title = "";
        }
        if (this.pop_up_sub_title == null) {
            this.pop_up_sub_title = "";
        }
        if (this.skip == null) {
            this.skip = "";
        }
        if (this.tag_icon == null) {
            this.tag_icon = "";
        }
        if (this.tag_background_color == null) {
            this.tag_background_color = "";
        }
        if (this.new_pop_up_title == null) {
            this.new_pop_up_title = "";
        }
        if (this.new_pop_up_sub_title == null) {
            this.new_pop_up_sub_title = "";
        }
        if (this.new_pop_up_box_title == null) {
            this.new_pop_up_box_title = "";
        }
        if (this.new_pop_up_warning == null) {
            this.new_pop_up_warning = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
