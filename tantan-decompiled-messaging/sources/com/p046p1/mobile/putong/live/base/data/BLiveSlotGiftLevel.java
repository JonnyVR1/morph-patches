package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
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
public class BLiveSlotGiftLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSlotGiftLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSlotGiftLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSlotGiftLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSlotGiftLevel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSlotGiftLevel newInstance() {
            return new BLiveSlotGiftLevel();
        }

        public boolean parseField(BLiveSlotGiftLevel bLiveSlotGiftLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                bLiveSlotGiftLevel.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Grade.TYPE)) {
                return false;
            }
            bLiveSlotGiftLevel.grade = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSlotGiftLevel bLiveSlotGiftLevel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSlotGiftLevel.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveSlotGiftLevel.grade;
            if (str2 != null) {
                jsonGenerator.writeStringField(Grade.TYPE, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSlotGiftLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveslotgiftlevel";

    @NonNull
    @ProtobufIndex(index = 2)
    public String grade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveSlotGiftLevel new_() {
        BLiveSlotGiftLevel bLiveSlotGiftLevel = new BLiveSlotGiftLevel();
        bLiveSlotGiftLevel.nullCheck();
        return bLiveSlotGiftLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSlotGiftLevel mo223809clone() {
        BLiveSlotGiftLevel bLiveSlotGiftLevel = new BLiveSlotGiftLevel();
        bLiveSlotGiftLevel.name = this.name;
        bLiveSlotGiftLevel.grade = this.grade;
        return bLiveSlotGiftLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSlotGiftLevel)) {
            return false;
        }
        BLiveSlotGiftLevel bLiveSlotGiftLevel = (BLiveSlotGiftLevel) obj;
        return ValueObject.util_equals(this.name, bLiveSlotGiftLevel.name) && ValueObject.util_equals(this.grade, bLiveSlotGiftLevel.grade);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.grade;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.grade == null) {
            this.grade = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
