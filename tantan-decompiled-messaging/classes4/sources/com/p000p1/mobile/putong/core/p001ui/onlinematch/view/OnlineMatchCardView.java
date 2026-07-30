package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.C0034a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cj50;
import l.e30;
import l.f30;
import l.i0g0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.tpd0;
import l.x2c0;
import l.xdl0;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f505a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f506b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f507c;

    /* JADX INFO: renamed from: d */
    public VText f508d;

    /* JADX INFO: renamed from: e */
    public VText f509e;

    /* JADX INFO: renamed from: f */
    public VText f510f;

    /* JADX INFO: renamed from: g */
    public VText f511g;

    /* JADX INFO: renamed from: h */
    public VText f512h;

    /* JADX INFO: renamed from: i */
    public VFrame f513i;

    /* JADX INFO: renamed from: j */
    public ImageView f514j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f515k;

    /* JADX INFO: renamed from: l */
    public View f516l;

    /* JADX INFO: renamed from: m */
    public VLinear f517m;

    /* JADX INFO: renamed from: n */
    public VText f518n;

    /* JADX INFO: renamed from: o */
    public VText f519o;

    /* JADX INFO: renamed from: p */
    public c4g0 f520p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f521q;

    public OnlineMatchCardView(Context context) {
        super(context);
        this.f521q = new tpd0("onlineMatchCardBlurRadius", 5);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo737f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        qib0.G.O(this.f515k, user.fp().profileSmall().formatted(), 2, ((Integer) this.f521q.get()).intValue());
        this.f518n.setText(user.name);
        if (user.isIdAndPicBothVerified()) {
            this.f518n.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.Up, 0);
        } else {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            VText vText = this.f518n;
            if (zIsPicVerificationVerified) {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.Pt, 0);
            } else {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        xdl0.l0(this.f518n, 0, false, false);
        xdl0.M(this.f519o, true);
        StringBuilder sb = new StringBuilder("当前在线");
        Location location = user.location;
        String strM650C = C0034a.m650C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strM650C)) {
            sb.append(" · ");
            sb.append(strM650C);
        }
        sb.append(" · ");
        sb.append(String.format("%1$s · %2$s", C0034a.m655H(user), i0g0.j0(user.profile.zodiac)));
        this.f519o.setText(sb.toString());
        m758x(quickChatCardWrapper);
        m751q(f30Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m749o(View view) {
        cj50.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        mkd0.z(this.f520p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m749o(this);
        VText vText = this.f518n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f512h.setTypeface(typeface);
        this.f508d.setText("[愉快]");
        this.f509e.setText("[玫瑰]");
        this.f510f.setText("[啤酒]");
        this.f511g.setText("[得意]");
        post(new Runnable() { // from class: l.vi50
            @Override // java.lang.Runnable
            public final void run() {
                this.f21135a.m756v();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final CharSequence m750p(long j) {
        String str = String.format(j < 10 ? "即刻聊天  %ss " : "即刻聊天  %ss", Long.valueOf(j));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), str.indexOf(" "), str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public final void m751q(final f30<Boolean, String> f30Var) {
        xdl0.E0(this.f512h, new View.OnClickListener() { // from class: l.wi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
        this.f508d.setOnClickListener(new View.OnClickListener() { // from class: l.xi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22289a.m752r(f30Var, view);
            }
        });
        this.f509e.setOnClickListener(new View.OnClickListener() { // from class: l.yi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22897a.m753s(f30Var, view);
            }
        });
        this.f510f.setOnClickListener(new View.OnClickListener() { // from class: l.zi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23439a.m754t(f30Var, view);
            }
        });
        this.f511g.setOnClickListener(new View.OnClickListener() { // from class: l.aj50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7658a.m755u(f30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m752r(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f508d.getText().toString());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m753s(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f509e.getText().toString());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m754t(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f510f.getText().toString());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m755u(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f511g.getText().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m756v() {
        int height = m735b() ? (getHeight() * 3) / 11 : (getHeight() * 4) / 9;
        int i = (height * 100) / 133;
        ViewGroup.LayoutParams layoutParams = this.f515k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = height;
        this.f515k.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f516l.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (int) (height * 0.42f);
        this.f516l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f514j.getLayoutParams();
        layoutParams3.width = (i * 27) / 20;
        layoutParams3.height = height;
        this.f514j.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f517m.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.bottomMargin = (height * 17) / 266;
        this.f517m.setLayoutParams(layoutParams4);
        if (m735b()) {
            VText vText = this.f518n;
            int i2 = t100.g;
            xdl0.V(vText, i2);
            xdl0.V(this.f519o, i2);
        }
        m736e();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m757w(QuickChatCardWrapper quickChatCardWrapper, boolean z, boolean z2, Long l2) {
        long jO = (mqi0.o() - quickChatCardWrapper.insertTime) / 1000;
        long j = (z && z2) ? 15 : 30;
        if (jO < j) {
            this.f512h.setText(m750p(j - jO));
        } else {
            mkd0.z(this.f520p);
            this.f512h.setText("即刻聊天");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m758x(final QuickChatCardWrapper quickChatCardWrapper) {
        mkd0.z(this.f520p);
        final boolean z = NullChecker.a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
        final boolean zIsFemale = CoreModule.c.e0.na().isFemale();
        if (quickChatCardWrapper.insertTime != 0) {
            if (mqi0.o() - quickChatCardWrapper.insertTime < ((z && zIsFemale) ? 15000 : 30000)) {
                this.f520p = c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.bj50
                    public final void call(Object obj) {
                        this.f8178a.m757w(quickChatCardWrapper, z, zIsFemale, (Long) obj);
                    }
                }));
            }
        }
    }

    public OnlineMatchCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f521q = new tpd0("onlineMatchCardBlurRadius", 5);
    }
}
