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
public class Item extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "item";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int rank;
    public static ProtobufAdapter<Item> PROTOBUF_ADAPTER = new MessageNanoAdapter<Item>() { // from class: com.p1.mobile.putong.core.data.Item.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Item item) {
            String str = item.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, item.rank);
            ((MessageNano) item).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Item m13755parse(nb5 nb5Var) throws IOException {
            Item item = new Item();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (item.name != null) {
                        break;
                    }
                    item.name = "";
                    break;
                }
                if (iU == 10) {
                    item.name = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (item.name != null) {
                            break;
                        }
                        item.name = "";
                        return item;
                    }
                    item.rank = nb5Var.j();
                }
            }
            return item;
        }

        public void serialize(Item item, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = item.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, item.rank);
        }
    };
    public static JsonAdapter<Item> JSON_ADAPTER = new ObjectJsonAdapter<Item>() { // from class: com.p1.mobile.putong.core.data.Item.2
        public Class getDataClass() {
            return Item.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Item m13756newInstance() {
            return new Item();
        }

        public boolean parseField(Item item, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("name")) {
                item.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("rank")) {
                return false;
            }
            item.rank = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Item item, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name") || str.equals("rank")) {
                return true;
            }
            return super.parseFieldCheck(item, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Item item, JsonGenerator jsonGenerator) throws IOException {
            String str = item.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeNumberField("rank", item.rank);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Item) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Item) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Item new_() {
        Item item = new Item();
        item.nullCheck();
        return item;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Item m13754clone() {
        Item item = new Item();
        item.name = this.name;
        item.rank = this.rank;
        return item;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return ValueObject.util_equals(this.name, item.name) && this.rank == item.rank;
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
        String str = this.name;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.rank;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
