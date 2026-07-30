package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import java.util.Collections;
import java.util.List;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class m8g extends LiveMenuDialogHolder<d9g> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f135177k;

    /* JADX INFO: renamed from: l */
    public VImage f135178l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f135179m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f135180n;

    /* JADX INFO: renamed from: o */
    public VText f135181o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f135182p;

    /* JADX INFO: renamed from: q */
    public VText f135183q;

    /* JADX INFO: renamed from: r */
    public final LiveBaseAdapter f135184r;

    public m8g(Act act, d9g d9gVar) {
        super(yec0.f199163m3, act, d9gVar, qag0.m175921b());
        this.f135184r = new LiveBaseAdapter();
        m73015B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ zds m157361H(BLiveCommonViewConfig bLiveCommonViewConfig) {
        return new zds(bLiveCommonViewConfig.icon, bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m157362I(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m157364M(View view) {
        T t = this.f48605b;
        if (t != 0) {
            ((d9g) t).m115059t4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m157365N(View view) {
        m73022q(null);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f48608e;
    }

    /* JADX INFO: renamed from: K */
    public final void m157366K(View view) {
        n8g.m161921a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m157368O(ruf0 ruf0Var) {
        if (ruf0Var instanceof oag) {
            oag oagVar = (oag) ruf0Var;
            if (oagVar.m166838b().getWidth() > 0) {
                Bitmap bitmapM166838b = oagVar.m166838b();
                bnl0.m105507D0((int) (((bitmapM166838b.getWidth() * 1.0f) / bitmapM166838b.getHeight()) * this.f135180n.f49929i.getHeight()), this.f135180n.f49929i);
            }
        }
        this.f135180n.f49929i.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: S */
    public void m157372S(User user, boolean z) {
        this.f135180n.m74087j0(user, true);
        this.f135180n.setSettingButtonVisibility(z);
        boolean zM195065a = u8n.m195065a();
        VText vText = this.f135183q;
        if (zM195065a) {
            vText.setText(user.matchedOrFollowed() ? R$string.f47452C3 : R$string.f47734P3);
        } else {
            vText.setText(user.matchedOrFollowed() ? R$string.f47430B3 : R$string.f47713O3);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m157373T(a8g a8gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail = a8gVar.f68918a;
        if (bLiveFanBaseDetail != null) {
            this.f135180n.m74088k0(bLiveFanBaseDetail.memberCount);
            BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = a8gVar.f68918a.summary;
            if (bLiveFanBaseDetailSummary != null && !TextUtils.isEmpty(bLiveFanBaseDetailSummary.rankInfo)) {
                this.f135181o.setText(bLiveFanBaseDetailSummary.rankInfo);
            }
            m157375V(a8gVar.f68918a.icons);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m157374U(cm0 cm0Var, a8g a8gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail;
        BLiveFanBaseMedal bLiveFanBaseMedal;
        int i = (a8gVar == null || (bLiveFanBaseDetail = a8gVar.f68918a) == null || (bLiveFanBaseMedal = bLiveFanBaseDetail.defaultMedal) == null) ? 1 : bLiveFanBaseMedal.grade;
        BLiveCommonViewConfig bLiveCommonViewConfig = cm0Var.f82502b;
        if (bLiveCommonViewConfig != null) {
            ((d9g) this.f48605b).duringCreated(vag.m200515i(i, bLiveCommonViewConfig, cm0Var.f82501a)).subscribe(dhw.m115826e(new y20() { // from class: l.j8g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118777a.m157368O((ruf0) obj);
                }
            }, new y20() { // from class: l.k8g
                @Override // p153l.y20
                public final void call(Object obj) {
                    m8g.m157362I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m157375V(List<BLiveCommonViewConfig> list) {
        int size = 3;
        if (list.size() < 3) {
            size = !list.isEmpty() ? list.size() : 1;
        }
        RecyclerView recyclerView = this.f135182p;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), size));
        this.f135184r.m68555a0(jyb.m147486Q(list, new qcj() { // from class: l.l8g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return m8g.m157361H((BLiveCommonViewConfig) obj);
            }
        }), true);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        this.f135184r.m68554Z(Collections.EMPTY_LIST);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m157366K(view);
        this.f135180n.m74089l0(true);
        this.f135182p.setAdapter(this.f135184r);
        ynp0.m216921F(this.f135183q, new View.OnClickListener() { // from class: l.h8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f108238a.m157364M(view2);
            }
        }, 1500L);
        bnl0.m105509E0(this.f135178l, new View.OnClickListener() { // from class: l.i8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f113340a.m157365N(view2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m157369P() {
    }

    /* JADX INFO: renamed from: Q */
    public void m157370Q() {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d9g d9gVar) {
    }

    /* JADX INFO: renamed from: R */
    public void m157371R(Throwable th) {
    }
}
