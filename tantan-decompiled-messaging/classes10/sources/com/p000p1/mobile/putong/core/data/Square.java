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
public class Square extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "square";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userStateID;

    @ProtobufIndex(index = 1)
    public int userStatePublishRemain;
    public static ProtobufAdapter<Square> PROTOBUF_ADAPTER = new MessageNanoAdapter<Square>() { // from class: com.p1.mobile.putong.core.data.Square.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Square square) {
            int iH = CodedOutputByteBufferNano.h(1, square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) square).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Square m15742parse(nb5 nb5Var) throws IOException {
            Square square = new Square();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (square.userStateID != null) {
                        break;
                    }
                    square.userStateID = "";
                    break;
                }
                if (iU == 8) {
                    square.userStatePublishRemain = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (square.userStateID != null) {
                            break;
                        }
                        square.userStateID = "";
                        return square;
                    }
                    square.userStateID = nb5Var.s();
                }
            }
            return square;
        }

        public void serialize(Square square, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<Square> JSON_ADAPTER = new ObjectJsonAdapter<Square>() { // from class: com.p1.mobile.putong.core.data.Square.2
        public Class getDataClass() {
            return Square.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Square m15743newInstance() {
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

        public void serializeFields(Square square, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("userStatePublishRemain", square.userStatePublishRemain);
            String str = square.userStateID;
            if (str != null) {
                jsonGenerator.writeStringField("userStateID", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Square) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Square) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Square new_() {
        Square square = new Square();
        square.nullCheck();
        return square;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Square m15741clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.userStatePublishRemain) * 41;
        String str = this.userStateID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userStateID == null) {
            this.userStateID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
