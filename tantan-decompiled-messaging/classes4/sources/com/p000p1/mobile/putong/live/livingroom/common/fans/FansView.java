package com.p000p1.mobile.putong.live.livingroom.common.fans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.Map;
import l.e30;
import l.mqi0;
import l.s7m;
import l.x8u;
import l.xdl0;
import p002l.eet;
import p002l.far;
import p002l.fhg;
import p002l.o4g;
import p002l.pfg;
import p002l.r9d0;
import p002l.zfg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansView extends RelativeLayout implements s7m<zfg> {

    /* JADX INFO: renamed from: a */
    public LiveFadeRecyclerView f5024a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5025b;

    /* JADX INFO: renamed from: c */
    public TextView f5026c;

    /* JADX INFO: renamed from: d */
    public zfg f5027d;

    /* JADX INFO: renamed from: e */
    public o4g f5028e;

    public FansView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m6327e(View view) {
        m6328i(0);
    }

    /* JADX INFO: renamed from: i */
    private void m6328i(int i) {
        this.f5027d.m27193b4(i);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m6329C0() {
        return getContext();
    }

    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m6330c(View view) {
        fhg.m13182a(this, view);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m6333i1(zfg zfgVar) {
        this.f5027d = zfgVar;
        if (zfgVar != null) {
            this.f5028e = new o4g(zfgVar);
            zfgVar.mo10340a4(this.f5024a);
            this.f5024a.setAdapter(this.f5028e);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m6332f() {
        o4g o4gVar = this.f5028e;
        if (o4gVar != null) {
            o4gVar.m19216j0();
        }
        this.f5026c.setText("0");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m6334j(boolean z) {
        xdl0.M(this, z);
    }

    /* JADX INFO: renamed from: k */
    public void m6335k(double d) {
        this.f5026c.setText(x8u.c(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6330c(this);
        m6336r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m6336r() {
        this.f5024a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f5024a.H();
        xdl0.E0(this.f5026c, new View.OnClickListener() { // from class: l.dhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9277a.m6327e(view);
            }
        });
    }

    public void setFansData(pfg pfgVar) {
        o4g o4gVar = this.f5028e;
        if (o4gVar != null) {
            o4gVar.m19217k0(pfgVar);
        }
    }

    public void setFansDataByLeaderBoardData(far farVar) {
        o4g o4gVar = this.f5028e;
        if (o4gVar != null) {
            o4gVar.m19217k0(new pfg(farVar));
        }
        final long jO = mqi0.o() - r9d0.f18419l;
        eet.m12449c(this.f5027d, "audience_leaderboard_loaded", new e30() { // from class: l.ehg
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jO));
            }
        });
    }

    public FansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
