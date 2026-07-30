package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.OMSResourceType;
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
public class BLiveGivenGiftBriefTray extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGivenGiftBriefTray> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGivenGiftBriefTray>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGivenGiftBriefTray.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGivenGiftBriefTray newInstance() {
            return new BLiveGivenGiftBriefTray();
        }

        public boolean parseField(BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(OMSResourceType.background)) {
                bLiveGivenGiftBriefTray.background = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("svg")) {
                return false;
            }
            bLiveGivenGiftBriefTray.svg = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGivenGiftBriefTray.svg;
            if (str != null) {
                jsonGenerator.writeStringField("svg", str);
            }
            String str2 = bLiveGivenGiftBriefTray.background;
            if (str2 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGivenGiftBriefTray) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegivengiftbrieftray";

    @NonNull
    @ProtobufIndex(index = 2)
    public String background;

    @NonNull
    @ProtobufIndex(index = 1)
    public String svg;

    public static BLiveGivenGiftBriefTray new_() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray = new BLiveGivenGiftBriefTray();
        bLiveGivenGiftBriefTray.nullCheck();
        return bLiveGivenGiftBriefTray;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGivenGiftBriefTray mo223809clone() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray = new BLiveGivenGiftBriefTray();
        bLiveGivenGiftBriefTray.svg = this.svg;
        bLiveGivenGiftBriefTray.background = this.background;
        return bLiveGivenGiftBriefTray;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGivenGiftBriefTray)) {
            return false;
        }
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray = (BLiveGivenGiftBriefTray) obj;
        return ValueObject.util_equals(this.svg, bLiveGivenGiftBriefTray.svg) && ValueObject.util_equals(this.background, bLiveGivenGiftBriefTray.background);
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
        String str = this.svg;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.background;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.svg == null) {
            this.svg = "";
        }
        if (this.background == null) {
            this.background = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
