package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AiAlbumCheckingData;
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
public class AiAlbumCheckingData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumcheckingdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @NonNull
    @ProtobufIndex(index = 5)
    public String albumId;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> bad;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> good;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> origin;
    public static ProtobufAdapter<AiAlbumCheckingData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumCheckingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckingData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumCheckingData aiAlbumCheckingData) {
            String str = aiAlbumCheckingData.action;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = aiAlbumCheckingData.origin;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = aiAlbumCheckingData.good;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = aiAlbumCheckingData.bad;
            if (list3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aiAlbumCheckingData.albumId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            aiAlbumCheckingData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumCheckingData parse(nc5 nc5Var) throws IOException {
            AiAlbumCheckingData aiAlbumCheckingData = new AiAlbumCheckingData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiAlbumCheckingData.action == null) {
                        aiAlbumCheckingData.action = "";
                    }
                    if (aiAlbumCheckingData.origin == null) {
                        aiAlbumCheckingData.origin = new ArrayList();
                    }
                    if (aiAlbumCheckingData.good == null) {
                        aiAlbumCheckingData.good = new ArrayList();
                    }
                    if (aiAlbumCheckingData.bad == null) {
                        aiAlbumCheckingData.bad = new ArrayList();
                    }
                    if (aiAlbumCheckingData.albumId != null) {
                        break;
                    }
                    aiAlbumCheckingData.albumId = "";
                    break;
                }
                if (iM162497u == 10) {
                    aiAlbumCheckingData.action = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    aiAlbumCheckingData.origin = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    aiAlbumCheckingData.good = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 34) {
                    aiAlbumCheckingData.bad = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 42) {
                        if (aiAlbumCheckingData.action == null) {
                            aiAlbumCheckingData.action = "";
                        }
                        if (aiAlbumCheckingData.origin == null) {
                            aiAlbumCheckingData.origin = new ArrayList();
                        }
                        if (aiAlbumCheckingData.good == null) {
                            aiAlbumCheckingData.good = new ArrayList();
                        }
                        if (aiAlbumCheckingData.bad == null) {
                            aiAlbumCheckingData.bad = new ArrayList();
                        }
                        if (aiAlbumCheckingData.albumId != null) {
                            break;
                        }
                        aiAlbumCheckingData.albumId = "";
                        return aiAlbumCheckingData;
                    }
                    aiAlbumCheckingData.albumId = nc5Var.m162495s();
                }
            }
            return aiAlbumCheckingData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumCheckingData aiAlbumCheckingData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumCheckingData.action;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = aiAlbumCheckingData.origin;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = aiAlbumCheckingData.good;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = aiAlbumCheckingData.bad;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = aiAlbumCheckingData.albumId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
        }
    };
    public static JsonAdapter<AiAlbumCheckingData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumCheckingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckingData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumCheckingData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumCheckingData newInstance() {
            return new AiAlbumCheckingData();
        }

        public boolean parseField(AiAlbumCheckingData aiAlbumCheckingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    aiAlbumCheckingData.action = jsonParser.getValueAsString();
                    return true;
                case "origin":
                    aiAlbumCheckingData.origin = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "albumId":
                    aiAlbumCheckingData.albumId = jsonParser.getValueAsString();
                    return true;
                case "bad":
                    aiAlbumCheckingData.bad = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "good":
                    aiAlbumCheckingData.good = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AiAlbumCheckingData aiAlbumCheckingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "origin":
                case "albumId":
                case "bad":
                case "good":
                    return true;
                default:
                    return super.parseFieldCheck(aiAlbumCheckingData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumCheckingData aiAlbumCheckingData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumCheckingData.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            if (aiAlbumCheckingData.origin != null) {
                jsonGenerator.writeFieldName("origin");
                JsonAdapter.serializeArray(aiAlbumCheckingData.origin, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (aiAlbumCheckingData.good != null) {
                jsonGenerator.writeFieldName(AIMessageFeedback.good);
                JsonAdapter.serializeArray(aiAlbumCheckingData.good, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (aiAlbumCheckingData.bad != null) {
                jsonGenerator.writeFieldName(AIMessageFeedback.bad);
                JsonAdapter.serializeArray(aiAlbumCheckingData.bad, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = aiAlbumCheckingData.albumId;
            if (str2 != null) {
                jsonGenerator.writeStringField("albumId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumCheckingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumCheckingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36213a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36214b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36215c(String str) {
        return str;
    }

    public static AiAlbumCheckingData new_() {
        AiAlbumCheckingData aiAlbumCheckingData = new AiAlbumCheckingData();
        aiAlbumCheckingData.nullCheck();
        return aiAlbumCheckingData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumCheckingData mo225055clone() {
        AiAlbumCheckingData aiAlbumCheckingData = new AiAlbumCheckingData();
        aiAlbumCheckingData.action = this.action;
        List<String> list = this.origin;
        if (list != null) {
            aiAlbumCheckingData.origin = ValueObject.util_map(list, new qcj() { // from class: l.pd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AiAlbumCheckingData.m36213a((String) obj);
                }
            });
        }
        List<String> list2 = this.good;
        if (list2 != null) {
            aiAlbumCheckingData.good = ValueObject.util_map(list2, new qcj() { // from class: l.qd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AiAlbumCheckingData.m36214b((String) obj);
                }
            });
        }
        List<String> list3 = this.bad;
        if (list3 != null) {
            aiAlbumCheckingData.bad = ValueObject.util_map(list3, new qcj() { // from class: l.rd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AiAlbumCheckingData.m36215c((String) obj);
                }
            });
        }
        aiAlbumCheckingData.albumId = this.albumId;
        return aiAlbumCheckingData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumCheckingData)) {
            return false;
        }
        AiAlbumCheckingData aiAlbumCheckingData = (AiAlbumCheckingData) obj;
        return ValueObject.util_equals(this.action, aiAlbumCheckingData.action) && ValueObject.util_equals(this.origin, aiAlbumCheckingData.origin) && ValueObject.util_equals(this.good, aiAlbumCheckingData.good) && ValueObject.util_equals(this.bad, aiAlbumCheckingData.bad) && ValueObject.util_equals(this.albumId, aiAlbumCheckingData.albumId);
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.origin;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.good;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.bad;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str2 = this.albumId;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.origin == null) {
            this.origin = new ArrayList();
        }
        if (this.good == null) {
            this.good = new ArrayList();
        }
        if (this.bad == null) {
            this.bad = new ArrayList();
        }
        if (this.albumId == null) {
            this.albumId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
