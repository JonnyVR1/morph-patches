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
public class CoreGrowthSpamEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coregrowthspamenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public GrowthSpamInfo data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<CoreGrowthSpamEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGrowthSpamEnvelope>() { // from class: com.p1.mobile.putong.core.data.CoreGrowthSpamEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreGrowthSpamEnvelope coreGrowthSpamEnvelope) {
            Meta meta = coreGrowthSpamEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GrowthSpamInfo growthSpamInfo = coreGrowthSpamEnvelope.data;
            if (growthSpamInfo != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, growthSpamInfo, GrowthSpamInfo.PROTOBUF_ADAPTER);
            }
            coreGrowthSpamEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreGrowthSpamEnvelope parse(nc5 nc5Var) throws IOException {
            CoreGrowthSpamEnvelope coreGrowthSpamEnvelope = new CoreGrowthSpamEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (coreGrowthSpamEnvelope.meta == null) {
                        coreGrowthSpamEnvelope.meta = Meta.new_();
                    }
                    if (coreGrowthSpamEnvelope.data != null) {
                        break;
                    }
                    coreGrowthSpamEnvelope.data = GrowthSpamInfo.new_();
                    break;
                }
                if (iM162497u == 10) {
                    coreGrowthSpamEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (coreGrowthSpamEnvelope.meta == null) {
                            coreGrowthSpamEnvelope.meta = Meta.new_();
                        }
                        if (coreGrowthSpamEnvelope.data != null) {
                            break;
                        }
                        coreGrowthSpamEnvelope.data = GrowthSpamInfo.new_();
                        return coreGrowthSpamEnvelope;
                    }
                    coreGrowthSpamEnvelope.data = (GrowthSpamInfo) nc5Var.m162488l(GrowthSpamInfo.PROTOBUF_ADAPTER);
                }
            }
            return coreGrowthSpamEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreGrowthSpamEnvelope coreGrowthSpamEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = coreGrowthSpamEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GrowthSpamInfo growthSpamInfo = coreGrowthSpamEnvelope.data;
            if (growthSpamInfo != null) {
                codedOutputByteBufferNano.m17309K(2, growthSpamInfo, GrowthSpamInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CoreGrowthSpamEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<CoreGrowthSpamEnvelope>() { // from class: com.p1.mobile.putong.core.data.CoreGrowthSpamEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreGrowthSpamEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreGrowthSpamEnvelope newInstance() {
            return new CoreGrowthSpamEnvelope();
        }

        public boolean parseField(CoreGrowthSpamEnvelope coreGrowthSpamEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                coreGrowthSpamEnvelope.data = GrowthSpamInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            coreGrowthSpamEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CoreGrowthSpamEnvelope coreGrowthSpamEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(coreGrowthSpamEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreGrowthSpamEnvelope coreGrowthSpamEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (coreGrowthSpamEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(coreGrowthSpamEnvelope.meta, jsonGenerator, true);
            }
            if (coreGrowthSpamEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GrowthSpamInfo.JSON_ADAPTER.serialize(coreGrowthSpamEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGrowthSpamEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGrowthSpamEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreGrowthSpamEnvelope new_() {
        CoreGrowthSpamEnvelope coreGrowthSpamEnvelope = new CoreGrowthSpamEnvelope();
        coreGrowthSpamEnvelope.nullCheck();
        return coreGrowthSpamEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreGrowthSpamEnvelope mo225055clone() {
        CoreGrowthSpamEnvelope coreGrowthSpamEnvelope = new CoreGrowthSpamEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            coreGrowthSpamEnvelope.meta = meta.mo225055clone();
        }
        GrowthSpamInfo growthSpamInfo = this.data;
        if (growthSpamInfo != null) {
            coreGrowthSpamEnvelope.data = growthSpamInfo.mo225055clone();
        }
        return coreGrowthSpamEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreGrowthSpamEnvelope)) {
            return false;
        }
        CoreGrowthSpamEnvelope coreGrowthSpamEnvelope = (CoreGrowthSpamEnvelope) obj;
        return ValueObject.util_equals(this.meta, coreGrowthSpamEnvelope.meta) && ValueObject.util_equals(this.data, coreGrowthSpamEnvelope.data);
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
        GrowthSpamInfo growthSpamInfo = this.data;
        int iHashCode2 = iHashCode + (growthSpamInfo != null ? growthSpamInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GrowthSpamInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
