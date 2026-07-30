package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class TwoColBgColors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "twocolbgcolors";

    @NonNull
    @ProtobufIndex(index = 2)
    public String end;

    @NonNull
    @ProtobufIndex(index = 1)
    public String start;
    public static ProtobufAdapter<TwoColBgColors> PROTOBUF_ADAPTER = new MessageNanoAdapter<TwoColBgColors>() { // from class: com.p1.mobile.putong.feed.data.TwoColBgColors.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TwoColBgColors twoColBgColors) {
            String str = twoColBgColors.start;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            twoColBgColors.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TwoColBgColors parse(nc5 nc5Var) throws IOException {
            TwoColBgColors twoColBgColors = new TwoColBgColors();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (twoColBgColors.start == null) {
                        twoColBgColors.start = "";
                    }
                    if (twoColBgColors.end != null) {
                        break;
                    }
                    twoColBgColors.end = "";
                    break;
                }
                if (iM162497u == 10) {
                    twoColBgColors.start = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (twoColBgColors.start == null) {
                            twoColBgColors.start = "";
                        }
                        if (twoColBgColors.end != null) {
                            break;
                        }
                        twoColBgColors.end = "";
                        return twoColBgColors;
                    }
                    twoColBgColors.end = nc5Var.m162495s();
                }
            }
            return twoColBgColors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TwoColBgColors twoColBgColors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = twoColBgColors.start;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<TwoColBgColors> JSON_ADAPTER = new ObjectJsonAdapter<TwoColBgColors>() { // from class: com.p1.mobile.putong.feed.data.TwoColBgColors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TwoColBgColors.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TwoColBgColors newInstance() {
            return new TwoColBgColors();
        }

        public boolean parseField(TwoColBgColors twoColBgColors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("end")) {
                twoColBgColors.end = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("start")) {
                return false;
            }
            twoColBgColors.start = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TwoColBgColors twoColBgColors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("end") || str.equals("start")) {
                return true;
            }
            return super.parseFieldCheck(twoColBgColors, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TwoColBgColors twoColBgColors, JsonGenerator jsonGenerator) throws IOException {
            String str = twoColBgColors.start;
            if (str != null) {
                jsonGenerator.writeStringField("start", str);
            }
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                jsonGenerator.writeStringField("end", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TwoColBgColors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TwoColBgColors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TwoColBgColors new_() {
        TwoColBgColors twoColBgColors = new TwoColBgColors();
        twoColBgColors.nullCheck();
        return twoColBgColors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TwoColBgColors mo225055clone() {
        TwoColBgColors twoColBgColors = new TwoColBgColors();
        twoColBgColors.start = this.start;
        twoColBgColors.end = this.end;
        return twoColBgColors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TwoColBgColors)) {
            return false;
        }
        TwoColBgColors twoColBgColors = (TwoColBgColors) obj;
        return ValueObject.util_equals(this.start, twoColBgColors.start) && ValueObject.util_equals(this.end, twoColBgColors.end);
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
        String str = this.start;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.end;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.start == null) {
            this.start = "";
        }
        if (this.end == null) {
            this.end = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
