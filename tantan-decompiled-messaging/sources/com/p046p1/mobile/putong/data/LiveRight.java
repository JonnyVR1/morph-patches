package com.p046p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveRight extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveright";

    @NonNull
    @ProtobufIndex(index = 6)
    public LiveAvatarFrameConfig avatarFrameConfig;

    @NonNull
    @ProtobufIndex(index = 5)
    public String description;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38773id;
    LangModel localDescription;
    LangModel localName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String placeType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rightType;
    public static ProtobufAdapter<LiveRight> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRight>() { // from class: com.p1.mobile.putong.data.LiveRight.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveRight liveRight) {
            String str = liveRight.f38773id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveRight.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = liveRight.rightType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = liveRight.placeType;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = liveRight.description;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveRight.avatarFrameConfig;
            if (liveAvatarFrameConfig != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            liveRight.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveRight parse(nb5 nb5Var) throws IOException {
            LiveRight liveRight = new LiveRight();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveRight.f38773id == null) {
                        liveRight.f38773id = "";
                    }
                    if (liveRight.name == null) {
                        liveRight.name = "";
                    }
                    if (liveRight.rightType == null) {
                        liveRight.rightType = "";
                    }
                    if (liveRight.placeType == null) {
                        liveRight.placeType = "";
                    }
                    if (liveRight.description == null) {
                        liveRight.description = "";
                    }
                    if (liveRight.avatarFrameConfig != null) {
                        break;
                    }
                    liveRight.avatarFrameConfig = LiveAvatarFrameConfig.new_();
                    break;
                }
                if (iM158752u == 10) {
                    liveRight.f38773id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveRight.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    liveRight.rightType = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    liveRight.placeType = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    liveRight.description = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (liveRight.f38773id == null) {
                            liveRight.f38773id = "";
                        }
                        if (liveRight.name == null) {
                            liveRight.name = "";
                        }
                        if (liveRight.rightType == null) {
                            liveRight.rightType = "";
                        }
                        if (liveRight.placeType == null) {
                            liveRight.placeType = "";
                        }
                        if (liveRight.description == null) {
                            liveRight.description = "";
                        }
                        if (liveRight.avatarFrameConfig != null) {
                            break;
                        }
                        liveRight.avatarFrameConfig = LiveAvatarFrameConfig.new_();
                        return liveRight;
                    }
                    liveRight.avatarFrameConfig = (LiveAvatarFrameConfig) nb5Var.m158743l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
                }
            }
            return liveRight;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveRight liveRight, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRight.f38773id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveRight.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = liveRight.rightType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = liveRight.placeType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = liveRight.description;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveRight.avatarFrameConfig;
            if (liveAvatarFrameConfig != null) {
                codedOutputByteBufferNano.m17254K(6, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveRight> JSON_ADAPTER = new ObjectJsonAdapter<LiveRight>() { // from class: com.p1.mobile.putong.data.LiveRight.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveRight.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveRight newInstance() {
            return new LiveRight();
        }

        public boolean parseField(LiveRight liveRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    liveRight.description = jsonParser.getValueAsString();
                    return true;
                case "rightType":
                    liveRight.rightType = jsonParser.getValueAsString();
                    return true;
                case "avatarFrameConfig":
                    liveRight.avatarFrameConfig = LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    liveRight.f38773id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    liveRight.name = jsonParser.getValueAsString();
                    return true;
                case "placeType":
                    liveRight.placeType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveRight liveRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "rightType":
                case "avatarFrameConfig":
                    return true;
                case "id":
                    return false;
                case "name":
                case "placeType":
                    return true;
                default:
                    return super.parseFieldCheck(liveRight, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRight liveRight, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRight.f38773id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveRight.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = liveRight.rightType;
            if (str3 != null) {
                jsonGenerator.writeStringField("rightType", str3);
            }
            String str4 = liveRight.placeType;
            if (str4 != null) {
                jsonGenerator.writeStringField("placeType", str4);
            }
            String str5 = liveRight.description;
            if (str5 != null) {
                jsonGenerator.writeStringField("description", str5);
            }
            if (liveRight.avatarFrameConfig != null) {
                jsonGenerator.writeFieldName("avatarFrameConfig");
                LiveAvatarFrameConfig.JSON_ADAPTER.serialize(liveRight.avatarFrameConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRight new_() {
        LiveRight liveRight = new LiveRight();
        liveRight.nullCheck();
        return liveRight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveRight mo223809clone() {
        LiveRight liveRight = new LiveRight();
        liveRight.f38773id = this.f38773id;
        liveRight.name = this.name;
        liveRight.rightType = this.rightType;
        liveRight.placeType = this.placeType;
        liveRight.description = this.description;
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.avatarFrameConfig;
        if (liveAvatarFrameConfig != null) {
            liveRight.avatarFrameConfig = liveAvatarFrameConfig.mo223809clone();
        }
        return liveRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRight)) {
            return false;
        }
        LiveRight liveRight = (LiveRight) obj;
        return ValueObject.util_equals(this.f38773id, liveRight.f38773id) && ValueObject.util_equals(this.name, liveRight.name) && ValueObject.util_equals(this.rightType, liveRight.rightType) && ValueObject.util_equals(this.placeType, liveRight.placeType) && ValueObject.util_equals(this.description, liveRight.description) && ValueObject.util_equals(this.avatarFrameConfig, liveRight.avatarFrameConfig);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getDescription() {
        if (this.localDescription == null) {
            this.localDescription = parseLangModel(this.description);
        }
        LangModel langModel = this.localDescription;
        return langModel == null ? "" : langModel.getLocalName();
    }

    public String getMediumUrl() {
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.avatarFrameConfig;
        if (liveAvatarFrameConfig == null) {
            return "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(liveAvatarFrameConfig.mediumDynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.avatarFrameConfig;
        if (!zIsEmpty) {
            return liveAvatarFrameConfig2.mediumDynamicUrl;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(liveAvatarFrameConfig2.dynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig3 = this.avatarFrameConfig;
        return !zIsEmpty2 ? liveAvatarFrameConfig3.dynamicUrl : liveAvatarFrameConfig3.staticUrl;
    }

    public String getName() {
        if (this.localName == null) {
            this.localName = parseLangModel(this.name);
        }
        LangModel langModel = this.localName;
        return langModel == null ? "" : langModel.getLocalName();
    }

    public String getSmallUrl() {
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.avatarFrameConfig;
        if (liveAvatarFrameConfig == null) {
            return "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(liveAvatarFrameConfig.smallDynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.avatarFrameConfig;
        if (!zIsEmpty) {
            return liveAvatarFrameConfig2.smallDynamicUrl;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(liveAvatarFrameConfig2.mediumDynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig3 = this.avatarFrameConfig;
        if (!zIsEmpty2) {
            return liveAvatarFrameConfig3.mediumDynamicUrl;
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(liveAvatarFrameConfig3.dynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig4 = this.avatarFrameConfig;
        return !zIsEmpty3 ? liveAvatarFrameConfig4.dynamicUrl : liveAvatarFrameConfig4.staticUrl;
    }

    public String getUrl() {
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.avatarFrameConfig;
        if (liveAvatarFrameConfig == null) {
            return "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(liveAvatarFrameConfig.dynamicUrl);
        LiveAvatarFrameConfig liveAvatarFrameConfig2 = this.avatarFrameConfig;
        return !zIsEmpty ? liveAvatarFrameConfig2.dynamicUrl : liveAvatarFrameConfig2.staticUrl;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f38773id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rightType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.placeType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.avatarFrameConfig;
        int iHashCode6 = iHashCode5 + (liveAvatarFrameConfig != null ? liveAvatarFrameConfig.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38773id == null) {
            this.f38773id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.rightType == null) {
            this.rightType = "";
        }
        if (this.placeType == null) {
            this.placeType = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.avatarFrameConfig == null) {
            this.avatarFrameConfig = LiveAvatarFrameConfig.new_();
        }
    }

    public LangModel parseLangModel(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
