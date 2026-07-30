package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveScrapRankType extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapRankType> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapRankType>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapRankType.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapRankType.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapRankType newInstance() {
            return new BLiveScrapRankType();
        }

        public boolean parseField(BLiveScrapRankType bLiveScrapRankType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                bLiveScrapRankType.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.SCORE)) {
                return false;
            }
            bLiveScrapRankType.score = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapRankType bLiveScrapRankType, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapRankType.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveScrapRankType.score);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapRankType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapranktype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 2)
    public long score;

    public static BLiveScrapRankType new_() {
        BLiveScrapRankType bLiveScrapRankType = new BLiveScrapRankType();
        bLiveScrapRankType.nullCheck();
        return bLiveScrapRankType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapRankType mo223809clone() {
        BLiveScrapRankType bLiveScrapRankType = new BLiveScrapRankType();
        bLiveScrapRankType.name = this.name;
        bLiveScrapRankType.score = this.score;
        return bLiveScrapRankType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapRankType)) {
            return false;
        }
        BLiveScrapRankType bLiveScrapRankType = (BLiveScrapRankType) obj;
        return ValueObject.util_equals(this.name, bLiveScrapRankType.name) && this.score == bLiveScrapRankType.score;
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
        long j = this.score;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
