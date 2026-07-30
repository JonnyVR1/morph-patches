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
public class PrologueMessageAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prologuemessageadditional";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean autoSend;

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @ProtobufIndex(index = 1)
    public boolean enableEdit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String receiverTip;
    public static ProtobufAdapter<PrologueMessageAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrologueMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.PrologueMessageAdditional.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrologueMessageAdditional prologueMessageAdditional) {
            int iB = CodedOutputByteBufferNano.b(1, prologueMessageAdditional.enableEdit);
            String str = prologueMessageAdditional.receiverTip;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(3, prologueMessageAdditional.autoSend);
            String str2 = prologueMessageAdditional.category;
            if (str2 != null) {
                iB2 += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) prologueMessageAdditional).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrologueMessageAdditional m15055parse(nb5 nb5Var) throws IOException {
            PrologueMessageAdditional prologueMessageAdditional = new PrologueMessageAdditional();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (prologueMessageAdditional.receiverTip == null) {
                        prologueMessageAdditional.receiverTip = "";
                    }
                    if (prologueMessageAdditional.category != null) {
                        break;
                    }
                    prologueMessageAdditional.category = "";
                    break;
                }
                if (iU == 8) {
                    prologueMessageAdditional.enableEdit = nb5Var.g();
                } else if (iU == 18) {
                    prologueMessageAdditional.receiverTip = nb5Var.s();
                } else if (iU == 24) {
                    prologueMessageAdditional.autoSend = nb5Var.g();
                } else {
                    if (iU != 34) {
                        if (prologueMessageAdditional.receiverTip == null) {
                            prologueMessageAdditional.receiverTip = "";
                        }
                        if (prologueMessageAdditional.category != null) {
                            break;
                        }
                        prologueMessageAdditional.category = "";
                        return prologueMessageAdditional;
                    }
                    prologueMessageAdditional.category = nb5Var.s();
                }
            }
            return prologueMessageAdditional;
        }

        public void serialize(PrologueMessageAdditional prologueMessageAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, prologueMessageAdditional.enableEdit);
            String str = prologueMessageAdditional.receiverTip;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.A(3, prologueMessageAdditional.autoSend);
            String str2 = prologueMessageAdditional.category;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<PrologueMessageAdditional> JSON_ADAPTER = new ObjectJsonAdapter<PrologueMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.PrologueMessageAdditional.2
        public Class getDataClass() {
            return PrologueMessageAdditional.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrologueMessageAdditional m15056newInstance() {
            return new PrologueMessageAdditional();
        }

        public boolean parseField(PrologueMessageAdditional prologueMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "receiverTip":
                    prologueMessageAdditional.receiverTip = jsonParser.getValueAsString();
                    return true;
                case "category":
                    prologueMessageAdditional.category = jsonParser.getValueAsString();
                    return true;
                case "autoSend":
                    prologueMessageAdditional.autoSend = jsonParser.getValueAsBoolean();
                    return true;
                case "enableEdit":
                    prologueMessageAdditional.enableEdit = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrologueMessageAdditional prologueMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "receiverTip":
                case "category":
                case "autoSend":
                case "enableEdit":
                    return true;
                default:
                    return super.parseFieldCheck(prologueMessageAdditional, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PrologueMessageAdditional prologueMessageAdditional, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enableEdit", prologueMessageAdditional.enableEdit);
            String str = prologueMessageAdditional.receiverTip;
            if (str != null) {
                jsonGenerator.writeStringField("receiverTip", str);
            }
            jsonGenerator.writeBooleanField("autoSend", prologueMessageAdditional.autoSend);
            String str2 = prologueMessageAdditional.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrologueMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrologueMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrologueMessageAdditional new_() {
        PrologueMessageAdditional prologueMessageAdditional = new PrologueMessageAdditional();
        prologueMessageAdditional.nullCheck();
        return prologueMessageAdditional;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrologueMessageAdditional m15054clone() {
        PrologueMessageAdditional prologueMessageAdditional = new PrologueMessageAdditional();
        prologueMessageAdditional.enableEdit = this.enableEdit;
        prologueMessageAdditional.receiverTip = this.receiverTip;
        prologueMessageAdditional.autoSend = this.autoSend;
        prologueMessageAdditional.category = this.category;
        return prologueMessageAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrologueMessageAdditional)) {
            return false;
        }
        PrologueMessageAdditional prologueMessageAdditional = (PrologueMessageAdditional) obj;
        return this.enableEdit == prologueMessageAdditional.enableEdit && ValueObject.util_equals(this.receiverTip, prologueMessageAdditional.receiverTip) && this.autoSend == prologueMessageAdditional.autoSend && ValueObject.util_equals(this.category, prologueMessageAdditional.category);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enableEdit ? 1231 : 1237)) * 41;
        String str = this.receiverTip;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.autoSend ? 1231 : 1237)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.receiverTip == null) {
            this.receiverTip = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
