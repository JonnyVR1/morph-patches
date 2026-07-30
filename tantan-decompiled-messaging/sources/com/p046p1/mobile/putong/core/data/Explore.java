package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CardInfo;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class Explore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "explore";

    @ProtobufIndex(index = 5)
    public int Remaining_swipes;

    @NonNull
    @ProtobufIndex(index = 4)
    public String background_color;

    @ProtobufIndex(index = 2)
    public boolean can_swiped;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CardInfo> cards;

    @ProtobufIndex(index = 3)
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
    @ProtobufIndex(index = 10)
    public String skip;

    @NonNull
    @ProtobufIndex(index = 12)
    public String tag_background_color;

    @NonNull
    @ProtobufIndex(index = 11)
    public String tag_icon;
    public static ProtobufAdapter<Explore> PROTOBUF_ADAPTER = new MessageNanoAdapter<Explore>() { // from class: com.p1.mobile.putong.core.data.Explore.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Explore explore) {
            List<CardInfo> list = explore.cards;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17220b(2, explore.can_swiped) + CodedOutputByteBufferNano.m17220b(3, explore.matched);
            String str = explore.background_color;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(5, explore.Remaining_swipes) + CodedOutputByteBufferNano.m17226h(6, explore.remaining_likes);
            String str2 = explore.pop_up_icon;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str2);
            }
            String str3 = explore.pop_up_title;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(8, str3);
            }
            String str4 = explore.pop_up_sub_title;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str4);
            }
            String str5 = explore.skip;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(10, str5);
            }
            String str6 = explore.tag_icon;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(11, str6);
            }
            String str7 = explore.tag_background_color;
            if (str7 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(12, str7);
            }
            String str8 = explore.new_pop_up_title;
            if (str8 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(13, str8);
            }
            String str9 = explore.new_pop_up_sub_title;
            if (str9 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(14, str9);
            }
            String str10 = explore.new_pop_up_box_title;
            if (str10 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(15, str10);
            }
            String str11 = explore.new_pop_up_warning;
            if (str11 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(16, str11);
            }
            explore.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Explore parse(nb5 nb5Var) throws IOException {
            Explore explore = new Explore();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                    case 10:
                        explore.cards = (List) nb5Var.m158743l(CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        explore.can_swiped = nb5Var.m158738g();
                        continue;
                    case 24:
                        explore.matched = nb5Var.m158738g();
                        continue;
                    case 34:
                        explore.background_color = nb5Var.m158750s();
                        continue;
                    case 40:
                        explore.Remaining_swipes = nb5Var.m158741j();
                        continue;
                    case 48:
                        explore.remaining_likes = nb5Var.m158741j();
                        continue;
                    case 58:
                        explore.pop_up_icon = nb5Var.m158750s();
                        continue;
                    case 66:
                        explore.pop_up_title = nb5Var.m158750s();
                        continue;
                    case 74:
                        explore.pop_up_sub_title = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        explore.skip = nb5Var.m158750s();
                        continue;
                    case 90:
                        explore.tag_icon = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        explore.tag_background_color = nb5Var.m158750s();
                        continue;
                    case 106:
                        explore.new_pop_up_title = nb5Var.m158750s();
                        continue;
                    case 114:
                        explore.new_pop_up_sub_title = nb5Var.m158750s();
                        continue;
                    case 122:
                        explore.new_pop_up_box_title = nb5Var.m158750s();
                        continue;
                    case 130:
                        explore.new_pop_up_warning = nb5Var.m158750s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Explore explore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CardInfo> list = explore.cards;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, CardInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(2, explore.can_swiped);
            codedOutputByteBufferNano.m17244A(3, explore.matched);
            String str = explore.background_color;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            codedOutputByteBufferNano.m17250G(5, explore.Remaining_swipes);
            codedOutputByteBufferNano.m17250G(6, explore.remaining_likes);
            String str2 = explore.pop_up_icon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(7, str2);
            }
            String str3 = explore.pop_up_title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(8, str3);
            }
            String str4 = explore.pop_up_sub_title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(9, str4);
            }
            String str5 = explore.skip;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(10, str5);
            }
            String str6 = explore.tag_icon;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(11, str6);
            }
            String str7 = explore.tag_background_color;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(12, str7);
            }
            String str8 = explore.new_pop_up_title;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(13, str8);
            }
            String str9 = explore.new_pop_up_sub_title;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(14, str9);
            }
            String str10 = explore.new_pop_up_box_title;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(15, str10);
            }
            String str11 = explore.new_pop_up_warning;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(16, str11);
            }
        }
    };
    public static JsonAdapter<Explore> JSON_ADAPTER = new ObjectJsonAdapter<Explore>() { // from class: com.p1.mobile.putong.core.data.Explore.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Explore.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Explore newInstance() {
            return new Explore();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Explore explore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129937662:
                    if (str.equals("Remaining_swipes")) {
                        b = 0;
                    }
                    break;
                case -2060914131:
                    if (str.equals("new_pop_up_box_title")) {
                        b = 1;
                    }
                    break;
                case -1435262683:
                    if (str.equals("new_pop_up_warning")) {
                        b = 2;
                    }
                    break;
                case -1249788999:
                    if (str.equals("can_swiped")) {
                        b = 3;
                    }
                    break;
                case -764156418:
                    if (str.equals("tag_icon")) {
                        b = 4;
                    }
                    break;
                case -88939999:
                    if (str.equals("new_pop_up_title")) {
                        b = 5;
                    }
                    break;
                case 3532159:
                    if (str.equals(FreeSpaceBox.TYPE)) {
                        b = 6;
                    }
                    break;
                case 90145843:
                    if (str.equals("remaining_likes")) {
                        b = 7;
                    }
                    break;
                case 94431075:
                    if (str.equals("cards")) {
                        b = 8;
                    }
                    break;
                case 431783394:
                    if (str.equals("pop_up_title")) {
                        b = 9;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 10;
                    }
                    break;
                case 1093813986:
                    if (str.equals("new_pop_up_sub_title")) {
                        b = 11;
                    }
                    break;
                case 1184242211:
                    if (str.equals("pop_up_sub_title")) {
                        b = 12;
                    }
                    break;
                case 1644582679:
                    if (str.equals("tag_background_color")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1814710191:
                    if (str.equals("pop_up_icon")) {
                        b = 14;
                    }
                    break;
                case 2036780306:
                    if (str.equals("background_color")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    explore.Remaining_swipes = jsonParser.getValueAsInt();
                    return true;
                case 1:
                    explore.new_pop_up_box_title = jsonParser.getValueAsString();
                    return true;
                case 2:
                    explore.new_pop_up_warning = jsonParser.getValueAsString();
                    return true;
                case 3:
                    explore.can_swiped = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    explore.tag_icon = jsonParser.getValueAsString();
                    return true;
                case 5:
                    explore.new_pop_up_title = jsonParser.getValueAsString();
                    return true;
                case 6:
                    explore.skip = jsonParser.getValueAsString();
                    return true;
                case 7:
                    explore.remaining_likes = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    explore.cards = JsonAdapter.parseArray(jsonParser, CardInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    explore.pop_up_title = jsonParser.getValueAsString();
                    return true;
                case 10:
                    explore.matched = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    explore.new_pop_up_sub_title = jsonParser.getValueAsString();
                    return true;
                case 12:
                    explore.pop_up_sub_title = jsonParser.getValueAsString();
                    return true;
                case 13:
                    explore.tag_background_color = jsonParser.getValueAsString();
                    return true;
                case 14:
                    explore.pop_up_icon = jsonParser.getValueAsString();
                    return true;
                case 15:
                    explore.background_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Explore explore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129937662:
                    if (str.equals("Remaining_swipes")) {
                        b = 0;
                    }
                    break;
                case -2060914131:
                    if (str.equals("new_pop_up_box_title")) {
                        b = 1;
                    }
                    break;
                case -1435262683:
                    if (str.equals("new_pop_up_warning")) {
                        b = 2;
                    }
                    break;
                case -1249788999:
                    if (str.equals("can_swiped")) {
                        b = 3;
                    }
                    break;
                case -764156418:
                    if (str.equals("tag_icon")) {
                        b = 4;
                    }
                    break;
                case -88939999:
                    if (str.equals("new_pop_up_title")) {
                        b = 5;
                    }
                    break;
                case 3532159:
                    if (str.equals(FreeSpaceBox.TYPE)) {
                        b = 6;
                    }
                    break;
                case 90145843:
                    if (str.equals("remaining_likes")) {
                        b = 7;
                    }
                    break;
                case 94431075:
                    if (str.equals("cards")) {
                        b = 8;
                    }
                    break;
                case 431783394:
                    if (str.equals("pop_up_title")) {
                        b = 9;
                    }
                    break;
                case 840861988:
                    if (str.equals("matched")) {
                        b = 10;
                    }
                    break;
                case 1093813986:
                    if (str.equals("new_pop_up_sub_title")) {
                        b = 11;
                    }
                    break;
                case 1184242211:
                    if (str.equals("pop_up_sub_title")) {
                        b = 12;
                    }
                    break;
                case 1644582679:
                    if (str.equals("tag_background_color")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1814710191:
                    if (str.equals("pop_up_icon")) {
                        b = 14;
                    }
                    break;
                case 2036780306:
                    if (str.equals("background_color")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(explore, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(FreeSpaceBox.TYPE, str5);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Explore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Explore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Explore new_() {
        Explore explore = new Explore();
        explore.nullCheck();
        return explore;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Explore mo223809clone() {
        Explore explore = new Explore();
        List<CardInfo> list = this.cards;
        if (list != null) {
            explore.cards = ValueObject.util_map(list, new w9j() { // from class: l.pnf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardInfo) obj).mo223809clone();
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
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
