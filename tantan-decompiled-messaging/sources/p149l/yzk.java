package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class yzk extends eb2 {

    /* JADX INFO: renamed from: e */
    public final List<a0l> f200894e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final e30<a0l> f200895f;

    public yzk(e30<a0l> e30Var) {
        this.f200895f = e30Var;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f200894e.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        a0l a0lVar = this.f200894e.get(i);
        HideAvatarItemView hideAvatarItemViewM207167a = a0lVar.m207167a(viewGroup.getContext(), viewGroup);
        hideAvatarItemViewM207167a.setTag(Integer.valueOf(i));
        hideAvatarItemViewM207167a.m70782m0(a0lVar, this.f200895f);
        viewGroup.addView(hideAvatarItemViewM207167a);
        return hideAvatarItemViewM207167a;
    }

    /* JADX INFO: renamed from: q */
    public a0l m216682q() {
        return (a0l) vwb.m200346r(this.f200894e, new r0l());
    }

    /* JADX INFO: renamed from: r */
    public void m216683r(List<a0l> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f200894e.clear();
        this.f200894e.addAll(list);
        notifyDataSetChanged();
    }
}
