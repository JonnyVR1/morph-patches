package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.vivo.push.PushClientConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class AwakeApp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awakeapp";

    @NonNull
    @ProtobufIndex(index = 2)
    public String action;

    @NonNull
    @ProtobufIndex(index = 3)
    public String className;

    @ProtobufIndex(index = 6)
    public int count;

    @ProtobufIndex(index = 5)
    public int cycleTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String from;

    @ProtobufIndex(index = 7)
    public int interval;

    @ProtobufIndex(index = 9)
    public int isOpen;

    @ProtobufIndex(index = 8)
    public int mode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String packageName;

    @NonNull
    @ProtobufIndex(index = 10)
    public String statisticsKey;
    public static ProtobufAdapter<AwakeApp> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwakeApp>() { // from class: com.p1.mobile.putong.data.AwakeApp.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AwakeApp awakeApp) {
            String str = awakeApp.packageName;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = awakeApp.action;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = awakeApp.from;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, awakeApp.cycleTime) + CodedOutputByteBufferNano.m17226h(6, awakeApp.count) + CodedOutputByteBufferNano.m17226h(7, awakeApp.interval) + CodedOutputByteBufferNano.m17226h(8, awakeApp.mode) + CodedOutputByteBufferNano.m17226h(9, awakeApp.isOpen);
            String str5 = awakeApp.statisticsKey;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(10, str5);
            }
            awakeApp.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AwakeApp parse(nb5 nb5Var) throws IOException {
            AwakeApp awakeApp = new AwakeApp();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (awakeApp.packageName == null) {
                            awakeApp.packageName = "";
                        }
                        if (awakeApp.action == null) {
                            awakeApp.action = "";
                        }
                        if (awakeApp.className == null) {
                            awakeApp.className = "";
                        }
                        if (awakeApp.from == null) {
                            awakeApp.from = "";
                        }
                        if (awakeApp.statisticsKey == null) {
                            awakeApp.statisticsKey = "";
                        }
                        break;
                    case 10:
                        awakeApp.packageName = nb5Var.m158750s();
                        continue;
                    case 18:
                        awakeApp.action = nb5Var.m158750s();
                        continue;
                    case 26:
                        awakeApp.className = nb5Var.m158750s();
                        continue;
                    case 34:
                        awakeApp.from = nb5Var.m158750s();
                        continue;
                    case 40:
                        awakeApp.cycleTime = nb5Var.m158741j();
                        continue;
                    case 48:
                        awakeApp.count = nb5Var.m158741j();
                        continue;
                    case 56:
                        awakeApp.interval = nb5Var.m158741j();
                        continue;
                    case 64:
                        awakeApp.mode = nb5Var.m158741j();
                        continue;
                    case 72:
                        awakeApp.isOpen = nb5Var.m158741j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        awakeApp.statisticsKey = nb5Var.m158750s();
                        continue;
                    default:
                        if (awakeApp.packageName == null) {
                            awakeApp.packageName = "";
                        }
                        if (awakeApp.action == null) {
                            awakeApp.action = "";
                        }
                        if (awakeApp.className == null) {
                            awakeApp.className = "";
                        }
                        if (awakeApp.from == null) {
                            awakeApp.from = "";
                        }
                        if (awakeApp.statisticsKey == null) {
                            awakeApp.statisticsKey = "";
                            return awakeApp;
                        }
                        break;
                }
            }
            return awakeApp;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AwakeApp awakeApp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = awakeApp.packageName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = awakeApp.action;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = awakeApp.from;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17250G(5, awakeApp.cycleTime);
            codedOutputByteBufferNano.m17250G(6, awakeApp.count);
            codedOutputByteBufferNano.m17250G(7, awakeApp.interval);
            codedOutputByteBufferNano.m17250G(8, awakeApp.mode);
            codedOutputByteBufferNano.m17250G(9, awakeApp.isOpen);
            String str5 = awakeApp.statisticsKey;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(10, str5);
            }
        }
    };
    public static JsonAdapter<AwakeApp> JSON_ADAPTER = new ObjectJsonAdapter<AwakeApp>() { // from class: com.p1.mobile.putong.data.AwakeApp.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AwakeApp.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AwakeApp newInstance() {
            return new AwakeApp();
        }

        public boolean parseField(AwakeApp awakeApp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cycleTime":
                    awakeApp.cycleTime = jsonParser.getValueAsInt();
                    return true;
                case "action":
                    awakeApp.action = jsonParser.getValueAsString();
                    return true;
                case "isOpen":
                    awakeApp.isOpen = jsonParser.getValueAsInt();
                    return true;
                case "statisticsKey":
                    awakeApp.statisticsKey = jsonParser.getValueAsString();
                    return true;
                case "className":
                    awakeApp.className = jsonParser.getValueAsString();
                    return true;
                case "from":
                    awakeApp.from = jsonParser.getValueAsString();
                    return true;
                case "mode":
                    awakeApp.mode = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    awakeApp.count = jsonParser.getValueAsInt();
                    return true;
                case "interval":
                    awakeApp.interval = jsonParser.getValueAsInt();
                    return true;
                case "packageName":
                    awakeApp.packageName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AwakeApp awakeApp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cycleTime":
                case "action":
                case "isOpen":
                case "statisticsKey":
                case "className":
                case "from":
                case "mode":
                case "count":
                case "interval":
                case "packageName":
                    return true;
                default:
                    return super.parseFieldCheck(awakeApp, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AwakeApp awakeApp, JsonGenerator jsonGenerator) throws IOException {
            String str = awakeApp.packageName;
            if (str != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, str);
            }
            String str2 = awakeApp.action;
            if (str2 != null) {
                jsonGenerator.writeStringField("action", str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                jsonGenerator.writeStringField(PushClientConstants.TAG_CLASS_NAME, str3);
            }
            String str4 = awakeApp.from;
            if (str4 != null) {
                jsonGenerator.writeStringField("from", str4);
            }
            jsonGenerator.writeNumberField("cycleTime", awakeApp.cycleTime);
            jsonGenerator.writeNumberField("count", awakeApp.count);
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, awakeApp.interval);
            jsonGenerator.writeNumberField("mode", awakeApp.mode);
            jsonGenerator.writeNumberField("isOpen", awakeApp.isOpen);
            String str5 = awakeApp.statisticsKey;
            if (str5 != null) {
                jsonGenerator.writeStringField("statisticsKey", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwakeApp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwakeApp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwakeApp new_() {
        AwakeApp awakeApp = new AwakeApp();
        awakeApp.nullCheck();
        return awakeApp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AwakeApp mo223809clone() {
        AwakeApp awakeApp = new AwakeApp();
        awakeApp.packageName = this.packageName;
        awakeApp.action = this.action;
        awakeApp.className = this.className;
        awakeApp.from = this.from;
        awakeApp.cycleTime = this.cycleTime;
        awakeApp.count = this.count;
        awakeApp.interval = this.interval;
        awakeApp.mode = this.mode;
        awakeApp.isOpen = this.isOpen;
        awakeApp.statisticsKey = this.statisticsKey;
        return awakeApp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwakeApp)) {
            return false;
        }
        AwakeApp awakeApp = (AwakeApp) obj;
        return ValueObject.util_equals(this.packageName, awakeApp.packageName) && ValueObject.util_equals(this.action, awakeApp.action) && ValueObject.util_equals(this.className, awakeApp.className) && ValueObject.util_equals(this.from, awakeApp.from) && this.cycleTime == awakeApp.cycleTime && this.count == awakeApp.count && this.interval == awakeApp.interval && this.mode == awakeApp.mode && this.isOpen == awakeApp.isOpen && ValueObject.util_equals(this.statisticsKey, awakeApp.statisticsKey);
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
        String str = this.packageName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.className;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.from;
        int iHashCode4 = (((((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.cycleTime) * 41) + this.count) * 41) + this.interval) * 41) + this.mode) * 41) + this.isOpen) * 41;
        String str5 = this.statisticsKey;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.packageName == null) {
            this.packageName = "";
        }
        if (this.action == null) {
            this.action = "";
        }
        if (this.className == null) {
            this.className = "";
        }
        if (this.from == null) {
            this.from = "";
        }
        if (this.statisticsKey == null) {
            this.statisticsKey = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
