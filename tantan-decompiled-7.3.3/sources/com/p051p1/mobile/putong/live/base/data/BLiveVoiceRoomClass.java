package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomSubClass;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomClass extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomClass> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomClass>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomClass.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomClass.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomClass newInstance() {
            return new BLiveVoiceRoomClass();
        }

        public boolean parseField(BLiveVoiceRoomClass bLiveVoiceRoomClass, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subClasses":
                    bLiveVoiceRoomClass.subClasses = JsonAdapter.parseArray(jsonParser, BLiveVoiceRoomSubClass.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cid":
                    bLiveVoiceRoomClass.cid = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceRoomClass.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomClass bLiveVoiceRoomClass, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomClass.cid;
            if (str != null) {
                jsonGenerator.writeStringField("cid", str);
            }
            String str2 = bLiveVoiceRoomClass.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (bLiveVoiceRoomClass.subClasses != null) {
                jsonGenerator.writeFieldName("subClasses");
                JsonAdapter.serializeArray(bLiveVoiceRoomClass.subClasses, jsonGenerator, BLiveVoiceRoomSubClass.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomClass) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomclass";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cid;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVoiceRoomSubClass> subClasses;

    public static BLiveVoiceRoomClass new_() {
        BLiveVoiceRoomClass bLiveVoiceRoomClass = new BLiveVoiceRoomClass();
        bLiveVoiceRoomClass.nullCheck();
        return bLiveVoiceRoomClass;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomClass mo225055clone() {
        BLiveVoiceRoomClass bLiveVoiceRoomClass = new BLiveVoiceRoomClass();
        bLiveVoiceRoomClass.cid = this.cid;
        bLiveVoiceRoomClass.name = this.name;
        List<BLiveVoiceRoomSubClass> list = this.subClasses;
        if (list != null) {
            bLiveVoiceRoomClass.subClasses = ValueObject.util_map(list, new qcj() { // from class: l.u92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceRoomSubClass) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceRoomClass;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomClass)) {
            return false;
        }
        BLiveVoiceRoomClass bLiveVoiceRoomClass = (BLiveVoiceRoomClass) obj;
        return ValueObject.util_equals(this.cid, bLiveVoiceRoomClass.cid) && ValueObject.util_equals(this.name, bLiveVoiceRoomClass.name) && ValueObject.util_equals(this.subClasses, bLiveVoiceRoomClass.subClasses);
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
        String str = this.cid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveVoiceRoomSubClass> list = this.subClasses;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cid == null) {
            this.cid = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.subClasses == null) {
            this.subClasses = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
