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
public class HideAndSeekPushEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekpushenv";

    @Nullable
    @ProtobufIndex(index = 2)
    public HideAndSeekPushData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekPushEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekPushEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekPushEnv.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekPushEnv hideAndSeekPushEnv) {
            Meta meta = hideAndSeekPushEnv.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekPushData hideAndSeekPushData = hideAndSeekPushEnv.data;
            if (hideAndSeekPushData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hideAndSeekPushData, HideAndSeekPushData.PROTOBUF_ADAPTER);
            }
            hideAndSeekPushEnv.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekPushEnv parse(nc5 nc5Var) throws IOException {
            HideAndSeekPushEnv hideAndSeekPushEnv = new HideAndSeekPushEnv();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekPushEnv.meta != null) {
                        break;
                    }
                    hideAndSeekPushEnv.meta = Meta.new_();
                    break;
                }
                if (iM162497u == 10) {
                    hideAndSeekPushEnv.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (hideAndSeekPushEnv.meta != null) {
                            break;
                        }
                        hideAndSeekPushEnv.meta = Meta.new_();
                        return hideAndSeekPushEnv;
                    }
                    hideAndSeekPushEnv.data = (HideAndSeekPushData) nc5Var.m162488l(HideAndSeekPushData.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekPushEnv;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekPushEnv hideAndSeekPushEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekPushEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekPushData hideAndSeekPushData = hideAndSeekPushEnv.data;
            if (hideAndSeekPushData != null) {
                codedOutputByteBufferNano.m17309K(2, hideAndSeekPushData, HideAndSeekPushData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekPushEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekPushEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekPushEnv.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekPushEnv.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekPushEnv newInstance() {
            return new HideAndSeekPushEnv();
        }

        public boolean parseField(HideAndSeekPushEnv hideAndSeekPushEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekPushEnv.data = HideAndSeekPushData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekPushEnv.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekPushEnv hideAndSeekPushEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekPushEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekPushEnv hideAndSeekPushEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekPushEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekPushEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekPushEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekPushData.JSON_ADAPTER.serialize(hideAndSeekPushEnv.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekPushEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekPushEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekPushEnv new_() {
        HideAndSeekPushEnv hideAndSeekPushEnv = new HideAndSeekPushEnv();
        hideAndSeekPushEnv.nullCheck();
        return hideAndSeekPushEnv;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekPushEnv mo225055clone() {
        HideAndSeekPushEnv hideAndSeekPushEnv = new HideAndSeekPushEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekPushEnv.meta = meta.mo225055clone();
        }
        HideAndSeekPushData hideAndSeekPushData = this.data;
        if (hideAndSeekPushData != null) {
            hideAndSeekPushEnv.data = hideAndSeekPushData.mo225055clone();
        }
        return hideAndSeekPushEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekPushEnv)) {
            return false;
        }
        HideAndSeekPushEnv hideAndSeekPushEnv = (HideAndSeekPushEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekPushEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekPushEnv.data);
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
        HideAndSeekPushData hideAndSeekPushData = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekPushData != null ? hideAndSeekPushData.hashCode() : 0);
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
