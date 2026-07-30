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
public class MomentExposeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentexposeconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public SvipValues svipValues;

    @NonNull
    @ProtobufIndex(index = 2)
    public Vouchers vouchers;
    public static ProtobufAdapter<MomentExposeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentExposeConfig>() { // from class: com.p1.mobile.putong.feed.data.MomentExposeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentExposeConfig momentExposeConfig) {
            SvipValues svipValues = momentExposeConfig.svipValues;
            int iL = svipValues != null ? CodedOutputByteBufferNano.l(1, svipValues, SvipValues.PROTOBUF_ADAPTER) : 0;
            Vouchers vouchers = momentExposeConfig.vouchers;
            if (vouchers != null) {
                iL += CodedOutputByteBufferNano.l(2, vouchers, Vouchers.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentExposeConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentExposeConfig m19608parse(nb5 nb5Var) throws IOException {
            MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentExposeConfig.svipValues == null) {
                        momentExposeConfig.svipValues = SvipValues.new_();
                    }
                    if (momentExposeConfig.vouchers != null) {
                        break;
                    }
                    momentExposeConfig.vouchers = Vouchers.new_();
                    break;
                }
                if (iU == 10) {
                    momentExposeConfig.svipValues = (SvipValues) nb5Var.l(SvipValues.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (momentExposeConfig.svipValues == null) {
                            momentExposeConfig.svipValues = SvipValues.new_();
                        }
                        if (momentExposeConfig.vouchers != null) {
                            break;
                        }
                        momentExposeConfig.vouchers = Vouchers.new_();
                        return momentExposeConfig;
                    }
                    momentExposeConfig.vouchers = (Vouchers) nb5Var.l(Vouchers.PROTOBUF_ADAPTER);
                }
            }
            return momentExposeConfig;
        }

        public void serialize(MomentExposeConfig momentExposeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SvipValues svipValues = momentExposeConfig.svipValues;
            if (svipValues != null) {
                codedOutputByteBufferNano.K(1, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
            Vouchers vouchers = momentExposeConfig.vouchers;
            if (vouchers != null) {
                codedOutputByteBufferNano.K(2, vouchers, Vouchers.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentExposeConfig> JSON_ADAPTER = new ObjectJsonAdapter<MomentExposeConfig>() { // from class: com.p1.mobile.putong.feed.data.MomentExposeConfig.2
        public Class getDataClass() {
            return MomentExposeConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentExposeConfig mo17830newInstance() {
            return new MomentExposeConfig();
        }

        public boolean parseField(MomentExposeConfig momentExposeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Vouchers.TYPE)) {
                momentExposeConfig.vouchers = (Vouchers) Vouchers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("svipValues")) {
                return false;
            }
            momentExposeConfig.svipValues = (SvipValues) SvipValues.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentExposeConfig momentExposeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Vouchers.TYPE) || str.equals("svipValues")) {
                return true;
            }
            return super.parseFieldCheck(momentExposeConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentExposeConfig momentExposeConfig, JsonGenerator jsonGenerator) throws IOException {
            if (momentExposeConfig.svipValues != null) {
                jsonGenerator.writeFieldName("svipValues");
                SvipValues.JSON_ADAPTER.serialize(momentExposeConfig.svipValues, jsonGenerator, true);
            }
            if (momentExposeConfig.vouchers != null) {
                jsonGenerator.writeFieldName(Vouchers.TYPE);
                Vouchers.JSON_ADAPTER.serialize(momentExposeConfig.vouchers, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExposeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExposeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExposeConfig new_() {
        MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
        momentExposeConfig.nullCheck();
        return momentExposeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentExposeConfig m19607clone() {
        MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
        SvipValues svipValues = this.svipValues;
        if (svipValues != null) {
            momentExposeConfig.svipValues = svipValues.m19776clone();
        }
        Vouchers vouchers = this.vouchers;
        if (vouchers != null) {
            momentExposeConfig.vouchers = vouchers.m19833clone();
        }
        return momentExposeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentExposeConfig)) {
            return false;
        }
        MomentExposeConfig momentExposeConfig = (MomentExposeConfig) obj;
        return ValueObject.util_equals(this.svipValues, momentExposeConfig.svipValues) && ValueObject.util_equals(this.vouchers, momentExposeConfig.vouchers);
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
        SvipValues svipValues = this.svipValues;
        int iHashCode = (i2 + (svipValues != null ? svipValues.hashCode() : 0)) * 41;
        Vouchers vouchers = this.vouchers;
        int iHashCode2 = iHashCode + (vouchers != null ? vouchers.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.svipValues == null) {
            this.svipValues = SvipValues.new_();
        }
        if (this.vouchers == null) {
            this.vouchers = Vouchers.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
