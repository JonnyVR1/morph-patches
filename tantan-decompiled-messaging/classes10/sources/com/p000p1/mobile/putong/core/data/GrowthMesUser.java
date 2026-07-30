package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class GrowthMesUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthmesuser";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f70id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<GrowthMesUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthMesUser>() { // from class: com.p1.mobile.putong.core.data.GrowthMesUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthMesUser growthMesUser) {
            String str = growthMesUser.f70id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = growthMesUser.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) growthMesUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthMesUser m13139parse(nb5 nb5Var) throws IOException {
            GrowthMesUser growthMesUser = new GrowthMesUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthMesUser.f70id == null) {
                        growthMesUser.f70id = "";
                    }
                    if (growthMesUser.name == null) {
                        growthMesUser.name = "";
                    }
                    if (growthMesUser.avatar != null) {
                        break;
                    }
                    growthMesUser.avatar = "";
                    break;
                }
                if (iU == 10) {
                    growthMesUser.f70id = nb5Var.s();
                } else if (iU == 18) {
                    growthMesUser.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (growthMesUser.f70id == null) {
                            growthMesUser.f70id = "";
                        }
                        if (growthMesUser.name == null) {
                            growthMesUser.name = "";
                        }
                        if (growthMesUser.avatar != null) {
                            break;
                        }
                        growthMesUser.avatar = "";
                        return growthMesUser;
                    }
                    growthMesUser.avatar = nb5Var.s();
                }
            }
            return growthMesUser;
        }

        public void serialize(GrowthMesUser growthMesUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthMesUser.f70id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = growthMesUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<GrowthMesUser> JSON_ADAPTER = new ObjectJsonAdapter<GrowthMesUser>() { // from class: com.p1.mobile.putong.core.data.GrowthMesUser.2
        public Class getDataClass() {
            return GrowthMesUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthMesUser m13140newInstance() {
            return new GrowthMesUser();
        }

        public boolean parseField(GrowthMesUser growthMesUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    growthMesUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    growthMesUser.f70id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    growthMesUser.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthMesUser growthMesUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(growthMesUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthMesUser growthMesUser, JsonGenerator jsonGenerator) throws IOException {
            String str = growthMesUser.f70id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = growthMesUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = growthMesUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthMesUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthMesUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthMesUser new_() {
        GrowthMesUser growthMesUser = new GrowthMesUser();
        growthMesUser.nullCheck();
        return growthMesUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthMesUser m13138clone() {
        GrowthMesUser growthMesUser = new GrowthMesUser();
        growthMesUser.f70id = this.f70id;
        growthMesUser.name = this.name;
        growthMesUser.avatar = this.avatar;
        return growthMesUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthMesUser)) {
            return false;
        }
        GrowthMesUser growthMesUser = (GrowthMesUser) obj;
        return ValueObject.util_equals(this.f70id, growthMesUser.f70id) && ValueObject.util_equals(this.name, growthMesUser.name) && ValueObject.util_equals(this.avatar, growthMesUser.avatar);
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
        String str = this.f70id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f70id == null) {
            this.f70id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
