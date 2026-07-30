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
public class BoostInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String boostUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String isBoost;
    public static ProtobufAdapter<BoostInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostInfo>() { // from class: com.p1.mobile.putong.core.data.BoostInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostInfo boostInfo) {
            String str = boostInfo.isBoost;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = boostInfo.boostUserId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) boostInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostInfo m11779parse(nb5 nb5Var) throws IOException {
            BoostInfo boostInfo = new BoostInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (boostInfo.isBoost == null) {
                        boostInfo.isBoost = "";
                    }
                    if (boostInfo.boostUserId != null) {
                        break;
                    }
                    boostInfo.boostUserId = "";
                    break;
                }
                if (iU == 10) {
                    boostInfo.isBoost = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (boostInfo.isBoost == null) {
                            boostInfo.isBoost = "";
                        }
                        if (boostInfo.boostUserId != null) {
                            break;
                        }
                        boostInfo.boostUserId = "";
                        return boostInfo;
                    }
                    boostInfo.boostUserId = nb5Var.s();
                }
            }
            return boostInfo;
        }

        public void serialize(BoostInfo boostInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostInfo.isBoost;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = boostInfo.boostUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<BoostInfo> JSON_ADAPTER = new ObjectJsonAdapter<BoostInfo>() { // from class: com.p1.mobile.putong.core.data.BoostInfo.2
        public Class getDataClass() {
            return BoostInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostInfo m11780newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostInfo new_() {
        BoostInfo boostInfo = new BoostInfo();
        boostInfo.nullCheck();
        return boostInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostInfo m11778clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.isBoost;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.boostUserId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.isBoost == null) {
            this.isBoost = "";
        }
        if (this.boostUserId == null) {
            this.boostUserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
