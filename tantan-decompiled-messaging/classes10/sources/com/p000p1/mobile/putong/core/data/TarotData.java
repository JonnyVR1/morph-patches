package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class TarotData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tarotdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User card;

    @ProtobufIndex(index = 1)
    public int cardType;
    public static ProtobufAdapter<TarotData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TarotData>() { // from class: com.p1.mobile.putong.core.data.TarotData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TarotData tarotData) {
            int iH = CodedOutputByteBufferNano.h(1, tarotData.cardType);
            User user = tarotData.card;
            if (user != null) {
                iH += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            ((MessageNano) tarotData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TarotData m15946parse(nb5 nb5Var) throws IOException {
            TarotData tarotData = new TarotData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tarotData.card != null) {
                        break;
                    }
                    tarotData.card = User.new_();
                    break;
                }
                if (iU == 8) {
                    tarotData.cardType = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (tarotData.card != null) {
                            break;
                        }
                        tarotData.card = User.new_();
                        return tarotData;
                    }
                    tarotData.card = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                }
            }
            return tarotData;
        }

        public void serialize(TarotData tarotData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, tarotData.cardType);
            User user = tarotData.card;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TarotData> JSON_ADAPTER = new ObjectJsonAdapter<TarotData>() { // from class: com.p1.mobile.putong.core.data.TarotData.2
        public Class getDataClass() {
            return TarotData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TarotData m15947newInstance() {
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
            tarotData.card = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TarotData tarotData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cardType") || str.equals("card")) {
                return true;
            }
            return super.parseFieldCheck(tarotData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TarotData tarotData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("cardType", tarotData.cardType);
            if (tarotData.card != null) {
                jsonGenerator.writeFieldName("card");
                User.JSON_ADAPTER.serialize(tarotData.card, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TarotData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TarotData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TarotData new_() {
        TarotData tarotData = new TarotData();
        tarotData.nullCheck();
        return tarotData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TarotData m15945clone() {
        TarotData tarotData = new TarotData();
        tarotData.cardType = this.cardType;
        User user = this.card;
        if (user != null) {
            tarotData.card = user.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.cardType) * 41;
        User user = this.card;
        int iHashCode = i2 + (user != null ? user.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.card == null) {
            this.card = User.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
