package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class PrivacyMembershipSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privacymembershipsetting";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public Boolean frozenActivity;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Boolean hideAge;

    @NonNull
    @ProtobufIndex(index = 4)
    public Boolean hideIcon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Boolean hideLocation;

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean showMeToMyLike;
    public static ProtobufAdapter<PrivacyMembershipSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivacyMembershipSetting>() { // from class: com.p1.mobile.putong.core.data.PrivacyMembershipSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivacyMembershipSetting privacyMembershipSetting) {
            Boolean bool = privacyMembershipSetting.showMeToMyLike;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            Boolean bool2 = privacyMembershipSetting.hideLocation;
            if (bool2 != null) {
                iB += CodedOutputByteBufferNano.b(2, bool2.booleanValue());
            }
            Boolean bool3 = privacyMembershipSetting.hideAge;
            if (bool3 != null) {
                iB += CodedOutputByteBufferNano.b(3, bool3.booleanValue());
            }
            Boolean bool4 = privacyMembershipSetting.hideIcon;
            if (bool4 != null) {
                iB += CodedOutputByteBufferNano.b(4, bool4.booleanValue());
            }
            Boolean bool5 = privacyMembershipSetting.frozenActivity;
            if (bool5 != null) {
                iB += CodedOutputByteBufferNano.b(5, bool5.booleanValue());
            }
            ((MessageNano) privacyMembershipSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivacyMembershipSetting m14853parse(nb5 nb5Var) throws IOException {
            PrivacyMembershipSetting privacyMembershipSetting = new PrivacyMembershipSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privacyMembershipSetting.showMeToMyLike == null) {
                        privacyMembershipSetting.showMeToMyLike = Boolean.FALSE;
                    }
                    if (privacyMembershipSetting.hideLocation == null) {
                        privacyMembershipSetting.hideLocation = Boolean.FALSE;
                    }
                    if (privacyMembershipSetting.hideAge == null) {
                        privacyMembershipSetting.hideAge = Boolean.FALSE;
                    }
                    if (privacyMembershipSetting.hideIcon == null) {
                        privacyMembershipSetting.hideIcon = Boolean.FALSE;
                    }
                    if (privacyMembershipSetting.frozenActivity != null) {
                        break;
                    }
                    privacyMembershipSetting.frozenActivity = Boolean.FALSE;
                    break;
                }
                if (iU == 8) {
                    privacyMembershipSetting.showMeToMyLike = Boolean.valueOf(nb5Var.g());
                } else if (iU == 16) {
                    privacyMembershipSetting.hideLocation = Boolean.valueOf(nb5Var.g());
                } else if (iU == 24) {
                    privacyMembershipSetting.hideAge = Boolean.valueOf(nb5Var.g());
                } else if (iU == 32) {
                    privacyMembershipSetting.hideIcon = Boolean.valueOf(nb5Var.g());
                } else {
                    if (iU != 40) {
                        if (privacyMembershipSetting.showMeToMyLike == null) {
                            privacyMembershipSetting.showMeToMyLike = Boolean.FALSE;
                        }
                        if (privacyMembershipSetting.hideLocation == null) {
                            privacyMembershipSetting.hideLocation = Boolean.FALSE;
                        }
                        if (privacyMembershipSetting.hideAge == null) {
                            privacyMembershipSetting.hideAge = Boolean.FALSE;
                        }
                        if (privacyMembershipSetting.hideIcon == null) {
                            privacyMembershipSetting.hideIcon = Boolean.FALSE;
                        }
                        if (privacyMembershipSetting.frozenActivity != null) {
                            break;
                        }
                        privacyMembershipSetting.frozenActivity = Boolean.FALSE;
                        return privacyMembershipSetting;
                    }
                    privacyMembershipSetting.frozenActivity = Boolean.valueOf(nb5Var.g());
                }
            }
            return privacyMembershipSetting;
        }

        public void serialize(PrivacyMembershipSetting privacyMembershipSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = privacyMembershipSetting.showMeToMyLike;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
            Boolean bool2 = privacyMembershipSetting.hideLocation;
            if (bool2 != null) {
                codedOutputByteBufferNano.A(2, bool2.booleanValue());
            }
            Boolean bool3 = privacyMembershipSetting.hideAge;
            if (bool3 != null) {
                codedOutputByteBufferNano.A(3, bool3.booleanValue());
            }
            Boolean bool4 = privacyMembershipSetting.hideIcon;
            if (bool4 != null) {
                codedOutputByteBufferNano.A(4, bool4.booleanValue());
            }
            Boolean bool5 = privacyMembershipSetting.frozenActivity;
            if (bool5 != null) {
                codedOutputByteBufferNano.A(5, bool5.booleanValue());
            }
        }
    };
    public static JsonAdapter<PrivacyMembershipSetting> JSON_ADAPTER = new ObjectJsonAdapter<PrivacyMembershipSetting>() { // from class: com.p1.mobile.putong.core.data.PrivacyMembershipSetting.2
        public Class getDataClass() {
            return PrivacyMembershipSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivacyMembershipSetting m14854newInstance() {
            return new PrivacyMembershipSetting();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(PrivacyMembershipSetting privacyMembershipSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1831698665:
                    if (str.equals("hideLocation")) {
                        b = 0;
                    }
                    break;
                case -1774248741:
                    if (str.equals("hideIcon")) {
                        b = 1;
                    }
                    break;
                case 912589917:
                    if (str.equals("hideAge")) {
                        b = 2;
                    }
                    break;
                case 927123919:
                    if (str.equals("frozenActivity")) {
                        b = 3;
                    }
                    break;
                case 1899079251:
                    if (str.equals("showMeToMyLike")) {
                        b = 4;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    privacyMembershipSetting.hideLocation = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 1:
                    privacyMembershipSetting.hideIcon = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                    privacyMembershipSetting.hideAge = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                    privacyMembershipSetting.frozenActivity = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                case 4:
                    privacyMembershipSetting.showMeToMyLike = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivacyMembershipSetting privacyMembershipSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hideLocation":
                case "hideIcon":
                case "hideAge":
                case "frozenActivity":
                case "showMeToMyLike":
                    return true;
                default:
                    return super.parseFieldCheck(privacyMembershipSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PrivacyMembershipSetting privacyMembershipSetting, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = privacyMembershipSetting.showMeToMyLike;
            if (bool != null) {
                jsonGenerator.writeBooleanField("showMeToMyLike", bool.booleanValue());
            }
            Boolean bool2 = privacyMembershipSetting.hideLocation;
            if (bool2 != null) {
                jsonGenerator.writeBooleanField("hideLocation", bool2.booleanValue());
            }
            Boolean bool3 = privacyMembershipSetting.hideAge;
            if (bool3 != null) {
                jsonGenerator.writeBooleanField("hideAge", bool3.booleanValue());
            }
            Boolean bool4 = privacyMembershipSetting.hideIcon;
            if (bool4 != null) {
                jsonGenerator.writeBooleanField("hideIcon", bool4.booleanValue());
            }
            Boolean bool5 = privacyMembershipSetting.frozenActivity;
            if (bool5 != null) {
                jsonGenerator.writeBooleanField("frozenActivity", bool5.booleanValue());
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivacyMembershipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivacyMembershipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivacyMembershipSetting new_() {
        PrivacyMembershipSetting privacyMembershipSetting = new PrivacyMembershipSetting();
        privacyMembershipSetting.nullCheck();
        return privacyMembershipSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivacyMembershipSetting m14852clone() {
        PrivacyMembershipSetting privacyMembershipSetting = new PrivacyMembershipSetting();
        privacyMembershipSetting.showMeToMyLike = this.showMeToMyLike;
        privacyMembershipSetting.hideLocation = this.hideLocation;
        privacyMembershipSetting.hideAge = this.hideAge;
        privacyMembershipSetting.hideIcon = this.hideIcon;
        privacyMembershipSetting.frozenActivity = this.frozenActivity;
        return privacyMembershipSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivacyMembershipSetting)) {
            return false;
        }
        PrivacyMembershipSetting privacyMembershipSetting = (PrivacyMembershipSetting) obj;
        return ValueObject.util_equals(this.showMeToMyLike, privacyMembershipSetting.showMeToMyLike) && ValueObject.util_equals(this.hideLocation, privacyMembershipSetting.hideLocation) && ValueObject.util_equals(this.hideAge, privacyMembershipSetting.hideAge) && ValueObject.util_equals(this.hideIcon, privacyMembershipSetting.hideIcon) && ValueObject.util_equals(this.frozenActivity, privacyMembershipSetting.frozenActivity);
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
        Boolean bool = this.showMeToMyLike;
        int iHashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 41;
        Boolean bool2 = this.hideLocation;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 41;
        Boolean bool3 = this.hideAge;
        int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 41;
        Boolean bool4 = this.hideIcon;
        int iHashCode4 = (iHashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 41;
        Boolean bool5 = this.frozenActivity;
        int iHashCode5 = iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.showMeToMyLike == null) {
            this.showMeToMyLike = Boolean.FALSE;
        }
        if (this.hideLocation == null) {
            this.hideLocation = Boolean.FALSE;
        }
        if (this.hideAge == null) {
            this.hideAge = Boolean.FALSE;
        }
        if (this.hideIcon == null) {
            this.hideIcon = Boolean.FALSE;
        }
        if (this.frozenActivity == null) {
            this.frozenActivity = Boolean.FALSE;
        }
    }

    public PrivacyMembershipSetting subtract(PrivacyMembershipSetting privacyMembershipSetting) {
        PrivacyMembershipSetting privacyMembershipSetting2 = new PrivacyMembershipSetting();
        if (!ValueObject.util_equals(this.showMeToMyLike, privacyMembershipSetting.showMeToMyLike)) {
            privacyMembershipSetting2.showMeToMyLike = this.showMeToMyLike;
        }
        if (!ValueObject.util_equals(this.hideLocation, privacyMembershipSetting.hideLocation)) {
            privacyMembershipSetting2.hideLocation = this.hideLocation;
        }
        if (!ValueObject.util_equals(this.hideAge, privacyMembershipSetting.hideAge)) {
            privacyMembershipSetting2.hideAge = this.hideAge;
        }
        if (!ValueObject.util_equals(this.hideIcon, privacyMembershipSetting.hideIcon)) {
            privacyMembershipSetting2.hideIcon = this.hideIcon;
        }
        if (!ValueObject.util_equals(this.frozenActivity, privacyMembershipSetting.frozenActivity)) {
            privacyMembershipSetting2.frozenActivity = this.frozenActivity;
        }
        if (privacyMembershipSetting2.equals(new PrivacyMembershipSetting())) {
            return null;
        }
        return privacyMembershipSetting2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
