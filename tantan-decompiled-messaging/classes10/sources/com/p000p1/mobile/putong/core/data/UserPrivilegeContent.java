package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserPrivilegeContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userprivilegecontent";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long beginTime;

    @ProtobufIndex(index = 1)
    public long expiredTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean inExperience;

    @ProtobufIndex(index = 6)
    public int refreshMaxRemaining;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int remaining;

    @ProtobufIndex(index = 4)
    public boolean unlimit;
    public static ProtobufAdapter<UserPrivilegeContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPrivilegeContent>() { // from class: com.p1.mobile.putong.core.data.UserPrivilegeContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPrivilegeContent userPrivilegeContent) {
            int iJ = CodedOutputByteBufferNano.j(1, userPrivilegeContent.expiredTime) + CodedOutputByteBufferNano.b(2, userPrivilegeContent.inExperience) + CodedOutputByteBufferNano.h(3, userPrivilegeContent.remaining) + CodedOutputByteBufferNano.b(4, userPrivilegeContent.unlimit) + CodedOutputByteBufferNano.j(5, userPrivilegeContent.beginTime) + CodedOutputByteBufferNano.h(6, userPrivilegeContent.refreshMaxRemaining);
            ((MessageNano) userPrivilegeContent).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPrivilegeContent m16158parse(nb5 nb5Var) throws IOException {
            UserPrivilegeContent userPrivilegeContent = new UserPrivilegeContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    userPrivilegeContent.expiredTime = nb5Var.k();
                } else if (iU == 16) {
                    userPrivilegeContent.inExperience = nb5Var.g();
                } else if (iU == 24) {
                    userPrivilegeContent.remaining = nb5Var.j();
                } else if (iU == 32) {
                    userPrivilegeContent.unlimit = nb5Var.g();
                } else if (iU == 40) {
                    userPrivilegeContent.beginTime = nb5Var.k();
                } else {
                    if (iU != 48) {
                        return userPrivilegeContent;
                    }
                    userPrivilegeContent.refreshMaxRemaining = nb5Var.j();
                }
            }
        }

        public void serialize(UserPrivilegeContent userPrivilegeContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, userPrivilegeContent.expiredTime);
            codedOutputByteBufferNano.A(2, userPrivilegeContent.inExperience);
            codedOutputByteBufferNano.G(3, userPrivilegeContent.remaining);
            codedOutputByteBufferNano.A(4, userPrivilegeContent.unlimit);
            codedOutputByteBufferNano.I(5, userPrivilegeContent.beginTime);
            codedOutputByteBufferNano.G(6, userPrivilegeContent.refreshMaxRemaining);
        }
    };
    public static JsonAdapter<UserPrivilegeContent> JSON_ADAPTER = new ObjectJsonAdapter<UserPrivilegeContent>() { // from class: com.p1.mobile.putong.core.data.UserPrivilegeContent.2
        public Class getDataClass() {
            return UserPrivilegeContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserPrivilegeContent m16159newInstance() {
            return new UserPrivilegeContent();
        }

        public boolean parseField(UserPrivilegeContent userPrivilegeContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "inExperience":
                    userPrivilegeContent.inExperience = jsonParser.getValueAsBoolean();
                    return true;
                case "beginTime":
                    userPrivilegeContent.beginTime = jsonParser.getValueAsLong();
                    return true;
                case "unlimit":
                    userPrivilegeContent.unlimit = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTime":
                    userPrivilegeContent.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "remaining":
                    userPrivilegeContent.remaining = jsonParser.getValueAsInt();
                    return true;
                case "refreshMaxRemaining":
                    userPrivilegeContent.refreshMaxRemaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserPrivilegeContent userPrivilegeContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "inExperience":
                case "beginTime":
                case "unlimit":
                case "expiredTime":
                case "remaining":
                case "refreshMaxRemaining":
                    return true;
                default:
                    return super.parseFieldCheck(userPrivilegeContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(UserPrivilegeContent userPrivilegeContent, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiredTime", userPrivilegeContent.expiredTime);
            jsonGenerator.writeBooleanField("inExperience", userPrivilegeContent.inExperience);
            jsonGenerator.writeNumberField("remaining", userPrivilegeContent.remaining);
            jsonGenerator.writeBooleanField("unlimit", userPrivilegeContent.unlimit);
            jsonGenerator.writeNumberField("beginTime", userPrivilegeContent.beginTime);
            jsonGenerator.writeNumberField("refreshMaxRemaining", userPrivilegeContent.refreshMaxRemaining);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPrivilegeContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPrivilegeContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserPrivilegeContent new_() {
        UserPrivilegeContent userPrivilegeContent = new UserPrivilegeContent();
        userPrivilegeContent.nullCheck();
        return userPrivilegeContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPrivilegeContent m16157clone() {
        UserPrivilegeContent userPrivilegeContent = new UserPrivilegeContent();
        userPrivilegeContent.expiredTime = this.expiredTime;
        userPrivilegeContent.inExperience = this.inExperience;
        userPrivilegeContent.remaining = this.remaining;
        userPrivilegeContent.unlimit = this.unlimit;
        userPrivilegeContent.beginTime = this.beginTime;
        userPrivilegeContent.refreshMaxRemaining = this.refreshMaxRemaining;
        return userPrivilegeContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPrivilegeContent)) {
            return false;
        }
        UserPrivilegeContent userPrivilegeContent = (UserPrivilegeContent) obj;
        return this.expiredTime == userPrivilegeContent.expiredTime && this.inExperience == userPrivilegeContent.inExperience && this.remaining == userPrivilegeContent.remaining && this.unlimit == userPrivilegeContent.unlimit && this.beginTime == userPrivilegeContent.beginTime && this.refreshMaxRemaining == userPrivilegeContent.refreshMaxRemaining;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.expiredTime;
        int i2 = ((((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.inExperience ? 1231 : 1237)) * 41) + this.remaining) * 41;
        int i3 = this.unlimit ? 1231 : 1237;
        long j2 = this.beginTime;
        int i4 = ((((i2 + i3) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.refreshMaxRemaining;
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
