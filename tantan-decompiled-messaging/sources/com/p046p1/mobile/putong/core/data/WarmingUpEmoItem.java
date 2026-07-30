package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class WarmingUpEmoItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "warmingupemoitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<WarmingUpEmoItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<WarmingUpEmoItem>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WarmingUpEmoItem warmingUpEmoItem) {
            String str = warmingUpEmoItem.key;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            warmingUpEmoItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WarmingUpEmoItem parse(nb5 nb5Var) throws IOException {
            WarmingUpEmoItem warmingUpEmoItem = new WarmingUpEmoItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (warmingUpEmoItem.key == null) {
                        warmingUpEmoItem.key = "";
                    }
                    if (warmingUpEmoItem.value != null) {
                        break;
                    }
                    warmingUpEmoItem.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    warmingUpEmoItem.key = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (warmingUpEmoItem.key == null) {
                            warmingUpEmoItem.key = "";
                        }
                        if (warmingUpEmoItem.value != null) {
                            break;
                        }
                        warmingUpEmoItem.value = "";
                        return warmingUpEmoItem;
                    }
                    warmingUpEmoItem.value = nb5Var.m158750s();
                }
            }
            return warmingUpEmoItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WarmingUpEmoItem warmingUpEmoItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = warmingUpEmoItem.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<WarmingUpEmoItem> JSON_ADAPTER = new ObjectJsonAdapter<WarmingUpEmoItem>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WarmingUpEmoItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WarmingUpEmoItem newInstance() {
            return new WarmingUpEmoItem();
        }

        public boolean parseField(WarmingUpEmoItem warmingUpEmoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
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
            if (str.equals(Constants.KEY_KEY) || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(warmingUpEmoItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WarmingUpEmoItem warmingUpEmoItem, JsonGenerator jsonGenerator) throws IOException {
            String str = warmingUpEmoItem.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = warmingUpEmoItem.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WarmingUpEmoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WarmingUpEmoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WarmingUpEmoItem new_() {
        WarmingUpEmoItem warmingUpEmoItem = new WarmingUpEmoItem();
        warmingUpEmoItem.nullCheck();
        return warmingUpEmoItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WarmingUpEmoItem mo223809clone() {
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
