package com.p051p1.mobile.putong.live.base.data;

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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class BQuickInvite extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bquickinvite";

    @NonNull
    @ProtobufIndex(index = 3)
    public String buttonText;

    @ProtobufIndex(index = 4)
    public int countDown;

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @ProtobufIndex(index = 6)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<BQuickInvite> PROTOBUF_ADAPTER = new C12590a();
    public static JsonAdapter<BQuickInvite> JSON_ADAPTER = new ObjectJsonAdapter<BQuickInvite>() { // from class: com.p1.mobile.putong.live.base.data.BQuickInvite.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BQuickInvite.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BQuickInvite newInstance() {
            return new BQuickInvite();
        }

        public boolean parseField(BQuickInvite bQuickInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    bQuickInvite.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "desc":
                    bQuickInvite.desc = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bQuickInvite.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bQuickInvite.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    bQuickInvite.buttonText = jsonParser.getValueAsString();
                    return true;
                case "countDown":
                    bQuickInvite.countDown = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BQuickInvite bQuickInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "desc":
                case "icon":
                case "title":
                case "buttonText":
                case "countDown":
                    return true;
                default:
                    return super.parseFieldCheck(bQuickInvite, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BQuickInvite bQuickInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bQuickInvite.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bQuickInvite.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = bQuickInvite.buttonText;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonText", str3);
            }
            jsonGenerator.writeNumberField("countDown", bQuickInvite.countDown);
            String str4 = bQuickInvite.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            jsonGenerator.writeBooleanField("enable", bQuickInvite.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BQuickInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BQuickInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BQuickInvite$a */
    public class C12590a extends MessageNanoAdapter<BQuickInvite> {
        public C12590a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BQuickInvite bQuickInvite) {
            String str = bQuickInvite.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bQuickInvite.desc;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = bQuickInvite.buttonText;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, bQuickInvite.countDown);
            String str4 = bQuickInvite.icon;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(6, bQuickInvite.enable);
            bQuickInvite.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BQuickInvite parse(nc5 nc5Var) throws IOException {
            BQuickInvite bQuickInvite = new BQuickInvite();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bQuickInvite.title == null) {
                        bQuickInvite.title = "";
                    }
                    if (bQuickInvite.desc == null) {
                        bQuickInvite.desc = "";
                    }
                    if (bQuickInvite.buttonText == null) {
                        bQuickInvite.buttonText = "";
                    }
                    if (bQuickInvite.icon != null) {
                        break;
                    }
                    bQuickInvite.icon = "";
                    break;
                }
                if (iM162497u == 10) {
                    bQuickInvite.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bQuickInvite.desc = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bQuickInvite.buttonText = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    bQuickInvite.countDown = nc5Var.m162486j();
                } else if (iM162497u == 42) {
                    bQuickInvite.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 48) {
                        if (bQuickInvite.title == null) {
                            bQuickInvite.title = "";
                        }
                        if (bQuickInvite.desc == null) {
                            bQuickInvite.desc = "";
                        }
                        if (bQuickInvite.buttonText == null) {
                            bQuickInvite.buttonText = "";
                        }
                        if (bQuickInvite.icon != null) {
                            break;
                        }
                        bQuickInvite.icon = "";
                        return bQuickInvite;
                    }
                    bQuickInvite.enable = nc5Var.m162483g();
                }
            }
            return bQuickInvite;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BQuickInvite bQuickInvite, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bQuickInvite.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bQuickInvite.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = bQuickInvite.buttonText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17305G(4, bQuickInvite.countDown);
            String str4 = bQuickInvite.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            codedOutputByteBufferNano.m17299A(6, bQuickInvite.enable);
        }
    }

    public static BQuickInvite new_() {
        BQuickInvite bQuickInvite = new BQuickInvite();
        bQuickInvite.nullCheck();
        return bQuickInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BQuickInvite mo225055clone() {
        BQuickInvite bQuickInvite = new BQuickInvite();
        bQuickInvite.title = this.title;
        bQuickInvite.desc = this.desc;
        bQuickInvite.buttonText = this.buttonText;
        bQuickInvite.countDown = this.countDown;
        bQuickInvite.icon = this.icon;
        bQuickInvite.enable = this.enable;
        return bQuickInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BQuickInvite)) {
            return false;
        }
        BQuickInvite bQuickInvite = (BQuickInvite) obj;
        return ValueObject.util_equals(this.title, bQuickInvite.title) && ValueObject.util_equals(this.desc, bQuickInvite.desc) && ValueObject.util_equals(this.buttonText, bQuickInvite.buttonText) && this.countDown == bQuickInvite.countDown && ValueObject.util_equals(this.icon, bQuickInvite.icon) && this.enable == bQuickInvite.enable;
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonText;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.countDown) * 41;
        String str4 = this.icon;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
