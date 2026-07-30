package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveSweetCpRoom extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSweetCpRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSweetCpRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSweetCpRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSweetCpRoom.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSweetCpRoom newInstance() {
            return new BLiveSweetCpRoom();
        }

        public boolean parseField(BLiveSweetCpRoom bLiveSweetCpRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                bLiveSweetCpRoom.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.LEVEL)) {
                return false;
            }
            bLiveSweetCpRoom.level = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSweetCpRoom bLiveSweetCpRoom, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveSweetCpRoom.level);
            String str = bLiveSweetCpRoom.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSweetCpRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesweetcproom";

    @ProtobufIndex(index = 1)
    public int level;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveSweetCpRoom new_() {
        BLiveSweetCpRoom bLiveSweetCpRoom = new BLiveSweetCpRoom();
        bLiveSweetCpRoom.nullCheck();
        return bLiveSweetCpRoom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSweetCpRoom mo225055clone() {
        BLiveSweetCpRoom bLiveSweetCpRoom = new BLiveSweetCpRoom();
        bLiveSweetCpRoom.level = this.level;
        bLiveSweetCpRoom.name = this.name;
        return bLiveSweetCpRoom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSweetCpRoom)) {
            return false;
        }
        BLiveSweetCpRoom bLiveSweetCpRoom = (BLiveSweetCpRoom) obj;
        return this.level == bLiveSweetCpRoom.level && ValueObject.util_equals(this.name, bLiveSweetCpRoom.name);
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
        int i2 = ((i * 41) + this.level) * 41;
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
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
