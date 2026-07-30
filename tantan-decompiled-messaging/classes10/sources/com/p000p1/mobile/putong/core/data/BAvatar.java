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
public class BAvatar extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bavatar";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<BAvatar> PROTOBUF_ADAPTER = new MessageNanoAdapter<BAvatar>() { // from class: com.p1.mobile.putong.core.data.BAvatar.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BAvatar bAvatar) {
            String str = bAvatar.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) bAvatar).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BAvatar m11709parse(nb5 nb5Var) throws IOException {
            BAvatar bAvatar = new BAvatar();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bAvatar.url != null) {
                        break;
                    }
                    bAvatar.url = "";
                    break;
                }
                if (iU != 10) {
                    if (bAvatar.url != null) {
                        break;
                    }
                    bAvatar.url = "";
                    return bAvatar;
                }
                bAvatar.url = nb5Var.s();
            }
            return bAvatar;
        }

        public void serialize(BAvatar bAvatar, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bAvatar.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<BAvatar> JSON_ADAPTER = new ObjectJsonAdapter<BAvatar>() { // from class: com.p1.mobile.putong.core.data.BAvatar.2
        public Class getDataClass() {
            return BAvatar.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BAvatar m11710newInstance() {
            return new BAvatar();
        }

        public boolean parseField(BAvatar bAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            bAvatar.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BAvatar bAvatar, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(bAvatar, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BAvatar bAvatar, JsonGenerator jsonGenerator) throws IOException {
            String str = bAvatar.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BAvatar) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BAvatar new_() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.nullCheck();
        return bAvatar;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BAvatar m11708clone() {
        BAvatar bAvatar = new BAvatar();
        bAvatar.url = this.url;
        return bAvatar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BAvatar) {
            return ValueObject.util_equals(this.url, ((BAvatar) obj).url);
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
