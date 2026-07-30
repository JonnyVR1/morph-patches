package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.dml;
import l.e30;
import l.e51;
import l.i0e;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.yij0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ijb0;
import p007l.kjb0;
import p007l.qh5;
import v.VDraweeView;
import v.VFrame_Anim;
import v.VImage;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5094a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5095b;

    /* JADX INFO: renamed from: c */
    public VImage f5096c;

    /* JADX INFO: renamed from: d */
    public VText f5097d;

    /* JADX INFO: renamed from: e */
    public VFrame_Anim f5098e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f5099f;

    /* JADX INFO: renamed from: g */
    public ImageView f5100g;

    /* JADX INFO: renamed from: h */
    public View f5101h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5102i;

    /* JADX INFO: renamed from: j */
    public VText f5103j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f5104k;

    /* JADX INFO: renamed from: l */
    public View f5105l;

    /* JADX INFO: renamed from: m */
    public View f5106m;

    /* JADX INFO: renamed from: n */
    public MomentMessage f5107n;

    /* JADX INFO: renamed from: o */
    public User f5108o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.CommentView$a */
    public static class C2247a {

        /* JADX INFO: renamed from: a */
        public boolean f5109a;

        /* JADX INFO: renamed from: b */
        public boolean f5110b;

        /* JADX INFO: renamed from: c */
        public boolean f5111c;

        /* JADX INFO: renamed from: d */
        public d30 f5112d;
    }

    public CommentView(Context context) {
        super(context);
        this.f5107n = null;
        this.f5108o = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m7809k(View view) {
        qh5.m13557a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public Act m7810l() {
        return getContext();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7811m(MomentMessage momentMessage) {
        MomentMessage momentMessage2 = this.f5107n;
        return momentMessage2 != null && momentMessage != null && momentMessage2.equals(momentMessage) && TEnum.equals(this.f5107n.status(), momentMessage.status());
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7813o(MomentMessage momentMessage, View view) {
        m7810l().startActivity(kjb0.m11452d(m7810l(), momentMessage.cid, true, false, 4));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7809k(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m7814p(MomentMessage momentMessage, View view) {
        i0e.b(m7810l(), momentMessage.value);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7815q(MomentMessage momentMessage, View view) {
        kjb0.m11469u(m7810l(), momentMessage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7816r(roj0 roj0Var) {
        m7810l().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7817s(Throwable th) {
        yij0.D(th);
        m7810l().progressDismiss();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7818t(MomentMessage momentMessage, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.q(momentMessage.value);
        } else {
            m7810l().progress(R$string.f445U2, true);
            FeedModule.f315c.m1634X2(str, str2, momentMessage).subscribe(mkd0.H(new e30() { // from class: l.oh5
                public final void call(Object obj) {
                    this.f11480a.m7816r((roj0) obj);
                }
            }, new e30() { // from class: l.ph5
                public final void call(Object obj) {
                    this.f11840a.m7817s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m7819u(final MomentMessage momentMessage, final String str, final String str2, View view) {
        ArrayList arrayListF0 = vwb.f0(new String[]{m7810l().getString(R$string.f506e), m7810l().getString(R$string.f410O3)});
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListF0.remove(1);
        }
        m7810l().dialog().e0(arrayListF0).g0(new Dialog.g() { // from class: l.nh5
            /* JADX INFO: renamed from: a */
            public final void m12197a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f10802a.m7818t(momentMessage, str, str2, dialog, view2, i, charSequence);
            }
        }).z0();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7820v(MomentMessage momentMessage, View view) {
        m7810l().startActivityForResult(MomentsInProfileAct.m8110V1(m7810l(), momentMessage.owner, "from_MomentsFeedAct"), 22);
    }

    /* JADX INFO: renamed from: w */
    public void m7821w(dml dmlVar, MomentMessage momentMessage, String str, String str2, boolean z, boolean z2) {
        m7822x(dmlVar, momentMessage, str, str2, z, z2, false, null);
    }

    /* JADX INFO: renamed from: x */
    public void m7822x(dml dmlVar, final MomentMessage momentMessage, final String str, final String str2, boolean z, boolean z2, boolean z3, @Nullable final C2247a c2247a) {
        if (NullChecker.a(c2247a)) {
            boolean z4 = c2247a.f5109a;
            FrameLayout frameLayout = this.f5094a;
            if (z4) {
                xdl0.M(frameLayout, false);
                xdl0.M(this.f5101h, false);
                xdl0.M(this.f5104k, false);
            } else {
                xdl0.M(frameLayout, true);
                xdl0.M(this.f5101h, !c2247a.f5110b);
                xdl0.M(this.f5104k, z3 && c2247a.f5110b);
            }
            xdl0.M(this.f5102i, c2247a.f5110b);
            this.f5103j.setText(c2247a.f5111c ? "收起精选评论" : "查看更多精选评论");
            this.f5102i.setOnClickListener(new View.OnClickListener() { // from class: l.gh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c2247a.f5112d.call();
                }
            });
        } else {
            xdl0.M(this.f5094a, true);
            xdl0.M(this.f5101h, !z);
            xdl0.M(this.f5104k, z3 && z);
            xdl0.M(this.f5102i, false);
            this.f5102i.setOnClickListener(null);
        }
        m7812n(null, momentMessage);
        dmlVar.c(m7810l(), ijb0.m10912W(momentMessage.owner)).subscribe(mkd0.G(new e30() { // from class: l.hh5
            public final void call(Object obj) {
                this.f8717a.m7812n(momentMessage, (User) obj);
            }
        }));
        if (m7811m(momentMessage)) {
            return;
        }
        this.f5107n = momentMessage;
        String string = momentMessage.status().toString();
        string.getClass();
        switch (string) {
            case "failed":
                this.f5098e.setVisibility(0);
                this.f5098e.G(this.f5100g);
                break;
            case "normal":
                this.f5098e.setVisibility(8);
                break;
            case "sending":
                this.f5098e.setVisibility(0);
                this.f5098e.G(this.f5099f);
                break;
        }
        if (momentMessage.isOtherUser()) {
            FrameLayout frameLayout2 = this.f5094a;
            if (z2) {
                frameLayout2.setOnClickListener(null);
            } else {
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.ih5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9015a.m7813o(momentMessage, view);
                    }
                });
            }
            this.f5094a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jh5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f9360a.m7814p(momentMessage, view);
                }
            });
        } else {
            boolean zEquals = TEnum.equals(momentMessage.status(), "failed");
            FrameLayout frameLayout3 = this.f5094a;
            if (zEquals) {
                frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: l.kh5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9716a.m7815q(momentMessage, view);
                    }
                });
            } else {
                frameLayout3.setOnClickListener(null);
            }
            this.f5094a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lh5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f10030a.m7819u(momentMessage, str, str2, view);
                }
            });
        }
        VDraweeView vDraweeView = this.f5095b;
        if (z2) {
            vDraweeView.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.mh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10464a.m7820v(momentMessage, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m7812n(User user, MomentMessage momentMessage) {
        if (user == null) {
            this.f5108o = null;
            qib0.G.Y0(this.f5095b, f3c0.f7821i1);
            this.f5097d.setText(momentMessage.value);
            xdl0.M(this.f5096c, false);
            return;
        }
        if (user.equals(this.f5108o) && m7811m(momentMessage)) {
            return;
        }
        this.f5108o = user;
        String str = user.name;
        String gPMemo = FeedModule.m1140H().getGPMemo(((DbObject) user).id);
        if (!TextUtils.isEmpty(gPMemo)) {
            str = gPMemo;
        }
        SpannableString spannableString = new SpannableString(str + "  " + momentMessage.value);
        spannableString.setSpan(new ForegroundColorSpan((FeedModule.m1140H().a().d() && user.isVIP() && !user.gpHideVip()) ? m7810l().color(e1c0.f7149k0) : m7810l().color(e1c0.f7151l0)), 0, str.length(), 33);
        this.f5097d.setText(spannableString);
        qib0.G.Q0(this.f5095b, user.m1042fp().profileSmall());
        qib0.b0.b.showUserVerificationLogo(m7810l(), user, this.f5096c);
    }

    public CommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5107n = null;
        this.f5108o = null;
    }

    public CommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5107n = null;
        this.f5108o = null;
    }
}
