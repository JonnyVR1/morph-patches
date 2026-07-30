package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AssetsTbh extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "assetstbh";

    @ProtobufIndex(index = 2)
    public int afterSwipes;

    @ProtobufIndex(index = 1)
    public long frequency;

    @ProtobufIndex(index = 3)
    public int maxIgnoreTimes;
    public static ProtobufAdapter<AssetsTbh> PROTOBUF_ADAPTER = new MessageNanoAdapter<AssetsTbh>() { // from class: com.p1.mobile.putong.core.data.AssetsTbh.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AssetsTbh assetsTbh) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, assetsTbh.frequency) + CodedOutputByteBufferNano.m17281h(2, assetsTbh.afterSwipes) + CodedOutputByteBufferNano.m17281h(3, assetsTbh.maxIgnoreTimes);
            assetsTbh.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AssetsTbh parse(nc5 nc5Var) throws IOException {
            AssetsTbh assetsTbh = new AssetsTbh();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    assetsTbh.frequency = nc5Var.m162487k();
                } else if (iM162497u == 16) {
                    assetsTbh.afterSwipes = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return assetsTbh;
                    }
                    assetsTbh.maxIgnoreTimes = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AssetsTbh assetsTbh, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, assetsTbh.frequency);
            codedOutputByteBufferNano.m17305G(2, assetsTbh.afterSwipes);
            codedOutputByteBufferNano.m17305G(3, assetsTbh.maxIgnoreTimes);
        }
    };
    public static JsonAdapter<AssetsTbh> JSON_ADAPTER = new ObjectJsonAdapter<AssetsTbh>() { // from class: com.p1.mobile.putong.core.data.AssetsTbh.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AssetsTbh.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AssetsTbh newInstance() {
            return new AssetsTbh();
        }

        public boolean parseField(AssetsTbh assetsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maxIgnoreTimes":
                    assetsTbh.maxIgnoreTimes = jsonParser.getValueAsInt();
                    return true;
                case "frequency":
                    assetsTbh.frequency = jsonParser.getValueAsLong();
                    return true;
                case "afterSwipes":
                    assetsTbh.afterSwipes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AssetsTbh assetsTbh, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maxIgnoreTimes":
                case "frequency":
                case "afterSwipes":
                    return true;
                default:
                    return super.parseFieldCheck(assetsTbh, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AssetsTbh assetsTbh, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("frequency", assetsTbh.frequency);
            jsonGenerator.writeNumberField("afterSwipes", assetsTbh.afterSwipes);
            jsonGenerator.writeNumberField("maxIgnoreTimes", assetsTbh.maxIgnoreTimes);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AssetsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AssetsTbh) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AssetsTbh new_() {
        AssetsTbh assetsTbh = new AssetsTbh();
        assetsTbh.nullCheck();
        return assetsTbh;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AssetsTbh mo225055clone() {
        AssetsTbh assetsTbh = new AssetsTbh();
        assetsTbh.frequency = this.frequency;
        assetsTbh.afterSwipes = this.afterSwipes;
        assetsTbh.maxIgnoreTimes = this.maxIgnoreTimes;
        return assetsTbh;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetsTbh)) {
            return false;
        }
        AssetsTbh assetsTbh = (AssetsTbh) obj;
        return this.frequency == assetsTbh.frequency && this.afterSwipes == assetsTbh.afterSwipes && this.maxIgnoreTimes == assetsTbh.maxIgnoreTimes;
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
        long j = this.frequency;
        int i2 = (((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.afterSwipes) * 41) + this.maxIgnoreTimes;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
