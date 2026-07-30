package p149l;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i80<V extends View> extends df2<V> implements wnk, qlf0 {

    /* JADX INFO: renamed from: q */
    public boolean f111966q;

    /* JADX INFO: renamed from: r */
    public final int f111967r;

    /* JADX INFO: renamed from: s */
    public final int f111968s;

    /* JADX INFO: renamed from: t */
    public final String f111969t;

    /* JADX INFO: renamed from: u */
    public final String f111970u;

    /* JADX INFO: renamed from: v */
    public int f111971v;

    /* JADX INFO: renamed from: w */
    public final C22393b<soj0> f111972w;

    public i80(bsm bsmVar, @LayoutRes int i, BLiveBottomButton bLiveBottomButton, int i2, int i3, String str, String str2) {
        super(bsmVar, i, bLiveBottomButton);
        this.f111971v = 0;
        this.f111972w = C22393b.m221521b();
        this.f111967r = i2;
        this.f111968s = i3;
        this.f111969t = str;
        this.f111970u = str2;
    }

    @Override // p149l.df2
    @CallSuper
    /* JADX INFO: renamed from: T3 */
    public void mo111413T3() {
        this.f85889m = 2700;
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: U3 */
    public final void mo111414U3() {
        m206028F2().BottomEvent.addModelToSettingAdapter().mo172463j(this);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        m111423g4();
        m206028F2().BottomEvent.dismissSettingDialog().m172467p();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: W3 */
    public void mo111415W3() {
        m206028F2().BottomEvent.removeModelToSettingAdapter().mo172463j(this);
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: X1 */
    public int mo109665X1() {
        return this.f111968s;
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo111417Z3() {
        return (vwb.m200296J(this.f85888l.icon) || this.f85888l.icon.size() < 3) ? "" : this.f85888l.icon.get(2);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: b4 */
    public final void mo111419b4(final boolean z) {
        e51.m114741F(this.f188513f, new Runnable() { // from class: l.h80
            @Override // java.lang.Runnable
            public final void run() {
                this.f106362a.m134933l4(z);
            }
        });
    }

    @Override // p149l.df2
    @CallSuper
    /* JADX INFO: renamed from: d4 */
    public void mo108215d4(V v2) {
        super.mo108215d4(v2);
        this.f85887k = v2;
        v2.setOnClickListener(new View.OnClickListener() { // from class: l.g80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101465a.mo103804V3(view);
            }
        });
        V v3 = this.f85887k;
        if (v3 instanceof RedDot) {
            ((RedDot) v3).mo72138g0(mo111422f4());
            Boolean bool = (Boolean) m129297F3(new yl3(this.f85889m).m215212e(this.f85888l.url));
            if (bool == null || bool.booleanValue() || !this.f85888l.enableNewlyEffect) {
                ((RedDot) this.f85887k).mo72140O(false);
            } else {
                ((RedDot) this.f85887k).mo72140O(true);
            }
        }
        if (this.f85887k.findViewById(g5c0.f100644A5) == null || !(this.f85887k.findViewById(g5c0.f100644A5) instanceof BottomViewGroup)) {
            return;
        }
        ((BottomViewGroup) this.f85887k.findViewById(g5c0.f100644A5)).setStyle(this.f111970u);
    }

    @Override // p149l.uj2, p149l.qlf0
    public int getOrder() {
        return this.f111967r;
    }

    @Override // p149l.wnk
    public boolean isFirst() {
        return this.f111966q;
    }

    /* JADX INFO: renamed from: j4 */
    public String m134931j4() {
        BLiveBottomButton bLiveBottomButton = this.f85888l;
        return bLiveBottomButton == null ? "" : bLiveBottomButton.url;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m134932k4() {
        return this.f111971v > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m134933l4(boolean z) {
        if (z) {
            m206028F2().BottomEvent.addModelToSettingAdapter().mo172463j(this);
        } else {
            m206028F2().BottomEvent.removeModelToSettingAdapter().mo172463j(this);
            m134934m4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m134934m4() {
        this.f85887k = null;
        this.f111972w.onNext(soj0.f165695a);
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: r1 */
    public String mo109668r1() {
        return this.f111969t;
    }

    @Override // p149l.wnk
    /* JADX INFO: renamed from: z0 */
    public void mo109674z0(boolean z) {
        this.f111966q = z;
    }
}
