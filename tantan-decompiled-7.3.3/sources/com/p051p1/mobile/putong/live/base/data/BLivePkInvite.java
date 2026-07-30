package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.User;
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
public class BLivePkInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkInvite.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkInvite newInstance() {
            return new BLivePkInvite();
        }

        public boolean parseField(BLivePkInvite bLivePkInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    bLivePkInvite.source = BLivePkInviteSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userInfo":
                    bLivePkInvite.userInfo = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLivePkInvite.f45273id = jsonParser.getValueAsString();
                    return false;
                case "to":
                    bLivePkInvite.f45274to = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "live":
                    bLivePkInvite.live = BLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    bLivePkInvite.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    bLivePkInvite.state = BLivePkInviteState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "isOnceMore":
                    bLivePkInvite.isOnceMore = jsonParser.getValueAsBoolean();
                    return true;
                case "createTime":
                    bLivePkInvite.createTime = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkInvite bLivePkInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkInvite.f45273id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("isOnceMore", bLivePkInvite.isOnceMore);
            if (bLivePkInvite.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(bLivePkInvite.owner, jsonGenerator, true);
            }
            if (bLivePkInvite.f45274to != null) {
                jsonGenerator.writeFieldName("to");
                Converter.USER_ID.serialize(bLivePkInvite.f45274to, jsonGenerator, true);
            }
            if (bLivePkInvite.source != null) {
                jsonGenerator.writeFieldName("source");
                BLivePkInviteSource.JSON_ADAPTER.serialize(bLivePkInvite.source, jsonGenerator, true);
            }
            if (bLivePkInvite.state != null) {
                jsonGenerator.writeFieldName("state");
                BLivePkInviteState.JSON_ADAPTER.serialize(bLivePkInvite.state, jsonGenerator, true);
            }
            String str2 = bLivePkInvite.createTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("createTime", str2);
            }
            if (bLivePkInvite.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                User.JSON_ADAPTER.serialize(bLivePkInvite.userInfo, jsonGenerator, true);
            }
            if (bLivePkInvite.live != null) {
                jsonGenerator.writeFieldName("live");
                BLive.JSON_ADAPTER.serialize(bLivePkInvite.live, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkinvite";

    @NonNull
    @ProtobufIndex(index = 7)
    public String createTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45273id;

    @ProtobufIndex(index = 2)
    public boolean isOnceMore;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLive live;

    @NonNull
    @ProtobufIndex(index = 3)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLivePkInviteSource source;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLivePkInviteState state;

    /* JADX INFO: renamed from: to */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f45274to;

    @NonNull
    @ProtobufIndex(index = 8)
    public User userInfo;

    public static BLivePkInvite new_() {
        BLivePkInvite bLivePkInvite = new BLivePkInvite();
        bLivePkInvite.nullCheck();
        return bLivePkInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkInvite mo225055clone() {
        BLivePkInvite bLivePkInvite = new BLivePkInvite();
        bLivePkInvite.f45273id = this.f45273id;
        bLivePkInvite.isOnceMore = this.isOnceMore;
        bLivePkInvite.owner = this.owner;
        bLivePkInvite.f45274to = this.f45274to;
        bLivePkInvite.source = this.source;
        bLivePkInvite.state = this.state;
        bLivePkInvite.createTime = this.createTime;
        User user = this.userInfo;
        if (user != null) {
            bLivePkInvite.userInfo = user.mo225055clone();
        }
        BLive bLive = this.live;
        if (bLive != null) {
            bLivePkInvite.live = bLive.mo225055clone();
        }
        return bLivePkInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkInvite)) {
            return false;
        }
        BLivePkInvite bLivePkInvite = (BLivePkInvite) obj;
        return ValueObject.util_equals(this.f45273id, bLivePkInvite.f45273id) && this.isOnceMore == bLivePkInvite.isOnceMore && ValueObject.util_equals(this.owner, bLivePkInvite.owner) && ValueObject.util_equals(this.f45274to, bLivePkInvite.f45274to) && ValueObject.util_equals(this.source, bLivePkInvite.source) && ValueObject.util_equals(this.state, bLivePkInvite.state) && ValueObject.util_equals(this.createTime, bLivePkInvite.createTime) && ValueObject.util_equals(this.userInfo, bLivePkInvite.userInfo) && ValueObject.util_equals(this.live, bLivePkInvite.live);
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
        String str = this.f45273id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOnceMore ? 1231 : 1237)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f45274to;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLivePkInviteSource bLivePkInviteSource = this.source;
        int iHashCode4 = (iHashCode3 + (bLivePkInviteSource != null ? bLivePkInviteSource.hashCode() : 0)) * 41;
        BLivePkInviteState bLivePkInviteState = this.state;
        int iHashCode5 = (iHashCode4 + (bLivePkInviteState != null ? bLivePkInviteState.hashCode() : 0)) * 41;
        String str4 = this.createTime;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        User user = this.userInfo;
        int iHashCode7 = (iHashCode6 + (user != null ? user.hashCode() : 0)) * 41;
        BLive bLive = this.live;
        int iHashCode8 = iHashCode7 + (bLive != null ? bLive.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45273id == null) {
            this.f45273id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.f45274to == null) {
            this.f45274to = "";
        }
        if (this.source == null) {
            this.source = (BLivePkInviteSource) BLivePkInviteSource.JSON_ADAPTER.defaultEnum();
        }
        if (this.state == null) {
            this.state = (BLivePkInviteState) BLivePkInviteState.JSON_ADAPTER.defaultEnum();
        }
        if (this.createTime == null) {
            this.createTime = "";
        }
        if (this.userInfo == null) {
            this.userInfo = User.new_();
        }
        if (this.live == null) {
            this.live = BLive.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
