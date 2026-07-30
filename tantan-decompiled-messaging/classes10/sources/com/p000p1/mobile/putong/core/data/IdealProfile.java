package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IdealProfile;
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
public class IdealProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealprofile";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f84id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> profiles;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> tagIds;
    public static ProtobufAdapter<IdealProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealProfile>() { // from class: com.p1.mobile.putong.core.data.IdealProfile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdealProfile idealProfile) {
            String str = idealProfile.f84id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = idealProfile.profiles;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = idealProfile.tagIds;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) idealProfile).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdealProfile m13421parse(nb5 nb5Var) throws IOException {
            IdealProfile idealProfile = new IdealProfile();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idealProfile.f84id == null) {
                        idealProfile.f84id = "";
                    }
                    if (idealProfile.profiles == null) {
                        idealProfile.profiles = new ArrayList();
                    }
                    if (idealProfile.tagIds != null) {
                        break;
                    }
                    idealProfile.tagIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    idealProfile.f84id = nb5Var.s();
                } else if (iU == 18) {
                    idealProfile.profiles = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (idealProfile.f84id == null) {
                            idealProfile.f84id = "";
                        }
                        if (idealProfile.profiles == null) {
                            idealProfile.profiles = new ArrayList();
                        }
                        if (idealProfile.tagIds != null) {
                            break;
                        }
                        idealProfile.tagIds = new ArrayList();
                        return idealProfile;
                    }
                    idealProfile.tagIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealProfile;
        }

        public void serialize(IdealProfile idealProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealProfile.f84id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = idealProfile.profiles;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = idealProfile.tagIds;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealProfile> JSON_ADAPTER = new ObjectJsonAdapter<IdealProfile>() { // from class: com.p1.mobile.putong.core.data.IdealProfile.2
        public Class getDataClass() {
            return IdealProfile.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IdealProfile m13422newInstance() {
            return new IdealProfile();
        }

        public boolean parseField(IdealProfile idealProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profiles":
                    idealProfile.profiles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tagIds":
                    idealProfile.tagIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    idealProfile.f84id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealProfile idealProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "profiles":
                case "tagIds":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(idealProfile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IdealProfile idealProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = idealProfile.f84id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (idealProfile.profiles != null) {
                jsonGenerator.writeFieldName("profiles");
                JsonAdapter.serializeArray(idealProfile.profiles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (idealProfile.tagIds != null) {
                jsonGenerator.writeFieldName("tagIds");
                JsonAdapter.serializeArray(idealProfile.tagIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m407a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m408b(String str) {
        return str;
    }

    public static IdealProfile new_() {
        IdealProfile idealProfile = new IdealProfile();
        idealProfile.nullCheck();
        return idealProfile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdealProfile m13420clone() {
        IdealProfile idealProfile = new IdealProfile();
        idealProfile.f84id = this.f84id;
        List<String> list = this.profiles;
        if (list != null) {
            idealProfile.profiles = ValueObject.util_map(list, new w9j() { // from class: l.xbm
                public final Object call(Object obj) {
                    return IdealProfile.m407a((String) obj);
                }
            });
        }
        List<String> list2 = this.tagIds;
        if (list2 != null) {
            idealProfile.tagIds = ValueObject.util_map(list2, new w9j() { // from class: l.ybm
                public final Object call(Object obj) {
                    return IdealProfile.m408b((String) obj);
                }
            });
        }
        return idealProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealProfile)) {
            return false;
        }
        IdealProfile idealProfile = (IdealProfile) obj;
        return ValueObject.util_equals(this.f84id, idealProfile.f84id) && ValueObject.util_equals(this.profiles, idealProfile.profiles) && ValueObject.util_equals(this.tagIds, idealProfile.tagIds);
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
        String str = this.f84id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.profiles;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tagIds;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f84id == null) {
            this.f84id = "";
        }
        if (this.profiles == null) {
            this.profiles = new ArrayList();
        }
        if (this.tagIds == null) {
            this.tagIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
