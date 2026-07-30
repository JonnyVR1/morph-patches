package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFrameData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFrameData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFrameData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFrameData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFrameData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFrameData newInstance() {
            return new BLiveFrameData();
        }

        public boolean parseField(BLiveFrameData bLiveFrameData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intlLiveFrameData")) {
                bLiveFrameData.intlLiveFrameData = JsonAdapter.parseArray(jsonParser, BLiveFrame.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            bLiveFrameData.version = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFrameData bLiveFrameData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFrameData.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (bLiveFrameData.intlLiveFrameData != null) {
                jsonGenerator.writeFieldName("intlLiveFrameData");
                JsonAdapter.serializeArray(bLiveFrameData.intlLiveFrameData, jsonGenerator, BLiveFrame.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFrameData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveframedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveFrame> intlLiveFrameData;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveFrameData new_() {
        BLiveFrameData bLiveFrameData = new BLiveFrameData();
        bLiveFrameData.nullCheck();
        return bLiveFrameData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFrameData mo223809clone() {
        BLiveFrameData bLiveFrameData = new BLiveFrameData();
        bLiveFrameData.version = this.version;
        List<BLiveFrame> list = this.intlLiveFrameData;
        if (list != null) {
            bLiveFrameData.intlLiveFrameData = ValueObject.util_map(list, new w9j() { // from class: l.b02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveFrame) obj).mo223809clone();
                }
            });
        }
        return bLiveFrameData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFrameData)) {
            return false;
        }
        BLiveFrameData bLiveFrameData = (BLiveFrameData) obj;
        return ValueObject.util_equals(this.version, bLiveFrameData.version) && ValueObject.util_equals(this.intlLiveFrameData, bLiveFrameData.intlLiveFrameData);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveFrame> list = this.intlLiveFrameData;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.intlLiveFrameData == null) {
            this.intlLiveFrameData = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
