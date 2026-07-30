package p002l;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import java.util.Collections;
import java.util.List;
import l.e30;
import l.ffw;
import l.imf0;
import l.u6n;
import l.uep0;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y6g extends LiveMenuDialogHolder<p7g> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f22692k;

    /* JADX INFO: renamed from: l */
    public VImage f22693l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f22694m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f22695n;

    /* JADX INFO: renamed from: o */
    public VText f22696o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f22697p;

    /* JADX INFO: renamed from: q */
    public VText f22698q;

    /* JADX INFO: renamed from: r */
    public final LiveBaseAdapter f22699r;

    public y6g(Act act, p7g p7gVar) {
        super(t6c0.f19927m3, act, p7gVar, j2g0.m15576b());
        this.f22699r = new LiveBaseAdapter();
        m5208B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ ybs m26385H(BLiveCommonViewConfig bLiveCommonViewConfig) {
        return new ybs(bLiveCommonViewConfig.icon, bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m26386I(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m26388M(View view) {
        T t = this.f3799b;
        if (t != 0) {
            ((p7g) t).m20112t4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m26389N(View view) {
        m5217q(null);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return this.f3802e;
    }

    /* JADX INFO: renamed from: K */
    public final void m26390K(View view) {
        z6g.m27107a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m26392O(imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m9456b().getWidth() > 0) {
                Bitmap bitmapM9456b = a9gVar.m9456b();
                xdl0.D0((int) (((bitmapM9456b.getWidth() * 1.0f) / bitmapM9456b.getHeight()) * this.f22695n.f5123i.getHeight()), new View[]{this.f22695n.f5123i});
            }
        }
        this.f22695n.f5123i.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: S */
    public void m26396S(User user, boolean z) {
        this.f22695n.m6423j0(user, true);
        this.f22695n.setSettingButtonVisibility(z);
        boolean zA = u6n.a();
        VText vText = this.f22698q;
        if (zA) {
            vText.setText(user.matchedOrFollowed() ? R$string.f2646C3 : R$string.f2928P3);
        } else {
            vText.setText(user.matchedOrFollowed() ? R$string.f2624B3 : R$string.f2907O3);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m26397T(m6g m6gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail = m6gVar.f15251a;
        if (bLiveFanBaseDetail != null) {
            this.f22695n.m6424k0(bLiveFanBaseDetail.memberCount);
            BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = m6gVar.f15251a.summary;
            if (bLiveFanBaseDetailSummary != null && !TextUtils.isEmpty(bLiveFanBaseDetailSummary.rankInfo)) {
                this.f22696o.setText(bLiveFanBaseDetailSummary.rankInfo);
            }
            m26399V(m6gVar.f15251a.icons);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m26398U(gm0 gm0Var, m6g m6gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail;
        BLiveFanBaseMedal bLiveFanBaseMedal;
        int i = (m6gVar == null || (bLiveFanBaseDetail = m6gVar.f15251a) == null || (bLiveFanBaseMedal = bLiveFanBaseDetail.defaultMedal) == null) ? 1 : bLiveFanBaseMedal.grade;
        BLiveCommonViewConfig bLiveCommonViewConfig = gm0Var.f11510b;
        if (bLiveCommonViewConfig != null) {
            ((p7g) this.f3799b).duringCreated(h9g.m14299i(i, bLiveCommonViewConfig, gm0Var.f11509a)).subscribe(ffw.e(new e30() { // from class: l.v6g
                public final void call(Object obj) {
                    this.f21015a.m26392O((imf0) obj);
                }
            }, new e30() { // from class: l.w6g
                public final void call(Object obj) {
                    y6g.m26386I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m26399V(List<BLiveCommonViewConfig> list) {
        int size = 3;
        if (list.size() < 3) {
            size = !list.isEmpty() ? list.size() : 1;
        }
        RecyclerView recyclerView = this.f22697p;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), size));
        this.f22699r.a0(vwb.Q(list, new w9j() { // from class: l.x6g
            public final Object call(Object obj) {
                return y6g.m26385H((BLiveCommonViewConfig) obj);
            }
        }), true);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        this.f22699r.Z(Collections.EMPTY_LIST);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m26390K(view);
        this.f22695n.m6425l0(true);
        this.f22697p.setAdapter(this.f22699r);
        uep0.F(this.f22698q, new View.OnClickListener() { // from class: l.t6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20105a.m26388M(view2);
            }
        }, 1500L);
        xdl0.E0(this.f22693l, new View.OnClickListener() { // from class: l.u6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20505a.m26389N(view2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m26393P() {
    }

    /* JADX INFO: renamed from: Q */
    public void m26394Q() {
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(p7g p7gVar) {
    }

    /* JADX INFO: renamed from: R */
    public void m26395R(Throwable th) {
    }
}
