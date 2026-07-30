package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Parcelable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import java.util.Random;
import p151v.VImage;
import p151v.VListCell;
import p151v.VText;
import p153l.Cfor;
import p153l.bnl0;
import p153l.c9c0;
import p153l.f760;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.lyh0;
import p153l.mb6;
import p153l.pol;
import p153l.pzi0;
import p153l.qa00;
import p153l.qa6;
import p153l.ra6;
import p153l.rs9;
import p153l.sj6;
import p153l.ue6;
import p153l.w30;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f25612a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f25613b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25614c;

    /* JADX INFO: renamed from: d */
    public VImage f25615d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25616e;

    /* JADX INFO: renamed from: f */
    public VText f25617f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f25618g;

    /* JADX INFO: renamed from: h */
    public VText f25619h;

    /* JADX INFO: renamed from: i */
    public VText f25620i;

    /* JADX INFO: renamed from: j */
    public TextView f25621j;

    /* JADX INFO: renamed from: k */
    public VText f25622k;

    /* JADX INFO: renamed from: l */
    public Conversation f25623l;

    /* JADX INFO: renamed from: m */
    public User f25624m;

    /* JADX INFO: renamed from: n */
    public Parcelable f25625n;

    /* JADX INFO: renamed from: o */
    public w30 f25626o;

    /* JADX INFO: renamed from: p */
    public Long f25627p;

    public ConversationItemReceiveLikeView(Context context) {
        super(context);
        this.f25627p = 0L;
    }

    private String getSubContentText() {
        if (!NullChecker.m82486a(this.f25624m)) {
            return "";
        }
        boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(this.f25624m);
        int i = this.f25624m.location.distance;
        if (!zM141060B3 && i < 5000 && i >= 100) {
            return i < 1000 ? String.format("离你%sm", Integer.valueOf(i)) : String.format("离你%skm", Float.valueOf(i / 1000.0f));
        }
        double dM174454o = pzi0.m174454o();
        User user = this.f25624m;
        long j = ((long) (dM174454o - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS;
        if (j <= 180) {
            if (j <= 5) {
                return "当前在线";
            }
            return j <= 60 ? String.format("%s分钟前活跃", Long.valueOf(j)) : String.format("%s小时前活跃", Integer.valueOf((int) (j / 60)));
        }
        f760.Companion companion = f760.INSTANCE;
        String strM124359f = companion.m124359f(user.f56859id);
        if (!TextUtils.isEmpty(strM124359f)) {
            return strM124359f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("喜欢你了❤️");
        arrayList.add("等你回应");
        arrayList.add("向你表白啦");
        int iNextInt = new Random().nextInt(3);
        if (iNextInt >= arrayList.size()) {
            return "";
        }
        companion.m124369p((String) arrayList.get(iNextInt), this.f25624m.f56859id);
        return (String) arrayList.get(iNextInt);
    }

    private void setClickListener(pol polVar) {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ib6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113723a.m41909g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jb6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f119129a.m41912j(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m41907e(View view) {
        mb6.m157773a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m41908f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41909g(View view) {
        this.f25615d.setVisibility(8);
        this.f25616e.setVisibility(8);
        this.f25622k.setVisibility(8);
        f760.Companion companion = f760.INSTANCE;
        companion.m124368o(true);
        companion.m124354a(m41908f(), this.f25623l.f56859id, "p_message,locked_match", CoreModule.m30933P().m143405a().mo34399Qr());
        if (NullChecker.m82486a(this.f25624m)) {
            i4g0.m138523u("e_locked_match", OMSDialogPositon.p_messages_view, jyb.m147494Y("other_user_id", this.f25624m.f56859id), jyb.m147494Y("cell_type", Cfor.INSTANCE.m126491b() ? "seetrial" : "showhelike"));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41910h(View view) {
        this.f25626o.m204614b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41911i(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        f760.INSTANCE.m124355b(this.f25623l.f56859id);
        CoreModule.f18264c.f20350T1.m137303H3("");
        this.f25626o.m204614b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m41912j(View view) {
        m41921s(m41908f());
        w30.C21001b c21001b = new w30.C21001b(m41908f());
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        w30 w30VarM204654F = c21001b.m204657I(m41908f().getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.kb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124754a.m41910h(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.lb6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f130779a.m41911i(vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25626o = w30VarM204654F;
        w30VarM204654F.m204618f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m41913k(pol polVar, Conversation conversation) {
        this.f25623l = conversation;
        this.f25624m = CoreModule.m30930K().getUserById(conversation.f56859id);
        m41919q();
        setClickListener(polVar);
        m41920r();
    }

    /* JADX INFO: renamed from: l */
    public final void m41914l() {
        if (NullChecker.m82486a(this.f25624m)) {
            this.f25619h.setTypeface(lyh0.m156283c(3), 1);
            this.f25619h.setText(this.f25624m.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m41915m() {
        if (NullChecker.m82486a(this.f25624m)) {
            this.f25613b.m80887p0(this.f25624m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m41916n() {
        String str;
        long jM174454o = (long) ((pzi0.m174454o() - this.f25623l.latestTime) / 60000.0d);
        if (jM174454o <= 1) {
            str = "刚刚";
        } else if (jM174454o <= 60) {
            str = jM174454o + "分钟前";
        } else if (jM174454o <= 360) {
            str = (jM174454o / 60) + "小时前";
        } else if (jM174454o <= 2880) {
            str = "最近";
        } else if (jM174454o < 10080) {
            str = ((jM174454o / 24) / 60) + "天前";
        } else {
            str = null;
        }
        this.f25621j.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m41917o() {
        String str = CoreModule.f18264c.f20350T1.getLocalReceiveLikeGuideText().get();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", str, getSubContentText()));
        int color = getContext().getResources().getColor(c9c0.f80342I);
        if (gra.m131778z()) {
            color = Color.parseColor("#FF700A");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, str.length() + (gra.m131778z() ? 0 : 2), 33);
        this.f25620i.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41907e(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            int i = sj6.f168905Q;
            int i2 = qa00.f156323j;
            bnl0.m105507D0((i2 * 2) + i, this.f25612a);
            bnl0.m105505C0(this.f25612a, i2 + i);
            ue6.m195676v(qa00.m175859d(11.0f) + i, this.f25613b);
            ue6.m195676v(i, this.f25613b.f55376d);
            ue6.m195671k0(this.f25619h, this.f25621j);
            ue6.m195667e0(this.f25620i);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m41918p() {
        this.f25615d.setVisibility(8);
        this.f25616e.setVisibility(8);
        this.f25622k.setVisibility(8);
        if (rs9.m182938g()) {
            this.f25616e.setVisibility(f760.INSTANCE.m124358e() ? 8 : 0);
        } else {
            this.f25615d.setVisibility(f760.INSTANCE.m124358e() ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m41919q() {
        m41915m();
        m41918p();
        m41914l();
        m41917o();
        m41916n();
    }

    /* JADX INFO: renamed from: r */
    public final void m41920r() {
        if (System.currentTimeMillis() - this.f25627p.longValue() <= 300) {
            return;
        }
        this.f25627p = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m82486a(this.f25624m)) {
            i4g0.m138492A("e_locked_match", OMSDialogPositon.p_messages_view, jyb.m147494Y("other_user_id", this.f25624m.f56859id));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m41921s(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f25625n == null) {
            this.f25625n = VibrationEffect.createOneShot(30L, 150);
        }
        if (qa6.m175862a(this.f25625n)) {
            vibrator.vibrate(ra6.m180709a(this.f25625n));
        }
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25627p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25627p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25627p = 0L;
    }
}
