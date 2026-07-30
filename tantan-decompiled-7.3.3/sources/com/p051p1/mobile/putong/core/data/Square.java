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
public class Square extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "square";

    @NonNull
    @ProtobufIndex(index = 2)
    public String userStateID;

    @ProtobufIndex(index = 1)
    public int userStatePublishRemain;
    public static ProtobufAdapter<Square> PROTOBUF_ADAPTER = new MessageNanoAdapter<Square>() { // from class: com.p1.mobile.putong.core.data.Square.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Square square) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            square.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Square parse(nc5 nc5Var) throws IOException {
            Square square = new Square();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (square.userStateID != null) {
                        break;
                    }
                    square.userStateID = "";
                    break;
                }
                if (iM162497u == 8) {
                    square.userStatePublishRemain = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (square.userStateID != null) {
                            break;
                        }
                        square.userStateID = "";
                        return square;
                    }
                    square.userStateID = nc5Var.m162495s();
                }
            }
            return square;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Square square, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<Square> JSON_ADAPTER = new ObjectJsonAdapter<Square>() { // from class: com.p1.mobile.putong.core.data.Square.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Square.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Square newInstance() {
            return new Square();
        }

        public boolean parseField(Square square, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userStatePublishRemain")) {
                square.userStatePublishRemain = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("userStateID")) {
                return false;
            }
            square.userStateID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Square square, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userStatePublishRemain") || str.equals("userStateID")) {
                return true;
            }
            return super.parseFieldCheck(square, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Square square, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("userStatePublishRemain", square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                jsonGenerator.writeStringField("userStateID", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Square) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Square) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Square new_() {
        Square square = new Square();
        square.nullCheck();
        return square;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Square mo225055clone() {
        Square square = new Square();
        square.userStatePublishRemain = this.userStatePublishRemain;
        square.userStateID = this.userStateID;
        return square;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Square)) {
            return false;
        }
        Square square = (Square) obj;
        return this.userStatePublishRemain == square.userStatePublishRemain && ValueObject.util_equals(this.userStateID, square.userStateID);
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
        int i2 = ((i * 41) + this.userStatePublishRemain) * 41;
        String str = this.userStateID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userStateID == null) {
            this.userStateID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
