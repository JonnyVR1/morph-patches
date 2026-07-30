package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class b8b0 extends jic0<BLivePkPunishMotion> {

    /* JADX INFO: renamed from: c */
    public y20<String> f75413c;

    /* JADX INFO: renamed from: d */
    public List<BLivePkPunishMotion> f75414d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m102957H(int i, View view) {
        this.f75413c.call(this.f75414d.get(i).f45275id);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f75414d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199146l, (ViewGroup) null);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, BLivePkPunishMotion bLivePkPunishMotion, int i, final int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(mdc0.f136057T2);
        TextView textView = (TextView) view.findViewById(mdc0.f136307t7);
        vDraweeView.setImageResource(obc0.f146082J8);
        izs.m142869t("context_single_room", vDraweeView, this.f75414d.get(i2).iconUrl, qa00.f156337x);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.a8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f68893a.m102957H(i2, view2);
            }
        });
        textView.setText(this.f75414d.get(i2).description);
        int i3 = qa00.f156326m;
        view.setPadding(i3, 0, i2 == this.f75414d.size() + (-1) ? i3 : 0, 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLivePkPunishMotion getItem(int i) {
        return this.f75414d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m102960I(y20<String> y20Var) {
        this.f75413c = y20Var;
    }

    /* JADX INFO: renamed from: J */
    public void m102961J(List<BLivePkPunishMotion> list) {
        this.f75414d.clear();
        List<BLivePkPunishMotion> list2 = this.f75414d;
        if (list == null) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
        notifyDataSetChanged();
    }
}
