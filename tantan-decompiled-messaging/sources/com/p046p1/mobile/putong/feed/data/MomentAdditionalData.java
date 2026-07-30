package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class MomentAdditionalData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentadditionaldata";

    @NonNull
    @ProtobufIndex(index = 1)
    public MomentSendFrom sendFrom;

    @NonNull
    @ProtobufIndex(index = 2)
    public MomentShareInfo share;
    public static ProtobufAdapter<MomentAdditionalData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentAdditionalData>() { // from class: com.p1.mobile.putong.feed.data.MomentAdditionalData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentAdditionalData momentAdditionalData) {
            MomentSendFrom momentSendFrom = momentAdditionalData.sendFrom;
            int iM17230l = momentSendFrom != null ? CodedOutputByteBufferNano.m17230l(1, momentSendFrom, MomentSendFrom.PROTOBUF_ADAPTER) : 0;
            MomentShareInfo momentShareInfo = momentAdditionalData.share;
            if (momentShareInfo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, momentShareInfo, MomentShareInfo.PROTOBUF_ADAPTER);
            }
            momentAdditionalData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentAdditionalData parse(nb5 nb5Var) throws IOException {
            MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentAdditionalData.sendFrom == null) {
                        momentAdditionalData.sendFrom = MomentSendFrom.new_();
                    }
                    if (momentAdditionalData.share != null) {
                        break;
                    }
                    momentAdditionalData.share = MomentShareInfo.new_();
                    break;
                }
                if (iM158752u == 10) {
                    momentAdditionalData.sendFrom = (MomentSendFrom) nb5Var.m158743l(MomentSendFrom.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (momentAdditionalData.sendFrom == null) {
                            momentAdditionalData.sendFrom = MomentSendFrom.new_();
                        }
                        if (momentAdditionalData.share != null) {
                            break;
                        }
                        momentAdditionalData.share = MomentShareInfo.new_();
                        return momentAdditionalData;
                    }
                    momentAdditionalData.share = (MomentShareInfo) nb5Var.m158743l(MomentShareInfo.PROTOBUF_ADAPTER);
                }
            }
            return momentAdditionalData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentAdditionalData momentAdditionalData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MomentSendFrom momentSendFrom = momentAdditionalData.sendFrom;
            if (momentSendFrom != null) {
                codedOutputByteBufferNano.m17254K(1, momentSendFrom, MomentSendFrom.PROTOBUF_ADAPTER);
            }
            MomentShareInfo momentShareInfo = momentAdditionalData.share;
            if (momentShareInfo != null) {
                codedOutputByteBufferNano.m17254K(2, momentShareInfo, MomentShareInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentAdditionalData> JSON_ADAPTER = new ObjectJsonAdapter<MomentAdditionalData>() { // from class: com.p1.mobile.putong.feed.data.MomentAdditionalData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentAdditionalData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentAdditionalData newInstance() {
            return new MomentAdditionalData();
        }

        public boolean parseField(MomentAdditionalData momentAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("share")) {
                momentAdditionalData.share = MomentShareInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("sendFrom")) {
                return false;
            }
            momentAdditionalData.sendFrom = MomentSendFrom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentAdditionalData momentAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("share") || str.equals("sendFrom")) {
                return true;
            }
            return super.parseFieldCheck(momentAdditionalData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentAdditionalData momentAdditionalData, JsonGenerator jsonGenerator) throws IOException {
            if (momentAdditionalData.sendFrom != null) {
                jsonGenerator.writeFieldName("sendFrom");
                MomentSendFrom.JSON_ADAPTER.serialize(momentAdditionalData.sendFrom, jsonGenerator, true);
            }
            if (momentAdditionalData.share != null) {
                jsonGenerator.writeFieldName("share");
                MomentShareInfo.JSON_ADAPTER.serialize(momentAdditionalData.share, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentAdditionalData new_() {
        MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
        momentAdditionalData.nullCheck();
        return momentAdditionalData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentAdditionalData mo223809clone() {
        MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
        MomentSendFrom momentSendFrom = this.sendFrom;
        if (momentSendFrom != null) {
            momentAdditionalData.sendFrom = momentSendFrom.mo223809clone();
        }
        MomentShareInfo momentShareInfo = this.share;
        if (momentShareInfo != null) {
            momentAdditionalData.share = momentShareInfo.mo223809clone();
        }
        return momentAdditionalData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentAdditionalData)) {
            return false;
        }
        MomentAdditionalData momentAdditionalData = (MomentAdditionalData) obj;
        return ValueObject.util_equals(this.sendFrom, momentAdditionalData.sendFrom) && ValueObject.util_equals(this.share, momentAdditionalData.share);
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
        MomentSendFrom momentSendFrom = this.sendFrom;
        int iHashCode = (i2 + (momentSendFrom != null ? momentSendFrom.hashCode() : 0)) * 41;
        MomentShareInfo momentShareInfo = this.share;
        int iHashCode2 = iHashCode + (momentShareInfo != null ? momentShareInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sendFrom == null) {
            this.sendFrom = MomentSendFrom.new_();
        }
        if (this.share == null) {
            this.share = MomentShareInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
