package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VPager;
import p153l.f6x;
import p153l.l94;
import p153l.x20;
import p153l.xc4;

/* JADX INFO: loaded from: classes13.dex */
public class MaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f40619a;

    /* JADX INFO: renamed from: b */
    public ImageView f40620b;

    /* JADX INFO: renamed from: c */
    public TabLayout f40621c;

    /* JADX INFO: renamed from: d */
    public VPager f40622d;

    /* JADX INFO: renamed from: e */
    public C11350d f40623e;

    /* JADX INFO: renamed from: f */
    public InterfaceC11342a f40624f;

    /* JADX INFO: renamed from: g */
    public int f40625g;

    /* JADX INFO: renamed from: h */
    public List<CameraCategory> f40626h;

    /* JADX INFO: renamed from: i */
    public x20 f40627i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MaskMenuView$a */
    public interface InterfaceC11342a {
        /* JADX INFO: renamed from: a */
        void mo62874a(int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo62875b(CameraSticker cameraSticker, int i, boolean z);
    }

    public MaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m62867e() {
        this.f40619a.setOnClickListener(new View.OnClickListener() { // from class: l.d6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85415a.m62869g(view);
            }
        });
        this.f40620b.setOnClickListener(new View.OnClickListener() { // from class: l.e6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92374a.m62870h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m62868f(List<CameraCategory> list) {
        C11350d c11350d = new C11350d(m62872d(), list);
        this.f40623e = c11350d;
        c11350d.m62980y(this.f40624f);
        this.f40621c.setSelectedTabIndicatorHeight(0);
        this.f40621c.addOnTabSelectedListener(this);
        this.f40622d.setAdapter(this.f40623e);
        this.f40621c.setupWithViewPager(this.f40622d);
        for (int i = 0; i < this.f40621c.getTabCount(); i++) {
            if (NullChecker.m82487b(this.f40621c.getTabAt(i))) {
                this.f40621c.getTabAt(i).setCustomView(this.f40623e.m62976r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m62869g(View view) {
        if (NullChecker.m82486a(this.f40627i)) {
            this.f40627i.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m62870h(View view) {
        if (NullChecker.m82486a(this.f40624f)) {
            this.f40624f.mo62874a(0, false);
            xc4.m210114c().m210126m(null);
        }
        if (NullChecker.m82486a(this.f40623e)) {
            this.f40623e.m62973m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m62871c(View view) {
        f6x.m124325a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m62872d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public void m62873i(int i) {
        if (NullChecker.m82487b(this.f40623e)) {
            this.f40623e.m62973m(i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62871c(this);
        m62867e();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f40625g = position;
        C11350d c11350d = this.f40623e;
        if (c11350d == null) {
            return;
        }
        c11350d.m62979x(position, Color.parseColor("#ffffff"));
        if (NullChecker.m82486a(this.f40626h) && this.f40625g < this.f40626h.size()) {
            CameraCategory cameraCategory = this.f40626h.get(this.f40625g);
            if (NullChecker.m82487b(cameraCategory)) {
                l94.m153309e().m153317i(cameraCategory.f40065id, cameraCategory.cameraUpdateTime);
                this.f40623e.m62978w(this.f40625g, false);
            }
        }
        this.f40623e.m62977u(this.f40625g);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m82487b(this.f40623e)) {
            this.f40623e.m62979x(this.f40625g, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        this.f40626h = list;
        m62868f(list);
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f40627i = x20Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC11342a interfaceC11342a) {
        this.f40624f = interfaceC11342a;
        if (NullChecker.m82486a(this.f40623e)) {
            this.f40623e.m62980y(interfaceC11342a);
        }
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
