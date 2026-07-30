package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Device;
import com.p000p1.mobile.putong.data.DeviceIdentifier;
import com.p000p1.mobile.putong.data.DevicePush;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Device extends ValueObject implements Cloneable, Serializable {
    public static final String IDFP = "idfp";
    public static final String IMEI = "imei";
    public static final String IMEI1 = "ime1";
    public static final String IMEI2 = "ime2";
    public static final String MEID = "meid";
    public static final String MEID1 = "mei1";
    public static final String MEID2 = "mei2";
    public static final String OAID = "oaid";
    public static final String ONEID = "onei";
    public static final String TYPE = "device";
    public static final String UUID = "uuid";

    @NonNull
    @ProtobufIndex(index = 6)
    public String appBuild;

    @NonNull
    @ProtobufIndex(index = 12)
    public String appUIVersion;

    @NonNull
    @ProtobufIndex(index = 5)
    public String appVersion;

    @NonNull
    @ProtobufIndex(index = 13)
    public String brand;

    @NonNull
    @ProtobufIndex(index = 17)
    public String bundleId;

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public double created_time;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<DevicePush> devicePushNotifications;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f199id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<DeviceIdentifier> identifiers;

    @NonNull
    @ProtobufIndex(index = 9)
    public String language;

    @NonNull
    @ProtobufIndex(index = 10)
    public String locale;

    @NonNull
    @ProtobufIndex(index = 8)
    public String name;

    @NonNull
    @ProtobufIndex(index = 14)
    public String oneid;

    @NonNull
    @ProtobufIndex(index = 7)
    public DeviceOs operatingSystem;

    @NonNull
    @ProtobufIndex(index = 15)
    public Map<String, String> pluginVersion;

    @NonNull
    @ProtobufIndex(index = 2)
    public DevicePush pushNotifications;
    public static ProtobufAdapter<Device> PROTOBUF_ADAPTER = new MessageNanoAdapter<Device>() { // from class: com.p1.mobile.putong.data.Device.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Device device) {
            String str = device.f199id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            DevicePush devicePush = device.pushNotifications;
            if (devicePush != null) {
                iO += CodedOutputByteBufferNano.l(2, devicePush, DevicePush.PROTOBUF_ADAPTER);
            }
            String str2 = device.identifier;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            List<DeviceIdentifier> list = device.identifiers;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = device.appVersion;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            DeviceOs deviceOs = device.operatingSystem;
            if (deviceOs != null) {
                iO += CodedOutputByteBufferNano.l(7, deviceOs, DeviceOs.PROTOBUF_ADAPTER);
            }
            String str5 = device.name;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(9, str6);
            }
            String str7 = device.locale;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(10, str7);
            }
            List<DevicePush> list2 = device.devicePushNotifications;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(11, list2, DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = device.appUIVersion;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(12, str8);
            }
            String str9 = device.brand;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(13, str9);
            }
            String str10 = device.oneid;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(14, str10);
            }
            Map<String, String> map = device.pluginVersion;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            int iD = iO + CodedOutputByteBufferNano.d(16, device.created_time);
            String str11 = device.bundleId;
            if (str11 != null) {
                iD += CodedOutputByteBufferNano.o(17, str11);
            }
            ((MessageNano) device).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Device m17968parse(nb5 nb5Var) throws IOException {
            Device device = new Device();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (device.f199id == null) {
                            device.f199id = "";
                        }
                        if (device.pushNotifications == null) {
                            device.pushNotifications = DevicePush.new_();
                        }
                        if (device.identifier == null) {
                            device.identifier = "";
                        }
                        if (device.identifiers == null) {
                            device.identifiers = new ArrayList();
                        }
                        if (device.appVersion == null) {
                            device.appVersion = "";
                        }
                        if (device.appBuild == null) {
                            device.appBuild = "";
                        }
                        if (device.operatingSystem == null) {
                            device.operatingSystem = DeviceOs.new_();
                        }
                        if (device.name == null) {
                            device.name = "";
                        }
                        if (device.language == null) {
                            device.language = "";
                        }
                        if (device.locale == null) {
                            device.locale = "";
                        }
                        if (device.devicePushNotifications == null) {
                            device.devicePushNotifications = new ArrayList();
                        }
                        if (device.appUIVersion == null) {
                            device.appUIVersion = "";
                        }
                        if (device.brand == null) {
                            device.brand = "";
                        }
                        if (device.oneid == null) {
                            device.oneid = "";
                        }
                        if (device.pluginVersion == null) {
                            device.pluginVersion = Collections.EMPTY_MAP;
                        }
                        if (device.bundleId == null) {
                            device.bundleId = "";
                        }
                        break;
                    case 10:
                        device.f199id = nb5Var.s();
                        continue;
                    case 18:
                        device.pushNotifications = (DevicePush) nb5Var.l(DevicePush.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        device.identifier = nb5Var.s();
                        continue;
                    case 34:
                        device.identifiers = (List) nb5Var.l(DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        device.appVersion = nb5Var.s();
                        continue;
                    case 50:
                        device.appBuild = nb5Var.s();
                        continue;
                    case 58:
                        device.operatingSystem = (DeviceOs) nb5Var.l(DeviceOs.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        device.name = nb5Var.s();
                        continue;
                    case 74:
                        device.language = nb5Var.s();
                        continue;
                    case 82:
                        device.locale = nb5Var.s();
                        continue;
                    case 90:
                        device.devicePushNotifications = (List) nb5Var.l(DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        device.appUIVersion = nb5Var.s();
                        continue;
                    case 106:
                        device.brand = nb5Var.s();
                        continue;
                    case 114:
                        device.oneid = nb5Var.s();
                        continue;
                    case 122:
                        device.pluginVersion = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 129:
                        device.created_time = nb5Var.h();
                        continue;
                    case 138:
                        device.bundleId = nb5Var.s();
                        continue;
                    default:
                        if (device.f199id == null) {
                            device.f199id = "";
                        }
                        if (device.pushNotifications == null) {
                            device.pushNotifications = DevicePush.new_();
                        }
                        if (device.identifier == null) {
                            device.identifier = "";
                        }
                        if (device.identifiers == null) {
                            device.identifiers = new ArrayList();
                        }
                        if (device.appVersion == null) {
                            device.appVersion = "";
                        }
                        if (device.appBuild == null) {
                            device.appBuild = "";
                        }
                        if (device.operatingSystem == null) {
                            device.operatingSystem = DeviceOs.new_();
                        }
                        if (device.name == null) {
                            device.name = "";
                        }
                        if (device.language == null) {
                            device.language = "";
                        }
                        if (device.locale == null) {
                            device.locale = "";
                        }
                        if (device.devicePushNotifications == null) {
                            device.devicePushNotifications = new ArrayList();
                        }
                        if (device.appUIVersion == null) {
                            device.appUIVersion = "";
                        }
                        if (device.brand == null) {
                            device.brand = "";
                        }
                        if (device.oneid == null) {
                            device.oneid = "";
                        }
                        if (device.pluginVersion == null) {
                            device.pluginVersion = Collections.EMPTY_MAP;
                        }
                        if (device.bundleId == null) {
                            device.bundleId = "";
                            return device;
                        }
                        break;
                }
            }
            return device;
        }

        public void serialize(Device device, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = device.f199id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            DevicePush devicePush = device.pushNotifications;
            if (devicePush != null) {
                codedOutputByteBufferNano.K(2, devicePush, DevicePush.PROTOBUF_ADAPTER);
            }
            String str2 = device.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<DeviceIdentifier> list = device.identifiers;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = device.appVersion;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            DeviceOs deviceOs = device.operatingSystem;
            if (deviceOs != null) {
                codedOutputByteBufferNano.K(7, deviceOs, DeviceOs.PROTOBUF_ADAPTER);
            }
            String str5 = device.name;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            String str7 = device.locale;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
            List<DevicePush> list2 = device.devicePushNotifications;
            if (list2 != null) {
                codedOutputByteBufferNano.K(11, list2, DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = device.appUIVersion;
            if (str8 != null) {
                codedOutputByteBufferNano.R(12, str8);
            }
            String str9 = device.brand;
            if (str9 != null) {
                codedOutputByteBufferNano.R(13, str9);
            }
            String str10 = device.oneid;
            if (str10 != null) {
                codedOutputByteBufferNano.R(14, str10);
            }
            Map<String, String> map = device.pluginVersion;
            if (map != null) {
                codedOutputByteBufferNano.K(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            codedOutputByteBufferNano.C(16, device.created_time);
            String str11 = device.bundleId;
            if (str11 != null) {
                codedOutputByteBufferNano.R(17, str11);
            }
        }
    };
    public static JsonAdapter<Device> JSON_ADAPTER = new ObjectJsonAdapter<Device>() { // from class: com.p1.mobile.putong.data.Device.2
        public Class getDataClass() {
            return Device.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Device mo17830newInstance() {
            return new Device();
        }

        public boolean parseField(Device device, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    device.identifier = jsonParser.getValueAsString();
                    return true;
                case "language":
                    device.language = jsonParser.getValueAsString();
                    return true;
                case "bundleId":
                    device.bundleId = jsonParser.getValueAsString();
                    return true;
                case "operatingSystem":
                    device.operatingSystem = (DeviceOs) DeviceOs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "locale":
                    device.locale = jsonParser.getValueAsString();
                    return true;
                case "pluginVersion":
                    device.pluginVersion = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "devicePushNotifications":
                    device.devicePushNotifications = JsonAdapter.parseArray(jsonParser, DevicePush.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pushNotifications":
                    device.pushNotifications = (DevicePush) DevicePush.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    device.f199id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    device.name = jsonParser.getValueAsString();
                    return true;
                case "brand":
                    device.brand = jsonParser.getValueAsString();
                    return true;
                case "oneid":
                    device.oneid = jsonParser.getValueAsString();
                    return true;
                case "appUIVersion":
                    device.appUIVersion = jsonParser.getValueAsString();
                    return true;
                case "appBuild":
                    device.appBuild = jsonParser.getValueAsString();
                    return true;
                case "identifiers":
                    device.identifiers = JsonAdapter.parseArray(jsonParser, DeviceIdentifier.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "appVersion":
                    device.appVersion = jsonParser.getValueAsString();
                    return true;
                case "created_time":
                    device.created_time = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Device device, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "language":
                case "bundleId":
                case "operatingSystem":
                case "locale":
                case "pluginVersion":
                case "devicePushNotifications":
                case "pushNotifications":
                    return true;
                case "id":
                    return false;
                case "name":
                case "brand":
                case "oneid":
                case "appUIVersion":
                case "appBuild":
                case "identifiers":
                case "appVersion":
                case "created_time":
                    return true;
                default:
                    return super.parseFieldCheck(device, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Device device, JsonGenerator jsonGenerator) throws IOException {
            String str = device.f199id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (device.pushNotifications != null) {
                jsonGenerator.writeFieldName("pushNotifications");
                DevicePush.JSON_ADAPTER.serialize(device.pushNotifications, jsonGenerator, true);
            }
            String str2 = device.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
            if (device.identifiers != null) {
                jsonGenerator.writeFieldName("identifiers");
                JsonAdapter.serializeArray(device.identifiers, jsonGenerator, DeviceIdentifier.JSON_ADAPTER);
            }
            String str3 = device.appVersion;
            if (str3 != null) {
                jsonGenerator.writeStringField("appVersion", str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                jsonGenerator.writeStringField("appBuild", str4);
            }
            if (device.operatingSystem != null) {
                jsonGenerator.writeFieldName("operatingSystem");
                DeviceOs.JSON_ADAPTER.serialize(device.operatingSystem, jsonGenerator, true);
            }
            String str5 = device.name;
            if (str5 != null) {
                jsonGenerator.writeStringField("name", str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                jsonGenerator.writeStringField("language", str6);
            }
            String str7 = device.locale;
            if (str7 != null) {
                jsonGenerator.writeStringField("locale", str7);
            }
            if (device.devicePushNotifications != null) {
                jsonGenerator.writeFieldName("devicePushNotifications");
                JsonAdapter.serializeArray(device.devicePushNotifications, jsonGenerator, DevicePush.JSON_ADAPTER);
            }
            String str8 = device.appUIVersion;
            if (str8 != null) {
                jsonGenerator.writeStringField("appUIVersion", str8);
            }
            String str9 = device.brand;
            if (str9 != null) {
                jsonGenerator.writeStringField("brand", str9);
            }
            String str10 = device.oneid;
            if (str10 != null) {
                jsonGenerator.writeStringField("oneid", str10);
            }
            if (device.pluginVersion != null) {
                jsonGenerator.writeFieldName("pluginVersion");
                JsonAdapter.serializeMap(device.pluginVersion, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("created_time");
            Converter.API_TIME.serialize(Double.valueOf(device.created_time), jsonGenerator, true);
            String str11 = device.bundleId;
            if (str11 != null) {
                jsonGenerator.writeStringField("bundleId", str11);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Device) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Device) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m662a(String str) {
        return str;
    }

    public static Device new_() {
        Device device = new Device();
        device.nullCheck();
        return device;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Device m17967clone() {
        Device device = new Device();
        device.f199id = this.f199id;
        DevicePush devicePush = this.pushNotifications;
        if (devicePush != null) {
            device.pushNotifications = devicePush.m17976clone();
        }
        device.identifier = this.identifier;
        List<DeviceIdentifier> list = this.identifiers;
        if (list != null) {
            device.identifiers = ValueObject.util_map(list, new w9j() { // from class: l.qxd
                public final Object call(Object obj) {
                    return ((DeviceIdentifier) obj).m17970clone();
                }
            });
        }
        device.appVersion = this.appVersion;
        device.appBuild = this.appBuild;
        DeviceOs deviceOs = this.operatingSystem;
        if (deviceOs != null) {
            device.operatingSystem = deviceOs.m17973clone();
        }
        device.name = this.name;
        device.language = this.language;
        device.locale = this.locale;
        List<DevicePush> list2 = this.devicePushNotifications;
        if (list2 != null) {
            device.devicePushNotifications = ValueObject.util_map(list2, new w9j() { // from class: l.rxd
                public final Object call(Object obj) {
                    return ((DevicePush) obj).m17976clone();
                }
            });
        }
        device.appUIVersion = this.appUIVersion;
        device.brand = this.brand;
        device.oneid = this.oneid;
        Map<String, String> map = this.pluginVersion;
        if (map != null) {
            device.pluginVersion = ValueObject.util_map(map, new w9j() { // from class: l.sxd
                public final Object call(Object obj) {
                    return Device.m662a((String) obj);
                }
            });
        }
        device.created_time = this.created_time;
        device.bundleId = this.bundleId;
        return device;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return ValueObject.util_equals(this.f199id, device.f199id) && ValueObject.util_equals(this.pushNotifications, device.pushNotifications) && ValueObject.util_equals(this.identifier, device.identifier) && ValueObject.util_equals(this.identifiers, device.identifiers) && ValueObject.util_equals(this.appVersion, device.appVersion) && ValueObject.util_equals(this.appBuild, device.appBuild) && ValueObject.util_equals(this.operatingSystem, device.operatingSystem) && ValueObject.util_equals(this.name, device.name) && ValueObject.util_equals(this.language, device.language) && ValueObject.util_equals(this.locale, device.locale) && ValueObject.util_equals(this.devicePushNotifications, device.devicePushNotifications) && ValueObject.util_equals(this.appUIVersion, device.appUIVersion) && ValueObject.util_equals(this.brand, device.brand) && ValueObject.util_equals(this.oneid, device.oneid) && ValueObject.util_equals(this.pluginVersion, device.pluginVersion) && this.created_time == device.created_time && ValueObject.util_equals(this.bundleId, device.bundleId);
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
        String str = this.f199id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        DevicePush devicePush = this.pushNotifications;
        int iHashCode2 = (iHashCode + (devicePush != null ? devicePush.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<DeviceIdentifier> list = this.identifiers;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.appVersion;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.appBuild;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        DeviceOs deviceOs = this.operatingSystem;
        int iHashCode7 = (iHashCode6 + (deviceOs != null ? deviceOs.hashCode() : 0)) * 41;
        String str5 = this.name;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.language;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.locale;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<DevicePush> list2 = this.devicePushNotifications;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str8 = this.appUIVersion;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.brand;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.oneid;
        int iHashCode14 = (iHashCode13 + (str10 != null ? str10.hashCode() : 0)) * 41;
        Map<String, String> map = this.pluginVersion;
        int iHashCode15 = map != null ? map.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.created_time);
        int i3 = (((iHashCode14 + iHashCode15) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str11 = this.bundleId;
        int iHashCode16 = i3 + (str11 != null ? str11.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

    public void nullCheck() {
        if (this.f199id == null) {
            this.f199id = "";
        }
        if (this.pushNotifications == null) {
            this.pushNotifications = DevicePush.new_();
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
        if (this.identifiers == null) {
            this.identifiers = new ArrayList();
        }
        if (this.appVersion == null) {
            this.appVersion = "";
        }
        if (this.appBuild == null) {
            this.appBuild = "";
        }
        if (this.operatingSystem == null) {
            this.operatingSystem = DeviceOs.new_();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.language == null) {
            this.language = "";
        }
        if (this.locale == null) {
            this.locale = "";
        }
        if (this.devicePushNotifications == null) {
            this.devicePushNotifications = new ArrayList();
        }
        if (this.appUIVersion == null) {
            this.appUIVersion = "";
        }
        if (this.brand == null) {
            this.brand = "";
        }
        if (this.oneid == null) {
            this.oneid = "";
        }
        if (this.pluginVersion == null) {
            this.pluginVersion = Collections.EMPTY_MAP;
        }
        if (this.bundleId == null) {
            this.bundleId = "";
        }
    }

    public Device subtract(Device device) {
        Device device2 = new Device();
        if (!ValueObject.util_equals(this.f199id, device.f199id)) {
            device2.f199id = this.f199id;
        }
        if (!ValueObject.util_equals(this.pushNotifications, device.pushNotifications)) {
            device2.pushNotifications = this.pushNotifications;
        }
        if (!ValueObject.util_equals(this.identifier, device.identifier)) {
            device2.identifier = this.identifier;
        }
        if (!ValueObject.util_equals(this.identifiers, device.identifiers)) {
            device2.identifiers = this.identifiers;
        }
        if (!ValueObject.util_equals(this.appVersion, device.appVersion)) {
            device2.appVersion = this.appVersion;
        }
        if (!ValueObject.util_equals(this.appBuild, device.appBuild)) {
            device2.appBuild = this.appBuild;
        }
        if (!ValueObject.util_equals(this.operatingSystem, device.operatingSystem)) {
            device2.operatingSystem = this.operatingSystem;
        }
        if (!ValueObject.util_equals(this.name, device.name)) {
            device2.name = this.name;
        }
        if (!ValueObject.util_equals(this.language, device.language)) {
            device2.language = this.language;
        }
        if (!ValueObject.util_equals(this.locale, device.locale)) {
            device2.locale = this.locale;
        }
        if (!ValueObject.util_equals(this.devicePushNotifications, device.devicePushNotifications)) {
            device2.devicePushNotifications = this.devicePushNotifications;
        }
        if (!ValueObject.util_equals(this.appUIVersion, device.appUIVersion)) {
            device2.appUIVersion = this.appUIVersion;
        }
        if (!ValueObject.util_equals(this.brand, device.brand)) {
            device2.brand = this.brand;
        }
        if (!ValueObject.util_equals(this.oneid, device.oneid)) {
            device2.oneid = this.oneid;
        }
        if (!ValueObject.util_equals(this.pluginVersion, device.pluginVersion)) {
            device2.pluginVersion = this.pluginVersion;
        }
        if (!ValueObject.util_equals(this.bundleId, device.bundleId)) {
            device2.bundleId = this.bundleId;
        }
        if (device2.equals(new Device())) {
            return null;
        }
        return device2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
