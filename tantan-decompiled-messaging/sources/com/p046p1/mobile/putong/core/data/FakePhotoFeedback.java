package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class FakePhotoFeedback extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakephotofeedback";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20390id;

    @ProtobufIndex(index = 2)
    public int show;
    public static ProtobufAdapter<FakePhotoFeedback> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakePhotoFeedback>() { // from class: com.p1.mobile.putong.core.data.FakePhotoFeedback.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakePhotoFeedback fakePhotoFeedback) {
            String str = fakePhotoFeedback.f20390id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, fakePhotoFeedback.show);
            fakePhotoFeedback.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakePhotoFeedback parse(nb5 nb5Var) throws IOException {
            FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fakePhotoFeedback.f20390id != null) {
                        break;
                    }
                    fakePhotoFeedback.f20390id = "";
                    break;
                }
                if (iM158752u == 10) {
                    fakePhotoFeedback.f20390id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (fakePhotoFeedback.f20390id != null) {
                            break;
                        }
                        fakePhotoFeedback.f20390id = "";
                        return fakePhotoFeedback;
                    }
                    fakePhotoFeedback.show = nb5Var.m158741j();
                }
            }
            return fakePhotoFeedback;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakePhotoFeedback fakePhotoFeedback, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakePhotoFeedback.f20390id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, fakePhotoFeedback.show);
        }
    };
    public static JsonAdapter<FakePhotoFeedback> JSON_ADAPTER = new ObjectJsonAdapter<FakePhotoFeedback>() { // from class: com.p1.mobile.putong.core.data.FakePhotoFeedback.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakePhotoFeedback.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakePhotoFeedback newInstance() {
            return new FakePhotoFeedback();
        }

        public boolean parseField(FakePhotoFeedback fakePhotoFeedback, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                fakePhotoFeedback.f20390id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("show")) {
                return false;
            }
            fakePhotoFeedback.show = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(FakePhotoFeedback fakePhotoFeedback, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("show")) {
                return true;
            }
            return super.parseFieldCheck(fakePhotoFeedback, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakePhotoFeedback fakePhotoFeedback, JsonGenerator jsonGenerator) throws IOException {
            String str = fakePhotoFeedback.f20390id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("show", fakePhotoFeedback.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakePhotoFeedback) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakePhotoFeedback) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakePhotoFeedback new_() {
        FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
        fakePhotoFeedback.nullCheck();
        return fakePhotoFeedback;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakePhotoFeedback mo223809clone() {
        FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
        fakePhotoFeedback.f20390id = this.f20390id;
        fakePhotoFeedback.show = this.show;
        return fakePhotoFeedback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakePhotoFeedback)) {
            return false;
        }
        FakePhotoFeedback fakePhotoFeedback = (FakePhotoFeedback) obj;
        return ValueObject.util_equals(this.f20390id, fakePhotoFeedback.f20390id) && this.show == fakePhotoFeedback.show;
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
        String str = this.f20390id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.show;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20390id == null) {
            this.f20390id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
