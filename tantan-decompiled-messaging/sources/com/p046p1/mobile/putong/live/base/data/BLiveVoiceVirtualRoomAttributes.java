package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveVoiceVirtualRoomAttributes extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceVirtualRoomAttributes> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceVirtualRoomAttributes>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomAttributes.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceVirtualRoomAttributes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceVirtualRoomAttributes newInstance() {
            return new BLiveVoiceVirtualRoomAttributes();
        }

        public boolean parseField(BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgColor":
                    bLiveVoiceVirtualRoomAttributes.bgColor = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceVirtualRoomAttributes.name = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveVoiceVirtualRoomAttributes.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceVirtualRoomAttributes.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveVoiceVirtualRoomAttributes.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            String str3 = bLiveVoiceVirtualRoomAttributes.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceVirtualRoomAttributes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicevirtualroomattributes";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveVoiceVirtualRoomAttributes new_() {
        BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes = new BLiveVoiceVirtualRoomAttributes();
        bLiveVoiceVirtualRoomAttributes.nullCheck();
        return bLiveVoiceVirtualRoomAttributes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceVirtualRoomAttributes mo223809clone() {
        BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes = new BLiveVoiceVirtualRoomAttributes();
        bLiveVoiceVirtualRoomAttributes.name = this.name;
        bLiveVoiceVirtualRoomAttributes.content = this.content;
        bLiveVoiceVirtualRoomAttributes.bgColor = this.bgColor;
        return bLiveVoiceVirtualRoomAttributes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceVirtualRoomAttributes)) {
            return false;
        }
        BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes = (BLiveVoiceVirtualRoomAttributes) obj;
        return ValueObject.util_equals(this.name, bLiveVoiceVirtualRoomAttributes.name) && ValueObject.util_equals(this.content, bLiveVoiceVirtualRoomAttributes.content) && ValueObject.util_equals(this.bgColor, bLiveVoiceVirtualRoomAttributes.bgColor);
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
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
