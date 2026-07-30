package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FBEducation;
import com.p000p1.mobile.putong.data.FBWork;
import com.p000p1.mobile.putong.data.Tag;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBSignupData fBSignupData) {
            String str = fBSignupData.about;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FBPage fBPage = fBSignupData.hometown;
            if (fBPage != null) {
                iO += CodedOutputByteBufferNano.l(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBSignupData.location;
            if (fBPage2 != null) {
                iO += CodedOutputByteBufferNano.l(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBEducation> list = fBSignupData.education;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBWork> list2 = fBSignupData.work;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(5, list2, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Tag> list3 = fBSignupData.pages;
            if (list3 != null) {
                iO += CodedOutputByteBufferNano.l(6, list3, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) fBSignupData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBSignupData m18058parse(nb5 nb5Var) throws IOException {
            FBSignupData fBSignupData = new FBSignupData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    fBSignupData.about = nb5Var.s();
                } else if (iU == 18) {
                    fBSignupData.hometown = (FBPage) nb5Var.l(FBPage.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    fBSignupData.location = (FBPage) nb5Var.l(FBPage.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    fBSignupData.education = (List) nb5Var.l(FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    fBSignupData.work = (List) nb5Var.l(FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
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
                    fBSignupData.pages = (List) nb5Var.l(Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return fBSignupData;
        }

        public void serialize(FBSignupData fBSignupData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBSignupData.about;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FBPage fBPage = fBSignupData.hometown;
            if (fBPage != null) {
                codedOutputByteBufferNano.K(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBSignupData.location;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.K(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            List<FBEducation> list = fBSignupData.education;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, FBEducation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FBWork> list2 = fBSignupData.work;
            if (list2 != null) {
                codedOutputByteBufferNano.K(5, list2, FBWork.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Tag> list3 = fBSignupData.pages;
            if (list3 != null) {
                codedOutputByteBufferNano.K(6, list3, Tag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FBSignupData> JSON_ADAPTER = new ObjectJsonAdapter<FBSignupData>() { // from class: com.p1.mobile.putong.data.FBSignupData.2
        public Class getDataClass() {
            return FBSignupData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBSignupData mo17830newInstance() {
            return new FBSignupData();
        }

        public boolean parseField(FBSignupData fBSignupData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hometown":
                    fBSignupData.hometown = (FBPage) FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    fBSignupData.location = (FBPage) FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBSignupData fBSignupData, JsonGenerator jsonGenerator) throws IOException {
            String str = fBSignupData.about;
            if (str != null) {
                jsonGenerator.writeStringField("about", str);
            }
            if (fBSignupData.hometown != null) {
                jsonGenerator.writeFieldName("hometown");
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBSignupData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBSignupData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBSignupData new_() {
        FBSignupData fBSignupData = new FBSignupData();
        fBSignupData.nullCheck();
        return fBSignupData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBSignupData m18057clone() {
        FBSignupData fBSignupData = new FBSignupData();
        fBSignupData.about = this.about;
        FBPage fBPage = this.hometown;
        if (fBPage != null) {
            fBSignupData.hometown = fBPage.m18045clone();
        }
        FBPage fBPage2 = this.location;
        if (fBPage2 != null) {
            fBSignupData.location = fBPage2.m18045clone();
        }
        List<FBEducation> list = this.education;
        if (list != null) {
            fBSignupData.education = ValueObject.util_map(list, new w9j() { // from class: l.drf
                public final Object call(Object obj) {
                    return ((FBEducation) obj).m18036clone();
                }
            });
        }
        List<FBWork> list2 = this.work;
        if (list2 != null) {
            fBSignupData.work = ValueObject.util_map(list2, new w9j() { // from class: l.erf
                public final Object call(Object obj) {
                    return ((FBWork) obj).m18063clone();
                }
            });
        }
        List<Tag> list3 = this.pages;
        if (list3 != null) {
            fBSignupData.pages = ValueObject.util_map(list3, new w9j() { // from class: l.frf
                public final Object call(Object obj) {
                    return ((Tag) obj).m19078clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
