package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeCardItem;
import java.util.List;
import l.eb2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jsk extends eb2 {

    /* JADX INFO: renamed from: e */
    public final zqs f14005e;

    /* JADX INFO: renamed from: f */
    public List<mpw.C0681a> f14006f;

    /* JADX INFO: renamed from: g */
    public boolean f14007g;

    public jsk(zqs zqsVar) {
        this.f14005e = zqsVar;
    }

    public int getCount() {
        if (vwb.J(this.f14006f)) {
            return 0;
        }
        return this.f14006f.size();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeCardItem, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m16212p(ViewGroup viewGroup, int i) {
        ?? r0 = (LiveGuardPrivilegeCardItem) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19733X1, (ViewGroup) null, false);
        r0.m8280j0(this.f14005e, this.f14006f.get(i), this.f14007g);
        viewGroup.addView(r0);
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public void m16213q(boolean z, List<mpw.C0681a> list) {
        this.f14006f = list;
        this.f14007g = z;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public void m16211o(ViewGroup viewGroup, int i, Object obj) {
    }
}
