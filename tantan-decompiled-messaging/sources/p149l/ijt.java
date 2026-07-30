package p149l;

import android.content.res.Resources;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p046p1.mobile.putong.live.external.square.search.widgets.LiveSearchAnchorItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class ijt extends d1q<LiveSearchAnchorItemView> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public BLiveAnchor f113604a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public User f113605b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BLiveAbsData f113606c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BLiveAbsRoom f113607d;

    /* JADX INFO: renamed from: e */
    public LiveSearchAct f113608e;

    /* JADX INFO: renamed from: f */
    public e30<ijt> f113609f;

    public ijt(@NonNull BLiveAnchor bLiveAnchor, @Nullable BLiveAbsData bLiveAbsData, @NonNull User user, @Nullable BLiveAbsRoom bLiveAbsRoom, LiveSearchAct liveSearchAct) {
        this.f113604a = bLiveAnchor;
        this.f113606c = bLiveAbsData;
        this.f113605b = user;
        this.f113607d = bLiveAbsRoom;
        this.f113608e = liveSearchAct;
    }

    /* JADX INFO: renamed from: I */
    public C22306c<Followship> m136742I(String str, String str2) {
        User user = this.f113605b;
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            return C22306c.create(new vb20());
        }
        boolean z = !user.followedButNotMatched();
        String strM149093o0 = l9s.m149093o0();
        BLiveAbsData bLiveAbsData = this.f113606c;
        return l9s.m149084k(strM149093o0, user, z, str, bLiveAbsData == null ? "" : bLiveAbsData.f44323id, mo109667p(), str2);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m136743J(View view) {
        e30<ijt> e30Var = this.f113609f;
        if (e30Var != null) {
            e30Var.call(this);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        super.mo70566u(liveSearchAnchorItemView);
        if (NullChecker.m81303a(this.f113608e)) {
            liveSearchAnchorItemView.m70840c(this.f113608e.f46224e);
        }
        m136747O(liveSearchAnchorItemView);
        m136746N(liveSearchAnchorItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo70759v(LiveSearchAnchorItemView liveSearchAnchorItemView, @NonNull List<Object> list) {
        super.mo70759v(liveSearchAnchorItemView, list);
        if (vwb.m200296J(list)) {
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof h7k0) {
            this.f113605b = ((h7k0) obj).f106306a;
            m136746N(liveSearchAnchorItemView);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m136746N(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        BLiveAnchor bLiveAnchor = this.f113604a;
        boolean z = bLiveAnchor.multiCallInfo.onGoing || (this.f113606c != null && bLiveAnchor.liveData.onlive);
        if (t7t.m187505e(this.f113606c)) {
            xdl0.m208344M(liveSearchAnchorItemView.f46236b, false);
            xdl0.m208344M(liveSearchAnchorItemView.f46237c, true);
        } else if (z) {
            xdl0.m208344M(liveSearchAnchorItemView.f46236b, true);
            xdl0.m208344M(liveSearchAnchorItemView.f46237c, false);
        } else {
            xdl0.m208344M(liveSearchAnchorItemView.f46236b, false);
            xdl0.m208344M(liveSearchAnchorItemView.f46237c, false);
        }
        m136748P(liveSearchAnchorItemView);
    }

    /* JADX INFO: renamed from: O */
    public final void m136747O(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        hxs.m133405r("context_common", liveSearchAnchorItemView.f46235a, this.f113605b.m60124fp().profileSmall());
        liveSearchAnchorItemView.f46238d.setText(this.f113605b.name);
        liveSearchAnchorItemView.f46240f.setText(String.format(liveSearchAnchorItemView.getResources().getString(R$string.f44905i), this.f113605b.publicId));
        liveSearchAnchorItemView.m70839b(this.f113605b);
    }

    /* JADX INFO: renamed from: P */
    public final void m136748P(LiveSearchAnchorItemView liveSearchAnchorItemView) {
        xdl0.m208344M(liveSearchAnchorItemView.f46241g, false);
        xdl0.m208344M(liveSearchAnchorItemView.f46244j, !this.f113604a.f44331id.equals(l9s.m149093o0()));
        if (this.f113605b.matchedOrFollowed()) {
            Resources resources = liveSearchAnchorItemView.getContext().getResources();
            liveSearchAnchorItemView.f46244j.setText(R$string.f44891b);
            liveSearchAnchorItemView.f46244j.setTextColor(resources.getColor(g1c0.f100166u));
            liveSearchAnchorItemView.f46244j.setBackground(yb2.m213876a(resources.getColor(g1c0.f100167v), t100.f167261j, false));
        } else {
            liveSearchAnchorItemView.f46244j.setText(R$string.f44935x);
            liveSearchAnchorItemView.f46244j.setTextColor(-1);
            liveSearchAnchorItemView.f46244j.setBackgroundResource(h3c0.f105654b);
        }
        xdl0.m208329E0(liveSearchAnchorItemView.f46244j, new View.OnClickListener() { // from class: l.hjt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108118a.m136743J(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m136749Q(e30<ijt> e30Var) {
        this.f113609f = e30Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ijt ijtVar = (ijt) obj;
            if (v050.m196470a(this.f113604a, ijtVar.f113604a) && v050.m196470a(this.f113606c, ijtVar.f113606c) && v050.m196470a(this.f113605b, ijtVar.f113605b) && v050.m196470a(this.f113607d, ijtVar.f113607d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f113604a, this.f113606c, this.f113605b, this.f113607d);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162768k0;
    }
}
