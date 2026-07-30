package com.p046p1.mobile.putong.core.newui.home.card.expanded.helper;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.bt0;
import p149l.co5;
import p149l.lra0;
import p149l.t100;
import p149l.upa;
import p149l.w9j;
import p149l.xaj0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardStyleHelper {

    /* JADX INFO: renamed from: h */
    public static long f22407h = 330;

    /* JADX INFO: renamed from: i */
    public static ExpandedCardStyleHelper f22408i;

    /* JADX INFO: renamed from: g */
    public String f22415g;

    /* JADX INFO: renamed from: b */
    public C22393b<C7951b> f22410b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public C22393b<xaj0<String, Float, Float>> f22411c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public C22393b<Boolean> f22412d = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public ValueAnimator f22413e = null;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f22414f = null;

    /* JADX INFO: renamed from: a */
    public C7951b f22409a = new C7951b();

    public enum ExpandedCardStyle {
        SINGLE_CARD_STYLE("首页支持切卡的样式"),
        EXPANDED_PROFILE_STYLE("首页卡平滑转场到资料后的样式");

        private String desc;

        ExpandedCardStyle(String str) {
            this.desc = str;
        }

        public String getDesc() {
            return this.desc;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper$a */
    public class C7950a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f22416a;

        public C7950a(String str) {
            this.f22416a = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            Float f = (Float) valueAnimator.getAnimatedValue();
            ExpandedCardStyleHelper.this.f22409a.f22422e = f.floatValue();
            ExpandedCardStyleHelper.this.f22411c.m132487l(xaj0.m207578a(this.f22416a, f, Float.valueOf(ExpandedCardStyleHelper.this.f22409a.f22423f)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper$b */
    public static class C7951b {

        /* JADX INFO: renamed from: a */
        public ExpandedCardStyle f22418a;

        /* JADX INFO: renamed from: b */
        public boolean f22419b;

        /* JADX INFO: renamed from: c */
        public User f22420c;

        /* JADX INFO: renamed from: d */
        public CoreSuggested.UserInfo f22421d;

        /* JADX INFO: renamed from: e */
        public float f22422e;

        /* JADX INFO: renamed from: f */
        public float f22423f;

        /* JADX INFO: renamed from: g */
        public boolean f22424g;

        /* JADX INFO: renamed from: h */
        public boolean f22425h;

        /* JADX INFO: renamed from: i */
        public boolean f22426i;

        /* JADX INFO: renamed from: j */
        public boolean f22427j;

        /* JADX INFO: renamed from: k */
        public int f22428k;

        public C7951b() {
            this.f22418a = ExpandedCardStyle.SINGLE_CARD_STYLE;
            this.f22419b = false;
            this.f22422e = 0.0f;
            this.f22423f = 0.0f;
            this.f22424g = false;
            this.f22425h = false;
            this.f22426i = false;
            this.f22427j = false;
            this.f22428k = 0;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C7951b m38112b(User user, CoreSuggested.UserInfo userInfo) {
            C7951b c7951b = new C7951b();
            c7951b.f22419b = this.f22419b;
            c7951b.f22418a = this.f22418a;
            c7951b.f22420c = user;
            c7951b.f22421d = userInfo;
            c7951b.f22425h = this.f22425h;
            c7951b.f22422e = this.f22422e;
            c7951b.f22423f = this.f22423f;
            c7951b.f22427j = this.f22427j;
            c7951b.f22426i = this.f22426i;
            c7951b.f22428k = this.f22428k;
            c7951b.f22424g = this.f22424g;
            return c7951b;
        }

        /* JADX INFO: renamed from: c */
        public int m38113c() {
            return t100.m186890d(m38117g() ? 100.0f : 50.0f);
        }

        /* JADX INFO: renamed from: d */
        public int m38114d() {
            return t100.m186890d(m38118h() ? 60.0f : 10.0f);
        }

        /* JADX INFO: renamed from: e */
        public boolean m38115e() {
            return this.f22418a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        }

        /* JADX INFO: renamed from: f */
        public boolean m38116f() {
            return this.f22425h;
        }

        /* JADX INFO: renamed from: g */
        public boolean m38117g() {
            return !m38115e();
        }

        /* JADX INFO: renamed from: h */
        public boolean m38118h() {
            return this.f22425h && !m38115e();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m38089i() {
        if (f22408i != null) {
            synchronized (ExpandedCardStyleHelper.class) {
                f22408i = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static ExpandedCardStyleHelper m38090o() {
        if (f22408i == null) {
            synchronized (ExpandedCardStyleHelper.class) {
                try {
                    if (f22408i == null) {
                        f22408i = new ExpandedCardStyleHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (upa.m194675N3()) {
            f22407h = 300L;
        }
        return f22408i;
    }

    /* JADX INFO: renamed from: A */
    public void m38091A(String str) {
        if (m38103s()) {
            CoreSuggested.UserInfo userInfo = this.f22409a.f22421d;
            if (userInfo == null || !TextUtils.equals(str, userInfo.f19472id)) {
                m38097l(true, true, null, null, "cardChange");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m38092f() {
        C7951b c7951b = this.f22409a;
        if (c7951b.f22419b) {
            return true;
        }
        if (c7951b.f22418a != ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            return false;
        }
        lra0.m151149h("android_back");
        m38107w("click back");
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m38093g(User user, CoreSuggested.UserInfo userInfo) {
        C7951b c7951b = this.f22409a;
        if (c7951b.f22419b) {
            return;
        }
        if (c7951b.f22418a == ExpandedCardStyle.SINGLE_CARD_STYLE) {
            m38098m(user, userInfo);
        } else {
            m38096k(user, userInfo, "changeModel");
        }
    }

    /* JADX INFO: renamed from: h */
    public C22306c<Boolean> m38094h() {
        return this.f22412d;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m38105u() {
        C4348d.m20896l().m20899j();
    }

    /* JADX INFO: renamed from: k */
    public void m38096k(User user, CoreSuggested.UserInfo userInfo, String str) {
        m38097l(true, false, user, userInfo, str);
    }

    /* JADX INFO: renamed from: l */
    public final void m38097l(boolean z, boolean z2, User user, CoreSuggested.UserInfo userInfo, String str) {
        ValueAnimator valueAnimator;
        C7951b c7951b = this.f22409a;
        ExpandedCardStyle expandedCardStyle = c7951b.f22418a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.SINGLE_CARD_STYLE;
        if (expandedCardStyle == expandedCardStyle2) {
            co5.m107931c();
            this.f22412d.m132487l(Boolean.FALSE);
            if (!NullChecker.m81303a(userInfo) || TextUtils.equals(userInfo.f19472id, this.f22415g) || (valueAnimator = this.f22413e) == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f22413e.cancel();
            m38108x(false, userInfo.f19472id);
            return;
        }
        if (c7951b.f22419b) {
            return;
        }
        m38105u();
        C7951b c7951b2 = this.f22409a;
        c7951b2.f22418a = expandedCardStyle2;
        c7951b2.f22424g = z;
        User user2 = c7951b2.f22420c;
        String str2 = user2 == null ? "" : user2.f56011id;
        if (z2) {
            c7951b2.f22422e = 0.0f;
        }
        this.f22410b.m132487l(c7951b2.m38112b(user, userInfo));
        m38108x(false, str2);
        co5.m107931c();
        CoreModule.f17545c.f19663m0.f19429l2.m132487l("closeExpandedCardInner: " + str2);
    }

    /* JADX INFO: renamed from: m */
    public void m38098m(User user, CoreSuggested.UserInfo userInfo) {
        C7951b c7951b = this.f22409a;
        ExpandedCardStyle expandedCardStyle = c7951b.f22418a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        if (expandedCardStyle == expandedCardStyle2 || c7951b.f22419b) {
            return;
        }
        m38105u();
        C7951b c7951b2 = this.f22409a;
        c7951b2.f22418a = expandedCardStyle2;
        c7951b2.f22424g = false;
        c7951b2.f22420c = user;
        c7951b2.f22421d = userInfo;
        this.f22410b.m132487l(c7951b2.m38112b(user, userInfo));
        m38108x(true, user.f56011id);
        C22393b<String> c22393b = CoreModule.f17545c.f19663m0.f19429l2;
        StringBuilder sb = new StringBuilder("expandedTopCard: ");
        sb.append(userInfo == null ? "empty" : userInfo.f19472id);
        c22393b.m132487l(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public C7951b m38099n() {
        return this.f22409a;
    }

    /* JADX INFO: renamed from: p */
    public float m38100p() {
        C7951b c7951b = this.f22409a;
        return Math.max(0.0f, c7951b.f22423f - c7951b.f22422e);
    }

    /* JADX INFO: renamed from: q */
    public int m38101q() {
        return (int) (t100.f167227B * (1.0f - this.f22409a.f22422e));
    }

    /* JADX INFO: renamed from: r */
    public float m38102r() {
        return this.f22409a.f22422e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m38103s() {
        return this.f22409a.f22418a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
    }

    /* JADX INFO: renamed from: t */
    public boolean m38104t() {
        return this.f22409a.f22425h;
    }

    /* JADX INFO: renamed from: v */
    public C22306c<Pair<Float, Float>> m38106v(final String str) {
        return this.f22411c.filter(new w9j() { // from class: l.zlf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                String str2 = str;
                xaj0 xaj0Var = (xaj0) obj;
                return Boolean.valueOf(TextUtils.equals(str2, (CharSequence) xaj0Var.f191751a) || TextUtils.equals(str2, CoreSuggested.UserInfo.VIRTUAL_CARD) || TextUtils.equals("fake_trans_id", (CharSequence) xaj0Var.f191751a));
            }
        }).map(new w9j() { // from class: l.amf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return Pair.create((Float) xaj0Var.f191752b, (Float) xaj0Var.f191753c);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m38107w(String str) {
        C7951b c7951b = this.f22409a;
        m38097l(true, false, c7951b.f22420c, c7951b.f22421d, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m38108x(boolean z, String str) {
        ValueAnimator valueAnimator = this.f22413e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22413e.cancel();
        }
        this.f22415g = str;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f22409a.f22422e, z ? 1.0f : 0.0f);
        this.f22413e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(f22407h);
        this.f22413e.addUpdateListener(new C7950a(str));
        bt0.m103733f(this.f22413e, new Runnable() { // from class: l.ylf
            @Override // java.lang.Runnable
            public final void run() {
                this.f198879a.m38105u();
            }
        });
        this.f22413e.start();
    }

    /* JADX INFO: renamed from: y */
    public C22306c<C7951b> m38109y() {
        return this.f22410b;
    }

    /* JADX INFO: renamed from: z */
    public void m38110z(User user, CoreSuggested.UserInfo userInfo) {
        m38097l(false, true, user, userInfo, "swipeCard");
    }
}
