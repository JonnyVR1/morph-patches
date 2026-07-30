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
public class BLiveMultiCallSwitchToLeadRoleInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallSwitchToLeadRoleInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallSwitchToLeadRoleInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallSwitchToLeadRoleInvite.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallSwitchToLeadRoleInvite newInstance() {
            return new BLiveMultiCallSwitchToLeadRoleInvite();
        }

        public boolean parseField(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "toUserId":
                    bLiveMultiCallSwitchToLeadRoleInvite.toUserId = jsonParser.getValueAsString();
                    return true;
                case "ownerCallId":
                    bLiveMultiCallSwitchToLeadRoleInvite.ownerCallId = jsonParser.getValueAsString();
                    return true;
                case "ownerUserId":
                    bLiveMultiCallSwitchToLeadRoleInvite.ownerUserId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveMultiCallSwitchToLeadRoleInvite.f45254id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    bLiveMultiCallSwitchToLeadRoleInvite.state = jsonParser.getValueAsString();
                    return true;
                case "toCallId":
                    bLiveMultiCallSwitchToLeadRoleInvite.toCallId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallSwitchToLeadRoleInvite.f45254id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallSwitchToLeadRoleInvite.ownerUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerUserId", str2);
            }
            String str3 = bLiveMultiCallSwitchToLeadRoleInvite.ownerCallId;
            if (str3 != null) {
                jsonGenerator.writeStringField("ownerCallId", str3);
            }
            String str4 = bLiveMultiCallSwitchToLeadRoleInvite.toUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("toUserId", str4);
            }
            String str5 = bLiveMultiCallSwitchToLeadRoleInvite.toCallId;
            if (str5 != null) {
                jsonGenerator.writeStringField("toCallId", str5);
            }
            String str6 = bLiveMultiCallSwitchToLeadRoleInvite.state;
            if (str6 != null) {
                jsonGenerator.writeStringField("state", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallSwitchToLeadRoleInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallswitchtoleadroleinvite";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45254id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ownerCallId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ownerUserId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String state;

    @NonNull
    @ProtobufIndex(index = 5)
    public String toCallId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String toUserId;

    public static BLiveMultiCallSwitchToLeadRoleInvite new_() {
        BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite = new BLiveMultiCallSwitchToLeadRoleInvite();
        bLiveMultiCallSwitchToLeadRoleInvite.nullCheck();
        return bLiveMultiCallSwitchToLeadRoleInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallSwitchToLeadRoleInvite mo225055clone() {
        BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite = new BLiveMultiCallSwitchToLeadRoleInvite();
        bLiveMultiCallSwitchToLeadRoleInvite.f45254id = this.f45254id;
        bLiveMultiCallSwitchToLeadRoleInvite.ownerUserId = this.ownerUserId;
        bLiveMultiCallSwitchToLeadRoleInvite.ownerCallId = this.ownerCallId;
        bLiveMultiCallSwitchToLeadRoleInvite.toUserId = this.toUserId;
        bLiveMultiCallSwitchToLeadRoleInvite.toCallId = this.toCallId;
        bLiveMultiCallSwitchToLeadRoleInvite.state = this.state;
        return bLiveMultiCallSwitchToLeadRoleInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallSwitchToLeadRoleInvite)) {
            return false;
        }
        BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite = (BLiveMultiCallSwitchToLeadRoleInvite) obj;
        return ValueObject.util_equals(this.f45254id, bLiveMultiCallSwitchToLeadRoleInvite.f45254id) && ValueObject.util_equals(this.ownerUserId, bLiveMultiCallSwitchToLeadRoleInvite.ownerUserId) && ValueObject.util_equals(this.ownerCallId, bLiveMultiCallSwitchToLeadRoleInvite.ownerCallId) && ValueObject.util_equals(this.toUserId, bLiveMultiCallSwitchToLeadRoleInvite.toUserId) && ValueObject.util_equals(this.toCallId, bLiveMultiCallSwitchToLeadRoleInvite.toCallId) && ValueObject.util_equals(this.state, bLiveMultiCallSwitchToLeadRoleInvite.state);
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
        String str = this.f45254id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ownerUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ownerCallId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.toUserId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.toCallId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.state;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45254id == null) {
            this.f45254id = "";
        }
        if (this.ownerUserId == null) {
            this.ownerUserId = "";
        }
        if (this.ownerCallId == null) {
            this.ownerCallId = "";
        }
        if (this.toUserId == null) {
            this.toUserId = "";
        }
        if (this.toCallId == null) {
            this.toCallId = "";
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
