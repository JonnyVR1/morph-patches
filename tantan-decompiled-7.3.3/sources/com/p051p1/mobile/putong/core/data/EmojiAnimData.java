package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.EmojiAnimData;
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
import java.util.Collections;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiAnimData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojianimdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, Double> emojiAnimCreatedTime;
    public static ProtobufAdapter<EmojiAnimData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiAnimData>() { // from class: com.p1.mobile.putong.core.data.EmojiAnimData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiAnimData emojiAnimData) {
            Map<String, Double> map = emojiAnimData.emojiAnimCreatedTime;
            int iM17285l = map != null ? CodedOutputByteBufferNano.m17285l(1, map, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER()) : 0;
            emojiAnimData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiAnimData parse(nc5 nc5Var) throws IOException {
            EmojiAnimData emojiAnimData = new EmojiAnimData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (emojiAnimData.emojiAnimCreatedTime != null) {
                        break;
                    }
                    emojiAnimData.emojiAnimCreatedTime = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u != 10) {
                    if (emojiAnimData.emojiAnimCreatedTime != null) {
                        break;
                    }
                    emojiAnimData.emojiAnimCreatedTime = Collections.EMPTY_MAP;
                    return emojiAnimData;
                }
                emojiAnimData.emojiAnimCreatedTime = (Map) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER());
            }
            return emojiAnimData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiAnimData emojiAnimData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, Double> map = emojiAnimData.emojiAnimCreatedTime;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(1, map, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiAnimData> JSON_ADAPTER = new ObjectJsonAdapter<EmojiAnimData>() { // from class: com.p1.mobile.putong.core.data.EmojiAnimData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiAnimData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiAnimData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiAnimData emojiAnimData, JsonGenerator jsonGenerator) throws IOException {
            if (emojiAnimData.emojiAnimCreatedTime != null) {
                jsonGenerator.writeFieldName("emojiAnimCreatedTime");
                JsonAdapter.serializeMap(emojiAnimData.emojiAnimCreatedTime, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiAnimData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiAnimData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m36517a(Double d) {
        return d;
    }

    public static EmojiAnimData new_() {
        EmojiAnimData emojiAnimData = new EmojiAnimData();
        emojiAnimData.nullCheck();
        return emojiAnimData;
    }

    public static EmojiAnimData parse(String str, EmojiAnimData emojiAnimData) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return emojiAnimData;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiAnimData mo225055clone() {
        EmojiAnimData emojiAnimData = new EmojiAnimData();
        Map<String, Double> map = this.emojiAnimCreatedTime;
        if (map != null) {
            emojiAnimData.emojiAnimCreatedTime = ValueObject.util_map(map, new qcj() { // from class: l.dye
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return EmojiAnimData.m36517a((Double) obj);
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
        Map<String, Double> map = this.emojiAnimCreatedTime;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.emojiAnimCreatedTime == null) {
            this.emojiAnimCreatedTime = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
