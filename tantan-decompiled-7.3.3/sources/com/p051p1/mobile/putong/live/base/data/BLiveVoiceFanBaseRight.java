package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
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
public class BLiveVoiceFanBaseRight extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFanBaseRight> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFanBaseRight>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFanBaseRight.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFanBaseRight.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFanBaseRight newInstance() {
            return new BLiveVoiceFanBaseRight();
        }

        public boolean parseField(BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(CreditScoreTaskType.pic)) {
                bLiveVoiceFanBaseRight.pic = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            bLiveVoiceFanBaseRight.name = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFanBaseRight.pic;
            if (str != null) {
                jsonGenerator.writeStringField(CreditScoreTaskType.pic, str);
            }
            String str2 = bLiveVoiceFanBaseRight.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFanBaseRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefanbaseright";

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pic;

    public static BLiveVoiceFanBaseRight new_() {
        BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight = new BLiveVoiceFanBaseRight();
        bLiveVoiceFanBaseRight.nullCheck();
        return bLiveVoiceFanBaseRight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFanBaseRight mo225055clone() {
        BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight = new BLiveVoiceFanBaseRight();
        bLiveVoiceFanBaseRight.pic = this.pic;
        bLiveVoiceFanBaseRight.name = this.name;
        return bLiveVoiceFanBaseRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFanBaseRight)) {
            return false;
        }
        BLiveVoiceFanBaseRight bLiveVoiceFanBaseRight = (BLiveVoiceFanBaseRight) obj;
        return ValueObject.util_equals(this.pic, bLiveVoiceFanBaseRight.pic) && ValueObject.util_equals(this.name, bLiveVoiceFanBaseRight.name);
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
        String str = this.pic;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pic == null) {
            this.pic = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
