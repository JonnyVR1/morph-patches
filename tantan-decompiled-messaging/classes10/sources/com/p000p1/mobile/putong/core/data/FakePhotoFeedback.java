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
public class FakePhotoFeedback extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakephotofeedback";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f52id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int show;
    public static ProtobufAdapter<FakePhotoFeedback> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakePhotoFeedback>() { // from class: com.p1.mobile.putong.core.data.FakePhotoFeedback.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakePhotoFeedback fakePhotoFeedback) {
            String str = fakePhotoFeedback.f52id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, fakePhotoFeedback.show);
            ((MessageNano) fakePhotoFeedback).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakePhotoFeedback m12717parse(nb5 nb5Var) throws IOException {
            FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fakePhotoFeedback.f52id != null) {
                        break;
                    }
                    fakePhotoFeedback.f52id = "";
                    break;
                }
                if (iU == 10) {
                    fakePhotoFeedback.f52id = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (fakePhotoFeedback.f52id != null) {
                            break;
                        }
                        fakePhotoFeedback.f52id = "";
                        return fakePhotoFeedback;
                    }
                    fakePhotoFeedback.show = nb5Var.j();
                }
            }
            return fakePhotoFeedback;
        }

        public void serialize(FakePhotoFeedback fakePhotoFeedback, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakePhotoFeedback.f52id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, fakePhotoFeedback.show);
        }
    };
    public static JsonAdapter<FakePhotoFeedback> JSON_ADAPTER = new ObjectJsonAdapter<FakePhotoFeedback>() { // from class: com.p1.mobile.putong.core.data.FakePhotoFeedback.2
        public Class getDataClass() {
            return FakePhotoFeedback.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakePhotoFeedback m12718newInstance() {
            return new FakePhotoFeedback();
        }

        public boolean parseField(FakePhotoFeedback fakePhotoFeedback, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                fakePhotoFeedback.f52id = jsonParser.getValueAsString();
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

        public void serializeFields(FakePhotoFeedback fakePhotoFeedback, JsonGenerator jsonGenerator) throws IOException {
            String str = fakePhotoFeedback.f52id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("show", fakePhotoFeedback.show);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakePhotoFeedback) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakePhotoFeedback) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakePhotoFeedback new_() {
        FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
        fakePhotoFeedback.nullCheck();
        return fakePhotoFeedback;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakePhotoFeedback m12716clone() {
        FakePhotoFeedback fakePhotoFeedback = new FakePhotoFeedback();
        fakePhotoFeedback.f52id = this.f52id;
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
        return ValueObject.util_equals(this.f52id, fakePhotoFeedback.f52id) && this.show == fakePhotoFeedback.show;
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
        String str = this.f52id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.show;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f52id == null) {
            this.f52id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
