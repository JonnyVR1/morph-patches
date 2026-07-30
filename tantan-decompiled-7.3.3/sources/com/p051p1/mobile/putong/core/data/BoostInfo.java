package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class BoostInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String boostUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String isBoost;
    public static ProtobufAdapter<BoostInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostInfo>() { // from class: com.p1.mobile.putong.core.data.BoostInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostInfo boostInfo) {
            String str = boostInfo.isBoost;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = boostInfo.boostUserId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            boostInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostInfo parse(nc5 nc5Var) throws IOException {
            BoostInfo boostInfo = new BoostInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (boostInfo.isBoost == null) {
                        boostInfo.isBoost = "";
                    }
                    if (boostInfo.boostUserId != null) {
                        break;
                    }
                    boostInfo.boostUserId = "";
                    break;
                }
                if (iM162497u == 10) {
                    boostInfo.isBoost = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (boostInfo.isBoost == null) {
                            boostInfo.isBoost = "";
                        }
                        if (boostInfo.boostUserId != null) {
                            break;
                        }
                        boostInfo.boostUserId = "";
                        return boostInfo;
                    }
                    boostInfo.boostUserId = nc5Var.m162495s();
                }
            }
            return boostInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostInfo boostInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostInfo.isBoost;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = boostInfo.boostUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<BoostInfo> JSON_ADAPTER = new ObjectJsonAdapter<BoostInfo>() { // from class: com.p1.mobile.putong.core.data.BoostInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostInfo newInstance() {
            return new BoostInfo();
        }

        public boolean parseField(BoostInfo boostInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("boostUserId")) {
                boostInfo.boostUserId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("isBoost")) {
                return false;
            }
            boostInfo.isBoost = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BoostInfo boostInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("boostUserId") || str.equals("isBoost")) {
                return true;
            }
            return super.parseFieldCheck(boostInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostInfo boostInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = boostInfo.isBoost;
            if (str != null) {
                jsonGenerator.writeStringField("isBoost", str);
            }
            String str2 = boostInfo.boostUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("boostUserId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostInfo new_() {
        BoostInfo boostInfo = new BoostInfo();
        boostInfo.nullCheck();
        return boostInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostInfo mo225055clone() {
        BoostInfo boostInfo = new BoostInfo();
        boostInfo.isBoost = this.isBoost;
        boostInfo.boostUserId = this.boostUserId;
        return boostInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostInfo)) {
            return false;
        }
        BoostInfo boostInfo = (BoostInfo) obj;
        return ValueObject.util_equals(this.isBoost, boostInfo.isBoost) && ValueObject.util_equals(this.boostUserId, boostInfo.boostUserId);
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
        String str = this.isBoost;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.boostUserId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.isBoost == null) {
            this.isBoost = "";
        }
        if (this.boostUserId == null) {
            this.boostUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
