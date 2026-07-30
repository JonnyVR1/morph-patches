package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo;
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
public class MonetizationHomeSeeVisitorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationhomeseevisitorinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> newAvatars;

    @ProtobufIndex(index = 1)
    public int newCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> recentAvatars;
    public static ProtobufAdapter<MonetizationHomeSeeVisitorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationHomeSeeVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, monetizationHomeSeeVisitorInfo.newCount);
            List<String> list = monetizationHomeSeeVisitorInfo.newAvatars;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = monetizationHomeSeeVisitorInfo.recentAvatars;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            monetizationHomeSeeVisitorInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationHomeSeeVisitorInfo parse(nb5 nb5Var) throws IOException {
            MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (monetizationHomeSeeVisitorInfo.newAvatars == null) {
                        monetizationHomeSeeVisitorInfo.newAvatars = new ArrayList();
                    }
                    if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                        break;
                    }
                    monetizationHomeSeeVisitorInfo.recentAvatars = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    monetizationHomeSeeVisitorInfo.newCount = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    monetizationHomeSeeVisitorInfo.newAvatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (monetizationHomeSeeVisitorInfo.newAvatars == null) {
                            monetizationHomeSeeVisitorInfo.newAvatars = new ArrayList();
                        }
                        if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                            break;
                        }
                        monetizationHomeSeeVisitorInfo.recentAvatars = new ArrayList();
                        return monetizationHomeSeeVisitorInfo;
                    }
                    monetizationHomeSeeVisitorInfo.recentAvatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return monetizationHomeSeeVisitorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, monetizationHomeSeeVisitorInfo.newCount);
            List<String> list = monetizationHomeSeeVisitorInfo.newAvatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = monetizationHomeSeeVisitorInfo.recentAvatars;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MonetizationHomeSeeVisitorInfo> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationHomeSeeVisitorInfo>() { // from class: com.p1.mobile.putong.core.data.MonetizationHomeSeeVisitorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationHomeSeeVisitorInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationHomeSeeVisitorInfo newInstance() {
            return new MonetizationHomeSeeVisitorInfo();
        }

        public boolean parseField(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newAvatars":
                    monetizationHomeSeeVisitorInfo.newAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recentAvatars":
                    monetizationHomeSeeVisitorInfo.recentAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "newCount":
                    monetizationHomeSeeVisitorInfo.newCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newAvatars":
                case "recentAvatars":
                case "newCount":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationHomeSeeVisitorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCount", monetizationHomeSeeVisitorInfo.newCount);
            if (monetizationHomeSeeVisitorInfo.newAvatars != null) {
                jsonGenerator.writeFieldName("newAvatars");
                JsonAdapter.serializeArray(monetizationHomeSeeVisitorInfo.newAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (monetizationHomeSeeVisitorInfo.recentAvatars != null) {
                jsonGenerator.writeFieldName("recentAvatars");
                JsonAdapter.serializeArray(monetizationHomeSeeVisitorInfo.recentAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationHomeSeeVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationHomeSeeVisitorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35695a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35696b(String str) {
        return str;
    }

    public static MonetizationHomeSeeVisitorInfo new_() {
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
        monetizationHomeSeeVisitorInfo.nullCheck();
        return monetizationHomeSeeVisitorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationHomeSeeVisitorInfo mo223809clone() {
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = new MonetizationHomeSeeVisitorInfo();
        monetizationHomeSeeVisitorInfo.newCount = this.newCount;
        List<String> list = this.newAvatars;
        if (list != null) {
            monetizationHomeSeeVisitorInfo.newAvatars = ValueObject.util_map(list, new w9j() { // from class: l.lx00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MonetizationHomeSeeVisitorInfo.m35695a((String) obj);
                }
            });
        }
        List<String> list2 = this.recentAvatars;
        if (list2 != null) {
            monetizationHomeSeeVisitorInfo.recentAvatars = ValueObject.util_map(list2, new w9j() { // from class: l.mx00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MonetizationHomeSeeVisitorInfo.m35696b((String) obj);
                }
            });
        }
        return monetizationHomeSeeVisitorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationHomeSeeVisitorInfo)) {
            return false;
        }
        MonetizationHomeSeeVisitorInfo monetizationHomeSeeVisitorInfo = (MonetizationHomeSeeVisitorInfo) obj;
        return this.newCount == monetizationHomeSeeVisitorInfo.newCount && ValueObject.util_equals(this.newAvatars, monetizationHomeSeeVisitorInfo.newAvatars) && ValueObject.util_equals(this.recentAvatars, monetizationHomeSeeVisitorInfo.recentAvatars);
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
        int i2 = ((i * 41) + this.newCount) * 41;
        List<String> list = this.newAvatars;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.recentAvatars;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.newAvatars == null) {
            this.newAvatars = new ArrayList();
        }
        if (this.recentAvatars == null) {
            this.recentAvatars = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
