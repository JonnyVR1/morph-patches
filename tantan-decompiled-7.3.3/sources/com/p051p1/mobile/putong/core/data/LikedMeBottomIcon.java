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
public class LikedMeBottomIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likedmebottomicon";

    @NonNull
    @ProtobufIndex(index = 2)
    public String context;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;
    public static ProtobufAdapter<LikedMeBottomIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedMeBottomIcon>() { // from class: com.p1.mobile.putong.core.data.LikedMeBottomIcon.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikedMeBottomIcon likedMeBottomIcon) {
            String str = likedMeBottomIcon.icon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            likedMeBottomIcon.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikedMeBottomIcon parse(nc5 nc5Var) throws IOException {
            LikedMeBottomIcon likedMeBottomIcon = new LikedMeBottomIcon();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likedMeBottomIcon.icon == null) {
                        likedMeBottomIcon.icon = "";
                    }
                    if (likedMeBottomIcon.context != null) {
                        break;
                    }
                    likedMeBottomIcon.context = "";
                    break;
                }
                if (iM162497u == 10) {
                    likedMeBottomIcon.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (likedMeBottomIcon.icon == null) {
                            likedMeBottomIcon.icon = "";
                        }
                        if (likedMeBottomIcon.context != null) {
                            break;
                        }
                        likedMeBottomIcon.context = "";
                        return likedMeBottomIcon;
                    }
                    likedMeBottomIcon.context = nc5Var.m162495s();
                }
            }
            return likedMeBottomIcon;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikedMeBottomIcon likedMeBottomIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedMeBottomIcon.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<LikedMeBottomIcon> JSON_ADAPTER = new ObjectJsonAdapter<LikedMeBottomIcon>() { // from class: com.p1.mobile.putong.core.data.LikedMeBottomIcon.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikedMeBottomIcon.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikedMeBottomIcon newInstance() {
            return new LikedMeBottomIcon();
        }

        public boolean parseField(LikedMeBottomIcon likedMeBottomIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("icon")) {
                likedMeBottomIcon.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("context")) {
                return false;
            }
            likedMeBottomIcon.context = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LikedMeBottomIcon likedMeBottomIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("icon") || str.equals("context")) {
                return true;
            }
            return super.parseFieldCheck(likedMeBottomIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikedMeBottomIcon likedMeBottomIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = likedMeBottomIcon.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                jsonGenerator.writeStringField("context", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedMeBottomIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedMeBottomIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedMeBottomIcon new_() {
        LikedMeBottomIcon likedMeBottomIcon = new LikedMeBottomIcon();
        likedMeBottomIcon.nullCheck();
        return likedMeBottomIcon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikedMeBottomIcon mo225055clone() {
        LikedMeBottomIcon likedMeBottomIcon = new LikedMeBottomIcon();
        likedMeBottomIcon.icon = this.icon;
        likedMeBottomIcon.context = this.context;
        return likedMeBottomIcon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikedMeBottomIcon)) {
            return false;
        }
        LikedMeBottomIcon likedMeBottomIcon = (LikedMeBottomIcon) obj;
        return ValueObject.util_equals(this.icon, likedMeBottomIcon.icon) && ValueObject.util_equals(this.context, likedMeBottomIcon.context);
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
        String str2 = this.context;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.context == null) {
            this.context = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
