package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUndercoverGame extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUndercoverGame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUndercoverGame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUndercoverGame.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUndercoverGame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUndercoverGame newInstance() {
            return new BLiveUndercoverGame();
        }

        public boolean parseField(BLiveUndercoverGame bLiveUndercoverGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainSeconds":
                    bLiveUndercoverGame.remainSeconds = jsonParser.getValueAsInt();
                    return true;
                case "currentPlayers":
                    bLiveUndercoverGame.currentPlayers = JsonAdapter.parseArray(jsonParser, BLiveUndercoverCurrentPlayer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bLiveUndercoverGame.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveUndercoverGame.f44464id = jsonParser.getValueAsString();
                    return false;
                case "votes":
                    bLiveUndercoverGame.votes = JsonAdapter.parseArray(jsonParser, BLiveUndercoverVote.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gameResult":
                    bLiveUndercoverGame.gameResult = BLiveUndercoverGameResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "countDownSeconds":
                    bLiveUndercoverGame.countDownSeconds = jsonParser.getValueAsInt();
                    return true;
                case "voteResult":
                    bLiveUndercoverGame.voteResult = BLiveUndercoverVoteResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUndercoverGame bLiveUndercoverGame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUndercoverGame.f44464id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUndercoverGame.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            if (bLiveUndercoverGame.currentPlayers != null) {
                jsonGenerator.writeFieldName("currentPlayers");
                JsonAdapter.serializeArray(bLiveUndercoverGame.currentPlayers, jsonGenerator, BLiveUndercoverCurrentPlayer.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("remainSeconds", bLiveUndercoverGame.remainSeconds);
            jsonGenerator.writeNumberField("countDownSeconds", bLiveUndercoverGame.countDownSeconds);
            if (bLiveUndercoverGame.votes != null) {
                jsonGenerator.writeFieldName("votes");
                JsonAdapter.serializeArray(bLiveUndercoverGame.votes, jsonGenerator, BLiveUndercoverVote.JSON_ADAPTER);
            }
            if (bLiveUndercoverGame.voteResult != null) {
                jsonGenerator.writeFieldName("voteResult");
                BLiveUndercoverVoteResult.JSON_ADAPTER.serialize(bLiveUndercoverGame.voteResult, jsonGenerator, true);
            }
            if (bLiveUndercoverGame.gameResult != null) {
                jsonGenerator.writeFieldName("gameResult");
                BLiveUndercoverGameResult.JSON_ADAPTER.serialize(bLiveUndercoverGame.gameResult, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUndercoverGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveundercovergame";

    @ProtobufIndex(index = 5)
    public int countDownSeconds;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveUndercoverCurrentPlayer> currentPlayers;

    @Nullable
    @ProtobufIndex(index = 8)
    public BLiveUndercoverGameResult gameResult;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44464id;
    public String liveId;

    @ProtobufIndex(index = 4)
    public int remainSeconds;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;
    public String toast;

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveUndercoverVoteResult voteResult;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveUndercoverVote> votes;

    public static BLiveUndercoverGame new_() {
        BLiveUndercoverGame bLiveUndercoverGame = new BLiveUndercoverGame();
        bLiveUndercoverGame.nullCheck();
        return bLiveUndercoverGame;
    }

    public List<BLiveUserMask> buildUserList() {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveUndercoverCurrentPlayer> it = this.currentPlayers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mask);
        }
        return arrayList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUndercoverGame mo223809clone() {
        BLiveUndercoverGame bLiveUndercoverGame = new BLiveUndercoverGame();
        bLiveUndercoverGame.f44464id = this.f44464id;
        bLiveUndercoverGame.status = this.status;
        List<BLiveUndercoverCurrentPlayer> list = this.currentPlayers;
        if (list != null) {
            bLiveUndercoverGame.currentPlayers = ValueObject.util_map(list, new w9j() { // from class: l.b72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUndercoverCurrentPlayer) obj).mo223809clone();
                }
            });
        }
        bLiveUndercoverGame.remainSeconds = this.remainSeconds;
        bLiveUndercoverGame.countDownSeconds = this.countDownSeconds;
        List<BLiveUndercoverVote> list2 = this.votes;
        if (list2 != null) {
            bLiveUndercoverGame.votes = ValueObject.util_map(list2, new w9j() { // from class: l.c72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUndercoverVote) obj).mo223809clone();
                }
            });
        }
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = this.voteResult;
        if (bLiveUndercoverVoteResult != null) {
            bLiveUndercoverGame.voteResult = bLiveUndercoverVoteResult.mo223809clone();
        }
        BLiveUndercoverGameResult bLiveUndercoverGameResult = this.gameResult;
        if (bLiveUndercoverGameResult != null) {
            bLiveUndercoverGame.gameResult = bLiveUndercoverGameResult.mo223809clone();
        }
        return bLiveUndercoverGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUndercoverGame)) {
            return false;
        }
        BLiveUndercoverGame bLiveUndercoverGame = (BLiveUndercoverGame) obj;
        return ValueObject.util_equals(this.f44464id, bLiveUndercoverGame.f44464id) && ValueObject.util_equals(this.status, bLiveUndercoverGame.status) && ValueObject.util_equals(this.currentPlayers, bLiveUndercoverGame.currentPlayers) && this.remainSeconds == bLiveUndercoverGame.remainSeconds && this.countDownSeconds == bLiveUndercoverGame.countDownSeconds && ValueObject.util_equals(this.votes, bLiveUndercoverGame.votes) && ValueObject.util_equals(this.voteResult, bLiveUndercoverGame.voteResult) && ValueObject.util_equals(this.gameResult, bLiveUndercoverGame.gameResult);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public BLiveUndercoverCurrentPlayer getCurrentPlayer(String str) {
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : this.currentPlayers) {
            if (TextUtils.equals(str, bLiveUndercoverCurrentPlayer.userId)) {
                return bLiveUndercoverCurrentPlayer;
            }
        }
        return null;
    }

    public BLiveUndercoverCurrentPlayer getCurrentSpeaker() {
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : this.currentPlayers) {
            if (TextUtils.equals(bLiveUndercoverCurrentPlayer.role, "speaker")) {
                return bLiveUndercoverCurrentPlayer;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f44464id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveUndercoverCurrentPlayer> list = this.currentPlayers;
        int iHashCode3 = (((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.remainSeconds) * 41) + this.countDownSeconds) * 41;
        List<BLiveUndercoverVote> list2 = this.votes;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = this.voteResult;
        int iHashCode5 = (iHashCode4 + (bLiveUndercoverVoteResult != null ? bLiveUndercoverVoteResult.hashCode() : 0)) * 41;
        BLiveUndercoverGameResult bLiveUndercoverGameResult = this.gameResult;
        int iHashCode6 = iHashCode5 + (bLiveUndercoverGameResult != null ? bLiveUndercoverGameResult.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44464id == null) {
            this.f44464id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.currentPlayers == null) {
            this.currentPlayers = new ArrayList();
        }
        if (this.votes == null) {
            this.votes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "BLiveUndercoverGame{liveId='" + this.liveId + "', toast='" + this.toast + "', id='" + this.f44464id + "', status='" + this.status + "', currentPlayers=" + this.currentPlayers + ", remainSeconds=" + this.remainSeconds + ", countDownSeconds=" + this.countDownSeconds + ", votes=" + this.votes + ", voteResult=" + this.voteResult + ", gameResult=" + this.gameResult + '}';
    }
}
