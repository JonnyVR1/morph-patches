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
public class ThirdPartyEmail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartyemail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appleEmail;

    @NonNull
    @ProtobufIndex(index = 2)
    public String googleEmail;
    public static ProtobufAdapter<ThirdPartyEmail> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyEmail>() { // from class: com.p1.mobile.putong.data.ThirdPartyEmail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartyEmail thirdPartyEmail) {
            String str = thirdPartyEmail.appleEmail;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) thirdPartyEmail).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartyEmail m19100parse(nb5 nb5Var) throws IOException {
            ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thirdPartyEmail.appleEmail == null) {
                        thirdPartyEmail.appleEmail = "";
                    }
                    if (thirdPartyEmail.googleEmail != null) {
                        break;
                    }
                    thirdPartyEmail.googleEmail = "";
                    break;
                }
                if (iU == 10) {
                    thirdPartyEmail.appleEmail = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (thirdPartyEmail.appleEmail == null) {
                            thirdPartyEmail.appleEmail = "";
                        }
                        if (thirdPartyEmail.googleEmail != null) {
                            break;
                        }
                        thirdPartyEmail.googleEmail = "";
                        return thirdPartyEmail;
                    }
                    thirdPartyEmail.googleEmail = nb5Var.s();
                }
            }
            return thirdPartyEmail;
        }

        public void serialize(ThirdPartyEmail thirdPartyEmail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyEmail.appleEmail;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ThirdPartyEmail> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyEmail>() { // from class: com.p1.mobile.putong.data.ThirdPartyEmail.2
        public Class getDataClass() {
            return ThirdPartyEmail.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ThirdPartyEmail mo17830newInstance() {
            return new ThirdPartyEmail();
        }

        public boolean parseField(ThirdPartyEmail thirdPartyEmail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("appleEmail")) {
                thirdPartyEmail.appleEmail = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("googleEmail")) {
                return false;
            }
            thirdPartyEmail.googleEmail = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ThirdPartyEmail thirdPartyEmail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("appleEmail") || str.equals("googleEmail")) {
                return true;
            }
            return super.parseFieldCheck(thirdPartyEmail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartyEmail thirdPartyEmail, JsonGenerator jsonGenerator) throws IOException {
            String str = thirdPartyEmail.appleEmail;
            if (str != null) {
                jsonGenerator.writeStringField("appleEmail", str);
            }
            String str2 = thirdPartyEmail.googleEmail;
            if (str2 != null) {
                jsonGenerator.writeStringField("googleEmail", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyEmail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyEmail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyEmail new_() {
        ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
        thirdPartyEmail.nullCheck();
        return thirdPartyEmail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartyEmail m19099clone() {
        ThirdPartyEmail thirdPartyEmail = new ThirdPartyEmail();
        thirdPartyEmail.appleEmail = this.appleEmail;
        thirdPartyEmail.googleEmail = this.googleEmail;
        return thirdPartyEmail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartyEmail)) {
            return false;
        }
        ThirdPartyEmail thirdPartyEmail = (ThirdPartyEmail) obj;
        return ValueObject.util_equals(this.appleEmail, thirdPartyEmail.appleEmail) && ValueObject.util_equals(this.googleEmail, thirdPartyEmail.googleEmail);
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
        String str = this.appleEmail;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.googleEmail;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.appleEmail == null) {
            this.appleEmail = "";
        }
        if (this.googleEmail == null) {
            this.googleEmail = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
