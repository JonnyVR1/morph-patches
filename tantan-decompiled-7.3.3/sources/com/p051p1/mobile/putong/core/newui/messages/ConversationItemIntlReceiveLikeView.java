package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VListCell;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.pzi0;
import p153l.qa6;
import p153l.qap;
import p153l.ra6;
import p153l.w30;
import p153l.wa6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemIntlReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f25576a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f25577b;

    /* JADX INFO: renamed from: c */
    public View f25578c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f25579d;

    /* JADX INFO: renamed from: e */
    public VImage f25580e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f25581f;

    /* JADX INFO: renamed from: g */
    public VText f25582g;

    /* JADX INFO: renamed from: h */
    public VText f25583h;

    /* JADX INFO: renamed from: i */
    public TextView f25584i;

    /* JADX INFO: renamed from: j */
    public Conversation f25585j;

    /* JADX INFO: renamed from: k */
    public User f25586k;

    /* JADX INFO: renamed from: l */
    public Parcelable f25587l;

    /* JADX INFO: renamed from: m */
    public w30 f25588m;

    /* JADX INFO: renamed from: n */
    public Long f25589n;

    public ConversationItemIntlReceiveLikeView(Context context) {
        super(context);
        this.f25589n = 0L;
    }

    private String getSubContentText() {
        if (NullChecker.m82486a(this.f25586k)) {
            double dM174454o = pzi0.m174454o();
            User user = this.f25586k;
            long j = ((long) (dM174454o - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS;
            if (j < 60) {
                return j <= 10 ? m41861f().getString(R$string.f18298Ac) : String.format(m41861f().getString(R$string.f19799xc), Long.valueOf(j));
            }
            boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(user);
            int i = this.f25586k.location.distance;
            if (!zM141060B3 && i < 5000) {
                return i < 1000 ? String.format(m41861f().getString(R$string.f19861zc), 1) : String.format(m41861f().getString(R$string.f19861zc), Integer.valueOf(i / 1000));
            }
        }
        return m41861f().getString(R$string.f19830yc);
    }

    private String getSubFrontText() {
        return NullChecker.m82486a(this.f25586k) ? m41861f().getString(R$string.f19768wc) : "";
    }

    /* JADX INFO: renamed from: e */
    public final void m41860e(View view) {
        wa6.m205635a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m41861f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41862g(View view) {
        this.f25580e.setVisibility(8);
        qap.Companion companion = qap.INSTANCE;
        companion.m175984v(true);
        companion.m175965c(m41861f(), this.f25585j.f56859id, "", CoreModule.m30933P().m143405a().mo34399Qr());
        if (NullChecker.m82486a(this.f25586k)) {
            i4g0.m138523u("e_locked_match", OMSDialogPositon.p_messages_view, jyb.m147494Y("other_user_id", this.f25586k.f56859id));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41863h(View view) {
        this.f25588m.m204614b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41864i(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        qap.INSTANCE.m175966d(this.f25585j.f56859id);
        CoreModule.f18264c.f20434v2.m175895J3("");
        this.f25588m.m204614b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m41865j(View view) {
        m41875t(m41861f());
        w30.C21001b c21001b = new w30.C21001b(m41861f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(m41861f().getString(R$string.f19352j));
        w30 w30VarM204654F = c21001b.m204657I(m41861f().getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ua6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f178180a.m41863h(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.va6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f183067a.m41864i(vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25588m = w30VarM204654F;
        w30VarM204654F.m204618f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m41866k(Conversation conversation) {
        this.f25585j = conversation;
        this.f25586k = CoreModule.m30930K().getUserById(conversation.f56859id);
        m41872q();
        m41874s();
        m41873r();
    }

    /* JADX INFO: renamed from: l */
    public final void m41867l() {
        if (NullChecker.m82486a(this.f25586k)) {
            this.f25582g.setTypeface(lyh0.m156283c(3), 1);
            this.f25582g.setText(this.f25586k.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m41868m() {
        if (NullChecker.m82486a(this.f25586k)) {
            this.f25577b.m80887p0(this.f25586k);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m41869n() {
        this.f25584i.setText(pzi0.m174442G(this.f25585j.latestTime));
    }

    /* JADX INFO: renamed from: o */
    public final void m41870o() {
        String subFrontText = getSubFrontText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", subFrontText, getSubContentText()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m41861f().getResources().getColor(c9c0.f80367Q0)), 0, subFrontText.length() + 2, 33);
        this.f25583h.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41860e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m41871p() {
        this.f25580e.setVisibility(qap.INSTANCE.m175969g() ? 8 : 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m41872q() {
        m41868m();
        m41871p();
        m41867l();
        m41870o();
        m41869n();
    }

    /* JADX INFO: renamed from: r */
    public final void m41873r() {
        if (System.currentTimeMillis() - this.f25589n.longValue() <= 300) {
            return;
        }
        this.f25589n = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m82486a(this.f25586k)) {
            i4g0.m138492A("e_locked_match", OMSDialogPositon.p_messages_view, jyb.m147494Y("other_user_id", this.f25586k.f56859id));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m41874s() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.sa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167006a.m41862g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ta6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f172695a.m41865j(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m41875t(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f25587l == null) {
            this.f25587l = VibrationEffect.createOneShot(30L, 150);
        }
        if (qa6.m175862a(this.f25587l)) {
            vibrator.vibrate(ra6.m180709a(this.f25587l));
        }
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25589n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25589n = 0L;
    }

    public ConversationItemIntlReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25589n = 0L;
    }
}
