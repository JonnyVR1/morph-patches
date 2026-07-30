package com.p000p1.mobile.putong.data;

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
public class OMSThemeCountdownInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemecountdowninfo";

    @ProtobufIndex(index = 1)
    public boolean display;

    @ProtobufIndex(index = 3)
    public long endMs;

    @ProtobufIndex(index = 2)
    public long startMs;
    public static ProtobufAdapter<OMSThemeCountdownInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeCountdownInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeCountdownInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSThemeCountdownInfo oMSThemeCountdownInfo) {
            int iB = CodedOutputByteBufferNano.b(1, oMSThemeCountdownInfo.display) + CodedOutputByteBufferNano.j(2, oMSThemeCountdownInfo.startMs) + CodedOutputByteBufferNano.j(3, oMSThemeCountdownInfo.endMs);
            ((MessageNano) oMSThemeCountdownInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSThemeCountdownInfo m18672parse(nb5 nb5Var) throws IOException {
            OMSThemeCountdownInfo oMSThemeCountdownInfo = new OMSThemeCountdownInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    oMSThemeCountdownInfo.display = nb5Var.g();
                } else if (iU == 16) {
                    oMSThemeCountdownInfo.startMs = nb5Var.k();
                } else {
                    if (iU != 24) {
                        return oMSThemeCountdownInfo;
                    }
                    oMSThemeCountdownInfo.endMs = nb5Var.k();
                }
            }
        }

        public void serialize(OMSThemeCountdownInfo oMSThemeCountdownInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, oMSThemeCountdownInfo.display);
            codedOutputByteBufferNano.I(2, oMSThemeCountdownInfo.startMs);
            codedOutputByteBufferNano.I(3, oMSThemeCountdownInfo.endMs);
        }
    };
    public static JsonAdapter<OMSThemeCountdownInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeCountdownInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeCountdownInfo.2
        public Class getDataClass() {
            return OMSThemeCountdownInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSThemeCountdownInfo mo17830newInstance() {
            return new OMSThemeCountdownInfo();
        }

        public boolean parseField(OMSThemeCountdownInfo oMSThemeCountdownInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startMs":
                    oMSThemeCountdownInfo.startMs = jsonParser.getValueAsLong();
                    return true;
                case "endMs":
                    oMSThemeCountdownInfo.endMs = jsonParser.getValueAsLong();
                    return true;
                case "display":
                    oMSThemeCountdownInfo.display = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSThemeCountdownInfo oMSThemeCountdownInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startMs":
                case "endMs":
                case "display":
                    return true;
                default:
                    return super.parseFieldCheck(oMSThemeCountdownInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeCountdownInfo oMSThemeCountdownInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("display", oMSThemeCountdownInfo.display);
            jsonGenerator.writeNumberField("startMs", oMSThemeCountdownInfo.startMs);
            jsonGenerator.writeNumberField("endMs", oMSThemeCountdownInfo.endMs);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeCountdownInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeCountdownInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeCountdownInfo new_() {
        OMSThemeCountdownInfo oMSThemeCountdownInfo = new OMSThemeCountdownInfo();
        oMSThemeCountdownInfo.nullCheck();
        return oMSThemeCountdownInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSThemeCountdownInfo m18671clone() {
        OMSThemeCountdownInfo oMSThemeCountdownInfo = new OMSThemeCountdownInfo();
        oMSThemeCountdownInfo.display = this.display;
        oMSThemeCountdownInfo.startMs = this.startMs;
        oMSThemeCountdownInfo.endMs = this.endMs;
        return oMSThemeCountdownInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeCountdownInfo)) {
            return false;
        }
        OMSThemeCountdownInfo oMSThemeCountdownInfo = (OMSThemeCountdownInfo) obj;
        return this.display == oMSThemeCountdownInfo.display && this.startMs == oMSThemeCountdownInfo.startMs && this.endMs == oMSThemeCountdownInfo.endMs;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.display ? 1231 : 1237)) * 41;
        long j = this.startMs;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endMs;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
