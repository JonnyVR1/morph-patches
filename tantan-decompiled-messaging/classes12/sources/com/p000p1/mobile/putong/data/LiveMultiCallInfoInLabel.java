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
public class LiveMultiCallInfoInLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemulticallinfoinlabel";

    @ProtobufIndex(index = 2)
    public boolean onGoing;

    @NonNull
    @ProtobufIndex(index = 1)
    public String role;
    public static ProtobufAdapter<LiveMultiCallInfoInLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMultiCallInfoInLabel>() { // from class: com.p1.mobile.putong.data.LiveMultiCallInfoInLabel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveMultiCallInfoInLabel liveMultiCallInfoInLabel) {
            String str = liveMultiCallInfoInLabel.role;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, liveMultiCallInfoInLabel.onGoing);
            ((MessageNano) liveMultiCallInfoInLabel).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveMultiCallInfoInLabel m18355parse(nb5 nb5Var) throws IOException {
            LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = new LiveMultiCallInfoInLabel();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveMultiCallInfoInLabel.role != null) {
                        break;
                    }
                    liveMultiCallInfoInLabel.role = "";
                    break;
                }
                if (iU == 10) {
                    liveMultiCallInfoInLabel.role = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (liveMultiCallInfoInLabel.role != null) {
                            break;
                        }
                        liveMultiCallInfoInLabel.role = "";
                        return liveMultiCallInfoInLabel;
                    }
                    liveMultiCallInfoInLabel.onGoing = nb5Var.g();
                }
            }
            return liveMultiCallInfoInLabel;
        }

        public void serialize(LiveMultiCallInfoInLabel liveMultiCallInfoInLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMultiCallInfoInLabel.role;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, liveMultiCallInfoInLabel.onGoing);
        }
    };
    public static JsonAdapter<LiveMultiCallInfoInLabel> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallInfoInLabel>() { // from class: com.p1.mobile.putong.data.LiveMultiCallInfoInLabel.2
        public Class getDataClass() {
            return LiveMultiCallInfoInLabel.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveMultiCallInfoInLabel mo17830newInstance() {
            return new LiveMultiCallInfoInLabel();
        }

        public boolean parseField(LiveMultiCallInfoInLabel liveMultiCallInfoInLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("onGoing")) {
                liveMultiCallInfoInLabel.onGoing = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("role")) {
                return false;
            }
            liveMultiCallInfoInLabel.role = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveMultiCallInfoInLabel liveMultiCallInfoInLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("onGoing") || str.equals("role")) {
                return true;
            }
            return super.parseFieldCheck(liveMultiCallInfoInLabel, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMultiCallInfoInLabel liveMultiCallInfoInLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMultiCallInfoInLabel.role;
            if (str != null) {
                jsonGenerator.writeStringField("role", str);
            }
            jsonGenerator.writeBooleanField("onGoing", liveMultiCallInfoInLabel.onGoing);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMultiCallInfoInLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMultiCallInfoInLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMultiCallInfoInLabel new_() {
        LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = new LiveMultiCallInfoInLabel();
        liveMultiCallInfoInLabel.nullCheck();
        return liveMultiCallInfoInLabel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveMultiCallInfoInLabel m18354clone() {
        LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = new LiveMultiCallInfoInLabel();
        liveMultiCallInfoInLabel.role = this.role;
        liveMultiCallInfoInLabel.onGoing = this.onGoing;
        return liveMultiCallInfoInLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMultiCallInfoInLabel)) {
            return false;
        }
        LiveMultiCallInfoInLabel liveMultiCallInfoInLabel = (LiveMultiCallInfoInLabel) obj;
        return ValueObject.util_equals(this.role, liveMultiCallInfoInLabel.role) && this.onGoing == liveMultiCallInfoInLabel.onGoing;
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
        String str = this.role;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.onGoing ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.role == null) {
            this.role = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
