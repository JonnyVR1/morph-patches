package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.IdealProfile;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.data.IdealTag;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IdealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<IdealTag> fitIdealDetails;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IdealTag> fitIdeals;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<IdealTag> highlightIdeals;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<UserTagData> highlightProfileTags;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> highlightProfiles;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21163id;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<IdealProfile> idealProfiles;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<UserTagData> profileTags;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<IdealTag> targetFitIdeals;
    public static ProtobufAdapter<IdealInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealInfo>() { // from class: com.p1.mobile.putong.core.data.IdealInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealInfo idealInfo) {
            String str = idealInfo.f21163id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<IdealTag> list = idealInfo.fitIdeals;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list2 = idealInfo.fitIdealDetails;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = idealInfo.highlightProfiles;
            if (list3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list4 = idealInfo.highlightIdeals;
            if (list4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, list4, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list5 = idealInfo.targetFitIdeals;
            if (list5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list5, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealProfile> list6 = idealInfo.idealProfiles;
            if (list6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, list6, IdealProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserTagData> list7 = idealInfo.profileTags;
            if (list7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(8, list7, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserTagData> list8 = idealInfo.highlightProfileTags;
            if (list8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(9, list8, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            idealInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealInfo parse(nc5 nc5Var) throws IOException {
            IdealInfo idealInfo = new IdealInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idealInfo.f21163id == null) {
                        idealInfo.f21163id = "";
                    }
                    if (idealInfo.fitIdeals == null) {
                        idealInfo.fitIdeals = new ArrayList();
                    }
                    if (idealInfo.fitIdealDetails == null) {
                        idealInfo.fitIdealDetails = new ArrayList();
                    }
                    if (idealInfo.highlightProfiles == null) {
                        idealInfo.highlightProfiles = new ArrayList();
                    }
                    if (idealInfo.highlightIdeals == null) {
                        idealInfo.highlightIdeals = new ArrayList();
                    }
                    if (idealInfo.targetFitIdeals == null) {
                        idealInfo.targetFitIdeals = new ArrayList();
                    }
                    if (idealInfo.idealProfiles == null) {
                        idealInfo.idealProfiles = new ArrayList();
                    }
                    if (idealInfo.profileTags == null) {
                        idealInfo.profileTags = new ArrayList();
                    }
                    if (idealInfo.highlightProfileTags != null) {
                        break;
                    }
                    idealInfo.highlightProfileTags = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    idealInfo.f21163id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    idealInfo.fitIdeals = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    idealInfo.fitIdealDetails = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 34) {
                    idealInfo.highlightProfiles = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    idealInfo.highlightIdeals = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 50) {
                    idealInfo.targetFitIdeals = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 58) {
                    idealInfo.idealProfiles = (List) nc5Var.m162488l(IdealProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 66) {
                    idealInfo.profileTags = (List) nc5Var.m162488l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 74) {
                        if (idealInfo.f21163id == null) {
                            idealInfo.f21163id = "";
                        }
                        if (idealInfo.fitIdeals == null) {
                            idealInfo.fitIdeals = new ArrayList();
                        }
                        if (idealInfo.fitIdealDetails == null) {
                            idealInfo.fitIdealDetails = new ArrayList();
                        }
                        if (idealInfo.highlightProfiles == null) {
                            idealInfo.highlightProfiles = new ArrayList();
                        }
                        if (idealInfo.highlightIdeals == null) {
                            idealInfo.highlightIdeals = new ArrayList();
                        }
                        if (idealInfo.targetFitIdeals == null) {
                            idealInfo.targetFitIdeals = new ArrayList();
                        }
                        if (idealInfo.idealProfiles == null) {
                            idealInfo.idealProfiles = new ArrayList();
                        }
                        if (idealInfo.profileTags == null) {
                            idealInfo.profileTags = new ArrayList();
                        }
                        if (idealInfo.highlightProfileTags != null) {
                            break;
                        }
                        idealInfo.highlightProfileTags = new ArrayList();
                        return idealInfo;
                    }
                    idealInfo.highlightProfileTags = (List) nc5Var.m162488l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealInfo idealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealInfo.f21163id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<IdealTag> list = idealInfo.fitIdeals;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list2 = idealInfo.fitIdealDetails;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = idealInfo.highlightProfiles;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list4 = idealInfo.highlightIdeals;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(5, list4, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list5 = idealInfo.targetFitIdeals;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(6, list5, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealProfile> list6 = idealInfo.idealProfiles;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(7, list6, IdealProfile.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserTagData> list7 = idealInfo.profileTags;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(8, list7, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserTagData> list8 = idealInfo.highlightProfileTags;
            if (list8 != null) {
                codedOutputByteBufferNano.m17309K(9, list8, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdealInfo>() { // from class: com.p1.mobile.putong.core.data.IdealInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealInfo newInstance() {
            return new IdealInfo();
        }

        public boolean parseField(IdealInfo idealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "highlightIdeals":
                    idealInfo.highlightIdeals = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "targetFitIdeals":
                    idealInfo.targetFitIdeals = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    idealInfo.f21163id = jsonParser.getValueAsString();
                    return false;
                case "fitIdealDetails":
                    idealInfo.fitIdealDetails = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "highlightProfileTags":
                    idealInfo.highlightProfileTags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "profileTags":
                    idealInfo.profileTags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "highlightProfiles":
                    idealInfo.highlightProfiles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "fitIdeals":
                    idealInfo.fitIdeals = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "idealProfiles":
                    idealInfo.idealProfiles = JsonAdapter.parseArray(jsonParser, IdealProfile.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealInfo idealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "highlightIdeals":
                case "targetFitIdeals":
                    return true;
                case "id":
                    return false;
                case "fitIdealDetails":
                case "highlightProfileTags":
                case "profileTags":
                case "highlightProfiles":
                case "fitIdeals":
                case "idealProfiles":
                    return true;
                default:
                    return super.parseFieldCheck(idealInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealInfo idealInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = idealInfo.f21163id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (idealInfo.fitIdeals != null) {
                jsonGenerator.writeFieldName("fitIdeals");
                JsonAdapter.serializeArray(idealInfo.fitIdeals, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (idealInfo.fitIdealDetails != null) {
                jsonGenerator.writeFieldName("fitIdealDetails");
                JsonAdapter.serializeArray(idealInfo.fitIdealDetails, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (idealInfo.highlightProfiles != null) {
                jsonGenerator.writeFieldName("highlightProfiles");
                JsonAdapter.serializeArray(idealInfo.highlightProfiles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (idealInfo.highlightIdeals != null) {
                jsonGenerator.writeFieldName("highlightIdeals");
                JsonAdapter.serializeArray(idealInfo.highlightIdeals, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (idealInfo.targetFitIdeals != null) {
                jsonGenerator.writeFieldName("targetFitIdeals");
                JsonAdapter.serializeArray(idealInfo.targetFitIdeals, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
            if (idealInfo.idealProfiles != null) {
                jsonGenerator.writeFieldName("idealProfiles");
                JsonAdapter.serializeArray(idealInfo.idealProfiles, jsonGenerator, IdealProfile.JSON_ADAPTER);
            }
            if (idealInfo.profileTags != null) {
                jsonGenerator.writeFieldName("profileTags");
                JsonAdapter.serializeArray(idealInfo.profileTags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
            if (idealInfo.highlightProfileTags != null) {
                jsonGenerator.writeFieldName("highlightProfileTags");
                JsonAdapter.serializeArray(idealInfo.highlightProfileTags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36602c(String str) {
        return str;
    }

    public static IdealInfo new_() {
        IdealInfo idealInfo = new IdealInfo();
        idealInfo.nullCheck();
        return idealInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealInfo mo225055clone() {
        IdealInfo idealInfo = new IdealInfo();
        idealInfo.f21163id = this.f21163id;
        List<IdealTag> list = this.fitIdeals;
        if (list != null) {
            idealInfo.fitIdeals = ValueObject.util_map(list, new qcj() { // from class: l.fem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        List<IdealTag> list2 = this.fitIdealDetails;
        if (list2 != null) {
            idealInfo.fitIdealDetails = ValueObject.util_map(list2, new qcj() { // from class: l.gem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        List<String> list3 = this.highlightProfiles;
        if (list3 != null) {
            idealInfo.highlightProfiles = ValueObject.util_map(list3, new qcj() { // from class: l.hem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IdealInfo.m36602c((String) obj);
                }
            });
        }
        List<IdealTag> list4 = this.highlightIdeals;
        if (list4 != null) {
            idealInfo.highlightIdeals = ValueObject.util_map(list4, new qcj() { // from class: l.iem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        List<IdealTag> list5 = this.targetFitIdeals;
        if (list5 != null) {
            idealInfo.targetFitIdeals = ValueObject.util_map(list5, new qcj() { // from class: l.jem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        List<IdealProfile> list6 = this.idealProfiles;
        if (list6 != null) {
            idealInfo.idealProfiles = ValueObject.util_map(list6, new qcj() { // from class: l.kem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealProfile) obj).mo225055clone();
                }
            });
        }
        List<UserTagData> list7 = this.profileTags;
        if (list7 != null) {
            idealInfo.profileTags = ValueObject.util_map(list7, new qcj() { // from class: l.lem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserTagData) obj).mo225055clone();
                }
            });
        }
        List<UserTagData> list8 = this.highlightProfileTags;
        if (list8 != null) {
            idealInfo.highlightProfileTags = ValueObject.util_map(list8, new qcj() { // from class: l.mem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserTagData) obj).mo225055clone();
                }
            });
        }
        return idealInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealInfo)) {
            return false;
        }
        IdealInfo idealInfo = (IdealInfo) obj;
        return ValueObject.util_equals(this.f21163id, idealInfo.f21163id) && ValueObject.util_equals(this.fitIdeals, idealInfo.fitIdeals) && ValueObject.util_equals(this.fitIdealDetails, idealInfo.fitIdealDetails) && ValueObject.util_equals(this.highlightProfiles, idealInfo.highlightProfiles) && ValueObject.util_equals(this.highlightIdeals, idealInfo.highlightIdeals) && ValueObject.util_equals(this.targetFitIdeals, idealInfo.targetFitIdeals) && ValueObject.util_equals(this.idealProfiles, idealInfo.idealProfiles) && ValueObject.util_equals(this.profileTags, idealInfo.profileTags) && ValueObject.util_equals(this.highlightProfileTags, idealInfo.highlightProfileTags);
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
        String str = this.f21163id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<IdealTag> list = this.fitIdeals;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<IdealTag> list2 = this.fitIdealDetails;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.highlightProfiles;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<IdealTag> list4 = this.highlightIdeals;
        int iHashCode5 = (iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<IdealTag> list5 = this.targetFitIdeals;
        int iHashCode6 = (iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<IdealProfile> list6 = this.idealProfiles;
        int iHashCode7 = (iHashCode6 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<UserTagData> list7 = this.profileTags;
        int iHashCode8 = (iHashCode7 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<UserTagData> list8 = this.highlightProfileTags;
        int iHashCode9 = iHashCode8 + (list8 != null ? list8.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21163id == null) {
            this.f21163id = "";
        }
        if (this.fitIdeals == null) {
            this.fitIdeals = new ArrayList();
        }
        if (this.fitIdealDetails == null) {
            this.fitIdealDetails = new ArrayList();
        }
        if (this.highlightProfiles == null) {
            this.highlightProfiles = new ArrayList();
        }
        if (this.highlightIdeals == null) {
            this.highlightIdeals = new ArrayList();
        }
        if (this.targetFitIdeals == null) {
            this.targetFitIdeals = new ArrayList();
        }
        if (this.idealProfiles == null) {
            this.idealProfiles = new ArrayList();
        }
        if (this.profileTags == null) {
            this.profileTags = new ArrayList();
        }
        if (this.highlightProfileTags == null) {
            this.highlightProfileTags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
