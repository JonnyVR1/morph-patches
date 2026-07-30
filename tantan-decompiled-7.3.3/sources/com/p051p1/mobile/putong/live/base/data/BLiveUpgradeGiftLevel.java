package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
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
public class BLiveUpgradeGiftLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftLevel newInstance() {
            return new BLiveUpgradeGiftLevel();
        }

        public boolean parseField(BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveUpgradeGiftLevel.f45315id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveUpgradeGiftLevel.name = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveUpgradeGiftLevel.grade = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveUpgradeGiftLevel.grade);
            String str = bLiveUpgradeGiftLevel.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveUpgradeGiftLevel.f45315id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftlevel";

    @ProtobufIndex(index = 1)
    public int grade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f45315id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveUpgradeGiftLevel new_() {
        BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel = new BLiveUpgradeGiftLevel();
        bLiveUpgradeGiftLevel.nullCheck();
        return bLiveUpgradeGiftLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftLevel mo225055clone() {
        BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel = new BLiveUpgradeGiftLevel();
        bLiveUpgradeGiftLevel.grade = this.grade;
        bLiveUpgradeGiftLevel.name = this.name;
        bLiveUpgradeGiftLevel.f45315id = this.f45315id;
        return bLiveUpgradeGiftLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftLevel)) {
            return false;
        }
        BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel = (BLiveUpgradeGiftLevel) obj;
        return this.grade == bLiveUpgradeGiftLevel.grade && ValueObject.util_equals(this.name, bLiveUpgradeGiftLevel.name) && ValueObject.util_equals(this.f45315id, bLiveUpgradeGiftLevel.f45315id);
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
        int i2 = ((i * 41) + this.grade) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f45315id;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.f45315id == null) {
            this.f45315id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
