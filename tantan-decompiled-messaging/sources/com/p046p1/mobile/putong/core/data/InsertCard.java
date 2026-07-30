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
public class InsertCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertcard";

    @ProtobufIndex(index = 3)
    public int cardType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20423id;

    @ProtobufIndex(index = 2)
    public int position;

    @ProtobufIndex(index = 4)
    public int showType;
    public static ProtobufAdapter<InsertCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertCard>() { // from class: com.p1.mobile.putong.core.data.InsertCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InsertCard insertCard) {
            String str = insertCard.f20423id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, insertCard.position) + CodedOutputByteBufferNano.m17226h(3, insertCard.cardType) + CodedOutputByteBufferNano.m17226h(4, insertCard.showType);
            insertCard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InsertCard parse(nb5 nb5Var) throws IOException {
            InsertCard insertCard = new InsertCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (insertCard.f20423id != null) {
                        break;
                    }
                    insertCard.f20423id = "";
                    break;
                }
                if (iM158752u == 10) {
                    insertCard.f20423id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    insertCard.position = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    insertCard.cardType = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        if (insertCard.f20423id != null) {
                            break;
                        }
                        insertCard.f20423id = "";
                        return insertCard;
                    }
                    insertCard.showType = nb5Var.m158741j();
                }
            }
            return insertCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InsertCard insertCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertCard.f20423id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, insertCard.position);
            codedOutputByteBufferNano.m17250G(3, insertCard.cardType);
            codedOutputByteBufferNano.m17250G(4, insertCard.showType);
        }
    };
    public static JsonAdapter<InsertCard> JSON_ADAPTER = new ObjectJsonAdapter<InsertCard>() { // from class: com.p1.mobile.putong.core.data.InsertCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InsertCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InsertCard newInstance() {
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
                    insertCard.f20423id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InsertCard insertCard, JsonGenerator jsonGenerator) throws IOException {
            String str = insertCard.f20423id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("position", insertCard.position);
            jsonGenerator.writeNumberField("cardType", insertCard.cardType);
            jsonGenerator.writeNumberField("showType", insertCard.showType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertCard new_() {
        InsertCard insertCard = new InsertCard();
        insertCard.nullCheck();
        return insertCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InsertCard mo223809clone() {
        InsertCard insertCard = new InsertCard();
        insertCard.f20423id = this.f20423id;
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
        return ValueObject.util_equals(this.f20423id, insertCard.f20423id) && this.position == insertCard.position && this.cardType == insertCard.cardType && this.showType == insertCard.showType;
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
        String str = this.f20423id;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.position) * 41) + this.cardType) * 41) + this.showType;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20423id == null) {
            this.f20423id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
