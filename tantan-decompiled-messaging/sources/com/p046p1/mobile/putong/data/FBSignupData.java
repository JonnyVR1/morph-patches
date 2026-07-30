package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.FBEducation;
import com.p046p1.mobile.putong.data.FBWork;
import com.p046p1.mobile.putong.data.Tag;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class FBSignupData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbsignupdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String about;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<FBEducation> education;

    @NonNull
    @ProtobufIndex(index = 2)
    public FBPage hometown;

    @NonNull
    @ProtobufIndex(index = 3)
    public FBPage location;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Tag> pages;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<FBWork> work;
    public static ProtobufAdapter<FBSignupData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBSignupData>() { // from class: com.p1.mobile.putong.data.FBSignupData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBSignupData fBSignupData) {
            String str = fBSignupData.about;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            FBPage fBPage = fBSignupData.hometown;
            if (fBPage != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBSignupData.location;
            if (fBPage2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBEducation> list = fBSignupData.education;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBWork> list2 = fBSignupData.work;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list2, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Tag> list3 = fBSignupData.pages;
            if (list3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list3, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            fBSignupData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBSignupData parse(nb5 nb5Var) throws IOException {
            FBSignupData fBSignupData = new FBSignupData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fBSignupData.about == null) {
                        fBSignupData.about = "";
                    }
                    if (fBSignupData.hometown == null) {
                        fBSignupData.hometown = FBPage.new_();
                    }
                    if (fBSignupData.location == null) {
                        fBSignupData.location = FBPage.new_();
                    }
                    if (fBSignupData.education == null) {
                        fBSignupData.education = new ArrayList();
                    }
                    if (fBSignupData.work == null) {
                        fBSignupData.work = new ArrayList();
                    }
                    if (fBSignupData.pages != null) {
                        break;
                    }
                    fBSignupData.pages = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    fBSignupData.about = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    fBSignupData.hometown = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    fBSignupData.location = (FBPage) nb5Var.m158743l(FBPage.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    fBSignupData.education = (List) nb5Var.m158743l(FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    fBSignupData.work = (List) nb5Var.m158743l(FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (fBSignupData.about == null) {
                            fBSignupData.about = "";
                        }
                        if (fBSignupData.hometown == null) {
                            fBSignupData.hometown = FBPage.new_();
                        }
                        if (fBSignupData.location == null) {
                            fBSignupData.location = FBPage.new_();
                        }
                        if (fBSignupData.education == null) {
                            fBSignupData.education = new ArrayList();
                        }
                        if (fBSignupData.work == null) {
                            fBSignupData.work = new ArrayList();
                        }
                        if (fBSignupData.pages != null) {
                            break;
                        }
                        fBSignupData.pages = new ArrayList();
                        return fBSignupData;
                    }
                    fBSignupData.pages = (List) nb5Var.m158743l(Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return fBSignupData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBSignupData fBSignupData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBSignupData.about;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            FBPage fBPage = fBSignupData.hometown;
            if (fBPage != null) {
                codedOutputByteBufferNano.m17254K(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBSignupData.location;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.m17254K(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBEducation> list = fBSignupData.education;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBWork> list2 = fBSignupData.work;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Tag> list3 = fBSignupData.pages;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(6, list3, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FBSignupData> JSON_ADAPTER = new ObjectJsonAdapter<FBSignupData>() { // from class: com.p1.mobile.putong.data.FBSignupData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBSignupData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBSignupData newInstance() {
            return new FBSignupData();
        }

        public boolean parseField(FBSignupData fBSignupData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hometown":
                    fBSignupData.hometown = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "education":
                    fBSignupData.education = JsonAdapter.parseArray(jsonParser, FBEducation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "work":
                    fBSignupData.work = JsonAdapter.parseArray(jsonParser, FBWork.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "about":
                    fBSignupData.about = jsonParser.getValueAsString();
                    return true;
                case "pages":
                    fBSignupData.pages = JsonAdapter.parseArray(jsonParser, Tag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "location":
                    fBSignupData.location = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBSignupData fBSignupData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hometown":
                case "education":
                case "work":
                case "about":
                case "pages":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(fBSignupData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBSignupData fBSignupData, JsonGenerator jsonGenerator) throws IOException {
            String str = fBSignupData.about;
            if (str != null) {
                jsonGenerator.writeStringField("about", str);
            }
            if (fBSignupData.hometown != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.hometown);
                FBPage.JSON_ADAPTER.serialize(fBSignupData.hometown, jsonGenerator, true);
            }
            if (fBSignupData.location != null) {
                jsonGenerator.writeFieldName("location");
                FBPage.JSON_ADAPTER.serialize(fBSignupData.location, jsonGenerator, true);
            }
            if (fBSignupData.education != null) {
                jsonGenerator.writeFieldName("education");
                JsonAdapter.serializeArray(fBSignupData.education, jsonGenerator, FBEducation.JSON_ADAPTER);
            }
            if (fBSignupData.work != null) {
                jsonGenerator.writeFieldName(Work.TYPE);
                JsonAdapter.serializeArray(fBSignupData.work, jsonGenerator, FBWork.JSON_ADAPTER);
            }
            if (fBSignupData.pages != null) {
                jsonGenerator.writeFieldName("pages");
                JsonAdapter.serializeArray(fBSignupData.pages, jsonGenerator, Tag.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBSignupData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBSignupData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBSignupData new_() {
        FBSignupData fBSignupData = new FBSignupData();
        fBSignupData.nullCheck();
        return fBSignupData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBSignupData mo223809clone() {
        FBSignupData fBSignupData = new FBSignupData();
        fBSignupData.about = this.about;
        FBPage fBPage = this.hometown;
        if (fBPage != null) {
            fBSignupData.hometown = fBPage.mo223809clone();
        }
        FBPage fBPage2 = this.location;
        if (fBPage2 != null) {
            fBSignupData.location = fBPage2.mo223809clone();
        }
        List<FBEducation> list = this.education;
        if (list != null) {
            fBSignupData.education = ValueObject.util_map(list, new w9j() { // from class: l.drf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBEducation) obj).mo223809clone();
                }
            });
        }
        List<FBWork> list2 = this.work;
        if (list2 != null) {
            fBSignupData.work = ValueObject.util_map(list2, new w9j() { // from class: l.erf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((FBWork) obj).mo223809clone();
                }
            });
        }
        List<Tag> list3 = this.pages;
        if (list3 != null) {
            fBSignupData.pages = ValueObject.util_map(list3, new w9j() { // from class: l.frf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Tag) obj).mo223809clone();
                }
            });
        }
        return fBSignupData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBSignupData)) {
            return false;
        }
        FBSignupData fBSignupData = (FBSignupData) obj;
        return ValueObject.util_equals(this.about, fBSignupData.about) && ValueObject.util_equals(this.hometown, fBSignupData.hometown) && ValueObject.util_equals(this.location, fBSignupData.location) && ValueObject.util_equals(this.education, fBSignupData.education) && ValueObject.util_equals(this.work, fBSignupData.work) && ValueObject.util_equals(this.pages, fBSignupData.pages);
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
        String str = this.about;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FBPage fBPage = this.hometown;
        int iHashCode2 = (iHashCode + (fBPage != null ? fBPage.hashCode() : 0)) * 41;
        FBPage fBPage2 = this.location;
        int iHashCode3 = (iHashCode2 + (fBPage2 != null ? fBPage2.hashCode() : 0)) * 41;
        List<FBEducation> list = this.education;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        List<FBWork> list2 = this.work;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Tag> list3 = this.pages;
        int iHashCode6 = iHashCode5 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.about == null) {
            this.about = "";
        }
        if (this.hometown == null) {
            this.hometown = FBPage.new_();
        }
        if (this.location == null) {
            this.location = FBPage.new_();
        }
        if (this.education == null) {
            this.education = new ArrayList();
        }
        if (this.work == null) {
            this.work = new ArrayList();
        }
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
