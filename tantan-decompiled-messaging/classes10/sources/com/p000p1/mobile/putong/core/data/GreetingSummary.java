package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetingSummary extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "greetingsummary";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String iconURL;

    @NonNull
    @ProtobufIndex(index = 4)
    public String latestMessageId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double latestTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String latestUserId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String title;

    @ProtobufIndex(index = 1)
    public int unseen;
    public static ProtobufAdapter<GreetingSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingSummary>() { // from class: com.p1.mobile.putong.core.data.GreetingSummary.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingSummary greetingSummary) {
            int iH = CodedOutputByteBufferNano.h(1, greetingSummary.unseen) + CodedOutputByteBufferNano.d(2, greetingSummary.latestTime);
            String str = greetingSummary.latestUserId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = greetingSummary.latestMessageId;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = greetingSummary.iconURL;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = greetingSummary.title;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(7, str5);
            }
            ((MessageNano) greetingSummary).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingSummary m13061parse(nb5 nb5Var) throws IOException {
            GreetingSummary greetingSummary = new GreetingSummary();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingSummary.latestUserId == null) {
                        greetingSummary.latestUserId = "";
                    }
                    if (greetingSummary.latestMessageId == null) {
                        greetingSummary.latestMessageId = "";
                    }
                    if (greetingSummary.iconURL == null) {
                        greetingSummary.iconURL = "";
                    }
                    if (greetingSummary.title == null) {
                        greetingSummary.title = "";
                    }
                    if (greetingSummary.subtitle != null) {
                        break;
                    }
                    greetingSummary.subtitle = "";
                    break;
                }
                if (iU == 8) {
                    greetingSummary.unseen = nb5Var.j();
                } else if (iU == 17) {
                    greetingSummary.latestTime = nb5Var.h();
                } else if (iU == 26) {
                    greetingSummary.latestUserId = nb5Var.s();
                } else if (iU == 34) {
                    greetingSummary.latestMessageId = nb5Var.s();
                } else if (iU == 42) {
                    greetingSummary.iconURL = nb5Var.s();
                } else if (iU == 50) {
                    greetingSummary.title = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (greetingSummary.latestUserId == null) {
                            greetingSummary.latestUserId = "";
                        }
                        if (greetingSummary.latestMessageId == null) {
                            greetingSummary.latestMessageId = "";
                        }
                        if (greetingSummary.iconURL == null) {
                            greetingSummary.iconURL = "";
                        }
                        if (greetingSummary.title == null) {
                            greetingSummary.title = "";
                        }
                        if (greetingSummary.subtitle != null) {
                            break;
                        }
                        greetingSummary.subtitle = "";
                        return greetingSummary;
                    }
                    greetingSummary.subtitle = nb5Var.s();
                }
            }
            return greetingSummary;
        }

        public void serialize(GreetingSummary greetingSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, greetingSummary.unseen);
            codedOutputByteBufferNano.C(2, greetingSummary.latestTime);
            String str = greetingSummary.latestUserId;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = greetingSummary.latestMessageId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = greetingSummary.iconURL;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = greetingSummary.title;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
        }
    };
    public static JsonAdapter<GreetingSummary> JSON_ADAPTER = new ObjectJsonAdapter<GreetingSummary>() { // from class: com.p1.mobile.putong.core.data.GreetingSummary.2
        public Class getDataClass() {
            return GreetingSummary.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingSummary m13062newInstance() {
            return new GreetingSummary();
        }

        public boolean parseField(GreetingSummary greetingSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    greetingSummary.subtitle = jsonParser.getValueAsString();
                    return true;
                case "unseen":
                    greetingSummary.unseen = jsonParser.getValueAsInt();
                    return true;
                case "latestTime":
                    greetingSummary.latestTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "title":
                    greetingSummary.title = jsonParser.getValueAsString();
                    return true;
                case "latestUserId":
                    greetingSummary.latestUserId = jsonParser.getValueAsString();
                    return true;
                case "latestMessageId":
                    greetingSummary.latestMessageId = jsonParser.getValueAsString();
                    return true;
                case "iconURL":
                    greetingSummary.iconURL = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetingSummary greetingSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "unseen":
                case "latestTime":
                case "title":
                case "latestUserId":
                case "latestMessageId":
                case "iconURL":
                    return true;
                default:
                    return super.parseFieldCheck(greetingSummary, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GreetingSummary greetingSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unseen", greetingSummary.unseen);
            jsonGenerator.writeFieldName("latestTime");
            Converter.API_TIME.serialize(Double.valueOf(greetingSummary.latestTime), jsonGenerator, true);
            String str = greetingSummary.latestUserId;
            if (str != null) {
                jsonGenerator.writeStringField("latestUserId", str);
            }
            String str2 = greetingSummary.latestMessageId;
            if (str2 != null) {
                jsonGenerator.writeStringField("latestMessageId", str2);
            }
            String str3 = greetingSummary.iconURL;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconURL", str3);
            }
            String str4 = greetingSummary.title;
            if (str4 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subtitle", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingSummary new_() {
        GreetingSummary greetingSummary = new GreetingSummary();
        greetingSummary.nullCheck();
        return greetingSummary;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingSummary m13060clone() {
        GreetingSummary greetingSummary = new GreetingSummary();
        greetingSummary.unseen = this.unseen;
        greetingSummary.latestTime = this.latestTime;
        greetingSummary.latestUserId = this.latestUserId;
        greetingSummary.latestMessageId = this.latestMessageId;
        greetingSummary.iconURL = this.iconURL;
        greetingSummary.title = this.title;
        greetingSummary.subtitle = this.subtitle;
        return greetingSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingSummary)) {
            return false;
        }
        GreetingSummary greetingSummary = (GreetingSummary) obj;
        return this == obj && this.unseen == greetingSummary.unseen && this.latestTime == greetingSummary.latestTime && ValueObject.util_equals(this.latestUserId, greetingSummary.latestUserId) && ValueObject.util_equals(this.latestMessageId, greetingSummary.latestMessageId) && ValueObject.util_equals(this.iconURL, greetingSummary.iconURL) && ValueObject.util_equals(this.title, greetingSummary.title) && ValueObject.util_equals(this.subtitle, greetingSummary.subtitle);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (super.hashCode() * 41) + this.unseen;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestTime);
        int i2 = ((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.latestUserId;
        int iHashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.latestMessageId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconURL;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subtitle;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.latestUserId == null) {
            this.latestUserId = "";
        }
        if (this.latestMessageId == null) {
            this.latestMessageId = "";
        }
        if (this.iconURL == null) {
            this.iconURL = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
