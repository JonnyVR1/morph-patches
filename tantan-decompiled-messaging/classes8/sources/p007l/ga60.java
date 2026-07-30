package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.profile.R;
import l.ha60;
import l.xdl0;
import rx.c;
import v.VButton_FakeShadow;
import v.VMaterialEdit;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ga60 implements s7m<da60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f2752a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f2753b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f2754c;

    /* JADX INFO: renamed from: d */
    public da60 f2755d;

    /* JADX INFO: renamed from: e */
    public final PutongAct f2756e;

    public ga60(PutongAct putongAct) {
        this.f2756e = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m9191f(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m9192i(View view) {
        this.f2755d.m8878p0(this.f2753b.getText().toString());
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f2756e;
    }

    @Override // p007l.s7m
    public Act act() {
        return this.f2756e;
    }

    /* JADX INFO: renamed from: c */
    public View m9193c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ha60.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(da60 da60Var) {
        this.f2755d = da60Var;
    }

    /* JADX INFO: renamed from: e */
    public void m9195e(boolean z) {
        xdl0.y(this.f2754c, z);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9193c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public c<CharSequence> m9196j() {
        return this.f2753b.H();
    }

    /* JADX INFO: renamed from: r */
    public void m9197r() {
        this.f2752a.setTitle(act().getString(R.string.g3));
        this.f2752a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ea60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2617a.m9191f(view);
            }
        });
        this.f2754c.setOnClickListener(new View.OnClickListener() { // from class: l.fa60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2670a.m9192i(view);
            }
        });
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
