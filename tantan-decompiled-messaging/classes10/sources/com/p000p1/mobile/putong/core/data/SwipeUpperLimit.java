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
public class SwipeUpperLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeupperlimit";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<SwipeUpperLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeUpperLimit>() { // from class: com.p1.mobile.putong.core.data.SwipeUpperLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeUpperLimit swipeUpperLimit) {
            String str = swipeUpperLimit.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) swipeUpperLimit).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeUpperLimit m15866parse(nb5 nb5Var) throws IOException {
            SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (swipeUpperLimit.userID != null) {
                        break;
                    }
                    swipeUpperLimit.userID = "";
                    break;
                }
                if (iU != 10) {
                    if (swipeUpperLimit.userID != null) {
                        break;
                    }
                    swipeUpperLimit.userID = "";
                    return swipeUpperLimit;
                }
                swipeUpperLimit.userID = nb5Var.s();
            }
            return swipeUpperLimit;
        }

        public void serialize(SwipeUpperLimit swipeUpperLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = swipeUpperLimit.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<SwipeUpperLimit> JSON_ADAPTER = new ObjectJsonAdapter<SwipeUpperLimit>() { // from class: com.p1.mobile.putong.core.data.SwipeUpperLimit.2
        public Class getDataClass() {
            return SwipeUpperLimit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SwipeUpperLimit m15867newInstance() {
            return new SwipeUpperLimit();
        }

        public boolean parseField(SwipeUpperLimit swipeUpperLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userID")) {
                return false;
            }
            swipeUpperLimit.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SwipeUpperLimit swipeUpperLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(swipeUpperLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SwipeUpperLimit swipeUpperLimit, JsonGenerator jsonGenerator) throws IOException {
            String str = swipeUpperLimit.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeUpperLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeUpperLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeUpperLimit new_() {
        SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
        swipeUpperLimit.nullCheck();
        return swipeUpperLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeUpperLimit m15865clone() {
        SwipeUpperLimit swipeUpperLimit = new SwipeUpperLimit();
        swipeUpperLimit.userID = this.userID;
        return swipeUpperLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SwipeUpperLimit) {
            return ValueObject.util_equals(this.userID, ((SwipeUpperLimit) obj).userID);
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
        String str = this.userID;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
