package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class HideSpecialUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hidespecialuser";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Long timeStamp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<HideSpecialUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideSpecialUser>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideSpecialUser hideSpecialUser) {
            String str = hideSpecialUser.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                iO += CodedOutputByteBufferNano.j(2, l2.longValue());
            }
            ((MessageNano) hideSpecialUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideSpecialUser m13295parse(nb5 nb5Var) throws IOException {
            HideSpecialUser hideSpecialUser = new HideSpecialUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideSpecialUser.userId == null) {
                        hideSpecialUser.userId = "";
                    }
                    if (hideSpecialUser.timeStamp != null) {
                        break;
                    }
                    hideSpecialUser.timeStamp = 0L;
                    break;
                }
                if (iU == 10) {
                    hideSpecialUser.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (hideSpecialUser.userId == null) {
                            hideSpecialUser.userId = "";
                        }
                        if (hideSpecialUser.timeStamp != null) {
                            break;
                        }
                        hideSpecialUser.timeStamp = 0L;
                        return hideSpecialUser;
                    }
                    hideSpecialUser.timeStamp = Long.valueOf(nb5Var.k());
                }
            }
            return hideSpecialUser;
        }

        public void serialize(HideSpecialUser hideSpecialUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = hideSpecialUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                codedOutputByteBufferNano.I(2, l2.longValue());
            }
        }
    };
    public static JsonAdapter<HideSpecialUser> JSON_ADAPTER = new ObjectJsonAdapter<HideSpecialUser>() { // from class: com.p1.mobile.putong.core.data.HideSpecialUser.2
        public Class getDataClass() {
            return HideSpecialUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideSpecialUser m13296newInstance() {
            return new HideSpecialUser();
        }

        public boolean parseField(HideSpecialUser hideSpecialUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                hideSpecialUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("timeStamp")) {
                return false;
            }
            hideSpecialUser.timeStamp = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }

        public boolean parseFieldCheck(HideSpecialUser hideSpecialUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("timeStamp")) {
                return true;
            }
            return super.parseFieldCheck(hideSpecialUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HideSpecialUser hideSpecialUser, JsonGenerator jsonGenerator) throws IOException {
            String str = hideSpecialUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            Long l2 = hideSpecialUser.timeStamp;
            if (l2 != null) {
                jsonGenerator.writeNumberField("timeStamp", l2.longValue());
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideSpecialUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideSpecialUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideSpecialUser new_() {
        HideSpecialUser hideSpecialUser = new HideSpecialUser();
        hideSpecialUser.nullCheck();
        return hideSpecialUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideSpecialUser m13294clone() {
        HideSpecialUser hideSpecialUser = new HideSpecialUser();
        hideSpecialUser.userId = this.userId;
        hideSpecialUser.timeStamp = this.timeStamp;
        return hideSpecialUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideSpecialUser)) {
            return false;
        }
        HideSpecialUser hideSpecialUser = (HideSpecialUser) obj;
        return ValueObject.util_equals(this.userId, hideSpecialUser.userId) && ValueObject.util_equals(this.timeStamp, hideSpecialUser.timeStamp);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Long l2 = this.timeStamp;
        int iHashCode2 = iHashCode + (l2 != null ? l2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.timeStamp == null) {
            this.timeStamp = 0L;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
