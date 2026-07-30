package p147v.bottombar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b6c0;
import p149l.biq;
import p149l.k0g0;
import p149l.l6j;
import p149l.p4c0;
import p149l.t0c0;
import p149l.t100;
import p149l.u2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarOldItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public VDraweeView f209541h;

    /* JADX INFO: renamed from: i */
    public VBottomBarRippleView f209542i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f209543j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f209544k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f209545l;

    /* JADX INFO: renamed from: m */
    public boolean f209546m;

    public VBottomBarOldItem(Context context) {
        super(context);
        mo40492c();
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo223367b() {
        int i;
        int i2;
        super.mo223367b();
        C22594a c22594a = this.f209528a;
        if (c22594a == null) {
            return;
        }
        C22594a.a aVar = c22594a.f209573i;
        if (aVar == null || (i = aVar.f209576c) == 0 || (i2 = aVar.f209577d) == 0) {
            this.f209542i.m223379g(c22594a.f209567c, c22594a.f209569e);
        } else {
            this.f209542i.m223379g(i, i2);
        }
        if (k0g0.m144048b(c22594a.f209572h)) {
            return;
        }
        xdl0.m208345M0(this.f209541h, true);
        this.f209541h.getHierarchy().m112050E(new ColorDrawable(getContext().getResources().getColor(t0c0.f167167s)));
        this.f209541h.setImageURI(c22594a.f209572h);
        this.f209542i.setRippleListener(new VBottomBarRippleView.InterfaceC22592b() { // from class: l.dfk0
            @Override // p147v.bottombar.VBottomBarRippleView.InterfaceC22592b
            /* JADX INFO: renamed from: a */
            public final void mo111494a(float f, float f2) {
                this.f85963a.m223374h(f, f2);
            }
        });
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo40492c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(b6c0.f73778d, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f209541h = (VDraweeView) viewInflate.findViewById(p4c0.f147127l0);
        this.f209542i = (VBottomBarRippleView) viewInflate.findViewById(p4c0.f147070H0);
        this.f209545l = (FrameLayout) findViewById(p4c0.f147075K);
        this.f209544k = (RelativeLayout) findViewById(p4c0.f147129m0);
        this.f209543j = (RelativeLayout) findViewById(p4c0.f147072I0);
        super.mo40492c();
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo39662d(boolean z, boolean z2) {
        if (z) {
            VBottomBarRippleView vBottomBarRippleView = this.f209542i;
            if (z2) {
                vBottomBarRippleView.m223381i();
            } else {
                vBottomBarRippleView.m223377d();
            }
            this.f209529b.setTextColor(getResources().getColor(t0c0.f167168t));
            this.f209529b.setTypeface(null, 1);
        } else {
            this.f209542i.m223378f();
            boolean z3 = this.f209534g;
            VText vText = this.f209529b;
            if (z3) {
                vText.setTextColor(getResources().getColor(t0c0.f167170v));
            } else {
                vText.setTextColor(getResources().getColor(t0c0.f167163o));
            }
            this.f209529b.setTypeface(null, 0);
        }
        VDraweeView vDraweeView = this.f209541h;
        if (vDraweeView == null || !this.f209546m) {
            return;
        }
        vDraweeView.setAlpha(isSelected() ? 1.0f : 0.5f);
    }

    /* JADX INFO: renamed from: f */
    public void m223372f(@LayoutRes int i) {
        if (this.f209544k.getChildCount() > 0) {
            this.f209544k.removeAllViews();
        }
        View.inflate(getContext(), i, this.f209544k);
        this.f209544k.setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public void m223373g(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        simpleDraweeView.setController(l6j.m148750g().mo8210b(simpleDraweeView.getController()).m8205C(ImageRequestBuilder.m8592y(Uri.parse(str)).m8603K(new biq(i, i2)).m8614a()).build());
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f209542i;
    }

    public VDraweeView getPicture() {
        return this.f209541h;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m223374h(float f, float f2) {
        this.f209541h.setScaleX(f2);
        this.f209541h.setScaleY(f2);
    }

    /* JADX INFO: renamed from: i */
    public void m223375i(String str, boolean z) {
        if (k0g0.m144048b(str)) {
            return;
        }
        xdl0.m208345M0(this.f209541h, true);
        VDraweeView vDraweeView = this.f209541h;
        if (z) {
            m223373g(vDraweeView, str, 2, 30);
        } else {
            vDraweeView.setImageURI(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m223376j() {
        xdl0.m208357U(this.f209543j, t100.m186890d(13.0f));
        setBackgroundResource(u2c0.f173322f);
        xdl0.m208358V(this.f209545l, t100.m186890d(17.0f));
        this.f209546m = true;
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        this.f209542i.setDarkMode(z);
        mo39662d(isSelected(), false);
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo40492c();
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo40492c();
    }
}
