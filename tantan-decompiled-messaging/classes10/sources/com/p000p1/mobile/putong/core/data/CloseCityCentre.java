package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CloseCityCentre extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "closecitycentre";

    @NonNull
    @ProtobufIndex(index = 4)
    public String action;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String cardId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String extra;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CloseCityCentre> PROTOBUF_ADAPTER = new MessageNanoAdapter<CloseCityCentre>() { // from class: com.p1.mobile.putong.core.data.CloseCityCentre.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CloseCityCentre closeCityCentre) {
            String str = closeCityCentre.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = closeCityCentre.otherUserId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = closeCityCentre.cardId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = closeCityCentre.action;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = closeCityCentre.extra;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) closeCityCentre).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CloseCityCentre m12193parse(nb5 nb5Var) throws IOException {
            CloseCityCentre closeCityCentre = new CloseCityCentre();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    closeCityCentre.userId = nb5Var.s();
                } else if (iU == 18) {
                    closeCityCentre.otherUserId = nb5Var.s();
                } else if (iU == 26) {
                    closeCityCentre.cardId = nb5Var.s();
                } else if (iU == 34) {
                    closeCityCentre.action = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    closeCityCentre.extra = nb5Var.s();
                }
            }
            return closeCityCentre;
        }

        public void serialize(CloseCityCentre closeCityCentre, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = closeCityCentre.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = closeCityCentre.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = closeCityCentre.cardId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = closeCityCentre.action;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = closeCityCentre.extra;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<CloseCityCentre> JSON_ADAPTER = new ObjectJsonAdapter<CloseCityCentre>() { // from class: com.p1.mobile.putong.core.data.CloseCityCentre.2
        public Class getDataClass() {
            return CloseCityCentre.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CloseCityCentre m12194newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CloseCityCentre) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CloseCityCentre) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CloseCityCentre new_() {
        CloseCityCentre closeCityCentre = new CloseCityCentre();
        closeCityCentre.nullCheck();
        return closeCityCentre;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CloseCityCentre m12192clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
