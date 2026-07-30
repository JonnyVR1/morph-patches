package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LiveDefaultTabData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livedefaulttabdata";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LiveDefaultTabDataInfo dataInfo;

    @ProtobufIndex(index = 1)
    public boolean visible;
    public static ProtobufAdapter<LiveDefaultTabData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveDefaultTabData>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveDefaultTabData liveDefaultTabData) {
            int iB = CodedOutputByteBufferNano.b(1, liveDefaultTabData.visible);
            LiveDefaultTabDataInfo liveDefaultTabDataInfo = liveDefaultTabData.dataInfo;
            if (liveDefaultTabDataInfo != null) {
                iB += CodedOutputByteBufferNano.l(2, liveDefaultTabDataInfo, LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) liveDefaultTabData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveDefaultTabData m13927parse(nb5 nb5Var) throws IOException {
            LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    liveDefaultTabData.visible = nb5Var.g();
                } else {
                    if (iU != 18) {
                        return liveDefaultTabData;
                    }
                    liveDefaultTabData.dataInfo = (LiveDefaultTabDataInfo) nb5Var.l(LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(LiveDefaultTabData liveDefaultTabData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, liveDefaultTabData.visible);
            LiveDefaultTabDataInfo liveDefaultTabDataInfo = liveDefaultTabData.dataInfo;
            if (liveDefaultTabDataInfo != null) {
                codedOutputByteBufferNano.K(2, liveDefaultTabDataInfo, LiveDefaultTabDataInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveDefaultTabData> JSON_ADAPTER = new ObjectJsonAdapter<LiveDefaultTabData>() { // from class: com.p1.mobile.putong.core.data.LiveDefaultTabData.2
        public Class getDataClass() {
            return LiveDefaultTabData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LiveDefaultTabData m13928newInstance() {
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
            liveDefaultTabData.dataInfo = (LiveDefaultTabDataInfo) LiveDefaultTabDataInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveDefaultTabData liveDefaultTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("visible") || str.equals("dataInfo")) {
                return true;
            }
            return super.parseFieldCheck(liveDefaultTabData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LiveDefaultTabData liveDefaultTabData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("visible", liveDefaultTabData.visible);
            if (liveDefaultTabData.dataInfo != null) {
                jsonGenerator.writeFieldName("dataInfo");
                LiveDefaultTabDataInfo.JSON_ADAPTER.serialize(liveDefaultTabData.dataInfo, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveDefaultTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveDefaultTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveDefaultTabData new_() {
        LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
        liveDefaultTabData.nullCheck();
        return liveDefaultTabData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveDefaultTabData m13926clone() {
        LiveDefaultTabData liveDefaultTabData = new LiveDefaultTabData();
        liveDefaultTabData.visible = this.visible;
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = this.dataInfo;
        if (liveDefaultTabDataInfo != null) {
            liveDefaultTabData.dataInfo = liveDefaultTabDataInfo.m13930clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.visible ? 1231 : 1237)) * 41;
        LiveDefaultTabDataInfo liveDefaultTabDataInfo = this.dataInfo;
        int iHashCode = i2 + (liveDefaultTabDataInfo != null ? liveDefaultTabDataInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
