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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceHeatBoxEntrance extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoiceheatboxentrance";

    @NonNull
    @ProtobufIndex(index = 7)
    public String content;

    @ProtobufIndex(index = 6)
    public boolean distribute;

    @NonNull
    @ProtobufIndex(index = 8)
    public String giftContent;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftSchema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String h5JumpUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    @ProtobufIndex(index = 5)
    public int progress;

    @ProtobufIndex(index = 1)
    public boolean showEntrance;
    public static ProtobufAdapter<BLiveVoiceHeatBoxEntrance> PROTOBUF_ADAPTER = new C12470a();
    public static JsonAdapter<BLiveVoiceHeatBoxEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHeatBoxEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHeatBoxEntrance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHeatBoxEntrance newInstance() {
            return new BLiveVoiceHeatBoxEntrance();
        }

        public boolean parseField(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "distribute":
                    bLiveVoiceHeatBoxEntrance.distribute = jsonParser.getValueAsBoolean();
                    return true;
                case "progress":
                    bLiveVoiceHeatBoxEntrance.progress = jsonParser.getValueAsInt();
                    return true;
                case "h5JumpUrl":
                    bLiveVoiceHeatBoxEntrance.h5JumpUrl = jsonParser.getValueAsString();
                    return true;
                case "giftContent":
                    bLiveVoiceHeatBoxEntrance.giftContent = jsonParser.getValueAsString();
                    return true;
                case "giftSchema":
                    bLiveVoiceHeatBoxEntrance.giftSchema = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveVoiceHeatBoxEntrance.content = jsonParser.getValueAsString();
                    return true;
                case "showEntrance":
                    bLiveVoiceHeatBoxEntrance.showEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case "iconUrl":
                    bLiveVoiceHeatBoxEntrance.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showEntrance", bLiveVoiceHeatBoxEntrance.showEntrance);
            String str = bLiveVoiceHeatBoxEntrance.h5JumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("h5JumpUrl", str);
            }
            String str2 = bLiveVoiceHeatBoxEntrance.giftSchema;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftSchema", str2);
            }
            String str3 = bLiveVoiceHeatBoxEntrance.iconUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconUrl", str3);
            }
            jsonGenerator.writeNumberField("progress", bLiveVoiceHeatBoxEntrance.progress);
            jsonGenerator.writeBooleanField("distribute", bLiveVoiceHeatBoxEntrance.distribute);
            String str4 = bLiveVoiceHeatBoxEntrance.content;
            if (str4 != null) {
                jsonGenerator.writeStringField("content", str4);
            }
            String str5 = bLiveVoiceHeatBoxEntrance.giftContent;
            if (str5 != null) {
                jsonGenerator.writeStringField("giftContent", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHeatBoxEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceHeatBoxEntrance$a */
    public class C12470a extends MessageNanoAdapter<BLiveVoiceHeatBoxEntrance> {
        public C12470a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, bLiveVoiceHeatBoxEntrance.showEntrance);
            String str = bLiveVoiceHeatBoxEntrance.h5JumpUrl;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveVoiceHeatBoxEntrance.giftSchema;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveVoiceHeatBoxEntrance.iconUrl;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(5, bLiveVoiceHeatBoxEntrance.progress) + CodedOutputByteBufferNano.m17275b(6, bLiveVoiceHeatBoxEntrance.distribute);
            String str4 = bLiveVoiceHeatBoxEntrance.content;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            String str5 = bLiveVoiceHeatBoxEntrance.giftContent;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            bLiveVoiceHeatBoxEntrance.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceHeatBoxEntrance parse(nc5 nc5Var) throws IOException {
            BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = new BLiveVoiceHeatBoxEntrance();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveVoiceHeatBoxEntrance.h5JumpUrl == null) {
                        bLiveVoiceHeatBoxEntrance.h5JumpUrl = "";
                    }
                    if (bLiveVoiceHeatBoxEntrance.giftSchema == null) {
                        bLiveVoiceHeatBoxEntrance.giftSchema = "";
                    }
                    if (bLiveVoiceHeatBoxEntrance.iconUrl == null) {
                        bLiveVoiceHeatBoxEntrance.iconUrl = "";
                    }
                    if (bLiveVoiceHeatBoxEntrance.content == null) {
                        bLiveVoiceHeatBoxEntrance.content = "";
                    }
                    if (bLiveVoiceHeatBoxEntrance.giftContent != null) {
                        break;
                    }
                    bLiveVoiceHeatBoxEntrance.giftContent = "";
                    break;
                }
                if (iM162497u == 8) {
                    bLiveVoiceHeatBoxEntrance.showEntrance = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    bLiveVoiceHeatBoxEntrance.h5JumpUrl = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveVoiceHeatBoxEntrance.giftSchema = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveVoiceHeatBoxEntrance.iconUrl = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    bLiveVoiceHeatBoxEntrance.progress = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    bLiveVoiceHeatBoxEntrance.distribute = nc5Var.m162483g();
                } else if (iM162497u == 58) {
                    bLiveVoiceHeatBoxEntrance.content = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (bLiveVoiceHeatBoxEntrance.h5JumpUrl == null) {
                            bLiveVoiceHeatBoxEntrance.h5JumpUrl = "";
                        }
                        if (bLiveVoiceHeatBoxEntrance.giftSchema == null) {
                            bLiveVoiceHeatBoxEntrance.giftSchema = "";
                        }
                        if (bLiveVoiceHeatBoxEntrance.iconUrl == null) {
                            bLiveVoiceHeatBoxEntrance.iconUrl = "";
                        }
                        if (bLiveVoiceHeatBoxEntrance.content == null) {
                            bLiveVoiceHeatBoxEntrance.content = "";
                        }
                        if (bLiveVoiceHeatBoxEntrance.giftContent != null) {
                            break;
                        }
                        bLiveVoiceHeatBoxEntrance.giftContent = "";
                        return bLiveVoiceHeatBoxEntrance;
                    }
                    bLiveVoiceHeatBoxEntrance.giftContent = nc5Var.m162495s();
                }
            }
            return bLiveVoiceHeatBoxEntrance;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, bLiveVoiceHeatBoxEntrance.showEntrance);
            String str = bLiveVoiceHeatBoxEntrance.h5JumpUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveVoiceHeatBoxEntrance.giftSchema;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveVoiceHeatBoxEntrance.iconUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, bLiveVoiceHeatBoxEntrance.progress);
            codedOutputByteBufferNano.m17299A(6, bLiveVoiceHeatBoxEntrance.distribute);
            String str4 = bLiveVoiceHeatBoxEntrance.content;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            String str5 = bLiveVoiceHeatBoxEntrance.giftContent;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
        }
    }

    public static BLiveVoiceHeatBoxEntrance new_() {
        BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = new BLiveVoiceHeatBoxEntrance();
        bLiveVoiceHeatBoxEntrance.nullCheck();
        return bLiveVoiceHeatBoxEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHeatBoxEntrance mo225055clone() {
        BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = new BLiveVoiceHeatBoxEntrance();
        bLiveVoiceHeatBoxEntrance.showEntrance = this.showEntrance;
        bLiveVoiceHeatBoxEntrance.h5JumpUrl = this.h5JumpUrl;
        bLiveVoiceHeatBoxEntrance.giftSchema = this.giftSchema;
        bLiveVoiceHeatBoxEntrance.iconUrl = this.iconUrl;
        bLiveVoiceHeatBoxEntrance.progress = this.progress;
        bLiveVoiceHeatBoxEntrance.distribute = this.distribute;
        bLiveVoiceHeatBoxEntrance.content = this.content;
        bLiveVoiceHeatBoxEntrance.giftContent = this.giftContent;
        return bLiveVoiceHeatBoxEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHeatBoxEntrance)) {
            return false;
        }
        BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = (BLiveVoiceHeatBoxEntrance) obj;
        return this.showEntrance == bLiveVoiceHeatBoxEntrance.showEntrance && ValueObject.util_equals(this.h5JumpUrl, bLiveVoiceHeatBoxEntrance.h5JumpUrl) && ValueObject.util_equals(this.giftSchema, bLiveVoiceHeatBoxEntrance.giftSchema) && ValueObject.util_equals(this.iconUrl, bLiveVoiceHeatBoxEntrance.iconUrl) && this.progress == bLiveVoiceHeatBoxEntrance.progress && this.distribute == bLiveVoiceHeatBoxEntrance.distribute && ValueObject.util_equals(this.content, bLiveVoiceHeatBoxEntrance.content) && ValueObject.util_equals(this.giftContent, bLiveVoiceHeatBoxEntrance.giftContent);
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
        int i2 = ((i * 41) + (this.showEntrance ? 1231 : 1237)) * 41;
        String str = this.h5JumpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftSchema;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconUrl;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.progress) * 41) + (this.distribute ? 1231 : 1237)) * 41;
        String str4 = this.content;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.giftContent;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.h5JumpUrl == null) {
            this.h5JumpUrl = "";
        }
        if (this.giftSchema == null) {
            this.giftSchema = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.giftContent == null) {
            this.giftContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
