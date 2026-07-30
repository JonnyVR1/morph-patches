package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import p007l.g3x;
import p007l.m84;
import p007l.yb4;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f1232a;

    /* JADX INFO: renamed from: b */
    public ImageView f1233b;

    /* JADX INFO: renamed from: c */
    public TabLayout f1234c;

    /* JADX INFO: renamed from: d */
    public VPager f1235d;

    /* JADX INFO: renamed from: e */
    public C2031d f1236e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2023a f1237f;

    /* JADX INFO: renamed from: g */
    public int f1238g;

    /* JADX INFO: renamed from: h */
    public List<CameraCategory> f1239h;

    /* JADX INFO: renamed from: i */
    public d30 f1240i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MaskMenuView$a */
    public interface InterfaceC2023a {
        /* JADX INFO: renamed from: a */
        void mo2642a(int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo2643b(CameraSticker cameraSticker, int i, boolean z);
    }

    public MaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m2635e() {
        this.f1232a.setOnClickListener(new View.OnClickListener() { // from class: l.e3x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7200a.m2637g(view);
            }
        });
        this.f1233b.setOnClickListener(new View.OnClickListener() { // from class: l.f3x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7973a.m2638h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m2636f(List<CameraCategory> list) {
        C2031d c2031d = new C2031d(m2640d(), list);
        this.f1236e = c2031d;
        c2031d.m2758y(this.f1237f);
        this.f1234c.setSelectedTabIndicatorHeight(0);
        this.f1234c.addOnTabSelectedListener(this);
        this.f1235d.setAdapter(this.f1236e);
        this.f1234c.setupWithViewPager(this.f1235d);
        for (int i = 0; i < this.f1234c.getTabCount(); i++) {
            if (NullChecker.b(this.f1234c.getTabAt(i))) {
                this.f1234c.getTabAt(i).setCustomView(this.f1236e.m2754r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m2637g(View view) {
        if (NullChecker.a(this.f1240i)) {
            this.f1240i.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m2638h(View view) {
        if (NullChecker.a(this.f1237f)) {
            this.f1237f.mo2642a(0, false);
            yb4.m17102c().m17114m(null);
        }
        if (NullChecker.a(this.f1236e)) {
            this.f1236e.m2751m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2639c(View view) {
        g3x.m10413a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m2640d() {
        return getContext();
    }

    /* JADX INFO: renamed from: i */
    public void m2641i(int i) {
        if (NullChecker.b(this.f1236e)) {
            this.f1236e.m2751m(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2639c(this);
        m2635e();
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f1238g = position;
        C2031d c2031d = this.f1236e;
        if (c2031d == null) {
            return;
        }
        c2031d.m2757x(position, Color.parseColor("#ffffff"));
        if (NullChecker.a(this.f1239h) && this.f1238g < this.f1239h.size()) {
            CameraCategory cameraCategory = this.f1239h.get(this.f1238g);
            if (NullChecker.b(cameraCategory)) {
                m84.m11844e().m11852i(cameraCategory.f678id, cameraCategory.cameraUpdateTime);
                this.f1236e.m2756w(this.f1238g, false);
            }
        }
        this.f1236e.m2755u(this.f1238g);
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.b(this.f1236e)) {
            this.f1236e.m2757x(this.f1238g, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        this.f1239h = list;
        m2636f(list);
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f1240i = d30Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC2023a interfaceC2023a) {
        this.f1237f = interfaceC2023a;
        if (NullChecker.a(this.f1236e)) {
            this.f1236e.m2758y(interfaceC2023a);
        }
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
