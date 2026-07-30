package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ODiamondStatisticsDetail;
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
public class ODiamondStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondstatistics";

    @ProtobufIndex(index = 4)
    public boolean open;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<ODiamondStatisticsDetail> statistics;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<ODiamondStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondStatistics>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatistics.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondStatistics oDiamondStatistics) {
            String str = oDiamondStatistics.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oDiamondStatistics.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<ODiamondStatisticsDetail> list = oDiamondStatistics.statistics;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ODiamondStatisticsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, oDiamondStatistics.open);
            oDiamondStatistics.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondStatistics parse(nc5 nc5Var) throws IOException {
            ODiamondStatistics oDiamondStatistics = new ODiamondStatistics();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondStatistics.title == null) {
                        oDiamondStatistics.title = "";
                    }
                    if (oDiamondStatistics.subTitle == null) {
                        oDiamondStatistics.subTitle = "";
                    }
                    if (oDiamondStatistics.statistics != null) {
                        break;
                    }
                    oDiamondStatistics.statistics = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondStatistics.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    oDiamondStatistics.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    oDiamondStatistics.statistics = (List) nc5Var.m162488l(ODiamondStatisticsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 32) {
                        if (oDiamondStatistics.title == null) {
                            oDiamondStatistics.title = "";
                        }
                        if (oDiamondStatistics.subTitle == null) {
                            oDiamondStatistics.subTitle = "";
                        }
                        if (oDiamondStatistics.statistics != null) {
                            break;
                        }
                        oDiamondStatistics.statistics = new ArrayList();
                        return oDiamondStatistics;
                    }
                    oDiamondStatistics.open = nc5Var.m162483g();
                }
            }
            return oDiamondStatistics;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondStatistics oDiamondStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondStatistics.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oDiamondStatistics.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<ODiamondStatisticsDetail> list = oDiamondStatistics.statistics;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ODiamondStatisticsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(4, oDiamondStatistics.open);
        }
    };
    public static JsonAdapter<ODiamondStatistics> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondStatistics>() { // from class: com.p1.mobile.putong.core.data.ODiamondStatistics.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondStatistics.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondStatistics newInstance() {
            return new ODiamondStatistics();
        }

        public boolean parseField(ODiamondStatistics oDiamondStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    oDiamondStatistics.subTitle = jsonParser.getValueAsString();
                    return true;
                case "statistics":
                    oDiamondStatistics.statistics = JsonAdapter.parseArray(jsonParser, ODiamondStatisticsDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "open":
                    oDiamondStatistics.open = jsonParser.getValueAsBoolean();
                    return true;
                case "title":
                    oDiamondStatistics.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondStatistics oDiamondStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "statistics":
                case "open":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondStatistics, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondStatistics oDiamondStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondStatistics.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = oDiamondStatistics.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (oDiamondStatistics.statistics != null) {
                jsonGenerator.writeFieldName("statistics");
                JsonAdapter.serializeArray(oDiamondStatistics.statistics, jsonGenerator, ODiamondStatisticsDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("open", oDiamondStatistics.open);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondStatistics new_() {
        ODiamondStatistics oDiamondStatistics = new ODiamondStatistics();
        oDiamondStatistics.nullCheck();
        return oDiamondStatistics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondStatistics mo225055clone() {
        ODiamondStatistics oDiamondStatistics = new ODiamondStatistics();
        oDiamondStatistics.title = this.title;
        oDiamondStatistics.subTitle = this.subTitle;
        List<ODiamondStatisticsDetail> list = this.statistics;
        if (list != null) {
            oDiamondStatistics.statistics = ValueObject.util_map(list, new qcj() { // from class: l.f650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ODiamondStatisticsDetail) obj).mo225055clone();
                }
            });
        }
        oDiamondStatistics.open = this.open;
        return oDiamondStatistics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondStatistics)) {
            return false;
        }
        ODiamondStatistics oDiamondStatistics = (ODiamondStatistics) obj;
        return ValueObject.util_equals(this.title, oDiamondStatistics.title) && ValueObject.util_equals(this.subTitle, oDiamondStatistics.subTitle) && ValueObject.util_equals(this.statistics, oDiamondStatistics.statistics) && this.open == oDiamondStatistics.open;
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<ODiamondStatisticsDetail> list = this.statistics;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + (this.open ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.statistics == null) {
            this.statistics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
