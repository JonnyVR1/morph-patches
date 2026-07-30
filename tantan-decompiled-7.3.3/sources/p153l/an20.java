package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class an20 extends jic0<tz2> {

    /* JADX INFO: renamed from: c */
    public final int f72305c = 1;

    /* JADX INFO: renamed from: d */
    public final int f72306d = 2;

    /* JADX INFO: renamed from: e */
    public final int f72307e = 3;

    /* JADX INFO: renamed from: f */
    public final int f72308f = 4;

    /* JADX INFO: renamed from: g */
    public List<tz2> f72309g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Act f72310h;

    /* JADX INFO: renamed from: i */
    public CommonData f72311i;

    public an20(Act act) {
        this.f72310h = act;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m98927G(tz2 tz2Var) {
        return tz2Var instanceof h0f;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m98928H(tz2 tz2Var) {
        return (tz2Var instanceof hy2) || (tz2Var instanceof pz2) || (tz2Var instanceof ky2) || (tz2Var instanceof ny2) || (tz2Var instanceof h1k0);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m98929I(tz2 tz2Var) {
        return (tz2Var instanceof syb) || (tz2Var instanceof d760) || (tz2Var instanceof ph60);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m98930J(tz2 tz2Var) {
        return tz2Var instanceof tor;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f72309g.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return this.f72310h.inflater().inflate(sec0.f167591s0, viewGroup, false);
        }
        if (i == 2) {
            VText_Medium vText_Medium = new VText_Medium(this.f72310h);
            vText_Medium.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            vText_Medium.setTextSize(15.0f);
            int i2 = qa00.f156328o;
            vText_Medium.setPadding(i2, 0, i2, qa00.f156318e);
            vText_Medium.setTextColor(Color.parseColor("#4D000000"));
            return vText_Medium;
        }
        if (i != 4) {
            View view = new View(this.f72310h);
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, qa00.f156330q));
            return view;
        }
        VText_Medium vText_Medium2 = new VText_Medium(this.f72310h);
        vText_Medium2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i3 = qa00.f156328o;
        int i4 = qa00.f156322i;
        vText_Medium2.setPadding(i3, i4, i3, i4);
        vText_Medium2.setTextSize(12.0f);
        vText_Medium2.setTextColor(Color.parseColor("#FF6244"));
        Drawable drawable = this.f72310h.getDrawable(kbc0.f124930z1);
        if (NullChecker.m82486a(drawable)) {
            int i5 = qa00.f156324k;
            drawable.setBounds(0, 0, i5, i5);
            vText_Medium2.setCompoundDrawables(drawable, null, null, null);
            vText_Medium2.setCompoundDrawablePadding(qa00.f156318e);
        }
        vText_Medium2.setText(R$string.f28610P1);
        bnl0.m105537U(vText_Medium2, qa00.f156318e);
        vText_Medium2.setBackgroundColor(Color.parseColor("#14FF6244"));
        return vText_Medium2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, tz2 tz2Var, int i, int i2) {
        tz2 item = getItem(i2);
        if (i == 3) {
            item.mo114641a((AccountSecureFunItem) view, this.f72311i);
        } else if (i == 2) {
            ((VText_Medium) view).setText(item.f176736a);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public tz2 getItem(int i) {
        return this.f72309g.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m98933K(@NonNull List<tz2> list, CommonData commonData) {
        this.f72309g = list;
        this.f72311i = commonData;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        tz2 item = getItem(i);
        if (m98928H(item)) {
            return 3;
        }
        if (m98929I(item)) {
            return 2;
        }
        if (m98927G(item)) {
            return 1;
        }
        return m98930J(item) ? 4 : 0;
    }
}
