package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ExchangePicture extends ValueObject implements Cloneable, Serializable {
    public static int BACK_MESSAGE = 2;
    public static int SEND_MESSAGE = 1;
    public static final String TYPE = "exchangepicture";
    public static String finished = "finished";
    public static String unfinished = "unfinished";
    public static String unknow = "unknow";

    @ProtobufIndex(index = 1)
    public int exchangeType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String launchMessageId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String status;
    public static ProtobufAdapter<ExchangePicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExchangePicture>() { // from class: com.p1.mobile.putong.core.data.ExchangePicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExchangePicture exchangePicture) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            exchangePicture.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExchangePicture parse(nb5 nb5Var) throws IOException {
            ExchangePicture exchangePicture = new ExchangePicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (exchangePicture.launchMessageId == null) {
                        exchangePicture.launchMessageId = "";
                    }
                    if (exchangePicture.status != null) {
                        break;
                    }
                    exchangePicture.status = "";
                    break;
                }
                if (iM158752u == 8) {
                    exchangePicture.exchangeType = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    exchangePicture.launchMessageId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (exchangePicture.launchMessageId == null) {
                            exchangePicture.launchMessageId = "";
                        }
                        if (exchangePicture.status != null) {
                            break;
                        }
                        exchangePicture.status = "";
                        return exchangePicture;
                    }
                    exchangePicture.status = nb5Var.m158750s();
                }
            }
            return exchangePicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExchangePicture exchangePicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<ExchangePicture> JSON_ADAPTER = new ObjectJsonAdapter<ExchangePicture>() { // from class: com.p1.mobile.putong.core.data.ExchangePicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExchangePicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExchangePicture newInstance() {
            return new ExchangePicture();
        }

        public boolean parseField(ExchangePicture exchangePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "launchMessageId":
                    exchangePicture.launchMessageId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    exchangePicture.status = jsonParser.getValueAsString();
                    return true;
                case "exchangeType":
                    exchangePicture.exchangeType = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExchangePicture exchangePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "launchMessageId":
                case "status":
                case "exchangeType":
                    return true;
                default:
                    return super.parseFieldCheck(exchangePicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExchangePicture exchangePicture, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exchangeType", exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                jsonGenerator.writeStringField("launchMessageId", str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExchangePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExchangePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExchangePicture new_() {
        ExchangePicture exchangePicture = new ExchangePicture();
        exchangePicture.nullCheck();
        return exchangePicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExchangePicture mo223809clone() {
        ExchangePicture exchangePicture = new ExchangePicture();
        exchangePicture.exchangeType = this.exchangeType;
        exchangePicture.launchMessageId = this.launchMessageId;
        exchangePicture.status = this.status;
        return exchangePicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangePicture)) {
            return false;
        }
        ExchangePicture exchangePicture = (ExchangePicture) obj;
        return this.exchangeType == exchangePicture.exchangeType && ValueObject.util_equals(this.launchMessageId, exchangePicture.launchMessageId) && ValueObject.util_equals(this.status, exchangePicture.status);
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
        int i2 = ((i * 41) + this.exchangeType) * 41;
        String str = this.launchMessageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.launchMessageId == null) {
            this.launchMessageId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
