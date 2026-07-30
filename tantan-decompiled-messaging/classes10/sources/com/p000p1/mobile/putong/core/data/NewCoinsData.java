package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class NewCoinsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcoinsdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Coin coins;
    public static ProtobufAdapter<NewCoinsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCoinsData>() { // from class: com.p1.mobile.putong.core.data.NewCoinsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewCoinsData newCoinsData) {
            Coin coin = newCoinsData.coins;
            int iL = coin != null ? CodedOutputByteBufferNano.l(1, coin, Coin.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) newCoinsData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewCoinsData m14487parse(nb5 nb5Var) throws IOException {
            NewCoinsData newCoinsData = new NewCoinsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newCoinsData.coins != null) {
                        break;
                    }
                    newCoinsData.coins = Coin.new_();
                    break;
                }
                if (iU != 10) {
                    if (newCoinsData.coins != null) {
                        break;
                    }
                    newCoinsData.coins = Coin.new_();
                    return newCoinsData;
                }
                newCoinsData.coins = (Coin) nb5Var.l(Coin.PROTOBUF_ADAPTER);
            }
            return newCoinsData;
        }

        public void serialize(NewCoinsData newCoinsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Coin coin = newCoinsData.coins;
            if (coin != null) {
                codedOutputByteBufferNano.K(1, coin, Coin.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NewCoinsData> JSON_ADAPTER = new ObjectJsonAdapter<NewCoinsData>() { // from class: com.p1.mobile.putong.core.data.NewCoinsData.2
        public Class getDataClass() {
            return NewCoinsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewCoinsData m14488newInstance() {
            return new NewCoinsData();
        }

        public boolean parseField(NewCoinsData newCoinsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("coins")) {
                return false;
            }
            newCoinsData.coins = (Coin) Coin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NewCoinsData newCoinsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("coins")) {
                return true;
            }
            return super.parseFieldCheck(newCoinsData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NewCoinsData newCoinsData, JsonGenerator jsonGenerator) throws IOException {
            if (newCoinsData.coins != null) {
                jsonGenerator.writeFieldName("coins");
                Coin.JSON_ADAPTER.serialize(newCoinsData.coins, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCoinsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCoinsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewCoinsData new_() {
        NewCoinsData newCoinsData = new NewCoinsData();
        newCoinsData.nullCheck();
        return newCoinsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewCoinsData m14486clone() {
        NewCoinsData newCoinsData = new NewCoinsData();
        Coin coin = this.coins;
        if (coin != null) {
            newCoinsData.coins = coin.m12196clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Coin coin = this.coins;
        int iHashCode = i2 + (coin != null ? coin.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.coins == null) {
            this.coins = Coin.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
