package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseDetailSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r6g extends LiveMenuDialogHolder<mag> {

    /* JADX INFO: renamed from: A */
    public boolean f157917A;

    /* JADX INFO: renamed from: k */
    public View f157918k;

    /* JADX INFO: renamed from: l */
    public VImage f157919l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f157920m;

    /* JADX INFO: renamed from: n */
    public LiveFansClubAnchorProfileView f157921n;

    /* JADX INFO: renamed from: o */
    public NestedScrollView f157922o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f157923p;

    /* JADX INFO: renamed from: q */
    public TextView f157924q;

    /* JADX INFO: renamed from: r */
    public VText f157925r;

    /* JADX INFO: renamed from: s */
    public VImage f157926s;

    /* JADX INFO: renamed from: t */
    public VImage f157927t;

    /* JADX INFO: renamed from: u */
    public VText f157928u;

    /* JADX INFO: renamed from: v */
    public LiveFansClubLevelView f157929v;

    /* JADX INFO: renamed from: w */
    public RecyclerView f157930w;

    /* JADX INFO: renamed from: x */
    public FansClubSweetCompanyView f157931x;

    /* JADX INFO: renamed from: y */
    public FansClubEventView f157932y;

    /* JADX INFO: renamed from: z */
    public FansBottomSelectView f157933z;

    public r6g(Act act, mag magVar) {
        super(t6c0.f168418l3, act, magVar, j2g0.m139456c(0.5f));
        m71832B(true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m178050H(Throwable th) {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        T t = this.f47757b;
        if (t == 0) {
            return null;
        }
        return ((mag) t).act();
    }

    /* JADX INFO: renamed from: J */
    public final void m178052J(View view) {
        s6g.m182446a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m178054L() {
        this.f157933z.setVisibility(8);
        this.f157932y.m72868c();
    }

    /* JADX INFO: renamed from: M */
    public void m178055M(boolean z) {
        this.f157917A = z;
        xdl0.m208344M(this.f157928u, z);
        xdl0.m208344M(this.f157930w, !z);
        xdl0.m208344M(this.f157927t, z);
        xdl0.m208344M(this.f157929v, !z);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m178056N(View view) {
        ((mag) this.f47757b).m153653E4();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m178057O(View view) {
        ((mag) this.f47757b).mo153654F4();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m178058P(imf0 imf0Var) {
        if (imf0Var instanceof a9g) {
            a9g a9gVar = (a9g) imf0Var;
            if (a9gVar.m95419b().getWidth() > 0) {
                Bitmap bitmapM95419b = a9gVar.m95419b();
                xdl0.m208327D0((int) (((bitmapM95419b.getWidth() * 1.0f) / bitmapM95419b.getHeight()) * this.f157926s.getHeight()), this.f157926s);
            }
        }
        this.f157926s.setBackground(imf0Var);
    }

    /* JADX INFO: renamed from: Q */
    public void m178059Q() {
        xdl0.m208345M0(this.f157926s, false);
        if (this.f157917A) {
            return;
        }
        this.f157929v.m72919i(true);
    }

    /* JADX INFO: renamed from: R */
    public void m178060R(h8g h8gVar) {
        C22306c<imf0> c22306cM130001j;
        xdl0.m208345M0(this.f157926s, true);
        if (!this.f157917A) {
            this.f157929v.m72919i(false);
        }
        m6g m6gVarM129884b = h8gVar.m129884b();
        if (m6gVarM129884b != null) {
            if (!this.f157917A) {
                BLiveFanBaseHierarchy bLiveFanBaseHierarchy = m6gVarM129884b.f131681b;
                if (bLiveFanBaseHierarchy != null) {
                    this.f157929v.m72917g(this.f47757b, bLiveFanBaseHierarchy);
                } else {
                    BLiveFanBaseMedal bLiveFanBaseMedal = m6gVarM129884b.f131682c;
                    if (bLiveFanBaseMedal != null) {
                        this.f157929v.m72918h(this.f47757b, bLiveFanBaseMedal);
                    }
                }
            }
            BLiveFanBaseMedal bLiveFanBaseMedal2 = m6gVarM129884b.f131682c;
            if (bLiveFanBaseMedal2 != null && (c22306cM130001j = h9g.m130001j(bLiveFanBaseMedal2.grade, h8gVar.m129883a())) != null) {
                ((mag) this.f47757b).duringCreated(c22306cM130001j).subscribe(ffw.m121194e(new e30() { // from class: l.p6g
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f147403a.m178058P((imf0) obj);
                    }
                }, new e30() { // from class: l.q6g
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r6g.m178050H((Throwable) obj);
                    }
                }));
            }
            if (m6gVarM129884b.f131680a != null) {
                VText vText = this.f157925r;
                vText.setText(String.format(vText.getContext().getString(R$string.f46626D3), Integer.valueOf(m6gVarM129884b.f131680a.memberCount)));
                BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = m6gVarM129884b.f131680a.summary;
                if (bLiveFanBaseDetailSummary != null) {
                    boolean z = this.f157917A;
                    VText vText2 = this.f157928u;
                    if (z) {
                        vText2.setText(bLiveFanBaseDetailSummary.onlineInfo);
                        this.f157928u.setTextColor(-98787);
                    } else {
                        vText2.setText(bLiveFanBaseDetailSummary.rankInfo);
                        this.f157928u.setTextColor(-98787);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m178061S(kgg kggVar) {
        this.f157922o.m1373q(130);
        this.f157932y.m72870e((mag) this.f47757b, kggVar, this.f157933z);
    }

    /* JADX INFO: renamed from: T */
    public void m178062T(User user) {
        this.f157921n.m72904j0(user, false);
        this.f157924q.setText(user.name);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        VImage vImage = this.f157919l;
        if (vImage != null) {
            vImage.setOnClickListener(null);
        }
        VImage vImage2 = this.f157927t;
        if (vImage2 != null) {
            vImage2.setOnClickListener(null);
        }
        FansClubEventView fansClubEventView = this.f157932y;
        if (fansClubEventView != null) {
            fansClubEventView.setOnClickListener(null);
        }
        FansClubSweetCompanyView fansClubSweetCompanyView = this.f157931x;
        if (fansClubSweetCompanyView != null) {
            fansClubSweetCompanyView.setOnClickListener(null);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m178052J(view);
        ((mag) this.f47757b).mo100956C4();
        this.f157919l.setImageResource(i3c0.f110818P1);
        xdl0.m208329E0(this.f157919l, new View.OnClickListener() { // from class: l.n6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f137398a.m178056N(view2);
            }
        });
        xdl0.m208329E0(this.f157927t, new View.OnClickListener() { // from class: l.o6g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142344a.m178057O(view2);
            }
        });
        xdl0.m208344M(this.f157932y, ((mag) this.f47757b).m206032L2());
        if (((mag) this.f47757b).m206032L2()) {
            this.f157932y.m72869d(((mag) this.f47757b).m150134b4(), this.f47757b);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        NestedScrollView nestedScrollView = this.f157922o;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mag magVar) {
    }
}
