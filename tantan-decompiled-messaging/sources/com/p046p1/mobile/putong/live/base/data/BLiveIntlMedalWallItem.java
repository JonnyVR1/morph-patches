package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlMedalWallItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveintlmedalwallitem";

    @NonNull
    @ProtobufIndex(index = 6)
    public String buttonType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String describe;

    @NonNull
    @ProtobufIndex(index = 8)
    public String dynamicIcon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String getDescribe;

    @NonNull
    @ProtobufIndex(index = 7)
    public String gotoUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44391id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<BLiveIntlMedalWallItem> PROTOBUF_ADAPTER = new C11780a();
    public static JsonAdapter<BLiveIntlMedalWallItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlMedalWallItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlMedalWallItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlMedalWallItem newInstance() {
            return new BLiveIntlMedalWallItem();
        }

        public boolean parseField(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "getDescribe":
                    bLiveIntlMedalWallItem.getDescribe = jsonParser.getValueAsString();
                    return true;
                case "dynamicIcon":
                    bLiveIntlMedalWallItem.dynamicIcon = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveIntlMedalWallItem.f44391id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveIntlMedalWallItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveIntlMedalWallItem.name = jsonParser.getValueAsString();
                    return true;
                case "gotoUrl":
                    bLiveIntlMedalWallItem.gotoUrl = jsonParser.getValueAsString();
                    return true;
                case "buttonType":
                    bLiveIntlMedalWallItem.buttonType = jsonParser.getValueAsString();
                    return true;
                case "describe":
                    bLiveIntlMedalWallItem.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlMedalWallItem.f44391id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveIntlMedalWallItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveIntlMedalWallItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveIntlMedalWallItem.describe;
            if (str4 != null) {
                jsonGenerator.writeStringField("describe", str4);
            }
            String str5 = bLiveIntlMedalWallItem.getDescribe;
            if (str5 != null) {
                jsonGenerator.writeStringField("getDescribe", str5);
            }
            String str6 = bLiveIntlMedalWallItem.buttonType;
            if (str6 != null) {
                jsonGenerator.writeStringField("buttonType", str6);
            }
            String str7 = bLiveIntlMedalWallItem.gotoUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("gotoUrl", str7);
            }
            String str8 = bLiveIntlMedalWallItem.dynamicIcon;
            if (str8 != null) {
                jsonGenerator.writeStringField("dynamicIcon", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlMedalWallItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem$a */
    public class C11780a extends MessageNanoAdapter<BLiveIntlMedalWallItem> {
        public C11780a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
            String str = bLiveIntlMedalWallItem.f44391id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveIntlMedalWallItem.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveIntlMedalWallItem.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bLiveIntlMedalWallItem.describe;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = bLiveIntlMedalWallItem.getDescribe;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = bLiveIntlMedalWallItem.buttonType;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = bLiveIntlMedalWallItem.gotoUrl;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = bLiveIntlMedalWallItem.dynamicIcon;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            bLiveIntlMedalWallItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveIntlMedalWallItem parse(nb5 nb5Var) throws IOException {
            BLiveIntlMedalWallItem bLiveIntlMedalWallItem = new BLiveIntlMedalWallItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveIntlMedalWallItem.f44391id == null) {
                        bLiveIntlMedalWallItem.f44391id = "";
                    }
                    if (bLiveIntlMedalWallItem.name == null) {
                        bLiveIntlMedalWallItem.name = "";
                    }
                    if (bLiveIntlMedalWallItem.icon == null) {
                        bLiveIntlMedalWallItem.icon = "";
                    }
                    if (bLiveIntlMedalWallItem.describe == null) {
                        bLiveIntlMedalWallItem.describe = "";
                    }
                    if (bLiveIntlMedalWallItem.getDescribe == null) {
                        bLiveIntlMedalWallItem.getDescribe = "";
                    }
                    if (bLiveIntlMedalWallItem.buttonType == null) {
                        bLiveIntlMedalWallItem.buttonType = "";
                    }
                    if (bLiveIntlMedalWallItem.gotoUrl == null) {
                        bLiveIntlMedalWallItem.gotoUrl = "";
                    }
                    if (bLiveIntlMedalWallItem.dynamicIcon != null) {
                        break;
                    }
                    bLiveIntlMedalWallItem.dynamicIcon = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveIntlMedalWallItem.f44391id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveIntlMedalWallItem.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveIntlMedalWallItem.icon = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    bLiveIntlMedalWallItem.describe = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    bLiveIntlMedalWallItem.getDescribe = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    bLiveIntlMedalWallItem.buttonType = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    bLiveIntlMedalWallItem.gotoUrl = nb5Var.m158750s();
                } else {
                    if (iM158752u != 66) {
                        if (bLiveIntlMedalWallItem.f44391id == null) {
                            bLiveIntlMedalWallItem.f44391id = "";
                        }
                        if (bLiveIntlMedalWallItem.name == null) {
                            bLiveIntlMedalWallItem.name = "";
                        }
                        if (bLiveIntlMedalWallItem.icon == null) {
                            bLiveIntlMedalWallItem.icon = "";
                        }
                        if (bLiveIntlMedalWallItem.describe == null) {
                            bLiveIntlMedalWallItem.describe = "";
                        }
                        if (bLiveIntlMedalWallItem.getDescribe == null) {
                            bLiveIntlMedalWallItem.getDescribe = "";
                        }
                        if (bLiveIntlMedalWallItem.buttonType == null) {
                            bLiveIntlMedalWallItem.buttonType = "";
                        }
                        if (bLiveIntlMedalWallItem.gotoUrl == null) {
                            bLiveIntlMedalWallItem.gotoUrl = "";
                        }
                        if (bLiveIntlMedalWallItem.dynamicIcon != null) {
                            break;
                        }
                        bLiveIntlMedalWallItem.dynamicIcon = "";
                        return bLiveIntlMedalWallItem;
                    }
                    bLiveIntlMedalWallItem.dynamicIcon = nb5Var.m158750s();
                }
            }
            return bLiveIntlMedalWallItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveIntlMedalWallItem.f44391id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveIntlMedalWallItem.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveIntlMedalWallItem.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bLiveIntlMedalWallItem.describe;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = bLiveIntlMedalWallItem.getDescribe;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = bLiveIntlMedalWallItem.buttonType;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = bLiveIntlMedalWallItem.gotoUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = bLiveIntlMedalWallItem.dynamicIcon;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
        }
    }

    public static BLiveIntlMedalWallItem new_() {
        BLiveIntlMedalWallItem bLiveIntlMedalWallItem = new BLiveIntlMedalWallItem();
        bLiveIntlMedalWallItem.nullCheck();
        return bLiveIntlMedalWallItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlMedalWallItem mo223809clone() {
        BLiveIntlMedalWallItem bLiveIntlMedalWallItem = new BLiveIntlMedalWallItem();
        bLiveIntlMedalWallItem.f44391id = this.f44391id;
        bLiveIntlMedalWallItem.name = this.name;
        bLiveIntlMedalWallItem.icon = this.icon;
        bLiveIntlMedalWallItem.describe = this.describe;
        bLiveIntlMedalWallItem.getDescribe = this.getDescribe;
        bLiveIntlMedalWallItem.buttonType = this.buttonType;
        bLiveIntlMedalWallItem.gotoUrl = this.gotoUrl;
        bLiveIntlMedalWallItem.dynamicIcon = this.dynamicIcon;
        return bLiveIntlMedalWallItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlMedalWallItem)) {
            return false;
        }
        BLiveIntlMedalWallItem bLiveIntlMedalWallItem = (BLiveIntlMedalWallItem) obj;
        return ValueObject.util_equals(this.f44391id, bLiveIntlMedalWallItem.f44391id) && ValueObject.util_equals(this.name, bLiveIntlMedalWallItem.name) && ValueObject.util_equals(this.icon, bLiveIntlMedalWallItem.icon) && ValueObject.util_equals(this.describe, bLiveIntlMedalWallItem.describe) && ValueObject.util_equals(this.getDescribe, bLiveIntlMedalWallItem.getDescribe) && ValueObject.util_equals(this.buttonType, bLiveIntlMedalWallItem.buttonType) && ValueObject.util_equals(this.gotoUrl, bLiveIntlMedalWallItem.gotoUrl) && ValueObject.util_equals(this.dynamicIcon, bLiveIntlMedalWallItem.dynamicIcon);
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
        String str = this.f44391id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.describe;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.getDescribe;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buttonType;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.gotoUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.dynamicIcon;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    public boolean isHaveLightButton() {
        return !TextUtils.isEmpty(this.buttonType);
    }

    public boolean isLight() {
        return !TextUtils.isEmpty(this.getDescribe);
    }

    public boolean isOver() {
        return "over".equals(this.buttonType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44391id == null) {
            this.f44391id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.describe == null) {
            this.describe = "";
        }
        if (this.getDescribe == null) {
            this.getDescribe = "";
        }
        if (this.buttonType == null) {
            this.buttonType = "";
        }
        if (this.gotoUrl == null) {
            this.gotoUrl = "";
        }
        if (this.dynamicIcon == null) {
            this.dynamicIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
