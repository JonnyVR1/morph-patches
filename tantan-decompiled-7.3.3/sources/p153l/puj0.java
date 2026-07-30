package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.List;
import p151v.VFrame;
import p153l.ouj0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class puj0<T extends ouj0> implements iam<T> {

    /* JADX INFO: renamed from: a */
    public VFrame f154192a;

    /* JADX INFO: renamed from: b */
    public View f154193b;

    /* JADX INFO: renamed from: c */
    public T f154194c;

    public puj0(VFrame vFrame) {
        this.f154192a = vFrame;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f154192a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(T t) {
        this.f154194c = t;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo106720c();

    /* JADX INFO: renamed from: d */
    public abstract int mo106721d();

    /* JADX INFO: renamed from: e */
    public abstract int mo106722e();

    /* JADX INFO: renamed from: f */
    public void m173886f() {
        if (this.f154193b == null) {
            this.f154193b = LayoutInflater.from(this.f154192a.getContext()).inflate(mo106721d(), (ViewGroup) null);
            mo106720c();
        }
        if (this.f154192a.findViewById(mo106722e()) == null) {
            this.f154192a.addView(this.f154193b);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m173887i() {
        View view;
        if (this.f154192a == null || (view = this.f154193b) == null || view.getParent() == null) {
            return;
        }
        this.f154192a.removeView(this.f154193b);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo106723j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list);
}
