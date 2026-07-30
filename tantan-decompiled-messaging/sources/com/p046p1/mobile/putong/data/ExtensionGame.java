package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.ExtensionGame;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class ExtensionGame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extensiongame";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> level;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> name;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> screenshot;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> together;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> voice;
    public static ProtobufAdapter<ExtensionGame> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtensionGame>() { // from class: com.p1.mobile.putong.data.ExtensionGame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExtensionGame extensionGame) {
            List<String> list = extensionGame.name;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = extensionGame.together;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = extensionGame.level;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = extensionGame.voice;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = extensionGame.screenshot;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            extensionGame.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExtensionGame parse(nb5 nb5Var) throws IOException {
            ExtensionGame extensionGame = new ExtensionGame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (extensionGame.name == null) {
                        extensionGame.name = new ArrayList();
                    }
                    if (extensionGame.together == null) {
                        extensionGame.together = new ArrayList();
                    }
                    if (extensionGame.level == null) {
                        extensionGame.level = new ArrayList();
                    }
                    if (extensionGame.voice == null) {
                        extensionGame.voice = new ArrayList();
                    }
                    if (extensionGame.screenshot != null) {
                        break;
                    }
                    extensionGame.screenshot = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    extensionGame.name = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    extensionGame.together = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    extensionGame.level = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    extensionGame.voice = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 42) {
                        if (extensionGame.name == null) {
                            extensionGame.name = new ArrayList();
                        }
                        if (extensionGame.together == null) {
                            extensionGame.together = new ArrayList();
                        }
                        if (extensionGame.level == null) {
                            extensionGame.level = new ArrayList();
                        }
                        if (extensionGame.voice == null) {
                            extensionGame.voice = new ArrayList();
                        }
                        if (extensionGame.screenshot != null) {
                            break;
                        }
                        extensionGame.screenshot = new ArrayList();
                        return extensionGame;
                    }
                    extensionGame.screenshot = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return extensionGame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExtensionGame extensionGame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = extensionGame.name;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = extensionGame.together;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = extensionGame.level;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = extensionGame.voice;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = extensionGame.screenshot;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ExtensionGame> JSON_ADAPTER = new ObjectJsonAdapter<ExtensionGame>() { // from class: com.p1.mobile.putong.data.ExtensionGame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExtensionGame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExtensionGame newInstance() {
            return new ExtensionGame();
        }

        public boolean parseField(ExtensionGame extensionGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "together":
                    extensionGame.together = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "screenshot":
                    extensionGame.screenshot = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    extensionGame.name = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "level":
                    extensionGame.level = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "voice":
                    extensionGame.voice = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExtensionGame extensionGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "together":
                case "screenshot":
                case "name":
                case "level":
                case "voice":
                    return true;
                default:
                    return super.parseFieldCheck(extensionGame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExtensionGame extensionGame, JsonGenerator jsonGenerator) throws IOException {
            if (extensionGame.name != null) {
                jsonGenerator.writeFieldName(AuthenticationTokenClaims.JSON_KEY_NAME);
                JsonAdapter.serializeArray(extensionGame.name, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (extensionGame.together != null) {
                jsonGenerator.writeFieldName("together");
                JsonAdapter.serializeArray(extensionGame.together, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (extensionGame.level != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.LEVEL);
                JsonAdapter.serializeArray(extensionGame.level, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (extensionGame.voice != null) {
                jsonGenerator.writeFieldName("voice");
                JsonAdapter.serializeArray(extensionGame.voice, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (extensionGame.screenshot != null) {
                jsonGenerator.writeFieldName("screenshot");
                JsonAdapter.serializeArray(extensionGame.screenshot, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtensionGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtensionGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59760a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59761b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59762c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59763d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m59764e(String str) {
        return str;
    }

    public static ExtensionGame new_() {
        ExtensionGame extensionGame = new ExtensionGame();
        extensionGame.nullCheck();
        return extensionGame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExtensionGame mo223809clone() {
        ExtensionGame extensionGame = new ExtensionGame();
        List<String> list = this.name;
        if (list != null) {
            extensionGame.name = ValueObject.util_map(list, new w9j() { // from class: l.hpf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ExtensionGame.m59763d((String) obj);
                }
            });
        }
        List<String> list2 = this.together;
        if (list2 != null) {
            extensionGame.together = ValueObject.util_map(list2, new w9j() { // from class: l.ipf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ExtensionGame.m59761b((String) obj);
                }
            });
        }
        List<String> list3 = this.level;
        if (list3 != null) {
            extensionGame.level = ValueObject.util_map(list3, new w9j() { // from class: l.jpf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ExtensionGame.m59760a((String) obj);
                }
            });
        }
        List<String> list4 = this.voice;
        if (list4 != null) {
            extensionGame.voice = ValueObject.util_map(list4, new w9j() { // from class: l.kpf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ExtensionGame.m59762c((String) obj);
                }
            });
        }
        List<String> list5 = this.screenshot;
        if (list5 != null) {
            extensionGame.screenshot = ValueObject.util_map(list5, new w9j() { // from class: l.lpf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ExtensionGame.m59764e((String) obj);
                }
            });
        }
        return extensionGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtensionGame)) {
            return false;
        }
        ExtensionGame extensionGame = (ExtensionGame) obj;
        return ValueObject.util_equals(this.name, extensionGame.name) && ValueObject.util_equals(this.together, extensionGame.together) && ValueObject.util_equals(this.level, extensionGame.level) && ValueObject.util_equals(this.voice, extensionGame.voice) && ValueObject.util_equals(this.screenshot, extensionGame.screenshot);
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
        List<String> list = this.name;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.together;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.level;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.voice;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.screenshot;
        int iHashCode5 = iHashCode4 + (list5 != null ? list5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = new ArrayList();
        }
        if (this.together == null) {
            this.together = new ArrayList();
        }
        if (this.level == null) {
            this.level = new ArrayList();
        }
        if (this.voice == null) {
            this.voice = new ArrayList();
        }
        if (this.screenshot == null) {
            this.screenshot = new ArrayList();
        }
    }

    public ExtensionGame subtract(ExtensionGame extensionGame) {
        ExtensionGame extensionGame2 = new ExtensionGame();
        if (!ValueObject.util_equals(this.name, extensionGame.name)) {
            extensionGame2.name = this.name;
        }
        if (!ValueObject.util_equals(this.together, extensionGame.together)) {
            extensionGame2.together = this.together;
        }
        if (!ValueObject.util_equals(this.level, extensionGame.level)) {
            extensionGame2.level = this.level;
        }
        if (!ValueObject.util_equals(this.voice, extensionGame.voice)) {
            extensionGame2.voice = this.voice;
        }
        if (!ValueObject.util_equals(this.screenshot, extensionGame.screenshot)) {
            extensionGame2.screenshot = this.screenshot;
        }
        if (extensionGame2.equals(new ExtensionGame())) {
            return null;
        }
        return extensionGame2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
