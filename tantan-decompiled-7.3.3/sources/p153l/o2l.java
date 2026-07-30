package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class o2l extends lb2 {

    /* JADX INFO: renamed from: e */
    public final List<q2l> f144747e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final y20<q2l> f144748f;

    public o2l(y20<q2l> y20Var) {
        this.f144748f = y20Var;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f144747e.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        q2l q2lVar = this.f144747e.get(i);
        HideAvatarItemView hideAvatarItemViewM115505a = q2lVar.m115505a(viewGroup.getContext(), viewGroup);
        hideAvatarItemViewM115505a.setTag(Integer.valueOf(i));
        hideAvatarItemViewM115505a.m71965m0(q2lVar, this.f144748f);
        viewGroup.addView(hideAvatarItemViewM115505a);
        return hideAvatarItemViewM115505a;
    }

    /* JADX INFO: renamed from: q */
    public q2l m165730q() {
        return (q2l) jyb.m147529r(this.f144747e, new h3l());
    }

    /* JADX INFO: renamed from: r */
    public void m165731r(List<q2l> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f144747e.clear();
        this.f144747e.addAll(list);
        notifyDataSetChanged();
    }
}
