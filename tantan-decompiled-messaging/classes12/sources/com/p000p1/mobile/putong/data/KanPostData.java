package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class KanPostData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "kanpostdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> backgroundColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public KanKanStatus status;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<KanPostData> PROTOBUF_ADAPTER = new MessageNanoAdapter<KanPostData>() { // from class: com.p1.mobile.putong.data.KanPostData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(KanPostData kanPostData) {
            String str = kanPostData.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            KanKanStatus kanKanStatus = kanPostData.status;
            if (kanKanStatus != null) {
                iO += CodedOutputByteBufferNano.h(2, kanKanStatus.ordinal());
            }
            List<String> list = kanPostData.backgroundColor;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            KanKanStatus kanKanStatus2 = kanPostData.status;
            if (kanKanStatus2 != null) {
                iO += CodedOutputByteBufferNano.l(4, kanKanStatus2, KanKanStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) kanPostData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public KanPostData m18274parse(nb5 nb5Var) throws IOException {
            KanPostData kanPostData = new KanPostData();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (kanPostData.status == null && numValueOf != null) {
                        kanPostData.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (kanPostData.url == null) {
                        kanPostData.url = "";
                    }
                    if (kanPostData.status == null) {
                        kanPostData.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (kanPostData.backgroundColor != null) {
                        break;
                    }
                    kanPostData.backgroundColor = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    kanPostData.url = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    kanPostData.backgroundColor = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (kanPostData.status == null && numValueOf != null) {
                            kanPostData.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (kanPostData.url == null) {
                            kanPostData.url = "";
                        }
                        if (kanPostData.status == null) {
                            kanPostData.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (kanPostData.backgroundColor != null) {
                            break;
                        }
                        kanPostData.backgroundColor = new ArrayList();
                        return kanPostData;
                    }
                    kanPostData.status = (KanKanStatus) nb5Var.l(KanKanStatus.PROTOBUF_ADAPTER);
                }
            }
            return kanPostData;
        }

        public void serialize(KanPostData kanPostData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = kanPostData.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            KanKanStatus kanKanStatus = kanPostData.status;
            if (kanKanStatus != null) {
                codedOutputByteBufferNano.G(2, kanKanStatus.ordinal());
            }
            List<String> list = kanPostData.backgroundColor;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            KanKanStatus kanKanStatus2 = kanPostData.status;
            if (kanKanStatus2 != null) {
                codedOutputByteBufferNano.K(4, kanKanStatus2, KanKanStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<KanPostData> JSON_ADAPTER = new ObjectJsonAdapter<KanPostData>() { // from class: com.p1.mobile.putong.data.KanPostData.2
        public Class getDataClass() {
            return KanPostData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public KanPostData mo17830newInstance() {
            return new KanPostData();
        }

        public boolean parseField(KanPostData kanPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    kanPostData.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "url":
                    kanPostData.url = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    kanPostData.backgroundColor = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(KanPostData kanPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "url":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(kanPostData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(KanPostData kanPostData, JsonGenerator jsonGenerator) throws IOException {
            String str = kanPostData.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (kanPostData.status != null) {
                jsonGenerator.writeFieldName("status");
                KanKanStatus.JSON_ADAPTER.serialize(kanPostData.status, jsonGenerator, true);
            }
            if (kanPostData.backgroundColor != null) {
                jsonGenerator.writeFieldName("backgroundColor");
                JsonAdapter.serializeArray(kanPostData.backgroundColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KanPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KanPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m734a(String str) {
        return str;
    }

    public static KanPostData new_() {
        KanPostData kanPostData = new KanPostData();
        kanPostData.nullCheck();
        return kanPostData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public KanPostData m18273clone() {
        KanPostData kanPostData = new KanPostData();
        kanPostData.url = this.url;
        kanPostData.status = this.status;
        List<String> list = this.backgroundColor;
        if (list != null) {
            kanPostData.backgroundColor = ValueObject.util_map(list, new w9j() { // from class: l.dxq
                public final Object call(Object obj) {
                    return KanPostData.m734a((String) obj);
                }
            });
        }
        return kanPostData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KanPostData)) {
            return false;
        }
        KanPostData kanPostData = (KanPostData) obj;
        return ValueObject.util_equals(this.url, kanPostData.url) && ValueObject.util_equals(this.status, kanPostData.status) && ValueObject.util_equals(this.backgroundColor, kanPostData.backgroundColor);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        KanKanStatus kanKanStatus = this.status;
        int iHashCode2 = (iHashCode + (kanKanStatus != null ? kanKanStatus.hashCode() : 0)) * 41;
        List<String> list = this.backgroundColor;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.status == null) {
            this.status = (KanKanStatus) KanKanStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
