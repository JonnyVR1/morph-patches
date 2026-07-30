package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class UserSVIPSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersvipsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean isSvip;
    public static ProtobufAdapter<UserSVIPSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSVIPSettings>() { // from class: com.p1.mobile.putong.data.UserSVIPSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserSVIPSettings userSVIPSettings) {
            Boolean bool = userSVIPSettings.isSvip;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            ((MessageNano) userSVIPSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserSVIPSettings m19217parse(nb5 nb5Var) throws IOException {
            UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userSVIPSettings.isSvip != null) {
                        break;
                    }
                    userSVIPSettings.isSvip = Boolean.FALSE;
                    break;
                }
                if (iU != 8) {
                    if (userSVIPSettings.isSvip != null) {
                        break;
                    }
                    userSVIPSettings.isSvip = Boolean.FALSE;
                    return userSVIPSettings;
                }
                userSVIPSettings.isSvip = Boolean.valueOf(nb5Var.g());
            }
            return userSVIPSettings;
        }

        public void serialize(UserSVIPSettings userSVIPSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userSVIPSettings.isSvip;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserSVIPSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSVIPSettings>() { // from class: com.p1.mobile.putong.data.UserSVIPSettings.2
        public Class getDataClass() {
            return UserSVIPSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserSVIPSettings mo17830newInstance() {
            return new UserSVIPSettings();
        }

        public boolean parseField(UserSVIPSettings userSVIPSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isSvip")) {
                return false;
            }
            userSVIPSettings.isSvip = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserSVIPSettings userSVIPSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isSvip")) {
                return true;
            }
            return super.parseFieldCheck(userSVIPSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSVIPSettings userSVIPSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userSVIPSettings.isSvip;
            if (bool != null) {
                jsonGenerator.writeBooleanField("isSvip", bool.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSVIPSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSVIPSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSVIPSettings new_() {
        UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
        userSVIPSettings.nullCheck();
        return userSVIPSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserSVIPSettings m19216clone() {
        UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
        userSVIPSettings.isSvip = this.isSvip;
        return userSVIPSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserSVIPSettings) {
            return ValueObject.util_equals(this.isSvip, ((UserSVIPSettings) obj).isSvip);
        }
        return false;
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
        Boolean bool = this.isSvip;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.isSvip == null) {
            this.isSvip = Boolean.FALSE;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
