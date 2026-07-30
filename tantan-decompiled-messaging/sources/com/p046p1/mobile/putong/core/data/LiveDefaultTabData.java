package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class LiveDefaultTabData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livedefaulttabdata";

    @Nullable
    @ProtobufIndex(index = 2)
    public LiveDefaultTabDataInfo dataInfo;

    @ProtobufIndex(index = 1)
    public boolean visible;
    public static ProtobufAdapter<LiveDefaultTabData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveDefaultTabData>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveDefaultTabData liveDefaultTabData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, liveDefaultTabData.visible);
            LiveDefaultTabDataInfo liveDefaultTabDataInfo = liveDefaultTabData.dataInfo;
            if (liveDefaultTabDataInfo != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, liveDefaultTabDataInfo, LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
            }
            liveDefaultTabData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveDefaultTabData parse(nb5 nb5Var) throws IOException {
            LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    liveDefaultTabData.visible = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        return liveDefaultTabData;
                    }
                    liveDefaultTabData.dataInfo = (LiveDefaultTabDataInfo) nb5Var.m158743l(LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveDefaultTabData liveDefaultTabData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, liveDefaultTabData.visible);
            LiveDefaultTabDataInfo liveDefaultTabDataInfo = liveDefaultTabData.dataInfo;
            if (liveDefaultTabDataInfo != null) {
                codedOutputByteBufferNano.m17254K(2, liveDefaultTabDataInfo, LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveDefaultTabData> JSON_ADAPTER = new ObjectJsonAdapter<LiveDefaultTabData>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveDefaultTabData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveDefaultTabData newInstance() {
            return new LiveDefaultTabData();
        }

        public boolean parseField(LiveDefaultTabData liveDefaultTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("visible")) {
                liveDefaultTabData.visible = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("dataInfo")) {
                return false;
            }
            liveDefaultTabData.dataInfo = LiveDefaultTabDataInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveDefaultTabData liveDefaultTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("visible") || str.equals("dataInfo")) {
                return true;
            }
            return super.parseFieldCheck(liveDefaultTabData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveDefaultTabData liveDefaultTabData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("visible", liveDefaultTabData.visible);
            if (liveDefaultTabData.dataInfo != null) {
                jsonGenerator.writeFieldName("dataInfo");
                LiveDefaultTabDataInfo.JSON_ADAPTER.serialize(liveDefaultTabData.dataInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveDefaultTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveDefaultTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveDefaultTabData new_() {
        LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
        liveDefaultTabData.nullCheck();
        return liveDefaultTabData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveDefaultTabData mo223809clone() {
        LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
        liveDefaultTabData.visible = this.visible;
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = this.dataInfo;
        if (liveDefaultTabDataInfo != null) {
            liveDefaultTabData.dataInfo = liveDefaultTabDataInfo.mo223809clone();
        }
        return liveDefaultTabData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveDefaultTabData)) {
            return false;
        }
        LiveDefaultTabData liveDefaultTabData = (LiveDefaultTabData) obj;
        return this.visible == liveDefaultTabData.visible && ValueObject.util_equals(this.dataInfo, liveDefaultTabData.dataInfo);
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
        int i2 = ((i * 41) + (this.visible ? 1231 : 1237)) * 41;
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = this.dataInfo;
        int iHashCode = i2 + (liveDefaultTabDataInfo != null ? liveDefaultTabDataInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
