package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LikeMindedItemLanguagesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemlanguagesdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LikeMindedItemStatusData status;

    @NonNull
    @ProtobufIndex(index = 1)
    public LikeMindedItemSwipeData swipe;
    public static ProtobufAdapter<LikeMindedItemLanguagesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemLanguagesData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedItemLanguagesData likeMindedItemLanguagesData) {
            LikeMindedItemSwipeData likeMindedItemSwipeData = likeMindedItemLanguagesData.swipe;
            int iL = likeMindedItemSwipeData != null ? CodedOutputByteBufferNano.l(1, likeMindedItemSwipeData, LikeMindedItemSwipeData.PROTOBUF_ADAPTER) : 0;
            LikeMindedItemStatusData likeMindedItemStatusData = likeMindedItemLanguagesData.status;
            if (likeMindedItemStatusData != null) {
                iL += CodedOutputByteBufferNano.l(2, likeMindedItemStatusData, LikeMindedItemStatusData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) likeMindedItemLanguagesData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemLanguagesData m13855parse(nb5 nb5Var) throws IOException {
            LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedItemLanguagesData.swipe == null) {
                        likeMindedItemLanguagesData.swipe = LikeMindedItemSwipeData.new_();
                    }
                    if (likeMindedItemLanguagesData.status != null) {
                        break;
                    }
                    likeMindedItemLanguagesData.status = LikeMindedItemStatusData.new_();
                    break;
                }
                if (iU == 10) {
                    likeMindedItemLanguagesData.swipe = (LikeMindedItemSwipeData) nb5Var.l(LikeMindedItemSwipeData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (likeMindedItemLanguagesData.swipe == null) {
                            likeMindedItemLanguagesData.swipe = LikeMindedItemSwipeData.new_();
                        }
                        if (likeMindedItemLanguagesData.status != null) {
                            break;
                        }
                        likeMindedItemLanguagesData.status = LikeMindedItemStatusData.new_();
                        return likeMindedItemLanguagesData;
                    }
                    likeMindedItemLanguagesData.status = (LikeMindedItemStatusData) nb5Var.l(LikeMindedItemStatusData.PROTOBUF_ADAPTER);
                }
            }
            return likeMindedItemLanguagesData;
        }

        public void serialize(LikeMindedItemLanguagesData likeMindedItemLanguagesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LikeMindedItemSwipeData likeMindedItemSwipeData = likeMindedItemLanguagesData.swipe;
            if (likeMindedItemSwipeData != null) {
                codedOutputByteBufferNano.K(1, likeMindedItemSwipeData, LikeMindedItemSwipeData.PROTOBUF_ADAPTER);
            }
            LikeMindedItemStatusData likeMindedItemStatusData = likeMindedItemLanguagesData.status;
            if (likeMindedItemStatusData != null) {
                codedOutputByteBufferNano.K(2, likeMindedItemStatusData, LikeMindedItemStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemLanguagesData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemLanguagesData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemLanguagesData.2
        public Class getDataClass() {
            return LikeMindedItemLanguagesData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemLanguagesData m13856newInstance() {
            return new LikeMindedItemLanguagesData();
        }

        public boolean parseField(LikeMindedItemLanguagesData likeMindedItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                likeMindedItemLanguagesData.status = (LikeMindedItemStatusData) LikeMindedItemStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipe")) {
                return false;
            }
            likeMindedItemLanguagesData.swipe = (LikeMindedItemSwipeData) LikeMindedItemSwipeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LikeMindedItemLanguagesData likeMindedItemLanguagesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status") || str.equals("swipe")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedItemLanguagesData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikeMindedItemLanguagesData likeMindedItemLanguagesData, JsonGenerator jsonGenerator) throws IOException {
            if (likeMindedItemLanguagesData.swipe != null) {
                jsonGenerator.writeFieldName("swipe");
                LikeMindedItemSwipeData.JSON_ADAPTER.serialize(likeMindedItemLanguagesData.swipe, jsonGenerator, true);
            }
            if (likeMindedItemLanguagesData.status != null) {
                jsonGenerator.writeFieldName("status");
                LikeMindedItemStatusData.JSON_ADAPTER.serialize(likeMindedItemLanguagesData.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemLanguagesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemLanguagesData new_() {
        LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
        likeMindedItemLanguagesData.nullCheck();
        return likeMindedItemLanguagesData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedItemLanguagesData m13854clone() {
        LikeMindedItemLanguagesData likeMindedItemLanguagesData = new LikeMindedItemLanguagesData();
        LikeMindedItemSwipeData likeMindedItemSwipeData = this.swipe;
        if (likeMindedItemSwipeData != null) {
            likeMindedItemLanguagesData.swipe = likeMindedItemSwipeData.m13862clone();
        }
        LikeMindedItemStatusData likeMindedItemStatusData = this.status;
        if (likeMindedItemStatusData != null) {
            likeMindedItemLanguagesData.status = likeMindedItemStatusData.m13858clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        LikeMindedItemSwipeData likeMindedItemSwipeData = this.swipe;
        int iHashCode = (i2 + (likeMindedItemSwipeData != null ? likeMindedItemSwipeData.hashCode() : 0)) * 41;
        LikeMindedItemStatusData likeMindedItemStatusData = this.status;
        int iHashCode2 = iHashCode + (likeMindedItemStatusData != null ? likeMindedItemStatusData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.swipe == null) {
            this.swipe = LikeMindedItemSwipeData.new_();
        }
        if (this.status == null) {
            this.status = LikeMindedItemStatusData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
