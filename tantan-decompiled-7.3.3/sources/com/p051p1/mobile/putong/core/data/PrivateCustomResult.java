package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PrivateCustomCard;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PrivateCustomResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<PrivateCustomCard> cards;

    @ProtobufIndex(index = 3)
    public boolean mock;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<PrivateCustomResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomResult>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateCustomResult privateCustomResult) {
            List<PrivateCustomCard> list = privateCustomResult.cards;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, PrivateCustomCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17281h(2, privateCustomResult.total) + CodedOutputByteBufferNano.m17275b(3, privateCustomResult.mock);
            privateCustomResult.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateCustomResult parse(nc5 nc5Var) throws IOException {
            PrivateCustomResult privateCustomResult = new PrivateCustomResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (privateCustomResult.cards != null) {
                        break;
                    }
                    privateCustomResult.cards = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    privateCustomResult.cards = (List) nc5Var.m162488l(PrivateCustomCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    privateCustomResult.total = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        if (privateCustomResult.cards != null) {
                            break;
                        }
                        privateCustomResult.cards = new ArrayList();
                        return privateCustomResult;
                    }
                    privateCustomResult.mock = nc5Var.m162483g();
                }
            }
            return privateCustomResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateCustomResult privateCustomResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PrivateCustomCard> list = privateCustomResult.cards;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, PrivateCustomCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(2, privateCustomResult.total);
            codedOutputByteBufferNano.m17299A(3, privateCustomResult.mock);
        }
    };
    public static JsonAdapter<PrivateCustomResult> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomResult>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateCustomResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateCustomResult newInstance() {
            return new PrivateCustomResult();
        }

        public boolean parseField(PrivateCustomResult privateCustomResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mock":
                    privateCustomResult.mock = jsonParser.getValueAsBoolean();
                    return true;
                case "cards":
                    privateCustomResult.cards = JsonAdapter.parseArray(jsonParser, PrivateCustomCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "total":
                    privateCustomResult.total = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivateCustomResult privateCustomResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "mock":
                case "cards":
                case "total":
                    return true;
                default:
                    return super.parseFieldCheck(privateCustomResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateCustomResult privateCustomResult, JsonGenerator jsonGenerator) throws IOException {
            if (privateCustomResult.cards != null) {
                jsonGenerator.writeFieldName("cards");
                JsonAdapter.serializeArray(privateCustomResult.cards, jsonGenerator, PrivateCustomCard.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("total", privateCustomResult.total);
            jsonGenerator.writeBooleanField("mock", privateCustomResult.mock);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateCustomResult new_() {
        PrivateCustomResult privateCustomResult = new PrivateCustomResult();
        privateCustomResult.nullCheck();
        return privateCustomResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateCustomResult mo225055clone() {
        PrivateCustomResult privateCustomResult = new PrivateCustomResult();
        List<PrivateCustomCard> list = this.cards;
        if (list != null) {
            privateCustomResult.cards = ValueObject.util_map(list, new qcj() { // from class: l.bz80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PrivateCustomCard) obj).mo225055clone();
                }
            });
        }
        privateCustomResult.total = this.total;
        privateCustomResult.mock = this.mock;
        return privateCustomResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateCustomResult)) {
            return false;
        }
        PrivateCustomResult privateCustomResult = (PrivateCustomResult) obj;
        return ValueObject.util_equals(this.cards, privateCustomResult.cards) && this.total == privateCustomResult.total && this.mock == privateCustomResult.mock;
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
        List<PrivateCustomCard> list = this.cards;
        int iHashCode = ((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.total) * 41) + (this.mock ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cards == null) {
            this.cards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
