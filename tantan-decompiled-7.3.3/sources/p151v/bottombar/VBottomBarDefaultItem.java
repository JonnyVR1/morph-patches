package p151v.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p151v.RedPointView;
import p151v.VImage;
import p151v.VOnlineIndicator;
import p151v.VText;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarDefaultItem extends FrameLayout implements VBottomBar.InterfaceC22703b {

    /* JADX INFO: renamed from: a */
    public C22709a f210450a;

    /* JADX INFO: renamed from: b */
    public VText f210451b;

    /* JADX INFO: renamed from: c */
    public RedPointView f210452c;

    /* JADX INFO: renamed from: d */
    public VOnlineIndicator f210453d;

    /* JADX INFO: renamed from: e */
    public VImage f210454e;

    /* JADX INFO: renamed from: f */
    public boolean f210455f;

    /* JADX INFO: renamed from: g */
    public boolean f210456g;

    public VBottomBarDefaultItem(Context context) {
        super(context);
        mo41503c();
    }

    /* JADX INFO: renamed from: a */
    public void mo41502a(boolean z, boolean z2) {
        boolean z3 = isSelected() == z;
        if (z3) {
            return;
        }
        setSelected(z);
        if (this.f210455f) {
            return;
        }
        if (z3) {
            z2 = false;
        }
        mo40665d(z, z2);
    }

    /* JADX INFO: renamed from: b */
    public void mo224613b() {
        C22709a c22709a = this.f210450a;
        if (c22709a == null) {
            return;
        }
        if (!TextUtils.isEmpty(c22709a.f210488b)) {
            this.f210451b.setText(c22709a.f210488b);
        }
        C22709a.a aVar = c22709a.f210495i;
        if (aVar == null || TextUtils.isEmpty(aVar.f210496a)) {
            return;
        }
        this.f210451b.setText(c22709a.f210495i.f210496a);
    }

    /* JADX INFO: renamed from: c */
    public void mo41503c() {
        this.f210451b = (VText) findViewById(vcc0.f183425k0);
        this.f210452c = (RedPointView) findViewById(vcc0.f183416g);
        this.f210453d = (VOnlineIndicator) findViewById(vcc0.f183402Y);
        this.f210454e = (VImage) findViewById(vcc0.f183367G);
    }

    /* JADX INFO: renamed from: d */
    public void mo40665d(boolean z, boolean z2) {
    }

    public View getIconView() {
        return null;
    }

    public C22709a getInfo() {
        return this.f210450a;
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22703b
    public View getRoot() {
        return this;
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22703b
    public String getTabName() {
        C22709a c22709a = this.f210450a;
        return c22709a != null ? c22709a.f210487a : "";
    }

    public void setDarkMode(boolean z) {
        this.f210456g = z;
        this.f210453d.setDarkMode(z);
        this.f210452c.setDarkMode(z);
    }

    public void setGrey(boolean z) {
        this.f210455f = z;
    }

    public void setInfo(C22709a c22709a) {
        this.f210450a = c22709a;
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo41503c();
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo41503c();
    }
}
