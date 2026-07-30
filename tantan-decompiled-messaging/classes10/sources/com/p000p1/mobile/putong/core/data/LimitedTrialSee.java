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
public class LimitedTrialSee extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "limitedtrialsee";

    @NonNull
    @ProtobufIndex(index = 1)
    public String actorId;
    public static ProtobufAdapter<LimitedTrialSee> PROTOBUF_ADAPTER = new MessageNanoAdapter<LimitedTrialSee>() { // from class: com.p1.mobile.putong.core.data.LimitedTrialSee.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LimitedTrialSee limitedTrialSee) {
            String str = limitedTrialSee.actorId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) limitedTrialSee).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LimitedTrialSee m13907parse(nb5 nb5Var) throws IOException {
            LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (limitedTrialSee.actorId != null) {
                        break;
                    }
                    limitedTrialSee.actorId = "";
                    break;
                }
                if (iU != 10) {
                    if (limitedTrialSee.actorId != null) {
                        break;
                    }
                    limitedTrialSee.actorId = "";
                    return limitedTrialSee;
                }
                limitedTrialSee.actorId = nb5Var.s();
            }
            return limitedTrialSee;
        }

        public void serialize(LimitedTrialSee limitedTrialSee, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = limitedTrialSee.actorId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LimitedTrialSee> JSON_ADAPTER = new ObjectJsonAdapter<LimitedTrialSee>() { // from class: com.p1.mobile.putong.core.data.LimitedTrialSee.2
        public Class getDataClass() {
            return LimitedTrialSee.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LimitedTrialSee m13908newInstance() {
            return new LimitedTrialSee();
        }

        public boolean parseField(LimitedTrialSee limitedTrialSee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("actorId")) {
                return false;
            }
            limitedTrialSee.actorId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LimitedTrialSee limitedTrialSee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("actorId")) {
                return true;
            }
            return super.parseFieldCheck(limitedTrialSee, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LimitedTrialSee limitedTrialSee, JsonGenerator jsonGenerator) throws IOException {
            String str = limitedTrialSee.actorId;
            if (str != null) {
                jsonGenerator.writeStringField("actorId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LimitedTrialSee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LimitedTrialSee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LimitedTrialSee new_() {
        LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
        limitedTrialSee.nullCheck();
        return limitedTrialSee;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LimitedTrialSee m13906clone() {
        LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
        limitedTrialSee.actorId = this.actorId;
        return limitedTrialSee;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LimitedTrialSee) {
            return ValueObject.util_equals(this.actorId, ((LimitedTrialSee) obj).actorId);
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
        String str = this.actorId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.actorId == null) {
            this.actorId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
