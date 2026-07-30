package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntrRiskConfig;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntrRiskConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intrriskconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> detectAboutMe;

    @ProtobufIndex(index = 1)
    public boolean testa;

    @ProtobufIndex(index = 2)
    public boolean testb;
    public static ProtobufAdapter<IntrRiskConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntrRiskConfig>() { // from class: com.p1.mobile.putong.core.data.IntrRiskConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntrRiskConfig intrRiskConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, intrRiskConfig.testa) + CodedOutputByteBufferNano.m17275b(2, intrRiskConfig.testb);
            List<Integer> list = intrRiskConfig.detectAboutMe;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            intrRiskConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntrRiskConfig parse(nc5 nc5Var) throws IOException {
            IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intrRiskConfig.detectAboutMe != null) {
                        break;
                    }
                    intrRiskConfig.detectAboutMe = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    intrRiskConfig.testa = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    intrRiskConfig.testb = nc5Var.m162483g();
                } else {
                    if (iM162497u != 26) {
                        if (intrRiskConfig.detectAboutMe != null) {
                            break;
                        }
                        intrRiskConfig.detectAboutMe = new ArrayList();
                        return intrRiskConfig;
                    }
                    intrRiskConfig.detectAboutMe = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intrRiskConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntrRiskConfig intrRiskConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, intrRiskConfig.testa);
            codedOutputByteBufferNano.m17299A(2, intrRiskConfig.testb);
            List<Integer> list = intrRiskConfig.detectAboutMe;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntrRiskConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntrRiskConfig>() { // from class: com.p1.mobile.putong.core.data.IntrRiskConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntrRiskConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntrRiskConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntrRiskConfig intrRiskConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("testa", intrRiskConfig.testa);
            jsonGenerator.writeBooleanField("testb", intrRiskConfig.testb);
            if (intrRiskConfig.detectAboutMe != null) {
                jsonGenerator.writeFieldName("detectAboutMe");
                JsonAdapter.serializeArray(intrRiskConfig.detectAboutMe, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntrRiskConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntrRiskConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36634a(Integer num) {
        return num;
    }

    public static IntrRiskConfig new_() {
        IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
        intrRiskConfig.nullCheck();
        return intrRiskConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntrRiskConfig mo225055clone() {
        IntrRiskConfig intrRiskConfig = new IntrRiskConfig();
        intrRiskConfig.testa = this.testa;
        intrRiskConfig.testb = this.testb;
        List<Integer> list = this.detectAboutMe;
        if (list != null) {
            intrRiskConfig.detectAboutMe = ValueObject.util_map(list, new qcj() { // from class: l.iyp
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntrRiskConfig.m36634a((Integer) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.testa ? 1231 : 1237)) * 41) + (this.testb ? 1231 : 1237)) * 41;
        List<Integer> list = this.detectAboutMe;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.detectAboutMe == null) {
            this.detectAboutMe = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
