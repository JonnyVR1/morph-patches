package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.DeviceIdentifier;
import com.p051p1.mobile.putong.data.DevicePush;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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

    @ProtobufIndex(index = 16)
    public double created_time;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<DevicePush> devicePushNotifications;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39586id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Device device) {
            String str = device.f39586id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            DevicePush devicePush = device.pushNotifications;
            if (devicePush != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, devicePush, DevicePush.PROTOBUF_ADAPTER);
            }
            String str2 = device.identifier;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<DeviceIdentifier> list = device.identifiers;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = device.appVersion;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            DeviceOs deviceOs = device.operatingSystem;
            if (deviceOs != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, deviceOs, DeviceOs.PROTOBUF_ADAPTER);
            }
            String str5 = device.name;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            String str7 = device.locale;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str7);
            }
            List<DevicePush> list2 = device.devicePushNotifications;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(11, list2, DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = device.appUIVersion;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(12, str8);
            }
            String str9 = device.brand;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(13, str9);
            }
            String str10 = device.oneid;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(14, str10);
            }
            Map<String, String> map = device.pluginVersion;
            if (map != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(16, device.created_time);
            String str11 = device.bundleId;
            if (str11 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(17, str11);
            }
            device.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Device parse(nc5 nc5Var) throws IOException {
            Device device = new Device();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (device.f39586id == null) {
                            device.f39586id = "";
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
                        device.f39586id = nc5Var.m162495s();
                        continue;
                    case 18:
                        device.pushNotifications = (DevicePush) nc5Var.m162488l(DevicePush.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        device.identifier = nc5Var.m162495s();
                        continue;
                    case 34:
                        device.identifiers = (List) nc5Var.m162488l(DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        device.appVersion = nc5Var.m162495s();
                        continue;
                    case 50:
                        device.appBuild = nc5Var.m162495s();
                        continue;
                    case 58:
                        device.operatingSystem = (DeviceOs) nc5Var.m162488l(DeviceOs.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        device.name = nc5Var.m162495s();
                        continue;
                    case 74:
                        device.language = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        device.locale = nc5Var.m162495s();
                        continue;
                    case 90:
                        device.devicePushNotifications = (List) nc5Var.m162488l(DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        device.appUIVersion = nc5Var.m162495s();
                        continue;
                    case 106:
                        device.brand = nc5Var.m162495s();
                        continue;
                    case 114:
                        device.oneid = nc5Var.m162495s();
                        continue;
                    case 122:
                        device.pluginVersion = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                        continue;
                    case MMConstants.ERR_WATERMARK_READ /* 129 */:
                        device.created_time = nc5Var.m162484h();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        device.bundleId = nc5Var.m162495s();
                        continue;
                    default:
                        if (device.f39586id == null) {
                            device.f39586id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Device device, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = device.f39586id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            DevicePush devicePush = device.pushNotifications;
            if (devicePush != null) {
                codedOutputByteBufferNano.m17309K(2, devicePush, DevicePush.PROTOBUF_ADAPTER);
            }
            String str2 = device.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<DeviceIdentifier> list = device.identifiers;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, DeviceIdentifier.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = device.appVersion;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            DeviceOs deviceOs = device.operatingSystem;
            if (deviceOs != null) {
                codedOutputByteBufferNano.m17309K(7, deviceOs, DeviceOs.PROTOBUF_ADAPTER);
            }
            String str5 = device.name;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            String str7 = device.locale;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(10, str7);
            }
            List<DevicePush> list2 = device.devicePushNotifications;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(11, list2, DevicePush.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = device.appUIVersion;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(12, str8);
            }
            String str9 = device.brand;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(13, str9);
            }
            String str10 = device.oneid;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(14, str10);
            }
            Map<String, String> map = device.pluginVersion;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(15, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(16, device.created_time);
            String str11 = device.bundleId;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(17, str11);
            }
        }
    };
    public static JsonAdapter<Device> JSON_ADAPTER = new ObjectJsonAdapter<Device>() { // from class: com.p1.mobile.putong.data.Device.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Device.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Device newInstance() {
            return new Device();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Device device, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1618432855:
                    if (str.equals("identifier")) {
                        b = 0;
                    }
                    break;
                case -1613589672:
                    if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                        b = 1;
                    }
                    break;
                case -1294655171:
                    if (str.equals("bundleId")) {
                        b = 2;
                    }
                    break;
                case -1176666416:
                    if (str.equals("operatingSystem")) {
                        b = 3;
                    }
                    break;
                case -1097462182:
                    if (str.equals("locale")) {
                        b = 4;
                    }
                    break;
                case -648587739:
                    if (str.equals("pluginVersion")) {
                        b = 5;
                    }
                    break;
                case -598292424:
                    if (str.equals("devicePushNotifications")) {
                        b = 6;
                    }
                    break;
                case -48500754:
                    if (str.equals("pushNotifications")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 93997959:
                    if (str.equals("brand")) {
                        b = 10;
                    }
                    break;
                case 105888257:
                    if (str.equals("oneid")) {
                        b = 11;
                    }
                    break;
                case 1083946659:
                    if (str.equals("appUIVersion")) {
                        b = 12;
                    }
                    break;
                case 1141082317:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_BUILD)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1368189162:
                    if (str.equals("identifiers")) {
                        b = 14;
                    }
                    break;
                case 1484112759:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_VERSION)) {
                        b = 15;
                    }
                    break;
                case 2003148228:
                    if (str.equals("created_time")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    device.identifier = jsonParser.getValueAsString();
                    return true;
                case 1:
                    device.language = jsonParser.getValueAsString();
                    return true;
                case 2:
                    device.bundleId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    device.operatingSystem = DeviceOs.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    device.locale = jsonParser.getValueAsString();
                    return true;
                case 5:
                    device.pluginVersion = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case 6:
                    device.devicePushNotifications = JsonAdapter.parseArray(jsonParser, DevicePush.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    device.pushNotifications = DevicePush.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    device.f39586id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    device.name = jsonParser.getValueAsString();
                    return true;
                case 10:
                    device.brand = jsonParser.getValueAsString();
                    return true;
                case 11:
                    device.oneid = jsonParser.getValueAsString();
                    return true;
                case 12:
                    device.appUIVersion = jsonParser.getValueAsString();
                    return true;
                case 13:
                    device.appBuild = jsonParser.getValueAsString();
                    return true;
                case 14:
                    device.identifiers = JsonAdapter.parseArray(jsonParser, DeviceIdentifier.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    device.appVersion = jsonParser.getValueAsString();
                    return true;
                case 16:
                    device.created_time = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Device device, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1618432855:
                    if (str.equals("identifier")) {
                        b = 0;
                    }
                    break;
                case -1613589672:
                    if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                        b = 1;
                    }
                    break;
                case -1294655171:
                    if (str.equals("bundleId")) {
                        b = 2;
                    }
                    break;
                case -1176666416:
                    if (str.equals("operatingSystem")) {
                        b = 3;
                    }
                    break;
                case -1097462182:
                    if (str.equals("locale")) {
                        b = 4;
                    }
                    break;
                case -648587739:
                    if (str.equals("pluginVersion")) {
                        b = 5;
                    }
                    break;
                case -598292424:
                    if (str.equals("devicePushNotifications")) {
                        b = 6;
                    }
                    break;
                case -48500754:
                    if (str.equals("pushNotifications")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 93997959:
                    if (str.equals("brand")) {
                        b = 10;
                    }
                    break;
                case 105888257:
                    if (str.equals("oneid")) {
                        b = 11;
                    }
                    break;
                case 1083946659:
                    if (str.equals("appUIVersion")) {
                        b = 12;
                    }
                    break;
                case 1141082317:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_BUILD)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1368189162:
                    if (str.equals("identifiers")) {
                        b = 14;
                    }
                    break;
                case 1484112759:
                    if (str.equals(RemoteConfigConstants.RequestFieldKey.APP_VERSION)) {
                        b = 15;
                    }
                    break;
                case 2003148228:
                    if (str.equals("created_time")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(device, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Device device, JsonGenerator jsonGenerator) throws IOException {
            String str = device.f39586id;
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
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str3);
            }
            String str4 = device.appBuild;
            if (str4 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_BUILD, str4);
            }
            if (device.operatingSystem != null) {
                jsonGenerator.writeFieldName("operatingSystem");
                DeviceOs.JSON_ADAPTER.serialize(device.operatingSystem, jsonGenerator, true);
            }
            String str5 = device.name;
            if (str5 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str5);
            }
            String str6 = device.language;
            if (str6 != null) {
                jsonGenerator.writeStringField(IjkMediaMeta.IJKM_KEY_LANGUAGE, str6);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Device) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Device) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60928a(String str) {
        return str;
    }

    public static Device new_() {
        Device device = new Device();
        device.nullCheck();
        return device;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Device mo225055clone() {
        Device device = new Device();
        device.f39586id = this.f39586id;
        DevicePush devicePush = this.pushNotifications;
        if (devicePush != null) {
            device.pushNotifications = devicePush.mo225055clone();
        }
        device.identifier = this.identifier;
        List<DeviceIdentifier> list = this.identifiers;
        if (list != null) {
            device.identifiers = ValueObject.util_map(list, new qcj() { // from class: l.ezd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DeviceIdentifier) obj).mo225055clone();
                }
            });
        }
        device.appVersion = this.appVersion;
        device.appBuild = this.appBuild;
        DeviceOs deviceOs = this.operatingSystem;
        if (deviceOs != null) {
            device.operatingSystem = deviceOs.mo225055clone();
        }
        device.name = this.name;
        device.language = this.language;
        device.locale = this.locale;
        List<DevicePush> list2 = this.devicePushNotifications;
        if (list2 != null) {
            device.devicePushNotifications = ValueObject.util_map(list2, new qcj() { // from class: l.fzd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DevicePush) obj).mo225055clone();
                }
            });
        }
        device.appUIVersion = this.appUIVersion;
        device.brand = this.brand;
        device.oneid = this.oneid;
        Map<String, String> map = this.pluginVersion;
        if (map != null) {
            device.pluginVersion = ValueObject.util_map(map, new qcj() { // from class: l.gzd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Device.m60928a((String) obj);
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
        return ValueObject.util_equals(this.f39586id, device.f39586id) && ValueObject.util_equals(this.pushNotifications, device.pushNotifications) && ValueObject.util_equals(this.identifier, device.identifier) && ValueObject.util_equals(this.identifiers, device.identifiers) && ValueObject.util_equals(this.appVersion, device.appVersion) && ValueObject.util_equals(this.appBuild, device.appBuild) && ValueObject.util_equals(this.operatingSystem, device.operatingSystem) && ValueObject.util_equals(this.name, device.name) && ValueObject.util_equals(this.language, device.language) && ValueObject.util_equals(this.locale, device.locale) && ValueObject.util_equals(this.devicePushNotifications, device.devicePushNotifications) && ValueObject.util_equals(this.appUIVersion, device.appUIVersion) && ValueObject.util_equals(this.brand, device.brand) && ValueObject.util_equals(this.oneid, device.oneid) && ValueObject.util_equals(this.pluginVersion, device.pluginVersion) && this.created_time == device.created_time && ValueObject.util_equals(this.bundleId, device.bundleId);
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
        String str = this.f39586id;
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
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39586id == null) {
            this.f39586id = "";
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
        if (!ValueObject.util_equals(this.f39586id, device.f39586id)) {
            device2.f39586id = this.f39586id;
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
