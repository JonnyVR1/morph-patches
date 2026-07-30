package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Answer;
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
public class IceBreakingQA extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingqa";

    @NonNull
    @ProtobufIndex(index = 3)
    public String answer;

    @NonNull
    @ProtobufIndex(index = 4)
    public String originUserID;

    @NonNull
    @ProtobufIndex(index = 5)
    public String refMsgID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<IceBreakingQA> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingQA>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQA.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakingQA iceBreakingQA) {
            String str = iceBreakingQA.state;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = iceBreakingQA.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = iceBreakingQA.answer;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = iceBreakingQA.originUserID;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = iceBreakingQA.refMsgID;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            iceBreakingQA.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakingQA parse(nb5 nb5Var) throws IOException {
            IceBreakingQA iceBreakingQA = new IceBreakingQA();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakingQA.state == null) {
                        iceBreakingQA.state = "";
                    }
                    if (iceBreakingQA.title == null) {
                        iceBreakingQA.title = "";
                    }
                    if (iceBreakingQA.answer == null) {
                        iceBreakingQA.answer = "";
                    }
                    if (iceBreakingQA.originUserID == null) {
                        iceBreakingQA.originUserID = "";
                    }
                    if (iceBreakingQA.refMsgID != null) {
                        break;
                    }
                    iceBreakingQA.refMsgID = "";
                    break;
                }
                if (iM158752u == 10) {
                    iceBreakingQA.state = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    iceBreakingQA.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    iceBreakingQA.answer = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    iceBreakingQA.originUserID = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (iceBreakingQA.state == null) {
                            iceBreakingQA.state = "";
                        }
                        if (iceBreakingQA.title == null) {
                            iceBreakingQA.title = "";
                        }
                        if (iceBreakingQA.answer == null) {
                            iceBreakingQA.answer = "";
                        }
                        if (iceBreakingQA.originUserID == null) {
                            iceBreakingQA.originUserID = "";
                        }
                        if (iceBreakingQA.refMsgID != null) {
                            break;
                        }
                        iceBreakingQA.refMsgID = "";
                        return iceBreakingQA;
                    }
                    iceBreakingQA.refMsgID = nb5Var.m158750s();
                }
            }
            return iceBreakingQA;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakingQA iceBreakingQA, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingQA.state;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = iceBreakingQA.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = iceBreakingQA.answer;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = iceBreakingQA.originUserID;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = iceBreakingQA.refMsgID;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<IceBreakingQA> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingQA>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQA.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakingQA.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakingQA newInstance() {
            return new IceBreakingQA();
        }

        public boolean parseField(IceBreakingQA iceBreakingQA, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "answer":
                    iceBreakingQA.answer = jsonParser.getValueAsString();
                    return true;
                case "refMsgID":
                    iceBreakingQA.refMsgID = jsonParser.getValueAsString();
                    return true;
                case "state":
                    iceBreakingQA.state = jsonParser.getValueAsString();
                    return true;
                case "title":
                    iceBreakingQA.title = jsonParser.getValueAsString();
                    return true;
                case "originUserID":
                    iceBreakingQA.originUserID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IceBreakingQA iceBreakingQA, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "answer":
                case "refMsgID":
                case "state":
                case "title":
                case "originUserID":
                    return true;
                default:
                    return super.parseFieldCheck(iceBreakingQA, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakingQA iceBreakingQA, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakingQA.state;
            if (str != null) {
                jsonGenerator.writeStringField("state", str);
            }
            String str2 = iceBreakingQA.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = iceBreakingQA.answer;
            if (str3 != null) {
                jsonGenerator.writeStringField(Answer.TYPE, str3);
            }
            String str4 = iceBreakingQA.originUserID;
            if (str4 != null) {
                jsonGenerator.writeStringField("originUserID", str4);
            }
            String str5 = iceBreakingQA.refMsgID;
            if (str5 != null) {
                jsonGenerator.writeStringField("refMsgID", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingQA) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakingQA) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakingQA new_() {
        IceBreakingQA iceBreakingQA = new IceBreakingQA();
        iceBreakingQA.nullCheck();
        return iceBreakingQA;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakingQA mo223809clone() {
        IceBreakingQA iceBreakingQA = new IceBreakingQA();
        iceBreakingQA.state = this.state;
        iceBreakingQA.title = this.title;
        iceBreakingQA.answer = this.answer;
        iceBreakingQA.originUserID = this.originUserID;
        iceBreakingQA.refMsgID = this.refMsgID;
        return iceBreakingQA;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakingQA)) {
            return false;
        }
        IceBreakingQA iceBreakingQA = (IceBreakingQA) obj;
        return ValueObject.util_equals(this.state, iceBreakingQA.state) && ValueObject.util_equals(this.title, iceBreakingQA.title) && ValueObject.util_equals(this.answer, iceBreakingQA.answer) && ValueObject.util_equals(this.originUserID, iceBreakingQA.originUserID) && ValueObject.util_equals(this.refMsgID, iceBreakingQA.refMsgID);
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.answer;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.originUserID;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.refMsgID;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.answer == null) {
            this.answer = "";
        }
        if (this.originUserID == null) {
            this.originUserID = "";
        }
        if (this.refMsgID == null) {
            this.refMsgID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
