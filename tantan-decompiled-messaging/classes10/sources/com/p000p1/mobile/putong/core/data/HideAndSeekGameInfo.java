package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HideAndSeekGameInfo;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HideAndSeekGameInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekgameinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public String gameAddress;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gameDesc;

    @NonNull
    @ProtobufIndex(index = 1)
    public String gameIcon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public GameIdentity gameIdentity;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> gamePlayerIcons;

    @NonNull
    @ProtobufIndex(index = 8)
    public GamePlayerState gamePlayerState;

    @NonNull
    @ProtobufIndex(index = 7)
    public GameStage gameStage;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String gameTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String gameTitle;
    public static ProtobufAdapter<HideAndSeekGameInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekGameInfo>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekGameInfo hideAndSeekGameInfo) {
            String str = hideAndSeekGameInfo.gameIcon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            GameIdentity gameIdentity = hideAndSeekGameInfo.gameIdentity;
            if (gameIdentity != null) {
                iO += CodedOutputByteBufferNano.l(2, gameIdentity, GameIdentity.PROTOBUF_ADAPTER);
            }
            String str2 = hideAndSeekGameInfo.gameTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = hideAndSeekGameInfo.gameDesc;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = hideAndSeekGameInfo.gameTime;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = hideAndSeekGameInfo.gameAddress;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            GameStage gameStage = hideAndSeekGameInfo.gameStage;
            if (gameStage != null) {
                iO += CodedOutputByteBufferNano.l(7, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            GamePlayerState gamePlayerState = hideAndSeekGameInfo.gamePlayerState;
            if (gamePlayerState != null) {
                iO += CodedOutputByteBufferNano.l(8, gamePlayerState, GamePlayerState.PROTOBUF_ADAPTER);
            }
            List<String> list = hideAndSeekGameInfo.gamePlayerIcons;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(9, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) hideAndSeekGameInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekGameInfo m13263parse(nb5 nb5Var) throws IOException {
            HideAndSeekGameInfo hideAndSeekGameInfo = new HideAndSeekGameInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekGameInfo.gameIcon == null) {
                        hideAndSeekGameInfo.gameIcon = "";
                    }
                    if (hideAndSeekGameInfo.gameIdentity == null) {
                        hideAndSeekGameInfo.gameIdentity = (GameIdentity) GameIdentity.JSON_ADAPTER.defaultEnum();
                    }
                    if (hideAndSeekGameInfo.gameTitle == null) {
                        hideAndSeekGameInfo.gameTitle = "";
                    }
                    if (hideAndSeekGameInfo.gameDesc == null) {
                        hideAndSeekGameInfo.gameDesc = "";
                    }
                    if (hideAndSeekGameInfo.gameTime == null) {
                        hideAndSeekGameInfo.gameTime = "";
                    }
                    if (hideAndSeekGameInfo.gameAddress == null) {
                        hideAndSeekGameInfo.gameAddress = "";
                    }
                    if (hideAndSeekGameInfo.gameStage == null) {
                        hideAndSeekGameInfo.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                    }
                    if (hideAndSeekGameInfo.gamePlayerState == null) {
                        hideAndSeekGameInfo.gamePlayerState = (GamePlayerState) GamePlayerState.JSON_ADAPTER.defaultEnum();
                    }
                    if (hideAndSeekGameInfo.gamePlayerIcons != null) {
                        break;
                    }
                    hideAndSeekGameInfo.gamePlayerIcons = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    hideAndSeekGameInfo.gameIcon = nb5Var.s();
                } else if (iU == 18) {
                    hideAndSeekGameInfo.gameIdentity = (GameIdentity) nb5Var.l(GameIdentity.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    hideAndSeekGameInfo.gameTitle = nb5Var.s();
                } else if (iU == 34) {
                    hideAndSeekGameInfo.gameDesc = nb5Var.s();
                } else if (iU == 42) {
                    hideAndSeekGameInfo.gameTime = nb5Var.s();
                } else if (iU == 50) {
                    hideAndSeekGameInfo.gameAddress = nb5Var.s();
                } else if (iU == 58) {
                    hideAndSeekGameInfo.gameStage = (GameStage) nb5Var.l(GameStage.PROTOBUF_ADAPTER);
                } else if (iU == 66) {
                    hideAndSeekGameInfo.gamePlayerState = (GamePlayerState) nb5Var.l(GamePlayerState.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
                        if (hideAndSeekGameInfo.gameIcon == null) {
                            hideAndSeekGameInfo.gameIcon = "";
                        }
                        if (hideAndSeekGameInfo.gameIdentity == null) {
                            hideAndSeekGameInfo.gameIdentity = (GameIdentity) GameIdentity.JSON_ADAPTER.defaultEnum();
                        }
                        if (hideAndSeekGameInfo.gameTitle == null) {
                            hideAndSeekGameInfo.gameTitle = "";
                        }
                        if (hideAndSeekGameInfo.gameDesc == null) {
                            hideAndSeekGameInfo.gameDesc = "";
                        }
                        if (hideAndSeekGameInfo.gameTime == null) {
                            hideAndSeekGameInfo.gameTime = "";
                        }
                        if (hideAndSeekGameInfo.gameAddress == null) {
                            hideAndSeekGameInfo.gameAddress = "";
                        }
                        if (hideAndSeekGameInfo.gameStage == null) {
                            hideAndSeekGameInfo.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
                        }
                        if (hideAndSeekGameInfo.gamePlayerState == null) {
                            hideAndSeekGameInfo.gamePlayerState = (GamePlayerState) GamePlayerState.JSON_ADAPTER.defaultEnum();
                        }
                        if (hideAndSeekGameInfo.gamePlayerIcons != null) {
                            break;
                        }
                        hideAndSeekGameInfo.gamePlayerIcons = new ArrayList();
                        return hideAndSeekGameInfo;
                    }
                    hideAndSeekGameInfo.gamePlayerIcons = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return hideAndSeekGameInfo;
        }

        public void serialize(HideAndSeekGameInfo hideAndSeekGameInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = hideAndSeekGameInfo.gameIcon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            GameIdentity gameIdentity = hideAndSeekGameInfo.gameIdentity;
            if (gameIdentity != null) {
                codedOutputByteBufferNano.K(2, gameIdentity, GameIdentity.PROTOBUF_ADAPTER);
            }
            String str2 = hideAndSeekGameInfo.gameTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = hideAndSeekGameInfo.gameDesc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = hideAndSeekGameInfo.gameTime;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = hideAndSeekGameInfo.gameAddress;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            GameStage gameStage = hideAndSeekGameInfo.gameStage;
            if (gameStage != null) {
                codedOutputByteBufferNano.K(7, gameStage, GameStage.PROTOBUF_ADAPTER);
            }
            GamePlayerState gamePlayerState = hideAndSeekGameInfo.gamePlayerState;
            if (gamePlayerState != null) {
                codedOutputByteBufferNano.K(8, gamePlayerState, GamePlayerState.PROTOBUF_ADAPTER);
            }
            List<String> list = hideAndSeekGameInfo.gamePlayerIcons;
            if (list != null) {
                codedOutputByteBufferNano.K(9, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HideAndSeekGameInfo> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekGameInfo>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekGameInfo.2
        public Class getDataClass() {
            return HideAndSeekGameInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekGameInfo m13264newInstance() {
            return new HideAndSeekGameInfo();
        }

        public boolean parseField(HideAndSeekGameInfo hideAndSeekGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gameDesc":
                    hideAndSeekGameInfo.gameDesc = jsonParser.getValueAsString();
                    return true;
                case "gameIcon":
                    hideAndSeekGameInfo.gameIcon = jsonParser.getValueAsString();
                    return true;
                case "gameTime":
                    hideAndSeekGameInfo.gameTime = jsonParser.getValueAsString();
                    return true;
                case "gameAddress":
                    hideAndSeekGameInfo.gameAddress = jsonParser.getValueAsString();
                    return true;
                case "gamePlayerIcons":
                    hideAndSeekGameInfo.gamePlayerIcons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gamePlayerState":
                    hideAndSeekGameInfo.gamePlayerState = (GamePlayerState) GamePlayerState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "gameIdentity":
                    hideAndSeekGameInfo.gameIdentity = (GameIdentity) GameIdentity.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "gameStage":
                    hideAndSeekGameInfo.gameStage = (GameStage) GameStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "gameTitle":
                    hideAndSeekGameInfo.gameTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HideAndSeekGameInfo hideAndSeekGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gameDesc":
                case "gameIcon":
                case "gameTime":
                case "gameAddress":
                case "gamePlayerIcons":
                case "gamePlayerState":
                case "gameIdentity":
                case "gameStage":
                case "gameTitle":
                    return true;
                default:
                    return super.parseFieldCheck(hideAndSeekGameInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(HideAndSeekGameInfo hideAndSeekGameInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = hideAndSeekGameInfo.gameIcon;
            if (str != null) {
                jsonGenerator.writeStringField("gameIcon", str);
            }
            if (hideAndSeekGameInfo.gameIdentity != null) {
                jsonGenerator.writeFieldName("gameIdentity");
                GameIdentity.JSON_ADAPTER.serialize(hideAndSeekGameInfo.gameIdentity, jsonGenerator, true);
            }
            String str2 = hideAndSeekGameInfo.gameTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("gameTitle", str2);
            }
            String str3 = hideAndSeekGameInfo.gameDesc;
            if (str3 != null) {
                jsonGenerator.writeStringField("gameDesc", str3);
            }
            String str4 = hideAndSeekGameInfo.gameTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("gameTime", str4);
            }
            String str5 = hideAndSeekGameInfo.gameAddress;
            if (str5 != null) {
                jsonGenerator.writeStringField("gameAddress", str5);
            }
            if (hideAndSeekGameInfo.gameStage != null) {
                jsonGenerator.writeFieldName("gameStage");
                GameStage.JSON_ADAPTER.serialize(hideAndSeekGameInfo.gameStage, jsonGenerator, true);
            }
            if (hideAndSeekGameInfo.gamePlayerState != null) {
                jsonGenerator.writeFieldName("gamePlayerState");
                GamePlayerState.JSON_ADAPTER.serialize(hideAndSeekGameInfo.gamePlayerState, jsonGenerator, true);
            }
            if (hideAndSeekGameInfo.gamePlayerIcons != null) {
                jsonGenerator.writeFieldName("gamePlayerIcons");
                JsonAdapter.serializeArray(hideAndSeekGameInfo.gamePlayerIcons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m379a(String str) {
        return str;
    }

    public static HideAndSeekGameInfo new_() {
        HideAndSeekGameInfo hideAndSeekGameInfo = new HideAndSeekGameInfo();
        hideAndSeekGameInfo.nullCheck();
        return hideAndSeekGameInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekGameInfo m13262clone() {
        HideAndSeekGameInfo hideAndSeekGameInfo = new HideAndSeekGameInfo();
        hideAndSeekGameInfo.gameIcon = this.gameIcon;
        hideAndSeekGameInfo.gameIdentity = this.gameIdentity;
        hideAndSeekGameInfo.gameTitle = this.gameTitle;
        hideAndSeekGameInfo.gameDesc = this.gameDesc;
        hideAndSeekGameInfo.gameTime = this.gameTime;
        hideAndSeekGameInfo.gameAddress = this.gameAddress;
        hideAndSeekGameInfo.gameStage = this.gameStage;
        hideAndSeekGameInfo.gamePlayerState = this.gamePlayerState;
        List<String> list = this.gamePlayerIcons;
        if (list != null) {
            hideAndSeekGameInfo.gamePlayerIcons = ValueObject.util_map(list, new w9j() { // from class: l.wzk
                public final Object call(Object obj) {
                    return HideAndSeekGameInfo.m379a((String) obj);
                }
            });
        }
        return hideAndSeekGameInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekGameInfo)) {
            return false;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo = (HideAndSeekGameInfo) obj;
        return ValueObject.util_equals(this.gameIcon, hideAndSeekGameInfo.gameIcon) && ValueObject.util_equals(this.gameIdentity, hideAndSeekGameInfo.gameIdentity) && ValueObject.util_equals(this.gameTitle, hideAndSeekGameInfo.gameTitle) && ValueObject.util_equals(this.gameDesc, hideAndSeekGameInfo.gameDesc) && ValueObject.util_equals(this.gameTime, hideAndSeekGameInfo.gameTime) && ValueObject.util_equals(this.gameAddress, hideAndSeekGameInfo.gameAddress) && ValueObject.util_equals(this.gameStage, hideAndSeekGameInfo.gameStage) && ValueObject.util_equals(this.gamePlayerState, hideAndSeekGameInfo.gamePlayerState) && ValueObject.util_equals(this.gamePlayerIcons, hideAndSeekGameInfo.gamePlayerIcons);
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
        String str = this.gameIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        GameIdentity gameIdentity = this.gameIdentity;
        int iHashCode2 = (iHashCode + (gameIdentity != null ? gameIdentity.hashCode() : 0)) * 41;
        String str2 = this.gameTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gameDesc;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gameTime;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.gameAddress;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        GameStage gameStage = this.gameStage;
        int iHashCode7 = (iHashCode6 + (gameStage != null ? gameStage.hashCode() : 0)) * 41;
        GamePlayerState gamePlayerState = this.gamePlayerState;
        int iHashCode8 = (iHashCode7 + (gamePlayerState != null ? gamePlayerState.hashCode() : 0)) * 41;
        List<String> list = this.gamePlayerIcons;
        int iHashCode9 = iHashCode8 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.gameIcon == null) {
            this.gameIcon = "";
        }
        if (this.gameIdentity == null) {
            this.gameIdentity = (GameIdentity) GameIdentity.JSON_ADAPTER.defaultEnum();
        }
        if (this.gameTitle == null) {
            this.gameTitle = "";
        }
        if (this.gameDesc == null) {
            this.gameDesc = "";
        }
        if (this.gameTime == null) {
            this.gameTime = "";
        }
        if (this.gameAddress == null) {
            this.gameAddress = "";
        }
        if (this.gameStage == null) {
            this.gameStage = (GameStage) GameStage.JSON_ADAPTER.defaultEnum();
        }
        if (this.gamePlayerState == null) {
            this.gamePlayerState = (GamePlayerState) GamePlayerState.JSON_ADAPTER.defaultEnum();
        }
        if (this.gamePlayerIcons == null) {
            this.gamePlayerIcons = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
