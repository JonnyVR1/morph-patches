package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceKTVSong extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKTVSong> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKTVSong>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKTVSong.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKTVSong.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKTVSong newInstance() {
            return new BLiveVoiceKTVSong();
        }

        public boolean parseField(BLiveVoiceKTVSong bLiveVoiceKTVSong, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isOrdered":
                    bLiveVoiceKTVSong.isOrdered = jsonParser.getValueAsBoolean();
                    return true;
                case "author":
                    bLiveVoiceKTVSong.author = jsonParser.getValueAsString();
                    return true;
                case "provider":
                    bLiveVoiceKTVSong.provider = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveVoiceKTVSong.schema = jsonParser.getValueAsString();
                    return true;
                case "durationSecond":
                    bLiveVoiceKTVSong.durationSecond = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveVoiceKTVSong.f44502id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveVoiceKTVSong.type = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    bLiveVoiceKTVSong.cover = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceKTVSong.title = jsonParser.getValueAsString();
                    return true;
                case "bestSinger":
                    bLiveVoiceKTVSong.bestSinger = BLiveVoiceKTVBestSinger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "songCode":
                    bLiveVoiceKTVSong.songCode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKTVSong bLiveVoiceKTVSong, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKTVSong.f44502id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceKTVSong.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceKTVSong.songCode;
            if (str3 != null) {
                jsonGenerator.writeStringField("songCode", str3);
            }
            String str4 = bLiveVoiceKTVSong.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = bLiveVoiceKTVSong.author;
            if (str5 != null) {
                jsonGenerator.writeStringField("author", str5);
            }
            String str6 = bLiveVoiceKTVSong.cover;
            if (str6 != null) {
                jsonGenerator.writeStringField("cover", str6);
            }
            jsonGenerator.writeNumberField("durationSecond", bLiveVoiceKTVSong.durationSecond);
            jsonGenerator.writeBooleanField("isOrdered", bLiveVoiceKTVSong.isOrdered);
            String str7 = bLiveVoiceKTVSong.provider;
            if (str7 != null) {
                jsonGenerator.writeStringField("provider", str7);
            }
            String str8 = bLiveVoiceKTVSong.schema;
            if (str8 != null) {
                jsonGenerator.writeStringField("schema", str8);
            }
            if (bLiveVoiceKTVSong.bestSinger != null) {
                jsonGenerator.writeFieldName("bestSinger");
                BLiveVoiceKTVBestSinger.JSON_ADAPTER.serialize(bLiveVoiceKTVSong.bestSinger, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKTVSong) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvsong";

    @NonNull
    @ProtobufIndex(index = 4)
    public String author;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveVoiceKTVBestSinger bestSinger;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cover;

    @ProtobufIndex(index = 6)
    public int durationSecond;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44502id;

    @ProtobufIndex(index = 7)
    public boolean isOrdered;
    public int position = -1;

    @NonNull
    @ProtobufIndex(index = 9)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 11)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 3)
    public String songCode;

    @NonNull
    @ProtobufIndex(index = 8)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveVoiceKTVSong new_() {
        BLiveVoiceKTVSong bLiveVoiceKTVSong = new BLiveVoiceKTVSong();
        bLiveVoiceKTVSong.nullCheck();
        return bLiveVoiceKTVSong;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKTVSong mo223809clone() {
        BLiveVoiceKTVSong bLiveVoiceKTVSong = new BLiveVoiceKTVSong();
        bLiveVoiceKTVSong.f44502id = this.f44502id;
        bLiveVoiceKTVSong.type = this.type;
        bLiveVoiceKTVSong.songCode = this.songCode;
        bLiveVoiceKTVSong.title = this.title;
        bLiveVoiceKTVSong.author = this.author;
        bLiveVoiceKTVSong.cover = this.cover;
        bLiveVoiceKTVSong.durationSecond = this.durationSecond;
        bLiveVoiceKTVSong.isOrdered = this.isOrdered;
        bLiveVoiceKTVSong.provider = this.provider;
        bLiveVoiceKTVSong.schema = this.schema;
        BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger = this.bestSinger;
        if (bLiveVoiceKTVBestSinger != null) {
            bLiveVoiceKTVSong.bestSinger = bLiveVoiceKTVBestSinger.mo223809clone();
        }
        return bLiveVoiceKTVSong;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKTVSong)) {
            return false;
        }
        BLiveVoiceKTVSong bLiveVoiceKTVSong = (BLiveVoiceKTVSong) obj;
        return ValueObject.util_equals(this.f44502id, bLiveVoiceKTVSong.f44502id) && ValueObject.util_equals(this.type, bLiveVoiceKTVSong.type) && ValueObject.util_equals(this.songCode, bLiveVoiceKTVSong.songCode) && ValueObject.util_equals(this.title, bLiveVoiceKTVSong.title) && ValueObject.util_equals(this.author, bLiveVoiceKTVSong.author) && ValueObject.util_equals(this.cover, bLiveVoiceKTVSong.cover) && this.durationSecond == bLiveVoiceKTVSong.durationSecond && this.isOrdered == bLiveVoiceKTVSong.isOrdered && ValueObject.util_equals(this.provider, bLiveVoiceKTVSong.provider) && ValueObject.util_equals(this.schema, bLiveVoiceKTVSong.schema) && ValueObject.util_equals(this.bestSinger, bLiveVoiceKTVSong.bestSinger);
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
        String str = this.f44502id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.songCode;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.author;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cover;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.durationSecond) * 41) + (this.isOrdered ? 1231 : 1237)) * 41;
        String str7 = this.provider;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.schema;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger = this.bestSinger;
        int iHashCode9 = iHashCode8 + (bLiveVoiceKTVBestSinger != null ? bLiveVoiceKTVBestSinger.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44502id == null) {
            this.f44502id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.songCode == null) {
            this.songCode = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.author == null) {
            this.author = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.bestSinger == null) {
            this.bestSinger = BLiveVoiceKTVBestSinger.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
