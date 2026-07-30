package p007l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.dac0;
import l.e30;
import l.g30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xaj0;
import l.xck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jvg extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: c */
    public Context f9531c;

    /* JADX INFO: renamed from: g */
    public int f9535g;

    /* JADX INFO: renamed from: i */
    public CameraSticker f9537i;

    /* JADX INFO: renamed from: j */
    public g30<Integer, CameraSticker, Boolean> f9538j;

    /* JADX INFO: renamed from: d */
    public List<CameraSticker> f9532d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public HashMap<String, Animator> f9533e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public int f9536h = 1;

    /* JADX INFO: renamed from: f */
    public final e30<xaj0<CameraSticker, Integer, Boolean>> f9534f = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.gvg
        public final void call(Object obj) {
            this.f8527a.m11363N((xaj0) obj);
        }
    });

    public jvg(Context context) {
        this.f9531c = context;
        c(act(), yb4.m17102c().f15387f).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.hvg
            public final void call(Object obj) {
                this.f8827a.m11352O((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m11353P(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                yb4.m17102c().f15387f.onNext(cameraSticker);
                yb4.m17102c().m17105d().remove(cameraSticker.f680id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        yb4.m17102c().f15387f.onNext(cameraSticker);
        yb4.m17102c().m17105d().put(cameraSticker.f680id, cameraSticker);
    }

    /* JADX INFO: renamed from: R */
    private void m11354R(CameraSticker cameraSticker, int i) {
        int i2 = this.f9536h;
        this.f9536h = i;
        this.f9537i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    private Act act() {
        return this.f9531c;
    }

    /* JADX INFO: renamed from: C */
    public int m11356C() {
        return this.f9532d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m11357D(ViewGroup viewGroup, int i) {
        return new FeedComicFaceItemView(this.f9531c);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m11355A(View view, CameraSticker cameraSticker, int i, final int i2) {
        FeedComicFaceItemView feedComicFaceItemView = (FeedComicFaceItemView) view;
        if (i2 < this.f9532d.size()) {
            final CameraSticker cameraSticker2 = this.f9532d.get(i2);
            feedComicFaceItemView.setTag(cameraSticker2.f680id);
            if (feedComicFaceItemView.m3101c(cameraSticker, this.f9533e, i2, yb4.m17102c().m17106e())) {
                this.f9536h = i2;
            }
            feedComicFaceItemView.setOnClickListener(new View.OnClickListener() { // from class: l.fvg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8255a.m11361L(i2, cameraSticker2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11359J(final CameraSticker cameraSticker, final int i, final boolean z) {
        act().duringCreated(FeedModule.f314b.m1443c2(cameraSticker)).subscribe(mkd0.G(new e30() { // from class: l.ivg
            public final void call(Object obj) {
                this.f9142a.m11362M(cameraSticker, i, z, (File) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        if (i < this.f9532d.size()) {
            return this.f9532d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m11361L(int i, CameraSticker cameraSticker, View view) {
        if (this.f9535g == i) {
            return;
        }
        exq.m9963c(view.getParent(), i);
        this.f9534f.call(new xaj0(cameraSticker, Integer.valueOf(i), Boolean.TRUE));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m11362M(CameraSticker cameraSticker, int i, boolean z, File file) {
        if (NullChecker.a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.h(R$string.f592q1);
        }
        m11353P(cameraSticker);
        CameraSticker cameraStickerM17104b = yb4.m17102c().m17104b();
        if (NullChecker.b(cameraStickerM17104b) && TextUtils.equals(cameraStickerM17104b.cId, cameraSticker.cId) && this.f9535g == i && cameraSticker.hasModelFile) {
            if (NullChecker.a(this.f9538j)) {
                this.f9538j.a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m11354R(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m11363N(xaj0 xaj0Var) {
        m11365S((CameraSticker) xaj0Var.a, ((Integer) xaj0Var.b).intValue(), ((Boolean) xaj0Var.c).booleanValue());
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m11352O(CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.a(this.f9532d) && NullChecker.a(cameraSticker)) {
            for (int i = 0; i < this.f9532d.size() && (cameraSticker2 = this.f9532d.get(i)) != cameraSticker; i++) {
                if (NullChecker.b(cameraSticker2) && TextUtils.equals(cameraSticker2.f680id, cameraSticker.f680id)) {
                    int i2 = cameraSticker.state;
                    cameraSticker2.state = i2;
                    if (i2 == 3) {
                        cameraSticker2.hasModelFile = true;
                        cameraSticker2.modelFilePath = cameraSticker.modelFilePath;
                    }
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m11365S(CameraSticker cameraSticker, int i, boolean z) {
        this.f9535g = i;
        yb4.m17102c().m17113l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.a(this.f9538j)) {
                this.f9538j.a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m11354R(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m11353P(cameraSticker);
            m11359J(cameraSticker, i, z);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: T */
    public void m11366T(g30<Integer, CameraSticker, Boolean> g30Var) {
        this.f9538j = g30Var;
    }

    /* JADX INFO: renamed from: U */
    public void m11367U(@Nullable List<CameraSticker> list) {
        if (!NullChecker.a(list) || list.equals(this.f9532d)) {
            return;
        }
        this.f9532d = list;
        notifyDataSetChanged();
    }
}
