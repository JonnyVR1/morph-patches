package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.NewGiftWall;
import com.p051p1.mobile.putong.core.p058ui.gift.act.GiftWallOptItemVIew;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l1k extends jic0<NewGiftWall> {

    /* JADX INFO: renamed from: c */
    public List<NewGiftWall> f129699c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18333a f129700d;

    /* JADX INFO: renamed from: l.l1k$a */
    public interface InterfaceC18333a {
        /* JADX INFO: renamed from: a */
        void mo102200a(View view, int i, NewGiftWall newGiftWall);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f129699c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157153x4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(final View view, final NewGiftWall newGiftWall, int i, final int i2) {
        if (view instanceof GiftWallOptItemVIew) {
            ((GiftWallOptItemVIew) view).m46608b(newGiftWall);
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.k1k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123501a.m152502H(view, i2, newGiftWall, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NewGiftWall getItem(int i) {
        return this.f129699c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m152502H(View view, int i, NewGiftWall newGiftWall, View view2) {
        if (NullChecker.m82486a(this.f129700d)) {
            this.f129700d.mo102200a(view, i, newGiftWall);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m152503I(List<NewGiftWall> list) {
        this.f129699c = list;
    }

    /* JADX INFO: renamed from: J */
    public void m152504J(InterfaceC18333a interfaceC18333a) {
        this.f129700d = interfaceC18333a;
    }
}
