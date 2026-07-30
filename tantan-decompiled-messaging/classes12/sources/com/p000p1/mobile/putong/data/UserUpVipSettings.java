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
public class UserUpVipSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userupvipsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean isUpvip;
    public static ProtobufAdapter<UserUpVipSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserUpVipSettings>() { // from class: com.p1.mobile.putong.data.UserUpVipSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserUpVipSettings userUpVipSettings) {
            Boolean bool = userUpVipSettings.isUpvip;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            ((MessageNano) userUpVipSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserUpVipSettings m19238parse(nb5 nb5Var) throws IOException {
            UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userUpVipSettings.isUpvip != null) {
                        break;
                    }
                    userUpVipSettings.isUpvip = Boolean.FALSE;
                    break;
                }
                if (iU != 8) {
                    if (userUpVipSettings.isUpvip != null) {
                        break;
                    }
                    userUpVipSettings.isUpvip = Boolean.FALSE;
                    return userUpVipSettings;
                }
                userUpVipSettings.isUpvip = Boolean.valueOf(nb5Var.g());
            }
            return userUpVipSettings;
        }

        public void serialize(UserUpVipSettings userUpVipSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userUpVipSettings.isUpvip;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserUpVipSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserUpVipSettings>() { // from class: com.p1.mobile.putong.data.UserUpVipSettings.2
        public Class getDataClass() {
            return UserUpVipSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserUpVipSettings mo17830newInstance() {
            return new UserUpVipSettings();
        }

        public boolean parseField(UserUpVipSettings userUpVipSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isUpvip")) {
                return false;
            }
            userUpVipSettings.isUpvip = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserUpVipSettings userUpVipSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isUpvip")) {
                return true;
            }
            return super.parseFieldCheck(userUpVipSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserUpVipSettings userUpVipSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userUpVipSettings.isUpvip;
            if (bool != null) {
                jsonGenerator.writeBooleanField("isUpvip", bool.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserUpVipSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserUpVipSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserUpVipSettings new_() {
        UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
        userUpVipSettings.nullCheck();
        return userUpVipSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserUpVipSettings m19237clone() {
        UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
        userUpVipSettings.isUpvip = this.isUpvip;
        return userUpVipSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserUpVipSettings) {
            return ValueObject.util_equals(this.isUpvip, ((UserUpVipSettings) obj).isUpvip);
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
        Boolean bool = this.isUpvip;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.isUpvip == null) {
            this.isUpvip = Boolean.FALSE;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
