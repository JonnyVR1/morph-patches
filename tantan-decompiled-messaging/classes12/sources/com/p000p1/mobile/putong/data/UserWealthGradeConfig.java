package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserWealthGradeConfig userWealthGradeConfig) {
            String str = userWealthGradeConfig.wealthIconUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = userWealthGradeConfig.wealthGradeDesc;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, userWealthGradeConfig.minGradeShow) + CodedOutputByteBufferNano.b(4, userWealthGradeConfig.openNewIcon);
            ((MessageNano) userWealthGradeConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserWealthGradeConfig m19247parse(nb5 nb5Var) throws IOException {
            UserWealthGradeConfig userWealthGradeConfig = new UserWealthGradeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userWealthGradeConfig.wealthIconUrl == null) {
                        userWealthGradeConfig.wealthIconUrl = "";
                    }
                    if (userWealthGradeConfig.wealthGradeDesc != null) {
                        break;
                    }
                    userWealthGradeConfig.wealthGradeDesc = "";
                    break;
                }
                if (iU == 10) {
                    userWealthGradeConfig.wealthIconUrl = nb5Var.s();
                } else if (iU == 18) {
                    userWealthGradeConfig.wealthGradeDesc = nb5Var.s();
                } else if (iU == 24) {
                    userWealthGradeConfig.minGradeShow = nb5Var.j();
                } else {
                    if (iU != 32) {
                        if (userWealthGradeConfig.wealthIconUrl == null) {
                            userWealthGradeConfig.wealthIconUrl = "";
                        }
                        if (userWealthGradeConfig.wealthGradeDesc != null) {
                            break;
                        }
                        userWealthGradeConfig.wealthGradeDesc = "";
                        return userWealthGradeConfig;
                    }
                    userWealthGradeConfig.openNewIcon = nb5Var.g();
                }
            }
            return userWealthGradeConfig;
        }

        public void serialize(UserWealthGradeConfig userWealthGradeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userWealthGradeConfig.wealthIconUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = userWealthGradeConfig.wealthGradeDesc;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, userWealthGradeConfig.minGradeShow);
            codedOutputByteBufferNano.A(4, userWealthGradeConfig.openNewIcon);
        }
    };
    public static JsonAdapter<UserWealthGradeConfig> JSON_ADAPTER = new ObjectJsonAdapter<UserWealthGradeConfig>() { // from class: com.p1.mobile.putong.data.UserWealthGradeConfig.2
        public Class getDataClass() {
            return UserWealthGradeConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserWealthGradeConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserWealthGradeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserWealthGradeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserWealthGradeConfig new_() {
        UserWealthGradeConfig userWealthGradeConfig = new UserWealthGradeConfig();
        userWealthGradeConfig.nullCheck();
        return userWealthGradeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserWealthGradeConfig m19246clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.wealthIconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.wealthGradeDesc;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.minGradeShow) * 41) + (this.openNewIcon ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.wealthIconUrl == null) {
            this.wealthIconUrl = "";
        }
        if (this.wealthGradeDesc == null) {
            this.wealthGradeDesc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
