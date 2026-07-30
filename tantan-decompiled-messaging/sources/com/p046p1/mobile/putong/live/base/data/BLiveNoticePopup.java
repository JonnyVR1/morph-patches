package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveNoticePopup extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNoticePopup> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNoticePopup>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNoticePopup.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNoticePopup.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNoticePopup newInstance() {
            return new BLiveNoticePopup();
        }

        public boolean parseField(BLiveNoticePopup bLiveNoticePopup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("show")) {
                bLiveNoticePopup.show = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            bLiveNoticePopup.type = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNoticePopup bLiveNoticePopup, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNoticePopup.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeBooleanField("show", bLiveNoticePopup.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNoticePopup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenoticepopup";

    @ProtobufIndex(index = 2)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveNoticePopup new_() {
        BLiveNoticePopup bLiveNoticePopup = new BLiveNoticePopup();
        bLiveNoticePopup.nullCheck();
        return bLiveNoticePopup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNoticePopup mo223809clone() {
        BLiveNoticePopup bLiveNoticePopup = new BLiveNoticePopup();
        bLiveNoticePopup.type = this.type;
        bLiveNoticePopup.show = this.show;
        return bLiveNoticePopup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNoticePopup)) {
            return false;
        }
        BLiveNoticePopup bLiveNoticePopup = (BLiveNoticePopup) obj;
        return ValueObject.util_equals(this.type, bLiveNoticePopup.type) && this.show == bLiveNoticePopup.show;
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
        String str = this.type;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
