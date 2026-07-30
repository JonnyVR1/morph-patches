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
public class Coin extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coin";

    @ProtobufIndex(index = 1)
    public long available;

    @ProtobufIndex(index = 2)
    public long merchantAvailable;
    public static ProtobufAdapter<Coin> PROTOBUF_ADAPTER = new MessageNanoAdapter<Coin>() { // from class: com.p1.mobile.putong.core.data.Coin.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Coin coin) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, coin.available) + CodedOutputByteBufferNano.m17283j(2, coin.merchantAvailable);
            coin.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Coin parse(nc5 nc5Var) throws IOException {
            Coin coin = new Coin();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    coin.available = nc5Var.m162487k();
                } else {
                    if (iM162497u != 16) {
                        return coin;
                    }
                    coin.merchantAvailable = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Coin coin, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, coin.available);
            codedOutputByteBufferNano.m17307I(2, coin.merchantAvailable);
        }
    };
    public static JsonAdapter<Coin> JSON_ADAPTER = new ObjectJsonAdapter<Coin>() { // from class: com.p1.mobile.putong.core.data.Coin.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Coin.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Coin newInstance() {
            return new Coin();
        }

        public boolean parseField(Coin coin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("available")) {
                coin.available = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("merchantAvailable")) {
                return false;
            }
            coin.merchantAvailable = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(Coin coin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("available") || str.equals("merchantAvailable")) {
                return true;
            }
            return super.parseFieldCheck(coin, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Coin coin, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", coin.available);
            jsonGenerator.writeNumberField("merchantAvailable", coin.merchantAvailable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Coin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Coin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Coin new_() {
        Coin coin = new Coin();
        coin.nullCheck();
        return coin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Coin mo225055clone() {
        Coin coin = new Coin();
        coin.available = this.available;
        coin.merchantAvailable = this.merchantAvailable;
        return coin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Coin)) {
            return false;
        }
        Coin coin = (Coin) obj;
        return this.available == coin.available && this.merchantAvailable == coin.merchantAvailable;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "coin";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.available;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.merchantAvailable;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
