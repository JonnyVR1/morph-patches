package com.p000p1.mobile.putong.core.newui.home.marrymode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.dcl0;
import p009l.C1320y2;
import p009l.bu10;
import p009l.cbm;
import p009l.dxk;
import p009l.dyi;
import p009l.f5m;
import p009l.khm;
import p009l.qgm;
import p009l.smp0;
import p009l.y3g;
import p009l.yuw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MarrModeProfileCardView extends AsNeedLoadScrollView implements f5m {

    /* JADX INFO: renamed from: e */
    public InterfaceC0191a f2027e;

    /* JADX INFO: renamed from: f */
    public boolean f2028f;

    /* JADX INFO: renamed from: g */
    public boolean f2029g;

    /* JADX INFO: renamed from: h */
    public int f2030h;

    /* JADX INFO: renamed from: i */
    public int f2031i;

    /* JADX INFO: renamed from: j */
    public ArrayList<dcl0> f2032j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView$a */
    public interface InterfaceC0191a {
        /* JADX INFO: renamed from: a */
        void mo2751a();

        /* JADX INFO: renamed from: b */
        boolean mo2752b();
    }

    public MarrModeProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2028f = false;
        this.f2029g = false;
        this.f2032j = new ArrayList<>();
        m2748e();
    }

    @Override // p009l.f5m
    /* JADX INFO: renamed from: a */
    public void mo2746a(User user) {
        setData(user);
    }

    /* JADX INFO: renamed from: d */
    public void m2747d(String str) {
        this.f2032j.clear();
        this.f2032j.add(new dxk.C0860c(str));
        this.f2032j.add(new yuw.C1337a());
        this.f2032j.add(new khm.C0999c());
        this.f2032j.add(new cbm.C0804a());
        this.f2032j.add(new C1320y2.a());
        this.f2032j.add(new qgm.C1144c());
        this.f2032j.add(new y3g.C1321a());
        this.f2032j.add(new smp0.C1193a());
        this.f2032j.add(new bu10.C0792a());
        this.f2032j.add(new dyi.C0861a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2027e != null) {
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2028f = this.f2027e.mo2752b();
                this.f2029g = false;
                this.f2030h = (int) motionEvent.getY();
            } else if (action == 1) {
                this.f2029g = false;
                this.f2028f = false;
            } else if (action == 2 && this.f2028f && Math.abs(y - this.f2030h) >= this.f2031i && !this.f2029g) {
                this.f2029g = true;
                this.f2027e.mo2751a();
            }
            if (this.f2028f) {
                return true;
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m2748e() {
        this.f2031i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        m2747d("");
        setViewHolderData(this.f2032j);
    }

    /* JADX INFO: renamed from: f */
    public void m2749f(InterfaceC0191a interfaceC0191a) {
        this.f2027e = interfaceC0191a;
    }

    /* JADX INFO: renamed from: g */
    public void m2750g() {
    }

    public void setData(User user) {
        setItemData(user);
    }

    public MarrModeProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarrModeProfileCardView(@NonNull Context context) {
        this(context, null);
    }
}
