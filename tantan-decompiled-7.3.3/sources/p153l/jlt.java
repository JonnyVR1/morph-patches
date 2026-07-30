package p153l;

import android.content.res.Resources;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p051p1.mobile.putong.live.external.square.search.widgets.LiveSearchAnchorItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class jlt extends d3q<LiveSearchAnchorItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public BLiveAnchor f121589a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public User f121590b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BLiveAbsData f121591c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BLiveAbsRoom f121592d;

    /* JADX INFO: renamed from: e */
    public LiveSearchAct f121593e;

    /* JADX INFO: renamed from: f */
    public y20<jlt> f121594f;

    public jlt(@NonNull BLiveAnchor bLiveAnchor, @Nullable BLiveAbsData bLiveAbsData, @NonNull User user, @Nullable BLiveAbsRoom bLiveAbsRoom, LiveSearchAct liveSearchAct) {
        this.f121589a = bLiveAnchor;
        this.f121591c = bLiveAbsData;
        this.f121590b = user;
        this.f121592d = bLiveAbsRoom;
        this.f121593e = liveSearchAct;
    }

    /* JADX INFO: renamed from: I */
    public C22421c<Followship> m146106I(String str, String str2) {
        User user = this.f121590b;
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            return C22421c.create(new ek20());
        }
        boolean z = !user.followedButNotMatched();
        String strM157870o0 = mbs.m157870o0();
        BLiveAbsData bLiveAbsData = this.f121591c;
        return mbs.m157861k(strM157870o0, user, z, str, bLiveAbsData == null ? "" : bLiveAbsData.f45171id, mo113885p(), str2);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m146107J(View view) {
        y20<jlt> y20Var = this.f121594f;
        if (y20Var != null) {
            y20Var.call(this);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        super.mo71749u(liveSearchAnchorItemView);
        if (NullChecker.m82486a(this.f121593e)) {
            liveSearchAnchorItemView.m72023c(this.f121593e.f47072e);
        }
        m146111O(liveSearchAnchorItemView);
        m146110N(liveSearchAnchorItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo71942v(LiveSearchAnchorItemView liveSearchAnchorItemView, @NonNull List<Object> list) {
        super.mo71942v(liveSearchAnchorItemView, list);
        if (jyb.m147479J(list)) {
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof ngk0) {
            this.f121590b = ((ngk0) obj).f141836a;
            m146110N(liveSearchAnchorItemView);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m146110N(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        BLiveAnchor bLiveAnchor = this.f121589a;
        boolean z = bLiveAnchor.multiCallInfo.onGoing || (this.f121591c != null && bLiveAnchor.liveData.onlive);
        if (u9t.m195116e(this.f121591c)) {
            bnl0.m105524M(liveSearchAnchorItemView.f47084b, false);
            bnl0.m105524M(liveSearchAnchorItemView.f47085c, true);
        } else if (z) {
            bnl0.m105524M(liveSearchAnchorItemView.f47084b, true);
            bnl0.m105524M(liveSearchAnchorItemView.f47085c, false);
        } else {
            bnl0.m105524M(liveSearchAnchorItemView.f47084b, false);
            bnl0.m105524M(liveSearchAnchorItemView.f47085c, false);
        }
        m146112P(liveSearchAnchorItemView);
    }

    /* JADX INFO: renamed from: O */
    public final void m146111O(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        izs.m142867r("context_common", liveSearchAnchorItemView.f47083a, this.f121590b.m61308fp().profileSmall());
        liveSearchAnchorItemView.f47086d.setText(this.f121590b.name);
        liveSearchAnchorItemView.f47088f.setText(String.format(liveSearchAnchorItemView.getResources().getString(R$string.f45753i), this.f121590b.publicId));
        liveSearchAnchorItemView.m72022b(this.f121590b);
    }

    /* JADX INFO: renamed from: P */
    public final void m146112P(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        bnl0.m105524M(liveSearchAnchorItemView.f47089g, false);
        bnl0.m105524M(liveSearchAnchorItemView.f47092j, !this.f121589a.f45179id.equals(mbs.m157870o0()));
        if (this.f121590b.matchedOrFollowed()) {
            Resources resources = liveSearchAnchorItemView.getContext().getResources();
            liveSearchAnchorItemView.f47092j.setText(R$string.f45739b);
            liveSearchAnchorItemView.f47092j.setTextColor(resources.getColor(m9c0.f135396u));
            liveSearchAnchorItemView.f47092j.setBackground(fc2.m124971a(resources.getColor(m9c0.f135397v), qa00.f156323j, false));
        } else {
            liveSearchAnchorItemView.f47092j.setText(R$string.f45783x);
            liveSearchAnchorItemView.f47092j.setTextColor(-1);
            liveSearchAnchorItemView.f47092j.setBackgroundResource(nbc0.f141145b);
        }
        bnl0.m105509E0(liveSearchAnchorItemView.f47092j, new View.OnClickListener() { // from class: l.ilt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115601a.m146107J(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m146113Q(y20<jlt> y20Var) {
        this.f121594f = y20Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jlt jltVar = (jlt) obj;
            if (k950.m148863a(this.f121589a, jltVar.f121589a) && k950.m148863a(this.f121591c, jltVar.f121591c) && k950.m148863a(this.f121590b, jltVar.f121590b) && k950.m148863a(this.f121592d, jltVar.f121592d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f121589a, this.f121591c, this.f121590b, this.f121592d);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193882k0;
    }
}
