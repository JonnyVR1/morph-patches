package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OnVoiceCall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "onvoicecall";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f39237id;

    @NonNull
    @ProtobufIndex(index = 2)
    public Reference user;
    public static ProtobufAdapter<OnVoiceCall> PROTOBUF_ADAPTER = new MessageNanoAdapter<OnVoiceCall>() { // from class: com.p1.mobile.putong.feed.data.OnVoiceCall.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OnVoiceCall onVoiceCall) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, onVoiceCall.f39237id);
            Reference reference = onVoiceCall.user;
            if (reference != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, reference, Reference.PROTOBUF_ADAPTER);
            }
            onVoiceCall.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OnVoiceCall parse(nb5 nb5Var) throws IOException {
            OnVoiceCall onVoiceCall = new OnVoiceCall();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (onVoiceCall.user != null) {
                        break;
                    }
                    onVoiceCall.user = Reference.new_();
                    break;
                }
                if (iM158752u == 8) {
                    onVoiceCall.f39237id = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (onVoiceCall.user != null) {
                            break;
                        }
                        onVoiceCall.user = Reference.new_();
                        return onVoiceCall;
                    }
                    onVoiceCall.user = (Reference) nb5Var.m158743l(Reference.PROTOBUF_ADAPTER);
                }
            }
            return onVoiceCall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OnVoiceCall onVoiceCall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, onVoiceCall.f39237id);
            Reference reference = onVoiceCall.user;
            if (reference != null) {
                codedOutputByteBufferNano.m17254K(2, reference, Reference.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OnVoiceCall> JSON_ADAPTER = new ObjectJsonAdapter<OnVoiceCall>() { // from class: com.p1.mobile.putong.feed.data.OnVoiceCall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OnVoiceCall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OnVoiceCall newInstance() {
            return new OnVoiceCall();
        }

        public boolean parseField(OnVoiceCall onVoiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                onVoiceCall.f39237id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals("user")) {
                return false;
            }
            onVoiceCall.user = Reference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OnVoiceCall onVoiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("user")) {
                return true;
            }
            return super.parseFieldCheck(onVoiceCall, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OnVoiceCall onVoiceCall, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", onVoiceCall.f39237id);
            if (onVoiceCall.user != null) {
                jsonGenerator.writeFieldName("user");
                Reference.JSON_ADAPTER.serialize(onVoiceCall.user, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OnVoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OnVoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OnVoiceCall new_() {
        OnVoiceCall onVoiceCall = new OnVoiceCall();
        onVoiceCall.nullCheck();
        return onVoiceCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OnVoiceCall mo223809clone() {
        OnVoiceCall onVoiceCall = new OnVoiceCall();
        onVoiceCall.f39237id = this.f39237id;
        Reference reference = this.user;
        if (reference != null) {
            onVoiceCall.user = reference.mo223809clone();
        }
        return onVoiceCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnVoiceCall)) {
            return false;
        }
        OnVoiceCall onVoiceCall = (OnVoiceCall) obj;
        return this.f39237id == onVoiceCall.f39237id && ValueObject.util_equals(this.user, onVoiceCall.user);
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
        int i2 = ((i * 41) + this.f39237id) * 41;
        Reference reference = this.user;
        int iHashCode = i2 + (reference != null ? reference.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.user == null) {
            this.user = Reference.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
