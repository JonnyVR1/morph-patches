package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
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
public class BLiveVoiceCallInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCallInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCallInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCallInvite.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCallInvite newInstance() {
            return new BLiveVoiceCallInvite();
        }

        public boolean parseField(BLiveVoiceCallInvite bLiveVoiceCallInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceLiveId":
                    bLiveVoiceCallInvite.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceCallInvite.f45334id = jsonParser.getValueAsString();
                    return false;
                case "to":
                    bLiveVoiceCallInvite.f45335to = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "type":
                    bLiveVoiceCallInvite.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveVoiceCallInvite.state = BLiveVoiceCallInviteState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "rewardPoint":
                    bLiveVoiceCallInvite.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "intendPosition":
                    bLiveVoiceCallInvite.intendPosition = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCallInvite bLiveVoiceCallInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCallInvite.f45334id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceCallInvite.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceCallInvite.voiceLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str3);
            }
            if (bLiveVoiceCallInvite.f45335to != null) {
                jsonGenerator.writeFieldName("to");
                Converter.USER_ID.serialize(bLiveVoiceCallInvite.f45335to, jsonGenerator, true);
            }
            if (bLiveVoiceCallInvite.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveVoiceCallInviteState.JSON_ADAPTER.serialize(bLiveVoiceCallInvite.state, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", bLiveVoiceCallInvite.rewardPoint);
            jsonGenerator.writeNumberField("intendPosition", bLiveVoiceCallInvite.intendPosition);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCallInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecallinvite";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45334id;

    @ProtobufIndex(index = 8)
    public int intendPosition;

    @ProtobufIndex(index = 6)
    public long rewardPoint;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveVoiceCallInviteState state;

    /* JADX INFO: renamed from: to */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f45335to;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceLiveId;

    public static BLiveVoiceCallInvite new_() {
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.nullCheck();
        return bLiveVoiceCallInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCallInvite mo225055clone() {
        BLiveVoiceCallInvite bLiveVoiceCallInvite = new BLiveVoiceCallInvite();
        bLiveVoiceCallInvite.f45334id = this.f45334id;
        bLiveVoiceCallInvite.type = this.type;
        bLiveVoiceCallInvite.voiceLiveId = this.voiceLiveId;
        bLiveVoiceCallInvite.f45335to = this.f45335to;
        bLiveVoiceCallInvite.state = this.state;
        bLiveVoiceCallInvite.rewardPoint = this.rewardPoint;
        bLiveVoiceCallInvite.intendPosition = this.intendPosition;
        return bLiveVoiceCallInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCallInvite)) {
            return false;
        }
        BLiveVoiceCallInvite bLiveVoiceCallInvite = (BLiveVoiceCallInvite) obj;
        return ValueObject.util_equals(this.f45334id, bLiveVoiceCallInvite.f45334id) && ValueObject.util_equals(this.type, bLiveVoiceCallInvite.type) && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceCallInvite.voiceLiveId) && ValueObject.util_equals(this.f45335to, bLiveVoiceCallInvite.f45335to) && ValueObject.util_equals(this.state, bLiveVoiceCallInvite.state) && this.rewardPoint == bLiveVoiceCallInvite.rewardPoint && this.intendPosition == bLiveVoiceCallInvite.intendPosition;
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
        String str = this.f45334id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceLiveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.f45335to;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveVoiceCallInviteState bLiveVoiceCallInviteState = this.state;
        int iHashCode5 = bLiveVoiceCallInviteState != null ? bLiveVoiceCallInviteState.hashCode() : 0;
        long j = this.rewardPoint;
        int i3 = ((((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.intendPosition;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45334id == null) {
            this.f45334id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.f45335to == null) {
            this.f45335to = "";
        }
        if (this.state == null) {
            this.state = (BLiveVoiceCallInviteState) BLiveVoiceCallInviteState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
