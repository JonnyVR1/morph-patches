package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BuryingPointParam extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buryingpointparam";

    @NonNull
    @ProtobufIndex(index = 1)
    public String guideFrom;
    public static ProtobufAdapter<BuryingPointParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuryingPointParam>() { // from class: com.p1.mobile.putong.feed.data.BuryingPointParam.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuryingPointParam buryingPointParam) {
            String str = buryingPointParam.guideFrom;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) buryingPointParam).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuryingPointParam m19434parse(nb5 nb5Var) throws IOException {
            BuryingPointParam buryingPointParam = new BuryingPointParam();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (buryingPointParam.guideFrom != null) {
                        break;
                    }
                    buryingPointParam.guideFrom = "";
                    break;
                }
                if (iU != 10) {
                    if (buryingPointParam.guideFrom != null) {
                        break;
                    }
                    buryingPointParam.guideFrom = "";
                    return buryingPointParam;
                }
                buryingPointParam.guideFrom = nb5Var.s();
            }
            return buryingPointParam;
        }

        public void serialize(BuryingPointParam buryingPointParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = buryingPointParam.guideFrom;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<BuryingPointParam> JSON_ADAPTER = new ObjectJsonAdapter<BuryingPointParam>() { // from class: com.p1.mobile.putong.feed.data.BuryingPointParam.2
        public Class getDataClass() {
            return BuryingPointParam.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BuryingPointParam mo17830newInstance() {
            return new BuryingPointParam();
        }

        public boolean parseField(BuryingPointParam buryingPointParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("guideFrom")) {
                return false;
            }
            buryingPointParam.guideFrom = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BuryingPointParam buryingPointParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("guideFrom")) {
                return true;
            }
            return super.parseFieldCheck(buryingPointParam, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuryingPointParam buryingPointParam, JsonGenerator jsonGenerator) throws IOException {
            String str = buryingPointParam.guideFrom;
            if (str != null) {
                jsonGenerator.writeStringField("guideFrom", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuryingPointParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuryingPointParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuryingPointParam new_() {
        BuryingPointParam buryingPointParam = new BuryingPointParam();
        buryingPointParam.nullCheck();
        return buryingPointParam;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuryingPointParam m19433clone() {
        BuryingPointParam buryingPointParam = new BuryingPointParam();
        buryingPointParam.guideFrom = this.guideFrom;
        return buryingPointParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BuryingPointParam) {
            return ValueObject.util_equals(this.guideFrom, ((BuryingPointParam) obj).guideFrom);
        }
        return false;
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
        String str = this.guideFrom;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.guideFrom == null) {
            this.guideFrom = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
