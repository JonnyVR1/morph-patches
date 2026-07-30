package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class CloseCityCentre extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "closecitycentre";

    @NonNull
    @ProtobufIndex(index = 4)
    public String action;

    @NonNull
    @ProtobufIndex(index = 3)
    public String cardId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String extra;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CloseCityCentre> PROTOBUF_ADAPTER = new MessageNanoAdapter<CloseCityCentre>() { // from class: com.p1.mobile.putong.core.data.CloseCityCentre.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CloseCityCentre closeCityCentre) {
            String str = closeCityCentre.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = closeCityCentre.otherUserId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = closeCityCentre.cardId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = closeCityCentre.action;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = closeCityCentre.extra;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            closeCityCentre.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CloseCityCentre parse(nc5 nc5Var) throws IOException {
            CloseCityCentre closeCityCentre = new CloseCityCentre();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (closeCityCentre.userId == null) {
                        closeCityCentre.userId = "";
                    }
                    if (closeCityCentre.otherUserId == null) {
                        closeCityCentre.otherUserId = "";
                    }
                    if (closeCityCentre.cardId == null) {
                        closeCityCentre.cardId = "";
                    }
                    if (closeCityCentre.action == null) {
                        closeCityCentre.action = "";
                    }
                    if (closeCityCentre.extra != null) {
                        break;
                    }
                    closeCityCentre.extra = "";
                    break;
                }
                if (iM162497u == 10) {
                    closeCityCentre.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    closeCityCentre.otherUserId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    closeCityCentre.cardId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    closeCityCentre.action = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (closeCityCentre.userId == null) {
                            closeCityCentre.userId = "";
                        }
                        if (closeCityCentre.otherUserId == null) {
                            closeCityCentre.otherUserId = "";
                        }
                        if (closeCityCentre.cardId == null) {
                            closeCityCentre.cardId = "";
                        }
                        if (closeCityCentre.action == null) {
                            closeCityCentre.action = "";
                        }
                        if (closeCityCentre.extra != null) {
                            break;
                        }
                        closeCityCentre.extra = "";
                        return closeCityCentre;
                    }
                    closeCityCentre.extra = nc5Var.m162495s();
                }
            }
            return closeCityCentre;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CloseCityCentre closeCityCentre, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = closeCityCentre.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = closeCityCentre.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = closeCityCentre.cardId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = closeCityCentre.action;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = closeCityCentre.extra;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<CloseCityCentre> JSON_ADAPTER = new ObjectJsonAdapter<CloseCityCentre>() { // from class: com.p1.mobile.putong.core.data.CloseCityCentre.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CloseCityCentre.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CloseCityCentre newInstance() {
            return new CloseCityCentre();
        }

        public boolean parseField(CloseCityCentre closeCityCentre, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    closeCityCentre.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "action":
                    closeCityCentre.action = jsonParser.getValueAsString();
                    return true;
                case "cardId":
                    closeCityCentre.cardId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    closeCityCentre.userId = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    closeCityCentre.extra = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CloseCityCentre closeCityCentre, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "action":
                case "cardId":
                case "userId":
                case "extra":
                    return true;
                default:
                    return super.parseFieldCheck(closeCityCentre, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CloseCityCentre closeCityCentre, JsonGenerator jsonGenerator) throws IOException {
            String str = closeCityCentre.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = closeCityCentre.otherUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUserId", str2);
            }
            String str3 = closeCityCentre.cardId;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardId", str3);
            }
            String str4 = closeCityCentre.action;
            if (str4 != null) {
                jsonGenerator.writeStringField("action", str4);
            }
            String str5 = closeCityCentre.extra;
            if (str5 != null) {
                jsonGenerator.writeStringField("extra", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CloseCityCentre) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CloseCityCentre) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CloseCityCentre new_() {
        CloseCityCentre closeCityCentre = new CloseCityCentre();
        closeCityCentre.nullCheck();
        return closeCityCentre;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CloseCityCentre mo225055clone() {
        CloseCityCentre closeCityCentre = new CloseCityCentre();
        closeCityCentre.userId = this.userId;
        closeCityCentre.otherUserId = this.otherUserId;
        closeCityCentre.cardId = this.cardId;
        closeCityCentre.action = this.action;
        closeCityCentre.extra = this.extra;
        return closeCityCentre;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloseCityCentre)) {
            return false;
        }
        CloseCityCentre closeCityCentre = (CloseCityCentre) obj;
        return ValueObject.util_equals(this.userId, closeCityCentre.userId) && ValueObject.util_equals(this.otherUserId, closeCityCentre.otherUserId) && ValueObject.util_equals(this.cardId, closeCityCentre.cardId) && ValueObject.util_equals(this.action, closeCityCentre.action) && ValueObject.util_equals(this.extra, closeCityCentre.extra);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cardId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.action;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.extra;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.cardId == null) {
            this.cardId = "";
        }
        if (this.action == null) {
            this.action = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
