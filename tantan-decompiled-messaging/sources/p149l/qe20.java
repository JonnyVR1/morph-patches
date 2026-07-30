package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class qe20 extends dac0<ez2> {

    /* JADX INFO: renamed from: c */
    public final int f153989c = 1;

    /* JADX INFO: renamed from: d */
    public final int f153990d = 2;

    /* JADX INFO: renamed from: e */
    public final int f153991e = 3;

    /* JADX INFO: renamed from: f */
    public final int f153992f = 4;

    /* JADX INFO: renamed from: g */
    public List<ez2> f153993g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Act f153994h;

    /* JADX INFO: renamed from: i */
    public CommonData f153995i;

    public qe20(Act act) {
        this.f153994h = act;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m174174G(ez2 ez2Var) {
        return ez2Var instanceof dze;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m174175H(ez2 ez2Var) {
        return (ez2Var instanceof sx2) || (ez2Var instanceof az2) || (ez2Var instanceof vx2) || (ez2Var instanceof yx2) || (ez2Var instanceof dsj0);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m174176I(ez2 ez2Var) {
        return (ez2Var instanceof exb) || (ez2Var instanceof yy50) || (ez2Var instanceof k960);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m174177J(ez2 ez2Var) {
        return ez2Var instanceof smr;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f153993g.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return this.f153994h.inflater().inflate(n6c0.f137377s0, viewGroup, false);
        }
        if (i == 2) {
            VText_Medium vText_Medium = new VText_Medium(this.f153994h);
            vText_Medium.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            vText_Medium.setTextSize(15.0f);
            int i2 = t100.f167266o;
            vText_Medium.setPadding(i2, 0, i2, t100.f167256e);
            vText_Medium.setTextColor(Color.parseColor("#4D000000"));
            return vText_Medium;
        }
        if (i != 4) {
            View view = new View(this.f153994h);
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, t100.f167268q));
            return view;
        }
        VText_Medium vText_Medium2 = new VText_Medium(this.f153994h);
        vText_Medium2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i3 = t100.f167266o;
        int i4 = t100.f167260i;
        vText_Medium2.setPadding(i3, i4, i3, i4);
        vText_Medium2.setTextSize(12.0f);
        vText_Medium2.setTextColor(Color.parseColor("#FF6244"));
        Drawable drawable = this.f153994h.getDrawable(e3c0.f89167z1);
        if (NullChecker.m81303a(drawable)) {
            int i5 = t100.f167262k;
            drawable.setBounds(0, 0, i5, i5);
            vText_Medium2.setCompoundDrawables(drawable, null, null, null);
            vText_Medium2.setCompoundDrawablePadding(t100.f167256e);
        }
        vText_Medium2.setText(R$string.f27762P1);
        xdl0.m208357U(vText_Medium2, t100.f167256e);
        vText_Medium2.setBackgroundColor(Color.parseColor("#14FF6244"));
        return vText_Medium2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, ez2 ez2Var, int i, int i2) {
        ez2 item = getItem(i2);
        if (i == 3) {
            item.mo99615a((AccountSecureFunItem) view, this.f153995i);
        } else if (i == 2) {
            ((VText_Medium) view).setText(item.f93839a);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ez2 getItem(int i) {
        return this.f153993g.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m174180K(@NonNull List<ez2> list, CommonData commonData) {
        this.f153993g = list;
        this.f153995i = commonData;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ez2 item = getItem(i);
        if (m174175H(item)) {
            return 3;
        }
        if (m174176I(item)) {
            return 2;
        }
        if (m174174G(item)) {
            return 1;
        }
        return m174177J(item) ? 4 : 0;
    }
}
