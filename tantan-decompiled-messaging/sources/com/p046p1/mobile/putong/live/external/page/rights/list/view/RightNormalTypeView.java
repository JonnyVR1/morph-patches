package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.g1d0;
import p149l.g3c0;
import p149l.p4d0;
import p149l.r4d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightNormalTypeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightNormalTypeView f46102d;

    /* JADX INFO: renamed from: e */
    public VText f46103e;

    /* JADX INFO: renamed from: f */
    public VText f46104f;

    /* JADX INFO: renamed from: g */
    public VImage f46105g;

    /* JADX INFO: renamed from: h */
    public g1d0 f46106h;

    /* JADX INFO: renamed from: i */
    public p4d0 f46107i;

    public RightNormalTypeView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m70635l0(View view) {
        m70636m0();
    }

    /* JADX INFO: renamed from: m0 */
    private void m70636m0() {
        g1d0 g1d0Var = this.f46106h;
        if (g1d0Var != null) {
            p4d0 p4d0Var = this.f46107i;
            g1d0Var.mo124073e(p4d0Var, !p4d0Var.f147160i);
            m70640n0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70637i0(View view) {
        r4d0.m177786a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m70638j0(p4d0 p4d0Var) {
        if (TextUtils.isEmpty(p4d0Var.f147158g)) {
            return "";
        }
        int length = p4d0Var.f147158g.length();
        String str = p4d0Var.f147158g;
        return length > 8 ? str.substring(0, 8).concat("...") : str;
    }

    /* JADX INFO: renamed from: k0 */
    public final CharSequence m70639k0(p4d0 p4d0Var) {
        boolean z = p4d0Var.f147159h;
        boolean zIsEmpty = TextUtils.isEmpty(p4d0Var.f147158g);
        String strM70638j0 = zIsEmpty ? "" : m70638j0(p4d0Var);
        if (!z) {
            return p4d0Var.f72587d ? getContext().getString(R$string.f44166f1) : getContext().getString(R$string.f44163e1);
        }
        String string = getContext().getString(R$string.f44187m1);
        if (p4d0Var.f72587d) {
            string = getContext().getString(R$string.f44190n1);
        }
        String str = String.format(string, zIsEmpty ? getContext().getString(R$string.f44193o1) : strM70638j0);
        if (zIsEmpty) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#ff3a00"));
        int iIndexOf = str.indexOf(strM70638j0);
        spannableString.setSpan(foregroundColorSpan, iIndexOf, strM70638j0.length() + iIndexOf, 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m70640n0() {
        this.f46105g.setImageResource(this.f46107i.f147160i ? g3c0.f100383E : g3c0.f100381C);
    }

    /* JADX INFO: renamed from: o0 */
    public void m70641o0(p4d0 p4d0Var, g1d0 g1d0Var) {
        this.f46107i = p4d0Var;
        this.f46106h = g1d0Var;
        this.f46103e.setText(p4d0Var.f147159h ? R$string.f44196p1 : R$string.f44169g1);
        this.f46104f.setText(m70639k0(p4d0Var));
        m70640n0();
        setOnClickListener(new View.OnClickListener() { // from class: l.q4d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152621a.m70635l0(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70637i0(this);
    }

    public RightNormalTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightNormalTypeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
