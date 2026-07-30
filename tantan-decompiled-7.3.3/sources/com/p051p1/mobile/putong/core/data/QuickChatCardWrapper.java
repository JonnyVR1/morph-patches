package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p153l.l51;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class QuickChatCardWrapper {
    private OnlineMatchPushUser broadcastCard;
    private QuickChatCardInfo insertCard;
    private boolean isOneside;
    private boolean mConsumed;
    private Runnable mRunnable;
    public RelationshipStatus rsStateReceiverToSender;
    public String userId;
    public long insertTime = 0;
    public int cardType = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface QuickChatCardType {
        public static final int INITIATE = 1;
        public static final int PASSIVE = 2;
        public static final int PEI_LIAO = 3;
    }

    public QuickChatCardWrapper(QuickChatCardInfo quickChatCardInfo) {
        this.insertCard = quickChatCardInfo;
        this.userId = quickChatCardInfo.userID;
        this.rsStateReceiverToSender = quickChatCardInfo.rsState;
        this.isOneside = TEnum.equals(quickChatCardInfo.biz, QuickChatType.card_dau);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$consume$0(CoreSuggested.UserInfo userInfo) {
        return Boolean.valueOf(this.cardType == 1 ? userInfo.isInitiateQuickChat() : userInfo.isPassiveQuickChat());
    }

    public void consume() {
        markAsConsumed();
        CoreModule.f18264c.f20405m0.m32001F8(new qcj() { // from class: l.j1c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f117951a.lambda$consume$0((CoreSuggested.UserInfo) obj);
            }
        });
    }

    public Runnable consumeRunnable() {
        if (this.mRunnable == null) {
            this.mRunnable = new Runnable() { // from class: l.k1c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123475a.consume();
                }
            };
        }
        return this.mRunnable;
    }

    public OnlineMatchPushUser getBroadcastCard() {
        return this.broadcastCard;
    }

    @Nullable
    public String getFitReason() {
        if (this.cardType == 1 && NullChecker.m82486a(this.insertCard)) {
            return this.insertCard.fitReason;
        }
        if (this.cardType == 2 && NullChecker.m82486a(this.broadcastCard)) {
            return this.broadcastCard.fitReason;
        }
        return null;
    }

    @Nullable
    public String getFriendPurpose() {
        if (this.cardType == 1 && NullChecker.m82486a(this.insertCard)) {
            return this.insertCard.friendPurpose;
        }
        if (this.cardType == 2 && NullChecker.m82486a(this.broadcastCard)) {
            return this.broadcastCard.friendPurpose;
        }
        return null;
    }

    public QuickChatCardInfo getInsertCard() {
        return this.insertCard;
    }

    @Nullable
    public User getUser() {
        if (this.cardType == 1 && NullChecker.m82486a(this.insertCard)) {
            return CoreModule.f18264c.f20381e0.m116503Pa(this.insertCard.userID);
        }
        int i = this.cardType;
        if ((i == 2 || i == 3) && NullChecker.m82486a(this.broadcastCard)) {
            return this.broadcastCard.user;
        }
        return null;
    }

    @Nullable
    public String getZodiacFitPercent() {
        if (this.cardType == 1 && NullChecker.m82486a(this.insertCard)) {
            return this.insertCard.zodiacFitPercent;
        }
        if (this.cardType == 2 && NullChecker.m82486a(this.broadcastCard)) {
            return this.broadcastCard.zodiacFitPercent;
        }
        return null;
    }

    public boolean isConsumed() {
        return this.mConsumed;
    }

    public boolean isOneside() {
        return this.isOneside;
    }

    public boolean isPeiLiao() {
        return this.cardType == 3;
    }

    public void markAsConsumed() {
        this.mConsumed = true;
        l51.m152890J(this.mRunnable);
    }

    public QuickChatCardWrapper(OnlineMatchPushUser onlineMatchPushUser) {
        this.broadcastCard = onlineMatchPushUser;
        this.userId = onlineMatchPushUser.userId;
        this.rsStateReceiverToSender = onlineMatchPushUser.rsStateReceiverToSender;
        this.isOneside = onlineMatchPushUser.oneside;
    }
}
