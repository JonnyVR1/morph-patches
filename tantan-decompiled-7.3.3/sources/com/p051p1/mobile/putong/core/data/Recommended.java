package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class Recommended extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommended";

    @NonNull
    @ProtobufIndex(index = 3)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tracker;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<Recommended> PROTOBUF_ADAPTER = new MessageNanoAdapter<Recommended>() { // from class: com.p1.mobile.putong.core.data.Recommended.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Recommended recommended) {
            String str = recommended.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = recommended.tracker;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            recommended.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Recommended parse(nc5 nc5Var) throws IOException {
            Recommended recommended = new Recommended();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recommended.userId == null) {
                        recommended.userId = "";
                    }
                    if (recommended.tracker == null) {
                        recommended.tracker = "";
                    }
                    if (recommended.reason != null) {
                        break;
                    }
                    recommended.reason = "";
                    break;
                }
                if (iM162497u == 10) {
                    recommended.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    recommended.tracker = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (recommended.userId == null) {
                            recommended.userId = "";
                        }
                        if (recommended.tracker == null) {
                            recommended.tracker = "";
                        }
                        if (recommended.reason != null) {
                            break;
                        }
                        recommended.reason = "";
                        return recommended;
                    }
                    recommended.reason = nc5Var.m162495s();
                }
            }
            return recommended;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Recommended recommended, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommended.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = recommended.tracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<Recommended> JSON_ADAPTER = new ObjectJsonAdapter<Recommended>() { // from class: com.p1.mobile.putong.core.data.Recommended.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Recommended.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Recommended newInstance() {
            return new Recommended();
        }

        public boolean parseField(Recommended recommended, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    recommended.tracker = jsonParser.getValueAsString();
                    return true;
                case "reason":
                    recommended.reason = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    recommended.userId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Recommended recommended, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "reason":
                case "userId":
                    return true;
                default:
                    return super.parseFieldCheck(recommended, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Recommended recommended, JsonGenerator jsonGenerator) throws IOException {
            String str = recommended.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = recommended.tracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("tracker", str2);
            }
            String str3 = recommended.reason;
            if (str3 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Recommended) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Recommended) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Recommended new_() {
        Recommended recommended = new Recommended();
        recommended.nullCheck();
        return recommended;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Recommended mo225055clone() {
        Recommended recommended = new Recommended();
        recommended.userId = this.userId;
        recommended.tracker = this.tracker;
        recommended.reason = this.reason;
        return recommended;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recommended)) {
            return false;
        }
        Recommended recommended = (Recommended) obj;
        return ValueObject.util_equals(this.userId, recommended.userId) && ValueObject.util_equals(this.tracker, recommended.tracker) && ValueObject.util_equals(this.reason, recommended.reason);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tracker;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.reason;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
