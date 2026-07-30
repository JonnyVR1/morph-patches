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
public class InsertCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertcard";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int cardType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f85id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int position;

    @ProtobufIndex(index = 4)
    public int showType;
    public static ProtobufAdapter<InsertCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertCard>() { // from class: com.p1.mobile.putong.core.data.InsertCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InsertCard insertCard) {
            String str = insertCard.f85id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, insertCard.position) + CodedOutputByteBufferNano.h(3, insertCard.cardType) + CodedOutputByteBufferNano.h(4, insertCard.showType);
            ((MessageNano) insertCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InsertCard m13461parse(nb5 nb5Var) throws IOException {
            InsertCard insertCard = new InsertCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (insertCard.f85id != null) {
                        break;
                    }
                    insertCard.f85id = "";
                    break;
                }
                if (iU == 10) {
                    insertCard.f85id = nb5Var.s();
                } else if (iU == 16) {
                    insertCard.position = nb5Var.j();
                } else if (iU == 24) {
                    insertCard.cardType = nb5Var.j();
                } else {
                    if (iU != 32) {
                        if (insertCard.f85id != null) {
                            break;
                        }
                        insertCard.f85id = "";
                        return insertCard;
                    }
                    insertCard.showType = nb5Var.j();
                }
            }
            return insertCard;
        }

        public void serialize(InsertCard insertCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertCard.f85id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, insertCard.position);
            codedOutputByteBufferNano.G(3, insertCard.cardType);
            codedOutputByteBufferNano.G(4, insertCard.showType);
        }
    };
    public static JsonAdapter<InsertCard> JSON_ADAPTER = new ObjectJsonAdapter<InsertCard>() { // from class: com.p1.mobile.putong.core.data.InsertCard.2
        public Class getDataClass() {
            return InsertCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InsertCard m13462newInstance() {
            return new InsertCard();
        }

        public boolean parseField(InsertCard insertCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showType":
                    insertCard.showType = jsonParser.getValueAsInt();
                    return true;
                case "cardType":
                    insertCard.cardType = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    insertCard.f85id = jsonParser.getValueAsString();
                    return false;
                case "position":
                    insertCard.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InsertCard insertCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showType":
                case "cardType":
                    return true;
                case "id":
                    return false;
                case "position":
                    return true;
                default:
                    return super.parseFieldCheck(insertCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(InsertCard insertCard, JsonGenerator jsonGenerator) throws IOException {
            String str = insertCard.f85id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("position", insertCard.position);
            jsonGenerator.writeNumberField("cardType", insertCard.cardType);
            jsonGenerator.writeNumberField("showType", insertCard.showType);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertCard new_() {
        InsertCard insertCard = new InsertCard();
        insertCard.nullCheck();
        return insertCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InsertCard m13460clone() {
        InsertCard insertCard = new InsertCard();
        insertCard.f85id = this.f85id;
        insertCard.position = this.position;
        insertCard.cardType = this.cardType;
        insertCard.showType = this.showType;
        return insertCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InsertCard)) {
            return false;
        }
        InsertCard insertCard = (InsertCard) obj;
        return ValueObject.util_equals(this.f85id, insertCard.f85id) && this.position == insertCard.position && this.cardType == insertCard.cardType && this.showType == insertCard.showType;
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
        String str = this.f85id;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.position) * 41) + this.cardType) * 41) + this.showType;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f85id == null) {
            this.f85id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
