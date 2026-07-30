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
public class BLiveCustomToast extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCustomToast> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCustomToast>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCustomToast.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCustomToast.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCustomToast newInstance() {
            return new BLiveCustomToast();
        }

        public boolean parseField(BLiveCustomToast bLiveCustomToast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "eid":
                    bLiveCustomToast.eid = jsonParser.getValueAsString();
                    return true;
                case "pid":
                    bLiveCustomToast.pid = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveCustomToast.icon = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveCustomToast.color = jsonParser.getValueAsString();
                    return true;
                case "count":
                    bLiveCustomToast.count = jsonParser.getValueAsInt();
                    return true;
                case "content":
                    bLiveCustomToast.content = jsonParser.getValueAsString();
                    return true;
                case "displayTime":
                    bLiveCustomToast.displayTime = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCustomToast bLiveCustomToast, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCustomToast.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            jsonGenerator.writeNumberField("count", bLiveCustomToast.count);
            String str2 = bLiveCustomToast.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            jsonGenerator.writeNumberField("displayTime", bLiveCustomToast.displayTime);
            String str3 = bLiveCustomToast.color;
            if (str3 != null) {
                jsonGenerator.writeStringField("color", str3);
            }
            String str4 = bLiveCustomToast.pid;
            if (str4 != null) {
                jsonGenerator.writeStringField("pid", str4);
            }
            String str5 = bLiveCustomToast.eid;
            if (str5 != null) {
                jsonGenerator.writeStringField("eid", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCustomToast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecustomtoast";

    @NonNull
    @ProtobufIndex(index = 5)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 4)
    public int displayTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String eid;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pid;

    public static BLiveCustomToast new_() {
        BLiveCustomToast bLiveCustomToast = new BLiveCustomToast();
        bLiveCustomToast.nullCheck();
        return bLiveCustomToast;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCustomToast mo223809clone() {
        BLiveCustomToast bLiveCustomToast = new BLiveCustomToast();
        bLiveCustomToast.content = this.content;
        bLiveCustomToast.count = this.count;
        bLiveCustomToast.icon = this.icon;
        bLiveCustomToast.displayTime = this.displayTime;
        bLiveCustomToast.color = this.color;
        bLiveCustomToast.pid = this.pid;
        bLiveCustomToast.eid = this.eid;
        return bLiveCustomToast;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCustomToast)) {
            return false;
        }
        BLiveCustomToast bLiveCustomToast = (BLiveCustomToast) obj;
        return ValueObject.util_equals(this.content, bLiveCustomToast.content) && this.count == bLiveCustomToast.count && ValueObject.util_equals(this.icon, bLiveCustomToast.icon) && this.displayTime == bLiveCustomToast.displayTime && ValueObject.util_equals(this.color, bLiveCustomToast.color) && ValueObject.util_equals(this.pid, bLiveCustomToast.pid) && ValueObject.util_equals(this.eid, bLiveCustomToast.eid);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count) * 41;
        String str2 = this.icon;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.displayTime) * 41;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pid;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.eid;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.pid == null) {
            this.pid = "";
        }
        if (this.eid == null) {
            this.eid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
