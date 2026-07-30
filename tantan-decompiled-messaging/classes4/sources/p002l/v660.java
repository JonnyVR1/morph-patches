package p002l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.eb2;
import l.ypv;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v660 extends eb2 {

    /* JADX INFO: renamed from: h */
    public static final String[] f21009h = {ypv.e.getString(R$string.f2643C0), ypv.e.getString(R$string.f3382k7), ypv.e.getString(R$string.f3665x4)};

    /* JADX INFO: renamed from: e */
    public final VRecyclerView f21010e;

    /* JADX INFO: renamed from: f */
    public final VRecyclerView f21011f;

    /* JADX INFO: renamed from: g */
    public final VRecyclerView f21012g;

    public v660(Context context) {
        this.f21010e = new VRecyclerView(context);
        this.f21011f = new VRecyclerView(context);
        this.f21012g = new VRecyclerView(context);
    }

    public int getCount() {
        return f21009h.length;
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return f21009h[i];
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m23785o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m23786p(ViewGroup viewGroup, int i) {
        VRecyclerView vRecyclerView;
        if (i != 1) {
            vRecyclerView = i != 2 ? this.f21010e : this.f21012g;
        } else {
            vRecyclerView = this.f21011f;
        }
        viewGroup.addView(vRecyclerView);
        return vRecyclerView;
    }

    /* JADX INFO: renamed from: q */
    public VRecyclerView m23787q() {
        return this.f21010e;
    }

    /* JADX INFO: renamed from: r */
    public VRecyclerView m23788r() {
        return this.f21012g;
    }

    /* JADX INFO: renamed from: s */
    public VRecyclerView m23789s() {
        return this.f21011f;
    }
}
