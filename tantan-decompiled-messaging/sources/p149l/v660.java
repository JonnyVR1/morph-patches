package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class v660 extends eb2 {

    /* JADX INFO: renamed from: h */
    public static final String[] f180157h = {ypv.f199497e.getString(R$string.f46601C0), ypv.f199497e.getString(R$string.f47340k7), ypv.f199497e.getString(R$string.f47623x4)};

    /* JADX INFO: renamed from: e */
    public final VRecyclerView f180158e;

    /* JADX INFO: renamed from: f */
    public final VRecyclerView f180159f;

    /* JADX INFO: renamed from: g */
    public final VRecyclerView f180160g;

    public v660(Context context) {
        this.f180158e = new VRecyclerView(context);
        this.f180159f = new VRecyclerView(context);
        this.f180160g = new VRecyclerView(context);
    }

    @Override // p149l.w660
    public int getCount() {
        return f180157h.length;
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return f180157h[i];
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
        VRecyclerView vRecyclerView;
        if (i != 1) {
            vRecyclerView = i != 2 ? this.f180158e : this.f180160g;
        } else {
            vRecyclerView = this.f180159f;
        }
        viewGroup.addView(vRecyclerView);
        return vRecyclerView;
    }

    /* JADX INFO: renamed from: q */
    public VRecyclerView m197197q() {
        return this.f180158e;
    }

    /* JADX INFO: renamed from: r */
    public VRecyclerView m197198r() {
        return this.f180160g;
    }

    /* JADX INFO: renamed from: s */
    public VRecyclerView m197199s() {
        return this.f180159f;
    }
}
