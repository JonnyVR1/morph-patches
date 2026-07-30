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
public class BLiveCurrentHourNotices extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCurrentHourNotices> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCurrentHourNotices>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCurrentHourNotices.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCurrentHourNotices newInstance() {
            return new BLiveCurrentHourNotices();
        }

        public boolean parseField(BLiveCurrentHourNotices bLiveCurrentHourNotices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("jumpUrl")) {
                bLiveCurrentHourNotices.jumpUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("content")) {
                return false;
            }
            bLiveCurrentHourNotices.content = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCurrentHourNotices bLiveCurrentHourNotices, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCurrentHourNotices.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = bLiveCurrentHourNotices.jumpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCurrentHourNotices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecurrenthournotices";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public String jumpUrl;

    public static BLiveCurrentHourNotices new_() {
        BLiveCurrentHourNotices bLiveCurrentHourNotices = new BLiveCurrentHourNotices();
        bLiveCurrentHourNotices.nullCheck();
        return bLiveCurrentHourNotices;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCurrentHourNotices mo223809clone() {
        BLiveCurrentHourNotices bLiveCurrentHourNotices = new BLiveCurrentHourNotices();
        bLiveCurrentHourNotices.content = this.content;
        bLiveCurrentHourNotices.jumpUrl = this.jumpUrl;
        return bLiveCurrentHourNotices;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCurrentHourNotices)) {
            return false;
        }
        BLiveCurrentHourNotices bLiveCurrentHourNotices = (BLiveCurrentHourNotices) obj;
        return ValueObject.util_equals(this.content, bLiveCurrentHourNotices.content) && ValueObject.util_equals(this.jumpUrl, bLiveCurrentHourNotices.jumpUrl);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jumpUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
