package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class bf60 extends lb2 {

    /* JADX INFO: renamed from: h */
    public static final String[] f76461h = {zrv.f205803e.getString(R$string.f47449C0), zrv.f205803e.getString(R$string.f48188k7), zrv.f205803e.getString(R$string.f48471x4)};

    /* JADX INFO: renamed from: e */
    public final VRecyclerView f76462e;

    /* JADX INFO: renamed from: f */
    public final VRecyclerView f76463f;

    /* JADX INFO: renamed from: g */
    public final VRecyclerView f76464g;

    public bf60(Context context) {
        this.f76462e = new VRecyclerView(context);
        this.f76463f = new VRecyclerView(context);
        this.f76464g = new VRecyclerView(context);
    }

    @Override // p153l.cf60
    public int getCount() {
        return f76461h.length;
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return f76461h[i];
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
        VRecyclerView vRecyclerView;
        if (i != 1) {
            vRecyclerView = i != 2 ? this.f76462e : this.f76464g;
        } else {
            vRecyclerView = this.f76463f;
        }
        viewGroup.addView(vRecyclerView);
        return vRecyclerView;
    }

    /* JADX INFO: renamed from: q */
    public VRecyclerView m103877q() {
        return this.f76462e;
    }

    /* JADX INFO: renamed from: r */
    public VRecyclerView m103878r() {
        return this.f76464g;
    }

    /* JADX INFO: renamed from: s */
    public VRecyclerView m103879s() {
        return this.f76463f;
    }
}
