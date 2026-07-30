package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ProfileGoodcPhotoRules;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProfileGoodcPhotoRules extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcphotorules";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<Integer> facebook;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Integer> real_user;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> vip;
    public static ProtobufAdapter<ProfileGoodcPhotoRules> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcPhotoRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoRules.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcPhotoRules profileGoodcPhotoRules) {
            List<Integer> list = profileGoodcPhotoRules.vip;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Integer> list2 = profileGoodcPhotoRules.real_user;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list3 = profileGoodcPhotoRules.facebook;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileGoodcPhotoRules).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcPhotoRules m14965parse(nb5 nb5Var) throws IOException {
            ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodcPhotoRules.vip == null) {
                        profileGoodcPhotoRules.vip = new ArrayList();
                    }
                    if (profileGoodcPhotoRules.real_user == null) {
                        profileGoodcPhotoRules.real_user = new ArrayList();
                    }
                    if (profileGoodcPhotoRules.facebook != null) {
                        break;
                    }
                    profileGoodcPhotoRules.facebook = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    profileGoodcPhotoRules.vip = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    profileGoodcPhotoRules.real_user = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (profileGoodcPhotoRules.vip == null) {
                            profileGoodcPhotoRules.vip = new ArrayList();
                        }
                        if (profileGoodcPhotoRules.real_user == null) {
                            profileGoodcPhotoRules.real_user = new ArrayList();
                        }
                        if (profileGoodcPhotoRules.facebook != null) {
                            break;
                        }
                        profileGoodcPhotoRules.facebook = new ArrayList();
                        return profileGoodcPhotoRules;
                    }
                    profileGoodcPhotoRules.facebook = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileGoodcPhotoRules;
        }

        public void serialize(ProfileGoodcPhotoRules profileGoodcPhotoRules, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = profileGoodcPhotoRules.vip;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = profileGoodcPhotoRules.real_user;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list3 = profileGoodcPhotoRules.facebook;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileGoodcPhotoRules> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcPhotoRules>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoRules.2
        public Class getDataClass() {
            return ProfileGoodcPhotoRules.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcPhotoRules m14966newInstance() {
            return new ProfileGoodcPhotoRules();
        }

        public boolean parseField(ProfileGoodcPhotoRules profileGoodcPhotoRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "real_user":
                    profileGoodcPhotoRules.real_user = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "vip":
                    profileGoodcPhotoRules.vip = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "facebook":
                    profileGoodcPhotoRules.facebook = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileGoodcPhotoRules profileGoodcPhotoRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "real_user":
                case "vip":
                case "facebook":
                    return true;
                default:
                    return super.parseFieldCheck(profileGoodcPhotoRules, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileGoodcPhotoRules profileGoodcPhotoRules, JsonGenerator jsonGenerator) throws IOException {
            if (profileGoodcPhotoRules.vip != null) {
                jsonGenerator.writeFieldName("vip");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.vip, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (profileGoodcPhotoRules.real_user != null) {
                jsonGenerator.writeFieldName("real_user");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.real_user, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (profileGoodcPhotoRules.facebook != null) {
                jsonGenerator.writeFieldName("facebook");
                JsonAdapter.serializeArray(profileGoodcPhotoRules.facebook, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcPhotoRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcPhotoRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m566a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m567b(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m568c(Integer num) {
        return num;
    }

    public static ProfileGoodcPhotoRules new_() {
        ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
        profileGoodcPhotoRules.nullCheck();
        return profileGoodcPhotoRules;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcPhotoRules m14964clone() {
        ProfileGoodcPhotoRules profileGoodcPhotoRules = new ProfileGoodcPhotoRules();
        List<Integer> list = this.vip;
        if (list != null) {
            profileGoodcPhotoRules.vip = ValueObject.util_map(list, new w9j() { // from class: l.wm90
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m567b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.real_user;
        if (list2 != null) {
            profileGoodcPhotoRules.real_user = ValueObject.util_map(list2, new w9j() { // from class: l.xm90
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m568c((Integer) obj);
                }
            });
        }
        List<Integer> list3 = this.facebook;
        if (list3 != null) {
            profileGoodcPhotoRules.facebook = ValueObject.util_map(list3, new w9j() { // from class: l.ym90
                public final Object call(Object obj) {
                    return ProfileGoodcPhotoRules.m566a((Integer) obj);
                }
            });
        }
        return profileGoodcPhotoRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcPhotoRules)) {
            return false;
        }
        ProfileGoodcPhotoRules profileGoodcPhotoRules = (ProfileGoodcPhotoRules) obj;
        return ValueObject.util_equals(this.vip, profileGoodcPhotoRules.vip) && ValueObject.util_equals(this.real_user, profileGoodcPhotoRules.real_user) && ValueObject.util_equals(this.facebook, profileGoodcPhotoRules.facebook);
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
        List<Integer> list = this.vip;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.real_user;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.facebook;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.vip == null) {
            this.vip = new ArrayList();
        }
        if (this.real_user == null) {
            this.real_user = new ArrayList();
        }
        if (this.facebook == null) {
            this.facebook = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
