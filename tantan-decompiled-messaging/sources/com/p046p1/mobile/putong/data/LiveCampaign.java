package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiveCampaign;
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
    public String f38771id;

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
            String str = liveCampaign.f38771id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveCampaign.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, liveCampaign.position);
            String str3 = liveCampaign.entranceUrl;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            List<Integer> list = liveCampaign.entranceSize;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = liveCampaign.detailUrl;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            List<Double> list2 = liveCampaign.detailInset;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = liveCampaign.validPeriod;
            if (list3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = liveCampaign.campaignType;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str5);
            }
            liveCampaign.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCampaign parse(nb5 nb5Var) throws IOException {
            LiveCampaign liveCampaign = new LiveCampaign();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveCampaign.f38771id == null) {
                        liveCampaign.f38771id = "";
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
                if (iM158752u == 10) {
                    liveCampaign.f38771id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveCampaign.type = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    liveCampaign.position = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    liveCampaign.entranceUrl = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    liveCampaign.entranceSize = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    liveCampaign.detailUrl = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    liveCampaign.detailInset = (List) nb5Var.m158743l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 66) {
                    liveCampaign.validPeriod = (List) nb5Var.m158743l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 74) {
                        if (liveCampaign.f38771id == null) {
                            liveCampaign.f38771id = "";
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
                    liveCampaign.campaignType = nb5Var.m158750s();
                }
            }
            return liveCampaign;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCampaign liveCampaign, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCampaign.f38771id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveCampaign.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, liveCampaign.position);
            String str3 = liveCampaign.entranceUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            List<Integer> list = liveCampaign.entranceSize;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = liveCampaign.detailUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            List<Double> list2 = liveCampaign.detailInset;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(7, list2, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = liveCampaign.validPeriod;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(8, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = liveCampaign.campaignType;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(9, str5);
            }
        }
    };
    public static JsonAdapter<LiveCampaign> JSON_ADAPTER = new ObjectJsonAdapter<LiveCampaign>() { // from class: com.p1.mobile.putong.data.LiveCampaign.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCampaign.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    liveCampaign.f38771id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCampaign liveCampaign, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCampaign.f38771id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m59833a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m59834b(Double d) {
        return d;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Long m59835c(Long l2) {
        return l2;
    }

    public static LiveCampaign new_() {
        LiveCampaign liveCampaign = new LiveCampaign();
        liveCampaign.nullCheck();
        return liveCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCampaign mo223809clone() {
        LiveCampaign liveCampaign = new LiveCampaign();
        liveCampaign.f38771id = this.f38771id;
        liveCampaign.type = this.type;
        liveCampaign.position = this.position;
        liveCampaign.entranceUrl = this.entranceUrl;
        List<Integer> list = this.entranceSize;
        if (list != null) {
            liveCampaign.entranceSize = ValueObject.util_map(list, new w9j() { // from class: l.e1s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveCampaign.m59833a((Integer) obj);
                }
            });
        }
        liveCampaign.detailUrl = this.detailUrl;
        List<Double> list2 = this.detailInset;
        if (list2 != null) {
            liveCampaign.detailInset = ValueObject.util_map(list2, new w9j() { // from class: l.f1s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveCampaign.m59834b((Double) obj);
                }
            });
        }
        List<Long> list3 = this.validPeriod;
        if (list3 != null) {
            liveCampaign.validPeriod = ValueObject.util_map(list3, new w9j() { // from class: l.g1s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveCampaign.m59835c((Long) obj);
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
        return ValueObject.util_equals(this.f38771id, liveCampaign.f38771id) && ValueObject.util_equals(this.type, liveCampaign.type) && this.position == liveCampaign.position && ValueObject.util_equals(this.entranceUrl, liveCampaign.entranceUrl) && ValueObject.util_equals(this.entranceSize, liveCampaign.entranceSize) && ValueObject.util_equals(this.detailUrl, liveCampaign.detailUrl) && ValueObject.util_equals(this.detailInset, liveCampaign.detailInset) && ValueObject.util_equals(this.validPeriod, liveCampaign.validPeriod) && ValueObject.util_equals(this.campaignType, liveCampaign.campaignType);
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
        String str = this.f38771id;
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
        if (this.f38771id == null) {
            this.f38771id = "";
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
