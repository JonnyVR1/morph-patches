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
public class BLiveVoiceManager extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceManager> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceManager>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceManager.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceManager.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceManager newInstance() {
            return new BLiveVoiceManager();
        }

        public boolean parseField(BLiveVoiceManager bLiveVoiceManager, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceManager.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceManager.f44504id = jsonParser.getValueAsString();
                    return false;
                case "mask":
                    bLiveVoiceManager.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceManager bLiveVoiceManager, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceManager.f44504id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceManager.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (bLiveVoiceManager.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceManager.mask, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceManager) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemanager";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44504id;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserMask mask;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVoiceManager new_() {
        BLiveVoiceManager bLiveVoiceManager = new BLiveVoiceManager();
        bLiveVoiceManager.nullCheck();
        return bLiveVoiceManager;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceManager mo223809clone() {
        BLiveVoiceManager bLiveVoiceManager = new BLiveVoiceManager();
        bLiveVoiceManager.f44504id = this.f44504id;
        bLiveVoiceManager.userId = this.userId;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceManager.mask = bLiveUserMask.mo223809clone();
        }
        return bLiveVoiceManager;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceManager)) {
            return false;
        }
        BLiveVoiceManager bLiveVoiceManager = (BLiveVoiceManager) obj;
        return ValueObject.util_equals(this.f44504id, bLiveVoiceManager.f44504id) && ValueObject.util_equals(this.userId, bLiveVoiceManager.userId) && ValueObject.util_equals(this.mask, bLiveVoiceManager.mask);
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
        String str = this.f44504id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode3 = iHashCode2 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44504id == null) {
            this.f44504id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
