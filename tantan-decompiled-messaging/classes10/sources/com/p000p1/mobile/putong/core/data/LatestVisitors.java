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
public class LatestVisitors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "latestvisitors";

    @NonNull
    @ProtobufIndex(index = 6)
    public String highLight;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long latestVisitTime;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String subText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int visitCount;
    public static ProtobufAdapter<LatestVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<LatestVisitors>() { // from class: com.p1.mobile.putong.core.data.LatestVisitors.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LatestVisitors latestVisitors) {
            String str = latestVisitors.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, latestVisitors.visitCount) + CodedOutputByteBufferNano.j(3, latestVisitors.latestVisitTime);
            String str2 = latestVisitors.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = latestVisitors.subText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = latestVisitors.highLight;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            ((MessageNano) latestVisitors).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LatestVisitors m13817parse(nb5 nb5Var) throws IOException {
            LatestVisitors latestVisitors = new LatestVisitors();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (latestVisitors.userId == null) {
                        latestVisitors.userId = "";
                    }
                    if (latestVisitors.text == null) {
                        latestVisitors.text = "";
                    }
                    if (latestVisitors.subText == null) {
                        latestVisitors.subText = "";
                    }
                    if (latestVisitors.highLight != null) {
                        break;
                    }
                    latestVisitors.highLight = "";
                    break;
                }
                if (iU == 10) {
                    latestVisitors.userId = nb5Var.s();
                } else if (iU == 16) {
                    latestVisitors.visitCount = nb5Var.j();
                } else if (iU == 24) {
                    latestVisitors.latestVisitTime = nb5Var.k();
                } else if (iU == 34) {
                    latestVisitors.text = nb5Var.s();
                } else if (iU == 42) {
                    latestVisitors.subText = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (latestVisitors.userId == null) {
                            latestVisitors.userId = "";
                        }
                        if (latestVisitors.text == null) {
                            latestVisitors.text = "";
                        }
                        if (latestVisitors.subText == null) {
                            latestVisitors.subText = "";
                        }
                        if (latestVisitors.highLight != null) {
                            break;
                        }
                        latestVisitors.highLight = "";
                        return latestVisitors;
                    }
                    latestVisitors.highLight = nb5Var.s();
                }
            }
            return latestVisitors;
        }

        public void serialize(LatestVisitors latestVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = latestVisitors.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, latestVisitors.visitCount);
            codedOutputByteBufferNano.I(3, latestVisitors.latestVisitTime);
            String str2 = latestVisitors.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = latestVisitors.subText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = latestVisitors.highLight;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
        }
    };
    public static JsonAdapter<LatestVisitors> JSON_ADAPTER = new ObjectJsonAdapter<LatestVisitors>() { // from class: com.p1.mobile.putong.core.data.LatestVisitors.2
        public Class getDataClass() {
            return LatestVisitors.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LatestVisitors m13818newInstance() {
            return new LatestVisitors();
        }

        public boolean parseField(LatestVisitors latestVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "visitCount":
                    latestVisitors.visitCount = jsonParser.getValueAsInt();
                    return true;
                case "subText":
                    latestVisitors.subText = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    latestVisitors.userId = jsonParser.getValueAsString();
                    return true;
                case "highLight":
                    latestVisitors.highLight = jsonParser.getValueAsString();
                    return true;
                case "text":
                    latestVisitors.text = jsonParser.getValueAsString();
                    return true;
                case "latestVisitTime":
                    latestVisitors.latestVisitTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LatestVisitors latestVisitors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "visitCount":
                case "subText":
                case "userId":
                case "highLight":
                case "text":
                case "latestVisitTime":
                    return true;
                default:
                    return super.parseFieldCheck(latestVisitors, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LatestVisitors latestVisitors, JsonGenerator jsonGenerator) throws IOException {
            String str = latestVisitors.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("visitCount", latestVisitors.visitCount);
            jsonGenerator.writeNumberField("latestVisitTime", latestVisitors.latestVisitTime);
            String str2 = latestVisitors.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = latestVisitors.subText;
            if (str3 != null) {
                jsonGenerator.writeStringField("subText", str3);
            }
            String str4 = latestVisitors.highLight;
            if (str4 != null) {
                jsonGenerator.writeStringField("highLight", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LatestVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LatestVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LatestVisitors new_() {
        LatestVisitors latestVisitors = new LatestVisitors();
        latestVisitors.nullCheck();
        return latestVisitors;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LatestVisitors m13816clone() {
        LatestVisitors latestVisitors = new LatestVisitors();
        latestVisitors.userId = this.userId;
        latestVisitors.visitCount = this.visitCount;
        latestVisitors.latestVisitTime = this.latestVisitTime;
        latestVisitors.text = this.text;
        latestVisitors.subText = this.subText;
        latestVisitors.highLight = this.highLight;
        return latestVisitors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LatestVisitors)) {
            return false;
        }
        LatestVisitors latestVisitors = (LatestVisitors) obj;
        return ValueObject.util_equals(this.userId, latestVisitors.userId) && this.visitCount == latestVisitors.visitCount && this.latestVisitTime == latestVisitors.latestVisitTime && ValueObject.util_equals(this.text, latestVisitors.text) && ValueObject.util_equals(this.subText, latestVisitors.subText) && ValueObject.util_equals(this.highLight, latestVisitors.highLight);
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.visitCount) * 41;
        long j = this.latestVisitTime;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.text;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.highLight;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.subText == null) {
            this.subText = "";
        }
        if (this.highLight == null) {
            this.highLight = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
