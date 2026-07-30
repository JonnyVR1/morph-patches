package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c40;
import l.eqh0;
import l.j760;
import l.q8p;
import l.t96;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import p009l.m96;
import p009l.mqi0;
import p009l.n96;
import v.VImage;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemIntlReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3612a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f3613b;

    /* JADX INFO: renamed from: c */
    public View f3614c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f3615d;

    /* JADX INFO: renamed from: e */
    public VImage f3616e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f3617f;

    /* JADX INFO: renamed from: g */
    public VText f3618g;

    /* JADX INFO: renamed from: h */
    public VText f3619h;

    /* JADX INFO: renamed from: i */
    public TextView f3620i;

    /* JADX INFO: renamed from: j */
    public Conversation f3621j;

    /* JADX INFO: renamed from: k */
    public User f3622k;

    /* JADX INFO: renamed from: l */
    public Parcelable f3623l;

    /* JADX INFO: renamed from: m */
    public c40 f3624m;

    /* JADX INFO: renamed from: n */
    public Long f3625n;

    public ConversationItemIntlReceiveLikeView(Context context) {
        super(context);
        this.f3625n = 0L;
    }

    private String getSubContentText() {
        if (NullChecker.a(this.f3622k)) {
            double dM18550o = mqi0.m18550o();
            User user = this.f3622k;
            long j = ((long) (dM18550o - user.location.updatedTime)) / 60000;
            if (j < 60) {
                return j <= 10 ? m4948f().getString(R.string.lc) : String.format(m4948f().getString(R.string.ic), Long.valueOf(j));
            }
            boolean zB3 = CoreModule.c.E0.B3(user);
            int i = this.f3622k.location.distance;
            if (!zB3 && i < 5000) {
                return i < 1000 ? String.format(m4948f().getString(R.string.kc), 1) : String.format(m4948f().getString(R.string.kc), Integer.valueOf(i / 1000));
            }
        }
        return m4948f().getString(R.string.jc);
    }

    private String getSubFrontText() {
        return NullChecker.a(this.f3622k) ? m4948f().getString(R.string.hc) : "";
    }

    /* JADX INFO: renamed from: e */
    public final void m4947e(View view) {
        t96.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m4948f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m4949g(View view) {
        this.f3616e.setVisibility(8);
        q8p.a aVar = q8p.Companion;
        aVar.v(true);
        aVar.c(m4948f(), ((DbObject) this.f3621j).id, "", CoreModule.P().a().Qr());
        if (NullChecker.a(this.f3622k)) {
            zvf0.u("e_locked_match", "p_messages_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f3622k).id)});
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4950h(View view) {
        this.f3624m.b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4951i(VListCell vListCell, VListCell.a aVar, int i) {
        q8p.Companion.d(((DbObject) this.f3621j).id);
        CoreModule.c.v2.J3("");
        this.f3624m.b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m4952j(View view) {
        m4962t(m4948f());
        c40.b bVar = new c40.b(m4948f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(m4948f().getString(R.string.j));
        c40 c40VarF = bVar.I(m4948f().getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.r96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19698a.m4950h(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.s96
            /* JADX INFO: renamed from: a */
            public final void m22005a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f20138a.m4951i(vListCell, aVar, i);
            }
        }).F();
        this.f3624m = c40VarF;
        c40VarF.f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m4953k(Conversation conversation) {
        this.f3621j = conversation;
        this.f3622k = CoreModule.K().getUserById(((DbObject) conversation).id);
        m4959q();
        m4961s();
        m4960r();
    }

    /* JADX INFO: renamed from: l */
    public final void m4954l() {
        if (NullChecker.a(this.f3622k)) {
            this.f3618g.setTypeface(eqh0.c(3), 1);
            this.f3618g.setText(this.f3622k.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4955m() {
        if (NullChecker.a(this.f3622k)) {
            this.f3613b.m10025p0(this.f3622k);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4956n() {
        this.f3620i.setText(mqi0.m18538G(this.f3621j.latestTime));
    }

    /* JADX INFO: renamed from: o */
    public final void m4957o() {
        String subFrontText = getSubFrontText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", subFrontText, getSubContentText()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m4948f().getResources().getColor(w0c0.P0)), 0, subFrontText.length() + 2, 33);
        this.f3619h.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4947e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m4958p() {
        this.f3616e.setVisibility(q8p.Companion.g() ? 8 : 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m4959q() {
        m4955m();
        m4958p();
        m4954l();
        m4957o();
        m4956n();
    }

    /* JADX INFO: renamed from: r */
    public final void m4960r() {
        if (System.currentTimeMillis() - this.f3625n.longValue() <= 300) {
            return;
        }
        this.f3625n = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.a(this.f3622k)) {
            zvf0.A("e_locked_match", "p_messages_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f3622k).id)});
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4961s() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.p96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18433a.m4949g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.q96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f19072a.m4952j(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m4962t(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f3623l == null) {
            this.f3623l = VibrationEffect.createOneShot(30L, 150);
        }
        if (m96.m18330a(this.f3623l)) {
            vibrator.vibrate(n96.m18810a(this.f3623l));
        }
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3625n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3625n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3625n = 0L;
    }
}
