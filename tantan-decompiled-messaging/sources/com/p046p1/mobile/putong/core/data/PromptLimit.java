package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class PromptLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "promptlimit";

    @NonNull
    @ProtobufIndex(index = 1)
    public SchoolVerificationLimit schoolVerificationLimit;

    @NonNull
    @ProtobufIndex(index = 2)
    public AssetsTbh tbh;
    public static ProtobufAdapter<PromptLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<PromptLimit>() { // from class: com.p1.mobile.putong.core.data.PromptLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PromptLimit promptLimit) {
            SchoolVerificationLimit schoolVerificationLimit = promptLimit.schoolVerificationLimit;
            int iM17230l = schoolVerificationLimit != null ? CodedOutputByteBufferNano.m17230l(1, schoolVerificationLimit, SchoolVerificationLimit.PROTOBUF_ADAPTER) : 0;
            AssetsTbh assetsTbh = promptLimit.tbh;
            if (assetsTbh != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, assetsTbh, AssetsTbh.PROTOBUF_ADAPTER);
            }
            promptLimit.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PromptLimit parse(nb5 nb5Var) throws IOException {
            PromptLimit promptLimit = new PromptLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (promptLimit.schoolVerificationLimit == null) {
                        promptLimit.schoolVerificationLimit = SchoolVerificationLimit.new_();
                    }
                    if (promptLimit.tbh != null) {
                        break;
                    }
                    promptLimit.tbh = AssetsTbh.new_();
                    break;
                }
                if (iM158752u == 10) {
                    promptLimit.schoolVerificationLimit = (SchoolVerificationLimit) nb5Var.m158743l(SchoolVerificationLimit.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (promptLimit.schoolVerificationLimit == null) {
                            promptLimit.schoolVerificationLimit = SchoolVerificationLimit.new_();
                        }
                        if (promptLimit.tbh != null) {
                            break;
                        }
                        promptLimit.tbh = AssetsTbh.new_();
                        return promptLimit;
                    }
                    promptLimit.tbh = (AssetsTbh) nb5Var.m158743l(AssetsTbh.PROTOBUF_ADAPTER);
                }
            }
            return promptLimit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PromptLimit promptLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SchoolVerificationLimit schoolVerificationLimit = promptLimit.schoolVerificationLimit;
            if (schoolVerificationLimit != null) {
                codedOutputByteBufferNano.m17254K(1, schoolVerificationLimit, SchoolVerificationLimit.PROTOBUF_ADAPTER);
            }
            AssetsTbh assetsTbh = promptLimit.tbh;
            if (assetsTbh != null) {
                codedOutputByteBufferNano.m17254K(2, assetsTbh, AssetsTbh.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PromptLimit> JSON_ADAPTER = new ObjectJsonAdapter<PromptLimit>() { // from class: com.p1.mobile.putong.core.data.PromptLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PromptLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PromptLimit newInstance() {
            return new PromptLimit();
        }

        public boolean parseField(PromptLimit promptLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tbh")) {
                promptLimit.tbh = AssetsTbh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("schoolVerification")) {
                return false;
            }
            promptLimit.schoolVerificationLimit = SchoolVerificationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PromptLimit promptLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tbh") || str.equals("schoolVerification")) {
                return true;
            }
            return super.parseFieldCheck(promptLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PromptLimit promptLimit, JsonGenerator jsonGenerator) throws IOException {
            if (promptLimit.schoolVerificationLimit != null) {
                jsonGenerator.writeFieldName("schoolVerification");
                SchoolVerificationLimit.JSON_ADAPTER.serialize(promptLimit.schoolVerificationLimit, jsonGenerator, true);
            }
            if (promptLimit.tbh != null) {
                jsonGenerator.writeFieldName("tbh");
                AssetsTbh.JSON_ADAPTER.serialize(promptLimit.tbh, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PromptLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PromptLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PromptLimit new_() {
        PromptLimit promptLimit = new PromptLimit();
        promptLimit.nullCheck();
        return promptLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PromptLimit mo223809clone() {
        PromptLimit promptLimit = new PromptLimit();
        SchoolVerificationLimit schoolVerificationLimit = this.schoolVerificationLimit;
        if (schoolVerificationLimit != null) {
            promptLimit.schoolVerificationLimit = schoolVerificationLimit.mo223809clone();
        }
        AssetsTbh assetsTbh = this.tbh;
        if (assetsTbh != null) {
            promptLimit.tbh = assetsTbh.mo223809clone();
        }
        return promptLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptLimit)) {
            return false;
        }
        PromptLimit promptLimit = (PromptLimit) obj;
        return ValueObject.util_equals(this.schoolVerificationLimit, promptLimit.schoolVerificationLimit) && ValueObject.util_equals(this.tbh, promptLimit.tbh);
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
        SchoolVerificationLimit schoolVerificationLimit = this.schoolVerificationLimit;
        int iHashCode = (i2 + (schoolVerificationLimit != null ? schoolVerificationLimit.hashCode() : 0)) * 41;
        AssetsTbh assetsTbh = this.tbh;
        int iHashCode2 = iHashCode + (assetsTbh != null ? assetsTbh.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.schoolVerificationLimit == null) {
            this.schoolVerificationLimit = SchoolVerificationLimit.new_();
        }
        if (this.tbh == null) {
            this.tbh = AssetsTbh.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
