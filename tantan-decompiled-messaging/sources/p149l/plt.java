package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p147v.VEditText;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class plt implements s7m<okt> {

    /* JADX INFO: renamed from: a */
    public final LiveBaseAdapter f150166a = new LiveBaseAdapter();

    /* JADX INFO: renamed from: b */
    public final okt f150167b;

    /* JADX INFO: renamed from: c */
    public c4g0 f150168c;

    /* JADX INFO: renamed from: d */
    public final VRecyclerView f150169d;

    /* JADX INFO: renamed from: e */
    public final VEditText f150170e;

    /* JADX INFO: renamed from: l.plt$a */
    public class C19278a extends RecyclerView.AbstractC0582t {
        public C19278a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (plt.this.f150166a.getItemCount() <= 0 || i != 1) {
                return;
            }
            plt.this.getAct().hideInput(plt.this.f150170e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public plt(final okt oktVar, VRecyclerView vRecyclerView, VText vText, VEditText vEditText) {
        this.f150169d = vRecyclerView;
        this.f150170e = vEditText;
        this.f150167b = oktVar;
        m170270v();
        m170269u();
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.glt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                plt.m170263i(oktVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private String m170256E() {
        return getAct().pageId();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m170259c(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m170263i(okt oktVar, View view) {
        if (oktVar != null) {
            oktVar.m164903U2();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m170268q(Act act, String str, final d30 d30Var) {
        act.dialog().m20504F(str).m20541k0(R$string.f44179k).m20556t0(R$string.f44188n, new Runnable() { // from class: l.olt
            @Override // java.lang.Runnable
            public final void run() {
                plt.m170259c(d30Var);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: u */
    private void m170269u() {
        String strM195888m5 = s9s.f163228b.m195888m5();
        if (!TextUtils.isEmpty(strM195888m5)) {
            this.f150170e.setHint(strM195888m5);
        }
        this.f150168c = getAct().duringCreated(uep0.m193313H(this.f150170e)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.hlt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108373a.m170280w((CharSequence) obj);
            }
        }));
        this.f150170e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ilt
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f113875a.m170281x(textView, i, keyEvent);
            }
        });
        VEditText vEditText = this.f150170e;
        Objects.requireNonNull(vEditText);
        vEditText.post(new eav(vEditText));
        flt.m122096g(m170256E());
        xdl0.m208329E0(this.f150170e, new View.OnClickListener() { // from class: l.jlt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118566a.m170282y(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m170270v() {
        this.f150169d.setAdapter(this.f150166a);
        this.f150169d.addOnScrollListener(new C19278a());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m170271A(BLiveAnchor bLiveAnchor, int i, ijt ijtVar) {
        if (bLiveAnchor.multiCallInfo.onGoing) {
            flt.m122099j(m170256E(), m170279s(bLiveAnchor), i);
        } else if (ijtVar.f113606c != null && bLiveAnchor.liveData.onlive) {
            flt.m122099j(m170256E(), ijtVar.f113606c, i);
        } else {
            adu.m96006b(m170256E(), pds.m168401k().m168404b(ijtVar.f113605b.f56011id).m168405c("anchorSearch").m168408f(ijtVar.f113605b.f56011id).m168403a());
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m170272B(ijt ijtVar) {
        this.f150167b.m164901S2(ijtVar);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m170273C(LiveAnchorsInfo liveAnchorsInfo, final ijt ijtVar, ijt ijtVar2) {
        this.f150167b.m141814D2().LiveSearchHistoryEvent.addRecord().mo172463j(liveAnchorsInfo.getSearchText());
        if (ijtVar.f113605b.followedButNotMatched()) {
            m170268q(getAct(), getAct().getResources().getString(R$string.f44203s), new d30() { // from class: l.nlt
                @Override // p149l.d30
                public final void call() {
                    this.f139582a.m170272B(ijtVar);
                }
            });
            return;
        }
        adu.m96005a(m170256E(), pds.m168401k().m168404b(ijtVar.f113605b.f56011id).m168405c("anchorSearch").m168408f(ijtVar.f113605b.f56011id).m168403a());
        this.f150167b.m164901S2(ijtVar);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150167b.act();
    }

    /* JADX INFO: renamed from: F */
    public void m170274F() {
        this.f150166a.m67371Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: G */
    public void m170275G(LiveAnchorsInfo liveAnchorsInfo) {
        final LiveAnchorsInfo liveAnchorsInfo2;
        final plt pltVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < liveAnchorsInfo.getAnchorList().size()) {
            final BLiveAnchor bLiveAnchor = liveAnchorsInfo.getAnchorList().get(i);
            User userQueryUserById = liveAnchorsInfo.queryUserById(bLiveAnchor.f44331id);
            if (userQueryUserById == null) {
                pltVar = this;
                liveAnchorsInfo2 = liveAnchorsInfo;
            } else {
                final ijt ijtVar = new ijt(bLiveAnchor, liveAnchorsInfo.queryLiveById(bLiveAnchor.liveData.ongoingId), userQueryUserById, liveAnchorsInfo.queryRoomById(bLiveAnchor.room.f44419id), this.f150167b.m141815E2().f108267b);
                final int i2 = i + 1;
                liveAnchorsInfo2 = liveAnchorsInfo;
                pltVar = this;
                ijtVar.mo109662A(new View.OnClickListener() { // from class: l.klt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123693a.m170283z(ijtVar, bLiveAnchor, liveAnchorsInfo2, i2, view);
                    }
                });
                ijtVar.m109673z(new Runnable() { // from class: l.llt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f128748a.m170271A(bLiveAnchor, i2, ijtVar);
                    }
                });
                ijtVar.m136749Q(new e30() { // from class: l.mlt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f134528a.m170273C(liveAnchorsInfo2, ijtVar, (ijt) obj);
                    }
                });
                ijtVar.m109663B(pltVar.m170256E());
                arrayList.add(ijtVar);
            }
            i++;
            this = pltVar;
            liveAnchorsInfo = liveAnchorsInfo2;
        }
        this.f150166a.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: H */
    public void m170276H(User user) {
        for (d1q<?> d1qVar : this.f150166a.m67355J()) {
            if (d1qVar instanceof ijt) {
                ijt ijtVar = (ijt) d1qVar;
                if (user.f56011id.equals(ijtVar.f113605b.f56011id)) {
                    this.f150166a.m67361P(ijtVar, new h7k0(user));
                }
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f150167b.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        mkd0.m154992z(this.f150168c);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m170278p(String str) {
        this.f150170e.setText(str);
        this.f150170e.setSelection(str.length());
    }

    /* JADX INFO: renamed from: s */
    public final BLive m170279s(BLiveAnchor bLiveAnchor) {
        BLive bLiveNew_ = BLive.new_();
        BLiveMultiCallInfo bLiveMultiCallInfo = bLiveAnchor.multiCallInfo;
        bLiveNew_.f44323id = bLiveMultiCallInfo.jumpLiveId;
        bLiveNew_.room.f44419id = bLiveMultiCallInfo.jumpRoomId;
        bLiveNew_.multiCallInfo = bLiveMultiCallInfo;
        bLiveNew_.state = BLiveState.get("onlive");
        return bLiveNew_;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m170280w(CharSequence charSequence) {
        okt oktVar = this.f150167b;
        if (oktVar != null) {
            oktVar.m164904V2(charSequence);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m170281x(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        getAct().hideInput(this.f150170e);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m170282y(View view) {
        flt.m122095f(m170256E());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m170283z(ijt ijtVar, BLiveAnchor bLiveAnchor, LiveAnchorsInfo liveAnchorsInfo, int i, View view) {
        BLiveAbsData bLiveAbsData = ijtVar.f113606c;
        if (bLiveAbsData != null && bLiveAnchor.liveData.onlive) {
            this.f150167b.m164898N2(bLiveAbsData, liveAnchorsInfo.getSearchText());
            flt.m122097h(m170256E(), ijtVar.f113606c, i);
        } else {
            if (!bLiveAnchor.multiCallInfo.onGoing) {
                this.f150167b.m164897L0(ijtVar.f113604a.f44331id, liveAnchorsInfo.getSearchText());
                return;
            }
            BLive bLiveM170279s = m170279s(bLiveAnchor);
            this.f150167b.m164898N2(bLiveM170279s, liveAnchorsInfo.getSearchText());
            flt.m122097h(m170256E(), bLiveM170279s, i);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(okt oktVar) {
    }
}
