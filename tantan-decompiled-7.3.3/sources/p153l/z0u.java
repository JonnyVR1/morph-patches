package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z0u<V extends View> extends d3q<V> {

    /* JADX INFO: renamed from: i */
    public static final int f202382i = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: a */
    @NonNull
    public BLiveSuggestLive f202383a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BLiveSettings f202384b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 1, to = 2147483647L)
    public int f202385c;

    /* JADX INFO: renamed from: d */
    public float f202386d;

    /* JADX INFO: renamed from: e */
    public int f202387e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f202388f = false;

    /* JADX INFO: renamed from: g */
    public int f202389g;

    /* JADX INFO: renamed from: h */
    public V f202390h;

    public z0u(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, @IntRange(from = 1, to = 2147483647L) int i2) {
        this.f202386d = 0.0f;
        this.f202389g = 0;
        this.f202384b = bLiveSettings;
        this.f202383a = bLiveSuggestLive;
        this.f202387e = i;
        this.f202385c = i2;
        this.f202389g = m218160J(i);
        if (bLiveSuggestLive.videoCaptureUrl != null) {
            this.f202386d = 100.0f;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m218160J(int i) {
        int i2 = f202382i * 2;
        return i <= 0 ? bnl0.m105592y0() - i2 : ((bnl0.m105592y0() - ((i + 1) * i2)) / i) + i2;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        kfd0 kfd0VarM149392a = m218162I().m149392a();
        Map<String, String> mapM143819a = j80Var.m143819a();
        HashMap<String, String> mapMo214754P = mo214754P();
        if (mapMo214754P != null) {
            mapM143819a.putAll(mapMo214754P);
        }
        bfu.m104076h(kfd0VarM149392a, mo113885p(), mapM143819a);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public boolean m218161H() {
        return !TextUtils.isEmpty(this.f202383a.videoCaptureUrl);
    }

    /* JADX INFO: renamed from: I */
    public final kfd0.C18147a m218162I() {
        String str;
        JSONObject jSONObject = new JSONObject();
        BLiveTrackShowLabel bLiveTrackShowLabelMo103115K = mo103115K();
        String str2 = "0";
        if (bLiveTrackShowLabelMo103115K != null) {
            try {
                jSONObject.put("distance", bLiveTrackShowLabelMo103115K.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelMo103115K.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelMo103115K.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelMo103115K.viewer);
                jSONObject.put("label_name_top", bLiveTrackShowLabelMo103115K.label_name_top);
                jSONObject.put("label_name_sp", bLiveTrackShowLabelMo103115K.label_name_sp);
                jSONObject.put("label_name_tool", bLiveTrackShowLabelMo103115K.label_name_tool);
                jSONObject.put("state_label", bLiveTrackShowLabelMo103115K.state_label);
                jSONObject.put("label_name_custom", bLiveTrackShowLabelMo103115K.label_name_custom);
                jSONObject.put("label_name_fixed", bLiveTrackShowLabelMo103115K.label_name_fixed);
                str2 = bLiveTrackShowLabelMo103115K.have_red_packet;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                wu80.m207938b(e);
            }
        }
        BLiveSuggestLive bLiveSuggestLive = this.f202383a;
        if (bLiveSuggestLive == null) {
            str = "NA";
        } else if (TextUtils.equals(bLiveSuggestLive.state, "stopped")) {
            str = BLiveOperationTitleShowType.off;
        } else {
            BLiveMultiCallInfo bLiveMultiCallInfo = this.f202383a.multiCallInfo;
            str = (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing) ? "common_live" : "video_live";
        }
        return kfd0.m149385x().m149394c(this.f202383a).m149403l(this.f202385c).m149411t(str).m149414w(OMSTemplateModeType.page).m149388A(jSONObject).m149407p(str2).m149406o(this.f202388f).m149416y(this.f202383a);
    }

    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo103115K() {
        return null;
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo175699N(V v2);

    /* JADX INFO: renamed from: O */
    public abstract void mo175700O(V v2);

    /* JADX INFO: renamed from: P */
    public HashMap<String, String> mo214754P() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public void mo214755Q() {
        bfu.m104071c(m218162I().m149392a(), mo113885p());
    }

    /* JADX INFO: renamed from: R */
    public void m218163R() {
        if (this.f202390h == null) {
            return;
        }
        this.f202388f = false;
        mo175700O(this.f202390h);
    }

    /* JADX INFO: renamed from: a */
    public float m218164a() {
        return this.f202386d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z0u z0uVar = (z0u) obj;
            if (this.f202386d == z0uVar.f202386d && this.f202387e == z0uVar.f202387e && this.f202388f == z0uVar.f202388f && this.f202385c == z0uVar.f202385c && k950.m148863a(this.f202383a, z0uVar.f202383a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f202383a, Float.valueOf(this.f202386d), Integer.valueOf(this.f202385c), Integer.valueOf(this.f202387e), Boolean.valueOf(this.f202388f));
    }

    @Override // p153l.d3q
    public String toString() {
        return "class = ".concat(getClass().getSimpleName()) + ": uniqueId = " + this.uniqueId + ", liveId = " + this.f202383a.f45298id;
    }

    @Override // p153l.d3q
    @CallSuper
    /* JADX INFO: renamed from: v */
    public void mo71942v(V v2, @NonNull List<Object> list) {
        super.mo71942v(v2, list);
        this.f202390h = v2;
        Object obj = list.get(0);
        if (!(obj instanceof gj1)) {
            mo214753L(v2, list);
            return;
        }
        m113883C();
        boolean z = this.f202388f;
        boolean z2 = ((gj1) obj).f104545a;
        if (z == z2) {
            return;
        }
        this.f202388f = z2;
        if (!this.f202388f || TextUtils.isEmpty(this.f202383a.videoCaptureUrl)) {
            mo175700O(v2);
        } else {
            mo175699N(v2);
        }
    }

    @Override // p153l.d3q
    @CallSuper
    /* JADX INFO: renamed from: w */
    public void mo72183w(V v2) {
        super.mo72183w(v2);
        if (this.f202388f) {
            this.f202388f = false;
            m113883C();
            toString();
            mo175700O(v2);
        }
        this.f202390h = null;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: y */
    public void mo113890y(V v2) {
        super.mo113890y(v2);
        if (this.f202388f) {
            this.f202388f = false;
            mo175700O(v2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo214753L(V v2, @NonNull List<Object> list) {
    }
}
