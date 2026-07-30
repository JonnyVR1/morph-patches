package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Random;
import p147v.VImage;
import p147v.VListCell;
import p147v.VText;
import p149l.az50;
import p149l.c40;
import p149l.dml;
import p149l.emr;
import p149l.eqh0;
import p149l.gr9;
import p149l.ja6;
import p149l.m96;
import p149l.mqi0;
import p149l.n96;
import p149l.pi6;
import p149l.rd6;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f24870a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f24871b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f24872c;

    /* JADX INFO: renamed from: d */
    public VImage f24873d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24874e;

    /* JADX INFO: renamed from: f */
    public VText f24875f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f24876g;

    /* JADX INFO: renamed from: h */
    public VText f24877h;

    /* JADX INFO: renamed from: i */
    public VText f24878i;

    /* JADX INFO: renamed from: j */
    public TextView f24879j;

    /* JADX INFO: renamed from: k */
    public VText f24880k;

    /* JADX INFO: renamed from: l */
    public Conversation f24881l;

    /* JADX INFO: renamed from: m */
    public User f24882m;

    /* JADX INFO: renamed from: n */
    public Parcelable f24883n;

    /* JADX INFO: renamed from: o */
    public c40 f24884o;

    /* JADX INFO: renamed from: p */
    public Long f24885p;

    public ConversationItemReceiveLikeView(Context context) {
        super(context);
        this.f24885p = 0L;
    }

    private String getSubContentText() {
        if (!NullChecker.m81303a(this.f24882m)) {
            return "";
        }
        boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(this.f24882m);
        int i = this.f24882m.location.distance;
        if (!zM203772B3 && i < 5000 && i >= 100) {
            return i < 1000 ? String.format("离你%sm", Integer.valueOf(i)) : String.format("离你%skm", Float.valueOf(i / 1000.0f));
        }
        double dM155944o = mqi0.m155944o();
        User user = this.f24882m;
        long j = ((long) (dM155944o - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS;
        if (j <= 180) {
            if (j <= 5) {
                return "当前在线";
            }
            return j <= 60 ? String.format("%s分钟前活跃", Long.valueOf(j)) : String.format("%s小时前活跃", Integer.valueOf((int) (j / 60)));
        }
        az50.Companion companion = az50.INSTANCE;
        String strM99626f = companion.m99626f(user.f56011id);
        if (!TextUtils.isEmpty(strM99626f)) {
            return strM99626f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("喜欢你了❤️");
        arrayList.add("等你回应");
        arrayList.add("向你表白啦");
        int iNextInt = new Random().nextInt(3);
        if (iNextInt >= arrayList.size()) {
            return "";
        }
        companion.m99636p((String) arrayList.get(iNextInt), this.f24882m.f56011id);
        return (String) arrayList.get(iNextInt);
    }

    private void setClickListener(dml dmlVar) {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.fa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96569a.m40898g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ga6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f101630a.m40901j(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m40896e(View view) {
        ja6.m140689a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m40897f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m40898g(View view) {
        this.f24873d.setVisibility(8);
        this.f24874e.setVisibility(8);
        this.f24880k.setVisibility(8);
        az50.Companion companion = az50.INSTANCE;
        companion.m99635o(true);
        companion.m99621a(m40897f(), this.f24881l.f56011id, "p_message,locked_match", CoreModule.m29935P().m94651a().mo33396Qr());
        if (NullChecker.m81303a(this.f24882m)) {
            zvf0.m220399u("e_locked_match", OMSDialogPositon.p_messages_view, vwb.m200311Y("other_user_id", this.f24882m.f56011id), vwb.m200311Y("cell_type", emr.INSTANCE.m117220b() ? "seetrial" : "showhelike"));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40899h(View view) {
        this.f24884o.m105113b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40900i(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        az50.INSTANCE.m99622b(this.f24881l.f56011id);
        CoreModule.f17545c.f19608T1.m199969H3("");
        this.f24884o.m105113b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m40901j(View view) {
        m40910s(m40897f());
        c40.C16057b c16057b = new c40.C16057b(m40897f());
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        c40 c40VarM105153F = c16057b.m105156I(m40897f().getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.ha6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f106709a.m40899h(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.ia6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f112283a.m40900i(vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24884o = c40VarM105153F;
        c40VarM105153F.m105117f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m40902k(dml dmlVar, Conversation conversation) {
        this.f24881l = conversation;
        this.f24882m = CoreModule.m29932K().getUserById(conversation.f56011id);
        m40908q();
        setClickListener(dmlVar);
        m40909r();
    }

    /* JADX INFO: renamed from: l */
    public final void m40903l() {
        if (NullChecker.m81303a(this.f24882m)) {
            this.f24877h.setTypeface(eqh0.m117752c(3), 1);
            this.f24877h.setText(this.f24882m.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m40904m() {
        if (NullChecker.m81303a(this.f24882m)) {
            this.f24871b.m79704p0(this.f24882m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m40905n() {
        String str;
        long jM155944o = (long) ((mqi0.m155944o() - this.f24881l.latestTime) / 60000.0d);
        if (jM155944o <= 1) {
            str = "刚刚";
        } else if (jM155944o <= 60) {
            str = jM155944o + "分钟前";
        } else if (jM155944o <= 360) {
            str = (jM155944o / 60) + "小时前";
        } else if (jM155944o <= 2880) {
            str = "最近";
        } else if (jM155944o < 10080) {
            str = ((jM155944o / 24) / 60) + "天前";
        } else {
            str = null;
        }
        this.f24879j.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m40906o() {
        String str = CoreModule.f17545c.f19608T1.getLocalReceiveLikeGuideText().get();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", str, getSubContentText()));
        int color = getContext().getResources().getColor(w0c0.f183773I);
        if (upa.m194847z()) {
            color = Color.parseColor("#FF700A");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, str.length() + (upa.m194847z() ? 0 : 2), 33);
        this.f24878i.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40896e(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            int i = pi6.f149080Q;
            int i2 = t100.f167261j;
            xdl0.m208327D0((i2 * 2) + i, this.f24870a);
            xdl0.m208325C0(this.f24870a, i2 + i);
            rd6.m178882v(t100.m186890d(11.0f) + i, this.f24871b);
            rd6.m178882v(i, this.f24871b.f54528d);
            rd6.m178877k0(this.f24877h, this.f24879j);
            rd6.m178873e0(this.f24878i);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m40907p() {
        this.f24873d.setVisibility(8);
        this.f24874e.setVisibility(8);
        this.f24880k.setVisibility(8);
        if (gr9.m127682g()) {
            this.f24874e.setVisibility(az50.INSTANCE.m99625e() ? 8 : 0);
        } else {
            this.f24873d.setVisibility(az50.INSTANCE.m99625e() ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m40908q() {
        m40904m();
        m40907p();
        m40903l();
        m40906o();
        m40905n();
    }

    /* JADX INFO: renamed from: r */
    public final void m40909r() {
        if (System.currentTimeMillis() - this.f24885p.longValue() <= 300) {
            return;
        }
        this.f24885p = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m81303a(this.f24882m)) {
            zvf0.m220368A("e_locked_match", OMSDialogPositon.p_messages_view, vwb.m200311Y("other_user_id", this.f24882m.f56011id));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m40910s(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f24883n == null) {
            this.f24883n = VibrationEffect.createOneShot(30L, 150);
        }
        if (m96.m153609a(this.f24883n)) {
            vibrator.vibrate(n96.m158534a(this.f24883n));
        }
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24885p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24885p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24885p = 0L;
    }
}
