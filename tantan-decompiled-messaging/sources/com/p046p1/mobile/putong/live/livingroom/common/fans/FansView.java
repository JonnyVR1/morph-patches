package com.p046p1.mobile.putong.live.livingroom.common.fans;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.Map;
import p149l.e30;
import p149l.eet;
import p149l.far;
import p149l.fhg;
import p149l.mqi0;
import p149l.o4g;
import p149l.pfg;
import p149l.r9d0;
import p149l.s7m;
import p149l.x8u;
import p149l.xdl0;
import p149l.zfg;

/* JADX INFO: loaded from: classes4.dex */
public class FansView extends RelativeLayout implements s7m<zfg> {

    /* JADX INFO: renamed from: a */
    public LiveFadeRecyclerView f48982a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f48983b;

    /* JADX INFO: renamed from: c */
    public TextView f48984c;

    /* JADX INFO: renamed from: d */
    public zfg f48985d;

    /* JADX INFO: renamed from: e */
    public o4g f48986e;

    public FansView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m72816e(View view) {
        m72817i(0);
    }

    /* JADX INFO: renamed from: i */
    private void m72817i(int i) {
        this.f48985d.m218470b4(i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m72818c(View view) {
        fhg.m121355a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zfg zfgVar) {
        this.f48985d = zfgVar;
        if (zfgVar != null) {
            this.f48986e = new o4g(zfgVar);
            zfgVar.mo101831a4(this.f48982a);
            this.f48982a.setAdapter(this.f48986e);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m72820f() {
        o4g o4gVar = this.f48986e;
        if (o4gVar != null) {
            o4gVar.m162572j0();
        }
        this.f48984c.setText("0");
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m72821j(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: k */
    public void m72822k(double d) {
        this.f48984c.setText(x8u.m207433c(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72818c(this);
        m72823r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m72823r() {
        this.f48982a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f48982a.m68726H();
        xdl0.m208329E0(this.f48984c, new View.OnClickListener() { // from class: l.dhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86282a.m72816e(view);
            }
        });
    }

    public void setFansData(pfg pfgVar) {
        o4g o4gVar = this.f48986e;
        if (o4gVar != null) {
            o4gVar.m162573k0(pfgVar);
        }
    }

    public void setFansDataByLeaderBoardData(far farVar) {
        o4g o4gVar = this.f48986e;
        if (o4gVar != null) {
            o4gVar.m162573k0(new pfg(farVar));
        }
        final long jM155944o = mqi0.m155944o() - r9d0.f158355l;
        eet.m116004c(this.f48985d, "audience_leaderboard_loaded", new e30() { // from class: l.ehg
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
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
