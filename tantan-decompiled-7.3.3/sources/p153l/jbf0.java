package p153l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.ibf0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jbf0<Presenter extends ibf0, HoldAct extends PutongAct> implements iam<Presenter> {

    /* JADX INFO: renamed from: a */
    public final HoldAct f119872a;

    /* JADX INFO: renamed from: b */
    public Presenter f119873b;

    public jbf0(@NonNull HoldAct holdact) {
        this.f119872a = holdact;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f119872a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f119872a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(Presenter presenter) {
        this.f119873b = presenter;
    }

    /* JADX INFO: renamed from: d */
    public void m144219d(TextView textView, TextView textView2) {
        gsj0.m132063g(textView, textView2);
    }

    /* JADX INFO: renamed from: f */
    public void m144221f(Intent intent) {
        this.f119872a.startActivity(intent);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m144220e(View view) {
    }

    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void m144218c(String str, int i) {
    }
}
