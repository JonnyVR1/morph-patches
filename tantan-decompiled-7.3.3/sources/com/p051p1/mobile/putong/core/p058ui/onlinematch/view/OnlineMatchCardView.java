package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fo0;
import p153l.ir50;
import p153l.kcg0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.vxd0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f33531a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f33532b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f33533c;

    /* JADX INFO: renamed from: d */
    public VText f33534d;

    /* JADX INFO: renamed from: e */
    public VText f33535e;

    /* JADX INFO: renamed from: f */
    public VText f33536f;

    /* JADX INFO: renamed from: g */
    public VText f33537g;

    /* JADX INFO: renamed from: h */
    public VText f33538h;

    /* JADX INFO: renamed from: i */
    public VFrame f33539i;

    /* JADX INFO: renamed from: j */
    public ImageView f33540j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f33541k;

    /* JADX INFO: renamed from: l */
    public View f33542l;

    /* JADX INFO: renamed from: m */
    public VLinear f33543m;

    /* JADX INFO: renamed from: n */
    public VText f33544n;

    /* JADX INFO: renamed from: o */
    public VText f33545o;

    /* JADX INFO: renamed from: p */
    public kcg0 f33546p;

    /* JADX INFO: renamed from: q */
    public final vxd0 f33547q;

    public OnlineMatchCardView(Context context) {
        super(context);
        this.f33547q = new vxd0("onlineMatchCardBlurRadius", 5);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(QuickChatCardWrapper quickChatCardWrapper, z20<Boolean, String> z20Var) {
        User user = quickChatCardWrapper.getUser();
        uqb0.f180374G.m127120O(this.f33541k, user.m61308fp().profileSmall().formatted(), 2, this.f33547q.get().intValue());
        this.f33544n.setText(user.name);
        if (user.isIdAndPicBothVerified()) {
            this.f33544n.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86259Iq, 0);
        } else {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            VText vText = this.f33544n;
            if (zIsPicVerificationVerified) {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86103Du, 0);
            } else {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        bnl0.m105566l0(this.f33544n, 0, false, false);
        bnl0.m105524M(this.f33545o, true);
        StringBuilder sb = new StringBuilder("当前在线");
        Location location = user.location;
        String strM51402C = C8772a.m51402C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strM51402C)) {
            sb.append(" · ");
            sb.append(strM51402C);
        }
        sb.append(" · ");
        sb.append(String.format("%1$s · %2$s", C8772a.m51407H(user), q8g0.m175804j0(user.profile.zodiac)));
        this.f33545o.setText(sb.toString());
        m51510x(quickChatCardWrapper);
        m51503q(z20Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m51501o(View view) {
        ir50.m141775a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f33546p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51501o(this);
        VText vText = this.f33544n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f33538h.setTypeface(typeface);
        this.f33534d.setText("[愉快]");
        this.f33535e.setText("[玫瑰]");
        this.f33536f.setText("[啤酒]");
        this.f33537g.setText("[得意]");
        post(new Runnable() { // from class: l.br50
            @Override // java.lang.Runnable
            public final void run() {
                this.f77980a.m51508v();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final CharSequence m51502p(long j) {
        String str = String.format(j < 10 ? "即刻聊天  %ss " : "即刻聊天  %ss", Long.valueOf(j));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), str.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public final void m51503q(final z20<Boolean, String> z20Var) {
        bnl0.m105509E0(this.f33538h, new View.OnClickListener() { // from class: l.cr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20Var.call(Boolean.FALSE, "");
            }
        });
        this.f33534d.setOnClickListener(new View.OnClickListener() { // from class: l.dr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90359a.m51504r(z20Var, view);
            }
        });
        this.f33535e.setOnClickListener(new View.OnClickListener() { // from class: l.er50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95447a.m51505s(z20Var, view);
            }
        });
        this.f33536f.setOnClickListener(new View.OnClickListener() { // from class: l.fr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100397a.m51506t(z20Var, view);
            }
        });
        this.f33537g.setOnClickListener(new View.OnClickListener() { // from class: l.gr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106005a.m51507u(z20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m51504r(z20 z20Var, View view) {
        z20Var.call(Boolean.TRUE, this.f33534d.getText().toString());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m51505s(z20 z20Var, View view) {
        z20Var.call(Boolean.TRUE, this.f33535e.getText().toString());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m51506t(z20 z20Var, View view) {
        z20Var.call(Boolean.TRUE, this.f33536f.getText().toString());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m51507u(z20 z20Var, View view) {
        z20Var.call(Boolean.TRUE, this.f33537g.getText().toString());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m51508v() {
        int height = m51487b() ? (getHeight() * 3) / 11 : (getHeight() * 4) / 9;
        int i = (height * 100) / CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA;
        ViewGroup.LayoutParams layoutParams = this.f33541k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = height;
        this.f33541k.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f33542l.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (int) (height * 0.42f);
        this.f33542l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f33540j.getLayoutParams();
        layoutParams3.width = (i * 27) / 20;
        layoutParams3.height = height;
        this.f33540j.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f33543m.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.bottomMargin = (height * 17) / 266;
        this.f33543m.setLayoutParams(layoutParams4);
        if (m51487b()) {
            VText vText = this.f33544n;
            int i2 = qa00.f156320g;
            bnl0.m105538V(vText, i2);
            bnl0.m105538V(this.f33545o, i2);
        }
        m51488e();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m51509w(QuickChatCardWrapper quickChatCardWrapper, boolean z, boolean z2, Long l2) {
        long jM174454o = (pzi0.m174454o() - quickChatCardWrapper.insertTime) / 1000;
        long j = (z && z2) ? 15 : 30;
        if (jM174454o < j) {
            this.f33538h.setText(m51502p(j - jM174454o));
        } else {
            psd0.m173633z(this.f33546p);
            this.f33538h.setText("即刻聊天");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m51510x(final QuickChatCardWrapper quickChatCardWrapper) {
        psd0.m173633z(this.f33546p);
        final boolean z = NullChecker.m82486a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
        final boolean zIsFemale = CoreModule.f18264c.f20381e0.m116593na().isFemale();
        if (quickChatCardWrapper.insertTime != 0) {
            if (pzi0.m174454o() - quickChatCardWrapper.insertTime < ((z && zIsFemale) ? NetWorkParam.DEFAULT_CONNECT_TIME_OUT : 30000)) {
                this.f33546p = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hr50
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f111271a.m51509w(quickChatCardWrapper, z, zIsFemale, (Long) obj);
                    }
                }));
            }
        }
    }

    public OnlineMatchCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33547q = new vxd0("onlineMatchCardBlurRadius", 5);
    }
}
