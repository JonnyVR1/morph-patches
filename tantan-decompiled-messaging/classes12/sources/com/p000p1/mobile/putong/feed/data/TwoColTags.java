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
public class TwoColTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "twocoltags";

    @NonNull
    @ProtobufIndex(index = 2)
    public TwoColBgColors backgroundColors;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<TwoColTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<TwoColTags>() { // from class: com.p1.mobile.putong.feed.data.TwoColTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TwoColTags twoColTags) {
            String str = twoColTags.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            TwoColBgColors twoColBgColors = twoColTags.backgroundColors;
            if (twoColBgColors != null) {
                iO += CodedOutputByteBufferNano.l(2, twoColBgColors, TwoColBgColors.PROTOBUF_ADAPTER);
            }
            String str2 = twoColTags.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) twoColTags).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TwoColTags m19810parse(nb5 nb5Var) throws IOException {
            TwoColTags twoColTags = new TwoColTags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (twoColTags.value == null) {
                        twoColTags.value = "";
                    }
                    if (twoColTags.backgroundColors == null) {
                        twoColTags.backgroundColors = TwoColBgColors.new_();
                    }
                    if (twoColTags.type != null) {
                        break;
                    }
                    twoColTags.type = "";
                    break;
                }
                if (iU == 10) {
                    twoColTags.value = nb5Var.s();
                } else if (iU == 18) {
                    twoColTags.backgroundColors = (TwoColBgColors) nb5Var.l(TwoColBgColors.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (twoColTags.value == null) {
                            twoColTags.value = "";
                        }
                        if (twoColTags.backgroundColors == null) {
                            twoColTags.backgroundColors = TwoColBgColors.new_();
                        }
                        if (twoColTags.type != null) {
                            break;
                        }
                        twoColTags.type = "";
                        return twoColTags;
                    }
                    twoColTags.type = nb5Var.s();
                }
            }
            return twoColTags;
        }

        public void serialize(TwoColTags twoColTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = twoColTags.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            TwoColBgColors twoColBgColors = twoColTags.backgroundColors;
            if (twoColBgColors != null) {
                codedOutputByteBufferNano.K(2, twoColBgColors, TwoColBgColors.PROTOBUF_ADAPTER);
            }
            String str2 = twoColTags.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<TwoColTags> JSON_ADAPTER = new ObjectJsonAdapter<TwoColTags>() { // from class: com.p1.mobile.putong.feed.data.TwoColTags.2
        public Class getDataClass() {
            return TwoColTags.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TwoColTags mo17830newInstance() {
            return new TwoColTags();
        }

        public boolean parseField(TwoColTags twoColTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    twoColTags.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    twoColTags.value = jsonParser.getValueAsString();
                    return true;
                case "backgroundColors":
                    twoColTags.backgroundColors = (TwoColBgColors) TwoColBgColors.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TwoColTags twoColTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "value":
                case "backgroundColors":
                    return true;
                default:
                    return super.parseFieldCheck(twoColTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TwoColTags twoColTags, JsonGenerator jsonGenerator) throws IOException {
            String str = twoColTags.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            if (twoColTags.backgroundColors != null) {
                jsonGenerator.writeFieldName("backgroundColors");
                TwoColBgColors.JSON_ADAPTER.serialize(twoColTags.backgroundColors, jsonGenerator, true);
            }
            String str2 = twoColTags.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TwoColTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TwoColTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TwoColTags new_() {
        TwoColTags twoColTags = new TwoColTags();
        twoColTags.nullCheck();
        return twoColTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TwoColTags m19809clone() {
        TwoColTags twoColTags = new TwoColTags();
        twoColTags.value = this.value;
        TwoColBgColors twoColBgColors = this.backgroundColors;
        if (twoColBgColors != null) {
            twoColTags.backgroundColors = twoColBgColors.m19806clone();
        }
        twoColTags.type = this.type;
        return twoColTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TwoColTags)) {
            return false;
        }
        TwoColTags twoColTags = (TwoColTags) obj;
        return ValueObject.util_equals(this.value, twoColTags.value) && ValueObject.util_equals(this.backgroundColors, twoColTags.backgroundColors) && ValueObject.util_equals(this.type, twoColTags.type);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TwoColBgColors twoColBgColors = this.backgroundColors;
        int iHashCode2 = (iHashCode + (twoColBgColors != null ? twoColBgColors.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.backgroundColors == null) {
            this.backgroundColors = TwoColBgColors.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
