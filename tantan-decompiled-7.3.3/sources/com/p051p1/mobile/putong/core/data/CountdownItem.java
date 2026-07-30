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
public class CountdownItem extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "countdownitem";

    @ProtobufIndex(index = 2)
    public double expire;

    @ProtobufIndex(index = 3)
    public boolean hidden;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserId;
    public static ProtobufAdapter<CountdownItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<CountdownItem>() { // from class: com.p1.mobile.putong.core.data.CountdownItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CountdownItem countdownItem) {
            String str = countdownItem.otherUserId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, countdownItem.expire) + CodedOutputByteBufferNano.m17275b(3, countdownItem.hidden);
            countdownItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CountdownItem parse(nc5 nc5Var) throws IOException {
            CountdownItem countdownItem = new CountdownItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (countdownItem.otherUserId != null) {
                        break;
                    }
                    countdownItem.otherUserId = "";
                    break;
                }
                if (iM162497u == 10) {
                    countdownItem.otherUserId = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    countdownItem.expire = nc5Var.m162484h();
                } else {
                    if (iM162497u != 24) {
                        if (countdownItem.otherUserId != null) {
                            break;
                        }
                        countdownItem.otherUserId = "";
                        return countdownItem;
                    }
                    countdownItem.hidden = nc5Var.m162483g();
                }
            }
            return countdownItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CountdownItem countdownItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = countdownItem.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, countdownItem.expire);
            codedOutputByteBufferNano.m17299A(3, countdownItem.hidden);
        }
    };
    public static JsonAdapter<CountdownItem> JSON_ADAPTER = new ObjectJsonAdapter<CountdownItem>() { // from class: com.p1.mobile.putong.core.data.CountdownItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CountdownItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CountdownItem newInstance() {
            return new CountdownItem();
        }

        public boolean parseField(CountdownItem countdownItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    countdownItem.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "expire":
                    countdownItem.expire = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CountdownItem countdownItem, JsonGenerator jsonGenerator) throws IOException {
            String str = countdownItem.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            jsonGenerator.writeFieldName("expire");
            Converter.API_TIME.serialize(Double.valueOf(countdownItem.expire), jsonGenerator, true);
            jsonGenerator.writeBooleanField("hidden", countdownItem.hidden);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CountdownItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CountdownItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CountdownItem new_() {
        CountdownItem countdownItem = new CountdownItem();
        countdownItem.nullCheck();
        return countdownItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CountdownItem mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.otherUserId;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expire);
        int i2 = (((iHashCode2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.hidden ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
