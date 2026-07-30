package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
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
public class BLiveActivitySummaryRegularUnread extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivitySummaryRegularUnread> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivitySummaryRegularUnread>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivitySummaryRegularUnread.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivitySummaryRegularUnread.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivitySummaryRegularUnread newInstance() {
            return new BLiveActivitySummaryRegularUnread();
        }

        public boolean parseField(BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                bLiveActivitySummaryRegularUnread.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(BannerFrequencyType.interval)) {
                return false;
            }
            bLiveActivitySummaryRegularUnread.interval = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, bLiveActivitySummaryRegularUnread.interval);
            String str = bLiveActivitySummaryRegularUnread.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivitySummaryRegularUnread) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitysummaryregularunread";

    @ProtobufIndex(index = 1)
    public int interval;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    public static BLiveActivitySummaryRegularUnread new_() {
        BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread = new BLiveActivitySummaryRegularUnread();
        bLiveActivitySummaryRegularUnread.nullCheck();
        return bLiveActivitySummaryRegularUnread;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivitySummaryRegularUnread mo223809clone() {
        BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread = new BLiveActivitySummaryRegularUnread();
        bLiveActivitySummaryRegularUnread.interval = this.interval;
        bLiveActivitySummaryRegularUnread.text = this.text;
        return bLiveActivitySummaryRegularUnread;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivitySummaryRegularUnread)) {
            return false;
        }
        BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread = (BLiveActivitySummaryRegularUnread) obj;
        return this.interval == bLiveActivitySummaryRegularUnread.interval && ValueObject.util_equals(this.text, bLiveActivitySummaryRegularUnread.text);
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
        int i2 = ((i * 41) + this.interval) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
