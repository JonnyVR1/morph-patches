package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class EmojiItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojiitem";

    @ProtobufIndex(index = 1)
    public boolean available;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 2)
    public int f39595id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<EmojiItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiItem>() { // from class: com.p1.mobile.putong.data.EmojiItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiItem emojiItem) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, emojiItem.available) + CodedOutputByteBufferNano.m17281h(2, emojiItem.f39595id);
            String str = emojiItem.url;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            emojiItem.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiItem parse(nc5 nc5Var) throws IOException {
            EmojiItem emojiItem = new EmojiItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (emojiItem.url != null) {
                        break;
                    }
                    emojiItem.url = "";
                    break;
                }
                if (iM162497u == 8) {
                    emojiItem.available = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    emojiItem.f39595id = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (emojiItem.url != null) {
                            break;
                        }
                        emojiItem.url = "";
                        return emojiItem;
                    }
                    emojiItem.url = nc5Var.m162495s();
                }
            }
            return emojiItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiItem emojiItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, emojiItem.available);
            codedOutputByteBufferNano.m17305G(2, emojiItem.f39595id);
            String str = emojiItem.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<EmojiItem> JSON_ADAPTER = new ObjectJsonAdapter<EmojiItem>() { // from class: com.p1.mobile.putong.data.EmojiItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiItem newInstance() {
            return new EmojiItem();
        }

        public boolean parseField(EmojiItem emojiItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "available":
                    emojiItem.available = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    emojiItem.f39595id = jsonParser.getValueAsInt();
                    return false;
                case "url":
                    emojiItem.url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(EmojiItem emojiItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "available":
                    return true;
                case "id":
                    return false;
                case "url":
                    return true;
                default:
                    return super.parseFieldCheck(emojiItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiItem emojiItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("available", emojiItem.available);
            jsonGenerator.writeNumberField("id", emojiItem.f39595id);
            String str = emojiItem.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiItem new_() {
        EmojiItem emojiItem = new EmojiItem();
        emojiItem.nullCheck();
        return emojiItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiItem mo225055clone() {
        EmojiItem emojiItem = new EmojiItem();
        emojiItem.available = this.available;
        emojiItem.f39595id = this.f39595id;
        emojiItem.url = this.url;
        return emojiItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmojiItem)) {
            return false;
        }
        EmojiItem emojiItem = (EmojiItem) obj;
        return this.available == emojiItem.available && this.f39595id == emojiItem.f39595id && ValueObject.util_equals(this.url, emojiItem.url);
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
        int i2 = ((((i * 41) + (this.available ? 1231 : 1237)) * 41) + this.f39595id) * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
