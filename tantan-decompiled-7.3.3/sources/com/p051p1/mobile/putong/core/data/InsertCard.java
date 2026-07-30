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
public class InsertCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertcard";

    @ProtobufIndex(index = 3)
    public int cardType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21165id;

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
            String str = insertCard.f21165id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, insertCard.position) + CodedOutputByteBufferNano.m17281h(3, insertCard.cardType) + CodedOutputByteBufferNano.m17281h(4, insertCard.showType);
            insertCard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InsertCard parse(nc5 nc5Var) throws IOException {
            InsertCard insertCard = new InsertCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (insertCard.f21165id != null) {
                        break;
                    }
                    insertCard.f21165id = "";
                    break;
                }
                if (iM162497u == 10) {
                    insertCard.f21165id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    insertCard.position = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    insertCard.cardType = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        if (insertCard.f21165id != null) {
                            break;
                        }
                        insertCard.f21165id = "";
                        return insertCard;
                    }
                    insertCard.showType = nc5Var.m162486j();
                }
            }
            return insertCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InsertCard insertCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertCard.f21165id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, insertCard.position);
            codedOutputByteBufferNano.m17305G(3, insertCard.cardType);
            codedOutputByteBufferNano.m17305G(4, insertCard.showType);
        }
    };
    public static JsonAdapter<InsertCard> JSON_ADAPTER = new ObjectJsonAdapter<InsertCard>() { // from class: com.p1.mobile.putong.core.data.InsertCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InsertCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    insertCard.f21165id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InsertCard insertCard, JsonGenerator jsonGenerator) throws IOException {
            String str = insertCard.f21165id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("position", insertCard.position);
            jsonGenerator.writeNumberField("cardType", insertCard.cardType);
            jsonGenerator.writeNumberField("showType", insertCard.showType);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public InsertCard mo225055clone() {
        InsertCard insertCard = new InsertCard();
        insertCard.f21165id = this.f21165id;
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
        return ValueObject.util_equals(this.f21165id, insertCard.f21165id) && this.position == insertCard.position && this.cardType == insertCard.cardType && this.showType == insertCard.showType;
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
        String str = this.f21165id;
        int iHashCode = ((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.position) * 41) + this.cardType) * 41) + this.showType;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21165id == null) {
            this.f21165id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
