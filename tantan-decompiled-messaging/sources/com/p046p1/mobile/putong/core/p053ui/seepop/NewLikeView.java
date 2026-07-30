package com.p046p1.mobile.putong.core.p053ui.seepop;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.seepop.NewLikeView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.au20;
import p149l.cok;
import p149l.cwf0;
import p149l.d30;
import p149l.f6c0;
import p149l.i0e;
import p149l.i0g0;
import p149l.ic50;
import p149l.qed0;
import p149l.qib0;
import p149l.t100;
import p149l.vtd;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class NewLikeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f35802a;

    /* JADX INFO: renamed from: b */
    public VFrame f35803b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35804c;

    /* JADX INFO: renamed from: d */
    public VFrame f35805d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f35806e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f35807f;

    /* JADX INFO: renamed from: g */
    public VFrame f35808g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35809h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f35810i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f35811j;

    /* JADX INFO: renamed from: k */
    public VText f35812k;

    /* JADX INFO: renamed from: l */
    public VText f35813l;

    /* JADX INFO: renamed from: m */
    public VText f35814m;

    /* JADX INFO: renamed from: n */
    public VText f35815n;

    public NewLikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static String m54990B(User user) {
        return user.m60124fp().profileSize(t100.f167240O).formatted();
    }

    /* JADX INFO: renamed from: E */
    public static void m54991E(Act act, CoreLikers.C4719a c4719a, final d30 d30Var) {
        if (NullChecker.m81303a(act) && NullChecker.m81303a(c4719a) && NullChecker.m81303a(c4719a.f19272d) && c4719a.f19272d.size() != 0 && c4719a.f19271c != 0) {
            final cwf0 cwf0VarM133794c = i0e.m133794c("p_new_like_notification_popup", NewLikeView.class.getName());
            cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V("p_new_like_notification_popup", vwb.m200311Y("tooltips_trigger_mode", "passive")));
            Dialog.C4309e c4309eM20496B = act.dialog().m20557u().m20517M(f6c0.f95450L7).m20496B(false);
            c4309eM20496B.m20539i0(new DialogInterface.OnKeyListener() { // from class: l.vt20
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return NewLikeView.m54995v(dialogInterface, i, keyEvent);
                }
            });
            final Dialog dialogM20567z = c4309eM20496B.m20567z();
            ((NewLikeView) dialogM20567z.m20458P()).m54997C(c4719a, new d30() { // from class: l.wt20
                @Override // p149l.d30
                public final void call() {
                    NewLikeView.m54993s(d30Var, dialogM20567z);
                }
            }, new cok(dialogM20567z));
            dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xt20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            });
            i0e.m133797f(cwf0VarM133794c);
            dialogM20567z.show();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m54993s(d30 d30Var, Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m54995v(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m54997C(@NonNull CoreLikers.C4719a c4719a, final d30 d30Var, final d30 d30Var2) {
        int i;
        boolean z = c4719a.f19271c == 1;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (User user : c4719a.f19272d) {
            if (!CoreModule.f17545c.f19561E0.m203772B3(user) && i2 > (i = user.location.distance)) {
                i2 = i;
            }
        }
        if (c4719a.f19272d.size() == 1) {
            xdl0.m208344M(this.f35803b, true);
            qib0.f154691G.m102336O(this.f35804c, m54990B(c4719a.f19272d.get(0)), 2, 30);
        } else if (c4719a.f19272d.size() == 2) {
            xdl0.m208344M(this.f35805d, true);
            qib0.f154691G.m102336O(this.f35806e, m54990B(c4719a.f19272d.get(0)), 2, 30);
            qib0.f154691G.m102336O(this.f35807f, m54990B(c4719a.f19272d.get(1)), 2, 30);
        } else {
            xdl0.m208344M(this.f35808g, true);
            qib0.f154691G.m102336O(this.f35811j, m54990B(c4719a.f19272d.get(0)), 2, 30);
            qib0.f154691G.m102336O(this.f35809h, m54990B(c4719a.f19272d.get(1)), 2, 30);
            qib0.f154691G.m102336O(this.f35810i, m54990B(c4719a.f19272d.get(2)), 2, 30);
        }
        int i3 = c4719a.f19271c;
        String string = TextUtils.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, i3 > 99 ? "99+" : String.valueOf(i3), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).toString();
        if (z) {
            this.f35812k.setText(CoreModule.f17544b.getString(R$string.f18978uj));
        } else {
            String str = String.format(CoreModule.f17544b.getString(R$string.f18858qj), string);
            int iIndexOf = str.indexOf(string);
            if (iIndexOf != -1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#212121"), t100.m186892f(22)), iIndexOf, string.length() + iIndexOf, 33);
                this.f35812k.setText(spannableStringBuilder);
            } else {
                this.f35812k.setText(str);
            }
        }
        if (i2 <= 10000) {
            String strM133876p = i0g0.m133876p(i2, false);
            String str2 = String.format(CoreModule.f17544b.getString(z ? R$string.f18918sj : R$string.f18797oj), strM133876p);
            int iIndexOf2 = str2.indexOf(strM133876p);
            qed0 qed0Var = new qed0(vtd.m199996a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new qed0.C19470a(3, this.f35813l.getTextSize(), strM133876p.length() + iIndexOf2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            spannableStringBuilder2.setSpan(qed0Var, iIndexOf2, strM133876p.length() + iIndexOf2, 18);
            this.f35813l.setText(spannableStringBuilder2);
        } else {
            this.f35813l.setText(z ? R$string.f18948tj : R$string.f18828pj);
        }
        this.f35814m.setText(z ? R$string.f18888rj : R$string.f18766nj);
        xdl0.m208329E0(this.f35814m, new View.OnClickListener() { // from class: l.yt20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f35815n, new View.OnClickListener() { // from class: l.zt20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        qib0.f154691G.m102331L0(this.f35802a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhZNUNBQVdCQllPSkJaWDVWNlVGVFkySVRCSEUyQzE0IiwidyI6OTMwLCJoIjo3MjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjQ2NzcxODU1NDk1NzY1fQ.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54998z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m54998z(View view) {
        au20.m98947a(this, view);
    }

    public NewLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
