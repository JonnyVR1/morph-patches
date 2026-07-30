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
public class AppealFaceidToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealfaceidtoken";

    @NonNull
    @ProtobufIndex(index = 4)
    public String expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f7id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String value;
    public static ProtobufAdapter<AppealFaceidToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealFaceidToken>() { // from class: com.p1.mobile.putong.core.data.AppealFaceidToken.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AppealFaceidToken appealFaceidToken) {
            String str = appealFaceidToken.f7id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) appealFaceidToken).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AppealFaceidToken m11641parse(nb5 nb5Var) throws IOException {
            AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (appealFaceidToken.f7id == null) {
                        appealFaceidToken.f7id = "";
                    }
                    if (appealFaceidToken.type == null) {
                        appealFaceidToken.type = "";
                    }
                    if (appealFaceidToken.value == null) {
                        appealFaceidToken.value = "";
                    }
                    if (appealFaceidToken.expireTime != null) {
                        break;
                    }
                    appealFaceidToken.expireTime = "";
                    break;
                }
                if (iU == 10) {
                    appealFaceidToken.f7id = nb5Var.s();
                } else if (iU == 18) {
                    appealFaceidToken.type = nb5Var.s();
                } else if (iU == 26) {
                    appealFaceidToken.value = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (appealFaceidToken.f7id == null) {
                            appealFaceidToken.f7id = "";
                        }
                        if (appealFaceidToken.type == null) {
                            appealFaceidToken.type = "";
                        }
                        if (appealFaceidToken.value == null) {
                            appealFaceidToken.value = "";
                        }
                        if (appealFaceidToken.expireTime != null) {
                            break;
                        }
                        appealFaceidToken.expireTime = "";
                        return appealFaceidToken;
                    }
                    appealFaceidToken.expireTime = nb5Var.s();
                }
            }
            return appealFaceidToken;
        }

        public void serialize(AppealFaceidToken appealFaceidToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealFaceidToken.f7id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<AppealFaceidToken> JSON_ADAPTER = new ObjectJsonAdapter<AppealFaceidToken>() { // from class: com.p1.mobile.putong.core.data.AppealFaceidToken.2
        public Class getDataClass() {
            return AppealFaceidToken.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AppealFaceidToken m11642newInstance() {
            return new AppealFaceidToken();
        }

        public boolean parseField(AppealFaceidToken appealFaceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    appealFaceidToken.expireTime = jsonParser.getValueAsString();
                    return true;
                case "id":
                    appealFaceidToken.f7id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    appealFaceidToken.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    appealFaceidToken.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppealFaceidToken appealFaceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                    return true;
                case "id":
                    return false;
                case "type":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(appealFaceidToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AppealFaceidToken appealFaceidToken, JsonGenerator jsonGenerator) throws IOException {
            String str = appealFaceidToken.f7id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("expireTime", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealFaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealFaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealFaceidToken new_() {
        AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
        appealFaceidToken.nullCheck();
        return appealFaceidToken;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppealFaceidToken m11640clone() {
        AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
        appealFaceidToken.f7id = this.f7id;
        appealFaceidToken.type = this.type;
        appealFaceidToken.value = this.value;
        appealFaceidToken.expireTime = this.expireTime;
        return appealFaceidToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealFaceidToken)) {
            return false;
        }
        AppealFaceidToken appealFaceidToken = (AppealFaceidToken) obj;
        return ValueObject.util_equals(this.f7id, appealFaceidToken.f7id) && ValueObject.util_equals(this.type, appealFaceidToken.type) && ValueObject.util_equals(this.value, appealFaceidToken.value) && ValueObject.util_equals(this.expireTime, appealFaceidToken.expireTime);
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
        String str = this.f7id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.expireTime;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f7id == null) {
            this.f7id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.expireTime == null) {
            this.expireTime = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
