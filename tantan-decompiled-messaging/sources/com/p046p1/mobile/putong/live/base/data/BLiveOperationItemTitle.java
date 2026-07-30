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
public class BLiveOperationItemTitle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemTitle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemTitle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemTitle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemTitle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemTitle newInstance() {
            return new BLiveOperationItemTitle();
        }

        public boolean parseField(BLiveOperationItemTitle bLiveOperationItemTitle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleType":
                    bLiveOperationItemTitle.titleType = BLiveOperationTitleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "text":
                    bLiveOperationItemTitle.text = BLiveOperationItemTitleText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "countdown":
                    bLiveOperationItemTitle.countdown = BLiveOperationItemCountDown.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemTitle bLiveOperationItemTitle, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationItemTitle.titleType != null) {
                jsonGenerator.writeFieldName("titleType");
                BLiveOperationTitleType.JSON_ADAPTER.serialize(bLiveOperationItemTitle.titleType, jsonGenerator, true);
            }
            if (bLiveOperationItemTitle.text != null) {
                jsonGenerator.writeFieldName("text");
                BLiveOperationItemTitleText.JSON_ADAPTER.serialize(bLiveOperationItemTitle.text, jsonGenerator, true);
            }
            if (bLiveOperationItemTitle.countdown != null) {
                jsonGenerator.writeFieldName("countdown");
                BLiveOperationItemCountDown.JSON_ADAPTER.serialize(bLiveOperationItemTitle.countdown, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemTitle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitemtitle";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveOperationItemCountDown countdown;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOperationItemTitleText text;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveOperationTitleType titleType;

    public static BLiveOperationItemTitle new_() {
        BLiveOperationItemTitle bLiveOperationItemTitle = new BLiveOperationItemTitle();
        bLiveOperationItemTitle.nullCheck();
        return bLiveOperationItemTitle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemTitle mo223809clone() {
        BLiveOperationItemTitle bLiveOperationItemTitle = new BLiveOperationItemTitle();
        bLiveOperationItemTitle.titleType = this.titleType;
        BLiveOperationItemTitleText bLiveOperationItemTitleText = this.text;
        if (bLiveOperationItemTitleText != null) {
            bLiveOperationItemTitle.text = bLiveOperationItemTitleText.mo223809clone();
        }
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        if (bLiveOperationItemCountDown != null) {
            bLiveOperationItemTitle.countdown = bLiveOperationItemCountDown.mo223809clone();
        }
        return bLiveOperationItemTitle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemTitle)) {
            return false;
        }
        BLiveOperationItemTitle bLiveOperationItemTitle = (BLiveOperationItemTitle) obj;
        return ValueObject.util_equals(this.titleType, bLiveOperationItemTitle.titleType) && ValueObject.util_equals(this.text, bLiveOperationItemTitle.text) && ValueObject.util_equals(this.countdown, bLiveOperationItemTitle.countdown);
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
        BLiveOperationTitleType bLiveOperationTitleType = this.titleType;
        int iHashCode = (i2 + (bLiveOperationTitleType != null ? bLiveOperationTitleType.hashCode() : 0)) * 41;
        BLiveOperationItemTitleText bLiveOperationItemTitleText = this.text;
        int iHashCode2 = (iHashCode + (bLiveOperationItemTitleText != null ? bLiveOperationItemTitleText.hashCode() : 0)) * 41;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        int iHashCode3 = iHashCode2 + (bLiveOperationItemCountDown != null ? bLiveOperationItemCountDown.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.titleType == null) {
            this.titleType = (BLiveOperationTitleType) BLiveOperationTitleType.JSON_ADAPTER.defaultEnum();
        }
        if (this.text == null) {
            this.text = BLiveOperationItemTitleText.new_();
        }
        if (this.countdown == null) {
            this.countdown = BLiveOperationItemCountDown.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
