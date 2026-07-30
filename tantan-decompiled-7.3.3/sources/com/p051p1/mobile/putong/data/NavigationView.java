package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.NavigationView;
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
public class NavigationView extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "navigationview";

    @NonNull
    @ProtobufIndex(index = 5)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39630id;

    @NonNull
    @ProtobufIndex(index = 2)
    public NavigationViewPicture picture;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Long> timeRange;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;
    public static ProtobufAdapter<NavigationView> PROTOBUF_ADAPTER = new MessageNanoAdapter<NavigationView>() { // from class: com.p1.mobile.putong.data.NavigationView.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NavigationView navigationView) {
            String str = navigationView.f39630id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            NavigationViewPicture navigationViewPicture = navigationView.picture;
            if (navigationViewPicture != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER);
            }
            String str2 = navigationView.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = navigationView.subtitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = navigationView.deeplink;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            List<Long> list = navigationView.timeRange;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            navigationView.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NavigationView parse(nc5 nc5Var) throws IOException {
            NavigationView navigationView = new NavigationView();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (navigationView.f39630id == null) {
                        navigationView.f39630id = "";
                    }
                    if (navigationView.picture == null) {
                        navigationView.picture = NavigationViewPicture.new_();
                    }
                    if (navigationView.title == null) {
                        navigationView.title = "";
                    }
                    if (navigationView.subtitle == null) {
                        navigationView.subtitle = "";
                    }
                    if (navigationView.deeplink == null) {
                        navigationView.deeplink = "";
                    }
                    if (navigationView.timeRange != null) {
                        break;
                    }
                    navigationView.timeRange = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    navigationView.f39630id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    navigationView.picture = (NavigationViewPicture) nc5Var.m162488l(NavigationViewPicture.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    navigationView.title = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    navigationView.subtitle = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    navigationView.deeplink = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (navigationView.f39630id == null) {
                            navigationView.f39630id = "";
                        }
                        if (navigationView.picture == null) {
                            navigationView.picture = NavigationViewPicture.new_();
                        }
                        if (navigationView.title == null) {
                            navigationView.title = "";
                        }
                        if (navigationView.subtitle == null) {
                            navigationView.subtitle = "";
                        }
                        if (navigationView.deeplink == null) {
                            navigationView.deeplink = "";
                        }
                        if (navigationView.timeRange != null) {
                            break;
                        }
                        navigationView.timeRange = new ArrayList();
                        return navigationView;
                    }
                    navigationView.timeRange = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return navigationView;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NavigationView navigationView, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = navigationView.f39630id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            NavigationViewPicture navigationViewPicture = navigationView.picture;
            if (navigationViewPicture != null) {
                codedOutputByteBufferNano.m17309K(2, navigationViewPicture, NavigationViewPicture.PROTOBUF_ADAPTER);
            }
            String str2 = navigationView.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = navigationView.subtitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = navigationView.deeplink;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            List<Long> list = navigationView.timeRange;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NavigationView> JSON_ADAPTER = new ObjectJsonAdapter<NavigationView>() { // from class: com.p1.mobile.putong.data.NavigationView.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NavigationView.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NavigationView newInstance() {
            return new NavigationView();
        }

        public boolean parseField(NavigationView navigationView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    navigationView.subtitle = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    navigationView.picture = NavigationViewPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    navigationView.f39630id = jsonParser.getValueAsString();
                    return false;
                case "timeRange":
                    navigationView.timeRange = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    navigationView.title = jsonParser.getValueAsString();
                    return true;
                case "deeplink":
                    navigationView.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NavigationView navigationView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "picture":
                    return true;
                case "id":
                    return false;
                case "timeRange":
                case "title":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(navigationView, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NavigationView navigationView, JsonGenerator jsonGenerator) throws IOException {
            String str = navigationView.f39630id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (navigationView.picture != null) {
                jsonGenerator.writeFieldName("picture");
                NavigationViewPicture.JSON_ADAPTER.serialize(navigationView.picture, jsonGenerator, true);
            }
            String str2 = navigationView.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = navigationView.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            String str4 = navigationView.deeplink;
            if (str4 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str4);
            }
            if (navigationView.timeRange != null) {
                jsonGenerator.writeFieldName("timeRange");
                JsonAdapter.serializeArray(navigationView.timeRange, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NavigationView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NavigationView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m61050a(Long l2) {
        return l2;
    }

    public static NavigationView new_() {
        NavigationView navigationView = new NavigationView();
        navigationView.nullCheck();
        return navigationView;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NavigationView mo225055clone() {
        NavigationView navigationView = new NavigationView();
        navigationView.f39630id = this.f39630id;
        NavigationViewPicture navigationViewPicture = this.picture;
        if (navigationViewPicture != null) {
            navigationView.picture = navigationViewPicture.mo225055clone();
        }
        navigationView.title = this.title;
        navigationView.subtitle = this.subtitle;
        navigationView.deeplink = this.deeplink;
        List<Long> list = this.timeRange;
        if (list != null) {
            navigationView.timeRange = ValueObject.util_map(list, new qcj() { // from class: l.mf20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NavigationView.m61050a((Long) obj);
                }
            });
        }
        return navigationView;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationView)) {
            return false;
        }
        NavigationView navigationView = (NavigationView) obj;
        return ValueObject.util_equals(this.f39630id, navigationView.f39630id) && ValueObject.util_equals(this.picture, navigationView.picture) && ValueObject.util_equals(this.title, navigationView.title) && ValueObject.util_equals(this.subtitle, navigationView.subtitle) && ValueObject.util_equals(this.deeplink, navigationView.deeplink) && ValueObject.util_equals(this.timeRange, navigationView.timeRange);
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
        String str = this.f39630id;
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
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39630id == null) {
            this.f39630id = "";
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
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
