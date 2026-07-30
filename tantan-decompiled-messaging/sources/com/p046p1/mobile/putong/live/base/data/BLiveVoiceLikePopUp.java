package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Reason;
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
public class BLiveVoiceLikePopUp extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLikePopUp> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLikePopUp>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLikePopUp.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLikePopUp.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLikePopUp newInstance() {
            return new BLiveVoiceLikePopUp();
        }

        public boolean parseField(BLiveVoiceLikePopUp bLiveVoiceLikePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    bLiveVoiceLikePopUp.reason = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceLikePopUp.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveVoiceLikePopUp.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLikePopUp bLiveVoiceLikePopUp, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLikePopUp.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceLikePopUp.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            String str3 = bLiveVoiceLikePopUp.reason;
            if (str3 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLikePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicelikepopup";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveVoiceLikePopUp new_() {
        BLiveVoiceLikePopUp bLiveVoiceLikePopUp = new BLiveVoiceLikePopUp();
        bLiveVoiceLikePopUp.nullCheck();
        return bLiveVoiceLikePopUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLikePopUp mo223809clone() {
        BLiveVoiceLikePopUp bLiveVoiceLikePopUp = new BLiveVoiceLikePopUp();
        bLiveVoiceLikePopUp.title = this.title;
        bLiveVoiceLikePopUp.content = this.content;
        bLiveVoiceLikePopUp.reason = this.reason;
        return bLiveVoiceLikePopUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLikePopUp)) {
            return false;
        }
        BLiveVoiceLikePopUp bLiveVoiceLikePopUp = (BLiveVoiceLikePopUp) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceLikePopUp.title) && ValueObject.util_equals(this.content, bLiveVoiceLikePopUp.content) && ValueObject.util_equals(this.reason, bLiveVoiceLikePopUp.reason);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.reason;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
