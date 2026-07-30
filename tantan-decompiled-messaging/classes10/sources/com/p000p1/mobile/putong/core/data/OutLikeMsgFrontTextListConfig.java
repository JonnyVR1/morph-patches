package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig;
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
public class OutLikeMsgFrontTextListConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "outlikemsgfronttextlistconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> female;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> male;
    public static ProtobufAdapter<OutLikeMsgFrontTextListConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OutLikeMsgFrontTextListConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig) {
            List<String> list = outLikeMsgFrontTextListConfig.female;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = outLikeMsgFrontTextListConfig.male;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) outLikeMsgFrontTextListConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OutLikeMsgFrontTextListConfig m14711parse(nb5 nb5Var) throws IOException {
            OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (outLikeMsgFrontTextListConfig.female == null) {
                        outLikeMsgFrontTextListConfig.female = new ArrayList();
                    }
                    if (outLikeMsgFrontTextListConfig.male != null) {
                        break;
                    }
                    outLikeMsgFrontTextListConfig.male = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    outLikeMsgFrontTextListConfig.female = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (outLikeMsgFrontTextListConfig.female == null) {
                            outLikeMsgFrontTextListConfig.female = new ArrayList();
                        }
                        if (outLikeMsgFrontTextListConfig.male != null) {
                            break;
                        }
                        outLikeMsgFrontTextListConfig.male = new ArrayList();
                        return outLikeMsgFrontTextListConfig;
                    }
                    outLikeMsgFrontTextListConfig.male = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return outLikeMsgFrontTextListConfig;
        }

        public void serialize(OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = outLikeMsgFrontTextListConfig.female;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = outLikeMsgFrontTextListConfig.male;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OutLikeMsgFrontTextListConfig> JSON_ADAPTER = new ObjectJsonAdapter<OutLikeMsgFrontTextListConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextListConfig.2
        public Class getDataClass() {
            return OutLikeMsgFrontTextListConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OutLikeMsgFrontTextListConfig m14712newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OutLikeMsgFrontTextListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OutLikeMsgFrontTextListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m543a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m544b(String str) {
        return str;
    }

    public static OutLikeMsgFrontTextListConfig new_() {
        OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
        outLikeMsgFrontTextListConfig.nullCheck();
        return outLikeMsgFrontTextListConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OutLikeMsgFrontTextListConfig m14710clone() {
        OutLikeMsgFrontTextListConfig outLikeMsgFrontTextListConfig = new OutLikeMsgFrontTextListConfig();
        List<String> list = this.female;
        if (list != null) {
            outLikeMsgFrontTextListConfig.female = ValueObject.util_map(list, new w9j() { // from class: l.bz50
                public final Object call(Object obj) {
                    return OutLikeMsgFrontTextListConfig.m543a((String) obj);
                }
            });
        }
        List<String> list2 = this.male;
        if (list2 != null) {
            outLikeMsgFrontTextListConfig.male = ValueObject.util_map(list2, new w9j() { // from class: l.cz50
                public final Object call(Object obj) {
                    return OutLikeMsgFrontTextListConfig.m544b((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.female;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.male;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.female == null) {
            this.female = new ArrayList();
        }
        if (this.male == null) {
            this.male = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
