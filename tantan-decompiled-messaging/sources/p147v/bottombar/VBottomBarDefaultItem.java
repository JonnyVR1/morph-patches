package p147v.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.RedPointView;
import p147v.VImage;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.p4c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarDefaultItem extends FrameLayout implements VBottomBar.InterfaceC22588b {

    /* JADX INFO: renamed from: a */
    public C22594a f209528a;

    /* JADX INFO: renamed from: b */
    public VText f209529b;

    /* JADX INFO: renamed from: c */
    public RedPointView f209530c;

    /* JADX INFO: renamed from: d */
    public VOnlineIndicator f209531d;

    /* JADX INFO: renamed from: e */
    public VImage f209532e;

    /* JADX INFO: renamed from: f */
    public boolean f209533f;

    /* JADX INFO: renamed from: g */
    public boolean f209534g;

    public VBottomBarDefaultItem(Context context) {
        super(context);
        mo40492c();
    }

    /* JADX INFO: renamed from: a */
    public void mo40491a(boolean z, boolean z2) {
        boolean z3 = isSelected() == z;
        if (z3) {
            return;
        }
        setSelected(z);
        if (this.f209533f) {
            return;
        }
        if (z3) {
            z2 = false;
        }
        mo39662d(z, z2);
    }

    /* JADX INFO: renamed from: b */
    public void mo223367b() {
        C22594a c22594a = this.f209528a;
        if (c22594a == null) {
            return;
        }
        if (!TextUtils.isEmpty(c22594a.f209566b)) {
            this.f209529b.setText(c22594a.f209566b);
        }
        C22594a.a aVar = c22594a.f209573i;
        if (aVar == null || TextUtils.isEmpty(aVar.f209574a)) {
            return;
        }
        this.f209529b.setText(c22594a.f209573i.f209574a);
    }

    /* JADX INFO: renamed from: c */
    public void mo40492c() {
        this.f209529b = (VText) findViewById(p4c0.f147125k0);
        this.f209530c = (RedPointView) findViewById(p4c0.f147116g);
        this.f209531d = (VOnlineIndicator) findViewById(p4c0.f147102Y);
        this.f209532e = (VImage) findViewById(p4c0.f147067G);
    }

    /* JADX INFO: renamed from: d */
    public void mo39662d(boolean z, boolean z2) {
    }

    public View getIconView() {
        return null;
    }

    public C22594a getInfo() {
        return this.f209528a;
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22588b
    public View getRoot() {
        return this;
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22588b
    public String getTabName() {
        C22594a c22594a = this.f209528a;
        return c22594a != null ? c22594a.f209565a : "";
    }

    public void setDarkMode(boolean z) {
        this.f209534g = z;
        this.f209531d.setDarkMode(z);
        this.f209530c.setDarkMode(z);
    }

    public void setGrey(boolean z) {
        this.f209533f = z;
    }

    public void setInfo(C22594a c22594a) {
        this.f209528a = c22594a;
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo40492c();
    }

    public VBottomBarDefaultItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo40492c();
    }
}
