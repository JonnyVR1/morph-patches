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
public class StructuredFormatting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "structuredformatting";

    @NonNull
    @ProtobufIndex(index = 1)
    public String main_text;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String secondary_text;
    public static ProtobufAdapter<StructuredFormatting> PROTOBUF_ADAPTER = new MessageNanoAdapter<StructuredFormatting>() { // from class: com.p1.mobile.putong.core.data.StructuredFormatting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StructuredFormatting structuredFormatting) {
            String str = structuredFormatting.main_text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) structuredFormatting).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StructuredFormatting m15792parse(nb5 nb5Var) throws IOException {
            StructuredFormatting structuredFormatting = new StructuredFormatting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (structuredFormatting.main_text == null) {
                        structuredFormatting.main_text = "";
                    }
                    if (structuredFormatting.secondary_text != null) {
                        break;
                    }
                    structuredFormatting.secondary_text = "";
                    break;
                }
                if (iU == 10) {
                    structuredFormatting.main_text = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (structuredFormatting.main_text == null) {
                            structuredFormatting.main_text = "";
                        }
                        if (structuredFormatting.secondary_text != null) {
                            break;
                        }
                        structuredFormatting.secondary_text = "";
                        return structuredFormatting;
                    }
                    structuredFormatting.secondary_text = nb5Var.s();
                }
            }
            return structuredFormatting;
        }

        public void serialize(StructuredFormatting structuredFormatting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = structuredFormatting.main_text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<StructuredFormatting> JSON_ADAPTER = new ObjectJsonAdapter<StructuredFormatting>() { // from class: com.p1.mobile.putong.core.data.StructuredFormatting.2
        public Class getDataClass() {
            return StructuredFormatting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StructuredFormatting m15793newInstance() {
            return new StructuredFormatting();
        }

        public boolean parseField(StructuredFormatting structuredFormatting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("secondary_text")) {
                structuredFormatting.secondary_text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("main_text")) {
                return false;
            }
            structuredFormatting.main_text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(StructuredFormatting structuredFormatting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("secondary_text") || str.equals("main_text")) {
                return true;
            }
            return super.parseFieldCheck(structuredFormatting, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(StructuredFormatting structuredFormatting, JsonGenerator jsonGenerator) throws IOException {
            String str = structuredFormatting.main_text;
            if (str != null) {
                jsonGenerator.writeStringField("main_text", str);
            }
            String str2 = structuredFormatting.secondary_text;
            if (str2 != null) {
                jsonGenerator.writeStringField("secondary_text", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StructuredFormatting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StructuredFormatting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StructuredFormatting new_() {
        StructuredFormatting structuredFormatting = new StructuredFormatting();
        structuredFormatting.nullCheck();
        return structuredFormatting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StructuredFormatting m15791clone() {
        StructuredFormatting structuredFormatting = new StructuredFormatting();
        structuredFormatting.main_text = this.main_text;
        structuredFormatting.secondary_text = this.secondary_text;
        return structuredFormatting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StructuredFormatting)) {
            return false;
        }
        StructuredFormatting structuredFormatting = (StructuredFormatting) obj;
        return ValueObject.util_equals(this.main_text, structuredFormatting.main_text) && ValueObject.util_equals(this.secondary_text, structuredFormatting.secondary_text);
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
        String str = this.main_text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.secondary_text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.main_text == null) {
            this.main_text = "";
        }
        if (this.secondary_text == null) {
            this.secondary_text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
