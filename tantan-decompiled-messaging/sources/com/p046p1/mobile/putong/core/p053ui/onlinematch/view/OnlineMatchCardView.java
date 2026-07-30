package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.cj50;
import p149l.e30;
import p149l.f30;
import p149l.i0g0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.tpd0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchCardView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public VLinear f32683a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f32684b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f32685c;

    /* JADX INFO: renamed from: d */
    public VText f32686d;

    /* JADX INFO: renamed from: e */
    public VText f32687e;

    /* JADX INFO: renamed from: f */
    public VText f32688f;

    /* JADX INFO: renamed from: g */
    public VText f32689g;

    /* JADX INFO: renamed from: h */
    public VText f32690h;

    /* JADX INFO: renamed from: i */
    public VFrame f32691i;

    /* JADX INFO: renamed from: j */
    public ImageView f32692j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f32693k;

    /* JADX INFO: renamed from: l */
    public View f32694l;

    /* JADX INFO: renamed from: m */
    public VLinear f32695m;

    /* JADX INFO: renamed from: n */
    public VText f32696n;

    /* JADX INFO: renamed from: o */
    public VText f32697o;

    /* JADX INFO: renamed from: p */
    public c4g0 f32698p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f32699q;

    public OnlineMatchCardView(Context context) {
        super(context);
        this.f32699q = new tpd0("onlineMatchCardBlurRadius", 5);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        qib0.f154691G.m102336O(this.f32693k, user.m60124fp().profileSmall().formatted(), 2, this.f32699q.get().intValue());
        this.f32696n.setText(user.name);
        if (user.isIdAndPicBothVerified()) {
            this.f32696n.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189805Up, 0);
        } else {
            boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
            VText vText = this.f32696n;
            if (zIsPicVerificationVerified) {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189654Pt, 0);
            } else {
                vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        xdl0.m208386l0(this.f32696n, 0, false, false);
        xdl0.m208344M(this.f32697o, true);
        StringBuilder sb = new StringBuilder("当前在线");
        Location location = user.location;
        String strM50219C = C8609a.m50219C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strM50219C)) {
            sb.append(" · ");
            sb.append(strM50219C);
        }
        sb.append(" · ");
        sb.append(String.format("%1$s · %2$s", C8609a.m50224H(user), i0g0.m133869j0(user.profile.zodiac)));
        this.f32697o.setText(sb.toString());
        m50327x(quickChatCardWrapper);
        m50320q(f30Var);
    }

    /* JADX INFO: renamed from: o */
    public final void m50318o(View view) {
        cj50.m107108a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f32698p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50318o(this);
        VText vText = this.f32696n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f32690h.setTypeface(typeface);
        this.f32686d.setText("[愉快]");
        this.f32687e.setText("[玫瑰]");
        this.f32688f.setText("[啤酒]");
        this.f32689g.setText("[得意]");
        post(new Runnable() { // from class: l.vi50
            @Override // java.lang.Runnable
            public final void run() {
                this.f181552a.m50325v();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final CharSequence m50319p(long j) {
        String str = String.format(j < 10 ? "即刻聊天  %ss " : "即刻聊天  %ss", Long.valueOf(j));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), str.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), str.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: q */
    public final void m50320q(final f30<Boolean, String> f30Var) {
        xdl0.m208329E0(this.f32690h, new View.OnClickListener() { // from class: l.wi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30Var.call(Boolean.FALSE, "");
            }
        });
        this.f32686d.setOnClickListener(new View.OnClickListener() { // from class: l.xi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192959a.m50321r(f30Var, view);
            }
        });
        this.f32687e.setOnClickListener(new View.OnClickListener() { // from class: l.yi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198443a.m50322s(f30Var, view);
            }
        });
        this.f32688f.setOnClickListener(new View.OnClickListener() { // from class: l.zi50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203294a.m50323t(f30Var, view);
            }
        });
        this.f32689g.setOnClickListener(new View.OnClickListener() { // from class: l.aj50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70087a.m50324u(f30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m50321r(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f32686d.getText().toString());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m50322s(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f32687e.getText().toString());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m50323t(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f32688f.getText().toString());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m50324u(f30 f30Var, View view) {
        f30Var.call(Boolean.TRUE, this.f32689g.getText().toString());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m50325v() {
        int height = m50304b() ? (getHeight() * 3) / 11 : (getHeight() * 4) / 9;
        int i = (height * 100) / CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA;
        ViewGroup.LayoutParams layoutParams = this.f32693k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = height;
        this.f32693k.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f32694l.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = (int) (height * 0.42f);
        this.f32694l.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f32692j.getLayoutParams();
        layoutParams3.width = (i * 27) / 20;
        layoutParams3.height = height;
        this.f32692j.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f32695m.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.bottomMargin = (height * 17) / 266;
        this.f32695m.setLayoutParams(layoutParams4);
        if (m50304b()) {
            VText vText = this.f32696n;
            int i2 = t100.f167258g;
            xdl0.m208358V(vText, i2);
            xdl0.m208358V(this.f32697o, i2);
        }
        m50305e();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m50326w(QuickChatCardWrapper quickChatCardWrapper, boolean z, boolean z2, Long l2) {
        long jM155944o = (mqi0.m155944o() - quickChatCardWrapper.insertTime) / 1000;
        long j = (z && z2) ? 15 : 30;
        if (jM155944o < j) {
            this.f32690h.setText(m50319p(j - jM155944o));
        } else {
            mkd0.m154992z(this.f32698p);
            this.f32690h.setText("即刻聊天");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m50327x(final QuickChatCardWrapper quickChatCardWrapper) {
        mkd0.m154992z(this.f32698p);
        final boolean z = NullChecker.m81303a(quickChatCardWrapper.getBroadcastCard()) && quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing;
        final boolean zIsFemale = CoreModule.f17545c.f19639e0.m169520na().isFemale();
        if (quickChatCardWrapper.insertTime != 0) {
            if (mqi0.m155944o() - quickChatCardWrapper.insertTime < ((z && zIsFemale) ? NetWorkParam.DEFAULT_CONNECT_TIME_OUT : 30000)) {
                this.f32698p = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.bj50
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f75878a.m50326w(quickChatCardWrapper, z, zIsFemale, (Long) obj);
                    }
                }));
            }
        }
    }

    public OnlineMatchCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32699q = new tpd0("onlineMatchCardBlurRadius", 5);
    }
}
