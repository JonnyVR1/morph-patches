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
public class KnowMyselfShareMessageAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "knowmyselfsharemessageadditional";

    @NonNull
    @ProtobufIndex(index = 2)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pageType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String target;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<KnowMyselfShareMessageAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<KnowMyselfShareMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional) {
            String str = knowMyselfShareMessageAdditional.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            knowMyselfShareMessageAdditional.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public KnowMyselfShareMessageAdditional parse(nc5 nc5Var) throws IOException {
            KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (knowMyselfShareMessageAdditional.title == null) {
                        knowMyselfShareMessageAdditional.title = "";
                    }
                    if (knowMyselfShareMessageAdditional.buttonText == null) {
                        knowMyselfShareMessageAdditional.buttonText = "";
                    }
                    if (knowMyselfShareMessageAdditional.target == null) {
                        knowMyselfShareMessageAdditional.target = "";
                    }
                    if (knowMyselfShareMessageAdditional.pageType != null) {
                        break;
                    }
                    knowMyselfShareMessageAdditional.pageType = "";
                    break;
                }
                if (iM162497u == 10) {
                    knowMyselfShareMessageAdditional.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    knowMyselfShareMessageAdditional.buttonText = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    knowMyselfShareMessageAdditional.target = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (knowMyselfShareMessageAdditional.title == null) {
                            knowMyselfShareMessageAdditional.title = "";
                        }
                        if (knowMyselfShareMessageAdditional.buttonText == null) {
                            knowMyselfShareMessageAdditional.buttonText = "";
                        }
                        if (knowMyselfShareMessageAdditional.target == null) {
                            knowMyselfShareMessageAdditional.target = "";
                        }
                        if (knowMyselfShareMessageAdditional.pageType != null) {
                            break;
                        }
                        knowMyselfShareMessageAdditional.pageType = "";
                        return knowMyselfShareMessageAdditional;
                    }
                    knowMyselfShareMessageAdditional.pageType = nc5Var.m162495s();
                }
            }
            return knowMyselfShareMessageAdditional;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = knowMyselfShareMessageAdditional.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<KnowMyselfShareMessageAdditional> JSON_ADAPTER = new ObjectJsonAdapter<KnowMyselfShareMessageAdditional>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return KnowMyselfShareMessageAdditional.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public KnowMyselfShareMessageAdditional newInstance() {
            return new KnowMyselfShareMessageAdditional();
        }

        public boolean parseField(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "target":
                    knowMyselfShareMessageAdditional.target = jsonParser.getValueAsString();
                    return true;
                case "title":
                    knowMyselfShareMessageAdditional.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    knowMyselfShareMessageAdditional.buttonText = jsonParser.getValueAsString();
                    return true;
                case "pageType":
                    knowMyselfShareMessageAdditional.pageType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "target":
                case "title":
                case "buttonText":
                case "pageType":
                    return true;
                default:
                    return super.parseFieldCheck(knowMyselfShareMessageAdditional, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, JsonGenerator jsonGenerator) throws IOException {
            String str = knowMyselfShareMessageAdditional.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = knowMyselfShareMessageAdditional.buttonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonText", str2);
            }
            String str3 = knowMyselfShareMessageAdditional.target;
            if (str3 != null) {
                jsonGenerator.writeStringField(Target.TYPE, str3);
            }
            String str4 = knowMyselfShareMessageAdditional.pageType;
            if (str4 != null) {
                jsonGenerator.writeStringField("pageType", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KnowMyselfShareMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KnowMyselfShareMessageAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static KnowMyselfShareMessageAdditional new_() {
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
        knowMyselfShareMessageAdditional.nullCheck();
        return knowMyselfShareMessageAdditional;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public KnowMyselfShareMessageAdditional mo225055clone() {
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = new KnowMyselfShareMessageAdditional();
        knowMyselfShareMessageAdditional.title = this.title;
        knowMyselfShareMessageAdditional.buttonText = this.buttonText;
        knowMyselfShareMessageAdditional.target = this.target;
        knowMyselfShareMessageAdditional.pageType = this.pageType;
        return knowMyselfShareMessageAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KnowMyselfShareMessageAdditional)) {
            return false;
        }
        KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional = (KnowMyselfShareMessageAdditional) obj;
        return ValueObject.util_equals(this.title, knowMyselfShareMessageAdditional.title) && ValueObject.util_equals(this.buttonText, knowMyselfShareMessageAdditional.buttonText) && ValueObject.util_equals(this.target, knowMyselfShareMessageAdditional.target) && ValueObject.util_equals(this.pageType, knowMyselfShareMessageAdditional.pageType);
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
        String str2 = this.buttonText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.target;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pageType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.target == null) {
            this.target = "";
        }
        if (this.pageType == null) {
            this.pageType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
