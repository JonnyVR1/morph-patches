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
public class InstantMatchGiveCountInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "instantmatchgivecountinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String giveCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String skuTypeVal;
    public static ProtobufAdapter<InstantMatchGiveCountInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<InstantMatchGiveCountInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchGiveCountInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InstantMatchGiveCountInfo instantMatchGiveCountInfo) {
            String str = instantMatchGiveCountInfo.skuTypeVal;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = instantMatchGiveCountInfo.giveCount;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) instantMatchGiveCountInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InstantMatchGiveCountInfo m13477parse(nb5 nb5Var) throws IOException {
            InstantMatchGiveCountInfo instantMatchGiveCountInfo = new InstantMatchGiveCountInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (instantMatchGiveCountInfo.skuTypeVal == null) {
                        instantMatchGiveCountInfo.skuTypeVal = "";
                    }
                    if (instantMatchGiveCountInfo.giveCount != null) {
                        break;
                    }
                    instantMatchGiveCountInfo.giveCount = "";
                    break;
                }
                if (iU == 10) {
                    instantMatchGiveCountInfo.skuTypeVal = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (instantMatchGiveCountInfo.skuTypeVal == null) {
                            instantMatchGiveCountInfo.skuTypeVal = "";
                        }
                        if (instantMatchGiveCountInfo.giveCount != null) {
                            break;
                        }
                        instantMatchGiveCountInfo.giveCount = "";
                        return instantMatchGiveCountInfo;
                    }
                    instantMatchGiveCountInfo.giveCount = nb5Var.s();
                }
            }
            return instantMatchGiveCountInfo;
        }

        public void serialize(InstantMatchGiveCountInfo instantMatchGiveCountInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = instantMatchGiveCountInfo.skuTypeVal;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = instantMatchGiveCountInfo.giveCount;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<InstantMatchGiveCountInfo> JSON_ADAPTER = new ObjectJsonAdapter<InstantMatchGiveCountInfo>() { // from class: com.p1.mobile.putong.core.data.InstantMatchGiveCountInfo.2
        public Class getDataClass() {
            return InstantMatchGiveCountInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InstantMatchGiveCountInfo m13478newInstance() {
            return new InstantMatchGiveCountInfo();
        }

        public boolean parseField(InstantMatchGiveCountInfo instantMatchGiveCountInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("giveCount")) {
                instantMatchGiveCountInfo.giveCount = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("skuTypeVal")) {
                return false;
            }
            instantMatchGiveCountInfo.skuTypeVal = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(InstantMatchGiveCountInfo instantMatchGiveCountInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("giveCount") || str.equals("skuTypeVal")) {
                return true;
            }
            return super.parseFieldCheck(instantMatchGiveCountInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(InstantMatchGiveCountInfo instantMatchGiveCountInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = instantMatchGiveCountInfo.skuTypeVal;
            if (str != null) {
                jsonGenerator.writeStringField("skuTypeVal", str);
            }
            String str2 = instantMatchGiveCountInfo.giveCount;
            if (str2 != null) {
                jsonGenerator.writeStringField("giveCount", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InstantMatchGiveCountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InstantMatchGiveCountInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InstantMatchGiveCountInfo new_() {
        InstantMatchGiveCountInfo instantMatchGiveCountInfo = new InstantMatchGiveCountInfo();
        instantMatchGiveCountInfo.nullCheck();
        return instantMatchGiveCountInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InstantMatchGiveCountInfo m13476clone() {
        InstantMatchGiveCountInfo instantMatchGiveCountInfo = new InstantMatchGiveCountInfo();
        instantMatchGiveCountInfo.skuTypeVal = this.skuTypeVal;
        instantMatchGiveCountInfo.giveCount = this.giveCount;
        return instantMatchGiveCountInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstantMatchGiveCountInfo)) {
            return false;
        }
        InstantMatchGiveCountInfo instantMatchGiveCountInfo = (InstantMatchGiveCountInfo) obj;
        return ValueObject.util_equals(this.skuTypeVal, instantMatchGiveCountInfo.skuTypeVal) && ValueObject.util_equals(this.giveCount, instantMatchGiveCountInfo.giveCount);
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
        String str = this.skuTypeVal;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giveCount;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.skuTypeVal == null) {
            this.skuTypeVal = "";
        }
        if (this.giveCount == null) {
            this.giveCount = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
