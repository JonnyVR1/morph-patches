package p002l;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import l.e30;
import l.ffw;
import l.imf0;
import l.xdl0;
import rx.c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r6g extends LiveMenuDialogHolder<mag> {

    /* JADX INFO: renamed from: A */
    public boolean f18377A;

    /* JADX INFO: renamed from: k */
    public View f18378k;

    /* JADX INFO: renamed from: l */
    public VImage f18379l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f18380m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f18381n;

    /* JADX INFO: renamed from: o */
    public NestedScrollView f18382o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f18383p;

    /* JADX INFO: renamed from: q */
    public TextView f18384q;

    /* JADX INFO: renamed from: r */
    public VText f18385r;

    /* JADX INFO: renamed from: s */
    public VImage f18386s;

    /* JADX INFO: renamed from: t */
    public VImage f18387t;

    /* JADX INFO: renamed from: u */
    public VText f18388u;

    /* JADX INFO: renamed from: v */
    public LiveFansClubLevelView f18389v;

    /* JADX INFO: renamed from: w */
    public RecyclerView f18390w;

    /* JADX INFO: renamed from: x */
    public FansClubSweetCompanyView f18391x;

    /* JADX INFO: renamed from: y */
    public FansClubEventView f18392y;

    /* JADX INFO: renamed from: z */
    public FansBottomSelectView f18393z;

    public r6g(Act act, mag magVar) {
        super(t6c0.f19914l3, act, magVar, j2g0.m15577c(0.5f));
        m5208B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m21783H(Throwable th) {
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        T t = this.f3799b;
        if (t == 0) {
            return null;
        }
        return ((mag) t).act();
    }

    /* JADX INFO: renamed from: J */
    public final void m21785J(View view) {
        s6g.m22212a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m21787L() {
        this.f18393z.setVisibility(8);
        this.f18392y.m6387c();
    }

    /* JADX INFO: renamed from: M */
    public void m21788M(boolean z) {
        this.f18377A = z;
        xdl0.M(this.f18388u, z);
        xdl0.M(this.f18390w, !z);
        xdl0.M(this.f18387t, z);
        xdl0.M(this.f18389v, !z);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m21789N(View view) {
        ((mag) this.f3799b).m17780E4();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m21790O(View view) {
        ((mag) this.f3799b).mo17781F4();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m21791P(imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m9456b().getWidth() > 0) {
                Bitmap bitmapM9456b = a9gVar.m9456b();
                xdl0.D0((int) (((bitmapM9456b.getWidth() * 1.0f) / bitmapM9456b.getHeight()) * this.f18386s.getHeight()), new View[]{this.f18386s});
            }
        }
        this.f18386s.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: Q */
    public void m21792Q() {
        xdl0.M0(this.f18386s, false);
        if (this.f18377A) {
            return;
        }
        this.f18389v.m6438i(true);
    }

    /* JADX INFO: renamed from: R */
    public void m21793R(h8g h8gVar) {
        c<imf0> cVarM14300j;
        xdl0.M0(this.f18386s, true);
        if (!this.f18377A) {
            this.f18389v.m6438i(false);
        }
        m6g m6gVarM14284b = h8gVar.m14284b();
        if (m6gVarM14284b != null) {
            if (!this.f18377A) {
                BLiveFanBaseHierarchy bLiveFanBaseHierarchy = m6gVarM14284b.f15252b;
                if (bLiveFanBaseHierarchy != null) {
                    this.f18389v.m6436g(this.f3799b, bLiveFanBaseHierarchy);
                } else {
                    BLiveFanBaseMedal bLiveFanBaseMedal = m6gVarM14284b.f15253c;
                    if (bLiveFanBaseMedal != null) {
                        this.f18389v.m6437h(this.f3799b, bLiveFanBaseMedal);
                    }
                }
            }
            BLiveFanBaseMedal bLiveFanBaseMedal2 = m6gVarM14284b.f15253c;
            if (bLiveFanBaseMedal2 != null && (cVarM14300j = h9g.m14300j(bLiveFanBaseMedal2.grade, h8gVar.m14283a())) != null) {
                ((mag) this.f3799b).duringCreated(cVarM14300j).subscribe(ffw.e(new e30() { // from class: l.p6g
                    public final void call(Object obj) {
                        this.f17024a.m21791P((imf0) obj);
                    }
                }, new e30() { // from class: l.q6g
                    public final void call(Object obj) {
                        r6g.m21783H((Throwable) obj);
                    }
                }));
            }
            if (m6gVarM14284b.f15251a != null) {
                VText vText = this.f18385r;
                vText.setText(String.format(vText.getContext().getString(R$string.f2668D3), Integer.valueOf(m6gVarM14284b.f15251a.memberCount)));
                BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = m6gVarM14284b.f15251a.summary;
                if (bLiveFanBaseDetailSummary != null) {
                    boolean z = this.f18377A;
                    VText vText2 = this.f18388u;
                    if (z) {
                        vText2.setText(bLiveFanBaseDetailSummary.onlineInfo);
                        this.f18388u.setTextColor(-98787);
                    } else {
                        vText2.setText(bLiveFanBaseDetailSummary.rankInfo);
                        this.f18388u.setTextColor(-98787);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m21794S(kgg kggVar) {
        this.f18382o.q(130);
        this.f18392y.m6389e((mag) this.f3799b, kggVar, this.f18393z);
    }

    /* JADX INFO: renamed from: T */
    public void m21795T(User user) {
        this.f18381n.m6423j0(user, false);
        this.f18384q.setText(user.name);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        VImage vImage = this.f18379l;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f18387t;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
        FansClubEventView fansClubEventView = this.f18392y;
        if (fansClubEventView != null) {
            fansClubEventView.setOnClickListener(null);
        }
        ConstraintLayout constraintLayout = this.f18391x;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(null);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m21785J(view);
        ((mag) this.f3799b).mo10218C4();
        this.f18379l.setImageResource(i3c0.f12603P1);
        xdl0.E0(this.f18379l, new View.OnClickListener() { // from class: l.n6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15836a.m21789N(view2);
            }
        });
        xdl0.E0(this.f18387t, new View.OnClickListener() { // from class: l.o6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f16376a.m21790O(view2);
            }
        });
        xdl0.M(this.f18392y, ((mag) this.f3799b).m25552L2());
        if (((mag) this.f3799b).m25552L2()) {
            this.f18392y.m6388d(((mag) this.f3799b).m17288b4(), this.f3799b);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        NestedScrollView nestedScrollView = this.f18382o;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(mag magVar) {
    }
}
