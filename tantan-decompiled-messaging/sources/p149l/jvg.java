package p149l;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class jvg extends dac0<CameraSticker> {

    /* JADX INFO: renamed from: c */
    public Context f119931c;

    /* JADX INFO: renamed from: g */
    public int f119935g;

    /* JADX INFO: renamed from: i */
    public CameraSticker f119937i;

    /* JADX INFO: renamed from: j */
    public g30<Integer, CameraSticker, Boolean> f119938j;

    /* JADX INFO: renamed from: d */
    public List<CameraSticker> f119932d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public HashMap<String, Animator> f119933e = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public int f119936h = 1;

    /* JADX INFO: renamed from: f */
    public final e30<xaj0<CameraSticker, Integer, Boolean>> f119934f = xck0.m208120a(300, new e30() { // from class: l.gvg
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f104571a.m143499N((xaj0) obj);
        }
    });

    public jvg(Context context) {
        this.f119931c = context;
        mo67374c(act(), yb4.m213936c().f197305f).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.hvg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109643a.m143491O((CameraSticker) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    private void m143492P(CameraSticker cameraSticker) {
        int i = cameraSticker.state;
        if (i != 2) {
            if (i == 3) {
                yb4.m213936c().f197305f.m132487l(cameraSticker);
                yb4.m213936c().m213939d().remove(cameraSticker.f39219id);
                return;
            } else if (i != 4) {
                return;
            }
        }
        yb4.m213936c().f197305f.m132487l(cameraSticker);
        yb4.m213936c().m213939d().put(cameraSticker.f39219id, cameraSticker);
    }

    /* JADX INFO: renamed from: R */
    private void m143493R(CameraSticker cameraSticker, int i) {
        int i2 = this.f119936h;
        this.f119936h = i;
        this.f119937i = cameraSticker;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    private Act act() {
        return (Act) this.f119931c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f119932d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedComicFaceItemView(this.f119931c);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, CameraSticker cameraSticker, int i, final int i2) {
        FeedComicFaceItemView feedComicFaceItemView = (FeedComicFaceItemView) view;
        if (i2 < this.f119932d.size()) {
            final CameraSticker cameraSticker2 = this.f119932d.get(i2);
            feedComicFaceItemView.setTag(cameraSticker2.f39219id);
            if (feedComicFaceItemView.m62119c(cameraSticker, this.f119933e, i2, yb4.m213936c().m213940e())) {
                this.f119936h = i2;
            }
            feedComicFaceItemView.setOnClickListener(new View.OnClickListener() { // from class: l.fvg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f99422a.m143497L(i2, cameraSticker2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m143495J(final CameraSticker cameraSticker, final int i, final boolean z) {
        act().duringCreated(FeedModule.f38853b.m60517c2(cameraSticker)).subscribe(mkd0.m154955G(new e30() { // from class: l.ivg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115163a.m143498M(cameraSticker, i, z, (File) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public CameraSticker getItem(int i) {
        if (i < this.f119932d.size()) {
            return this.f119932d.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m143497L(int i, CameraSticker cameraSticker, View view) {
        if (this.f119935g == i) {
            return;
        }
        exq.m118694c((RecyclerView) view.getParent(), i);
        this.f119934f.call(new xaj0<>(cameraSticker, Integer.valueOf(i), Boolean.TRUE));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m143498M(CameraSticker cameraSticker, int i, boolean z, File file) {
        if (NullChecker.m81303a(file)) {
            cameraSticker.state = 3;
            cameraSticker.hasModelFile = true;
            cameraSticker.modelFilePath = file.getAbsolutePath();
        } else {
            cameraSticker.state = 4;
            lsi0.m151578h(R$string.f39131q1);
        }
        m143492P(cameraSticker);
        CameraSticker cameraStickerM213938b = yb4.m213936c().m213938b();
        if (NullChecker.m81304b(cameraStickerM213938b) && TextUtils.equals(cameraStickerM213938b.cId, cameraSticker.cId) && this.f119935g == i && cameraSticker.hasModelFile) {
            if (NullChecker.m81303a(this.f119938j)) {
                this.f119938j.mo36055a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m143493R(cameraSticker, i);
        }
        notifyItemChanged(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m143499N(xaj0 xaj0Var) {
        m143501S((CameraSticker) xaj0Var.f191751a, ((Integer) xaj0Var.f191752b).intValue(), ((Boolean) xaj0Var.f191753c).booleanValue());
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m143491O(CameraSticker cameraSticker) {
        CameraSticker cameraSticker2;
        if (NullChecker.m81303a(this.f119932d) && NullChecker.m81303a(cameraSticker)) {
            for (int i = 0; i < this.f119932d.size() && (cameraSticker2 = this.f119932d.get(i)) != cameraSticker; i++) {
                if (NullChecker.m81304b(cameraSticker2) && TextUtils.equals(cameraSticker2.f39219id, cameraSticker.f39219id)) {
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
    public final void m143501S(CameraSticker cameraSticker, int i, boolean z) {
        this.f119935g = i;
        yb4.m213936c().m213947l(cameraSticker);
        if (cameraSticker.hasModelFile) {
            if (NullChecker.m81303a(this.f119938j)) {
                this.f119938j.mo36055a(Integer.valueOf(i), cameraSticker, Boolean.valueOf(z));
            }
            m143493R(cameraSticker, i);
        } else {
            if (cameraSticker.state == 2) {
                return;
            }
            cameraSticker.state = 2;
            m143492P(cameraSticker);
            m143495J(cameraSticker, i, z);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: T */
    public void m143502T(g30<Integer, CameraSticker, Boolean> g30Var) {
        this.f119938j = g30Var;
    }

    /* JADX INFO: renamed from: U */
    public void m143503U(@Nullable List<CameraSticker> list) {
        if (!NullChecker.m81303a(list) || list.equals(this.f119932d)) {
            return;
        }
        this.f119932d = list;
        notifyDataSetChanged();
    }
}
