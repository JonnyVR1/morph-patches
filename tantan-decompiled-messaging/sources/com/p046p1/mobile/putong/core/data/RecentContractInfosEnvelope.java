package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class RecentContractInfosEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentcontractinfosenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public RecentContractInfosData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RecentContractInfosEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecentContractInfosEnvelope recentContractInfosEnvelope) {
            Meta meta = recentContractInfosEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RecentContractInfosData recentContractInfosData = recentContractInfosEnvelope.data;
            if (recentContractInfosData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, recentContractInfosData, RecentContractInfosData.PROTOBUF_ADAPTER);
            }
            recentContractInfosEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecentContractInfosEnvelope parse(nb5 nb5Var) throws IOException {
            RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (recentContractInfosEnvelope.meta == null) {
                        recentContractInfosEnvelope.meta = Meta.new_();
                    }
                    if (recentContractInfosEnvelope.data != null) {
                        break;
                    }
                    recentContractInfosEnvelope.data = RecentContractInfosData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    recentContractInfosEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (recentContractInfosEnvelope.meta == null) {
                            recentContractInfosEnvelope.meta = Meta.new_();
                        }
                        if (recentContractInfosEnvelope.data != null) {
                            break;
                        }
                        recentContractInfosEnvelope.data = RecentContractInfosData.new_();
                        return recentContractInfosEnvelope;
                    }
                    recentContractInfosEnvelope.data = (RecentContractInfosData) nb5Var.m158743l(RecentContractInfosData.PROTOBUF_ADAPTER);
                }
            }
            return recentContractInfosEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecentContractInfosEnvelope recentContractInfosEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = recentContractInfosEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RecentContractInfosData recentContractInfosData = recentContractInfosEnvelope.data;
            if (recentContractInfosData != null) {
                codedOutputByteBufferNano.m17254K(2, recentContractInfosData, RecentContractInfosData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecentContractInfosEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecentContractInfosEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecentContractInfosEnvelope newInstance() {
            return new RecentContractInfosEnvelope();
        }

        public boolean parseField(RecentContractInfosEnvelope recentContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                recentContractInfosEnvelope.data = RecentContractInfosData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            recentContractInfosEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecentContractInfosEnvelope recentContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(recentContractInfosEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecentContractInfosEnvelope recentContractInfosEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (recentContractInfosEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(recentContractInfosEnvelope.meta, jsonGenerator, true);
            }
            if (recentContractInfosEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                RecentContractInfosData.JSON_ADAPTER.serialize(recentContractInfosEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfosEnvelope new_() {
        RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
        recentContractInfosEnvelope.nullCheck();
        return recentContractInfosEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecentContractInfosEnvelope mo223809clone() {
        RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            recentContractInfosEnvelope.meta = meta.mo223809clone();
        }
        RecentContractInfosData recentContractInfosData = this.data;
        if (recentContractInfosData != null) {
            recentContractInfosEnvelope.data = recentContractInfosData.mo223809clone();
        }
        return recentContractInfosEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecentContractInfosEnvelope)) {
            return false;
        }
        RecentContractInfosEnvelope recentContractInfosEnvelope = (RecentContractInfosEnvelope) obj;
        return ValueObject.util_equals(this.meta, recentContractInfosEnvelope.meta) && ValueObject.util_equals(this.data, recentContractInfosEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        RecentContractInfosData recentContractInfosData = this.data;
        int iHashCode2 = iHashCode + (recentContractInfosData != null ? recentContractInfosData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = RecentContractInfosData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
