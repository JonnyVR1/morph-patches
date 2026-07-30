package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NavigationViewPicture navigationViewPicture) {
            String str = navigationViewPicture.identifier;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, navigationViewPicture.height) + CodedOutputByteBufferNano.h(3, navigationViewPicture.width);
            ((MessageNano) navigationViewPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NavigationViewPicture m18516parse(nb5 nb5Var) throws IOException {
            NavigationViewPicture navigationViewPicture = new NavigationViewPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (navigationViewPicture.identifier != null) {
                        break;
                    }
                    navigationViewPicture.identifier = "";
                    break;
                }
                if (iU == 10) {
                    navigationViewPicture.identifier = nb5Var.s();
                } else if (iU == 16) {
                    navigationViewPicture.height = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (navigationViewPicture.identifier != null) {
                            break;
                        }
                        navigationViewPicture.identifier = "";
                        return navigationViewPicture;
                    }
                    navigationViewPicture.width = nb5Var.j();
                }
            }
            return navigationViewPicture;
        }

        public void serialize(NavigationViewPicture navigationViewPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = navigationViewPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, navigationViewPicture.height);
            codedOutputByteBufferNano.G(3, navigationViewPicture.width);
        }
    };
    public static JsonAdapter<NavigationViewPicture> JSON_ADAPTER = new ObjectJsonAdapter<NavigationViewPicture>() { // from class: com.p1.mobile.putong.data.NavigationViewPicture.2
        public Class getDataClass() {
            return NavigationViewPicture.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NavigationViewPicture mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NavigationViewPicture navigationViewPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = navigationViewPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("height", navigationViewPicture.height);
            jsonGenerator.writeNumberField("width", navigationViewPicture.width);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NavigationViewPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NavigationViewPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NavigationViewPicture new_() {
        NavigationViewPicture navigationViewPicture = new NavigationViewPicture();
        navigationViewPicture.nullCheck();
        return navigationViewPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NavigationViewPicture m18515clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.height) * 41) + this.width;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
