package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes10.dex */
public class HideAndSeekBannerEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekbannerenv";

    @NonNull
    @ProtobufIndex(index = 2)
    public HideAndSeekBannerData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekBannerEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekBannerEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerEnv.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekBannerEnv hideAndSeekBannerEnv) {
            Meta meta = hideAndSeekBannerEnv.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekBannerData hideAndSeekBannerData = hideAndSeekBannerEnv.data;
            if (hideAndSeekBannerData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hideAndSeekBannerData, HideAndSeekBannerData.PROTOBUF_ADAPTER);
            }
            hideAndSeekBannerEnv.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekBannerEnv parse(nc5 nc5Var) throws IOException {
            HideAndSeekBannerEnv hideAndSeekBannerEnv = new HideAndSeekBannerEnv();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekBannerEnv.meta == null) {
                        hideAndSeekBannerEnv.meta = Meta.new_();
                    }
                    if (hideAndSeekBannerEnv.data != null) {
                        break;
                    }
                    hideAndSeekBannerEnv.data = HideAndSeekBannerData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    hideAndSeekBannerEnv.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (hideAndSeekBannerEnv.meta == null) {
                            hideAndSeekBannerEnv.meta = Meta.new_();
                        }
                        if (hideAndSeekBannerEnv.data != null) {
                            break;
                        }
                        hideAndSeekBannerEnv.data = HideAndSeekBannerData.new_();
                        return hideAndSeekBannerEnv;
                    }
                    hideAndSeekBannerEnv.data = (HideAndSeekBannerData) nc5Var.m162488l(HideAndSeekBannerData.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekBannerEnv;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekBannerEnv hideAndSeekBannerEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekBannerEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekBannerData hideAndSeekBannerData = hideAndSeekBannerEnv.data;
            if (hideAndSeekBannerData != null) {
                codedOutputByteBufferNano.m17309K(2, hideAndSeekBannerData, HideAndSeekBannerData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekBannerEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekBannerEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerEnv.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekBannerEnv.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekBannerEnv newInstance() {
            return new HideAndSeekBannerEnv();
        }

        public boolean parseField(HideAndSeekBannerEnv hideAndSeekBannerEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekBannerEnv.data = HideAndSeekBannerData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekBannerEnv.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekBannerEnv hideAndSeekBannerEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekBannerEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekBannerEnv hideAndSeekBannerEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekBannerEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekBannerEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekBannerEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekBannerData.JSON_ADAPTER.serialize(hideAndSeekBannerEnv.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekBannerEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekBannerEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekBannerEnv new_() {
        HideAndSeekBannerEnv hideAndSeekBannerEnv = new HideAndSeekBannerEnv();
        hideAndSeekBannerEnv.nullCheck();
        return hideAndSeekBannerEnv;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekBannerEnv mo225055clone() {
        HideAndSeekBannerEnv hideAndSeekBannerEnv = new HideAndSeekBannerEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekBannerEnv.meta = meta.mo225055clone();
        }
        HideAndSeekBannerData hideAndSeekBannerData = this.data;
        if (hideAndSeekBannerData != null) {
            hideAndSeekBannerEnv.data = hideAndSeekBannerData.mo225055clone();
        }
        return hideAndSeekBannerEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekBannerEnv)) {
            return false;
        }
        HideAndSeekBannerEnv hideAndSeekBannerEnv = (HideAndSeekBannerEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekBannerEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekBannerEnv.data);
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
        HideAndSeekBannerData hideAndSeekBannerData = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekBannerData != null ? hideAndSeekBannerData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = HideAndSeekBannerData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
