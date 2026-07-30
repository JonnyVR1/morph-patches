package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class AiPictureAuth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipictureauth";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<AiPictureAuth> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureAuth>() { // from class: com.p1.mobile.putong.core.data.AiPictureAuth.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiPictureAuth aiPictureAuth) {
            String str = aiPictureAuth.status;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            aiPictureAuth.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiPictureAuth parse(nc5 nc5Var) throws IOException {
            AiPictureAuth aiPictureAuth = new AiPictureAuth();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiPictureAuth.status != null) {
                        break;
                    }
                    aiPictureAuth.status = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (aiPictureAuth.status != null) {
                        break;
                    }
                    aiPictureAuth.status = "";
                    return aiPictureAuth;
                }
                aiPictureAuth.status = nc5Var.m162495s();
            }
            return aiPictureAuth;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiPictureAuth aiPictureAuth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPictureAuth.status;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<AiPictureAuth> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureAuth>() { // from class: com.p1.mobile.putong.core.data.AiPictureAuth.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiPictureAuth.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiPictureAuth newInstance() {
            return new AiPictureAuth();
        }

        public boolean parseField(AiPictureAuth aiPictureAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            aiPictureAuth.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiPictureAuth aiPictureAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(aiPictureAuth, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiPictureAuth aiPictureAuth, JsonGenerator jsonGenerator) throws IOException {
            String str = aiPictureAuth.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureAuth new_() {
        AiPictureAuth aiPictureAuth = new AiPictureAuth();
        aiPictureAuth.nullCheck();
        return aiPictureAuth;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiPictureAuth mo225055clone() {
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
        String str = this.status;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
