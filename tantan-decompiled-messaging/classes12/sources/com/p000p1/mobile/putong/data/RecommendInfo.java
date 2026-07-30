package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RecommendInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommendinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @Nullable
    @ProtobufIndex(index = 3)
    public InAppPromptRecommendInfo inAppPrompt;

    @NonNull
    @ProtobufIndex(index = 2)
    public String reason;
    public static ProtobufAdapter<RecommendInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecommendInfo>() { // from class: com.p1.mobile.putong.data.RecommendInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecommendInfo recommendInfo) {
            String str = recommendInfo.category;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            InAppPromptRecommendInfo inAppPromptRecommendInfo = recommendInfo.inAppPrompt;
            if (inAppPromptRecommendInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, inAppPromptRecommendInfo, InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) recommendInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecommendInfo m18872parse(nb5 nb5Var) throws IOException {
            RecommendInfo recommendInfo = new RecommendInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recommendInfo.category == null) {
                        recommendInfo.category = "";
                    }
                    if (recommendInfo.reason != null) {
                        break;
                    }
                    recommendInfo.reason = "";
                    break;
                }
                if (iU == 10) {
                    recommendInfo.category = nb5Var.s();
                } else if (iU == 18) {
                    recommendInfo.reason = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (recommendInfo.category == null) {
                            recommendInfo.category = "";
                        }
                        if (recommendInfo.reason != null) {
                            break;
                        }
                        recommendInfo.reason = "";
                        return recommendInfo;
                    }
                    recommendInfo.inAppPrompt = (InAppPromptRecommendInfo) nb5Var.l(InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
                }
            }
            return recommendInfo;
        }

        public void serialize(RecommendInfo recommendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommendInfo.category;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            InAppPromptRecommendInfo inAppPromptRecommendInfo = recommendInfo.inAppPrompt;
            if (inAppPromptRecommendInfo != null) {
                codedOutputByteBufferNano.K(3, inAppPromptRecommendInfo, InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecommendInfo> JSON_ADAPTER = new ObjectJsonAdapter<RecommendInfo>() { // from class: com.p1.mobile.putong.data.RecommendInfo.2
        public Class getDataClass() {
            return RecommendInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RecommendInfo mo17830newInstance() {
            return new RecommendInfo();
        }

        public boolean parseField(RecommendInfo recommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    recommendInfo.reason = jsonParser.getValueAsString();
                    return true;
                case "inAppPrompt":
                    recommendInfo.inAppPrompt = (InAppPromptRecommendInfo) InAppPromptRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    recommendInfo.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecommendInfo recommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "inAppPrompt":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(recommendInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendInfo recommendInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = recommendInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField("reason", str2);
            }
            if (recommendInfo.inAppPrompt != null) {
                jsonGenerator.writeFieldName("inAppPrompt");
                InAppPromptRecommendInfo.JSON_ADAPTER.serialize(recommendInfo.inAppPrompt, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendInfo new_() {
        RecommendInfo recommendInfo = new RecommendInfo();
        recommendInfo.nullCheck();
        return recommendInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecommendInfo m18871clone() {
        RecommendInfo recommendInfo = new RecommendInfo();
        recommendInfo.category = this.category;
        recommendInfo.reason = this.reason;
        InAppPromptRecommendInfo inAppPromptRecommendInfo = this.inAppPrompt;
        if (inAppPromptRecommendInfo != null) {
            recommendInfo.inAppPrompt = inAppPromptRecommendInfo.m18219clone();
        }
        return recommendInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendInfo)) {
            return false;
        }
        RecommendInfo recommendInfo = (RecommendInfo) obj;
        return ValueObject.util_equals(this.category, recommendInfo.category) && ValueObject.util_equals(this.reason, recommendInfo.reason) && ValueObject.util_equals(this.inAppPrompt, recommendInfo.inAppPrompt);
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        InAppPromptRecommendInfo inAppPromptRecommendInfo = this.inAppPrompt;
        int iHashCode3 = iHashCode2 + (inAppPromptRecommendInfo != null ? inAppPromptRecommendInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
