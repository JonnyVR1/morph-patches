package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class AIChatAnalysis extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatanalysis";

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageId;

    @Nullable
    @ProtobufIndex(index = 2)
    public String scene;
    public static ProtobufAdapter<AIChatAnalysis> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIChatAnalysis>() { // from class: com.p1.mobile.putong.core.data.AIChatAnalysis.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AIChatAnalysis aIChatAnalysis) {
            String str = aIChatAnalysis.messageId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = aIChatAnalysis.scene;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            aIChatAnalysis.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AIChatAnalysis parse(nc5 nc5Var) throws IOException {
            AIChatAnalysis aIChatAnalysis = new AIChatAnalysis();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aIChatAnalysis.messageId != null) {
                        break;
                    }
                    aIChatAnalysis.messageId = "";
                    break;
                }
                if (iM162497u == 10) {
                    aIChatAnalysis.messageId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (aIChatAnalysis.messageId != null) {
                            break;
                        }
                        aIChatAnalysis.messageId = "";
                        return aIChatAnalysis;
                    }
                    aIChatAnalysis.scene = nc5Var.m162495s();
                }
            }
            return aIChatAnalysis;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AIChatAnalysis aIChatAnalysis, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIChatAnalysis.messageId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = aIChatAnalysis.scene;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<AIChatAnalysis> JSON_ADAPTER = new ObjectJsonAdapter<AIChatAnalysis>() { // from class: com.p1.mobile.putong.core.data.AIChatAnalysis.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AIChatAnalysis.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AIChatAnalysis newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIChatAnalysis) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIChatAnalysis) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIChatAnalysis new_() {
        AIChatAnalysis aIChatAnalysis = new AIChatAnalysis();
        aIChatAnalysis.nullCheck();
        return aIChatAnalysis;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AIChatAnalysis mo225055clone() {
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
        String str = this.messageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scene;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.messageId == null) {
            this.messageId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
