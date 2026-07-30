package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.EmojiItem;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(EmojiType emojiType) {
            EmojiCatgoryName emojiCatgoryName = emojiType.name;
            int iM17285l = emojiCatgoryName != null ? CodedOutputByteBufferNano.m17285l(1, emojiCatgoryName, EmojiCatgoryName.PROTOBUF_ADAPTER) : 0;
            List<EmojiItem> list = emojiType.items;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            emojiType.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public EmojiType parse(nc5 nc5Var) throws IOException {
            EmojiType emojiType = new EmojiType();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (emojiType.name == null) {
                        emojiType.name = EmojiCatgoryName.new_();
                    }
                    if (emojiType.items != null) {
                        break;
                    }
                    emojiType.items = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    emojiType.name = (EmojiCatgoryName) nc5Var.m162488l(EmojiCatgoryName.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (emojiType.name == null) {
                            emojiType.name = EmojiCatgoryName.new_();
                        }
                        if (emojiType.items != null) {
                            break;
                        }
                        emojiType.items = new ArrayList();
                        return emojiType;
                    }
                    emojiType.items = (List) nc5Var.m162488l(EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return emojiType;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(EmojiType emojiType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            EmojiCatgoryName emojiCatgoryName = emojiType.name;
            if (emojiCatgoryName != null) {
                codedOutputByteBufferNano.m17309K(1, emojiCatgoryName, EmojiCatgoryName.PROTOBUF_ADAPTER);
            }
            List<EmojiItem> list = emojiType.items;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, EmojiItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EmojiType> JSON_ADAPTER = new ObjectJsonAdapter<EmojiType>() { // from class: com.p1.mobile.putong.data.EmojiType.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return EmojiType.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public EmojiType newInstance() {
            return new EmojiType();
        }

        public boolean parseField(EmojiType emojiType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                emojiType.name = EmojiCatgoryName.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return false;
            }
            emojiType.items = JsonAdapter.parseArray(jsonParser, EmojiItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(EmojiType emojiType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) || str.equals(FirebaseAnalytics.Param.ITEMS)) {
                return true;
            }
            return super.parseFieldCheck(emojiType, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(EmojiType emojiType, JsonGenerator jsonGenerator) throws IOException {
            if (emojiType.name != null) {
                jsonGenerator.writeFieldName(AuthenticationTokenClaims.JSON_KEY_NAME);
                EmojiCatgoryName.JSON_ADAPTER.serialize(emojiType.name, jsonGenerator, true);
            }
            if (emojiType.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(emojiType.items, jsonGenerator, EmojiItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EmojiType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EmojiType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static EmojiType new_() {
        EmojiType emojiType = new EmojiType();
        emojiType.nullCheck();
        return emojiType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public EmojiType mo225055clone() {
        EmojiType emojiType = new EmojiType();
        EmojiCatgoryName emojiCatgoryName = this.name;
        if (emojiCatgoryName != null) {
            emojiType.name = emojiCatgoryName.mo225055clone();
        }
        List<EmojiItem> list = this.items;
        if (list != null) {
            emojiType.items = ValueObject.util_map(list, new qcj() { // from class: l.nze
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((EmojiItem) obj).mo225055clone();
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
        EmojiCatgoryName emojiCatgoryName = this.name;
        int iHashCode = (i2 + (emojiCatgoryName != null ? emojiCatgoryName.hashCode() : 0)) * 41;
        List<EmojiItem> list = this.items;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = EmojiCatgoryName.new_();
        }
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
