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
public class LikeMindedItemSwipeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemswipedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<LikeMindedItemSwipeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemSwipeData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedItemSwipeData likeMindedItemSwipeData) {
            String str = likeMindedItemSwipeData.icon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) likeMindedItemSwipeData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemSwipeData m13863parse(nb5 nb5Var) throws IOException {
            LikeMindedItemSwipeData likeMindedItemSwipeData = new LikeMindedItemSwipeData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedItemSwipeData.icon == null) {
                        likeMindedItemSwipeData.icon = "";
                    }
                    if (likeMindedItemSwipeData.title != null) {
                        break;
                    }
                    likeMindedItemSwipeData.title = "";
                    break;
                }
                if (iU == 10) {
                    likeMindedItemSwipeData.icon = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (likeMindedItemSwipeData.icon == null) {
                            likeMindedItemSwipeData.icon = "";
                        }
                        if (likeMindedItemSwipeData.title != null) {
                            break;
                        }
                        likeMindedItemSwipeData.title = "";
                        return likeMindedItemSwipeData;
                    }
                    likeMindedItemSwipeData.title = nb5Var.s();
                }
            }
            return likeMindedItemSwipeData;
        }

        public void serialize(LikeMindedItemSwipeData likeMindedItemSwipeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemSwipeData.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemSwipeData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemSwipeData.2
        public Class getDataClass() {
            return LikeMindedItemSwipeData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemSwipeData m13864newInstance() {
            return new LikeMindedItemSwipeData();
        }

        public boolean parseField(LikeMindedItemSwipeData likeMindedItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(HomeTabModuleTopicShowType.icon)) {
                likeMindedItemSwipeData.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            likeMindedItemSwipeData.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LikeMindedItemSwipeData likeMindedItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(HomeTabModuleTopicShowType.icon) || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(likeMindedItemSwipeData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikeMindedItemSwipeData likeMindedItemSwipeData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedItemSwipeData.icon;
            if (str != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str);
            }
            String str2 = likeMindedItemSwipeData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemSwipeData new_() {
        LikeMindedItemSwipeData likeMindedItemSwipeData = new LikeMindedItemSwipeData();
        likeMindedItemSwipeData.nullCheck();
        return likeMindedItemSwipeData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedItemSwipeData m13862clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
