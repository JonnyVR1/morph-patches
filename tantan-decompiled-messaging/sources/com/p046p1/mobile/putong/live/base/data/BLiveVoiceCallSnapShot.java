package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCallSnapShot extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCallSnapShot> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCallSnapShot>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCallSnapShot.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCallSnapShot.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCallSnapShot newInstance() {
            return new BLiveVoiceCallSnapShot();
        }

        public boolean parseField(BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveVoiceCallSnapShot.f44488id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("user")) {
                return false;
            }
            bLiveVoiceCallSnapShot.user = Converter.USER_ID.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCallSnapShot.f44488id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceCallSnapShot.user != null) {
                jsonGenerator.writeFieldName("user");
                Converter.USER_ID.serialize(bLiveVoiceCallSnapShot.user, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCallSnapShot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecallsnapshot";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44488id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String user;

    public static BLiveVoiceCallSnapShot new_() {
        BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot = new BLiveVoiceCallSnapShot();
        bLiveVoiceCallSnapShot.nullCheck();
        return bLiveVoiceCallSnapShot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCallSnapShot mo223809clone() {
        BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot = new BLiveVoiceCallSnapShot();
        bLiveVoiceCallSnapShot.f44488id = this.f44488id;
        bLiveVoiceCallSnapShot.user = this.user;
        return bLiveVoiceCallSnapShot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCallSnapShot)) {
            return false;
        }
        BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot = (BLiveVoiceCallSnapShot) obj;
        return ValueObject.util_equals(this.f44488id, bLiveVoiceCallSnapShot.f44488id) && ValueObject.util_equals(this.user, bLiveVoiceCallSnapShot.user);
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
        String str = this.f44488id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.user;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44488id == null) {
            this.f44488id = "";
        }
        if (this.user == null) {
            this.user = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
