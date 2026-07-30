package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.EmojiCacheItem;
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
import java.util.Collections;
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiCacheData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojicachedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, EmojiCacheItem> key;
    public static ProtobufAdapter<EmojiCacheData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiCacheData>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiCacheData emojiCacheData) {
            Map<String, EmojiCacheItem> map = emojiCacheData.key;
            int iM17230l = map != null ? CodedOutputByteBufferNano.m17230l(1, map, EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER()) : 0;
            emojiCacheData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiCacheData parse(nb5 nb5Var) throws IOException {
            EmojiCacheData emojiCacheData = new EmojiCacheData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (emojiCacheData.key != null) {
                        break;
                    }
                    emojiCacheData.key = Collections.EMPTY_MAP;
                    break;
                }
                if (iM158752u != 10) {
                    if (emojiCacheData.key != null) {
                        break;
                    }
                    emojiCacheData.key = Collections.EMPTY_MAP;
                    return emojiCacheData;
                }
                emojiCacheData.key = (Map) nb5Var.m158743l(EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            return emojiCacheData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiCacheData emojiCacheData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, EmojiCacheItem> map = emojiCacheData.key;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(1, map, EmojiCacheItem.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiCacheData> JSON_ADAPTER = new ObjectJsonAdapter<EmojiCacheData>() { // from class: com.p1.mobile.putong.core.data.EmojiCacheData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiCacheData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiCacheData newInstance() {
            return new EmojiCacheData();
        }

        public boolean parseField(EmojiCacheData emojiCacheData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Constants.KEY_KEY)) {
                return false;
            }
            emojiCacheData.key = JsonAdapter.parseMap(jsonParser, EmojiCacheItem.JSON_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(EmojiCacheData emojiCacheData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
                return true;
            }
            return super.parseFieldCheck(emojiCacheData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiCacheData emojiCacheData, JsonGenerator jsonGenerator) throws IOException {
            if (emojiCacheData.key != null) {
                jsonGenerator.writeFieldName(Constants.KEY_KEY);
                JsonAdapter.serializeMap(emojiCacheData.key, jsonGenerator, EmojiCacheItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiCacheData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return emojiCacheData;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiCacheData mo223809clone() {
        EmojiCacheData emojiCacheData = new EmojiCacheData();
        Map<String, EmojiCacheItem> map = this.key;
        if (map != null) {
            emojiCacheData.key = ValueObject.util_map(map, new w9j() { // from class: l.axe
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((EmojiCacheItem) obj).mo223809clone();
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
        Map<String, EmojiCacheItem> map = this.key;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
