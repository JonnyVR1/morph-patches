package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentAdditionalData momentAdditionalData) {
            MomentSendFrom momentSendFrom = momentAdditionalData.sendFrom;
            int iL = momentSendFrom != null ? CodedOutputByteBufferNano.l(1, momentSendFrom, MomentSendFrom.PROTOBUF_ADAPTER) : 0;
            MomentShareInfo momentShareInfo = momentAdditionalData.share;
            if (momentShareInfo != null) {
                iL += CodedOutputByteBufferNano.l(2, momentShareInfo, MomentShareInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentAdditionalData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentAdditionalData m19599parse(nb5 nb5Var) throws IOException {
            MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentAdditionalData.sendFrom == null) {
                        momentAdditionalData.sendFrom = MomentSendFrom.new_();
                    }
                    if (momentAdditionalData.share != null) {
                        break;
                    }
                    momentAdditionalData.share = MomentShareInfo.new_();
                    break;
                }
                if (iU == 10) {
                    momentAdditionalData.sendFrom = (MomentSendFrom) nb5Var.l(MomentSendFrom.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (momentAdditionalData.sendFrom == null) {
                            momentAdditionalData.sendFrom = MomentSendFrom.new_();
                        }
                        if (momentAdditionalData.share != null) {
                            break;
                        }
                        momentAdditionalData.share = MomentShareInfo.new_();
                        return momentAdditionalData;
                    }
                    momentAdditionalData.share = (MomentShareInfo) nb5Var.l(MomentShareInfo.PROTOBUF_ADAPTER);
                }
            }
            return momentAdditionalData;
        }

        public void serialize(MomentAdditionalData momentAdditionalData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MomentSendFrom momentSendFrom = momentAdditionalData.sendFrom;
            if (momentSendFrom != null) {
                codedOutputByteBufferNano.K(1, momentSendFrom, MomentSendFrom.PROTOBUF_ADAPTER);
            }
            MomentShareInfo momentShareInfo = momentAdditionalData.share;
            if (momentShareInfo != null) {
                codedOutputByteBufferNano.K(2, momentShareInfo, MomentShareInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentAdditionalData> JSON_ADAPTER = new ObjectJsonAdapter<MomentAdditionalData>() { // from class: com.p1.mobile.putong.feed.data.MomentAdditionalData.2
        public Class getDataClass() {
            return MomentAdditionalData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentAdditionalData mo17830newInstance() {
            return new MomentAdditionalData();
        }

        public boolean parseField(MomentAdditionalData momentAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("share")) {
                momentAdditionalData.share = (MomentShareInfo) MomentShareInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("sendFrom")) {
                return false;
            }
            momentAdditionalData.sendFrom = (MomentSendFrom) MomentSendFrom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentAdditionalData momentAdditionalData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("share") || str.equals("sendFrom")) {
                return true;
            }
            return super.parseFieldCheck(momentAdditionalData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentAdditionalData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentAdditionalData new_() {
        MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
        momentAdditionalData.nullCheck();
        return momentAdditionalData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentAdditionalData m19598clone() {
        MomentAdditionalData momentAdditionalData = new MomentAdditionalData();
        MomentSendFrom momentSendFrom = this.sendFrom;
        if (momentSendFrom != null) {
            momentAdditionalData.sendFrom = momentSendFrom.m19641clone();
        }
        MomentShareInfo momentShareInfo = this.share;
        if (momentShareInfo != null) {
            momentAdditionalData.share = momentShareInfo.m19647clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MomentSendFrom momentSendFrom = this.sendFrom;
        int iHashCode = (i2 + (momentSendFrom != null ? momentSendFrom.hashCode() : 0)) * 41;
        MomentShareInfo momentShareInfo = this.share;
        int iHashCode2 = iHashCode + (momentShareInfo != null ? momentShareInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.sendFrom == null) {
            this.sendFrom = MomentSendFrom.new_();
        }
        if (this.share == null) {
            this.share = MomentShareInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
