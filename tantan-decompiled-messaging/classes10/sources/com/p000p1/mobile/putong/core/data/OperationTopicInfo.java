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
public class OperationTopicInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "operationtopicinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public OperationCoverPicture coverPicture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String operationId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String title;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String url;
    public static ProtobufAdapter<OperationTopicInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OperationTopicInfo>() { // from class: com.p1.mobile.putong.core.data.OperationTopicInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OperationTopicInfo operationTopicInfo) {
            String str = operationTopicInfo.operationId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            OperationCoverPicture operationCoverPicture = operationTopicInfo.coverPicture;
            if (operationCoverPicture != null) {
                iO += CodedOutputByteBufferNano.l(2, operationCoverPicture, OperationCoverPicture.PROTOBUF_ADAPTER);
            }
            String str2 = operationTopicInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = operationTopicInfo.subtitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = operationTopicInfo.url;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) operationTopicInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OperationTopicInfo m14675parse(nb5 nb5Var) throws IOException {
            OperationTopicInfo operationTopicInfo = new OperationTopicInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (operationTopicInfo.operationId == null) {
                        operationTopicInfo.operationId = "";
                    }
                    if (operationTopicInfo.coverPicture == null) {
                        operationTopicInfo.coverPicture = OperationCoverPicture.new_();
                    }
                    if (operationTopicInfo.title == null) {
                        operationTopicInfo.title = "";
                    }
                    if (operationTopicInfo.subtitle == null) {
                        operationTopicInfo.subtitle = "";
                    }
                    if (operationTopicInfo.url != null) {
                        break;
                    }
                    operationTopicInfo.url = "";
                    break;
                }
                if (iU == 10) {
                    operationTopicInfo.operationId = nb5Var.s();
                } else if (iU == 18) {
                    operationTopicInfo.coverPicture = (OperationCoverPicture) nb5Var.l(OperationCoverPicture.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    operationTopicInfo.title = nb5Var.s();
                } else if (iU == 34) {
                    operationTopicInfo.subtitle = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (operationTopicInfo.operationId == null) {
                            operationTopicInfo.operationId = "";
                        }
                        if (operationTopicInfo.coverPicture == null) {
                            operationTopicInfo.coverPicture = OperationCoverPicture.new_();
                        }
                        if (operationTopicInfo.title == null) {
                            operationTopicInfo.title = "";
                        }
                        if (operationTopicInfo.subtitle == null) {
                            operationTopicInfo.subtitle = "";
                        }
                        if (operationTopicInfo.url != null) {
                            break;
                        }
                        operationTopicInfo.url = "";
                        return operationTopicInfo;
                    }
                    operationTopicInfo.url = nb5Var.s();
                }
            }
            return operationTopicInfo;
        }

        public void serialize(OperationTopicInfo operationTopicInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = operationTopicInfo.operationId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            OperationCoverPicture operationCoverPicture = operationTopicInfo.coverPicture;
            if (operationCoverPicture != null) {
                codedOutputByteBufferNano.K(2, operationCoverPicture, OperationCoverPicture.PROTOBUF_ADAPTER);
            }
            String str2 = operationTopicInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = operationTopicInfo.subtitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = operationTopicInfo.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<OperationTopicInfo> JSON_ADAPTER = new ObjectJsonAdapter<OperationTopicInfo>() { // from class: com.p1.mobile.putong.core.data.OperationTopicInfo.2
        public Class getDataClass() {
            return OperationTopicInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OperationTopicInfo m14676newInstance() {
            return new OperationTopicInfo();
        }

        public boolean parseField(OperationTopicInfo operationTopicInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    operationTopicInfo.subtitle = jsonParser.getValueAsString();
                    return true;
                case "url":
                    operationTopicInfo.url = jsonParser.getValueAsString();
                    return true;
                case "title":
                    operationTopicInfo.title = jsonParser.getValueAsString();
                    return true;
                case "operationId":
                    operationTopicInfo.operationId = jsonParser.getValueAsString();
                    return true;
                case "coverPicture":
                    operationTopicInfo.coverPicture = (OperationCoverPicture) OperationCoverPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OperationTopicInfo operationTopicInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "url":
                case "title":
                case "operationId":
                case "coverPicture":
                    return true;
                default:
                    return super.parseFieldCheck(operationTopicInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OperationTopicInfo operationTopicInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = operationTopicInfo.operationId;
            if (str != null) {
                jsonGenerator.writeStringField("operationId", str);
            }
            if (operationTopicInfo.coverPicture != null) {
                jsonGenerator.writeFieldName("coverPicture");
                OperationCoverPicture.JSON_ADAPTER.serialize(operationTopicInfo.coverPicture, jsonGenerator, true);
            }
            String str2 = operationTopicInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = operationTopicInfo.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            String str4 = operationTopicInfo.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OperationTopicInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OperationTopicInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OperationTopicInfo new_() {
        OperationTopicInfo operationTopicInfo = new OperationTopicInfo();
        operationTopicInfo.nullCheck();
        return operationTopicInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OperationTopicInfo m14674clone() {
        OperationTopicInfo operationTopicInfo = new OperationTopicInfo();
        operationTopicInfo.operationId = this.operationId;
        OperationCoverPicture operationCoverPicture = this.coverPicture;
        if (operationCoverPicture != null) {
            operationTopicInfo.coverPicture = operationCoverPicture.m14670clone();
        }
        operationTopicInfo.title = this.title;
        operationTopicInfo.subtitle = this.subtitle;
        operationTopicInfo.url = this.url;
        return operationTopicInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OperationTopicInfo)) {
            return false;
        }
        OperationTopicInfo operationTopicInfo = (OperationTopicInfo) obj;
        return ValueObject.util_equals(this.operationId, operationTopicInfo.operationId) && ValueObject.util_equals(this.coverPicture, operationTopicInfo.coverPicture) && ValueObject.util_equals(this.title, operationTopicInfo.title) && ValueObject.util_equals(this.subtitle, operationTopicInfo.subtitle) && ValueObject.util_equals(this.url, operationTopicInfo.url);
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
        String str = this.operationId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OperationCoverPicture operationCoverPicture = this.coverPicture;
        int iHashCode2 = (iHashCode + (operationCoverPicture != null ? operationCoverPicture.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.operationId == null) {
            this.operationId = "";
        }
        if (this.coverPicture == null) {
            this.coverPicture = OperationCoverPicture.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
