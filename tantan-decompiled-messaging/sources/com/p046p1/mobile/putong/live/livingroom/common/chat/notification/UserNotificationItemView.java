package com.p046p1.mobile.putong.live.livingroom.common.chat.notification;

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
import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p046p1.mobile.putong.data.User;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bs5;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.er40;
import p149l.ffw;
import p149l.fld0;
import p149l.hxs;
import p149l.idv;
import p149l.j25;
import p149l.j760;
import p149l.jo0;
import p149l.kvc0;
import p149l.mkd0;
import p149l.mqv;
import p149l.ngm;
import p149l.o7t;
import p149l.pol;
import p149l.t100;
import p149l.w6k0;
import p149l.xdl0;
import p149l.yb2;
import p149l.ym2;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class UserNotificationItemView extends FrameLayout implements pol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f48920a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48921b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48922c;

    /* JADX INFO: renamed from: d */
    public VText f48923d;

    /* JADX INFO: renamed from: e */
    public VImage f48924e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48925f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48926g;

    /* JADX INFO: renamed from: h */
    public VText f48927h;

    /* JADX INFO: renamed from: i */
    public boolean f48928i;

    /* JADX INFO: renamed from: j */
    public bs5 f48929j;

    /* JADX INFO: renamed from: k */
    public Animator f48930k;

    /* JADX INFO: renamed from: l */
    public Animator f48931l;

    /* JADX INFO: renamed from: m */
    public e30<o7t> f48932m;

    /* JADX INFO: renamed from: n */
    public o7t f48933n;

    /* JADX INFO: renamed from: o */
    public boolean f48934o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationItemView$a */
    public class C12747a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f48935a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimpleDraweeView f48936b;

        public C12747a(String str, SimpleDraweeView simpleDraweeView) {
            this.f48935a = str;
            this.f48936b = simpleDraweeView;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar != null && UserNotificationItemView.this.m72724j(this.f48935a) == null) {
                int height = (int) (this.f48936b.getHeight() * (ngmVar.getWidth() / ngmVar.getHeight()));
                xdl0.m208327D0(height, this.f48936b);
                UserNotificationItemView.this.m72721B(this.f48935a, height);
            }
        }
    }

    public UserNotificationItemView(Context context) {
        super(context);
        this.f48932m = null;
        this.f48934o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m72718s(@Nullable final e30<o7t> e30Var) {
        bs5 bs5Var = new bs5();
        this.f48929j = bs5Var;
        bs5Var.m103655a(C22306c.interval(0L, 1L, TimeUnit.SECONDS).take(((int) this.f48933n.m163054f()) + 1).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.u6k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174847a.m72716o(e30Var, (Long) obj);
            }
        })));
        this.f48929j.m103655a(er40.m117813a().subscribe(ffw.m121193d(new e30() { // from class: l.v6k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180214a.m72729p(e30Var, (String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: D */
    private void m72707D(@Nullable e30<o7t> e30Var) {
        this.f48932m = e30Var;
        if (this.f48931l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 1.0f, 0.0f);
            this.f48931l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            bt0.m103733f(this.f48931l, new Runnable() { // from class: l.q6k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152920a.m72730q();
                }
            });
        }
        this.f48931l.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m72716o(e30 e30Var, Long l2) {
        if (l2.longValue() >= this.f48933n.m163054f()) {
            m72707D(e30Var);
            return;
        }
        if (!this.f48933n.m163059k() || this.f48923d == null) {
            return;
        }
        long jM163054f = this.f48933n.m163054f() - l2.longValue();
        this.f48923d.setText(String.format(this.f48933n.m163050b().replaceAll("%@", "%s"), jM163054f + ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m72717r(d30 d30Var) {
        setAlpha(0.0f);
        xdl0.m208344M(this, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: v */
    private void m72719v(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m72720A(View view, final o7t o7tVar, final e30<o7t> e30Var, final boolean z, final String str) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.t6k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f168622a.m72728n(o7tVar, str, e30Var, z, view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m72721B(String str, int i) {
        er40.m117814b().put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public final void m72722E(final d30 d30Var, @Nullable final e30<o7t> e30Var, boolean z) {
        if (z) {
            if (this.f48930k == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<UserNotificationItemView, Float>) View.ALPHA, 0.0f, 1.0f);
                this.f48930k = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                bt0.m103750w(this.f48930k, new Runnable() { // from class: l.r6k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f157946a.m72717r(d30Var);
                    }
                }, new Runnable() { // from class: l.s6k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f162832a.m72718s(e30Var);
                    }
                });
            }
            this.f48930k.start();
        }
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        m72732u();
    }

    /* JADX INFO: renamed from: i */
    public final void m72723i(View view) {
        w6k0.m201884a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final Integer m72724j(String str) {
        return er40.m117814b().get(str);
    }

    /* JADX INFO: renamed from: k */
    public void m72725k(@Nullable e30<o7t> e30Var) {
        Animator animator = this.f48930k;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f48931l;
        if (animator2 == null || !animator2.isRunning()) {
            mkd0.m154992z(this.f48929j);
            m72707D(e30Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m72726l() {
        return this.f48928i;
    }

    /* JADX INFO: renamed from: m */
    public boolean m72727m() {
        return xdl0.m208349O0(this);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m72728n(o7t o7tVar, String str, e30 e30Var, boolean z, View view) {
        if (er40.m117815c(o7tVar)) {
            j25.m139405a(str);
        }
        if ((!o7tVar.m163058j() || TextUtils.isEmpty(o7tVar.m163052d().getSchema())) && !o7tVar.m163055g().equals("follow")) {
            return;
        }
        e30Var.call(o7tVar);
        mkd0.m154992z(this.f48929j);
        if (z) {
            m72725k(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f48929j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72723i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m72729p(e30 e30Var, String str) {
        o7t o7tVar = this.f48933n;
        if (o7tVar == null || str == null) {
            return;
        }
        if ((er40.m117819g(str, o7tVar.m163055g()) || er40.m117816d(str, this.f48933n.m163055g())) && m72727m()) {
            m72725k(e30Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m72730q() {
        xdl0.m208344M(this, false);
        e30<o7t> e30Var = this.f48932m;
        if (e30Var != null) {
            e30Var.call(this.f48933n);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m72731t(String str, SimpleDraweeView simpleDraweeView) {
        Integer numM72724j = m72724j(str);
        if (numM72724j != null && simpleDraweeView.getWidth() != numM72724j.intValue()) {
            xdl0.m208327D0(numM72724j.intValue(), simpleDraweeView);
        }
        hxs.m133410w("context_single_room", simpleDraweeView, str, new C12747a(str, simpleDraweeView));
    }

    /* JADX INFO: renamed from: u */
    public void m72732u() {
        mkd0.m154992z(this.f48929j);
        m72719v(this.f48930k);
        m72719v(this.f48931l);
    }

    /* JADX INFO: renamed from: w */
    public final void m72733w(LongLinkAdminMessage.JumpStyle jumpStyle, o7t o7tVar, e30<o7t> e30Var, boolean z, String str) {
        LongLinkAdminMessage.ButtonJumpStyle button = jumpStyle.getButton();
        if (!TextUtils.isEmpty(button.getIcon())) {
            m72734x(this.f48925f, button.getIcon(), o7tVar, e30Var, z, str);
            return;
        }
        m72734x(this.f48927h, null, o7tVar, e30Var, z, str);
        this.f48927h.setText(button.getContent());
        Drawable drawableM213880e = yb2.m213880e(new int[]{kvc0.m147358g(button.getBgcolor().getStartColor()), kvc0.m147358g(button.getBgcolor().getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167259h, false);
        drawableM213880e.setAlpha((int) (Float.parseFloat(button.getBgcolor().getAlpha()) * 255.0f));
        this.f48927h.setBackgroundDrawable(drawableM213880e);
        if (TextUtils.isEmpty(button.getTextColor())) {
            return;
        }
        this.f48927h.setTextColor(kvc0.m147358g(button.getTextColor()));
    }

    /* JADX INFO: renamed from: x */
    public final void m72734x(View view, String str, o7t o7tVar, e30<o7t> e30Var, boolean z, String str2) {
        this.f48934o = true;
        xdl0.m208344M(view, true);
        m72720A(this, o7tVar, e30Var, z, str2);
        if (!(view instanceof VDraweeView) || TextUtils.isEmpty(str)) {
            return;
        }
        m72731t(str, (VDraweeView) view);
    }

    /* JADX INFO: renamed from: y */
    public void m72735y(o7t o7tVar, e30<o7t> e30Var) {
        m72736z(o7tVar, e30Var, null, null, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m72736z(o7t o7tVar, e30<o7t> e30Var, d30 d30Var, @Nullable e30<o7t> e30Var2, boolean z, String str) {
        VDraweeView vDraweeView;
        if (o7tVar == null) {
            return;
        }
        this.f48933n = o7tVar;
        this.f48928i = o7tVar.m163060l();
        xdl0.m208344M(this, !z);
        mkd0.m154992z(this.f48929j);
        xdl0.m208344M(this.f48924e, false);
        xdl0.m208344M(this.f48925f, false);
        xdl0.m208344M(this.f48927h, false);
        xdl0.m208344M(this.f48926g, false);
        this.f48934o = false;
        LongLinkAdminMessage.JumpType type = o7tVar.m163052d().getType();
        LongLinkAdminMessage.JumpStyle jumpStyleM163052d = o7tVar.m163052d();
        if (type == LongLinkAdminMessage.JumpType.gotoLink && !TextUtils.isEmpty(jumpStyleM163052d.getSchema())) {
            m72734x(this.f48924e, null, o7tVar, e30Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.staticButton) {
            m72733w(jumpStyleM163052d, o7tVar, e30Var, z, str);
        } else if (type == LongLinkAdminMessage.JumpType.dynamicButton) {
            m72734x(this.f48926g, jumpStyleM163052d.getButton().getUrl(), o7tVar, e30Var, z, str);
        }
        LongLinkAdminMessage.BgStyle bgStyleM163049a = o7tVar.m163049a();
        if (o7tVar.m163056h() && !TextUtils.isEmpty(bgStyleM163049a.getStartColor()) && !TextUtils.isEmpty(bgStyleM163049a.getEndColor())) {
            Drawable drawableM213880e = yb2.m213880e(new int[]{Color.parseColor(bgStyleM163049a.getStartColor()), Color.parseColor(bgStyleM163049a.getEndColor())}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167260i, false);
            drawableM213880e.setAlpha((int) (Float.parseFloat(bgStyleM163049a.getAlpha()) * 255.0f));
            this.f48920a.setBackground(drawableM213880e);
        }
        boolean zM163057i = o7tVar.m163057i();
        if (zM163057i && this.f48934o) {
            vDraweeView = this.f48922c;
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f48921b, false);
        } else {
            vDraweeView = this.f48921b;
            xdl0.m208344M(vDraweeView, zM163057i);
            xdl0.m208344M(this.f48922c, false);
        }
        xdl0.m208358V(this.f48923d, zM163057i ? t100.f167258g : t100.m186890d(12.0f));
        xdl0.m208359W(this.f48923d, this.f48934o ? 0 : t100.m186890d(12.0f));
        if (o7tVar.m163057i()) {
            if (o7tVar.m163051c().getType() == LongLinkAdminMessage.IconType.iconUrl) {
                hxs.m133407t("context_livingAct", vDraweeView, o7tVar.m163051c().getUrl(), t100.f167270s);
            } else if (o7tVar.m163051c().getType() == LongLinkAdminMessage.IconType.userSelf) {
                hxs.m133406s("context_livingAct", vDraweeView, ((User) mqv.m155998f(((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0())).f135304a).m60124fp().url);
            }
        }
        this.f48923d.setText(o7tVar.m163050b());
        if (this.f48934o && zM163057i) {
            this.f48923d.setMaxLines(1);
        } else {
            this.f48923d.setMaxLines(2);
        }
        m72722E(d30Var, e30Var2, z);
        if (o7tVar.m163059k()) {
            this.f48923d.setText(String.format(o7tVar.m163050b().replaceAll("%@", "%s"), o7tVar.m163054f() + ""));
        }
        if (TextUtils.equals(o7tVar.m163055g(), "officialShowAudienceTrack")) {
            zvf0.m220368A("e_live_bottom_popup", "p_user_live_room", j760.m140076a("live_category", "to_previous_room"));
        }
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48932m = null;
        this.f48934o = false;
    }

    public UserNotificationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48932m = null;
        this.f48934o = false;
    }
}
