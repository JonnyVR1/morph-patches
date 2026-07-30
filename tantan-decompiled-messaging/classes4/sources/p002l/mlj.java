package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import l.i54;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mlj {

    /* JADX INFO: renamed from: b */
    public BLiveUserMask f15443b;

    /* JADX INFO: renamed from: c */
    public boolean f15444c;

    /* JADX INFO: renamed from: d */
    public String f15445d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public i54 f15446e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public q44 f15447f;

    /* JADX INFO: renamed from: g */
    public String f15448g = "default";

    /* JADX INFO: renamed from: h */
    public boolean f15449h = false;

    /* JADX INFO: renamed from: a */
    public boolean f15442a = false;

    public mlj(@NonNull i54 i54Var, @NonNull q44 q44Var, String str) {
        this.f15446e = i54Var;
        this.f15447f = q44Var;
        this.f15445d = str;
    }

    /* JADX INFO: renamed from: a */
    public static mlj m18001a(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        return new mlj(i54Var, q44Var, "multi_call");
    }

    /* JADX INFO: renamed from: b */
    public static mlj m18002b(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        q44Var.f17803d = -1;
        return new mlj(i54Var, q44Var, "voice_call");
    }

    /* JADX INFO: renamed from: c */
    public static mlj m18003c(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        return new mlj(i54Var, q44Var, "voice_call");
    }

    /* JADX INFO: renamed from: d */
    public String m18004d() {
        return this.f15446e.a + this.f15446e.d + this.f15446e.c + this.f15447f.f17800a + this.f15447f.f17803d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m18005e() {
        boolean zM18006f = m18006f();
        q44 q44Var = this.f15447f;
        if (zM18006f) {
            return q44Var.f17803d == 1;
        }
        return q44Var.f17803d == 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m18006f() {
        return "multi_call".equals(this.f15445d);
    }

    /* JADX INFO: renamed from: g */
    public boolean m18007g(mlj mljVar) {
        return TextUtils.equals(this.f15446e.a, mljVar.f15446e.a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m18008h() {
        return this.f15449h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m18009i() {
        return this.f15447f.f17803d == -1 && this.f15444c;
    }

    /* JADX INFO: renamed from: j */
    public void m18010j(boolean z) {
        this.f15449h = z;
    }

    public String toString() {
        return "GiftCallInfo  callUser = " + this.f15446e.toString() + " callParam = " + this.f15447f.toString() + " isSelect = " + this.f15449h;
    }
}
