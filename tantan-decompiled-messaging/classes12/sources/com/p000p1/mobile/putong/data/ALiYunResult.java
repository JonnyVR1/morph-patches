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
public class ALiYunResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aliyunresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String certifyId;
    public static ProtobufAdapter<ALiYunResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<ALiYunResult>() { // from class: com.p1.mobile.putong.data.ALiYunResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ALiYunResult aLiYunResult) {
            String str = aLiYunResult.certifyId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) aLiYunResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ALiYunResult m17614parse(nb5 nb5Var) throws IOException {
            ALiYunResult aLiYunResult = new ALiYunResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aLiYunResult.certifyId != null) {
                        break;
                    }
                    aLiYunResult.certifyId = "";
                    break;
                }
                if (iU != 10) {
                    if (aLiYunResult.certifyId != null) {
                        break;
                    }
                    aLiYunResult.certifyId = "";
                    return aLiYunResult;
                }
                aLiYunResult.certifyId = nb5Var.s();
            }
            return aLiYunResult;
        }

        public void serialize(ALiYunResult aLiYunResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aLiYunResult.certifyId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ALiYunResult> JSON_ADAPTER = new ObjectJsonAdapter<ALiYunResult>() { // from class: com.p1.mobile.putong.data.ALiYunResult.2
        public Class getDataClass() {
            return ALiYunResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ALiYunResult mo17830newInstance() {
            return new ALiYunResult();
        }

        public boolean parseField(ALiYunResult aLiYunResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("certifyId")) {
                return false;
            }
            aLiYunResult.certifyId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ALiYunResult aLiYunResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("certifyId")) {
                return true;
            }
            return super.parseFieldCheck(aLiYunResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ALiYunResult aLiYunResult, JsonGenerator jsonGenerator) throws IOException {
            String str = aLiYunResult.certifyId;
            if (str != null) {
                jsonGenerator.writeStringField("certifyId", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ALiYunResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ALiYunResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ALiYunResult new_() {
        ALiYunResult aLiYunResult = new ALiYunResult();
        aLiYunResult.nullCheck();
        return aLiYunResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ALiYunResult m17613clone() {
        ALiYunResult aLiYunResult = new ALiYunResult();
        aLiYunResult.certifyId = this.certifyId;
        return aLiYunResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ALiYunResult) {
            return ValueObject.util_equals(this.certifyId, ((ALiYunResult) obj).certifyId);
        }
        return false;
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
        String str = this.certifyId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.certifyId == null) {
            this.certifyId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
