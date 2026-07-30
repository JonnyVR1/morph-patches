package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.EmojiItem;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class EmojiType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emojitype";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<EmojiItem> items;

    @NonNull
    @ProtobufIndex(index = 1)
    public EmojiCatgoryName name;
    public static ProtobufAdapter<EmojiType> PROTOBUF_ADAPTER = new MessageNanoAdapter<EmojiType>() { // from class: com.p1.mobile.putong.data.EmojiType.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EmojiType emojiType) {
            EmojiCatgoryName emojiCatgoryName = emojiType.name;
            int iL = emojiCatgoryName != null ? CodedOutputByteBufferNano.l(1, emojiCatgoryName, EmojiCatgoryName.PROTOBUF_ADAPTER) : 0;
            List<EmojiItem> list = emojiType.items;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) emojiType).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EmojiType m18016parse(nb5 nb5Var) throws IOException {
            EmojiType emojiType = new EmojiType();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (emojiType.name == null) {
                        emojiType.name = EmojiCatgoryName.new_();
                    }
                    if (emojiType.items != null) {
                        break;
                    }
                    emojiType.items = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    emojiType.name = (EmojiCatgoryName) nb5Var.l(EmojiCatgoryName.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (emojiType.name == null) {
                            emojiType.name = EmojiCatgoryName.new_();
                        }
                        if (emojiType.items != null) {
                            break;
                        }
                        emojiType.items = new ArrayList();
                        return emojiType;
                    }
                    emojiType.items = (List) nb5Var.l(EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return emojiType;
        }

        public void serialize(EmojiType emojiType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            EmojiCatgoryName emojiCatgoryName = emojiType.name;
            if (emojiCatgoryName != null) {
                codedOutputByteBufferNano.K(1, emojiCatgoryName, EmojiCatgoryName.PROTOBUF_ADAPTER);
            }
            List<EmojiItem> list = emojiType.items;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiType> JSON_ADAPTER = new ObjectJsonAdapter<EmojiType>() { // from class: com.p1.mobile.putong.data.EmojiType.2
        public Class getDataClass() {
            return EmojiType.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public EmojiType mo17830newInstance() {
            return new EmojiType();
        }

        public boolean parseField(EmojiType emojiType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("name")) {
                emojiType.name = (EmojiCatgoryName) EmojiCatgoryName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("items")) {
                return false;
            }
            emojiType.items = JsonAdapter.parseArray(jsonParser, EmojiItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(EmojiType emojiType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name") || str.equals("items")) {
                return true;
            }
            return super.parseFieldCheck(emojiType, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiType emojiType, JsonGenerator jsonGenerator) throws IOException {
            if (emojiType.name != null) {
                jsonGenerator.writeFieldName("name");
                EmojiCatgoryName.JSON_ADAPTER.serialize(emojiType.name, jsonGenerator, true);
            }
            if (emojiType.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(emojiType.items, jsonGenerator, EmojiItem.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiType new_() {
        EmojiType emojiType = new EmojiType();
        emojiType.nullCheck();
        return emojiType;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EmojiType m18015clone() {
        EmojiType emojiType = new EmojiType();
        EmojiCatgoryName emojiCatgoryName = this.name;
        if (emojiCatgoryName != null) {
            emojiType.name = emojiCatgoryName.m18009clone();
        }
        List<EmojiItem> list = this.items;
        if (list != null) {
            emojiType.items = ValueObject.util_map(list, new w9j() { // from class: l.jye
                public final Object call(Object obj) {
                    return ((EmojiItem) obj).m18012clone();
                }
            });
        }
        return emojiType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmojiType)) {
            return false;
        }
        EmojiType emojiType = (EmojiType) obj;
        return ValueObject.util_equals(this.name, emojiType.name) && ValueObject.util_equals(this.items, emojiType.items);
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
        EmojiCatgoryName emojiCatgoryName = this.name;
        int iHashCode = (i2 + (emojiCatgoryName != null ? emojiCatgoryName.hashCode() : 0)) * 41;
        List<EmojiItem> list = this.items;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = EmojiCatgoryName.new_();
        }
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
