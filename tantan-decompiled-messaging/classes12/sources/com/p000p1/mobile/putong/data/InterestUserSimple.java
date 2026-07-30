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
public class InterestUserSimple extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "interestusersimple";

    @NonNull
    @ProtobufIndex(index = 2)
    public String headImgUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<InterestUserSimple> PROTOBUF_ADAPTER = new MessageNanoAdapter<InterestUserSimple>() { // from class: com.p1.mobile.putong.data.InterestUserSimple.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InterestUserSimple interestUserSimple) {
            String str = interestUserSimple.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = interestUserSimple.headImgUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) interestUserSimple).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InterestUserSimple m18226parse(nb5 nb5Var) throws IOException {
            InterestUserSimple interestUserSimple = new InterestUserSimple();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (interestUserSimple.userId == null) {
                        interestUserSimple.userId = "";
                    }
                    if (interestUserSimple.headImgUrl != null) {
                        break;
                    }
                    interestUserSimple.headImgUrl = "";
                    break;
                }
                if (iU == 10) {
                    interestUserSimple.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (interestUserSimple.userId == null) {
                            interestUserSimple.userId = "";
                        }
                        if (interestUserSimple.headImgUrl != null) {
                            break;
                        }
                        interestUserSimple.headImgUrl = "";
                        return interestUserSimple;
                    }
                    interestUserSimple.headImgUrl = nb5Var.s();
                }
            }
            return interestUserSimple;
        }

        public void serialize(InterestUserSimple interestUserSimple, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = interestUserSimple.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = interestUserSimple.headImgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<InterestUserSimple> JSON_ADAPTER = new ObjectJsonAdapter<InterestUserSimple>() { // from class: com.p1.mobile.putong.data.InterestUserSimple.2
        public Class getDataClass() {
            return InterestUserSimple.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public InterestUserSimple mo17830newInstance() {
            return new InterestUserSimple();
        }

        public boolean parseField(InterestUserSimple interestUserSimple, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                interestUserSimple.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("headImgUrl")) {
                return false;
            }
            interestUserSimple.headImgUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(InterestUserSimple interestUserSimple, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("headImgUrl")) {
                return true;
            }
            return super.parseFieldCheck(interestUserSimple, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InterestUserSimple interestUserSimple, JsonGenerator jsonGenerator) throws IOException {
            String str = interestUserSimple.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = interestUserSimple.headImgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("headImgUrl", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InterestUserSimple) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InterestUserSimple) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InterestUserSimple new_() {
        InterestUserSimple interestUserSimple = new InterestUserSimple();
        interestUserSimple.nullCheck();
        return interestUserSimple;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterestUserSimple m18225clone() {
        InterestUserSimple interestUserSimple = new InterestUserSimple();
        interestUserSimple.userId = this.userId;
        interestUserSimple.headImgUrl = this.headImgUrl;
        return interestUserSimple;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterestUserSimple)) {
            return false;
        }
        InterestUserSimple interestUserSimple = (InterestUserSimple) obj;
        return ValueObject.util_equals(this.userId, interestUserSimple.userId) && ValueObject.util_equals(this.headImgUrl, interestUserSimple.headImgUrl);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.headImgUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.headImgUrl == null) {
            this.headImgUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
