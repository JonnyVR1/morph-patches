package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AnonymityImg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityimg";

    @NonNull
    @ProtobufIndex(index = 2)
    public AnonymityImgSet female;

    @NonNull
    @ProtobufIndex(index = 1)
    public AnonymityImgSet male;
    public static ProtobufAdapter<AnonymityImg> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityImg>() { // from class: com.p1.mobile.putong.core.data.AnonymityImg.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AnonymityImg anonymityImg) {
            AnonymityImgSet anonymityImgSet = anonymityImg.male;
            int iM17230l = anonymityImgSet != null ? CodedOutputByteBufferNano.m17230l(1, anonymityImgSet, AnonymityImgSet.PROTOBUF_ADAPTER) : 0;
            AnonymityImgSet anonymityImgSet2 = anonymityImg.female;
            if (anonymityImgSet2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, anonymityImgSet2, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
            anonymityImg.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AnonymityImg parse(nb5 nb5Var) throws IOException {
            AnonymityImg anonymityImg = new AnonymityImg();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (anonymityImg.male == null) {
                        anonymityImg.male = AnonymityImgSet.new_();
                    }
                    if (anonymityImg.female != null) {
                        break;
                    }
                    anonymityImg.female = AnonymityImgSet.new_();
                    break;
                }
                if (iM158752u == 10) {
                    anonymityImg.male = (AnonymityImgSet) nb5Var.m158743l(AnonymityImgSet.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (anonymityImg.male == null) {
                            anonymityImg.male = AnonymityImgSet.new_();
                        }
                        if (anonymityImg.female != null) {
                            break;
                        }
                        anonymityImg.female = AnonymityImgSet.new_();
                        return anonymityImg;
                    }
                    anonymityImg.female = (AnonymityImgSet) nb5Var.m158743l(AnonymityImgSet.PROTOBUF_ADAPTER);
                }
            }
            return anonymityImg;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AnonymityImg anonymityImg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AnonymityImgSet anonymityImgSet = anonymityImg.male;
            if (anonymityImgSet != null) {
                codedOutputByteBufferNano.m17254K(1, anonymityImgSet, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
            AnonymityImgSet anonymityImgSet2 = anonymityImg.female;
            if (anonymityImgSet2 != null) {
                codedOutputByteBufferNano.m17254K(2, anonymityImgSet2, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AnonymityImg> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityImg>() { // from class: com.p1.mobile.putong.core.data.AnonymityImg.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AnonymityImg.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AnonymityImg newInstance() {
            return new AnonymityImg();
        }

        public boolean parseField(AnonymityImg anonymityImg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female")) {
                anonymityImg.female = AnonymityImgSet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("male")) {
                return false;
            }
            anonymityImg.male = AnonymityImgSet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AnonymityImg anonymityImg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female") || str.equals("male")) {
                return true;
            }
            return super.parseFieldCheck(anonymityImg, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AnonymityImg anonymityImg, JsonGenerator jsonGenerator) throws IOException {
            if (anonymityImg.male != null) {
                jsonGenerator.writeFieldName("male");
                AnonymityImgSet.JSON_ADAPTER.serialize(anonymityImg.male, jsonGenerator, true);
            }
            if (anonymityImg.female != null) {
                jsonGenerator.writeFieldName("female");
                AnonymityImgSet.JSON_ADAPTER.serialize(anonymityImg.female, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityImg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityImg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityImg new_() {
        AnonymityImg anonymityImg = new AnonymityImg();
        anonymityImg.nullCheck();
        return anonymityImg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AnonymityImg mo223809clone() {
        AnonymityImg anonymityImg = new AnonymityImg();
        AnonymityImgSet anonymityImgSet = this.male;
        if (anonymityImgSet != null) {
            anonymityImg.male = anonymityImgSet.mo223809clone();
        }
        AnonymityImgSet anonymityImgSet2 = this.female;
        if (anonymityImgSet2 != null) {
            anonymityImg.female = anonymityImgSet2.mo223809clone();
        }
        return anonymityImg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymityImg)) {
            return false;
        }
        AnonymityImg anonymityImg = (AnonymityImg) obj;
        return ValueObject.util_equals(this.male, anonymityImg.male) && ValueObject.util_equals(this.female, anonymityImg.female);
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
        AnonymityImgSet anonymityImgSet = this.male;
        int iHashCode = (i2 + (anonymityImgSet != null ? anonymityImgSet.hashCode() : 0)) * 41;
        AnonymityImgSet anonymityImgSet2 = this.female;
        int iHashCode2 = iHashCode + (anonymityImgSet2 != null ? anonymityImgSet2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.male == null) {
            this.male = AnonymityImgSet.new_();
        }
        if (this.female == null) {
            this.female = AnonymityImgSet.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
