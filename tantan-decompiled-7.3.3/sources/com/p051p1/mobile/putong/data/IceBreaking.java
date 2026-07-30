package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes12.dex */
public class IceBreaking extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreaking";

    @ProtobufIndex(index = 3)
    public int index;

    @NonNull
    @ProtobufIndex(index = 2)
    public String questionContent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionId;
    public static ProtobufAdapter<IceBreaking> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreaking>() { // from class: com.p1.mobile.putong.data.IceBreaking.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreaking iceBreaking) {
            String str = iceBreaking.questionId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, iceBreaking.index);
            iceBreaking.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreaking parse(nc5 nc5Var) throws IOException {
            IceBreaking iceBreaking = new IceBreaking();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (iceBreaking.questionId == null) {
                        iceBreaking.questionId = "";
                    }
                    if (iceBreaking.questionContent != null) {
                        break;
                    }
                    iceBreaking.questionContent = "";
                    break;
                }
                if (iM162497u == 10) {
                    iceBreaking.questionId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    iceBreaking.questionContent = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (iceBreaking.questionId == null) {
                            iceBreaking.questionId = "";
                        }
                        if (iceBreaking.questionContent != null) {
                            break;
                        }
                        iceBreaking.questionContent = "";
                        return iceBreaking;
                    }
                    iceBreaking.index = nc5Var.m162486j();
                }
            }
            return iceBreaking;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreaking iceBreaking, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreaking.questionId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, iceBreaking.index);
        }
    };
    public static JsonAdapter<IceBreaking> JSON_ADAPTER = new ObjectJsonAdapter<IceBreaking>() { // from class: com.p1.mobile.putong.data.IceBreaking.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreaking.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreaking newInstance() {
            return new IceBreaking();
        }

        public boolean parseField(IceBreaking iceBreaking, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questionContent":
                    iceBreaking.questionContent = jsonParser.getValueAsString();
                    return true;
                case "index":
                    iceBreaking.index = jsonParser.getValueAsInt();
                    return true;
                case "questionId":
                    iceBreaking.questionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IceBreaking iceBreaking, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "questionContent":
                case "index":
                case "questionId":
                    return true;
                default:
                    return super.parseFieldCheck(iceBreaking, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreaking iceBreaking, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreaking.questionId;
            if (str != null) {
                jsonGenerator.writeStringField("questionId", str);
            }
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionContent", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, iceBreaking.index);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreaking new_() {
        IceBreaking iceBreaking = new IceBreaking();
        iceBreaking.nullCheck();
        return iceBreaking;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreaking mo225055clone() {
        IceBreaking iceBreaking = new IceBreaking();
        iceBreaking.questionId = this.questionId;
        iceBreaking.questionContent = this.questionContent;
        iceBreaking.index = this.index;
        return iceBreaking;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreaking)) {
            return false;
        }
        IceBreaking iceBreaking = (IceBreaking) obj;
        return ValueObject.util_equals(this.questionId, iceBreaking.questionId) && ValueObject.util_equals(this.questionContent, iceBreaking.questionContent) && this.index == iceBreaking.index;
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
        String str = this.questionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionContent;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.index;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.questionContent == null) {
            this.questionContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
