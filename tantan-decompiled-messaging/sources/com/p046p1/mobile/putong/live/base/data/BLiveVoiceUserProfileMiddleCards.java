package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceUserProfileMiddleCards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserProfileMiddleCards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserProfileMiddleCards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserProfileMiddleCards.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserProfileMiddleCards newInstance() {
            return new BLiveVoiceUserProfileMiddleCards();
        }

        public boolean parseField(BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveVoiceUserProfileMiddleCards.amount = jsonParser.getValueAsLong();
                    return true;
                case "totalAmount":
                    bLiveVoiceUserProfileMiddleCards.totalAmount = jsonParser.getValueAsLong();
                    return true;
                case "schema":
                    bLiveVoiceUserProfileMiddleCards.schema = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    bLiveVoiceUserProfileMiddleCards.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "icon":
                    bLiveVoiceUserProfileMiddleCards.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceUserProfileMiddleCards.type = BLiveVoiceUserProfileMiddleCardType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    bLiveVoiceUserProfileMiddleCards.title = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    bLiveVoiceUserProfileMiddleCards.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserProfileMiddleCards.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceUserProfileMiddleCards.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            jsonGenerator.writeNumberField("amount", bLiveVoiceUserProfileMiddleCards.amount);
            if (bLiveVoiceUserProfileMiddleCards.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveVoiceUserProfileMiddleCardType.JSON_ADAPTER.serialize(bLiveVoiceUserProfileMiddleCards.type, jsonGenerator, true);
            }
            String str3 = bLiveVoiceUserProfileMiddleCards.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
            String str4 = bLiveVoiceUserProfileMiddleCards.backgroundColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("backgroundColor", str4);
            }
            if (bLiveVoiceUserProfileMiddleCards.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileMiddleCards.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("totalAmount", bLiveVoiceUserProfileMiddleCards.totalAmount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserProfileMiddleCards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserprofilemiddlecards";

    @ProtobufIndex(index = 3)
    public long amount;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> avatars;

    @NonNull
    @ProtobufIndex(index = 6)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 8)
    public long totalAmount;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceUserProfileMiddleCardType type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68463a(String str) {
        return str;
    }

    public static BLiveVoiceUserProfileMiddleCards new_() {
        BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards = new BLiveVoiceUserProfileMiddleCards();
        bLiveVoiceUserProfileMiddleCards.nullCheck();
        return bLiveVoiceUserProfileMiddleCards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserProfileMiddleCards mo223809clone() {
        BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards = new BLiveVoiceUserProfileMiddleCards();
        bLiveVoiceUserProfileMiddleCards.title = this.title;
        bLiveVoiceUserProfileMiddleCards.icon = this.icon;
        bLiveVoiceUserProfileMiddleCards.amount = this.amount;
        bLiveVoiceUserProfileMiddleCards.type = this.type;
        bLiveVoiceUserProfileMiddleCards.schema = this.schema;
        bLiveVoiceUserProfileMiddleCards.backgroundColor = this.backgroundColor;
        List<String> list = this.avatars;
        if (list != null) {
            bLiveVoiceUserProfileMiddleCards.avatars = ValueObject.util_map(list, new w9j() { // from class: l.la2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileMiddleCards.m68463a((String) obj);
                }
            });
        }
        bLiveVoiceUserProfileMiddleCards.totalAmount = this.totalAmount;
        return bLiveVoiceUserProfileMiddleCards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserProfileMiddleCards)) {
            return false;
        }
        BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards = (BLiveVoiceUserProfileMiddleCards) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceUserProfileMiddleCards.title) && ValueObject.util_equals(this.icon, bLiveVoiceUserProfileMiddleCards.icon) && this.amount == bLiveVoiceUserProfileMiddleCards.amount && ValueObject.util_equals(this.type, bLiveVoiceUserProfileMiddleCards.type) && ValueObject.util_equals(this.schema, bLiveVoiceUserProfileMiddleCards.schema) && ValueObject.util_equals(this.backgroundColor, bLiveVoiceUserProfileMiddleCards.backgroundColor) && ValueObject.util_equals(this.avatars, bLiveVoiceUserProfileMiddleCards.avatars) && this.totalAmount == bLiveVoiceUserProfileMiddleCards.totalAmount;
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.amount;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = this.type;
        int iHashCode3 = (i3 + (bLiveVoiceUserProfileMiddleCardType != null ? bLiveVoiceUserProfileMiddleCardType.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.avatars;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        long j2 = this.totalAmount;
        int i4 = iHashCode6 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = (BLiveVoiceUserProfileMiddleCardType) BLiveVoiceUserProfileMiddleCardType.JSON_ADAPTER.defaultEnum();
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
