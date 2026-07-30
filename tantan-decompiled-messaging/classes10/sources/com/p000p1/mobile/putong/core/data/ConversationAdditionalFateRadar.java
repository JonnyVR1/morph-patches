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
public class ConversationAdditionalFateRadar extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalfateradar";

    @NonNull
    @ProtobufIndex(index = 1)
    public String previewText;
    public static ProtobufAdapter<ConversationAdditionalFateRadar> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalFateRadar>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalFateRadar.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationAdditionalFateRadar conversationAdditionalFateRadar) {
            String str = conversationAdditionalFateRadar.previewText;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) conversationAdditionalFateRadar).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalFateRadar m12327parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalFateRadar conversationAdditionalFateRadar = new ConversationAdditionalFateRadar();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationAdditionalFateRadar.previewText != null) {
                        break;
                    }
                    conversationAdditionalFateRadar.previewText = "";
                    break;
                }
                if (iU != 10) {
                    if (conversationAdditionalFateRadar.previewText != null) {
                        break;
                    }
                    conversationAdditionalFateRadar.previewText = "";
                    return conversationAdditionalFateRadar;
                }
                conversationAdditionalFateRadar.previewText = nb5Var.s();
            }
            return conversationAdditionalFateRadar;
        }

        public void serialize(ConversationAdditionalFateRadar conversationAdditionalFateRadar, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationAdditionalFateRadar.previewText;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationAdditionalFateRadar> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalFateRadar>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalFateRadar.2
        public Class getDataClass() {
            return ConversationAdditionalFateRadar.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalFateRadar m12328newInstance() {
            return new ConversationAdditionalFateRadar();
        }

        public boolean parseField(ConversationAdditionalFateRadar conversationAdditionalFateRadar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("previewText")) {
                return false;
            }
            conversationAdditionalFateRadar.previewText = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationAdditionalFateRadar conversationAdditionalFateRadar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("previewText")) {
                return true;
            }
            return super.parseFieldCheck(conversationAdditionalFateRadar, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationAdditionalFateRadar conversationAdditionalFateRadar, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationAdditionalFateRadar.previewText;
            if (str != null) {
                jsonGenerator.writeStringField("previewText", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalFateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalFateRadar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalFateRadar new_() {
        ConversationAdditionalFateRadar conversationAdditionalFateRadar = new ConversationAdditionalFateRadar();
        conversationAdditionalFateRadar.nullCheck();
        return conversationAdditionalFateRadar;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationAdditionalFateRadar m12326clone() {
        ConversationAdditionalFateRadar conversationAdditionalFateRadar = new ConversationAdditionalFateRadar();
        conversationAdditionalFateRadar.previewText = this.previewText;
        return conversationAdditionalFateRadar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationAdditionalFateRadar) {
            return ValueObject.util_equals(this.previewText, ((ConversationAdditionalFateRadar) obj).previewText);
        }
        return false;
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
        String str = this.previewText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.previewText == null) {
            this.previewText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
