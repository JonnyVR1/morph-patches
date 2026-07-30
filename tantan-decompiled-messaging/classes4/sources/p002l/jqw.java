package p002l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.gac0;
import l.hxs;
import l.t100;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jqw extends gac0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f13991d;

    /* JADX INFO: renamed from: e */
    public int f13992e;

    public jqw(List<BLiveBeautyItem> list, e30<BLiveBeautyItem> e30Var) {
        super(e30Var);
        this.f13991d = list;
    }

    /* JADX INFO: renamed from: C */
    public int m16181C() {
        return this.f13991d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16182D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19611N, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m16180A(View view, final BLiveBeautyItem bLiveBeautyItem, int i, final int i2) {
        BLiveBeautyItem item = getItem(i2);
        if (item == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(g5c0.f11053d0);
        VDraweeView vDraweeViewFindViewById = view.findViewById(g5c0.f11043c0);
        View viewFindViewById = view.findViewById(g5c0.f11063e0);
        if (i2 == this.f13992e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        hxs.s("context_livingAct", vDraweeViewFindViewById, item.icon);
        xdl0.M(view.findViewById(g5c0.f11119j6), bLiveBeautyItem.isSuggested);
        textView.setText(item.name);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.iqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13367a.m16185J(i2, bLiveBeautyItem, view2);
            }
        });
        xdl0.V(view, t100.d(i2 == 0 ? 8.0f : 0.0f));
        xdl0.W(view, t100.d(i2 == m16181C() - 1 ? 8.0f : 0.0f));
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f13991d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m16185J(int i, BLiveBeautyItem bLiveBeautyItem, View view) {
        this.f13992e = i;
        if (NullChecker.a(((gac0) this).c)) {
            ((gac0) this).c.call(bLiveBeautyItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m16186K(int i) {
        this.f13992e = i;
    }
}
