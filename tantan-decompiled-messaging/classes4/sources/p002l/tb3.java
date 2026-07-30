package p002l;

import android.view.View;
import androidx.annotation.DrawableRes;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import l.d1q;
import l.qlf0;
import l.wnk;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class tb3<V extends View> extends d1q<V> implements qlf0, wnk {

    /* JADX INFO: renamed from: a */
    public pat<ho2> f20152a;

    /* JADX INFO: renamed from: b */
    public BLiveBottomButton f20153b;

    /* JADX INFO: renamed from: c */
    public boolean f20154c = true;

    /* JADX INFO: renamed from: d */
    public int f20155d;

    /* JADX INFO: renamed from: e */
    public String f20156e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f20157f;

    /* JADX INFO: renamed from: g */
    public int f20158g;

    /* JADX INFO: renamed from: h */
    public int f20159h;

    /* JADX INFO: renamed from: i */
    public String f20160i;

    /* JADX INFO: renamed from: j */
    public boolean f20161j;

    /* JADX INFO: renamed from: k */
    public int f20162k;

    public tb3(@DrawableRes int i, CharSequence charSequence, int i2, int i3, String str) {
        this.f20155d = i;
        this.f20157f = charSequence;
        this.f20158g = i2;
        this.f20159h = i3;
        this.f20160i = str;
    }

    /* JADX INFO: renamed from: A */
    public void m22825A(final View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            ((d1q) this).onItemClick = new View.OnClickListener() { // from class: l.sb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18906a.m22827J(onClickListener, view);
                }
            };
        }
    }

    /* JADX INFO: renamed from: I */
    public BLiveBottomButton m22826I() {
        return this.f20153b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22827J(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f20152a.m25548F2().BottomEvent.markButtonClicked().j(this.f20153b);
    }

    /* JADX INFO: renamed from: K */
    public void m22828K(BLiveBottomButton bLiveBottomButton) {
        this.f20153b = bLiveBottomButton;
    }

    /* JADX INFO: renamed from: L */
    public void m22829L(pat patVar) {
        this.f20152a = patVar;
    }

    /* JADX INFO: renamed from: N */
    public void m22830N(int i) {
        this.f20162k = i;
    }

    /* JADX INFO: renamed from: X1 */
    public int m22831X1() {
        return this.f20159h;
    }

    public int getOrder() {
        return this.f20158g;
    }

    public boolean isFirst() {
        return this.f20161j;
    }

    /* JADX INFO: renamed from: r1 */
    public String m22832r1() {
        return this.f20160i;
    }

    /* JADX INFO: renamed from: u */
    public void m22833u(V v) {
        super.u(v);
        xdl0.M0(v, this.f20154c);
    }

    /* JADX INFO: renamed from: z0 */
    public void m22834z0(boolean z) {
        this.f20161j = z;
    }

    public tb3(String str, CharSequence charSequence, int i, int i2, String str2) {
        this.f20156e = str;
        this.f20157f = charSequence;
        this.f20158g = i;
        this.f20159h = i2;
        this.f20160i = str2;
    }
}
