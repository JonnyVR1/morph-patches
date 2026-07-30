package com.p051p1.mobile.putong.live.livingroom.common.chat.notification;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p051p1.mobile.putong.data.User;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.arl;
import p153l.bnl0;
import p153l.cgk0;
import p153l.dhw;
import p153l.fc2;
import p153l.fn2;
import p153l.fo0;
import p153l.ft5;
import p153l.gt0;
import p153l.htd0;
import p153l.i35;
import p153l.i4g0;
import p153l.izs;
import p153l.jfv;
import p153l.n3d0;
import p153l.nsv;
import p153l.p9t;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qim;
import p153l.tz40;
import p153l.x20;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class UserNotificationItemView extends FrameLayout implements arl {

    /* JADX INFO: renamed from: a */
    public LinearLayout f49768a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49769b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49770c;

    /* JADX INFO: renamed from: d */
    public VText f49771d;

    /* JADX INFO: renamed from: e */
    public VImage f49772e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49773f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49774g;

    /* JADX INFO: renamed from: h */
    public VText f49775h;

    /* JADX INFO: renamed from: i */
    public boolean f49776i;

    /* JADX INFO: renamed from: j */
    public ft5 f49777j;

    /* JADX INFO: renamed from: k */
    public Animator f49778k;

    /* JADX INFO: renamed from: l */
    public Animator f49779l;

    /* JADX INFO: renamed from: m */
    public y20<p9t> f49780m;

    /* JADX INFO: renamed from: n */
    public p9t f49781n;

    /* JADX INFO: renamed from: o */
    public boolean f49782o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView$a */
    public class C12910a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f49783a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimpleDraweeView f49784b;

        public C12910a(String str, SimpleDraweeView simpleDraweeView) {
            this.f49783a = str;
            this.f49784b = simpleDraweeView;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar != null && UserNotificationItemView.this.m73907j(this.f49783a) == null) {
                int height = (int) (this.f49784b.getHeight() * (qimVar.getWidth() / qimVar.getHeight()));
                bnl0.m105507D0(height, this.f49784b);
                UserNotificationItemView.this.m73904B(this.f49783a, height);
            }
        }
    }

    public UserNotificationItemView(Context context) {
        super(context);
        this.f49780m = null;
        this.f49782o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m73901s(@Nullable final y20<p9t> y20Var) {
        ft5 ft5Var = new ft5();
        this.f49777j = ft5Var;
        ft5Var.m127297a(C22421c.interval(0L, 1L, TimeUnit.SECONDS).take(((int) this.f49781n.m171383f()) + 1).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.agk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71247a.m73899o(y20Var, (Long) obj);
            }
        })));
        this.f49777j.m127297a(tz40.m193642a().subscribe(dhw.m115825d(new y20() { // from class: l.bgk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76663a.m73912p(y20Var, (String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: D */
    private void m73890D(@Nullable y20<p9t> y20Var) {
        this.f49780m = y20Var;
        if (this.f49779l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f49779l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            gt0.m132160f(this.f49779l, new Runnable() { // from class: l.wfk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188860a.m73913q();
                }
            });
        }
        this.f49779l.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m73899o(y20 y20Var, Long l2) {
        if (l2.longValue() >= this.f49781n.m171383f()) {
            m73890D(y20Var);
            return;
        }
        if (!this.f49781n.m171388k() || this.f49771d == null) {
            return;
        }
        long jM171383f = this.f49781n.m171383f() - l2.longValue();
        this.f49771d.setText(String.format(this.f49781n.m171379b().replaceAll("%@", "%s"), jM171383f + ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m73900r(x20 x20Var) {
        setAlpha(0.0f);
        bnl0.m105524M(this, true);
        x20Var.call();
    }

    /* JADX INFO: renamed from: v */
    private void m73902v(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m73903A(View view, final p9t p9tVar, final y20<p9t> y20Var, final boolean z, final String str) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.zfk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f204150a.m73911n(p9tVar, str, y20Var, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m73904B(String str, int i) {
        tz40.m193643b().put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public final void m73905E(final x20 x20Var, @Nullable final y20<p9t> y20Var, boolean z) {
        if (z) {
            if (this.f49778k == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 0.0f, 1.0f);
                this.f49778k = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                gt0.m132177w(this.f49778k, new Runnable() { // from class: l.xfk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f194045a.m73900r(x20Var);
                    }
                }, new Runnable() { // from class: l.yfk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f199537a.m73901s(y20Var);
                    }
                });
            }
            this.f49778k.start();
        }
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        m73915u();
    }

    /* JADX INFO: renamed from: i */
    public final void m73906i(View view) {
        cgk0.m109710a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Integer m73907j(String str) {
        return tz40.m193643b().get(str);
    }

    /* JADX INFO: renamed from: k */
    public void m73908k(@Nullable y20<p9t> y20Var) {
        Animator animator = this.f49778k;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f49779l;
        if (animator2 == null || !animator2.isRunning()) {
            psd0.m173633z(this.f49777j);
            m73890D(y20Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m73909l() {
        return this.f49776i;
    }

    /* JADX INFO: renamed from: m */
    public boolean m73910m() {
        return bnl0.m105529O0(this);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m73911n(p9t p9tVar, String str, y20 y20Var, boolean z, View view) {
        if (tz40.m193644c(p9tVar)) {
            i35.m138265a(str);
        }
        if ((!p9tVar.m171387j() || TextUtils.isEmpty(p9tVar.m171381d().getSchema())) && !p9tVar.m171384g().equals("follow")) {
            return;
        }
        y20Var.call(p9tVar);
        psd0.m173633z(this.f49777j);
        if (z) {
            m73908k(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f49777j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73906i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m73912p(y20 y20Var, String str) {
        p9t p9tVar = this.f49781n;
        if (p9tVar == null || str == null) {
            return;
        }
        if ((tz40.m193648g(str, p9tVar.m171384g()) || tz40.m193645d(str, this.f49781n.m171384g())) && m73910m()) {
            m73908k(y20Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m73913q() {
        bnl0.m105524M(this, false);
        y20<p9t> y20Var = this.f49780m;
        if (y20Var != null) {
            y20Var.call(this.f49781n);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m73914t(String str, SimpleDraweeView simpleDraweeView) {
        Integer numM73907j = m73907j(str);
        if (numM73907j != null && simpleDraweeView.getWidth() != numM73907j.intValue()) {
            bnl0.m105507D0(numM73907j.intValue(), simpleDraweeView);
        }
        izs.m142872w("context_single_room", simpleDraweeView, str, new C12910a(str, simpleDraweeView));
    }

    /* JADX INFO: renamed from: u */
    public void m73915u() {
        psd0.m173633z(this.f49777j);
        m73902v(this.f49778k);
        m73902v(this.f49779l);
    }

    /* JADX INFO: renamed from: w */
    public final void m73916w(LongLinkAdminMessage.JumpStyle jumpStyle, p9t p9tVar, y20<p9t> y20Var, boolean z, String str) {
        LongLinkAdminMessage.ButtonJumpStyle button = jumpStyle.getButton();
        if (!TextUtils.isEmpty(button.getIcon())) {
            m73917x(this.f49773f, button.getIcon(), p9tVar, y20Var, z, str);
            return;
        }
        m73917x(this.f49775h, null, p9tVar, y20Var, z, str);
        this.f49775h.setText(button.getContent());
        Drawable drawableM124975e = fc2.m124975e(new int[]{n3d0.m161283g(button.getBgcolor().getStartColor()), n3d0.m161283g(button.getBgcolor().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156321h, false);
        drawableM124975e.setAlpha((int) (Float.parseFloat(button.getBgcolor().getAlpha()) * 255.0f));
        this.f49775h.setBackgroundDrawable(drawableM124975e);
        if (TextUtils.isEmpty(button.getTextColor())) {
            return;
        }
        this.f49775h.setTextColor(n3d0.m161283g(button.getTextColor()));
    }

    /* JADX INFO: renamed from: x */
    public final void m73917x(View view, String str, p9t p9tVar, y20<p9t> y20Var, boolean z, String str2) {
        this.f49782o = true;
        bnl0.m105524M(view, true);
        m73903A(this, p9tVar, y20Var, z, str2);
        if (!(view instanceof VDraweeView) || TextUtils.isEmpty(str)) {
            return;
        }
        m73914t(str, (VDraweeView) view);
    }

    /* JADX INFO: renamed from: y */
    public void m73918y(p9t p9tVar, y20<p9t> y20Var) {
        m73919z(p9tVar, y20Var, null, null, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m73919z(p9t p9tVar, y20<p9t> y20Var, x20 x20Var, @Nullable y20<p9t> y20Var2, boolean z, String str) {
        VDraweeView vDraweeView;
        if (p9tVar == null) {
            return;
        }
        this.f49781n = p9tVar;
        this.f49776i = p9tVar.m171389l();
        bnl0.m105524M(this, !z);
        psd0.m173633z(this.f49777j);
        bnl0.m105524M(this.f49772e, false);
        bnl0.m105524M(this.f49773f, false);
        bnl0.m105524M(this.f49775h, false);
        bnl0.m105524M(this.f49774g, false);
        this.f49782o = false;
        LongLinkAdminMessage.JumpType type = p9tVar.m171381d().getType();
        LongLinkAdminMessage.JumpStyle jumpStyleM171381d = p9tVar.m171381d();
        if (type == LongLinkAdminMessage.JumpType.gotoLink && !TextUtils.isEmpty(jumpStyleM171381d.getSchema())) {
            m73917x(this.f49772e, null, p9tVar, y20Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.staticButton) {
            m73916w(jumpStyleM171381d, p9tVar, y20Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.dynamicButton) {
            m73917x(this.f49774g, jumpStyleM171381d.getButton().getUrl(), p9tVar, y20Var, z, str);
        }
        LongLinkAdminMessage.BgStyle bgStyleM171378a = p9tVar.m171378a();
        if (p9tVar.m171385h() && !TextUtils.isEmpty(bgStyleM171378a.getStartColor()) && !TextUtils.isEmpty(bgStyleM171378a.getEndColor())) {
            Drawable drawableM124975e = fc2.m124975e(new int[]{Color.parseColor(bgStyleM171378a.getStartColor()), Color.parseColor(bgStyleM171378a.getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156322i, false);
            drawableM124975e.setAlpha((int) (Float.parseFloat(bgStyleM171378a.getAlpha()) * 255.0f));
            this.f49768a.setBackground(drawableM124975e);
        }
        boolean zM171386i = p9tVar.m171386i();
        if (zM171386i && this.f49782o) {
            vDraweeView = this.f49770c;
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f49769b, false);
        } else {
            vDraweeView = this.f49769b;
            bnl0.m105524M(vDraweeView, zM171386i);
            bnl0.m105524M(this.f49770c, false);
        }
        bnl0.m105538V(this.f49771d, zM171386i ? qa00.f156320g : qa00.m175859d(12.0f));
        bnl0.m105539W(this.f49771d, this.f49782o ? 0 : qa00.m175859d(12.0f));
        if (p9tVar.m171386i()) {
            if (p9tVar.m171380c().getType() == LongLinkAdminMessage.IconType.iconUrl) {
                izs.m142869t("context_livingAct", vDraweeView, p9tVar.m171380c().getUrl(), qa00.f156332s);
            } else if (p9tVar.m171380c().getType() == LongLinkAdminMessage.IconType.userSelf) {
                izs.m142868s("context_livingAct", vDraweeView, ((User) nsv.m164636f(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0())).f143542a).m61308fp().url);
            }
        }
        this.f49771d.setText(p9tVar.m171379b());
        if (this.f49782o && zM171386i) {
            this.f49771d.setMaxLines(1);
        } else {
            this.f49771d.setMaxLines(2);
        }
        m73905E(x20Var, y20Var2, z);
        if (p9tVar.m171388k()) {
            this.f49771d.setText(String.format(p9tVar.m171379b().replaceAll("%@", "%s"), p9tVar.m171383f() + ""));
        }
        if (TextUtils.equals(p9tVar.m171384g(), "officialShowAudienceTrack")) {
            i4g0.m138492A("e_live_bottom_popup", "p_user_live_room", pf60.m172085a("live_category", "to_previous_room"));
        }
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49780m = null;
        this.f49782o = false;
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49780m = null;
        this.f49782o = false;
    }
}
