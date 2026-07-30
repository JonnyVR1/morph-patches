package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class itw extends mic0<BLiveBeautyItem> {

    /* JADX INFO: renamed from: d */
    public List<BLiveBeautyItem> f116879d;

    /* JADX INFO: renamed from: e */
    public int f116880e;

    public itw(List<BLiveBeautyItem> list, y20<BLiveBeautyItem> y20Var) {
        super(y20Var);
        this.f116879d = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f116879d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198847N, viewGroup, false);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final BLiveBeautyItem bLiveBeautyItem, int i, final int i2) {
        BLiveBeautyItem item = getItem(i2);
        if (item == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(mdc0.f136148d0);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(mdc0.f136138c0);
        View viewFindViewById = view.findViewById(mdc0.f136158e0);
        if (i2 == this.f116880e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        izs.m142868s("context_livingAct", vDraweeView, item.icon);
        bnl0.m105524M(view.findViewById(mdc0.f136214j6), bLiveBeautyItem.isSuggested);
        textView.setText(item.name);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.htw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f111603a.m142127J(i2, bLiveBeautyItem, view2);
            }
        });
        bnl0.m105538V(view, qa00.m175859d(i2 == 0 ? 8.0f : 0.0f));
        bnl0.m105539W(view, qa00.m175859d(i2 == getPageCount() - 1 ? 8.0f : 0.0f));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveBeautyItem getItem(int i) {
        return this.f116879d.get(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m142127J(int i, BLiveBeautyItem bLiveBeautyItem, View view) {
        this.f116880e = i;
        if (NullChecker.m82486a(this.f136946c)) {
            this.f136946c.call((T) bLiveBeautyItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m142128K(int i) {
        this.f116880e = i;
    }
}
