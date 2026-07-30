package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class NewCoinsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcoinsdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Coin coins;
    public static ProtobufAdapter<NewCoinsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCoinsData>() { // from class: com.p1.mobile.putong.core.data.NewCoinsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewCoinsData newCoinsData) {
            Coin coin = newCoinsData.coins;
            int iM17230l = coin != null ? CodedOutputByteBufferNano.m17230l(1, coin, Coin.PROTOBUF_ADAPTER) : 0;
            newCoinsData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewCoinsData parse(nb5 nb5Var) throws IOException {
            NewCoinsData newCoinsData = new NewCoinsData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newCoinsData.coins != null) {
                        break;
                    }
                    newCoinsData.coins = Coin.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (newCoinsData.coins != null) {
                        break;
                    }
                    newCoinsData.coins = Coin.new_();
                    return newCoinsData;
                }
                newCoinsData.coins = (Coin) nb5Var.m158743l(Coin.PROTOBUF_ADAPTER);
            }
            return newCoinsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewCoinsData newCoinsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Coin coin = newCoinsData.coins;
            if (coin != null) {
                codedOutputByteBufferNano.m17254K(1, coin, Coin.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewCoinsData> JSON_ADAPTER = new ObjectJsonAdapter<NewCoinsData>() { // from class: com.p1.mobile.putong.core.data.NewCoinsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewCoinsData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewCoinsData newInstance() {
            return new NewCoinsData();
        }

        public boolean parseField(NewCoinsData newCoinsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("coins")) {
                return false;
            }
            newCoinsData.coins = Coin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewCoinsData newCoinsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("coins")) {
                return true;
            }
            return super.parseFieldCheck(newCoinsData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewCoinsData newCoinsData, JsonGenerator jsonGenerator) throws IOException {
            if (newCoinsData.coins != null) {
                jsonGenerator.writeFieldName("coins");
                Coin.JSON_ADAPTER.serialize(newCoinsData.coins, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCoinsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCoinsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewCoinsData new_() {
        NewCoinsData newCoinsData = new NewCoinsData();
        newCoinsData.nullCheck();
        return newCoinsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewCoinsData mo223809clone() {
        NewCoinsData newCoinsData = new NewCoinsData();
        Coin coin = this.coins;
        if (coin != null) {
            newCoinsData.coins = coin.mo223809clone();
        }
        return newCoinsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NewCoinsData) {
            return ValueObject.util_equals(this.coins, ((NewCoinsData) obj).coins);
        }
        return false;
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
        Coin coin = this.coins;
        int iHashCode = i2 + (coin != null ? coin.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.coins == null) {
            this.coins = Coin.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
