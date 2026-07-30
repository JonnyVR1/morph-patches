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
public class FakePopUp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakepopup";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean showFakeGuide;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<FakePopUp> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakePopUp>() { // from class: com.p1.mobile.putong.core.data.FakePopUp.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakePopUp fakePopUp) {
            String str = fakePopUp.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, fakePopUp.showFakeGuide);
            ((MessageNano) fakePopUp).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakePopUp m12725parse(nb5 nb5Var) throws IOException {
            FakePopUp fakePopUp = new FakePopUp();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fakePopUp.userId != null) {
                        break;
                    }
                    fakePopUp.userId = "";
                    break;
                }
                if (iU == 10) {
                    fakePopUp.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (fakePopUp.userId != null) {
                            break;
                        }
                        fakePopUp.userId = "";
                        return fakePopUp;
                    }
                    fakePopUp.showFakeGuide = nb5Var.g();
                }
            }
            return fakePopUp;
        }

        public void serialize(FakePopUp fakePopUp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakePopUp.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, fakePopUp.showFakeGuide);
        }
    };
    public static JsonAdapter<FakePopUp> JSON_ADAPTER = new ObjectJsonAdapter<FakePopUp>() { // from class: com.p1.mobile.putong.core.data.FakePopUp.2
        public Class getDataClass() {
            return FakePopUp.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakePopUp m12726newInstance() {
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

        public void serializeFields(FakePopUp fakePopUp, JsonGenerator jsonGenerator) throws IOException {
            String str = fakePopUp.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("showFakeGuide", fakePopUp.showFakeGuide);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakePopUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakePopUp new_() {
        FakePopUp fakePopUp = new FakePopUp();
        fakePopUp.nullCheck();
        return fakePopUp;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakePopUp m12724clone() {
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.showFakeGuide ? 1231 : 1237);
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
