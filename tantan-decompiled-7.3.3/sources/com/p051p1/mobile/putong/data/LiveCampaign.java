package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LiveCampaign;
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

/* JADX INFO: loaded from: classes12.dex */
public class LiveCampaign extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecampaign";

    @NonNull
    @ProtobufIndex(index = 9)
    public String campaignType;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<Double> detailInset;

    @NonNull
    @ProtobufIndex(index = 6)
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Integer> entranceSize;

    @NonNull
    @ProtobufIndex(index = 4)
    public String entranceUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39619id;

    @ProtobufIndex(index = 3)
    public int position;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Long> validPeriod;
    public static ProtobufAdapter<LiveCampaign> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCampaign>() { // from class: com.p1.mobile.putong.data.LiveCampaign.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveCampaign liveCampaign) {
            String str = liveCampaign.f39619id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveCampaign.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, liveCampaign.position);
            String str3 = liveCampaign.entranceUrl;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            List<Integer> list = liveCampaign.entranceSize;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = liveCampaign.detailUrl;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            List<Double> list2 = liveCampaign.detailInset;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(7, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = liveCampaign.validPeriod;
            if (list3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = liveCampaign.campaignType;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            liveCampaign.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCampaign parse(nc5 nc5Var) throws IOException {
            LiveCampaign liveCampaign = new LiveCampaign();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveCampaign.f39619id == null) {
                        liveCampaign.f39619id = "";
                    }
                    if (liveCampaign.type == null) {
                        liveCampaign.type = "";
                    }
                    if (liveCampaign.entranceUrl == null) {
                        liveCampaign.entranceUrl = "";
                    }
                    if (liveCampaign.entranceSize == null) {
                        liveCampaign.entranceSize = new ArrayList();
                    }
                    if (liveCampaign.detailUrl == null) {
                        liveCampaign.detailUrl = "";
                    }
                    if (liveCampaign.detailInset == null) {
                        liveCampaign.detailInset = new ArrayList();
                    }
                    if (liveCampaign.validPeriod == null) {
                        liveCampaign.validPeriod = new ArrayList();
                    }
                    if (liveCampaign.campaignType != null) {
                        break;
                    }
                    liveCampaign.campaignType = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveCampaign.f39619id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    liveCampaign.type = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    liveCampaign.position = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    liveCampaign.entranceUrl = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    liveCampaign.entranceSize = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 50) {
                    liveCampaign.detailUrl = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    liveCampaign.detailInset = (List) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 66) {
                    liveCampaign.validPeriod = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 74) {
                        if (liveCampaign.f39619id == null) {
                            liveCampaign.f39619id = "";
                        }
                        if (liveCampaign.type == null) {
                            liveCampaign.type = "";
                        }
                        if (liveCampaign.entranceUrl == null) {
                            liveCampaign.entranceUrl = "";
                        }
                        if (liveCampaign.entranceSize == null) {
                            liveCampaign.entranceSize = new ArrayList();
                        }
                        if (liveCampaign.detailUrl == null) {
                            liveCampaign.detailUrl = "";
                        }
                        if (liveCampaign.detailInset == null) {
                            liveCampaign.detailInset = new ArrayList();
                        }
                        if (liveCampaign.validPeriod == null) {
                            liveCampaign.validPeriod = new ArrayList();
                        }
                        if (liveCampaign.campaignType != null) {
                            break;
                        }
                        liveCampaign.campaignType = "";
                        return liveCampaign;
                    }
                    liveCampaign.campaignType = nc5Var.m162495s();
                }
            }
            return liveCampaign;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCampaign liveCampaign, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCampaign.f39619id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveCampaign.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, liveCampaign.position);
            String str3 = liveCampaign.entranceUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            List<Integer> list = liveCampaign.entranceSize;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = liveCampaign.detailUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            List<Double> list2 = liveCampaign.detailInset;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(7, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = liveCampaign.validPeriod;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(8, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = liveCampaign.campaignType;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
        }
    };
    public static JsonAdapter<LiveCampaign> JSON_ADAPTER = new ObjectJsonAdapter<LiveCampaign>() { // from class: com.p1.mobile.putong.data.LiveCampaign.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCampaign.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveCampaign newInstance() {
            return new LiveCampaign();
        }

        public boolean parseField(LiveCampaign liveCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "entranceSize":
                    liveCampaign.entranceSize = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detailInset":
                    liveCampaign.detailInset = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detailUrl":
                    liveCampaign.detailUrl = jsonParser.getValueAsString();
                    return true;
                case "validPeriod":
                    liveCampaign.validPeriod = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "entranceUrl":
                    liveCampaign.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveCampaign.f39619id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveCampaign.type = jsonParser.getValueAsString();
                    return true;
                case "campaignType":
                    liveCampaign.campaignType = jsonParser.getValueAsString();
                    return true;
                case "position":
                    liveCampaign.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveCampaign liveCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "entranceSize":
                case "detailInset":
                case "detailUrl":
                case "validPeriod":
                case "entranceUrl":
                    return true;
                case "id":
                    return false;
                case "type":
                case "campaignType":
                case "position":
                    return true;
                default:
                    return super.parseFieldCheck(liveCampaign, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCampaign liveCampaign, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCampaign.f39619id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveCampaign.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("position", liveCampaign.position);
            String str3 = liveCampaign.entranceUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("entranceUrl", str3);
            }
            if (liveCampaign.entranceSize != null) {
                jsonGenerator.writeFieldName("entranceSize");
                JsonAdapter.serializeArray(liveCampaign.entranceSize, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            String str4 = liveCampaign.detailUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("detailUrl", str4);
            }
            if (liveCampaign.detailInset != null) {
                jsonGenerator.writeFieldName("detailInset");
                JsonAdapter.serializeArray(liveCampaign.detailInset, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            if (liveCampaign.validPeriod != null) {
                jsonGenerator.writeFieldName("validPeriod");
                JsonAdapter.serializeArray(liveCampaign.validPeriod, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            String str5 = liveCampaign.campaignType;
            if (str5 != null) {
                jsonGenerator.writeStringField("campaignType", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m61017a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m61018b(Double d) {
        return d;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Long m61019c(Long l2) {
        return l2;
    }

    public static LiveCampaign new_() {
        LiveCampaign liveCampaign = new LiveCampaign();
        liveCampaign.nullCheck();
        return liveCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCampaign mo225055clone() {
        LiveCampaign liveCampaign = new LiveCampaign();
        liveCampaign.f39619id = this.f39619id;
        liveCampaign.type = this.type;
        liveCampaign.position = this.position;
        liveCampaign.entranceUrl = this.entranceUrl;
        List<Integer> list = this.entranceSize;
        if (list != null) {
            liveCampaign.entranceSize = ValueObject.util_map(list, new qcj() { // from class: l.f3s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveCampaign.m61017a((Integer) obj);
                }
            });
        }
        liveCampaign.detailUrl = this.detailUrl;
        List<Double> list2 = this.detailInset;
        if (list2 != null) {
            liveCampaign.detailInset = ValueObject.util_map(list2, new qcj() { // from class: l.g3s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveCampaign.m61018b((Double) obj);
                }
            });
        }
        List<Long> list3 = this.validPeriod;
        if (list3 != null) {
            liveCampaign.validPeriod = ValueObject.util_map(list3, new qcj() { // from class: l.h3s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveCampaign.m61019c((Long) obj);
                }
            });
        }
        liveCampaign.campaignType = this.campaignType;
        return liveCampaign;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCampaign)) {
            return false;
        }
        LiveCampaign liveCampaign = (LiveCampaign) obj;
        return ValueObject.util_equals(this.f39619id, liveCampaign.f39619id) && ValueObject.util_equals(this.type, liveCampaign.type) && this.position == liveCampaign.position && ValueObject.util_equals(this.entranceUrl, liveCampaign.entranceUrl) && ValueObject.util_equals(this.entranceSize, liveCampaign.entranceSize) && ValueObject.util_equals(this.detailUrl, liveCampaign.detailUrl) && ValueObject.util_equals(this.detailInset, liveCampaign.detailInset) && ValueObject.util_equals(this.validPeriod, liveCampaign.validPeriod) && ValueObject.util_equals(this.campaignType, liveCampaign.campaignType);
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
        String str = this.f39619id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.position) * 41;
        String str3 = this.entranceUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Integer> list = this.entranceSize;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.detailUrl;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<Double> list2 = this.detailInset;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Long> list3 = this.validPeriod;
        int iHashCode7 = (iHashCode6 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str5 = this.campaignType;
        int iHashCode8 = iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39619id == null) {
            this.f39619id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
        }
        if (this.entranceSize == null) {
            this.entranceSize = new ArrayList();
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
        if (this.detailInset == null) {
            this.detailInset = new ArrayList();
        }
        if (this.validPeriod == null) {
            this.validPeriod = new ArrayList();
        }
        if (this.campaignType == null) {
            this.campaignType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
