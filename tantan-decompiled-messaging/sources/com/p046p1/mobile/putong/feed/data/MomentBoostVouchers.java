package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentBoostVouchers momentBoostVouchers) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, momentBoostVouchers.IOSCoins) + CodedOutputByteBufferNano.m17226h(2, momentBoostVouchers.androidCoins);
            SvipValues svipValues = momentBoostVouchers.values;
            if (svipValues != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
            momentBoostVouchers.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentBoostVouchers parse(nb5 nb5Var) throws IOException {
            MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentBoostVouchers.values != null) {
                        break;
                    }
                    momentBoostVouchers.values = SvipValues.new_();
                    break;
                }
                if (iM158752u == 8) {
                    momentBoostVouchers.IOSCoins = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    momentBoostVouchers.androidCoins = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (momentBoostVouchers.values != null) {
                            break;
                        }
                        momentBoostVouchers.values = SvipValues.new_();
                        return momentBoostVouchers;
                    }
                    momentBoostVouchers.values = (SvipValues) nb5Var.m158743l(SvipValues.PROTOBUF_ADAPTER);
                }
            }
            return momentBoostVouchers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentBoostVouchers momentBoostVouchers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, momentBoostVouchers.IOSCoins);
            codedOutputByteBufferNano.m17250G(2, momentBoostVouchers.androidCoins);
            SvipValues svipValues = momentBoostVouchers.values;
            if (svipValues != null) {
                codedOutputByteBufferNano.m17254K(3, svipValues, SvipValues.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentBoostVouchers> JSON_ADAPTER = new ObjectJsonAdapter<MomentBoostVouchers>() { // from class: com.p1.mobile.putong.feed.data.MomentBoostVouchers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentBoostVouchers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentBoostVouchers newInstance() {
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
                    momentBoostVouchers.values = SvipValues.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentBoostVouchers momentBoostVouchers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("IOSCoins", momentBoostVouchers.IOSCoins);
            jsonGenerator.writeNumberField("androidCoins", momentBoostVouchers.androidCoins);
            if (momentBoostVouchers.values != null) {
                jsonGenerator.writeFieldName("values");
                SvipValues.JSON_ADAPTER.serialize(momentBoostVouchers.values, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentBoostVouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentBoostVouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentBoostVouchers new_() {
        MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
        momentBoostVouchers.nullCheck();
        return momentBoostVouchers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentBoostVouchers mo223809clone() {
        MomentBoostVouchers momentBoostVouchers = new MomentBoostVouchers();
        momentBoostVouchers.IOSCoins = this.IOSCoins;
        momentBoostVouchers.androidCoins = this.androidCoins;
        SvipValues svipValues = this.values;
        if (svipValues != null) {
            momentBoostVouchers.values = svipValues.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.IOSCoins) * 41) + this.androidCoins) * 41;
        SvipValues svipValues = this.values;
        int iHashCode = i2 + (svipValues != null ? svipValues.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.values == null) {
            this.values = SvipValues.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
