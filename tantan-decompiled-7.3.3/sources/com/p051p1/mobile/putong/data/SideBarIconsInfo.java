package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.SideBarIconsInfo;
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

/* JADX INFO: loaded from: classes12.dex */
public class SideBarIconsInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sidebariconsinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f39662id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SideBarIconsInfo sideBarIconsInfo) {
            NavigationViewPicture navigationViewPicture = sideBarIconsInfo.picture;
            int iM17285l = navigationViewPicture != null ? CodedOutputByteBufferNano.m17285l(1, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER) : 0;
            String str = sideBarIconsInfo.title;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = sideBarIconsInfo.subtitle;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = sideBarIconsInfo.deeplink;
            if (str3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            List<Long> list = sideBarIconsInfo.timeRange;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = sideBarIconsInfo.slideshowSec;
            if (str4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = sideBarIconsInfo.f39662id;
            if (str5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(8, sideBarIconsInfo.redDotSwitch);
            sideBarIconsInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SideBarIconsInfo parse(nc5 nc5Var) throws IOException {
            SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (sideBarIconsInfo.f39662id == null) {
                        sideBarIconsInfo.f39662id = "";
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
                if (iM162497u == 10) {
                    sideBarIconsInfo.picture = (NavigationViewPicture) nc5Var.m162488l(NavigationViewPicture.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    sideBarIconsInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    sideBarIconsInfo.subtitle = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    sideBarIconsInfo.deeplink = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    sideBarIconsInfo.timeRange = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 50) {
                    sideBarIconsInfo.slideshowSec = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    sideBarIconsInfo.f39662id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 64) {
                        if (sideBarIconsInfo.f39662id == null) {
                            sideBarIconsInfo.f39662id = "";
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
                    sideBarIconsInfo.redDotSwitch = nc5Var.m162483g();
                }
            }
            return sideBarIconsInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SideBarIconsInfo sideBarIconsInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NavigationViewPicture navigationViewPicture = sideBarIconsInfo.picture;
            if (navigationViewPicture != null) {
                codedOutputByteBufferNano.m17309K(1, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER);
            }
            String str = sideBarIconsInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = sideBarIconsInfo.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = sideBarIconsInfo.deeplink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            List<Long> list = sideBarIconsInfo.timeRange;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = sideBarIconsInfo.slideshowSec;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = sideBarIconsInfo.f39662id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            codedOutputByteBufferNano.m17299A(8, sideBarIconsInfo.redDotSwitch);
        }
    };
    public static JsonAdapter<SideBarIconsInfo> JSON_ADAPTER = new ObjectJsonAdapter<SideBarIconsInfo>() { // from class: com.p1.mobile.putong.data.SideBarIconsInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SideBarIconsInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SideBarIconsInfo newInstance() {
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
                    sideBarIconsInfo.picture = NavigationViewPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    sideBarIconsInfo.f39662id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SideBarIconsInfo sideBarIconsInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = sideBarIconsInfo.f39662id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SideBarIconsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SideBarIconsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m61271a(Long l2) {
        return l2;
    }

    public static SideBarIconsInfo new_() {
        SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
        sideBarIconsInfo.nullCheck();
        return sideBarIconsInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SideBarIconsInfo mo225055clone() {
        SideBarIconsInfo sideBarIconsInfo = new SideBarIconsInfo();
        sideBarIconsInfo.f39662id = this.f39662id;
        NavigationViewPicture navigationViewPicture = this.picture;
        if (navigationViewPicture != null) {
            sideBarIconsInfo.picture = navigationViewPicture.mo225055clone();
        }
        sideBarIconsInfo.title = this.title;
        sideBarIconsInfo.subtitle = this.subtitle;
        sideBarIconsInfo.deeplink = this.deeplink;
        List<Long> list = this.timeRange;
        if (list != null) {
            sideBarIconsInfo.timeRange = ValueObject.util_map(list, new qcj() { // from class: l.h9f0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return SideBarIconsInfo.m61271a((Long) obj);
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
        return ValueObject.util_equals(this.f39662id, sideBarIconsInfo.f39662id) && ValueObject.util_equals(this.picture, sideBarIconsInfo.picture) && ValueObject.util_equals(this.title, sideBarIconsInfo.title) && ValueObject.util_equals(this.subtitle, sideBarIconsInfo.subtitle) && ValueObject.util_equals(this.deeplink, sideBarIconsInfo.deeplink) && ValueObject.util_equals(this.timeRange, sideBarIconsInfo.timeRange) && ValueObject.util_equals(this.slideshowSec, sideBarIconsInfo.slideshowSec) && this.redDotSwitch == sideBarIconsInfo.redDotSwitch;
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
        String str = this.f39662id;
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
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39662id == null) {
            this.f39662id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
