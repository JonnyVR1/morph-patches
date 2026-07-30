package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntrRiskConfig;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntrRiskConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intrriskconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<Integer> detectAboutMe;

    @ProtobufIndex(index = 1)
    public boolean testa;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean testb;
    public static ProtobufAdapter<IntrRiskConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntrRiskConfig>() { // from class: com.p1.mobile.putong.core.data.IntrRiskConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntrRiskConfig intrRiskConfig) {
            int iB = CodedOutputByteBufferNano.b(1, intrRiskConfig.testa) + CodedOutputByteBufferNano.b(2, intrRiskConfig.testb);
            List<Integer> list = intrRiskConfig.detectAboutMe;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intrRiskConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntrRiskConfig m13743parse(nb5 nb5Var) throws IOException {
            IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intrRiskConfig.detectAboutMe != null) {
                        break;
                    }
                    intrRiskConfig.detectAboutMe = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    intrRiskConfig.testa = nb5Var.g();
                } else if (iU == 16) {
                    intrRiskConfig.testb = nb5Var.g();
                } else {
                    if (iU != 26) {
                        if (intrRiskConfig.detectAboutMe != null) {
                            break;
                        }
                        intrRiskConfig.detectAboutMe = new ArrayList();
                        return intrRiskConfig;
                    }
                    intrRiskConfig.detectAboutMe = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intrRiskConfig;
        }

        public void serialize(IntrRiskConfig intrRiskConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intrRiskConfig.testa);
            codedOutputByteBufferNano.A(2, intrRiskConfig.testb);
            List<Integer> list = intrRiskConfig.detectAboutMe;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntrRiskConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntrRiskConfig>() { // from class: com.p1.mobile.putong.core.data.IntrRiskConfig.2
        public Class getDataClass() {
            return IntrRiskConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntrRiskConfig m13744newInstance() {
            return new IntrRiskConfig();
        }

        public boolean parseField(IntrRiskConfig intrRiskConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "detectAboutMe":
                    intrRiskConfig.detectAboutMe = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "testa":
                    intrRiskConfig.testa = jsonParser.getValueAsBoolean();
                    return true;
                case "testb":
                    intrRiskConfig.testb = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntrRiskConfig intrRiskConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "detectAboutMe":
                case "testa":
                case "testb":
                    return true;
                default:
                    return super.parseFieldCheck(intrRiskConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntrRiskConfig intrRiskConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("testa", intrRiskConfig.testa);
            jsonGenerator.writeBooleanField("testb", intrRiskConfig.testb);
            if (intrRiskConfig.detectAboutMe != null) {
                jsonGenerator.writeFieldName("detectAboutMe");
                JsonAdapter.serializeArray(intrRiskConfig.detectAboutMe, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntrRiskConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntrRiskConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m433a(Integer num) {
        return num;
    }

    public static IntrRiskConfig new_() {
        IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
        intrRiskConfig.nullCheck();
        return intrRiskConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntrRiskConfig m13742clone() {
        IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
        intrRiskConfig.testa = this.testa;
        intrRiskConfig.testb = this.testb;
        List<Integer> list = this.detectAboutMe;
        if (list != null) {
            intrRiskConfig.detectAboutMe = ValueObject.util_map(list, new w9j() { // from class: l.iwp
                public final Object call(Object obj) {
                    return IntrRiskConfig.m433a((Integer) obj);
                }
            });
        }
        return intrRiskConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntrRiskConfig)) {
            return false;
        }
        IntrRiskConfig intrRiskConfig = (IntrRiskConfig) obj;
        return this.testa == intrRiskConfig.testa && this.testb == intrRiskConfig.testb && ValueObject.util_equals(this.detectAboutMe, intrRiskConfig.detectAboutMe);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.testa ? 1231 : 1237)) * 41) + (this.testb ? 1231 : 1237)) * 41;
        List<Integer> list = this.detectAboutMe;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.detectAboutMe == null) {
            this.detectAboutMe = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
