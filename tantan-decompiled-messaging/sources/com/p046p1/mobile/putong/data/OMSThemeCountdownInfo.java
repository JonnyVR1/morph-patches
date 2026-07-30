package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSThemeCountdownInfo oMSThemeCountdownInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, oMSThemeCountdownInfo.display) + CodedOutputByteBufferNano.m17228j(2, oMSThemeCountdownInfo.startMs) + CodedOutputByteBufferNano.m17228j(3, oMSThemeCountdownInfo.endMs);
            oMSThemeCountdownInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSThemeCountdownInfo parse(nb5 nb5Var) throws IOException {
            OMSThemeCountdownInfo oMSThemeCountdownInfo = new OMSThemeCountdownInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    oMSThemeCountdownInfo.display = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    oMSThemeCountdownInfo.startMs = nb5Var.m158742k();
                } else {
                    if (iM158752u != 24) {
                        return oMSThemeCountdownInfo;
                    }
                    oMSThemeCountdownInfo.endMs = nb5Var.m158742k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSThemeCountdownInfo oMSThemeCountdownInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, oMSThemeCountdownInfo.display);
            codedOutputByteBufferNano.m17252I(2, oMSThemeCountdownInfo.startMs);
            codedOutputByteBufferNano.m17252I(3, oMSThemeCountdownInfo.endMs);
        }
    };
    public static JsonAdapter<OMSThemeCountdownInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeCountdownInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeCountdownInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSThemeCountdownInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSThemeCountdownInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeCountdownInfo oMSThemeCountdownInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, oMSThemeCountdownInfo.display);
            jsonGenerator.writeNumberField("startMs", oMSThemeCountdownInfo.startMs);
            jsonGenerator.writeNumberField("endMs", oMSThemeCountdownInfo.endMs);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeCountdownInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeCountdownInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeCountdownInfo new_() {
        OMSThemeCountdownInfo oMSThemeCountdownInfo = new OMSThemeCountdownInfo();
        oMSThemeCountdownInfo.nullCheck();
        return oMSThemeCountdownInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSThemeCountdownInfo mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.display ? 1231 : 1237)) * 41;
        long j = this.startMs;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endMs;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
