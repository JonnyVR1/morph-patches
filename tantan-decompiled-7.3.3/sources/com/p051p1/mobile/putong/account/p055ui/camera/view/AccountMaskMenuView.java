package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VPager;
import p153l.C18396li;
import p153l.C19903rs;
import p153l.C20574uh;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMaskMenuView extends LinearLayout implements TabLayout.BaseOnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public View f17608a;

    /* JADX INFO: renamed from: b */
    public ImageView f17609b;

    /* JADX INFO: renamed from: c */
    public TabLayout f17610c;

    /* JADX INFO: renamed from: d */
    public VPager f17611d;

    /* JADX INFO: renamed from: e */
    public C18396li f17612e;

    /* JADX INFO: renamed from: f */
    public int f17613f;

    /* JADX INFO: renamed from: g */
    public List<CameraCategory> f17614g;

    /* JADX INFO: renamed from: h */
    public x20 f17615h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMaskMenuView$a */
    public interface InterfaceC4815a {
    }

    public AccountMaskMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    private void m30099e() {
        this.f17608a.setOnClickListener(new View.OnClickListener() { // from class: l.ps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153860a.m30101g(view);
            }
        });
        this.f17609b.setOnClickListener(new View.OnClickListener() { // from class: l.qs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159227a.m30102h(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m30100f(List<CameraCategory> list) {
        C18396li c18396li = new C18396li(m30104d(), list);
        this.f17612e = c18396li;
        c18396li.m154271y(null);
        this.f17610c.setSelectedTabIndicatorHeight(0);
        this.f17610c.addOnTabSelectedListener(this);
        this.f17611d.setAdapter(this.f17612e);
        this.f17610c.setupWithViewPager(this.f17611d);
        for (int i = 0; i < this.f17610c.getTabCount(); i++) {
            if (NullChecker.m82487b(this.f17610c.getTabAt(i))) {
                this.f17610c.getTabAt(i).setCustomView(this.f17612e.m154264r(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m30101g(View view) {
        if (NullChecker.m82486a(this.f17615h)) {
            this.f17615h.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m30102h(View view) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        if (NullChecker.m82486a(this.f17612e)) {
            this.f17612e.m154259m(-1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30103c(View view) {
        C19903rs.m182832a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m30104d() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30103c(this);
        m30099e();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        int position = tab.getPosition();
        this.f17613f = position;
        C18396li c18396li = this.f17612e;
        if (c18396li == null) {
            return;
        }
        c18396li.m154270x(position, Color.parseColor("#ffffff"));
        if (NullChecker.m82486a(this.f17614g) && this.f17613f < this.f17614g.size()) {
            CameraCategory cameraCategory = this.f17614g.get(this.f17613f);
            if (NullChecker.m82487b(cameraCategory)) {
                C20574uh.m196005d().m196009e(cameraCategory.f17061id, cameraCategory.cameraUpdateTime);
                this.f17612e.m154269w(this.f17613f, false);
            }
        }
        this.f17612e.m154267u(this.f17613f);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m82487b(this.f17612e)) {
            this.f17612e.m154270x(this.f17613f, Color.parseColor("#80ffffff"));
        }
    }

    public void setCameraCategoryData(@Nullable List<CameraCategory> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        this.f17614g = list;
        m30100f(list);
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f17615h = x20Var;
    }

    public void setOnFaceResourceSelectListener(InterfaceC4815a interfaceC4815a) {
        if (NullChecker.m82486a(this.f17612e)) {
            this.f17612e.m154271y(interfaceC4815a);
        }
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMaskMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
