package com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;", "cardType", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "a", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampMemberCardHelper$CardType;)Lcom/p1/mobile/putong/core/data/PurchaseType;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8380a {

    @NotNull
    public static final C8380a INSTANCE = new C8380a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.a$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27370a;

        static {
            int[] iArr = new int[MeTabRevampMemberCardHelper.CardType.values().length];
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.SEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MeTabRevampMemberCardHelper.CardType.ULTRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27370a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final PurchaseType m44330a(@NotNull MeTabRevampMemberCardHelper.CardType cardType) {
        cardType.getClass();
        int i = a.f27370a[cardType.ordinal()];
        if (i == 1) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (i == 2) {
            return PurchaseType.TYPE_GET_LIKERS;
        }
        if (i == 3) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        if (i == 4) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        nbr.m162172a();
        return null;
    }
}
