package com.p000p1.mobile.putong.core.newui.messages;

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
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Random;
import l.az50;
import l.c40;
import l.dml;
import l.emr;
import l.eqh0;
import l.gr9;
import l.j760;
import l.ja6;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import p009l.m96;
import p009l.mqi0;
import p009l.n96;
import p009l.pi6;
import p009l.rd6;
import v.VImage;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemReceiveLikeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3648a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f3649b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3650c;

    /* JADX INFO: renamed from: d */
    public VImage f3651d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3652e;

    /* JADX INFO: renamed from: f */
    public VText f3653f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f3654g;

    /* JADX INFO: renamed from: h */
    public VText f3655h;

    /* JADX INFO: renamed from: i */
    public VText f3656i;

    /* JADX INFO: renamed from: j */
    public TextView f3657j;

    /* JADX INFO: renamed from: k */
    public VText f3658k;

    /* JADX INFO: renamed from: l */
    public Conversation f3659l;

    /* JADX INFO: renamed from: m */
    public User f3660m;

    /* JADX INFO: renamed from: n */
    public Parcelable f3661n;

    /* JADX INFO: renamed from: o */
    public c40 f3662o;

    /* JADX INFO: renamed from: p */
    public Long f3663p;

    public ConversationItemReceiveLikeView(Context context) {
        super(context);
        this.f3663p = 0L;
    }

    private String getSubContentText() {
        if (!NullChecker.a(this.f3660m)) {
            return "";
        }
        boolean zB3 = CoreModule.c.E0.B3(this.f3660m);
        int i = this.f3660m.location.distance;
        if (!zB3 && i < 5000 && i >= 100) {
            return i < 1000 ? String.format("离你%sm", Integer.valueOf(i)) : String.format("离你%skm", Float.valueOf(i / 1000.0f));
        }
        double dM18550o = mqi0.m18550o();
        User user = this.f3660m;
        long j = ((long) (dM18550o - user.location.updatedTime)) / 60000;
        if (j <= 180) {
            if (j <= 5) {
                return "当前在线";
            }
            return j <= 60 ? String.format("%s分钟前活跃", Long.valueOf(j)) : String.format("%s小时前活跃", Integer.valueOf((int) (j / 60)));
        }
        az50.a aVar = az50.Companion;
        String strF = aVar.f(((DbObject) user).id);
        if (!TextUtils.isEmpty(strF)) {
            return strF;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("喜欢你了❤️");
        arrayList.add("等你回应");
        arrayList.add("向你表白啦");
        int iNextInt = new Random().nextInt(3);
        if (iNextInt >= arrayList.size()) {
            return "";
        }
        aVar.p((String) arrayList.get(iNextInt), ((DbObject) this.f3660m).id);
        return (String) arrayList.get(iNextInt);
    }

    private void setClickListener(dml dmlVar) {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.fa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12885a.m4997g(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ga6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f13390a.m5000j(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m4995e(View view) {
        ja6.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m4996f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m4997g(View view) {
        this.f3651d.setVisibility(8);
        this.f3652e.setVisibility(8);
        this.f3658k.setVisibility(8);
        az50.a aVar = az50.Companion;
        aVar.o(true);
        aVar.a(m4996f(), ((DbObject) this.f3659l).id, "p_message,locked_match", CoreModule.P().a().Qr());
        if (NullChecker.a(this.f3660m)) {
            zvf0.u("e_locked_match", "p_messages_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f3660m).id), vwb.Y("cell_type", emr.INSTANCE.b() ? "seetrial" : "showhelike")});
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4998h(View view) {
        this.f3662o.b();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4999i(VListCell vListCell, VListCell.a aVar, int i) {
        az50.Companion.b(((DbObject) this.f3659l).id);
        CoreModule.c.T1.H3("");
        this.f3662o.b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m5000j(View view) {
        m5009s(m4996f());
        c40.b bVar = new c40.b(m4996f());
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        c40 c40VarF = bVar.I(m4996f().getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.ha6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13918a.m4998h(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.ia6
            /* JADX INFO: renamed from: a */
            public final void m16285a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f14452a.m4999i(vListCell, aVar, i);
            }
        }).F();
        this.f3662o = c40VarF;
        c40VarF.f();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m5001k(dml dmlVar, Conversation conversation) {
        this.f3659l = conversation;
        this.f3660m = CoreModule.K().getUserById(((DbObject) conversation).id);
        m5007q();
        setClickListener(dmlVar);
        m5008r();
    }

    /* JADX INFO: renamed from: l */
    public final void m5002l() {
        if (NullChecker.a(this.f3660m)) {
            this.f3655h.setTypeface(eqh0.c(3), 1);
            this.f3655h.setText(this.f3660m.name);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5003m() {
        if (NullChecker.a(this.f3660m)) {
            this.f3649b.m10025p0(this.f3660m);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5004n() {
        String str;
        long jM18550o = (long) ((mqi0.m18550o() - this.f3659l.latestTime) / 60000.0d);
        if (jM18550o <= 1) {
            str = "刚刚";
        } else if (jM18550o <= 60) {
            str = jM18550o + "分钟前";
        } else if (jM18550o <= 360) {
            str = (jM18550o / 60) + "小时前";
        } else if (jM18550o <= 2880) {
            str = "最近";
        } else if (jM18550o < 10080) {
            str = ((jM18550o / 24) / 60) + "天前";
        } else {
            str = null;
        }
        this.f3657j.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m5005o() {
        String str = (String) CoreModule.c.T1.z3().get();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s · %s", str, getSubContentText()));
        int color = getContext().getResources().getColor(w0c0.I);
        if (upa.z()) {
            color = Color.parseColor("#FF700A");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, str.length() + (upa.z() ? 0 : 2), 33);
        this.f3656i.setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4995e(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            int i = pi6.f18601Q;
            int i2 = t100.j;
            xdl0.D0((i2 * 2) + i, new View[]{this.f3648a});
            xdl0.C0(this.f3648a, i2 + i);
            rd6.m21523v(t100.d(11.0f) + i, this.f3649b);
            rd6.m21523v(i, this.f3649b.f8134d);
            rd6.m21518k0(this.f3655h, this.f3657j);
            rd6.m21514e0(this.f3656i);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5006p() {
        this.f3651d.setVisibility(8);
        this.f3652e.setVisibility(8);
        this.f3658k.setVisibility(8);
        if (gr9.g()) {
            this.f3652e.setVisibility(az50.Companion.e() ? 8 : 0);
        } else {
            this.f3651d.setVisibility(az50.Companion.e() ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5007q() {
        m5003m();
        m5006p();
        m5002l();
        m5005o();
        m5004n();
    }

    /* JADX INFO: renamed from: r */
    public final void m5008r() {
        if (System.currentTimeMillis() - this.f3663p.longValue() <= 300) {
            return;
        }
        this.f3663p = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.a(this.f3660m)) {
            zvf0.A("e_locked_match", "p_messages_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f3660m).id)});
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5009s(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(30L);
            return;
        }
        if (this.f3661n == null) {
            this.f3661n = VibrationEffect.createOneShot(30L, 150);
        }
        if (m96.m18330a(this.f3661n)) {
            vibrator.vibrate(n96.m18810a(this.f3661n));
        }
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3663p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3663p = 0L;
    }

    public ConversationItemReceiveLikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3663p = 0L;
    }
}
