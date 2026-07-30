package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Sticker;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiCacheItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicacheitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Sticker> dataList;

    @ProtobufIndex(index = 2)
    public long useNumber;
    public static ProtobufAdapter<EmojiCacheItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCacheItem>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiCacheItem emojiCacheItem) {
            List<Sticker> list = emojiCacheItem.dataList;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17228j(2, emojiCacheItem.useNumber);
            emojiCacheItem.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiCacheItem parse(nb5 nb5Var) throws IOException {
            EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (emojiCacheItem.dataList != null) {
                        break;
                    }
                    emojiCacheItem.dataList = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    emojiCacheItem.dataList = (List) nb5Var.m158743l(Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 16) {
                        if (emojiCacheItem.dataList != null) {
                            break;
                        }
                        emojiCacheItem.dataList = new ArrayList();
                        return emojiCacheItem;
                    }
                    emojiCacheItem.useNumber = nb5Var.m158742k();
                }
            }
            return emojiCacheItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiCacheItem emojiCacheItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Sticker> list = emojiCacheItem.dataList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17252I(2, emojiCacheItem.useNumber);
        }
    };
    public static JsonAdapter<EmojiCacheItem> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCacheItem>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiCacheItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiCacheItem newInstance() {
            return new EmojiCacheItem();
        }

        public boolean parseField(EmojiCacheItem emojiCacheItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("useNumber")) {
                emojiCacheItem.useNumber = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("dataList")) {
                return false;
            }
            emojiCacheItem.dataList = JsonAdapter.parseArray(jsonParser, Sticker.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(EmojiCacheItem emojiCacheItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("useNumber") || str.equals("dataList")) {
                return true;
            }
            return super.parseFieldCheck(emojiCacheItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiCacheItem emojiCacheItem, JsonGenerator jsonGenerator) throws IOException {
            if (emojiCacheItem.dataList != null) {
                jsonGenerator.writeFieldName("dataList");
                JsonAdapter.serializeArray(emojiCacheItem.dataList, jsonGenerator, Sticker.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("useNumber", emojiCacheItem.useNumber);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCacheItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiCacheItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiCacheItem new_() {
        EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
        emojiCacheItem.nullCheck();
        return emojiCacheItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiCacheItem mo223809clone() {
        EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
        List<Sticker> list = this.dataList;
        if (list != null) {
            emojiCacheItem.dataList = ValueObject.util_map(list, new w9j() { // from class: l.cxe
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Sticker) obj).mo223809clone();
                }
            });
        }
        emojiCacheItem.useNumber = this.useNumber;
        return emojiCacheItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmojiCacheItem)) {
            return false;
        }
        EmojiCacheItem emojiCacheItem = (EmojiCacheItem) obj;
        return ValueObject.util_equals(this.dataList, emojiCacheItem.dataList) && this.useNumber == emojiCacheItem.useNumber;
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
        List<Sticker> list = this.dataList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        long j = this.useNumber;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dataList == null) {
            this.dataList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
