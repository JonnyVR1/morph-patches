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
public class FakePopUp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakepopup";

    @ProtobufIndex(index = 2)
    public boolean showFakeGuide;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<FakePopUp> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakePopUp>() { // from class: com.p1.mobile.putong.core.data.FakePopUp.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakePopUp fakePopUp) {
            String str = fakePopUp.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, fakePopUp.showFakeGuide);
            fakePopUp.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakePopUp parse(nc5 nc5Var) throws IOException {
            FakePopUp fakePopUp = new FakePopUp();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fakePopUp.userId != null) {
                        break;
                    }
                    fakePopUp.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    fakePopUp.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (fakePopUp.userId != null) {
                            break;
                        }
                        fakePopUp.userId = "";
                        return fakePopUp;
                    }
                    fakePopUp.showFakeGuide = nc5Var.m162483g();
                }
            }
            return fakePopUp;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakePopUp fakePopUp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakePopUp.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, fakePopUp.showFakeGuide);
        }
    };
    public static JsonAdapter<FakePopUp> JSON_ADAPTER = new ObjectJsonAdapter<FakePopUp>() { // from class: com.p1.mobile.putong.core.data.FakePopUp.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakePopUp.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakePopUp newInstance() {
            return new FakePopUp();
        }

        public boolean parseField(FakePopUp fakePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                fakePopUp.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("showFakeGuide")) {
                return false;
            }
            fakePopUp.showFakeGuide = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FakePopUp fakePopUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("showFakeGuide")) {
                return true;
            }
            return super.parseFieldCheck(fakePopUp, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakePopUp fakePopUp, JsonGenerator jsonGenerator) throws IOException {
            String str = fakePopUp.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("showFakeGuide", fakePopUp.showFakeGuide);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakePopUp new_() {
        FakePopUp fakePopUp = new FakePopUp();
        fakePopUp.nullCheck();
        return fakePopUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakePopUp mo225055clone() {
        FakePopUp fakePopUp = new FakePopUp();
        fakePopUp.userId = this.userId;
        fakePopUp.showFakeGuide = this.showFakeGuide;
        return fakePopUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakePopUp)) {
            return false;
        }
        FakePopUp fakePopUp = (FakePopUp) obj;
        return ValueObject.util_equals(this.userId, fakePopUp.userId) && this.showFakeGuide == fakePopUp.showFakeGuide;
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.showFakeGuide ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
