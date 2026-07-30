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
public class UserBoostSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userboostsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Integer durationSeconds;

    @NonNull
    @ProtobufIndex(index = 2)
    public Long expiresTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public Integer multiplier;
    public static ProtobufAdapter<UserBoostSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserBoostSettings>() { // from class: com.p1.mobile.putong.data.UserBoostSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserBoostSettings userBoostSettings) {
            Integer num = userBoostSettings.durationSeconds;
            int iH = num != null ? CodedOutputByteBufferNano.h(1, num.intValue()) : 0;
            Long l2 = userBoostSettings.expiresTime;
            if (l2 != null) {
                iH += CodedOutputByteBufferNano.j(2, l2.longValue());
            }
            Integer num2 = userBoostSettings.multiplier;
            if (num2 != null) {
                iH += CodedOutputByteBufferNano.h(3, num2.intValue());
            }
            ((MessageNano) userBoostSettings).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserBoostSettings m19166parse(nb5 nb5Var) throws IOException {
            UserBoostSettings userBoostSettings = new UserBoostSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userBoostSettings.durationSeconds == null) {
                        userBoostSettings.durationSeconds = 0;
                    }
                    if (userBoostSettings.expiresTime == null) {
                        userBoostSettings.expiresTime = 0L;
                    }
                    if (userBoostSettings.multiplier != null) {
                        break;
                    }
                    userBoostSettings.multiplier = 0;
                    break;
                }
                if (iU == 8) {
                    userBoostSettings.durationSeconds = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    userBoostSettings.expiresTime = Long.valueOf(nb5Var.k());
                } else {
                    if (iU != 24) {
                        if (userBoostSettings.durationSeconds == null) {
                            userBoostSettings.durationSeconds = 0;
                        }
                        if (userBoostSettings.expiresTime == null) {
                            userBoostSettings.expiresTime = 0L;
                        }
                        if (userBoostSettings.multiplier != null) {
                            break;
                        }
                        userBoostSettings.multiplier = 0;
                        return userBoostSettings;
                    }
                    userBoostSettings.multiplier = Integer.valueOf(nb5Var.j());
                }
            }
            return userBoostSettings;
        }

        public void serialize(UserBoostSettings userBoostSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Integer num = userBoostSettings.durationSeconds;
            if (num != null) {
                codedOutputByteBufferNano.G(1, num.intValue());
            }
            Long l2 = userBoostSettings.expiresTime;
            if (l2 != null) {
                codedOutputByteBufferNano.I(2, l2.longValue());
            }
            Integer num2 = userBoostSettings.multiplier;
            if (num2 != null) {
                codedOutputByteBufferNano.G(3, num2.intValue());
            }
        }
    };
    public static JsonAdapter<UserBoostSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserBoostSettings>() { // from class: com.p1.mobile.putong.data.UserBoostSettings.2
        public Class getDataClass() {
            return UserBoostSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserBoostSettings mo17830newInstance() {
            return new UserBoostSettings();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(UserBoostSettings userBoostSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -477174197:
                    if (str.equals("durationSeconds")) {
                        b = 0;
                    }
                    break;
                case -78662623:
                    if (str.equals("expiresTime")) {
                        b = 1;
                    }
                    break;
                case 1265073601:
                    if (str.equals("multiplier")) {
                        b = 2;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    userBoostSettings.durationSeconds = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 1:
                    userBoostSettings.expiresTime = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Long.valueOf(jsonParser.getValueAsLong()) : null;
                    return true;
                case 2:
                    userBoostSettings.multiplier = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserBoostSettings userBoostSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "durationSeconds":
                case "expiresTime":
                case "multiplier":
                    return true;
                default:
                    return super.parseFieldCheck(userBoostSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserBoostSettings userBoostSettings, JsonGenerator jsonGenerator) throws IOException {
            Integer num = userBoostSettings.durationSeconds;
            if (num != null) {
                jsonGenerator.writeNumberField("durationSeconds", num.intValue());
            }
            Long l2 = userBoostSettings.expiresTime;
            if (l2 != null) {
                jsonGenerator.writeNumberField("expiresTime", l2.longValue());
            }
            Integer num2 = userBoostSettings.multiplier;
            if (num2 != null) {
                jsonGenerator.writeNumberField("multiplier", num2.intValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserBoostSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserBoostSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserBoostSettings new_() {
        UserBoostSettings userBoostSettings = new UserBoostSettings();
        userBoostSettings.nullCheck();
        return userBoostSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserBoostSettings m19165clone() {
        UserBoostSettings userBoostSettings = new UserBoostSettings();
        userBoostSettings.durationSeconds = this.durationSeconds;
        userBoostSettings.expiresTime = this.expiresTime;
        userBoostSettings.multiplier = this.multiplier;
        return userBoostSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserBoostSettings)) {
            return false;
        }
        UserBoostSettings userBoostSettings = (UserBoostSettings) obj;
        return ValueObject.util_equals(this.durationSeconds, userBoostSettings.durationSeconds) && ValueObject.util_equals(this.expiresTime, userBoostSettings.expiresTime) && ValueObject.util_equals(this.multiplier, userBoostSettings.multiplier);
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
        Integer num = this.durationSeconds;
        int iHashCode = (i2 + (num != null ? num.hashCode() : 0)) * 41;
        Long l2 = this.expiresTime;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 41;
        Integer num2 = this.multiplier;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.durationSeconds == null) {
            this.durationSeconds = 0;
        }
        if (this.expiresTime == null) {
            this.expiresTime = 0L;
        }
        if (this.multiplier == null) {
            this.multiplier = 0;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
