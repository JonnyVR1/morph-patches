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
public class ConversationLoveBuzz extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlovebuzz";

    @ProtobufIndex(index = 4)
    public boolean alwaysShow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String biz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long expire;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String mode;

    @ProtobufIndex(index = 6)
    public boolean notBlur;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean prolonged;
    public static ProtobufAdapter<ConversationLoveBuzz> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLoveBuzz>() { // from class: com.p1.mobile.putong.core.data.ConversationLoveBuzz.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationLoveBuzz conversationLoveBuzz) {
            String str = conversationLoveBuzz.biz;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, conversationLoveBuzz.expire);
            String str2 = conversationLoveBuzz.mode;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, conversationLoveBuzz.alwaysShow) + CodedOutputByteBufferNano.b(5, conversationLoveBuzz.prolonged) + CodedOutputByteBufferNano.b(6, conversationLoveBuzz.notBlur);
            ((MessageNano) conversationLoveBuzz).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationLoveBuzz m12389parse(nb5 nb5Var) throws IOException {
            ConversationLoveBuzz conversationLoveBuzz = new ConversationLoveBuzz();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationLoveBuzz.biz == null) {
                        conversationLoveBuzz.biz = "";
                    }
                    if (conversationLoveBuzz.mode != null) {
                        break;
                    }
                    conversationLoveBuzz.mode = "";
                    break;
                }
                if (iU == 10) {
                    conversationLoveBuzz.biz = nb5Var.s();
                } else if (iU == 16) {
                    conversationLoveBuzz.expire = nb5Var.k();
                } else if (iU == 26) {
                    conversationLoveBuzz.mode = nb5Var.s();
                } else if (iU == 32) {
                    conversationLoveBuzz.alwaysShow = nb5Var.g();
                } else if (iU == 40) {
                    conversationLoveBuzz.prolonged = nb5Var.g();
                } else {
                    if (iU != 48) {
                        if (conversationLoveBuzz.biz == null) {
                            conversationLoveBuzz.biz = "";
                        }
                        if (conversationLoveBuzz.mode != null) {
                            break;
                        }
                        conversationLoveBuzz.mode = "";
                        return conversationLoveBuzz;
                    }
                    conversationLoveBuzz.notBlur = nb5Var.g();
                }
            }
            return conversationLoveBuzz;
        }

        public void serialize(ConversationLoveBuzz conversationLoveBuzz, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLoveBuzz.biz;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, conversationLoveBuzz.expire);
            String str2 = conversationLoveBuzz.mode;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.A(4, conversationLoveBuzz.alwaysShow);
            codedOutputByteBufferNano.A(5, conversationLoveBuzz.prolonged);
            codedOutputByteBufferNano.A(6, conversationLoveBuzz.notBlur);
        }
    };
    public static JsonAdapter<ConversationLoveBuzz> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLoveBuzz>() { // from class: com.p1.mobile.putong.core.data.ConversationLoveBuzz.2
        public Class getDataClass() {
            return ConversationLoveBuzz.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationLoveBuzz m12390newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLoveBuzz) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLoveBuzz) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLoveBuzz new_() {
        ConversationLoveBuzz conversationLoveBuzz = new ConversationLoveBuzz();
        conversationLoveBuzz.nullCheck();
        return conversationLoveBuzz;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationLoveBuzz m12388clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.biz == null) {
            this.biz = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
