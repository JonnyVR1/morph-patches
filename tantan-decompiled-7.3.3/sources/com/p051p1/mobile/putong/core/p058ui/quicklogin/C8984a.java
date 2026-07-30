package com.p051p1.mobile.putong.core.p058ui.quicklogin;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.i4g0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quicklogin.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quicklogin/a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "b", "(Lcom/p1/mobile/android/app/Act;)V", "a", "", "Ljava/lang/String;", "INTL_THIRD_QUICK_LOGIN_REDIRECT_URI", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8984a {

    @NotNull
    public static final C8984a INSTANCE = new C8984a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public static String INTL_THIRD_QUICK_LOGIN_REDIRECT_URI;

    /* JADX INFO: renamed from: a */
    public final void m55806a() {
        i4g0.m138520r("e_intl_topup_authorization_button", "p_intl_topup_authorization_page");
    }

    /* JADX INFO: renamed from: b */
    public final void m55807b(@NotNull Act act) {
        act.getClass();
        act.startActivityWithCustomTransition(ThirdPayQuickLoginAct.INSTANCE.m55805a(act), new MatchAct.C8617b());
    }
}
