package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tbe extends jic0<qbe> {

    /* JADX INFO: renamed from: c */
    public Context f172914c;

    /* JADX INFO: renamed from: d */
    public List<qbe> f172915d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public y20<qbe> f172916e = null;

    /* JADX INFO: renamed from: f */
    public y20<qbe> f172917f = null;

    public tbe(Context context) {
        this.f172914c = context;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f172915d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f172914c).inflate(yec0.f198692A0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final qbe qbeVar, int i, int i2) {
        DrawRecycleItem drawRecycleItem = (DrawRecycleItem) view;
        drawRecycleItem.m74734f(qbeVar);
        drawRecycleItem.f50455m = new x20() { // from class: l.rbe
            @Override // p153l.x20
            public final void call() {
                this.f162017a.m190011I(qbeVar);
            }
        };
        drawRecycleItem.f50454l = new x20() { // from class: l.sbe
            @Override // p153l.x20
            public final void call() {
                this.f167143a.m190012J(qbeVar);
            }
        };
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public qbe getItem(int i) {
        return this.f172915d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m190011I(qbe qbeVar) {
        y20<qbe> y20Var = this.f172916e;
        if (y20Var != null) {
            y20Var.call(qbeVar);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m190012J(qbe qbeVar) {
        y20<qbe> y20Var = this.f172917f;
        if (y20Var != null) {
            y20Var.call(qbeVar);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m190013K(List<qbe> list) {
        this.f172915d = list;
    }
}
