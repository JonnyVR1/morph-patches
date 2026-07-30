package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VPager;
import p149l.d30;
import p149l.g3x;
import p149l.m84;
import p149l.yb4;

/* JADX INFO: loaded from: classes12.dex */
public class MaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f39771a;

    /* JADX INFO: renamed from: b */
    public ImageView f39772b;

    /* JADX INFO: renamed from: c */
    public TabLayout f39773c;

    /* JADX INFO: renamed from: d */
    public VPager f39774d;

    /* JADX INFO: renamed from: e */
    public C11187d f39775e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11179a f39776f;

    /* JADX INFO: renamed from: g */
    public int f39777g;

    /* JADX INFO: renamed from: h */
    public List<CameraCategory> f39778h;

    /* JADX INFO: renamed from: i */
    public d30 f39779i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MaskMenuView$a */
    public interface InterfaceC11179a {
        /* JADX INFO: renamed from: a */
        void mo61690a(int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo61691b(CameraSticker cameraSticker, int i, boolean z);
    }

    public MaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m61683e() {
        this.f39771a.setOnClickListener(new View.OnClickListener() { // from class: l.e3x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89219a.m61685g(view);
            }
        });
        this.f39772b.setOnClickListener(new View.OnClickListener() { // from class: l.f3x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94723a.m61686h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m61684f(List<CameraCategory> list) {
        C11187d c11187d = new C11187d(m61688d(), list);
        this.f39775e = c11187d;
        c11187d.m61797y(this.f39776f);
        this.f39773c.setSelectedTabIndicatorHeight(0);
        this.f39773c.addOnTabSelectedListener(this);
        this.f39774d.setAdapter(this.f39775e);
        this.f39773c.setupWithViewPager(this.f39774d);
        for (int i = 0; i < this.f39773c.getTabCount(); i++) {
            if (NullChecker.m81304b(this.f39773c.getTabAt(i))) {
                this.f39773c.getTabAt(i).setCustomView(this.f39775e.m61793r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m61685g(View view) {
        if (NullChecker.m81303a(this.f39779i)) {
            this.f39779i.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m61686h(View view) {
        if (NullChecker.m81303a(this.f39776f)) {
            this.f39776f.mo61690a(0, false);
            yb4.m213936c().m213948m(null);
        }
        if (NullChecker.m81303a(this.f39775e)) {
            this.f39775e.m61790m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61687c(View view) {
        g3x.m124287a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m61688d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public void m61689i(int i) {
        if (NullChecker.m81304b(this.f39775e)) {
            this.f39775e.m61790m(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61687c(this);
        m61683e();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f39777g = position;
        C11187d c11187d = this.f39775e;
        if (c11187d == null) {
            return;
        }
        c11187d.m61796x(position, Color.parseColor("#ffffff"));
        if (NullChecker.m81303a(this.f39778h) && this.f39777g < this.f39778h.size()) {
            CameraCategory cameraCategory = this.f39778h.get(this.f39777g);
            if (NullChecker.m81304b(cameraCategory)) {
                m84.m153429e().m153437i(cameraCategory.f39217id, cameraCategory.cameraUpdateTime);
                this.f39775e.m61795w(this.f39777g, false);
            }
        }
        this.f39775e.m61794u(this.f39777g);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m81304b(this.f39775e)) {
            this.f39775e.m61796x(this.f39777g, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        this.f39778h = list;
        m61684f(list);
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f39779i = d30Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC11179a interfaceC11179a) {
        this.f39776f = interfaceC11179a;
        if (NullChecker.m81303a(this.f39775e)) {
            this.f39775e.m61797y(interfaceC11179a);
        }
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
