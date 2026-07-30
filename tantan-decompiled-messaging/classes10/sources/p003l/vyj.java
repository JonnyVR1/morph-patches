package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.NewGiftWall;
import com.p000p1.mobile.putong.core.p001ui.gift.act.GiftWallOptItemVIew;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.dac0;
import l.o7r;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vyj extends dac0<NewGiftWall> {

    /* JADX INFO: renamed from: c */
    public List<NewGiftWall> f8104c;

    /* JADX INFO: renamed from: d */
    public InterfaceC3458a f8105d;

    /* JADX INFO: renamed from: l.vyj$a */
    public interface InterfaceC3458a {
        /* JADX INFO: renamed from: a */
        void mo7932a(View view, int i, NewGiftWall newGiftWall);
    }

    /* JADX INFO: renamed from: C */
    public int m10416C() {
        return this.f8104c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m10417D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(l6c0.f6106x4, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m10415A(final View view, final NewGiftWall newGiftWall, int i, final int i2) {
        if (view instanceof GiftWallOptItemVIew) {
            ((GiftWallOptItemVIew) view).m2755b(newGiftWall);
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.uyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7845a.m10420H(view, i2, newGiftWall, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NewGiftWall getItem(int i) {
        return this.f8104c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10420H(View view, int i, NewGiftWall newGiftWall, View view2) {
        if (NullChecker.a(this.f8105d)) {
            this.f8105d.mo7932a(view, i, newGiftWall);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m10421I(List<NewGiftWall> list) {
        this.f8104c = list;
    }

    /* JADX INFO: renamed from: J */
    public void m10422J(InterfaceC3458a interfaceC3458a) {
        this.f8105d = interfaceC3458a;
    }
}
