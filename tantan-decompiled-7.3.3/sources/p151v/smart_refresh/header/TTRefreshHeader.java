package p151v.smart_refresh.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import java.util.Objects;
import p151v.smart_refresh.constant.RefreshState;
import p151v.smart_refresh.simple.SimpleComponent;
import p153l.gec0;
import p153l.kvc0;
import p153l.lvc0;
import p153l.mvc0;
import p153l.vcc0;
import p153l.wwf0;

/* JADX INFO: loaded from: classes3.dex */
public class TTRefreshHeader extends SimpleComponent implements kvc0 {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f211005d;

    /* JADX INFO: renamed from: e */
    public final String f211006e;

    /* JADX INFO: renamed from: f */
    public final String f211007f;

    /* JADX INFO: renamed from: g */
    public lvc0 f211008g;

    /* JADX INFO: renamed from: h */
    public int f211009h;

    /* JADX INFO: renamed from: i */
    public int f211010i;

    /* JADX INFO: renamed from: j */
    public RefreshState f211011j;

    public TTRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f211006e = "pull_down.svga";
        this.f211007f = "pull_down_refresh.svga";
        this.f211010i = 200;
        this.f211013b = wwf0.f191267d;
        View.inflate(context, gec0.f103808u, this);
        this.f211005d = (MomoLayUpSVGAImageView) findViewById(vcc0.f183391S);
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.tn50
    /* JADX INFO: renamed from: f */
    public void mo56941f(@NonNull mvc0 mvc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f211011j = refreshState2;
        if (refreshState2 == RefreshState.PullDownToRefresh) {
            this.f211005d.setVisibility(0);
            this.f211005d.loadSVGAAnimWithListener("pull_down.svga", 1, null, false);
        } else if (refreshState2 == RefreshState.RefreshReleased) {
            this.f211005d.setVisibility(0);
            this.f211005d.startSVGAAnim("pull_down_refresh.svga", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (refreshState2 == RefreshState.RefreshFinish) {
            this.f211005d.pauseAnimation();
        } else if (refreshState2 == RefreshState.None) {
            this.f211005d.stopAnimCompletely();
            this.f211005d.setVisibility(4);
        }
        Objects.toString(refreshState2);
        Objects.toString(refreshState);
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.gvc0
    /* JADX INFO: renamed from: h */
    public int mo132530h(@NonNull mvc0 mvc0Var, boolean z) {
        return this.f211010i;
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.gvc0
    /* JADX INFO: renamed from: i */
    public void mo132531i(@NonNull lvc0 lvc0Var, int i, int i2) {
        this.f211008g = lvc0Var;
        lvc0Var.mo155984b(this, this.f211009h);
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.gvc0
    /* JADX INFO: renamed from: l */
    public void mo132532l(boolean z, float f, int i, int i2, int i3) {
        if (!z || this.f211011j == RefreshState.Refreshing) {
            return;
        }
        float f2 = f - 0.3f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.f211005d.stepToPercentage(f2, false);
    }

    public void setSpinnerStyle(wwf0 wwf0Var) {
        this.f211013b = wwf0Var;
    }

    public TTRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshHeader(Context context) {
        this(context, null);
    }
}
