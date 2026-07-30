package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Token extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "token";

    @ProtobufIndex(index = 1)
    public int expiresIn;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<Token> PROTOBUF_ADAPTER = new MessageNanoAdapter<Token>() { // from class: com.p1.mobile.putong.data.Token.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Token token) {
            int iH = CodedOutputByteBufferNano.h(1, token.expiresIn);
            String str = token.value;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = token.userId;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) token).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Token m19106parse(nb5 nb5Var) throws IOException {
            Token token = new Token();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (token.value == null) {
                        token.value = "";
                    }
                    if (token.userId != null) {
                        break;
                    }
                    token.userId = "";
                    break;
                }
                if (iU == 8) {
                    token.expiresIn = nb5Var.j();
                } else if (iU == 18) {
                    token.value = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (token.value == null) {
                            token.value = "";
                        }
                        if (token.userId != null) {
                            break;
                        }
                        token.userId = "";
                        return token;
                    }
                    token.userId = nb5Var.s();
                }
            }
            return token;
        }

        public void serialize(Token token, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, token.expiresIn);
            String str = token.value;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = token.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<Token> JSON_ADAPTER = new ObjectJsonAdapter<Token>() { // from class: com.p1.mobile.putong.data.Token.2
        public Class getDataClass() {
            return Token.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Token mo17830newInstance() {
            return new Token();
        }

        public boolean parseField(Token token, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    token.userId = jsonParser.getValueAsString();
                    return true;
                case "value":
                    token.value = jsonParser.getValueAsString();
                    return true;
                case "expiresIn":
                    token.expiresIn = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Token token, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "value":
                case "expiresIn":
                    return true;
                default:
                    return super.parseFieldCheck(token, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Token token, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiresIn", token.expiresIn);
            String str = token.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = token.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Token) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Token) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Token new_() {
        Token token = new Token();
        token.nullCheck();
        return token;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Token m19105clone() {
        Token token = new Token();
        token.expiresIn = this.expiresIn;
        token.value = this.value;
        token.userId = this.userId;
        return token;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        return this.expiresIn == token.expiresIn && ValueObject.util_equals(this.value, token.value) && ValueObject.util_equals(this.userId, token.userId);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.expiresIn) * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
