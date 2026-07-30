package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LiveSquareSummary;
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
public class LiveSquareSummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livesquaresummary";

    @ProtobufIndex(index = 3)
    public int defaultTabId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @Nullable
    @ProtobufIndex(index = 6)
    public String extTabId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39623id;

    @ProtobufIndex(index = 9)
    public boolean isJumpToActivitySquareSummaries;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> liveIds;

    @NonNull
    @ProtobufIndex(index = 8)
    public String style;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subDescription;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<LiveSquareSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveSquareSummary>() { // from class: com.p1.mobile.putong.data.LiveSquareSummary.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveSquareSummary liveSquareSummary) {
            String str = liveSquareSummary.f39623id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveSquareSummary.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, liveSquareSummary.defaultTabId);
            List<String> list = liveSquareSummary.liveIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveSquareSummary.type;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = liveSquareSummary.extTabId;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = liveSquareSummary.subDescription;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = liveSquareSummary.style;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(9, liveSquareSummary.isJumpToActivitySquareSummaries);
            liveSquareSummary.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveSquareSummary parse(nc5 nc5Var) throws IOException {
            LiveSquareSummary liveSquareSummary = new LiveSquareSummary();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveSquareSummary.f39623id == null) {
                        liveSquareSummary.f39623id = "";
                    }
                    if (liveSquareSummary.description == null) {
                        liveSquareSummary.description = "";
                    }
                    if (liveSquareSummary.liveIds == null) {
                        liveSquareSummary.liveIds = new ArrayList();
                    }
                    if (liveSquareSummary.type == null) {
                        liveSquareSummary.type = "";
                    }
                    if (liveSquareSummary.subDescription == null) {
                        liveSquareSummary.subDescription = "";
                    }
                    if (liveSquareSummary.style != null) {
                        break;
                    }
                    liveSquareSummary.style = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveSquareSummary.f39623id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    liveSquareSummary.description = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    liveSquareSummary.defaultTabId = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    liveSquareSummary.liveIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    liveSquareSummary.type = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    liveSquareSummary.extTabId = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    liveSquareSummary.subDescription = nc5Var.m162495s();
                } else if (iM162497u == 66) {
                    liveSquareSummary.style = nc5Var.m162495s();
                } else {
                    if (iM162497u != 72) {
                        if (liveSquareSummary.f39623id == null) {
                            liveSquareSummary.f39623id = "";
                        }
                        if (liveSquareSummary.description == null) {
                            liveSquareSummary.description = "";
                        }
                        if (liveSquareSummary.liveIds == null) {
                            liveSquareSummary.liveIds = new ArrayList();
                        }
                        if (liveSquareSummary.type == null) {
                            liveSquareSummary.type = "";
                        }
                        if (liveSquareSummary.subDescription == null) {
                            liveSquareSummary.subDescription = "";
                        }
                        if (liveSquareSummary.style != null) {
                            break;
                        }
                        liveSquareSummary.style = "";
                        return liveSquareSummary;
                    }
                    liveSquareSummary.isJumpToActivitySquareSummaries = nc5Var.m162483g();
                }
            }
            return liveSquareSummary;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveSquareSummary liveSquareSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveSquareSummary.f39623id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveSquareSummary.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, liveSquareSummary.defaultTabId);
            List<String> list = liveSquareSummary.liveIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveSquareSummary.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = liveSquareSummary.extTabId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = liveSquareSummary.subDescription;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = liveSquareSummary.style;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
            codedOutputByteBufferNano.m17299A(9, liveSquareSummary.isJumpToActivitySquareSummaries);
        }
    };
    public static JsonAdapter<LiveSquareSummary> JSON_ADAPTER = new ObjectJsonAdapter<LiveSquareSummary>() { // from class: com.p1.mobile.putong.data.LiveSquareSummary.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveSquareSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveSquareSummary newInstance() {
            return new LiveSquareSummary();
        }

        public boolean parseField(LiveSquareSummary liveSquareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "extTabId":
                    liveSquareSummary.extTabId = jsonParser.getValueAsString();
                    return true;
                case "description":
                    liveSquareSummary.description = jsonParser.getValueAsString();
                    return true;
                case "defaultTabId":
                    liveSquareSummary.defaultTabId = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    liveSquareSummary.f39623id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveSquareSummary.type = jsonParser.getValueAsString();
                    return true;
                case "style":
                    liveSquareSummary.style = jsonParser.getValueAsString();
                    return true;
                case "liveIds":
                    liveSquareSummary.liveIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isJumpToActivitySquareSummaries":
                    liveSquareSummary.isJumpToActivitySquareSummaries = jsonParser.getValueAsBoolean();
                    return true;
                case "subDescription":
                    liveSquareSummary.subDescription = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveSquareSummary liveSquareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "extTabId":
                case "description":
                case "defaultTabId":
                    return true;
                case "id":
                    return false;
                case "type":
                case "style":
                case "liveIds":
                case "isJumpToActivitySquareSummaries":
                case "subDescription":
                    return true;
                default:
                    return super.parseFieldCheck(liveSquareSummary, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveSquareSummary liveSquareSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = liveSquareSummary.f39623id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveSquareSummary.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            jsonGenerator.writeNumberField("defaultTabId", liveSquareSummary.defaultTabId);
            if (liveSquareSummary.liveIds != null) {
                jsonGenerator.writeFieldName("liveIds");
                JsonAdapter.serializeArray(liveSquareSummary.liveIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = liveSquareSummary.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = liveSquareSummary.extTabId;
            if (str4 != null) {
                jsonGenerator.writeStringField("extTabId", str4);
            }
            String str5 = liveSquareSummary.subDescription;
            if (str5 != null) {
                jsonGenerator.writeStringField("subDescription", str5);
            }
            String str6 = liveSquareSummary.style;
            if (str6 != null) {
                jsonGenerator.writeStringField("style", str6);
            }
            jsonGenerator.writeBooleanField("isJumpToActivitySquareSummaries", liveSquareSummary.isJumpToActivitySquareSummaries);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveSquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveSquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61024a(String str) {
        return str;
    }

    public static LiveSquareSummary new_() {
        LiveSquareSummary liveSquareSummary = new LiveSquareSummary();
        liveSquareSummary.nullCheck();
        return liveSquareSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveSquareSummary mo225055clone() {
        LiveSquareSummary liveSquareSummary = new LiveSquareSummary();
        liveSquareSummary.f39623id = this.f39623id;
        liveSquareSummary.description = this.description;
        liveSquareSummary.defaultTabId = this.defaultTabId;
        List<String> list = this.liveIds;
        if (list != null) {
            liveSquareSummary.liveIds = ValueObject.util_map(list, new qcj() { // from class: l.q5u
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveSquareSummary.m61024a((String) obj);
                }
            });
        }
        liveSquareSummary.type = this.type;
        liveSquareSummary.extTabId = this.extTabId;
        liveSquareSummary.subDescription = this.subDescription;
        liveSquareSummary.style = this.style;
        liveSquareSummary.isJumpToActivitySquareSummaries = this.isJumpToActivitySquareSummaries;
        return liveSquareSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveSquareSummary)) {
            return false;
        }
        LiveSquareSummary liveSquareSummary = (LiveSquareSummary) obj;
        return ValueObject.util_equals(this.f39623id, liveSquareSummary.f39623id) && ValueObject.util_equals(this.description, liveSquareSummary.description) && this.defaultTabId == liveSquareSummary.defaultTabId && ValueObject.util_equals(this.liveIds, liveSquareSummary.liveIds) && ValueObject.util_equals(this.type, liveSquareSummary.type) && ValueObject.util_equals(this.extTabId, liveSquareSummary.extTabId) && ValueObject.util_equals(this.subDescription, liveSquareSummary.subDescription) && ValueObject.util_equals(this.style, liveSquareSummary.style) && this.isJumpToActivitySquareSummaries == liveSquareSummary.isJumpToActivitySquareSummaries;
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
        String str = this.f39623id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.defaultTabId) * 41;
        List<String> list = this.liveIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.extTabId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subDescription;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.style;
        int iHashCode7 = ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.isJumpToActivitySquareSummaries ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39623id == null) {
            this.f39623id = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.liveIds == null) {
            this.liveIds = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.subDescription == null) {
            this.subDescription = "";
        }
        if (this.style == null) {
            this.style = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
