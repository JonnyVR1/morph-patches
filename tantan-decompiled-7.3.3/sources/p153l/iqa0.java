package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMBTTestFrag;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p151v.VButton;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class iqa0 implements iam<gqa0> {

    /* JADX INFO: renamed from: a */
    public VLinear f116393a;

    /* JADX INFO: renamed from: b */
    public TextView f116394b;

    /* JADX INFO: renamed from: c */
    public TextView f116395c;

    /* JADX INFO: renamed from: d */
    public VFrame f116396d;

    /* JADX INFO: renamed from: e */
    public VButton f116397e;

    /* JADX INFO: renamed from: f */
    public Act f116398f;

    /* JADX INFO: renamed from: g */
    public gqa0 f116399g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopMBTTestFrag f116400h;

    public iqa0(ProfileLoopMBTTestFrag profileLoopMBTTestFrag) {
        this.f116398f = profileLoopMBTTestFrag.act();
        this.f116400h = profileLoopMBTTestFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m141663f(View view) {
        Act act = this.f116398f;
        act.startActivity(MkWebViewAct.m81423g2(act, "", String.format(tr90.f175821o, this.f116400h.f34299E), true, true, true, true, null));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116398f;
    }

    /* JADX INFO: renamed from: b */
    public View m141664b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jqa0.m146568b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gqa0 gqa0Var) {
        this.f116399g = gqa0Var;
    }

    /* JADX INFO: renamed from: d */
    public Bundle m141666d() {
        return this.f116400h.getArguments();
    }

    /* JADX INFO: renamed from: e */
    public void m141667e(LoopInputType loopInputType) {
        this.f116394b.setTypeface(Typeface.DEFAULT_BOLD);
        ((ProfileInfoLoopEditAct) act()).m52692b2().m52731W0(this.f116400h);
        bnl0.m105509E0(this.f116397e, new View.OnClickListener() { // from class: l.hqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111103a.m141663f(view);
            }
        });
        if (xra.m212787f() && this.f116400h.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f116400h.f34303z);
            bnl0.m105540X(this.f116396d, qa00.m175859d(0.0f));
            if (TextUtils.isEmpty(strM192426m)) {
                return;
            }
            bnl0.m105524M(this.f116395c, true);
            this.f116395c.setTextSize(15.0f);
            this.f116395c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f116395c.setText(String.format("预计符合%s人的理想型", strM192426m));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m141668i() {
        this.f116400h.mo52769H();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m141664b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
