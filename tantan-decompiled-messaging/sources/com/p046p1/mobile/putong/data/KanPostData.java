package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.KanPostData;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(KanPostData kanPostData) {
            String str = kanPostData.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            KanKanStatus kanKanStatus = kanPostData.status;
            if (kanKanStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, kanKanStatus.ordinal());
            }
            List<String> list = kanPostData.backgroundColor;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            KanKanStatus kanKanStatus2 = kanPostData.status;
            if (kanKanStatus2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, kanKanStatus2, KanKanStatus.PROTOBUF_ADAPTER);
            }
            kanPostData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public KanPostData parse(nb5 nb5Var) throws IOException {
            KanPostData kanPostData = new KanPostData();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    kanPostData.url = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 26) {
                    kanPostData.backgroundColor = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 34) {
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
                    kanPostData.status = (KanKanStatus) nb5Var.m158743l(KanKanStatus.PROTOBUF_ADAPTER);
                }
            }
            return kanPostData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(KanPostData kanPostData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = kanPostData.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            KanKanStatus kanKanStatus = kanPostData.status;
            if (kanKanStatus != null) {
                codedOutputByteBufferNano.m17250G(2, kanKanStatus.ordinal());
            }
            List<String> list = kanPostData.backgroundColor;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            KanKanStatus kanKanStatus2 = kanPostData.status;
            if (kanKanStatus2 != null) {
                codedOutputByteBufferNano.m17254K(4, kanKanStatus2, KanKanStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<KanPostData> JSON_ADAPTER = new ObjectJsonAdapter<KanPostData>() { // from class: com.p1.mobile.putong.data.KanPostData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return KanPostData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public KanPostData newInstance() {
            return new KanPostData();
        }

        public boolean parseField(KanPostData kanPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    kanPostData.status = KanKanStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(KanPostData kanPostData, JsonGenerator jsonGenerator) throws IOException {
            String str = kanPostData.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (kanPostData.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                KanKanStatus.JSON_ADAPTER.serialize(kanPostData.status, jsonGenerator, true);
            }
            if (kanPostData.backgroundColor != null) {
                jsonGenerator.writeFieldName("backgroundColor");
                JsonAdapter.serializeArray(kanPostData.backgroundColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KanPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KanPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59816a(String str) {
        return str;
    }

    public static KanPostData new_() {
        KanPostData kanPostData = new KanPostData();
        kanPostData.nullCheck();
        return kanPostData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public KanPostData mo223809clone() {
        KanPostData kanPostData = new KanPostData();
        kanPostData.url = this.url;
        kanPostData.status = this.status;
        List<String> list = this.backgroundColor;
        if (list != null) {
            kanPostData.backgroundColor = ValueObject.util_map(list, new w9j() { // from class: l.dxq
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return KanPostData.m59816a((String) obj);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        KanKanStatus kanKanStatus = this.status;
        int iHashCode2 = (iHashCode + (kanKanStatus != null ? kanKanStatus.hashCode() : 0)) * 41;
        List<String> list = this.backgroundColor;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
