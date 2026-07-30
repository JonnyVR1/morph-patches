package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class Coin extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coin";

    @ProtobufIndex(index = 1)
    public long available;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long merchantAvailable;
    public static ProtobufAdapter<Coin> PROTOBUF_ADAPTER = new MessageNanoAdapter<Coin>() { // from class: com.p1.mobile.putong.core.data.Coin.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Coin coin) {
            int iJ = CodedOutputByteBufferNano.j(1, coin.available) + CodedOutputByteBufferNano.j(2, coin.merchantAvailable);
            ((MessageNano) coin).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Coin m12197parse(nb5 nb5Var) throws IOException {
            Coin coin = new Coin();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    coin.available = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return coin;
                    }
                    coin.merchantAvailable = nb5Var.k();
                }
            }
        }

        public void serialize(Coin coin, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, coin.available);
            codedOutputByteBufferNano.I(2, coin.merchantAvailable);
        }
    };
    public static JsonAdapter<Coin> JSON_ADAPTER = new ObjectJsonAdapter<Coin>() { // from class: com.p1.mobile.putong.core.data.Coin.2
        public Class getDataClass() {
            return Coin.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Coin m12198newInstance() {
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

        public void serializeFields(Coin coin, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("available", coin.available);
            jsonGenerator.writeNumberField("merchantAvailable", coin.merchantAvailable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Coin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Coin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Coin new_() {
        Coin coin = new Coin();
        coin.nullCheck();
        return coin;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Coin m12196clone() {
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

    public String getClassParseName() {
        return "coin";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.available;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.merchantAvailable;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
