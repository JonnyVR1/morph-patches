package p028v.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.p4c0;
import p028v.RedPointView;
import p028v.VImage;
import p028v.VOnlineIndicator;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBottomBarDefaultItem extends FrameLayout implements VBottomBar.InterfaceC1381b {

    /* JADX INFO: renamed from: a */
    public C1387a f13153a;

    /* JADX INFO: renamed from: b */
    public VText f13154b;

    /* JADX INFO: renamed from: c */
    public RedPointView f13155c;

    /* JADX INFO: renamed from: d */
    public VOnlineIndicator f13156d;

    /* JADX INFO: renamed from: e */
    public VImage f13157e;

    /* JADX INFO: renamed from: f */
    public boolean f13158f;

    /* JADX INFO: renamed from: g */
    public boolean f13159g;

    public VBottomBarDefaultItem(Context context) {
        super(context);
        mo11867c();
    }

    @Override // p028v.bottombar.VBottomBar.InterfaceC1381b
    /* JADX INFO: renamed from: a */
    public void mo11865a(boolean z, boolean z2) {
        boolean z3 = isSelected() == z;
        if (z3) {
            return;
        }
        setSelected(z);
        if (this.f13158f) {
            return;
        }
        if (z3) {
            z2 = false;
        }
        mo11868d(z, z2);
    }

    /* JADX INFO: renamed from: b */
    public void mo11866b() {
        C1387a c1387a = this.f13153a;
        if (c1387a == null) {
            return;
        }
        if (!TextUtils.isEmpty(c1387a.f13191b)) {
            this.f13154b.setText(c1387a.f13191b);
        }
        C1387a.a aVar = c1387a.f13198i;
        if (aVar == null || TextUtils.isEmpty(aVar.f13199a)) {
            return;
        }
        this.f13154b.setText(c1387a.f13198i.f13199a);
    }

    /* JADX INFO: renamed from: c */
    public void mo11867c() {
        this.f13154b = (VText) findViewById(p4c0.k0);
        this.f13155c = (RedPointView) findViewById(p4c0.g);
        this.f13156d = (VOnlineIndicator) findViewById(p4c0.Y);
        this.f13157e = (VImage) findViewById(p4c0.G);
    }

    /* JADX INFO: renamed from: d */
    public void mo11868d(boolean z, boolean z2) {
    }

    public View getIconView() {
        return null;
    }

    public C1387a getInfo() {
        return this.f13153a;
    }

    @Override // p028v.bottombar.VBottomBar.InterfaceC1381b
    public View getRoot() {
        return this;
    }

    @Override // p028v.bottombar.VBottomBar.InterfaceC1381b
    public String getTabName() {
        C1387a c1387a = this.f13153a;
        return c1387a != null ? c1387a.f13190a : "";
    }

    public void setDarkMode(boolean z) {
        this.f13159g = z;
        this.f13156d.setDarkMode(z);
        this.f13155c.setDarkMode(z);
    }

    public void setGrey(boolean z) {
        this.f13158f = z;
    }

    public void setInfo(C1387a c1387a) {
        this.f13153a = c1387a;
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo11867c();
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo11867c();
    }
}
