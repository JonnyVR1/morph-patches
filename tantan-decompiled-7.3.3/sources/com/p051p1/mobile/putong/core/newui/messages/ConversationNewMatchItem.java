package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.android.p053ui.label.LabelModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.label.CoreLabelTag;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dj0;
import p153l.gra;
import p153l.gt0;
import p153l.ht0;
import p153l.jic0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qj6;
import p153l.rcj;
import p153l.t8r;
import p153l.uqb0;
import p153l.vx6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationNewMatchItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConversationNewMatchItem f25752a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25753b;

    /* JADX INFO: renamed from: c */
    public CommonLabelView f25754c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f25755d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25756e;

    /* JADX INFO: renamed from: f */
    public View f25757f;

    /* JADX INFO: renamed from: g */
    public VImage f25758g;

    /* JADX INFO: renamed from: h */
    public VLinear f25759h;

    /* JADX INFO: renamed from: i */
    public VText f25760i;

    /* JADX INFO: renamed from: j */
    public VText f25761j;

    /* JADX INFO: renamed from: k */
    public VText f25762k;

    /* JADX INFO: renamed from: l */
    public RoundedCornerView f25763l;

    /* JADX INFO: renamed from: m */
    public View f25764m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f25765n;

    /* JADX INFO: renamed from: o */
    public User f25766o;

    /* JADX INFO: renamed from: p */
    public Conversation f25767p;

    /* JADX INFO: renamed from: q */
    public Animator f25768q;

    /* JADX INFO: renamed from: r */
    public Animator f25769r;

    public ConversationNewMatchItem(@NonNull Context context) {
        super(context);
    }

    private int getRootHeight() {
        return (int) (((double) ((qa00.m175858c().widthPixels - qa00.f156330q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m42246d(View view) {
        qj6.m176827a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m42247e() {
        Animator duration = gt0.m132171q(this.f25763l, "roundedCornerRadius", qa00.m175859d(39.0f), qa00.m175859d(10.0f)).setDuration(600L);
        Property property = View.ALPHA;
        Animator duration2 = gt0.m132168n(this.f25763l, property, 1.0f, 0.92f).setDuration(650L);
        RoundedCornerView roundedCornerView = this.f25763l;
        Property<View, Integer> property2 = ht0.f111498n;
        Animator duration3 = gt0.m132169o(roundedCornerView, property2, qa00.m175859d(36.0f), (bnl0.m105592y0() / 2) - qa00.m175859d(31.0f)).setDuration(650L);
        Animator duration4 = gt0.m132168n(this.f25764m, property, 1.0f, 0.0f).setDuration(300L);
        Animator duration5 = gt0.m132168n(this.f25759h, property, 1.0f, 0.0f).setDuration(300L);
        final Animator duration6 = gt0.m132168n(this.f25765n, property, 0.0f, 1.0f).setDuration(200L);
        Objects.requireNonNull(duration6);
        gt0.m132160f(duration5, new Runnable() { // from class: l.lj6
            @Override // java.lang.Runnable
            public final void run() {
                duration6.start();
            }
        });
        this.f25768q = gt0.m132180z(duration, duration2, duration3, duration4, duration5);
        Animator duration7 = gt0.m132171q(this.f25763l, "roundedCornerRadius", qa00.m175859d(10.0f), qa00.m175859d(39.0f)).setDuration(300L);
        Animator duration8 = gt0.m132168n(this.f25763l, property, 0.92f, 1.0f).setDuration(325L);
        Animator duration9 = gt0.m132169o(this.f25763l, property2, (bnl0.m105592y0() / 2) - qa00.m175859d(31.0f), qa00.m175859d(36.0f)).setDuration(325L);
        Animator duration10 = gt0.m132168n(this.f25764m, property, 0.0f, 1.0f).setDuration(150L);
        Animator duration11 = gt0.m132168n(this.f25759h, property, 0.0f, 1.0f).setDuration(150L);
        final Animator duration12 = gt0.m132168n(this.f25765n, property, 1.0f, 0.0f).setDuration(100L);
        Objects.requireNonNull(duration12);
        gt0.m132176v(duration11, new Runnable() { // from class: l.lj6
            @Override // java.lang.Runnable
            public final void run() {
                duration12.start();
            }
        });
        this.f25769r = gt0.m132180z(duration7, duration8, duration9, duration10, duration11);
    }

    /* JADX INFO: renamed from: f */
    public final void m42248f() {
        Conversation conversation = this.f25767p;
        if (conversation == null || TextUtils.isEmpty(conversation.f56859id)) {
            return;
        }
        getContext().startActivity(MessagesAct.m50127l2(getContext(), this.f25767p.f56859id, false, false, 28));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m42249g(y20 y20Var, String str, y20 y20Var2, Pair pair) {
        boolean z;
        String strConcat;
        User user = (User) pair.first;
        this.f25766o = user;
        this.f25767p = (Conversation) pair.second;
        if (!user.isBanedOrInactivated()) {
            Conversation conversation = this.f25767p;
            if (!conversation.localEverHasMessage && TEnum.equals(conversation.status, "default")) {
                uqb0.f180374G.m127119N0(this.f25753b, vx6.m203837a(this.f25766o).maxWidth(480).formatted(), false);
                if (pzi0.m174454o() - this.f25767p.createdTime >= ((long) (NullChecker.m82486a(gra.m131558E0()) ? gra.m131558E0().new_tag_show_max_time : 30)) * 86400000) {
                    z = false;
                } else {
                    if (this.f25767p.labelExposureTime() >= 1.0d) {
                        if (pzi0.m174454o() - this.f25767p.labelExposureTime() >= ((long) (NullChecker.m82486a(gra.m131558E0()) ? gra.m131558E0().new_tag_exposure_after_max_minutes : 3)) * Constants.ONE_MIN_IN_MILLIS) {
                            z = false;
                        }
                    }
                    z = true;
                }
                boolean z2 = !this.f25767p.read.booleanValue() && (z || CoreModule.f18264c.f20384f0.f20699m2.contains(str));
                CommonLabelView commonLabelView = this.f25754c;
                if (z2) {
                    bnl0.m105524M(commonLabelView, true);
                    bnl0.m105507D0(qa00.m175859d(39.0f), this.f25754c);
                    bnl0.m105505C0(this.f25754c, qa00.f156328o);
                    CoreModule.f18264c.f20384f0.f20699m2.add(str);
                } else {
                    bnl0.m105524M(commonLabelView, false);
                }
                if (z2 && NullChecker.m82486a(y20Var2) && this.f25767p.labelExposureTime() < 1.0d) {
                    y20Var2.call(this.f25767p);
                }
                if (this.f25766o.isIdAndPicBothVerified()) {
                    bnl0.m105524M(this.f25755d, true);
                    boolean zM131778z = gra.m131778z();
                    CommonLabelView commonLabelView2 = this.f25755d;
                    if (zM131778z) {
                        commonLabelView2.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                    } else {
                        commonLabelView2.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.OLD_VERIFIED_ICON));
                    }
                } else {
                    boolean zIsPicVerificationVerified = this.f25766o.isPicVerificationVerified();
                    CommonLabelView commonLabelView3 = this.f25755d;
                    if (zIsPicVerificationVerified) {
                        bnl0.m105524M(commonLabelView3, true);
                        boolean zM131778z2 = gra.m131778z();
                        CommonLabelView commonLabelView4 = this.f25755d;
                        if (zM131778z2) {
                            commonLabelView4.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                        } else {
                            commonLabelView4.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.OLD_AVATAR_ICON));
                        }
                    } else {
                        bnl0.m105524M(commonLabelView3, false);
                    }
                }
                String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(this.f25766o.f56859id);
                boolean zIsEmpty = TextUtils.isEmpty(strM116634y7);
                VText vText = this.f25760i;
                if (zIsEmpty) {
                    vText.setText(this.f25766o.name);
                } else {
                    vText.setText(strM116634y7);
                }
                this.f25761j.setText(String.valueOf(this.f25766o.age));
                bnl0.m105524M(this.f25761j, !this.f25766o.isHideAgeFromSVip());
                boolean zIsHideLocationFromSVip = this.f25766o.isHideLocationFromSVip();
                boolean zIsHideActiveFromSVip = this.f25766o.isHideActiveFromSVip();
                if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
                    bnl0.m105524M(this.f25762k, false);
                } else {
                    bnl0.m105524M(this.f25762k, true);
                    if (zIsHideActiveFromSVip || !CoreModule.f18264c.f20330N0.m32970k3(this.f25766o, 5)) {
                        this.f25762k.setCompoundDrawables(null, null, null, null);
                        strConcat = "";
                    } else {
                        Drawable drawable = getContext().getDrawable(dbc0.f87221mj);
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                        this.f25762k.setCompoundDrawables(drawable, null, null, null);
                        strConcat = "在线";
                    }
                    if (!zIsHideLocationFromSVip) {
                        if (!TextUtils.isEmpty(strConcat)) {
                            strConcat = strConcat.concat(" · ");
                        }
                        strConcat = strConcat + q8g0.m175811p(this.f25766o.location.distance, true);
                    }
                    boolean zIsEmpty2 = TextUtils.isEmpty(strConcat);
                    VText vText2 = this.f25762k;
                    if (zIsEmpty2) {
                        bnl0.m105524M(vText2, false);
                    } else {
                        vText2.setText(strConcat);
                    }
                }
                bnl0.m105524M(this.f25758g, false);
                this.f25757f.setBackgroundResource(dbc0.f86409Ng);
                bnl0.m105505C0(this.f25757f, (getRootHeight() * qa00.m175859d(108.0f)) / qa00.m175859d(234.0f));
                if (this.f25766o.superLikedMe()) {
                    if (gra.m131778z()) {
                        bnl0.m105524M(this.f25758g, true);
                        return;
                    } else {
                        this.f25757f.setBackgroundResource(dbc0.f86250Ih);
                        bnl0.m105505C0(this.f25757f, (getRootHeight() * qa00.m175859d(57.0f)) / qa00.m175859d(234.0f));
                        return;
                    }
                }
                return;
            }
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f25766o.f56859id);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m42250h(int i, View view) {
        m42248f();
        dj0.m116008b(this.f25767p, this.f25766o, i, "p_new_match", "card");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m42251i(int i, View view) {
        m42248f();
        dj0.m116008b(this.f25767p, this.f25766o, i, "p_new_match", "chat_icon");
    }

    /* JADX INFO: renamed from: j */
    public void m42252j(Frag frag, jic0<Conversation> jic0Var, final String str, final y20<String> y20Var, final y20<Conversation> y20Var2, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jic0Var.mo68557c(frag, psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(str), CoreModule.f18264c.f20384f0.m33740Ne(str), new rcj() { // from class: l.mj6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((User) obj, (Conversation) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.nj6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142273a.m42249g(y20Var, str, y20Var2, (Pair) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.oj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147636a.m42250h(i, view);
            }
        });
        bnl0.m105509E0(this.f25763l, new View.OnClickListener() { // from class: l.pj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152669a.m42251i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m42253k() {
        if (this.f25768q.isRunning()) {
            m42255m();
        } else {
            this.f25769r.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m42254l() {
        this.f25765n.setText(gra.m131553D0().get((int) (Math.random() * ((double) gra.m131553D0().size()))));
        this.f25768q.start();
    }

    /* JADX INFO: renamed from: m */
    public void m42255m() {
        this.f25768q.cancel();
        this.f25759h.setAlpha(1.0f);
        this.f25764m.setAlpha(1.0f);
        this.f25765n.setAlpha(0.0f);
        this.f25763l.setRoundedCornerRadius(qa00.m175859d(39.0f));
        this.f25763l.setAlpha(1.0f);
        bnl0.m105507D0(qa00.m175859d(36.0f), this.f25763l);
    }

    /* JADX INFO: renamed from: n */
    public User m42256n() {
        return this.f25766o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42246d(this);
        boolean zM131778z = gra.m131778z();
        View view = this.f25764m;
        if (zM131778z) {
            view.setBackgroundResource(dbc0.f87153kh);
            bnl0.m105538V(this.f25759h, qa00.f156321h);
            bnl0.m105537U(this.f25758g, (getRootHeight() * qa00.m175859d(55.0f)) / qa00.m175859d(234.0f));
        } else {
            view.setBackgroundResource(dbc0.f86441Og);
        }
        m42247e();
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
