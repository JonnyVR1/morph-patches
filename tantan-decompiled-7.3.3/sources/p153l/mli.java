package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class mli extends mic0<BLiveFilterItem> {

    /* JADX INFO: renamed from: d */
    public final List<BLiveFilterItem> f137400d;

    /* JADX INFO: renamed from: e */
    public int f137401e;

    public mli(List<BLiveFilterItem> list, y20<BLiveFilterItem> y20Var) {
        super(y20Var);
        this.f137400d = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f137400d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198847N, viewGroup, false);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final BLiveFilterItem bLiveFilterItem, int i, final int i2) {
        TextView textView = (TextView) view.findViewById(mdc0.f136148d0);
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(mdc0.f136138c0);
        View viewFindViewById = view.findViewById(mdc0.f136158e0);
        if (i2 == this.f137401e) {
            textView.setTextColor(Color.parseColor("#ff3a00"));
            viewFindViewById.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            textView.setTextColor(Color.parseColor("#383e46"));
            viewFindViewById.setVisibility(8);
            textView.setTypeface(Typeface.defaultFromStyle(0));
        }
        bnl0.m105524M(view.findViewById(mdc0.f136214j6), bLiveFilterItem.isSuggested);
        izs.m142868s("context_livingAct", vDraweeView, bLiveFilterItem.icon);
        textView.setText(bLiveFilterItem.name);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.jli
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f121554a.m158878J(i2, bLiveFilterItem, view2);
            }
        });
        bnl0.m105538V(view, qa00.m175859d(i2 == 0 ? 8.0f : 0.0f));
        bnl0.m105539W(view, qa00.m175859d(i2 == getPageCount() - 1 ? 8.0f : 0.0f));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public BLiveFilterItem getItem(int i) {
        return this.f137400d.get(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m158878J(int i, BLiveFilterItem bLiveFilterItem, View view) {
        this.f137401e = i;
        if (NullChecker.m82486a(this.f136946c)) {
            this.f136946c.call((T) bLiveFilterItem);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m158879K(int i) {
        this.f137401e = i;
    }
}
