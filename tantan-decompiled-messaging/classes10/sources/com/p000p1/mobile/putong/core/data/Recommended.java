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
public class Recommended extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommended";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String reason;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<Recommended> PROTOBUF_ADAPTER = new MessageNanoAdapter<Recommended>() { // from class: com.p1.mobile.putong.core.data.Recommended.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Recommended recommended) {
            String str = recommended.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = recommended.tracker;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) recommended).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Recommended m15325parse(nb5 nb5Var) throws IOException {
            Recommended recommended = new Recommended();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recommended.userId == null) {
                        recommended.userId = "";
                    }
                    if (recommended.tracker == null) {
                        recommended.tracker = "";
                    }
                    if (recommended.reason != null) {
                        break;
                    }
                    recommended.reason = "";
                    break;
                }
                if (iU == 10) {
                    recommended.userId = nb5Var.s();
                } else if (iU == 18) {
                    recommended.tracker = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (recommended.userId == null) {
                            recommended.userId = "";
                        }
                        if (recommended.tracker == null) {
                            recommended.tracker = "";
                        }
                        if (recommended.reason != null) {
                            break;
                        }
                        recommended.reason = "";
                        return recommended;
                    }
                    recommended.reason = nb5Var.s();
                }
            }
            return recommended;
        }

        public void serialize(Recommended recommended, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommended.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = recommended.tracker;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<Recommended> JSON_ADAPTER = new ObjectJsonAdapter<Recommended>() { // from class: com.p1.mobile.putong.core.data.Recommended.2
        public Class getDataClass() {
            return Recommended.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Recommended m15326newInstance() {
            return new Recommended();
        }

        public boolean parseField(Recommended recommended, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    recommended.tracker = jsonParser.getValueAsString();
                    return true;
                case "reason":
                    recommended.reason = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    recommended.userId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Recommended recommended, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "reason":
                case "userId":
                    return true;
                default:
                    return super.parseFieldCheck(recommended, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Recommended recommended, JsonGenerator jsonGenerator) throws IOException {
            String str = recommended.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = recommended.tracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("tracker", str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Recommended) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Recommended) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Recommended new_() {
        Recommended recommended = new Recommended();
        recommended.nullCheck();
        return recommended;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Recommended m15324clone() {
        Recommended recommended = new Recommended();
        recommended.userId = this.userId;
        recommended.tracker = this.tracker;
        recommended.reason = this.reason;
        return recommended;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recommended)) {
            return false;
        }
        Recommended recommended = (Recommended) obj;
        return ValueObject.util_equals(this.userId, recommended.userId) && ValueObject.util_equals(this.tracker, recommended.tracker) && ValueObject.util_equals(this.reason, recommended.reason);
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
        String str2 = this.tracker;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.reason;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
