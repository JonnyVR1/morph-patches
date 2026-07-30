package com.p000p1.mobile.putong.feed.data;

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
public class SvipValues extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipvalues";

    @ProtobufIndex(index = 1)
    public int likeMes;

    @ProtobufIndex(index = 2)
    public int views;
    public static ProtobufAdapter<SvipValues> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipValues>() { // from class: com.p1.mobile.putong.feed.data.SvipValues.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipValues svipValues) {
            int iH = CodedOutputByteBufferNano.h(1, svipValues.likeMes) + CodedOutputByteBufferNano.h(2, svipValues.views);
            ((MessageNano) svipValues).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipValues m19777parse(nb5 nb5Var) throws IOException {
            SvipValues svipValues = new SvipValues();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    svipValues.likeMes = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return svipValues;
                    }
                    svipValues.views = nb5Var.j();
                }
            }
        }

        public void serialize(SvipValues svipValues, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, svipValues.likeMes);
            codedOutputByteBufferNano.G(2, svipValues.views);
        }
    };
    public static JsonAdapter<SvipValues> JSON_ADAPTER = new ObjectJsonAdapter<SvipValues>() { // from class: com.p1.mobile.putong.feed.data.SvipValues.2
        public Class getDataClass() {
            return SvipValues.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SvipValues mo17830newInstance() {
            return new SvipValues();
        }

        public boolean parseField(SvipValues svipValues, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("views")) {
                svipValues.views = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("likeMes")) {
                return false;
            }
            svipValues.likeMes = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SvipValues svipValues, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("views") || str.equals("likeMes")) {
                return true;
            }
            return super.parseFieldCheck(svipValues, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipValues svipValues, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("likeMes", svipValues.likeMes);
            jsonGenerator.writeNumberField("views", svipValues.views);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipValues) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipValues) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipValues new_() {
        SvipValues svipValues = new SvipValues();
        svipValues.nullCheck();
        return svipValues;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipValues m19776clone() {
        SvipValues svipValues = new SvipValues();
        svipValues.likeMes = this.likeMes;
        svipValues.views = this.views;
        return svipValues;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipValues)) {
            return false;
        }
        SvipValues svipValues = (SvipValues) obj;
        return this.likeMes == svipValues.likeMes && this.views == svipValues.views;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.likeMes) * 41) + this.views;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
