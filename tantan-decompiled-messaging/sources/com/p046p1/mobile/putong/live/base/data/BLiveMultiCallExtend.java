package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallExtendUser;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMultiCallExtend extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallExtend> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallExtend>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallExtend.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallExtend.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallExtend newInstance() {
            return new BLiveMultiCallExtend();
        }

        public boolean parseField(BLiveMultiCallExtend bLiveMultiCallExtend, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveMultiCallExtend.description = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveMultiCallExtend.liveId = jsonParser.getValueAsString();
                    return true;
                case "feedType":
                    bLiveMultiCallExtend.feedType = jsonParser.getValueAsString();
                    return true;
                case "users":
                    bLiveMultiCallExtend.users = JsonAdapter.parseArray(jsonParser, BLiveMultiCallExtendUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "memberCount":
                    bLiveMultiCallExtend.memberCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallExtend bLiveMultiCallExtend, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallExtend.feedType;
            if (str != null) {
                jsonGenerator.writeStringField("feedType", str);
            }
            String str2 = bLiveMultiCallExtend.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            if (bLiveMultiCallExtend.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveMultiCallExtend.users, jsonGenerator, BLiveMultiCallExtendUser.JSON_ADAPTER);
            }
            String str3 = bLiveMultiCallExtend.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveMultiCallExtend.memberCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallExtend) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallextend";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String feedType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @ProtobufIndex(index = 5)
    public int memberCount;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<BLiveMultiCallExtendUser> users;

    public static BLiveMultiCallExtend new_() {
        BLiveMultiCallExtend bLiveMultiCallExtend = new BLiveMultiCallExtend();
        bLiveMultiCallExtend.nullCheck();
        return bLiveMultiCallExtend;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallExtend mo223809clone() {
        BLiveMultiCallExtend bLiveMultiCallExtend = new BLiveMultiCallExtend();
        bLiveMultiCallExtend.feedType = this.feedType;
        bLiveMultiCallExtend.description = this.description;
        List<BLiveMultiCallExtendUser> list = this.users;
        if (list != null) {
            bLiveMultiCallExtend.users = ValueObject.util_map(list, new w9j() { // from class: l.x22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveMultiCallExtendUser) obj).mo223809clone();
                }
            });
        }
        bLiveMultiCallExtend.liveId = this.liveId;
        bLiveMultiCallExtend.memberCount = this.memberCount;
        return bLiveMultiCallExtend;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallExtend)) {
            return false;
        }
        BLiveMultiCallExtend bLiveMultiCallExtend = (BLiveMultiCallExtend) obj;
        return ValueObject.util_equals(this.feedType, bLiveMultiCallExtend.feedType) && ValueObject.util_equals(this.description, bLiveMultiCallExtend.description) && ValueObject.util_equals(this.users, bLiveMultiCallExtend.users) && ValueObject.util_equals(this.liveId, bLiveMultiCallExtend.liveId) && this.memberCount == bLiveMultiCallExtend.memberCount;
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
        String str = this.feedType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveMultiCallExtendUser> list = this.users;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.memberCount;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.feedType == null) {
            this.feedType = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
