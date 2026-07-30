package p147v.smart_refresh.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p147v.smart_refresh.constant.RefreshState;
import p147v.smart_refresh.simple.SimpleComponent;
import p149l.b6c0;
import p149l.enc0;
import p149l.gnc0;
import p149l.hnc0;
import p149l.nof0;
import p149l.p4c0;

/* JADX INFO: loaded from: classes3.dex */
public class TTRefreshFooter extends SimpleComponent implements enc0 {

    /* JADX INFO: renamed from: d */
    public gnc0 f210070d;

    /* JADX INFO: renamed from: e */
    public ImageView f210071e;

    /* JADX INFO: renamed from: f */
    public int f210072f;

    /* JADX INFO: renamed from: g */
    public int f210073g;

    /* JADX INFO: renamed from: h */
    public RefreshState f210074h;

    public TTRefreshFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210073g = 500;
        this.f210091b = nof0.f139831d;
        View.inflate(context, b6c0.f73794t, this);
        this.f210071e = (ImageView) findViewById(p4c0.f147077L);
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.nf50
    /* JADX INFO: renamed from: f */
    public void mo55758f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f210074h = refreshState2;
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.bnc0
    /* JADX INFO: renamed from: h */
    public int mo102769h(@NonNull hnc0 hnc0Var, boolean z) {
        return this.f210073g;
    }

    @Override // p147v.smart_refresh.simple.SimpleComponent, p149l.bnc0
    /* JADX INFO: renamed from: i */
    public void mo102770i(@NonNull gnc0 gnc0Var, int i, int i2) {
        this.f210070d = gnc0Var;
        gnc0Var.mo127122b(this, this.f210072f);
    }

    public void setSpinnerStyle(nof0 nof0Var) {
        this.f210091b = nof0Var;
    }

    public TTRefreshFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshFooter(Context context) {
        this(context, null);
    }
}
