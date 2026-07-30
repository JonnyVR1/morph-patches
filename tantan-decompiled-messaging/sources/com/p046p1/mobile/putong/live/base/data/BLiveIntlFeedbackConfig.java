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
public class BLiveIntlFeedbackConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlFeedbackConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlFeedbackConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlFeedbackConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlFeedbackConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlFeedbackConfig newInstance() {
            return new BLiveIntlFeedbackConfig();
        }

        public boolean parseField(BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("uploadImageSizeLimit")) {
                bLiveIntlFeedbackConfig.uploadImageSizeLimit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("logUploadLimitFrequency")) {
                return false;
            }
            bLiveIntlFeedbackConfig.logUploadLimitFrequency = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("logUploadLimitFrequency", bLiveIntlFeedbackConfig.logUploadLimitFrequency);
            jsonGenerator.writeNumberField("uploadImageSizeLimit", bLiveIntlFeedbackConfig.uploadImageSizeLimit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlFeedbackConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlfeedbackconfig";

    @ProtobufIndex(index = 1)
    public int logUploadLimitFrequency;

    @ProtobufIndex(index = 2)
    public int uploadImageSizeLimit;

    public static BLiveIntlFeedbackConfig new_() {
        BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig = new BLiveIntlFeedbackConfig();
        bLiveIntlFeedbackConfig.nullCheck();
        return bLiveIntlFeedbackConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlFeedbackConfig mo223809clone() {
        BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig = new BLiveIntlFeedbackConfig();
        bLiveIntlFeedbackConfig.logUploadLimitFrequency = this.logUploadLimitFrequency;
        bLiveIntlFeedbackConfig.uploadImageSizeLimit = this.uploadImageSizeLimit;
        return bLiveIntlFeedbackConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlFeedbackConfig)) {
            return false;
        }
        BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig = (BLiveIntlFeedbackConfig) obj;
        return this.logUploadLimitFrequency == bLiveIntlFeedbackConfig.logUploadLimitFrequency && this.uploadImageSizeLimit == bLiveIntlFeedbackConfig.uploadImageSizeLimit;
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
        int i2 = (((i * 41) + this.logUploadLimitFrequency) * 41) + this.uploadImageSizeLimit;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
