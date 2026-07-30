package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
public class TarotData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public User card;

    @ProtobufIndex(index = 1)
    public int cardType;
    public static ProtobufAdapter<TarotData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotData>() { // from class: com.p1.mobile.putong.core.data.TarotData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TarotData tarotData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, tarotData.cardType);
            User user = tarotData.card;
            if (user != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, user, User.PROTOBUF_ADAPTER);
            }
            tarotData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TarotData parse(nc5 nc5Var) throws IOException {
            TarotData tarotData = new TarotData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tarotData.card != null) {
                        break;
                    }
                    tarotData.card = User.new_();
                    break;
                }
                if (iM162497u == 8) {
                    tarotData.cardType = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (tarotData.card != null) {
                            break;
                        }
                        tarotData.card = User.new_();
                        return tarotData;
                    }
                    tarotData.card = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                }
            }
            return tarotData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TarotData tarotData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, tarotData.cardType);
            User user = tarotData.card;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(2, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TarotData> JSON_ADAPTER = new ObjectJsonAdapter<TarotData>() { // from class: com.p1.mobile.putong.core.data.TarotData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TarotData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TarotData newInstance() {
            return new TarotData();
        }

        public boolean parseField(TarotData tarotData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("cardType")) {
                tarotData.cardType = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("card")) {
                return false;
            }
            tarotData.card = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TarotData tarotData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cardType") || str.equals("card")) {
                return true;
            }
            return super.parseFieldCheck(tarotData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TarotData tarotData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("cardType", tarotData.cardType);
            if (tarotData.card != null) {
                jsonGenerator.writeFieldName("card");
                User.JSON_ADAPTER.serialize(tarotData.card, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotData new_() {
        TarotData tarotData = new TarotData();
        tarotData.nullCheck();
        return tarotData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TarotData mo225055clone() {
        TarotData tarotData = new TarotData();
        tarotData.cardType = this.cardType;
        User user = this.card;
        if (user != null) {
            tarotData.card = user.mo225055clone();
        }
        return tarotData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TarotData)) {
            return false;
        }
        TarotData tarotData = (TarotData) obj;
        return this.cardType == tarotData.cardType && ValueObject.util_equals(this.card, tarotData.card);
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
        int i2 = ((i * 41) + this.cardType) * 41;
        User user = this.card;
        int iHashCode = i2 + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.card == null) {
            this.card = User.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
