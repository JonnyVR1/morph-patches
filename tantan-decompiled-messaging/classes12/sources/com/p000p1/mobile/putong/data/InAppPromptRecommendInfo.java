package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InAppPromptRecommendInfo inAppPromptRecommendInfo) {
            String str = inAppPromptRecommendInfo.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = inAppPromptRecommendInfo.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) inAppPromptRecommendInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InAppPromptRecommendInfo m18220parse(nb5 nb5Var) throws IOException {
            InAppPromptRecommendInfo inAppPromptRecommendInfo = new InAppPromptRecommendInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (inAppPromptRecommendInfo.title == null) {
                        inAppPromptRecommendInfo.title = "";
                    }
                    if (inAppPromptRecommendInfo.subTitle != null) {
                        break;
                    }
                    inAppPromptRecommendInfo.subTitle = "";
                    break;
                }
                if (iU == 10) {
                    inAppPromptRecommendInfo.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (inAppPromptRecommendInfo.title == null) {
                            inAppPromptRecommendInfo.title = "";
                        }
                        if (inAppPromptRecommendInfo.subTitle != null) {
                            break;
                        }
                        inAppPromptRecommendInfo.subTitle = "";
                        return inAppPromptRecommendInfo;
                    }
                    inAppPromptRecommendInfo.subTitle = nb5Var.s();
                }
            }
            return inAppPromptRecommendInfo;
        }

        public void serialize(InAppPromptRecommendInfo inAppPromptRecommendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inAppPromptRecommendInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = inAppPromptRecommendInfo.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<InAppPromptRecommendInfo> JSON_ADAPTER = new ObjectJsonAdapter<InAppPromptRecommendInfo>() { // from class: com.p1.mobile.putong.data.InAppPromptRecommendInfo.2
        public Class getDataClass() {
            return InAppPromptRecommendInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public InAppPromptRecommendInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InAppPromptRecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InAppPromptRecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InAppPromptRecommendInfo new_() {
        InAppPromptRecommendInfo inAppPromptRecommendInfo = new InAppPromptRecommendInfo();
        inAppPromptRecommendInfo.nullCheck();
        return inAppPromptRecommendInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InAppPromptRecommendInfo m18219clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
