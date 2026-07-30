package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawRecycleItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pae extends dac0<mae> {

    /* JADX INFO: renamed from: c */
    public Context f147969c;

    /* JADX INFO: renamed from: d */
    public List<mae> f147970d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public e30<mae> f147971e = null;

    /* JADX INFO: renamed from: f */
    public e30<mae> f147972f = null;

    public pae(Context context) {
        this.f147969c = context;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f147970d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f147969c).inflate(t6c0.f167960A0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final mae maeVar, int i, int i2) {
        DrawRecycleItem drawRecycleItem = (DrawRecycleItem) view;
        drawRecycleItem.m73551f(maeVar);
        drawRecycleItem.f49607m = new d30() { // from class: l.nae
            @Override // p149l.d30
            public final void call() {
                this.f137890a.m168092I(maeVar);
            }
        };
        drawRecycleItem.f49606l = new d30() { // from class: l.oae
            @Override // p149l.d30
            public final void call() {
                this.f142800a.m168093J(maeVar);
            }
        };
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public mae getItem(int i) {
        return this.f147970d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m168092I(mae maeVar) {
        e30<mae> e30Var = this.f147971e;
        if (e30Var != null) {
            e30Var.call(maeVar);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m168093J(mae maeVar) {
        e30<mae> e30Var = this.f147972f;
        if (e30Var != null) {
            e30Var.call(maeVar);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m168094K(List<mae> list) {
        this.f147970d = list;
    }
}
