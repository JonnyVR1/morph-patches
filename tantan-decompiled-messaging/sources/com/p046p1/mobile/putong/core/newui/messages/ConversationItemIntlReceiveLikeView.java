package com.p046p1.mobile.putong.core.newui.messages;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VListCell;
import p147v.VText;
import p149l.c40;
import p149l.eqh0;
import p149l.m96;
import p149l.mqi0;
import p149l.n96;
import p149l.q8p;
import p149l.t96;
import p149l.vwb;
import p149l.w0c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemIntlReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f24834a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f24835b;

    /* JADX INFO: renamed from: c */
    public View f24836c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f24837d;

    /* JADX INFO: renamed from: e */
    public VImage f24838e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f24839f;

    /* JADX INFO: renamed from: g */
    public VText f24840g;

    /* JADX INFO: renamed from: h */
    public VText f24841h;

    /* JADX INFO: renamed from: i */
    public TextView f24842i;

    /* JADX INFO: renamed from: j */
    public Conversation f24843j;

    /* JADX INFO: renamed from: k */
    public User f24844k;

    /* JADX INFO: renamed from: l */
    public Parcelable f24845l;

    /* JADX INFO: renamed from: m */
    public c40 f24846m;

    /* JADX INFO: renamed from: n */
    public Long f24847n;

    public ConversationItemIntlReceiveLikeView(Context context) {
        super(context);
        this.f24847n = 0L;
    }

    private String getSubContentText() {
        if (NullChecker.m81303a(this.f24844k)) {
            double dM155944o = mqi0.m155944o();
            User user = this.f24844k;
            long j = ((long) (dM155944o - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS;
            if (j < 60) {
                return j <= 10 ? m40850f().getString(R$string.f18697lc) : String.format(m40850f().getString(R$string.f18606ic), Long.valueOf(j));
            }
            boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(user);
            int i = this.f24844k.location.distance;
            if (!zM203772B3 && i < 5000) {
                return i < 1000 ? String.format(m40850f().getString(R$string.f18666kc), 1) : String.format(m40850f().getString(R$string.f18666kc), Integer.valueOf(i / 1000));
            }
        }
        return m40850f().getString(R$string.f18635jc);
    }

    private String getSubFrontText() {
        return NullChecker.m81303a(this.f24844k) ? m40850f().getString(R$string.f18575hc) : "";
    }

    /* JADX INFO: renamed from: e */
    public final void m40849e(View view) {
        t96.m187605a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m40850f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m40851g(View view) {
        this.f24838e.setVisibility(8);
        q8p.Companion companion = q8p.INSTANCE;
        companion.m173447v(true);
        companion.m173428c(m40850f(), this.f24843j.f56011id, "", CoreModule.m29935P().m94651a().mo33396Qr());
        if (NullChecker.m81303a(this.f24844k)) {
            zvf0.m220399u("e_locked_match", OMSDialogPositon.p_messages_view, vwb.m200311Y("other_user_id", this.f24844k.f56011id));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40852h(View view) {
        this.f24846m.m105113b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40853i(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        q8p.INSTANCE.m173429d(this.f24843j.f56011id);
        CoreModule.f17545c.f19692v2.m129983J3("");
        this.f24846m.m105113b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m40854j(View view) {
        m40864t(m40850f());
        c40.C16057b c16057b = new c40.C16057b(m40850f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(m40850f().getString(R$string.f18622j));
        c40 c40VarM105153F = c16057b.m105156I(m40850f().getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.r96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f158279a.m40852h(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.s96
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f163149a.m40853i(vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24846m = c40VarM105153F;
        c40VarM105153F.m105117f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m40855k(Conversation conversation) {
        this.f24843j = conversation;
        this.f24844k = CoreModule.m29932K().getUserById(conversation.f56011id);
        m40861q();
        m40863s();
        m40862r();
    }

    /* JADX INFO: renamed from: l */
    public final void m40856l() {
        if (NullChecker.m81303a(this.f24844k)) {
            this.f24840g.setTypeface(eqh0.m117752c(3), 1);
            this.f24840g.setText(this.f24844k.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m40857m() {
        if (NullChecker.m81303a(this.f24844k)) {
            this.f24835b.m79704p0(this.f24844k);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m40858n() {
        this.f24842i.setText(mqi0.m155932G(this.f24843j.latestTime));
    }

    /* JADX INFO: renamed from: o */
    public final void m40859o() {
        String subFrontText = getSubFrontText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", subFrontText, getSubContentText()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m40850f().getResources().getColor(w0c0.f183795P0)), 0, subFrontText.length() + 2, 33);
        this.f24841h.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40849e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40860p() {
        this.f24838e.setVisibility(q8p.INSTANCE.m173432g() ? 8 : 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m40861q() {
        m40857m();
        m40860p();
        m40856l();
        m40859o();
        m40858n();
    }

    /* JADX INFO: renamed from: r */
    public final void m40862r() {
        if (System.currentTimeMillis() - this.f24847n.longValue() <= 300) {
            return;
        }
        this.f24847n = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m81303a(this.f24844k)) {
            zvf0.m220368A("e_locked_match", OMSDialogPositon.p_messages_view, vwb.m200311Y("other_user_id", this.f24844k.f56011id));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40863s() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.p96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147674a.m40851g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.q96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f153371a.m40854j(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m40864t(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f24845l == null) {
            this.f24845l = VibrationEffect.createOneShot(30L, 150);
        }
        if (m96.m153609a(this.f24845l)) {
            vibrator.vibrate(n96.m158534a(this.f24845l));
        }
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24847n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24847n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24847n = 0L;
    }
}
