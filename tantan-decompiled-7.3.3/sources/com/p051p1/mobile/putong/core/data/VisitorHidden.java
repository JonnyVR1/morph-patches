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
public class VisitorHidden extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorhidden";

    @ProtobufIndex(index = 2)
    public boolean hidden;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<VisitorHidden> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorHidden>() { // from class: com.p1.mobile.putong.core.data.VisitorHidden.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorHidden visitorHidden) {
            String str = visitorHidden.userID;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, visitorHidden.hidden);
            visitorHidden.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorHidden parse(nc5 nc5Var) throws IOException {
            VisitorHidden visitorHidden = new VisitorHidden();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (visitorHidden.userID != null) {
                        break;
                    }
                    visitorHidden.userID = "";
                    break;
                }
                if (iM162497u == 10) {
                    visitorHidden.userID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (visitorHidden.userID != null) {
                            break;
                        }
                        visitorHidden.userID = "";
                        return visitorHidden;
                    }
                    visitorHidden.hidden = nc5Var.m162483g();
                }
            }
            return visitorHidden;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorHidden visitorHidden, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorHidden.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, visitorHidden.hidden);
        }
    };
    public static JsonAdapter<VisitorHidden> JSON_ADAPTER = new ObjectJsonAdapter<VisitorHidden>() { // from class: com.p1.mobile.putong.core.data.VisitorHidden.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorHidden.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorHidden newInstance() {
            return new VisitorHidden();
        }

        public boolean parseField(VisitorHidden visitorHidden, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("hidden")) {
                visitorHidden.hidden = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("userID")) {
                return false;
            }
            visitorHidden.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VisitorHidden visitorHidden, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("hidden") || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(visitorHidden, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorHidden visitorHidden, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorHidden.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            jsonGenerator.writeBooleanField("hidden", visitorHidden.hidden);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorHidden) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorHidden) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorHidden new_() {
        VisitorHidden visitorHidden = new VisitorHidden();
        visitorHidden.nullCheck();
        return visitorHidden;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorHidden mo225055clone() {
        VisitorHidden visitorHidden = new VisitorHidden();
        visitorHidden.userID = this.userID;
        visitorHidden.hidden = this.hidden;
        return visitorHidden;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorHidden)) {
            return false;
        }
        VisitorHidden visitorHidden = (VisitorHidden) obj;
        return ValueObject.util_equals(this.userID, visitorHidden.userID) && this.hidden == visitorHidden.hidden;
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
        String str = this.userID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.hidden ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
