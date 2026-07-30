package com.p000p1.mobile.putong.core.newui.messages;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.ui.label.CommonLabelView;
import com.p1.mobile.android.ui.label.LabelModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.label.CoreLabelTag;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.bt0;
import l.ct0;
import l.dac0;
import l.e30;
import l.mkd0;
import l.ni6;
import l.qib0;
import l.s6r;
import l.sw6;
import l.t100;
import l.upa;
import l.x2c0;
import l.x9j;
import l.xdl0;
import p009l.hj0;
import p009l.i0g0;
import p009l.mqi0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationNewMatchItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConversationNewMatchItem f3788a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3789b;

    /* JADX INFO: renamed from: c */
    public CommonLabelView f3790c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f3791d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3792e;

    /* JADX INFO: renamed from: f */
    public View f3793f;

    /* JADX INFO: renamed from: g */
    public VImage f3794g;

    /* JADX INFO: renamed from: h */
    public VLinear f3795h;

    /* JADX INFO: renamed from: i */
    public VText f3796i;

    /* JADX INFO: renamed from: j */
    public VText f3797j;

    /* JADX INFO: renamed from: k */
    public VText f3798k;

    /* JADX INFO: renamed from: l */
    public RoundedCornerView f3799l;

    /* JADX INFO: renamed from: m */
    public View f3800m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f3801n;

    /* JADX INFO: renamed from: o */
    public User f3802o;

    /* JADX INFO: renamed from: p */
    public Conversation f3803p;

    /* JADX INFO: renamed from: q */
    public Animator f3804q;

    /* JADX INFO: renamed from: r */
    public Animator f3805r;

    public ConversationNewMatchItem(@NonNull Context context) {
        super(context);
    }

    private int getRootHeight() {
        return (int) (((double) ((t100.c().widthPixels - t100.q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m5341d(View view) {
        ni6.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m5342e() {
        Animator duration = bt0.q(this.f3799l, "roundedCornerRadius", new float[]{t100.d(39.0f), t100.d(10.0f)}).setDuration(600L);
        Property property = View.ALPHA;
        Animator duration2 = bt0.n(this.f3799l, property, new float[]{1.0f, 0.92f}).setDuration(650L);
        RoundedCornerView roundedCornerView = this.f3799l;
        Property property2 = ct0.n;
        Animator duration3 = bt0.o(roundedCornerView, property2, new int[]{t100.d(36.0f), (xdl0.y0() / 2) - t100.d(31.0f)}).setDuration(650L);
        Animator duration4 = bt0.n(this.f3800m, property, new float[]{1.0f, 0.0f}).setDuration(300L);
        Animator duration5 = bt0.n(this.f3795h, property, new float[]{1.0f, 0.0f}).setDuration(300L);
        final Animator duration6 = bt0.n(this.f3801n, property, new float[]{0.0f, 1.0f}).setDuration(200L);
        Objects.requireNonNull(duration6);
        bt0.f(duration5, new Runnable() { // from class: l.ii6
            @Override // java.lang.Runnable
            public final void run() {
                duration6.start();
            }
        });
        this.f3804q = bt0.z(new Animator[]{duration, duration2, duration3, duration4, duration5});
        Animator duration7 = bt0.q(this.f3799l, "roundedCornerRadius", new float[]{t100.d(10.0f), t100.d(39.0f)}).setDuration(300L);
        Animator duration8 = bt0.n(this.f3799l, property, new float[]{0.92f, 1.0f}).setDuration(325L);
        Animator duration9 = bt0.o(this.f3799l, property2, new int[]{(xdl0.y0() / 2) - t100.d(31.0f), t100.d(36.0f)}).setDuration(325L);
        Animator duration10 = bt0.n(this.f3800m, property, new float[]{0.0f, 1.0f}).setDuration(150L);
        Animator duration11 = bt0.n(this.f3795h, property, new float[]{0.0f, 1.0f}).setDuration(150L);
        final Animator duration12 = bt0.n(this.f3801n, property, new float[]{1.0f, 0.0f}).setDuration(100L);
        Objects.requireNonNull(duration12);
        bt0.v(duration11, new Runnable() { // from class: l.ii6
            @Override // java.lang.Runnable
            public final void run() {
                duration12.start();
            }
        });
        this.f3805r = bt0.z(new Animator[]{duration7, duration8, duration9, duration10, duration11});
    }

    /* JADX INFO: renamed from: f */
    public final void m5343f() {
        Conversation conversation = this.f3803p;
        if (conversation == null || TextUtils.isEmpty(((DbObject) conversation).id)) {
            return;
        }
        getContext().startActivity(MessagesAct.k2(getContext(), ((DbObject) this.f3803p).id, false, false, 28));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m5344g(e30 e30Var, String str, e30 e30Var2, Pair pair) {
        boolean z;
        String strConcat;
        User user = (User) pair.first;
        this.f3802o = user;
        this.f3803p = (Conversation) pair.second;
        if (!user.isBanedOrInactivated()) {
            Conversation conversation = this.f3803p;
            if (!conversation.localEverHasMessage && TEnum.equals(conversation.status, "default")) {
                qib0.G.N0(this.f3789b, sw6.a(this.f3802o).maxWidth(480).formatted(), false);
                if (mqi0.m18550o() - this.f3803p.createdTime >= ((long) (NullChecker.a(upa.E0()) ? upa.E0().new_tag_show_max_time : 30)) * 86400000) {
                    z = false;
                } else {
                    if (this.f3803p.labelExposureTime() >= 1.0d) {
                        if (mqi0.m18550o() - this.f3803p.labelExposureTime() >= ((long) (NullChecker.a(upa.E0()) ? upa.E0().new_tag_exposure_after_max_minutes : 3)) * 60000) {
                            z = false;
                        }
                    }
                    z = true;
                }
                boolean z2 = !this.f3803p.read.booleanValue() && (z || CoreModule.c.f0.m2.contains(str));
                CommonLabelView commonLabelView = this.f3790c;
                if (z2) {
                    xdl0.M(commonLabelView, true);
                    xdl0.D0(t100.d(39.0f), new View[]{this.f3790c});
                    xdl0.C0(this.f3790c, t100.o);
                    CoreModule.c.f0.m2.add(str);
                } else {
                    xdl0.M(commonLabelView, false);
                }
                if (z2 && NullChecker.a(e30Var2) && this.f3803p.labelExposureTime() < 1.0d) {
                    e30Var2.call(this.f3803p);
                }
                if (this.f3802o.isIdAndPicBothVerified()) {
                    xdl0.M(this.f3791d, true);
                    boolean z3 = upa.z();
                    CommonLabelView commonLabelView2 = this.f3791d;
                    if (z3) {
                        commonLabelView2.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                    } else {
                        commonLabelView2.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.OLD_VERIFIED_ICON));
                    }
                } else {
                    boolean zIsPicVerificationVerified = this.f3802o.isPicVerificationVerified();
                    CommonLabelView commonLabelView3 = this.f3791d;
                    if (zIsPicVerificationVerified) {
                        xdl0.M(commonLabelView3, true);
                        boolean z4 = upa.z();
                        CommonLabelView commonLabelView4 = this.f3791d;
                        if (z4) {
                            commonLabelView4.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                        } else {
                            commonLabelView4.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.OLD_AVATAR_ICON));
                        }
                    } else {
                        xdl0.M(commonLabelView3, false);
                    }
                }
                String strY7 = CoreModule.c.e0.y7(((DbObject) this.f3802o).id);
                boolean zIsEmpty = TextUtils.isEmpty(strY7);
                VText vText = this.f3796i;
                if (zIsEmpty) {
                    vText.setText(this.f3802o.name);
                } else {
                    vText.setText(strY7);
                }
                this.f3797j.setText(String.valueOf(this.f3802o.age));
                xdl0.M(this.f3797j, !this.f3802o.isHideAgeFromSVip());
                boolean zIsHideLocationFromSVip = this.f3802o.isHideLocationFromSVip();
                boolean zIsHideActiveFromSVip = this.f3802o.isHideActiveFromSVip();
                if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
                    xdl0.M(this.f3798k, false);
                } else {
                    xdl0.M(this.f3798k, true);
                    if (zIsHideActiveFromSVip || !CoreModule.c.N0.k3(this.f3802o, 5)) {
                        this.f3798k.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        strConcat = "";
                    } else {
                        Drawable drawable = getContext().getDrawable(x2c0.yi);
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                        this.f3798k.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        strConcat = "在线";
                    }
                    if (!zIsHideLocationFromSVip) {
                        if (!TextUtils.isEmpty(strConcat)) {
                            strConcat = strConcat.concat(" · ");
                        }
                        strConcat = strConcat + i0g0.m16144p(this.f3802o.location.distance, true);
                    }
                    boolean zIsEmpty2 = TextUtils.isEmpty(strConcat);
                    VText vText2 = this.f3798k;
                    if (zIsEmpty2) {
                        xdl0.M(vText2, false);
                    } else {
                        vText2.setText(strConcat);
                    }
                }
                xdl0.M(this.f3794g, false);
                this.f3793f.setBackgroundResource(x2c0.Zf);
                xdl0.C0(this.f3793f, (getRootHeight() * t100.d(108.0f)) / t100.d(234.0f));
                if (this.f3802o.superLikedMe()) {
                    if (upa.z()) {
                        xdl0.M(this.f3794g, true);
                        return;
                    } else {
                        this.f3793f.setBackgroundResource(x2c0.Ug);
                        xdl0.C0(this.f3793f, (getRootHeight() * t100.d(57.0f)) / t100.d(234.0f));
                        return;
                    }
                }
                return;
            }
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(((DbObject) this.f3802o).id);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m5345h(int i, View view) {
        m5343f();
        hj0.m15855b(this.f3803p, this.f3802o, i, "p_new_match", "card");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5346i(int i, View view) {
        m5343f();
        hj0.m15855b(this.f3803p, this.f3802o, i, "p_new_match", "chat_icon");
    }

    /* JADX INFO: renamed from: j */
    public void m5347j(Frag frag, dac0<Conversation> dac0Var, final String str, final e30<String> e30Var, final e30<Conversation> e30Var2, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dac0Var.c(frag, mkd0.r(CoreModule.c.e0.Ka(str), CoreModule.c.f0.Ne(str), new x9j() { // from class: l.ji6
            public final Object call(Object obj, Object obj2) {
                return new Pair((User) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ki6
            public final void call(Object obj) {
                this.f15703a.m5344g(e30Var, str, e30Var2, (Pair) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.li6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16174a.m5345h(i, view);
            }
        });
        xdl0.E0(this.f3799l, new View.OnClickListener() { // from class: l.mi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16935a.m5346i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m5348k() {
        if (this.f3804q.isRunning()) {
            m5350m();
        } else {
            this.f3805r.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m5349l() {
        this.f3801n.setText((CharSequence) upa.D0().get((int) (Math.random() * ((double) upa.D0().size()))));
        this.f3804q.start();
    }

    /* JADX INFO: renamed from: m */
    public void m5350m() {
        this.f3804q.cancel();
        this.f3795h.setAlpha(1.0f);
        this.f3800m.setAlpha(1.0f);
        this.f3801n.setAlpha(0.0f);
        this.f3799l.setRoundedCornerRadius(t100.d(39.0f));
        this.f3799l.setAlpha(1.0f);
        xdl0.D0(t100.d(36.0f), new View[]{this.f3799l});
    }

    /* JADX INFO: renamed from: n */
    public User m5351n() {
        return this.f3802o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5341d(this);
        boolean z = upa.z();
        View view = this.f3800m;
        if (z) {
            view.setBackgroundResource(x2c0.wg);
            xdl0.V(this.f3795h, t100.h);
            xdl0.U(this.f3794g, (getRootHeight() * t100.d(55.0f)) / t100.d(234.0f));
        } else {
            view.setBackgroundResource(x2c0.ag);
        }
        m5342e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getRootHeight(), View.MeasureSpec.getMode(i2)));
    }

    public ConversationNewMatchItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationNewMatchItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
