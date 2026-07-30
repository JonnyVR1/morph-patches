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
public class Portrait extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "portrait";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<Portrait> PROTOBUF_ADAPTER = new MessageNanoAdapter<Portrait>() { // from class: com.p1.mobile.putong.core.data.Portrait.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Portrait portrait) {
            String str = portrait.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = portrait.createdTime;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) portrait).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Portrait m14829parse(nb5 nb5Var) throws IOException {
            Portrait portrait = new Portrait();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (portrait.userId == null) {
                        portrait.userId = "";
                    }
                    if (portrait.createdTime != null) {
                        break;
                    }
                    portrait.createdTime = "";
                    break;
                }
                if (iU == 10) {
                    portrait.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (portrait.userId == null) {
                            portrait.userId = "";
                        }
                        if (portrait.createdTime != null) {
                            break;
                        }
                        portrait.createdTime = "";
                        return portrait;
                    }
                    portrait.createdTime = nb5Var.s();
                }
            }
            return portrait;
        }

        public void serialize(Portrait portrait, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = portrait.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = portrait.createdTime;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Portrait> JSON_ADAPTER = new ObjectJsonAdapter<Portrait>() { // from class: com.p1.mobile.putong.core.data.Portrait.2
        public Class getDataClass() {
            return Portrait.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Portrait m14830newInstance() {
            return new Portrait();
        }

        public boolean parseField(Portrait portrait, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                portrait.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("createdTime")) {
                return false;
            }
            portrait.createdTime = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Portrait portrait, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("createdTime")) {
                return true;
            }
            return super.parseFieldCheck(portrait, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Portrait portrait, JsonGenerator jsonGenerator) throws IOException {
            String str = portrait.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = portrait.createdTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("createdTime", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Portrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Portrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Portrait new_() {
        Portrait portrait = new Portrait();
        portrait.nullCheck();
        return portrait;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Portrait m14828clone() {
        Portrait portrait = new Portrait();
        portrait.userId = this.userId;
        portrait.createdTime = this.createdTime;
        return portrait;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Portrait)) {
            return false;
        }
        Portrait portrait = (Portrait) obj;
        return ValueObject.util_equals(this.userId, portrait.userId) && ValueObject.util_equals(this.createdTime, portrait.createdTime);
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
        String str2 = this.createdTime;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.createdTime == null) {
            this.createdTime = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
