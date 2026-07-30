package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class pii extends gac0<BLiveFilterItem> {

    /* JADX INFO: renamed from: d */
    public final List<BLiveFilterItem> f149559d;

    /* JADX INFO: renamed from: e */
    public int f149560e;

    public pii(List<BLiveFilterItem> list, e30<BLiveFilterItem> e30Var) {
        super(e30Var);
        this.f149559d = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f149559d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168115N, viewGroup, false);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final BLiveFilterItem bLiveFilterItem, int i, final int i2) {
        TextView textView = (TextView) view.findViewById(g5c0.f100903d0);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(g5c0.f100893c0);
        View viewFindViewById = view.findViewById(g5c0.f100913e0);
        if (i2 == this.f149560e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        xdl0.m208344M(view.findViewById(g5c0.f100969j6), bLiveFilterItem.isSuggested);
        hxs.m133406s("context_livingAct", vDraweeView, bLiveFilterItem.icon);
        textView.setText(bLiveFilterItem.name);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.mii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f133974a.m169606J(i2, bLiveFilterItem, view2);
            }
        });
        xdl0.m208358V(view, t100.m186890d(i2 == 0 ? 8.0f : 0.0f));
        xdl0.m208359W(view, t100.m186890d(i2 == getPageCount() - 1 ? 8.0f : 0.0f));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveFilterItem getItem(int i) {
        return this.f149559d.get(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m169606J(int i, BLiveFilterItem bLiveFilterItem, View view) {
        this.f149560e = i;
        if (NullChecker.m81303a(this.f101661c)) {
            this.f101661c.call((T) bLiveFilterItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m169607K(int i) {
        this.f149560e = i;
    }
}
