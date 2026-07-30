package com.p046p1.mobile.putong.core.p053ui.quicklogin;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quicklogin.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quicklogin/a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "b", "(Lcom/p1/mobile/android/app/Act;)V", "a", "", "Ljava/lang/String;", "INTL_THIRD_QUICK_LOGIN_REDIRECT_URI", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8821a {

    @NotNull
    public static final C8821a INSTANCE = new C8821a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public static String INTL_THIRD_QUICK_LOGIN_REDIRECT_URI;

    /* JADX INFO: renamed from: a */
    public final void m54623a() {
        zvf0.m220396r("e_intl_topup_authorization_button", "p_intl_topup_authorization_page");
    }

    /* JADX INFO: renamed from: b */
    public final void m54624b(@NotNull Act act) {
        act.getClass();
        act.startActivityWithCustomTransition(ThirdPayQuickLoginAct.INSTANCE.m54622a(act), new MatchAct.C8454b());
    }
}
