package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class AIChatAnalysis extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatanalysis";

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageId;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String scene;
    public static ProtobufAdapter<AIChatAnalysis> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIChatAnalysis>() { // from class: com.p1.mobile.putong.core.data.AIChatAnalysis.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AIChatAnalysis aIChatAnalysis) {
            String str = aIChatAnalysis.messageId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = aIChatAnalysis.scene;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) aIChatAnalysis).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AIChatAnalysis m11475parse(nb5 nb5Var) throws IOException {
            AIChatAnalysis aIChatAnalysis = new AIChatAnalysis();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aIChatAnalysis.messageId != null) {
                        break;
                    }
                    aIChatAnalysis.messageId = "";
                    break;
                }
                if (iU == 10) {
                    aIChatAnalysis.messageId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (aIChatAnalysis.messageId != null) {
                            break;
                        }
                        aIChatAnalysis.messageId = "";
                        return aIChatAnalysis;
                    }
                    aIChatAnalysis.scene = nb5Var.s();
                }
            }
            return aIChatAnalysis;
        }

        public void serialize(AIChatAnalysis aIChatAnalysis, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIChatAnalysis.messageId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = aIChatAnalysis.scene;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AIChatAnalysis> JSON_ADAPTER = new ObjectJsonAdapter<AIChatAnalysis>() { // from class: com.p1.mobile.putong.core.data.AIChatAnalysis.2
        public Class getDataClass() {
            return AIChatAnalysis.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AIChatAnalysis m11476newInstance() {
            return new AIChatAnalysis();
        }

        public boolean parseField(AIChatAnalysis aIChatAnalysis, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("messageId")) {
                aIChatAnalysis.messageId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("scene")) {
                return false;
            }
            aIChatAnalysis.scene = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AIChatAnalysis aIChatAnalysis, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("messageId") || str.equals("scene")) {
                return true;
            }
            return super.parseFieldCheck(aIChatAnalysis, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AIChatAnalysis aIChatAnalysis, JsonGenerator jsonGenerator) throws IOException {
            String str = aIChatAnalysis.messageId;
            if (str != null) {
                jsonGenerator.writeStringField("messageId", str);
            }
            String str2 = aIChatAnalysis.scene;
            if (str2 != null) {
                jsonGenerator.writeStringField("scene", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIChatAnalysis) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIChatAnalysis) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIChatAnalysis new_() {
        AIChatAnalysis aIChatAnalysis = new AIChatAnalysis();
        aIChatAnalysis.nullCheck();
        return aIChatAnalysis;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AIChatAnalysis m11474clone() {
        AIChatAnalysis aIChatAnalysis = new AIChatAnalysis();
        aIChatAnalysis.messageId = this.messageId;
        aIChatAnalysis.scene = this.scene;
        return aIChatAnalysis;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AIChatAnalysis)) {
            return false;
        }
        AIChatAnalysis aIChatAnalysis = (AIChatAnalysis) obj;
        return ValueObject.util_equals(this.messageId, aIChatAnalysis.messageId) && ValueObject.util_equals(this.scene, aIChatAnalysis.scene);
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
        String str = this.messageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scene;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.messageId == null) {
            this.messageId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
