package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class HomeHealConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "homehealconfig";

    @ProtobufIndex(index = 8)
    public boolean enable;

    /* JADX INFO: renamed from: ip */
    @ProtobufIndex(index = 10)
    public boolean f21155ip;

    @ProtobufIndex(index = 5)
    public int left_slide_guidance;

    @ProtobufIndex(index = 3)
    public boolean live_level;

    @NonNull
    @ProtobufIndex(index = 1)
    public String live_tag_new;

    @NonNull
    @ProtobufIndex(index = 2)
    public String live_tag_normal;

    @ProtobufIndex(index = 9)
    public boolean online_device;

    @ProtobufIndex(index = 7)
    public int right_interval;

    @ProtobufIndex(index = 6)
    public int right_slide_guidance;

    @NonNull
    @ProtobufIndex(index = 4)
    public String voice_tag;
    public static ProtobufAdapter<HomeHealConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeHealConfig>() { // from class: com.p1.mobile.putong.core.data.HomeHealConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeHealConfig homeHealConfig) {
            String str = homeHealConfig.live_tag_new;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = homeHealConfig.live_tag_normal;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, homeHealConfig.live_level);
            String str3 = homeHealConfig.voice_tag;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(5, homeHealConfig.left_slide_guidance) + CodedOutputByteBufferNano.m17281h(6, homeHealConfig.right_slide_guidance) + CodedOutputByteBufferNano.m17281h(7, homeHealConfig.right_interval) + CodedOutputByteBufferNano.m17275b(8, homeHealConfig.enable) + CodedOutputByteBufferNano.m17275b(9, homeHealConfig.online_device) + CodedOutputByteBufferNano.m17275b(10, homeHealConfig.f21155ip);
            homeHealConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeHealConfig parse(nc5 nc5Var) throws IOException {
            HomeHealConfig homeHealConfig = new HomeHealConfig();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (homeHealConfig.live_tag_new == null) {
                            homeHealConfig.live_tag_new = "";
                        }
                        if (homeHealConfig.live_tag_normal == null) {
                            homeHealConfig.live_tag_normal = "";
                        }
                        if (homeHealConfig.voice_tag == null) {
                            homeHealConfig.voice_tag = "";
                        }
                        break;
                    case 10:
                        homeHealConfig.live_tag_new = nc5Var.m162495s();
                        continue;
                    case 18:
                        homeHealConfig.live_tag_normal = nc5Var.m162495s();
                        continue;
                    case 24:
                        homeHealConfig.live_level = nc5Var.m162483g();
                        continue;
                    case 34:
                        homeHealConfig.voice_tag = nc5Var.m162495s();
                        continue;
                    case 40:
                        homeHealConfig.left_slide_guidance = nc5Var.m162486j();
                        continue;
                    case 48:
                        homeHealConfig.right_slide_guidance = nc5Var.m162486j();
                        continue;
                    case 56:
                        homeHealConfig.right_interval = nc5Var.m162486j();
                        continue;
                    case 64:
                        homeHealConfig.enable = nc5Var.m162483g();
                        continue;
                    case 72:
                        homeHealConfig.online_device = nc5Var.m162483g();
                        continue;
                    case 80:
                        homeHealConfig.f21155ip = nc5Var.m162483g();
                        continue;
                    default:
                        if (homeHealConfig.live_tag_new == null) {
                            homeHealConfig.live_tag_new = "";
                        }
                        if (homeHealConfig.live_tag_normal == null) {
                            homeHealConfig.live_tag_normal = "";
                        }
                        if (homeHealConfig.voice_tag == null) {
                            homeHealConfig.voice_tag = "";
                            return homeHealConfig;
                        }
                        break;
                }
            }
            return homeHealConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeHealConfig homeHealConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = homeHealConfig.live_tag_new;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = homeHealConfig.live_tag_normal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, homeHealConfig.live_level);
            String str3 = homeHealConfig.voice_tag;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, homeHealConfig.left_slide_guidance);
            codedOutputByteBufferNano.m17305G(6, homeHealConfig.right_slide_guidance);
            codedOutputByteBufferNano.m17305G(7, homeHealConfig.right_interval);
            codedOutputByteBufferNano.m17299A(8, homeHealConfig.enable);
            codedOutputByteBufferNano.m17299A(9, homeHealConfig.online_device);
            codedOutputByteBufferNano.m17299A(10, homeHealConfig.f21155ip);
        }
    };
    public static JsonAdapter<HomeHealConfig> JSON_ADAPTER = new ObjectJsonAdapter<HomeHealConfig>() { // from class: com.p1.mobile.putong.core.data.HomeHealConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeHealConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeHealConfig newInstance() {
            return new HomeHealConfig();
        }

        public boolean parseField(HomeHealConfig homeHealConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "left_slide_guidance":
                    homeHealConfig.left_slide_guidance = jsonParser.getValueAsInt();
                    return true;
                case "live_tag_new":
                    homeHealConfig.live_tag_new = jsonParser.getValueAsString();
                    return true;
                case "enable":
                    homeHealConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "online_device":
                    homeHealConfig.online_device = jsonParser.getValueAsBoolean();
                    return true;
                case "voice_tag":
                    homeHealConfig.voice_tag = jsonParser.getValueAsString();
                    return true;
                case "live_tag_normal":
                    homeHealConfig.live_tag_normal = jsonParser.getValueAsString();
                    return true;
                case "right_interval":
                    homeHealConfig.right_interval = jsonParser.getValueAsInt();
                    return true;
                case "ip":
                    homeHealConfig.f21155ip = jsonParser.getValueAsBoolean();
                    return true;
                case "live_level":
                    homeHealConfig.live_level = jsonParser.getValueAsBoolean();
                    return true;
                case "right_slide_guidance":
                    homeHealConfig.right_slide_guidance = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeHealConfig homeHealConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "left_slide_guidance":
                case "live_tag_new":
                case "enable":
                case "online_device":
                case "voice_tag":
                case "live_tag_normal":
                case "right_interval":
                case "ip":
                case "live_level":
                case "right_slide_guidance":
                    return true;
                default:
                    return super.parseFieldCheck(homeHealConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeHealConfig homeHealConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = homeHealConfig.live_tag_new;
            if (str != null) {
                jsonGenerator.writeStringField("live_tag_new", str);
            }
            String str2 = homeHealConfig.live_tag_normal;
            if (str2 != null) {
                jsonGenerator.writeStringField("live_tag_normal", str2);
            }
            jsonGenerator.writeBooleanField("live_level", homeHealConfig.live_level);
            String str3 = homeHealConfig.voice_tag;
            if (str3 != null) {
                jsonGenerator.writeStringField("voice_tag", str3);
            }
            jsonGenerator.writeNumberField("left_slide_guidance", homeHealConfig.left_slide_guidance);
            jsonGenerator.writeNumberField("right_slide_guidance", homeHealConfig.right_slide_guidance);
            jsonGenerator.writeNumberField("right_interval", homeHealConfig.right_interval);
            jsonGenerator.writeBooleanField("enable", homeHealConfig.enable);
            jsonGenerator.writeBooleanField("online_device", homeHealConfig.online_device);
            jsonGenerator.writeBooleanField(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, homeHealConfig.f21155ip);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeHealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeHealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeHealConfig new_() {
        HomeHealConfig homeHealConfig = new HomeHealConfig();
        homeHealConfig.nullCheck();
        return homeHealConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeHealConfig mo225055clone() {
        HomeHealConfig homeHealConfig = new HomeHealConfig();
        homeHealConfig.live_tag_new = this.live_tag_new;
        homeHealConfig.live_tag_normal = this.live_tag_normal;
        homeHealConfig.live_level = this.live_level;
        homeHealConfig.voice_tag = this.voice_tag;
        homeHealConfig.left_slide_guidance = this.left_slide_guidance;
        homeHealConfig.right_slide_guidance = this.right_slide_guidance;
        homeHealConfig.right_interval = this.right_interval;
        homeHealConfig.enable = this.enable;
        homeHealConfig.online_device = this.online_device;
        homeHealConfig.f21155ip = this.f21155ip;
        return homeHealConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeHealConfig)) {
            return false;
        }
        HomeHealConfig homeHealConfig = (HomeHealConfig) obj;
        return ValueObject.util_equals(this.live_tag_new, homeHealConfig.live_tag_new) && ValueObject.util_equals(this.live_tag_normal, homeHealConfig.live_tag_normal) && this.live_level == homeHealConfig.live_level && ValueObject.util_equals(this.voice_tag, homeHealConfig.voice_tag) && this.left_slide_guidance == homeHealConfig.left_slide_guidance && this.right_slide_guidance == homeHealConfig.right_slide_guidance && this.right_interval == homeHealConfig.right_interval && this.enable == homeHealConfig.enable && this.online_device == homeHealConfig.online_device && this.f21155ip == homeHealConfig.f21155ip;
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
        String str = this.live_tag_new;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.live_tag_normal;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.live_level ? 1231 : 1237)) * 41;
        String str3 = this.voice_tag;
        int iHashCode3 = ((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.left_slide_guidance) * 41) + this.right_slide_guidance) * 41) + this.right_interval) * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.online_device ? 1231 : 1237)) * 41) + (this.f21155ip ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.live_tag_new == null) {
            this.live_tag_new = "";
        }
        if (this.live_tag_normal == null) {
            this.live_tag_normal = "";
        }
        if (this.voice_tag == null) {
            this.voice_tag = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
