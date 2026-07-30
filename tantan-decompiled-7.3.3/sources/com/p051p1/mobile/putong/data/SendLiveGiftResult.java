package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SendLiveGiftResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sendlivegiftresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public GivenGiftBrief givenGiftBrief;

    @ProtobufIndex(index = 1)
    public long remainingTantanCoins;
    public static ProtobufAdapter<SendLiveGiftResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<SendLiveGiftResult>() { // from class: com.p1.mobile.putong.data.SendLiveGiftResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SendLiveGiftResult sendLiveGiftResult) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, sendLiveGiftResult.remainingTantanCoins);
            GivenGiftBrief givenGiftBrief = sendLiveGiftResult.givenGiftBrief;
            if (givenGiftBrief != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(2, givenGiftBrief, GivenGiftBrief.PROTOBUF_ADAPTER);
            }
            sendLiveGiftResult.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SendLiveGiftResult parse(nc5 nc5Var) throws IOException {
            SendLiveGiftResult sendLiveGiftResult = new SendLiveGiftResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (sendLiveGiftResult.givenGiftBrief != null) {
                        break;
                    }
                    sendLiveGiftResult.givenGiftBrief = GivenGiftBrief.new_();
                    break;
                }
                if (iM162497u == 8) {
                    sendLiveGiftResult.remainingTantanCoins = nc5Var.m162487k();
                } else {
                    if (iM162497u != 18) {
                        if (sendLiveGiftResult.givenGiftBrief != null) {
                            break;
                        }
                        sendLiveGiftResult.givenGiftBrief = GivenGiftBrief.new_();
                        return sendLiveGiftResult;
                    }
                    sendLiveGiftResult.givenGiftBrief = (GivenGiftBrief) nc5Var.m162488l(GivenGiftBrief.PROTOBUF_ADAPTER);
                }
            }
            return sendLiveGiftResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SendLiveGiftResult sendLiveGiftResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, sendLiveGiftResult.remainingTantanCoins);
            GivenGiftBrief givenGiftBrief = sendLiveGiftResult.givenGiftBrief;
            if (givenGiftBrief != null) {
                codedOutputByteBufferNano.m17309K(2, givenGiftBrief, GivenGiftBrief.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SendLiveGiftResult> JSON_ADAPTER = new ObjectJsonAdapter<SendLiveGiftResult>() { // from class: com.p1.mobile.putong.data.SendLiveGiftResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SendLiveGiftResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SendLiveGiftResult newInstance() {
            return new SendLiveGiftResult();
        }

        public boolean parseField(SendLiveGiftResult sendLiveGiftResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("givenGiftBrief")) {
                sendLiveGiftResult.givenGiftBrief = GivenGiftBrief.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("remainingTantanCoins")) {
                return false;
            }
            sendLiveGiftResult.remainingTantanCoins = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(SendLiveGiftResult sendLiveGiftResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("givenGiftBrief") || str.equals("remainingTantanCoins")) {
                return true;
            }
            return super.parseFieldCheck(sendLiveGiftResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SendLiveGiftResult sendLiveGiftResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remainingTantanCoins", sendLiveGiftResult.remainingTantanCoins);
            if (sendLiveGiftResult.givenGiftBrief != null) {
                jsonGenerator.writeFieldName("givenGiftBrief");
                GivenGiftBrief.JSON_ADAPTER.serialize(sendLiveGiftResult.givenGiftBrief, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SendLiveGiftResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SendLiveGiftResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SendLiveGiftResult new_() {
        SendLiveGiftResult sendLiveGiftResult = new SendLiveGiftResult();
        sendLiveGiftResult.nullCheck();
        return sendLiveGiftResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SendLiveGiftResult mo225055clone() {
        SendLiveGiftResult sendLiveGiftResult = new SendLiveGiftResult();
        sendLiveGiftResult.remainingTantanCoins = this.remainingTantanCoins;
        GivenGiftBrief givenGiftBrief = this.givenGiftBrief;
        if (givenGiftBrief != null) {
            sendLiveGiftResult.givenGiftBrief = givenGiftBrief.mo225055clone();
        }
        return sendLiveGiftResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendLiveGiftResult)) {
            return false;
        }
        SendLiveGiftResult sendLiveGiftResult = (SendLiveGiftResult) obj;
        return this.remainingTantanCoins == sendLiveGiftResult.remainingTantanCoins && ValueObject.util_equals(this.givenGiftBrief, sendLiveGiftResult.givenGiftBrief);
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
        long j = this.remainingTantanCoins;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        GivenGiftBrief givenGiftBrief = this.givenGiftBrief;
        int iHashCode = i2 + (givenGiftBrief != null ? givenGiftBrief.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.givenGiftBrief == null) {
            this.givenGiftBrief = GivenGiftBrief.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
