package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GreetingItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingitem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f20403id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<GreetingItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingItem>() { // from class: com.p1.mobile.putong.core.data.GreetingItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingItem greetingItem) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, greetingItem.f20403id);
            String str = greetingItem.value;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            greetingItem.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingItem parse(nb5 nb5Var) throws IOException {
            GreetingItem greetingItem = new GreetingItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (greetingItem.value == null) {
                        greetingItem.value = "";
                    }
                    if (greetingItem.category != null) {
                        break;
                    }
                    greetingItem.category = "";
                    break;
                }
                if (iM158752u == 8) {
                    greetingItem.f20403id = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    greetingItem.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (greetingItem.value == null) {
                            greetingItem.value = "";
                        }
                        if (greetingItem.category != null) {
                            break;
                        }
                        greetingItem.category = "";
                        return greetingItem;
                    }
                    greetingItem.category = nb5Var.m158750s();
                }
            }
            return greetingItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingItem greetingItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, greetingItem.f20403id);
            String str = greetingItem.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<GreetingItem> JSON_ADAPTER = new ObjectJsonAdapter<GreetingItem>() { // from class: com.p1.mobile.putong.core.data.GreetingItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingItem newInstance() {
            return new GreetingItem();
        }

        public boolean parseField(GreetingItem greetingItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    greetingItem.f20403id = jsonParser.getValueAsInt();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingItem greetingItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", greetingItem.f20403id);
            String str = greetingItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = greetingItem.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingItem new_() {
        GreetingItem greetingItem = new GreetingItem();
        greetingItem.nullCheck();
        return greetingItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingItem mo223809clone() {
        GreetingItem greetingItem = new GreetingItem();
        greetingItem.f20403id = this.f20403id;
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
        return this.f20403id == greetingItem.f20403id && ValueObject.util_equals(this.value, greetingItem.value) && ValueObject.util_equals(this.category, greetingItem.category);
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
        int i2 = ((i * 41) + this.f20403id) * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
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
