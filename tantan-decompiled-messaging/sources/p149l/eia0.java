package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMBTTestFrag;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p147v.VButton;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class eia0 implements s7m<cia0> {

    /* JADX INFO: renamed from: a */
    public VLinear f91574a;

    /* JADX INFO: renamed from: b */
    public TextView f91575b;

    /* JADX INFO: renamed from: c */
    public TextView f91576c;

    /* JADX INFO: renamed from: d */
    public VFrame f91577d;

    /* JADX INFO: renamed from: e */
    public VButton f91578e;

    /* JADX INFO: renamed from: f */
    public Act f91579f;

    /* JADX INFO: renamed from: g */
    public cia0 f91580g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopMBTTestFrag f91581h;

    public eia0(ProfileLoopMBTTestFrag profileLoopMBTTestFrag) {
        this.f91579f = profileLoopMBTTestFrag.act();
        this.f91581h = profileLoopMBTTestFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m116662f(View view) {
        Act act = this.f91579f;
        act.startActivity(MkWebViewAct.m80240e2(act, "", String.format(pj90.f149727o, this.f91581h.f33451E), true, true, true, true, null));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f91579f;
    }

    /* JADX INFO: renamed from: b */
    public View m116663b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fia0.m121504b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cia0 cia0Var) {
        this.f91580g = cia0Var;
    }

    /* JADX INFO: renamed from: d */
    public Bundle m116665d() {
        return this.f91581h.getArguments();
    }

    /* JADX INFO: renamed from: e */
    public void m116666e(LoopInputType loopInputType) {
        this.f91575b.setTypeface(Typeface.DEFAULT_BOLD);
        ((ProfileInfoLoopEditAct) act()).m51509a2().m51548W0(this.f91581h);
        xdl0.m208329E0(this.f91578e, new View.OnClickListener() { // from class: l.dia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86370a.m116662f(view);
            }
        });
        if (lqa.m150968f() && this.f91581h.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f91581h.f33455z);
            xdl0.m208360X(this.f91577d, t100.m186890d(0.0f));
            if (TextUtils.isEmpty(strM169801m)) {
                return;
            }
            xdl0.m208344M(this.f91576c, true);
            this.f91576c.setTextSize(15.0f);
            this.f91576c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f91576c.setText(String.format("预计符合%s人的理想型", strM169801m));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m116667i() {
        this.f91581h.mo51586H();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m116663b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
