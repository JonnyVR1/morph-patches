package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.ProfileMate;
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
public class ProfileMate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilemate";

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> declaration;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> familyBackground;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> hobbies;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> idealPartner;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> loveView;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> viewsQuestionId;
    public static ProtobufAdapter<ProfileMate> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileMate>() { // from class: com.p1.mobile.putong.data.ProfileMate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileMate profileMate) {
            List<String> list = profileMate.loveView;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = profileMate.familyBackground;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileMate.idealPartner;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileMate.hobbies;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileMate.declaration;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileMate.viewsQuestionId;
            if (list6 != null) {
                iL += CodedOutputByteBufferNano.l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileMate).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileMate m18850parse(nb5 nb5Var) throws IOException {
            ProfileMate profileMate = new ProfileMate();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileMate.loveView == null) {
                        profileMate.loveView = new ArrayList();
                    }
                    if (profileMate.familyBackground == null) {
                        profileMate.familyBackground = new ArrayList();
                    }
                    if (profileMate.idealPartner == null) {
                        profileMate.idealPartner = new ArrayList();
                    }
                    if (profileMate.hobbies == null) {
                        profileMate.hobbies = new ArrayList();
                    }
                    if (profileMate.declaration == null) {
                        profileMate.declaration = new ArrayList();
                    }
                    if (profileMate.viewsQuestionId != null) {
                        break;
                    }
                    profileMate.viewsQuestionId = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    profileMate.loveView = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    profileMate.familyBackground = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    profileMate.idealPartner = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    profileMate.hobbies = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    profileMate.declaration = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
                        if (profileMate.loveView == null) {
                            profileMate.loveView = new ArrayList();
                        }
                        if (profileMate.familyBackground == null) {
                            profileMate.familyBackground = new ArrayList();
                        }
                        if (profileMate.idealPartner == null) {
                            profileMate.idealPartner = new ArrayList();
                        }
                        if (profileMate.hobbies == null) {
                            profileMate.hobbies = new ArrayList();
                        }
                        if (profileMate.declaration == null) {
                            profileMate.declaration = new ArrayList();
                        }
                        if (profileMate.viewsQuestionId != null) {
                            break;
                        }
                        profileMate.viewsQuestionId = new ArrayList();
                        return profileMate;
                    }
                    profileMate.viewsQuestionId = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileMate;
        }

        public void serialize(ProfileMate profileMate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = profileMate.loveView;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = profileMate.familyBackground;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = profileMate.idealPartner;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = profileMate.hobbies;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = profileMate.declaration;
            if (list5 != null) {
                codedOutputByteBufferNano.K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = profileMate.viewsQuestionId;
            if (list6 != null) {
                codedOutputByteBufferNano.K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileMate> JSON_ADAPTER = new ObjectJsonAdapter<ProfileMate>() { // from class: com.p1.mobile.putong.data.ProfileMate.2
        public Class getDataClass() {
            return ProfileMate.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ProfileMate mo17830newInstance() {
            return new ProfileMate();
        }

        public boolean parseField(ProfileMate profileMate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "declaration":
                    profileMate.declaration = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "loveView":
                    profileMate.loveView = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "familyBackground":
                    profileMate.familyBackground = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "idealPartner":
                    profileMate.idealPartner = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "viewsQuestionId":
                    profileMate.viewsQuestionId = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hobbies":
                    profileMate.hobbies = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileMate profileMate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "declaration":
                case "loveView":
                case "familyBackground":
                case "idealPartner":
                case "viewsQuestionId":
                case "hobbies":
                    return true;
                default:
                    return super.parseFieldCheck(profileMate, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileMate profileMate, JsonGenerator jsonGenerator) throws IOException {
            if (profileMate.loveView != null) {
                jsonGenerator.writeFieldName("loveView");
                JsonAdapter.serializeArray(profileMate.loveView, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileMate.familyBackground != null) {
                jsonGenerator.writeFieldName("familyBackground");
                JsonAdapter.serializeArray(profileMate.familyBackground, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileMate.idealPartner != null) {
                jsonGenerator.writeFieldName("idealPartner");
                JsonAdapter.serializeArray(profileMate.idealPartner, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileMate.hobbies != null) {
                jsonGenerator.writeFieldName("hobbies");
                JsonAdapter.serializeArray(profileMate.hobbies, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileMate.declaration != null) {
                jsonGenerator.writeFieldName("declaration");
                JsonAdapter.serializeArray(profileMate.declaration, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (profileMate.viewsQuestionId != null) {
                jsonGenerator.writeFieldName("viewsQuestionId");
                JsonAdapter.serializeArray(profileMate.viewsQuestionId, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileMate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileMate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m964a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m965b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m966c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m967d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m968e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m969f(String str) {
        return str;
    }

    public static ProfileMate new_() {
        ProfileMate profileMate = new ProfileMate();
        profileMate.nullCheck();
        return profileMate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileMate m18849clone() {
        ProfileMate profileMate = new ProfileMate();
        List<String> list = this.loveView;
        if (list != null) {
            profileMate.loveView = ValueObject.util_map(list, new w9j() { // from class: l.hna0
                public final Object call(Object obj) {
                    return ProfileMate.m967d((String) obj);
                }
            });
        }
        List<String> list2 = this.familyBackground;
        if (list2 != null) {
            profileMate.familyBackground = ValueObject.util_map(list2, new w9j() { // from class: l.ina0
                public final Object call(Object obj) {
                    return ProfileMate.m969f((String) obj);
                }
            });
        }
        List<String> list3 = this.idealPartner;
        if (list3 != null) {
            profileMate.idealPartner = ValueObject.util_map(list3, new w9j() { // from class: l.jna0
                public final Object call(Object obj) {
                    return ProfileMate.m968e((String) obj);
                }
            });
        }
        List<String> list4 = this.hobbies;
        if (list4 != null) {
            profileMate.hobbies = ValueObject.util_map(list4, new w9j() { // from class: l.kna0
                public final Object call(Object obj) {
                    return ProfileMate.m966c((String) obj);
                }
            });
        }
        List<String> list5 = this.declaration;
        if (list5 != null) {
            profileMate.declaration = ValueObject.util_map(list5, new w9j() { // from class: l.lna0
                public final Object call(Object obj) {
                    return ProfileMate.m965b((String) obj);
                }
            });
        }
        List<String> list6 = this.viewsQuestionId;
        if (list6 != null) {
            profileMate.viewsQuestionId = ValueObject.util_map(list6, new w9j() { // from class: l.mna0
                public final Object call(Object obj) {
                    return ProfileMate.m964a((String) obj);
                }
            });
        }
        return profileMate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileMate)) {
            return false;
        }
        ProfileMate profileMate = (ProfileMate) obj;
        return ValueObject.util_equals(this.loveView, profileMate.loveView) && ValueObject.util_equals(this.familyBackground, profileMate.familyBackground) && ValueObject.util_equals(this.idealPartner, profileMate.idealPartner) && ValueObject.util_equals(this.hobbies, profileMate.hobbies) && ValueObject.util_equals(this.declaration, profileMate.declaration) && ValueObject.util_equals(this.viewsQuestionId, profileMate.viewsQuestionId);
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
        List<String> list = this.loveView;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.familyBackground;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.idealPartner;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.hobbies;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.declaration;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.viewsQuestionId;
        int iHashCode6 = iHashCode5 + (list6 != null ? list6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.loveView == null) {
            this.loveView = new ArrayList();
        }
        if (this.familyBackground == null) {
            this.familyBackground = new ArrayList();
        }
        if (this.idealPartner == null) {
            this.idealPartner = new ArrayList();
        }
        if (this.hobbies == null) {
            this.hobbies = new ArrayList();
        }
        if (this.declaration == null) {
            this.declaration = new ArrayList();
        }
        if (this.viewsQuestionId == null) {
            this.viewsQuestionId = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
