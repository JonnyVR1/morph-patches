package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import com.p046p1.mobile.putong.core.p053ui.gift.act.GiftWallOptItemVIew;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vyj extends dac0<NewGiftWall> {

    /* JADX INFO: renamed from: c */
    public List<NewGiftWall> f183534c;

    /* JADX INFO: renamed from: d */
    public InterfaceC20766a f183535d;

    /* JADX INFO: renamed from: l.vyj$a */
    public interface InterfaceC20766a {
        /* JADX INFO: renamed from: a */
        void mo152350a(View view, int i, NewGiftWall newGiftWall);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f183534c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126597x4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(final View view, final NewGiftWall newGiftWall, int i, final int i2) {
        if (view instanceof GiftWallOptItemVIew) {
            ((GiftWallOptItemVIew) view).m45425b(newGiftWall);
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.uyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f178867a.m200659H(view, i2, newGiftWall, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public NewGiftWall getItem(int i) {
        return this.f183534c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m200659H(View view, int i, NewGiftWall newGiftWall, View view2) {
        if (NullChecker.m81303a(this.f183535d)) {
            this.f183535d.mo152350a(view, i, newGiftWall);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m200660I(List<NewGiftWall> list) {
        this.f183534c = list;
    }

    /* JADX INFO: renamed from: J */
    public void m200661J(InterfaceC20766a interfaceC20766a) {
        this.f183535d = interfaceC20766a;
    }
}
