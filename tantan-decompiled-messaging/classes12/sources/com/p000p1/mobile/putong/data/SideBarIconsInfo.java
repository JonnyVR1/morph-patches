package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.SideBarIconsInfo;
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
public class SideBarIconsInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sidebariconsinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f275id;

    @NonNull
    @ProtobufIndex(index = 1)
    public NavigationViewPicture picture;

    @ProtobufIndex(index = 8)
    public boolean redDotSwitch;

    @NonNull
    @ProtobufIndex(index = 6)
    public String slideshowSec;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Long> timeRange;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<SideBarIconsInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<SideBarIconsInfo>() { // from class: com.p1.mobile.putong.data.SideBarIconsInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SideBarIconsInfo sideBarIconsInfo) {
            NavigationViewPicture navigationViewPicture = sideBarIconsInfo.picture;
            int iL = navigationViewPicture != null ? CodedOutputByteBufferNano.l(1, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER) : 0;
            String str = sideBarIconsInfo.title;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = sideBarIconsInfo.subtitle;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = sideBarIconsInfo.deeplink;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            List<Long> list = sideBarIconsInfo.timeRange;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = sideBarIconsInfo.slideshowSec;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = sideBarIconsInfo.f275id;
            if (str5 != null) {
                iL += CodedOutputByteBufferNano.o(7, str5);
            }
            int iB = iL + CodedOutputByteBufferNano.b(8, sideBarIconsInfo.redDotSwitch);
            ((MessageNano) sideBarIconsInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SideBarIconsInfo m18977parse(nb5 nb5Var) throws IOException {
            SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sideBarIconsInfo.f275id == null) {
                        sideBarIconsInfo.f275id = "";
                    }
                    if (sideBarIconsInfo.picture == null) {
                        sideBarIconsInfo.picture = NavigationViewPicture.new_();
                    }
                    if (sideBarIconsInfo.title == null) {
                        sideBarIconsInfo.title = "";
                    }
                    if (sideBarIconsInfo.subtitle == null) {
                        sideBarIconsInfo.subtitle = "";
                    }
                    if (sideBarIconsInfo.deeplink == null) {
                        sideBarIconsInfo.deeplink = "";
                    }
                    if (sideBarIconsInfo.timeRange == null) {
                        sideBarIconsInfo.timeRange = new ArrayList();
                    }
                    if (sideBarIconsInfo.slideshowSec != null) {
                        break;
                    }
                    sideBarIconsInfo.slideshowSec = "";
                    break;
                }
                if (iU == 10) {
                    sideBarIconsInfo.picture = (NavigationViewPicture) nb5Var.l(NavigationViewPicture.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    sideBarIconsInfo.title = nb5Var.s();
                } else if (iU == 26) {
                    sideBarIconsInfo.subtitle = nb5Var.s();
                } else if (iU == 34) {
                    sideBarIconsInfo.deeplink = nb5Var.s();
                } else if (iU == 42) {
                    sideBarIconsInfo.timeRange = (List) nb5Var.l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 50) {
                    sideBarIconsInfo.slideshowSec = nb5Var.s();
                } else if (iU == 58) {
                    sideBarIconsInfo.f275id = nb5Var.s();
                } else {
                    if (iU != 64) {
                        if (sideBarIconsInfo.f275id == null) {
                            sideBarIconsInfo.f275id = "";
                        }
                        if (sideBarIconsInfo.picture == null) {
                            sideBarIconsInfo.picture = NavigationViewPicture.new_();
                        }
                        if (sideBarIconsInfo.title == null) {
                            sideBarIconsInfo.title = "";
                        }
                        if (sideBarIconsInfo.subtitle == null) {
                            sideBarIconsInfo.subtitle = "";
                        }
                        if (sideBarIconsInfo.deeplink == null) {
                            sideBarIconsInfo.deeplink = "";
                        }
                        if (sideBarIconsInfo.timeRange == null) {
                            sideBarIconsInfo.timeRange = new ArrayList();
                        }
                        if (sideBarIconsInfo.slideshowSec != null) {
                            break;
                        }
                        sideBarIconsInfo.slideshowSec = "";
                        return sideBarIconsInfo;
                    }
                    sideBarIconsInfo.redDotSwitch = nb5Var.g();
                }
            }
            return sideBarIconsInfo;
        }

        public void serialize(SideBarIconsInfo sideBarIconsInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NavigationViewPicture navigationViewPicture = sideBarIconsInfo.picture;
            if (navigationViewPicture != null) {
                codedOutputByteBufferNano.K(1, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER);
            }
            String str = sideBarIconsInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = sideBarIconsInfo.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = sideBarIconsInfo.deeplink;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            List<Long> list = sideBarIconsInfo.timeRange;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = sideBarIconsInfo.slideshowSec;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = sideBarIconsInfo.f275id;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            codedOutputByteBufferNano.A(8, sideBarIconsInfo.redDotSwitch);
        }
    };
    public static JsonAdapter<SideBarIconsInfo> JSON_ADAPTER = new ObjectJsonAdapter<SideBarIconsInfo>() { // from class: com.p1.mobile.putong.data.SideBarIconsInfo.2
        public Class getDataClass() {
            return SideBarIconsInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SideBarIconsInfo mo17830newInstance() {
            return new SideBarIconsInfo();
        }

        public boolean parseField(SideBarIconsInfo sideBarIconsInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    sideBarIconsInfo.subtitle = jsonParser.getValueAsString();
                    return true;
                case "redDotSwitch":
                    sideBarIconsInfo.redDotSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "slideshowSec":
                    sideBarIconsInfo.slideshowSec = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    sideBarIconsInfo.picture = (NavigationViewPicture) NavigationViewPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    sideBarIconsInfo.f275id = jsonParser.getValueAsString();
                    return false;
                case "timeRange":
                    sideBarIconsInfo.timeRange = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    sideBarIconsInfo.title = jsonParser.getValueAsString();
                    return true;
                case "deeplink":
                    sideBarIconsInfo.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SideBarIconsInfo sideBarIconsInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "redDotSwitch":
                case "slideshowSec":
                case "picture":
                    return true;
                case "id":
                    return false;
                case "timeRange":
                case "title":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(sideBarIconsInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SideBarIconsInfo sideBarIconsInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = sideBarIconsInfo.f275id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (sideBarIconsInfo.picture != null) {
                jsonGenerator.writeFieldName("picture");
                NavigationViewPicture.JSON_ADAPTER.serialize(sideBarIconsInfo.picture, jsonGenerator, true);
            }
            String str2 = sideBarIconsInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = sideBarIconsInfo.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            String str4 = sideBarIconsInfo.deeplink;
            if (str4 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str4);
            }
            if (sideBarIconsInfo.timeRange != null) {
                jsonGenerator.writeFieldName("timeRange");
                JsonAdapter.serializeArray(sideBarIconsInfo.timeRange, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            String str5 = sideBarIconsInfo.slideshowSec;
            if (str5 != null) {
                jsonGenerator.writeStringField("slideshowSec", str5);
            }
            jsonGenerator.writeBooleanField("redDotSwitch", sideBarIconsInfo.redDotSwitch);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SideBarIconsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SideBarIconsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m1005a(Long l2) {
        return l2;
    }

    public static SideBarIconsInfo new_() {
        SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
        sideBarIconsInfo.nullCheck();
        return sideBarIconsInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SideBarIconsInfo m18976clone() {
        SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
        sideBarIconsInfo.f275id = this.f275id;
        NavigationViewPicture navigationViewPicture = this.picture;
        if (navigationViewPicture != null) {
            sideBarIconsInfo.picture = navigationViewPicture.m18515clone();
        }
        sideBarIconsInfo.title = this.title;
        sideBarIconsInfo.subtitle = this.subtitle;
        sideBarIconsInfo.deeplink = this.deeplink;
        List<Long> list = this.timeRange;
        if (list != null) {
            sideBarIconsInfo.timeRange = ValueObject.util_map(list, new w9j() { // from class: l.a1f0
                public final Object call(Object obj) {
                    return SideBarIconsInfo.m1005a((Long) obj);
                }
            });
        }
        sideBarIconsInfo.slideshowSec = this.slideshowSec;
        sideBarIconsInfo.redDotSwitch = this.redDotSwitch;
        return sideBarIconsInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SideBarIconsInfo)) {
            return false;
        }
        SideBarIconsInfo sideBarIconsInfo = (SideBarIconsInfo) obj;
        return ValueObject.util_equals(this.f275id, sideBarIconsInfo.f275id) && ValueObject.util_equals(this.picture, sideBarIconsInfo.picture) && ValueObject.util_equals(this.title, sideBarIconsInfo.title) && ValueObject.util_equals(this.subtitle, sideBarIconsInfo.subtitle) && ValueObject.util_equals(this.deeplink, sideBarIconsInfo.deeplink) && ValueObject.util_equals(this.timeRange, sideBarIconsInfo.timeRange) && ValueObject.util_equals(this.slideshowSec, sideBarIconsInfo.slideshowSec) && this.redDotSwitch == sideBarIconsInfo.redDotSwitch;
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
        String str = this.f275id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        NavigationViewPicture navigationViewPicture = this.picture;
        int iHashCode2 = (iHashCode + (navigationViewPicture != null ? navigationViewPicture.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.deeplink;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<Long> list = this.timeRange;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.slideshowSec;
        int iHashCode7 = ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.redDotSwitch ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.f275id == null) {
            this.f275id = "";
        }
        if (this.picture == null) {
            this.picture = NavigationViewPicture.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.timeRange == null) {
            this.timeRange = new ArrayList();
        }
        if (this.slideshowSec == null) {
            this.slideshowSec = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
