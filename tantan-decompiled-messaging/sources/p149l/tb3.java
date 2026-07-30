package p149l;

import android.view.View;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tb3<V extends View> extends d1q<V> implements qlf0, wnk {

    /* JADX INFO: renamed from: a */
    public pat<ho2> f169207a;

    /* JADX INFO: renamed from: b */
    public BLiveBottomButton f169208b;

    /* JADX INFO: renamed from: c */
    public boolean f169209c = true;

    /* JADX INFO: renamed from: d */
    public int f169210d;

    /* JADX INFO: renamed from: e */
    public String f169211e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f169212f;

    /* JADX INFO: renamed from: g */
    public int f169213g;

    /* JADX INFO: renamed from: h */
    public int f169214h;

    /* JADX INFO: renamed from: i */
    public String f169215i;

    /* JADX INFO: renamed from: j */
    public boolean f169216j;

    /* JADX INFO: renamed from: k */
    public int f169217k;

    public tb3(@DrawableRes int i, CharSequence charSequence, int i2, int i3, String str) {
        this.f169210d = i;
        this.f169212f = charSequence;
        this.f169213g = i2;
        this.f169214h = i3;
        this.f169215i = str;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: A */
    public void mo109662A(final View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.onItemClick = new View.OnClickListener() { // from class: l.sb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163497a.m187793J(onClickListener, view);
                }
            };
        }
    }

    /* JADX INFO: renamed from: I */
    public BLiveBottomButton m187792I() {
        return this.f169208b;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m187793J(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f169207a.m206028F2().BottomEvent.markButtonClicked().mo172463j(this.f169208b);
    }

    /* JADX INFO: renamed from: K */
    public void m187794K(BLiveBottomButton bLiveBottomButton) {
        this.f169208b = bLiveBottomButton;
    }

    /* JADX INFO: renamed from: L */
    public void m187795L(pat patVar) {
        this.f169207a = patVar;
    }

    /* JADX INFO: renamed from: N */
    public void m187796N(int i) {
        this.f169217k = i;
    }

    @Override // p149l.d1q, p149l.wnk
    /* JADX INFO: renamed from: X1 */
    public int mo109665X1() {
        return this.f169214h;
    }

    @Override // p149l.d1q, p149l.qlf0
    public int getOrder() {
        return this.f169213g;
    }

    @Override // p149l.d1q, p149l.wnk
    public boolean isFirst() {
        return this.f169216j;
    }

    @Override // p149l.d1q, p149l.wnk
    /* JADX INFO: renamed from: r1 */
    public String mo109668r1() {
        return this.f169215i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(V v2) {
        super.mo70566u(v2);
        xdl0.m208345M0(v2, this.f169209c);
    }

    @Override // p149l.d1q, p149l.wnk
    /* JADX INFO: renamed from: z0 */
    public void mo109674z0(boolean z) {
        this.f169216j = z;
    }

    public tb3(String str, CharSequence charSequence, int i, int i2, String str2) {
        this.f169211e = str;
        this.f169212f = charSequence;
        this.f169213g = i;
        this.f169214h = i2;
        this.f169215i = str2;
    }
}
