package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAccommpanyTasksProgress extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTasksProgress> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTasksProgress>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksProgress.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTasksProgress.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTasksProgress newInstance() {
            return new BLiveAccommpanyTasksProgress();
        }

        public boolean parseField(BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "max":
                    bLiveAccommpanyTasksProgress.max = jsonParser.getValueAsInt();
                    return true;
                case "desc":
                    bLiveAccommpanyTasksProgress.desc = jsonParser.getValueAsString();
                    return true;
                case "current":
                    bLiveAccommpanyTasksProgress.current = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, bLiveAccommpanyTasksProgress.max);
            jsonGenerator.writeNumberField("current", bLiveAccommpanyTasksProgress.current);
            String str = bLiveAccommpanyTasksProgress.desc;
            if (str != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTasksProgress) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasksprogress";

    @ProtobufIndex(index = 2)
    public int current;

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    @ProtobufIndex(index = 1)
    public int max;

    public static BLiveAccommpanyTasksProgress new_() {
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = new BLiveAccommpanyTasksProgress();
        bLiveAccommpanyTasksProgress.nullCheck();
        return bLiveAccommpanyTasksProgress;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTasksProgress mo223809clone() {
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = new BLiveAccommpanyTasksProgress();
        bLiveAccommpanyTasksProgress.max = this.max;
        bLiveAccommpanyTasksProgress.current = this.current;
        bLiveAccommpanyTasksProgress.desc = this.desc;
        return bLiveAccommpanyTasksProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTasksProgress)) {
            return false;
        }
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = (BLiveAccommpanyTasksProgress) obj;
        return this.max == bLiveAccommpanyTasksProgress.max && this.current == bLiveAccommpanyTasksProgress.current && ValueObject.util_equals(this.desc, bLiveAccommpanyTasksProgress.desc);
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
        int i2 = ((((i * 41) + this.max) * 41) + this.current) * 41;
        String str = this.desc;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
