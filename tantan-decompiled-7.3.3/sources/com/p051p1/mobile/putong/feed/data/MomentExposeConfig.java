package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentExposeConfig momentExposeConfig) {
            SvipValues svipValues = momentExposeConfig.svipValues;
            int iM17285l = svipValues != null ? CodedOutputByteBufferNano.m17285l(1, svipValues, SvipValues.PROTOBUF_ADAPTER) : 0;
            Vouchers vouchers = momentExposeConfig.vouchers;
            if (vouchers != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, vouchers, Vouchers.PROTOBUF_ADAPTER);
            }
            momentExposeConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentExposeConfig parse(nc5 nc5Var) throws IOException {
            MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentExposeConfig.svipValues == null) {
                        momentExposeConfig.svipValues = SvipValues.new_();
                    }
                    if (momentExposeConfig.vouchers != null) {
                        break;
                    }
                    momentExposeConfig.vouchers = Vouchers.new_();
                    break;
                }
                if (iM162497u == 10) {
                    momentExposeConfig.svipValues = (SvipValues) nc5Var.m162488l(SvipValues.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (momentExposeConfig.svipValues == null) {
                            momentExposeConfig.svipValues = SvipValues.new_();
                        }
                        if (momentExposeConfig.vouchers != null) {
                            break;
                        }
                        momentExposeConfig.vouchers = Vouchers.new_();
                        return momentExposeConfig;
                    }
                    momentExposeConfig.vouchers = (Vouchers) nc5Var.m162488l(Vouchers.PROTOBUF_ADAPTER);
                }
            }
            return momentExposeConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentExposeConfig momentExposeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SvipValues svipValues = momentExposeConfig.svipValues;
            if (svipValues != null) {
                codedOutputByteBufferNano.m17309K(1, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
            Vouchers vouchers = momentExposeConfig.vouchers;
            if (vouchers != null) {
                codedOutputByteBufferNano.m17309K(2, vouchers, Vouchers.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentExposeConfig> JSON_ADAPTER = new ObjectJsonAdapter<MomentExposeConfig>() { // from class: com.p1.mobile.putong.feed.data.MomentExposeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentExposeConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentExposeConfig newInstance() {
            return new MomentExposeConfig();
        }

        public boolean parseField(MomentExposeConfig momentExposeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Vouchers.TYPE)) {
                momentExposeConfig.vouchers = Vouchers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("svipValues")) {
                return false;
            }
            momentExposeConfig.svipValues = SvipValues.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentExposeConfig momentExposeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Vouchers.TYPE) || str.equals("svipValues")) {
                return true;
            }
            return super.parseFieldCheck(momentExposeConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExposeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExposeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExposeConfig new_() {
        MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
        momentExposeConfig.nullCheck();
        return momentExposeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentExposeConfig mo225055clone() {
        MomentExposeConfig momentExposeConfig = new MomentExposeConfig();
        SvipValues svipValues = this.svipValues;
        if (svipValues != null) {
            momentExposeConfig.svipValues = svipValues.mo225055clone();
        }
        Vouchers vouchers = this.vouchers;
        if (vouchers != null) {
            momentExposeConfig.vouchers = vouchers.mo225055clone();
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
        SvipValues svipValues = this.svipValues;
        int iHashCode = (i2 + (svipValues != null ? svipValues.hashCode() : 0)) * 41;
        Vouchers vouchers = this.vouchers;
        int iHashCode2 = iHashCode + (vouchers != null ? vouchers.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.svipValues == null) {
            this.svipValues = SvipValues.new_();
        }
        if (this.vouchers == null) {
            this.vouchers = Vouchers.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
