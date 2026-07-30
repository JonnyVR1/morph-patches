package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPreviewAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import p147v.VCheckCircle;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class eux implements s7m<ztx> {

    /* JADX INFO: renamed from: a */
    public VPager f93281a;

    /* JADX INFO: renamed from: b */
    public VCheckCircle f93282b;

    /* JADX INFO: renamed from: c */
    public ztx f93283c;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f93284d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public xtx f93285e;

    /* JADX INFO: renamed from: f */
    public VText f93286f;

    /* JADX INFO: renamed from: g */
    public View f93287g;

    /* JADX INFO: renamed from: h */
    public MediaPreviewAct f93288h;

    /* JADX INFO: renamed from: i */
    public int f93289i;

    /* JADX INFO: renamed from: l.eux$a */
    public class C16685a extends ViewPager.C0719m {
        public C16685a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            Media media = eux.this.f93284d.get(i);
            if (NullChecker.m81303a(eux.this.f93283c.m220157g0())) {
                eux euxVar = eux.this;
                euxVar.f93282b.m223003e(euxVar.f93283c.m220157g0().contains(media), false);
                eux.this.f93288h.setTitle((i + 1) + "/" + eux.this.f93284d.size());
            }
            for (int i2 = 0; i2 < eux.this.f93281a.getChildCount(); i2++) {
                if ((eux.this.f93281a.getChildAt(i2) instanceof PictureView) && !eux.this.f93281a.getChildAt(i2).getTag().equals(media)) {
                    ((PictureView) eux.this.f93281a.getChildAt(i2)).m43990U();
                }
            }
        }
    }

    public eux(MediaPreviewAct mediaPreviewAct) {
        this.f93288h = mediaPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m118221p() {
        MediaPickerAct.m47789p2(this.f93287g, this.f93286f, this.f93288h, this.f93283c.f204778b, true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93288h;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f93288h;
    }

    /* JADX INFO: renamed from: i */
    public View m118215i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fux.m123221b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m118215i(layoutInflater, viewGroup);
    }

    public void init() {
        this.f93289i = act().statusBarColor();
        this.f93281a.setPageMargin(t100.m186890d(8.0f));
        if (this.f93283c.m220157g0() == null) {
            this.f93288h.setTitle(R$string.f18857qi);
            this.f93282b.setVisibility(4);
        } else {
            this.f93282b.setSize(40);
            this.f93282b.setOnClickListener(new View.OnClickListener() { // from class: l.dux
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88020a.m118219m(view);
                }
            });
        }
        C16685a c16685a = new C16685a();
        this.f93281a.setOnPageChangeListener(c16685a);
        xtx xtxVar = new xtx(this.f93288h, this.f93284d);
        this.f93285e = xtxVar;
        this.f93281a.setAdapter(xtxVar);
        int i = this.f93288h.f30641c;
        if (i > 0) {
            this.f93281a.setCurrentItem(i);
        } else {
            c16685a.onPageSelected(0);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ztx ztxVar) {
        this.f93283c = ztxVar;
    }

    /* JADX INFO: renamed from: k */
    public void m118217k(ArrayList<Media> arrayList) {
        this.f93284d = new ArrayList<>(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public void m118218l(Menu menu, final ArrayList<Media> arrayList) {
        View actionView = menu.findItem(u4c0.f174206d3).getActionView();
        this.f93287g = actionView;
        VText vText = (VText) actionView.findViewById(u4c0.f174380n8);
        this.f93286f = vText;
        if (arrayList == null) {
            vText.setText(R$string.f19072xn);
        } else {
            vText.setText(R$string.f18653k);
        }
        this.f93288h.getAppTheme().mo103048j(this.f93286f);
        this.f93287g.setOnClickListener(new View.OnClickListener() { // from class: l.aux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71869a.m118220n(arrayList, view);
            }
        });
        act().post(new Runnable() { // from class: l.bux
            @Override // java.lang.Runnable
            public final void run() {
                this.f77382a.m118221p();
            }
        });
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.cux
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82605a.m118222q();
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m118219m(View view) {
        Media media = this.f93284d.get(this.f93281a.getCurrentItem());
        if (this.f93282b.m223002d()) {
            if (m118223u(media, false)) {
                this.f93282b.m223003e(false, true);
            }
        } else if (m118223u(media, true)) {
            this.f93282b.m223003e(true, true);
        }
        m118221p();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m118220n(ArrayList arrayList, View view) {
        if (HardwareEarMonitorUtils.MANUFACTURER_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo X7".equalsIgnoreCase(Build.MODEL)) {
            VPager vPager = this.f93281a;
            View viewFindViewWithTag = vPager.findViewWithTag(this.f93284d.get(vPager.getCurrentItem()));
            if (viewFindViewWithTag instanceof PictureView) {
                ((PictureView) viewFindViewWithTag).m44011x(true);
            }
        }
        Intent intent = new Intent();
        if (arrayList == null || arrayList.isEmpty()) {
            intent.putExtra("selectedImages", vwb.m200324f0(this.f93284d.get(this.f93281a.getCurrentItem())));
        } else {
            intent.putExtra("selectedImages", arrayList);
        }
        intent.putExtra("isDone", true);
        act().setResult(-1, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m118222q() {
        m118221p();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public boolean m118223u(Media media, boolean z) {
        if (!MediaPickerAct.m47790q2(media, z, this.f93283c.m220157g0(), this.f93283c.m220156f0())) {
            return false;
        }
        m118221p();
        return true;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
