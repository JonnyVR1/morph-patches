package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveVoiceRoomNextLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomNextLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomNextLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomNextLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomNextLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomNextLevel newInstance() {
            return new BLiveVoiceRoomNextLevel();
        }

        public boolean parseField(BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("schema")) {
                bLiveVoiceRoomNextLevel.schema = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            bLiveVoiceRoomNextLevel.name = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomNextLevel.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveVoiceRoomNextLevel.schema;
            if (str2 != null) {
                jsonGenerator.writeStringField("schema", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomNextLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomnextlevel";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String schema;

    public static BLiveVoiceRoomNextLevel new_() {
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = new BLiveVoiceRoomNextLevel();
        bLiveVoiceRoomNextLevel.nullCheck();
        return bLiveVoiceRoomNextLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomNextLevel mo225055clone() {
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = new BLiveVoiceRoomNextLevel();
        bLiveVoiceRoomNextLevel.name = this.name;
        bLiveVoiceRoomNextLevel.schema = this.schema;
        return bLiveVoiceRoomNextLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomNextLevel)) {
            return false;
        }
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = (BLiveVoiceRoomNextLevel) obj;
        return ValueObject.util_equals(this.name, bLiveVoiceRoomNextLevel.name) && ValueObject.util_equals(this.schema, bLiveVoiceRoomNextLevel.schema);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.schema;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
