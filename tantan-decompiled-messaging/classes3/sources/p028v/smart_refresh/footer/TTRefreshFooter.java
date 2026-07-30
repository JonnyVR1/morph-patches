package p028v.smart_refresh.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import l.b6c0;
import l.p4c0;
import org.eclipse.jetty.http.HttpStatus;
import p003l.enc0;
import p003l.gnc0;
import p003l.hnc0;
import p003l.nof0;
import p028v.smart_refresh.constant.RefreshState;
import p028v.smart_refresh.simple.SimpleComponent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TTRefreshFooter extends SimpleComponent implements enc0 {

    /* JADX INFO: renamed from: d */
    public gnc0 f13695d;

    /* JADX INFO: renamed from: e */
    public ImageView f13696e;

    /* JADX INFO: renamed from: f */
    public int f13697f;

    /* JADX INFO: renamed from: g */
    public int f13698g;

    /* JADX INFO: renamed from: h */
    public RefreshState f13699h;

    public TTRefreshFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13698g = HttpStatus.INTERNAL_SERVER_ERROR_500;
        this.f13716b = nof0.f5932d;
        View.inflate(context, b6c0.t, this);
        this.f13696e = (ImageView) findViewById(p4c0.L);
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.nf50
    /* JADX INFO: renamed from: f */
    public void mo2876f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f13699h = refreshState2;
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: h */
    public int mo2972h(@NonNull hnc0 hnc0Var, boolean z) {
        return this.f13698g;
    }

    @Override // p028v.smart_refresh.simple.SimpleComponent, p003l.bnc0
    /* JADX INFO: renamed from: i */
    public void mo2973i(@NonNull gnc0 gnc0Var, int i, int i2) {
        this.f13695d = gnc0Var;
        gnc0Var.mo4651b(this, this.f13697f);
    }

    public void setSpinnerStyle(nof0 nof0Var) {
        this.f13716b = nof0Var;
    }

    public TTRefreshFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshFooter(Context context) {
        this(context, null);
    }
}
