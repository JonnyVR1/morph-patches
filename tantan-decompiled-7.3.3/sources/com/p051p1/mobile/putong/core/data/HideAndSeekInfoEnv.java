package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class HideAndSeekInfoEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekinfoenv";

    @Nullable
    @ProtobufIndex(index = 2)
    public HideAndSeekInfoData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekInfoEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekInfoEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoEnv.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekInfoEnv hideAndSeekInfoEnv) {
            Meta meta = hideAndSeekInfoEnv.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekInfoData hideAndSeekInfoData = hideAndSeekInfoEnv.data;
            if (hideAndSeekInfoData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hideAndSeekInfoData, HideAndSeekInfoData.PROTOBUF_ADAPTER);
            }
            hideAndSeekInfoEnv.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekInfoEnv parse(nc5 nc5Var) throws IOException {
            HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekInfoEnv.meta != null) {
                        break;
                    }
                    hideAndSeekInfoEnv.meta = Meta.new_();
                    break;
                }
                if (iM162497u == 10) {
                    hideAndSeekInfoEnv.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (hideAndSeekInfoEnv.meta != null) {
                            break;
                        }
                        hideAndSeekInfoEnv.meta = Meta.new_();
                        return hideAndSeekInfoEnv;
                    }
                    hideAndSeekInfoEnv.data = (HideAndSeekInfoData) nc5Var.m162488l(HideAndSeekInfoData.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekInfoEnv;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekInfoEnv hideAndSeekInfoEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekInfoEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekInfoData hideAndSeekInfoData = hideAndSeekInfoEnv.data;
            if (hideAndSeekInfoData != null) {
                codedOutputByteBufferNano.m17309K(2, hideAndSeekInfoData, HideAndSeekInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekInfoEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekInfoEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoEnv.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekInfoEnv.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekInfoEnv newInstance() {
            return new HideAndSeekInfoEnv();
        }

        public boolean parseField(HideAndSeekInfoEnv hideAndSeekInfoEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekInfoEnv.data = HideAndSeekInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekInfoEnv.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekInfoEnv hideAndSeekInfoEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekInfoEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekInfoEnv hideAndSeekInfoEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekInfoEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekInfoEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekInfoEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekInfoData.JSON_ADAPTER.serialize(hideAndSeekInfoEnv.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekInfoEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekInfoEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekInfoEnv new_() {
        HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
        hideAndSeekInfoEnv.nullCheck();
        return hideAndSeekInfoEnv;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekInfoEnv mo225055clone() {
        HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekInfoEnv.meta = meta.mo225055clone();
        }
        HideAndSeekInfoData hideAndSeekInfoData = this.data;
        if (hideAndSeekInfoData != null) {
            hideAndSeekInfoEnv.data = hideAndSeekInfoData.mo225055clone();
        }
        return hideAndSeekInfoEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekInfoEnv)) {
            return false;
        }
        HideAndSeekInfoEnv hideAndSeekInfoEnv = (HideAndSeekInfoEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekInfoEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekInfoEnv.data);
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
        HideAndSeekInfoData hideAndSeekInfoData = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekInfoData != null ? hideAndSeekInfoData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
