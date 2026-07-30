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
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String launchMessageId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String status;
    public static ProtobufAdapter<ExchangePicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExchangePicture>() { // from class: com.p1.mobile.putong.core.data.ExchangePicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExchangePicture exchangePicture) {
            int iH = CodedOutputByteBufferNano.h(1, exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) exchangePicture).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExchangePicture m12665parse(nb5 nb5Var) throws IOException {
            ExchangePicture exchangePicture = new ExchangePicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (exchangePicture.launchMessageId == null) {
                        exchangePicture.launchMessageId = "";
                    }
                    if (exchangePicture.status != null) {
                        break;
                    }
                    exchangePicture.status = "";
                    break;
                }
                if (iU == 8) {
                    exchangePicture.exchangeType = nb5Var.j();
                } else if (iU == 18) {
                    exchangePicture.launchMessageId = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (exchangePicture.launchMessageId == null) {
                            exchangePicture.launchMessageId = "";
                        }
                        if (exchangePicture.status != null) {
                            break;
                        }
                        exchangePicture.status = "";
                        return exchangePicture;
                    }
                    exchangePicture.status = nb5Var.s();
                }
            }
            return exchangePicture;
        }

        public void serialize(ExchangePicture exchangePicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<ExchangePicture> JSON_ADAPTER = new ObjectJsonAdapter<ExchangePicture>() { // from class: com.p1.mobile.putong.core.data.ExchangePicture.2
        public Class getDataClass() {
            return ExchangePicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExchangePicture m12666newInstance() {
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

        public void serializeFields(ExchangePicture exchangePicture, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exchangeType", exchangePicture.exchangeType);
            String str = exchangePicture.launchMessageId;
            if (str != null) {
                jsonGenerator.writeStringField("launchMessageId", str);
            }
            String str2 = exchangePicture.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExchangePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExchangePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExchangePicture new_() {
        ExchangePicture exchangePicture = new ExchangePicture();
        exchangePicture.nullCheck();
        return exchangePicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExchangePicture m12664clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.exchangeType) * 41;
        String str = this.launchMessageId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.launchMessageId == null) {
            this.launchMessageId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
