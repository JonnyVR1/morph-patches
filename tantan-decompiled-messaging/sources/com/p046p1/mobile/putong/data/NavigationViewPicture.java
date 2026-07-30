package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class NavigationViewPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "navigationviewpicture";

    @ProtobufIndex(index = 2)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 3)
    public int width;
    public static ProtobufAdapter<NavigationViewPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<NavigationViewPicture>() { // from class: com.p1.mobile.putong.data.NavigationViewPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NavigationViewPicture navigationViewPicture) {
            String str = navigationViewPicture.identifier;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, navigationViewPicture.height) + CodedOutputByteBufferNano.m17226h(3, navigationViewPicture.width);
            navigationViewPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NavigationViewPicture parse(nb5 nb5Var) throws IOException {
            NavigationViewPicture navigationViewPicture = new NavigationViewPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (navigationViewPicture.identifier != null) {
                        break;
                    }
                    navigationViewPicture.identifier = "";
                    break;
                }
                if (iM158752u == 10) {
                    navigationViewPicture.identifier = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    navigationViewPicture.height = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (navigationViewPicture.identifier != null) {
                            break;
                        }
                        navigationViewPicture.identifier = "";
                        return navigationViewPicture;
                    }
                    navigationViewPicture.width = nb5Var.m158741j();
                }
            }
            return navigationViewPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NavigationViewPicture navigationViewPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = navigationViewPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, navigationViewPicture.height);
            codedOutputByteBufferNano.m17250G(3, navigationViewPicture.width);
        }
    };
    public static JsonAdapter<NavigationViewPicture> JSON_ADAPTER = new ObjectJsonAdapter<NavigationViewPicture>() { // from class: com.p1.mobile.putong.data.NavigationViewPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NavigationViewPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NavigationViewPicture newInstance() {
            return new NavigationViewPicture();
        }

        public boolean parseField(NavigationViewPicture navigationViewPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    navigationViewPicture.identifier = jsonParser.getValueAsString();
                    return true;
                case "height":
                    navigationViewPicture.height = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    navigationViewPicture.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NavigationViewPicture navigationViewPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "height":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(navigationViewPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NavigationViewPicture navigationViewPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = navigationViewPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("height", navigationViewPicture.height);
            jsonGenerator.writeNumberField("width", navigationViewPicture.width);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NavigationViewPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NavigationViewPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NavigationViewPicture new_() {
        NavigationViewPicture navigationViewPicture = new NavigationViewPicture();
        navigationViewPicture.nullCheck();
        return navigationViewPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NavigationViewPicture mo223809clone() {
        NavigationViewPicture navigationViewPicture = new NavigationViewPicture();
        navigationViewPicture.identifier = this.identifier;
        navigationViewPicture.height = this.height;
        navigationViewPicture.width = this.width;
        return navigationViewPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationViewPicture)) {
            return false;
        }
        NavigationViewPicture navigationViewPicture = (NavigationViewPicture) obj;
        return ValueObject.util_equals(this.identifier, navigationViewPicture.identifier) && this.height == navigationViewPicture.height && this.width == navigationViewPicture.width;
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
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.height) * 41) + this.width;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
