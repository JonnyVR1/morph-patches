package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class jqw extends gac0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f119327d;

    /* JADX INFO: renamed from: e */
    public int f119328e;

    public jqw(List<BLiveBeautyItem> list, e30<BLiveBeautyItem> e30Var) {
        super(e30Var);
        this.f119327d = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f119327d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168115N, viewGroup, false);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final BLiveBeautyItem bLiveBeautyItem, int i, final int i2) {
        BLiveBeautyItem item = getItem(i2);
        if (item == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(g5c0.f100903d0);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(g5c0.f100893c0);
        View viewFindViewById = view.findViewById(g5c0.f100913e0);
        if (i2 == this.f119328e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        hxs.m133406s("context_livingAct", vDraweeView, item.icon);
        xdl0.m208344M(view.findViewById(g5c0.f100969j6), bLiveBeautyItem.isSuggested);
        textView.setText(item.name);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.iqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114556a.m142859J(i2, bLiveBeautyItem, view2);
            }
        });
        xdl0.m208358V(view, t100.m186890d(i2 == 0 ? 8.0f : 0.0f));
        xdl0.m208359W(view, t100.m186890d(i2 == getPageCount() - 1 ? 8.0f : 0.0f));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f119327d.get(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m142859J(int i, BLiveBeautyItem bLiveBeautyItem, View view) {
        this.f119328e = i;
        if (NullChecker.m81303a(this.f101661c)) {
            this.f101661c.call((T) bLiveBeautyItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m142860K(int i) {
        this.f119328e = i;
    }
}
