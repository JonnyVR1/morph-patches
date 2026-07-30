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
public class AutoDeducts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "autodeducts";

    @NonNull
    @ProtobufIndex(index = 4)
    public String autoDeductStatus;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f10id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String platform;

    @ProtobufIndex(index = 6)
    public double rateLimitExpiresTime;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean rateLimitReached;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<AutoDeducts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AutoDeducts>() { // from class: com.p1.mobile.putong.core.data.AutoDeducts.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AutoDeducts autoDeducts) {
            String str = autoDeducts.f10id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = autoDeducts.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = autoDeducts.platform;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = autoDeducts.autoDeductStatus;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, autoDeducts.rateLimitReached) + CodedOutputByteBufferNano.d(6, autoDeducts.rateLimitExpiresTime);
            ((MessageNano) autoDeducts).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AutoDeducts m11671parse(nb5 nb5Var) throws IOException {
            AutoDeducts autoDeducts = new AutoDeducts();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (autoDeducts.f10id == null) {
                        autoDeducts.f10id = "";
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
                if (iU == 10) {
                    autoDeducts.f10id = nb5Var.s();
                } else if (iU == 18) {
                    autoDeducts.type = nb5Var.s();
                } else if (iU == 26) {
                    autoDeducts.platform = nb5Var.s();
                } else if (iU == 34) {
                    autoDeducts.autoDeductStatus = nb5Var.s();
                } else if (iU == 40) {
                    autoDeducts.rateLimitReached = nb5Var.g();
                } else {
                    if (iU != 49) {
                        if (autoDeducts.f10id == null) {
                            autoDeducts.f10id = "";
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
                    autoDeducts.rateLimitExpiresTime = nb5Var.h();
                }
            }
            return autoDeducts;
        }

        public void serialize(AutoDeducts autoDeducts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = autoDeducts.f10id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = autoDeducts.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = autoDeducts.platform;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = autoDeducts.autoDeductStatus;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, autoDeducts.rateLimitReached);
            codedOutputByteBufferNano.C(6, autoDeducts.rateLimitExpiresTime);
        }
    };
    public static JsonAdapter<AutoDeducts> JSON_ADAPTER = new ObjectJsonAdapter<AutoDeducts>() { // from class: com.p1.mobile.putong.core.data.AutoDeducts.2
        public Class getDataClass() {
            return AutoDeducts.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AutoDeducts m11672newInstance() {
            return new AutoDeducts();
        }

        public boolean parseField(AutoDeducts autoDeducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rateLimitExpiresTime":
                    autoDeducts.rateLimitExpiresTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "rateLimitReached":
                    autoDeducts.rateLimitReached = jsonParser.getValueAsBoolean();
                    return true;
                case "autoDeductStatus":
                    autoDeducts.autoDeductStatus = jsonParser.getValueAsString();
                    return true;
                case "id":
                    autoDeducts.f10id = jsonParser.getValueAsString();
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

        public void serializeFields(AutoDeducts autoDeducts, JsonGenerator jsonGenerator) throws IOException {
            String str = autoDeducts.f10id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AutoDeducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AutoDeducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AutoDeducts new_() {
        AutoDeducts autoDeducts = new AutoDeducts();
        autoDeducts.nullCheck();
        return autoDeducts;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AutoDeducts m11670clone() {
        AutoDeducts autoDeducts = new AutoDeducts();
        autoDeducts.f10id = this.f10id;
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
        return ValueObject.util_equals(this.f10id, autoDeducts.f10id) && ValueObject.util_equals(this.type, autoDeducts.type) && ValueObject.util_equals(this.platform, autoDeducts.platform) && ValueObject.util_equals(this.autoDeductStatus, autoDeducts.autoDeductStatus) && this.rateLimitReached == autoDeducts.rateLimitReached && this.rateLimitExpiresTime == autoDeducts.rateLimitExpiresTime;
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
        String str = this.f10id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.platform;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.autoDeductStatus;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.rateLimitReached ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.rateLimitExpiresTime);
        int i3 = (iHashCode4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f10id == null) {
            this.f10id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
