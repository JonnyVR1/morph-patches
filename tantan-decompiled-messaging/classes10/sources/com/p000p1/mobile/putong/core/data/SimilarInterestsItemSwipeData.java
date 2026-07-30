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
public class SimilarInterestsItemSwipeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemswipedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<SimilarInterestsItemSwipeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsItemSwipeData similarInterestsItemSwipeData) {
            String str = similarInterestsItemSwipeData.icon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) similarInterestsItemSwipeData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemSwipeData m15652parse(nb5 nb5Var) throws IOException {
            SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsItemSwipeData.icon == null) {
                        similarInterestsItemSwipeData.icon = "";
                    }
                    if (similarInterestsItemSwipeData.title != null) {
                        break;
                    }
                    similarInterestsItemSwipeData.title = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsItemSwipeData.icon = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (similarInterestsItemSwipeData.icon == null) {
                            similarInterestsItemSwipeData.icon = "";
                        }
                        if (similarInterestsItemSwipeData.title != null) {
                            break;
                        }
                        similarInterestsItemSwipeData.title = "";
                        return similarInterestsItemSwipeData;
                    }
                    similarInterestsItemSwipeData.title = nb5Var.s();
                }
            }
            return similarInterestsItemSwipeData;
        }

        public void serialize(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemSwipeData.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemSwipeData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData.2
        public Class getDataClass() {
            return SimilarInterestsItemSwipeData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemSwipeData m15653newInstance() {
            return new SimilarInterestsItemSwipeData();
        }

        public boolean parseField(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(HomeTabModuleTopicShowType.icon)) {
                similarInterestsItemSwipeData.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            similarInterestsItemSwipeData.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(HomeTabModuleTopicShowType.icon) || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsItemSwipeData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemSwipeData.icon;
            if (str != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str);
            }
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemSwipeData new_() {
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
        similarInterestsItemSwipeData.nullCheck();
        return similarInterestsItemSwipeData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsItemSwipeData m15651clone() {
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
        similarInterestsItemSwipeData.icon = this.icon;
        similarInterestsItemSwipeData.title = this.title;
        return similarInterestsItemSwipeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemSwipeData)) {
            return false;
        }
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = (SimilarInterestsItemSwipeData) obj;
        return ValueObject.util_equals(this.icon, similarInterestsItemSwipeData.icon) && ValueObject.util_equals(this.title, similarInterestsItemSwipeData.title);
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
