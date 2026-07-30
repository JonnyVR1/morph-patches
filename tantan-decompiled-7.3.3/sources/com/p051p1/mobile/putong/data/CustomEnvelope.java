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
public class CustomEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "customenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public Counter counters;

    @NonNull
    @ProtobufIndex(index = 3)
    public CustomData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 4)
    public Pagination pagination;
    public static ProtobufAdapter<CustomEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<CustomEnvelope>() { // from class: com.p1.mobile.putong.data.CustomEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CustomEnvelope customEnvelope) {
            Meta meta = customEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            Counter counter = customEnvelope.counters;
            if (counter != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            CustomData customData = customEnvelope.data;
            if (customData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, customData, CustomData.PROTOBUF_ADAPTER);
            }
            Pagination pagination = customEnvelope.pagination;
            if (pagination != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, pagination, Pagination.PROTOBUF_ADAPTER);
            }
            customEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CustomEnvelope parse(nc5 nc5Var) throws IOException {
            CustomEnvelope customEnvelope = new CustomEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (customEnvelope.meta == null) {
                        customEnvelope.meta = Meta.new_();
                    }
                    if (customEnvelope.counters == null) {
                        customEnvelope.counters = Counter.new_();
                    }
                    if (customEnvelope.data == null) {
                        customEnvelope.data = CustomData.new_();
                    }
                    if (customEnvelope.pagination != null) {
                        break;
                    }
                    customEnvelope.pagination = Pagination.new_();
                    break;
                }
                if (iM162497u == 10) {
                    customEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    customEnvelope.counters = (Counter) nc5Var.m162488l(Counter.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    customEnvelope.data = (CustomData) nc5Var.m162488l(CustomData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (customEnvelope.meta == null) {
                            customEnvelope.meta = Meta.new_();
                        }
                        if (customEnvelope.counters == null) {
                            customEnvelope.counters = Counter.new_();
                        }
                        if (customEnvelope.data == null) {
                            customEnvelope.data = CustomData.new_();
                        }
                        if (customEnvelope.pagination != null) {
                            break;
                        }
                        customEnvelope.pagination = Pagination.new_();
                        return customEnvelope;
                    }
                    customEnvelope.pagination = (Pagination) nc5Var.m162488l(Pagination.PROTOBUF_ADAPTER);
                }
            }
            return customEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CustomEnvelope customEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = customEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            Counter counter = customEnvelope.counters;
            if (counter != null) {
                codedOutputByteBufferNano.m17309K(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            CustomData customData = customEnvelope.data;
            if (customData != null) {
                codedOutputByteBufferNano.m17309K(3, customData, CustomData.PROTOBUF_ADAPTER);
            }
            Pagination pagination = customEnvelope.pagination;
            if (pagination != null) {
                codedOutputByteBufferNano.m17309K(4, pagination, Pagination.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CustomEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<CustomEnvelope>() { // from class: com.p1.mobile.putong.data.CustomEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CustomEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CustomEnvelope newInstance() {
            return new CustomEnvelope();
        }

        public boolean parseField(CustomEnvelope customEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    customEnvelope.counters = Counter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    customEnvelope.data = CustomData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    customEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    customEnvelope.pagination = Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CustomEnvelope customEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "counters":
                case "data":
                case "meta":
                case "pagination":
                    return true;
                default:
                    return super.parseFieldCheck(customEnvelope, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CustomEnvelope customEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (customEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(customEnvelope.meta, jsonGenerator, true);
            }
            if (customEnvelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                Counter.JSON_ADAPTER.serialize(customEnvelope.counters, jsonGenerator, true);
            }
            if (customEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                CustomData.JSON_ADAPTER.serialize(customEnvelope.data, jsonGenerator, true);
            }
            if (customEnvelope.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(customEnvelope.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CustomEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CustomEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CustomEnvelope new_() {
        CustomEnvelope customEnvelope = new CustomEnvelope();
        customEnvelope.nullCheck();
        return customEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CustomEnvelope mo225055clone() {
        CustomEnvelope customEnvelope = new CustomEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            customEnvelope.meta = meta.mo225055clone();
        }
        Counter counter = this.counters;
        if (counter != null) {
            customEnvelope.counters = counter.mo225055clone();
        }
        CustomData customData = this.data;
        if (customData != null) {
            customEnvelope.data = customData.mo225055clone();
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            customEnvelope.pagination = pagination.mo225055clone();
        }
        return customEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomEnvelope)) {
            return false;
        }
        CustomEnvelope customEnvelope = (CustomEnvelope) obj;
        return ValueObject.util_equals(this.meta, customEnvelope.meta) && ValueObject.util_equals(this.counters, customEnvelope.counters) && ValueObject.util_equals(this.data, customEnvelope.data) && ValueObject.util_equals(this.pagination, customEnvelope.pagination);
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
        Counter counter = this.counters;
        int iHashCode2 = (iHashCode + (counter != null ? counter.hashCode() : 0)) * 41;
        CustomData customData = this.data;
        int iHashCode3 = (iHashCode2 + (customData != null ? customData.hashCode() : 0)) * 41;
        Pagination pagination = this.pagination;
        int iHashCode4 = iHashCode3 + (pagination != null ? pagination.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.counters == null) {
            this.counters = Counter.new_();
        }
        if (this.data == null) {
            this.data = CustomData.new_();
        }
        if (this.pagination == null) {
            this.pagination = Pagination.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
