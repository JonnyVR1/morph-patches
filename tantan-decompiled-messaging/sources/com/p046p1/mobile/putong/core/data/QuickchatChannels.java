package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.QuickchatChannels;
import com.p046p1.mobile.putong.data.Converter;
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
public class QuickchatChannels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatchannels";

    @ProtobufIndex(index = 4)
    public double expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20483id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> superlikeSentUserID;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> usedExpiredPropUserID;

    @ProtobufIndex(index = 5)
    public boolean userMatched;
    public static ProtobufAdapter<QuickchatChannels> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickchatChannels>() { // from class: com.p1.mobile.putong.core.data.QuickchatChannels.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuickchatChannels quickchatChannels) {
            String str = quickchatChannels.f20483id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = quickchatChannels.usedExpiredPropUserID;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = quickchatChannels.superlikeSentUserID;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(4, quickchatChannels.expiredTime) + CodedOutputByteBufferNano.m17220b(5, quickchatChannels.userMatched);
            quickchatChannels.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuickchatChannels parse(nb5 nb5Var) throws IOException {
            QuickchatChannels quickchatChannels = new QuickchatChannels();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (quickchatChannels.f20483id == null) {
                        quickchatChannels.f20483id = "";
                    }
                    if (quickchatChannels.usedExpiredPropUserID == null) {
                        quickchatChannels.usedExpiredPropUserID = new ArrayList();
                    }
                    if (quickchatChannels.superlikeSentUserID != null) {
                        break;
                    }
                    quickchatChannels.superlikeSentUserID = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    quickchatChannels.f20483id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    quickchatChannels.usedExpiredPropUserID = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    quickchatChannels.superlikeSentUserID = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 33) {
                    quickchatChannels.expiredTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 40) {
                        if (quickchatChannels.f20483id == null) {
                            quickchatChannels.f20483id = "";
                        }
                        if (quickchatChannels.usedExpiredPropUserID == null) {
                            quickchatChannels.usedExpiredPropUserID = new ArrayList();
                        }
                        if (quickchatChannels.superlikeSentUserID != null) {
                            break;
                        }
                        quickchatChannels.superlikeSentUserID = new ArrayList();
                        return quickchatChannels;
                    }
                    quickchatChannels.userMatched = nb5Var.m158738g();
                }
            }
            return quickchatChannels;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuickchatChannels quickchatChannels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickchatChannels.f20483id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = quickchatChannels.usedExpiredPropUserID;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = quickchatChannels.superlikeSentUserID;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(4, quickchatChannels.expiredTime);
            codedOutputByteBufferNano.m17244A(5, quickchatChannels.userMatched);
        }
    };
    public static JsonAdapter<QuickchatChannels> JSON_ADAPTER = new ObjectJsonAdapter<QuickchatChannels>() { // from class: com.p1.mobile.putong.core.data.QuickchatChannels.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuickchatChannels.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuickchatChannels newInstance() {
            return new QuickchatChannels();
        }

        public boolean parseField(QuickchatChannels quickchatChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "usedExpiredPropUserID":
                    quickchatChannels.usedExpiredPropUserID = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expiredTime":
                    quickchatChannels.expiredTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    quickchatChannels.f20483id = jsonParser.getValueAsString();
                    return false;
                case "userMatched":
                    quickchatChannels.userMatched = jsonParser.getValueAsBoolean();
                    return true;
                case "superlikeSentUserID":
                    quickchatChannels.superlikeSentUserID = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickchatChannels quickchatChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "usedExpiredPropUserID":
                case "expiredTime":
                    return true;
                case "id":
                    return false;
                case "userMatched":
                case "superlikeSentUserID":
                    return true;
                default:
                    return super.parseFieldCheck(quickchatChannels, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuickchatChannels quickchatChannels, JsonGenerator jsonGenerator) throws IOException {
            String str = quickchatChannels.f20483id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (quickchatChannels.usedExpiredPropUserID != null) {
                jsonGenerator.writeFieldName("usedExpiredPropUserID");
                JsonAdapter.serializeArray(quickchatChannels.usedExpiredPropUserID, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (quickchatChannels.superlikeSentUserID != null) {
                jsonGenerator.writeFieldName("superlikeSentUserID");
                JsonAdapter.serializeArray(quickchatChannels.superlikeSentUserID, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(quickchatChannels.expiredTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("userMatched", quickchatChannels.userMatched);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickchatChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickchatChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35800a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35801b(String str) {
        return str;
    }

    public static QuickchatChannels new_() {
        QuickchatChannels quickchatChannels = new QuickchatChannels();
        quickchatChannels.nullCheck();
        return quickchatChannels;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuickchatChannels mo223809clone() {
        QuickchatChannels quickchatChannels = new QuickchatChannels();
        quickchatChannels.f20483id = this.f20483id;
        List<String> list = this.usedExpiredPropUserID;
        if (list != null) {
            quickchatChannels.usedExpiredPropUserID = ValueObject.util_map(list, new w9j() { // from class: l.bzb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return QuickchatChannels.m35800a((String) obj);
                }
            });
        }
        List<String> list2 = this.superlikeSentUserID;
        if (list2 != null) {
            quickchatChannels.superlikeSentUserID = ValueObject.util_map(list2, new w9j() { // from class: l.czb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return QuickchatChannels.m35801b((String) obj);
                }
            });
        }
        quickchatChannels.expiredTime = this.expiredTime;
        quickchatChannels.userMatched = this.userMatched;
        return quickchatChannels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickchatChannels)) {
            return false;
        }
        QuickchatChannels quickchatChannels = (QuickchatChannels) obj;
        return ValueObject.util_equals(this.f20483id, quickchatChannels.f20483id) && ValueObject.util_equals(this.usedExpiredPropUserID, quickchatChannels.usedExpiredPropUserID) && ValueObject.util_equals(this.superlikeSentUserID, quickchatChannels.superlikeSentUserID) && this.expiredTime == quickchatChannels.expiredTime && this.userMatched == quickchatChannels.userMatched;
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
        String str = this.f20483id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.usedExpiredPropUserID;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.superlikeSentUserID;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = ((((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.userMatched ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20483id == null) {
            this.f20483id = "";
        }
        if (this.usedExpiredPropUserID == null) {
            this.usedExpiredPropUserID = new ArrayList();
        }
        if (this.superlikeSentUserID == null) {
            this.superlikeSentUserID = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
