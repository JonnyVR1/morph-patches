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
public class WantAmativenessCards extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wantamativenesscards";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean isWantAmativenessAdCard;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isWantAmativenessUser;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<WantAmativenessCards> PROTOBUF_ADAPTER = new MessageNanoAdapter<WantAmativenessCards>() { // from class: com.p1.mobile.putong.core.data.WantAmativenessCards.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WantAmativenessCards wantAmativenessCards) {
            String str = wantAmativenessCards.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, wantAmativenessCards.isWantAmativenessUser) + CodedOutputByteBufferNano.b(3, wantAmativenessCards.isWantAmativenessAdCard);
            ((MessageNano) wantAmativenessCards).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WantAmativenessCards m16301parse(nb5 nb5Var) throws IOException {
            WantAmativenessCards wantAmativenessCards = new WantAmativenessCards();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (wantAmativenessCards.userId != null) {
                        break;
                    }
                    wantAmativenessCards.userId = "";
                    break;
                }
                if (iU == 10) {
                    wantAmativenessCards.userId = nb5Var.s();
                } else if (iU == 16) {
                    wantAmativenessCards.isWantAmativenessUser = nb5Var.g();
                } else {
                    if (iU != 24) {
                        if (wantAmativenessCards.userId != null) {
                            break;
                        }
                        wantAmativenessCards.userId = "";
                        return wantAmativenessCards;
                    }
                    wantAmativenessCards.isWantAmativenessAdCard = nb5Var.g();
                }
            }
            return wantAmativenessCards;
        }

        public void serialize(WantAmativenessCards wantAmativenessCards, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = wantAmativenessCards.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, wantAmativenessCards.isWantAmativenessUser);
            codedOutputByteBufferNano.A(3, wantAmativenessCards.isWantAmativenessAdCard);
        }
    };
    public static JsonAdapter<WantAmativenessCards> JSON_ADAPTER = new ObjectJsonAdapter<WantAmativenessCards>() { // from class: com.p1.mobile.putong.core.data.WantAmativenessCards.2
        public Class getDataClass() {
            return WantAmativenessCards.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WantAmativenessCards m16302newInstance() {
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

        public void serializeFields(WantAmativenessCards wantAmativenessCards, JsonGenerator jsonGenerator) throws IOException {
            String str = wantAmativenessCards.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("isWantAmativenessUser", wantAmativenessCards.isWantAmativenessUser);
            jsonGenerator.writeBooleanField("isWantAmativenessAdCard", wantAmativenessCards.isWantAmativenessAdCard);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WantAmativenessCards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WantAmativenessCards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WantAmativenessCards new_() {
        WantAmativenessCards wantAmativenessCards = new WantAmativenessCards();
        wantAmativenessCards.nullCheck();
        return wantAmativenessCards;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WantAmativenessCards m16300clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isWantAmativenessUser ? 1231 : 1237)) * 41) + (this.isWantAmativenessAdCard ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
