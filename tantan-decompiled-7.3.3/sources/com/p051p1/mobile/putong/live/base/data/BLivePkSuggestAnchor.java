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
public class BLivePkSuggestAnchor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSuggestAnchor> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSuggestAnchor>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSuggestAnchor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSuggestAnchor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSuggestAnchor newInstance() {
            return new BLivePkSuggestAnchor();
        }

        public boolean parseField(BLivePkSuggestAnchor bLivePkSuggestAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLivePkSuggestAnchor.avatar = jsonParser.getValueAsString();
                    return true;
                case "source":
                    bLivePkSuggestAnchor.source = BLivePkInviteSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    bLivePkSuggestAnchor.userId = jsonParser.getValueAsString();
                    return true;
                case "refusePk":
                    bLivePkSuggestAnchor.refusePk = jsonParser.getValueAsBoolean();
                    return true;
                case "isOnlive":
                    bLivePkSuggestAnchor.isOnlive = jsonParser.getValueAsBoolean();
                    return true;
                case "userName":
                    bLivePkSuggestAnchor.userName = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLivePkSuggestAnchor.rank = jsonParser.getValueAsInt();
                    return true;
                case "publicId":
                    bLivePkSuggestAnchor.publicId = jsonParser.getValueAsString();
                    return true;
                case "isPking":
                    bLivePkSuggestAnchor.isPking = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSuggestAnchor bLivePkSuggestAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkSuggestAnchor.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLivePkSuggestAnchor.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLivePkSuggestAnchor.publicId;
            if (str3 != null) {
                jsonGenerator.writeStringField("publicId", str3);
            }
            String str4 = bLivePkSuggestAnchor.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatar", str4);
            }
            jsonGenerator.writeBooleanField("isOnlive", bLivePkSuggestAnchor.isOnlive);
            jsonGenerator.writeBooleanField("isPking", bLivePkSuggestAnchor.isPking);
            jsonGenerator.writeBooleanField("refusePk", bLivePkSuggestAnchor.refusePk);
            if (bLivePkSuggestAnchor.source != null) {
                jsonGenerator.writeFieldName("source");
                BLivePkInviteSource.JSON_ADAPTER.serialize(bLivePkSuggestAnchor.source, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLivePkSuggestAnchor.rank);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSuggestAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksuggestanchor";

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    @ProtobufIndex(index = 5)
    public boolean isOnlive;

    @ProtobufIndex(index = 6)
    public boolean isPking;

    @NonNull
    @ProtobufIndex(index = 3)
    public String publicId;

    @ProtobufIndex(index = 7)
    public int rank;

    @ProtobufIndex(index = 8)
    public boolean refusePk;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLivePkInviteSource source;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLivePkSuggestAnchor new_() {
        BLivePkSuggestAnchor bLivePkSuggestAnchor = new BLivePkSuggestAnchor();
        bLivePkSuggestAnchor.nullCheck();
        return bLivePkSuggestAnchor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSuggestAnchor mo225055clone() {
        BLivePkSuggestAnchor bLivePkSuggestAnchor = new BLivePkSuggestAnchor();
        bLivePkSuggestAnchor.userId = this.userId;
        bLivePkSuggestAnchor.userName = this.userName;
        bLivePkSuggestAnchor.publicId = this.publicId;
        bLivePkSuggestAnchor.avatar = this.avatar;
        bLivePkSuggestAnchor.isOnlive = this.isOnlive;
        bLivePkSuggestAnchor.isPking = this.isPking;
        bLivePkSuggestAnchor.refusePk = this.refusePk;
        bLivePkSuggestAnchor.source = this.source;
        bLivePkSuggestAnchor.rank = this.rank;
        return bLivePkSuggestAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSuggestAnchor)) {
            return false;
        }
        BLivePkSuggestAnchor bLivePkSuggestAnchor = (BLivePkSuggestAnchor) obj;
        return ValueObject.util_equals(this.userId, bLivePkSuggestAnchor.userId) && ValueObject.util_equals(this.userName, bLivePkSuggestAnchor.userName) && ValueObject.util_equals(this.publicId, bLivePkSuggestAnchor.publicId) && ValueObject.util_equals(this.avatar, bLivePkSuggestAnchor.avatar) && this.isOnlive == bLivePkSuggestAnchor.isOnlive && this.isPking == bLivePkSuggestAnchor.isPking && this.refusePk == bLivePkSuggestAnchor.refusePk && ValueObject.util_equals(this.source, bLivePkSuggestAnchor.source) && this.rank == bLivePkSuggestAnchor.rank;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.publicId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isOnlive ? 1231 : 1237)) * 41) + (this.isPking ? 1231 : 1237)) * 41) + (this.refusePk ? 1231 : 1237)) * 41;
        BLivePkInviteSource bLivePkInviteSource = this.source;
        int iHashCode5 = ((iHashCode4 + (bLivePkInviteSource != null ? bLivePkInviteSource.hashCode() : 0)) * 41) + this.rank;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.publicId == null) {
            this.publicId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.source == null) {
            this.source = (BLivePkInviteSource) BLivePkInviteSource.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
