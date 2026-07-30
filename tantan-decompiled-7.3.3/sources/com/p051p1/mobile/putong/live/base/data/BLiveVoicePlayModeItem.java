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
public class BLiveVoicePlayModeItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoiceplaymodeitem";

    @ProtobufIndex(index = 1)
    public long agoraGameId;

    @ProtobufIndex(index = 6)
    public int height;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public String template;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @ProtobufIndex(index = 5)
    public int width;
    public static ProtobufAdapter<BLiveVoicePlayModeItem> PROTOBUF_ADAPTER = new C12515a();
    public static JsonAdapter<BLiveVoicePlayModeItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePlayModeItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePlayModeItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePlayModeItem newInstance() {
            return new BLiveVoicePlayModeItem();
        }

        public boolean parseField(BLiveVoicePlayModeItem bLiveVoicePlayModeItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    bLiveVoicePlayModeItem.template = jsonParser.getValueAsString();
                    return true;
                case "height":
                    bLiveVoicePlayModeItem.height = jsonParser.getValueAsInt();
                    return true;
                case "agoraGameId":
                    bLiveVoicePlayModeItem.agoraGameId = jsonParser.getValueAsLong();
                    return true;
                case "icon":
                    bLiveVoicePlayModeItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoicePlayModeItem.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoicePlayModeItem.type = jsonParser.getValueAsString();
                    return true;
                case "width":
                    bLiveVoicePlayModeItem.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePlayModeItem bLiveVoicePlayModeItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("agoraGameId", bLiveVoicePlayModeItem.agoraGameId);
            String str = bLiveVoicePlayModeItem.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveVoicePlayModeItem.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoicePlayModeItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeNumberField("width", bLiveVoicePlayModeItem.width);
            jsonGenerator.writeNumberField("height", bLiveVoicePlayModeItem.height);
            String str4 = bLiveVoicePlayModeItem.template;
            if (str4 != null) {
                jsonGenerator.writeStringField("template", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePlayModeItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem$a */
    public class C12515a extends MessageNanoAdapter<BLiveVoicePlayModeItem> {
        public C12515a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePlayModeItem bLiveVoicePlayModeItem) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, bLiveVoicePlayModeItem.agoraGameId);
            String str = bLiveVoicePlayModeItem.name;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveVoicePlayModeItem.type;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveVoicePlayModeItem.icon;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(5, bLiveVoicePlayModeItem.width) + CodedOutputByteBufferNano.m17281h(6, bLiveVoicePlayModeItem.height);
            String str4 = bLiveVoicePlayModeItem.template;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            bLiveVoicePlayModeItem.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePlayModeItem parse(nc5 nc5Var) throws IOException {
            BLiveVoicePlayModeItem bLiveVoicePlayModeItem = new BLiveVoicePlayModeItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveVoicePlayModeItem.name == null) {
                        bLiveVoicePlayModeItem.name = "";
                    }
                    if (bLiveVoicePlayModeItem.type == null) {
                        bLiveVoicePlayModeItem.type = "";
                    }
                    if (bLiveVoicePlayModeItem.icon == null) {
                        bLiveVoicePlayModeItem.icon = "";
                    }
                    if (bLiveVoicePlayModeItem.template != null) {
                        break;
                    }
                    bLiveVoicePlayModeItem.template = "";
                    break;
                }
                if (iM162497u == 8) {
                    bLiveVoicePlayModeItem.agoraGameId = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    bLiveVoicePlayModeItem.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveVoicePlayModeItem.type = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveVoicePlayModeItem.icon = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    bLiveVoicePlayModeItem.width = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    bLiveVoicePlayModeItem.height = nc5Var.m162486j();
                } else {
                    if (iM162497u != 58) {
                        if (bLiveVoicePlayModeItem.name == null) {
                            bLiveVoicePlayModeItem.name = "";
                        }
                        if (bLiveVoicePlayModeItem.type == null) {
                            bLiveVoicePlayModeItem.type = "";
                        }
                        if (bLiveVoicePlayModeItem.icon == null) {
                            bLiveVoicePlayModeItem.icon = "";
                        }
                        if (bLiveVoicePlayModeItem.template != null) {
                            break;
                        }
                        bLiveVoicePlayModeItem.template = "";
                        return bLiveVoicePlayModeItem;
                    }
                    bLiveVoicePlayModeItem.template = nc5Var.m162495s();
                }
            }
            return bLiveVoicePlayModeItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePlayModeItem bLiveVoicePlayModeItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, bLiveVoicePlayModeItem.agoraGameId);
            String str = bLiveVoicePlayModeItem.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveVoicePlayModeItem.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveVoicePlayModeItem.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, bLiveVoicePlayModeItem.width);
            codedOutputByteBufferNano.m17305G(6, bLiveVoicePlayModeItem.height);
            String str4 = bLiveVoicePlayModeItem.template;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
        }
    }

    public static BLiveVoicePlayModeItem new_() {
        BLiveVoicePlayModeItem bLiveVoicePlayModeItem = new BLiveVoicePlayModeItem();
        bLiveVoicePlayModeItem.nullCheck();
        return bLiveVoicePlayModeItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePlayModeItem mo225055clone() {
        BLiveVoicePlayModeItem bLiveVoicePlayModeItem = new BLiveVoicePlayModeItem();
        bLiveVoicePlayModeItem.agoraGameId = this.agoraGameId;
        bLiveVoicePlayModeItem.name = this.name;
        bLiveVoicePlayModeItem.type = this.type;
        bLiveVoicePlayModeItem.icon = this.icon;
        bLiveVoicePlayModeItem.width = this.width;
        bLiveVoicePlayModeItem.height = this.height;
        bLiveVoicePlayModeItem.template = this.template;
        return bLiveVoicePlayModeItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePlayModeItem)) {
            return false;
        }
        BLiveVoicePlayModeItem bLiveVoicePlayModeItem = (BLiveVoicePlayModeItem) obj;
        return this.agoraGameId == bLiveVoicePlayModeItem.agoraGameId && ValueObject.util_equals(this.name, bLiveVoicePlayModeItem.name) && ValueObject.util_equals(this.type, bLiveVoicePlayModeItem.type) && ValueObject.util_equals(this.icon, bLiveVoicePlayModeItem.icon) && this.width == bLiveVoicePlayModeItem.width && this.height == bLiveVoicePlayModeItem.height && ValueObject.util_equals(this.template, bLiveVoicePlayModeItem.template);
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
        long j = this.agoraGameId;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.width) * 41) + this.height) * 41;
        String str4 = this.template;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.template == null) {
            this.template = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
