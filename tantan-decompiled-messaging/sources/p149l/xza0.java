package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class xza0 extends dac0<BLivePkPunishMotion> {

    /* JADX INFO: renamed from: c */
    public e30<String> f195181c;

    /* JADX INFO: renamed from: d */
    public List<BLivePkPunishMotion> f195182d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m211945H(int i, View view) {
        this.f195181c.call(this.f195182d.get(i).f44427id);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f195182d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168414l, (ViewGroup) null);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, BLivePkPunishMotion bLivePkPunishMotion, int i, final int i2) {
        VDraweeView vDraweeView = (VDraweeView) view.findViewById(g5c0.f100812T2);
        TextView textView = (TextView) view.findViewById(g5c0.f101062t7);
        vDraweeView.setImageResource(i3c0.f110754J8);
        hxs.m133407t("context_single_room", vDraweeView, this.f195182d.get(i2).iconUrl, t100.f167275x);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.wza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f188714a.m211945H(i2, view2);
            }
        });
        textView.setText(this.f195182d.get(i2).description);
        int i3 = t100.f167264m;
        view.setPadding(i3, 0, i2 == this.f195182d.size() + (-1) ? i3 : 0, 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public BLivePkPunishMotion getItem(int i) {
        return this.f195182d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m211948I(e30<String> e30Var) {
        this.f195181c = e30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m211949J(List<BLivePkPunishMotion> list) {
        this.f195182d.clear();
        List<BLivePkPunishMotion> list2 = this.f195182d;
        if (list == null) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
        notifyDataSetChanged();
    }
}
