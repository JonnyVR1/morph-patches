package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSettingButton extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivesettingbutton";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveButtonAnimation animation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;
    public static ProtobufAdapter<BLiveSettingButton> PROTOBUF_ADAPTER = new C12222a();
    public static JsonAdapter<BLiveSettingButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSettingButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSettingButton.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSettingButton.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSettingButton newInstance() {
            return new BLiveSettingButton();
        }

        public boolean parseField(BLiveSettingButton bLiveSettingButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveSettingButton.schema = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveSettingButton.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveSettingButton.name = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveSettingButton.text = jsonParser.getValueAsString();
                    return true;
                case "animation":
                    bLiveSettingButton.animation = BLiveButtonAnimation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSettingButton bLiveSettingButton, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSettingButton.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveSettingButton.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveSettingButton.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = bLiveSettingButton.schema;
            if (str4 != null) {
                jsonGenerator.writeStringField("schema", str4);
            }
            if (bLiveSettingButton.animation != null) {
                jsonGenerator.writeFieldName("animation");
                BLiveButtonAnimation.JSON_ADAPTER.serialize(bLiveSettingButton.animation, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSettingButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveSettingButton$a */
    public class C12222a extends MessageNanoAdapter<BLiveSettingButton> {
        public C12222a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveSettingButton bLiveSettingButton) {
            String str = bLiveSettingButton.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bLiveSettingButton.icon;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = bLiveSettingButton.text;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = bLiveSettingButton.schema;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            BLiveButtonAnimation bLiveButtonAnimation = bLiveSettingButton.animation;
            if (bLiveButtonAnimation != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, bLiveButtonAnimation, BLiveButtonAnimation.PROTOBUF_ADAPTER);
            }
            bLiveSettingButton.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveSettingButton parse(nc5 nc5Var) throws IOException {
            BLiveSettingButton bLiveSettingButton = new BLiveSettingButton();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveSettingButton.name == null) {
                        bLiveSettingButton.name = "";
                    }
                    if (bLiveSettingButton.icon == null) {
                        bLiveSettingButton.icon = "";
                    }
                    if (bLiveSettingButton.text == null) {
                        bLiveSettingButton.text = "";
                    }
                    if (bLiveSettingButton.schema == null) {
                        bLiveSettingButton.schema = "";
                    }
                    if (bLiveSettingButton.animation != null) {
                        break;
                    }
                    bLiveSettingButton.animation = BLiveButtonAnimation.new_();
                    break;
                }
                if (iM162497u == 10) {
                    bLiveSettingButton.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bLiveSettingButton.icon = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveSettingButton.text = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveSettingButton.schema = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (bLiveSettingButton.name == null) {
                            bLiveSettingButton.name = "";
                        }
                        if (bLiveSettingButton.icon == null) {
                            bLiveSettingButton.icon = "";
                        }
                        if (bLiveSettingButton.text == null) {
                            bLiveSettingButton.text = "";
                        }
                        if (bLiveSettingButton.schema == null) {
                            bLiveSettingButton.schema = "";
                        }
                        if (bLiveSettingButton.animation != null) {
                            break;
                        }
                        bLiveSettingButton.animation = BLiveButtonAnimation.new_();
                        return bLiveSettingButton;
                    }
                    bLiveSettingButton.animation = (BLiveButtonAnimation) nc5Var.m162488l(BLiveButtonAnimation.PROTOBUF_ADAPTER);
                }
            }
            return bLiveSettingButton;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveSettingButton bLiveSettingButton, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveSettingButton.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bLiveSettingButton.icon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = bLiveSettingButton.text;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = bLiveSettingButton.schema;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            BLiveButtonAnimation bLiveButtonAnimation = bLiveSettingButton.animation;
            if (bLiveButtonAnimation != null) {
                codedOutputByteBufferNano.m17309K(5, bLiveButtonAnimation, BLiveButtonAnimation.PROTOBUF_ADAPTER);
            }
        }
    }

    public static BLiveSettingButton new_() {
        BLiveSettingButton bLiveSettingButton = new BLiveSettingButton();
        bLiveSettingButton.nullCheck();
        return bLiveSettingButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSettingButton mo225055clone() {
        BLiveSettingButton bLiveSettingButton = new BLiveSettingButton();
        bLiveSettingButton.name = this.name;
        bLiveSettingButton.icon = this.icon;
        bLiveSettingButton.text = this.text;
        bLiveSettingButton.schema = this.schema;
        BLiveButtonAnimation bLiveButtonAnimation = this.animation;
        if (bLiveButtonAnimation != null) {
            bLiveSettingButton.animation = bLiveButtonAnimation.mo225055clone();
        }
        return bLiveSettingButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSettingButton)) {
            return false;
        }
        BLiveSettingButton bLiveSettingButton = (BLiveSettingButton) obj;
        return ValueObject.util_equals(this.name, bLiveSettingButton.name) && ValueObject.util_equals(this.icon, bLiveSettingButton.icon) && ValueObject.util_equals(this.text, bLiveSettingButton.text) && ValueObject.util_equals(this.schema, bLiveSettingButton.schema) && ValueObject.util_equals(this.animation, bLiveSettingButton.animation);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.schema;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveButtonAnimation bLiveButtonAnimation = this.animation;
        int iHashCode5 = iHashCode4 + (bLiveButtonAnimation != null ? bLiveButtonAnimation.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.animation == null) {
            this.animation = BLiveButtonAnimation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
