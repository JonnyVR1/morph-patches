package p006l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.PutongAct;
import l.s7m;
import p006l.b3f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class c3f0<Presenter extends b3f0, HoldAct extends PutongAct> implements s7m<Presenter> {

    /* JADX INFO: renamed from: a */
    public final HoldAct f9323a;

    /* JADX INFO: renamed from: b */
    public Presenter f9324b;

    public c3f0(@NonNull HoldAct holdact) {
        this.f9323a = holdact;
    }

    /* JADX INFO: renamed from: C0 */
    public Context mo13092C0() {
        return this.f9323a;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f9323a;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo476i1(Presenter presenter) {
        this.f9324b = presenter;
    }

    /* JADX INFO: renamed from: d */
    public void m13095d(TextView textView, TextView textView2) {
        djj0.m14049g(textView, textView2);
    }

    /* JADX INFO: renamed from: f */
    public void m13097f(Intent intent) {
        this.f9323a.startActivity(intent);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m13096e(View view) {
    }

    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void m13094c(String str, int i) {
    }
}
