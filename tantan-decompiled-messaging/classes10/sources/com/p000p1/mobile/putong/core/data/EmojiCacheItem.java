package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Sticker;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class EmojiCacheItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicacheitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Sticker> dataList;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long useNumber;
    public static ProtobufAdapter<EmojiCacheItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCacheItem>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiCacheItem emojiCacheItem) {
            List<Sticker> list = emojiCacheItem.dataList;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.j(2, emojiCacheItem.useNumber);
            ((MessageNano) emojiCacheItem).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiCacheItem m12649parse(nb5 nb5Var) throws IOException {
            EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (emojiCacheItem.dataList != null) {
                        break;
                    }
                    emojiCacheItem.dataList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    emojiCacheItem.dataList = (List) nb5Var.l(Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (emojiCacheItem.dataList != null) {
                            break;
                        }
                        emojiCacheItem.dataList = new ArrayList();
                        return emojiCacheItem;
                    }
                    emojiCacheItem.useNumber = nb5Var.k();
                }
            }
            return emojiCacheItem;
        }

        public void serialize(EmojiCacheItem emojiCacheItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Sticker> list = emojiCacheItem.dataList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Sticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(2, emojiCacheItem.useNumber);
        }
    };
    public static JsonAdapter<EmojiCacheItem> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCacheItem>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheItem.2
        public Class getDataClass() {
            return EmojiCacheItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public EmojiCacheItem m12650newInstance() {
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

        public void serializeFields(EmojiCacheItem emojiCacheItem, JsonGenerator jsonGenerator) throws IOException {
            if (emojiCacheItem.dataList != null) {
                jsonGenerator.writeFieldName("dataList");
                JsonAdapter.serializeArray(emojiCacheItem.dataList, jsonGenerator, Sticker.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("useNumber", emojiCacheItem.useNumber);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCacheItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiCacheItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiCacheItem new_() {
        EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
        emojiCacheItem.nullCheck();
        return emojiCacheItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiCacheItem m12648clone() {
        EmojiCacheItem emojiCacheItem = new EmojiCacheItem();
        List<Sticker> list = this.dataList;
        if (list != null) {
            emojiCacheItem.dataList = ValueObject.util_map(list, new w9j() { // from class: l.cxe
                public final Object call(Object obj) {
                    return ((Sticker) obj).m15767clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Sticker> list = this.dataList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        long j = this.useNumber;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.dataList == null) {
            this.dataList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
