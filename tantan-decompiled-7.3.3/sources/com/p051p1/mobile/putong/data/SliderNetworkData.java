package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SliderNetworkData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "slidernetworkdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public SliderData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SliderNetworkData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SliderNetworkData>() { // from class: com.p1.mobile.putong.data.SliderNetworkData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SliderNetworkData sliderNetworkData) {
            Meta meta = sliderNetworkData.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SliderData sliderData = sliderNetworkData.data;
            if (sliderData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, sliderData, SliderData.PROTOBUF_ADAPTER);
            }
            sliderNetworkData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SliderNetworkData parse(nc5 nc5Var) throws IOException {
            SliderNetworkData sliderNetworkData = new SliderNetworkData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (sliderNetworkData.meta == null) {
                        sliderNetworkData.meta = Meta.new_();
                    }
                    if (sliderNetworkData.data != null) {
                        break;
                    }
                    sliderNetworkData.data = SliderData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    sliderNetworkData.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (sliderNetworkData.meta == null) {
                            sliderNetworkData.meta = Meta.new_();
                        }
                        if (sliderNetworkData.data != null) {
                            break;
                        }
                        sliderNetworkData.data = SliderData.new_();
                        return sliderNetworkData;
                    }
                    sliderNetworkData.data = (SliderData) nc5Var.m162488l(SliderData.PROTOBUF_ADAPTER);
                }
            }
            return sliderNetworkData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SliderNetworkData sliderNetworkData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = sliderNetworkData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SliderData sliderData = sliderNetworkData.data;
            if (sliderData != null) {
                codedOutputByteBufferNano.m17309K(2, sliderData, SliderData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SliderNetworkData> JSON_ADAPTER = new ObjectJsonAdapter<SliderNetworkData>() { // from class: com.p1.mobile.putong.data.SliderNetworkData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SliderNetworkData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SliderNetworkData newInstance() {
            return new SliderNetworkData();
        }

        public boolean parseField(SliderNetworkData sliderNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                sliderNetworkData.data = SliderData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            sliderNetworkData.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SliderNetworkData sliderNetworkData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(sliderNetworkData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SliderNetworkData sliderNetworkData, JsonGenerator jsonGenerator) throws IOException {
            if (sliderNetworkData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(sliderNetworkData.meta, jsonGenerator, true);
            }
            if (sliderNetworkData.data != null) {
                jsonGenerator.writeFieldName("data");
                SliderData.JSON_ADAPTER.serialize(sliderNetworkData.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SliderNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SliderNetworkData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SliderNetworkData new_() {
        SliderNetworkData sliderNetworkData = new SliderNetworkData();
        sliderNetworkData.nullCheck();
        return sliderNetworkData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SliderNetworkData mo225055clone() {
        SliderNetworkData sliderNetworkData = new SliderNetworkData();
        Meta meta = this.meta;
        if (meta != null) {
            sliderNetworkData.meta = meta.mo225055clone();
        }
        SliderData sliderData = this.data;
        if (sliderData != null) {
            sliderNetworkData.data = sliderData.mo225055clone();
        }
        return sliderNetworkData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SliderNetworkData)) {
            return false;
        }
        SliderNetworkData sliderNetworkData = (SliderNetworkData) obj;
        return ValueObject.util_equals(this.meta, sliderNetworkData.meta) && ValueObject.util_equals(this.data, sliderNetworkData.data);
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
        SliderData sliderData = this.data;
        int iHashCode2 = iHashCode + (sliderData != null ? sliderData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SliderData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
