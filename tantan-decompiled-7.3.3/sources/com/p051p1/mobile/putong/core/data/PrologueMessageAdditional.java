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
public class PrologueMessageAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "prologuemessageadditional";

    @ProtobufIndex(index = 3)
    public boolean autoSend;

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @ProtobufIndex(index = 1)
    public boolean enableEdit;

    @NonNull
    @ProtobufIndex(index = 2)
    public String receiverTip;
    public static ProtobufAdapter<PrologueMessageAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrologueMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.PrologueMessageAdditional.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrologueMessageAdditional prologueMessageAdditional) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, prologueMessageAdditional.enableEdit);
            String str = prologueMessageAdditional.receiverTip;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(3, prologueMessageAdditional.autoSend);
            String str2 = prologueMessageAdditional.category;
            if (str2 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            prologueMessageAdditional.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrologueMessageAdditional parse(nc5 nc5Var) throws IOException {
            PrologueMessageAdditional prologueMessageAdditional = new PrologueMessageAdditional();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (prologueMessageAdditional.receiverTip == null) {
                        prologueMessageAdditional.receiverTip = "";
                    }
                    if (prologueMessageAdditional.category != null) {
                        break;
                    }
                    prologueMessageAdditional.category = "";
                    break;
                }
                if (iM162497u == 8) {
                    prologueMessageAdditional.enableEdit = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    prologueMessageAdditional.receiverTip = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    prologueMessageAdditional.autoSend = nc5Var.m162483g();
                } else {
                    if (iM162497u != 34) {
                        if (prologueMessageAdditional.receiverTip == null) {
                            prologueMessageAdditional.receiverTip = "";
                        }
                        if (prologueMessageAdditional.category != null) {
                            break;
                        }
                        prologueMessageAdditional.category = "";
                        return prologueMessageAdditional;
                    }
                    prologueMessageAdditional.category = nc5Var.m162495s();
                }
            }
            return prologueMessageAdditional;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrologueMessageAdditional prologueMessageAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, prologueMessageAdditional.enableEdit);
            String str = prologueMessageAdditional.receiverTip;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17299A(3, prologueMessageAdditional.autoSend);
            String str2 = prologueMessageAdditional.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<PrologueMessageAdditional> JSON_ADAPTER = new ObjectJsonAdapter<PrologueMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.PrologueMessageAdditional.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrologueMessageAdditional.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrologueMessageAdditional newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrologueMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrologueMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrologueMessageAdditional new_() {
        PrologueMessageAdditional prologueMessageAdditional = new PrologueMessageAdditional();
        prologueMessageAdditional.nullCheck();
        return prologueMessageAdditional;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrologueMessageAdditional mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enableEdit ? 1231 : 1237)) * 41;
        String str = this.receiverTip;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.autoSend ? 1231 : 1237)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.receiverTip == null) {
            this.receiverTip = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
