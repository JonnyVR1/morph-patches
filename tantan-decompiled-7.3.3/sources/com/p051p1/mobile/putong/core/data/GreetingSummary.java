package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
public class GreetingSummary extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "greetingsummary";

    @NonNull
    @ProtobufIndex(index = 5)
    public String iconURL;

    @NonNull
    @ProtobufIndex(index = 4)
    public String latestMessageId;

    @ProtobufIndex(index = 2)
    public double latestTime;

    @NonNull
    @ProtobufIndex(index = 3)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingSummary greetingSummary) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, greetingSummary.unseen) + CodedOutputByteBufferNano.m17277d(2, greetingSummary.latestTime);
            String str = greetingSummary.latestUserId;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = greetingSummary.latestMessageId;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = greetingSummary.iconURL;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = greetingSummary.title;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            greetingSummary.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingSummary parse(nc5 nc5Var) throws IOException {
            GreetingSummary greetingSummary = new GreetingSummary();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    greetingSummary.unseen = nc5Var.m162486j();
                } else if (iM162497u == 17) {
                    greetingSummary.latestTime = nc5Var.m162484h();
                } else if (iM162497u == 26) {
                    greetingSummary.latestUserId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    greetingSummary.latestMessageId = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    greetingSummary.iconURL = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    greetingSummary.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
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
                    greetingSummary.subtitle = nc5Var.m162495s();
                }
            }
            return greetingSummary;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingSummary greetingSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, greetingSummary.unseen);
            codedOutputByteBufferNano.m17301C(2, greetingSummary.latestTime);
            String str = greetingSummary.latestUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = greetingSummary.latestMessageId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = greetingSummary.iconURL;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = greetingSummary.title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    };
    public static JsonAdapter<GreetingSummary> JSON_ADAPTER = new ObjectJsonAdapter<GreetingSummary>() { // from class: com.p1.mobile.putong.core.data.GreetingSummary.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingSummary newInstance() {
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
                    greetingSummary.latestTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = greetingSummary.subtitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subtitle", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingSummary new_() {
        GreetingSummary greetingSummary = new GreetingSummary();
        greetingSummary.nullCheck();
        return greetingSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingSummary mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
