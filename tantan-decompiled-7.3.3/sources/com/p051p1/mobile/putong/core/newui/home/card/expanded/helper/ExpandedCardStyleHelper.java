package com.p051p1.mobile.putong.core.newui.home.card.expanded.helper;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.gp5;
import p153l.gra;
import p153l.gt0;
import p153l.pza0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardStyleHelper {

    /* JADX INFO: renamed from: h */
    public static long f23149h = 330;

    /* JADX INFO: renamed from: i */
    public static ExpandedCardStyleHelper f23150i;

    /* JADX INFO: renamed from: g */
    public String f23157g;

    /* JADX INFO: renamed from: b */
    public C22508b<C8102b> f23152b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public C22508b<bkj0<String, Float, Float>> f23153c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public C22508b<Boolean> f23154d = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public ValueAnimator f23155e = null;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f23156f = null;

    /* JADX INFO: renamed from: a */
    public C8102b f23151a = new C8102b();

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
    public class C8101a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23158a;

        public C8101a(String str) {
            this.f23158a = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            Float f = (Float) valueAnimator.getAnimatedValue();
            ExpandedCardStyleHelper.this.f23151a.f23164e = f.floatValue();
            ExpandedCardStyleHelper.this.f23153c.m137019l(bkj0.m104818a(this.f23158a, f, Float.valueOf(ExpandedCardStyleHelper.this.f23151a.f23165f)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper$b */
    public static class C8102b {

        /* JADX INFO: renamed from: a */
        public ExpandedCardStyle f23160a;

        /* JADX INFO: renamed from: b */
        public boolean f23161b;

        /* JADX INFO: renamed from: c */
        public User f23162c;

        /* JADX INFO: renamed from: d */
        public CoreSuggested.UserInfo f23163d;

        /* JADX INFO: renamed from: e */
        public float f23164e;

        /* JADX INFO: renamed from: f */
        public float f23165f;

        /* JADX INFO: renamed from: g */
        public boolean f23166g;

        /* JADX INFO: renamed from: h */
        public boolean f23167h;

        /* JADX INFO: renamed from: i */
        public boolean f23168i;

        /* JADX INFO: renamed from: j */
        public boolean f23169j;

        /* JADX INFO: renamed from: k */
        public int f23170k;

        public C8102b() {
            this.f23160a = ExpandedCardStyle.SINGLE_CARD_STYLE;
            this.f23161b = false;
            this.f23164e = 0.0f;
            this.f23165f = 0.0f;
            this.f23166g = false;
            this.f23167h = false;
            this.f23168i = false;
            this.f23169j = false;
            this.f23170k = 0;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C8102b m39115b(User user, CoreSuggested.UserInfo userInfo) {
            C8102b c8102b = new C8102b();
            c8102b.f23161b = this.f23161b;
            c8102b.f23160a = this.f23160a;
            c8102b.f23162c = user;
            c8102b.f23163d = userInfo;
            c8102b.f23167h = this.f23167h;
            c8102b.f23164e = this.f23164e;
            c8102b.f23165f = this.f23165f;
            c8102b.f23169j = this.f23169j;
            c8102b.f23168i = this.f23168i;
            c8102b.f23170k = this.f23170k;
            c8102b.f23166g = this.f23166g;
            return c8102b;
        }

        /* JADX INFO: renamed from: c */
        public int m39116c() {
            return qa00.m175859d(m39120g() ? 100.0f : 50.0f);
        }

        /* JADX INFO: renamed from: d */
        public int m39117d() {
            return qa00.m175859d(m39121h() ? 60.0f : 10.0f);
        }

        /* JADX INFO: renamed from: e */
        public boolean m39118e() {
            return this.f23160a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        }

        /* JADX INFO: renamed from: f */
        public boolean m39119f() {
            return this.f23167h;
        }

        /* JADX INFO: renamed from: g */
        public boolean m39120g() {
            return !m39118e();
        }

        /* JADX INFO: renamed from: h */
        public boolean m39121h() {
            return this.f23167h && !m39118e();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m39092i() {
        if (f23150i != null) {
            synchronized (ExpandedCardStyleHelper.class) {
                f23150i = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static ExpandedCardStyleHelper m39093o() {
        if (f23150i == null) {
            synchronized (ExpandedCardStyleHelper.class) {
                try {
                    if (f23150i == null) {
                        f23150i = new ExpandedCardStyleHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (gra.m131606N3()) {
            f23149h = 300L;
        }
        return f23150i;
    }

    /* JADX INFO: renamed from: A */
    public void m39094A(String str) {
        if (m39106s()) {
            CoreSuggested.UserInfo userInfo = this.f23151a.f23163d;
            if (userInfo == null || !TextUtils.equals(str, userInfo.f20214id)) {
                m39100l(true, true, null, null, "cardChange");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m39095f() {
        C8102b c8102b = this.f23151a;
        if (c8102b.f23161b) {
            return true;
        }
        if (c8102b.f23160a != ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            return false;
        }
        pza0.m174356h("android_back");
        m39110w("click back");
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m39096g(User user, CoreSuggested.UserInfo userInfo) {
        C8102b c8102b = this.f23151a;
        if (c8102b.f23161b) {
            return;
        }
        if (c8102b.f23160a == ExpandedCardStyle.SINGLE_CARD_STYLE) {
            m39101m(user, userInfo);
        } else {
            m39099k(user, userInfo, "changeModel");
        }
    }

    /* JADX INFO: renamed from: h */
    public C22421c<Boolean> m39097h() {
        return this.f23154d;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m39108u() {
        C4499d.m21895l().m21898j();
    }

    /* JADX INFO: renamed from: k */
    public void m39099k(User user, CoreSuggested.UserInfo userInfo, String str) {
        m39100l(true, false, user, userInfo, str);
    }

    /* JADX INFO: renamed from: l */
    public final void m39100l(boolean z, boolean z2, User user, CoreSuggested.UserInfo userInfo, String str) {
        ValueAnimator valueAnimator;
        C8102b c8102b = this.f23151a;
        ExpandedCardStyle expandedCardStyle = c8102b.f23160a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.SINGLE_CARD_STYLE;
        if (expandedCardStyle == expandedCardStyle2) {
            gp5.m131229c();
            this.f23154d.m137019l(Boolean.FALSE);
            if (!NullChecker.m82486a(userInfo) || TextUtils.equals(userInfo.f20214id, this.f23157g) || (valueAnimator = this.f23155e) == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f23155e.cancel();
            m39111x(false, userInfo.f20214id);
            return;
        }
        if (c8102b.f23161b) {
            return;
        }
        m39108u();
        C8102b c8102b2 = this.f23151a;
        c8102b2.f23160a = expandedCardStyle2;
        c8102b2.f23166g = z;
        User user2 = c8102b2.f23162c;
        String str2 = user2 == null ? "" : user2.f56859id;
        if (z2) {
            c8102b2.f23164e = 0.0f;
        }
        this.f23152b.m137019l(c8102b2.m39115b(user, userInfo));
        m39111x(false, str2);
        gp5.m131229c();
        CoreModule.f18264c.f20405m0.f20171l2.m137019l("closeExpandedCardInner: " + str2);
    }

    /* JADX INFO: renamed from: m */
    public void m39101m(User user, CoreSuggested.UserInfo userInfo) {
        C8102b c8102b = this.f23151a;
        ExpandedCardStyle expandedCardStyle = c8102b.f23160a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        if (expandedCardStyle == expandedCardStyle2 || c8102b.f23161b) {
            return;
        }
        m39108u();
        C8102b c8102b2 = this.f23151a;
        c8102b2.f23160a = expandedCardStyle2;
        c8102b2.f23166g = false;
        c8102b2.f23162c = user;
        c8102b2.f23163d = userInfo;
        this.f23152b.m137019l(c8102b2.m39115b(user, userInfo));
        m39111x(true, user.f56859id);
        C22508b<String> c22508b = CoreModule.f18264c.f20405m0.f20171l2;
        StringBuilder sb = new StringBuilder("expandedTopCard: ");
        sb.append(userInfo == null ? "empty" : userInfo.f20214id);
        c22508b.m137019l(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public C8102b m39102n() {
        return this.f23151a;
    }

    /* JADX INFO: renamed from: p */
    public float m39103p() {
        C8102b c8102b = this.f23151a;
        return Math.max(0.0f, c8102b.f23165f - c8102b.f23164e);
    }

    /* JADX INFO: renamed from: q */
    public int m39104q() {
        return (int) (qa00.f156289B * (1.0f - this.f23151a.f23164e));
    }

    /* JADX INFO: renamed from: r */
    public float m39105r() {
        return this.f23151a.f23164e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m39106s() {
        return this.f23151a.f23160a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
    }

    /* JADX INFO: renamed from: t */
    public boolean m39107t() {
        return this.f23151a.f23167h;
    }

    /* JADX INFO: renamed from: v */
    public C22421c<Pair<Float, Float>> m39109v(final String str) {
        return this.f23153c.filter(new qcj() { // from class: l.fnf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                String str2 = str;
                bkj0 bkj0Var = (bkj0) obj;
                return Boolean.valueOf(TextUtils.equals(str2, (CharSequence) bkj0Var.f77081a) || TextUtils.equals(str2, CoreSuggested.UserInfo.VIRTUAL_CARD) || TextUtils.equals("fake_trans_id", (CharSequence) bkj0Var.f77081a));
            }
        }).map(new qcj() { // from class: l.gnf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return Pair.create((Float) bkj0Var.f77082b, (Float) bkj0Var.f77083c);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m39110w(String str) {
        C8102b c8102b = this.f23151a;
        m39100l(true, false, c8102b.f23162c, c8102b.f23163d, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m39111x(boolean z, String str) {
        ValueAnimator valueAnimator = this.f23155e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23155e.cancel();
        }
        this.f23157g = str;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f23151a.f23164e, z ? 1.0f : 0.0f);
        this.f23155e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(f23149h);
        this.f23155e.addUpdateListener(new C8101a(str));
        gt0.m132160f(this.f23155e, new Runnable() { // from class: l.enf
            @Override // java.lang.Runnable
            public final void run() {
                this.f94780a.m39108u();
            }
        });
        this.f23155e.start();
    }

    /* JADX INFO: renamed from: y */
    public C22421c<C8102b> m39112y() {
        return this.f23152b;
    }

    /* JADX INFO: renamed from: z */
    public void m39113z(User user, CoreSuggested.UserInfo userInfo) {
        m39100l(false, true, user, userInfo, "swipeCard");
    }
}
