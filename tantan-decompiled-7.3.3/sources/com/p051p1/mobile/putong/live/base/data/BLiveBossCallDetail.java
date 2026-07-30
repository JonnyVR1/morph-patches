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
public class BLiveBossCallDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBossCallDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBossCallDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBossCallDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBossCallDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBossCallDetail newInstance() {
            return new BLiveBossCallDetail();
        }

        public boolean parseField(BLiveBossCallDetail bLiveBossCallDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveBossCallDetail.userId = jsonParser.getValueAsString();
                    return true;
                case "position":
                    bLiveBossCallDetail.position = jsonParser.getValueAsInt();
                    return true;
                case "userAvatar":
                    bLiveBossCallDetail.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBossCallDetail bLiveBossCallDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("position", bLiveBossCallDetail.position);
            String str = bLiveBossCallDetail.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveBossCallDetail.userAvatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("userAvatar", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBossCallDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebosscalldetail";

    @ProtobufIndex(index = 1)
    public int position;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveBossCallDetail new_() {
        BLiveBossCallDetail bLiveBossCallDetail = new BLiveBossCallDetail();
        bLiveBossCallDetail.nullCheck();
        return bLiveBossCallDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBossCallDetail mo225055clone() {
        BLiveBossCallDetail bLiveBossCallDetail = new BLiveBossCallDetail();
        bLiveBossCallDetail.position = this.position;
        bLiveBossCallDetail.userId = this.userId;
        bLiveBossCallDetail.userAvatar = this.userAvatar;
        return bLiveBossCallDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBossCallDetail)) {
            return false;
        }
        BLiveBossCallDetail bLiveBossCallDetail = (BLiveBossCallDetail) obj;
        return this.position == bLiveBossCallDetail.position && ValueObject.util_equals(this.userId, bLiveBossCallDetail.userId) && ValueObject.util_equals(this.userAvatar, bLiveBossCallDetail.userAvatar);
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
        int i2 = ((i * 41) + this.position) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userAvatar;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
