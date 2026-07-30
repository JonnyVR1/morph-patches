package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AwakeApp awakeApp) {
            String str = awakeApp.packageName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = awakeApp.action;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = awakeApp.from;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, awakeApp.cycleTime) + CodedOutputByteBufferNano.h(6, awakeApp.count) + CodedOutputByteBufferNano.h(7, awakeApp.interval) + CodedOutputByteBufferNano.h(8, awakeApp.mode) + CodedOutputByteBufferNano.h(9, awakeApp.isOpen);
            String str5 = awakeApp.statisticsKey;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(10, str5);
            }
            ((MessageNano) awakeApp).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AwakeApp m17736parse(nb5 nb5Var) throws IOException {
            AwakeApp awakeApp = new AwakeApp();
            while (true) {
                switch (nb5Var.u()) {
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
                        awakeApp.packageName = nb5Var.s();
                        continue;
                    case 18:
                        awakeApp.action = nb5Var.s();
                        continue;
                    case 26:
                        awakeApp.className = nb5Var.s();
                        continue;
                    case 34:
                        awakeApp.from = nb5Var.s();
                        continue;
                    case 40:
                        awakeApp.cycleTime = nb5Var.j();
                        continue;
                    case 48:
                        awakeApp.count = nb5Var.j();
                        continue;
                    case 56:
                        awakeApp.interval = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        awakeApp.mode = nb5Var.j();
                        continue;
                    case 72:
                        awakeApp.isOpen = nb5Var.j();
                        continue;
                    case 82:
                        awakeApp.statisticsKey = nb5Var.s();
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

        public void serialize(AwakeApp awakeApp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = awakeApp.packageName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = awakeApp.action;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = awakeApp.from;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, awakeApp.cycleTime);
            codedOutputByteBufferNano.G(6, awakeApp.count);
            codedOutputByteBufferNano.G(7, awakeApp.interval);
            codedOutputByteBufferNano.G(8, awakeApp.mode);
            codedOutputByteBufferNano.G(9, awakeApp.isOpen);
            String str5 = awakeApp.statisticsKey;
            if (str5 != null) {
                codedOutputByteBufferNano.R(10, str5);
            }
        }
    };
    public static JsonAdapter<AwakeApp> JSON_ADAPTER = new ObjectJsonAdapter<AwakeApp>() { // from class: com.p1.mobile.putong.data.AwakeApp.2
        public Class getDataClass() {
            return AwakeApp.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AwakeApp mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AwakeApp awakeApp, JsonGenerator jsonGenerator) throws IOException {
            String str = awakeApp.packageName;
            if (str != null) {
                jsonGenerator.writeStringField("packageName", str);
            }
            String str2 = awakeApp.action;
            if (str2 != null) {
                jsonGenerator.writeStringField(Action.TYPE, str2);
            }
            String str3 = awakeApp.className;
            if (str3 != null) {
                jsonGenerator.writeStringField("className", str3);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwakeApp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwakeApp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwakeApp new_() {
        AwakeApp awakeApp = new AwakeApp();
        awakeApp.nullCheck();
        return awakeApp;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AwakeApp m17735clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
