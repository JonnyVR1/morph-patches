package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VisitorsRecommendationType;
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

/* JADX INFO: loaded from: classes10.dex */
public class LatestVisitors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "latestvisitors";

    @NonNull
    @ProtobufIndex(index = 6)
    public String highLight;

    @ProtobufIndex(index = 3)
    public long latestVisitTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 2)
    public int visitCount;
    public static ProtobufAdapter<LatestVisitors> PROTOBUF_ADAPTER = new MessageNanoAdapter<LatestVisitors>() { // from class: com.p1.mobile.putong.core.data.LatestVisitors.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LatestVisitors latestVisitors) {
            String str = latestVisitors.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, latestVisitors.visitCount) + CodedOutputByteBufferNano.m17228j(3, latestVisitors.latestVisitTime);
            String str2 = latestVisitors.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = latestVisitors.subText;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            String str4 = latestVisitors.highLight;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            latestVisitors.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LatestVisitors parse(nb5 nb5Var) throws IOException {
            LatestVisitors latestVisitors = new LatestVisitors();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    latestVisitors.userId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    latestVisitors.visitCount = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    latestVisitors.latestVisitTime = nb5Var.m158742k();
                } else if (iM158752u == 34) {
                    latestVisitors.text = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    latestVisitors.subText = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
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
                    latestVisitors.highLight = nb5Var.m158750s();
                }
            }
            return latestVisitors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LatestVisitors latestVisitors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = latestVisitors.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, latestVisitors.visitCount);
            codedOutputByteBufferNano.m17252I(3, latestVisitors.latestVisitTime);
            String str2 = latestVisitors.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = latestVisitors.subText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            String str4 = latestVisitors.highLight;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
        }
    };
    public static JsonAdapter<LatestVisitors> JSON_ADAPTER = new ObjectJsonAdapter<LatestVisitors>() { // from class: com.p1.mobile.putong.core.data.LatestVisitors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LatestVisitors.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LatestVisitors newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LatestVisitors latestVisitors, JsonGenerator jsonGenerator) throws IOException {
            String str = latestVisitors.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField(VisitorsRecommendationType.visitCount, latestVisitors.visitCount);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LatestVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LatestVisitors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LatestVisitors new_() {
        LatestVisitors latestVisitors = new LatestVisitors();
        latestVisitors.nullCheck();
        return latestVisitors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LatestVisitors mo223809clone() {
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
