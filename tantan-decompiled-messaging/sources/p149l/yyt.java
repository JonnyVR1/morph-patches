package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yyt<V extends View> extends d1q<V> {

    /* JADX INFO: renamed from: i */
    public static final int f200805i = t100.m186890d(4.0f);

    /* JADX INFO: renamed from: a */
    @NonNull
    public BLiveSuggestLive f200806a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BLiveSettings f200807b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 1, to = 2147483647L)
    public int f200808c;

    /* JADX INFO: renamed from: d */
    public float f200809d;

    /* JADX INFO: renamed from: e */
    public int f200810e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f200811f = false;

    /* JADX INFO: renamed from: g */
    public int f200812g;

    /* JADX INFO: renamed from: h */
    public V f200813h;

    public yyt(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, @IntRange(from = 1, to = 2147483647L) int i2) {
        this.f200809d = 0.0f;
        this.f200812g = 0;
        this.f200807b = bLiveSettings;
        this.f200806a = bLiveSuggestLive;
        this.f200810e = i;
        this.f200808c = i2;
        this.f200812g = m216563J(i);
        if (bLiveSuggestLive.videoCaptureUrl != null) {
            this.f200809d = 100.0f;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m216563J(int i) {
        int i2 = f200805i * 2;
        return i <= 0 ? xdl0.m208412y0() - i2 : ((xdl0.m208412y0() - ((i + 1) * i2)) / i) + i2;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        h7d0 h7d0VarM129662a = m216565I().m129662a();
        Map<String, String> mapM158173a = n80Var.m158173a();
        HashMap<String, String> mapMo213151P = mo213151P();
        if (mapMo213151P != null) {
            mapM158173a.putAll(mapMo213151P);
        }
        adu.m96012h(h7d0VarM129662a, mo109667p(), mapM158173a);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public boolean m216564H() {
        return !TextUtils.isEmpty(this.f200806a.videoCaptureUrl);
    }

    /* JADX INFO: renamed from: I */
    public final h7d0.C17241a m216565I() {
        String str;
        JSONObject jSONObject = new JSONObject();
        BLiveTrackShowLabel bLiveTrackShowLabelMo100692K = mo100692K();
        String str2 = "0";
        if (bLiveTrackShowLabelMo100692K != null) {
            try {
                jSONObject.put("distance", bLiveTrackShowLabelMo100692K.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelMo100692K.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelMo100692K.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelMo100692K.viewer);
                jSONObject.put("label_name_top", bLiveTrackShowLabelMo100692K.label_name_top);
                jSONObject.put("label_name_sp", bLiveTrackShowLabelMo100692K.label_name_sp);
                jSONObject.put("label_name_tool", bLiveTrackShowLabelMo100692K.label_name_tool);
                jSONObject.put("state_label", bLiveTrackShowLabelMo100692K.state_label);
                jSONObject.put("label_name_custom", bLiveTrackShowLabelMo100692K.label_name_custom);
                jSONObject.put("label_name_fixed", bLiveTrackShowLabelMo100692K.label_name_fixed);
                str2 = bLiveTrackShowLabelMo100692K.have_red_packet;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                sm80.m184942b(e);
            }
        }
        BLiveSuggestLive bLiveSuggestLive = this.f200806a;
        if (bLiveSuggestLive == null) {
            str = "NA";
        } else if (TextUtils.equals(bLiveSuggestLive.state, "stopped")) {
            str = BLiveOperationTitleShowType.off;
        } else {
            BLiveMultiCallInfo bLiveMultiCallInfo = this.f200806a.multiCallInfo;
            str = (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing) ? "common_live" : "video_live";
        }
        return h7d0.m129655x().m129664c(this.f200806a).m129673l(this.f200808c).m129681t(str).m129684w(OMSTemplateModeType.page).m129658A(jSONObject).m129677p(str2).m129676o(this.f200811f).m129686y(this.f200806a);
    }

    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo100692K() {
        return null;
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo173091N(V v2);

    /* JADX INFO: renamed from: O */
    public abstract void mo173092O(V v2);

    /* JADX INFO: renamed from: P */
    public HashMap<String, String> mo213151P() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public void mo213152Q() {
        adu.m96007c(m216565I().m129662a(), mo109667p());
    }

    /* JADX INFO: renamed from: R */
    public void m216566R() {
        if (this.f200813h == null) {
            return;
        }
        this.f200811f = false;
        mo173092O(this.f200813h);
    }

    /* JADX INFO: renamed from: a */
    public float m216567a() {
        return this.f200809d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            yyt yytVar = (yyt) obj;
            if (this.f200809d == yytVar.f200809d && this.f200810e == yytVar.f200810e && this.f200811f == yytVar.f200811f && this.f200808c == yytVar.f200808c && v050.m196470a(this.f200806a, yytVar.f200806a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f200806a, Float.valueOf(this.f200809d), Integer.valueOf(this.f200808c), Integer.valueOf(this.f200810e), Boolean.valueOf(this.f200811f));
    }

    @Override // p149l.d1q
    public String toString() {
        return "class = ".concat(getClass().getSimpleName()) + ": uniqueId = " + this.uniqueId + ", liveId = " + this.f200806a.f44450id;
    }

    @Override // p149l.d1q
    @CallSuper
    /* JADX INFO: renamed from: v */
    public void mo70759v(V v2, @NonNull List<Object> list) {
        super.mo70759v(v2, list);
        this.f200813h = v2;
        Object obj = list.get(0);
        if (!(obj instanceof zi1)) {
            mo213150L(v2, list);
            return;
        }
        m109664C();
        boolean z = this.f200811f;
        boolean z2 = ((zi1) obj).f203249a;
        if (z == z2) {
            return;
        }
        this.f200811f = z2;
        if (!this.f200811f || TextUtils.isEmpty(this.f200806a.videoCaptureUrl)) {
            mo173092O(v2);
        } else {
            mo173091N(v2);
        }
    }

    @Override // p149l.d1q
    @CallSuper
    /* JADX INFO: renamed from: w */
    public void mo71000w(V v2) {
        super.mo71000w(v2);
        if (this.f200811f) {
            this.f200811f = false;
            m109664C();
            toString();
            mo173092O(v2);
        }
        this.f200813h = null;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: y */
    public void mo109672y(V v2) {
        super.mo109672y(v2);
        if (this.f200811f) {
            this.f200811f = false;
            mo173092O(v2);
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo213150L(V v2, @NonNull List<Object> list) {
    }
}
