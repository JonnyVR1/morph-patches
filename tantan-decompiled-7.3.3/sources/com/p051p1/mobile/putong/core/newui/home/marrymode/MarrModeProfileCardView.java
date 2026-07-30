package com.p051p1.mobile.putong.core.newui.home.marrymode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.asneedloadscroll.AsNeedLoadScrollView;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p153l.C21491y2;
import p153l.hll0;
import p153l.j220;
import p153l.m5g;
import p153l.njm;
import p153l.sdm;
import p153l.tim;
import p153l.tzk;
import p153l.v7m;
import p153l.wvp0;
import p153l.xxw;
import p153l.z0j;

/* JADX INFO: loaded from: classes11.dex */
public class MarrModeProfileCardView extends AsNeedLoadScrollView implements v7m {

    /* JADX INFO: renamed from: e */
    public InterfaceC8178a f23991e;

    /* JADX INFO: renamed from: f */
    public boolean f23992f;

    /* JADX INFO: renamed from: g */
    public boolean f23993g;

    /* JADX INFO: renamed from: h */
    public int f23994h;

    /* JADX INFO: renamed from: i */
    public int f23995i;

    /* JADX INFO: renamed from: j */
    public ArrayList<hll0> f23996j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView$a */
    public interface InterfaceC8178a {
        /* JADX INFO: renamed from: a */
        void mo39765a();

        /* JADX INFO: renamed from: b */
        boolean mo39766b();
    }

    public MarrModeProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23992f = false;
        this.f23993g = false;
        this.f23996j = new ArrayList<>();
        m39762e();
    }

    @Override // p153l.v7m
    /* JADX INFO: renamed from: a */
    public void mo39760a(User user) {
        setData(user);
    }

    /* JADX INFO: renamed from: d */
    public void m39761d(String str) {
        this.f23996j.clear();
        this.f23996j.add(new tzk.C20432c(str));
        this.f23996j.add(new xxw.C21474a());
        this.f23996j.add(new njm.C18886c());
        this.f23996j.add(new sdm.C20025a());
        this.f23996j.add(new C21491y2.a());
        this.f23996j.add(new tim.C20327c());
        this.f23996j.add(new m5g.C18550a());
        this.f23996j.add(new wvp0.C21186a());
        this.f23996j.add(new j220.C17855a());
        this.f23996j.add(new z0j.C21731a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23991e != null) {
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23992f = this.f23991e.mo39766b();
                this.f23993g = false;
                this.f23994h = (int) motionEvent.getY();
            } else if (action == 1) {
                this.f23993g = false;
                this.f23992f = false;
            } else if (action == 2 && this.f23992f && Math.abs(y - this.f23994h) >= this.f23995i && !this.f23993g) {
                this.f23993g = true;
                this.f23991e.mo39765a();
            }
            if (this.f23992f) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m39762e() {
        this.f23995i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        m39761d("");
        setViewHolderData(this.f23996j);
    }

    /* JADX INFO: renamed from: f */
    public void m39763f(InterfaceC8178a interfaceC8178a) {
        this.f23991e = interfaceC8178a;
    }

    /* JADX INFO: renamed from: g */
    public void m39764g() {
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
