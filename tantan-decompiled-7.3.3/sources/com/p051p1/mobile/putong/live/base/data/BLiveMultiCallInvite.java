package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
public class BLiveMultiCallInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallInvite.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallInvite newInstance() {
            return new BLiveMultiCallInvite();
        }

        public boolean parseField(BLiveMultiCallInvite bLiveMultiCallInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "toLiveId":
                    bLiveMultiCallInvite.toLiveId = jsonParser.getValueAsString();
                    return true;
                case "showSeconds":
                    bLiveMultiCallInvite.showSeconds = jsonParser.getValueAsLong();
                    return true;
                case "toUserId":
                    bLiveMultiCallInvite.toUserId = jsonParser.getValueAsString();
                    return true;
                case "toUserAvatar":
                    bLiveMultiCallInvite.toUserAvatar = jsonParser.getValueAsString();
                    return true;
                case "ownerLiveId":
                    bLiveMultiCallInvite.ownerLiveId = jsonParser.getValueAsString();
                    return true;
                case "toUserName":
                    bLiveMultiCallInvite.toUserName = jsonParser.getValueAsString();
                    return true;
                case "ownerUserId":
                    bLiveMultiCallInvite.ownerUserId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveMultiCallInvite.f45252id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveMultiCallInvite.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveMultiCallInvite.state = jsonParser.getValueAsString();
                    return true;
                case "ownerMultiCallOrder":
                    bLiveMultiCallInvite.ownerMultiCallOrder = jsonParser.getValueAsString();
                    return true;
                case "ownerUserName":
                    bLiveMultiCallInvite.ownerUserName = jsonParser.getValueAsString();
                    return true;
                case "ownerUserAvatar":
                    bLiveMultiCallInvite.ownerUserAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallInvite bLiveMultiCallInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallInvite.f45252id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallInvite.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveMultiCallInvite.ownerUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("ownerUserId", str3);
            }
            String str4 = bLiveMultiCallInvite.ownerUserName;
            if (str4 != null) {
                jsonGenerator.writeStringField("ownerUserName", str4);
            }
            String str5 = bLiveMultiCallInvite.ownerUserAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("ownerUserAvatar", str5);
            }
            String str6 = bLiveMultiCallInvite.ownerMultiCallOrder;
            if (str6 != null) {
                jsonGenerator.writeStringField("ownerMultiCallOrder", str6);
            }
            String str7 = bLiveMultiCallInvite.ownerLiveId;
            if (str7 != null) {
                jsonGenerator.writeStringField("ownerLiveId", str7);
            }
            String str8 = bLiveMultiCallInvite.toUserId;
            if (str8 != null) {
                jsonGenerator.writeStringField("toUserId", str8);
            }
            String str9 = bLiveMultiCallInvite.toUserName;
            if (str9 != null) {
                jsonGenerator.writeStringField("toUserName", str9);
            }
            String str10 = bLiveMultiCallInvite.toUserAvatar;
            if (str10 != null) {
                jsonGenerator.writeStringField("toUserAvatar", str10);
            }
            String str11 = bLiveMultiCallInvite.toLiveId;
            if (str11 != null) {
                jsonGenerator.writeStringField("toLiveId", str11);
            }
            String str12 = bLiveMultiCallInvite.state;
            if (str12 != null) {
                jsonGenerator.writeStringField("state", str12);
            }
            jsonGenerator.writeNumberField("showSeconds", bLiveMultiCallInvite.showSeconds);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallinvite";

    @Nullable
    public Followship followship;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45252id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String ownerLiveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String ownerMultiCallOrder;

    @NonNull
    @ProtobufIndex(index = 5)
    public String ownerUserAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ownerUserId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String ownerUserName;

    @ProtobufIndex(index = 13)
    public long showSeconds;

    @NonNull
    @ProtobufIndex(index = 12)
    public String state;

    @NonNull
    @ProtobufIndex(index = 11)
    public String toLiveId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String toUserAvatar;

    @NonNull
    @ProtobufIndex(index = 8)
    public String toUserId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String toUserName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveMultiCallInvite new_() {
        BLiveMultiCallInvite bLiveMultiCallInvite = new BLiveMultiCallInvite();
        bLiveMultiCallInvite.nullCheck();
        return bLiveMultiCallInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallInvite mo225055clone() {
        BLiveMultiCallInvite bLiveMultiCallInvite = new BLiveMultiCallInvite();
        bLiveMultiCallInvite.f45252id = this.f45252id;
        bLiveMultiCallInvite.type = this.type;
        bLiveMultiCallInvite.ownerUserId = this.ownerUserId;
        bLiveMultiCallInvite.ownerUserName = this.ownerUserName;
        bLiveMultiCallInvite.ownerUserAvatar = this.ownerUserAvatar;
        bLiveMultiCallInvite.ownerMultiCallOrder = this.ownerMultiCallOrder;
        bLiveMultiCallInvite.ownerLiveId = this.ownerLiveId;
        bLiveMultiCallInvite.toUserId = this.toUserId;
        bLiveMultiCallInvite.toUserName = this.toUserName;
        bLiveMultiCallInvite.toUserAvatar = this.toUserAvatar;
        bLiveMultiCallInvite.toLiveId = this.toLiveId;
        bLiveMultiCallInvite.state = this.state;
        bLiveMultiCallInvite.showSeconds = this.showSeconds;
        return bLiveMultiCallInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallInvite)) {
            return false;
        }
        BLiveMultiCallInvite bLiveMultiCallInvite = (BLiveMultiCallInvite) obj;
        return ValueObject.util_equals(this.f45252id, bLiveMultiCallInvite.f45252id) && ValueObject.util_equals(this.type, bLiveMultiCallInvite.type) && ValueObject.util_equals(this.ownerUserId, bLiveMultiCallInvite.ownerUserId) && ValueObject.util_equals(this.ownerUserName, bLiveMultiCallInvite.ownerUserName) && ValueObject.util_equals(this.ownerUserAvatar, bLiveMultiCallInvite.ownerUserAvatar) && ValueObject.util_equals(this.ownerMultiCallOrder, bLiveMultiCallInvite.ownerMultiCallOrder) && ValueObject.util_equals(this.ownerLiveId, bLiveMultiCallInvite.ownerLiveId) && ValueObject.util_equals(this.toUserId, bLiveMultiCallInvite.toUserId) && ValueObject.util_equals(this.toUserName, bLiveMultiCallInvite.toUserName) && ValueObject.util_equals(this.toUserAvatar, bLiveMultiCallInvite.toUserAvatar) && ValueObject.util_equals(this.toLiveId, bLiveMultiCallInvite.toLiveId) && ValueObject.util_equals(this.state, bLiveMultiCallInvite.state) && this.showSeconds == bLiveMultiCallInvite.showSeconds;
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
        String str = this.f45252id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ownerUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.ownerUserName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.ownerUserAvatar;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.ownerMultiCallOrder;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.ownerLiveId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.toUserId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.toUserName;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.toUserAvatar;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.toLiveId;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.state;
        int iHashCode12 = str12 != null ? str12.hashCode() : 0;
        long j = this.showSeconds;
        int i3 = ((iHashCode11 + iHashCode12) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    public boolean isMatched() {
        Followship followship = this.followship;
        return followship != null && TEnum.equals(followship.state, "matched");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45252id == null) {
            this.f45252id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.ownerUserId == null) {
            this.ownerUserId = "";
        }
        if (this.ownerUserName == null) {
            this.ownerUserName = "";
        }
        if (this.ownerUserAvatar == null) {
            this.ownerUserAvatar = "";
        }
        if (this.ownerMultiCallOrder == null) {
            this.ownerMultiCallOrder = "";
        }
        if (this.ownerLiveId == null) {
            this.ownerLiveId = "";
        }
        if (this.toUserId == null) {
            this.toUserId = "";
        }
        if (this.toUserName == null) {
            this.toUserName = "";
        }
        if (this.toUserAvatar == null) {
            this.toUserAvatar = "";
        }
        if (this.toLiveId == null) {
            this.toLiveId = "";
        }
        if (this.state == null) {
            this.state = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
