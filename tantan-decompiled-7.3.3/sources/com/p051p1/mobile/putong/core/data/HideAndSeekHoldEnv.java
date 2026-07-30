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
public class HideAndSeekHoldEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekholdenv";

    @Nullable
    @ProtobufIndex(index = 2)
    public HideAndSeekGameRole data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekHoldEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekHoldEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekHoldEnv.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekHoldEnv hideAndSeekHoldEnv) {
            Meta meta = hideAndSeekHoldEnv.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekHoldEnv.data;
            if (hideAndSeekGameRole != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
            hideAndSeekHoldEnv.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekHoldEnv parse(nc5 nc5Var) throws IOException {
            HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekHoldEnv.meta != null) {
                        break;
                    }
                    hideAndSeekHoldEnv.meta = Meta.new_();
                    break;
                }
                if (iM162497u == 10) {
                    hideAndSeekHoldEnv.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (hideAndSeekHoldEnv.meta != null) {
                            break;
                        }
                        hideAndSeekHoldEnv.meta = Meta.new_();
                        return hideAndSeekHoldEnv;
                    }
                    hideAndSeekHoldEnv.data = (HideAndSeekGameRole) nc5Var.m162488l(HideAndSeekGameRole.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekHoldEnv;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekHoldEnv hideAndSeekHoldEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekHoldEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekHoldEnv.data;
            if (hideAndSeekGameRole != null) {
                codedOutputByteBufferNano.m17309K(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekHoldEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekHoldEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekHoldEnv.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekHoldEnv.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekHoldEnv newInstance() {
            return new HideAndSeekHoldEnv();
        }

        public boolean parseField(HideAndSeekHoldEnv hideAndSeekHoldEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekHoldEnv.data = HideAndSeekGameRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekHoldEnv.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekHoldEnv hideAndSeekHoldEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekHoldEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekHoldEnv hideAndSeekHoldEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekHoldEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekHoldEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekHoldEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekGameRole.JSON_ADAPTER.serialize(hideAndSeekHoldEnv.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekHoldEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekHoldEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekHoldEnv new_() {
        HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
        hideAndSeekHoldEnv.nullCheck();
        return hideAndSeekHoldEnv;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekHoldEnv mo225055clone() {
        HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekHoldEnv.meta = meta.mo225055clone();
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.data;
        if (hideAndSeekGameRole != null) {
            hideAndSeekHoldEnv.data = hideAndSeekGameRole.mo225055clone();
        }
        return hideAndSeekHoldEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekHoldEnv)) {
            return false;
        }
        HideAndSeekHoldEnv hideAndSeekHoldEnv = (HideAndSeekHoldEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekHoldEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekHoldEnv.data);
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
        HideAndSeekGameRole hideAndSeekGameRole = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekGameRole != null ? hideAndSeekGameRole.hashCode() : 0);
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
