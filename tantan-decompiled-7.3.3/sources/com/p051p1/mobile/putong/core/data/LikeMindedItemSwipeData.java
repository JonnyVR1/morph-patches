package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class LikeMindedItemSwipeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemswipedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<LikeMindedItemSwipeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemSwipeData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedItemSwipeData likeMindedItemSwipeData) {
            String str = likeMindedItemSwipeData.icon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            likeMindedItemSwipeData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedItemSwipeData parse(nc5 nc5Var) throws IOException {
            LikeMindedItemSwipeData likeMindedItemSwipeData = new LikeMindedItemSwipeData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedItemSwipeData.icon == null) {
                        likeMindedItemSwipeData.icon = "";
                    }
                    if (likeMindedItemSwipeData.title != null) {
                        break;
                    }
                    likeMindedItemSwipeData.title = "";
                    break;
                }
                if (iM162497u == 10) {
                    likeMindedItemSwipeData.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (likeMindedItemSwipeData.icon == null) {
                            likeMindedItemSwipeData.icon = "";
                        }
                        if (likeMindedItemSwipeData.title != null) {
                            break;
                        }
                        likeMindedItemSwipeData.title = "";
                        return likeMindedItemSwipeData;
                    }
                    likeMindedItemSwipeData.title = nc5Var.m162495s();
                }
            }
            return likeMindedItemSwipeData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedItemSwipeData likeMindedItemSwipeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemSwipeData.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemSwipeData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemSwipeData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedItemSwipeData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedItemSwipeData newInstance() {
            return new LikeMindedItemSwipeData();
        }

        public boolean parseField(LikeMindedItemSwipeData likeMindedItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("icon")) {
                likeMindedItemSwipeData.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            likeMindedItemSwipeData.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LikeMindedItemSwipeData likeMindedItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("icon") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedItemSwipeData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedItemSwipeData likeMindedItemSwipeData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedItemSwipeData.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemSwipeData new_() {
        LikeMindedItemSwipeData likeMindedItemSwipeData = new LikeMindedItemSwipeData();
        likeMindedItemSwipeData.nullCheck();
        return likeMindedItemSwipeData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedItemSwipeData mo225055clone() {
        LikeMindedItemSwipeData likeMindedItemSwipeData = new LikeMindedItemSwipeData();
        likeMindedItemSwipeData.icon = this.icon;
        likeMindedItemSwipeData.title = this.title;
        return likeMindedItemSwipeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedItemSwipeData)) {
            return false;
        }
        LikeMindedItemSwipeData likeMindedItemSwipeData = (LikeMindedItemSwipeData) obj;
        return ValueObject.util_equals(this.icon, likeMindedItemSwipeData.icon) && ValueObject.util_equals(this.title, likeMindedItemSwipeData.title);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
