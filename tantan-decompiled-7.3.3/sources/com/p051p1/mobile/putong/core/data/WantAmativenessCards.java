package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class WantAmativenessCards extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wantamativenesscards";

    @ProtobufIndex(index = 3)
    public boolean isWantAmativenessAdCard;

    @ProtobufIndex(index = 2)
    public boolean isWantAmativenessUser;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<WantAmativenessCards> PROTOBUF_ADAPTER = new MessageNanoAdapter<WantAmativenessCards>() { // from class: com.p1.mobile.putong.core.data.WantAmativenessCards.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WantAmativenessCards wantAmativenessCards) {
            String str = wantAmativenessCards.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, wantAmativenessCards.isWantAmativenessUser) + CodedOutputByteBufferNano.m17275b(3, wantAmativenessCards.isWantAmativenessAdCard);
            wantAmativenessCards.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WantAmativenessCards parse(nc5 nc5Var) throws IOException {
            WantAmativenessCards wantAmativenessCards = new WantAmativenessCards();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (wantAmativenessCards.userId != null) {
                        break;
                    }
                    wantAmativenessCards.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    wantAmativenessCards.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    wantAmativenessCards.isWantAmativenessUser = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        if (wantAmativenessCards.userId != null) {
                            break;
                        }
                        wantAmativenessCards.userId = "";
                        return wantAmativenessCards;
                    }
                    wantAmativenessCards.isWantAmativenessAdCard = nc5Var.m162483g();
                }
            }
            return wantAmativenessCards;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WantAmativenessCards wantAmativenessCards, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = wantAmativenessCards.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, wantAmativenessCards.isWantAmativenessUser);
            codedOutputByteBufferNano.m17299A(3, wantAmativenessCards.isWantAmativenessAdCard);
        }
    };
    public static JsonAdapter<WantAmativenessCards> JSON_ADAPTER = new ObjectJsonAdapter<WantAmativenessCards>() { // from class: com.p1.mobile.putong.core.data.WantAmativenessCards.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WantAmativenessCards.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WantAmativenessCards newInstance() {
            return new WantAmativenessCards();
        }

        public boolean parseField(WantAmativenessCards wantAmativenessCards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isWantAmativenessAdCard":
                    wantAmativenessCards.isWantAmativenessAdCard = jsonParser.getValueAsBoolean();
                    return true;
                case "isWantAmativenessUser":
                    wantAmativenessCards.isWantAmativenessUser = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    wantAmativenessCards.userId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WantAmativenessCards wantAmativenessCards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isWantAmativenessAdCard":
                case "isWantAmativenessUser":
                case "userId":
                    return true;
                default:
                    return super.parseFieldCheck(wantAmativenessCards, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WantAmativenessCards wantAmativenessCards, JsonGenerator jsonGenerator) throws IOException {
            String str = wantAmativenessCards.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("isWantAmativenessUser", wantAmativenessCards.isWantAmativenessUser);
            jsonGenerator.writeBooleanField("isWantAmativenessAdCard", wantAmativenessCards.isWantAmativenessAdCard);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WantAmativenessCards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WantAmativenessCards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WantAmativenessCards new_() {
        WantAmativenessCards wantAmativenessCards = new WantAmativenessCards();
        wantAmativenessCards.nullCheck();
        return wantAmativenessCards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WantAmativenessCards mo225055clone() {
        WantAmativenessCards wantAmativenessCards = new WantAmativenessCards();
        wantAmativenessCards.userId = this.userId;
        wantAmativenessCards.isWantAmativenessUser = this.isWantAmativenessUser;
        wantAmativenessCards.isWantAmativenessAdCard = this.isWantAmativenessAdCard;
        return wantAmativenessCards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WantAmativenessCards)) {
            return false;
        }
        WantAmativenessCards wantAmativenessCards = (WantAmativenessCards) obj;
        return ValueObject.util_equals(this.userId, wantAmativenessCards.userId) && this.isWantAmativenessUser == wantAmativenessCards.isWantAmativenessUser && this.isWantAmativenessAdCard == wantAmativenessCards.isWantAmativenessAdCard;
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
        String str = this.userId;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isWantAmativenessUser ? 1231 : 1237)) * 41) + (this.isWantAmativenessAdCard ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
