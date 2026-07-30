package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
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
public class BLiveOperationItemMask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemMask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemMask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemMask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemMask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemMask newInstance() {
            return new BLiveOperationItemMask();
        }

        public boolean parseField(BLiveOperationItemMask bLiveOperationItemMask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "size":
                    bLiveOperationItemMask.size = jsonParser.getValueAsInt();
                    return true;
                case "position":
                    bLiveOperationItemMask.position = jsonParser.getValueAsString();
                    return true;
                case "maskUrl":
                    bLiveOperationItemMask.maskUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemMask bLiveOperationItemMask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemMask.maskUrl;
            if (str != null) {
                jsonGenerator.writeStringField("maskUrl", str);
            }
            String str2 = bLiveOperationItemMask.position;
            if (str2 != null) {
                jsonGenerator.writeStringField("position", str2);
            }
            jsonGenerator.writeNumberField("size", bLiveOperationItemMask.size);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemMask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    private static final String LOCATION_CENTER = "center";
    private static final String LOCATION_TOP_LEFT = "topLeft";
    private static final String LOCATION_TOP_MIDDLE = "topMiddle";
    private static final String LOCATION_TOP_RIGHT = "topRight";
    public static final String TYPE = "bliveoperationitemmask";

    @NonNull
    @ProtobufIndex(index = 1)
    public String maskUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String position;

    @ProtobufIndex(index = 3)
    public int size;

    public static BLiveOperationItemMask new_() {
        BLiveOperationItemMask bLiveOperationItemMask = new BLiveOperationItemMask();
        bLiveOperationItemMask.nullCheck();
        return bLiveOperationItemMask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemMask mo223809clone() {
        BLiveOperationItemMask bLiveOperationItemMask = new BLiveOperationItemMask();
        bLiveOperationItemMask.maskUrl = this.maskUrl;
        bLiveOperationItemMask.position = this.position;
        bLiveOperationItemMask.size = this.size;
        return bLiveOperationItemMask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemMask)) {
            return false;
        }
        BLiveOperationItemMask bLiveOperationItemMask = (BLiveOperationItemMask) obj;
        return ValueObject.util_equals(this.maskUrl, bLiveOperationItemMask.maskUrl) && ValueObject.util_equals(this.position, bLiveOperationItemMask.position) && this.size == bLiveOperationItemMask.size;
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
        String str = this.maskUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.position;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.size;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isCenter() {
        return TextUtils.equals(this.position, "center");
    }

    public boolean isTopLeft() {
        return TextUtils.equals(this.position, LOCATION_TOP_LEFT);
    }

    public boolean isTopMiddle() {
        return TextUtils.equals(this.position, LOCATION_TOP_MIDDLE);
    }

    public boolean isTopRight() {
        return TextUtils.equals(this.position, "topRight");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maskUrl == null) {
            this.maskUrl = "";
        }
        if (this.position == null) {
            this.position = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
