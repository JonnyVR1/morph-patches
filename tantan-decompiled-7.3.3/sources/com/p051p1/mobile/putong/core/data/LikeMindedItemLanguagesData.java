package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class LikeMindedItemLanguagesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemlanguagesdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public LikeMindedItemStatusData status;

    @NonNull
    @ProtobufIndex(index = 1)
    public LikeMindedItemSwipeData swipe;
    public static ProtobufAdapter<LikeMindedItemLanguagesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemLanguagesData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedItemLanguagesData likeMindedItemLanguagesData) {
            LikeMindedItemSwipeData likeMindedItemSwipeData = likeMindedItemLanguagesData.swipe;
            int iM17285l = likeMindedItemSwipeData != null ? CodedOutputByteBufferNano.m17285l(1, likeMindedItemSwipeData, LikeMindedItemSwipeData.PROTOBUF_ADAPTER) : 0;
            LikeMindedItemStatusData likeMindedItemStatusData = likeMindedItemLanguagesData.status;
            if (likeMindedItemStatusData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, likeMindedItemStatusData, LikeMindedItemStatusData.PROTOBUF_ADAPTER);
            }
            likeMindedItemLanguagesData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedItemLanguagesData parse(nc5 nc5Var) throws IOException {
            LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedItemLanguagesData.swipe == null) {
                        likeMindedItemLanguagesData.swipe = LikeMindedItemSwipeData.new_();
                    }
                    if (likeMindedItemLanguagesData.status != null) {
                        break;
                    }
                    likeMindedItemLanguagesData.status = LikeMindedItemStatusData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    likeMindedItemLanguagesData.swipe = (LikeMindedItemSwipeData) nc5Var.m162488l(LikeMindedItemSwipeData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (likeMindedItemLanguagesData.swipe == null) {
                            likeMindedItemLanguagesData.swipe = LikeMindedItemSwipeData.new_();
                        }
                        if (likeMindedItemLanguagesData.status != null) {
                            break;
                        }
                        likeMindedItemLanguagesData.status = LikeMindedItemStatusData.new_();
                        return likeMindedItemLanguagesData;
                    }
                    likeMindedItemLanguagesData.status = (LikeMindedItemStatusData) nc5Var.m162488l(LikeMindedItemStatusData.PROTOBUF_ADAPTER);
                }
            }
            return likeMindedItemLanguagesData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedItemLanguagesData likeMindedItemLanguagesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LikeMindedItemSwipeData likeMindedItemSwipeData = likeMindedItemLanguagesData.swipe;
            if (likeMindedItemSwipeData != null) {
                codedOutputByteBufferNano.m17309K(1, likeMindedItemSwipeData, LikeMindedItemSwipeData.PROTOBUF_ADAPTER);
            }
            LikeMindedItemStatusData likeMindedItemStatusData = likeMindedItemLanguagesData.status;
            if (likeMindedItemStatusData != null) {
                codedOutputByteBufferNano.m17309K(2, likeMindedItemStatusData, LikeMindedItemStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemLanguagesData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemLanguagesData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedItemLanguagesData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedItemLanguagesData newInstance() {
            return new LikeMindedItemLanguagesData();
        }

        public boolean parseField(LikeMindedItemLanguagesData likeMindedItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                likeMindedItemLanguagesData.status = LikeMindedItemStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipe")) {
                return false;
            }
            likeMindedItemLanguagesData.swipe = LikeMindedItemSwipeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LikeMindedItemLanguagesData likeMindedItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS) || str.equals("swipe")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedItemLanguagesData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedItemLanguagesData likeMindedItemLanguagesData, JsonGenerator jsonGenerator) throws IOException {
            if (likeMindedItemLanguagesData.swipe != null) {
                jsonGenerator.writeFieldName("swipe");
                LikeMindedItemSwipeData.JSON_ADAPTER.serialize(likeMindedItemLanguagesData.swipe, jsonGenerator, true);
            }
            if (likeMindedItemLanguagesData.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                LikeMindedItemStatusData.JSON_ADAPTER.serialize(likeMindedItemLanguagesData.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemLanguagesData new_() {
        LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
        likeMindedItemLanguagesData.nullCheck();
        return likeMindedItemLanguagesData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedItemLanguagesData mo225055clone() {
        LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
        LikeMindedItemSwipeData likeMindedItemSwipeData = this.swipe;
        if (likeMindedItemSwipeData != null) {
            likeMindedItemLanguagesData.swipe = likeMindedItemSwipeData.mo225055clone();
        }
        LikeMindedItemStatusData likeMindedItemStatusData = this.status;
        if (likeMindedItemStatusData != null) {
            likeMindedItemLanguagesData.status = likeMindedItemStatusData.mo225055clone();
        }
        return likeMindedItemLanguagesData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedItemLanguagesData)) {
            return false;
        }
        LikeMindedItemLanguagesData likeMindedItemLanguagesData = (LikeMindedItemLanguagesData) obj;
        return ValueObject.util_equals(this.swipe, likeMindedItemLanguagesData.swipe) && ValueObject.util_equals(this.status, likeMindedItemLanguagesData.status);
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
        LikeMindedItemSwipeData likeMindedItemSwipeData = this.swipe;
        int iHashCode = (i2 + (likeMindedItemSwipeData != null ? likeMindedItemSwipeData.hashCode() : 0)) * 41;
        LikeMindedItemStatusData likeMindedItemStatusData = this.status;
        int iHashCode2 = iHashCode + (likeMindedItemStatusData != null ? likeMindedItemStatusData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.swipe == null) {
            this.swipe = LikeMindedItemSwipeData.new_();
        }
        if (this.status == null) {
            this.status = LikeMindedItemStatusData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
