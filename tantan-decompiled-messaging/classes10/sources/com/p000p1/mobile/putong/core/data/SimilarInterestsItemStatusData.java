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
public class SimilarInterestsItemStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemstatusdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String icon;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<SimilarInterestsItemStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemStatusData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsItemStatusData similarInterestsItemStatusData) {
            String str = similarInterestsItemStatusData.subTitle;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, similarInterestsItemStatusData.isSelected);
            ((MessageNano) similarInterestsItemStatusData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemStatusData m15648parse(nb5 nb5Var) throws IOException {
            SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsItemStatusData.subTitle == null) {
                        similarInterestsItemStatusData.subTitle = "";
                    }
                    if (similarInterestsItemStatusData.title == null) {
                        similarInterestsItemStatusData.title = "";
                    }
                    if (similarInterestsItemStatusData.icon != null) {
                        break;
                    }
                    similarInterestsItemStatusData.icon = "";
                    break;
                }
                if (iU == 10) {
                    similarInterestsItemStatusData.subTitle = nb5Var.s();
                } else if (iU == 18) {
                    similarInterestsItemStatusData.title = nb5Var.s();
                } else if (iU == 26) {
                    similarInterestsItemStatusData.icon = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (similarInterestsItemStatusData.subTitle == null) {
                            similarInterestsItemStatusData.subTitle = "";
                        }
                        if (similarInterestsItemStatusData.title == null) {
                            similarInterestsItemStatusData.title = "";
                        }
                        if (similarInterestsItemStatusData.icon != null) {
                            break;
                        }
                        similarInterestsItemStatusData.icon = "";
                        return similarInterestsItemStatusData;
                    }
                    similarInterestsItemStatusData.isSelected = nb5Var.g();
                }
            }
            return similarInterestsItemStatusData;
        }

        public void serialize(SimilarInterestsItemStatusData similarInterestsItemStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemStatusData.subTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, similarInterestsItemStatusData.isSelected);
        }
    };
    public static JsonAdapter<SimilarInterestsItemStatusData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemStatusData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData.2
        public Class getDataClass() {
            return SimilarInterestsItemStatusData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsItemStatusData m15649newInstance() {
            return new SimilarInterestsItemStatusData();
        }

        public boolean parseField(SimilarInterestsItemStatusData similarInterestsItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    similarInterestsItemStatusData.subTitle = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    similarInterestsItemStatusData.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    similarInterestsItemStatusData.title = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    similarInterestsItemStatusData.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsItemStatusData similarInterestsItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "icon":
                case "title":
                case "isSelected":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsItemStatusData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SimilarInterestsItemStatusData similarInterestsItemStatusData, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemStatusData.subTitle;
            if (str != null) {
                jsonGenerator.writeStringField("subTitle", str);
            }
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
            jsonGenerator.writeBooleanField("isSelected", similarInterestsItemStatusData.isSelected);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemStatusData new_() {
        SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
        similarInterestsItemStatusData.nullCheck();
        return similarInterestsItemStatusData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsItemStatusData m15647clone() {
        SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
        similarInterestsItemStatusData.subTitle = this.subTitle;
        similarInterestsItemStatusData.title = this.title;
        similarInterestsItemStatusData.icon = this.icon;
        similarInterestsItemStatusData.isSelected = this.isSelected;
        return similarInterestsItemStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemStatusData)) {
            return false;
        }
        SimilarInterestsItemStatusData similarInterestsItemStatusData = (SimilarInterestsItemStatusData) obj;
        return ValueObject.util_equals(this.subTitle, similarInterestsItemStatusData.subTitle) && ValueObject.util_equals(this.title, similarInterestsItemStatusData.title) && ValueObject.util_equals(this.icon, similarInterestsItemStatusData.icon) && this.isSelected == similarInterestsItemStatusData.isSelected;
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
        String str = this.subTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
