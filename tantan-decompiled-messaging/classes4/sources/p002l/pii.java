package p002l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.gac0;
import l.hxs;
import l.t100;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pii extends gac0<BLiveFilterItem> {

    /* JADX INFO: renamed from: d */
    public final List<BLiveFilterItem> f17384d;

    /* JADX INFO: renamed from: e */
    public int f17385e;

    public pii(List<BLiveFilterItem> list, e30<BLiveFilterItem> e30Var) {
        super(e30Var);
        this.f17384d = list;
    }

    /* JADX INFO: renamed from: C */
    public int m20335C() {
        return this.f17384d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m20336D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19611N, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m20334A(View view, final BLiveFilterItem bLiveFilterItem, int i, final int i2) {
        TextView textView = (TextView) view.findViewById(g5c0.f11053d0);
        VDraweeView vDraweeViewFindViewById = view.findViewById(g5c0.f11043c0);
        View viewFindViewById = view.findViewById(g5c0.f11063e0);
        if (i2 == this.f17385e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        xdl0.M(view.findViewById(g5c0.f11119j6), bLiveFilterItem.isSuggested);
        hxs.s("context_livingAct", vDraweeViewFindViewById, bLiveFilterItem.icon);
        textView.setText(bLiveFilterItem.name);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.mii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15400a.m20339J(i2, bLiveFilterItem, view2);
            }
        });
        xdl0.V(view, t100.d(i2 == 0 ? 8.0f : 0.0f));
        xdl0.W(view, t100.d(i2 == m20335C() - 1 ? 8.0f : 0.0f));
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveFilterItem getItem(int i) {
        return this.f17384d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m20339J(int i, BLiveFilterItem bLiveFilterItem, View view) {
        this.f17385e = i;
        if (NullChecker.a(((gac0) this).c)) {
            ((gac0) this).c.call(bLiveFilterItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m20340K(int i) {
        this.f17385e = i;
    }
}
