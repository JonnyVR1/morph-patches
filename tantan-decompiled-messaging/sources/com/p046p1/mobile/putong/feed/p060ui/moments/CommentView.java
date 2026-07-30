package com.p046p1.mobile.putong.feed.p060ui.moments;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame_Anim;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p149l.d30;
import p149l.dml;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.i0e;
import p149l.ijb0;
import p149l.kjb0;
import p149l.mkd0;
import p149l.qh5;
import p149l.qib0;
import p149l.roj0;
import p149l.vwb;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes12.dex */
public class CommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f43633a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43634b;

    /* JADX INFO: renamed from: c */
    public VImage f43635c;

    /* JADX INFO: renamed from: d */
    public VText f43636d;

    /* JADX INFO: renamed from: e */
    public VFrame_Anim f43637e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f43638f;

    /* JADX INFO: renamed from: g */
    public ImageView f43639g;

    /* JADX INFO: renamed from: h */
    public View f43640h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43641i;

    /* JADX INFO: renamed from: j */
    public VText f43642j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f43643k;

    /* JADX INFO: renamed from: l */
    public View f43644l;

    /* JADX INFO: renamed from: m */
    public View f43645m;

    /* JADX INFO: renamed from: n */
    public MomentMessage f43646n;

    /* JADX INFO: renamed from: o */
    public User f43647o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.CommentView$a */
    public static class C11403a {

        /* JADX INFO: renamed from: a */
        public boolean f43648a;

        /* JADX INFO: renamed from: b */
        public boolean f43649b;

        /* JADX INFO: renamed from: c */
        public boolean f43650c;

        /* JADX INFO: renamed from: d */
        public d30 f43651d;
    }

    public CommentView(Context context) {
        super(context);
        this.f43646n = null;
        this.f43647o = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m66618k(View view) {
        qh5.m174509a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public Act m66619l() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m66620m(MomentMessage momentMessage) {
        MomentMessage momentMessage2 = this.f43646n;
        return momentMessage2 != null && momentMessage != null && momentMessage2.equals(momentMessage) && TEnum.equals(this.f43646n.status(), momentMessage.status());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m66622o(MomentMessage momentMessage, View view) {
        m66619l().startActivity(kjb0.m146193d(m66619l(), momentMessage.cid, true, false, 4));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66618k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m66623p(MomentMessage momentMessage, View view) {
        i0e.m133793b(m66619l(), momentMessage.value);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66624q(MomentMessage momentMessage, View view) {
        kjb0.m146210u(m66619l(), momentMessage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m66625r(roj0 roj0Var) {
        m66619l().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m66626s(Throwable th) {
        yij0.m214926D(th);
        m66619l().progressDismiss();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m66627t(MomentMessage momentMessage, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.m114766q(momentMessage.value);
        } else {
            m66619l().progress(R$string.f38984U2, true);
            FeedModule.f38854c.m60708X2(str, str2, momentMessage).subscribe(mkd0.m154956H(new e30() { // from class: l.oh5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143948a.m66625r((roj0) obj);
                }
            }, new e30() { // from class: l.ph5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f148869a.m66626s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m66628u(final MomentMessage momentMessage, final String str, final String str2, View view) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(m66619l().getString(R$string.f39045e), m66619l().getString(R$string.f38949O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM200324f0.remove(1);
        }
        m66619l().dialog().m20535e0(arrayListM200324f0).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.nh5
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f138947a.m66627t(momentMessage, str, str2, dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m66629v(MomentMessage momentMessage, View view) {
        m66619l().startActivityForResult(MomentsInProfileAct.m66912V1(m66619l(), momentMessage.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: w */
    public void m66630w(dml dmlVar, MomentMessage momentMessage, String str, String str2, boolean z, boolean z2) {
        m66631x(dmlVar, momentMessage, str, str2, z, z2, false, null);
    }

    /* JADX INFO: renamed from: x */
    public void m66631x(dml dmlVar, final MomentMessage momentMessage, final String str, final String str2, boolean z, boolean z2, boolean z3, @Nullable final C11403a c11403a) {
        if (NullChecker.m81303a(c11403a)) {
            boolean z4 = c11403a.f43648a;
            FrameLayout frameLayout = this.f43633a;
            if (z4) {
                xdl0.m208344M(frameLayout, false);
                xdl0.m208344M(this.f43640h, false);
                xdl0.m208344M(this.f43643k, false);
            } else {
                xdl0.m208344M(frameLayout, true);
                xdl0.m208344M(this.f43640h, !c11403a.f43649b);
                xdl0.m208344M(this.f43643k, z3 && c11403a.f43649b);
            }
            xdl0.m208344M(this.f43641i, c11403a.f43649b);
            this.f43642j.setText(c11403a.f43650c ? "收起精选评论" : "查看更多精选评论");
            this.f43641i.setOnClickListener(new View.OnClickListener() { // from class: l.gh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c11403a.f43651d.call();
                }
            });
        } else {
            xdl0.m208344M(this.f43633a, true);
            xdl0.m208344M(this.f43640h, !z);
            xdl0.m208344M(this.f43643k, z3 && z);
            xdl0.m208344M(this.f43641i, false);
            this.f43641i.setOnClickListener(null);
        }
        m66621n(null, momentMessage);
        dmlVar.mo67374c(m66619l(), ijb0.m136559W(momentMessage.owner)).subscribe(mkd0.m154955G(new e30() { // from class: l.hh5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107680a.m66621n(momentMessage, (User) obj);
            }
        }));
        if (m66620m(momentMessage)) {
            return;
        }
        this.f43646n = momentMessage;
        String string = momentMessage.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f43637e.setVisibility(0);
                this.f43637e.m223026G(this.f43639g);
                break;
            case "normal":
                this.f43637e.setVisibility(8);
                break;
            case "sending":
                this.f43637e.setVisibility(0);
                this.f43637e.m223026G(this.f43638f);
                break;
        }
        if (momentMessage.isOtherUser()) {
            FrameLayout frameLayout2 = this.f43633a;
            if (z2) {
                frameLayout2.setOnClickListener(null);
            } else {
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.ih5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f113204a.m66622o(momentMessage, view);
                    }
                });
            }
            this.f43633a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jh5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f117916a.m66623p(momentMessage, view);
                }
            });
        } else {
            boolean zEquals = TEnum.equals(momentMessage.status(), "failed");
            FrameLayout frameLayout3 = this.f43633a;
            if (zEquals) {
                frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: l.kh5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123117a.m66624q(momentMessage, view);
                    }
                });
            } else {
                frameLayout3.setOnClickListener(null);
            }
            this.f43633a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lh5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f128036a.m66628u(momentMessage, str, str2, view);
                }
            });
        }
        VDraweeView vDraweeView = this.f43634b;
        if (z2) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.mh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133780a.m66629v(momentMessage, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m66621n(User user, MomentMessage momentMessage) {
        if (user == null) {
            this.f43647o = null;
            qib0.f154691G.m102354Y0(this.f43634b, f3c0.f94538i1);
            this.f43636d.setText(momentMessage.value);
            xdl0.m208344M(this.f43635c, false);
            return;
        }
        if (user.equals(this.f43647o) && m66620m(momentMessage)) {
            return;
        }
        this.f43647o = user;
        String str = user.name;
        String gPMemo = FeedModule.m60222H().getGPMemo(user.f56011id);
        if (!TextUtils.isEmpty(gPMemo)) {
            str = gPMemo;
        }
        SpannableString spannableString = new SpannableString(str + "  " + momentMessage.value);
        spannableString.setSpan(new ForegroundColorSpan((FeedModule.m60222H().mo30742a().mo165304d() && user.isVIP() && !user.gpHideVip()) ? m66619l().color(e1c0.f88793k0) : m66619l().color(e1c0.f88795l0)), 0, str.length(), 33);
        this.f43636d.setText(spannableString);
        qib0.f154691G.m102341Q0(this.f43634b, user.m60124fp().profileSmall());
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66619l(), user, this.f43635c);
    }

    public CommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43646n = null;
        this.f43647o = null;
    }

    public CommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43646n = null;
        this.f43647o = null;
    }
}
