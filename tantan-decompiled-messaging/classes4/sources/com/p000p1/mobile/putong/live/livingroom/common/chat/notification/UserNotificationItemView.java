package com.p000p1.mobile.putong.live.livingroom.common.chat.notification;

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
import com.p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.concurrent.TimeUnit;
import l.bs5;
import l.bt0;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.hxs;
import l.idv;
import l.j760;
import l.jo0;
import l.kvc0;
import l.mkd0;
import l.mqv;
import l.ngm;
import l.t100;
import l.xdl0;
import l.yb2;
import l.ym2;
import l.ypv;
import l.zvf0;
import p002l.er40;
import p002l.j25;
import p002l.o7t;
import p002l.pol;
import p002l.w6k0;
import rx.c;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserNotificationItemView extends FrameLayout implements pol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f4962a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4963b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4964c;

    /* JADX INFO: renamed from: d */
    public VText f4965d;

    /* JADX INFO: renamed from: e */
    public VImage f4966e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4967f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4968g;

    /* JADX INFO: renamed from: h */
    public VText f4969h;

    /* JADX INFO: renamed from: i */
    public boolean f4970i;

    /* JADX INFO: renamed from: j */
    public bs5 f4971j;

    /* JADX INFO: renamed from: k */
    public Animator f4972k;

    /* JADX INFO: renamed from: l */
    public Animator f4973l;

    /* JADX INFO: renamed from: m */
    public e30<o7t> f4974m;

    /* JADX INFO: renamed from: n */
    public o7t f4975n;

    /* JADX INFO: renamed from: o */
    public boolean f4976o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView$a */
    public class C0336a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4977a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimpleDraweeView f4978b;

        public C0336a(String str, SimpleDraweeView simpleDraweeView) {
            this.f4977a = str;
            this.f4978b = simpleDraweeView;
        }

        /* JADX INFO: renamed from: h */
        public void m6241h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar != null && UserNotificationItemView.this.m6228j(this.f4977a) == null) {
                int height = (int) (this.f4978b.getHeight() * (ngmVar.getWidth() / ngmVar.getHeight()));
                xdl0.D0(height, new View[]{this.f4978b});
                UserNotificationItemView.this.m6225B(this.f4977a, height);
            }
        }
    }

    public UserNotificationItemView(Context context) {
        super(context);
        this.f4974m = null;
        this.f4976o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m6222s(@Nullable final e30<o7t> e30Var) {
        bs5 bs5Var = new bs5();
        this.f4971j = bs5Var;
        bs5Var.a(c.interval(0L, 1L, TimeUnit.SECONDS).take(((int) this.f4975n.m19282f()) + 1).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.u6k0
            public final void call(Object obj) {
                this.f20506a.m6220o(e30Var, (Long) obj);
            }
        })));
        this.f4971j.a(er40.m12674a().subscribe(ffw.d(new e30() { // from class: l.v6k0
            public final void call(Object obj) {
                this.f21017a.m6233p(e30Var, (String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: D */
    private void m6211D(@Nullable e30<o7t> e30Var) {
        this.f4974m = e30Var;
        if (this.f4973l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f4973l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            bt0.f(this.f4973l, new Runnable() { // from class: l.q6k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17824a.m6234q();
                }
            });
        }
        this.f4973l.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m6220o(e30 e30Var, Long l2) {
        if (l2.longValue() >= this.f4975n.m19282f()) {
            m6211D(e30Var);
            return;
        }
        if (!this.f4975n.m19287k() || this.f4965d == null) {
            return;
        }
        long jM19282f = this.f4975n.m19282f() - l2.longValue();
        this.f4965d.setText(String.format(this.f4975n.m19278b().replaceAll("%@", "%s"), jM19282f + ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m6221r(d30 d30Var) {
        setAlpha(0.0f);
        xdl0.M(this, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: v */
    private void m6223v(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m6224A(View view, final o7t o7tVar, final e30<o7t> e30Var, final boolean z, final String str) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.t6k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20106a.m6232n(o7tVar, str, e30Var, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m6225B(String str, int i) {
        er40.m12675b().put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public final void m6226E(final d30 d30Var, @Nullable final e30<o7t> e30Var, boolean z) {
        if (z) {
            if (this.f4972k == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 0.0f, 1.0f);
                this.f4972k = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                bt0.w(this.f4972k, new Runnable() { // from class: l.r6k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18394a.m6221r(d30Var);
                    }
                }, new Runnable() { // from class: l.s6k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18805a.m6222s(e30Var);
                    }
                });
            }
            this.f4972k.start();
        }
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
        m6236u();
    }

    /* JADX INFO: renamed from: i */
    public final void m6227i(View view) {
        w6k0.m24353a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Integer m6228j(String str) {
        return er40.m12675b().get(str);
    }

    /* JADX INFO: renamed from: k */
    public void m6229k(@Nullable e30<o7t> e30Var) {
        Animator animator = this.f4972k;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f4973l;
        if (animator2 == null || !animator2.isRunning()) {
            mkd0.z(this.f4971j);
            m6211D(e30Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m6230l() {
        return this.f4970i;
    }

    /* JADX INFO: renamed from: m */
    public boolean m6231m() {
        return xdl0.O0(this);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6232n(o7t o7tVar, String str, e30 e30Var, boolean z, View view) {
        if (er40.m12676c(o7tVar)) {
            j25.m15556a(str);
        }
        if ((!o7tVar.m19286j() || TextUtils.isEmpty(o7tVar.m19280d().getSchema())) && !o7tVar.m19283g().equals("follow")) {
            return;
        }
        e30Var.call(o7tVar);
        mkd0.z(this.f4971j);
        if (z) {
            m6229k(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f4971j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6227i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m6233p(e30 e30Var, String str) {
        o7t o7tVar = this.f4975n;
        if (o7tVar == null || str == null) {
            return;
        }
        if ((er40.m12680g(str, o7tVar.m19283g()) || er40.m12677d(str, this.f4975n.m19283g())) && m6231m()) {
            m6229k(e30Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m6234q() {
        xdl0.M(this, false);
        e30<o7t> e30Var = this.f4974m;
        if (e30Var != null) {
            e30Var.call(this.f4975n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m6235t(String str, SimpleDraweeView simpleDraweeView) {
        Integer numM6228j = m6228j(str);
        if (numM6228j != null && simpleDraweeView.getWidth() != numM6228j.intValue()) {
            xdl0.D0(numM6228j.intValue(), new View[]{simpleDraweeView});
        }
        hxs.w("context_single_room", simpleDraweeView, str, new C0336a(str, simpleDraweeView));
    }

    /* JADX INFO: renamed from: u */
    public void m6236u() {
        mkd0.z(this.f4971j);
        m6223v(this.f4972k);
        m6223v(this.f4973l);
    }

    /* JADX INFO: renamed from: w */
    public final void m6237w(LongLinkAdminMessage.JumpStyle jumpStyle, o7t o7tVar, e30<o7t> e30Var, boolean z, String str) {
        LongLinkAdminMessage.ButtonJumpStyle button = jumpStyle.getButton();
        if (!TextUtils.isEmpty(button.getIcon())) {
            m6238x(this.f4967f, button.getIcon(), o7tVar, e30Var, z, str);
            return;
        }
        m6238x(this.f4969h, null, o7tVar, e30Var, z, str);
        this.f4969h.setText(button.getContent());
        Drawable drawableE = yb2.e(new int[]{kvc0.g(button.getBgcolor().getStartColor()), kvc0.g(button.getBgcolor().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.h, false);
        drawableE.setAlpha((int) (Float.parseFloat(button.getBgcolor().getAlpha()) * 255.0f));
        this.f4969h.setBackgroundDrawable(drawableE);
        if (TextUtils.isEmpty(button.getTextColor())) {
            return;
        }
        this.f4969h.setTextColor(kvc0.g(button.getTextColor()));
    }

    /* JADX INFO: renamed from: x */
    public final void m6238x(View view, String str, o7t o7tVar, e30<o7t> e30Var, boolean z, String str2) {
        this.f4976o = true;
        xdl0.M(view, true);
        m6224A(this, o7tVar, e30Var, z, str2);
        if (!(view instanceof VDraweeView) || TextUtils.isEmpty(str)) {
            return;
        }
        m6235t(str, (VDraweeView) view);
    }

    /* JADX INFO: renamed from: y */
    public void m6239y(o7t o7tVar, e30<o7t> e30Var) {
        m6240z(o7tVar, e30Var, null, null, false, "");
    }

    /* JADX INFO: renamed from: z */
    public void m6240z(o7t o7tVar, e30<o7t> e30Var, d30 d30Var, @Nullable e30<o7t> e30Var2, boolean z, String str) {
        VDraweeView vDraweeView;
        if (o7tVar == null) {
            return;
        }
        this.f4975n = o7tVar;
        this.f4970i = o7tVar.m19288l();
        xdl0.M(this, !z);
        mkd0.z(this.f4971j);
        xdl0.M(this.f4966e, false);
        xdl0.M(this.f4967f, false);
        xdl0.M(this.f4969h, false);
        xdl0.M(this.f4968g, false);
        this.f4976o = false;
        LongLinkAdminMessage.JumpType type = o7tVar.m19280d().getType();
        LongLinkAdminMessage.JumpStyle jumpStyleM19280d = o7tVar.m19280d();
        if (type == LongLinkAdminMessage.JumpType.gotoLink && !TextUtils.isEmpty(jumpStyleM19280d.getSchema())) {
            m6238x(this.f4966e, null, o7tVar, e30Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.staticButton) {
            m6237w(jumpStyleM19280d, o7tVar, e30Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.dynamicButton) {
            m6238x(this.f4968g, jumpStyleM19280d.getButton().getUrl(), o7tVar, e30Var, z, str);
        }
        LongLinkAdminMessage.BgStyle bgStyleM19277a = o7tVar.m19277a();
        if (o7tVar.m19284h() && !TextUtils.isEmpty(bgStyleM19277a.getStartColor()) && !TextUtils.isEmpty(bgStyleM19277a.getEndColor())) {
            Drawable drawableE = yb2.e(new int[]{Color.parseColor(bgStyleM19277a.getStartColor()), Color.parseColor(bgStyleM19277a.getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.i, false);
            drawableE.setAlpha((int) (Float.parseFloat(bgStyleM19277a.getAlpha()) * 255.0f));
            this.f4962a.setBackground(drawableE);
        }
        boolean zM19285i = o7tVar.m19285i();
        if (zM19285i && this.f4976o) {
            vDraweeView = this.f4964c;
            xdl0.M(vDraweeView, true);
            xdl0.M(this.f4963b, false);
        } else {
            vDraweeView = this.f4963b;
            xdl0.M(vDraweeView, zM19285i);
            xdl0.M(this.f4964c, false);
        }
        xdl0.V(this.f4965d, zM19285i ? t100.g : t100.d(12.0f));
        xdl0.W(this.f4965d, this.f4976o ? 0 : t100.d(12.0f));
        if (o7tVar.m19285i()) {
            if (o7tVar.m19279c().getType() == LongLinkAdminMessage.IconType.iconUrl) {
                hxs.t("context_livingAct", vDraweeView, o7tVar.m19279c().getUrl(), t100.s);
            } else if (o7tVar.m19279c().getType() == LongLinkAdminMessage.IconType.userSelf) {
                hxs.s("context_livingAct", vDraweeView, ((Media) ((User) mqv.f(((idv) ypv.l(fld0.b)).i(ypv.a.D0())).a).fp()).url);
            }
        }
        this.f4965d.setText(o7tVar.m19278b());
        if (this.f4976o && zM19285i) {
            this.f4965d.setMaxLines(1);
        } else {
            this.f4965d.setMaxLines(2);
        }
        m6226E(d30Var, e30Var2, z);
        if (o7tVar.m19287k()) {
            this.f4965d.setText(String.format(o7tVar.m19278b().replaceAll("%@", "%s"), o7tVar.m19282f() + ""));
        }
        if (TextUtils.equals(o7tVar.m19283g(), "officialShowAudienceTrack")) {
            zvf0.A("e_live_bottom_popup", "p_user_live_room", new j760[]{j760.a("live_category", "to_previous_room")});
        }
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4974m = null;
        this.f4976o = false;
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4974m = null;
        this.f4976o = false;
    }
}
