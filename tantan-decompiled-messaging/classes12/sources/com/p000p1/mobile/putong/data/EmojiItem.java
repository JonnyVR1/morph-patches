package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class EmojiItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojiitem";

    @ProtobufIndex(index = 1)
    public boolean available;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 2)
    public int f208id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<EmojiItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiItem>() { // from class: com.p1.mobile.putong.data.EmojiItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiItem emojiItem) {
            int iB = CodedOutputByteBufferNano.b(1, emojiItem.available) + CodedOutputByteBufferNano.h(2, emojiItem.f208id);
            String str = emojiItem.url;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) emojiItem).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiItem m18013parse(nb5 nb5Var) throws IOException {
            EmojiItem emojiItem = new EmojiItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (emojiItem.url != null) {
                        break;
                    }
                    emojiItem.url = "";
                    break;
                }
                if (iU == 8) {
                    emojiItem.available = nb5Var.g();
                } else if (iU == 16) {
                    emojiItem.f208id = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (emojiItem.url != null) {
                            break;
                        }
                        emojiItem.url = "";
                        return emojiItem;
                    }
                    emojiItem.url = nb5Var.s();
                }
            }
            return emojiItem;
        }

        public void serialize(EmojiItem emojiItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, emojiItem.available);
            codedOutputByteBufferNano.G(2, emojiItem.f208id);
            String str = emojiItem.url;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<EmojiItem> JSON_ADAPTER = new ObjectJsonAdapter<EmojiItem>() { // from class: com.p1.mobile.putong.data.EmojiItem.2
        public Class getDataClass() {
            return EmojiItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public EmojiItem mo17830newInstance() {
            return new EmojiItem();
        }

        public boolean parseField(EmojiItem emojiItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "available":
                    emojiItem.available = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    emojiItem.f208id = jsonParser.getValueAsInt();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiItem emojiItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("available", emojiItem.available);
            jsonGenerator.writeNumberField("id", emojiItem.f208id);
            String str = emojiItem.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiItem new_() {
        EmojiItem emojiItem = new EmojiItem();
        emojiItem.nullCheck();
        return emojiItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiItem m18012clone() {
        EmojiItem emojiItem = new EmojiItem();
        emojiItem.available = this.available;
        emojiItem.f208id = this.f208id;
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
        return this.available == emojiItem.available && this.f208id == emojiItem.f208id && ValueObject.util_equals(this.url, emojiItem.url);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.available ? 1231 : 1237)) * 41) + this.f208id) * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
