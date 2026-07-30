package p153l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ywg extends jic0<CameraSticker> {

    /* JADX INFO: renamed from: c */
    public Context f201828c;

    /* JADX INFO: renamed from: g */
    public int f201832g;

    /* JADX INFO: renamed from: i */
    public CameraSticker f201834i;

    /* JADX INFO: renamed from: j */
    public a30<Integer, CameraSticker, Boolean> f201835j;

    /* JADX INFO: renamed from: d */
    public List<CameraSticker> f201829d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public HashMap<String, Animator> f201830e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public int f201833h = 1;

    /* JADX INFO: renamed from: f */
    public final y20<bkj0<CameraSticker, Integer, Boolean>> f201831f = dmk0.m116962a(300, new y20() { // from class: l.vwg
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f186134a.m217606N((bkj0) obj);
        }
    });

    public ywg(Context context) {
        this.f201828c = context;
        mo68557c(act(), xc4.m210114c().f193263f).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wwg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191276a.m217598O((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m217599P(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                xc4.m210114c().f193263f.m137019l(cameraSticker);
                xc4.m210114c().m210117d().remove(cameraSticker.f40067id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        xc4.m210114c().f193263f.m137019l(cameraSticker);
        xc4.m210114c().m210117d().put(cameraSticker.f40067id, cameraSticker);
    }

    /* JADX INFO: renamed from: R */
    private void m217600R(CameraSticker cameraSticker, int i) {
        int i2 = this.f201833h;
        this.f201833h = i;
        this.f201834i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    private Act act() {
        return (Act) this.f201828c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f201829d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedComicFaceItemView(this.f201828c);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, CameraSticker cameraSticker, int i, final int i2) {
        FeedComicFaceItemView feedComicFaceItemView = (FeedComicFaceItemView) view;
        if (i2 < this.f201829d.size()) {
            final CameraSticker cameraSticker2 = this.f201829d.get(i2);
            feedComicFaceItemView.setTag(cameraSticker2.f40067id);
            if (feedComicFaceItemView.m63302c(cameraSticker, this.f201830e, i2, xc4.m210114c().m210118e())) {
                this.f201833h = i2;
            }
            feedComicFaceItemView.setOnClickListener(new View.OnClickListener() { // from class: l.uwg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f181262a.m217604L(i2, cameraSticker2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m217602J(final CameraSticker cameraSticker, final int i, final boolean z) {
        act().duringCreated(FeedModule.f39701b.m61701c2(cameraSticker)).subscribe(psd0.m173596G(new y20() { // from class: l.xwg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196495a.m217605M(cameraSticker, i, z, (File) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        if (i < this.f201829d.size()) {
            return this.f201829d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m217604L(int i, CameraSticker cameraSticker, View view) {
        if (this.f201832g == i) {
            return;
        }
        ezq.m123398c((RecyclerView) view.getParent(), i);
        this.f201831f.call(new bkj0<>(cameraSticker, Integer.valueOf(i), Boolean.TRUE));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m217605M(CameraSticker cameraSticker, int i, boolean z, File file) {
        if (NullChecker.m82486a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            o1j0.m165634h(R$string.f39979q1);
        }
        m217599P(cameraSticker);
        CameraSticker cameraStickerM210116b = xc4.m210114c().m210116b();
        if (NullChecker.m82487b(cameraStickerM210116b) && TextUtils.equals(cameraStickerM210116b.cId, cameraSticker.cId) && this.f201832g == i && cameraSticker.hasModelFile) {
            if (NullChecker.m82486a(this.f201835j)) {
                this.f201835j.mo37058a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m217600R(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m217606N(bkj0 bkj0Var) {
        m217608S((CameraSticker) bkj0Var.f77081a, ((Integer) bkj0Var.f77082b).intValue(), ((Boolean) bkj0Var.f77083c).booleanValue());
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m217598O(CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m82486a(this.f201829d) && NullChecker.m82486a(cameraSticker)) {
            for (int i = 0; i < this.f201829d.size() && (cameraSticker2 = this.f201829d.get(i)) != cameraSticker; i++) {
                if (NullChecker.m82487b(cameraSticker2) && TextUtils.equals(cameraSticker2.f40067id, cameraSticker.f40067id)) {
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
    public final void m217608S(CameraSticker cameraSticker, int i, boolean z) {
        this.f201832g = i;
        xc4.m210114c().m210125l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m82486a(this.f201835j)) {
                this.f201835j.mo37058a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m217600R(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m217599P(cameraSticker);
            m217602J(cameraSticker, i, z);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: T */
    public void m217609T(a30<Integer, CameraSticker, Boolean> a30Var) {
        this.f201835j = a30Var;
    }

    /* JADX INFO: renamed from: U */
    public void m217610U(@Nullable List<CameraSticker> list) {
        if (!NullChecker.m82486a(list) || list.equals(this.f201829d)) {
            return;
        }
        this.f201829d = list;
        notifyDataSetChanged();
    }
}
