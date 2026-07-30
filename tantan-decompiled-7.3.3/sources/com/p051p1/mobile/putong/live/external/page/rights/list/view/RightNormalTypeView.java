package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.j9d0;
import p153l.mbc0;
import p153l.scd0;
import p153l.ucd0;

/* JADX INFO: loaded from: classes9.dex */
public class RightNormalTypeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public RightNormalTypeView f46950d;

    /* JADX INFO: renamed from: e */
    public VText f46951e;

    /* JADX INFO: renamed from: f */
    public VText f46952f;

    /* JADX INFO: renamed from: g */
    public VImage f46953g;

    /* JADX INFO: renamed from: h */
    public j9d0 f46954h;

    /* JADX INFO: renamed from: i */
    public scd0 f46955i;

    public RightNormalTypeView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m71818l0(View view) {
        m71819m0();
    }

    /* JADX INFO: renamed from: m0 */
    private void m71819m0() {
        j9d0 j9d0Var = this.f46954h;
        if (j9d0Var != null) {
            scd0 scd0Var = this.f46955i;
            j9d0Var.mo143940e(scd0Var, !scd0Var.f167242i);
            m71823n0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71820i0(View view) {
        ucd0.m195386a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m71821j0(scd0 scd0Var) {
        if (TextUtils.isEmpty(scd0Var.f167240g)) {
            return "";
        }
        int length = scd0Var.f167240g.length();
        String str = scd0Var.f167240g;
        return length > 8 ? str.substring(0, 8).concat("...") : str;
    }

    /* JADX INFO: renamed from: k0 */
    public final CharSequence m71822k0(scd0 scd0Var) {
        boolean z = scd0Var.f167241h;
        boolean zIsEmpty = TextUtils.isEmpty(scd0Var.f167240g);
        String strM71821j0 = zIsEmpty ? "" : m71821j0(scd0Var);
        if (!z) {
            return scd0Var.f92629d ? getContext().getString(R$string.f45014f1) : getContext().getString(R$string.f45011e1);
        }
        String string = getContext().getString(R$string.f45035m1);
        if (scd0Var.f92629d) {
            string = getContext().getString(R$string.f45038n1);
        }
        String str = String.format(string, zIsEmpty ? getContext().getString(R$string.f45041o1) : strM71821j0);
        if (zIsEmpty) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#ff3a00"));
        int iIndexOf = str.indexOf(strM71821j0);
        spannableString.setSpan(foregroundColorSpan, iIndexOf, strM71821j0.length() + iIndexOf, 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m71823n0() {
        this.f46953g.setImageResource(this.f46955i.f167242i ? mbc0.f135645E : mbc0.f135643C);
    }

    /* JADX INFO: renamed from: o0 */
    public void m71824o0(scd0 scd0Var, j9d0 j9d0Var) {
        this.f46955i = scd0Var;
        this.f46954h = j9d0Var;
        this.f46951e.setText(scd0Var.f167241h ? R$string.f45044p1 : R$string.f45017g1);
        this.f46952f.setText(m71822k0(scd0Var));
        m71823n0();
        setOnClickListener(new View.OnClickListener() { // from class: l.tcd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173229a.m71818l0(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71820i0(this);
    }

    public RightNormalTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RightNormalTypeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
