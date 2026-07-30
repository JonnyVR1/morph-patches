package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class wbe extends lb2 {

    /* JADX INFO: renamed from: e */
    public DrawGiftContainer f188244e;

    /* JADX INFO: renamed from: f */
    public List<bce> f188245f;

    public wbe(DrawGiftContainer drawGiftContainer) {
        this.f188244e = drawGiftContainer;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m205712q(bce bceVar) {
        tbe tbeVar = bceVar.f76136d;
        if (tbeVar != null) {
            tbeVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m205714s() {
        jyb.m147537z(this.f188245f, new y20() { // from class: l.ube
            @Override // p153l.y20
            public final void call(Object obj) {
                wbe.m205712q((bce) obj);
            }
        });
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f188245f.size();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        bce bceVar = this.f188245f.get(i);
        RecyclerView recyclerViewM103501g = bceVar.m103501g(viewGroup);
        bceVar.m103498d(this.f188244e, recyclerViewM103501g);
        bceVar.f76137e = new x20() { // from class: l.vbe
            @Override // p153l.x20
            public final void call() {
                this.f183240a.m205714s();
            }
        };
        viewGroup.addView(recyclerViewM103501g);
        return recyclerViewM103501g;
    }

    /* JADX INFO: renamed from: t */
    public void m205715t(xbe xbeVar) {
        this.f188245f = xbeVar.f193152a;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
    }
}
