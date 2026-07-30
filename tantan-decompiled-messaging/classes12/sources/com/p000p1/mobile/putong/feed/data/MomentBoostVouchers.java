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
public class MomentBoostVouchers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentboostvouchers";

    @ProtobufIndex(index = 1)
    public int IOSCoins;

    @ProtobufIndex(index = 2)
    public int androidCoins;

    @NonNull
    @ProtobufIndex(index = 3)
    public SvipValues values;
    public static ProtobufAdapter<MomentBoostVouchers> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentBoostVouchers>() { // from class: com.p1.mobile.putong.feed.data.MomentBoostVouchers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentBoostVouchers momentBoostVouchers) {
            int iH = CodedOutputByteBufferNano.h(1, momentBoostVouchers.IOSCoins) + CodedOutputByteBufferNano.h(2, momentBoostVouchers.androidCoins);
            SvipValues svipValues = momentBoostVouchers.values;
            if (svipValues != null) {
                iH += CodedOutputByteBufferNano.l(3, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentBoostVouchers).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentBoostVouchers m19602parse(nb5 nb5Var) throws IOException {
            MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentBoostVouchers.values != null) {
                        break;
                    }
                    momentBoostVouchers.values = SvipValues.new_();
                    break;
                }
                if (iU == 8) {
                    momentBoostVouchers.IOSCoins = nb5Var.j();
                } else if (iU == 16) {
                    momentBoostVouchers.androidCoins = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (momentBoostVouchers.values != null) {
                            break;
                        }
                        momentBoostVouchers.values = SvipValues.new_();
                        return momentBoostVouchers;
                    }
                    momentBoostVouchers.values = (SvipValues) nb5Var.l(SvipValues.PROTOBUF_ADAPTER);
                }
            }
            return momentBoostVouchers;
        }

        public void serialize(MomentBoostVouchers momentBoostVouchers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, momentBoostVouchers.IOSCoins);
            codedOutputByteBufferNano.G(2, momentBoostVouchers.androidCoins);
            SvipValues svipValues = momentBoostVouchers.values;
            if (svipValues != null) {
                codedOutputByteBufferNano.K(3, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentBoostVouchers> JSON_ADAPTER = new ObjectJsonAdapter<MomentBoostVouchers>() { // from class: com.p1.mobile.putong.feed.data.MomentBoostVouchers.2
        public Class getDataClass() {
            return MomentBoostVouchers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentBoostVouchers mo17830newInstance() {
            return new MomentBoostVouchers();
        }

        public boolean parseField(MomentBoostVouchers momentBoostVouchers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "IOSCoins":
                    momentBoostVouchers.IOSCoins = jsonParser.getValueAsInt();
                    return true;
                case "androidCoins":
                    momentBoostVouchers.androidCoins = jsonParser.getValueAsInt();
                    return true;
                case "values":
                    momentBoostVouchers.values = (SvipValues) SvipValues.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentBoostVouchers momentBoostVouchers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "IOSCoins":
                case "androidCoins":
                case "values":
                    return true;
                default:
                    return super.parseFieldCheck(momentBoostVouchers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentBoostVouchers momentBoostVouchers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("IOSCoins", momentBoostVouchers.IOSCoins);
            jsonGenerator.writeNumberField("androidCoins", momentBoostVouchers.androidCoins);
            if (momentBoostVouchers.values != null) {
                jsonGenerator.writeFieldName("values");
                SvipValues.JSON_ADAPTER.serialize(momentBoostVouchers.values, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentBoostVouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentBoostVouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentBoostVouchers new_() {
        MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
        momentBoostVouchers.nullCheck();
        return momentBoostVouchers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentBoostVouchers m19601clone() {
        MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
        momentBoostVouchers.IOSCoins = this.IOSCoins;
        momentBoostVouchers.androidCoins = this.androidCoins;
        SvipValues svipValues = this.values;
        if (svipValues != null) {
            momentBoostVouchers.values = svipValues.m19776clone();
        }
        return momentBoostVouchers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentBoostVouchers)) {
            return false;
        }
        MomentBoostVouchers momentBoostVouchers = (MomentBoostVouchers) obj;
        return this.IOSCoins == momentBoostVouchers.IOSCoins && this.androidCoins == momentBoostVouchers.androidCoins && ValueObject.util_equals(this.values, momentBoostVouchers.values);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.IOSCoins) * 41) + this.androidCoins) * 41;
        SvipValues svipValues = this.values;
        int iHashCode = i2 + (svipValues != null ? svipValues.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.values == null) {
            this.values = SvipValues.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
