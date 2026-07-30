package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.EmojiAnimData;
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
public class EmojiAnimData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojianimdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, Double> emojiAnimCreatedTime;
    public static ProtobufAdapter<EmojiAnimData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiAnimData>() { // from class: com.p1.mobile.putong.core.data.EmojiAnimData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiAnimData emojiAnimData) {
            Map<String, Double> map = emojiAnimData.emojiAnimCreatedTime;
            int iL = map != null ? CodedOutputByteBufferNano.l(1, map, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER()) : 0;
            ((MessageNano) emojiAnimData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData m12641parse(nb5 nb5Var) throws IOException {
            EmojiAnimData emojiAnimData = new EmojiAnimData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (emojiAnimData.emojiAnimCreatedTime != null) {
                        break;
                    }
                    emojiAnimData.emojiAnimCreatedTime = Collections.EMPTY_MAP;
                    break;
                }
                if (iU != 10) {
                    if (emojiAnimData.emojiAnimCreatedTime != null) {
                        break;
                    }
                    emojiAnimData.emojiAnimCreatedTime = Collections.EMPTY_MAP;
                    return emojiAnimData;
                }
                emojiAnimData.emojiAnimCreatedTime = (Map) nb5Var.l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER());
            }
            return emojiAnimData;
        }

        public void serialize(EmojiAnimData emojiAnimData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, Double> map = emojiAnimData.emojiAnimCreatedTime;
            if (map != null) {
                codedOutputByteBufferNano.K(1, map, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiAnimData> JSON_ADAPTER = new ObjectJsonAdapter<EmojiAnimData>() { // from class: com.p1.mobile.putong.core.data.EmojiAnimData.2
        public Class getDataClass() {
            return EmojiAnimData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public EmojiAnimData m12642newInstance() {
            return new EmojiAnimData();
        }

        public boolean parseField(EmojiAnimData emojiAnimData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("emojiAnimCreatedTime")) {
                return false;
            }
            emojiAnimData.emojiAnimCreatedTime = JsonAdapter.parseMap(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(EmojiAnimData emojiAnimData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("emojiAnimCreatedTime")) {
                return true;
            }
            return super.parseFieldCheck(emojiAnimData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(EmojiAnimData emojiAnimData, JsonGenerator jsonGenerator) throws IOException {
            if (emojiAnimData.emojiAnimCreatedTime != null) {
                jsonGenerator.writeFieldName("emojiAnimCreatedTime");
                JsonAdapter.serializeMap(emojiAnimData.emojiAnimCreatedTime, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiAnimData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiAnimData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m316a(Double d) {
        return d;
    }

    public static EmojiAnimData new_() {
        EmojiAnimData emojiAnimData = new EmojiAnimData();
        emojiAnimData.nullCheck();
        return emojiAnimData;
    }

    public static EmojiAnimData parse(String str, EmojiAnimData emojiAnimData) {
        try {
            return (EmojiAnimData) JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return emojiAnimData;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiAnimData m12640clone() {
        EmojiAnimData emojiAnimData = new EmojiAnimData();
        Map<String, Double> map = this.emojiAnimCreatedTime;
        if (map != null) {
            emojiAnimData.emojiAnimCreatedTime = ValueObject.util_map(map, new w9j() { // from class: l.zwe
                public final Object call(Object obj) {
                    return EmojiAnimData.m316a((Double) obj);
                }
            });
        }
        return emojiAnimData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EmojiAnimData) {
            return ValueObject.util_equals(this.emojiAnimCreatedTime, ((EmojiAnimData) obj).emojiAnimCreatedTime);
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
        Map<String, Double> map = this.emojiAnimCreatedTime;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.emojiAnimCreatedTime == null) {
            this.emojiAnimCreatedTime = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
