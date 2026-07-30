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
public class BLiveVoiceLiveAssert extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLiveAssert> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLiveAssert>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLiveAssert.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLiveAssert newInstance() {
            return new BLiveVoiceLiveAssert();
        }

        public boolean parseField(BLiveVoiceLiveAssert bLiveVoiceLiveAssert, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shareRoomPermission":
                    bLiveVoiceLiveAssert.shareRoomPermission = jsonParser.getValueAsBoolean();
                    return true;
                case "createRoomFromMomentPermission":
                    bLiveVoiceLiveAssert.createRoomFromMomentPermission = jsonParser.getValueAsBoolean();
                    return true;
                case "myGuildH5Link":
                    bLiveVoiceLiveAssert.myGuildH5Link = jsonParser.getValueAsString();
                    return true;
                case "canCreateCommercialRoom":
                    bLiveVoiceLiveAssert.canCreateCommercialRoom = jsonParser.getValueAsBoolean();
                    return true;
                case "partnerFinderPermission":
                    bLiveVoiceLiveAssert.partnerFinderPermission = jsonParser.getValueAsBoolean();
                    return true;
                case "showMyGuild":
                    bLiveVoiceLiveAssert.showMyGuild = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLiveAssert bLiveVoiceLiveAssert, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("partnerFinderPermission", bLiveVoiceLiveAssert.partnerFinderPermission);
            jsonGenerator.writeBooleanField("createRoomFromMomentPermission", bLiveVoiceLiveAssert.createRoomFromMomentPermission);
            jsonGenerator.writeBooleanField("shareRoomPermission", bLiveVoiceLiveAssert.shareRoomPermission);
            jsonGenerator.writeBooleanField("canCreateCommercialRoom", bLiveVoiceLiveAssert.canCreateCommercialRoom);
            jsonGenerator.writeBooleanField("showMyGuild", bLiveVoiceLiveAssert.showMyGuild);
            String str = bLiveVoiceLiveAssert.myGuildH5Link;
            if (str != null) {
                jsonGenerator.writeStringField("myGuildH5Link", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLiveAssert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceliveassert";

    @ProtobufIndex(index = 4)
    public boolean canCreateCommercialRoom;

    @ProtobufIndex(index = 2)
    public boolean createRoomFromMomentPermission;

    @NonNull
    @ProtobufIndex(index = 6)
    public String myGuildH5Link;

    @ProtobufIndex(index = 1)
    public boolean partnerFinderPermission;

    @ProtobufIndex(index = 3)
    public boolean shareRoomPermission;

    @ProtobufIndex(index = 5)
    public boolean showMyGuild;

    public static BLiveVoiceLiveAssert new_() {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = new BLiveVoiceLiveAssert();
        bLiveVoiceLiveAssert.nullCheck();
        return bLiveVoiceLiveAssert;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLiveAssert mo225055clone() {
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = new BLiveVoiceLiveAssert();
        bLiveVoiceLiveAssert.partnerFinderPermission = this.partnerFinderPermission;
        bLiveVoiceLiveAssert.createRoomFromMomentPermission = this.createRoomFromMomentPermission;
        bLiveVoiceLiveAssert.shareRoomPermission = this.shareRoomPermission;
        bLiveVoiceLiveAssert.canCreateCommercialRoom = this.canCreateCommercialRoom;
        bLiveVoiceLiveAssert.showMyGuild = this.showMyGuild;
        bLiveVoiceLiveAssert.myGuildH5Link = this.myGuildH5Link;
        return bLiveVoiceLiveAssert;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLiveAssert)) {
            return false;
        }
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = (BLiveVoiceLiveAssert) obj;
        return this.partnerFinderPermission == bLiveVoiceLiveAssert.partnerFinderPermission && this.createRoomFromMomentPermission == bLiveVoiceLiveAssert.createRoomFromMomentPermission && this.shareRoomPermission == bLiveVoiceLiveAssert.shareRoomPermission && this.canCreateCommercialRoom == bLiveVoiceLiveAssert.canCreateCommercialRoom && this.showMyGuild == bLiveVoiceLiveAssert.showMyGuild && ValueObject.util_equals(this.myGuildH5Link, bLiveVoiceLiveAssert.myGuildH5Link);
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
        int i2 = ((((((((((i * 41) + (this.partnerFinderPermission ? 1231 : 1237)) * 41) + (this.createRoomFromMomentPermission ? 1231 : 1237)) * 41) + (this.shareRoomPermission ? 1231 : 1237)) * 41) + (this.canCreateCommercialRoom ? 1231 : 1237)) * 41) + (this.showMyGuild ? 1231 : 1237)) * 41;
        String str = this.myGuildH5Link;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.myGuildH5Link == null) {
            this.myGuildH5Link = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
