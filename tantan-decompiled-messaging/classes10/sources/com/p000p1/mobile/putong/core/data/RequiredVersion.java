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
public class RequiredVersion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "requiredversion";

    @NonNull
    @ProtobufIndex(index = 1)
    public String android;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String ios;
    public static ProtobufAdapter<RequiredVersion> PROTOBUF_ADAPTER = new MessageNanoAdapter<RequiredVersion>() { // from class: com.p1.mobile.putong.core.data.RequiredVersion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RequiredVersion requiredVersion) {
            String str = requiredVersion.android;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) requiredVersion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RequiredVersion m15415parse(nb5 nb5Var) throws IOException {
            RequiredVersion requiredVersion = new RequiredVersion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (requiredVersion.android == null) {
                        requiredVersion.android = "";
                    }
                    if (requiredVersion.ios != null) {
                        break;
                    }
                    requiredVersion.ios = "";
                    break;
                }
                if (iU == 10) {
                    requiredVersion.android = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (requiredVersion.android == null) {
                            requiredVersion.android = "";
                        }
                        if (requiredVersion.ios != null) {
                            break;
                        }
                        requiredVersion.ios = "";
                        return requiredVersion;
                    }
                    requiredVersion.ios = nb5Var.s();
                }
            }
            return requiredVersion;
        }

        public void serialize(RequiredVersion requiredVersion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = requiredVersion.android;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<RequiredVersion> JSON_ADAPTER = new ObjectJsonAdapter<RequiredVersion>() { // from class: com.p1.mobile.putong.core.data.RequiredVersion.2
        public Class getDataClass() {
            return RequiredVersion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RequiredVersion m15416newInstance() {
            return new RequiredVersion();
        }

        public boolean parseField(RequiredVersion requiredVersion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(DeviceType.android)) {
                requiredVersion.android = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(DeviceType.ios)) {
                return false;
            }
            requiredVersion.ios = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RequiredVersion requiredVersion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(DeviceType.android) || str.equals(DeviceType.ios)) {
                return true;
            }
            return super.parseFieldCheck(requiredVersion, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RequiredVersion requiredVersion, JsonGenerator jsonGenerator) throws IOException {
            String str = requiredVersion.android;
            if (str != null) {
                jsonGenerator.writeStringField(DeviceType.android, str);
            }
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                jsonGenerator.writeStringField(DeviceType.ios, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RequiredVersion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RequiredVersion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RequiredVersion new_() {
        RequiredVersion requiredVersion = new RequiredVersion();
        requiredVersion.nullCheck();
        return requiredVersion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RequiredVersion m15414clone() {
        RequiredVersion requiredVersion = new RequiredVersion();
        requiredVersion.android = this.android;
        requiredVersion.ios = this.ios;
        return requiredVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequiredVersion)) {
            return false;
        }
        RequiredVersion requiredVersion = (RequiredVersion) obj;
        return ValueObject.util_equals(this.android, requiredVersion.android) && ValueObject.util_equals(this.ios, requiredVersion.ios);
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
        String str = this.android;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ios;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.android == null) {
            this.android = "";
        }
        if (this.ios == null) {
            this.ios = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
