package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AuthData;
import com.p000p1.mobile.putong.data.StepSignupStage;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AuthData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "authdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String accessToken;

    @ProtobufIndex(index = 3)
    public int expiresIn;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<StepSignupStage> finishedStages;

    @NonNull
    @ProtobufIndex(index = 5)
    public SignupStage signupStage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tokenType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;
    public static ProtobufAdapter<AuthData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AuthData>() { // from class: com.p1.mobile.putong.data.AuthData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AuthData authData) {
            String str = authData.accessToken;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = authData.tokenType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, authData.expiresIn);
            String str3 = authData.userId;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            SignupStage signupStage = authData.signupStage;
            if (signupStage != null) {
                iH += CodedOutputByteBufferNano.h(5, signupStage.ordinal());
            }
            List<StepSignupStage> list = authData.finishedStages;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(6, StepSignupStage.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SignupStage signupStage2 = authData.signupStage;
            if (signupStage2 != null) {
                iH += CodedOutputByteBufferNano.l(7, signupStage2, SignupStage.PROTOBUF_ADAPTER);
            }
            List<StepSignupStage> list2 = authData.finishedStages;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(8, list2, StepSignupStage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) authData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AuthData m17727parse(nb5 nb5Var) throws IOException {
            AuthData authData = new AuthData();
            Integer numValueOf = null;
            List list = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (authData.signupStage == null && numValueOf != null) {
                        authData.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (authData.finishedStages == null && list != null) {
                        authData.finishedStages = StepSignupStage.oldEnumCovertList(list);
                    }
                    if (authData.accessToken == null) {
                        authData.accessToken = "";
                    }
                    if (authData.tokenType == null) {
                        authData.tokenType = "";
                    }
                    if (authData.userId == null) {
                        authData.userId = "";
                    }
                    if (authData.signupStage == null) {
                        authData.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                    }
                    if (authData.finishedStages != null) {
                        break;
                    }
                    authData.finishedStages = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    authData.accessToken = nb5Var.s();
                } else if (iU == 18) {
                    authData.tokenType = nb5Var.s();
                } else if (iU == 24) {
                    authData.expiresIn = nb5Var.j();
                } else if (iU == 34) {
                    authData.userId = nb5Var.s();
                } else if (iU == 40) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 50) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 58) {
                    authData.signupStage = (SignupStage) nb5Var.l(SignupStage.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 66) {
                        if (authData.signupStage == null && numValueOf != null) {
                            authData.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (authData.finishedStages == null && list != null) {
                            authData.finishedStages = StepSignupStage.oldEnumCovertList(list);
                        }
                        if (authData.accessToken == null) {
                            authData.accessToken = "";
                        }
                        if (authData.tokenType == null) {
                            authData.tokenType = "";
                        }
                        if (authData.userId == null) {
                            authData.userId = "";
                        }
                        if (authData.signupStage == null) {
                            authData.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
                        }
                        if (authData.finishedStages != null) {
                            break;
                        }
                        authData.finishedStages = new ArrayList();
                        return authData;
                    }
                    authData.finishedStages = (List) nb5Var.l(StepSignupStage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return authData;
        }

        public void serialize(AuthData authData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = authData.accessToken;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = authData.tokenType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, authData.expiresIn);
            String str3 = authData.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            SignupStage signupStage = authData.signupStage;
            if (signupStage != null) {
                codedOutputByteBufferNano.G(5, signupStage.ordinal());
            }
            List<StepSignupStage> list = authData.finishedStages;
            if (list != null) {
                codedOutputByteBufferNano.K(6, StepSignupStage.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SignupStage signupStage2 = authData.signupStage;
            if (signupStage2 != null) {
                codedOutputByteBufferNano.K(7, signupStage2, SignupStage.PROTOBUF_ADAPTER);
            }
            List<StepSignupStage> list2 = authData.finishedStages;
            if (list2 != null) {
                codedOutputByteBufferNano.K(8, list2, StepSignupStage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AuthData> JSON_ADAPTER = new ObjectJsonAdapter<AuthData>() { // from class: com.p1.mobile.putong.data.AuthData.2
        public Class getDataClass() {
            return AuthData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AuthData mo17830newInstance() {
            return new AuthData();
        }

        public boolean parseField(AuthData authData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "access_token":
                    authData.accessToken = jsonParser.getValueAsString();
                    return true;
                case "finished_stages":
                    authData.finishedStages = JsonAdapter.parseArray(jsonParser, StepSignupStage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "signup_stage":
                    authData.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "expires_in":
                    authData.expiresIn = jsonParser.getValueAsInt();
                    return true;
                case "user_id":
                    authData.userId = jsonParser.getValueAsString();
                    return true;
                case "token_type":
                    authData.tokenType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AuthData authData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "access_token":
                case "finished_stages":
                case "signup_stage":
                case "expires_in":
                case "user_id":
                case "token_type":
                    return true;
                default:
                    return super.parseFieldCheck(authData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AuthData authData, JsonGenerator jsonGenerator) throws IOException {
            String str = authData.accessToken;
            if (str != null) {
                jsonGenerator.writeStringField("access_token", str);
            }
            String str2 = authData.tokenType;
            if (str2 != null) {
                jsonGenerator.writeStringField("token_type", str2);
            }
            jsonGenerator.writeNumberField("expires_in", authData.expiresIn);
            String str3 = authData.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("user_id", str3);
            }
            if (authData.signupStage != null) {
                jsonGenerator.writeFieldName("signup_stage");
                SignupStage.JSON_ADAPTER.serialize(authData.signupStage, jsonGenerator, true);
            }
            if (authData.finishedStages != null) {
                jsonGenerator.writeFieldName("finished_stages");
                JsonAdapter.serializeArray(authData.finishedStages, jsonGenerator, StepSignupStage.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AuthData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ StepSignupStage m577a(StepSignupStage stepSignupStage) {
        return stepSignupStage;
    }

    public static AuthData new_() {
        AuthData authData = new AuthData();
        authData.nullCheck();
        return authData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AuthData m17726clone() {
        AuthData authData = new AuthData();
        authData.accessToken = this.accessToken;
        authData.tokenType = this.tokenType;
        authData.expiresIn = this.expiresIn;
        authData.userId = this.userId;
        authData.signupStage = this.signupStage;
        List<StepSignupStage> list = this.finishedStages;
        if (list != null) {
            authData.finishedStages = ValueObject.util_map(list, new w9j() { // from class: l.pd1
                public final Object call(Object obj) {
                    return AuthData.m577a((StepSignupStage) obj);
                }
            });
        }
        return authData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthData)) {
            return false;
        }
        AuthData authData = (AuthData) obj;
        return ValueObject.util_equals(this.accessToken, authData.accessToken) && ValueObject.util_equals(this.tokenType, authData.tokenType) && this.expiresIn == authData.expiresIn && ValueObject.util_equals(this.userId, authData.userId) && ValueObject.util_equals(this.signupStage, authData.signupStage) && ValueObject.util_equals(this.finishedStages, authData.finishedStages);
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
        String str = this.accessToken;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tokenType;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.expiresIn) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        SignupStage signupStage = this.signupStage;
        int iHashCode4 = (iHashCode3 + (signupStage != null ? signupStage.hashCode() : 0)) * 41;
        List<StepSignupStage> list = this.finishedStages;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.accessToken == null) {
            this.accessToken = "";
        }
        if (this.tokenType == null) {
            this.tokenType = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.signupStage == null) {
            this.signupStage = (SignupStage) SignupStage.JSON_ADAPTER.defaultEnum();
        }
        if (this.finishedStages == null) {
            this.finishedStages = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
