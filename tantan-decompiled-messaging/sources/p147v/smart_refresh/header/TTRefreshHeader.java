package p147v.smart_refresh.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import java.util.Objects;
import p147v.smart_refresh.constant.RefreshState;
import p147v.smart_refresh.simple.SimpleComponent;
import p149l.b6c0;
import p149l.fnc0;
import p149l.gnc0;
import p149l.hnc0;
import p149l.nof0;
import p149l.p4c0;

/* JADX INFO: loaded from: classes3.dex */
public class TTRefreshHeader extends SimpleComponent implements fnc0 {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f210083d;

    /* JADX INFO: renamed from: e */
    public final String f210084e;

    /* JADX INFO: renamed from: f */
    public final String f210085f;

    /* JADX INFO: renamed from: g */
    public gnc0 f210086g;

    /* JADX INFO: renamed from: h */
    public int f210087h;

    /* JADX INFO: renamed from: i */
    public int f210088i;

    /* JADX INFO: renamed from: j */
    public RefreshState f210089j;

    public TTRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210084e = "pull_down.svga";
        this.f210085f = "pull_down_refresh.svga";
        this.f210088i = 200;
        this.f210091b = nof0.f139831d;
        View.inflate(context, b6c0.f73795u, this);
        this.f210083d = (MomoLayUpSVGAImageView) findViewById(p4c0.f147091S);
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.nf50
    /* JADX INFO: renamed from: f */
    public void mo55758f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f210089j = refreshState2;
        if (refreshState2 == RefreshState.PullDownToRefresh) {
            this.f210083d.setVisibility(0);
            this.f210083d.loadSVGAAnimWithListener("pull_down.svga", 1, null, false);
        } else if (refreshState2 == RefreshState.RefreshReleased) {
            this.f210083d.setVisibility(0);
            this.f210083d.startSVGAAnim("pull_down_refresh.svga", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (refreshState2 == RefreshState.RefreshFinish) {
            this.f210083d.pauseAnimation();
        } else if (refreshState2 == RefreshState.None) {
            this.f210083d.stopAnimCompletely();
            this.f210083d.setVisibility(4);
        }
        Objects.toString(refreshState2);
        Objects.toString(refreshState);
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.bnc0
    /* JADX INFO: renamed from: h */
    public int mo102769h(@NonNull hnc0 hnc0Var, boolean z) {
        return this.f210088i;
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.bnc0
    /* JADX INFO: renamed from: i */
    public void mo102770i(@NonNull gnc0 gnc0Var, int i, int i2) {
        this.f210086g = gnc0Var;
        gnc0Var.mo127122b(this, this.f210087h);
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.bnc0
    /* JADX INFO: renamed from: l */
    public void mo102771l(boolean z, float f, int i, int i2, int i3) {
        if (!z || this.f210089j == RefreshState.Refreshing) {
            return;
        }
        float f2 = f - 0.3f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f210083d.stepToPercentage(f2, false);
    }

    public void setSpinnerStyle(nof0 nof0Var) {
        this.f210091b = nof0Var;
    }

    public TTRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshHeader(Context context) {
        this(context, null);
    }
}
