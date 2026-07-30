package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import java.util.HashSet;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class ThemeView extends ValueObject<ThemeView> implements Cloneable, Serializable {
    public static final String TYPE = "themeview";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<ThemeView> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThemeView>() { // from class: com.p1.mobile.putong.data.ThemeView.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThemeView themeView) {
            String str = themeView.icon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = themeView.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = themeView.subTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            themeView.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThemeView parse(nc5 nc5Var) throws IOException {
            ThemeView themeView = new ThemeView();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (themeView.icon == null) {
                        themeView.icon = "";
                    }
                    if (themeView.title == null) {
                        themeView.title = "";
                    }
                    if (themeView.subTitle != null) {
                        break;
                    }
                    themeView.subTitle = "";
                    break;
                }
                if (iM162497u == 10) {
                    themeView.icon = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    themeView.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (themeView.icon == null) {
                            themeView.icon = "";
                        }
                        if (themeView.title == null) {
                            themeView.title = "";
                        }
                        if (themeView.subTitle != null) {
                            break;
                        }
                        themeView.subTitle = "";
                        return themeView;
                    }
                    themeView.subTitle = nc5Var.m162495s();
                }
            }
            return themeView;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThemeView themeView, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = themeView.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = themeView.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = themeView.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<ThemeView> JSON_ADAPTER = new ObjectJsonAdapter<ThemeView>() { // from class: com.p1.mobile.putong.data.ThemeView.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThemeView.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThemeView newInstance() {
            return new ThemeView();
        }

        public boolean parseField(ThemeView themeView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    themeView.subTitle = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    themeView.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    themeView.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThemeView themeView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "icon":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(themeView, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThemeView themeView, JsonGenerator jsonGenerator) throws IOException {
            String str = themeView.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = themeView.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = themeView.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThemeView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThemeView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThemeView new_() {
        ThemeView themeView = new ThemeView();
        themeView.nullCheck();
        return themeView;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThemeView mo225055clone() {
        ThemeView themeView = new ThemeView();
        themeView.icon = this.icon;
        themeView.title = this.title;
        themeView.subTitle = this.subTitle;
        return themeView;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThemeView)) {
            return false;
        }
        ThemeView themeView = (ThemeView) obj;
        return ValueObject.util_equals(this.icon, themeView.icon) && ValueObject.util_equals(this.title, themeView.title) && ValueObject.util_equals(this.subTitle, themeView.subTitle);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(ThemeView themeView) {
        if (!shouldMergeData() || equals(themeView)) {
            return;
        }
        if (!isFieldParsed("icon")) {
            this.icon = themeView.icon;
        }
        if (!isFieldParsed("title")) {
            this.title = themeView.title;
        }
        if (!isFieldParsed("subTitle")) {
            this.subTitle = themeView.subTitle;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public ThemeView subtract(ThemeView themeView) {
        ThemeView themeView2 = new ThemeView();
        if (!ValueObject.util_equals(this.icon, themeView.icon)) {
            themeView2.icon = this.icon;
        }
        if (!ValueObject.util_equals(this.title, themeView.title)) {
            themeView2.title = this.title;
        }
        if (!ValueObject.util_equals(this.subTitle, themeView.subTitle)) {
            themeView2.subTitle = this.subTitle;
        }
        if (themeView2.equals(new ThemeView())) {
            return null;
        }
        return themeView2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
