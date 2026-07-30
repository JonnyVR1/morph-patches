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
public class CountdownItem extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "countdownitem";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double expire;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean hidden;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserId;
    public static ProtobufAdapter<CountdownItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<CountdownItem>() { // from class: com.p1.mobile.putong.core.data.CountdownItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CountdownItem countdownItem) {
            String str = countdownItem.otherUserId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, countdownItem.expire) + CodedOutputByteBufferNano.b(3, countdownItem.hidden);
            ((MessageNano) countdownItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CountdownItem m12529parse(nb5 nb5Var) throws IOException {
            CountdownItem countdownItem = new CountdownItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (countdownItem.otherUserId != null) {
                        break;
                    }
                    countdownItem.otherUserId = "";
                    break;
                }
                if (iU == 10) {
                    countdownItem.otherUserId = nb5Var.s();
                } else if (iU == 17) {
                    countdownItem.expire = nb5Var.h();
                } else {
                    if (iU != 24) {
                        if (countdownItem.otherUserId != null) {
                            break;
                        }
                        countdownItem.otherUserId = "";
                        return countdownItem;
                    }
                    countdownItem.hidden = nb5Var.g();
                }
            }
            return countdownItem;
        }

        public void serialize(CountdownItem countdownItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = countdownItem.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, countdownItem.expire);
            codedOutputByteBufferNano.A(3, countdownItem.hidden);
        }
    };
    public static JsonAdapter<CountdownItem> JSON_ADAPTER = new ObjectJsonAdapter<CountdownItem>() { // from class: com.p1.mobile.putong.core.data.CountdownItem.2
        public Class getDataClass() {
            return CountdownItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CountdownItem m12530newInstance() {
            return new CountdownItem();
        }

        public boolean parseField(CountdownItem countdownItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    countdownItem.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "expire":
                    countdownItem.expire = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "hidden":
                    countdownItem.hidden = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CountdownItem countdownItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "expire":
                case "hidden":
                    return true;
                default:
                    return super.parseFieldCheck(countdownItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CountdownItem countdownItem, JsonGenerator jsonGenerator) throws IOException {
            String str = countdownItem.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            jsonGenerator.writeFieldName("expire");
            Converter.API_TIME.serialize(Double.valueOf(countdownItem.expire), jsonGenerator, true);
            jsonGenerator.writeBooleanField(MyVisitorsShowType.hidden, countdownItem.hidden);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CountdownItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CountdownItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CountdownItem new_() {
        CountdownItem countdownItem = new CountdownItem();
        countdownItem.nullCheck();
        return countdownItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CountdownItem m12528clone() {
        CountdownItem countdownItem = new CountdownItem();
        countdownItem.otherUserId = this.otherUserId;
        countdownItem.expire = this.expire;
        countdownItem.hidden = this.hidden;
        return countdownItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CountdownItem)) {
            return false;
        }
        CountdownItem countdownItem = (CountdownItem) obj;
        return this == obj && ValueObject.util_equals(this.otherUserId, countdownItem.otherUserId) && this.expire == countdownItem.expire && this.hidden == countdownItem.hidden;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.otherUserId;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expire);
        int i2 = (((iHashCode2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.hidden ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
