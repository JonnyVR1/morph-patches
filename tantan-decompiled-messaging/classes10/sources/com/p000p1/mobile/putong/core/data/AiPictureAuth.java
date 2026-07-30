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
public class AiPictureAuth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipictureauth";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<AiPictureAuth> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureAuth>() { // from class: com.p1.mobile.putong.core.data.AiPictureAuth.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiPictureAuth aiPictureAuth) {
            String str = aiPictureAuth.status;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) aiPictureAuth).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiPictureAuth m11609parse(nb5 nb5Var) throws IOException {
            AiPictureAuth aiPictureAuth = new AiPictureAuth();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiPictureAuth.status != null) {
                        break;
                    }
                    aiPictureAuth.status = "";
                    break;
                }
                if (iU != 10) {
                    if (aiPictureAuth.status != null) {
                        break;
                    }
                    aiPictureAuth.status = "";
                    return aiPictureAuth;
                }
                aiPictureAuth.status = nb5Var.s();
            }
            return aiPictureAuth;
        }

        public void serialize(AiPictureAuth aiPictureAuth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPictureAuth.status;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AiPictureAuth> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureAuth>() { // from class: com.p1.mobile.putong.core.data.AiPictureAuth.2
        public Class getDataClass() {
            return AiPictureAuth.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiPictureAuth m11610newInstance() {
            return new AiPictureAuth();
        }

        public boolean parseField(AiPictureAuth aiPictureAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            aiPictureAuth.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiPictureAuth aiPictureAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(aiPictureAuth, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AiPictureAuth aiPictureAuth, JsonGenerator jsonGenerator) throws IOException {
            String str = aiPictureAuth.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureAuth new_() {
        AiPictureAuth aiPictureAuth = new AiPictureAuth();
        aiPictureAuth.nullCheck();
        return aiPictureAuth;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiPictureAuth m11608clone() {
        AiPictureAuth aiPictureAuth = new AiPictureAuth();
        aiPictureAuth.status = this.status;
        return aiPictureAuth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiPictureAuth) {
            return ValueObject.util_equals(this.status, ((AiPictureAuth) obj).status);
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
        String str = this.status;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
