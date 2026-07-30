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
public class LabelshowTips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelshowtips";

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<LabelshowTips> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelshowTips>() { // from class: com.p1.mobile.putong.core.data.LabelshowTips.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LabelshowTips labelshowTips) {
            String str = labelshowTips.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) labelshowTips).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LabelshowTips m13813parse(nb5 nb5Var) throws IOException {
            LabelshowTips labelshowTips = new LabelshowTips();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (labelshowTips.text != null) {
                        break;
                    }
                    labelshowTips.text = "";
                    break;
                }
                if (iU != 10) {
                    if (labelshowTips.text != null) {
                        break;
                    }
                    labelshowTips.text = "";
                    return labelshowTips;
                }
                labelshowTips.text = nb5Var.s();
            }
            return labelshowTips;
        }

        public void serialize(LabelshowTips labelshowTips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelshowTips.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LabelshowTips> JSON_ADAPTER = new ObjectJsonAdapter<LabelshowTips>() { // from class: com.p1.mobile.putong.core.data.LabelshowTips.2
        public Class getDataClass() {
            return LabelshowTips.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LabelshowTips m13814newInstance() {
            return new LabelshowTips();
        }

        public boolean parseField(LabelshowTips labelshowTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("text")) {
                return false;
            }
            labelshowTips.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LabelshowTips labelshowTips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(labelshowTips, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LabelshowTips labelshowTips, JsonGenerator jsonGenerator) throws IOException {
            String str = labelshowTips.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelshowTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelshowTips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelshowTips new_() {
        LabelshowTips labelshowTips = new LabelshowTips();
        labelshowTips.nullCheck();
        return labelshowTips;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LabelshowTips m13812clone() {
        LabelshowTips labelshowTips = new LabelshowTips();
        labelshowTips.text = this.text;
        return labelshowTips;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LabelshowTips) {
            return ValueObject.util_equals(this.text, ((LabelshowTips) obj).text);
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
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
