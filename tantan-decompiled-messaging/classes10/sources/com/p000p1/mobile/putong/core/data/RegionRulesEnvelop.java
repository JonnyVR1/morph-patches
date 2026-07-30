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
public class RegionRulesEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "regionrulesenvelop";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RegionRulesData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<RegionRulesEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<RegionRulesEnvelop>() { // from class: com.p1.mobile.putong.core.data.RegionRulesEnvelop.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RegionRulesEnvelop regionRulesEnvelop) {
            Meta meta = regionRulesEnvelop.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            RegionRulesData regionRulesData = regionRulesEnvelop.data;
            if (regionRulesData != null) {
                iL += CodedOutputByteBufferNano.l(2, regionRulesData, RegionRulesData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) regionRulesEnvelop).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RegionRulesEnvelop m15373parse(nb5 nb5Var) throws IOException {
            RegionRulesEnvelop regionRulesEnvelop = new RegionRulesEnvelop();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (regionRulesEnvelop.meta == null) {
                        regionRulesEnvelop.meta = Meta.new_();
                    }
                    if (regionRulesEnvelop.data != null) {
                        break;
                    }
                    regionRulesEnvelop.data = RegionRulesData.new_();
                    break;
                }
                if (iU == 10) {
                    regionRulesEnvelop.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (regionRulesEnvelop.meta == null) {
                            regionRulesEnvelop.meta = Meta.new_();
                        }
                        if (regionRulesEnvelop.data != null) {
                            break;
                        }
                        regionRulesEnvelop.data = RegionRulesData.new_();
                        return regionRulesEnvelop;
                    }
                    regionRulesEnvelop.data = (RegionRulesData) nb5Var.l(RegionRulesData.PROTOBUF_ADAPTER);
                }
            }
            return regionRulesEnvelop;
        }

        public void serialize(RegionRulesEnvelop regionRulesEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = regionRulesEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            RegionRulesData regionRulesData = regionRulesEnvelop.data;
            if (regionRulesData != null) {
                codedOutputByteBufferNano.K(2, regionRulesData, RegionRulesData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RegionRulesEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<RegionRulesEnvelop>() { // from class: com.p1.mobile.putong.core.data.RegionRulesEnvelop.2
        public Class getDataClass() {
            return RegionRulesEnvelop.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RegionRulesEnvelop m15374newInstance() {
            return new RegionRulesEnvelop();
        }

        public boolean parseField(RegionRulesEnvelop regionRulesEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                regionRulesEnvelop.data = (RegionRulesData) RegionRulesData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            regionRulesEnvelop.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RegionRulesEnvelop regionRulesEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(regionRulesEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RegionRulesEnvelop regionRulesEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (regionRulesEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(regionRulesEnvelop.meta, jsonGenerator, true);
            }
            if (regionRulesEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                RegionRulesData.JSON_ADAPTER.serialize(regionRulesEnvelop.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RegionRulesEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RegionRulesEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RegionRulesEnvelop new_() {
        RegionRulesEnvelop regionRulesEnvelop = new RegionRulesEnvelop();
        regionRulesEnvelop.nullCheck();
        return regionRulesEnvelop;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RegionRulesEnvelop m15372clone() {
        RegionRulesEnvelop regionRulesEnvelop = new RegionRulesEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            regionRulesEnvelop.meta = meta.clone();
        }
        RegionRulesData regionRulesData = this.data;
        if (regionRulesData != null) {
            regionRulesEnvelop.data = regionRulesData.m15368clone();
        }
        return regionRulesEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegionRulesEnvelop)) {
            return false;
        }
        RegionRulesEnvelop regionRulesEnvelop = (RegionRulesEnvelop) obj;
        return ValueObject.util_equals(this.meta, regionRulesEnvelop.meta) && ValueObject.util_equals(this.data, regionRulesEnvelop.data);
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
        RegionRulesData regionRulesData = this.data;
        int iHashCode2 = iHashCode + (regionRulesData != null ? regionRulesData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = RegionRulesData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
