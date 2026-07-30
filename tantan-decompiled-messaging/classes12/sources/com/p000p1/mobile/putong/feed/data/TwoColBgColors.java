package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.KanKanStatus;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TwoColBgColors twoColBgColors) {
            String str = twoColBgColors.start;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) twoColBgColors).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TwoColBgColors m19807parse(nb5 nb5Var) throws IOException {
            TwoColBgColors twoColBgColors = new TwoColBgColors();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (twoColBgColors.start == null) {
                        twoColBgColors.start = "";
                    }
                    if (twoColBgColors.end != null) {
                        break;
                    }
                    twoColBgColors.end = "";
                    break;
                }
                if (iU == 10) {
                    twoColBgColors.start = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (twoColBgColors.start == null) {
                            twoColBgColors.start = "";
                        }
                        if (twoColBgColors.end != null) {
                            break;
                        }
                        twoColBgColors.end = "";
                        return twoColBgColors;
                    }
                    twoColBgColors.end = nb5Var.s();
                }
            }
            return twoColBgColors;
        }

        public void serialize(TwoColBgColors twoColBgColors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = twoColBgColors.start;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<TwoColBgColors> JSON_ADAPTER = new ObjectJsonAdapter<TwoColBgColors>() { // from class: com.p1.mobile.putong.feed.data.TwoColBgColors.2
        public Class getDataClass() {
            return TwoColBgColors.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TwoColBgColors mo17830newInstance() {
            return new TwoColBgColors();
        }

        public boolean parseField(TwoColBgColors twoColBgColors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("end")) {
                twoColBgColors.end = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KanKanStatus.start)) {
                return false;
            }
            twoColBgColors.start = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TwoColBgColors twoColBgColors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("end") || str.equals(KanKanStatus.start)) {
                return true;
            }
            return super.parseFieldCheck(twoColBgColors, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TwoColBgColors twoColBgColors, JsonGenerator jsonGenerator) throws IOException {
            String str = twoColBgColors.start;
            if (str != null) {
                jsonGenerator.writeStringField(KanKanStatus.start, str);
            }
            String str2 = twoColBgColors.end;
            if (str2 != null) {
                jsonGenerator.writeStringField("end", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TwoColBgColors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TwoColBgColors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TwoColBgColors new_() {
        TwoColBgColors twoColBgColors = new TwoColBgColors();
        twoColBgColors.nullCheck();
        return twoColBgColors;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TwoColBgColors m19806clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.start;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.end;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.start == null) {
            this.start = "";
        }
        if (this.end == null) {
            this.end = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
