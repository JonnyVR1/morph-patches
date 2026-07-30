package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InterestUserSimple interestUserSimple) {
            String str = interestUserSimple.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = interestUserSimple.headImgUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            interestUserSimple.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InterestUserSimple parse(nc5 nc5Var) throws IOException {
            InterestUserSimple interestUserSimple = new InterestUserSimple();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (interestUserSimple.userId == null) {
                        interestUserSimple.userId = "";
                    }
                    if (interestUserSimple.headImgUrl != null) {
                        break;
                    }
                    interestUserSimple.headImgUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    interestUserSimple.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (interestUserSimple.userId == null) {
                            interestUserSimple.userId = "";
                        }
                        if (interestUserSimple.headImgUrl != null) {
                            break;
                        }
                        interestUserSimple.headImgUrl = "";
                        return interestUserSimple;
                    }
                    interestUserSimple.headImgUrl = nc5Var.m162495s();
                }
            }
            return interestUserSimple;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InterestUserSimple interestUserSimple, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = interestUserSimple.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = interestUserSimple.headImgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<InterestUserSimple> JSON_ADAPTER = new ObjectJsonAdapter<InterestUserSimple>() { // from class: com.p1.mobile.putong.data.InterestUserSimple.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InterestUserSimple.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InterestUserSimple newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InterestUserSimple) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InterestUserSimple) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InterestUserSimple new_() {
        InterestUserSimple interestUserSimple = new InterestUserSimple();
        interestUserSimple.nullCheck();
        return interestUserSimple;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InterestUserSimple mo225055clone() {
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.headImgUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.headImgUrl == null) {
            this.headImgUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
