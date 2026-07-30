package p028v.smart_refresh.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import java.util.Objects;
import l.b6c0;
import l.p4c0;
import p003l.fnc0;
import p003l.gnc0;
import p003l.hnc0;
import p003l.nof0;
import p028v.smart_refresh.constant.RefreshState;
import p028v.smart_refresh.simple.SimpleComponent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TTRefreshHeader extends SimpleComponent implements fnc0 {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f13708d;

    /* JADX INFO: renamed from: e */
    public final String f13709e;

    /* JADX INFO: renamed from: f */
    public final String f13710f;

    /* JADX INFO: renamed from: g */
    public gnc0 f13711g;

    /* JADX INFO: renamed from: h */
    public int f13712h;

    /* JADX INFO: renamed from: i */
    public int f13713i;

    /* JADX INFO: renamed from: j */
    public RefreshState f13714j;

    public TTRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13709e = "pull_down.svga";
        this.f13710f = "pull_down_refresh.svga";
        this.f13713i = 200;
        this.f13716b = nof0.f5932d;
        View.inflate(context, b6c0.u, this);
        this.f13708d = findViewById(p4c0.S);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.nf50
    /* JADX INFO: renamed from: f */
    public void mo2876f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f13714j = refreshState2;
        if (refreshState2 == RefreshState.PullDownToRefresh) {
            this.f13708d.setVisibility(0);
            this.f13708d.loadSVGAAnimWithListener("pull_down.svga", 1, (SVGAAnimListenerAdapter) null, false);
        } else if (refreshState2 == RefreshState.RefreshReleased) {
            this.f13708d.setVisibility(0);
            this.f13708d.startSVGAAnim("pull_down_refresh.svga", Integer.MAX_VALUE);
        } else if (refreshState2 == RefreshState.RefreshFinish) {
            this.f13708d.pauseAnimation();
        } else if (refreshState2 == RefreshState.None) {
            this.f13708d.stopAnimCompletely();
            this.f13708d.setVisibility(4);
        }
        Objects.toString(refreshState2);
        Objects.toString(refreshState);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: h */
    public int mo2972h(@NonNull hnc0 hnc0Var, boolean z) {
        return this.f13713i;
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: i */
    public void mo2973i(@NonNull gnc0 gnc0Var, int i, int i2) {
        this.f13711g = gnc0Var;
        gnc0Var.mo4651b(this, this.f13712h);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: l */
    public void mo2974l(boolean z, float f, int i, int i2, int i3) {
        if (!z || this.f13714j == RefreshState.Refreshing) {
            return;
        }
        float f2 = f - 0.3f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f13708d.stepToPercentage(f2, false);
    }

    public void setSpinnerStyle(nof0 nof0Var) {
        this.f13716b = nof0Var;
    }

    public TTRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshHeader(Context context) {
        this(context, null);
    }
}
