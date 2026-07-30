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
public class TTMaterialRefreshHeader extends SimpleComponent implements fnc0 {

    /* JADX INFO: renamed from: k */
    public static final String f13700k = TTRefreshHeader.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f13701d;

    /* JADX INFO: renamed from: e */
    public final String f13702e;

    /* JADX INFO: renamed from: f */
    public final String f13703f;

    /* JADX INFO: renamed from: g */
    public gnc0 f13704g;

    /* JADX INFO: renamed from: h */
    public int f13705h;

    /* JADX INFO: renamed from: i */
    public int f13706i;

    /* JADX INFO: renamed from: j */
    public RefreshState f13707j;

    public TTMaterialRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13702e = "pull_down.svga";
        this.f13703f = "pull_down_refresh.svga";
        this.f13706i = 200;
        this.f13716b = nof0.f5932d;
        View.inflate(context, b6c0.n, this);
        this.f13701d = findViewById(p4c0.S);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.nf50
    /* JADX INFO: renamed from: f */
    public void mo2876f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f13707j = refreshState2;
        if (refreshState2 == RefreshState.PullDownToRefresh) {
            this.f13701d.setVisibility(0);
            this.f13701d.loadSVGAAnimWithListener("pull_down.svga", 1, (SVGAAnimListenerAdapter) null, false);
        } else if (refreshState2 == RefreshState.RefreshReleased) {
            this.f13701d.setVisibility(0);
            this.f13701d.startSVGAAnim("pull_down_refresh.svga", Integer.MAX_VALUE);
        } else if (refreshState2 == RefreshState.RefreshFinish) {
            this.f13701d.pauseAnimation();
        } else if (refreshState2 == RefreshState.None) {
            this.f13701d.stopAnimCompletely();
            this.f13701d.setVisibility(4);
        }
        Objects.toString(refreshState2);
        Objects.toString(refreshState);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: h */
    public int mo2972h(@NonNull hnc0 hnc0Var, boolean z) {
        return this.f13706i;
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: i */
    public void mo2973i(@NonNull gnc0 gnc0Var, int i, int i2) {
        this.f13704g = gnc0Var;
        gnc0Var.mo4651b(this, this.f13705h);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: l */
    public void mo2974l(boolean z, float f, int i, int i2, int i3) {
        if (!z || this.f13707j == RefreshState.Refreshing) {
            return;
        }
        float f2 = f - 0.3f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f13701d.stepToPercentage(f2, false);
    }

    public void setSpinnerStyle(nof0 nof0Var) {
        this.f13716b = nof0Var;
    }

    public TTMaterialRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTMaterialRefreshHeader(Context context) {
        this(context, null);
    }
}
