package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.BoostLimit;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import java.util.HashSet;
import java.util.List;
import l.nb5;
import l.w9j;
import l.xh5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Counter extends ValueObject<Counter> implements Cloneable, Serializable {
    public static final String TYPE = "counter";

    @NonNull
    @ProtobufIndex(index = 2)
    public CounterActivities activities;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BoostLimit> boostLimits;

    @NonNull
    @ProtobufIndex(index = 21)
    public FakeLikeLimits fakeLikeLimits;

    @NonNull
    @ProtobufIndex(index = 22)
    public FeedFlower flower;

    @NonNull
    @ProtobufIndex(index = 6)
    public CounterFollowShips followships;

    @NonNull
    @ProtobufIndex(index = 13)
    public CounterFriendReminder friendReminders;

    @NonNull
    @ProtobufIndex(index = 18)
    public CounterGrowth growth;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public CounterKankan kankan;

    @NonNull
    @ProtobufIndex(index = 1)
    public CounterLikeLimit likeLimit;

    @NonNull
    @ProtobufIndex(index = 9)
    public LikersLimit likersLimit;

    @NonNull
    @ProtobufIndex(index = 10)
    public LiveChatLimit liveChatLimit;

    @NonNull
    @ProtobufIndex(index = 12)
    public LivePushLimit livePushLimit;

    @NonNull
    @ProtobufIndex(index = 7)
    public CouterMoments moments;

    @NonNull
    @ProtobufIndex(index = 11)
    public Mytantan mytantan;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 20)
    public CounterPickUsers pickUsers;

    @NonNull
    @ProtobufIndex(index = 19)
    public ProfileLike profileLike;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public CounterSecretCrushLimit secretCrushLimit;

    @NonNull
    @ProtobufIndex(index = 15)
    public CounterShuoshuo shuoshuos;

    @NonNull
    @ProtobufIndex(index = 4)
    public CounterSuperlikeAndUndoLimit superLikeLimit;

    @NonNull
    @ProtobufIndex(index = 17)
    public Swipes swipes;

    @NonNull
    @ProtobufIndex(index = 5)
    public CounterSuperlikeAndUndoLimit undoLimit;

    @NonNull
    @ProtobufIndex(index = 23)
    public VerificationLimit verification;

    @NonNull
    @ProtobufIndex(index = 14)
    public CounterViewer viewers;
    public static ProtobufAdapter<Counter> PROTOBUF_ADAPTER = new MessageNanoAdapter<Counter>() { // from class: com.p1.mobile.putong.data.Counter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Counter counter) {
            CounterLikeLimit counterLikeLimit = counter.likeLimit;
            int iL = counterLikeLimit != null ? CodedOutputByteBufferNano.l(1, counterLikeLimit, CounterLikeLimit.PROTOBUF_ADAPTER) : 0;
            CounterActivities counterActivities = counter.activities;
            if (counterActivities != null) {
                iL += CodedOutputByteBufferNano.l(2, counterActivities, CounterActivities.PROTOBUF_ADAPTER);
            }
            CounterSecretCrushLimit counterSecretCrushLimit = counter.secretCrushLimit;
            if (counterSecretCrushLimit != null) {
                iL += CodedOutputByteBufferNano.l(3, counterSecretCrushLimit, CounterSecretCrushLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counter.superLikeLimit;
            if (counterSuperlikeAndUndoLimit != null) {
                iL += CodedOutputByteBufferNano.l(4, counterSuperlikeAndUndoLimit, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counter.undoLimit;
            if (counterSuperlikeAndUndoLimit2 != null) {
                iL += CodedOutputByteBufferNano.l(5, counterSuperlikeAndUndoLimit2, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterFollowShips counterFollowShips = counter.followships;
            if (counterFollowShips != null) {
                iL += CodedOutputByteBufferNano.l(6, counterFollowShips, CounterFollowShips.PROTOBUF_ADAPTER);
            }
            CouterMoments couterMoments = counter.moments;
            if (couterMoments != null) {
                iL += CodedOutputByteBufferNano.l(7, couterMoments, CouterMoments.PROTOBUF_ADAPTER);
            }
            List<BoostLimit> list = counter.boostLimits;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(8, list, BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LikersLimit likersLimit = counter.likersLimit;
            if (likersLimit != null) {
                iL += CodedOutputByteBufferNano.l(9, likersLimit, LikersLimit.PROTOBUF_ADAPTER);
            }
            LiveChatLimit liveChatLimit = counter.liveChatLimit;
            if (liveChatLimit != null) {
                iL += CodedOutputByteBufferNano.l(10, liveChatLimit, LiveChatLimit.PROTOBUF_ADAPTER);
            }
            Mytantan mytantan = counter.mytantan;
            if (mytantan != null) {
                iL += CodedOutputByteBufferNano.l(11, mytantan, Mytantan.PROTOBUF_ADAPTER);
            }
            LivePushLimit livePushLimit = counter.livePushLimit;
            if (livePushLimit != null) {
                iL += CodedOutputByteBufferNano.l(12, livePushLimit, LivePushLimit.PROTOBUF_ADAPTER);
            }
            CounterFriendReminder counterFriendReminder = counter.friendReminders;
            if (counterFriendReminder != null) {
                iL += CodedOutputByteBufferNano.l(13, counterFriendReminder, CounterFriendReminder.PROTOBUF_ADAPTER);
            }
            CounterViewer counterViewer = counter.viewers;
            if (counterViewer != null) {
                iL += CodedOutputByteBufferNano.l(14, counterViewer, CounterViewer.PROTOBUF_ADAPTER);
            }
            CounterShuoshuo counterShuoshuo = counter.shuoshuos;
            if (counterShuoshuo != null) {
                iL += CodedOutputByteBufferNano.l(15, counterShuoshuo, CounterShuoshuo.PROTOBUF_ADAPTER);
            }
            CounterKankan counterKankan = counter.kankan;
            if (counterKankan != null) {
                iL += CodedOutputByteBufferNano.l(16, counterKankan, CounterKankan.PROTOBUF_ADAPTER);
            }
            Swipes swipes = counter.swipes;
            if (swipes != null) {
                iL += CodedOutputByteBufferNano.l(17, swipes, Swipes.PROTOBUF_ADAPTER);
            }
            CounterGrowth counterGrowth = counter.growth;
            if (counterGrowth != null) {
                iL += CodedOutputByteBufferNano.l(18, counterGrowth, CounterGrowth.PROTOBUF_ADAPTER);
            }
            ProfileLike profileLike = counter.profileLike;
            if (profileLike != null) {
                iL += CodedOutputByteBufferNano.l(19, profileLike, ProfileLike.PROTOBUF_ADAPTER);
            }
            CounterPickUsers counterPickUsers = counter.pickUsers;
            if (counterPickUsers != null) {
                iL += CodedOutputByteBufferNano.l(20, counterPickUsers, CounterPickUsers.PROTOBUF_ADAPTER);
            }
            FakeLikeLimits fakeLikeLimits = counter.fakeLikeLimits;
            if (fakeLikeLimits != null) {
                iL += CodedOutputByteBufferNano.l(21, fakeLikeLimits, FakeLikeLimits.PROTOBUF_ADAPTER);
            }
            FeedFlower feedFlower = counter.flower;
            if (feedFlower != null) {
                iL += CodedOutputByteBufferNano.l(22, feedFlower, FeedFlower.PROTOBUF_ADAPTER);
            }
            VerificationLimit verificationLimit = counter.verification;
            if (verificationLimit != null) {
                iL += CodedOutputByteBufferNano.l(23, verificationLimit, VerificationLimit.PROTOBUF_ADAPTER);
            }
            ((MessageNano) counter).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Counter m17872parse(nb5 nb5Var) throws IOException {
            Counter counter = new Counter();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (counter.likeLimit == null) {
                            counter.likeLimit = CounterLikeLimit.new_();
                        }
                        if (counter.activities == null) {
                            counter.activities = CounterActivities.new_();
                        }
                        if (counter.secretCrushLimit == null) {
                            counter.secretCrushLimit = CounterSecretCrushLimit.new_();
                        }
                        if (counter.superLikeLimit == null) {
                            counter.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.undoLimit == null) {
                            counter.undoLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.followships == null) {
                            counter.followships = CounterFollowShips.new_();
                        }
                        if (counter.moments == null) {
                            counter.moments = CouterMoments.new_();
                        }
                        if (counter.boostLimits == null) {
                            counter.boostLimits = new ArrayList();
                        }
                        if (counter.likersLimit == null) {
                            counter.likersLimit = LikersLimit.new_();
                        }
                        if (counter.liveChatLimit == null) {
                            counter.liveChatLimit = LiveChatLimit.new_();
                        }
                        if (counter.mytantan == null) {
                            counter.mytantan = Mytantan.new_();
                        }
                        if (counter.livePushLimit == null) {
                            counter.livePushLimit = LivePushLimit.new_();
                        }
                        if (counter.friendReminders == null) {
                            counter.friendReminders = CounterFriendReminder.new_();
                        }
                        if (counter.viewers == null) {
                            counter.viewers = CounterViewer.new_();
                        }
                        if (counter.shuoshuos == null) {
                            counter.shuoshuos = CounterShuoshuo.new_();
                        }
                        if (counter.kankan == null) {
                            counter.kankan = CounterKankan.new_();
                        }
                        if (counter.swipes == null) {
                            counter.swipes = Swipes.new_();
                        }
                        if (counter.growth == null) {
                            counter.growth = CounterGrowth.new_();
                        }
                        if (counter.profileLike == null) {
                            counter.profileLike = ProfileLike.new_();
                        }
                        if (counter.pickUsers == null) {
                            counter.pickUsers = CounterPickUsers.new_();
                        }
                        if (counter.fakeLikeLimits == null) {
                            counter.fakeLikeLimits = FakeLikeLimits.new_();
                        }
                        if (counter.flower == null) {
                            counter.flower = FeedFlower.new_();
                        }
                        if (counter.verification == null) {
                            counter.verification = VerificationLimit.new_();
                        }
                        break;
                    case 10:
                        counter.likeLimit = (CounterLikeLimit) nb5Var.l(CounterLikeLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        counter.activities = (CounterActivities) nb5Var.l(CounterActivities.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        counter.secretCrushLimit = (CounterSecretCrushLimit) nb5Var.l(CounterSecretCrushLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        counter.superLikeLimit = (CounterSuperlikeAndUndoLimit) nb5Var.l(CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        counter.undoLimit = (CounterSuperlikeAndUndoLimit) nb5Var.l(CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        counter.followships = (CounterFollowShips) nb5Var.l(CounterFollowShips.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        counter.moments = (CouterMoments) nb5Var.l(CouterMoments.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        counter.boostLimits = (List) nb5Var.l(BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        counter.likersLimit = (LikersLimit) nb5Var.l(LikersLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        counter.liveChatLimit = (LiveChatLimit) nb5Var.l(LiveChatLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        counter.mytantan = (Mytantan) nb5Var.l(Mytantan.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        counter.livePushLimit = (LivePushLimit) nb5Var.l(LivePushLimit.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        counter.friendReminders = (CounterFriendReminder) nb5Var.l(CounterFriendReminder.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        counter.viewers = (CounterViewer) nb5Var.l(CounterViewer.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        counter.shuoshuos = (CounterShuoshuo) nb5Var.l(CounterShuoshuo.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        counter.kankan = (CounterKankan) nb5Var.l(CounterKankan.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        counter.swipes = (Swipes) nb5Var.l(Swipes.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        counter.growth = (CounterGrowth) nb5Var.l(CounterGrowth.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        counter.profileLike = (ProfileLike) nb5Var.l(ProfileLike.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        counter.pickUsers = (CounterPickUsers) nb5Var.l(CounterPickUsers.PROTOBUF_ADAPTER);
                        continue;
                    case 170:
                        counter.fakeLikeLimits = (FakeLikeLimits) nb5Var.l(FakeLikeLimits.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        counter.flower = (FeedFlower) nb5Var.l(FeedFlower.PROTOBUF_ADAPTER);
                        continue;
                    case 186:
                        counter.verification = (VerificationLimit) nb5Var.l(VerificationLimit.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (counter.likeLimit == null) {
                            counter.likeLimit = CounterLikeLimit.new_();
                        }
                        if (counter.activities == null) {
                            counter.activities = CounterActivities.new_();
                        }
                        if (counter.secretCrushLimit == null) {
                            counter.secretCrushLimit = CounterSecretCrushLimit.new_();
                        }
                        if (counter.superLikeLimit == null) {
                            counter.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.undoLimit == null) {
                            counter.undoLimit = CounterSuperlikeAndUndoLimit.new_();
                        }
                        if (counter.followships == null) {
                            counter.followships = CounterFollowShips.new_();
                        }
                        if (counter.moments == null) {
                            counter.moments = CouterMoments.new_();
                        }
                        if (counter.boostLimits == null) {
                            counter.boostLimits = new ArrayList();
                        }
                        if (counter.likersLimit == null) {
                            counter.likersLimit = LikersLimit.new_();
                        }
                        if (counter.liveChatLimit == null) {
                            counter.liveChatLimit = LiveChatLimit.new_();
                        }
                        if (counter.mytantan == null) {
                            counter.mytantan = Mytantan.new_();
                        }
                        if (counter.livePushLimit == null) {
                            counter.livePushLimit = LivePushLimit.new_();
                        }
                        if (counter.friendReminders == null) {
                            counter.friendReminders = CounterFriendReminder.new_();
                        }
                        if (counter.viewers == null) {
                            counter.viewers = CounterViewer.new_();
                        }
                        if (counter.shuoshuos == null) {
                            counter.shuoshuos = CounterShuoshuo.new_();
                        }
                        if (counter.kankan == null) {
                            counter.kankan = CounterKankan.new_();
                        }
                        if (counter.swipes == null) {
                            counter.swipes = Swipes.new_();
                        }
                        if (counter.growth == null) {
                            counter.growth = CounterGrowth.new_();
                        }
                        if (counter.profileLike == null) {
                            counter.profileLike = ProfileLike.new_();
                        }
                        if (counter.pickUsers == null) {
                            counter.pickUsers = CounterPickUsers.new_();
                        }
                        if (counter.fakeLikeLimits == null) {
                            counter.fakeLikeLimits = FakeLikeLimits.new_();
                        }
                        if (counter.flower == null) {
                            counter.flower = FeedFlower.new_();
                        }
                        if (counter.verification == null) {
                            counter.verification = VerificationLimit.new_();
                            return counter;
                        }
                        break;
                }
            }
            return counter;
        }

        public void serialize(Counter counter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CounterLikeLimit counterLikeLimit = counter.likeLimit;
            if (counterLikeLimit != null) {
                codedOutputByteBufferNano.K(1, counterLikeLimit, CounterLikeLimit.PROTOBUF_ADAPTER);
            }
            CounterActivities counterActivities = counter.activities;
            if (counterActivities != null) {
                codedOutputByteBufferNano.K(2, counterActivities, CounterActivities.PROTOBUF_ADAPTER);
            }
            CounterSecretCrushLimit counterSecretCrushLimit = counter.secretCrushLimit;
            if (counterSecretCrushLimit != null) {
                codedOutputByteBufferNano.K(3, counterSecretCrushLimit, CounterSecretCrushLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counter.superLikeLimit;
            if (counterSuperlikeAndUndoLimit != null) {
                codedOutputByteBufferNano.K(4, counterSuperlikeAndUndoLimit, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = counter.undoLimit;
            if (counterSuperlikeAndUndoLimit2 != null) {
                codedOutputByteBufferNano.K(5, counterSuperlikeAndUndoLimit2, CounterSuperlikeAndUndoLimit.PROTOBUF_ADAPTER);
            }
            CounterFollowShips counterFollowShips = counter.followships;
            if (counterFollowShips != null) {
                codedOutputByteBufferNano.K(6, counterFollowShips, CounterFollowShips.PROTOBUF_ADAPTER);
            }
            CouterMoments couterMoments = counter.moments;
            if (couterMoments != null) {
                codedOutputByteBufferNano.K(7, couterMoments, CouterMoments.PROTOBUF_ADAPTER);
            }
            List<BoostLimit> list = counter.boostLimits;
            if (list != null) {
                codedOutputByteBufferNano.K(8, list, BoostLimit.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LikersLimit likersLimit = counter.likersLimit;
            if (likersLimit != null) {
                codedOutputByteBufferNano.K(9, likersLimit, LikersLimit.PROTOBUF_ADAPTER);
            }
            LiveChatLimit liveChatLimit = counter.liveChatLimit;
            if (liveChatLimit != null) {
                codedOutputByteBufferNano.K(10, liveChatLimit, LiveChatLimit.PROTOBUF_ADAPTER);
            }
            Mytantan mytantan = counter.mytantan;
            if (mytantan != null) {
                codedOutputByteBufferNano.K(11, mytantan, Mytantan.PROTOBUF_ADAPTER);
            }
            LivePushLimit livePushLimit = counter.livePushLimit;
            if (livePushLimit != null) {
                codedOutputByteBufferNano.K(12, livePushLimit, LivePushLimit.PROTOBUF_ADAPTER);
            }
            CounterFriendReminder counterFriendReminder = counter.friendReminders;
            if (counterFriendReminder != null) {
                codedOutputByteBufferNano.K(13, counterFriendReminder, CounterFriendReminder.PROTOBUF_ADAPTER);
            }
            CounterViewer counterViewer = counter.viewers;
            if (counterViewer != null) {
                codedOutputByteBufferNano.K(14, counterViewer, CounterViewer.PROTOBUF_ADAPTER);
            }
            CounterShuoshuo counterShuoshuo = counter.shuoshuos;
            if (counterShuoshuo != null) {
                codedOutputByteBufferNano.K(15, counterShuoshuo, CounterShuoshuo.PROTOBUF_ADAPTER);
            }
            CounterKankan counterKankan = counter.kankan;
            if (counterKankan != null) {
                codedOutputByteBufferNano.K(16, counterKankan, CounterKankan.PROTOBUF_ADAPTER);
            }
            Swipes swipes = counter.swipes;
            if (swipes != null) {
                codedOutputByteBufferNano.K(17, swipes, Swipes.PROTOBUF_ADAPTER);
            }
            CounterGrowth counterGrowth = counter.growth;
            if (counterGrowth != null) {
                codedOutputByteBufferNano.K(18, counterGrowth, CounterGrowth.PROTOBUF_ADAPTER);
            }
            ProfileLike profileLike = counter.profileLike;
            if (profileLike != null) {
                codedOutputByteBufferNano.K(19, profileLike, ProfileLike.PROTOBUF_ADAPTER);
            }
            CounterPickUsers counterPickUsers = counter.pickUsers;
            if (counterPickUsers != null) {
                codedOutputByteBufferNano.K(20, counterPickUsers, CounterPickUsers.PROTOBUF_ADAPTER);
            }
            FakeLikeLimits fakeLikeLimits = counter.fakeLikeLimits;
            if (fakeLikeLimits != null) {
                codedOutputByteBufferNano.K(21, fakeLikeLimits, FakeLikeLimits.PROTOBUF_ADAPTER);
            }
            FeedFlower feedFlower = counter.flower;
            if (feedFlower != null) {
                codedOutputByteBufferNano.K(22, feedFlower, FeedFlower.PROTOBUF_ADAPTER);
            }
            VerificationLimit verificationLimit = counter.verification;
            if (verificationLimit != null) {
                codedOutputByteBufferNano.K(23, verificationLimit, VerificationLimit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Counter> JSON_ADAPTER = new ObjectJsonAdapter<Counter>() { // from class: com.p1.mobile.putong.data.Counter.2
        public Class getDataClass() {
            return Counter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Counter mo17830newInstance() {
            return new Counter();
        }

        public boolean parseField(Counter counter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveChatLimit":
                    counter.liveChatLimit = (LiveChatLimit) LiveChatLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "verification":
                    counter.verification = (VerificationLimit) VerificationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pickUsers":
                    counter.pickUsers = (CounterPickUsers) CounterPickUsers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "flower":
                    counter.flower = (FeedFlower) FeedFlower.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "growth":
                    counter.growth = (CounterGrowth) CounterGrowth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "kankan":
                    counter.kankan = (CounterKankan) CounterKankan.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "shuoshuos":
                    counter.shuoshuos = (CounterShuoshuo) CounterShuoshuo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "secretCrushLimit":
                    counter.secretCrushLimit = (CounterSecretCrushLimit) CounterSecretCrushLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "superLikeLimit":
                    counter.superLikeLimit = (CounterSuperlikeAndUndoLimit) CounterSuperlikeAndUndoLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipes":
                    counter.swipes = (Swipes) Swipes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "undoLimit":
                    counter.undoLimit = (CounterSuperlikeAndUndoLimit) CounterSuperlikeAndUndoLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "likeLimit":
                    counter.likeLimit = (CounterLikeLimit) CounterLikeLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mytantan":
                    counter.mytantan = (Mytantan) Mytantan.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileLike":
                    counter.profileLike = (ProfileLike) ProfileLike.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "livePushLimit":
                    counter.livePushLimit = (LivePushLimit) LivePushLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "viewers":
                    counter.viewers = (CounterViewer) CounterViewer.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "seeLimit":
                    counter.likersLimit = (LikersLimit) LikersLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "moments":
                    counter.moments = (CouterMoments) CouterMoments.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "friend-reminders":
                    counter.friendReminders = (CounterFriendReminder) CounterFriendReminder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "boostLimits":
                    counter.boostLimits = JsonAdapter.parseArray(jsonParser, BoostLimit.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "followships":
                    counter.followships = (CounterFollowShips) CounterFollowShips.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "activities":
                    counter.activities = (CounterActivities) CounterActivities.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "fakeLikeLimits":
                    counter.fakeLikeLimits = (FakeLikeLimits) FakeLikeLimits.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Counter counter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveChatLimit":
                case "verification":
                case "pickUsers":
                case "flower":
                case "growth":
                case "kankan":
                case "shuoshuos":
                case "secretCrushLimit":
                case "superLikeLimit":
                case "swipes":
                case "undoLimit":
                case "likeLimit":
                case "mytantan":
                case "profileLike":
                case "livePushLimit":
                case "viewers":
                case "seeLimit":
                case "moments":
                case "friend-reminders":
                case "boostLimits":
                case "followships":
                case "activities":
                case "fakeLikeLimits":
                    return true;
                default:
                    return super.parseFieldCheck(counter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Counter counter, JsonGenerator jsonGenerator) throws IOException {
            if (counter.likeLimit != null) {
                jsonGenerator.writeFieldName("likeLimit");
                CounterLikeLimit.JSON_ADAPTER.serialize(counter.likeLimit, jsonGenerator, true);
            }
            if (counter.activities != null) {
                jsonGenerator.writeFieldName("activities");
                CounterActivities.JSON_ADAPTER.serialize(counter.activities, jsonGenerator, true);
            }
            if (counter.secretCrushLimit != null) {
                jsonGenerator.writeFieldName("secretCrushLimit");
                CounterSecretCrushLimit.JSON_ADAPTER.serialize(counter.secretCrushLimit, jsonGenerator, true);
            }
            if (counter.superLikeLimit != null) {
                jsonGenerator.writeFieldName("superLikeLimit");
                CounterSuperlikeAndUndoLimit.JSON_ADAPTER.serialize(counter.superLikeLimit, jsonGenerator, true);
            }
            if (counter.undoLimit != null) {
                jsonGenerator.writeFieldName("undoLimit");
                CounterSuperlikeAndUndoLimit.JSON_ADAPTER.serialize(counter.undoLimit, jsonGenerator, true);
            }
            if (counter.followships != null) {
                jsonGenerator.writeFieldName("followships");
                CounterFollowShips.JSON_ADAPTER.serialize(counter.followships, jsonGenerator, true);
            }
            if (counter.moments != null) {
                jsonGenerator.writeFieldName(Moments.TYPE);
                CouterMoments.JSON_ADAPTER.serialize(counter.moments, jsonGenerator, true);
            }
            if (counter.boostLimits != null) {
                jsonGenerator.writeFieldName("boostLimits");
                JsonAdapter.serializeArray(counter.boostLimits, jsonGenerator, BoostLimit.JSON_ADAPTER);
            }
            if (counter.likersLimit != null) {
                jsonGenerator.writeFieldName("seeLimit");
                LikersLimit.JSON_ADAPTER.serialize(counter.likersLimit, jsonGenerator, true);
            }
            if (counter.liveChatLimit != null) {
                jsonGenerator.writeFieldName("liveChatLimit");
                LiveChatLimit.JSON_ADAPTER.serialize(counter.liveChatLimit, jsonGenerator, true);
            }
            if (counter.mytantan != null) {
                jsonGenerator.writeFieldName("mytantan");
                Mytantan.JSON_ADAPTER.serialize(counter.mytantan, jsonGenerator, true);
            }
            if (counter.livePushLimit != null) {
                jsonGenerator.writeFieldName("livePushLimit");
                LivePushLimit.JSON_ADAPTER.serialize(counter.livePushLimit, jsonGenerator, true);
            }
            if (counter.friendReminders != null) {
                jsonGenerator.writeFieldName("friend-reminders");
                CounterFriendReminder.JSON_ADAPTER.serialize(counter.friendReminders, jsonGenerator, true);
            }
            if (counter.viewers != null) {
                jsonGenerator.writeFieldName("viewers");
                CounterViewer.JSON_ADAPTER.serialize(counter.viewers, jsonGenerator, true);
            }
            if (counter.shuoshuos != null) {
                jsonGenerator.writeFieldName("shuoshuos");
                CounterShuoshuo.JSON_ADAPTER.serialize(counter.shuoshuos, jsonGenerator, true);
            }
            if (counter.kankan != null) {
                jsonGenerator.writeFieldName("kankan");
                CounterKankan.JSON_ADAPTER.serialize(counter.kankan, jsonGenerator, true);
            }
            if (counter.swipes != null) {
                jsonGenerator.writeFieldName(Swipes.TYPE);
                Swipes.JSON_ADAPTER.serialize(counter.swipes, jsonGenerator, true);
            }
            if (counter.growth != null) {
                jsonGenerator.writeFieldName("growth");
                CounterGrowth.JSON_ADAPTER.serialize(counter.growth, jsonGenerator, true);
            }
            if (counter.profileLike != null) {
                jsonGenerator.writeFieldName("profileLike");
                ProfileLike.JSON_ADAPTER.serialize(counter.profileLike, jsonGenerator, true);
            }
            if (counter.pickUsers != null) {
                jsonGenerator.writeFieldName("pickUsers");
                CounterPickUsers.JSON_ADAPTER.serialize(counter.pickUsers, jsonGenerator, true);
            }
            if (counter.fakeLikeLimits != null) {
                jsonGenerator.writeFieldName("fakeLikeLimits");
                FakeLikeLimits.JSON_ADAPTER.serialize(counter.fakeLikeLimits, jsonGenerator, true);
            }
            if (counter.flower != null) {
                jsonGenerator.writeFieldName("flower");
                FeedFlower.JSON_ADAPTER.serialize(counter.flower, jsonGenerator, true);
            }
            if (counter.verification != null) {
                jsonGenerator.writeFieldName("verification");
                VerificationLimit.JSON_ADAPTER.serialize(counter.verification, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Counter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Counter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Counter new_() {
        Counter counter = new Counter();
        counter.nullCheck();
        return counter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Counter m17871clone() {
        Counter counter = new Counter();
        CounterLikeLimit counterLikeLimit = this.likeLimit;
        if (counterLikeLimit != null) {
            counter.likeLimit = counterLikeLimit.m17892clone();
        }
        CounterActivities counterActivities = this.activities;
        if (counterActivities != null) {
            counter.activities = counterActivities.m17874clone();
        }
        CounterSecretCrushLimit counterSecretCrushLimit = this.secretCrushLimit;
        if (counterSecretCrushLimit != null) {
            counter.secretCrushLimit = counterSecretCrushLimit.m17901clone();
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = this.superLikeLimit;
        if (counterSuperlikeAndUndoLimit != null) {
            counter.superLikeLimit = counterSuperlikeAndUndoLimit.m17907clone();
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = this.undoLimit;
        if (counterSuperlikeAndUndoLimit2 != null) {
            counter.undoLimit = counterSuperlikeAndUndoLimit2.m17907clone();
        }
        CounterFollowShips counterFollowShips = this.followships;
        if (counterFollowShips != null) {
            counter.followships = counterFollowShips.m17880clone();
        }
        CouterMoments couterMoments = this.moments;
        if (couterMoments != null) {
            counter.moments = couterMoments.m17913clone();
        }
        List<BoostLimit> list = this.boostLimits;
        if (list != null) {
            counter.boostLimits = ValueObject.util_map(list, new w9j() { // from class: l.jqb
                public final Object call(Object obj) {
                    return ((BoostLimit) obj).m17777clone();
                }
            });
        }
        LikersLimit likersLimit = this.likersLimit;
        if (likersLimit != null) {
            counter.likersLimit = likersLimit.m18291clone();
        }
        LiveChatLimit liveChatLimit = this.liveChatLimit;
        if (liveChatLimit != null) {
            counter.liveChatLimit = liveChatLimit.m18339clone();
        }
        Mytantan mytantan = this.mytantan;
        if (mytantan != null) {
            counter.mytantan = mytantan.m18506clone();
        }
        LivePushLimit livePushLimit = this.livePushLimit;
        if (livePushLimit != null) {
            counter.livePushLimit = livePushLimit.m18363clone();
        }
        CounterFriendReminder counterFriendReminder = this.friendReminders;
        if (counterFriendReminder != null) {
            counter.friendReminders = counterFriendReminder.m17883clone();
        }
        CounterViewer counterViewer = this.viewers;
        if (counterViewer != null) {
            counter.viewers = counterViewer.m17910clone();
        }
        CounterShuoshuo counterShuoshuo = this.shuoshuos;
        if (counterShuoshuo != null) {
            counter.shuoshuos = counterShuoshuo.m17904clone();
        }
        CounterKankan counterKankan = this.kankan;
        if (counterKankan != null) {
            counter.kankan = counterKankan.m17889clone();
        }
        Swipes swipes = this.swipes;
        if (swipes != null) {
            counter.swipes = swipes.m19072clone();
        }
        CounterGrowth counterGrowth = this.growth;
        if (counterGrowth != null) {
            counter.growth = counterGrowth.m17886clone();
        }
        ProfileLike profileLike = this.profileLike;
        if (profileLike != null) {
            counter.profileLike = profileLike.m18846clone();
        }
        CounterPickUsers counterPickUsers = this.pickUsers;
        if (counterPickUsers != null) {
            counter.pickUsers = counterPickUsers.m17898clone();
        }
        FakeLikeLimits fakeLikeLimits = this.fakeLikeLimits;
        if (fakeLikeLimits != null) {
            counter.fakeLikeLimits = fakeLikeLimits.m18090clone();
        }
        FeedFlower feedFlower = this.flower;
        if (feedFlower != null) {
            counter.flower = feedFlower.m18093clone();
        }
        VerificationLimit verificationLimit = this.verification;
        if (verificationLimit != null) {
            counter.verification = verificationLimit.m19261clone();
        }
        return counter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Counter)) {
            return false;
        }
        Counter counter = (Counter) obj;
        return ValueObject.util_equals(this.likeLimit, counter.likeLimit) && ValueObject.util_equals(this.activities, counter.activities) && ValueObject.util_equals(this.secretCrushLimit, counter.secretCrushLimit) && ValueObject.util_equals(this.superLikeLimit, counter.superLikeLimit) && ValueObject.util_equals(this.undoLimit, counter.undoLimit) && ValueObject.util_equals(this.followships, counter.followships) && ValueObject.util_equals(this.moments, counter.moments) && ValueObject.util_equals(this.boostLimits, counter.boostLimits) && ValueObject.util_equals(this.likersLimit, counter.likersLimit) && ValueObject.util_equals(this.liveChatLimit, counter.liveChatLimit) && ValueObject.util_equals(this.mytantan, counter.mytantan) && ValueObject.util_equals(this.livePushLimit, counter.livePushLimit) && ValueObject.util_equals(this.friendReminders, counter.friendReminders) && ValueObject.util_equals(this.viewers, counter.viewers) && ValueObject.util_equals(this.shuoshuos, counter.shuoshuos) && ValueObject.util_equals(this.kankan, counter.kankan) && ValueObject.util_equals(this.swipes, counter.swipes) && ValueObject.util_equals(this.growth, counter.growth) && ValueObject.util_equals(this.profileLike, counter.profileLike) && ValueObject.util_equals(this.pickUsers, counter.pickUsers) && ValueObject.util_equals(this.fakeLikeLimits, counter.fakeLikeLimits) && ValueObject.util_equals(this.flower, counter.flower) && ValueObject.util_equals(this.verification, counter.verification);
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
        CounterLikeLimit counterLikeLimit = this.likeLimit;
        int iHashCode = (i2 + (counterLikeLimit != null ? counterLikeLimit.hashCode() : 0)) * 41;
        CounterActivities counterActivities = this.activities;
        int iHashCode2 = (iHashCode + (counterActivities != null ? counterActivities.hashCode() : 0)) * 41;
        CounterSecretCrushLimit counterSecretCrushLimit = this.secretCrushLimit;
        int iHashCode3 = (iHashCode2 + (counterSecretCrushLimit != null ? counterSecretCrushLimit.hashCode() : 0)) * 41;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = this.superLikeLimit;
        int iHashCode4 = (iHashCode3 + (counterSuperlikeAndUndoLimit != null ? counterSuperlikeAndUndoLimit.hashCode() : 0)) * 41;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit2 = this.undoLimit;
        int iHashCode5 = (iHashCode4 + (counterSuperlikeAndUndoLimit2 != null ? counterSuperlikeAndUndoLimit2.hashCode() : 0)) * 41;
        CounterFollowShips counterFollowShips = this.followships;
        int iHashCode6 = (iHashCode5 + (counterFollowShips != null ? counterFollowShips.hashCode() : 0)) * 41;
        CouterMoments couterMoments = this.moments;
        int iHashCode7 = (iHashCode6 + (couterMoments != null ? couterMoments.hashCode() : 0)) * 41;
        List<BoostLimit> list = this.boostLimits;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        LikersLimit likersLimit = this.likersLimit;
        int iHashCode9 = (iHashCode8 + (likersLimit != null ? likersLimit.hashCode() : 0)) * 41;
        LiveChatLimit liveChatLimit = this.liveChatLimit;
        int iHashCode10 = (iHashCode9 + (liveChatLimit != null ? liveChatLimit.hashCode() : 0)) * 41;
        Mytantan mytantan = this.mytantan;
        int iHashCode11 = (iHashCode10 + (mytantan != null ? mytantan.hashCode() : 0)) * 41;
        LivePushLimit livePushLimit = this.livePushLimit;
        int iHashCode12 = (iHashCode11 + (livePushLimit != null ? livePushLimit.hashCode() : 0)) * 41;
        CounterFriendReminder counterFriendReminder = this.friendReminders;
        int iHashCode13 = (iHashCode12 + (counterFriendReminder != null ? counterFriendReminder.hashCode() : 0)) * 41;
        CounterViewer counterViewer = this.viewers;
        int iHashCode14 = (iHashCode13 + (counterViewer != null ? counterViewer.hashCode() : 0)) * 41;
        CounterShuoshuo counterShuoshuo = this.shuoshuos;
        int iHashCode15 = (iHashCode14 + (counterShuoshuo != null ? counterShuoshuo.hashCode() : 0)) * 41;
        CounterKankan counterKankan = this.kankan;
        int iHashCode16 = (iHashCode15 + (counterKankan != null ? counterKankan.hashCode() : 0)) * 41;
        Swipes swipes = this.swipes;
        int iHashCode17 = (iHashCode16 + (swipes != null ? swipes.hashCode() : 0)) * 41;
        CounterGrowth counterGrowth = this.growth;
        int iHashCode18 = (iHashCode17 + (counterGrowth != null ? counterGrowth.hashCode() : 0)) * 41;
        ProfileLike profileLike = this.profileLike;
        int iHashCode19 = (iHashCode18 + (profileLike != null ? profileLike.hashCode() : 0)) * 41;
        CounterPickUsers counterPickUsers = this.pickUsers;
        int iHashCode20 = (iHashCode19 + (counterPickUsers != null ? counterPickUsers.hashCode() : 0)) * 41;
        FakeLikeLimits fakeLikeLimits = this.fakeLikeLimits;
        int iHashCode21 = (iHashCode20 + (fakeLikeLimits != null ? fakeLikeLimits.hashCode() : 0)) * 41;
        FeedFlower feedFlower = this.flower;
        int iHashCode22 = (iHashCode21 + (feedFlower != null ? feedFlower.hashCode() : 0)) * 41;
        VerificationLimit verificationLimit = this.verification;
        int iHashCode23 = iHashCode22 + (verificationLimit != null ? verificationLimit.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode23;
        return iHashCode23;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(Counter counter) {
        if (!shouldMergeData() || equals(counter)) {
            return;
        }
        if (!isFieldParsed("likeLimit")) {
            this.likeLimit = counter.likeLimit;
        }
        if (!isFieldParsed("activities")) {
            this.activities = counter.activities;
        }
        if (!isFieldParsed("secretCrushLimit")) {
            this.secretCrushLimit = counter.secretCrushLimit;
        }
        if (!isFieldParsed("superLikeLimit")) {
            this.superLikeLimit = counter.superLikeLimit;
        }
        if (!isFieldParsed("undoLimit")) {
            this.undoLimit = counter.undoLimit;
        }
        if (!isFieldParsed("followships")) {
            this.followships = counter.followships;
        }
        if (!isFieldParsed(Moments.TYPE)) {
            this.moments = counter.moments;
        }
        if (!isFieldParsed("boostLimits")) {
            this.boostLimits = counter.boostLimits;
        }
        if (!isFieldParsed("seeLimit")) {
            this.likersLimit = counter.likersLimit;
        }
        if (!isFieldParsed("liveChatLimit")) {
            this.liveChatLimit = counter.liveChatLimit;
        }
        if (!isFieldParsed("mytantan")) {
            this.mytantan = counter.mytantan;
        }
        if (!isFieldParsed("livePushLimit")) {
            this.livePushLimit = counter.livePushLimit;
        }
        if (!isFieldParsed("friend-reminders")) {
            this.friendReminders = counter.friendReminders;
        }
        if (!isFieldParsed("viewers")) {
            this.viewers = counter.viewers;
        }
        if (!isFieldParsed("shuoshuos")) {
            this.shuoshuos = counter.shuoshuos;
        }
        if (!isFieldParsed("kankan")) {
            this.kankan = counter.kankan;
        }
        if (!isFieldParsed(Swipes.TYPE)) {
            this.swipes = counter.swipes;
        }
        if (!isFieldParsed("growth")) {
            this.growth = counter.growth;
        }
        if (!isFieldParsed("profileLike")) {
            this.profileLike = counter.profileLike;
        }
        if (!isFieldParsed("pickUsers")) {
            this.pickUsers = counter.pickUsers;
        }
        if (!isFieldParsed("fakeLikeLimits")) {
            this.fakeLikeLimits = counter.fakeLikeLimits;
        }
        if (!isFieldParsed("flower")) {
            this.flower = counter.flower;
        }
        if (!isFieldParsed("verification")) {
            this.verification = counter.verification;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.likeLimit == null) {
            this.likeLimit = CounterLikeLimit.new_();
        }
        if (this.activities == null) {
            this.activities = CounterActivities.new_();
        }
        if (this.secretCrushLimit == null) {
            this.secretCrushLimit = CounterSecretCrushLimit.new_();
        }
        if (this.superLikeLimit == null) {
            this.superLikeLimit = CounterSuperlikeAndUndoLimit.new_();
        }
        if (this.undoLimit == null) {
            this.undoLimit = CounterSuperlikeAndUndoLimit.new_();
        }
        if (this.followships == null) {
            this.followships = CounterFollowShips.new_();
        }
        if (this.moments == null) {
            this.moments = CouterMoments.new_();
        }
        if (this.boostLimits == null) {
            this.boostLimits = new ArrayList();
        }
        if (this.likersLimit == null) {
            this.likersLimit = LikersLimit.new_();
        }
        if (this.liveChatLimit == null) {
            this.liveChatLimit = LiveChatLimit.new_();
        }
        if (this.mytantan == null) {
            this.mytantan = Mytantan.new_();
        }
        if (this.livePushLimit == null) {
            this.livePushLimit = LivePushLimit.new_();
        }
        if (this.friendReminders == null) {
            this.friendReminders = CounterFriendReminder.new_();
        }
        if (this.viewers == null) {
            this.viewers = CounterViewer.new_();
        }
        if (this.shuoshuos == null) {
            this.shuoshuos = CounterShuoshuo.new_();
        }
        if (this.kankan == null) {
            this.kankan = CounterKankan.new_();
        }
        if (this.swipes == null) {
            this.swipes = Swipes.new_();
        }
        if (this.growth == null) {
            this.growth = CounterGrowth.new_();
        }
        if (this.profileLike == null) {
            this.profileLike = ProfileLike.new_();
        }
        if (this.pickUsers == null) {
            this.pickUsers = CounterPickUsers.new_();
        }
        if (this.fakeLikeLimits == null) {
            this.fakeLikeLimits = FakeLikeLimits.new_();
        }
        if (this.flower == null) {
            this.flower = FeedFlower.new_();
        }
        if (this.verification == null) {
            this.verification = VerificationLimit.new_();
        }
    }

    public void putParsedField(String str) {
        if ("v2".equals(xh5.v(this.requestUrl)) || "v3".equals(xh5.v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public boolean shouldMergeData() {
        String strV = xh5.v(this.requestUrl);
        return TextUtils.isEmpty(strV) || "v2".equals(strV) || "v3".equals(xh5.v(this.requestUrl));
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
