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
public class BLiveFakeUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFakeUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFakeUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFakeUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFakeUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFakeUser newInstance() {
            return new BLiveFakeUser();
        }

        public boolean parseField(BLiveFakeUser bLiveFakeUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("fakeId")) {
                bLiveFakeUser.fakeId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("flush")) {
                return false;
            }
            bLiveFakeUser.flush = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFakeUser bLiveFakeUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFakeUser.fakeId;
            if (str != null) {
                jsonGenerator.writeStringField("fakeId", str);
            }
            jsonGenerator.writeBooleanField("flush", bLiveFakeUser.flush);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFakeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefakeuser";

    @NonNull
    @ProtobufIndex(index = 1)
    public String fakeId;

    @ProtobufIndex(index = 2)
    public boolean flush;

    public static BLiveFakeUser new_() {
        BLiveFakeUser bLiveFakeUser = new BLiveFakeUser();
        bLiveFakeUser.nullCheck();
        return bLiveFakeUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFakeUser mo225055clone() {
        BLiveFakeUser bLiveFakeUser = new BLiveFakeUser();
        bLiveFakeUser.fakeId = this.fakeId;
        bLiveFakeUser.flush = this.flush;
        return bLiveFakeUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFakeUser)) {
            return false;
        }
        BLiveFakeUser bLiveFakeUser = (BLiveFakeUser) obj;
        return ValueObject.util_equals(this.fakeId, bLiveFakeUser.fakeId) && this.flush == bLiveFakeUser.flush;
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
        String str = this.fakeId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.flush ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fakeId == null) {
            this.fakeId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
