package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AiPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public String likeStatus;
    public static ProtobufAdapter<AiPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPicture>() { // from class: com.p1.mobile.putong.core.data.AiPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiPicture aiPicture) {
            String str = aiPicture.likeStatus;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            aiPicture.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiPicture parse(nc5 nc5Var) throws IOException {
            AiPicture aiPicture = new AiPicture();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiPicture.likeStatus != null) {
                        break;
                    }
                    aiPicture.likeStatus = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (aiPicture.likeStatus != null) {
                        break;
                    }
                    aiPicture.likeStatus = "";
                    return aiPicture;
                }
                aiPicture.likeStatus = nc5Var.m162495s();
            }
            return aiPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiPicture aiPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPicture.likeStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<AiPicture> JSON_ADAPTER = new ObjectJsonAdapter<AiPicture>() { // from class: com.p1.mobile.putong.core.data.AiPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiPicture.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiPicture newInstance() {
            return new AiPicture();
        }

        public boolean parseField(AiPicture aiPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("likeStatus")) {
                return false;
            }
            aiPicture.likeStatus = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiPicture aiPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("likeStatus")) {
                return true;
            }
            return super.parseFieldCheck(aiPicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiPicture aiPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = aiPicture.likeStatus;
            if (str != null) {
                jsonGenerator.writeStringField("likeStatus", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPicture new_() {
        AiPicture aiPicture = new AiPicture();
        aiPicture.nullCheck();
        return aiPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiPicture mo225055clone() {
        AiPicture aiPicture = new AiPicture();
        aiPicture.likeStatus = this.likeStatus;
        return aiPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiPicture) {
            return ValueObject.util_equals(this.likeStatus, ((AiPicture) obj).likeStatus);
        }
        return false;
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
        String str = this.likeStatus;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.likeStatus == null) {
            this.likeStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
