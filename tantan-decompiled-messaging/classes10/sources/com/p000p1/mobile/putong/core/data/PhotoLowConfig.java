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
public class PhotoLowConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "photolowconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int count;

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<PhotoLowConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PhotoLowConfig>() { // from class: com.p1.mobile.putong.core.data.PhotoLowConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PhotoLowConfig photoLowConfig) {
            int iB = CodedOutputByteBufferNano.b(1, photoLowConfig.enable) + CodedOutputByteBufferNano.h(2, photoLowConfig.count);
            ((MessageNano) photoLowConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PhotoLowConfig m14755parse(nb5 nb5Var) throws IOException {
            PhotoLowConfig photoLowConfig = new PhotoLowConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    photoLowConfig.enable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return photoLowConfig;
                    }
                    photoLowConfig.count = nb5Var.j();
                }
            }
        }

        public void serialize(PhotoLowConfig photoLowConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, photoLowConfig.enable);
            codedOutputByteBufferNano.G(2, photoLowConfig.count);
        }
    };
    public static JsonAdapter<PhotoLowConfig> JSON_ADAPTER = new ObjectJsonAdapter<PhotoLowConfig>() { // from class: com.p1.mobile.putong.core.data.PhotoLowConfig.2
        public Class getDataClass() {
            return PhotoLowConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PhotoLowConfig m14756newInstance() {
            return new PhotoLowConfig();
        }

        public boolean parseField(PhotoLowConfig photoLowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                photoLowConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            photoLowConfig.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PhotoLowConfig photoLowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(photoLowConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PhotoLowConfig photoLowConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", photoLowConfig.enable);
            jsonGenerator.writeNumberField("count", photoLowConfig.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PhotoLowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PhotoLowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PhotoLowConfig new_() {
        PhotoLowConfig photoLowConfig = new PhotoLowConfig();
        photoLowConfig.nullCheck();
        return photoLowConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PhotoLowConfig m14754clone() {
        PhotoLowConfig photoLowConfig = new PhotoLowConfig();
        photoLowConfig.enable = this.enable;
        photoLowConfig.count = this.count;
        return photoLowConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoLowConfig)) {
            return false;
        }
        PhotoLowConfig photoLowConfig = (PhotoLowConfig) obj;
        return this.enable == photoLowConfig.enable && this.count == photoLowConfig.count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
