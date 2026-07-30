package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.EmojiCacheItem;
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
import java.util.Collections;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class EmojiCacheData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicachedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, EmojiCacheItem> key;
    public static ProtobufAdapter<EmojiCacheData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCacheData>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiCacheData emojiCacheData) {
            Map<String, EmojiCacheItem> map = emojiCacheData.key;
            int iL = map != null ? CodedOutputByteBufferNano.l(1, map, EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER()) : 0;
            ((MessageNano) emojiCacheData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData m12645parse(nb5 nb5Var) throws IOException {
            EmojiCacheData emojiCacheData = new EmojiCacheData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (emojiCacheData.key != null) {
                        break;
                    }
                    emojiCacheData.key = Collections.EMPTY_MAP;
                    break;
                }
                if (iU != 10) {
                    if (emojiCacheData.key != null) {
                        break;
                    }
                    emojiCacheData.key = Collections.EMPTY_MAP;
                    return emojiCacheData;
                }
                emojiCacheData.key = (Map) nb5Var.l(EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            return emojiCacheData;
        }

        public void serialize(EmojiCacheData emojiCacheData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, EmojiCacheItem> map = emojiCacheData.key;
            if (map != null) {
                codedOutputByteBufferNano.K(1, map, EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiCacheData> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCacheData>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheData.2
        public Class getDataClass() {
            return EmojiCacheData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public EmojiCacheData m12646newInstance() {
            return new EmojiCacheData();
        }

        public boolean parseField(EmojiCacheData emojiCacheData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("key")) {
                return false;
            }
            emojiCacheData.key = JsonAdapter.parseMap(jsonParser, EmojiCacheItem.JSON_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(EmojiCacheData emojiCacheData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key")) {
                return true;
            }
            return super.parseFieldCheck(emojiCacheData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(EmojiCacheData emojiCacheData, JsonGenerator jsonGenerator) throws IOException {
            if (emojiCacheData.key != null) {
                jsonGenerator.writeFieldName("key");
                JsonAdapter.serializeMap(emojiCacheData.key, jsonGenerator, EmojiCacheItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCacheData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiCacheData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiCacheData new_() {
        EmojiCacheData emojiCacheData = new EmojiCacheData();
        emojiCacheData.nullCheck();
        return emojiCacheData;
    }

    public static EmojiCacheData parse(String str, EmojiCacheData emojiCacheData) {
        try {
            return (EmojiCacheData) JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return emojiCacheData;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiCacheData m12644clone() {
        EmojiCacheData emojiCacheData = new EmojiCacheData();
        Map<String, EmojiCacheItem> map = this.key;
        if (map != null) {
            emojiCacheData.key = ValueObject.util_map(map, new w9j() { // from class: l.axe
                public final Object call(Object obj) {
                    return ((EmojiCacheItem) obj).m12648clone();
                }
            });
        }
        return emojiCacheData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EmojiCacheData) {
            return ValueObject.util_equals(this.key, ((EmojiCacheData) obj).key);
        }
        return false;
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
        Map<String, EmojiCacheItem> map = this.key;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
