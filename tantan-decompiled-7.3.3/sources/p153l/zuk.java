package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeCardItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zuk extends lb2 {

    /* JADX INFO: renamed from: e */
    public final ats f206131e;

    /* JADX INFO: renamed from: f */
    public List<lsw.C18451a> f206132f;

    /* JADX INFO: renamed from: g */
    public boolean f206133g;

    public zuk(ats atsVar) {
        this.f206131e = atsVar;
    }

    @Override // p153l.cf60
    public int getCount() {
        if (jyb.m147479J(this.f206132f)) {
            return 0;
        }
        return this.f206132f.size();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        LiveGuardPrivilegeCardItem liveGuardPrivilegeCardItem = (LiveGuardPrivilegeCardItem) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198969X1, (ViewGroup) null, false);
        liveGuardPrivilegeCardItem.m75869j0(this.f206131e, this.f206132f.get(i), this.f206133g);
        viewGroup.addView(liveGuardPrivilegeCardItem);
        return liveGuardPrivilegeCardItem;
    }

    /* JADX INFO: renamed from: q */
    public void m221665q(boolean z, List<lsw.C18451a> list) {
        this.f206132f = list;
        this.f206133g = z;
        notifyDataSetChanged();
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
    }
}
