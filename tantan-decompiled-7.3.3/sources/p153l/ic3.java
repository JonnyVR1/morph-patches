package p153l;

import android.view.View;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ic3<V extends View> extends d3q<V> implements ztf0, mqk {

    /* JADX INFO: renamed from: a */
    public qct<oo2> f114270a;

    /* JADX INFO: renamed from: b */
    public BLiveBottomButton f114271b;

    /* JADX INFO: renamed from: c */
    public boolean f114272c = true;

    /* JADX INFO: renamed from: d */
    public int f114273d;

    /* JADX INFO: renamed from: e */
    public String f114274e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f114275f;

    /* JADX INFO: renamed from: g */
    public int f114276g;

    /* JADX INFO: renamed from: h */
    public int f114277h;

    /* JADX INFO: renamed from: i */
    public String f114278i;

    /* JADX INFO: renamed from: j */
    public boolean f114279j;

    /* JADX INFO: renamed from: k */
    public int f114280k;

    public ic3(@DrawableRes int i, CharSequence charSequence, int i2, int i3, String str) {
        this.f114273d = i;
        this.f114275f = charSequence;
        this.f114276g = i2;
        this.f114277h = i3;
        this.f114278i = str;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: A */
    public void mo113881A(final View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.onItemClick = new View.OnClickListener() { // from class: l.hc3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108672a.m139426J(onClickListener, view);
                }
            };
        }
    }

    /* JADX INFO: renamed from: I */
    public BLiveBottomButton m139425I() {
        return this.f114271b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m139426J(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f114270a.m213811F2().BottomEvent.markButtonClicked().mo199273j(this.f114271b);
    }

    /* JADX INFO: renamed from: K */
    public void m139427K(BLiveBottomButton bLiveBottomButton) {
        this.f114271b = bLiveBottomButton;
    }

    /* JADX INFO: renamed from: L */
    public void m139428L(qct qctVar) {
        this.f114270a = qctVar;
    }

    /* JADX INFO: renamed from: N */
    public void m139429N(int i) {
        this.f114280k = i;
    }

    @Override // p153l.d3q, p153l.mqk
    /* JADX INFO: renamed from: X1 */
    public int mo113884X1() {
        return this.f114277h;
    }

    @Override // p153l.d3q, p153l.ztf0
    public int getOrder() {
        return this.f114276g;
    }

    @Override // p153l.d3q, p153l.mqk
    public boolean isFirst() {
        return this.f114279j;
    }

    @Override // p153l.d3q, p153l.mqk
    /* JADX INFO: renamed from: r1 */
    public String mo113886r1() {
        return this.f114278i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(V v2) {
        super.mo71749u(v2);
        bnl0.m105525M0(v2, this.f114272c);
    }

    @Override // p153l.d3q, p153l.mqk
    /* JADX INFO: renamed from: z0 */
    public void mo113892z0(boolean z) {
        this.f114279j = z;
    }

    public ic3(String str, CharSequence charSequence, int i, int i2, String str2) {
        this.f114274e = str;
        this.f114275f = charSequence;
        this.f114276g = i;
        this.f114277h = i2;
        this.f114278i = str2;
    }
}
