package p149l;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class upr implements fpr {

    /* JADX INFO: renamed from: a */
    public final VMarqueeText f177657a;

    /* JADX INFO: renamed from: b */
    public final AnimEffectPlayer f177658b;

    /* JADX INFO: renamed from: c */
    public final VText f177659c;

    /* JADX INFO: renamed from: d */
    public final LiveActivitiesEntryAll f177660d;

    public upr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f177660d = liveActivitiesEntryAll;
        this.f177657a = liveActivitiesEntryAll.f46255i;
        this.f177658b = liveActivitiesEntryAll.f46252f;
        this.f177659c = liveActivitiesEntryAll.f46256j;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: a */
    public int mo122629a() {
        return -90880;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: b */
    public void mo122630b(lqr lqrVar, BLiveActivitySummary bLiveActivitySummary) {
        xdl0.m208344M(this.f177657a, true);
        this.f177657a.setTextSize(12.0f);
        if (bLiveActivitySummary == null || TextUtils.isEmpty(bLiveActivitySummary.description.title)) {
            this.f177657a.setText(s9s.f163227a.getString(R$string.f44182l));
        } else {
            this.f177657a.setText(bLiveActivitySummary.description.title);
        }
        xdl0.m208344M(this.f177658b, true);
        boolean zM149078h = l9s.m149078h();
        AnimEffectPlayer animEffectPlayer = this.f177658b;
        if (zM149078h) {
            animEffectPlayer.setClearsAfterStop(true);
            this.f177657a.setTypeface(Typeface.DEFAULT_BOLD);
            this.f177658b.m68505o();
            this.f177658b.setBackgroundResource(h3c0.f105714v);
            int i = t100.f167268q;
            xdl0.m208327D0(i, this.f177658b);
            xdl0.m208325C0(this.f177658b, i);
        } else {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", -1);
        }
        xdl0.m208344M(this.f177659c, false);
        xdl0.m208327D0(m194912k(), this.f177660d.f46254h);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: d */
    public int mo122632d() {
        return -370374;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: e */
    public int mo122633e() {
        return t100.m186890d(56.0f) + m194912k();
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: f */
    public int mo122634f() {
        return t100.m186890d(43.0f);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: g */
    public int mo122635g() {
        return h3c0.f105711u;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: i */
    public int mo122637i() {
        return t100.f167260i;
    }

    /* JADX INFO: renamed from: k */
    public final int m194912k() {
        int iM186890d = t100.m186890d(12.0f) * 4;
        int iM186890d2 = t100.m186890d(85.0f);
        int length = this.f177657a.getText().length() * t100.m186890d(12.0f);
        if (length >= iM186890d) {
            iM186890d = length;
        }
        return iM186890d > iM186890d2 ? iM186890d2 : iM186890d;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: c */
    public void mo122631c() {
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: h */
    public void mo122636h(ValueAnimator valueAnimator, fpr fprVar) {
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: j */
    public void mo122638j(ValueAnimator valueAnimator, fpr fprVar) {
    }
}
