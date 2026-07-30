package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class y4o0 implements s7m<u4o0> {

    /* JADX INFO: renamed from: a */
    public View f196316a;

    /* JADX INFO: renamed from: b */
    public VText f196317b;

    /* JADX INFO: renamed from: c */
    public VText f196318c;

    /* JADX INFO: renamed from: d */
    public VText f196319d;

    /* JADX INFO: renamed from: f */
    public u4o0 f196321f;

    /* JADX INFO: renamed from: e */
    public DialogC12611a f196320e = null;

    /* JADX INFO: renamed from: g */
    public boolean f196322g = false;

    /* JADX INFO: renamed from: h */
    public boolean f196323h = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m212935i(View view) {
        m212940f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m212936j(View view) {
        if (this.f196322g) {
            return;
        }
        this.f196321f.m191762L3();
        m212940f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m212937k(View view) {
        if (this.f196323h) {
            return;
        }
        this.f196321f.m191763M3();
        m212940f();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f196321f.act();
    }

    /* JADX INFO: renamed from: d */
    public View m212938d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z4o0.m217115b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u4o0 u4o0Var) {
        this.f196321f = u4o0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m212940f() {
        if (NullChecker.m81303a(this.f196320e)) {
            this.f196320e.dismiss();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public void m212941l(boolean z, boolean z2) {
        if (this.f196320e == null) {
            View viewM212938d = m212938d(LayoutInflater.from(this.f196321f.act()), null);
            xdl0.m208329E0(this.f196319d, new View.OnClickListener() { // from class: l.v4o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179964a.m212935i(view);
                }
            });
            xdl0.m208329E0(this.f196317b, new View.OnClickListener() { // from class: l.w4o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184580a.m212936j(view);
                }
            });
            xdl0.m208329E0(this.f196318c, new View.OnClickListener() { // from class: l.x4o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191043a.m212937k(view);
                }
            });
            this.f196320e = new DialogC12611a(act(), viewM212938d);
        }
        this.f196322g = z;
        this.f196323h = z2;
        VText vText = this.f196317b;
        if (z) {
            vText.setTextColor(act().getResources().getColor(h1c0.f105377j1));
            this.f196317b.setText(w8u.m202217t(R$string.f47155bj) + w8u.m202217t(R$string.f47133aj));
        } else {
            vText.setTextColor(act().getResources().getColor(h1c0.f105362e1));
            this.f196317b.setText(w8u.m202217t(R$string.f47155bj));
        }
        VText vText2 = this.f196318c;
        if (z2) {
            vText2.setTextColor(act().getResources().getColor(h1c0.f105377j1));
            this.f196318c.setText(w8u.m202217t(R$string.f47177cj) + w8u.m202217t(R$string.f47133aj));
        } else {
            vText2.setTextColor(act().getResources().getColor(h1c0.f105362e1));
            this.f196318c.setText(w8u.m202217t(R$string.f47177cj));
        }
        this.f196320e.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
