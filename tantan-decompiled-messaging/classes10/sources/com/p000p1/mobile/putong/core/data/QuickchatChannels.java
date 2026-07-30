package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.QuickchatChannels;
import com.p1.mobile.putong.data.Converter;
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
public class QuickchatChannels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatchannels";

    @ProtobufIndex(index = 4)
    public double expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f145id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> superlikeSentUserID;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> usedExpiredPropUserID;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean userMatched;
    public static ProtobufAdapter<QuickchatChannels> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickchatChannels>() { // from class: com.p1.mobile.putong.core.data.QuickchatChannels.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickchatChannels quickchatChannels) {
            String str = quickchatChannels.f145id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = quickchatChannels.usedExpiredPropUserID;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = quickchatChannels.superlikeSentUserID;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iD = iO + CodedOutputByteBufferNano.d(4, quickchatChannels.expiredTime) + CodedOutputByteBufferNano.b(5, quickchatChannels.userMatched);
            ((MessageNano) quickchatChannels).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickchatChannels m15191parse(nb5 nb5Var) throws IOException {
            QuickchatChannels quickchatChannels = new QuickchatChannels();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickchatChannels.f145id == null) {
                        quickchatChannels.f145id = "";
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
                if (iU == 10) {
                    quickchatChannels.f145id = nb5Var.s();
                } else if (iU == 18) {
                    quickchatChannels.usedExpiredPropUserID = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    quickchatChannels.superlikeSentUserID = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 33) {
                    quickchatChannels.expiredTime = nb5Var.h();
                } else {
                    if (iU != 40) {
                        if (quickchatChannels.f145id == null) {
                            quickchatChannels.f145id = "";
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
                    quickchatChannels.userMatched = nb5Var.g();
                }
            }
            return quickchatChannels;
        }

        public void serialize(QuickchatChannels quickchatChannels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickchatChannels.f145id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = quickchatChannels.usedExpiredPropUserID;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = quickchatChannels.superlikeSentUserID;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(4, quickchatChannels.expiredTime);
            codedOutputByteBufferNano.A(5, quickchatChannels.userMatched);
        }
    };
    public static JsonAdapter<QuickchatChannels> JSON_ADAPTER = new ObjectJsonAdapter<QuickchatChannels>() { // from class: com.p1.mobile.putong.core.data.QuickchatChannels.2
        public Class getDataClass() {
            return QuickchatChannels.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickchatChannels m15192newInstance() {
            return new QuickchatChannels();
        }

        public boolean parseField(QuickchatChannels quickchatChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "usedExpiredPropUserID":
                    quickchatChannels.usedExpiredPropUserID = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expiredTime":
                    quickchatChannels.expiredTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    quickchatChannels.f145id = jsonParser.getValueAsString();
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

        public void serializeFields(QuickchatChannels quickchatChannels, JsonGenerator jsonGenerator) throws IOException {
            String str = quickchatChannels.f145id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickchatChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickchatChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m602a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m603b(String str) {
        return str;
    }

    public static QuickchatChannels new_() {
        QuickchatChannels quickchatChannels = new QuickchatChannels();
        quickchatChannels.nullCheck();
        return quickchatChannels;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickchatChannels m15190clone() {
        QuickchatChannels quickchatChannels = new QuickchatChannels();
        quickchatChannels.f145id = this.f145id;
        List<String> list = this.usedExpiredPropUserID;
        if (list != null) {
            quickchatChannels.usedExpiredPropUserID = ValueObject.util_map(list, new w9j() { // from class: l.bzb0
                public final Object call(Object obj) {
                    return QuickchatChannels.m602a((String) obj);
                }
            });
        }
        List<String> list2 = this.superlikeSentUserID;
        if (list2 != null) {
            quickchatChannels.superlikeSentUserID = ValueObject.util_map(list2, new w9j() { // from class: l.czb0
                public final Object call(Object obj) {
                    return QuickchatChannels.m603b((String) obj);
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
        return ValueObject.util_equals(this.f145id, quickchatChannels.f145id) && ValueObject.util_equals(this.usedExpiredPropUserID, quickchatChannels.usedExpiredPropUserID) && ValueObject.util_equals(this.superlikeSentUserID, quickchatChannels.superlikeSentUserID) && this.expiredTime == quickchatChannels.expiredTime && this.userMatched == quickchatChannels.userMatched;
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
        String str = this.f145id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.usedExpiredPropUserID;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.superlikeSentUserID;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = ((((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.userMatched ? 1231 : 1237);
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f145id == null) {
            this.f145id = "";
        }
        if (this.usedExpiredPropUserID == null) {
            this.usedExpiredPropUserID = new ArrayList();
        }
        if (this.superlikeSentUserID == null) {
            this.superlikeSentUserID = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
