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
public class BLiveQuitPkMessages extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveQuitPkMessages> JSON_ADAPTER = new ObjectJsonAdapter<BLiveQuitPkMessages>() { // from class: com.p1.mobile.putong.live.base.data.BLiveQuitPkMessages.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveQuitPkMessages.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveQuitPkMessages newInstance() {
            return new BLiveQuitPkMessages();
        }

        public boolean parseField(BLiveQuitPkMessages bLiveQuitPkMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "specified":
                    bLiveQuitPkMessages.specified = BLivePkQuitPkMessagesRandom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bounty":
                    bLiveQuitPkMessages.bounty = BLivePkQuitPkMessagesRandom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "random":
                    bLiveQuitPkMessages.random = BLivePkQuitPkMessagesRandom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveQuitPkMessages bLiveQuitPkMessages, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveQuitPkMessages.random != null) {
                jsonGenerator.writeFieldName(BLivePkCategory.random);
                BLivePkQuitPkMessagesRandom.JSON_ADAPTER.serialize(bLiveQuitPkMessages.random, jsonGenerator, true);
            }
            if (bLiveQuitPkMessages.specified != null) {
                jsonGenerator.writeFieldName("specified");
                BLivePkQuitPkMessagesRandom.JSON_ADAPTER.serialize(bLiveQuitPkMessages.specified, jsonGenerator, true);
            }
            if (bLiveQuitPkMessages.bounty != null) {
                jsonGenerator.writeFieldName(BLivePkCategory.bounty);
                BLivePkQuitPkMessagesRandom.JSON_ADAPTER.serialize(bLiveQuitPkMessages.bounty, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveQuitPkMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivequitpkmessages";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePkQuitPkMessagesRandom bounty;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLivePkQuitPkMessagesRandom random;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePkQuitPkMessagesRandom specified;

    public static BLiveQuitPkMessages new_() {
        BLiveQuitPkMessages bLiveQuitPkMessages = new BLiveQuitPkMessages();
        bLiveQuitPkMessages.nullCheck();
        return bLiveQuitPkMessages;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveQuitPkMessages mo225055clone() {
        BLiveQuitPkMessages bLiveQuitPkMessages = new BLiveQuitPkMessages();
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom = this.random;
        if (bLivePkQuitPkMessagesRandom != null) {
            bLiveQuitPkMessages.random = bLivePkQuitPkMessagesRandom.mo225055clone();
        }
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom2 = this.specified;
        if (bLivePkQuitPkMessagesRandom2 != null) {
            bLiveQuitPkMessages.specified = bLivePkQuitPkMessagesRandom2.mo225055clone();
        }
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom3 = this.bounty;
        if (bLivePkQuitPkMessagesRandom3 != null) {
            bLiveQuitPkMessages.bounty = bLivePkQuitPkMessagesRandom3.mo225055clone();
        }
        return bLiveQuitPkMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveQuitPkMessages)) {
            return false;
        }
        BLiveQuitPkMessages bLiveQuitPkMessages = (BLiveQuitPkMessages) obj;
        return ValueObject.util_equals(this.random, bLiveQuitPkMessages.random) && ValueObject.util_equals(this.specified, bLiveQuitPkMessages.specified) && ValueObject.util_equals(this.bounty, bLiveQuitPkMessages.bounty);
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
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom = this.random;
        int iHashCode = (i2 + (bLivePkQuitPkMessagesRandom != null ? bLivePkQuitPkMessagesRandom.hashCode() : 0)) * 41;
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom2 = this.specified;
        int iHashCode2 = (iHashCode + (bLivePkQuitPkMessagesRandom2 != null ? bLivePkQuitPkMessagesRandom2.hashCode() : 0)) * 41;
        BLivePkQuitPkMessagesRandom bLivePkQuitPkMessagesRandom3 = this.bounty;
        int iHashCode3 = iHashCode2 + (bLivePkQuitPkMessagesRandom3 != null ? bLivePkQuitPkMessagesRandom3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.random == null) {
            this.random = BLivePkQuitPkMessagesRandom.new_();
        }
        if (this.specified == null) {
            this.specified = BLivePkQuitPkMessagesRandom.new_();
        }
        if (this.bounty == null) {
            this.bounty = BLivePkQuitPkMessagesRandom.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
