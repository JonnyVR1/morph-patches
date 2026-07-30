package p002l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMBTTestFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.fia0;
import l.lqa;
import l.pj90;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VButton;
import v.VFrame;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eia0 implements s7m<cia0> {

    /* JADX INFO: renamed from: a */
    public VLinear f9801a;

    /* JADX INFO: renamed from: b */
    public TextView f9802b;

    /* JADX INFO: renamed from: c */
    public TextView f9803c;

    /* JADX INFO: renamed from: d */
    public VFrame f9804d;

    /* JADX INFO: renamed from: e */
    public VButton f9805e;

    /* JADX INFO: renamed from: f */
    public Act f9806f;

    /* JADX INFO: renamed from: g */
    public cia0 f9807g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopMBTTestFrag f9808h;

    public eia0(ProfileLoopMBTTestFrag profileLoopMBTTestFrag) {
        this.f9806f = profileLoopMBTTestFrag.act();
        this.f9808h = profileLoopMBTTestFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m12550f(View view) {
        Act act = this.f9806f;
        act.startActivity(MkWebViewAct.e2(act, "", String.format(pj90.o, this.f9808h.f1273E), true, true, true, true, (ResultReceiver) null));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12551C0() {
        return this.f9806f;
    }

    /* JADX INFO: renamed from: b */
    public View m12552b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fia0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m12557i1(cia0 cia0Var) {
        this.f9807g = cia0Var;
    }

    /* JADX INFO: renamed from: d */
    public Bundle m12554d() {
        return this.f9808h.getArguments();
    }

    /* JADX INFO: renamed from: e */
    public void m12555e(LoopInputType loopInputType) {
        this.f9802b.setTypeface(Typeface.DEFAULT_BOLD);
        act().m1991a2().m2030W0(this.f9808h);
        xdl0.E0(this.f9805e, new View.OnClickListener() { // from class: l.dia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9287a.m12550f(view);
            }
        });
        if (lqa.f() && this.f9808h.m2081U4()) {
            String strM = pj90.m(this.f9808h.f1277z);
            xdl0.X(this.f9804d, t100.d(0.0f));
            if (TextUtils.isEmpty(strM)) {
                return;
            }
            xdl0.M(this.f9803c, true);
            this.f9803c.setTextSize(15.0f);
            this.f9803c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f9803c.setText(String.format("预计符合%s人的理想型", strM));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12556i() {
        this.f9808h.mo2072H();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12552b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
