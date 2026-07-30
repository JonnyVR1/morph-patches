package p153l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPreviewAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import p151v.VCheckCircle;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class b3y implements iam<w2y> {

    /* JADX INFO: renamed from: a */
    public VPager f74828a;

    /* JADX INFO: renamed from: b */
    public VCheckCircle f74829b;

    /* JADX INFO: renamed from: c */
    public w2y f74830c;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f74831d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public u2y f74832e;

    /* JADX INFO: renamed from: f */
    public VText f74833f;

    /* JADX INFO: renamed from: g */
    public View f74834g;

    /* JADX INFO: renamed from: h */
    public MediaPreviewAct f74835h;

    /* JADX INFO: renamed from: i */
    public int f74836i;

    /* JADX INFO: renamed from: l.b3y$a */
    public class C15916a extends ViewPager.C0721m {
        public C15916a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            Media media = b3y.this.f74831d.get(i);
            if (NullChecker.m82486a(b3y.this.f74830c.m204608g0())) {
                b3y b3yVar = b3y.this;
                b3yVar.f74829b.m224249e(b3yVar.f74830c.m204608g0().contains(media), false);
                b3y.this.f74835h.setTitle((i + 1) + "/" + b3y.this.f74831d.size());
            }
            for (int i2 = 0; i2 < b3y.this.f74828a.getChildCount(); i2++) {
                if ((b3y.this.f74828a.getChildAt(i2) instanceof PictureView) && !b3y.this.f74828a.getChildAt(i2).getTag().equals(media)) {
                    ((PictureView) b3y.this.f74828a.getChildAt(i2)).m45173U();
                }
            }
        }
    }

    public b3y(MediaPreviewAct mediaPreviewAct) {
        this.f74835h = mediaPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m102376p() {
        MediaPickerAct.m48972q2(this.f74834g, this.f74833f, this.f74835h, this.f74830c.f186957b, true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74835h;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f74835h;
    }

    /* JADX INFO: renamed from: i */
    public View m102370i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c3y.m107814b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102370i(layoutInflater, viewGroup);
    }

    public void init() {
        this.f74836i = act().statusBarColor();
        this.f74828a.setPageMargin(qa00.m175859d(8.0f));
        if (this.f74830c.m204608g0() == null) {
            this.f74835h.setTitle(R$string.f18645Li);
            this.f74829b.setVisibility(4);
        } else {
            this.f74829b.setSize(40);
            this.f74829b.setOnClickListener(new View.OnClickListener() { // from class: l.a3y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68339a.m102374m(view);
                }
            });
        }
        C15916a c15916a = new C15916a();
        this.f74828a.setOnPageChangeListener(c15916a);
        u2y u2yVar = new u2y(this.f74835h, this.f74831d);
        this.f74832e = u2yVar;
        this.f74828a.setAdapter(u2yVar);
        int i = this.f74835h.f31489c;
        if (i > 0) {
            this.f74828a.setCurrentItem(i);
        } else {
            c15916a.onPageSelected(0);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w2y w2yVar) {
        this.f74830c = w2yVar;
    }

    /* JADX INFO: renamed from: k */
    public void m102372k(ArrayList<Media> arrayList) {
        this.f74831d = new ArrayList<>(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public void m102373l(Menu menu, final ArrayList<Media> arrayList) {
        View actionView = menu.findItem(adc0.f70331f3).getActionView();
        this.f74834g = actionView;
        VText vText = (VText) actionView.findViewById(adc0.f70505p8);
        this.f74833f = vText;
        if (arrayList == null) {
            vText.setText(R$string.f18890Tn);
        } else {
            vText.setText(R$string.f19383k);
        }
        this.f74835h.getAppTheme().mo134830j(this.f74833f);
        this.f74834g.setOnClickListener(new View.OnClickListener() { // from class: l.x2y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192209a.m102375n(arrayList, view);
            }
        });
        act().post(new Runnable() { // from class: l.y2y
            @Override // java.lang.Runnable
            public final void run() {
                this.f197289a.m102376p();
            }
        });
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.z2y
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f202769a.m102377q();
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m102374m(View view) {
        Media media = this.f74831d.get(this.f74828a.getCurrentItem());
        if (this.f74829b.m224248d()) {
            if (m102378u(media, false)) {
                this.f74829b.m224249e(false, true);
            }
        } else if (m102378u(media, true)) {
            this.f74829b.m224249e(true, true);
        }
        m102376p();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m102375n(ArrayList arrayList, View view) {
        if (HardwareEarMonitorUtils.MANUFACTURER_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo X7".equalsIgnoreCase(Build.MODEL)) {
            VPager vPager = this.f74828a;
            View viewFindViewWithTag = vPager.findViewWithTag(this.f74831d.get(vPager.getCurrentItem()));
            if (viewFindViewWithTag instanceof PictureView) {
                ((PictureView) viewFindViewWithTag).m45194x(true);
            }
        }
        Intent intent = new Intent();
        if (arrayList == null || arrayList.isEmpty()) {
            intent.putExtra("selectedImages", jyb.m147507f0(this.f74831d.get(this.f74828a.getCurrentItem())));
        } else {
            intent.putExtra("selectedImages", arrayList);
        }
        intent.putExtra("isDone", true);
        act().setResult(-1, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m102377q() {
        m102376p();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public boolean m102378u(Media media, boolean z) {
        if (!MediaPickerAct.m48973r2(media, z, this.f74830c.m204608g0(), this.f74830c.m204607f0())) {
            return false;
        }
        m102376p();
        return true;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
