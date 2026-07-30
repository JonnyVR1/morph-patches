package com.p000p1.mobile.putong.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreaking iceBreaking) {
            String str = iceBreaking.questionId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, iceBreaking.index);
            ((MessageNano) iceBreaking).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreaking m18202parse(nb5 nb5Var) throws IOException {
            IceBreaking iceBreaking = new IceBreaking();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreaking.questionId == null) {
                        iceBreaking.questionId = "";
                    }
                    if (iceBreaking.questionContent != null) {
                        break;
                    }
                    iceBreaking.questionContent = "";
                    break;
                }
                if (iU == 10) {
                    iceBreaking.questionId = nb5Var.s();
                } else if (iU == 18) {
                    iceBreaking.questionContent = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (iceBreaking.questionId == null) {
                            iceBreaking.questionId = "";
                        }
                        if (iceBreaking.questionContent != null) {
                            break;
                        }
                        iceBreaking.questionContent = "";
                        return iceBreaking;
                    }
                    iceBreaking.index = nb5Var.j();
                }
            }
            return iceBreaking;
        }

        public void serialize(IceBreaking iceBreaking, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreaking.questionId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, iceBreaking.index);
        }
    };
    public static JsonAdapter<IceBreaking> JSON_ADAPTER = new ObjectJsonAdapter<IceBreaking>() { // from class: com.p1.mobile.putong.data.IceBreaking.2
        public Class getDataClass() {
            return IceBreaking.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IceBreaking mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreaking iceBreaking, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreaking.questionId;
            if (str != null) {
                jsonGenerator.writeStringField("questionId", str);
            }
            String str2 = iceBreaking.questionContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionContent", str2);
            }
            jsonGenerator.writeNumberField("index", iceBreaking.index);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreaking new_() {
        IceBreaking iceBreaking = new IceBreaking();
        iceBreaking.nullCheck();
        return iceBreaking;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreaking m18201clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.questionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionContent;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.index;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.questionId == null) {
            this.questionId = "";
        }
        if (this.questionContent == null) {
            this.questionContent = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
