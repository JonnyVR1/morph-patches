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
public class WarmingUpEmoItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "warmingupemoitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<WarmingUpEmoItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<WarmingUpEmoItem>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WarmingUpEmoItem warmingUpEmoItem) {
            String str = warmingUpEmoItem.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) warmingUpEmoItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WarmingUpEmoItem m16305parse(nb5 nb5Var) throws IOException {
            WarmingUpEmoItem warmingUpEmoItem = new WarmingUpEmoItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (warmingUpEmoItem.key == null) {
                        warmingUpEmoItem.key = "";
                    }
                    if (warmingUpEmoItem.value != null) {
                        break;
                    }
                    warmingUpEmoItem.value = "";
                    break;
                }
                if (iU == 10) {
                    warmingUpEmoItem.key = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (warmingUpEmoItem.key == null) {
                            warmingUpEmoItem.key = "";
                        }
                        if (warmingUpEmoItem.value != null) {
                            break;
                        }
                        warmingUpEmoItem.value = "";
                        return warmingUpEmoItem;
                    }
                    warmingUpEmoItem.value = nb5Var.s();
                }
            }
            return warmingUpEmoItem;
        }

        public void serialize(WarmingUpEmoItem warmingUpEmoItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = warmingUpEmoItem.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<WarmingUpEmoItem> JSON_ADAPTER = new ObjectJsonAdapter<WarmingUpEmoItem>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoItem.2
        public Class getDataClass() {
            return WarmingUpEmoItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WarmingUpEmoItem m16306newInstance() {
            return new WarmingUpEmoItem();
        }

        public boolean parseField(WarmingUpEmoItem warmingUpEmoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
                warmingUpEmoItem.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            warmingUpEmoItem.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(WarmingUpEmoItem warmingUpEmoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(warmingUpEmoItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(WarmingUpEmoItem warmingUpEmoItem, JsonGenerator jsonGenerator) throws IOException {
            String str = warmingUpEmoItem.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WarmingUpEmoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WarmingUpEmoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WarmingUpEmoItem new_() {
        WarmingUpEmoItem warmingUpEmoItem = new WarmingUpEmoItem();
        warmingUpEmoItem.nullCheck();
        return warmingUpEmoItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WarmingUpEmoItem m16304clone() {
        WarmingUpEmoItem warmingUpEmoItem = new WarmingUpEmoItem();
        warmingUpEmoItem.key = this.key;
        warmingUpEmoItem.value = this.value;
        return warmingUpEmoItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WarmingUpEmoItem)) {
            return false;
        }
        WarmingUpEmoItem warmingUpEmoItem = (WarmingUpEmoItem) obj;
        return ValueObject.util_equals(this.key, warmingUpEmoItem.key) && ValueObject.util_equals(this.value, warmingUpEmoItem.value);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
