package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.Reference;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceShareItems extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceShareItems> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceShareItems>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceShareItems.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceShareItems.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceShareItems newInstance() {
            return new BLiveVoiceShareItems();
        }

        public boolean parseField(BLiveVoiceShareItems bLiveVoiceShareItems, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reference":
                    bLiveVoiceShareItems.reference = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isOnline":
                    bLiveVoiceShareItems.isOnline = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveVoiceShareItems.f44509id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceShareItems bLiveVoiceShareItems, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceShareItems.f44509id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceShareItems.reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveVoiceShareItems.reference, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isOnline", bLiveVoiceShareItems.isOnline);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceShareItems) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceshareitems";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44509id;

    @ProtobufIndex(index = 3)
    public boolean isOnline;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOwner reference;

    public static BLiveVoiceShareItems new_() {
        BLiveVoiceShareItems bLiveVoiceShareItems = new BLiveVoiceShareItems();
        bLiveVoiceShareItems.nullCheck();
        return bLiveVoiceShareItems;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceShareItems mo223809clone() {
        BLiveVoiceShareItems bLiveVoiceShareItems = new BLiveVoiceShareItems();
        bLiveVoiceShareItems.f44509id = this.f44509id;
        BLiveOwner bLiveOwner = this.reference;
        if (bLiveOwner != null) {
            bLiveVoiceShareItems.reference = bLiveOwner.mo223809clone();
        }
        bLiveVoiceShareItems.isOnline = this.isOnline;
        return bLiveVoiceShareItems;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceShareItems)) {
            return false;
        }
        BLiveVoiceShareItems bLiveVoiceShareItems = (BLiveVoiceShareItems) obj;
        return ValueObject.util_equals(this.f44509id, bLiveVoiceShareItems.f44509id) && ValueObject.util_equals(this.reference, bLiveVoiceShareItems.reference) && this.isOnline == bLiveVoiceShareItems.isOnline;
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
        String str = this.f44509id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.reference;
        int iHashCode2 = ((iHashCode + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41) + (this.isOnline ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44509id == null) {
            this.f44509id = "";
        }
        if (this.reference == null) {
            this.reference = BLiveOwner.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
