package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p151v.VEditText;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rnt implements iam<pmt> {

    /* JADX INFO: renamed from: a */
    public final LiveBaseAdapter f164103a = new LiveBaseAdapter();

    /* JADX INFO: renamed from: b */
    public final pmt f164104b;

    /* JADX INFO: renamed from: c */
    public kcg0 f164105c;

    /* JADX INFO: renamed from: d */
    public final VRecyclerView f164106d;

    /* JADX INFO: renamed from: e */
    public final VEditText f164107e;

    /* JADX INFO: renamed from: l.rnt$a */
    public class C19887a extends RecyclerView.AbstractC0584t {
        public C19887a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (rnt.this.f164103a.getItemCount() <= 0 || i != 1) {
                return;
            }
            rnt.this.getAct().hideInput(rnt.this.f164107e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    public rnt(final pmt pmtVar, VRecyclerView vRecyclerView, VText vText, VEditText vEditText) {
        this.f164106d = vRecyclerView;
        this.f164107e = vEditText;
        this.f164104b = pmtVar;
        m182336v();
        m182335u();
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.hnt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rnt.m182329i(pmtVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private String m182322E() {
        return getAct().pageId();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m182325c(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m182329i(pmt pmtVar, View view) {
        if (pmtVar != null) {
            pmtVar.m172974U2();
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m182334q(Act act, String str, final x20 x20Var) {
        act.dialog().m21503F(str).m21540k0(R$string.f45027k).m21555t0(R$string.f45036n, new Runnable() { // from class: l.qnt
            @Override // java.lang.Runnable
            public final void run() {
                rnt.m182325c(x20Var);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: u */
    private void m182335u() {
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            this.f164107e.setHint(strM203675m5);
        }
        this.f164105c = getAct().duringCreated(ynp0.m216923H(this.f164107e)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.jnt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121902a.m182346w((CharSequence) obj);
            }
        }));
        this.f164107e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.knt
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f127637a.m182347x(textView, i, keyEvent);
            }
        });
        VEditText vEditText = this.f164107e;
        Objects.requireNonNull(vEditText);
        vEditText.post(new fcv(vEditText));
        gnt.m130987g(m182322E());
        bnl0.m105509E0(this.f164107e, new View.OnClickListener() { // from class: l.lnt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132840a.m182348y(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m182336v() {
        this.f164106d.setAdapter(this.f164103a);
        this.f164106d.addOnScrollListener(new C19887a());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m182337A(BLiveAnchor bLiveAnchor, int i, jlt jltVar) {
        if (bLiveAnchor.multiCallInfo.onGoing) {
            gnt.m130990j(m182322E(), m182345s(bLiveAnchor), i);
        } else if (jltVar.f121591c != null && bLiveAnchor.liveData.onlive) {
            gnt.m130990j(m182322E(), jltVar.f121591c, i);
        } else {
            bfu.m104070b(m182322E(), qfs.m176401k().m176404b(jltVar.f121590b.f56859id).m176405c("anchorSearch").m176408f(jltVar.f121590b.f56859id).m176403a());
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m182338B(jlt jltVar) {
        this.f164104b.m172972S2(jltVar);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m182339C(LiveAnchorsInfo liveAnchorsInfo, final jlt jltVar, jlt jltVar2) {
        this.f164104b.m150393D2().LiveSearchHistoryEvent.addRecord().mo199273j(liveAnchorsInfo.getSearchText());
        if (jltVar.f121590b.followedButNotMatched()) {
            m182334q(getAct(), getAct().getResources().getString(R$string.f45051s), new x20() { // from class: l.pnt
                @Override // p153l.x20
                public final void call() {
                    this.f153329a.m182338B(jltVar);
                }
            });
            return;
        }
        bfu.m104069a(m182322E(), qfs.m176401k().m176404b(jltVar.f121590b.f56859id).m176405c("anchorSearch").m176408f(jltVar.f121590b.f56859id).m176403a());
        this.f164104b.m172972S2(jltVar);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f164104b.act();
    }

    /* JADX INFO: renamed from: F */
    public void m182340F() {
        this.f164103a.m68554Z(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: G */
    public void m182341G(LiveAnchorsInfo liveAnchorsInfo) {
        final LiveAnchorsInfo liveAnchorsInfo2;
        final rnt rntVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < liveAnchorsInfo.getAnchorList().size()) {
            final BLiveAnchor bLiveAnchor = liveAnchorsInfo.getAnchorList().get(i);
            User userQueryUserById = liveAnchorsInfo.queryUserById(bLiveAnchor.f45179id);
            if (userQueryUserById == null) {
                rntVar = this;
                liveAnchorsInfo2 = liveAnchorsInfo;
            } else {
                final jlt jltVar = new jlt(bLiveAnchor, liveAnchorsInfo.queryLiveById(bLiveAnchor.liveData.ongoingId), userQueryUserById, liveAnchorsInfo.queryRoomById(bLiveAnchor.room.f45267id), this.f164104b.m150394E2().f115832b);
                final int i2 = i + 1;
                liveAnchorsInfo2 = liveAnchorsInfo;
                rntVar = this;
                jltVar.mo113881A(new View.OnClickListener() { // from class: l.mnt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f137727a.m182349z(jltVar, bLiveAnchor, liveAnchorsInfo2, i2, view);
                    }
                });
                jltVar.m113891z(new Runnable() { // from class: l.nnt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f142884a.m182337A(bLiveAnchor, i2, jltVar);
                    }
                });
                jltVar.m146113Q(new y20() { // from class: l.ont
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f148130a.m182339C(liveAnchorsInfo2, jltVar, (jlt) obj);
                    }
                });
                jltVar.m113882B(rntVar.m182322E());
                arrayList.add(jltVar);
            }
            i++;
            this = rntVar;
            liveAnchorsInfo = liveAnchorsInfo2;
        }
        this.f164103a.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: H */
    public void m182342H(User user) {
        for (d3q<?> d3qVar : this.f164103a.m68538J()) {
            if (d3qVar instanceof jlt) {
                jlt jltVar = (jlt) d3qVar;
                if (user.f56859id.equals(jltVar.f121590b.f56859id)) {
                    this.f164103a.m68544P(jltVar, new ngk0(user));
                }
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f164104b.act();
    }

    @Override // p153l.iam
    public void destroy() {
        psd0.m173633z(this.f164105c);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void m182344p(String str) {
        this.f164107e.setText(str);
        this.f164107e.setSelection(str.length());
    }

    /* JADX INFO: renamed from: s */
    public final BLive m182345s(BLiveAnchor bLiveAnchor) {
        BLive bLiveNew_ = BLive.new_();
        BLiveMultiCallInfo bLiveMultiCallInfo = bLiveAnchor.multiCallInfo;
        bLiveNew_.f45171id = bLiveMultiCallInfo.jumpLiveId;
        bLiveNew_.room.f45267id = bLiveMultiCallInfo.jumpRoomId;
        bLiveNew_.multiCallInfo = bLiveMultiCallInfo;
        bLiveNew_.state = BLiveState.get("onlive");
        return bLiveNew_;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m182346w(CharSequence charSequence) {
        pmt pmtVar = this.f164104b;
        if (pmtVar != null) {
            pmtVar.m172975V2(charSequence);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean m182347x(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        getAct().hideInput(this.f164107e);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m182348y(View view) {
        gnt.m130986f(m182322E());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m182349z(jlt jltVar, BLiveAnchor bLiveAnchor, LiveAnchorsInfo liveAnchorsInfo, int i, View view) {
        BLiveAbsData bLiveAbsData = jltVar.f121591c;
        if (bLiveAbsData != null && bLiveAnchor.liveData.onlive) {
            this.f164104b.m172969N2(bLiveAbsData, liveAnchorsInfo.getSearchText());
            gnt.m130988h(m182322E(), jltVar.f121591c, i);
        } else {
            if (!bLiveAnchor.multiCallInfo.onGoing) {
                this.f164104b.m172968L0(jltVar.f121589a.f45179id, liveAnchorsInfo.getSearchText());
                return;
            }
            BLive bLiveM182345s = m182345s(bLiveAnchor);
            this.f164104b.m172969N2(bLiveM182345s, liveAnchorsInfo.getSearchText());
            gnt.m130988h(m182322E(), bLiveM182345s, i);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pmt pmtVar) {
    }
}
