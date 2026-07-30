package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class UserWealthGradeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userwealthgradeconfig";

    @ProtobufIndex(index = 3)
    public int minGradeShow;

    @ProtobufIndex(index = 4)
    public boolean openNewIcon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String wealthGradeDesc;

    @NonNull
    @ProtobufIndex(index = 1)
    public String wealthIconUrl;
    public static ProtobufAdapter<UserWealthGradeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserWealthGradeConfig>() { // from class: com.p1.mobile.putong.data.UserWealthGradeConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserWealthGradeConfig userWealthGradeConfig) {
            String str = userWealthGradeConfig.wealthIconUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = userWealthGradeConfig.wealthGradeDesc;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, userWealthGradeConfig.minGradeShow) + CodedOutputByteBufferNano.m17220b(4, userWealthGradeConfig.openNewIcon);
            userWealthGradeConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserWealthGradeConfig parse(nb5 nb5Var) throws IOException {
            UserWealthGradeConfig userWealthGradeConfig = new UserWealthGradeConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userWealthGradeConfig.wealthIconUrl == null) {
                        userWealthGradeConfig.wealthIconUrl = "";
                    }
                    if (userWealthGradeConfig.wealthGradeDesc != null) {
                        break;
                    }
                    userWealthGradeConfig.wealthGradeDesc = "";
                    break;
                }
                if (iM158752u == 10) {
                    userWealthGradeConfig.wealthIconUrl = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    userWealthGradeConfig.wealthGradeDesc = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    userWealthGradeConfig.minGradeShow = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        if (userWealthGradeConfig.wealthIconUrl == null) {
                            userWealthGradeConfig.wealthIconUrl = "";
                        }
                        if (userWealthGradeConfig.wealthGradeDesc != null) {
                            break;
                        }
                        userWealthGradeConfig.wealthGradeDesc = "";
                        return userWealthGradeConfig;
                    }
                    userWealthGradeConfig.openNewIcon = nb5Var.m158738g();
                }
            }
            return userWealthGradeConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserWealthGradeConfig userWealthGradeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userWealthGradeConfig.wealthIconUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = userWealthGradeConfig.wealthGradeDesc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, userWealthGradeConfig.minGradeShow);
            codedOutputByteBufferNano.m17244A(4, userWealthGradeConfig.openNewIcon);
        }
    };
    public static JsonAdapter<UserWealthGradeConfig> JSON_ADAPTER = new ObjectJsonAdapter<UserWealthGradeConfig>() { // from class: com.p1.mobile.putong.data.UserWealthGradeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserWealthGradeConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserWealthGradeConfig newInstance() {
            return new UserWealthGradeConfig();
        }

        public boolean parseField(UserWealthGradeConfig userWealthGradeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "wealthIconUrl":
                    userWealthGradeConfig.wealthIconUrl = jsonParser.getValueAsString();
                    return true;
                case "wealthGradeDesc":
                    userWealthGradeConfig.wealthGradeDesc = jsonParser.getValueAsString();
                    return true;
                case "openNewIcon":
                    userWealthGradeConfig.openNewIcon = jsonParser.getValueAsBoolean();
                    return true;
                case "minGradeShow":
                    userWealthGradeConfig.minGradeShow = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserWealthGradeConfig userWealthGradeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "wealthIconUrl":
                case "wealthGradeDesc":
                case "openNewIcon":
                case "minGradeShow":
                    return true;
                default:
                    return super.parseFieldCheck(userWealthGradeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserWealthGradeConfig userWealthGradeConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = userWealthGradeConfig.wealthIconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("wealthIconUrl", str);
            }
            String str2 = userWealthGradeConfig.wealthGradeDesc;
            if (str2 != null) {
                jsonGenerator.writeStringField("wealthGradeDesc", str2);
            }
            jsonGenerator.writeNumberField("minGradeShow", userWealthGradeConfig.minGradeShow);
            jsonGenerator.writeBooleanField("openNewIcon", userWealthGradeConfig.openNewIcon);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserWealthGradeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserWealthGradeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserWealthGradeConfig new_() {
        UserWealthGradeConfig userWealthGradeConfig = new UserWealthGradeConfig();
        userWealthGradeConfig.nullCheck();
        return userWealthGradeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserWealthGradeConfig mo223809clone() {
        UserWealthGradeConfig userWealthGradeConfig = new UserWealthGradeConfig();
        userWealthGradeConfig.wealthIconUrl = this.wealthIconUrl;
        userWealthGradeConfig.wealthGradeDesc = this.wealthGradeDesc;
        userWealthGradeConfig.minGradeShow = this.minGradeShow;
        userWealthGradeConfig.openNewIcon = this.openNewIcon;
        return userWealthGradeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserWealthGradeConfig)) {
            return false;
        }
        UserWealthGradeConfig userWealthGradeConfig = (UserWealthGradeConfig) obj;
        return ValueObject.util_equals(this.wealthIconUrl, userWealthGradeConfig.wealthIconUrl) && ValueObject.util_equals(this.wealthGradeDesc, userWealthGradeConfig.wealthGradeDesc) && this.minGradeShow == userWealthGradeConfig.minGradeShow && this.openNewIcon == userWealthGradeConfig.openNewIcon;
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
        String str = this.wealthIconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.wealthGradeDesc;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.minGradeShow) * 41) + (this.openNewIcon ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.wealthIconUrl == null) {
            this.wealthIconUrl = "";
        }
        if (this.wealthGradeDesc == null) {
            this.wealthGradeDesc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
