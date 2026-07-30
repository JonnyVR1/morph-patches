package com.p000p1.mobile.putong.core.newui.home.card.expanded.helper;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.co5;
import l.t100;
import l.upa;
import l.w9j;
import l.xaj0;
import p009l.lra0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardStyleHelper {

    /* JADX INFO: renamed from: h */
    public static long f1185h = 330;

    /* JADX INFO: renamed from: i */
    public static ExpandedCardStyleHelper f1186i;

    /* JADX INFO: renamed from: g */
    public String f1193g;

    /* JADX INFO: renamed from: b */
    public b<C0115b> f1188b = b.b();

    /* JADX INFO: renamed from: c */
    public b<xaj0<String, Float, Float>> f1189c = b.b();

    /* JADX INFO: renamed from: d */
    public b<Boolean> f1190d = b.b();

    /* JADX INFO: renamed from: e */
    public ValueAnimator f1191e = null;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f1192f = null;

    /* JADX INFO: renamed from: a */
    public C0115b f1187a = new C0115b();

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
    public class C0114a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1194a;

        public C0114a(String str) {
            this.f1194a = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            Float f = (Float) valueAnimator.getAnimatedValue();
            ExpandedCardStyleHelper.this.f1187a.f1200e = f.floatValue();
            ExpandedCardStyleHelper.this.f1189c.onNext(xaj0.a(this.f1194a, f, Float.valueOf(ExpandedCardStyleHelper.this.f1187a.f1201f)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper$b */
    public static class C0115b {

        /* JADX INFO: renamed from: a */
        public ExpandedCardStyle f1196a;

        /* JADX INFO: renamed from: b */
        public boolean f1197b;

        /* JADX INFO: renamed from: c */
        public User f1198c;

        /* JADX INFO: renamed from: d */
        public CoreSuggested.UserInfo f1199d;

        /* JADX INFO: renamed from: e */
        public float f1200e;

        /* JADX INFO: renamed from: f */
        public float f1201f;

        /* JADX INFO: renamed from: g */
        public boolean f1202g;

        /* JADX INFO: renamed from: h */
        public boolean f1203h;

        /* JADX INFO: renamed from: i */
        public boolean f1204i;

        /* JADX INFO: renamed from: j */
        public boolean f1205j;

        /* JADX INFO: renamed from: k */
        public int f1206k;

        public C0115b() {
            this.f1196a = ExpandedCardStyle.SINGLE_CARD_STYLE;
            this.f1197b = false;
            this.f1200e = 0.0f;
            this.f1201f = 0.0f;
            this.f1202g = false;
            this.f1203h = false;
            this.f1204i = false;
            this.f1205j = false;
            this.f1206k = 0;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C0115b m2086b(User user, CoreSuggested.UserInfo userInfo) {
            C0115b c0115b = new C0115b();
            c0115b.f1197b = this.f1197b;
            c0115b.f1196a = this.f1196a;
            c0115b.f1198c = user;
            c0115b.f1199d = userInfo;
            c0115b.f1203h = this.f1203h;
            c0115b.f1200e = this.f1200e;
            c0115b.f1201f = this.f1201f;
            c0115b.f1205j = this.f1205j;
            c0115b.f1204i = this.f1204i;
            c0115b.f1206k = this.f1206k;
            c0115b.f1202g = this.f1202g;
            return c0115b;
        }

        /* JADX INFO: renamed from: c */
        public int m2087c() {
            return t100.d(m2091g() ? 100.0f : 50.0f);
        }

        /* JADX INFO: renamed from: d */
        public int m2088d() {
            return t100.d(m2092h() ? 60.0f : 10.0f);
        }

        /* JADX INFO: renamed from: e */
        public boolean m2089e() {
            return this.f1196a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        }

        /* JADX INFO: renamed from: f */
        public boolean m2090f() {
            return this.f1203h;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2091g() {
            return !m2089e();
        }

        /* JADX INFO: renamed from: h */
        public boolean m2092h() {
            return this.f1203h && !m2089e();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2063i() {
        if (f1186i != null) {
            synchronized (ExpandedCardStyleHelper.class) {
                f1186i = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static ExpandedCardStyleHelper m2064o() {
        if (f1186i == null) {
            synchronized (ExpandedCardStyleHelper.class) {
                try {
                    if (f1186i == null) {
                        f1186i = new ExpandedCardStyleHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (upa.N3()) {
            f1185h = 300L;
        }
        return f1186i;
    }

    /* JADX INFO: renamed from: A */
    public void m2065A(String str) {
        if (m2077s()) {
            CoreSuggested.UserInfo userInfo = this.f1187a.f1199d;
            if (userInfo == null || !TextUtils.equals(str, userInfo.id)) {
                m2071l(true, true, null, null, "cardChange");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m2066f() {
        C0115b c0115b = this.f1187a;
        if (c0115b.f1197b) {
            return true;
        }
        if (c0115b.f1196a != ExpandedCardStyle.EXPANDED_PROFILE_STYLE) {
            return false;
        }
        lra0.m17994h("android_back");
        m2081w("click back");
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m2067g(User user, CoreSuggested.UserInfo userInfo) {
        C0115b c0115b = this.f1187a;
        if (c0115b.f1197b) {
            return;
        }
        if (c0115b.f1196a == ExpandedCardStyle.SINGLE_CARD_STYLE) {
            m2072m(user, userInfo);
        } else {
            m2070k(user, userInfo, "changeModel");
        }
    }

    /* JADX INFO: renamed from: h */
    public c<Boolean> m2068h() {
        return this.f1190d;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m2079u() {
        d.l().j();
    }

    /* JADX INFO: renamed from: k */
    public void m2070k(User user, CoreSuggested.UserInfo userInfo, String str) {
        m2071l(true, false, user, userInfo, str);
    }

    /* JADX INFO: renamed from: l */
    public final void m2071l(boolean z, boolean z2, User user, CoreSuggested.UserInfo userInfo, String str) {
        ValueAnimator valueAnimator;
        C0115b c0115b = this.f1187a;
        ExpandedCardStyle expandedCardStyle = c0115b.f1196a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.SINGLE_CARD_STYLE;
        if (expandedCardStyle == expandedCardStyle2) {
            co5.c();
            this.f1190d.onNext(Boolean.FALSE);
            if (!NullChecker.a(userInfo) || TextUtils.equals(userInfo.id, this.f1193g) || (valueAnimator = this.f1191e) == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f1191e.cancel();
            m2082x(false, userInfo.id);
            return;
        }
        if (c0115b.f1197b) {
            return;
        }
        m2079u();
        C0115b c0115b2 = this.f1187a;
        c0115b2.f1196a = expandedCardStyle2;
        c0115b2.f1202g = z;
        User user2 = c0115b2.f1198c;
        String str2 = user2 == null ? "" : ((DbObject) user2).id;
        if (z2) {
            c0115b2.f1200e = 0.0f;
        }
        this.f1188b.onNext(c0115b2.m2086b(user, userInfo));
        m2082x(false, str2);
        co5.c();
        CoreModule.c.m0.l2.onNext("closeExpandedCardInner: " + str2);
    }

    /* JADX INFO: renamed from: m */
    public void m2072m(User user, CoreSuggested.UserInfo userInfo) {
        C0115b c0115b = this.f1187a;
        ExpandedCardStyle expandedCardStyle = c0115b.f1196a;
        ExpandedCardStyle expandedCardStyle2 = ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
        if (expandedCardStyle == expandedCardStyle2 || c0115b.f1197b) {
            return;
        }
        m2079u();
        C0115b c0115b2 = this.f1187a;
        c0115b2.f1196a = expandedCardStyle2;
        c0115b2.f1202g = false;
        c0115b2.f1198c = user;
        c0115b2.f1199d = userInfo;
        this.f1188b.onNext(c0115b2.m2086b(user, userInfo));
        m2082x(true, ((DbObject) user).id);
        b bVar = CoreModule.c.m0.l2;
        StringBuilder sb = new StringBuilder("expandedTopCard: ");
        sb.append(userInfo == null ? "empty" : userInfo.id);
        bVar.onNext(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public C0115b m2073n() {
        return this.f1187a;
    }

    /* JADX INFO: renamed from: p */
    public float m2074p() {
        C0115b c0115b = this.f1187a;
        return Math.max(0.0f, c0115b.f1201f - c0115b.f1200e);
    }

    /* JADX INFO: renamed from: q */
    public int m2075q() {
        return (int) (t100.B * (1.0f - this.f1187a.f1200e));
    }

    /* JADX INFO: renamed from: r */
    public float m2076r() {
        return this.f1187a.f1200e;
    }

    /* JADX INFO: renamed from: s */
    public boolean m2077s() {
        return this.f1187a.f1196a == ExpandedCardStyle.EXPANDED_PROFILE_STYLE;
    }

    /* JADX INFO: renamed from: t */
    public boolean m2078t() {
        return this.f1187a.f1203h;
    }

    /* JADX INFO: renamed from: v */
    public c<Pair<Float, Float>> m2080v(final String str) {
        return this.f1189c.filter(new w9j() { // from class: l.zlf
            public final Object call(Object obj) {
                String str2 = str;
                xaj0 xaj0Var = (xaj0) obj;
                return Boolean.valueOf(TextUtils.equals(str2, (CharSequence) xaj0Var.a) || TextUtils.equals(str2, "VirtualCard") || TextUtils.equals("fake_trans_id", (CharSequence) xaj0Var.a));
            }
        }).map(new w9j() { // from class: l.amf
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return Pair.create((Float) xaj0Var.b, (Float) xaj0Var.c);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m2081w(String str) {
        C0115b c0115b = this.f1187a;
        m2071l(true, false, c0115b.f1198c, c0115b.f1199d, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m2082x(boolean z, String str) {
        ValueAnimator valueAnimator = this.f1191e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1191e.cancel();
        }
        this.f1193g = str;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f1187a.f1200e, z ? 1.0f : 0.0f);
        this.f1191e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(f1185h);
        this.f1191e.addUpdateListener(new C0114a(str));
        bt0.f(this.f1191e, new Runnable() { // from class: l.ylf
            @Override // java.lang.Runnable
            public final void run() {
                this.f23138a.m2079u();
            }
        });
        this.f1191e.start();
    }

    /* JADX INFO: renamed from: y */
    public c<C0115b> m2083y() {
        return this.f1188b;
    }

    /* JADX INFO: renamed from: z */
    public void m2084z(User user, CoreSuggested.UserInfo userInfo) {
        m2071l(false, true, user, userInfo, "swipeCard");
    }
}
