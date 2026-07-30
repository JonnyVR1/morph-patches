package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class sae extends eb2 {

    /* JADX INFO: renamed from: e */
    public DrawGiftContainer f163349e;

    /* JADX INFO: renamed from: f */
    public List<xae> f163350f;

    public sae(DrawGiftContainer drawGiftContainer) {
        this.f163349e = drawGiftContainer;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m182910q(xae xaeVar) {
        pae paeVar = xaeVar.f191731d;
        if (paeVar != null) {
            paeVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m182912s() {
        vwb.m200354z(this.f163350f, new e30() { // from class: l.qae
            @Override // p149l.e30
            public final void call(Object obj) {
                sae.m182910q((xae) obj);
            }
        });
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f163350f.size();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        xae xaeVar = this.f163350f.get(i);
        RecyclerView recyclerViewM207568g = xaeVar.m207568g(viewGroup);
        xaeVar.m207565d(this.f163349e, recyclerViewM207568g);
        xaeVar.f191732e = new d30() { // from class: l.rae
            @Override // p149l.d30
            public final void call() {
                this.f158511a.m182912s();
            }
        };
        viewGroup.addView(recyclerViewM207568g);
        return recyclerViewM207568g;
    }

    /* JADX INFO: renamed from: t */
    public void m182913t(tae taeVar) {
        this.f163350f = taeVar.f169109a;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
    }
}
