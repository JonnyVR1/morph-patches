package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Reason;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecommendInfo recommendInfo) {
            String str = recommendInfo.category;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            InAppPromptRecommendInfo inAppPromptRecommendInfo = recommendInfo.inAppPrompt;
            if (inAppPromptRecommendInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, inAppPromptRecommendInfo, InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
            }
            recommendInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecommendInfo parse(nc5 nc5Var) throws IOException {
            RecommendInfo recommendInfo = new RecommendInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recommendInfo.category == null) {
                        recommendInfo.category = "";
                    }
                    if (recommendInfo.reason != null) {
                        break;
                    }
                    recommendInfo.reason = "";
                    break;
                }
                if (iM162497u == 10) {
                    recommendInfo.category = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    recommendInfo.reason = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (recommendInfo.category == null) {
                            recommendInfo.category = "";
                        }
                        if (recommendInfo.reason != null) {
                            break;
                        }
                        recommendInfo.reason = "";
                        return recommendInfo;
                    }
                    recommendInfo.inAppPrompt = (InAppPromptRecommendInfo) nc5Var.m162488l(InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
                }
            }
            return recommendInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecommendInfo recommendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommendInfo.category;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            InAppPromptRecommendInfo inAppPromptRecommendInfo = recommendInfo.inAppPrompt;
            if (inAppPromptRecommendInfo != null) {
                codedOutputByteBufferNano.m17309K(3, inAppPromptRecommendInfo, InAppPromptRecommendInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecommendInfo> JSON_ADAPTER = new ObjectJsonAdapter<RecommendInfo>() { // from class: com.p1.mobile.putong.data.RecommendInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecommendInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecommendInfo newInstance() {
            return new RecommendInfo();
        }

        public boolean parseField(RecommendInfo recommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    recommendInfo.reason = jsonParser.getValueAsString();
                    return true;
                case "inAppPrompt":
                    recommendInfo.inAppPrompt = InAppPromptRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendInfo recommendInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = recommendInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = recommendInfo.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str2);
            }
            if (recommendInfo.inAppPrompt != null) {
                jsonGenerator.writeFieldName("inAppPrompt");
                InAppPromptRecommendInfo.JSON_ADAPTER.serialize(recommendInfo.inAppPrompt, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendInfo new_() {
        RecommendInfo recommendInfo = new RecommendInfo();
        recommendInfo.nullCheck();
        return recommendInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecommendInfo mo225055clone() {
        RecommendInfo recommendInfo = new RecommendInfo();
        recommendInfo.category = this.category;
        recommendInfo.reason = this.reason;
        InAppPromptRecommendInfo inAppPromptRecommendInfo = this.inAppPrompt;
        if (inAppPromptRecommendInfo != null) {
            recommendInfo.inAppPrompt = inAppPromptRecommendInfo.mo225055clone();
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        InAppPromptRecommendInfo inAppPromptRecommendInfo = this.inAppPrompt;
        int iHashCode3 = iHashCode2 + (inAppPromptRecommendInfo != null ? inAppPromptRecommendInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
