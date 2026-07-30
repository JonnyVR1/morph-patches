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
public class BLiveFanBaseRelationShip extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseRelationShip> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseRelationShip>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseRelationShip.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseRelationShip.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseRelationShip newInstance() {
            return new BLiveFanBaseRelationShip();
        }

        public boolean parseField(BLiveFanBaseRelationShip bLiveFanBaseRelationShip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorId":
                    bLiveFanBaseRelationShip.anchorId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveFanBaseRelationShip.userId = jsonParser.getValueAsString();
                    return true;
                case "fanbaseId":
                    bLiveFanBaseRelationShip.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveFanBaseRelationShip.state = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseRelationShip bLiveFanBaseRelationShip, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseRelationShip.fanbaseId;
            if (str != null) {
                jsonGenerator.writeStringField("fanbaseId", str);
            }
            String str2 = bLiveFanBaseRelationShip.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            String str3 = bLiveFanBaseRelationShip.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveFanBaseRelationShip.state;
            if (str4 != null) {
                jsonGenerator.writeStringField("state", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseRelationShip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbaserelationship";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String fanbaseId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static BLiveFanBaseRelationShip new_() {
        BLiveFanBaseRelationShip bLiveFanBaseRelationShip = new BLiveFanBaseRelationShip();
        bLiveFanBaseRelationShip.nullCheck();
        return bLiveFanBaseRelationShip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseRelationShip mo225055clone() {
        BLiveFanBaseRelationShip bLiveFanBaseRelationShip = new BLiveFanBaseRelationShip();
        bLiveFanBaseRelationShip.fanbaseId = this.fanbaseId;
        bLiveFanBaseRelationShip.anchorId = this.anchorId;
        bLiveFanBaseRelationShip.userId = this.userId;
        bLiveFanBaseRelationShip.state = this.state;
        return bLiveFanBaseRelationShip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseRelationShip)) {
            return false;
        }
        BLiveFanBaseRelationShip bLiveFanBaseRelationShip = (BLiveFanBaseRelationShip) obj;
        return ValueObject.util_equals(this.fanbaseId, bLiveFanBaseRelationShip.fanbaseId) && ValueObject.util_equals(this.anchorId, bLiveFanBaseRelationShip.anchorId) && ValueObject.util_equals(this.userId, bLiveFanBaseRelationShip.userId) && ValueObject.util_equals(this.state, bLiveFanBaseRelationShip.state);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.state;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.userId == null) {
            this.userId = "";
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
