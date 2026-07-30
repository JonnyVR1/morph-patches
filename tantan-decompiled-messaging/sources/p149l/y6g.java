package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import java.util.Collections;
import java.util.List;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y6g extends LiveMenuDialogHolder<p7g> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f196551k;

    /* JADX INFO: renamed from: l */
    public VImage f196552l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f196553m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f196554n;

    /* JADX INFO: renamed from: o */
    public VText f196555o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f196556p;

    /* JADX INFO: renamed from: q */
    public VText f196557q;

    /* JADX INFO: renamed from: r */
    public final LiveBaseAdapter f196558r;

    public y6g(Act act, p7g p7gVar) {
        super(t6c0.f168431m3, act, p7gVar, j2g0.m139455b());
        this.f196558r = new LiveBaseAdapter();
        m71832B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ ybs m213113H(BLiveCommonViewConfig bLiveCommonViewConfig) {
        return new ybs(bLiveCommonViewConfig.icon, bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m213114I(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m213116M(View view) {
        T t = this.f47757b;
        if (t != 0) {
            ((p7g) t).m167743t4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m213117N(View view) {
        m71839q(null);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f47760e;
    }

    /* JADX INFO: renamed from: K */
    public final void m213118K(View view) {
        z6g.m217394a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m213120O(imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m95419b().getWidth() > 0) {
                Bitmap bitmapM95419b = a9gVar.m95419b();
                xdl0.m208327D0((int) (((bitmapM95419b.getWidth() * 1.0f) / bitmapM95419b.getHeight()) * this.f196554n.f49081i.getHeight()), this.f196554n.f49081i);
            }
        }
        this.f196554n.f49081i.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: S */
    public void m213124S(User user, boolean z) {
        this.f196554n.m72904j0(user, true);
        this.f196554n.setSettingButtonVisibility(z);
        boolean zM192015a = u6n.m192015a();
        VText vText = this.f196557q;
        if (zM192015a) {
            vText.setText(user.matchedOrFollowed() ? R$string.f46604C3 : R$string.f46886P3);
        } else {
            vText.setText(user.matchedOrFollowed() ? R$string.f46582B3 : R$string.f46865O3);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m213125T(m6g m6gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail = m6gVar.f131680a;
        if (bLiveFanBaseDetail != null) {
            this.f196554n.m72905k0(bLiveFanBaseDetail.memberCount);
            BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = m6gVar.f131680a.summary;
            if (bLiveFanBaseDetailSummary != null && !TextUtils.isEmpty(bLiveFanBaseDetailSummary.rankInfo)) {
                this.f196555o.setText(bLiveFanBaseDetailSummary.rankInfo);
            }
            m213127V(m6gVar.f131680a.icons);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m213126U(gm0 gm0Var, m6g m6gVar) {
        BLiveFanBaseDetail bLiveFanBaseDetail;
        BLiveFanBaseMedal bLiveFanBaseMedal;
        int i = (m6gVar == null || (bLiveFanBaseDetail = m6gVar.f131680a) == null || (bLiveFanBaseMedal = bLiveFanBaseDetail.defaultMedal) == null) ? 1 : bLiveFanBaseMedal.grade;
        BLiveCommonViewConfig bLiveCommonViewConfig = gm0Var.f103418b;
        if (bLiveCommonViewConfig != null) {
            ((p7g) this.f47757b).duringCreated(h9g.m130000i(i, bLiveCommonViewConfig, gm0Var.f103417a)).subscribe(ffw.m121194e(new e30() { // from class: l.v6g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180190a.m213120O((imf0) obj);
                }
            }, new e30() { // from class: l.w6g
                @Override // p149l.e30
                public final void call(Object obj) {
                    y6g.m213114I((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m213127V(List<BLiveCommonViewConfig> list) {
        int size = 3;
        if (list.size() < 3) {
            size = !list.isEmpty() ? list.size() : 1;
        }
        RecyclerView recyclerView = this.f196556p;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), size));
        this.f196558r.m67372a0(vwb.m200303Q(list, new w9j() { // from class: l.x6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y6g.m213113H((BLiveCommonViewConfig) obj);
            }
        }), true);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        this.f196558r.m67371Z(Collections.EMPTY_LIST);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m213118K(view);
        this.f196554n.m72906l0(true);
        this.f196556p.setAdapter(this.f196558r);
        uep0.m193311F(this.f196557q, new View.OnClickListener() { // from class: l.t6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f168613a.m213116M(view2);
            }
        }, 1500L);
        xdl0.m208329E0(this.f196552l, new View.OnClickListener() { // from class: l.u6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f174837a.m213117N(view2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m213121P() {
    }

    /* JADX INFO: renamed from: Q */
    public void m213122Q() {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(p7g p7gVar) {
    }

    /* JADX INFO: renamed from: R */
    public void m213123R(Throwable th) {
    }
}
