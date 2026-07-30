package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkQuitPkMessagesRandom extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkQuitPkMessagesRandom> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkQuitPkMessagesRandom>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkQuitPkMessagesRandom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkQuitPkMessagesRandom.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkQuitPkMessagesRandom newInstance() {
            return new BLivePkQuitPkMessagesRandom();
        }

        public boolean parseField(BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("playingStage")) {
                bLivePkQuitPkMessagesRandom.playingStage = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("punishingStage")) {
                return false;
            }
            bLivePkQuitPkMessagesRandom.punishingStage = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkQuitPkMessagesRandom.playingStage;
            if (str != null) {
                jsonGenerator.writeStringField("playingStage", str);
            }
            String str2 = bLivePkQuitPkMessagesRandom.punishingStage;
            if (str2 != null) {
                jsonGenerator.writeStringField("punishingStage", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkQuitPkMessagesRandom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkquitpkmessagesrandom";

    @NonNull
    @ProtobufIndex(index = 1)
    public String playingStage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String punishingStage;

    public static BLivePkQuitPkMessagesRandom new_() {
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom = new BLivePkQuitPkMessagesRandom();
        bLivePkQuitPkMessagesRandom.nullCheck();
        return bLivePkQuitPkMessagesRandom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkQuitPkMessagesRandom mo225055clone() {
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom = new BLivePkQuitPkMessagesRandom();
        bLivePkQuitPkMessagesRandom.playingStage = this.playingStage;
        bLivePkQuitPkMessagesRandom.punishingStage = this.punishingStage;
        return bLivePkQuitPkMessagesRandom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkQuitPkMessagesRandom)) {
            return false;
        }
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom = (BLivePkQuitPkMessagesRandom) obj;
        return ValueObject.util_equals(this.playingStage, bLivePkQuitPkMessagesRandom.playingStage) && ValueObject.util_equals(this.punishingStage, bLivePkQuitPkMessagesRandom.punishingStage);
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
        String str = this.playingStage;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.punishingStage;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.playingStage == null) {
            this.playingStage = "";
        }
        if (this.punishingStage == null) {
            this.punishingStage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
