package com.p000p1.mobile.putong.feed.data;

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
public class OnVoiceCall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "onvoicecall";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f698id;

    @NonNull
    @ProtobufIndex(index = 2)
    public Reference user;
    public static ProtobufAdapter<OnVoiceCall> PROTOBUF_ADAPTER = new MessageNanoAdapter<OnVoiceCall>() { // from class: com.p1.mobile.putong.feed.data.OnVoiceCall.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OnVoiceCall onVoiceCall) {
            int iH = CodedOutputByteBufferNano.h(1, onVoiceCall.f698id);
            Reference reference = onVoiceCall.user;
            if (reference != null) {
                iH += CodedOutputByteBufferNano.l(2, reference, Reference.PROTOBUF_ADAPTER);
            }
            ((MessageNano) onVoiceCall).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OnVoiceCall m19690parse(nb5 nb5Var) throws IOException {
            OnVoiceCall onVoiceCall = new OnVoiceCall();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (onVoiceCall.user != null) {
                        break;
                    }
                    onVoiceCall.user = Reference.new_();
                    break;
                }
                if (iU == 8) {
                    onVoiceCall.f698id = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (onVoiceCall.user != null) {
                            break;
                        }
                        onVoiceCall.user = Reference.new_();
                        return onVoiceCall;
                    }
                    onVoiceCall.user = (Reference) nb5Var.l(Reference.PROTOBUF_ADAPTER);
                }
            }
            return onVoiceCall;
        }

        public void serialize(OnVoiceCall onVoiceCall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, onVoiceCall.f698id);
            Reference reference = onVoiceCall.user;
            if (reference != null) {
                codedOutputByteBufferNano.K(2, reference, Reference.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OnVoiceCall> JSON_ADAPTER = new ObjectJsonAdapter<OnVoiceCall>() { // from class: com.p1.mobile.putong.feed.data.OnVoiceCall.2
        public Class getDataClass() {
            return OnVoiceCall.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OnVoiceCall mo17830newInstance() {
            return new OnVoiceCall();
        }

        public boolean parseField(OnVoiceCall onVoiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                onVoiceCall.f698id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals("user")) {
                return false;
            }
            onVoiceCall.user = (Reference) Reference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OnVoiceCall onVoiceCall, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", onVoiceCall.f698id);
            if (onVoiceCall.user != null) {
                jsonGenerator.writeFieldName("user");
                Reference.JSON_ADAPTER.serialize(onVoiceCall.user, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OnVoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OnVoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OnVoiceCall new_() {
        OnVoiceCall onVoiceCall = new OnVoiceCall();
        onVoiceCall.nullCheck();
        return onVoiceCall;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OnVoiceCall m19689clone() {
        OnVoiceCall onVoiceCall = new OnVoiceCall();
        onVoiceCall.f698id = this.f698id;
        Reference reference = this.user;
        if (reference != null) {
            onVoiceCall.user = reference.m19749clone();
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
        return this.f698id == onVoiceCall.f698id && ValueObject.util_equals(this.user, onVoiceCall.user);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f698id) * 41;
        Reference reference = this.user;
        int iHashCode = i2 + (reference != null ? reference.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = Reference.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
