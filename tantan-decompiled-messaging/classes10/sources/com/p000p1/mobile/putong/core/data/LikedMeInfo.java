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
public class LikedMeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likedmeinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikedMeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedMeInfo>() { // from class: com.p1.mobile.putong.core.data.LikedMeInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikedMeInfo likedMeInfo) {
            String str = likedMeInfo.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) likedMeInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikedMeInfo m13887parse(nb5 nb5Var) throws IOException {
            LikedMeInfo likedMeInfo = new LikedMeInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likedMeInfo.type != null) {
                        break;
                    }
                    likedMeInfo.type = "";
                    break;
                }
                if (iU != 10) {
                    if (likedMeInfo.type != null) {
                        break;
                    }
                    likedMeInfo.type = "";
                    return likedMeInfo;
                }
                likedMeInfo.type = nb5Var.s();
            }
            return likedMeInfo;
        }

        public void serialize(LikedMeInfo likedMeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedMeInfo.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LikedMeInfo> JSON_ADAPTER = new ObjectJsonAdapter<LikedMeInfo>() { // from class: com.p1.mobile.putong.core.data.LikedMeInfo.2
        public Class getDataClass() {
            return LikedMeInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikedMeInfo m13888newInstance() {
            return new LikedMeInfo();
        }

        public boolean parseField(LikedMeInfo likedMeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("type")) {
                return false;
            }
            likedMeInfo.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LikedMeInfo likedMeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(likedMeInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikedMeInfo likedMeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = likedMeInfo.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedMeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedMeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedMeInfo new_() {
        LikedMeInfo likedMeInfo = new LikedMeInfo();
        likedMeInfo.nullCheck();
        return likedMeInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikedMeInfo m13886clone() {
        LikedMeInfo likedMeInfo = new LikedMeInfo();
        likedMeInfo.type = this.type;
        return likedMeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LikedMeInfo) {
            return ValueObject.util_equals(this.type, ((LikedMeInfo) obj).type);
        }
        return false;
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
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
