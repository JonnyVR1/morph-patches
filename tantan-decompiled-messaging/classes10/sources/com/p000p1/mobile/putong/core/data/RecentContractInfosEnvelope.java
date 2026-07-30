package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class RecentContractInfosEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentcontractinfosenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RecentContractInfosData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RecentContractInfosEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecentContractInfosEnvelope recentContractInfosEnvelope) {
            Meta meta = recentContractInfosEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RecentContractInfosData recentContractInfosData = recentContractInfosEnvelope.data;
            if (recentContractInfosData != null) {
                iL += CodedOutputByteBufferNano.l(2, recentContractInfosData, RecentContractInfosData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) recentContractInfosEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecentContractInfosEnvelope m15309parse(nb5 nb5Var) throws IOException {
            RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recentContractInfosEnvelope.meta == null) {
                        recentContractInfosEnvelope.meta = Meta.new_();
                    }
                    if (recentContractInfosEnvelope.data != null) {
                        break;
                    }
                    recentContractInfosEnvelope.data = RecentContractInfosData.new_();
                    break;
                }
                if (iU == 10) {
                    recentContractInfosEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (recentContractInfosEnvelope.meta == null) {
                            recentContractInfosEnvelope.meta = Meta.new_();
                        }
                        if (recentContractInfosEnvelope.data != null) {
                            break;
                        }
                        recentContractInfosEnvelope.data = RecentContractInfosData.new_();
                        return recentContractInfosEnvelope;
                    }
                    recentContractInfosEnvelope.data = (RecentContractInfosData) nb5Var.l(RecentContractInfosData.PROTOBUF_ADAPTER);
                }
            }
            return recentContractInfosEnvelope;
        }

        public void serialize(RecentContractInfosEnvelope recentContractInfosEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = recentContractInfosEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RecentContractInfosData recentContractInfosData = recentContractInfosEnvelope.data;
            if (recentContractInfosData != null) {
                codedOutputByteBufferNano.K(2, recentContractInfosData, RecentContractInfosData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecentContractInfosEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfosEnvelope.2
        public Class getDataClass() {
            return RecentContractInfosEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecentContractInfosEnvelope m15310newInstance() {
            return new RecentContractInfosEnvelope();
        }

        public boolean parseField(RecentContractInfosEnvelope recentContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                recentContractInfosEnvelope.data = (RecentContractInfosData) RecentContractInfosData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            recentContractInfosEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecentContractInfosEnvelope recentContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(recentContractInfosEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfosEnvelope new_() {
        RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
        recentContractInfosEnvelope.nullCheck();
        return recentContractInfosEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecentContractInfosEnvelope m15308clone() {
        RecentContractInfosEnvelope recentContractInfosEnvelope = new RecentContractInfosEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            recentContractInfosEnvelope.meta = meta.clone();
        }
        RecentContractInfosData recentContractInfosData = this.data;
        if (recentContractInfosData != null) {
            recentContractInfosEnvelope.data = recentContractInfosData.m15304clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        RecentContractInfosData recentContractInfosData = this.data;
        int iHashCode2 = iHashCode + (recentContractInfosData != null ? recentContractInfosData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = RecentContractInfosData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
