package com.p046p1.mobile.putong.core.newui.messages;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.android.p048ui.label.LabelModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.label.CoreLabelTag;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.ct0;
import p149l.dac0;
import p149l.e30;
import p149l.hj0;
import p149l.i0g0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ni6;
import p149l.qib0;
import p149l.s6r;
import p149l.sw6;
import p149l.t100;
import p149l.upa;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationNewMatchItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConversationNewMatchItem f25010a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25011b;

    /* JADX INFO: renamed from: c */
    public CommonLabelView f25012c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f25013d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25014e;

    /* JADX INFO: renamed from: f */
    public View f25015f;

    /* JADX INFO: renamed from: g */
    public VImage f25016g;

    /* JADX INFO: renamed from: h */
    public VLinear f25017h;

    /* JADX INFO: renamed from: i */
    public VText f25018i;

    /* JADX INFO: renamed from: j */
    public VText f25019j;

    /* JADX INFO: renamed from: k */
    public VText f25020k;

    /* JADX INFO: renamed from: l */
    public RoundedCornerView f25021l;

    /* JADX INFO: renamed from: m */
    public View f25022m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f25023n;

    /* JADX INFO: renamed from: o */
    public User f25024o;

    /* JADX INFO: renamed from: p */
    public Conversation f25025p;

    /* JADX INFO: renamed from: q */
    public Animator f25026q;

    /* JADX INFO: renamed from: r */
    public Animator f25027r;

    public ConversationNewMatchItem(@NonNull Context context) {
        super(context);
    }

    private int getRootHeight() {
        return (int) (((double) ((t100.m186889c().widthPixels - t100.f167268q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m41235d(View view) {
        ni6.m159494a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m41236e() {
        Animator duration = bt0.m103744q(this.f25021l, "roundedCornerRadius", t100.m186890d(39.0f), t100.m186890d(10.0f)).setDuration(600L);
        Property property = View.ALPHA;
        Animator duration2 = bt0.m103741n(this.f25021l, property, 1.0f, 0.92f).setDuration(650L);
        RoundedCornerView roundedCornerView = this.f25021l;
        Property<View, Integer> property2 = ct0.f82448n;
        Animator duration3 = bt0.m103742o(roundedCornerView, property2, t100.m186890d(36.0f), (xdl0.m208412y0() / 2) - t100.m186890d(31.0f)).setDuration(650L);
        Animator duration4 = bt0.m103741n(this.f25022m, property, 1.0f, 0.0f).setDuration(300L);
        Animator duration5 = bt0.m103741n(this.f25017h, property, 1.0f, 0.0f).setDuration(300L);
        final Animator duration6 = bt0.m103741n(this.f25023n, property, 0.0f, 1.0f).setDuration(200L);
        Objects.requireNonNull(duration6);
        bt0.m103733f(duration5, new Runnable() { // from class: l.ii6
            @Override // java.lang.Runnable
            public final void run() {
                duration6.start();
            }
        });
        this.f25026q = bt0.m103753z(duration, duration2, duration3, duration4, duration5);
        Animator duration7 = bt0.m103744q(this.f25021l, "roundedCornerRadius", t100.m186890d(10.0f), t100.m186890d(39.0f)).setDuration(300L);
        Animator duration8 = bt0.m103741n(this.f25021l, property, 0.92f, 1.0f).setDuration(325L);
        Animator duration9 = bt0.m103742o(this.f25021l, property2, (xdl0.m208412y0() / 2) - t100.m186890d(31.0f), t100.m186890d(36.0f)).setDuration(325L);
        Animator duration10 = bt0.m103741n(this.f25022m, property, 0.0f, 1.0f).setDuration(150L);
        Animator duration11 = bt0.m103741n(this.f25017h, property, 0.0f, 1.0f).setDuration(150L);
        final Animator duration12 = bt0.m103741n(this.f25023n, property, 1.0f, 0.0f).setDuration(100L);
        Objects.requireNonNull(duration12);
        bt0.m103749v(duration11, new Runnable() { // from class: l.ii6
            @Override // java.lang.Runnable
            public final void run() {
                duration12.start();
            }
        });
        this.f25027r = bt0.m103753z(duration7, duration8, duration9, duration10, duration11);
    }

    /* JADX INFO: renamed from: f */
    public final void m41237f() {
        Conversation conversation = this.f25025p;
        if (conversation == null || TextUtils.isEmpty(conversation.f56011id)) {
            return;
        }
        getContext().startActivity(MessagesAct.m48944k2(getContext(), this.f25025p.f56011id, false, false, 28));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41238g(e30 e30Var, String str, e30 e30Var2, Pair pair) {
        boolean z;
        String strConcat;
        User user = (User) pair.first;
        this.f25024o = user;
        this.f25025p = (Conversation) pair.second;
        if (!user.isBanedOrInactivated()) {
            Conversation conversation = this.f25025p;
            if (!conversation.localEverHasMessage && TEnum.equals(conversation.status, "default")) {
                qib0.f154691G.m102335N0(this.f25011b, sw6.m186126a(this.f25024o).maxWidth(480).formatted(), false);
                if (mqi0.m155944o() - this.f25025p.createdTime >= ((long) (NullChecker.m81303a(upa.m194627E0()) ? upa.m194627E0().new_tag_show_max_time : 30)) * 86400000) {
                    z = false;
                } else {
                    if (this.f25025p.labelExposureTime() >= 1.0d) {
                        if (mqi0.m155944o() - this.f25025p.labelExposureTime() >= ((long) (NullChecker.m81303a(upa.m194627E0()) ? upa.m194627E0().new_tag_exposure_after_max_minutes : 3)) * Constants.ONE_MIN_IN_MILLIS) {
                            z = false;
                        }
                    }
                    z = true;
                }
                boolean z2 = !this.f25025p.read.booleanValue() && (z || CoreModule.f17545c.f19642f0.f19957m2.contains(str));
                CommonLabelView commonLabelView = this.f25012c;
                if (z2) {
                    xdl0.m208344M(commonLabelView, true);
                    xdl0.m208327D0(t100.m186890d(39.0f), this.f25012c);
                    xdl0.m208325C0(this.f25012c, t100.f167266o);
                    CoreModule.f17545c.f19642f0.f19957m2.add(str);
                } else {
                    xdl0.m208344M(commonLabelView, false);
                }
                if (z2 && NullChecker.m81303a(e30Var2) && this.f25025p.labelExposureTime() < 1.0d) {
                    e30Var2.call(this.f25025p);
                }
                if (this.f25024o.isIdAndPicBothVerified()) {
                    xdl0.m208344M(this.f25013d, true);
                    boolean zM194847z = upa.m194847z();
                    CommonLabelView commonLabelView2 = this.f25013d;
                    if (zM194847z) {
                        commonLabelView2.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                    } else {
                        commonLabelView2.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.OLD_VERIFIED_ICON));
                    }
                } else {
                    boolean zIsPicVerificationVerified = this.f25024o.isPicVerificationVerified();
                    CommonLabelView commonLabelView3 = this.f25013d;
                    if (zIsPicVerificationVerified) {
                        xdl0.m208344M(commonLabelView3, true);
                        boolean zM194847z2 = upa.m194847z();
                        CommonLabelView commonLabelView4 = this.f25013d;
                        if (zM194847z2) {
                            commonLabelView4.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                        } else {
                            commonLabelView4.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.OLD_AVATAR_ICON));
                        }
                    } else {
                        xdl0.m208344M(commonLabelView3, false);
                    }
                }
                String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(this.f25024o.f56011id);
                boolean zIsEmpty = TextUtils.isEmpty(strM169561y7);
                VText vText = this.f25018i;
                if (zIsEmpty) {
                    vText.setText(this.f25024o.name);
                } else {
                    vText.setText(strM169561y7);
                }
                this.f25019j.setText(String.valueOf(this.f25024o.age));
                xdl0.m208344M(this.f25019j, !this.f25024o.isHideAgeFromSVip());
                boolean zIsHideLocationFromSVip = this.f25024o.isHideLocationFromSVip();
                boolean zIsHideActiveFromSVip = this.f25024o.isHideActiveFromSVip();
                if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
                    xdl0.m208344M(this.f25020k, false);
                } else {
                    xdl0.m208344M(this.f25020k, true);
                    if (zIsHideActiveFromSVip || !CoreModule.f17545c.f19588N0.m31967k3(this.f25024o, 5)) {
                        this.f25020k.setCompoundDrawables(null, null, null, null);
                        strConcat = "";
                    } else {
                        Drawable drawable = getContext().getDrawable(x2c0.f190749yi);
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                        this.f25020k.setCompoundDrawables(drawable, null, null, null);
                        strConcat = "在线";
                    }
                    if (!zIsHideLocationFromSVip) {
                        if (!TextUtils.isEmpty(strConcat)) {
                            strConcat = strConcat.concat(" · ");
                        }
                        strConcat = strConcat + i0g0.m133876p(this.f25024o.location.distance, true);
                    }
                    boolean zIsEmpty2 = TextUtils.isEmpty(strConcat);
                    VText vText2 = this.f25020k;
                    if (zIsEmpty2) {
                        xdl0.m208344M(vText2, false);
                    } else {
                        vText2.setText(strConcat);
                    }
                }
                xdl0.m208344M(this.f25016g, false);
                this.f25015f.setBackgroundResource(x2c0.f189950Zf);
                xdl0.m208325C0(this.f25015f, (getRootHeight() * t100.m186890d(108.0f)) / t100.m186890d(234.0f));
                if (this.f25024o.superLikedMe()) {
                    if (upa.m194847z()) {
                        xdl0.m208344M(this.f25016g, true);
                        return;
                    } else {
                        this.f25015f.setBackgroundResource(x2c0.f189796Ug);
                        xdl0.m208325C0(this.f25015f, (getRootHeight() * t100.m186890d(57.0f)) / t100.m186890d(234.0f));
                        return;
                    }
                }
                return;
            }
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f25024o.f56011id);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41239h(int i, View view) {
        m41237f();
        hj0.m131315b(this.f25025p, this.f25024o, i, "p_new_match", "card");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41240i(int i, View view) {
        m41237f();
        hj0.m131315b(this.f25025p, this.f25024o, i, "p_new_match", "chat_icon");
    }

    /* JADX INFO: renamed from: j */
    public void m41241j(Frag frag, dac0<Conversation> dac0Var, final String str, final e30<String> e30Var, final e30<Conversation> e30Var2, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dac0Var.mo67374c(frag, mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(str), CoreModule.f17545c.f19642f0.m32737Ne(str), new x9j() { // from class: l.ji6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((User) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ki6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123267a.m41238g(e30Var, str, e30Var2, (Pair) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.li6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128169a.m41239h(i, view);
            }
        });
        xdl0.m208329E0(this.f25021l, new View.OnClickListener() { // from class: l.mi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133943a.m41240i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m41242k() {
        if (this.f25026q.isRunning()) {
            m41244m();
        } else {
            this.f25027r.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m41243l() {
        this.f25023n.setText(upa.m194622D0().get((int) (Math.random() * ((double) upa.m194622D0().size()))));
        this.f25026q.start();
    }

    /* JADX INFO: renamed from: m */
    public void m41244m() {
        this.f25026q.cancel();
        this.f25017h.setAlpha(1.0f);
        this.f25022m.setAlpha(1.0f);
        this.f25023n.setAlpha(0.0f);
        this.f25021l.setRoundedCornerRadius(t100.m186890d(39.0f));
        this.f25021l.setAlpha(1.0f);
        xdl0.m208327D0(t100.m186890d(36.0f), this.f25021l);
    }

    /* JADX INFO: renamed from: n */
    public User m41245n() {
        return this.f25024o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41235d(this);
        boolean zM194847z = upa.m194847z();
        View view = this.f25022m;
        if (zM194847z) {
            view.setBackgroundResource(x2c0.f190683wg);
            xdl0.m208358V(this.f25017h, t100.f167259h);
            xdl0.m208357U(this.f25016g, (getRootHeight() * t100.m186890d(55.0f)) / t100.m186890d(234.0f));
        } else {
            view.setBackgroundResource(x2c0.f189982ag);
        }
        m41236e();
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
