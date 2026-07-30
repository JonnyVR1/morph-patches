package p153l;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class vrr implements grr {

    /* JADX INFO: renamed from: a */
    public final VMarqueeText f185513a;

    /* JADX INFO: renamed from: b */
    public final AnimEffectPlayer f185514b;

    /* JADX INFO: renamed from: c */
    public final VText f185515c;

    /* JADX INFO: renamed from: d */
    public final LiveActivitiesEntryAll f185516d;

    public vrr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f185516d = liveActivitiesEntryAll;
        this.f185513a = liveActivitiesEntryAll.f47103i;
        this.f185514b = liveActivitiesEntryAll.f47100f;
        this.f185515c = liveActivitiesEntryAll.f47104j;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: a */
    public int mo131858a() {
        return -90880;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: b */
    public void mo131859b(msr msrVar, BLiveActivitySummary bLiveActivitySummary) {
        bnl0.m105524M(this.f185513a, true);
        this.f185513a.setTextSize(12.0f);
        if (bLiveActivitySummary == null || TextUtils.isEmpty(bLiveActivitySummary.description.title)) {
            this.f185513a.setText(tbs.f172988a.getString(R$string.f45030l));
        } else {
            this.f185513a.setText(bLiveActivitySummary.description.title);
        }
        bnl0.m105524M(this.f185514b, true);
        boolean zM157855h = mbs.m157855h();
        AnimEffectPlayer animEffectPlayer = this.f185514b;
        if (zM157855h) {
            animEffectPlayer.setClearsAfterStop(true);
            this.f185513a.setTypeface(Typeface.DEFAULT_BOLD);
            this.f185514b.m69688o();
            this.f185514b.setBackgroundResource(nbc0.f141205v);
            int i = qa00.f156330q;
            bnl0.m105507D0(i, this.f185514b);
            bnl0.m105505C0(this.f185514b, i);
        } else {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", -1);
        }
        bnl0.m105524M(this.f185515c, false);
        bnl0.m105507D0(m202533k(), this.f185516d.f47102h);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: d */
    public int mo131861d() {
        return -370374;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: e */
    public int mo131862e() {
        return qa00.m175859d(56.0f) + m202533k();
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: f */
    public int mo131863f() {
        return qa00.m175859d(43.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: g */
    public int mo131864g() {
        return nbc0.f141202u;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: i */
    public int mo131866i() {
        return qa00.f156322i;
    }

    /* JADX INFO: renamed from: k */
    public final int m202533k() {
        int iM175859d = qa00.m175859d(12.0f) * 4;
        int iM175859d2 = qa00.m175859d(85.0f);
        int length = this.f185513a.getText().length() * qa00.m175859d(12.0f);
        if (length >= iM175859d) {
            iM175859d = length;
        }
        return iM175859d > iM175859d2 ? iM175859d2 : iM175859d;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: c */
    public void mo131860c() {
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: h */
    public void mo131865h(ValueAnimator valueAnimator, grr grrVar) {
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: j */
    public void mo131867j(ValueAnimator valueAnimator, grr grrVar) {
    }
}
