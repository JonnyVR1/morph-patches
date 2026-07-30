package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.List;
import p147v.VFrame;
import p149l.llj0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mlj0<T extends llj0> implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public VFrame f134448a;

    /* JADX INFO: renamed from: b */
    public View f134449b;

    /* JADX INFO: renamed from: c */
    public T f134450c;

    public mlj0(VFrame vFrame) {
        this.f134448a = vFrame;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134448a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(T t) {
        this.f134450c = t;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo112637c();

    /* JADX INFO: renamed from: d */
    public abstract int mo112638d();

    /* JADX INFO: renamed from: e */
    public abstract int mo112639e();

    /* JADX INFO: renamed from: f */
    public void m155163f() {
        if (this.f134449b == null) {
            this.f134449b = LayoutInflater.from(this.f134448a.getContext()).inflate(mo112638d(), (ViewGroup) null);
            mo112637c();
        }
        if (this.f134448a.findViewById(mo112639e()) == null) {
            this.f134448a.addView(this.f134449b);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m155164i() {
        View view;
        if (this.f134448a == null || (view = this.f134449b) == null || view.getParent() == null) {
            return;
        }
        this.f134448a.removeView(this.f134449b);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo112640j(BLiveUndercoverGame bLiveUndercoverGame, int i, List<BLiveUserMask> list);
}
