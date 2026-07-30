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
public class UserSoulSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersoulsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public SoulHead picture;
    public static ProtobufAdapter<UserSoulSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSoulSettings>() { // from class: com.p1.mobile.putong.data.UserSoulSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserSoulSettings userSoulSettings) {
            SoulHead soulHead = userSoulSettings.picture;
            int iL = soulHead != null ? CodedOutputByteBufferNano.l(1, soulHead, SoulHead.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) userSoulSettings).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserSoulSettings m19226parse(nb5 nb5Var) throws IOException {
            UserSoulSettings userSoulSettings = new UserSoulSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userSoulSettings.picture != null) {
                        break;
                    }
                    userSoulSettings.picture = SoulHead.new_();
                    break;
                }
                if (iU != 10) {
                    if (userSoulSettings.picture != null) {
                        break;
                    }
                    userSoulSettings.picture = SoulHead.new_();
                    return userSoulSettings;
                }
                userSoulSettings.picture = (SoulHead) nb5Var.l(SoulHead.PROTOBUF_ADAPTER);
            }
            return userSoulSettings;
        }

        public void serialize(UserSoulSettings userSoulSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SoulHead soulHead = userSoulSettings.picture;
            if (soulHead != null) {
                codedOutputByteBufferNano.K(1, soulHead, SoulHead.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserSoulSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSoulSettings>() { // from class: com.p1.mobile.putong.data.UserSoulSettings.2
        public Class getDataClass() {
            return UserSoulSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserSoulSettings mo17830newInstance() {
            return new UserSoulSettings();
        }

        public boolean parseField(UserSoulSettings userSoulSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("picture")) {
                return false;
            }
            userSoulSettings.picture = (SoulHead) SoulHead.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserSoulSettings userSoulSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("picture")) {
                return true;
            }
            return super.parseFieldCheck(userSoulSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSoulSettings userSoulSettings, JsonGenerator jsonGenerator) throws IOException {
            if (userSoulSettings.picture != null) {
                jsonGenerator.writeFieldName("picture");
                SoulHead.JSON_ADAPTER.serialize(userSoulSettings.picture, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSoulSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSoulSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSoulSettings new_() {
        UserSoulSettings userSoulSettings = new UserSoulSettings();
        userSoulSettings.nullCheck();
        return userSoulSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserSoulSettings m19225clone() {
        UserSoulSettings userSoulSettings = new UserSoulSettings();
        SoulHead soulHead = this.picture;
        if (soulHead != null) {
            userSoulSettings.picture = soulHead.m18997clone();
        }
        return userSoulSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserSoulSettings) {
            return ValueObject.util_equals(this.picture, ((UserSoulSettings) obj).picture);
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
        SoulHead soulHead = this.picture;
        int iHashCode = i2 + (soulHead != null ? soulHead.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.picture == null) {
            this.picture = SoulHead.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
