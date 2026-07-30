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
public class ConversationLoveBuzz extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlovebuzz";

    @ProtobufIndex(index = 4)
    public boolean alwaysShow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String biz;

    @ProtobufIndex(index = 2)
    public long expire;

    @NonNull
    @ProtobufIndex(index = 3)
    public String mode;

    @ProtobufIndex(index = 6)
    public boolean notBlur;

    @ProtobufIndex(index = 5)
    public boolean prolonged;
    public static ProtobufAdapter<ConversationLoveBuzz> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLoveBuzz>() { // from class: com.p1.mobile.putong.core.data.ConversationLoveBuzz.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationLoveBuzz conversationLoveBuzz) {
            String str = conversationLoveBuzz.biz;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, conversationLoveBuzz.expire);
            String str2 = conversationLoveBuzz.mode;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, conversationLoveBuzz.alwaysShow) + CodedOutputByteBufferNano.m17275b(5, conversationLoveBuzz.prolonged) + CodedOutputByteBufferNano.m17275b(6, conversationLoveBuzz.notBlur);
            conversationLoveBuzz.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationLoveBuzz parse(nc5 nc5Var) throws IOException {
            ConversationLoveBuzz conversationLoveBuzz = new ConversationLoveBuzz();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationLoveBuzz.biz == null) {
                        conversationLoveBuzz.biz = "";
                    }
                    if (conversationLoveBuzz.mode != null) {
                        break;
                    }
                    conversationLoveBuzz.mode = "";
                    break;
                }
                if (iM162497u == 10) {
                    conversationLoveBuzz.biz = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    conversationLoveBuzz.expire = nc5Var.m162487k();
                } else if (iM162497u == 26) {
                    conversationLoveBuzz.mode = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    conversationLoveBuzz.alwaysShow = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    conversationLoveBuzz.prolonged = nc5Var.m162483g();
                } else {
                    if (iM162497u != 48) {
                        if (conversationLoveBuzz.biz == null) {
                            conversationLoveBuzz.biz = "";
                        }
                        if (conversationLoveBuzz.mode != null) {
                            break;
                        }
                        conversationLoveBuzz.mode = "";
                        return conversationLoveBuzz;
                    }
                    conversationLoveBuzz.notBlur = nc5Var.m162483g();
                }
            }
            return conversationLoveBuzz;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationLoveBuzz conversationLoveBuzz, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLoveBuzz.biz;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, conversationLoveBuzz.expire);
            String str2 = conversationLoveBuzz.mode;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, conversationLoveBuzz.alwaysShow);
            codedOutputByteBufferNano.m17299A(5, conversationLoveBuzz.prolonged);
            codedOutputByteBufferNano.m17299A(6, conversationLoveBuzz.notBlur);
        }
    };
    public static JsonAdapter<ConversationLoveBuzz> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLoveBuzz>() { // from class: com.p1.mobile.putong.core.data.ConversationLoveBuzz.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationLoveBuzz.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationLoveBuzz newInstance() {
            return new ConversationLoveBuzz();
        }

        public boolean parseField(ConversationLoveBuzz conversationLoveBuzz, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expire":
                    conversationLoveBuzz.expire = jsonParser.getValueAsLong();
                    return true;
                case "prolonged":
                    conversationLoveBuzz.prolonged = jsonParser.getValueAsBoolean();
                    return true;
                case "biz":
                    conversationLoveBuzz.biz = jsonParser.getValueAsString();
                    return true;
                case "mode":
                    conversationLoveBuzz.mode = jsonParser.getValueAsString();
                    return true;
                case "alwaysShow":
                    conversationLoveBuzz.alwaysShow = jsonParser.getValueAsBoolean();
                    return true;
                case "notBlur":
                    conversationLoveBuzz.notBlur = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationLoveBuzz conversationLoveBuzz, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expire":
                case "prolonged":
                case "biz":
                case "mode":
                case "alwaysShow":
                case "notBlur":
                    return true;
                default:
                    return super.parseFieldCheck(conversationLoveBuzz, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationLoveBuzz conversationLoveBuzz, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationLoveBuzz.biz;
            if (str != null) {
                jsonGenerator.writeStringField("biz", str);
            }
            jsonGenerator.writeNumberField("expire", conversationLoveBuzz.expire);
            String str2 = conversationLoveBuzz.mode;
            if (str2 != null) {
                jsonGenerator.writeStringField("mode", str2);
            }
            jsonGenerator.writeBooleanField("alwaysShow", conversationLoveBuzz.alwaysShow);
            jsonGenerator.writeBooleanField("prolonged", conversationLoveBuzz.prolonged);
            jsonGenerator.writeBooleanField("notBlur", conversationLoveBuzz.notBlur);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLoveBuzz) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLoveBuzz) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLoveBuzz new_() {
        ConversationLoveBuzz conversationLoveBuzz = new ConversationLoveBuzz();
        conversationLoveBuzz.nullCheck();
        return conversationLoveBuzz;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationLoveBuzz mo225055clone() {
        ConversationLoveBuzz conversationLoveBuzz = new ConversationLoveBuzz();
        conversationLoveBuzz.biz = this.biz;
        conversationLoveBuzz.expire = this.expire;
        conversationLoveBuzz.mode = this.mode;
        conversationLoveBuzz.alwaysShow = this.alwaysShow;
        conversationLoveBuzz.prolonged = this.prolonged;
        conversationLoveBuzz.notBlur = this.notBlur;
        return conversationLoveBuzz;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationLoveBuzz)) {
            return false;
        }
        ConversationLoveBuzz conversationLoveBuzz = (ConversationLoveBuzz) obj;
        return ValueObject.util_equals(this.biz, conversationLoveBuzz.biz) && this.expire == conversationLoveBuzz.expire && ValueObject.util_equals(this.mode, conversationLoveBuzz.mode) && this.alwaysShow == conversationLoveBuzz.alwaysShow && this.prolonged == conversationLoveBuzz.prolonged && this.notBlur == conversationLoveBuzz.notBlur;
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
        String str = this.biz;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.expire;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.mode;
        int iHashCode2 = ((((((i3 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.alwaysShow ? 1231 : 1237)) * 41) + (this.prolonged ? 1231 : 1237)) * 41) + (this.notBlur ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.biz == null) {
            this.biz = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
