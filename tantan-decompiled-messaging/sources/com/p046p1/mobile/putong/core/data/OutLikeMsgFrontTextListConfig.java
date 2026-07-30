package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class OutLikeMsgFrontTextListConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "outlikemsgfronttextlistconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> female;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> male;
    public static ProtobufAdapter<OutLikeMsgFrontTextListConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OutLikeMsgFrontTextListConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig) {
            List<String> list = outLikeMsgFrontTextListConfig.female;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = outLikeMsgFrontTextListConfig.male;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            outLikeMsgFrontTextListConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OutLikeMsgFrontTextListConfig parse(nb5 nb5Var) throws IOException {
            OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (outLikeMsgFrontTextListConfig.female == null) {
                        outLikeMsgFrontTextListConfig.female = new ArrayList();
                    }
                    if (outLikeMsgFrontTextListConfig.male != null) {
                        break;
                    }
                    outLikeMsgFrontTextListConfig.male = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    outLikeMsgFrontTextListConfig.female = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (outLikeMsgFrontTextListConfig.female == null) {
                            outLikeMsgFrontTextListConfig.female = new ArrayList();
                        }
                        if (outLikeMsgFrontTextListConfig.male != null) {
                            break;
                        }
                        outLikeMsgFrontTextListConfig.male = new ArrayList();
                        return outLikeMsgFrontTextListConfig;
                    }
                    outLikeMsgFrontTextListConfig.male = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return outLikeMsgFrontTextListConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = outLikeMsgFrontTextListConfig.female;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = outLikeMsgFrontTextListConfig.male;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OutLikeMsgFrontTextListConfig> JSON_ADAPTER = new ObjectJsonAdapter<OutLikeMsgFrontTextListConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OutLikeMsgFrontTextListConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OutLikeMsgFrontTextListConfig newInstance() {
            return new OutLikeMsgFrontTextListConfig();
        }

        public boolean parseField(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female")) {
                outLikeMsgFrontTextListConfig.female = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("male")) {
                return false;
            }
            outLikeMsgFrontTextListConfig.male = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female") || str.equals("male")) {
                return true;
            }
            return super.parseFieldCheck(outLikeMsgFrontTextListConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig, JsonGenerator jsonGenerator) throws IOException {
            if (outLikeMsgFrontTextListConfig.female != null) {
                jsonGenerator.writeFieldName("female");
                JsonAdapter.serializeArray(outLikeMsgFrontTextListConfig.female, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (outLikeMsgFrontTextListConfig.male != null) {
                jsonGenerator.writeFieldName("male");
                JsonAdapter.serializeArray(outLikeMsgFrontTextListConfig.male, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OutLikeMsgFrontTextListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OutLikeMsgFrontTextListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35741a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35742b(String str) {
        return str;
    }

    public static OutLikeMsgFrontTextListConfig new_() {
        OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
        outLikeMsgFrontTextListConfig.nullCheck();
        return outLikeMsgFrontTextListConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OutLikeMsgFrontTextListConfig mo223809clone() {
        OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
        List<String> list = this.female;
        if (list != null) {
            outLikeMsgFrontTextListConfig.female = ValueObject.util_map(list, new w9j() { // from class: l.bz50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OutLikeMsgFrontTextListConfig.m35741a((String) obj);
                }
            });
        }
        List<String> list2 = this.male;
        if (list2 != null) {
            outLikeMsgFrontTextListConfig.male = ValueObject.util_map(list2, new w9j() { // from class: l.cz50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OutLikeMsgFrontTextListConfig.m35742b((String) obj);
                }
            });
        }
        return outLikeMsgFrontTextListConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutLikeMsgFrontTextListConfig)) {
            return false;
        }
        OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = (OutLikeMsgFrontTextListConfig) obj;
        return ValueObject.util_equals(this.female, outLikeMsgFrontTextListConfig.female) && ValueObject.util_equals(this.male, outLikeMsgFrontTextListConfig.male);
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
        List<String> list = this.female;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.male;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.female == null) {
            this.female = new ArrayList();
        }
        if (this.male == null) {
            this.male = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
