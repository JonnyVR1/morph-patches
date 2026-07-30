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
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOriginCounter extends ValueObject<BLiveOriginCounter> implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOriginCounter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOriginCounter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOriginCounter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOriginCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOriginCounter newInstance() {
            return new BLiveOriginCounter();
        }

        public boolean parseField(BLiveOriginCounter bLiveOriginCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("liveChatLimit")) {
                bLiveOriginCounter.liveChatLimit = BLiveCommonCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("livePushLimit")) {
                return false;
            }
            bLiveOriginCounter.livePushLimit = BLivePushLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOriginCounter bLiveOriginCounter, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOriginCounter.liveChatLimit != null) {
                jsonGenerator.writeFieldName("liveChatLimit");
                BLiveCommonCount.JSON_ADAPTER.serialize(bLiveOriginCounter.liveChatLimit, jsonGenerator, true);
            }
            if (bLiveOriginCounter.livePushLimit != null) {
                jsonGenerator.writeFieldName("livePushLimit");
                BLivePushLimit.JSON_ADAPTER.serialize(bLiveOriginCounter.livePushLimit, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOriginCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveorigincounter";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCommonCount liveChatLimit;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePushLimit livePushLimit;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    public static BLiveOriginCounter new_() {
        BLiveOriginCounter bLiveOriginCounter = new BLiveOriginCounter();
        bLiveOriginCounter.nullCheck();
        return bLiveOriginCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOriginCounter mo223809clone() {
        BLiveOriginCounter bLiveOriginCounter = new BLiveOriginCounter();
        BLiveCommonCount bLiveCommonCount = this.liveChatLimit;
        if (bLiveCommonCount != null) {
            bLiveOriginCounter.liveChatLimit = bLiveCommonCount.mo223809clone();
        }
        BLivePushLimit bLivePushLimit = this.livePushLimit;
        if (bLivePushLimit != null) {
            bLiveOriginCounter.livePushLimit = bLivePushLimit.mo223809clone();
        }
        return bLiveOriginCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOriginCounter)) {
            return false;
        }
        BLiveOriginCounter bLiveOriginCounter = (BLiveOriginCounter) obj;
        return ValueObject.util_equals(this.liveChatLimit, bLiveOriginCounter.liveChatLimit) && ValueObject.util_equals(this.livePushLimit, bLiveOriginCounter.livePushLimit);
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
        BLiveCommonCount bLiveCommonCount = this.liveChatLimit;
        int iHashCode = (i2 + (bLiveCommonCount != null ? bLiveCommonCount.hashCode() : 0)) * 41;
        BLivePushLimit bLivePushLimit = this.livePushLimit;
        int iHashCode2 = iHashCode + (bLivePushLimit != null ? bLivePushLimit.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(BLiveOriginCounter bLiveOriginCounter) {
        if (!shouldMergeData() || equals(bLiveOriginCounter)) {
            return;
        }
        if (!isFieldParsed("liveChatLimit")) {
            this.liveChatLimit = bLiveOriginCounter.liveChatLimit;
        }
        if (!isFieldParsed("livePushLimit")) {
            this.livePushLimit = bLiveOriginCounter.livePushLimit;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveChatLimit == null) {
            this.liveChatLimit = BLiveCommonCount.new_();
        }
        if (this.livePushLimit == null) {
            this.livePushLimit = BLivePushLimit.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
