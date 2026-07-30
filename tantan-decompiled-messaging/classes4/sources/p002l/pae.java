package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pae extends dac0<mae> {

    /* JADX INFO: renamed from: c */
    public Context f17169c;

    /* JADX INFO: renamed from: d */
    public List<mae> f17170d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public e30<mae> f17171e = null;

    /* JADX INFO: renamed from: f */
    public e30<mae> f17172f = null;

    public pae(Context context) {
        this.f17169c = context;
    }

    /* JADX INFO: renamed from: C */
    public int m20172C() {
        return this.f17170d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m20173D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f17169c).inflate(t6c0.f19456A0, viewGroup, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m20171A(View view, final mae maeVar, int i, int i2) {
        DrawRecycleItem drawRecycleItem = (DrawRecycleItem) view;
        drawRecycleItem.m7095f(maeVar);
        drawRecycleItem.f5649m = new d30() { // from class: l.nae
            public final void call() {
                this.f15901a.m20176I(maeVar);
            }
        };
        drawRecycleItem.f5648l = new d30() { // from class: l.oae
            public final void call() {
                this.f16450a.m20177J(maeVar);
            }
        };
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public mae getItem(int i) {
        return this.f17170d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m20176I(mae maeVar) {
        e30<mae> e30Var = this.f17171e;
        if (e30Var != null) {
            e30Var.call(maeVar);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m20177J(mae maeVar) {
        e30<mae> e30Var = this.f17172f;
        if (e30Var != null) {
            e30Var.call(maeVar);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m20178K(List<mae> list) {
        this.f17170d = list;
    }
}
