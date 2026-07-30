package com.p000p1.mobile.putong.core.p004ui.seepop;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.seepop.NewLikeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.au20;
import l.cok;
import l.cwf0;
import l.d30;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.j760;
import l.qed0;
import l.t100;
import l.vtd;
import l.vwb;
import l.xdl0;
import p006l.f6c0;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewLikeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5583a;

    /* JADX INFO: renamed from: b */
    public VFrame f5584b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5585c;

    /* JADX INFO: renamed from: d */
    public VFrame f5586d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5587e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5588f;

    /* JADX INFO: renamed from: g */
    public VFrame f5589g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5590h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f5591i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f5592j;

    /* JADX INFO: renamed from: k */
    public VText f5593k;

    /* JADX INFO: renamed from: l */
    public VText f5594l;

    /* JADX INFO: renamed from: m */
    public VText f5595m;

    /* JADX INFO: renamed from: n */
    public VText f5596n;

    public NewLikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static String m8356B(User user) {
        return user.fp().profileSize(t100.O).formatted();
    }

    /* JADX INFO: renamed from: E */
    public static void m8357E(Act act, CoreLikers.C0145a c0145a, final d30 d30Var) {
        if (NullChecker.a(act) && NullChecker.a(c0145a) && NullChecker.a(c0145a.f3261d) && c0145a.f3261d.size() != 0 && c0145a.f3260c != 0) {
            final cwf0 cwf0VarC = i0e.c("p_new_like_notification_popup", NewLikeView.class.getName());
            cwf0VarC.p(ic50.j().f().V("p_new_like_notification_popup", new j760[]{vwb.Y("tooltips_trigger_mode", "passive")}));
            Dialog.e eVarB = act.dialog().u().M(f6c0.f11864L7).B(false);
            eVarB.i0(new DialogInterface.OnKeyListener() { // from class: l.vt20
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return NewLikeView.m8361v(dialogInterface, i, keyEvent);
                }
            });
            final Dialog dialogZ = eVarB.z();
            ((NewLikeView) dialogZ.P()).m8363C(c0145a, new d30() { // from class: l.wt20
                public final void call() {
                    NewLikeView.m8359s(d30Var, dialogZ);
                }
            }, new cok(dialogZ));
            dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xt20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.e(cwf0VarC);
                }
            });
            i0e.f(cwf0VarC);
            dialogZ.show();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8359s(d30 d30Var, Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m8361v(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m8363C(@NonNull CoreLikers.C0145a c0145a, final d30 d30Var, final d30 d30Var2) {
        int i;
        boolean z = c0145a.f3260c == 1;
        int i2 = Integer.MAX_VALUE;
        for (User user : c0145a.f3261d) {
            if (!CoreModule.f1534c.f3550E0.m26464B3(user) && i2 > (i = user.location.distance)) {
                i2 = i;
            }
        }
        if (c0145a.f3261d.size() == 1) {
            xdl0.M(this.f5584b, true);
            qib0.f19782G.m12749O(this.f5585c, m8356B(c0145a.f3261d.get(0)), 2, 30);
        } else if (c0145a.f3261d.size() == 2) {
            xdl0.M(this.f5586d, true);
            qib0.f19782G.m12749O(this.f5587e, m8356B(c0145a.f3261d.get(0)), 2, 30);
            qib0.f19782G.m12749O(this.f5588f, m8356B(c0145a.f3261d.get(1)), 2, 30);
        } else {
            xdl0.M(this.f5589g, true);
            qib0.f19782G.m12749O(this.f5592j, m8356B(c0145a.f3261d.get(0)), 2, 30);
            qib0.f19782G.m12749O(this.f5590h, m8356B(c0145a.f3261d.get(1)), 2, 30);
            qib0.f19782G.m12749O(this.f5591i, m8356B(c0145a.f3261d.get(2)), 2, 30);
        }
        int i3 = c0145a.f3260c;
        String string = TextUtils.concat(" ", i3 > 99 ? "99+" : String.valueOf(i3), " ").toString();
        if (z) {
            this.f5593k.setText(CoreModule.f1533b.getString(R$string.f2967uj));
        } else {
            String str = String.format(CoreModule.f1533b.getString(R$string.f2847qj), string);
            int iIndexOf = str.indexOf(string);
            if (iIndexOf != -1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#212121"), t100.f(22)), iIndexOf, string.length() + iIndexOf, 33);
                this.f5593k.setText(spannableStringBuilder);
            } else {
                this.f5593k.setText(str);
            }
        }
        if (i2 <= 10000) {
            String strP = i0g0.p(i2, false);
            String str2 = String.format(CoreModule.f1533b.getString(z ? R$string.f2907sj : R$string.f2786oj), strP);
            int iIndexOf2 = str2.indexOf(strP);
            qed0 qed0Var = new qed0(vtd.a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new qed0.a[]{new qed0.a(3, this.f5594l.getTextSize(), strP.length() + iIndexOf2)});
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            spannableStringBuilder2.setSpan(qed0Var, iIndexOf2, strP.length() + iIndexOf2, 18);
            this.f5594l.setText(spannableStringBuilder2);
        } else {
            this.f5594l.setText(z ? R$string.f2937tj : R$string.f2817pj);
        }
        this.f5595m.setText(z ? R$string.f2877rj : R$string.f2755nj);
        xdl0.E0(this.f5595m, new View.OnClickListener() { // from class: l.yt20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.E0(this.f5596n, new View.OnClickListener() { // from class: l.zt20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        qib0.f19782G.m12744L0(this.f5583a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhZNUNBQVdCQllPSkJaWDVWNlVGVFkySVRCSEUyQzE0IiwidyI6OTMwLCJoIjo3MjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjQ2NzcxODU1NDk1NzY1fQ.webp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8364z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m8364z(View view) {
        au20.a(this, view);
    }

    public NewLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
