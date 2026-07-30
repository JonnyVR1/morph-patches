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
public class GreetingItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingitem";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String category;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f65id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<GreetingItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingItem>() { // from class: com.p1.mobile.putong.core.data.GreetingItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingItem greetingItem) {
            int iH = CodedOutputByteBufferNano.h(1, greetingItem.f65id);
            String str = greetingItem.value;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) greetingItem).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingItem m13033parse(nb5 nb5Var) throws IOException {
            GreetingItem greetingItem = new GreetingItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingItem.value == null) {
                        greetingItem.value = "";
                    }
                    if (greetingItem.category != null) {
                        break;
                    }
                    greetingItem.category = "";
                    break;
                }
                if (iU == 8) {
                    greetingItem.f65id = nb5Var.j();
                } else if (iU == 18) {
                    greetingItem.value = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (greetingItem.value == null) {
                            greetingItem.value = "";
                        }
                        if (greetingItem.category != null) {
                            break;
                        }
                        greetingItem.category = "";
                        return greetingItem;
                    }
                    greetingItem.category = nb5Var.s();
                }
            }
            return greetingItem;
        }

        public void serialize(GreetingItem greetingItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, greetingItem.f65id);
            String str = greetingItem.value;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<GreetingItem> JSON_ADAPTER = new ObjectJsonAdapter<GreetingItem>() { // from class: com.p1.mobile.putong.core.data.GreetingItem.2
        public Class getDataClass() {
            return GreetingItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingItem m13034newInstance() {
            return new GreetingItem();
        }

        public boolean parseField(GreetingItem greetingItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    greetingItem.f65id = jsonParser.getValueAsInt();
                    return false;
                case "category":
                    greetingItem.category = jsonParser.getValueAsString();
                    return true;
                case "value":
                    greetingItem.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetingItem greetingItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "category":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(greetingItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GreetingItem greetingItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", greetingItem.f65id);
            String str = greetingItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingItem new_() {
        GreetingItem greetingItem = new GreetingItem();
        greetingItem.nullCheck();
        return greetingItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingItem m13032clone() {
        GreetingItem greetingItem = new GreetingItem();
        greetingItem.f65id = this.f65id;
        greetingItem.value = this.value;
        greetingItem.category = this.category;
        return greetingItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingItem)) {
            return false;
        }
        GreetingItem greetingItem = (GreetingItem) obj;
        return this.f65id == greetingItem.f65id && ValueObject.util_equals(this.value, greetingItem.value) && ValueObject.util_equals(this.category, greetingItem.category);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f65id) * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
