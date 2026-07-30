package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.List;
import l.d30;
import l.e30;
import l.eb2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sae extends eb2 {

    /* JADX INFO: renamed from: e */
    public DrawGiftContainer f18899e;

    /* JADX INFO: renamed from: f */
    public List<xae> f18900f;

    public sae(DrawGiftContainer drawGiftContainer) {
        this.f18899e = drawGiftContainer;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m22317q(xae xaeVar) {
        pae paeVar = xaeVar.f22197d;
        if (paeVar != null) {
            paeVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m22319s() {
        vwb.z(this.f18900f, new e30() { // from class: l.qae
            public final void call(Object obj) {
                sae.m22317q((xae) obj);
            }
        });
    }

    public int getCount() {
        return this.f18900f.size();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: p */
    public Object m22321p(ViewGroup viewGroup, int i) {
        xae xaeVar = this.f18900f.get(i);
        RecyclerView recyclerViewM25812g = xaeVar.m25812g(viewGroup);
        xaeVar.m25809d(this.f18899e, recyclerViewM25812g);
        xaeVar.f22198e = new d30() { // from class: l.rae
            public final void call() {
                this.f18440a.m22319s();
            }
        };
        viewGroup.addView(recyclerViewM25812g);
        return recyclerViewM25812g;
    }

    /* JADX INFO: renamed from: t */
    public void m22322t(tae taeVar) {
        this.f18900f = taeVar.f20146a;
    }

    /* JADX INFO: renamed from: o */
    public void m22320o(ViewGroup viewGroup, int i, Object obj) {
    }
}
