package com.p051p1.mobile.putong.core.data;

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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class GrowthBlindBoxInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthblindboxinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonTxt;

    @NonNull
    @ProtobufIndex(index = 3)
    public String h5URL;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<GrowthBlindBoxInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthBlindBoxInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBoxInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthBlindBoxInfo growthBlindBoxInfo) {
            String str = growthBlindBoxInfo.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = growthBlindBoxInfo.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = growthBlindBoxInfo.h5URL;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = growthBlindBoxInfo.icon;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = growthBlindBoxInfo.buttonTxt;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            growthBlindBoxInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthBlindBoxInfo parse(nc5 nc5Var) throws IOException {
            GrowthBlindBoxInfo growthBlindBoxInfo = new GrowthBlindBoxInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (growthBlindBoxInfo.title == null) {
                        growthBlindBoxInfo.title = "";
                    }
                    if (growthBlindBoxInfo.subTitle == null) {
                        growthBlindBoxInfo.subTitle = "";
                    }
                    if (growthBlindBoxInfo.h5URL == null) {
                        growthBlindBoxInfo.h5URL = "";
                    }
                    if (growthBlindBoxInfo.icon == null) {
                        growthBlindBoxInfo.icon = "";
                    }
                    if (growthBlindBoxInfo.buttonTxt != null) {
                        break;
                    }
                    growthBlindBoxInfo.buttonTxt = "";
                    break;
                }
                if (iM162497u == 10) {
                    growthBlindBoxInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    growthBlindBoxInfo.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    growthBlindBoxInfo.h5URL = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    growthBlindBoxInfo.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (growthBlindBoxInfo.title == null) {
                            growthBlindBoxInfo.title = "";
                        }
                        if (growthBlindBoxInfo.subTitle == null) {
                            growthBlindBoxInfo.subTitle = "";
                        }
                        if (growthBlindBoxInfo.h5URL == null) {
                            growthBlindBoxInfo.h5URL = "";
                        }
                        if (growthBlindBoxInfo.icon == null) {
                            growthBlindBoxInfo.icon = "";
                        }
                        if (growthBlindBoxInfo.buttonTxt != null) {
                            break;
                        }
                        growthBlindBoxInfo.buttonTxt = "";
                        return growthBlindBoxInfo;
                    }
                    growthBlindBoxInfo.buttonTxt = nc5Var.m162495s();
                }
            }
            return growthBlindBoxInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthBlindBoxInfo growthBlindBoxInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthBlindBoxInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = growthBlindBoxInfo.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = growthBlindBoxInfo.h5URL;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = growthBlindBoxInfo.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = growthBlindBoxInfo.buttonTxt;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<GrowthBlindBoxInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthBlindBoxInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthBlindBoxInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthBlindBoxInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthBlindBoxInfo newInstance() {
            return new GrowthBlindBoxInfo();
        }

        public boolean parseField(GrowthBlindBoxInfo growthBlindBoxInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    growthBlindBoxInfo.subTitle = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    growthBlindBoxInfo.icon = jsonParser.getValueAsString();
                    return true;
                case "buttonTxt":
                    growthBlindBoxInfo.buttonTxt = jsonParser.getValueAsString();
                    return true;
                case "h5URL":
                    growthBlindBoxInfo.h5URL = jsonParser.getValueAsString();
                    return true;
                case "title":
                    growthBlindBoxInfo.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthBlindBoxInfo growthBlindBoxInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "icon":
                case "buttonTxt":
                case "h5URL":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(growthBlindBoxInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthBlindBoxInfo growthBlindBoxInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = growthBlindBoxInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = growthBlindBoxInfo.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = growthBlindBoxInfo.h5URL;
            if (str3 != null) {
                jsonGenerator.writeStringField("h5URL", str3);
            }
            String str4 = growthBlindBoxInfo.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            String str5 = growthBlindBoxInfo.buttonTxt;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonTxt", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthBlindBoxInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthBlindBoxInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthBlindBoxInfo new_() {
        GrowthBlindBoxInfo growthBlindBoxInfo = new GrowthBlindBoxInfo();
        growthBlindBoxInfo.nullCheck();
        return growthBlindBoxInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthBlindBoxInfo mo225055clone() {
        GrowthBlindBoxInfo growthBlindBoxInfo = new GrowthBlindBoxInfo();
        growthBlindBoxInfo.title = this.title;
        growthBlindBoxInfo.subTitle = this.subTitle;
        growthBlindBoxInfo.h5URL = this.h5URL;
        growthBlindBoxInfo.icon = this.icon;
        growthBlindBoxInfo.buttonTxt = this.buttonTxt;
        return growthBlindBoxInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthBlindBoxInfo)) {
            return false;
        }
        GrowthBlindBoxInfo growthBlindBoxInfo = (GrowthBlindBoxInfo) obj;
        return ValueObject.util_equals(this.title, growthBlindBoxInfo.title) && ValueObject.util_equals(this.subTitle, growthBlindBoxInfo.subTitle) && ValueObject.util_equals(this.h5URL, growthBlindBoxInfo.h5URL) && ValueObject.util_equals(this.icon, growthBlindBoxInfo.icon) && ValueObject.util_equals(this.buttonTxt, growthBlindBoxInfo.buttonTxt);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.h5URL;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonTxt;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.h5URL == null) {
            this.h5URL = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.buttonTxt == null) {
            this.buttonTxt = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
