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
public class IceBreakUserId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakuserid";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<IceBreakUserId> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakUserId>() { // from class: com.p1.mobile.putong.core.data.IceBreakUserId.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakUserId iceBreakUserId) {
            String str = iceBreakUserId.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) iceBreakUserId).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakUserId m13389parse(nb5 nb5Var) throws IOException {
            IceBreakUserId iceBreakUserId = new IceBreakUserId();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreakUserId.userId != null) {
                        break;
                    }
                    iceBreakUserId.userId = "";
                    break;
                }
                if (iU != 10) {
                    if (iceBreakUserId.userId != null) {
                        break;
                    }
                    iceBreakUserId.userId = "";
                    return iceBreakUserId;
                }
                iceBreakUserId.userId = nb5Var.s();
            }
            return iceBreakUserId;
        }

        public void serialize(IceBreakUserId iceBreakUserId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakUserId.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<IceBreakUserId> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakUserId>() { // from class: com.p1.mobile.putong.core.data.IceBreakUserId.2
        public Class getDataClass() {
            return IceBreakUserId.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakUserId m13390newInstance() {
            return new IceBreakUserId();
        }

        public boolean parseField(IceBreakUserId iceBreakUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userId")) {
                return false;
            }
            iceBreakUserId.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IceBreakUserId iceBreakUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakUserId, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IceBreakUserId iceBreakUserId, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakUserId.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakUserId new_() {
        IceBreakUserId iceBreakUserId = new IceBreakUserId();
        iceBreakUserId.nullCheck();
        return iceBreakUserId;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakUserId m13388clone() {
        IceBreakUserId iceBreakUserId = new IceBreakUserId();
        iceBreakUserId.userId = this.userId;
        return iceBreakUserId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IceBreakUserId) {
            return ValueObject.util_equals(this.userId, ((IceBreakUserId) obj).userId);
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
