package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f8g extends LiveMenuDialogHolder<acg> {

    /* JADX INFO: renamed from: A */
    public boolean f97721A;

    /* JADX INFO: renamed from: k */
    public View f97722k;

    /* JADX INFO: renamed from: l */
    public VImage f97723l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f97724m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f97725n;

    /* JADX INFO: renamed from: o */
    public NestedScrollView f97726o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f97727p;

    /* JADX INFO: renamed from: q */
    public TextView f97728q;

    /* JADX INFO: renamed from: r */
    public VText f97729r;

    /* JADX INFO: renamed from: s */
    public VImage f97730s;

    /* JADX INFO: renamed from: t */
    public VImage f97731t;

    /* JADX INFO: renamed from: u */
    public VText f97732u;

    /* JADX INFO: renamed from: v */
    public LiveFansClubLevelView f97733v;

    /* JADX INFO: renamed from: w */
    public RecyclerView f97734w;

    /* JADX INFO: renamed from: x */
    public FansClubSweetCompanyView f97735x;

    /* JADX INFO: renamed from: y */
    public FansClubEventView f97736y;

    /* JADX INFO: renamed from: z */
    public FansBottomSelectView f97737z;

    public f8g(Act act, acg acgVar) {
        super(yec0.f199150l3, act, acgVar, qag0.m175922c(0.5f));
        m73015B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m124521H(Throwable th) {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        T t = this.f48605b;
        if (t == 0) {
            return null;
        }
        return ((acg) t).act();
    }

    /* JADX INFO: renamed from: J */
    public final void m124523J(View view) {
        g8g.m129405a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m124525L() {
        this.f97737z.setVisibility(8);
        this.f97736y.m74051c();
    }

    /* JADX INFO: renamed from: M */
    public void m124526M(boolean z) {
        this.f97721A = z;
        bnl0.m105524M(this.f97732u, z);
        bnl0.m105524M(this.f97734w, !z);
        bnl0.m105524M(this.f97731t, z);
        bnl0.m105524M(this.f97733v, !z);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m124527N(View view) {
        ((acg) this.f48605b).m96834E4();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m124528O(View view) {
        ((acg) this.f48605b).mo96835F4();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m124529P(ruf0 ruf0Var) {
        if (ruf0Var instanceof oag) {
            oag oagVar = (oag) ruf0Var;
            if (oagVar.m166838b().getWidth() > 0) {
                Bitmap bitmapM166838b = oagVar.m166838b();
                bnl0.m105507D0((int) (((bitmapM166838b.getWidth() * 1.0f) / bitmapM166838b.getHeight()) * this.f97730s.getHeight()), this.f97730s);
            }
        }
        this.f97730s.setBackground(ruf0Var);
    }

    /* JADX INFO: renamed from: Q */
    public void m124530Q() {
        bnl0.m105525M0(this.f97730s, false);
        if (this.f97721A) {
            return;
        }
        this.f97733v.m74102i(true);
    }

    /* JADX INFO: renamed from: R */
    public void m124531R(v9g v9gVar) {
        C22421c<ruf0> c22421cM200516j;
        bnl0.m105525M0(this.f97730s, true);
        if (!this.f97721A) {
            this.f97733v.m74102i(false);
        }
        a8g a8gVarM200445b = v9gVar.m200445b();
        if (a8gVarM200445b != null) {
            if (!this.f97721A) {
                BLiveFanBaseHierarchy bLiveFanBaseHierarchy = a8gVarM200445b.f68919b;
                if (bLiveFanBaseHierarchy != null) {
                    this.f97733v.m74100g(this.f48605b, bLiveFanBaseHierarchy);
                } else {
                    BLiveFanBaseMedal bLiveFanBaseMedal = a8gVarM200445b.f68920c;
                    if (bLiveFanBaseMedal != null) {
                        this.f97733v.m74101h(this.f48605b, bLiveFanBaseMedal);
                    }
                }
            }
            BLiveFanBaseMedal bLiveFanBaseMedal2 = a8gVarM200445b.f68920c;
            if (bLiveFanBaseMedal2 != null && (c22421cM200516j = vag.m200516j(bLiveFanBaseMedal2.grade, v9gVar.m200444a())) != null) {
                ((acg) this.f48605b).duringCreated(c22421cM200516j).subscribe(dhw.m115826e(new y20() { // from class: l.d8g
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f85597a.m124529P((ruf0) obj);
                    }
                }, new y20() { // from class: l.e8g
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        f8g.m124521H((Throwable) obj);
                    }
                }));
            }
            if (a8gVarM200445b.f68918a != null) {
                VText vText = this.f97729r;
                vText.setText(String.format(vText.getContext().getString(R$string.f47474D3), Integer.valueOf(a8gVarM200445b.f68918a.memberCount)));
                BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = a8gVarM200445b.f68918a.summary;
                if (bLiveFanBaseDetailSummary != null) {
                    boolean z = this.f97721A;
                    VText vText2 = this.f97732u;
                    if (z) {
                        vText2.setText(bLiveFanBaseDetailSummary.onlineInfo);
                        this.f97732u.setTextColor(-98787);
                    } else {
                        vText2.setText(bLiveFanBaseDetailSummary.rankInfo);
                        this.f97732u.setTextColor(-98787);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m124532S(yhg yhgVar) {
        this.f97726o.m1374q(130);
        this.f97736y.m74053e((acg) this.f48605b, yhgVar, this.f97737z);
    }

    /* JADX INFO: renamed from: T */
    public void m124533T(User user) {
        this.f97725n.m74087j0(user, false);
        this.f97728q.setText(user.name);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        VImage vImage = this.f97723l;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f97731t;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
        FansClubEventView fansClubEventView = this.f97736y;
        if (fansClubEventView != null) {
            fansClubEventView.setOnClickListener(null);
        }
        FansClubSweetCompanyView fansClubSweetCompanyView = this.f97735x;
        if (fansClubSweetCompanyView != null) {
            fansClubSweetCompanyView.setOnClickListener(null);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m124523J(view);
        ((acg) this.f48605b).mo96832C4();
        this.f97723l.setImageResource(obc0.f146146P1);
        bnl0.m105509E0(this.f97723l, new View.OnClickListener() { // from class: l.b8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75427a.m124527N(view2);
            }
        });
        bnl0.m105509E0(this.f97731t, new View.OnClickListener() { // from class: l.c8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80206a.m124528O(view2);
            }
        });
        bnl0.m105524M(this.f97736y, ((acg) this.f48605b).m213815L2());
        if (((acg) this.f48605b).m213815L2()) {
            this.f97736y.m74052d(((acg) this.f48605b).m191482b4(), this.f48605b);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        NestedScrollView nestedScrollView = this.f97726o;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(acg acgVar) {
    }
}
