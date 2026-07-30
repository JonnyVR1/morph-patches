package com.p000p1.mobile.putong.core.data;

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
public class BoostQueryData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostquerydata";

    @ProtobufIndex(index = 1)
    public int allCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int likeCount;
    public static ProtobufAdapter<BoostQueryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostQueryData>() { // from class: com.p1.mobile.putong.core.data.BoostQueryData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostQueryData boostQueryData) {
            int iH = CodedOutputByteBufferNano.h(1, boostQueryData.allCount) + CodedOutputByteBufferNano.h(2, boostQueryData.likeCount);
            ((MessageNano) boostQueryData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostQueryData m11795parse(nb5 nb5Var) throws IOException {
            BoostQueryData boostQueryData = new BoostQueryData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    boostQueryData.allCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return boostQueryData;
                    }
                    boostQueryData.likeCount = nb5Var.j();
                }
            }
        }

        public void serialize(BoostQueryData boostQueryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, boostQueryData.allCount);
            codedOutputByteBufferNano.G(2, boostQueryData.likeCount);
        }
    };
    public static JsonAdapter<BoostQueryData> JSON_ADAPTER = new ObjectJsonAdapter<BoostQueryData>() { // from class: com.p1.mobile.putong.core.data.BoostQueryData.2
        public Class getDataClass() {
            return BoostQueryData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostQueryData m11796newInstance() {
            return new BoostQueryData();
        }

        public boolean parseField(BoostQueryData boostQueryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("likeCount")) {
                boostQueryData.likeCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("allCount")) {
                return false;
            }
            boostQueryData.allCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostQueryData boostQueryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("likeCount") || str.equals("allCount")) {
                return true;
            }
            return super.parseFieldCheck(boostQueryData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostQueryData boostQueryData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("allCount", boostQueryData.allCount);
            jsonGenerator.writeNumberField("likeCount", boostQueryData.likeCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostQueryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostQueryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostQueryData new_() {
        BoostQueryData boostQueryData = new BoostQueryData();
        boostQueryData.nullCheck();
        return boostQueryData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostQueryData m11794clone() {
        BoostQueryData boostQueryData = new BoostQueryData();
        boostQueryData.allCount = this.allCount;
        boostQueryData.likeCount = this.likeCount;
        return boostQueryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostQueryData)) {
            return false;
        }
        BoostQueryData boostQueryData = (BoostQueryData) obj;
        return this == obj && this.allCount == boostQueryData.allCount && this.likeCount == boostQueryData.likeCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((super.hashCode() * 41) + this.allCount) * 41) + this.likeCount;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
