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
public class GreetingNewPeople extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingnewpeople";

    @NonNull
    @ProtobufIndex(index = 1)
    public String UserId;
    public static ProtobufAdapter<GreetingNewPeople> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingNewPeople>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeople.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingNewPeople greetingNewPeople) {
            String str = greetingNewPeople.UserId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) greetingNewPeople).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingNewPeople m13041parse(nb5 nb5Var) throws IOException {
            GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingNewPeople.UserId != null) {
                        break;
                    }
                    greetingNewPeople.UserId = "";
                    break;
                }
                if (iU != 10) {
                    if (greetingNewPeople.UserId != null) {
                        break;
                    }
                    greetingNewPeople.UserId = "";
                    return greetingNewPeople;
                }
                greetingNewPeople.UserId = nb5Var.s();
            }
            return greetingNewPeople;
        }

        public void serialize(GreetingNewPeople greetingNewPeople, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingNewPeople.UserId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingNewPeople> JSON_ADAPTER = new ObjectJsonAdapter<GreetingNewPeople>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeople.2
        public Class getDataClass() {
            return GreetingNewPeople.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingNewPeople m13042newInstance() {
            return new GreetingNewPeople();
        }

        public boolean parseField(GreetingNewPeople greetingNewPeople, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("UserId")) {
                return false;
            }
            greetingNewPeople.UserId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingNewPeople greetingNewPeople, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("UserId")) {
                return true;
            }
            return super.parseFieldCheck(greetingNewPeople, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GreetingNewPeople greetingNewPeople, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingNewPeople.UserId;
            if (str != null) {
                jsonGenerator.writeStringField("UserId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingNewPeople) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingNewPeople) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingNewPeople new_() {
        GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
        greetingNewPeople.nullCheck();
        return greetingNewPeople;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingNewPeople m13040clone() {
        GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
        greetingNewPeople.UserId = this.UserId;
        return greetingNewPeople;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GreetingNewPeople) {
            return ValueObject.util_equals(this.UserId, ((GreetingNewPeople) obj).UserId);
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
        String str = this.UserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.UserId == null) {
            this.UserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
