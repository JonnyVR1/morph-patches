package p149l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.b3f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c3f0<Presenter extends b3f0, HoldAct extends PutongAct> implements s7m<Presenter> {

    /* JADX INFO: renamed from: a */
    public final HoldAct f78941a;

    /* JADX INFO: renamed from: b */
    public Presenter f78942b;

    public c3f0(@NonNull HoldAct holdact) {
        this.f78941a = holdact;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78941a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f78941a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(Presenter presenter) {
        this.f78942b = presenter;
    }

    /* JADX INFO: renamed from: d */
    public void m105017d(TextView textView, TextView textView2) {
        djj0.m112086g(textView, textView2);
    }

    /* JADX INFO: renamed from: f */
    public void m105019f(Intent intent) {
        this.f78941a.startActivity(intent);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m105018e(View view) {
    }

    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void m105016c(String str, int i) {
    }
}
