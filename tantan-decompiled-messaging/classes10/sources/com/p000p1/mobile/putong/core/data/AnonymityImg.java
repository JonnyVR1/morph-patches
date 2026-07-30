package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AnonymityImg extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityimg";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AnonymityImgSet female;

    @NonNull
    @ProtobufIndex(index = 1)
    public AnonymityImgSet male;
    public static ProtobufAdapter<AnonymityImg> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityImg>() { // from class: com.p1.mobile.putong.core.data.AnonymityImg.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AnonymityImg anonymityImg) {
            AnonymityImgSet anonymityImgSet = anonymityImg.male;
            int iL = anonymityImgSet != null ? CodedOutputByteBufferNano.l(1, anonymityImgSet, AnonymityImgSet.PROTOBUF_ADAPTER) : 0;
            AnonymityImgSet anonymityImgSet2 = anonymityImg.female;
            if (anonymityImgSet2 != null) {
                iL += CodedOutputByteBufferNano.l(2, anonymityImgSet2, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
            ((MessageNano) anonymityImg).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AnonymityImg m11629parse(nb5 nb5Var) throws IOException {
            AnonymityImg anonymityImg = new AnonymityImg();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (anonymityImg.male == null) {
                        anonymityImg.male = AnonymityImgSet.new_();
                    }
                    if (anonymityImg.female != null) {
                        break;
                    }
                    anonymityImg.female = AnonymityImgSet.new_();
                    break;
                }
                if (iU == 10) {
                    anonymityImg.male = (AnonymityImgSet) nb5Var.l(AnonymityImgSet.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (anonymityImg.male == null) {
                            anonymityImg.male = AnonymityImgSet.new_();
                        }
                        if (anonymityImg.female != null) {
                            break;
                        }
                        anonymityImg.female = AnonymityImgSet.new_();
                        return anonymityImg;
                    }
                    anonymityImg.female = (AnonymityImgSet) nb5Var.l(AnonymityImgSet.PROTOBUF_ADAPTER);
                }
            }
            return anonymityImg;
        }

        public void serialize(AnonymityImg anonymityImg, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AnonymityImgSet anonymityImgSet = anonymityImg.male;
            if (anonymityImgSet != null) {
                codedOutputByteBufferNano.K(1, anonymityImgSet, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
            AnonymityImgSet anonymityImgSet2 = anonymityImg.female;
            if (anonymityImgSet2 != null) {
                codedOutputByteBufferNano.K(2, anonymityImgSet2, AnonymityImgSet.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AnonymityImg> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityImg>() { // from class: com.p1.mobile.putong.core.data.AnonymityImg.2
        public Class getDataClass() {
            return AnonymityImg.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AnonymityImg m11630newInstance() {
            return new AnonymityImg();
        }

        public boolean parseField(AnonymityImg anonymityImg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female")) {
                anonymityImg.female = (AnonymityImgSet) AnonymityImgSet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("male")) {
                return false;
            }
            anonymityImg.male = (AnonymityImgSet) AnonymityImgSet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AnonymityImg anonymityImg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female") || str.equals("male")) {
                return true;
            }
            return super.parseFieldCheck(anonymityImg, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityImg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityImg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityImg new_() {
        AnonymityImg anonymityImg = new AnonymityImg();
        anonymityImg.nullCheck();
        return anonymityImg;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AnonymityImg m11628clone() {
        AnonymityImg anonymityImg = new AnonymityImg();
        AnonymityImgSet anonymityImgSet = this.male;
        if (anonymityImgSet != null) {
            anonymityImg.male = anonymityImgSet.m11632clone();
        }
        AnonymityImgSet anonymityImgSet2 = this.female;
        if (anonymityImgSet2 != null) {
            anonymityImg.female = anonymityImgSet2.m11632clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        AnonymityImgSet anonymityImgSet = this.male;
        int iHashCode = (i2 + (anonymityImgSet != null ? anonymityImgSet.hashCode() : 0)) * 41;
        AnonymityImgSet anonymityImgSet2 = this.female;
        int iHashCode2 = iHashCode + (anonymityImgSet2 != null ? anonymityImgSet2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.male == null) {
            this.male = AnonymityImgSet.new_();
        }
        if (this.female == null) {
            this.female = AnonymityImgSet.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
