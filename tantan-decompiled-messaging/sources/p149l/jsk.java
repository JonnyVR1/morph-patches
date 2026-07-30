package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeCardItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jsk extends eb2 {

    /* JADX INFO: renamed from: e */
    public final zqs f119517e;

    /* JADX INFO: renamed from: f */
    public List<mpw.C18528a> f119518f;

    /* JADX INFO: renamed from: g */
    public boolean f119519g;

    public jsk(zqs zqsVar) {
        this.f119517e = zqsVar;
    }

    @Override // p149l.w660
    public int getCount() {
        if (vwb.m200296J(this.f119518f)) {
            return 0;
        }
        return this.f119518f.size();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        LiveGuardPrivilegeCardItem liveGuardPrivilegeCardItem = (LiveGuardPrivilegeCardItem) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168237X1, (ViewGroup) null, false);
        liveGuardPrivilegeCardItem.m74686j0(this.f119517e, this.f119518f.get(i), this.f119519g);
        viewGroup.addView(liveGuardPrivilegeCardItem);
        return liveGuardPrivilegeCardItem;
    }

    /* JADX INFO: renamed from: q */
    public void m143046q(boolean z, List<mpw.C18528a> list) {
        this.f119518f = list;
        this.f119519g = z;
        notifyDataSetChanged();
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
    }
}
