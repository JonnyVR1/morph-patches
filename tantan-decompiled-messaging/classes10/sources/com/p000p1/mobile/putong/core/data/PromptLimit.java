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
public class PromptLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "promptlimit";

    @NonNull
    @ProtobufIndex(index = 1)
    public SchoolVerificationLimit schoolVerificationLimit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AssetsTbh tbh;
    public static ProtobufAdapter<PromptLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<PromptLimit>() { // from class: com.p1.mobile.putong.core.data.PromptLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PromptLimit promptLimit) {
            SchoolVerificationLimit schoolVerificationLimit = promptLimit.schoolVerificationLimit;
            int iL = schoolVerificationLimit != null ? CodedOutputByteBufferNano.l(1, schoolVerificationLimit, SchoolVerificationLimit.PROTOBUF_ADAPTER) : 0;
            AssetsTbh assetsTbh = promptLimit.tbh;
            if (assetsTbh != null) {
                iL += CodedOutputByteBufferNano.l(2, assetsTbh, AssetsTbh.PROTOBUF_ADAPTER);
            }
            ((MessageNano) promptLimit).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PromptLimit m15063parse(nb5 nb5Var) throws IOException {
            PromptLimit promptLimit = new PromptLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (promptLimit.schoolVerificationLimit == null) {
                        promptLimit.schoolVerificationLimit = SchoolVerificationLimit.new_();
                    }
                    if (promptLimit.tbh != null) {
                        break;
                    }
                    promptLimit.tbh = AssetsTbh.new_();
                    break;
                }
                if (iU == 10) {
                    promptLimit.schoolVerificationLimit = (SchoolVerificationLimit) nb5Var.l(SchoolVerificationLimit.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (promptLimit.schoolVerificationLimit == null) {
                            promptLimit.schoolVerificationLimit = SchoolVerificationLimit.new_();
                        }
                        if (promptLimit.tbh != null) {
                            break;
                        }
                        promptLimit.tbh = AssetsTbh.new_();
                        return promptLimit;
                    }
                    promptLimit.tbh = (AssetsTbh) nb5Var.l(AssetsTbh.PROTOBUF_ADAPTER);
                }
            }
            return promptLimit;
        }

        public void serialize(PromptLimit promptLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SchoolVerificationLimit schoolVerificationLimit = promptLimit.schoolVerificationLimit;
            if (schoolVerificationLimit != null) {
                codedOutputByteBufferNano.K(1, schoolVerificationLimit, SchoolVerificationLimit.PROTOBUF_ADAPTER);
            }
            AssetsTbh assetsTbh = promptLimit.tbh;
            if (assetsTbh != null) {
                codedOutputByteBufferNano.K(2, assetsTbh, AssetsTbh.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PromptLimit> JSON_ADAPTER = new ObjectJsonAdapter<PromptLimit>() { // from class: com.p1.mobile.putong.core.data.PromptLimit.2
        public Class getDataClass() {
            return PromptLimit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PromptLimit m15064newInstance() {
            return new PromptLimit();
        }

        public boolean parseField(PromptLimit promptLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tbh")) {
                promptLimit.tbh = (AssetsTbh) AssetsTbh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("schoolVerification")) {
                return false;
            }
            promptLimit.schoolVerificationLimit = (SchoolVerificationLimit) SchoolVerificationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PromptLimit promptLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tbh") || str.equals("schoolVerification")) {
                return true;
            }
            return super.parseFieldCheck(promptLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PromptLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PromptLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PromptLimit new_() {
        PromptLimit promptLimit = new PromptLimit();
        promptLimit.nullCheck();
        return promptLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PromptLimit m15062clone() {
        PromptLimit promptLimit = new PromptLimit();
        SchoolVerificationLimit schoolVerificationLimit = this.schoolVerificationLimit;
        if (schoolVerificationLimit != null) {
            promptLimit.schoolVerificationLimit = schoolVerificationLimit.m15490clone();
        }
        AssetsTbh assetsTbh = this.tbh;
        if (assetsTbh != null) {
            promptLimit.tbh = assetsTbh.m11652clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        SchoolVerificationLimit schoolVerificationLimit = this.schoolVerificationLimit;
        int iHashCode = (i2 + (schoolVerificationLimit != null ? schoolVerificationLimit.hashCode() : 0)) * 41;
        AssetsTbh assetsTbh = this.tbh;
        int iHashCode2 = iHashCode + (assetsTbh != null ? assetsTbh.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.schoolVerificationLimit == null) {
            this.schoolVerificationLimit = SchoolVerificationLimit.new_();
        }
        if (this.tbh == null) {
            this.tbh = AssetsTbh.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
