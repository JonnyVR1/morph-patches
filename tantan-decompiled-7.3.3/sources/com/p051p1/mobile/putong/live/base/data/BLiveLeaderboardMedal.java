package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveLeaderboardMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLeaderboardMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLeaderboardMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLeaderboardMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLeaderboardMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLeaderboardMedal newInstance() {
            return new BLiveLeaderboardMedal();
        }

        public boolean parseField(BLiveLeaderboardMedal bLiveLeaderboardMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveLeaderboardMedal.userId = jsonParser.getValueAsString();
                    return true;
                case "fanbaseId":
                    bLiveLeaderboardMedal.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveLeaderboardMedal.grade = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLeaderboardMedal bLiveLeaderboardMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLeaderboardMedal.fanbaseId;
            if (str != null) {
                jsonGenerator.writeStringField("fanbaseId", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveLeaderboardMedal.grade);
            String str2 = bLiveLeaderboardMedal.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLeaderboardMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveleaderboardmedal";

    @NonNull
    @ProtobufIndex(index = 1)
    public String fanbaseId;

    @ProtobufIndex(index = 2)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static BLiveLeaderboardMedal new_() {
        BLiveLeaderboardMedal bLiveLeaderboardMedal = new BLiveLeaderboardMedal();
        bLiveLeaderboardMedal.nullCheck();
        return bLiveLeaderboardMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLeaderboardMedal mo225055clone() {
        BLiveLeaderboardMedal bLiveLeaderboardMedal = new BLiveLeaderboardMedal();
        bLiveLeaderboardMedal.fanbaseId = this.fanbaseId;
        bLiveLeaderboardMedal.grade = this.grade;
        bLiveLeaderboardMedal.userId = this.userId;
        return bLiveLeaderboardMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLeaderboardMedal)) {
            return false;
        }
        BLiveLeaderboardMedal bLiveLeaderboardMedal = (BLiveLeaderboardMedal) obj;
        return ValueObject.util_equals(this.fanbaseId, bLiveLeaderboardMedal.fanbaseId) && this.grade == bLiveLeaderboardMedal.grade && ValueObject.util_equals(this.userId, bLiveLeaderboardMedal.userId);
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
        String str = this.fanbaseId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.grade) * 41;
        String str2 = this.userId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
