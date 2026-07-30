package com.p051p1.mobile.putong.core.p058ui.seepop;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.seepop.NewLikeView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.jvd;
import p153l.jyb;
import p153l.k230;
import p153l.kec0;
import p153l.l4g0;
import p153l.pk50;
import p153l.q8g0;
import p153l.qa00;
import p153l.smd0;
import p153l.sqk;
import p153l.uqb0;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class NewLikeView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f36650a;

    /* JADX INFO: renamed from: b */
    public VFrame f36651b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36652c;

    /* JADX INFO: renamed from: d */
    public VFrame f36653d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f36654e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f36655f;

    /* JADX INFO: renamed from: g */
    public VFrame f36656g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36657h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f36658i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f36659j;

    /* JADX INFO: renamed from: k */
    public VText f36660k;

    /* JADX INFO: renamed from: l */
    public VText f36661l;

    /* JADX INFO: renamed from: m */
    public VText f36662m;

    /* JADX INFO: renamed from: n */
    public VText f36663n;

    public NewLikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static String m56173B(User user) {
        return user.m61308fp().profileSize(qa00.f156302O).formatted();
    }

    /* JADX INFO: renamed from: E */
    public static void m56174E(Act act, CoreLikers.C4870a c4870a, final x20 x20Var) {
        if (NullChecker.m82486a(act) && NullChecker.m82486a(c4870a) && NullChecker.m82486a(c4870a.f20014d) && c4870a.f20014d.size() != 0 && c4870a.f20013c != 0) {
            final l4g0 l4g0VarM204399c = w1e.m204399c("p_new_like_notification_popup", NewLikeView.class.getName());
            l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V("p_new_like_notification_popup", jyb.m147494Y("tooltips_trigger_mode", "passive")));
            Dialog.C4460e c4460eM21495B = act.dialog().m21556u().m21516M(kec0.f125616S7).m21495B(false);
            c4460eM21495B.m21538i0(new DialogInterface.OnKeyListener() { // from class: l.f230
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return NewLikeView.m56178v(dialogInterface, i, keyEvent);
                }
            });
            final Dialog dialogM21566z = c4460eM21495B.m21566z();
            ((NewLikeView) dialogM21566z.m21457P()).m56180C(c4870a, new x20() { // from class: l.g230
                @Override // p153l.x20
                public final void call() {
                    NewLikeView.m56176s(x20Var, dialogM21566z);
                }
            }, new sqk(dialogM21566z));
            dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.h230
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            });
            w1e.m204402f(l4g0VarM204399c);
            dialogM21566z.show();
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m56176s(x20 x20Var, Dialog dialog) {
        x20Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m56178v(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX INFO: renamed from: C */
    public void m56180C(@NonNull CoreLikers.C4870a c4870a, final x20 x20Var, final x20 x20Var2) {
        int i;
        boolean z = c4870a.f20013c == 1;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (User user : c4870a.f20014d) {
            if (!CoreModule.f18264c.f20303E0.m141060B3(user) && i2 > (i = user.location.distance)) {
                i2 = i;
            }
        }
        if (c4870a.f20014d.size() == 1) {
            bnl0.m105524M(this.f36651b, true);
            uqb0.f180374G.m127120O(this.f36652c, m56173B(c4870a.f20014d.get(0)), 2, 30);
        } else if (c4870a.f20014d.size() == 2) {
            bnl0.m105524M(this.f36653d, true);
            uqb0.f180374G.m127120O(this.f36654e, m56173B(c4870a.f20014d.get(0)), 2, 30);
            uqb0.f180374G.m127120O(this.f36655f, m56173B(c4870a.f20014d.get(1)), 2, 30);
        } else {
            bnl0.m105524M(this.f36656g, true);
            uqb0.f180374G.m127120O(this.f36659j, m56173B(c4870a.f20014d.get(0)), 2, 30);
            uqb0.f180374G.m127120O(this.f36657h, m56173B(c4870a.f20014d.get(1)), 2, 30);
            uqb0.f180374G.m127120O(this.f36658i, m56173B(c4870a.f20014d.get(2)), 2, 30);
        }
        int i3 = c4870a.f20013c;
        String string = TextUtils.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, i3 > 99 ? "99+" : String.valueOf(i3), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).toString();
        if (z) {
            this.f36660k.setText(CoreModule.f18263b.getString(R$string.f18796Qj));
        } else {
            String str = String.format(CoreModule.f18263b.getString(R$string.f18676Mj), string);
            int iIndexOf = str.indexOf(string);
            if (iIndexOf != -1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#212121"), qa00.m175861f(22)), iIndexOf, string.length() + iIndexOf, 33);
                this.f36660k.setText(spannableStringBuilder);
            } else {
                this.f36660k.setText(str);
            }
        }
        if (i2 <= 10000) {
            String strM175811p = q8g0.m175811p(i2, false);
            String str2 = String.format(CoreModule.f18263b.getString(z ? R$string.f18736Oj : R$string.f18615Kj), strM175811p);
            int iIndexOf2 = str2.indexOf(strM175811p);
            smd0 smd0Var = new smd0(jvd.m147011a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new smd0.C20104a(3, this.f36661l.getTextSize(), strM175811p.length() + iIndexOf2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            spannableStringBuilder2.setSpan(smd0Var, iIndexOf2, strM175811p.length() + iIndexOf2, 18);
            this.f36661l.setText(spannableStringBuilder2);
        } else {
            this.f36661l.setText(z ? R$string.f18766Pj : R$string.f18646Lj);
        }
        this.f36662m.setText(z ? R$string.f18706Nj : R$string.f18584Jj);
        bnl0.m105509E0(this.f36662m, new View.OnClickListener() { // from class: l.i230
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f36663n, new View.OnClickListener() { // from class: l.j230
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        uqb0.f180374G.m127115L0(this.f36650a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhZNUNBQVdCQllPSkJaWDVWNlVGVFkySVRCSEUyQzE0IiwidyI6OTMwLCJoIjo3MjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NjQ2NzcxODU1NDk1NzY1fQ.webp");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56181z(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m56181z(View view) {
        k230.m147942a(this, view);
    }

    public NewLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
