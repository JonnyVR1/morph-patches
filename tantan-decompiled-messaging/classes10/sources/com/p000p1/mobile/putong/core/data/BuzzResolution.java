package com.p000p1.mobile.putong.core.data;

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
public class BuzzResolution extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzresolution";

    @ProtobufIndex(index = 1)
    public int height;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int width;
    public static ProtobufAdapter<BuzzResolution> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzResolution>() { // from class: com.p1.mobile.putong.core.data.BuzzResolution.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuzzResolution buzzResolution) {
            int iH = CodedOutputByteBufferNano.h(1, buzzResolution.height) + CodedOutputByteBufferNano.h(2, buzzResolution.width);
            ((MessageNano) buzzResolution).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuzzResolution m11839parse(nb5 nb5Var) throws IOException {
            BuzzResolution buzzResolution = new BuzzResolution();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    buzzResolution.height = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return buzzResolution;
                    }
                    buzzResolution.width = nb5Var.j();
                }
            }
        }

        public void serialize(BuzzResolution buzzResolution, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, buzzResolution.height);
            codedOutputByteBufferNano.G(2, buzzResolution.width);
        }
    };
    public static JsonAdapter<BuzzResolution> JSON_ADAPTER = new ObjectJsonAdapter<BuzzResolution>() { // from class: com.p1.mobile.putong.core.data.BuzzResolution.2
        public Class getDataClass() {
            return BuzzResolution.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BuzzResolution m11840newInstance() {
            return new BuzzResolution();
        }

        public boolean parseField(BuzzResolution buzzResolution, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(ProfileLikeCategoryType.height)) {
                buzzResolution.height = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("width")) {
                return false;
            }
            buzzResolution.width = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BuzzResolution buzzResolution, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(ProfileLikeCategoryType.height) || str.equals("width")) {
                return true;
            }
            return super.parseFieldCheck(buzzResolution, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BuzzResolution buzzResolution, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.height, buzzResolution.height);
            jsonGenerator.writeNumberField("width", buzzResolution.width);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzResolution) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzResolution) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzResolution new_() {
        BuzzResolution buzzResolution = new BuzzResolution();
        buzzResolution.nullCheck();
        return buzzResolution;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuzzResolution m11838clone() {
        BuzzResolution buzzResolution = new BuzzResolution();
        buzzResolution.height = this.height;
        buzzResolution.width = this.width;
        return buzzResolution;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzResolution)) {
            return false;
        }
        BuzzResolution buzzResolution = (BuzzResolution) obj;
        return this.height == buzzResolution.height && this.width == buzzResolution.width;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.height) * 41) + this.width;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
