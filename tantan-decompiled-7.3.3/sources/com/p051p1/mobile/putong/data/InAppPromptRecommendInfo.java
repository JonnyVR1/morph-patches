package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class InAppPromptRecommendInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inapppromptrecommendinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<InAppPromptRecommendInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<InAppPromptRecommendInfo>() { // from class: com.p1.mobile.putong.data.InAppPromptRecommendInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InAppPromptRecommendInfo inAppPromptRecommendInfo) {
            String str = inAppPromptRecommendInfo.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = inAppPromptRecommendInfo.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            inAppPromptRecommendInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InAppPromptRecommendInfo parse(nc5 nc5Var) throws IOException {
            InAppPromptRecommendInfo inAppPromptRecommendInfo = new InAppPromptRecommendInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (inAppPromptRecommendInfo.title == null) {
                        inAppPromptRecommendInfo.title = "";
                    }
                    if (inAppPromptRecommendInfo.subTitle != null) {
                        break;
                    }
                    inAppPromptRecommendInfo.subTitle = "";
                    break;
                }
                if (iM162497u == 10) {
                    inAppPromptRecommendInfo.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (inAppPromptRecommendInfo.title == null) {
                            inAppPromptRecommendInfo.title = "";
                        }
                        if (inAppPromptRecommendInfo.subTitle != null) {
                            break;
                        }
                        inAppPromptRecommendInfo.subTitle = "";
                        return inAppPromptRecommendInfo;
                    }
                    inAppPromptRecommendInfo.subTitle = nc5Var.m162495s();
                }
            }
            return inAppPromptRecommendInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InAppPromptRecommendInfo inAppPromptRecommendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inAppPromptRecommendInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = inAppPromptRecommendInfo.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<InAppPromptRecommendInfo> JSON_ADAPTER = new ObjectJsonAdapter<InAppPromptRecommendInfo>() { // from class: com.p1.mobile.putong.data.InAppPromptRecommendInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InAppPromptRecommendInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InAppPromptRecommendInfo newInstance() {
            return new InAppPromptRecommendInfo();
        }

        public boolean parseField(InAppPromptRecommendInfo inAppPromptRecommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                inAppPromptRecommendInfo.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            inAppPromptRecommendInfo.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(InAppPromptRecommendInfo inAppPromptRecommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subTitle") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(inAppPromptRecommendInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InAppPromptRecommendInfo inAppPromptRecommendInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = inAppPromptRecommendInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = inAppPromptRecommendInfo.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InAppPromptRecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InAppPromptRecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InAppPromptRecommendInfo new_() {
        InAppPromptRecommendInfo inAppPromptRecommendInfo = new InAppPromptRecommendInfo();
        inAppPromptRecommendInfo.nullCheck();
        return inAppPromptRecommendInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InAppPromptRecommendInfo mo225055clone() {
        InAppPromptRecommendInfo inAppPromptRecommendInfo = new InAppPromptRecommendInfo();
        inAppPromptRecommendInfo.title = this.title;
        inAppPromptRecommendInfo.subTitle = this.subTitle;
        return inAppPromptRecommendInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InAppPromptRecommendInfo)) {
            return false;
        }
        InAppPromptRecommendInfo inAppPromptRecommendInfo = (InAppPromptRecommendInfo) obj;
        return ValueObject.util_equals(this.title, inAppPromptRecommendInfo.title) && ValueObject.util_equals(this.subTitle, inAppPromptRecommendInfo.subTitle);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
