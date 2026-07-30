package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame_Anim;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.lbc0;
import p153l.mrb0;
import p153l.orb0;
import p153l.pol;
import p153l.psd0;
import p153l.qi5;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class CommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f44481a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44482b;

    /* JADX INFO: renamed from: c */
    public VImage f44483c;

    /* JADX INFO: renamed from: d */
    public VText f44484d;

    /* JADX INFO: renamed from: e */
    public VFrame_Anim f44485e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f44486f;

    /* JADX INFO: renamed from: g */
    public ImageView f44487g;

    /* JADX INFO: renamed from: h */
    public View f44488h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44489i;

    /* JADX INFO: renamed from: j */
    public VText f44490j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f44491k;

    /* JADX INFO: renamed from: l */
    public View f44492l;

    /* JADX INFO: renamed from: m */
    public View f44493m;

    /* JADX INFO: renamed from: n */
    public MomentMessage f44494n;

    /* JADX INFO: renamed from: o */
    public User f44495o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.CommentView$a */
    public static class C11566a {

        /* JADX INFO: renamed from: a */
        public boolean f44496a;

        /* JADX INFO: renamed from: b */
        public boolean f44497b;

        /* JADX INFO: renamed from: c */
        public boolean f44498c;

        /* JADX INFO: renamed from: d */
        public x20 f44499d;
    }

    public CommentView(Context context) {
        super(context);
        this.f44494n = null;
        this.f44495o = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m67801k(View view) {
        qi5.m176661a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public Act m67802l() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m67803m(MomentMessage momentMessage) {
        MomentMessage momentMessage2 = this.f44494n;
        return momentMessage2 != null && momentMessage != null && momentMessage2.equals(momentMessage) && TEnum.equals(this.f44494n.status(), momentMessage.status());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m67805o(MomentMessage momentMessage, View view) {
        m67802l().startActivity(orb0.m168887d(m67802l(), momentMessage.cid, true, false, 4));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67801k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m67806p(MomentMessage momentMessage, View view) {
        w1e.m204398b(m67802l(), momentMessage.value);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m67807q(MomentMessage momentMessage, View view) {
        orb0.m168904u(m67802l(), momentMessage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m67808r(uxj0 uxj0Var) {
        m67802l().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m67809s(Throwable th) {
        bsj0.m106246D(th);
        m67802l().progressDismiss();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m67810t(MomentMessage momentMessage, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            l51.m152911q(momentMessage.value);
        } else {
            m67802l().progress(R$string.f39832U2, true);
            FeedModule.f39702c.m61892X2(str, str2, momentMessage).subscribe(psd0.m173597H(new y20() { // from class: l.oi5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147511a.m67808r((uxj0) obj);
                }
            }, new y20() { // from class: l.pi5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152514a.m67809s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m67811u(final MomentMessage momentMessage, final String str, final String str2, View view) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(m67802l().getString(R$string.f39893e), m67802l().getString(R$string.f39797O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM147507f0.remove(1);
        }
        m67802l().dialog().m21534e0(arrayListM147507f0).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ni5
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f142091a.m67810t(momentMessage, str, str2, dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m67812v(MomentMessage momentMessage, View view) {
        m67802l().startActivityForResult(MomentsInProfileAct.m68095X1(m67802l(), momentMessage.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: w */
    public void m67813w(pol polVar, MomentMessage momentMessage, String str, String str2, boolean z, boolean z2) {
        m67814x(polVar, momentMessage, str, str2, z, z2, false, null);
    }

    /* JADX INFO: renamed from: x */
    public void m67814x(pol polVar, final MomentMessage momentMessage, final String str, final String str2, boolean z, boolean z2, boolean z3, @Nullable final C11566a c11566a) {
        if (NullChecker.m82486a(c11566a)) {
            boolean z4 = c11566a.f44496a;
            FrameLayout frameLayout = this.f44481a;
            if (z4) {
                bnl0.m105524M(frameLayout, false);
                bnl0.m105524M(this.f44488h, false);
                bnl0.m105524M(this.f44491k, false);
            } else {
                bnl0.m105524M(frameLayout, true);
                bnl0.m105524M(this.f44488h, !c11566a.f44497b);
                bnl0.m105524M(this.f44491k, z3 && c11566a.f44497b);
            }
            bnl0.m105524M(this.f44489i, c11566a.f44497b);
            this.f44490j.setText(c11566a.f44498c ? "收起精选评论" : "查看更多精选评论");
            this.f44489i.setOnClickListener(new View.OnClickListener() { // from class: l.gi5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c11566a.f44499d.call();
                }
            });
        } else {
            bnl0.m105524M(this.f44481a, true);
            bnl0.m105524M(this.f44488h, !z);
            bnl0.m105524M(this.f44491k, z3 && z);
            bnl0.m105524M(this.f44489i, false);
            this.f44489i.setOnClickListener(null);
        }
        m67804n(null, momentMessage);
        polVar.mo68557c(m67802l(), mrb0.m159645W(momentMessage.owner)).subscribe(psd0.m173596G(new y20() { // from class: l.hi5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109982a.m67804n(momentMessage, (User) obj);
            }
        }));
        if (m67803m(momentMessage)) {
            return;
        }
        this.f44494n = momentMessage;
        String string = momentMessage.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f44485e.setVisibility(0);
                this.f44485e.m224272G(this.f44487g);
                break;
            case "normal":
                this.f44485e.setVisibility(8);
                break;
            case "sending":
                this.f44485e.setVisibility(0);
                this.f44485e.m224272G(this.f44486f);
                break;
        }
        if (momentMessage.isOtherUser()) {
            FrameLayout frameLayout2 = this.f44481a;
            if (z2) {
                frameLayout2.setOnClickListener(null);
            } else {
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.ii5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f115051a.m67805o(momentMessage, view);
                    }
                });
            }
            this.f44481a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ji5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f121043a.m67806p(momentMessage, view);
                }
            });
        } else {
            boolean zEquals = TEnum.equals(momentMessage.status(), "failed");
            FrameLayout frameLayout3 = this.f44481a;
            if (zEquals) {
                frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: l.ki5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f126967a.m67807q(momentMessage, view);
                    }
                });
            } else {
                frameLayout3.setOnClickListener(null);
            }
            this.f44481a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.li5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f132178a.m67811u(momentMessage, str, str2, view);
                }
            });
        }
        VDraweeView vDraweeView = this.f44482b;
        if (z2) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.mi5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136928a.m67812v(momentMessage, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m67804n(User user, MomentMessage momentMessage) {
        if (user == null) {
            this.f44495o = null;
            uqb0.f180374G.m127138Y0(this.f44482b, lbc0.f131056i1);
            this.f44484d.setText(momentMessage.value);
            bnl0.m105524M(this.f44483c, false);
            return;
        }
        if (user.equals(this.f44495o) && m67803m(momentMessage)) {
            return;
        }
        this.f44495o = user;
        String str = user.name;
        String gPMemo = FeedModule.m61406H().getGPMemo(user.f56859id);
        if (!TextUtils.isEmpty(gPMemo)) {
            str = gPMemo;
        }
        SpannableString spannableString = new SpannableString(str + "  " + momentMessage.value);
        spannableString.setSpan(new ForegroundColorSpan((FeedModule.m61406H().mo31745a().mo192247d() && user.isVIP() && !user.gpHideVip()) ? m67802l().color(k9c0.f124516k0) : m67802l().color(k9c0.f124518l0)), 0, str.length(), 33);
        this.f44484d.setText(spannableString);
        uqb0.f180374G.m127125Q0(this.f44482b, user.m61308fp().profileSmall());
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67802l(), user, this.f44483c);
    }

    public CommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44494n = null;
        this.f44495o = null;
    }

    public CommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44494n = null;
        this.f44495o = null;
    }
}
