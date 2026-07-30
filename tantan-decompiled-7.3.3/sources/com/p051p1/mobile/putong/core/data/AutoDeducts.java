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
public class AutoDeducts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "autodeducts";

    @NonNull
    @ProtobufIndex(index = 4)
    public String autoDeductStatus;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21090id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String platform;

    @ProtobufIndex(index = 6)
    public double rateLimitExpiresTime;

    @ProtobufIndex(index = 5)
    public boolean rateLimitReached;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<AutoDeducts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AutoDeducts>() { // from class: com.p1.mobile.putong.core.data.AutoDeducts.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AutoDeducts autoDeducts) {
            String str = autoDeducts.f21090id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = autoDeducts.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = autoDeducts.platform;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = autoDeducts.autoDeductStatus;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, autoDeducts.rateLimitReached) + CodedOutputByteBufferNano.m17277d(6, autoDeducts.rateLimitExpiresTime);
            autoDeducts.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AutoDeducts parse(nc5 nc5Var) throws IOException {
            AutoDeducts autoDeducts = new AutoDeducts();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (autoDeducts.f21090id == null) {
                        autoDeducts.f21090id = "";
                    }
                    if (autoDeducts.type == null) {
                        autoDeducts.type = "";
                    }
                    if (autoDeducts.platform == null) {
                        autoDeducts.platform = "";
                    }
                    if (autoDeducts.autoDeductStatus != null) {
                        break;
                    }
                    autoDeducts.autoDeductStatus = "";
                    break;
                }
                if (iM162497u == 10) {
                    autoDeducts.f21090id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    autoDeducts.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    autoDeducts.platform = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    autoDeducts.autoDeductStatus = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    autoDeducts.rateLimitReached = nc5Var.m162483g();
                } else {
                    if (iM162497u != 49) {
                        if (autoDeducts.f21090id == null) {
                            autoDeducts.f21090id = "";
                        }
                        if (autoDeducts.type == null) {
                            autoDeducts.type = "";
                        }
                        if (autoDeducts.platform == null) {
                            autoDeducts.platform = "";
                        }
                        if (autoDeducts.autoDeductStatus != null) {
                            break;
                        }
                        autoDeducts.autoDeductStatus = "";
                        return autoDeducts;
                    }
                    autoDeducts.rateLimitExpiresTime = nc5Var.m162484h();
                }
            }
            return autoDeducts;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AutoDeducts autoDeducts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = autoDeducts.f21090id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = autoDeducts.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = autoDeducts.platform;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = autoDeducts.autoDeductStatus;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, autoDeducts.rateLimitReached);
            codedOutputByteBufferNano.m17301C(6, autoDeducts.rateLimitExpiresTime);
        }
    };
    public static JsonAdapter<AutoDeducts> JSON_ADAPTER = new ObjectJsonAdapter<AutoDeducts>() { // from class: com.p1.mobile.putong.core.data.AutoDeducts.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AutoDeducts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AutoDeducts newInstance() {
            return new AutoDeducts();
        }

        public boolean parseField(AutoDeducts autoDeducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rateLimitExpiresTime":
                    autoDeducts.rateLimitExpiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "rateLimitReached":
                    autoDeducts.rateLimitReached = jsonParser.getValueAsBoolean();
                    return true;
                case "autoDeductStatus":
                    autoDeducts.autoDeductStatus = jsonParser.getValueAsString();
                    return true;
                case "id":
                    autoDeducts.f21090id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    autoDeducts.type = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    autoDeducts.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AutoDeducts autoDeducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "rateLimitExpiresTime":
                case "rateLimitReached":
                case "autoDeductStatus":
                    return true;
                case "id":
                    return false;
                case "type":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(autoDeducts, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AutoDeducts autoDeducts, JsonGenerator jsonGenerator) throws IOException {
            String str = autoDeducts.f21090id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = autoDeducts.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = autoDeducts.platform;
            if (str3 != null) {
                jsonGenerator.writeStringField("platform", str3);
            }
            String str4 = autoDeducts.autoDeductStatus;
            if (str4 != null) {
                jsonGenerator.writeStringField("autoDeductStatus", str4);
            }
            jsonGenerator.writeBooleanField("rateLimitReached", autoDeducts.rateLimitReached);
            jsonGenerator.writeFieldName("rateLimitExpiresTime");
            Converter.API_TIME.serialize(Double.valueOf(autoDeducts.rateLimitExpiresTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AutoDeducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AutoDeducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AutoDeducts new_() {
        AutoDeducts autoDeducts = new AutoDeducts();
        autoDeducts.nullCheck();
        return autoDeducts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AutoDeducts mo225055clone() {
        AutoDeducts autoDeducts = new AutoDeducts();
        autoDeducts.f21090id = this.f21090id;
        autoDeducts.type = this.type;
        autoDeducts.platform = this.platform;
        autoDeducts.autoDeductStatus = this.autoDeductStatus;
        autoDeducts.rateLimitReached = this.rateLimitReached;
        autoDeducts.rateLimitExpiresTime = this.rateLimitExpiresTime;
        return autoDeducts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoDeducts)) {
            return false;
        }
        AutoDeducts autoDeducts = (AutoDeducts) obj;
        return ValueObject.util_equals(this.f21090id, autoDeducts.f21090id) && ValueObject.util_equals(this.type, autoDeducts.type) && ValueObject.util_equals(this.platform, autoDeducts.platform) && ValueObject.util_equals(this.autoDeductStatus, autoDeducts.autoDeductStatus) && this.rateLimitReached == autoDeducts.rateLimitReached && this.rateLimitExpiresTime == autoDeducts.rateLimitExpiresTime;
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
        String str = this.f21090id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.platform;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.autoDeductStatus;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.rateLimitReached ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.rateLimitExpiresTime);
        int i3 = (iHashCode4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21090id == null) {
            this.f21090id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.autoDeductStatus == null) {
            this.autoDeductStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
