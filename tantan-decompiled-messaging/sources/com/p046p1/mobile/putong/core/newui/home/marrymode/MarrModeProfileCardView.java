package com.p046p1.mobile.putong.core.newui.home.marrymode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.asneedloadscroll.AsNeedLoadScrollView;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p149l.C21280y2;
import p149l.bu10;
import p149l.cbm;
import p149l.dcl0;
import p149l.dxk;
import p149l.dyi;
import p149l.f5m;
import p149l.khm;
import p149l.qgm;
import p149l.smp0;
import p149l.y3g;
import p149l.yuw;

/* JADX INFO: loaded from: classes11.dex */
public class MarrModeProfileCardView extends AsNeedLoadScrollView implements f5m {

    /* JADX INFO: renamed from: e */
    public InterfaceC8027a f23249e;

    /* JADX INFO: renamed from: f */
    public boolean f23250f;

    /* JADX INFO: renamed from: g */
    public boolean f23251g;

    /* JADX INFO: renamed from: h */
    public int f23252h;

    /* JADX INFO: renamed from: i */
    public int f23253i;

    /* JADX INFO: renamed from: j */
    public ArrayList<dcl0> f23254j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView$a */
    public interface InterfaceC8027a {
        /* JADX INFO: renamed from: a */
        void mo38762a();

        /* JADX INFO: renamed from: b */
        boolean mo38763b();
    }

    public MarrModeProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23250f = false;
        this.f23251g = false;
        this.f23254j = new ArrayList<>();
        m38759e();
    }

    @Override // p149l.f5m
    /* JADX INFO: renamed from: a */
    public void mo38757a(User user) {
        setData(user);
    }

    /* JADX INFO: renamed from: d */
    public void m38758d(String str) {
        this.f23254j.clear();
        this.f23254j.add(new dxk.C16497c(str));
        this.f23254j.add(new yuw.C21518a());
        this.f23254j.add(new khm.C18019c());
        this.f23254j.add(new cbm.C16104a());
        this.f23254j.add(new C21280y2.a());
        this.f23254j.add(new qgm.C19495c());
        this.f23254j.add(new y3g.C21302a());
        this.f23254j.add(new smp0.C19993a());
        this.f23254j.add(new bu10.C15974a());
        this.f23254j.add(new dyi.C16501a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23249e != null) {
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23250f = this.f23249e.mo38763b();
                this.f23251g = false;
                this.f23252h = (int) motionEvent.getY();
            } else if (action == 1) {
                this.f23251g = false;
                this.f23250f = false;
            } else if (action == 2 && this.f23250f && Math.abs(y - this.f23252h) >= this.f23253i && !this.f23251g) {
                this.f23251g = true;
                this.f23249e.mo38762a();
            }
            if (this.f23250f) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m38759e() {
        this.f23253i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        m38758d("");
        setViewHolderData(this.f23254j);
    }

    /* JADX INFO: renamed from: f */
    public void m38760f(InterfaceC8027a interfaceC8027a) {
        this.f23249e = interfaceC8027a;
    }

    /* JADX INFO: renamed from: g */
    public void m38761g() {
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
