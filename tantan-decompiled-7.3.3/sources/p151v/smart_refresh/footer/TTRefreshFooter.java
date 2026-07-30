package p151v.smart_refresh.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import p151v.smart_refresh.constant.RefreshState;
import p151v.smart_refresh.simple.SimpleComponent;
import p153l.gec0;
import p153l.jvc0;
import p153l.lvc0;
import p153l.mvc0;
import p153l.vcc0;
import p153l.wwf0;

/* JADX INFO: loaded from: classes3.dex */
public class TTRefreshFooter extends SimpleComponent implements jvc0 {

    /* JADX INFO: renamed from: d */
    public lvc0 f210992d;

    /* JADX INFO: renamed from: e */
    public ImageView f210993e;

    /* JADX INFO: renamed from: f */
    public int f210994f;

    /* JADX INFO: renamed from: g */
    public int f210995g;

    /* JADX INFO: renamed from: h */
    public RefreshState f210996h;

    public TTRefreshFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210995g = 500;
        this.f211013b = wwf0.f191267d;
        View.inflate(context, gec0.f103807t, this);
        this.f210993e = (ImageView) findViewById(vcc0.f183377L);
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.tn50
    /* JADX INFO: renamed from: f */
    public void mo56941f(@NonNull mvc0 mvc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.f210996h = refreshState2;
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.gvc0
    /* JADX INFO: renamed from: h */
    public int mo132530h(@NonNull mvc0 mvc0Var, boolean z) {
        return this.f210995g;
    }

    @Override // p151v.smart_refresh.simple.SimpleComponent, p153l.gvc0
    /* JADX INFO: renamed from: i */
    public void mo132531i(@NonNull lvc0 lvc0Var, int i, int i2) {
        this.f210992d = lvc0Var;
        lvc0Var.mo155984b(this, this.f210994f);
    }

    public void setSpinnerStyle(wwf0 wwf0Var) {
        this.f211013b = wwf0Var;
    }

    public TTRefreshFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRefreshFooter(Context context) {
        this(context, null);
    }
}
