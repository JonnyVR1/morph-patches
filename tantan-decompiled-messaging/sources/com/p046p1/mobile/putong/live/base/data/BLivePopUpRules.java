package com.p046p1.mobile.putong.live.base.data;

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
public class BLivePopUpRules extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePopUpRules> JSON_ADAPTER = new ObjectJsonAdapter<BLivePopUpRules>() { // from class: com.p1.mobile.putong.live.base.data.BLivePopUpRules.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePopUpRules.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePopUpRules newInstance() {
            return new BLivePopUpRules();
        }

        public boolean parseField(BLivePopUpRules bLivePopUpRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("liveWatchDuration")) {
                bLivePopUpRules.liveWatchDuration = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("anchorLiveDuration")) {
                return false;
            }
            bLivePopUpRules.anchorLiveDuration = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePopUpRules bLivePopUpRules, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("liveWatchDuration", bLivePopUpRules.liveWatchDuration);
            jsonGenerator.writeNumberField("anchorLiveDuration", bLivePopUpRules.anchorLiveDuration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePopUpRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepopuprules";

    @ProtobufIndex(index = 2)
    public long anchorLiveDuration;

    @ProtobufIndex(index = 1)
    public long liveWatchDuration;

    public static BLivePopUpRules new_() {
        BLivePopUpRules bLivePopUpRules = new BLivePopUpRules();
        bLivePopUpRules.nullCheck();
        return bLivePopUpRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePopUpRules mo223809clone() {
        BLivePopUpRules bLivePopUpRules = new BLivePopUpRules();
        bLivePopUpRules.liveWatchDuration = this.liveWatchDuration;
        bLivePopUpRules.anchorLiveDuration = this.anchorLiveDuration;
        return bLivePopUpRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePopUpRules)) {
            return false;
        }
        BLivePopUpRules bLivePopUpRules = (BLivePopUpRules) obj;
        return this.liveWatchDuration == bLivePopUpRules.liveWatchDuration && this.anchorLiveDuration == bLivePopUpRules.anchorLiveDuration;
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
        long j = this.liveWatchDuration;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.anchorLiveDuration;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
