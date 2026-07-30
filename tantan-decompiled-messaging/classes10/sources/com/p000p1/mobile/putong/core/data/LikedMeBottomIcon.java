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
public class LikedMeBottomIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likedmebottomicon";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String context;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;
    public static ProtobufAdapter<LikedMeBottomIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedMeBottomIcon>() { // from class: com.p1.mobile.putong.core.data.LikedMeBottomIcon.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikedMeBottomIcon likedMeBottomIcon) {
            String str = likedMeBottomIcon.icon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) likedMeBottomIcon).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikedMeBottomIcon m13883parse(nb5 nb5Var) throws IOException {
            LikedMeBottomIcon likedMeBottomIcon = new LikedMeBottomIcon();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likedMeBottomIcon.icon == null) {
                        likedMeBottomIcon.icon = "";
                    }
                    if (likedMeBottomIcon.context != null) {
                        break;
                    }
                    likedMeBottomIcon.context = "";
                    break;
                }
                if (iU == 10) {
                    likedMeBottomIcon.icon = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (likedMeBottomIcon.icon == null) {
                            likedMeBottomIcon.icon = "";
                        }
                        if (likedMeBottomIcon.context != null) {
                            break;
                        }
                        likedMeBottomIcon.context = "";
                        return likedMeBottomIcon;
                    }
                    likedMeBottomIcon.context = nb5Var.s();
                }
            }
            return likedMeBottomIcon;
        }

        public void serialize(LikedMeBottomIcon likedMeBottomIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedMeBottomIcon.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LikedMeBottomIcon> JSON_ADAPTER = new ObjectJsonAdapter<LikedMeBottomIcon>() { // from class: com.p1.mobile.putong.core.data.LikedMeBottomIcon.2
        public Class getDataClass() {
            return LikedMeBottomIcon.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikedMeBottomIcon m13884newInstance() {
            return new LikedMeBottomIcon();
        }

        public boolean parseField(LikedMeBottomIcon likedMeBottomIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(HomeTabModuleTopicShowType.icon)) {
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
            if (str.equals(HomeTabModuleTopicShowType.icon) || str.equals("context")) {
                return true;
            }
            return super.parseFieldCheck(likedMeBottomIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikedMeBottomIcon likedMeBottomIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = likedMeBottomIcon.icon;
            if (str != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str);
            }
            String str2 = likedMeBottomIcon.context;
            if (str2 != null) {
                jsonGenerator.writeStringField("context", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedMeBottomIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedMeBottomIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedMeBottomIcon new_() {
        LikedMeBottomIcon likedMeBottomIcon = new LikedMeBottomIcon();
        likedMeBottomIcon.nullCheck();
        return likedMeBottomIcon;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikedMeBottomIcon m13882clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.context;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.context == null) {
            this.context = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
