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
public class AiPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public String likeStatus;
    public static ProtobufAdapter<AiPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPicture>() { // from class: com.p1.mobile.putong.core.data.AiPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiPicture aiPicture) {
            String str = aiPicture.likeStatus;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) aiPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiPicture m11605parse(nb5 nb5Var) throws IOException {
            AiPicture aiPicture = new AiPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiPicture.likeStatus != null) {
                        break;
                    }
                    aiPicture.likeStatus = "";
                    break;
                }
                if (iU != 10) {
                    if (aiPicture.likeStatus != null) {
                        break;
                    }
                    aiPicture.likeStatus = "";
                    return aiPicture;
                }
                aiPicture.likeStatus = nb5Var.s();
            }
            return aiPicture;
        }

        public void serialize(AiPicture aiPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPicture.likeStatus;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AiPicture> JSON_ADAPTER = new ObjectJsonAdapter<AiPicture>() { // from class: com.p1.mobile.putong.core.data.AiPicture.2
        public Class getDataClass() {
            return AiPicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiPicture m11606newInstance() {
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

        public void serializeFields(AiPicture aiPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = aiPicture.likeStatus;
            if (str != null) {
                jsonGenerator.writeStringField("likeStatus", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPicture new_() {
        AiPicture aiPicture = new AiPicture();
        aiPicture.nullCheck();
        return aiPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiPicture m11604clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.likeStatus;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.likeStatus == null) {
            this.likeStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
